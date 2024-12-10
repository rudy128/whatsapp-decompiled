package com.whatsapp.bot.home.sync.discovery;

import X.AnonymousClass1D6;
import X.AnonymousClass20O;
import X.AnonymousClass20Q;
import X.AnonymousClass20R;
import X.AnonymousClass20S;
import X.AnonymousClass9FO;
import X.C18070vi;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class DiscoveryBotsSerializer implements AnonymousClass20O {
    public static final DiscoveryBotsSerializer A00 = new Object();

    public static JSONObject A00(DiscoveryBots discoveryBots) {
        C18070vi.A0d(discoveryBots, 0);
        JSONObject jSONObject = new JSONObject();
        AnonymousClass20Q r4 = discoveryBots.A01;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("jid", r4.A00.getRawString());
        jSONObject2.put("persona_id", r4.A01);
        jSONObject.put("default_bot", jSONObject2);
        jSONObject.put("sections", AnonymousClass20S.A01(AnonymousClass20R.A00, discoveryBots.A02));
        jSONObject.put("timestamp_ms", discoveryBots.A00);
        return jSONObject;
    }

    /* renamed from: A01 */
    public DiscoveryBots BLj(AnonymousClass1D6 r6) {
        AnonymousClass20Q r4;
        C18070vi.A0d(r6, 0);
        AnonymousClass9FO r0 = (AnonymousClass9FO) r6.first;
        C18070vi.A0d(r0, 0);
        UserJid userJid = (UserJid) r0.A00;
        String str = r0.A05;
        if (userJid == null) {
            r4 = null;
        } else {
            r4 = new AnonymousClass20Q(userJid, str);
        }
        AnonymousClass20R r2 = AnonymousClass20R.A00;
        List<Object> list = (List) ((AnonymousClass9FO) r6.first).A03;
        C18070vi.A0d(list, 1);
        ArrayList arrayList = new ArrayList();
        for (Object BLj : list) {
            Object BLj2 = r2.BLj(BLj);
            if (BLj2 != null) {
                arrayList.add(BLj2);
            }
        }
        long longValue = ((Number) r6.second).longValue();
        if (r4 != null) {
            return new DiscoveryBots(r4, arrayList, longValue);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: A02 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.bot.home.sync.discovery.DiscoveryBots BLi(org.json.JSONObject r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0004
            r4 = 0
        L_0x0003:
            return r4
        L_0x0004:
            java.lang.String r0 = "default_bot"
            org.json.JSONObject r2 = r6.optJSONObject(r0)
            if (r2 == 0) goto L_0x0042
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.optString(r0)
            com.whatsapp.jid.UserJid r1 = r1.A04(r0)
            java.lang.String r0 = "persona_id"
            java.lang.String r0 = r2.optString(r0)
            if (r1 == 0) goto L_0x0042
            X.20Q r3 = new X.20Q
            r3.<init>(r1, r0)
        L_0x0025:
            X.20R r1 = X.AnonymousClass20R.A00
            java.lang.String r0 = "sections"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            java.util.List r2 = X.AnonymousClass20S.A00(r1, r0)
            java.lang.String r0 = "timestamp_ms"
            long r0 = r6.optLong(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0003
            com.whatsapp.bot.home.sync.discovery.DiscoveryBots r4 = new com.whatsapp.bot.home.sync.discovery.DiscoveryBots
            r4.<init>(r3, r2, r0)
            return r4
        L_0x0042:
            r3 = 0
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.home.sync.discovery.DiscoveryBotsSerializer.BLi(org.json.JSONObject):com.whatsapp.bot.home.sync.discovery.DiscoveryBots");
    }

    public /* bridge */ /* synthetic */ JSONObject CPN(Object obj) {
        return A00((DiscoveryBots) obj);
    }
}
