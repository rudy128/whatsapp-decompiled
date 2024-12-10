package X;

import android.content.Context;

/* renamed from: X.9oO  reason: invalid class name and case insensitive filesystem */
public class C192439oO {
    public C170208ou A00;
    public final Context A01;
    public final C18140vp A02;

    public C28781at A00() {
        C170208ou r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (C170208ou) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.get();
    }

    public C28791au A01() {
        C170208ou r0;
        synchronized (this) {
            r0 = this.A00;
            if (r0 == null) {
                r0 = (C170208ou) this.A02.get();
                this.A00 = r0;
            }
        }
        return r0.A06();
    }

    public C192439oO(Context context, C18140vp r2) {
        this.A01 = context;
        this.A02 = r2;
    }
}
