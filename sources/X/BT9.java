package X;

public final class BT9 extends C3J {
    public C18090vk A00;
    public C18090vk A01;
    public boolean A02;
    public boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BT9) {
                BT9 bt9 = (BT9) obj;
                if (this.A02 != bt9.A02 || this.A03 != bt9.A03 || !C18070vi.A18(this.A00, bt9.A00) || !C18070vi.A18(this.A01, bt9.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, BE6.A06((AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A03) + 10) * 31 * 31, AnonymousClass001.A0k(this.A00)));
    }
}
