package X;

import java.util.List;

/* renamed from: X.6u6  reason: invalid class name and case insensitive filesystem */
public final class C136616u6 {
    public final C123476Up A00;
    public final AnonymousClass6JR A01;
    public final AnonymousClass72J A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136616u6) {
                C136616u6 r5 = (C136616u6) obj;
                if (this.A0B != r5.A0B || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A00, r5.A00) || this.A05 != r5.A05 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A09, r5.A09) || this.A06 != r5.A06 || this.A0A != r5.A0A || this.A0C != r5.A0C || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A032 = (((((AnonymousClass3MX.A03(this.A0B) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A08)) * 31 * 31) + AnonymousClass001.A0k(this.A00)) * 31;
        int intValue = this.A05.intValue();
        switch (intValue) {
            case 1:
                str = "EXPANDED";
                break;
            case 2:
                str = "NONE";
                break;
            default:
                str = "COLLAPSED";
                break;
        }
        int hashCode = (((((((A032 + str.hashCode() + intValue) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A07)) * 31) + AnonymousClass001.A0k(this.A09)) * 31;
        Integer num = this.A06;
        return (((AnonymousClass0DV.A00(AnonymousClass0DV.A00((hashCode + C72453Mb.A0E(num, C124236Xo.A00(num))) * 31, this.A0A), this.A0C) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A03)) * 31;
    }

    public C136616u6(C123476Up r1, AnonymousClass6JR r2, AnonymousClass72J r3, Boolean bool, Integer num, Integer num2, Integer num3, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        this.A0B = z;
        this.A02 = r3;
        this.A08 = list;
        this.A00 = r1;
        this.A05 = num;
        this.A01 = r2;
        this.A07 = list2;
        this.A09 = list3;
        this.A06 = num2;
        this.A0A = z2;
        this.A0C = z3;
        this.A04 = num3;
        this.A03 = bool;
    }

    public String toString() {
        int i;
        Integer num;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState{statusUpdates=");
        AnonymousClass72J r5 = this.A02;
        int i2 = 0;
        if (r5 != null) {
            int A0A2 = C108945cZ.A0A(r5.A07, r5.A06.size());
            int i3 = 1;
            if (r5.A04.A00() == null) {
                i3 = 0;
            }
            i = A0A2 + i3;
        } else {
            i = 0;
        }
        A10.append(i);
        A10.append(", newsletters=");
        List list = this.A08;
        if (list != null) {
            i2 = list.size();
        }
        A10.append(i2);
        A10.append(" recommended=");
        AnonymousClass6JR r0 = this.A01;
        if (r0 != null) {
            num = Integer.valueOf(r0.A00.size());
        } else {
            num = null;
        }
        A10.append(num);
        return C17890vO.A0b(A10);
    }
}
