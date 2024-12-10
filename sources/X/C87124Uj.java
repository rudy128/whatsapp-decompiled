package X;

/* renamed from: X.4Uj  reason: invalid class name and case insensitive filesystem */
public final class C87124Uj {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87124Uj) {
                C87124Uj r5 = (C87124Uj) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && C18070vi.A18(this.A02, r5.A02) && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((this.A01 * 31) + this.A00) * 31) + AnonymousClass001.A0k(this.A02)) * 31, this.A03);
    }

    public C87124Uj(Integer num, int i, int i2, boolean z) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = num;
        this.A03 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaQualityData(customTitleId=");
        A10.append(this.A01);
        A10.append(", customSubTitleId=");
        A10.append(this.A00);
        A10.append(", positiveButtonId=");
        A10.append(this.A02);
        A10.append(", hasRadioSubtitle=");
        return C17900vP.A0F(A10, this.A03);
    }
}
