package X;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6Bq  reason: invalid class name and case insensitive filesystem */
public final class C120096Bq extends C195919u9 implements BE0 {
    public AnonymousClass11P A00;
    public C188069gp A01;
    public C128636gR A02;
    public final C125226aj A03;
    public final AnonymousClass118 A04;

    public void BCf(String str) {
        C18070vi.A0d(str, 0);
        this.A02 = new C128636gR(this, (A2V) this.A03.A00.A00.AB2.get(), str);
    }

    public void A05() {
        C128636gR r2 = this.A02;
        if (r2 == null) {
            C18070vi.A11("activityResultManager");
            throw null;
        } else {
            r2.A01.A02(r2.A02).A04(r2);
        }
    }

    public void A06(C195639tf r8, BBM bbm, C19980A1q a1q, Map map) {
        C19760yx A002;
        if ((map.containsKey("app_to_app_partner_app_package") || map.containsKey("app_to_app_partner_intent_action")) && (A002 = C196809vg.A00(C17880vN.A0s("app_to_app_partner_app_package", map), C17880vN.A0s("app_to_app_partner_intent_action", map))) != null) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("app_to_app_partner_app_package", A002.A00);
            hashMap.put("app_to_app_partner_intent_action", A002.A01);
            map = hashMap;
        }
        Intent A0G = C108945cZ.A0G("com.whatsapp.payments.phoenix.action.launch_activity_for_phoenix_result");
        Context context = this.A04.A00;
        A0G.setPackage(context.getPackageName());
        A0G.putExtra("app_to_app_partner_app_package", C17880vN.A0s("app_to_app_partner_app_package", map));
        A0G.putExtra("app_to_app_partner_intent_action", C17880vN.A0s("app_to_app_partner_intent_action", map));
        A0G.putExtra("app_to_app_request_payload", C17880vN.A0s("app_to_app_request_payload", map));
        context.sendBroadcast(A0G);
        bbm.C7V((Map) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120096Bq(C125226aj r1, AnonymousClass118 r2, C176198zw r3) {
        super(r3);
        C18070vi.A0o(r2, r1, r3);
        this.A04 = r2;
        this.A03 = r1;
    }

    public String A03() {
        return "br_verify_card_deeplink";
    }

    public void A04() {
        super.A04();
        C128636gR r3 = this.A02;
        if (r3 == null) {
            C18070vi.A11("activityResultManager");
            throw null;
        } else {
            AnonymousClass7NI.A00(r3.A01.A02(r3.A02), AnonymousClass7NT.class, r3, 2);
        }
    }
}
