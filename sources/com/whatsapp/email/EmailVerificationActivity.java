package com.whatsapp.email;

import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C190059kJ;
import X.C196039uM;
import X.C196159uY;
import X.C28931bI;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73203Rj;
import X.C89934dG;
import X.C91004ez;
import X.C91374fa;
import X.C95804mp;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

public final class EmailVerificationActivity extends AnonymousClass1FY {
    public int A00;
    public C28931bI A01;
    public C28931bI A02;
    public C28931bI A03;
    public AnonymousClass00H A04;
    public AnonymousClass00H A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public String A0B;
    public View A0C;
    public TextEmojiLabel A0D;
    public C28931bI A0E;
    public C28931bI A0F;
    public C28931bI A0G;
    public C28931bI A0H;
    public boolean A0I;

    public EmailVerificationActivity() {
        this(0);
    }

    public static final void A03(EmailVerificationActivity emailVerificationActivity) {
        A0r(emailVerificationActivity, 5, 1);
        AnonymousClass1L9 r3 = emailVerificationActivity.A01;
        AnonymousClass00H r0 = emailVerificationActivity.A0A;
        if (r0 != null) {
            r0.get();
            r3.A08(emailVerificationActivity, AnonymousClass1LU.A1Q(emailVerificationActivity, emailVerificationActivity.A0B, 0, emailVerificationActivity.A00));
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (r0 == null) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0V(com.whatsapp.email.EmailVerificationActivity r11) {
        /*
            r5 = r11
            X.0z4 r0 = r11.A0A
            boolean r0 = r0.A2N()
            r11 = 0
            if (r0 == 0) goto L_0x008a
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r5)
            java.lang.String r0 = "settings_verification_email_address_confirmed"
            boolean r0 = r1.getBoolean(r0, r11)
            if (r0 != 0) goto L_0x0080
            X.0ve r2 = r5.A0E
            r1 = 10421(0x28b5, float:1.4603E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0080
            com.whatsapp.TextEmojiLabel r1 = r5.A0D
            java.lang.String r4 = "description"
            if (r1 == 0) goto L_0x007b
            X.0ve r0 = r5.A0E
            X.AnonymousClass3Ma.A1L(r0, r1)
            com.whatsapp.TextEmojiLabel r3 = r5.A0D
            if (r3 == 0) goto L_0x007b
            r0 = 2131889671(0x7f120e07, float:1.9414012E38)
            java.lang.String r2 = X.C18070vi.A0F(r5, r0)
            r0 = 32
            X.4rM r1 = new X.4rM
            r1.<init>(r5, r0)
            java.lang.String r0 = "learn-more"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r5, r1, r2, r0)
            r3.setText(r0)
            X.1bI r0 = r5.A02
            java.lang.String r4 = "unconfirmedEmailView"
            if (r0 == 0) goto L_0x007b
            android.view.View r1 = r0.A02()
            r0 = 2131430284(0x7f0b0b8c, float:1.8482265E38)
            android.view.View r3 = X.AnonymousClass3MX.A0C(r1, r0)
            com.whatsapp.TextEmojiLabel r3 = (com.whatsapp.TextEmojiLabel) r3
            X.0ve r0 = r5.A0E
            X.AnonymousClass3Ma.A1L(r0, r3)
            r0 = 2131889672(0x7f120e08, float:1.9414014E38)
            java.lang.String r2 = X.C18070vi.A0F(r5, r0)
            r0 = 28
            X.4rM r1 = new X.4rM
            r1.<init>(r5, r0)
            java.lang.String r0 = "confirm"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r5, r1, r2, r0)
            r3.setText(r0)
            X.1bI r0 = r5.A02
        L_0x0079:
            if (r0 != 0) goto L_0x00c4
        L_0x007b:
            X.C18070vi.A11(r4)
        L_0x007e:
            r0 = 0
            throw r0
        L_0x0080:
            X.1bI r0 = r5.A0H
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "emailVerifiedStateViewStub"
            X.C18070vi.A11(r0)
            goto L_0x007e
        L_0x008a:
            X.1bI r0 = r5.A0F
            java.lang.String r4 = "emailUnverifiedStateViewStub"
            if (r0 == 0) goto L_0x007b
            android.view.View r1 = r0.A02()
            r0 = 2131430304(0x7f0b0ba0, float:1.8482305E38)
            android.view.View r1 = X.AnonymousClass3MX.A0C(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            X.0ve r0 = r5.A0E
            X.AnonymousClass3Ma.A1L(r0, r1)
            r0 = 2131889715(0x7f120e33, float:1.9414101E38)
            java.lang.String r8 = X.C18070vi.A0F(r5, r0)
            r0 = 2131103150(0x7f060dae, float:1.7818758E38)
            int r10 = X.C19740yt.A00(r5, r0)
            r0 = 31
            X.4rM r7 = new X.4rM
            r7.<init>(r5, r0)
            java.lang.String r9 = "verify-email"
            r6 = 0
            android.text.SpannableStringBuilder r0 = X.A3H.A00(r5, r6, r7, r8, r9, r10, r11)
            r1.setText(r0)
            X.1bI r0 = r5.A0F
            goto L_0x0079
        L_0x00c4:
            r0.A04(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.email.EmailVerificationActivity.A0V(com.whatsapp.email.EmailVerificationActivity):void");
    }

    public Dialog onCreateDialog(int i) {
        C73203Rj r2;
        int i2;
        int i3;
        if (i == 1) {
            r2 = C73203Rj.A02(this);
            i2 = 2131899286;
            i3 = 36;
        } else if (i != 2) {
            return super.onCreateDialog(i);
        } else {
            r2 = C73203Rj.A01(this);
            i2 = 2131899286;
            i3 = 35;
        }
        C73203Rj.A08(r2, this, i3, i2);
        return r2.create();
    }

    public static final void A0Q(EmailVerificationActivity emailVerificationActivity) {
        TextEmojiLabel textEmojiLabel = emailVerificationActivity.A0D;
        if (textEmojiLabel == null) {
            C18070vi.A11("description");
            throw null;
        } else {
            textEmojiLabel.setText(2131889644);
        }
    }

    public static final void A0c(EmailVerificationActivity emailVerificationActivity) {
        C28931bI r1 = emailVerificationActivity.A0E;
        if (r1 != null) {
            r1.A04(0);
            C28931bI r0 = emailVerificationActivity.A0E;
            if (r0 != null) {
                View A0C2 = AnonymousClass3MX.A0C(r0.A02(), 2131430292);
                C28931bI r02 = emailVerificationActivity.A0E;
                if (r02 != null) {
                    TextView A0W = C72453Mb.A0W(r02.A02(), 2131430290);
                    C28931bI r03 = emailVerificationActivity.A0E;
                    if (r03 != null) {
                        ((WaImageView) AnonymousClass3MX.A0C(r03.A02(), 2131430291)).A01 = AnonymousClass3MW.A1Z(emailVerificationActivity.A00);
                        C89934dG.A00(A0C2, emailVerificationActivity, 7);
                        if (emailVerificationActivity.A0A.A0o() != null) {
                            A0W.setText(emailVerificationActivity.A0A.A0o());
                            A0V(emailVerificationActivity);
                            emailVerificationActivity.getSupportFragmentManager().A0t(new C91374fa(emailVerificationActivity, 14), emailVerificationActivity, "RECONFIRM_EMAIL_FRAGMENT_RESULT");
                            return;
                        }
                        throw C17880vN.A0g();
                    }
                }
            }
        }
        C18070vi.A11("emailRowLayoutViewStub");
        throw null;
    }

    public static final void A0d(EmailVerificationActivity emailVerificationActivity) {
        C28931bI r2 = emailVerificationActivity.A0G;
        if (r2 != null) {
            r2.A04(0);
            C28931bI r0 = emailVerificationActivity.A0G;
            if (r0 != null) {
                ((ShimmerFrameLayout) r0.A02()).A03();
                View view = emailVerificationActivity.A0C;
                if (view == null) {
                    C18070vi.A11("emailVerificationLayout");
                    throw null;
                } else {
                    view.setVisibility(8);
                    return;
                }
            }
        }
        C18070vi.A11("emailVerificationShimmerViewStub");
        throw null;
    }

    public static final void A0q(EmailVerificationActivity emailVerificationActivity) {
        String str;
        C28931bI r1 = emailVerificationActivity.A0G;
        if (r1 == null) {
            str = "emailVerificationShimmerViewStub";
        } else {
            r1.A04(8);
            View view = emailVerificationActivity.A0C;
            if (view == null) {
                str = "emailVerificationLayout";
            } else {
                view.setVisibility(0);
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0r(EmailVerificationActivity emailVerificationActivity, int i, int i2) {
        AnonymousClass00H r0 = emailVerificationActivity.A05;
        if (r0 != null) {
            ((C190059kJ) r0.get()).A00(emailVerificationActivity.A0B, (String) null, emailVerificationActivity.A00, i, i2, 3);
        } else {
            C18070vi.A11("emailVerificationLogger");
            throw null;
        }
    }

    public static final boolean A0s(EmailVerificationActivity emailVerificationActivity) {
        AnonymousClass00H r0 = emailVerificationActivity.A06;
        if (r0 != null) {
            if (((C196039uM) r0.get()).A01()) {
                if (!C18020vd.A05(C18040vf.A02, emailVerificationActivity.A0E, 10421)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        C18070vi.A11("emailVerificationManager");
        throw null;
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A04 = AnonymousClass3MX.A10(A0L);
            this.A05 = C000200d.A00(r1.A9X);
            this.A06 = C000200d.A00(A0L.A3c);
            this.A07 = C000200d.A00(A0L.AKr);
            this.A08 = C000200d.A00(r1.A30);
            this.A09 = AnonymousClass3MZ.A14(A0L);
            this.A0A = AnonymousClass3MW.A0s(A0L);
        }
    }

    public void onBackPressed() {
        int i;
        Intent A0A2;
        String A0o = this.A0A.A0o();
        if (A0o == null || A0o.length() == 0) {
            i = 5;
        } else {
            i = 7;
            if (A0s(this)) {
                i = 11;
            }
        }
        A0r(this, i, 7);
        int i2 = this.A00;
        AnonymousClass1L9 r4 = this.A01;
        AnonymousClass00H r0 = this.A0A;
        if (r0 != null) {
            r0.get();
            if (i2 == 5) {
                A0A2 = C17880vN.A0A();
                A0A2.setClassName(getPackageName(), "com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity");
            } else {
                A0A2 = C17880vN.A0A();
                A0A2.setClassName(getPackageName(), "com.whatsapp.settings.SettingsAccount");
                A0A2.putExtra("is_companion", false);
            }
            r4.A08(this, A0A2.addFlags(67108864));
            finish();
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131625174);
        setTitle(2131889713);
        C18070vi.A0X(AnonymousClass1HF.A06(this.A00, 2131430298));
        C72473Md.A18(this);
        this.A0D = AnonymousClass3MX.A0V(this.A00, 2131430296);
        this.A0C = AnonymousClass1HF.A06(this.A00, 2131430297);
        this.A0G = C28931bI.A00(this.A00, 2131430303);
        this.A02 = C28931bI.A00(this.A00, 2131436497);
        this.A0E = C28931bI.A00(this.A00, 2131430293);
        this.A03 = C28931bI.A00(this.A00, 2131430302);
        this.A01 = C28931bI.A00(this.A00, 2131427593);
        this.A0H = C28931bI.A00(this.A00, 2131436709);
        this.A0F = C28931bI.A00(this.A00, 2131436523);
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        this.A0B = C72453Mb.A0v(this);
        A0Q(this);
        String A0o = this.A0A.A0o();
        if (A0o == null || A0o.length() == 0) {
            A0d(this);
            AnonymousClass00H r0 = this.A07;
            if (r0 != null) {
                ((C196159uY) r0.get()).A01(new C95804mp(this));
            } else {
                C18070vi.A11("emailVerificationXmppMethods");
                throw null;
            }
        } else {
            int i = 7;
            if (A0s(this)) {
                i = 11;
            }
            A0r(this, i, 8);
            A0c(this);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public EmailVerificationActivity(int i) {
        this.A0I = false;
        C91004ez.A00(this, 49);
    }
}
