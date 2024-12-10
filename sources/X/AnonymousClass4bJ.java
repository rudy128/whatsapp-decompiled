package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.whatsapp.util.Log;

/* renamed from: X.4bJ  reason: invalid class name */
public final class AnonymousClass4bJ implements SensorEventListener {
    public boolean A00;
    public final /* synthetic */ AnonymousClass190 A01;
    public final /* synthetic */ AnonymousClass4R3 A02;

    public AnonymousClass4bJ(AnonymousClass190 r1, AnonymousClass4R3 r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (i == 0) {
            Log.i("ProximityListener/onAccuracyChanged Sensor values are unreliable and will be ignored");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r4 = r5.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSensorChanged(android.hardware.SensorEvent r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0040
            android.hardware.Sensor r0 = r6.sensor
            if (r0 == 0) goto L_0x0040
            int r1 = r0.getType()
            r0 = 8
            if (r1 != r0) goto L_0x0040
            int r0 = r6.accuracy
            r1 = 0
            if (r0 == 0) goto L_0x003f
            X.4R3 r4 = r5.A02
            android.hardware.Sensor r3 = r4.A01
            if (r3 == 0) goto L_0x003f
            float[] r0 = r6.values
            r2 = r0[r1]
            r1 = 1084227584(0x40a00000, float:5.0)
            float r0 = r3.getMaximumRange()
            float r0 = java.lang.Math.min(r1, r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x002d
            r3 = 1
        L_0x002d:
            boolean r0 = r5.A00
            if (r3 == r0) goto L_0x003f
            r5.A00 = r3
            android.os.Handler r2 = r4.A02
            r1 = 21
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r4, (boolean) r3)
            r2.post(r0)
        L_0x003f:
            return
        L_0x0040:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ProximityListener/onSensorChanged invalid event: "
            X.C17900vP.A0Y(r6, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4bJ.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
