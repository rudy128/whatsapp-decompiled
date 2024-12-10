package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.4HY  reason: invalid class name */
public abstract class AnonymousClass4HY {
    public static final void A00(Context context, View view, AnonymousClass1FU r6) {
        C18070vi.A0d(view, 0);
        C18070vi.A0j(context, r6);
        WDSBanner wDSBanner = (WDSBanner) AnonymousClass3MX.A0C(view, 2131434325);
        AnonymousClass4XT r1 = new AnonymousClass4XT();
        r1.A02 = AnonymousClass4A9.A00;
        r1.A01 = 2131894904;
        r1.A03 = AnonymousClass4W6.A00(context, 2131894903);
        r1.A05 = false;
        wDSBanner.setState(r1.A01());
        AnonymousClass3Ma.A1A(wDSBanner, r6, 39);
    }
}
