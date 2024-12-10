package com.whatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1D6;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C108995ce;
import X.C109005cf;
import X.C122946Sn;
import X.C133616p4;
import X.C1423379b;
import X.C18070vi;
import X.C18600wl;
import X.C21468AkZ;
import X.C30131dR;
import X.C30391dr;
import X.C35511mM;
import X.C37581pm;
import android.net.Uri;
import android.os.Bundle;

public final class AccountLinkingWebAuthActivity extends AnonymousClass1FY {
    public static final Integer A0C = AnonymousClass00R.A0N;
    public C35511mM A00;
    public C30131dR A01;
    public AnonymousClass00H A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass1D6 A07;
    public C18600wl A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public static final void A03(C122946Sn r6, AccountLinkingWebAuthActivity accountLinkingWebAuthActivity, C133616p4 r8, Integer num, Integer num2) {
        accountLinkingWebAuthActivity.A05.A0J(new C21468AkZ(r8, accountLinkingWebAuthActivity, num2, num, r6, 35));
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNewIntent(android.content.Intent r12) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            super.onNewIntent(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountLinkingWebAuthActivity/isValidRequest Calling pkg:"
            r1.append(r0)
            java.lang.String r0 = r11.getCallingPackage()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.1D6 r0 = r11.A07
            if (r0 != 0) goto L_0x002a
            java.lang.String r1 = "Detected invalid entry point into web auth. No tokens available. Exiting early"
            r0 = 0
            X.AnonymousClass6YJ.A00(r1, r0)
        L_0x0026:
            r11.finish()
        L_0x0029:
            return
        L_0x002a:
            android.net.Uri r3 = r12.getData()
            if (r3 == 0) goto L_0x0029
            java.lang.String r0 = "token"
            java.lang.String r9 = r3.getQueryParameter(r0)
            java.lang.String r0 = "blob"
            java.lang.String r4 = r3.getQueryParameter(r0)
            java.lang.String r1 = r3.getScheme()
            java.lang.String r0 = "wa-xf-login"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r1 = r3.getHost()
            java.lang.String r0 = "sso"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0029
            if (r9 == 0) goto L_0x0029
            if (r4 == 0) goto L_0x0029
            java.lang.String r0 = "AccountLinkingWebAuthActivity/onNewIntent Received deep link redirect from login page"
            X.C18070vi.A0d(r0, r2)
            X.00H r0 = r11.A06
            if (r0 == 0) goto L_0x013d
            boolean r0 = X.C108985cd.A1a(r0)
            if (r0 == 0) goto L_0x0026
            X.1mM r1 = r11.A00
            if (r1 == 0) goto L_0x013a
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r1.A03(r0)
            r0 = 1
            r11.A09 = r0
            X.1dR r1 = r11.A01
            if (r1 == 0) goto L_0x0140
            java.lang.String r0 = "TAP_WEB_AUTH_AGREE"
            r1.A04(r0)
            X.1KB r0 = r11.A05
            X.C18070vi.A0W(r0)
            X.6p4 r3 = new X.6p4
            r3.<init>(r0)
            r0 = 2131886423(0x7f120157, float:1.9407424E38)
            r3.A01(r0)
            X.1D6 r0 = r11.A07
            if (r0 == 0) goto L_0x0133
            java.lang.Object r5 = r0.first
            java.lang.String r5 = (java.lang.String) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r9.length()
            if (r1 == 0) goto L_0x0118
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0118
            r0 = 16
            if (r1 == r0) goto L_0x00ca
            java.lang.String r0 = "TokensValidator/isTokenValid t1_hash length is not 16"
        L_0x00aa:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ad:
            java.lang.String r0 = "AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Invalid token hash received in Web auth redirect URI"
            r4 = 0
            X.AnonymousClass6YJ.A00(r0, r4)
            r3.A00()
            X.00H r0 = r11.A02
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.10T r1 = (X.AnonymousClass10T) r1
            X.7KW r0 = new X.7KW
            r0.<init>(r4, r4, r4, r2)
            r1.notifyAllObservers(r0)
            goto L_0x0026
        L_0x00ca:
            java.security.MessageDigest r1 = X.C108945cZ.A1I()     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            byte[] r0 = X.C108975cc.A1O(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            byte[] r10 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            X.C18070vi.A0b(r10)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            int r7 = r10.length     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            r6 = 0
        L_0x00df:
            if (r6 >= r7) goto L_0x0100
            byte r0 = r10[r6]     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1a()     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            r1[r2] = r0     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = X.C108955ca.A12(r5, r0, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            r8.append(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            int r6 = r6 + 1
            goto L_0x00df
        L_0x0100:
            java.lang.String r0 = X.C18070vi.A0H(r8)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            boolean r0 = r0.startsWith(r9)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            if (r0 == 0) goto L_0x010b
            goto L_0x0121
        L_0x010b:
            java.lang.String r0 = "TokensValidator/isTokenValid hash of token1 does not match t1_hash received in deeplink"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ NoSuchAlgorithmException -> 0x0111 }
            goto L_0x00ad
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "TokensValidator/isTokenValid error while calculating token hash"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00ad
        L_0x0118:
            java.lang.String r0 = "TokensValidator/isTokenValid t1_hash or blob received in deeplink are empty"
            goto L_0x00aa
        L_0x011b:
            java.lang.String r0 = "accountLinkingResultObservers"
            X.C18070vi.A11(r0)
            throw r4
        L_0x0121:
            java.lang.String r0 = "AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Exchanging token and blob for access token"
            X.C18070vi.A0d(r0, r2)
            X.10I r2 = r11.A05
            r1 = 32
            X.7Qz r0 = new X.7Qz
            r0.<init>(r11, r3, r4, r1)
            r2.CGF(r0)
            return
        L_0x0133:
            java.lang.String r0 = "AccountLinkingWebAuthActivity/handleRedirectUriDeepLink Token pair cannot be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x013a:
            java.lang.String r0 = "fbAccountManager"
            goto L_0x0142
        L_0x013d:
            java.lang.String r0 = "xFamilyGating"
            goto L_0x0142
        L_0x0140:
            java.lang.String r0 = "xFamilyUserFlowLogger"
        L_0x0142:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity.onNewIntent(android.content.Intent):void");
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass1K1 A0K = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r1 = A0A2.A00;
            C109005cf.A0d(A0A2, r1, this);
            C109005cf.A0e(A0A2, r1, this, r1.A5A);
            this.A02 = C000200d.A00(r1.A5V);
            this.A00 = C108965cb.A0h(A0A2);
            this.A08 = AnonymousClass3MZ.A1B(A0A2);
            this.A03 = C000200d.A00(A0K.A67);
            this.A04 = C000200d.A00(A0K.A68);
            this.A05 = C000200d.A00(r1.AJJ);
            this.A06 = C000200d.A00(A0A2.AC9);
            this.A01 = (C30131dR) A0A2.Anv.get();
        }
    }

    public AccountLinkingWebAuthActivity(int i) {
        this.A0B = false;
        C1423379b.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        String str;
        Uri data;
        Uri data2;
        super.onCreate(bundle);
        AnonymousClass00H r0 = this.A06;
        if (r0 == null) {
            str = "xFamilyGating";
        } else if (!C108985cd.A1a(r0) || !(((data = getIntent().getData()) == null || data.getHost() == null) && ((data2 = getIntent().getData()) == null || data2.getScheme() == null))) {
            finish();
            return;
        } else if (!this.A07.A09()) {
            A03((C122946Sn) null, this, (C133616p4) null, -1, (Integer) null);
            return;
        } else {
            AnonymousClass1KB r02 = this.A05;
            C18070vi.A0W(r02);
            C133616p4 r4 = new C133616p4(r02);
            r4.A01(2131886429);
            C37581pm A0H = AnonymousClass3MZ.A0H(this);
            C18600wl r2 = this.A08;
            if (r2 != null) {
                AnonymousClass3MW.A1X(r2, new AccountLinkingWebAuthActivity$startWebAuthFlow$1(this, r4, (C30391dr) null), A0H);
                return;
            }
            str = "ioDispatcher";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        String str;
        super.onResume();
        if (this.A0A) {
            if (!this.A09) {
                C30131dR r2 = this.A01;
                if (r2 != null) {
                    C35511mM r1 = this.A00;
                    if (r1 != null) {
                        C108995ce.A1G(r1, r2, AnonymousClass00R.A0N);
                        r2.A03("EXIT_WEB_AUTH");
                    } else {
                        str = "fbAccountManager";
                    }
                } else {
                    str = "xFamilyUserFlowLogger";
                }
                C18070vi.A11(str);
                throw null;
            }
            finish();
        }
    }

    public AccountLinkingWebAuthActivity() {
        this(0);
    }
}
