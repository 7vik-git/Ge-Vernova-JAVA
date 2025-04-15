package com.gevernova.encapsulation.ride;

// Interface for GPS tracking
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}
