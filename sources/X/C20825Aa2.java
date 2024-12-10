package X;

import android.content.Intent;
import com.whatsapp.payments.ui.IndiaUpiStepUpActivity;

/* renamed from: X.Aa2  reason: case insensitive filesystem */
public final /* synthetic */ class C20825Aa2 implements B94 {
    public final /* synthetic */ C1764694i A00;
    public final /* synthetic */ String A01;

    public final void BuI(C20284AEs aEs) {
        C1764694i r0 = this.A00;
        String str = this.A01;
        if (aEs != null) {
            AnonymousClass1FY r2 = r0.A05;
            Intent A09 = AnonymousClass8BW.A09(r2, aEs, IndiaUpiStepUpActivity.class);
            A09.putExtra("extra_step_up_id", str);
            r2.startActivity(A09);
            return;
        }
        r0.A03();
    }

    public /* synthetic */ C20825Aa2(C1764694i r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }
}
