package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl;

/* renamed from: X.41w  reason: invalid class name and case insensitive filesystem */
public final class C820641w extends AnonymousClass2SE {
    public final C26031Qo A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0255, code lost:
        if (r2 != null) goto L_0x01cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0215  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C172768tz r12) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            X.A8k r4 = r12.A00
            java.lang.String r3 = "xwa2_notify_newsletter_on_admin_metadata_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.class
            X.A8k r1 = r4.A09(r2, r3)
            java.lang.String r0 = "id"
            java.lang.String r1 = r1.A0F(r0)
            X.25J r0 = X.C29681ch.A03     // Catch:{ all -> 0x001b }
            X.1ch r8 = X.AnonymousClass25J.A00(r1)     // Catch:{ all -> 0x001b }
            goto L_0x0021
        L_0x001b:
            r0 = move-exception
            X.1IU r8 = new X.1IU
            r8.<init>(r0)
        L_0x0021:
            boolean r0 = r8 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x0026
            r8 = 0
        L_0x0026:
            X.1ch r8 = (X.C29681ch) r8
            if (r8 == 0) goto L_0x0266
            X.A8k r5 = r4.A09(r2, r3)
            X.C18070vi.A0X(r5)
            java.lang.String r1 = "thread_metadata"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.class
            X.A8k r2 = r5.A09(r0, r1)
            if (r2 == 0) goto L_0x0185
            java.lang.String r1 = "geo_states"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.class
            X.1IX r10 = r2.A0A(r0, r1)
            if (r10 == 0) goto L_0x0185
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r10.iterator()
        L_0x004d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.State.class
            X.A8k r2 = r2.A09(r0, r1)
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A0D(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.GEOSUSPENDED
            if (r1 != r0) goto L_0x004d
            r6.add(r3)
            goto L_0x004d
        L_0x0072:
            java.util.ArrayList r9 = X.C29351c6.A0E(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x007a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r2.next()
            X.A8k r0 = (X.C20125A8k) r0
            java.lang.String r1 = "country_code"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r0 = r0.optString(r1)
            r9.add(r0)
            goto L_0x007a
        L_0x0092:
            boolean r0 = X.C17880vN.A1X(r9)
            if (r0 == 0) goto L_0x00e9
            X.00H r0 = r11.A02
            java.lang.Object r6 = r0.get()
            X.4Rh r6 = (X.C86354Rh) r6
            monitor-enter(r6)
            X.4Sq r7 = r6.A00(r8)     // Catch:{ all -> 0x0181 }
            if (r7 == 0) goto L_0x00d9
            java.util.Set r4 = r7.A00     // Catch:{ all -> 0x0181 }
            java.util.ArrayList r3 = X.C29351c6.A0E(r9)     // Catch:{ all -> 0x0181 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0181 }
        L_0x00b1:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ all -> 0x0181 }
            X.4Sp r0 = new X.4Sp     // Catch:{ all -> 0x0181 }
            r0.<init>(r1)     // Catch:{ all -> 0x0181 }
            r3.add(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x00b1
        L_0x00c4:
            java.util.LinkedHashSet r0 = X.C41841x9.A04(r3, r4)     // Catch:{ all -> 0x0181 }
            X.4Sq r1 = new X.4Sq     // Catch:{ all -> 0x0181 }
            r1.<init>(r0)     // Catch:{ all -> 0x0181 }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x0181 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d9
            r6.A01(r8, r1)     // Catch:{ all -> 0x0181 }
            goto L_0x00db
        L_0x00d9:
            monitor-exit(r6)
            goto L_0x00e9
        L_0x00db:
            monitor-exit(r6)
            X.00H r0 = r11.A01
            java.lang.Object r1 = r0.get()
            X.4Rq r1 = (X.C86444Rq) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.A01(r8, r0)
        L_0x00e9:
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r10.iterator()
        L_0x00f1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.A8k r2 = (X.C20125A8k) r2
            java.lang.String r1 = "state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$ThreadMetadata$GeoStates$State> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.ThreadMetadata.GeoStates.State.class
            X.A8k r2 = r2.A09(r0, r1)
            java.lang.String r1 = "type"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A0D(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterStateType.ACTIVE
            if (r1 != r0) goto L_0x00f1
            r6.add(r3)
            goto L_0x00f1
        L_0x0116:
            java.util.ArrayList r9 = X.C29351c6.A0E(r6)
            java.util.Iterator r2 = r6.iterator()
        L_0x011e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0136
            java.lang.Object r0 = r2.next()
            X.A8k r0 = (X.C20125A8k) r0
            java.lang.String r1 = "country_code"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r0 = r0.optString(r1)
            r9.add(r0)
            goto L_0x011e
        L_0x0136:
            boolean r0 = X.C17880vN.A1X(r9)
            if (r0 == 0) goto L_0x0185
            X.00H r0 = r11.A02
            java.lang.Object r6 = r0.get()
            X.4Rh r6 = (X.C86354Rh) r6
            monitor-enter(r6)
            X.4Sq r7 = r6.A00(r8)     // Catch:{ all -> 0x0181 }
            if (r7 == 0) goto L_0x0184
            java.util.Set r4 = r7.A00     // Catch:{ all -> 0x0181 }
            java.util.ArrayList r3 = X.C29351c6.A0E(r9)     // Catch:{ all -> 0x0181 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ all -> 0x0181 }
        L_0x0155:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x0168
            java.lang.String r1 = X.C17880vN.A0v(r2)     // Catch:{ all -> 0x0181 }
            X.4Sp r0 = new X.4Sp     // Catch:{ all -> 0x0181 }
            r0.<init>(r1)     // Catch:{ all -> 0x0181 }
            r3.add(r0)     // Catch:{ all -> 0x0181 }
            goto L_0x0155
        L_0x0168:
            java.util.Set r0 = X.C29431cG.A12(r3)     // Catch:{ all -> 0x0181 }
            java.util.Set r0 = X.C41841x9.A06(r0, r4)     // Catch:{ all -> 0x0181 }
            X.4Sq r1 = new X.4Sq     // Catch:{ all -> 0x0181 }
            r1.<init>(r0)     // Catch:{ all -> 0x0181 }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x0181 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0184
            r6.A01(r8, r1)     // Catch:{ all -> 0x0181 }
            goto L_0x0184
        L_0x0181:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0184:
            monitor-exit(r6)
        L_0x0185:
            java.lang.String r1 = "messages"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.class
            X.A8k r2 = r5.A09(r0, r1)
            if (r2 == 0) goto L_0x0266
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.class
            X.1IX r0 = r2.A0A(r0, r1)
            X.C18070vi.A0X(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x01a6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x025b
            java.lang.Object r2 = r9.next()
            X.A8k r2 = (X.C20125A8k) r2
            if (r2 == 0) goto L_0x0254
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0254
            java.lang.String r1 = "server_id"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r0 = r0.optString(r1)
            if (r0 == 0) goto L_0x0254
            java.lang.Long r3 = X.AnonymousClass1YD.A04(r0)
        L_0x01cc:
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.class
            X.A8k r2 = r2.A09(r0, r1)
            if (r2 == 0) goto L_0x0259
            java.lang.String r1 = "message_delivery_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node$MessageDeliveryUpdate> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.MessageDeliveryUpdate.class
            X.A8k r2 = r2.A09(r0, r1)
            if (r2 == 0) goto L_0x0259
            java.lang.String r1 = "issue"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl$Xwa2NotifyNewsletterOnAdminMetadataUpdate$Messages$Edges$Node$MessageDeliveryUpdate$Issue> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminMetadataUpdateResponseImpl.Xwa2NotifyNewsletterOnAdminMetadataUpdate.Messages.Edges.Node.MessageDeliveryUpdate.Issue.class
            X.A8k r2 = r2.A09(r0, r1)
            if (r2 == 0) goto L_0x0259
            java.lang.String r1 = "code"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r1 = r2.A0D(r0, r1)
        L_0x01f2:
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2MessageDeliveryUpdateIssueCode.NEEDS_REVIEW
            boolean r4 = X.AnonymousClass000.A1Z(r1, r0)
            if (r3 != 0) goto L_0x0215
            if (r4 == 0) goto L_0x0210
            X.3xK r3 = X.C80533xK.A04
            java.lang.String r2 = "add"
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NewsletterAdminMetadataUpdateHandler/reportServerIdMissing Unexpectedly failed to find serverId for message to "
            X.C17900vP.A0e(r0, r2, r1)
            X.1Qo r1 = r11.A00
            r0 = 0
            r1.A00(r3, r0)
            goto L_0x01a6
        L_0x0210:
            X.3xK r3 = X.C80533xK.A05
            java.lang.String r2 = "remove"
            goto L_0x0200
        L_0x0215:
            X.00H r0 = r11.A04
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            long r2 = r3.longValue()
            X.206 r1 = r0.A02(r8, r2)
            r0 = r6
            if (r4 == 0) goto L_0x0229
            r0 = r7
        L_0x0229:
            if (r1 != 0) goto L_0x024f
            if (r4 == 0) goto L_0x024a
            X.3xK r5 = X.C80533xK.A01
            java.lang.String r4 = "add"
        L_0x0231:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NewsletterAdminMetadataUpdateHandler/reportMessageNotFound Unexpectedly failed to find message to "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " for serverId: "
            X.C17900vP.A0l(r0, r1, r2)
            X.1Qo r1 = r11.A00
            r0 = 0
            r1.A00(r5, r0)
            goto L_0x01a6
        L_0x024a:
            X.3xK r5 = X.C80533xK.A02
            java.lang.String r4 = "remove"
            goto L_0x0231
        L_0x024f:
            r0.add(r1)
            goto L_0x01a6
        L_0x0254:
            r3 = 0
            if (r2 == 0) goto L_0x0259
            goto L_0x01cc
        L_0x0259:
            r1 = 0
            goto L_0x01f2
        L_0x025b:
            X.00H r0 = r11.A03
            java.lang.Object r0 = r0.get()
            X.4Qz r0 = (X.C86274Qz) r0
            r0.A00(r8, r7, r6)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C820641w.A02(X.8tz):void");
    }

    public Class A00() {
        return NotificationNewsletterAdminMetadataUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterAdminMetadataUpdate";
    }

    public C820641w(C26031Qo r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A04 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }
}
