package X;

import android.content.Context;

/* renamed from: X.1gk  reason: invalid class name and case insensitive filesystem */
public class C32161gk {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final AnonymousClass118 A03;
    public final C18000vb A04;

    public static String A00(AnonymousClass1BI r5, C32161gk r6, int i) {
        Context context = r6.A03.A00;
        Object[] objArr = new Object[1];
        AnonymousClass1M9 r0 = r6.A01;
        C17960vV.A07(r5);
        String str = null;
        String A0I = r6.A02.A0I(r0.A0H(r5));
        if (A0I != null) {
            str = r6.A04.A0F(A0I);
        }
        objArr[0] = str;
        return context.getString(i, objArr);
    }

    public C32161gk(AnonymousClass11S r1, AnonymousClass1M9 r2, C24921Me r3, AnonymousClass118 r4, C18000vb r5) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }
}
