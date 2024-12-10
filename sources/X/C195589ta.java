package X;

/* renamed from: X.9ta  reason: invalid class name and case insensitive filesystem */
public final class C195589ta {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195589ta) {
                C195589ta r5 = (C195589ta) obj;
                if (this.A00 != r5.A00 || this.A01 != r5.A01 || this.A06 != r5.A06 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((((((AnonymousClass0DV.A00(((this.A00 * 31) + this.A01) * 31, this.A06) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17880vN.A02(this.A04)) * 31, this.A07);
    }

    public C195589ta(Integer num, Integer num2, Integer num3, Integer num4, int i, int i2, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = i2;
        this.A06 = z;
        this.A03 = num;
        this.A02 = num2;
        this.A05 = num3;
        this.A04 = num4;
        this.A07 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProfileBizHoursItem(dayOfWeek=");
        A10.append(this.A00);
        A10.append(", mode=");
        A10.append(this.A01);
        A10.append(", isOpen=");
        A10.append(this.A06);
        A10.append(", firstOpenTime=");
        A10.append(this.A03);
        A10.append(", firstCloseTime=");
        A10.append(this.A02);
        A10.append(", secondOpenTime=");
        A10.append(this.A05);
        A10.append(", secondCloseTime=");
        A10.append(this.A04);
        A10.append(", selectedSecondRange=");
        return C17900vP.A0F(A10, this.A07);
    }
}
