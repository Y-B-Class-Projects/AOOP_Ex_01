package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AirportUtil {
    public static void sortTransport(Comparable[] transport){

        Arrays.sort(transport, Comparable::compareTo);
    }
    static String reportAll (Movable[] movables) {
        ArrayList<String> buffer = new ArrayList<>();
        for (Movable m: movables) {
            String temp = "";
            if(m.getClass() == Plane.class) {
                Plane p = (Plane) m;
                temp = "Plane " + p.licenceNumber + " going from " + p.source + " to " + p.destination + ". Currently in " + p.getCurrentLocation();
            }
            else  if(m.getClass() == Train.class){
                Train t = (Train) m;
                temp = "Train " + t.licenceNumber + " going from " + t.source + " to " + t.destination + ". Currently in " + t.getCurrentLocation();
            }

            buffer.add(temp);
        }
        return String.join("\n",buffer);
    }
}
