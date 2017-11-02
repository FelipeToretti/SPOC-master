package com.example.felipe.spoc;


import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;


import android.os.CountDownTimer;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;


public class MapsFragment extends SupportMapFragment implements OnMapReadyCallback, GoogleMap.OnMapClickListener {

    private GoogleMap mMap;
    private int contadorWP = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        float zoomInicial = 14;

        mMap.getUiSettings().setZoomControlsEnabled(true);
        BackgroundWorker backgroundWorker = new BackgroundWorker(getActivity().getApplicationContext());
        backgroundWorker.execute("posicao", "1");
        LatLng crici = new LatLng(-28.680006, -49.369911);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(crici, zoomInicial));


    }

    public void rotaPrPi() {
        mMap.clear();
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(-28.684258, -49.344707),
                new LatLng(-28.684067, -49.344400),
                new LatLng(-28.682959, -49.344984),
                new LatLng(-28.682404, -49.345349),
                new LatLng(-28.682028, -49.345660),
                new LatLng(-28.681562, -49.346159),
                new LatLng(-28.680693, -49.347159),
                new LatLng(-28.680291, -49.347650),
                new LatLng(-28.679754, -49.348231),
                new LatLng(-28.679661, -49.348310),
                new LatLng(-28.679545, -49.348403),
                new LatLng(-28.679414, -49.348546),
                new LatLng(-28.679340, -49.348645),
                new LatLng(-28.679146, -49.348961),
                new LatLng(-28.679007, -49.349256),
                new LatLng(-28.678891, -49.349692),
                new LatLng(-28.677828, -49.354835),
                new LatLng(-28.677674, -49.355597),
                new LatLng(-28.677618, -49.356115),
                new LatLng(-28.677594, -49.356528),
                new LatLng(-28.677609, -49.356810),
                new LatLng(-28.677664, -49.357190),
                new LatLng(-28.677744, -49.357539),
                new LatLng(-28.677826, -49.357818),
                new LatLng(-28.677961, -49.358149),
                new LatLng(-28.678433, -49.359272),
                new LatLng(-28.678661, -49.359664),
                new LatLng(-28.679035, -49.360149),
                new LatLng(-28.680032, -49.361167),
                new LatLng(-28.680425, -49.361621),
                new LatLng(-28.680644, -49.361935),
                new LatLng(-28.680843, -49.362315),
                new LatLng(-28.680987, -49.362668),
                new LatLng(-28.681136, -49.363231),
                new LatLng(-28.681218, -49.363967),
                new LatLng(-28.681200, -49.364433),
                new LatLng(-28.681102, -49.365108),
                new LatLng(-28.680781, -49.366102),
                new LatLng(-28.680206, -49.367965),
                new LatLng(-28.680030, -49.370000),
                new LatLng(-28.679466, -49.371946),
                new LatLng(-28.679376, -49.372855),
                new LatLng(-28.679380, -49.373159),
                new LatLng(-28.679485, -49.373864),
                new LatLng(-28.679646, -49.374357),
                new LatLng(-28.680751, -49.377007),
                new LatLng(-28.680930, -49.377774),
                new LatLng(-28.681178, -49.379027),
                new LatLng(-28.681442, -49.380067),
                new LatLng(-28.681482, -49.380408),
                new LatLng(-28.681612, -49.383614),
                new LatLng(-28.681791, -49.384369),
                new LatLng(-28.682350, -49.385409),
                new LatLng(-28.684578, -49.388689),
                new LatLng(-28.685147, -49.389269),
                new LatLng(-28.685361, -49.389473),
                new LatLng(-28.686016, -49.389749),
                new LatLng(-28.686405, -49.389817),
                new LatLng(-28.688417, -49.389765),
                new LatLng(-28.688785, -49.389862),
                new LatLng(-28.689460, -49.390223),
                new LatLng(-28.689764, -49.390480),
                new LatLng(-28.690156, -49.390942),
                new LatLng(-28.694553, -49.395789),
                new LatLng(-28.694618, -49.395895),
                new LatLng(-28.695731, -49.397086),
                new LatLng(-28.696274, -49.397701),
                new LatLng(-28.698249, -49.399938),
                new LatLng(-28.698226, -49.400055),
                new LatLng(-28.698160, -49.402760),
                new LatLng(-28.698171, -49.403293),
                new LatLng(-28.698231, -49.403653),
                new LatLng(-28.698394, -49.403944),
                new LatLng(-28.699586, -49.406228),
                new LatLng(-28.699985, -49.406995),
                new LatLng(-28.700065, -49.407298),
                new LatLng(-28.700097, -49.407449),
                new LatLng(-28.700095, -49.407705),
                new LatLng(-28.700202, -49.408205),
                new LatLng(-28.700163, -49.408622))
                .width(5)
                .color(Color.RED));
        int height = 50;
        int width = 50;
        BitmapDrawable bitmapdraw = (BitmapDrawable) getResources().getDrawable(R.mipmap.ic_parada);
        Bitmap b = bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, width, height, false);
        BitmapDescriptor paradaIco = BitmapDescriptorFactory.fromBitmap(smallMarker);
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.684258, -49.344707)).title("Terminal Próspera"));
        //paradas
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.678859, -49.350327)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.677919, -49.354772)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.678169, -49.358396)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680970, -49.362351)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680848, -49.366186)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680049, -49.369954)).title("Terminal Centro"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680038, -49.375093)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.681222, -49.378609)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.681696, -49.383317)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.683195, -49.386488)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.685633, -49.389485)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.692753, -49.393672)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.695346, -49.396558)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.697726, -49.399100)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.698432, -49.403999)).icon(paradaIco));
        //fimparadas
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.700163, -49.408622)).title("Terminal Pinheirinho"));

    }

    public void rotaPiPr() {
        mMap.clear();
        mMap.addPolyline(new PolylineOptions().add(
                new LatLng(-28.700138, -49.407889),
                new LatLng(-28.700228, -49.408275),
                new LatLng(-28.700263, -49.408356),
                new LatLng(-28.700296, -49.408367),
                new LatLng(-28.700344, -49.408376),
                new LatLng(-28.700394, -49.408352),
                new LatLng(-28.700404, -49.408324),
                new LatLng(-28.700406, -49.408289),
                new LatLng(-28.700405, -49.408261),
                new LatLng(-28.700386, -49.408218),
                new LatLng(-28.700344, -49.408176),
                new LatLng(-28.700246, -49.408039),
                new LatLng(-28.700206, -49.407880),
                new LatLng(-28.700175, -49.407632),
                new LatLng(-28.700219, -49.407332),
                new LatLng(-28.700255, -49.407235),
                new LatLng(-28.700323, -49.407154),
                new LatLng(-28.700426, -49.407068),
                new LatLng(-28.700563, -49.406922),
                new LatLng(-28.700725, -49.406753),
                new LatLng(-28.701085, -49.406355),
                new LatLng(-28.701615, -49.405818),
                new LatLng(-28.702616, -49.404773),
                new LatLng(-28.702852, -49.404570),
                new LatLng(-28.703583, -49.404887),
                new LatLng(-28.704068, -49.404992),
                new LatLng(-28.704150, -49.405048),
                new LatLng(-28.704302, -49.404967),
                new LatLng(-28.704315, -49.404904),
                new LatLng(-28.704300, -49.404831),
                new LatLng(-28.704269, -49.404788),
                new LatLng(-28.704239, -49.404768),
                new LatLng(-28.704211, -49.404761),
                new LatLng(-28.704181, -49.404757),
                new LatLng(-28.704146, -49.404761),
                new LatLng(-28.703829, -49.404706),
                new LatLng(-28.703519, -49.404596),
                new LatLng(-28.703409, -49.404543),
                new LatLng(-28.703074, -49.404362),
                new LatLng(-28.703045, -49.404357),
                new LatLng(-28.702353, -49.403904),
                new LatLng(-28.701614, -49.403240),
                new LatLng(-28.699792, -49.401249),
                new LatLng(-28.698367, -49.399758),
                new LatLng(-28.698313, -49.399692),
                new LatLng(-28.698247, -49.399648),
                new LatLng(-28.697766, -49.399123),
                new LatLng(-28.696747, -49.397958),
                new LatLng(-28.696098, -49.397295),
                new LatLng(-28.694329, -49.395411),
                new LatLng(-28.694306, -49.395252),
                new LatLng(-28.690230, -49.390804),
                new LatLng(-28.689561, -49.390121),
                new LatLng(-28.689294, -49.389915),
                new LatLng(-28.689016, -49.389714),
                new LatLng(-28.688653, -49.389633),
                new LatLng(-28.688221, -49.389563),
                new LatLng(-28.688221, -49.389563),
                new LatLng(-28.687483, -49.389604),
                new LatLng(-28.686377, -49.389654),
                new LatLng(-28.685562, -49.389393),
                new LatLng(-28.685020, -49.388955),
                new LatLng(-28.684509, -49.388340),
                new LatLng(-28.682345, -49.385102),
                new LatLng(-28.681906, -49.384173),
                new LatLng(-28.681762, -49.383372),
                new LatLng(-28.681631, -49.380492),
                new LatLng(-28.681486, -49.379648),
                new LatLng(-28.681010, -49.377604),
                new LatLng(-28.680859, -49.376854),
                new LatLng(-28.680176, -49.375267),
                new LatLng(-28.679667, -49.373970),
                new LatLng(-28.679526, -49.373081),
                new LatLng(-28.679767, -49.371233),
                new LatLng(-28.680008, -49.370148),
                new LatLng(-28.680132, -49.369712),
                new LatLng(-28.680281, -49.368696),
                new LatLng(-28.680333, -49.368303),
                new LatLng(-28.680386, -49.367975),
                new LatLng(-28.680848, -49.366524),
                new LatLng(-28.681207, -49.365336),
                new LatLng(-28.681314, -49.364910),
                new LatLng(-28.681395, -49.364287),
                new LatLng(-28.681400, -49.363840),
                new LatLng(-28.681351, -49.363373),
                new LatLng(-28.681235, -49.362810),
                new LatLng(-28.680997, -49.362181),
                new LatLng(-28.680844, -49.361876),
                new LatLng(-28.680505, -49.361391),
                new LatLng(-28.680140, -49.360963),
                new LatLng(-28.679170, -49.360005),
                new LatLng(-28.678780, -49.359515),
                new LatLng(-28.678535, -49.359080),
                new LatLng(-28.678199, -49.358270),
                new LatLng(-28.677846, -49.357243),
                new LatLng(-28.677796, -49.356918),
                new LatLng(-28.677775, -49.356151),
                new LatLng(-28.677886, -49.355364),
                new LatLng(-28.678274, -49.353455),
                new LatLng(-28.678591, -49.352029),
                new LatLng(-28.679070, -49.349771),
                new LatLng(-28.679241, -49.349284),
                new LatLng(-28.679394, -49.348979),
                new LatLng(-28.679666, -49.348634),
                new LatLng(-28.680428, -49.347810),
                new LatLng(-28.681332, -49.346697),
                new LatLng(-28.682519, -49.345479),
                new LatLng(-28.683023, -49.345196),
                new LatLng(-28.683177, -49.345153),
                new LatLng(-28.683491, -49.345210),
                new LatLng(-28.684077, -49.345044))
                .width(5)
                .color(Color.RED));


        int height = 50;
        int width = 50;
        BitmapDrawable bitmapdraw = (BitmapDrawable) getResources().getDrawable(R.mipmap.ic_parada);
        Bitmap b = bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, width, height, false);
        BitmapDescriptor paradaIco = BitmapDescriptorFactory.fromBitmap(smallMarker);

        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.700138, -49.407889)).title("Terminal Pinheirinho"));
        //paradas
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.700508, -49.402404)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.697726, -49.399100)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.695346, -49.396558)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.692753, -49.393672)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.685633, -49.389485)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.683195, -49.386488)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.681696, -49.383317)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.681222, -49.378609)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680038, -49.375093)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680049, -49.369954)).title("Terminal Centro"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680848, -49.366186)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.680970, -49.362351)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.678169, -49.358396)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.677919, -49.354772)).icon(paradaIco));
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.678859, -49.350327)).icon(paradaIco));
        //fim paradas
        mMap.addMarker(new MarkerOptions().position(new LatLng(-28.684258, -49.344707)).title("Terminal Próspera"));

        /*LatLng pinheiro = new LatLng(-28.699804, -49.407654);
        LatLng centro = new LatLng(-28.679787, -49.371190);
        mMap.addMarker(new MarkerOptions().position(pinheiro));
        mMap.addMarker(new MarkerOptions().position(centro));
        mMap.addPolyline(new PolylineOptions().add(
                pinheiro,centro
        ).width(5).color(Color.BLUE));*/
    }


    public void startCountDownTimer() {
        float latt = Float.parseFloat(BackgroundWorker.latitude);
        float longg = Float.parseFloat(BackgroundWorker.longitude);
        LatLng posicao = new LatLng(latt, longg);
        mMap.addMarker(new MarkerOptions().position(posicao).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_busandando)));
        //LatLng crici = new LatLng(latt, longg);
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(crici, 14));
        //mostrarToast(BackgroundWorker.latitude+BackgroundWorker.longitude);
        //BackgroundWorker backgroundWorker = new BackgroundWorker(getActivity().getApplicationContext());
        //backgroundWorker.execute("posicao","1");
        //mostrarToast(BackgroundWorker.latitude+" "+BackgroundWorker.longitude);

        /* LatLng latlng0 = new LatLng(-28.679778, -49.370135);
        LatLng latlng1 = new LatLng(-28.679509, -49.371631);
        LatLng latlng2 = new LatLng(-28.679354, -49.372784);
        LatLng latlng3 = new LatLng(-28.679533, -49.373980);
        LatLng latlng4 = new LatLng(-28.679909, -49.375043);
        LatLng latlng5 = new LatLng(-28.680304, -49.376094);
        LatLng latlng6 = new LatLng(-28.680869, -49.377607);
        LatLng latlng7 = new LatLng(-28.681293, -49.379324);
        LatLng latlng8 = new LatLng(-28.681500, -49.380708);
        LatLng latlng9 = new LatLng(-28.681556, -49.382907);

        final LatLng[] arrayLatLng = new LatLng[10];
        arrayLatLng[0] = latlng0;
        arrayLatLng[1] = latlng1;
        arrayLatLng[2] = latlng2;
        arrayLatLng[3] = latlng3;
        arrayLatLng[4] = latlng4;
        arrayLatLng[5] = latlng5;
        arrayLatLng[6] = latlng6;
        arrayLatLng[7] = latlng7;
        arrayLatLng[8] = latlng8;
        arrayLatLng[9] = latlng9;

        int intervalo = 3000;

        CountDownTimer cdt = new CountDownTimer((intervalo * 10)+500, intervalo) {
            int markerNo = 0;
            @Override
            public void onTick(long millisUntilFinished) {

                if(markerNo <= 9){
                    mMap.clear();
                    mMap.addMarker(new MarkerOptions().position(arrayLatLng[markerNo]).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_busandando)));
                    markerNo++;
                }
            }

            @Override
            public void onFinish(){

            }
        }.start();*/

    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    public void mostrarToast(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}