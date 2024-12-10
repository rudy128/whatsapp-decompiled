package X;

import android.view.View;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.9PD  reason: invalid class name */
public abstract class AnonymousClass9PD {
    public static void A00(C19830z4 r5, WDSBanner wDSBanner, AnonymousClass00H r7) {
        if (!AnonymousClass8BV.A1S(r7) || C17890vO.A0B(r5).getBoolean("backup_warning_shown", false)) {
            wDSBanner.setVisibility(8);
            return;
        }
        AnonymousClass4XT r2 = new AnonymousClass4XT();
        r2.A02 = new AnonymousClass4AC(new AnonymousClass4AG(2131231717));
        r2.A00 = 2131890681;
        wDSBanner.setState(r2.A01());
        wDSBanner.setVisibility(0);
        wDSBanner.setOnDismissListener((View.OnClickListener) new AnonymousClass78J(wDSBanner, 40));
        C17880vN.A1F(C19830z4.A00(r5), "backup_warning_shown", true);
    }
}
