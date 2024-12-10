package X;

/* renamed from: X.4TC  reason: invalid class name */
public final class AnonymousClass4TC {
    public final float A00;
    public final AnonymousClass4ZN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TC) {
                AnonymousClass4TC r5 = (AnonymousClass4TC) obj;
                if (Float.compare(this.A00, r5.A00) != 0 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, Float.floatToIntBits(this.A00) * 31);
    }

    public AnonymousClass4TC(AnonymousClass4ZN r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EducationFooterUiState(translationY=");
        A10.append(this.A00);
        A10.append(", text=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
