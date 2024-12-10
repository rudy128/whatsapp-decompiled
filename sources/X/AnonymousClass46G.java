package X;

/* renamed from: X.46G  reason: invalid class name */
public final class AnonymousClass46G extends AnonymousClass4F3 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass46G) && this.A00 == ((AnonymousClass46G) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass46G(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectedLanguagePosition(selectedLanguagePosition=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
