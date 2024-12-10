package X;

/* renamed from: X.60J  reason: invalid class name */
public final class AnonymousClass60J extends AnonymousClass6TG {
    public final String A00;

    public AnonymousClass60J(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass60J) && C18070vi.A18(this.A00, ((AnonymousClass60J) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(prompt=");
        return C17900vP.A0B(this.A00, A10);
    }
}
