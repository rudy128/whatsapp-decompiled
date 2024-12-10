package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import java.util.Map;

/* renamed from: X.7LZ  reason: invalid class name */
public final class AnonymousClass7LZ implements BDP {
    public final AnonymousClass00H A00;

    public AnonymousClass7LZ(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BcI(C195319t9 r20, String str, Map map) {
        Map map2 = map;
        C18070vi.A0d(map2, 1);
        C31081ez.A02("WfacBanIncomingPushObserver/handleIncomingPushMessage");
        Object obj = map2.get("push_payload");
        if (obj != null && (obj instanceof C1774798t)) {
            C1774798t r2 = (C1774798t) obj;
            if (C18070vi.A18(r2.A00, "wfac_ban")) {
                C139336yf r8 = (C139336yf) this.A00.get();
                String str2 = r2.A02;
                AnonymousClass00H r6 = r8.A09;
                ((C133456om) r6.get()).A01("ban_decision_received", -1, 4);
                C133456om r22 = (C133456om) r6.get();
                String str3 = "banned";
                if (!C18070vi.A18(str2, str3)) {
                    str3 = "unbanned";
                    if (!C18070vi.A18(str2, str3)) {
                        str3 = "other";
                    }
                }
                r22.A00(str3, -1, 4);
                String A002 = ((C132556n0) r8.A08.get()).A00();
                boolean equals = "CHECKPOINTED".equals(A002);
                StringBuilder A10 = AnonymousClass000.A10();
                if (!equals) {
                    C31081ez.A02(AnonymousClass001.A1H("WfacManager/maybePostBanDecisionNotification not showing ban decision notification since ban state = ", A002, A10));
                    return;
                }
                A10.append("WfacManager/maybePostBanDecisionNotification showing underage ban notification for decision [");
                A10.append(str2);
                C31081ez.A02(C17890vO.A0c(A10, ']'));
                Context A0E = C108945cZ.A0E(r8.A02);
                String A0F = C18070vi.A0F(A0E, 2131898549);
                String A0F2 = C18070vi.A0F(A0E, 2131898547);
                String A102 = AnonymousClass3Ma.A10(A0E, A0F, AnonymousClass3MW.A1a(), 0, 2131898548);
                Intent A003 = C139336yf.A00(A0E, (String) null, (String) null, str2, 59, -1, 4);
                C1409673t A03 = C217217d.A03(A0E);
                A03.A0M = "critical_app_alerts@1";
                A03.A03 = 1;
                A03.A0F(A102);
                A03.A06(3);
                C17890vO.A0m(A03, A0F, A0F2, true);
                C17900vP.A0L(A03, A0F2);
                A03.A0A = C17880vN.A07(A0E, A003, 0);
                C17880vN.A1G(A03);
                C27301Vn r23 = r8.A03;
                Notification A05 = A03.A05();
                C18070vi.A0X(A05);
                r23.BkR(76, A05);
                ((C133456om) r6.get()).A01("notification_shown", -1, 4);
            }
        }
    }

    public boolean CLz(C180619Ng r3, Long l, String str) {
        C31081ez.A02("WfacBanIncomingPushObserver/shouldHandlePush");
        if (r3 == null || !C18070vi.A18(r3.A00(), "wfac_ban")) {
            return false;
        }
        return true;
    }
}
