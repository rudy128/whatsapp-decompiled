package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl;

/* renamed from: X.8ui  reason: invalid class name and case insensitive filesystem */
public final class C173218ui extends AnonymousClass2SE {
    public final C24751Ln A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(C22078AxI.A00);
    public final AnonymousClass1CJ A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public C173218ui(AnonymousClass1CJ r2, C24751Ln r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        this.A02 = r2;
        this.A00 = r3;
        this.A05 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    public Class A00() {
        return NotificationNewsletterOwnerUpdateResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterOwnerUpdate";
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.1ci] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C172768tz r14) {
        /*
            r13 = this;
            X.A8k r7 = X.C199129zU.A00(r14)
            java.lang.String r6 = "xwa2_notify_newsletter_owner_on_metadata_update"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate> r5 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.class
            X.A8k r0 = r7.A09(r5, r6)
            java.lang.String r12 = "id"
            java.lang.String r1 = X.C72453Mb.A0z(r0, r12)
            X.25J r0 = X.C29681ch.A03     // Catch:{ all -> 0x0019 }
            X.1ch r8 = X.AnonymousClass25J.A00(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x001e
        L_0x0019:
            r0 = move-exception
            X.1IU r8 = X.C108945cZ.A1J(r0)
        L_0x001e:
            boolean r0 = r8 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x0023
            r8 = 0
        L_0x0023:
            X.1ch r8 = (X.C29681ch) r8
            if (r8 == 0) goto L_0x010b
            X.A8k r4 = r7.A09(r5, r6)
            com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate r4 = (com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate) r4
            X.C18070vi.A0X(r4)
            X.A8k r0 = r7.A09(r5, r6)
            java.lang.String r3 = "actor"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$Actor> r2 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.Actor.class
            X.A8k r11 = r0.A09(r2, r3)
            r9 = 0
            if (r11 == 0) goto L_0x0051
            java.lang.String r10 = "pn"
            java.lang.String r0 = r11.A0F(r10)
            if (r0 == 0) goto L_0x0159
            X.1Dx r1 = com.whatsapp.jid.PhoneUserJid.Companion
            java.lang.String r0 = r11.A0F(r10)
            com.whatsapp.jid.PhoneUserJid r9 = r1.A04(r0)
        L_0x0051:
            r10 = 0
            if (r9 == 0) goto L_0x00c0
            X.1CJ r0 = r13.A02
            X.AnonymousClass4aS.A06(r0, r8)
            X.00H r0 = r13.A05
            java.lang.Object r1 = r0.get()
            X.A8r r1 = (X.C20131A8r) r1
            X.AV9 r0 = new X.AV9
            r0.<init>(r4)
            X.2Dk r1 = r1.A0C(r0, r8)
            if (r1 == 0) goto L_0x0152
            X.00H r11 = r13.A03
            java.lang.Object r0 = r11.get()
            X.A6V r0 = (X.A6V) r0
            r0.A03(r1)
            X.A8k r5 = r7.A09(r5, r6)
            java.lang.String r1 = "thread_metadata"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.class
            X.A8k r6 = r5.A09(r0, r1)
            if (r6 != 0) goto L_0x0110
            X.0wS r5 = X.C18460wS.A00
        L_0x0087:
            java.lang.Object r6 = r11.get()
            X.A6V r6 = (X.A6V) r6
            X.1CJ r0 = r6.A01
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r8)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x00c0
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x00c0
            X.9Ig r1 = r1.A02
            X.9Ig r0 = X.C179509Ig.OWNER
            if (r1 != r0) goto L_0x00c0
            X.A2O r6 = r6.A02
            X.9IA r0 = X.AnonymousClass9IA.PROFILE_PICTURE
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x010c
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x00b9
            X.1Lf r1 = r6.A06
            X.AQB r0 = r6.A02
            r1.registerObserver(r0)
            r0 = 1
            r6.A01 = r0
        L_0x00b9:
            X.9ro r0 = new X.9ro
            r0.<init>(r8, r9, r5)
            r6.A00 = r0
        L_0x00c0:
            X.1CJ r0 = r13.A02
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r8)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x00cd
            r10 = r1
            X.2Dk r10 = (X.C46162Dk) r10
        L_0x00cd:
            X.A8k r0 = r4.A09(r2, r3)
            if (r0 != 0) goto L_0x010b
            if (r10 == 0) goto L_0x010b
            boolean r1 = r10.A0P()
            r0 = 1
            if (r1 != r0) goto L_0x010b
            java.lang.String r1 = "thread_metadata"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.class
            X.A8k r2 = r4.A09(r0, r1)
            if (r2 == 0) goto L_0x010b
            java.lang.String r1 = "preview"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Preview> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview.class
            X.A8k r1 = r2.A09(r0, r1)
            if (r1 == 0) goto L_0x010b
            java.lang.String r0 = "direct_path"
            java.lang.String r0 = r1.A0F(r0)
            if (r0 == 0) goto L_0x010b
            int r0 = r0.length()
            if (r0 != 0) goto L_0x010b
            X.00H r0 = r13.A04
            java.lang.Object r1 = r0.get()
            X.4Rq r1 = (X.C86444Rq) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            r1.A01(r8, r0)
        L_0x010b:
            return
        L_0x010c:
            r6.A03(r8, r9, r5)
            goto L_0x00c0
        L_0x0110:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String r1 = "preview"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Preview> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Preview.class
            X.A8k r0 = r6.A09(r0, r1)
            if (r0 == 0) goto L_0x0123
            X.9IA r0 = X.AnonymousClass9IA.PROFILE_PICTURE
            r5.add(r0)
        L_0x0123:
            java.lang.String r1 = "name"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Name> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Name.class
            X.A8k r0 = r6.A09(r0, r1)
            if (r0 == 0) goto L_0x0132
            X.9IA r0 = X.AnonymousClass9IA.NAME
            r5.add(r0)
        L_0x0132:
            java.lang.String r1 = "description"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Description> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Description.class
            X.A8k r0 = r6.A09(r0, r1)
            if (r0 == 0) goto L_0x0141
            X.9IA r0 = X.AnonymousClass9IA.DESCRIPTION
            r5.add(r0)
        L_0x0141:
            java.lang.String r1 = "settings"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl$Xwa2NotifyNewsletterOwnerOnMetadataUpdate$ThreadMetadata$Settings> r0 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterOwnerUpdateResponseImpl.Xwa2NotifyNewsletterOwnerOnMetadataUpdate.ThreadMetadata.Settings.class
            X.A8k r0 = r6.A09(r0, r1)
            if (r0 == 0) goto L_0x0087
            X.9IA r0 = X.AnonymousClass9IA.REACTION_SETTINGS
            r5.add(r0)
            goto L_0x0087
        L_0x0152:
            java.lang.String r0 = "NewsletterNotificationOwnerUpdateHandler/failed to find newsletterInfo"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00c0
        L_0x0159:
            X.0vl r0 = r13.A01
            java.lang.Object r1 = X.AnonymousClass3MX.A14(r0)
            java.util.regex.Pattern r1 = (java.util.regex.Pattern) r1
            java.lang.String r0 = r11.A0F(r12)
            java.util.regex.Matcher r1 = r1.matcher(r0)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            X.1yH r0 = X.AnonymousClass1E2.A01
            X.1E2 r1 = r0.A03(r1)
            if (r1 == 0) goto L_0x0051
            X.1Ln r0 = r13.A00
            com.whatsapp.jid.PhoneUserJid r9 = r0.A0D(r1)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173218ui.A02(X.8tz):void");
    }
}
