package X;

import android.os.SystemClock;

/* renamed from: X.1Hk  reason: invalid class name and case insensitive filesystem */
public class C23731Hk implements C18140vp, AnonymousClass00H {
    public Object A00;
    public C18140vp A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Hk, java.lang.Object] */
    public static C23731Hk A00(C18140vp r3) {
        ? obj = new Object();
        Boolean bool = C17960vV.A01;
        obj.A01 = r3;
        obj.A00 = null;
        return obj;
    }

    public Object get() {
        Object obj = this.A00;
        if (obj == null) {
            C18140vp r1 = this.A01;
            boolean z = false;
            if (r1 != null) {
                z = true;
            }
            C17960vV.A0D(z);
            SystemClock.uptimeMillis();
            try {
                obj = r1.get();
                C17960vV.A07(obj);
                this.A00 = obj;
            } finally {
                SystemClock.uptimeMillis();
            }
        }
        return obj;
    }
}
