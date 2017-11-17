package com.example.felipe.spoc;


import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;


import android.os.CountDownTimer;
import android.support.v4.app.ActivityCompat;
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
    private boolean ativado = false;
    CountDownTimer cdt;

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
        if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(crici, zoomInicial));


    }

    public boolean isAtivado() {
        return ativado;
    }

    public void setAtivado(boolean ativado) {
        this.ativado = ativado;
    }

    public void rotaPrCe() {
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
                new LatLng(-28.680049, -49.369954))
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

    }

    public void rotaPiCe() {
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
                new LatLng(-28.680049, -49.369954))
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

        /*LatLng pinheiro = new LatLng(-28.699804, -49.407654);
        LatLng centro = new LatLng(-28.679787, -49.371190);
        mMap.addMarker(new MarkerOptions().position(pinheiro));
        mMap.addMarker(new MarkerOptions().position(centro));
        mMap.addPolyline(new PolylineOptions().add(
                pinheiro,centro
        ).width(5).color(Color.BLUE));*/
    }


    public void startCountDownTimer() {

                    cdt = new CountDownTimer(120000, 3000) {
                    Marker atual = mMap.addMarker(new MarkerOptions().position(new LatLng(-28.210056, 118.150468)));
                    @Override
                    public void onTick(long millisUntilFinished) {
                        atual.remove();
                        BackgroundWorker backgroundWorker = new BackgroundWorker(getActivity().getApplicationContext());
                        backgroundWorker.execute("posicao", "1");
                        String pos = BackgroundWorker.posicao;
                        mMap.addMarker(new MarkerOptions().position(formataCoordenadas(pos)).icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_busandando)));
                    }

                    @Override
                    public void onFinish() {

                    }
                };



    }

    public LatLng formataCoordenadas(String cords){
        String array[] = new String[3];
        String graulat,graulng;
        array = cords.split(":");
        array[1] = array[1].substring(0, array[1].length() -2);
        array[1] = array[1].substring(1);
        array[1] = array[1].substring(0, 2) + " " + array[1].substring(2, array[1].length());
        array[2] = array[2].substring(0, 2) + " " + array[2].substring(2, array[2].length());
        graulat = array[1].substring(0,2);
        graulng = array[2].substring(0,2);
        array[1] = array[1].substring(3,11);
        array[2] = array[2].substring(3,11);
        float decimalLat = Float.parseFloat(array[1]) / 60;
        float decimalLng = Float.parseFloat(array[2]) / 60;
        decimalLat = Float.parseFloat(String.valueOf(decimalLat).substring(0,8));
        decimalLng = Float.parseFloat(String.valueOf(decimalLng).substring(0,8));
        array[1] = String.valueOf(Float.parseFloat(graulat) + decimalLat);
        array[2] = String.valueOf(Float.parseFloat(graulng) + decimalLng);
        array[1] = "-" + array[1].substring(0, array[1].length());
        array[2] = "-" + array[2].substring(0, array[2].length());
        Double latitude = Double.parseDouble(array[2]);
        Double longitude = Double.parseDouble(array[1]);
        LatLng posicaoFormatada = new LatLng(latitude,longitude);
        return posicaoFormatada;
    }

    @Override
    public void onMapClick(LatLng latLng) {

    }

    public void mostrarToast(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

}
