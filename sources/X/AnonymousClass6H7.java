package X;

/* renamed from: X.6H7  reason: invalid class name */
public final class AnonymousClass6H7 extends C123206Tn {
    public final String A00;

    public AnonymousClass6H7(String str) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6H7) && C18070vi.A18(this.A00, ((AnonymousClass6H7) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(error=");
        return C17900vP.A0B(this.A00, A10);
    }
}
