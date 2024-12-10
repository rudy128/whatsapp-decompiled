package X;

/* renamed from: X.6DZ  reason: invalid class name */
public final class AnonymousClass6DZ extends AnonymousClass6SO {
    public final String newRevision;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6DZ) && C18070vi.A18(this.newRevision, ((AnonymousClass6DZ) obj).newRevision));
    }

    public int hashCode() {
        return this.newRevision.hashCode();
    }

    public AnonymousClass6DZ(String str) {
        super("Revision outdated");
        this.newRevision = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RevisionOutdated(newRevision=");
        return C17900vP.A0B(this.newRevision, A10);
    }
}
