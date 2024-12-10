package X;

import android.hardware.SensorManager;
import java.lang.ref.WeakReference;

/* renamed from: X.1dQ  reason: invalid class name and case insensitive filesystem */
public final class C30121dQ implements C24411Kf {
    public final AnonymousClass11C A00;
    public final C18100vl A01 = new C18110vm(new C71013Dl(this, 7));
    public final AnonymousClass1LU A02;
    public volatile WeakReference A03 = new WeakReference((Object) null);

    public C30121dQ(AnonymousClass11C r3, AnonymousClass1LU r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A02 = r4;
        this.A00 = r3;
    }

    public void BlT() {
        synchronized (this) {
            SensorManager A0A = this.A00.A0A();
            if (A0A != null) {
                A0A.registerListener((C26355CyH) this.A01.getValue(), A0A.getDefaultSensor(1), 2);
            }
        }
    }

    public void onAppBackgrounded() {
        synchronized (this) {
            SensorManager A0A = this.A00.A0A();
            if (A0A != null) {
                A0A.unregisterListener((C26355CyH) this.A01.getValue());
            }
        }
    }
}
