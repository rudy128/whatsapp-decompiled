package X;

/* renamed from: X.34l  reason: invalid class name and case insensitive filesystem */
public final class C687234l implements B5K {
    public long A00;
    public long A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C687234l) {
                C687234l r8 = (C687234l) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0J(this.A00, AnonymousClass000.A0I(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingTbValues(triggredBlockExpirationTs=");
        A10.append(this.A01);
        A10.append(", triggredBlockCooldown=");
        return C17900vP.A0E(A10, this.A00);
    }
}
