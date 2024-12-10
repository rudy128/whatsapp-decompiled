package X;

/* renamed from: X.9pU  reason: invalid class name and case insensitive filesystem */
public final class C193069pU {
    public final Integer A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C193069pU) && this.A00 == ((C193069pU) obj).A00);
    }

    public int hashCode() {
        Integer num = this.A00;
        return (C72453Mb.A0E(num, C181369Qf.A00(num)) * 31) + 1237;
    }

    public C193069pU(Integer num) {
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseHistorySyncParams(historySyncUsage=");
        A10.append(C181369Qf.A00(this.A00));
        A10.append(", strictMode=");
        return C17900vP.A0F(A10, false);
    }
}
