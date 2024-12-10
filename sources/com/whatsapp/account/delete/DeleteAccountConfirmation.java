package com.whatsapp.account.delete;

import X.AGB;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1QO;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.C137116uw;
import X.C17900vP;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C20151A9n;
import X.C20300AFi;
import X.C25011Mn;
import X.C34991lS;
import X.C37241pC;
import X.C47942Ko;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C73203Rj;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.res.Configuration;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class DeleteAccountConfirmation extends AnonymousClass1FY {
    public Handler A00;
    public ScrollView A01;
    public C19880zA A02;
    public WaTextView A03;
    public WaTextView A04;
    public C47942Ko A05;
    public C34991lS A06;
    public AnonymousClass1LU A07;
    public C25011Mn A08;
    public AnonymousClass1QO A09;
    public WDSButton A0A;
    public AnonymousClass00H A0B;
    public int A0C;
    public View A0D;
    public C37241pC A0E;
    public boolean A0F;

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A01;
        if (scrollView == null) {
            C18070vi.A11("scrollView");
            throw null;
        } else {
            scrollView.getViewTreeObserver().addOnPreDrawListener(new C20300AFi(this, 1));
        }
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r3;
        int i2;
        int i3;
        Dialog create;
        if (i != 1) {
            if (i == 2) {
                r3 = AnonymousClass4a6.A00(this);
                r3.A0S(AnonymousClass8BV.A0q(this, new Object[1], 2131888733, 0, 2131894981));
                i2 = 2131899286;
                i3 = 13;
                C20151A9n.A00(r3, this, i3, i2);
                create = r3.create();
            } else if (i != 3) {
                create = super.onCreateDialog(i);
            } else {
                r3 = AnonymousClass4a6.A00(this);
                r3.A0D(2131889257);
                i2 = 2131899286;
                i3 = 14;
                C20151A9n.A00(r3, this, i3, i2);
                create = r3.create();
            }
            C18070vi.A0X(create);
            return create;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        AnonymousClass8BX.A0w(progressDialog, this, 2131898875);
        return progressDialog;
    }

    public static final void A03(DeleteAccountConfirmation deleteAccountConfirmation) {
        String str;
        float f;
        ScrollView scrollView = deleteAccountConfirmation.A01;
        if (scrollView == null) {
            str = "scrollView";
        } else {
            boolean canScrollVertically = scrollView.canScrollVertically(1);
            str = "bottomButtonContainer";
            View view = deleteAccountConfirmation.A0D;
            if (canScrollVertically) {
                if (view != null) {
                    f = (float) deleteAccountConfirmation.A0C;
                }
            } else if (view != null) {
                f = 0.0f;
            }
            view.setElevation(f);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A0B = AnonymousClass8BT.A0g(r2);
            this.A05 = (C47942Ko) r2.A3H.get();
            this.A09 = AnonymousClass3Ma.A0q(r2);
            this.A08 = (C25011Mn) r2.A9o.get();
            this.A02 = C19890zB.A00;
            this.A06 = (C34991lS) r2.A3v.get();
            this.A07 = AnonymousClass3MY.A0Z(r2);
        }
    }

    public DeleteAccountConfirmation(int i) {
        this.A0F = false;
        AGB.A00(this, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c5, code lost:
        if (r0 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c8, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e9, code lost:
        if (X.AnonymousClass8BR.A0z(r7) == null) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f5, code lost:
        if (r0 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.11S r0 = r7.A02
            X.1E2 r0 = r0.A09()
            r3 = 1
            if (r0 != 0) goto L_0x0017
            X.1LU r0 = r7.A07
            if (r0 == 0) goto L_0x0172
            android.content.Intent r0 = X.AnonymousClass1LU.A01(r7)
            r7.A3q(r0, r3)
        L_0x0017:
            X.1CM r1 = r7.A07
            X.C18070vi.A0W(r1)
            X.8Ci r0 = new X.8Ci
            r0.<init>(r7, r1)
            r7.A00 = r0
            r4 = 0
            X.ALu r0 = new X.ALu
            r0.<init>(r7, r4)
            r7.A0E = r0
            r0 = 2131895841(0x7f122621, float:1.9426526E38)
            r7.setTitle(r0)
            X.01n r0 = r7.getSupportActionBar()
            if (r0 == 0) goto L_0x003a
            r0.A0W(r3)
        L_0x003a:
            r0 = 2131625064(0x7f0e0468, float:1.8877325E38)
            r7.setContentView((int) r0)
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r7.A01 = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            r7.A0D = r0
            r0 = 2131429878(0x7f0b09f6, float:1.8481441E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r7.A0A = r0
            r0 = 2131429876(0x7f0b09f4, float:1.8481437E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A04 = r0
            r0 = 2131429873(0x7f0b09f1, float:1.8481431E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r7, r0)
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0
            r7.A03 = r0
            com.whatsapp.wds.components.button.WDSButton r1 = r7.A0A
            if (r1 != 0) goto L_0x0080
            java.lang.String r0 = "deleteAccountSubmitButton"
        L_0x007b:
            X.C18070vi.A11(r0)
        L_0x007e:
            r0 = 0
            throw r0
        L_0x0080:
            r0 = 38
            X.AnonymousClass3MZ.A1N(r1, r7, r0)
            java.lang.String r6 = "deleteAccountPhoneNumberTextView"
            r5 = 8
            X.00H r0 = r7.A0B     // Catch:{ 11T -> 0x00b9 }
            if (r0 == 0) goto L_0x00b2
            X.1cN r0 = X.C17880vN.A0I(r0)     // Catch:{ 11T -> 0x00b9 }
            X.2rb r2 = r0.A03()     // Catch:{ 11T -> 0x00b9 }
            if (r2 == 0) goto L_0x00ac
            X.0vb r1 = r7.A00     // Catch:{ 11T -> 0x00b9 }
            X.1Dx r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 11T -> 0x00b9 }
            java.lang.String r0 = r2.A06     // Catch:{ 11T -> 0x00b9 }
            com.whatsapp.jid.PhoneUserJid r0 = X.C22951Dx.A01(r0)     // Catch:{ 11T -> 0x00b9 }
            java.lang.String r0 = X.AnonymousClass17K.A05(r0)     // Catch:{ 11T -> 0x00b9 }
            java.lang.String r1 = r1.A0G(r0)     // Catch:{ 11T -> 0x00b9 }
            if (r1 == 0) goto L_0x00f3
            goto L_0x00cc
        L_0x00ac:
            java.lang.String r0 = "DeleteAccountConfirmation/setupDeleteAccountPhoneNumberTextView/currentAccount is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 11T -> 0x00b9 }
            goto L_0x00f3
        L_0x00b2:
            java.lang.String r0 = "accountSwitcher"
            X.C18070vi.A11(r0)     // Catch:{ 11T -> 0x00b9 }
            r0 = 0
            throw r0     // Catch:{ 11T -> 0x00b9 }
        L_0x00b9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DeleteAccountConfirmation/setupDeleteAccountPhoneNumberTextView/InvalidJidException : "
            X.C17900vP.A0X(r2, r0, r1)
            com.whatsapp.WaTextView r0 = r7.A04
            if (r0 != 0) goto L_0x00c8
            goto L_0x00f7
        L_0x00c8:
            r0.setVisibility(r5)
            goto L_0x00d3
        L_0x00cc:
            com.whatsapp.WaTextView r0 = r7.A04
            if (r0 == 0) goto L_0x00f7
            r0.setText(r1)
        L_0x00d3:
            r0 = 2131895836(0x7f12261c, float:1.9426516E38)
            java.lang.String r5 = X.C18070vi.A0F(r7, r0)
            android.content.Context r0 = r7.getApplicationContext()
            boolean r0 = X.C41361wE.A09(r0)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = X.AnonymousClass8BR.A0z(r7)
            r1 = 1
            if (r0 != 0) goto L_0x00ec
        L_0x00eb:
            r1 = 0
        L_0x00ec:
            com.whatsapp.WaTextView r2 = r7.A03
            if (r2 != 0) goto L_0x00fb
            java.lang.String r0 = "deleteAccountConfirmationTextView"
            goto L_0x007b
        L_0x00f3:
            com.whatsapp.WaTextView r0 = r7.A04
            if (r0 != 0) goto L_0x00c8
        L_0x00f7:
            X.C18070vi.A11(r6)
            goto L_0x007e
        L_0x00fb:
            X.1QO r0 = r7.A09
            if (r1 == 0) goto L_0x0130
            if (r0 == 0) goto L_0x016e
            boolean r1 = r0.A03()
            r0 = 2131895837(0x7f12261d, float:1.9426518E38)
            if (r1 == 0) goto L_0x010d
            r0 = 2131895838(0x7f12261e, float:1.942652E38)
        L_0x010d:
            java.lang.String r5 = X.C17890vO.A0R(r7, r5, r3, r4, r0)
        L_0x0111:
            r2.setText(r5)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131168631(0x7f070d77, float:1.795157E38)
            r2 = 2131168631(0x7f070d77, float:1.795157E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r7.A0C = r0
            X.2Ko r1 = r7.A05
            if (r1 == 0) goto L_0x016a
            X.1pC r0 = r7.A0E
            if (r0 != 0) goto L_0x013c
            java.lang.String r0 = "accountDeleteListener"
            goto L_0x007b
        L_0x0130:
            if (r0 == 0) goto L_0x016e
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0111
            r0 = 2131895839(0x7f12261f, float:1.9426522E38)
            goto L_0x010d
        L_0x013c:
            r1.registerObserver(r0)
            int r0 = X.AnonymousClass3MZ.A01(r7, r2)
            r7.A0C = r0
            android.widget.ScrollView r0 = r7.A01
            if (r0 == 0) goto L_0x0166
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.AFj r0 = new X.AFj
            r0.<init>(r7, r4)
            r1.addOnScrollChangedListener(r0)
            android.widget.ScrollView r0 = r7.A01
            if (r0 == 0) goto L_0x0166
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.AFi r0 = new X.AFi
            r0.<init>(r7, r3)
            r1.addOnPreDrawListener(r0)
            return
        L_0x0166:
            java.lang.String r0 = "scrollView"
            goto L_0x007b
        L_0x016a:
            java.lang.String r0 = "deleteAccount"
            goto L_0x007b
        L_0x016e:
            java.lang.String r0 = "paymentsGatingManager"
            goto L_0x007b
        L_0x0172:
            java.lang.String r0 = "waIntents"
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.delete.DeleteAccountConfirmation.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        C47942Ko r1 = this.A05;
        if (r1 != null) {
            C37241pC r0 = this.A0E;
            if (r0 == null) {
                str = "accountDeleteListener";
            } else {
                r1.unregisterObserver(r0);
                Handler handler = this.A00;
                if (handler == null) {
                    str = "timeoutHandler";
                } else {
                    handler.removeMessages(0);
                    return;
                }
            }
        } else {
            str = "deleteAccount";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        int A022 = AnonymousClass8BU.A02(this);
        if (!this.A07.A04() && A022 != 6) {
            C17900vP.A0i("DeleteAccountConfirmation/wrong-state bounce to main ", AnonymousClass000.A10(), A022);
            if (this.A07 != null) {
                startActivity(AnonymousClass1LU.A0A(this));
                finish();
                return;
            }
            AnonymousClass3MW.A1F();
            throw null;
        }
    }

    public DeleteAccountConfirmation() {
        this(0);
    }
}
