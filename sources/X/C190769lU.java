package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.9lU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190769lU {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public final void A00(A7B a7b) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        C194839sN r4 = this.A00;
        if (a7b != null) {
            int i = a7b.A01;
            HashMap A11 = C17880vN.A11();
            A11.put("remaining_retries", String.valueOf(i));
            AnonymousClass8BU.A1N(A11, a7b.A00);
            if (i >= 0) {
                A5I A012 = brazilPayBloksActivity.A0D.A01();
                AnonymousClass9YH r6 = new AnonymousClass9YH(i);
                ARG arg = new ARG(A11, r4, 14);
                AnonymousClass10I r7 = A012.A03;
                C17890vO.A0u(new C170258oz(arg, A012.A01, A012.A02, r6, r7, str), r7);
                return;
            }
            r4.A01("on_failure", A11);
            return;
        }
        r4.A00("on_success");
    }

    public /* synthetic */ C190769lU(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }
}
