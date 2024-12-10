package X;

/* renamed from: X.8lG  reason: invalid class name */
public final class AnonymousClass8lG extends AnonymousClass9N2 {
    public static final C181209Po A01 = new Object();
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8lG) && C18070vi.A18(this.A00, ((AnonymousClass8lG) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8lG(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecentSearchQuery(query=");
        return C17900vP.A0B(this.A00, A10);
    }
}
