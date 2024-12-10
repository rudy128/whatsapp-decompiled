package X;

/* renamed from: X.4TL  reason: invalid class name */
public final class AnonymousClass4TL {
    public final AnonymousClass210 A00;
    public final C87744Wu A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4TL) {
                AnonymousClass4TL r5 = (AnonymousClass4TL) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public AnonymousClass4TL(AnonymousClass210 r1, C87744Wu r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinkMessageModel(message=");
        A10.append(this.A00);
        A10.append(", galleryMetadata=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
