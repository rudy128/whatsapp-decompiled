package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.9ka  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190229ka {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public final void A00(AnonymousClass8pK r10, A7B a7b, ArrayList arrayList, boolean z) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C194839sN r3 = this.A00;
        if (a7b == null) {
            BrazilPayBloksActivity.A0t(r3, r10, brazilPayBloksActivity, (String) null, arrayList, z);
            return;
        }
        int i = a7b.A01;
        HashMap A11 = C17880vN.A11();
        if (i >= 0) {
            A11.put("remaining_retries", String.valueOf(i));
        }
        AnonymousClass91q.A0q(r3, A11, a7b.A00);
    }

    public /* synthetic */ C190229ka(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }
}
