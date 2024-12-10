package X;

/* renamed from: X.46C  reason: invalid class name */
public final class AnonymousClass46C extends AnonymousClass4F2 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass46C) && this.A00 == ((AnonymousClass46C) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass46C(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SelectedLanguagePosition(position=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
