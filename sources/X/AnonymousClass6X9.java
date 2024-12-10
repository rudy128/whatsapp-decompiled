package X;

import android.content.Context;

/* renamed from: X.6X9  reason: invalid class name */
public abstract class AnonymousClass6X9 {
    public static String A00(Context context, AnonymousClass1M9 r9, C24921Me r10, C18030ve r11, AnonymousClass206 r12) {
        AnonymousClass1BI r0;
        AnonymousClass205 r1 = r12.A0v;
        if (r1.A02) {
            return context.getString(2131898595);
        }
        AnonymousClass1BI r6 = r1.A00;
        if (C22971Dz.A0e(r6)) {
            r0 = r12.A0H();
        } else {
            r0 = r6;
        }
        if (r0 == null) {
            return "";
        }
        AnonymousClass1E7 A0H = r9.A0H(r0);
        int A0B = r10.A0B(r6);
        C42751yg A0F = r10.A0F(A0H, A0B, false, true);
        String str = A0F.A01;
        String A0V = r10.A0V(A0H, r6, A0F.A00, A0B);
        if (AnonymousClass6X8.A00(A0F, A0H, r11)) {
            if (A0V == null) {
                return "";
            }
            return A0V;
        } else if (str == null) {
            return "";
        } else {
            return str;
        }
    }
}
