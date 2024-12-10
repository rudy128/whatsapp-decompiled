package X;

import android.content.Context;

/* renamed from: X.2yt  reason: invalid class name and case insensitive filesystem */
public class C66882yt implements AnonymousClass5ZM {
    public final int A00;
    public final Object A01;

    public C66882yt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C24163BwW BGM(Context context, AnonymousClass1EC r11) {
        C24163BwW bwW;
        AnonymousClass10E r1;
        int i = this.A00;
        Object obj = this.A01;
        Context context2 = context;
        AnonymousClass1EC r8 = r11;
        if (i != 0) {
            AnonymousClass10E r0 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r12 = r0.A00;
            bwW = new C24163BwW(context2, AnonymousClass10E.A13(r0), (C28527E6b) r12.A2A.get(), (C107445Zs) r12.A29.get(), (C85944Pm) r12.A2S.get(), r8);
            r1 = r12.AJU;
        } else {
            AnonymousClass1K2 r02 = (AnonymousClass1K2) obj;
            AnonymousClass1K1 r13 = r02.A00;
            AnonymousClass10E r03 = r02.A01;
            bwW = new C24163BwW(context2, AnonymousClass10E.A13(r03), (C28527E6b) r13.A2E.get(), (C107445Zs) r13.A2D.get(), (C85944Pm) r03.A00.A2S.get(), r8);
            r1 = r13.AAQ;
        }
        C63492tA.A01((AnonymousClass19D) r1.A02.get(), bwW);
        C63492tA.A02((C18030ve) r1.A04.get(), bwW);
        C63492tA.A03((AnonymousClass1DC) r1.A95.get(), bwW);
        C63492tA.A00((C18000vb) r1.ABz.get(), bwW);
        return bwW;
    }
}
