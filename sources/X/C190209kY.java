package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.9kY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C190209kY {
    public final /* synthetic */ C194839sN A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public final void A00(AnonymousClass8pK r21, A7B a7b, ArrayList arrayList, boolean z, boolean z2) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        C194839sN r14 = this.A00;
        A7B a7b2 = a7b;
        if (a7b == null) {
            AnonymousClass8pK r15 = r21;
            if (z2) {
                AnonymousClass11P r5 = brazilPayBloksActivity.A05;
                AnonymousClass1KB r3 = brazilPayBloksActivity.A05;
                AnonymousClass11S r4 = brazilPayBloksActivity.A02;
                AnonymousClass1OZ A0U = C17880vN.A0U(brazilPayBloksActivity.A0O);
                AnonymousClass1QS r11 = brazilPayBloksActivity.A0D;
                new A0N(brazilPayBloksActivity, r3, r4, r5, brazilPayBloksActivity.A02, A0U, brazilPayBloksActivity.A07, AnonymousClass8BU.A0P(brazilPayBloksActivity), brazilPayBloksActivity.A0A, r11, new AY2(r14, brazilPayBloksActivity, 1), brazilPayBloksActivity.A0L).A01(r15);
            } else {
                BrazilPayBloksActivity.A0t(r14, r15, brazilPayBloksActivity, (String) null, arrayList, z);
            }
        } else {
            AnonymousClass91q.A0q(r14, (Map) null, a7b2.A00);
        }
        brazilPayBloksActivity.A0B.A02 = false;
    }

    public /* synthetic */ C190209kY(C194839sN r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }
}
