package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.0Wz  reason: invalid class name and case insensitive filesystem */
public final class C06110Wz implements C16870tM {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C16120rk A02;
    public final /* synthetic */ C16130rl A03;

    public C06110Wz(C16120rk r1, C16130rl r2, float f, int i) {
        this.A00 = f;
        this.A02 = r1;
        this.A03 = r2;
        this.A01 = i;
    }

    public /* synthetic */ int BjA(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A00(r2, this, list, i);
    }

    public /* synthetic */ int BjD(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A01(r2, this, list, i);
    }

    public final C16820tH BjZ(C17530uo r23, List list, long j) {
        C17530uo r6 = r23;
        C18070vi.A0d(r6, 0);
        List<C17500ul> list2 = list;
        C18070vi.A0d(list2, 1);
        for (C17500ul r4 : list2) {
            if (C18070vi.A18(C02610Er.A00(r4), "navigationIcon")) {
                int i = 0;
                long j2 = j;
                long j3 = j2;
                AnonymousClass0XJ Bjb = r4.Bjb(Constraints.A04(0, 0, 0, 0, 14, j3));
                for (C17500ul r42 : list2) {
                    if (C18070vi.A18(C02610Er.A00(r42), "actionIcons")) {
                        AnonymousClass0XJ Bjb2 = r42.Bjb(Constraints.A04(0, 0, 0, 0, 14, j3));
                        int A012 = Constraints.A01(j2);
                        if (A012 != Integer.MAX_VALUE && (A012 = (A012 - Bjb.A01) - Bjb2.A01) < 0) {
                            A012 = 0;
                        }
                        for (C17500ul r3 : list2) {
                            if (C18070vi.A18(C02610Er.A00(r3), "title")) {
                                AnonymousClass0XJ Bjb3 = r3.Bjb(Constraints.A04(0, A012, 0, 0, 12, j3));
                                AnonymousClass0AE r2 = AnonymousClass0MK.A01;
                                if (Bjb3.BLy(r2) != Integer.MIN_VALUE) {
                                    i = Bjb3.BLy(r2);
                                }
                                int A013 = C22339B3q.A01(this.A00);
                                return r6.BhL(AnonymousClass1D7.A0I(), new C11520kE(this.A02, this.A03, r6, Bjb, Bjb3, Bjb2, A013, this.A01, i, j2), Constraints.A01(j2), A013);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public /* synthetic */ int Bjw(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A02(r2, this, list, i);
    }

    public /* synthetic */ int Bjz(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A03(r2, this, list, i);
    }
}
