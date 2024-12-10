package X;

/* renamed from: X.4CE  reason: invalid class name */
public final class AnonymousClass4CE extends AnonymousClass4F6 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4CE) && this.A00 == ((AnonymousClass4CE) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass4CE(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Resource(layout=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
