package X;

import java.util.List;

/* renamed from: X.0XA  reason: invalid class name */
public final class AnonymousClass0XA implements C16870tM {
    public final C16120rk A00;
    public final C16130rl A01;
    public final C03410Hz A02;
    public final Integer A03;
    public final Integer A04;

    public C16820tH BjZ(C17530uo r12, List list, long j) {
        int i;
        int i2;
        Integer num = this.A04;
        AnonymousClass0QF r4 = new AnonymousClass0QF(this.A00, this.A01, this.A02, num, list, new AnonymousClass0XJ[list.size()]);
        C03280Hj A06 = r4.A06(r12, list.size(), j);
        if (num == AnonymousClass00R.A00) {
            i = A06.A02;
            i2 = A06.A00;
        } else {
            i = A06.A00;
            i2 = A06.A02;
        }
        return r12.BhL(AnonymousClass1D7.A0I(), new C11180jc(A06, r4, r12), i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0XA) {
                AnonymousClass0XA r5 = (AnonymousClass0XA) obj;
                if (this.A04 != r5.A04 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !AnonymousClass000.A1P(Float.compare(0.0f, 0.0f)) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static final C36001nB A00(Integer num) {
        if (num == AnonymousClass00R.A00) {
            return AnonymousClass0QW.A00();
        }
        return AnonymousClass0QW.A04();
    }

    public static final C36001nB A01(Integer num) {
        if (num == AnonymousClass00R.A00) {
            return AnonymousClass0QW.A01();
        }
        return AnonymousClass0QW.A05();
    }

    public static final C36001nB A02(Integer num) {
        if (num == AnonymousClass00R.A00) {
            return AnonymousClass0QW.A02();
        }
        return AnonymousClass0QW.A06();
    }

    public static final C36001nB A03(Integer num) {
        if (num == AnonymousClass00R.A00) {
            return AnonymousClass0QW.A03();
        }
        return AnonymousClass0QW.A07();
    }

    public int BjA(C17740v9 r4, List list, int i) {
        return AnonymousClass000.A0M(A00(this.A04).invoke(list, Integer.valueOf(i), Integer.valueOf(r4.CG9(0.0f))));
    }

    public int BjD(C17740v9 r4, List list, int i) {
        return AnonymousClass000.A0M(A01(this.A04).invoke(list, Integer.valueOf(i), Integer.valueOf(r4.CG9(0.0f))));
    }

    public int Bjw(C17740v9 r4, List list, int i) {
        return AnonymousClass000.A0M(A02(this.A04).invoke(list, Integer.valueOf(i), Integer.valueOf(r4.CG9(0.0f))));
    }

    public int Bjz(C17740v9 r4, List list, int i) {
        return AnonymousClass000.A0M(A03(this.A04).invoke(list, Integer.valueOf(i), Integer.valueOf(r4.CG9(0.0f))));
    }

    public int hashCode() {
        String str;
        int intValue = this.A04.intValue();
        if (intValue != 0) {
            str = "Vertical";
        } else {
            str = "Horizontal";
        }
        int i = 0;
        int hashCode = (((str.hashCode() + intValue) * 31) + AnonymousClass001.A0k(this.A00)) * 31;
        C16130rl r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return AnonymousClass000.A0O(this.A02, (AnonymousClass000.A0B((hashCode + i) * 31, 0.0f) + 2704490) * 31);
    }

    public AnonymousClass0XA(C16120rk r1, C16130rl r2, C03410Hz r3, Integer num, Integer num2) {
        this.A04 = num;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = num2;
        this.A02 = r3;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RowColumnMeasurePolicy(orientation=");
        if (this.A04.intValue() != 0) {
            str = "Vertical";
        } else {
            str = "Horizontal";
        }
        A10.append(str);
        A10.append(", horizontalArrangement=");
        A10.append(this.A00);
        A10.append(", verticalArrangement=");
        A10.append(this.A01);
        A10.append(", arrangementSpacing=");
        A10.append(DSH.A01(0.0f));
        A10.append(", crossAxisSize=");
        A10.append("Wrap");
        A10.append(", crossAxisAlignment=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
