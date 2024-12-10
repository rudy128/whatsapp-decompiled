package X;

/* renamed from: X.4Y9  reason: invalid class name */
public final class AnonymousClass4Y9 {
    public final AnonymousClass1EC A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4Y9) {
                AnonymousClass4Y9 r5 = (AnonymousClass4Y9) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0k(this.A00) * 31, this.A01);
    }

    public AnonymousClass4Y9(AnonymousClass1EC r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Input(selectedCommunityJid=");
        A10.append(this.A00);
        A10.append(", isSuggestion=");
        return C17900vP.A0F(A10, this.A01);
    }

    public AnonymousClass4Y9() {
        this((AnonymousClass1EC) null, false);
    }
}
