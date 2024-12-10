package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl;

/* renamed from: X.8uc  reason: invalid class name and case insensitive filesystem */
public final class C173158uc extends AnonymousClass2SE {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C173158uc(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public Class A00() {
        return NotificationNewsletterAdminDemoteResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterAdminDemote";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        if (r1.A02 != X.C179509Ig.OWNER) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C172768tz r18) {
        /*
            r17 = this;
            X.A8k r7 = X.C199129zU.A00(r18)
            java.lang.String r6 = "xwa2_notify_newsletter_admin_demote"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote> r5 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.class
            X.A8k r1 = r7.A09(r5, r6)
            java.lang.String r0 = "id"
            java.lang.String r1 = X.C72453Mb.A0z(r1, r0)
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
            if (r8 == 0) goto L_0x00d2
            X.1Dx r4 = com.whatsapp.jid.PhoneUserJid.Companion
            X.A8k r3 = r7.A09(r5, r6)
            r0 = 0
            if (r3 == 0) goto L_0x00d5
            java.lang.String r2 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$User> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.User.class
            X.A8k r2 = r3.A09(r1, r2)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A0F(r1)
        L_0x0040:
            com.whatsapp.jid.PhoneUserJid r9 = r4.A04(r1)
            X.A8k r3 = r7.A09(r5, r6)
            if (r3 == 0) goto L_0x00d3
            java.lang.String r2 = "actor"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl$Xwa2NotifyNewsletterAdminDemote$Actor> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminDemoteResponseImpl.Xwa2NotifyNewsletterAdminDemote.Actor.class
            X.A8k r2 = r3.A09(r1, r2)
            if (r2 == 0) goto L_0x00d3
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A0F(r1)
        L_0x005a:
            com.whatsapp.jid.PhoneUserJid r4 = r4.A04(r1)
            r3 = r17
            X.00H r1 = r3.A01
            r1.get()
            X.A8k r2 = r7.A09(r5, r6)
            if (r2 == 0) goto L_0x0075
            java.lang.String r1 = "user_new_role"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = r2.A0D(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole) r0
        L_0x0075:
            X.9Ig r10 = X.C20131A8r.A02(r0)
            if (r9 == 0) goto L_0x00d2
            X.00H r0 = r3.A00
            java.lang.Object r3 = r0.get()
            X.A6V r3 = (X.A6V) r3
            X.A6V.A01(r10, r8, r9, r3)
            X.9Ig r0 = X.C179509Ig.ADMIN
            if (r10 == r0) goto L_0x00bb
            X.1CJ r0 = r3.A01
            X.1ci r1 = X.AnonymousClass1CJ.A00(r0, r8)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x009f
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x009f
            X.9Ig r1 = r1.A02
            X.9Ig r0 = X.C179509Ig.OWNER
            r2 = 1
            if (r1 == r0) goto L_0x00a0
        L_0x009f:
            r2 = 0
        L_0x00a0:
            X.11S r1 = r3.A00
            boolean r0 = r1.A0O(r4)
            if (r0 != 0) goto L_0x00bb
            if (r2 != 0) goto L_0x00b0
            boolean r0 = r1.A0O(r9)
            if (r0 == 0) goto L_0x00bb
        L_0x00b0:
            X.A2O r11 = r3.A02
            r12 = 0
            java.lang.Integer r16 = X.AnonymousClass00R.A01
            r13 = r8
            r14 = r9
            r15 = r12
            r11.A02(r12, r13, r14, r15, r16)
        L_0x00bb:
            X.00H r0 = r3.A05
            java.lang.Object r7 = r0.get()
            X.8yU r7 = (X.C175298yU) r7
            X.00H r0 = r7.A00
            X.11A r0 = X.C17880vN.A0d(r0)
            r11 = 4
            X.7Py r6 = new X.7Py
            r6.<init>(r7, r8, r9, r10, r11)
            r0.A00(r6)
        L_0x00d2:
            return
        L_0x00d3:
            r1 = r0
            goto L_0x005a
        L_0x00d5:
            r1 = r0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173158uc.A02(X.8tz):void");
    }
}
