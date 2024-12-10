package X;

/* renamed from: X.BsZ  reason: case insensitive filesystem */
public final class C23939BsZ extends C4R {
    public final C25172CaO A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23939BsZ) && C18070vi.A18(this.A00, ((C23939BsZ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23939BsZ(C25172CaO caO) {
        this.A00 = caO;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Optional(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
