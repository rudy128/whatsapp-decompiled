package X;

/* renamed from: X.4UW  reason: invalid class name */
public final class AnonymousClass4UW {
    public final int A00;
    public final int A01;
    public final AnonymousClass4ZN A02;
    public final Integer A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UW) {
                AnonymousClass4UW r5 = (AnonymousClass4UW) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0L(this.A02) + AnonymousClass001.A0k(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public AnonymousClass4UW(AnonymousClass4ZN r1, Integer num, int i, int i2) {
        this.A02 = r1;
        this.A03 = num;
        this.A00 = i;
        this.A01 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SubtitleState(stringProvider=");
        A10.append(this.A02);
        A10.append(", drawableRes=");
        A10.append(this.A03);
        A10.append(", animationState=");
        A10.append(this.A00);
        A10.append(", textColor=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
