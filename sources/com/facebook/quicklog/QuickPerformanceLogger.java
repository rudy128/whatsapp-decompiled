package com.facebook.quicklog;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public interface QuickPerformanceLogger extends LightweightQuickPerformanceLogger {
    long currentMonotonicTimestamp();

    void endAllInstancesOfMarker(int i, short s);

    void endAllMarkers(short s, boolean z);

    boolean isMarkerOn(int i, int i2);

    EventBuilder markEventBuilder(int i, String str);

    @Deprecated
    void markJoinRequestForE2E(int i, int i2, String str, long j, TimeUnit timeUnit);

    @Deprecated
    void markJoinResponseForE2E(int i, int i2, String str, long j, TimeUnit timeUnit);

    void markerAnnotate(int i, int i2, String str, double d);

    void markerAnnotate(int i, int i2, String str, int i3);

    void markerAnnotate(int i, int i2, String str, long j);

    void markerAnnotate(int i, int i2, String str, String str2);

    void markerAnnotate(int i, int i2, String str, boolean z);

    void markerAnnotate(int i, int i2, String str, double[] dArr);

    void markerAnnotate(int i, int i2, String str, long[] jArr);

    void markerAnnotate(int i, int i2, String str, String[] strArr);

    void markerAnnotate(int i, int i2, String str, boolean[] zArr);

    void markerAnnotateCrucialForUserFlow(int i, int i2, String str, int i3);

    void markerAnnotateCrucialForUserFlow(int i, int i2, String str, String str2);

    void markerDrop(int i, int i2);

    void markerDropForUserFlow(int i, int i2);

    void markerEnd(int i, int i2, short s);

    void markerEnd(int i, int i2, short s, long j, TimeUnit timeUnit);

    void markerEndForUserFlow(int i, int i2, short s);

    void markerEndForUserFlow(int i, String str, int i2, short s);

    void markerGenerate(int i, short s, long j, TimeUnit timeUnit);

    void markerGenerateWithAnnotations(int i, short s, long j, TimeUnit timeUnit, Map map);

    void markerPoint(int i, int i2, String str);

    void markerPoint(int i, int i2, String str, String str2);

    void markerStart(int i, int i2);

    void markerStart(int i, int i2, long j, TimeUnit timeUnit);

    @Deprecated
    void markerStartForE2E(int i, int i2, String str, boolean z, long j, TimeUnit timeUnit);

    void markerStartForUserFlow(int i, int i2, String str, boolean z, long j);

    void markerStartForUserFlow(int i, int i2, boolean z, long j);

    void markerStartWithCancelPolicy(int i, boolean z, int i2, long j, TimeUnit timeUnit);

    @Deprecated
    void markerTag(int i, int i2, String str);

    int sampleRateForMarker(int i);

    MarkerEditor withMarker(int i, int i2);
}
