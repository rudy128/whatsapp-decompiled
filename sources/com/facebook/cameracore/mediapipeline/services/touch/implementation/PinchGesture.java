package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

public class PinchGesture extends Gesture {
    public final float scale;

    public PinchGesture(long j, float f, float f2, float f3, Gesture.GestureState gestureState, boolean z, float f4, float f5) {
        super(j, f2, f3, gestureState, true, f4, f5);
        this.scale = f;
    }

    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.PINCH;
    }
}
