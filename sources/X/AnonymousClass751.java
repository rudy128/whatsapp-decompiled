package X;

import android.content.DialogInterface;
import com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity;

/* renamed from: X.751  reason: invalid class name */
public class AnonymousClass751 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AnonymousClass751(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        if (this.A00 != 0) {
            String str = this.A03;
            C126776dH r1 = (C126776dH) this.A01;
            C128066fO r4 = (C128066fO) this.A02;
            C18070vi.A0d(r4, 2);
            if (C18070vi.A18(str, "F")) {
                z = r1.A00.A00().A00;
            } else if (C18070vi.A18(str, "I")) {
                z = r1.A00.A00().A01;
            } else {
                C31081ez.A01("AutoCrosspostSettingChangeDialogHelper/ondismissListener: invalid destination app");
                C17960vV.A0F(false, "AutoCrosspostSettingChangeDialogHelper/ondismissListener: invalid app");
                z = false;
            }
            C115575vO.A00(r4.A00.BM3(), r4.A01, C18070vi.A0M(Boolean.valueOf(z)));
            return;
        }
        ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = (ThunderstormConnectionsInfoActivity) this.A01;
        String str2 = this.A03;
        C140096zw r2 = (C140096zw) this.A02;
        C108965cb.A0d(thunderstormConnectionsInfoActivity).A06(str2);
        ThunderstormConnectionsInfoActivity.A0V(thunderstormConnectionsInfoActivity, str2);
        if (r2 != null) {
            C108955ca.A1C(thunderstormConnectionsInfoActivity, r2.A03, 2131896890);
            AnonymousClass3MX.A1K(r2.A06, 4);
            thunderstormConnectionsInfoActivity.A4b(r2, str2, false);
        }
    }
}
