package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.9iw  reason: invalid class name and case insensitive filesystem */
public final class C189349iw {
    public final C57622jN A00;

    public C189349iw(C57622jN r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00(Context context, C187549fz r7, Map map) {
        String str;
        String A0s;
        String str2 = null;
        if (map == null || (A0s = C17880vN.A0s("wa_open_links_via_in_app_browser", map)) == null) {
            str = null;
        } else {
            str = C108975cc.A0d(A0s);
        }
        boolean A18 = C18070vi.A18(str, "true");
        if (map != null) {
            str2 = C17880vN.A0s("wa_iab_callback_url", map);
        }
        String str3 = r7.A03;
        String str4 = r7.A01;
        if (str3 != null && !AnonymousClass1YF.A0T(str3)) {
            this.A00.A00(context, str3, str2, A18);
        } else if (str4 == null || AnonymousClass1YF.A0T(str4)) {
            Log.i("BaseBannerQP/handleCTA/No valid url present");
        } else {
            this.A00.A00(context, str4, str2, A18);
        }
    }
}
