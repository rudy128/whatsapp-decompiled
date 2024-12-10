package X;

/* renamed from: X.9O1  reason: invalid class name */
public final class AnonymousClass9O1 {
    public C193429q5 A00;
    public C195129sq A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9O1) {
                AnonymousClass9O1 r5 = (AnonymousClass9O1) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CollectionCache(collection=");
        A10.append(this.A01);
        A10.append(", pageInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
