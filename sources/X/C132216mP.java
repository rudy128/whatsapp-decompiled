package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.6mP  reason: invalid class name and case insensitive filesystem */
public class C132216mP {
    public final C132896np A00;
    public final AnonymousClass1LU A01;
    public final AnonymousClass1QS A02;

    public Intent A00(Activity activity, Bundle bundle, Integer num, String str, ArrayList arrayList, ArrayList arrayList2) {
        Intent A07;
        Class BPI = this.A02.A06().BPI();
        if (BPI != null) {
            A07 = new Intent(activity, BPI);
            if (bundle != null && bundle.containsKey("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId")) {
                A07.putExtra("extra_transaction_id", bundle.getString("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"));
            }
        } else {
            A07 = C109005cf.A07(activity, str, (String) null);
            if (num != null) {
                A07.putExtra("com.whatsapp.support.DescribeProblemActivity.type", num);
            }
            if (arrayList != null) {
                A07.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs", arrayList);
            }
            if (arrayList2 != null) {
                A07.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles", arrayList2);
            }
            if (bundle != null) {
                A07.putExtras(bundle);
                return A07;
            }
        }
        return A07;
    }

    public C132216mP(AnonymousClass1LU r1, AnonymousClass1QS r2, C132896np r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }
}
