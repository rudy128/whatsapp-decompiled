package com.whatsapp.util;

import com.whatsapp.audioRecording.NoiseMetricsCallback;
import java.io.Closeable;

public class OpusRecorder implements Closeable {
    public long nativeHandle;
    public transient Object noiseMetricCallback;

    private native void allocateNative(String str, int i, boolean z, int i2, boolean z2, boolean z3, NoiseMetricsCallback noiseMetricsCallback, boolean z4, float f);

    private native void freeNative();

    public native long getPageNumber();

    public native boolean isRecording();

    public native void pause();

    public native void prepare();

    public native void setInitialVariablesForResume(long j, long j2);

    public native void start();

    public native void stop();

    public void finalize() {
        if (this.nativeHandle != 0) {
            freeNative();
        }
    }

    public OpusRecorder(String str, int i, boolean z, int i2, boolean z2, boolean z3, NoiseMetricsCallback noiseMetricsCallback, boolean z4, float f) {
        allocateNative(str, i, z, i2, z2, z3, noiseMetricsCallback, z4, f);
    }

    public void close() {
        freeNative();
    }
}
