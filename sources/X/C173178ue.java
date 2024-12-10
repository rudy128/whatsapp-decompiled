package X;

import com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl;

/* renamed from: X.8ue  reason: invalid class name and case insensitive filesystem */
public final class C173178ue extends AnonymousClass2SE {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C173178ue(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public Class A00() {
        return NotificationNewsletterAdminPromoteResponseImpl.class;
    }

    public String A01() {
        return "NotificationNewsletterAdminPromote";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (r7 == X.C179509Ig.OWNER) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C172768tz r14) {
        /*
            r13 = this;
            X.A8k r6 = X.C199129zU.A00(r14)
            java.lang.String r5 = "xwa2_notify_newsletter_admin_promote"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote> r4 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.class
            X.A8k r1 = r6.A09(r4, r5)
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
            if (r8 == 0) goto L_0x00d4
            X.1Dx r7 = com.whatsapp.jid.PhoneUserJid.Companion
            X.A8k r3 = r6.A09(r4, r5)
            r0 = 0
            if (r3 == 0) goto L_0x00d9
            java.lang.String r2 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$User> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.User.class
            X.A8k r2 = r3.A09(r1, r2)
            if (r2 == 0) goto L_0x00d9
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A0F(r1)
        L_0x0040:
            com.whatsapp.jid.PhoneUserJid r9 = r7.A04(r1)
            X.A8k r3 = r6.A09(r4, r5)
            if (r3 == 0) goto L_0x00d7
            java.lang.String r2 = "actor"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl$Xwa2NotifyNewsletterAdminPromote$Actor> r1 = com.whatsapp.infra.graphql.generated.newsletter.NotificationNewsletterAdminPromoteResponseImpl.Xwa2NotifyNewsletterAdminPromote.Actor.class
            X.A8k r2 = r3.A09(r1, r2)
            if (r2 == 0) goto L_0x00d7
            java.lang.String r1 = "pn"
            java.lang.String r1 = r2.A0F(r1)
        L_0x005a:
            com.whatsapp.jid.PhoneUserJid r10 = r7.A04(r1)
            X.00H r1 = r13.A01
            r1.get()
            X.A8k r2 = r6.A09(r4, r5)
            if (r2 == 0) goto L_0x0073
            java.lang.String r1 = "user_new_role"
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r0 = com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.Enum r0 = r2.A0D(r0, r1)
            com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole r0 = (com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2NewsletterRole) r0
        L_0x0073:
            X.9Ig r7 = X.C20131A8r.A02(r0)
            if (r9 == 0) goto L_0x00d4
            X.00H r0 = r13.A00
            java.lang.Object r11 = r0.get()
            X.A6V r11 = (X.A6V) r11
            r12 = 0
            X.A6V.A00(r7, r8, r9, r10, r11, r12)
            X.A6V.A01(r7, r8, r9, r11)
            X.11S r3 = r11.A00
            boolean r0 = r3.A0O(r10)
            r2 = 1
            if (r0 == 0) goto L_0x0096
            X.9Ig r0 = X.C179509Ig.OWNER
            r1 = 1
            if (r7 != r0) goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            boolean r0 = r3.A0O(r9)
            if (r0 == 0) goto L_0x00d5
            X.9Ig r0 = X.C179509Ig.OWNER
            if (r7 != r0) goto L_0x00d5
        L_0x00a1:
            if (r1 != 0) goto L_0x00a5
            if (r2 == 0) goto L_0x00b0
        L_0x00a5:
            X.A2O r0 = r11.A02
            java.lang.Integer r5 = X.AnonymousClass00R.A00
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.A02(r1, r2, r3, r4, r5)
        L_0x00b0:
            X.1kU r0 = r11.A03
            java.lang.String r2 = "newsletter_multi_admin"
            X.1aA r1 = r0.A00
            r0 = 0
            r1.A00(r2, r0)
            X.00H r0 = r11.A05
            java.lang.Object r2 = r0.get()
            X.8yU r2 = (X.C175298yU) r2
            X.00H r0 = r2.A00
            X.11A r0 = X.C17880vN.A0d(r0)
            r6 = 4
            X.7Py r1 = new X.7Py
            r3 = r8
            r4 = r9
            r5 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.A00(r1)
        L_0x00d4:
            return
        L_0x00d5:
            r2 = 0
            goto L_0x00a1
        L_0x00d7:
            r1 = r0
            goto L_0x005a
        L_0x00d9:
            r1 = r0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C173178ue.A02(X.8tz):void");
    }
}
