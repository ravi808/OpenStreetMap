package com.example.ravi.osm;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ContributeToOSM extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribute_to_osm);
    }

    /*implements LocationListener, OnMapReadyCallback {
    TextView lattext, longtext;
    double lat, log;
    Button addlocation;
    Button btnLocateMe;
    MapFragmentClass mfc;
    Location location;


    private Fragment mMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribute_to_osm);
        FragmentManager fm = getSupportFragmentManager();
        mMapFragment = fm.findFragmentById(R.id.mapfragment);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync((OnMapReadyCallback) this);


        if (savedInstanceState == null) {
            fm.beginTransaction()
                    .add(R.id.map, mMapFragment)
                    .commit();
        }
        lattext = findViewById(R.id.latitude);
        longtext = findViewById(R.id.longitude);
        addlocation = findViewById(R.id.addlocation);
        btnLocateMe = findViewById(R.id.locateme);

            FragmentManager fm = getFragmentManager();
            FragmentTransaction ft =  fm.beginTransaction();
            mfc = new MapFragmentClass();
            ft.add(R.id.map,mfc);
            ft.commit();

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(ContributeToOSM.this);


        btnLocateMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
                Criteria criteria = new Criteria();

                String bestProvider = locationManager.getBestProvider(criteria, true);
                if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    //location = locationManager.getLastKnownLocation(bestProvider);
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                location = locationManager.getLastKnownLocation(bestProvider);
                lat = location.getLatitude();
                log = location.getLongitude();
                lattext.setText(lat + "");
                Log.i("Lat", String.valueOf(lat));
                longtext.setText(log + "");
                Log.i("Long", String.valueOf(log));
                addlocation.setVisibility(View.VISIBLE);
            }
        });


        LocationManager lm = (LocationManager) getSystemService(LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 0, this);
    }

   @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(29.863592, 73.898529))
                .title("Marker"));
    }


    @Override
    public void onLocationChanged(Location location) {
        lat = location.getLatitude();
        Log.i("Lat", String.valueOf(lat));
        log = location.getLongitude();
        Log.i("Long", String.valueOf(log));
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {
        Toast.makeText(this, "Provider is ON", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderDisabled(String s) {
        Toast.makeText(this, "Providre is OFF", Toast.LENGTH_SHORT).show();
    }*/
}

