package edu.csueb.shuttle.Modules;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.vision.face.LargestFaceFocusingProcessor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vivek on 5/11/2017.
 */

public class ShuttleStops {

    public LatLng position;
    public String title;

    public ShuttleStops(String title, LatLng position) {
        this.title = title;
        this.position = position;
    }

    public static List<ShuttleStops> getCSUEBtoHaywardBartStops() {
        List<ShuttleStops> route = new ArrayList<ShuttleStops>();
        route.add(new ShuttleStops("Stop 1", new LatLng(37.673860, -122.081363)));
        route.add(new ShuttleStops("Stop 2", new LatLng(37.671943, -122.084396)));
        return route;
    }

    public static List<ShuttleStops> getHaywardBarttoCSUEBStops() {
        List<ShuttleStops> route = new ArrayList<ShuttleStops>();
        route.add(new ShuttleStops("Stop 1", new LatLng(37.658755, -122.059751)));
        route.add(new ShuttleStops("Stop 2", new LatLng(37.658942, -122.055416)));
        route.add(new ShuttleStops("Stop 3", new LatLng(37.658109, -122.053978)));
        route.add(new ShuttleStops("Stop 4", new LatLng(37.657752, -122.053442)));
        return route;
    }
}
