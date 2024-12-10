package X;

/* renamed from: X.8is  reason: invalid class name and case insensitive filesystem */
public final class C168448is extends C168468iu {
    public final Exception A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C168448is) && C18070vi.A18(this.A00, ((C168448is) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C168448is(Exception exc) {
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(e=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
