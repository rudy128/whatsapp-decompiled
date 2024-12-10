package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;

public class A9X implements DialogInterface.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public A9X(Object obj, Object obj2, int i, long j) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            C20828Aa6 aa6 = (C20828Aa6) this.A02;
            long j = this.A01;
            AnonymousClass1LU r1 = aa6.A0K;
            Intent A06 = AnonymousClass3MY.A06(aa6.A01, r1, (AnonymousClass1BI) this.A03);
            A06.putExtra("extra_quoted_message_row_id", j);
            aa6.A01.startActivity(A06);
            return;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this.A02;
        long j2 = this.A01;
        Intent A062 = AnonymousClass3MY.A06(brazilOrderDetailsActivity, brazilOrderDetailsActivity.A06, (AnonymousClass1BI) this.A03);
        A062.putExtra("extra_quoted_message_row_id", j2);
        brazilOrderDetailsActivity.startActivity(A062);
    }
}
