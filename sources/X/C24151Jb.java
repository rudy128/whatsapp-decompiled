package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: X.1Jb  reason: invalid class name and case insensitive filesystem */
public class C24151Jb extends C005302h {
    public /* bridge */ /* synthetic */ Intent A03(Context context, Object obj) {
        Bundle bundleExtra;
        AnonymousClass0RL r7 = (AnonymousClass0RL) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = r7.A02;
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                r7 = new AnonymousClass0RL((Intent) null, r7.A03, r7.A00, r7.A01);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r7);
        if (AnonymousClass1GP.A0G(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("CreateIntent created the following intent: ");
            sb.append(intent);
            Log.v("FragmentManager", sb.toString());
        }
        return intent;
    }

    public /* bridge */ /* synthetic */ Object A05(Intent intent, int i) {
        return new C005702m(i, intent);
    }
}
