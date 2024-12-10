package X;

import android.util.Pair;

/* renamed from: X.6Lg  reason: invalid class name and case insensitive filesystem */
public class C121726Lg extends A34 {
    public final AnonymousClass167 A00;
    public final AnonymousClass89P A01;
    public final AnonymousClass1SB A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Pair[] pairArr = (Pair[]) objArr;
        C17960vV.A07(pairArr);
        Pair pair = pairArr[0];
        C17960vV.A07(pair);
        AnonymousClass1SB r2 = this.A02;
        boolean booleanValue = ((Boolean) pair.second).booleanValue();
        return r2.A06(this.A01, (String) pair.first, booleanValue, false);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass725 r4 = (AnonymousClass725) obj;
        if (r4 != null) {
            AnonymousClass167 r2 = this.A00;
            String str = r4.A0H;
            C18070vi.A0d(str, 0);
            r4.A09 = r2.A01.containsKey(str);
            this.A01.C6s(r4);
        }
    }

    public C121726Lg(AnonymousClass167 r1, AnonymousClass89P r2, AnonymousClass1SB r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
