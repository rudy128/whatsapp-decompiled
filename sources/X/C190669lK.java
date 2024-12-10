package X;

import android.app.Activity;
import android.content.Context;

/* renamed from: X.9lK  reason: invalid class name and case insensitive filesystem */
public class C190669lK {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ C196199uc A01;
    public final /* synthetic */ B8Y A02;

    public C190669lK(Activity activity, C196199uc r2, B8Y b8y) {
        this.A01 = r2;
        this.A00 = activity;
        this.A02 = b8y;
    }

    public void A00(A7B a7b, boolean z) {
        String A0q;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PAY: IndiaUpiBlockListManager/on-error blocked: ");
        A10.append(z);
        C17900vP.A0X(a7b, " error: ", A10);
        C196199uc r2 = this.A01;
        AnonymousClass1KB r5 = r2.A01;
        Activity activity = this.A00;
        r5.A0B((AnonymousClass1FR) activity);
        if (!activity.isFinishing()) {
            Context context = r2.A03.A00;
            if (z) {
                A0q = context.getString(2131887203);
            } else {
                A0q = AnonymousClass8BV.A0q(context, AnonymousClass3MW.A1a(), 2131891337, 0, 2131897291);
            }
            r5.A0L(A0q, 0);
        }
        this.A02.C3f(a7b);
    }
}
