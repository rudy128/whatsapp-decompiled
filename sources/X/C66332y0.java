package X;

import android.app.Activity;

/* renamed from: X.2y0  reason: invalid class name and case insensitive filesystem */
public final class C66332y0 implements C72073Kn {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C72073Kn A01;
    public final /* synthetic */ C37551pj A02;
    public final /* synthetic */ AnonymousClass1E7 A03;
    public final /* synthetic */ boolean A04;

    public C66332y0(Activity activity, C72073Kn r2, C37551pj r3, AnonymousClass1E7 r4, boolean z) {
        this.A04 = z;
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void C3p(boolean z) {
        if (z) {
            int i = 2131897287;
            if (this.A04) {
                i = 2131887179;
            }
            C37551pj r0 = this.A02;
            r0.A00.A0G(C17880vN.A0q(this.A00, r0.A05.A0I(this.A03), new Object[1], 0, i), 1);
        }
        C72073Kn r02 = this.A01;
        if (r02 != null) {
            r02.C3p(z);
        }
    }
}
