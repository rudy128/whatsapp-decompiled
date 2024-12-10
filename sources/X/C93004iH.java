package X;

/* renamed from: X.4iH  reason: invalid class name and case insensitive filesystem */
public final class C93004iH implements C106665Ws {
    public final Object A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93004iH) && C18070vi.A18(this.A00, ((C93004iH) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C93004iH(Object obj) {
        this.A00 = obj;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(data=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
