package X;

/* renamed from: X.8iC  reason: invalid class name and case insensitive filesystem */
public final class C168048iC extends C182879Wb {
    public final C195679tj A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C168048iC(C195679tj r2, String str, String str2, String str3, String str4, boolean z) {
        super(3);
        this.A05 = z;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = r2;
        this.A02 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C168048iC) {
                C168048iC r5 = (C168048iC) obj;
                if (this.A05 != r5.A05 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass3MX.A03(this.A05) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A01)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PriceDetailsDisplayItem(sentCartUseCase=");
        A10.append(this.A05);
        A10.append(", subTotal=");
        A10.append(this.A04);
        A10.append(", productDiscount=");
        A10.append(this.A03);
        A10.append(", couponDiscount=");
        A10.append(this.A01);
        A10.append(", appliedPromotion=");
        A10.append(this.A00);
        A10.append(", estimatedTotal=");
        return C17900vP.A0B(this.A02, A10);
    }
}
