package X;

/* renamed from: X.8nH  reason: invalid class name */
public final class AnonymousClass8nH extends AnonymousClass9MC {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8nH) && this.A00 == ((AnonymousClass8nH) obj).A00);
    }

    public int hashCode() {
        Integer num = this.A00;
        return C72453Mb.A0E(num, AnonymousClass9Q3.A00(num));
    }

    public AnonymousClass8nH(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Failure(failureMessage=");
        return C17900vP.A0B(AnonymousClass9Q3.A00(this.A00), A10);
    }
}
