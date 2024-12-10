package X;

import com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl;

/* renamed from: X.8uY  reason: invalid class name and case insensitive filesystem */
public final class C173118uY extends AnonymousClass2SE {
    public final AnonymousClass11P A00;
    public final AnonymousClass126 A01;

    public C173118uY(AnonymousClass11P r1, AnonymousClass126 r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public Class A00() {
        return NotificationGroupHiddenPropertyUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationGroupHiddenPropertyUpdate";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        r6 = java.lang.Long.parseLong(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C172768tz r14) {
        /*
            r13 = this;
            X.A8k r2 = X.C199129zU.A00(r14)
            java.lang.String r1 = "xwa2_notify_group_on_prop_change"
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange> r0 = com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.class
            X.A8k r4 = r2.A09(r0, r1)
            X.C18070vi.A0X(r4)
            java.lang.String r6 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties> r5 = com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.Properties.class
            X.A8k r0 = r4.A09(r5, r6)
            if (r0 == 0) goto L_0x006b
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 625600779(0x2549e90b, float:1.7512929E-16)
            if (r1 != r0) goto L_0x006b
            com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunitySubGroupProperties r0 = new com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunitySubGroupProperties
            r0.<init>(r2)
            java.lang.String r3 = "hidden_group"
            org.json.JSONObject r0 = r0.A00
            boolean r0 = r0.isNull(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x006b
            X.A8k r0 = r4.A09(r5, r6)
            r6 = 0
            if (r0 == 0) goto L_0x00eb
            org.json.JSONObject r2 = r0.A00
            int r1 = X.AnonymousClass8BT.A03(r2)
            r0 = 625600779(0x2549e90b, float:1.7512929E-16)
            if (r1 != r0) goto L_0x00eb
            com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunitySubGroupProperties r0 = new com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$Properties$InlineXWA2CommunitySubGroupProperties
            r0.<init>(r2)
            boolean r5 = r0.A0G(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            if (r0 == 0) goto L_0x00eb
            X.1yz r1 = X.AnonymousClass1EC.A01
            java.lang.String r3 = "id"
            org.json.JSONObject r0 = r4.A00
            java.lang.String r0 = r0.optString(r3)
            X.1EC r8 = r1.A02(r0)
            if (r8 != 0) goto L_0x006c
            java.lang.String r0 = "GroupHiddenPropertyUpdateHandler/updateIsHiddenSubgroup/groupJid is null"
        L_0x0068:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x006b:
            return
        L_0x006c:
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r1 = "updated_by"
            java.lang.Class<com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl$Xwa2NotifyGroupOnPropChange$UpdatedBy> r0 = com.whatsapp.infra.graphql.generated.group.NotificationGroupHiddenPropertyUpdateResponseImpl.Xwa2NotifyGroupOnPropChange.UpdatedBy.class
            X.A8k r0 = r4.A09(r0, r1)
            if (r0 == 0) goto L_0x007c
            java.lang.String r6 = r0.A0F(r3)
        L_0x007c:
            com.whatsapp.jid.UserJid r3 = r2.A04(r6)
            java.lang.String r0 = "update_time"
            java.lang.String r0 = r4.A0F(r0)
            if (r0 == 0) goto L_0x0098
            long r6 = java.lang.Long.parseLong(r0)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            if (r4 == 0) goto L_0x0098
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
        L_0x0098:
            X.11P r0 = r13.A00
            java.lang.Long r4 = X.AnonymousClass8BU.A0l(r0)
        L_0x009e:
            long r11 = r4.longValue()
            X.126 r4 = r13.A01
            X.1M9 r1 = r4.A08
            X.1E7 r0 = r1.A0G(r8)
            if (r0 != 0) goto L_0x00b2
            java.lang.String r0 = "groupmgr/onIsHiddenSubgroupChanged/new group"
        L_0x00ae:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00b2:
            boolean r0 = r0.A0n
            if (r0 != r5) goto L_0x00b9
            java.lang.String r0 = "groupmgr/onIsHiddenSubgroupChanged/did not change"
            goto L_0x00ae
        L_0x00b9:
            java.lang.String r0 = "groupmgr/onIsHiddenSubgroupChanged/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.A0d(r8, r5)
            if (r5 == 0) goto L_0x006b
            X.1MZ r0 = r4.A0O
            boolean r0 = r0.A0J(r8)
            if (r0 == 0) goto L_0x006b
            X.0ve r2 = r4.A0U
            r1 = 8530(0x2152, float:1.1953E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x006b
            X.1Uh r2 = r4.A0V
            X.1PQ r6 = r4.A0h
            r10 = 177(0xb1, float:2.48E-43)
            r7 = 0
            r9 = r7
            X.2Mh r1 = r6.A06(r7, r8, r9, r10, r11)
            r1.A0d(r3)
            r0 = 2
            r2.BcH(r1, r0)
            return
        L_0x00eb:
            java.lang.String r0 = "GroupHiddenPropertyUpdateHandler/updateIsHiddenSubgroup/hiddenGroup is null"
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173118uY.A02(X.8tz):void");
    }
}
