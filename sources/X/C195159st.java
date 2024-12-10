package X;

/* renamed from: X.9st  reason: invalid class name and case insensitive filesystem */
public final class C195159st {
    public final int A00;
    public final C20245ADd A01;
    public final AnonymousClass77B A02;
    public final Integer A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195159st) {
                C195159st r5 = (C195159st) obj;
                if (this.A04 != r5.A04 || this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, (((AnonymousClass3MX.A03(this.A04) + this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A03);
    }

    public C195159st(C20245ADd aDd, AnonymousClass77B r2, Integer num, int i, boolean z) {
        this.A04 = z;
        this.A00 = i;
        this.A01 = aDd;
        this.A02 = r2;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VariantsCarouselDisplayData(showLoadingState=");
        A10.append(this.A04);
        A10.append(", selectedPosition=");
        A10.append(this.A00);
        A10.append(", selectedOption=");
        A10.append(this.A01);
        A10.append(", displayData=");
        A10.append(this.A02);
        A10.append(", type=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
