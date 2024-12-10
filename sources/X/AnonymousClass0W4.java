package X;

/* renamed from: X.0W4  reason: invalid class name */
public class AnonymousClass0W4 implements C16320s4 {
    public final int A00;
    public final Object A01;

    public AnonymousClass0W4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static final void A00(C22821Di r2) {
        synchronized (C05200Qx.A08) {
            C05200Qx.A02 = C29431cG.A0x(C05200Qx.A02, r2);
        }
        C05200Qx.A0R();
    }

    public static final void A02(AnonymousClass1OS r2) {
        synchronized (C05200Qx.A08) {
            C05200Qx.A01 = C29431cG.A0x(C05200Qx.A01, r2);
        }
    }

    public final void dispose() {
        if (this.A00 != 0) {
            A00((C22821Di) this.A01);
        } else {
            A02((AnonymousClass1OS) this.A01);
        }
    }
}
