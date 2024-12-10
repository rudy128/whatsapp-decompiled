package X;

import android.hardware.Camera;
import android.os.Handler;

/* renamed from: X.75J  reason: invalid class name */
public class AnonymousClass75J implements Camera.AutoFocusCallback {
    public final int A00;
    public final Object A01;

    public AnonymousClass75J(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        if (this.A00 != 0) {
            C109835e5 r4 = (C109835e5) this.A01;
            Handler handler = r4.A04;
            Runnable runnable = r4.A0Q;
            if (handler != null) {
                handler.postDelayed(runnable, 2000);
            } else {
                r4.postDelayed(runnable, 2000);
            }
        } else {
            C28598E9p e9p = ((Bq6) this.A01).A0F;
            e9p.getClass();
            e9p.Blx(z);
        }
    }
}
