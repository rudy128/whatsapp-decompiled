package X;

import android.app.Activity;

/* renamed from: X.68M  reason: invalid class name */
public final class AnonymousClass68M extends C144787Ir {
    public final AnonymousClass1OS A00;
    public final AnonymousClass1OS A01;

    public AnonymousClass68M(Activity activity, AnonymousClass1KB r11, C24921Me r12, AnonymousClass1NM r13, AnonymousClass11Z r14, AnonymousClass18K r15, AnonymousClass1OS r16, AnonymousClass1OS r17) {
        super(activity, r11, r12, r13, r14, (AnonymousClass1E7) null, r15);
        this.A01 = r16;
        this.A00 = r17;
    }

    public void BsD(C1409173o r2, C136996uk r3) {
        C18070vi.A0h(r2, r3);
        super.BsD(r2, r3);
        if (r2.A03()) {
            this.A01.invoke(r2, r3);
            this.A00 = null;
            return;
        }
        this.A00.invoke(r2, r3);
    }
}
