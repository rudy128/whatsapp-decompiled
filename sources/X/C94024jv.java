package X;

/* renamed from: X.4jv  reason: invalid class name and case insensitive filesystem */
public final class C94024jv implements AnonymousClass5XE {
    public final AnonymousClass4DL A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C94024jv) && this.A00 == ((C94024jv) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C94024jv(AnonymousClass4DL r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NoData(ignored=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
