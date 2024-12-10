package X;

/* renamed from: X.8R2  reason: invalid class name */
public final class AnonymousClass8R2 extends C180989Os {
    public final C180969Oq A00;
    public final AnonymousClass9IO A01;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof C180989Os)) {
                return false;
            }
            AnonymousClass9IO r1 = this.A01;
            AnonymousClass8R2 r4 = (AnonymousClass8R2) ((C180989Os) obj);
            AnonymousClass9IO r0 = r4.A01;
            if (r1 == null) {
                if (r0 != null) {
                    return false;
                }
            } else if (!r1.equals(r0)) {
                return false;
            }
            C180969Oq r12 = this.A00;
            C180969Oq r02 = r4.A00;
            return r12 == null ? r02 == null : r12.equals(r02);
        }
    }

    public AnonymousClass8R2(C180969Oq r1, AnonymousClass9IO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int hashCode() {
        return ((1000003 ^ AnonymousClass001.A0k(this.A01)) * 1000003) ^ C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ClientInfo{clientType=");
        A10.append(this.A01);
        A10.append(", androidClientInfo=");
        return AnonymousClass8BX.A0d(this.A00, A10);
    }
}
