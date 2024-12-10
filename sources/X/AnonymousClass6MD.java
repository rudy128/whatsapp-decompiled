package X;

import android.content.Context;
import android.util.Pair;

/* renamed from: X.6MD  reason: invalid class name */
public class AnonymousClass6MD extends A34 {
    public final AnonymousClass1KB A00;
    public final C678831f A01;
    public final C129616i5 A02;
    public final AnonymousClass1OZ A03;
    public final String A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        try {
            this.A03.A0E(32000);
            return this.A01.A03(AnonymousClass2R1.A0F, (Integer) null, this.A04);
        } catch (C36811oV unused) {
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        this.A00.A04();
        C129616i5 r0 = this.A02;
        C139386yk r4 = r0.A01;
        String str = r0.A03;
        Context context = r0.A00;
        String str2 = r0.A04;
        AnonymousClass206 r1 = r0.A02;
        r4.A00 = null;
        if (pair != null) {
            C18070vi.A0b(str);
            ((C37141p2) r4.A07.get()).A00.put(str, pair);
        }
        C18070vi.A0b(str);
        AnonymousClass205 r02 = r1.A0v;
        C139386yk.A00(context, pair, r4, r02.A00, str, str2, r02.A02);
    }

    public void A0F() {
        this.A00.A07(0, 2131888276);
    }

    public AnonymousClass6MD(AnonymousClass1KB r1, C678831f r2, C129616i5 r3, AnonymousClass1OZ r4, String str) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = str;
        this.A02 = r3;
    }
}
