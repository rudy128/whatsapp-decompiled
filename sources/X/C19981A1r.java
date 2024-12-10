package X;

/* renamed from: X.A1r  reason: case insensitive filesystem */
public final class C19981A1r {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19981A1r) {
                C19981A1r a1r = (C19981A1r) obj;
                if (!(this.A02 == a1r.A02 && this.A01 == a1r.A01 && this.A00 == a1r.A00 && this.A03 == a1r.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return C17880vN.A01(((((C72453Mb.A0E(num, A00(num)) * 31) + this.A01) * 31) + this.A00) * 31, this.A03);
    }

    public C19981A1r(Integer num, int i, int i2, boolean z) {
        this.A02 = num;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "REVIEW_AND_PAY";
            case 2:
                return "PAY_NOW";
            case 3:
                return "MORE_OPTIONS_TO_PAY";
            case 4:
                return "PAY_NOW_WITH_PIX";
            case 5:
                return "PAY_RESET";
            case 6:
                return "PAY_COMPLETED";
            case 7:
                return "VIEW_ORDER_DETAILS";
            case 8:
                return "VIEW_PAYMENTS_DETAILS";
            case 9:
                return "VIEW_PAYMENT_HELP_CENTER";
            case 10:
                return "UPDATE_STATUS";
            case 11:
                return "VIEW_DETAILS";
            case 12:
                return "PAY_NOW_WITH_HPP";
            case 13:
                return "PAY_NOW_WITH_PAYMENT_LINK";
            case 14:
                return "PAY_NOW_WITH_PIX_KEY";
            default:
                return "PAY_NOW_WITH_BOLETO";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CheckoutButtonConfiguration(checkoutButtonType=");
        A10.append(A00(this.A02));
        A10.append(", checkoutButtonText=");
        A10.append(this.A01);
        A10.append(", checkoutButtonIcon=");
        A10.append(this.A00);
        A10.append(", isSelected=");
        return C17900vP.A0F(A10, this.A03);
    }
}
