package X;

import android.view.View;

/* renamed from: X.95o  reason: invalid class name and case insensitive filesystem */
public final class C1767895o extends C183409Yd {
    public final View.OnClickListener A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1767895o) && C18070vi.A18(this.A00, ((C1767895o) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1767895o(View.OnClickListener onClickListener) {
        super(208);
        this.A00 = onClickListener;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentTransactionSendAgainViewData(sendPaymentAgainOnClickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
