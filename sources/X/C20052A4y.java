package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.A4y  reason: case insensitive filesystem */
public final class C20052A4y {
    public final AnonymousClass122 A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass11E A03;
    public final AnonymousClass1PM A04;
    public final AnonymousClass118 A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public static final LinkedHashMap A00(String str, String str2) {
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        C72463Mc.A1H("screen", str2, r2);
        C108985cd.A1G("error", C108975cc.A0h("message", str), r2);
        return AnonymousClass1D7.A0B(r2);
    }

    public static final LinkedHashMap A01(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        AnonymousClass8BS.A1E("message_id", map2, linkedHashMap);
        AnonymousClass8BS.A1E("session_id", map2, linkedHashMap);
        AnonymousClass8BS.A1E("extension_id", map2, linkedHashMap);
        AnonymousClass8BS.A1E("is_draft", map2, linkedHashMap);
        AnonymousClass8BS.A1E("business_jid", map2, linkedHashMap);
        AnonymousClass8BS.A1E("flow_token", map2, linkedHashMap);
        AnonymousClass8BS.A1E("user_locale", map2, linkedHashMap);
        AnonymousClass8BS.A1E("flow_message_version", map2, linkedHashMap);
        return linkedHashMap;
    }

    public final String A02() {
        AnonymousClass118 r2 = this.A05;
        int i = 2131890448;
        if (!this.A03.A09()) {
            i = 2131890447;
        }
        return C18070vi.A0G(r2, i);
    }

    public final void A03(String str, String str2, Map map) {
        Object obj;
        String str3;
        Object obj2;
        String str4;
        Object obj3;
        String str5;
        Object obj4;
        String str6;
        Map map2 = map;
        if (map == null) {
            Log.e("logPrivateStatsError() -- Phoenix InitialStateMachineInput is NULL!");
        }
        A25 a25 = (A25) C18070vi.A0E(this.A06);
        if (map != null) {
            obj = map2.get("extension_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        C22941Dw r2 = UserJid.Companion;
        if (map != null) {
            obj2 = map2.get("business_jid");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof String) {
            str4 = (String) obj2;
        } else {
            str4 = null;
        }
        UserJid A042 = r2.A04(str4);
        if (map != null) {
            obj3 = map2.get("message_id");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str5 = (String) obj3;
        } else {
            str5 = null;
        }
        if (map != null) {
            obj4 = map2.get("session_id");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str6 = (String) obj4;
        } else {
            str6 = null;
        }
        a25.A03(this.A04, (A0M) C18070vi.A0E(this.A07), A042, (Boolean) null, "galaxy_message", str3, str5, str6, str, str2);
    }

    public C20052A4y(AnonymousClass11E r1, AnonymousClass1PM r2, AnonymousClass118 r3, AnonymousClass122 r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r3, r1, r5, r4, r6);
        C18070vi.A0q(r7, r2, r8);
        this.A05 = r3;
        this.A03 = r1;
        this.A01 = r5;
        this.A00 = r4;
        this.A02 = r6;
        this.A06 = r7;
        this.A04 = r2;
        this.A07 = r8;
    }
}
