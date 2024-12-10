package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.D5g  reason: case insensitive filesystem */
public final class C26592D5g implements C16870tM {
    public static final C26592D5g A00 = new C26592D5g();

    public /* synthetic */ int BjA(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A00(r2, this, list, i);
    }

    public /* synthetic */ int BjD(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A01(r2, this, list, i);
    }

    public /* synthetic */ int Bjw(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A02(r2, this, list, i);
    }

    public /* synthetic */ int Bjz(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A03(r2, this, list, i);
    }

    public final C16820tH BjZ(C17530uo r8, List list, long j) {
        int i;
        int i2;
        C22821Di r1;
        int size = list.size();
        if (size != 0) {
            int i3 = 0;
            if (size != 1) {
                ArrayList A14 = AnonymousClass000.A14(list);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    A14.add(((C17500ul) list.get(i4)).Bjb(j));
                }
                int A04 = AnonymousClass1ZU.A04(A14);
                i = 0;
                i2 = 0;
                if (A04 >= 0) {
                    while (true) {
                        AnonymousClass0XJ r12 = (AnonymousClass0XJ) A14.get(i3);
                        i = Math.max(i, r12.A01);
                        i2 = Math.max(i2, r12.A00);
                        if (i3 == A04) {
                            break;
                        }
                        i3++;
                    }
                }
                r1 = new C27923DoL(A14);
            } else {
                AnonymousClass0XJ Bjb = ((C17500ul) list.get(0)).Bjb(j);
                i = Bjb.A01;
                i2 = Bjb.A00;
                r1 = new C27922DoK(Bjb);
            }
            return r8.BhL(AnonymousClass1D7.A0I(), r1, i, i2);
        }
        return r8.BhL(AnonymousClass1D7.A0I(), C28124Dri.A00, 0, 0);
    }
}
