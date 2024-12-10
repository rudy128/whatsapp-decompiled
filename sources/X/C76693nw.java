package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3nw  reason: invalid class name and case insensitive filesystem */
public class C76693nw extends C34171k3 {
    public final int A00;
    public final Object A01;

    public C76693nw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (r1 == 0) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        if (r2.A0D((com.whatsapp.jid.UserJid) r7, false) != null) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass1BI r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x00fc;
                case 1: goto L_0x00ea;
                case 2: goto L_0x0126;
                case 3: goto L_0x00ad;
                case 4: goto L_0x0069;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            boolean r0 = X.C22971Dz.A0d(r7)
            if (r0 == 0) goto L_0x003d
            java.lang.Object r3 = r6.A01
            X.4SY r3 = (X.AnonymousClass4SY) r3
            X.0ve r1 = r3.A0D
            int r0 = r3.A00
            boolean r0 = X.AnonymousClass4W4.A01(r1, r0)
            if (r0 == 0) goto L_0x003d
            X.1MZ r0 = r3.A0C
            com.whatsapp.jid.GroupJid r1 = r3.A0F
            X.1MW r0 = r0.A08
            X.1MS r0 = r0.A04
            X.2tp r2 = r0.A0A(r1)
            if (r2 == 0) goto L_0x003d
            r1 = r7
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            r0 = 0
            X.2sr r0 = r2.A0D(r1, r0)
            if (r0 == 0) goto L_0x003d
        L_0x0035:
            X.4LE r0 = r3.A09
            X.3rV r0 = r0.A00
            r0.A0C()
        L_0x003c:
            return
        L_0x003d:
            java.lang.Object r3 = r6.A01
            X.4SY r3 = (X.AnonymousClass4SY) r3
            com.whatsapp.jid.GroupJid r0 = r3.A0F
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.0ve r1 = r3.A0D
            int r0 = r3.A00
            boolean r0 = X.AnonymousClass4W4.A00(r1, r0)
            if (r0 == 0) goto L_0x003c
            X.1Rj r0 = r3.A0H
            int r0 = r0.A05(r7)
            if (r0 != 0) goto L_0x0035
            X.0vl r0 = r3.A0I
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            X.AkF r0 = r3.A06
            r1.removeCallbacks(r0)
            return
        L_0x0069:
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            java.lang.Object r4 = r6.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r4 = (com.whatsapp.newsletter.NewsletterInfoActivity) r4
            X.2Dk r3 = com.whatsapp.newsletter.NewsletterInfoActivity.A0y(r4)
            if (r3 == 0) goto L_0x003c
            X.25J r1 = X.C29681ch.A03
            java.lang.String r0 = X.C72453Mb.A0u(r4)
            X.1ch r0 = r1.A01(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003c
            X.4Xk r2 = r4.A0T
            if (r2 == 0) goto L_0x00a9
            java.lang.String r0 = r3.A0R
            if (r0 == 0) goto L_0x0096
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0098
        L_0x0096:
            r0 = 8
        L_0x0098:
            com.whatsapp.chatinfo.view.custom.NewsletterDetailsCard r1 = r2.A02
            r1.setContactChatStatusVisibility(r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = X.C87874Xk.A00(r2, r3)
            r1.setContactChatStatus(r0)
        L_0x00a6:
            r2.A01(r3)
        L_0x00a9:
            com.whatsapp.newsletter.NewsletterInfoActivity.A1P(r4, r5, r5)
            return
        L_0x00ad:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r4 = r6.A01
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel r4 = (com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel) r4
            X.00H r0 = r4.A0I
            java.lang.Object r0 = r0.get()
            X.1Rj r0 = (X.C26241Rj) r0
            boolean r0 = r0.A0E(r7)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.util.Map r1 = r4.A0L
            java.lang.Object r0 = r1.get(r7)
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 != 0) goto L_0x003c
            r1.put(r7, r2)
            java.lang.Integer r1 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x003c
            X.1OX r3 = X.C41561wd.A00(r4)
            X.0wl r2 = r4.A0M
            r1 = 0
            com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1 r0 = new com.whatsapp.conversationslist.ConversationsSuggestedContactsViewModel$updateSuggestionPresence$1
            r0.<init>(r4, r7, r1)
            X.AnonymousClass3MW.A1X(r2, r0, r3)
            return
        L_0x00ea:
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.Object r1 = r6.A01
            X.3hU r1 = (X.C75433hU) r1
            boolean r0 = r1.A0G(r7)
            if (r0 == 0) goto L_0x003c
            r1.A0C()
            return
        L_0x00fc:
            java.lang.Object r2 = r6.A01
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.String r0 = X.C72453Mb.A0u(r2)
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x003c
            boolean r0 = r2.A4r()
            if (r0 != 0) goto L_0x011d
            X.4Xo r1 = r2.A0j
            if (r1 == 0) goto L_0x011d
            X.1E7 r0 = r2.A0z
            r1.A01(r0)
        L_0x011d:
            com.whatsapp.chatinfo.ContactInfoActivity.A17(r2)
            X.4XY r0 = r2.A0e
            r0.A01()
            return
        L_0x0126:
            java.lang.Object r0 = r6.A01
            X.3VQ r0 = (X.AnonymousClass3VQ) r0
            X.AnonymousClass3VQ.A0A(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76693nw.A00(X.1BI):void");
    }

    public void A01(UserJid userJid, String str) {
        if (this.A00 != 0) {
            super.A01(userJid, str);
            return;
        }
        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A01;
        if (ContactInfoActivity.A1M(contactInfoActivity)) {
            C138056wS r5 = (C138056wS) contactInfoActivity.A23.get();
            View view = contactInfoActivity.A00;
            C18070vi.A0d(view, 0);
            if (str != null && str.equals("profile_view")) {
                Context context = view.getContext();
                boolean A08 = ((C35771mm) r5.A01.get()).A08(userJid);
                int i = 2131897674;
                if (A08) {
                    i = 2131897675;
                }
                C23520Bik A02 = C23520Bik.A02(view, context.getString(i), 0);
                A02.A0F(new AnonymousClass789(r5, userJid, 7, A08), 2131897301);
                A02.A08();
            }
        }
        ContactInfoActivity.A1A(contactInfoActivity);
        contactInfoActivity.A0e.A01();
    }
}
