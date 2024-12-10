package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import com.whatsapp.util.Log;

/* renamed from: X.4R3  reason: invalid class name */
public final class AnonymousClass4R3 {
    public C107215Yv A00;
    public final Sensor A01;
    public final Handler A02 = C17890vO.A0D();
    public final C18180vt A03 = new C18180vt(1, 60, 200, false);
    public final SensorEventListener A04;
    public final SensorManager A05;

    public AnonymousClass4R3(AnonymousClass190 r6, AnonymousClass11C r7) {
        Sensor sensor;
        C18070vi.A0e(r6, 1, r7);
        SensorManager A0A = r7.A0A();
        this.A05 = A0A;
        if (A0A == null || (sensor = A0A.getDefaultSensor(8)) == null) {
            sensor = null;
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("ProximityListener/maximumRange: ");
            A10.append(sensor.getMaximumRange());
            Log.i(A10.toString());
        }
        this.A01 = sensor;
        this.A04 = new AnonymousClass4bJ(r6, this);
    }

    public final void A00(C107215Yv r5) {
        Sensor sensor = this.A01;
        if (sensor == null) {
            Log.i("ProximityListener/setListener No proximity sensor, skipping");
        } else if (!C18070vi.A18(this.A00, r5)) {
            if (r5 == null) {
                SensorManager sensorManager = this.A05;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(this.A04, sensor);
                }
            } else {
                C17960vV.A0F(AnonymousClass000.A1X(this.A00), "ProximityListener/setListener already registered");
                SensorManager sensorManager2 = this.A05;
                if (sensorManager2 != null) {
                    sensorManager2.registerListener(this.A04, sensor, 2);
                }
            }
            this.A00 = r5;
        }
    }
}
