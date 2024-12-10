package X;

/* renamed from: X.4YN  reason: invalid class name */
public final class AnonymousClass4YN {
    public final int A00;
    public final AnonymousClass4ZN A01;
    public final AnonymousClass1EC A02;

    public AnonymousClass4YN() {
        this((AnonymousClass1EC) null, (AnonymousClass4ZN) null, 0);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YN) {
                AnonymousClass4YN r5 = (AnonymousClass4YN) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.A00 * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UiState(step=");
        A10.append(this.A00);
        A10.append(", disclaimerText=");
        A10.append(this.A01);
        A10.append(", linkedGeneralGroup=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public AnonymousClass4YN(AnonymousClass1EC r1, AnonymousClass4ZN r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r1;
    }
}
