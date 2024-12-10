package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.9RS  reason: invalid class name */
public abstract class AnonymousClass9RS {
    public static void A00(Context context, AW0 aw0, BD1 bd1, String str, int i) {
        if (bd1 != null) {
            AnonymousClass1BI r4 = aw0.A0C;
            Intent A07 = AnonymousClass8BR.A07(context, bd1.BWx());
            boolean z = aw0.A0Q;
            String str2 = aw0.A0L;
            if (str2 == null) {
                str2 = "";
            }
            AnonymousClass4aU.A00(A07, AnonymousClass205.A01(r4, str2, z));
            A07.putExtra("extra_transaction_id", aw0.A0K);
            C20128A8n a8n = C20128A8n.$redex_init_class;
            A07.putExtra("extra_transaction_detail_data", new ADI(aw0));
            AnonymousClass8BR.A1D(A07, str);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                A07.putExtra("extra_origin_screen", (String) null);
            }
            A07.putExtra("extra_payment_flow_entry_point", i);
            context.startActivity(A07);
        }
    }
}
