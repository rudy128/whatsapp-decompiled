package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.7LY  reason: invalid class name */
public class AnonymousClass7LY implements BDP {
    public final C136576u2 A00;

    public void BcI(C195319t9 r10, String str, Map map) {
        String A1H;
        C136576u2 r6 = this.A00;
        if (!r6.A01()) {
            A1H = "banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification as we cannot fetch or submit an appeal just yet";
        } else {
            String A002 = C124286Xt.A00(C17880vN.A0r(C17890vO.A0B(r6.A07.A06), "support_ban_appeal_state"));
            if (!"IN_REVIEW".equals(A002)) {
                A1H = AnonymousClass001.A1H("banmanager/checkIfNeedToPostBanAppealDecisionNotification not showing ban appeals notification since ban appeal state=", A002, AnonymousClass000.A10());
            } else {
                Log.i("banmanager/checkIfNeedToPostBanAppealDecisionNotification showing ban appeals notification");
                Context context = r6.A02.A00;
                String string = context.getString(2131893007);
                String string2 = context.getString(2131893005);
                String A0j = C72473Md.A0j(context, string, 2131893006);
                Intent A0A = C17880vN.A0A();
                A0A.setClassName(context.getPackageName(), "com.whatsapp.userban.ui.BanAppealActivity");
                A0A.putExtra("launch_source", 4);
                C1409673t A03 = C217217d.A03(context);
                A03.A0M = "critical_app_alerts@1";
                A03.A03 = 1;
                A03.A0F(A0j);
                A03.A06(3);
                C17890vO.A0m(A03, string, string2, true);
                C17900vP.A0L(A03, string2);
                A03.A0A = C17880vN.A07(context, A0A, 0);
                C17880vN.A1G(A03);
                r6.A03.BkR(42, A03.A05());
                return;
            }
        }
        Log.w(A1H);
    }

    public boolean CLz(C180619Ng r2, Long l, String str) {
        return "ban_appeals".equals(str);
    }

    public AnonymousClass7LY(C136576u2 r1) {
        this.A00 = r1;
    }
}
