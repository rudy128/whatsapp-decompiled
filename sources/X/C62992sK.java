package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.2sK  reason: invalid class name and case insensitive filesystem */
public abstract class C62992sK {
    public static final Map A00;
    public static final List A01;
    public static final List A02;
    public static final List A03;
    public static final List A04;
    public static final List A05;
    public static final List A06;
    public static final List A07;
    public static final List A08;
    public static final Map A09;

    static {
        List A0M = C18070vi.A0M(1);
        A08 = A0M;
        Integer[] numArr = new Integer[3];
        numArr[0] = 100;
        numArr[1] = 150;
        List A0O = C18070vi.A0O(999, numArr, 2);
        A06 = A0O;
        Integer[] numArr2 = new Integer[4];
        numArr2[0] = 110;
        numArr2[1] = 120;
        List A0N = C18070vi.A0N(150, 999, numArr2, 2, 3);
        A07 = A0N;
        Integer[] numArr3 = new Integer[5];
        numArr3[0] = 120;
        numArr3[1] = 130;
        numArr3[2] = 150;
        List A0N2 = C18070vi.A0N(170, 999, numArr3, 3, 4);
        A02 = A0N2;
        List A0x = C29431cG.A0x(A0N2, 120);
        A01 = A0x;
        Integer[] numArr4 = new Integer[3];
        numArr4[0] = 170;
        List A0N3 = C18070vi.A0N(150, 999, numArr4, 1, 2);
        A05 = A0N3;
        List A0N4 = C18070vi.A0N(170, 999, new Integer[2], 0, 1);
        A03 = A0N4;
        List A0M2 = C18070vi.A0M(999);
        A04 = A0M2;
        AnonymousClass1D6[] r15 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03((Object) null, A0M, r15, 0);
        AnonymousClass1D6.A03(1, A0O, r15, 1);
        A09 = AnonymousClass1D7.A0B(r15);
        AnonymousClass1D6[] r1 = new AnonymousClass1D6[6];
        AnonymousClass1D6.A03(100, A0N, r1, 0);
        AnonymousClass1D6.A03(110, A0N2, r1, 1);
        r1[2] = AnonymousClass1D6.A01(120, A0x);
        r1[3] = AnonymousClass1D6.A01(130, A0N3);
        r1[4] = AnonymousClass1D6.A01(150, A0N4);
        r1[5] = AnonymousClass1D6.A01(170, A0M2);
        A00 = AnonymousClass1D7.A0B(r1);
    }

    public static final boolean A01(Integer num, Integer num2) {
        if (num == null || num2 == null) {
            return false;
        }
        Map map = A09;
        if (!map.containsKey(num2)) {
            map = A00;
            if (!map.containsKey(num2)) {
                return false;
            }
        } else if (!map.containsKey(num)) {
            return A00.containsKey(num);
        }
        List list = (List) map.get(num2);
        if (list != null) {
            return list.contains(num);
        }
        return false;
    }

    public static final Integer A00(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 100;
            if (i != 100) {
                i2 = 110;
                if (i != 110) {
                    i2 = 120;
                    if (i != 120) {
                        i2 = 130;
                        if (i != 130) {
                            i2 = 150;
                            if (!(i == 150 || i == 170)) {
                                i2 = 999;
                                if (i != 999) {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
        return Integer.valueOf(i2);
    }
}
