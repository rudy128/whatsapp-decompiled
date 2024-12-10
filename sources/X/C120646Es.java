package X;

import android.content.Context;
import android.graphics.Paint;

/* renamed from: X.6Es  reason: invalid class name and case insensitive filesystem */
public final class C120646Es extends C145527Lp {
    public final C62282r9 A00;
    public final AnonymousClass1W6 A01;
    public final C18600wl A02;
    public final C18600wl A03;
    public final AnonymousClass1OX A04;

    public C120646Es(C62282r9 r1, AnonymousClass1W6 r2, C18600wl r3, C18600wl r4, AnonymousClass1OX r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public CharSequence BXo(Context context, Paint paint, AnonymousClass206 r6) {
        C18070vi.A0n(context, paint, r6);
        String A012 = this.A00.A01(r6);
        if (!(A012 instanceof CharSequence) || A012 == null) {
            return null;
        }
        return C72813Np.A03(paint, AnonymousClass4aX.A02(context, 2131233361, 2131101888), A012);
    }
}
