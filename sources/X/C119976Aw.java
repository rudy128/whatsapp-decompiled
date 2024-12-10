package X;

/* renamed from: X.6Aw  reason: invalid class name and case insensitive filesystem */
public final class C119976Aw extends AnonymousClass6TU {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C119976Aw) && this.A00 == ((C119976Aw) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C119976Aw(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SeekEvent(progress=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
