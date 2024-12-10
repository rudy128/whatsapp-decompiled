package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.9oS  reason: invalid class name and case insensitive filesystem */
public class C192479oS {
    public final AnonymousClass1QJ A00;
    public final AnonymousClass1QO A01;
    public final AnonymousClass1QS A02;

    public Intent A00(Context context, C20279AEn aEn, AnonymousClass205 r6, String str, String str2, String str3) {
        BD1 A06;
        AnonymousClass1QO r1 = this.A01;
        if (!r1.A02() || !r1.A0M(str)) {
            A06 = this.A02.A06();
        } else {
            A06 = this.A02.A05("P2M_LITE");
        }
        if (A06 != null) {
            Class BWx = A06.BWx();
            if (BWx == null) {
                Log.e("PAY: PaymentIntents/getTransactionDetailsIntent -> transactionDetailClass is null");
            } else {
                Intent A07 = AnonymousClass8BR.A07(context, BWx);
                if (str2 != null) {
                    A07.putExtra("extra_transaction_id", str2);
                }
                if (r6 != null) {
                    AnonymousClass1R2.A0E(A07, r6);
                }
                if (aEn != null && !TextUtils.isEmpty(aEn.A06)) {
                    A07.putExtra("extra_payment_receipt_type", "non_native");
                }
                if (str3 != null) {
                    AnonymousClass8BR.A1D(A07, str3);
                }
                A07.setFlags(603979776);
                return A07;
            }
        }
        return null;
    }

    public void A01(Intent intent) {
        AnonymousClass1KJ A012 = this.A00.A01();
        if (A012 != null) {
            AnonymousClass1KL r2 = (AnonymousClass1KL) A012;
            intent.putExtra("extra_payment_preset_min_amount", r2.A05.A00.toString());
            intent.putExtra("extra_payment_preset_max_amount", r2.A00.A00.toString());
        }
    }

    public C192479oS(AnonymousClass1QJ r1, AnonymousClass1QO r2, AnonymousClass1QS r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
