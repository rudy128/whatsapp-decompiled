package X;

import com.whatsapp.accountlinking.webauthutil.FxWebAuthLauncherActivity;
import com.whatsapp.accountswitching.routing.AccountSwitchingRoutingActivity;
import com.whatsapp.calling.VoipPermissionsActivity;
import com.whatsapp.gallerypicker.GalleryPickerLauncher;

public class AGB implements AnonymousClass01Q {
    public final int A00;
    public final Object A01;

    public AGB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(AnonymousClass01C r1, int i) {
        r1.A2L(new AGB(r1, i));
    }

    public void Bq7() {
        switch (this.A00) {
            case 5:
                FxWebAuthLauncherActivity fxWebAuthLauncherActivity = (FxWebAuthLauncherActivity) this.A01;
                if (!fxWebAuthLauncherActivity.A02) {
                    fxWebAuthLauncherActivity.A02 = true;
                    fxWebAuthLauncherActivity.A00 = (C20000A2o) ((AnonymousClass1K1) ((C006602x) fxWebAuthLauncherActivity.A2x().generatedComponent())).AAQ.AFK.get();
                    return;
                }
                return;
            case 6:
                AccountSwitchingRoutingActivity accountSwitchingRoutingActivity = (AccountSwitchingRoutingActivity) this.A01;
                if (!accountSwitchingRoutingActivity.A0A) {
                    accountSwitchingRoutingActivity.A0A = true;
                    AnonymousClass10E r2 = ((AnonymousClass1K1) ((C006602x) accountSwitchingRoutingActivity.A2x().generatedComponent())).AAQ;
                    accountSwitchingRoutingActivity.A06 = AnonymousClass8BT.A0g(r2);
                    accountSwitchingRoutingActivity.A07 = C000200d.A00(r2.A09);
                    accountSwitchingRoutingActivity.A08 = C000200d.A00(r2.A0B);
                    accountSwitchingRoutingActivity.A00 = (C31361fR) r2.A1z.get();
                    accountSwitchingRoutingActivity.A04 = (AnonymousClass1CM) r2.A9V.get();
                    accountSwitchingRoutingActivity.A03 = AnonymousClass3MY.A0Z(r2);
                    accountSwitchingRoutingActivity.A01 = AnonymousClass3Ma.A0c(r2);
                    accountSwitchingRoutingActivity.A02 = (AnonymousClass11O) r2.ABn.get();
                    accountSwitchingRoutingActivity.A05 = (AnonymousClass19K) r2.AC4.get();
                    return;
                }
                return;
            case 34:
                VoipPermissionsActivity voipPermissionsActivity = (VoipPermissionsActivity) this.A01;
                if (!voipPermissionsActivity.A0A) {
                    voipPermissionsActivity.A0A = true;
                    AnonymousClass10E r1 = ((AnonymousClass1K1) ((C006602x) voipPermissionsActivity.A2x().generatedComponent())).AAQ;
                    voipPermissionsActivity.A00 = AnonymousClass10E.A12(r1);
                    voipPermissionsActivity.A06 = AnonymousClass3Ma.A0g(r1);
                    voipPermissionsActivity.A07 = AnonymousClass3MZ.A13(r1);
                    voipPermissionsActivity.A01 = AnonymousClass3MZ.A0W(r1);
                    voipPermissionsActivity.A02 = AnonymousClass10E.A4z(r1);
                    voipPermissionsActivity.A04 = (AnonymousClass1TD) r1.A1m.get();
                    voipPermissionsActivity.A03 = AnonymousClass3Ma.A0b(r1);
                    voipPermissionsActivity.A05 = AnonymousClass10E.A8r(r1);
                    voipPermissionsActivity.A08 = C000200d.A00(r1.ABV);
                    return;
                }
                return;
            case 41:
                GalleryPickerLauncher galleryPickerLauncher = (GalleryPickerLauncher) this.A01;
                if (!galleryPickerLauncher.A04) {
                    galleryPickerLauncher.A04 = true;
                    AnonymousClass10E r12 = ((AnonymousClass1K1) ((C006602x) galleryPickerLauncher.A2m().generatedComponent())).AAQ;
                    galleryPickerLauncher.A01 = AnonymousClass10E.A8r(r12);
                    galleryPickerLauncher.A02 = (C27071Up) r12.Ae9.get();
                    galleryPickerLauncher.A00 = AnonymousClass3Ma.A0b(r12);
                    return;
                }
                return;
            default:
                ((AnonymousClass1FN) this.A01).A2y();
                return;
        }
    }
}
