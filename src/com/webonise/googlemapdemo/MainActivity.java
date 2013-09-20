package com.webonise.googlemapdemo;


import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;


public class MainActivity extends FragmentActivity {
	public final LatLng HAMBURG = new LatLng(53.558, 9.927);
	public final LatLng KIEL = new LatLng(53.551, 9.993);
	private GoogleMap googleMap;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		initializeMap();
		/*googleMap = ((MapFragment) getFragmentManager().findFragmentById(
				R.id.map)).getMap();

		Marker hamburg = googleMap.addMarker(new MarkerOptions().position(
				HAMBURG).title("Hamburg"));
		Marker kiel = googleMap.addMarker(new MarkerOptions()
				.position(KIEL)
				.title("Kiel")
				.snippet("Kiel is cool")
				.icon(BitmapDescriptorFactory
						.fromResource(R.drawable.ic_launcher)));*/
	}

	
	private void initializeMap() {
		if(googleMap==null)
		{
			SupportMapFragment supportMapFragment = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map));
			googleMap= supportMapFragment.getMap();
			
			if(googleMap== null ) {
				Toast.makeText(getApplicationContext(), "Sorry the map is not initialize", Toast.LENGTH_LONG).show();
			}
		}
		
	}
	protected void onResume()
	{
		super.onResume();
		initializeMap();
	}
}
