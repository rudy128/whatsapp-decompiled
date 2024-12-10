package X;

public final class AM8 implements C107855aj {
    public final C75573hk A00;
    public final AM9 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj) || !(obj instanceof AM8)) {
                return false;
            }
            AM8 am8 = (AM8) obj;
            if (!C18070vi.A18(this.A01, am8.A01) || !C18070vi.A18(this.A00, am8.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public AM8(AM9 am9, String str) {
        this.A01 = am9;
        this.A00 = new C75573hk(str);
    }

    public /* bridge */ /* synthetic */ C108735cD BUq() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ AnonymousClass4E4 BaM() {
        return this.A00;
    }
}
