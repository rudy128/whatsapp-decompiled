package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass121;
import X.AnonymousClass129;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass1CJ;
import X.AnonymousClass1DC;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K3;
import X.AnonymousClass1KE;
import X.AnonymousClass1MB;
import X.AnonymousClass1NM;
import X.AnonymousClass1NN;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4FY;
import X.AnonymousClass62I;
import X.AnonymousClass6MN;
import X.AnonymousClass6MO;
import X.AnonymousClass757;
import X.AnonymousClass770;
import X.AnonymousClass88C;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C132216mP;
import X.C132636nD;
import X.C133186oJ;
import X.C136916uc;
import X.C1403871f;
import X.C1411874q;
import X.C1423279a;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C19880zA;
import X.C35551mQ;
import X.C36401np;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;

public class ContactUsActivity extends AnonymousClass1FY implements AnonymousClass88C {
    public EditText A00;
    public TextView A01;
    public C19880zA A02;
    public C132216mP A03;
    public AnonymousClass181 A04;
    public AnonymousClass1NM A05;
    public C18000vb A06;
    public AnonymousClass1CJ A07;
    public AnonymousClass1NN A08;
    public AnonymousClass121 A09;
    public AnonymousClass18K A0A;
    public AnonymousClass770 A0B;
    public AnonymousClass1MB A0C;
    public C132636nD A0D;
    public AnonymousClass6MO A0E;
    public C136916uc A0F;
    public AnonymousClass1EC A0G;
    public AnonymousClass1QO A0H;
    public AnonymousClass1QS A0I;
    public AnonymousClass1KE A0J;
    public C133186oJ A0K;
    public AnonymousClass129 A0L;
    public C35551mQ A0M;
    public AnonymousClass1K3 A0N;
    public C36401np A0O;
    public AnonymousClass1DC A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public C1403871f A0W;
    public boolean A0X;

    public void A3h(int i) {
        if (i == 1) {
            finish();
        }
    }

    public void A2y() {
        if (!this.A0X) {
            this.A0X = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0c(A0A2, r2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A0O = AnonymousClass3MY.A0e(r2);
            this.A04 = C108965cb.A0H(A0A2);
            this.A07 = AnonymousClass3Ma.A0d(A0A2);
            this.A0A = AnonymousClass3Ma.A0g(A0A2);
            this.A0N = AnonymousClass3Ma.A0v(A0A2);
            this.A03 = (C132216mP) r2.A4S.get();
            this.A0L = C108975cc.A0O(A0A2);
            this.A06 = AnonymousClass10E.A6Q(A0A2);
            this.A0I = (AnonymousClass1QS) A0A2.A8J.get();
            this.A0M = (C35551mQ) A0A2.A3C.get();
            this.A05 = (AnonymousClass1NM) A0A2.A6D.get();
            this.A0C = (AnonymousClass1MB) A0A2.AAb.get();
            this.A0K = (C133186oJ) r2.A8E.get();
            this.A0Q = AnonymousClass3MX.A10(A0A2);
            this.A0H = (AnonymousClass1QO) A0A2.A8G.get();
            this.A08 = (AnonymousClass1NN) A0A2.A2q.get();
            this.A0D = (C132636nD) r2.A7p.get();
            this.A0J = A0A2.AKM();
            this.A02 = C19880zA.A01(A0A2.AVe.get());
            this.A0R = C000200d.A00(A0A2.AkJ);
            this.A0P = AnonymousClass3MZ.A13(A0A2);
            this.A09 = (AnonymousClass121) A0A2.A2y.get();
            this.A0S = AnonymousClass3MW.A0s(A0A2);
        }
    }

    public void A4b(int i) {
        AnonymousClass62I r1 = new AnonymousClass62I();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = this.A06.A05();
        this.A0A.CC7(r1);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i != 11) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            if (intent == null) {
                str = null;
            } else if (intent.getIntExtra("com.whatsapp.inappsupport.ui.ContactUsActvity.support_type", 1) == 2) {
                this.A0F.A00();
                return;
            } else {
                str = intent.getStringExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.debug_info");
            }
            this.A0F.A02(str);
        }
    }

    public void onBackPressed() {
        if (!TextUtils.isEmpty(C108985cd.A0h(this.A00))) {
            AnonymousClass3MY.A1H(AnonymousClass4FY.A00(AnonymousClass757.A00(this, 43), new C1411874q(15), (CharSequence) null, new Object[0], (Object[]) null, -1, 2131896628, 2131896626, 2131896627, 0), this, (String) null);
        } else {
            super.onBackPressed();
        }
        ContactUsActivity contactUsActivity = this.A0F.A00;
        C17960vV.A07(contactUsActivity);
        contactUsActivity.A4b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x026b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r12 = r17
            r0 = r18
            super.onCreate(r0)
            X.C72463Mc.A0t(r12)
            X.0ve r11 = r12.A0E
            X.1KB r7 = r12.A05
            X.1CJ r8 = r12.A07
            X.1NN r9 = r12.A08
            X.121 r10 = r12.A09
            X.10I r13 = r12.A05
            X.6uc r6 = new X.6uc
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r12.A0F = r6
            r0 = 2131624695(0x7f0e02f7, float:1.8876577E38)
            r12.setContentView((int) r0)
            r0 = 2131889359(0x7f120ccf, float:1.941338E38)
            java.lang.String r0 = r12.getString(r0)
            r12.setTitle(r0)
            androidx.appcompat.widget.Toolbar r3 = X.AnonymousClass3Ma.A0F(r12)
            X.0vb r2 = r12.A06
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r0)
            android.content.res.Resources r0 = r12.getResources()
            X.3cP r0 = X.AnonymousClass4aX.A0A(r12, r0, r1, r2)
            r3.setNavigationIcon((android.graphics.drawable.Drawable) r0)
            X.6uc r0 = r12.A0F
            boolean r1 = r0.A03()
            r0 = 2131889359(0x7f120ccf, float:1.941338E38)
            if (r1 == 0) goto L_0x0057
            r0 = 2131898821(0x7f1231c5, float:1.943257E38)
        L_0x0057:
            java.lang.String r0 = r12.getString(r0)
            r3.setTitle((java.lang.CharSequence) r0)
            r12.setSupportActionBar(r3)
            r1 = 0
            X.4dI r0 = new X.4dI
            r0.<init>(r12, r1)
            r3.setNavigationOnClickListener(r0)
            X.C137506vZ.A00(r3)
            android.content.Intent r3 = r12.getIntent()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.from"
            java.lang.String r0 = r3.getStringExtra(r0)
            r12.A0U = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid"
            java.lang.String r2 = r3.getStringExtra(r0)
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1EC r0 = r0.A02(r2)
            r12.A0G = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus"
            java.lang.String r0 = r3.getStringExtra(r0)
            r12.A0V = r0
            java.lang.String r0 = r12.A0U
            boolean r0 = X.C197289wS.A00(r0)
            if (r0 == 0) goto L_0x029d
            X.18O r0 = r12.A06
            X.18S r2 = X.AnonymousClass18O.A1X
            java.lang.String r0 = r0.A07(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x029d
            X.18O r0 = r12.A06
            java.lang.String r0 = r0.A07(r2)
        L_0x00ab:
            r12.A0T = r0
            X.11S r0 = r12.A02
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            r4 = 1
            if (r0 == 0) goto L_0x00bf
            X.1CM r0 = r12.A07
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00e3
        L_0x00bf:
            X.190 r5 = r12.A03
            java.lang.String r2 = "Unregistered client opening In App Support"
            r0 = 0
            r5.A0G(r2, r0, r4)
            X.00H r0 = r12.A0S
            r0.get()
            java.lang.String r2 = r12.A0U
            java.lang.String r0 = r12.A0V
            java.lang.String r5 = r12.A0T
            android.content.Intent r2 = X.C109005cf.A07(r12, r2, r0)
            if (r5 == 0) goto L_0x00dd
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.emailAddress"
            r2.putExtra(r0, r5)
        L_0x00dd:
            r12.A3q(r2, r1)
            r12.finish()
        L_0x00e3:
            r0 = 2131429922(0x7f0b0a22, float:1.848153E38)
            android.view.View r0 = r12.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r12.A00 = r0
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.description"
            java.lang.String r2 = r3.getStringExtra(r0)
            if (r2 == 0) goto L_0x0105
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0105
            android.widget.EditText r0 = r12.A00
            r0.setText(r2)
            X.6uc r0 = r12.A0F
            r0.A03 = r4
        L_0x0105:
            r0 = 2131429923(0x7f0b0a23, float:1.8481532E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r12, r0)
            r12.A01 = r0
            r0 = 2131429469(0x7f0b085d, float:1.8480612E38)
            android.view.View r5 = r12.findViewById(r0)
            android.widget.EditText r0 = r12.A00
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            int r0 = r0.length()
            if (r0 >= r4) goto L_0x0122
            r4 = 0
        L_0x0122:
            r5.setEnabled(r4)
            android.widget.EditText r4 = r12.A00
            r2 = 4
            X.6Ih r0 = new X.6Ih
            r0.<init>(r12, r2)
            r4.addTextChangedListener(r0)
            r4 = 1
            X.4dI r0 = new X.4dI
            r0.<init>(r12, r4)
            r5.setOnClickListener(r0)
            X.0ve r5 = r12.A0E
            r2 = 7044(0x1b84, float:9.871E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r0, r5, r2)
            r0 = 2131429775(0x7f0b098f, float:1.8481232E38)
            if (r2 == 0) goto L_0x026b
            android.widget.TextView r2 = X.AnonymousClass3MX.A0L(r12, r0)
            X.6uc r0 = r12.A0F
            boolean r0 = r0.A03()
            int r0 = X.C72453Mb.A01(r0)
            r2.setVisibility(r0)
            X.0zA r0 = r12.A02
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x016b
            r0 = 2131888881(0x7f120af1, float:1.941241E38)
            java.lang.CharSequence r0 = r12.getText(r0)
            r2.setText(r0)
        L_0x016b:
            r0 = 2131429466(0x7f0b085a, float:1.8480606E38)
            X.C72463Mc.A19(r12, r0)
            r0 = 2131434780(0x7f0b1d1c, float:1.8491384E38)
            android.view.View r7 = r12.findViewById(r0)
            r2 = 0
            r7.setVisibility(r1)
            r0 = 2131429468(0x7f0b085c, float:1.848061E38)
            android.view.View r6 = r12.findViewById(r0)
            android.view.ViewTreeObserver r5 = r7.getViewTreeObserver()
            X.4eO r0 = new X.4eO
            r0.<init>(r7, r6, r12, r4)
            r5.addOnPreDrawListener(r0)
            r0 = 2131429776(0x7f0b0990, float:1.8481234E38)
            android.view.View r6 = r12.findViewById(r0)
            com.whatsapp.TextEmojiLabel r6 = (com.whatsapp.TextEmojiLabel) r6
            r6.setVisibility(r1)
            X.0ve r0 = r12.A0E
            X.AnonymousClass3Ma.A1L(r0, r6)
            X.11C r0 = r12.A08
            X.AnonymousClass3Ma.A1K(r6, r0)
            X.6uc r0 = r12.A0F
            boolean r5 = r0.A03()
            r0 = 2131888879(0x7f120aef, float:1.9412406E38)
            if (r5 == 0) goto L_0x01b3
            r0 = 2131888883(0x7f120af3, float:1.9412414E38)
        L_0x01b3:
            X.1np r11 = r12.A0O
            java.lang.String r14 = r12.getString(r0)
            int r16 = X.C72463Mc.A02(r12)
            r0 = 9
            X.7Pd r13 = new X.7Pd
            r13.<init>(r12, r0)
            java.lang.String r15 = "learn-more"
            android.text.SpannableStringBuilder r0 = r11.A06(r12, r13, r14, r15, r16)
            r6.setText(r0)
            r0 = 2131434781(0x7f0b1d1d, float:1.8491386E38)
            android.view.View r5 = r12.findViewById(r0)
            android.widget.EditText r0 = r12.A00
            java.lang.String r0 = X.AnonymousClass3Ma.A12(r0)
            int r0 = r0.length()
            if (r0 < r4) goto L_0x01e1
            r2 = 1
        L_0x01e1:
            r5.setEnabled(r2)
            android.widget.EditText r4 = r12.A00
            r2 = 5
            X.6Ih r0 = new X.6Ih
            r0.<init>(r12, r2)
            r4.addTextChangedListener(r0)
            r0 = 49
            X.C90044dR.A00(r5, r12, r0)
        L_0x01f4:
            X.1QO r0 = r12.A0H
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x02b2
            X.1K3 r2 = r12.A0N
            java.lang.String r0 = "BR"
            boolean r0 = r2.A05(r0)
            if (r0 != 0) goto L_0x0210
            X.1K3 r2 = r12.A0N
            java.lang.String r0 = "IN"
            boolean r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x02b2
        L_0x0210:
            r0 = 2131433690(0x7f0b18da, float:1.8489173E38)
            android.view.View r0 = r12.findViewById(r0)
            r11 = 0
            r0.setVisibility(r1)
            r0 = 2131433691(0x7f0b18db, float:1.8489175E38)
            android.view.View r10 = r12.findViewById(r0)
            com.whatsapp.TextEmojiLabel r10 = (com.whatsapp.TextEmojiLabel) r10
            r0 = 2131888875(0x7f120aeb, float:1.9412398E38)
            java.lang.String r0 = r12.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r9 = X.AnonymousClass3MW.A09(r0)
            int r2 = r9.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r8 = r9.getSpans(r1, r2, r0)
            android.text.style.URLSpan[] r8 = (android.text.style.URLSpan[]) r8
            if (r8 == 0) goto L_0x02a5
            int r7 = r8.length
        L_0x0242:
            if (r11 >= r7) goto L_0x02a5
            r6 = r8[r11]
            int r5 = r9.getSpanStart(r6)
            int r4 = r9.getSpanEnd(r6)
            int r2 = r9.getSpanFlags(r6)
            X.8dB r0 = new X.8dB
            r0.<init>(r12, r12, r12)
            r9.setSpan(r0, r5, r4, r2)
            r1 = 2132083149(0x7f1501cd, float:1.9806432E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r12, r1)
            r9.setSpan(r0, r5, r4, r2)
            r9.removeSpan(r6)
            int r11 = r11 + 1
            goto L_0x0242
        L_0x026b:
            android.view.View r2 = r12.findViewById(r0)
            com.whatsapp.TextEmojiLabel r2 = (com.whatsapp.TextEmojiLabel) r2
            r2.setVisibility(r1)
            X.0ve r0 = r12.A0E
            X.AnonymousClass3Ma.A1L(r0, r2)
            X.11C r0 = r12.A08
            X.AnonymousClass3Ma.A1K(r2, r0)
            r0 = 2131888871(0x7f120ae7, float:1.941239E38)
            X.1np r11 = r12.A0O
            java.lang.String r14 = r12.getString(r0)
            int r16 = X.C72463Mc.A02(r12)
            r0 = 9
            X.7Pd r13 = new X.7Pd
            r13.<init>(r12, r0)
            java.lang.String r15 = "learn-more"
            android.text.SpannableStringBuilder r0 = r11.A06(r12, r13, r14, r15, r16)
            r2.setText(r0)
            goto L_0x01f4
        L_0x029d:
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress"
            java.lang.String r0 = r3.getStringExtra(r0)
            goto L_0x00ab
        L_0x02a5:
            X.0ve r0 = r12.A0E
            X.AnonymousClass3Ma.A1L(r0, r10)
            X.11C r0 = r12.A08
            X.AnonymousClass3Ma.A1K(r10, r0)
            r10.setText(r9)
        L_0x02b2:
            r0 = 2131429468(0x7f0b085c, float:1.848061E38)
            android.view.View r5 = r12.findViewById(r0)
            r0 = 2131429466(0x7f0b085a, float:1.8480606E38)
            android.view.View r4 = r12.findViewById(r0)
            android.view.ViewTreeObserver r2 = r4.getViewTreeObserver()
            r1 = 0
            X.4eO r0 = new X.4eO
            r0.<init>(r4, r5, r12, r1)
            r2.addOnPreDrawListener(r0)
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext"
            android.os.Parcelable r0 = r3.getParcelableExtra(r0)
            X.770 r0 = (X.AnonymousClass770) r0
            r12.A0B = r0
            X.71f r0 = X.C1403871f.A00(r12, r5, r4)
            r12.A0W = r0
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.inappsupport.ui.ContactUsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0F.A03()) {
            return true;
        }
        menu.add(0, 2131432541, 0, getString(2131888872)).setShowAsAction(0);
        return true;
    }

    public void onStop() {
        C136916uc r2 = this.A0F;
        r2.A01 = null;
        r2.A07.unregisterObserver(r2.A06);
        super.onStop();
    }

    public ContactUsActivity(int i) {
        this.A0X = false;
        C1423279a.A00(this, 4);
    }

    public static ArrayList A03(ContactUsActivity contactUsActivity, ArrayList arrayList) {
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putParcelableArrayList((String) null, arrayList);
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(A0D2);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 450000) {
            return A03(contactUsActivity, C17880vN.A10(arrayList.subList(0, arrayList.size() / 2)));
        }
        return arrayList;
    }

    public static void A0Q(ContactUsActivity contactUsActivity) {
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = contactUsActivity.getString(2131888733);
        AnonymousClass3MY.A1H(AnonymousClass4FY.A00(new C1411874q(15), (DialogInterface.OnClickListener) null, (CharSequence) null, A1a, new Object[0], -1, 2131894998, 2131899286, 0, 2131892932), contactUsActivity, (String) null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0W.A02();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0F.A00 = null;
        AnonymousClass6MN r1 = this.A0K.A00;
        if (r1 != null) {
            r1.A0B(false);
        }
        AnonymousClass6MO r12 = this.A0E;
        if (r12 != null) {
            r12.A0B(false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            C136916uc r1 = this.A0F;
            ContactUsActivity contactUsActivity = r1.A00;
            C17960vV.A07(contactUsActivity);
            contactUsActivity.A4b(1);
            r1.A00.finish();
            return true;
        } else if (itemId != 2131432541) {
            return false;
        } else {
            this.A0F.A01(2);
            return true;
        }
    }

    public void onResume() {
        super.onResume();
        this.A00.clearFocus();
    }

    public void C3G(boolean z) {
        finish();
    }

    public ContactUsActivity() {
        this(0);
    }
}
