package X;

/* renamed from: X.6sc  reason: invalid class name and case insensitive filesystem */
public final class C135696sc {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135696sc) {
                C135696sc r8 = (C135696sc) obj;
                if (!(this.A00 == r8.A00 && this.A02 == r8.A02 && this.A01 == r8.A01 && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A03, AnonymousClass001.A0K(this.A01, AnonymousClass001.A0K(this.A02, AnonymousClass000.A0I(this.A00) * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OutOfOrderMessageCount(outOfOrderCount=");
        A10.append(this.A00);
        A10.append(", totalCountForMessageType=");
        A10.append(this.A02);
        A10.append(", outOfOrderCountInGroupChats=");
        A10.append(this.A01);
        A10.append(", totalCountForMessageTypeInGroupChats=");
        return C17900vP.A0E(A10, this.A03);
    }
}
