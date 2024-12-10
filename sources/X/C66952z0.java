package X;

import android.content.Context;

/* renamed from: X.2z0  reason: invalid class name and case insensitive filesystem */
public class C66952z0 implements AnonymousClass5ZV {
    public final int A00;
    public final Object A01;

    public C66952z0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AnonymousClass6Ph BGq(Context context, C81723zh r11, AnonymousClass1EC r12, AnonymousClass1EC r13) {
        AnonymousClass6Ph r2;
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        Context context2 = context;
        C81723zh r5 = r11;
        AnonymousClass1EC r7 = r12;
        AnonymousClass1EC r8 = r13;
        if (i != 0) {
            AnonymousClass10G r14 = ((AnonymousClass10H) obj).A00.A00;
            r2 = new AnonymousClass6Ph(context2, (C1595384x) r14.A27.get(), r5, (AnonymousClass4SV) r14.A2T.get(), r7, r8);
            r1 = r14.AJU;
        } else {
            AnonymousClass1K1 r15 = ((AnonymousClass1K2) obj).A00;
            r2 = new AnonymousClass6Ph(context2, (C1595384x) r15.A2C.get(), r5, (AnonymousClass4SV) r15.A4A.get(), r7, r8);
            r1 = r15.AAQ;
        }
        C63492tA.A01((AnonymousClass19D) r1.A02.get(), r2);
        C63492tA.A02((C18030ve) r1.A04.get(), r2);
        C63492tA.A03((AnonymousClass1DC) r1.A95.get(), r2);
        C63492tA.A00((C18000vb) r1.ABz.get(), r2);
        return r2;
    }
}
