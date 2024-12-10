package X;

/* renamed from: X.43T  reason: invalid class name */
public final class AnonymousClass43T extends C83304Ep {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass43T) && C18070vi.A18(this.A00, ((AnonymousClass43T) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass43T() {
        this("");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoResults(query=");
        return C17900vP.A0B(this.A00, A10);
    }

    public AnonymousClass43T(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }
}
