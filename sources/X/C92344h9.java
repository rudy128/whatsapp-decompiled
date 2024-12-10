package X;

/* renamed from: X.4h9  reason: invalid class name and case insensitive filesystem */
public final class C92344h9 implements C107855aj {
    public final C75563hj A00;
    public final C92354hA A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj) || !(obj instanceof C92344h9)) {
                return false;
            }
            C92344h9 r4 = (C92344h9) obj;
            if (!C18070vi.A18(this.A01, r4.A01) || !C18070vi.A18(this.A00, r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ C108735cD BUq() {
        return this.A01;
    }

    public /* bridge */ /* synthetic */ AnonymousClass4E4 BaM() {
        return this.A00;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C92344h9(C92354hA r2, int i) {
        this.A01 = r2;
        this.A00 = new C75563hj(i);
    }
}
