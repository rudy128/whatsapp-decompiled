package X;

/* renamed from: X.4iq  reason: invalid class name and case insensitive filesystem */
public final class C93354iq implements C106725Wy {
    public final AnonymousClass4ZN A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C93354iq) && C18070vi.A18(this.A00, ((C93354iq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C93354iq(AnonymousClass4ZN r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ListHeader(headerStringProvider=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
