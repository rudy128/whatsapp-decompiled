package X;

import com.whatsapp.thunderstorm.ThunderstormConnectionsInfoActivity;
import com.whatsapp.thunderstorm.ThunderstormReceiverBottomsheet;
import java.util.Iterator;

/* renamed from: X.6lZ  reason: invalid class name and case insensitive filesystem */
public final class C131726lZ {
    public final /* synthetic */ ThunderstormConnectionsInfoActivity A00;

    public C131726lZ(ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity) {
        this.A00 = thunderstormConnectionsInfoActivity;
    }

    public void A00(String str, int i) {
        int i2;
        Object obj;
        C17900vP.A0i("thunderstorm_logs: ThunderstormConnectionsInfoActivity/ onError error code: ", AnonymousClass000.A10(), i);
        ThunderstormConnectionsInfoActivity thunderstormConnectionsInfoActivity = this.A00;
        if (!thunderstormConnectionsInfoActivity.A0D) {
            thunderstormConnectionsInfoActivity.A0A = C18460wS.A00;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
                i2 = 2131896882;
                break;
            default:
                i2 = 2131896893;
                C108965cb.A0d(thunderstormConnectionsInfoActivity).A06(str);
                ThunderstormConnectionsInfoActivity.A0V(thunderstormConnectionsInfoActivity, str);
                break;
        }
        Iterator it = thunderstormConnectionsInfoActivity.A0K.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (C140096zw.A00(obj, str)) {
                }
            } else {
                obj = null;
            }
        }
        C140096zw r2 = (C140096zw) obj;
        if (r2 != null) {
            C108955ca.A1C(thunderstormConnectionsInfoActivity, r2.A03, i2);
            AnonymousClass3MX.A1K(r2.A06, 4);
            thunderstormConnectionsInfoActivity.A4b(r2, str, false);
            if (!C108965cb.A0d(thunderstormConnectionsInfoActivity).A05) {
                thunderstormConnectionsInfoActivity.A05.CGP(AnonymousClass7RC.A00(thunderstormConnectionsInfoActivity, 14));
            }
        }
        ThunderstormReceiverBottomsheet thunderstormReceiverBottomsheet = thunderstormConnectionsInfoActivity.A03;
        if (thunderstormReceiverBottomsheet != null) {
            thunderstormReceiverBottomsheet.A28();
        }
    }
}
