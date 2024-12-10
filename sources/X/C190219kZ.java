package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9kZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190219kZ {
    public final /* synthetic */ BrazilPayBloksActivity A00;
    public final /* synthetic */ String A01;

    public final void A00(A7B a7b) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A00;
        String str = this.A01;
        C194839sN r2 = brazilPayBloksActivity.A01;
        if (r2 == null) {
            Log.i("PAY: BrazilPayBloksActivity onActivityResult - appToAppBloksCallback is null!");
        } else if (a7b != null) {
            AnonymousClass91q.A0q(r2, (Map) null, a7b.A00);
        } else {
            HashMap A11 = C17880vN.A11();
            A11.put("app_to_app_authorization_code", str);
            brazilPayBloksActivity.A01.A01("on_success", A11);
        }
    }

    public /* synthetic */ C190219kZ(BrazilPayBloksActivity brazilPayBloksActivity, String str) {
        this.A00 = brazilPayBloksActivity;
        this.A01 = str;
    }
}
