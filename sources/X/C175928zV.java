package X;

import android.content.Context;

/* renamed from: X.8zV  reason: invalid class name and case insensitive filesystem */
public class C175928zV extends C175498yo {
    public final /* synthetic */ A0S A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175928zV(Context context, AnonymousClass1KB r13, C33711jG r14, C196259ui r15, A0S a0s, AZ6 az6, AnonymousClass90Z r18, String str, String str2, String str3) {
        super(context, r13, r14, r15, az6, r18, "upi-bind-device", str, 20);
        this.A00 = a0s;
        this.A01 = str2;
        this.A02 = str3;
    }

    private void A02(A7B a7b) {
        A0S a0s = this.A00;
        if (a0s.A01 != null) {
            if (a7b.A00 == 11453) {
                String A03 = a0s.A0H.A03();
                AXS axs = a0s.A0A;
                String str = this.A01;
                String str2 = this.A02;
                axs.A0Q(str, str2, A03);
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A1A(A10, C175498yo.A01("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ", str, str2, A03, A10));
            }
            a0s.A01.BrM(a7b);
        }
    }

    public void A04(A7B a7b) {
        super.A04(a7b);
        C17900vP.A0Y(a7b, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ", AnonymousClass000.A10());
        A02(a7b);
    }

    public void A05(A7B a7b) {
        super.A05(a7b);
        C17900vP.A0Y(a7b, "PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ", AnonymousClass000.A10());
        A02(a7b);
    }

    public void A06(C29621ca r7) {
        super.A06(r7);
        A0S a0s = this.A00;
        String A03 = a0s.A0H.A03();
        AXS axs = a0s.A0A;
        String str = this.A01;
        String str2 = this.A02;
        axs.A0Q(str, str2, A03);
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A1A(A10, C175498yo.A01("PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: ", str, str2, A03, A10));
        BBB bbb = a0s.A01;
        if (bbb != null) {
            bbb.BrM((A7B) null);
        }
    }
}
