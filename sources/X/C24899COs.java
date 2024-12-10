package X;

import android.os.Bundle;
import java.util.Set;

/* renamed from: X.COs  reason: case insensitive filesystem */
public abstract class C24899COs {
    public final Bundle A00;
    public final Bundle A01;
    public final Set A02;

    public C24899COs(Bundle bundle, Bundle bundle2, Set set) {
        this.A01 = bundle;
        this.A00 = bundle2;
        this.A02 = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", true);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
