package X;

import android.view.MenuItem;

/* renamed from: X.4co  reason: invalid class name and case insensitive filesystem */
public class C89654co implements MenuItem.OnMenuItemClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C89654co(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0159, code lost:
        r2.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        X.C72463Mc.A11(X.C17880vN.A0D(), r2, r4, "arg_contact_jid");
        X.C20098A7b.A02(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x014d;
                case 1: goto L_0x0137;
                case 2: goto L_0x0125;
                case 3: goto L_0x00d3;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00a4;
                case 6: goto L_0x005b;
                case 7: goto L_0x0005;
                case 8: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A01
            X.4Qy r1 = (X.C86264Qy) r1
            java.lang.Object r4 = r7.A02
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1FY r0 = r1.A00
            X.1GP r3 = r0.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment r2 = new com.whatsapp.newsletter.multiadmin.DismissNewsletterAdminDialogFragment
            r2.<init>()
        L_0x001c:
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "arg_contact_jid"
            X.C72463Mc.A11(r1, r2, r4, r0)
            X.C20098A7b.A02(r2, r3)
        L_0x0028:
            r0 = 1
            return r0
        L_0x002a:
            java.lang.Object r3 = r7.A01
            X.4Qy r3 = (X.C86264Qy) r3
            java.lang.Object r4 = r7.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.1aA r2 = r3.A01
            java.lang.String r1 = "newsletter_multi_admin"
            r0 = 0
            boolean r0 = r2.A01(r0, r1)
            r0 = r0 ^ 1
            X.1FY r1 = r3.A00
            if (r0 == 0) goto L_0x004f
            X.1GP r3 = r1.getSupportFragmentManager()
            com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet r2 = new com.whatsapp.newsletter.multiadmin.NewsletterSendAdminInviteSheet
            r2.<init>()
            goto L_0x001c
        L_0x004f:
            boolean r0 = r1 instanceof com.whatsapp.newsletter.NewsletterInfoActivity
            if (r0 == 0) goto L_0x0028
            com.whatsapp.newsletter.NewsletterInfoActivity r1 = (com.whatsapp.newsletter.NewsletterInfoActivity) r1
            if (r1 == 0) goto L_0x0028
            r1.Bw9(r4)
            goto L_0x0028
        L_0x005b:
            java.lang.Object r1 = r7.A01
            X.4P7 r1 = (X.AnonymousClass4P7) r1
            java.lang.Object r6 = r7.A02
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            com.whatsapp.community.CommunityMembersViewModel r5 = r1.A06
            X.11E r0 = r5.A0A
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x008d
            X.1G4 r4 = r5.A0N
        L_0x0073:
            java.lang.Object r3 = r4.getValue()
            X.5RC r2 = new X.5RC
            r2.<init>(r5)
            X.5Ed r1 = new X.5Ed
            r1.<init>(r5)
            X.3pN r0 = new X.3pN
            r0.<init>(r6, r1, r2)
            boolean r0 = r4.BFK(r3, r0)
            if (r0 == 0) goto L_0x0073
            goto L_0x0028
        L_0x008d:
            X.1G4 r3 = r5.A0N
        L_0x008f:
            java.lang.Object r2 = r3.getValue()
            X.5Ee r1 = new X.5Ee
            r1.<init>(r5)
            X.3pL r0 = new X.3pL
            r0.<init>(r1)
            boolean r0 = r3.BFK(r2, r0)
            if (r0 == 0) goto L_0x008f
            goto L_0x0028
        L_0x00a4:
            java.lang.Object r1 = r7.A01
            X.4P7 r1 = (X.AnonymousClass4P7) r1
            java.lang.Object r2 = r7.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.4XS r0 = r1.A05
            r1 = 0
            X.0vl r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.4VH r0 = (X.AnonymousClass4VH) r0
            r0.A01(r2, r1)
            goto L_0x0028
        L_0x00c0:
            java.lang.Object r2 = r7.A01
            X.4P7 r2 = (X.AnonymousClass4P7) r2
            java.lang.Object r1 = r7.A02
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.4XS r0 = r2.A05
            r0.A01(r1)
            goto L_0x0028
        L_0x00d3:
            java.lang.Object r0 = r7.A01
            X.4P7 r0 = (X.AnonymousClass4P7) r0
            java.lang.Object r6 = r7.A02
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            r1 = 1
            X.4XS r4 = r0.A05
            X.0vl r0 = r4.A04
            java.lang.Object r0 = r0.getValue()
            X.4VH r0 = (X.AnonymousClass4VH) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0028
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "dialog_id"
            r3.putInt(r0, r1)
            X.1FY r2 = r4.A01
            r0 = 2131891838(0x7f12167e, float:1.9418407E38)
            java.lang.String r1 = r2.getString(r0)
            java.lang.String r0 = "title"
            r3.putString(r0, r1)
            r0 = 2131891837(0x7f12167d, float:1.9418405E38)
            java.lang.String r1 = X.C18070vi.A0F(r2, r0)
            java.lang.String r0 = "message"
            r3.putCharSequence(r0, r1)
            java.lang.String r0 = "user_jid"
            X.AnonymousClass3MY.A15(r3, r6, r0)
            X.4Kw r1 = r4.A03
            X.C18070vi.A0d(r1, r5)
            r0 = 2131899286(0x7f123396, float:1.9433514E38)
            X.C72483Me.A0k(r3, r2, r1, r0)
            goto L_0x0028
        L_0x0125:
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r7.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r2, r0, r1)
            goto L_0x0159
        L_0x0137:
            java.lang.Object r1 = r7.A01
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            java.lang.Object r2 = r7.A02
            android.content.Context r2 = (android.content.Context) r2
            X.2lf r0 = r1.A0H
            if (r0 == 0) goto L_0x0028
            X.1LU r0 = new X.1LU
            r0.<init>()
            android.content.Intent r0 = r0.A1u(r2, r1)
            goto L_0x0159
        L_0x014d:
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.A02
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            android.content.Intent r0 = X.AnonymousClass1LU.A1B(r2, r0)
        L_0x0159:
            r2.startActivity(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89654co.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
