package X;

import android.content.Context;
import com.whatsapp.util.Log;

/* renamed from: X.4Pu  reason: invalid class name and case insensitive filesystem */
public final class C86004Pu {
    public final C18100vl A00;

    public C86004Pu(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = AnonymousClass1DF.A01(new AnonymousClass5LV(r2));
    }

    public final void A00(C108575bv r3) {
        if (r3 != null) {
            r3.setBadgeIcon(C24261Jm.A00((Context) this.A00.getValue(), 2131232291));
        } else {
            Log.e("SettingsBadgeUtils/showBadge cannot find component view");
        }
    }
}
