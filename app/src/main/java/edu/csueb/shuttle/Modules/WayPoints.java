package edu.csueb.shuttle.Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vivek on 5/11/2017.
 */

public class WayPoints {

    public static List<String> getCSUEBtoHaywardBartWayPoints() {
        List<String> route = new ArrayList<String>();
        route.add("37.673860, -122.081363");
        route.add("37.673860, -122.081363");
        return route;
    }

    public static List<String> getHaywardBarttoCSUEBWayPoints() {
        List<String> route = new ArrayList<String>();
        route.add("37.658755, -122.059751");
        route.add("37.658942, -122.055416");
        route.add("37.658109, -122.053978");
        route.add("37.657752, -122.053442");
        return route;
    }
}
