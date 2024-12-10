package X;

import android.text.TextUtils;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;

/* renamed from: X.9lS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190749lS {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ String A02;

    public final void A00(AnonymousClass8pK r7, A7B a7b) {
        int i;
        int i2;
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C194839sN r5 = this.A00;
        String str = this.A02;
        if (a7b != null || r7 == null) {
            HashMap A11 = C17880vN.A11();
            A11.put("remaining_validates", String.valueOf(1));
            AnonymousClass11P r1 = brazilPayBloksActivity.A05;
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            } else {
                i = 60;
            }
            A11.put("next_resend_ts", String.valueOf((long) Math.ceil(((double) (AnonymousClass11P.A01(r1) + ((long) (i * 1000)))) / 1000.0d)));
            if (a7b != null) {
                i2 = a7b.A00;
            } else {
                i2 = 0;
            }
            AnonymousClass91q.A0q(r5, A11, i2);
            return;
        }
        r5.A00("on_success");
    }

    public /* synthetic */ C190749lS(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
        this.A02 = str;
    }
}
