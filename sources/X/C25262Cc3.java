package X;

/* renamed from: X.Cc3  reason: case insensitive filesystem */
public final class C25262Cc3 {
    public final C27069DRu A00;
    public final EBT A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25262Cc3) {
                C25262Cc3 cc3 = (C25262Cc3) obj;
                if (!C18070vi.A18(this.A00, cc3.A00) || !C18070vi.A18(this.A01, cc3.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C27069DRu A00() {
        return this.A00;
    }

    public final EBT A01() {
        return this.A01;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public C25262Cc3(C27069DRu dRu, EBT ebt) {
        this.A00 = dRu;
        this.A01 = ebt;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TransformedText(text=");
        A10.append(this.A00);
        A10.append(", offsetMapping=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
