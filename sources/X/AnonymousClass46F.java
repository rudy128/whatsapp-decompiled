package X;

/* renamed from: X.46F  reason: invalid class name */
public final class AnonymousClass46F extends AnonymousClass4F3 {
    public final C87114Ui A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass46F) && C18070vi.A18(this.A00, ((AnonymousClass46F) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass46F(C87114Ui r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Init(transcriptionInitConfig=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
