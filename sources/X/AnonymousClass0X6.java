package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0X6  reason: invalid class name */
public final class AnonymousClass0X6 implements C16870tM {
    public static final AnonymousClass0X6 A00 = new AnonymousClass0X6();

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
        ArrayList A14 = AnonymousClass000.A14(list);
        int size = list.size();
        Integer num = 0;
        for (int i = 0; i < size; i++) {
            AnonymousClass001.A1T(A14, list, i, j);
        }
        int size2 = A14.size();
        Integer num2 = num;
        for (int i2 = 0; i2 < size2; i2++) {
            num2 = Integer.valueOf(Math.max(num2.intValue(), ((AnonymousClass0XJ) A14.get(i2)).A01));
        }
        int intValue = num2.intValue();
        int size3 = A14.size();
        for (int i3 = 0; i3 < size3; i3++) {
            num = Integer.valueOf(Math.max(num.intValue(), ((AnonymousClass0XJ) A14.get(i3)).A00));
        }
        return r8.BhL(AnonymousClass1D7.A0I(), new C09820hL(A14), intValue, num.intValue());
    }
}
