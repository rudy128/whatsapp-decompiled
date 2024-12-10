package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;

/* renamed from: X.0Mv  reason: invalid class name and case insensitive filesystem */
public final class C04350Mv {
    public int A00 = 0;
    public Bundle A01;
    public final Intent A02 = new Intent("android.intent.action.VIEW");
    public final AnonymousClass0DP A03 = new Object();

    public C03180Gx A01() {
        Intent intent = this.A02;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", (IBinder) null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.putExtras(new Bundle());
        Bundle bundle2 = this.A01;
        if (bundle2 != null) {
            intent.putExtras(bundle2);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.A00);
        if (Build.VERSION.SDK_INT >= 24) {
            A00();
        }
        return new C03180Gx(intent);
    }

    private void A00() {
        Bundle bundle;
        String A002 = AnonymousClass0DR.A00();
        if (!TextUtils.isEmpty(A002)) {
            Intent intent = this.A02;
            if (intent.hasExtra("com.android.browser.headers")) {
                bundle = intent.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", A002);
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
    }
}
