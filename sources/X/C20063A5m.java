package X;

import com.whatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.A5m  reason: case insensitive filesystem */
public abstract class C20063A5m {
    public static final boolean A01(C20284AEs aEs) {
        AnonymousClass8pS r1;
        C170278pb r12 = null;
        if (aEs != null) {
            r12 = aEs.A08;
        }
        if (!(r12 instanceof AnonymousClass8pS) || (r1 = (AnonymousClass8pS) r12) == null) {
            return false;
        }
        return A03(r1.A0A);
    }

    public static final boolean A02(C20284AEs aEs) {
        AnonymousClass8pS r1;
        C170278pb r12 = null;
        if (aEs != null) {
            r12 = aEs.A08;
        }
        if (!(r12 instanceof AnonymousClass8pS) || (r1 = (AnonymousClass8pS) r12) == null) {
            return false;
        }
        return C18070vi.A18(r1.A0A, "CREDIT");
    }

    public static final boolean A03(String str) {
        if (C18070vi.A18(str, "CREDIT") || C18070vi.A18(str, "CREDIT_LINE")) {
            return true;
        }
        return false;
    }

    public static final void A00(C20284AEs aEs, PaymentMethodRow paymentMethodRow, AnonymousClass4VT r3) {
        AnonymousClass8pW r1;
        String str;
        C18070vi.A0n(aEs, paymentMethodRow, r3);
        C170278pb r12 = aEs.A08;
        if ((r12 instanceof AnonymousClass8pS) && (r1 = (AnonymousClass8pW) r12) != null && (str = r1.A03) != null) {
            r3.A03(paymentMethodRow.A00, str);
        }
    }
}
