package X;

/* renamed from: X.6E3  reason: invalid class name */
public final class AnonymousClass6E3 extends C123126Tf {
    public final String A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6E3) && C18070vi.A18(this.A00, ((AnonymousClass6E3) obj).A00));
    }

    public int hashCode() {
        return C17900vP.A00(this.A00);
    }

    public AnonymousClass6E3(String str) {
        this.A00 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarEditorEvent(event=");
        return C17900vP.A0B(this.A00, A10);
    }
}
