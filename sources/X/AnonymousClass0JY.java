package X;

/* renamed from: X.0JY  reason: invalid class name */
public final class AnonymousClass0JY {
    public final float A00;
    public final C03380Hv A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0JY) {
                AnonymousClass0JY r5 = (AnonymousClass0JY) obj;
                if (!AnonymousClass000.A1P(Float.compare(this.A00, r5.A00)) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A05(this.A00));
    }

    public AnonymousClass0JY(C03380Hv r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BorderStroke(width=");
        A10.append(DSH.A01(this.A00));
        A10.append(", brush=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
