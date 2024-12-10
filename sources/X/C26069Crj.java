package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Crj  reason: case insensitive filesystem */
public abstract class C26069Crj {
    public static final C27069DRu A00 = new C27069DRu((List) null, 6, "");

    public static final List A00(C27069DRu dRu, int i, int i2) {
        List list;
        ArrayList arrayList = null;
        if (!(i == i2 || (list = dRu.A03) == null)) {
            if (i == 0 && i2 >= dRu.A00.length()) {
                return list;
            }
            ArrayList A14 = AnonymousClass000.A14(list);
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C26047CrE.A00(A14, list, i3, i, i2);
            }
            arrayList = C108975cc.A0g(A14);
            int size2 = A14.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C26047CrE crE = (C26047CrE) A14.get(i4);
                arrayList.add(new C26047CrE(crE.A02, BE6.A07(crE.A01, i, i2), BE6.A07(crE.A00, i, i2)));
            }
        }
        return arrayList;
    }

    public static final List A01(List list, int i, int i2) {
        if (i <= i2) {
            if (list != null) {
                ArrayList A14 = AnonymousClass000.A14(list);
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C26047CrE.A00(A14, list, i3, i, i2);
                }
                ArrayList A0g = C108975cc.A0g(A14);
                int size2 = A14.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C26047CrE crE = (C26047CrE) A14.get(i4);
                    A0g.add(new C26047CrE(crE.A02, crE.A03, Math.max(i, crE.A01) - i, Math.min(i2, crE.A00) - i));
                }
                if (!A0g.isEmpty()) {
                    return A0g;
                }
            }
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("start (");
        A10.append(i);
        A10.append(") should be less than or equal to end (");
        throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, i2));
    }

    public static final boolean A02(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) < Math.min(i2, i4)) {
            return true;
        }
        if (i <= i3 && i4 <= i2 && (i2 != i4 || AnonymousClass000.A1T(i3, i4) == AnonymousClass000.A1T(i, i2))) {
            return true;
        }
        if (i3 > i || i2 > i4) {
            return false;
        }
        if (i4 != i2 || AnonymousClass000.A1T(i, i2) == AnonymousClass000.A1T(i3, i4)) {
            return true;
        }
        return false;
    }
}
