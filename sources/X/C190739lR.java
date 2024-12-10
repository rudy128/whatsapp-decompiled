package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9lR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190739lR {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public final void A00(A7B a7b, AnonymousClass8pT r9) {
        int i;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        String str = this.A02;
        C194839sN r4 = this.A00;
        if (a7b == null) {
            HashMap A11 = C17880vN.A11();
            A11.put("remaining_validates", String.valueOf(1));
            AnonymousClass11P r1 = brazilPayBloksActivity.A05;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            } else {
                i = 60;
            }
            A11.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (AnonymousClass11P.A01(r1) + ((long) (i * 1000)))) / 1000.0d)));
            if (r9 != null) {
                A11.put("verified_state", AnonymousClass8BS.A0b(r9.A0a ? 1 : 0));
                brazilPayBloksActivity.A0D.A01().A03(new ARG(A11, r4, 13), r9.A08());
                return;
            }
            r4.A01("on_success", A11);
            return;
        }
        AnonymousClass91q.A0q(r4, (Map) null, a7b.A00);
    }

    public /* synthetic */ C190739lR(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = str;
        this.A00 = r1;
    }
}
