package X;

import android.view.View;
import com.whatsapp.interopui.notification.InteropNotifOptInViewModel;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.42C  reason: invalid class name */
public final class AnonymousClass42C extends C74233Za {
    public final InteropNotifOptInViewModel A00;
    public final WDSSwitch A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass42C(View view, InteropNotifOptInViewModel interopNotifOptInViewModel) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = interopNotifOptInViewModel;
        this.A01 = (WDSSwitch) AnonymousClass3MX.A0C(view, 2131431836);
    }

    public void A0B(AnonymousClass4SJ r3, C86884Tl r4) {
        C18070vi.A0d(r4, 0);
        super.A0B(r3, r4);
        WDSSwitch wDSSwitch = this.A01;
        wDSSwitch.setChecked(r4.A00);
        wDSSwitch.setOnCheckedChangeListener(new C90854ek(this, r4, r4));
    }
}
