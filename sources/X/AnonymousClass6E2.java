package X;

/* renamed from: X.6E2  reason: invalid class name */
public final class AnonymousClass6E2 extends C123126Tf {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6E2) && C18070vi.A18(this.A00, ((AnonymousClass6E2) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass6E2(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarArtRevisionUpdate(newRevision=");
        return C17900vP.A0B(this.A00, A10);
    }
}
