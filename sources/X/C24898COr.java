package X;

import android.os.Bundle;

/* renamed from: X.COr  reason: case insensitive filesystem */
public abstract class C24898COr {
    public final Bundle A00;
    public final Bundle A01;
    public final CMO A02;

    public C24898COr(Bundle bundle, Bundle bundle2, CMO cmo) {
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = cmo;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
