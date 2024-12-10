package X;

import android.net.Uri;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: X.6uc  reason: invalid class name and case insensitive filesystem */
public class C136916uc {
    public static Pattern A0E;
    public ContactUsActivity A00;
    public AnonymousClass1BI A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass1KB A04;
    public final AnonymousClass1CJ A05;
    public final C25231Nk A06 = new AnonymousClass7FG(this, 1);
    public final AnonymousClass1NN A07;
    public final AnonymousClass121 A08;
    public final C18030ve A09;
    public final C1607089p A0A = new AnonymousClass7IH(this);
    public final AnonymousClass895 A0B = new AnonymousClass7IJ(this, 0);
    public final AnonymousClass895 A0C = new AnonymousClass7IJ(this, 1);
    public final AnonymousClass10I A0D;

    public void A00() {
        ContactUsActivity contactUsActivity = this.A00;
        C17960vV.A07(contactUsActivity);
        String A0h = C108985cd.A0h(contactUsActivity.A00);
        contactUsActivity.A4b(3);
        contactUsActivity.A0K.A00(contactUsActivity, contactUsActivity.A0B, contactUsActivity.A0G, contactUsActivity.A0U, A0h, contactUsActivity.A0T, contactUsActivity.A0V, AnonymousClass000.A13(), (List) null, true);
    }

    public void A01(int i) {
        AnonymousClass895 r12;
        ContactUsActivity contactUsActivity = this.A00;
        C17960vV.A07(contactUsActivity);
        C17960vV.A07(contactUsActivity);
        int length = A0E.matcher(C108985cd.A0h(contactUsActivity.A00)).replaceAll("").getBytes().length;
        if (this.A03 || length >= 10) {
            this.A00.A01.setVisibility(8);
            ContactUsActivity contactUsActivity2 = this.A00;
            contactUsActivity2.A00.setBackgroundDrawable(C24261Jm.A00(contactUsActivity2, 2131231322));
            ContactUsActivity contactUsActivity3 = this.A00;
            if (i == 1) {
                r12 = this.A0B;
            } else {
                r12 = this.A0C;
            }
            String A0h = C108985cd.A0h(contactUsActivity3.A00);
            AnonymousClass10I r11 = contactUsActivity3.A05;
            String str = contactUsActivity3.A0U;
            String str2 = contactUsActivity3.A0V;
            AnonymousClass6MO r0 = contactUsActivity3.A0E;
            if (r0 != null && r0.A09() == 1) {
                contactUsActivity3.A0E.A0B(false);
            }
            AnonymousClass181 r33 = contactUsActivity3.A04;
            AnonymousClass1K3 r16 = contactUsActivity3.A0N;
            AnonymousClass129 r15 = contactUsActivity3.A0L;
            C18000vb r14 = contactUsActivity3.A06;
            C35551mQ r9 = contactUsActivity3.A0M;
            AnonymousClass1NM r8 = contactUsActivity3.A05;
            AnonymousClass1MB r7 = contactUsActivity3.A0C;
            C19830z4 r6 = contactUsActivity3.A0A;
            C133186oJ r5 = contactUsActivity3.A0K;
            AnonymousClass770 r3 = contactUsActivity3.A0B;
            AnonymousClass1EC r2 = contactUsActivity3.A0G;
            C19830z4 r162 = r6;
            C18000vb r17 = r14;
            AnonymousClass11Z r18 = (AnonymousClass11Z) contactUsActivity3.A0C.get();
            AnonymousClass770 r19 = r3;
            AnonymousClass181 r142 = r33;
            AnonymousClass1NM r152 = r8;
            AnonymousClass6MO r122 = new AnonymousClass6MO(contactUsActivity3, r142, r152, r162, r17, r18, r19, r7, (C35541mP) contactUsActivity3.A0R.get(), r12, r2, r5, r15, r9, r16, str, str2, A0h, (List) null, new Uri[0]);
            contactUsActivity3.A0E = r122;
            C17890vO.A0u(r122, r11);
            return;
        }
        ContactUsActivity contactUsActivity4 = this.A00;
        contactUsActivity4.A00.setBackgroundDrawable(C24261Jm.A00(contactUsActivity4, 2131231320));
        ContactUsActivity contactUsActivity5 = this.A00;
        int i2 = 2131889361;
        if (length == 0) {
            i2 = 2131889360;
        }
        contactUsActivity5.A01.setText(i2);
        this.A00.A01.setVisibility(0);
        ContactUsActivity contactUsActivity6 = this.A00;
        contactUsActivity6.A00.requestFocus();
        contactUsActivity6.A00.announceForAccessibility(contactUsActivity6.getString(2131889361));
    }

    public void A02(String str) {
        ContactUsActivity contactUsActivity = this.A00;
        C17960vV.A07(contactUsActivity);
        contactUsActivity.A44(contactUsActivity.getString(2131896629));
        ContactUsActivity contactUsActivity2 = this.A00;
        String A0h = C108985cd.A0h(contactUsActivity2.A00);
        contactUsActivity2.A0D.A00(this.A0A, A0h, str, false);
    }

    public boolean A03() {
        return this.A00.getIntent().getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from").equals("SupportAi:fallback:email");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r0.A05.A0P(r2) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(boolean r10) {
        /*
            r9 = this;
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r9.A00
            r8 = 1
            if (r0 == 0) goto L_0x00be
            boolean r0 = r9.A02
            if (r0 != 0) goto L_0x00be
            X.0ve r2 = r9.A09
            r1 = 819(0x333, float:1.148E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r2, r1)
            if (r2 == 0) goto L_0x005d
            X.1BI r1 = r9.A01
            if (r1 == 0) goto L_0x005d
            X.1CJ r0 = r9.A05
            boolean r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - opening chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r9.A00
            r0.CEx()
            com.whatsapp.inappsupport.ui.ContactUsActivity r3 = r9.A00
            X.1BI r2 = r9.A01
            X.6uc r0 = r3.A0F
            if (r2 == 0) goto L_0x003c
            X.1CJ r0 = r0.A05
            boolean r0 = r0.A0P(r2)
            r1 = 1
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r1 = 0
        L_0x003d:
            java.lang.String r0 = "Support group to open doesn't exist"
            X.C17960vV.A0F(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactusactivity/tryopensupportchat/exists/"
            X.C17900vP.A0Y(r2, r0, r1)
            X.00H r0 = r3.A0S
            X.1LU r0 = X.C108945cZ.A0h(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r3, r0, r2)
            r3.A3q(r0, r8)
        L_0x0058:
            r9.A02 = r8
        L_0x005a:
            boolean r0 = r9.A02
            return r0
        L_0x005d:
            if (r10 != 0) goto L_0x0065
            if (r2 == 0) goto L_0x0065
            X.1BI r0 = r9.A01
            if (r0 != 0) goto L_0x005a
        L_0x0065:
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog - showing dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog/supportChatJid "
            r1.append(r0)
            X.1BI r0 = r9.A01
            if (r0 != 0) goto L_0x00bb
            java.lang.String r0 = "null"
        L_0x0079:
            X.C17890vO.A1A(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SupportContactUsPresenter/openChatOrShowTicketHaveCreatedDialog/fallbackToInfoDialog "
            X.C17900vP.A0n(r0, r1, r10)
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = r9.A00
            r0.CEx()
            com.whatsapp.inappsupport.ui.ContactUsActivity r7 = r9.A00
            r6 = 0
            r0 = 23
            X.74r r5 = new X.74r
            r5.<init>(r0)
            com.whatsapp.LegacyMessageDialogFragment r4 = new com.whatsapp.LegacyMessageDialogFragment
            r4.<init>()
            r3 = 2131888195(0x7f120843, float:1.9411018E38)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "id"
            r1.putInt(r0, r8)
            java.lang.String r0 = "message_res"
            r1.putInt(r0, r3)
            java.lang.String r0 = "primary_action_text_id_res"
            r1.putInt(r0, r2)
            r4.A00 = r5
            r4.A1R(r1)
            X.AnonymousClass3MY.A1H(r4, r7, r6)
            goto L_0x0058
        L_0x00bb:
            java.lang.String r0 = "not null"
            goto L_0x0079
        L_0x00be:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136916uc.A04(boolean):boolean");
    }

    public C136916uc(AnonymousClass1KB r3, AnonymousClass1CJ r4, AnonymousClass1NN r5, AnonymousClass121 r6, C18030ve r7, ContactUsActivity contactUsActivity, AnonymousClass10I r9) {
        this.A09 = r7;
        this.A04 = r3;
        this.A05 = r4;
        this.A07 = r5;
        this.A00 = contactUsActivity;
        this.A08 = r6;
        this.A0D = r9;
        A0E = Pattern.compile("[^\\p{L}\\p{N}\\p{P}\\p{Z}]");
    }
}
