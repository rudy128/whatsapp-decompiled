package X;

/* renamed from: X.60H  reason: invalid class name */
public final class AnonymousClass60H extends AnonymousClass6TF {
    public final int A00;
    public final AnonymousClass77V A01;
    public final C1418377d A02;
    public final String A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass60H) {
                AnonymousClass60H r5 = (AnonymousClass60H) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A04 != r5.A04 || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00((AnonymousClass000.A0N(this.A01, C17900vP.A00(this.A03) * 31) + C17880vN.A02(this.A02)) * 31, this.A04) + this.A00;
    }

    public AnonymousClass60H(AnonymousClass77V r1, C1418377d r2, String str, int i, boolean z) {
        this.A03 = str;
        this.A01 = r1;
        this.A02 = r2;
        this.A04 = z;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Complete(contentDescription=");
        A10.append(this.A03);
        A10.append(", model=");
        A10.append(this.A01);
        A10.append(", sticker=");
        A10.append(this.A02);
        A10.append(", isDisabled=");
        A10.append(this.A04);
        A10.append(", searchBatchId=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
