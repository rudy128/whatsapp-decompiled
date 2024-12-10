package X;

import com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl;

/* renamed from: X.8uZ  reason: invalid class name and case insensitive filesystem */
public final class C173128uZ extends AnonymousClass2SE {
    public final AnonymousClass11P A00;
    public final AnonymousClass126 A01;

    public C173128uZ(AnonymousClass11P r1, AnonymousClass126 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public Class A00() {
        return NotificationGroupPropertyUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationGroupPropertyUpdate";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        r4 = java.lang.Long.parseLong(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C172768tz r13) {
        /*
            r12 = this;
            X.A8k r2 = X.C199129zU.A00(r13)
            java.lang.String r1 = "xwa2_notify_group_on_prop_change"
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange> r0 = com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.class
            X.A8k r4 = r2.A09(r0, r1)
            X.C18070vi.A0X(r4)
            java.lang.String r3 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties> r2 = com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.Properties.class
            X.A8k r0 = r4.A09(r2, r3)
            if (r0 == 0) goto L_0x008b
            org.json.JSONObject r0 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r0)
            r0 = 700555404(0x29c1a08c, float:8.598772E-14)
            if (r1 != r0) goto L_0x008b
            X.A8k r0 = r4.A09(r2, r3)
            if (r0 == 0) goto L_0x008b
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 700555404(0x29c1a08c, float:8.598772E-14)
            if (r1 != r0) goto L_0x008b
            com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunityProperties r1 = new com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunityProperties
            r1.<init>(r2)
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            boolean r11 = r1.A0G(r0)
            X.1yz r1 = X.AnonymousClass1EC.A01
            java.lang.String r3 = "id"
            org.json.JSONObject r0 = r4.A00
            java.lang.String r0 = r0.optString(r3)
            X.1EC r7 = r1.A02(r0)
            if (r7 == 0) goto L_0x008b
            X.126 r6 = r12.A01
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r1 = "updated_by"
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$UpdatedBy> r0 = com.whatsapp.infra.graphql.generated.group.NotificationGroupPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.UpdatedBy.class
            X.A8k r0 = r4.A09(r0, r1)
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r0.A0F(r3)
        L_0x0062:
            com.whatsapp.jid.UserJid r8 = r2.A04(r0)
            java.lang.String r0 = "update_time"
            java.lang.String r0 = r4.A0F(r0)
            if (r0 == 0) goto L_0x007e
            long r4 = java.lang.Long.parseLong(r0)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            if (r3 == 0) goto L_0x007e
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0084
        L_0x007e:
            X.11P r0 = r12.A00
            java.lang.Long r3 = X.AnonymousClass8BU.A0l(r0)
        L_0x0084:
            long r9 = r3.longValue()
            r6.A0b(r7, r8, r9, r11)
        L_0x008b:
            return
        L_0x008c:
            r0 = 0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173128uZ.A02(X.8tz):void");
    }
}
