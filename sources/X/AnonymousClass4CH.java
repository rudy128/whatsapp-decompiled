package X;

/* renamed from: X.4CH  reason: invalid class name */
public final class AnonymousClass4CH extends AnonymousClass4F7 {
    public final C87004Tx A00;
    public final C87004Tx A01;
    public final C87134Uk A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4CH) {
                AnonymousClass4CH r5 = (AnonymousClass4CH) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0L(this.A02) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public AnonymousClass4CH(C87004Tx r1, C87004Tx r2, C87134Uk r3, CharSequence charSequence) {
        this.A02 = r3;
        this.A03 = charSequence;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Card(header=");
        A10.append(this.A02);
        A10.append(", footnote=");
        A10.append(this.A03);
        A10.append(", primaryButton=");
        A10.append(this.A00);
        A10.append(", secondaryButton=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
