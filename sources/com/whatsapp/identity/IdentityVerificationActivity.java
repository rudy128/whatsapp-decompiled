package com.whatsapp.identity;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass11C;
import X.AnonymousClass11S;
import X.AnonymousClass11T;
import X.AnonymousClass129;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1L8;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1RK;
import X.AnonymousClass206;
import X.AnonymousClass2T2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Z9;
import X.AnonymousClass4aX;
import X.AnonymousClass7IE;
import X.AnonymousClass7IG;
import X.BCN;
import X.C000200d;
import X.C107295Zd;
import X.C108955ca;
import X.C108965cb;
import X.C108975cc;
import X.C108985cd;
import X.C109005cf;
import X.C109065cl;
import X.C114545r0;
import X.C1192467i;
import X.C121946Mc;
import X.C128396fv;
import X.C130576jf;
import X.C133166oH;
import X.C134126q5;
import X.C136676uC;
import X.C139306yc;
import X.C1423279a;
import X.C144677Ig;
import X.C145437Lg;
import X.C146447Pd;
import X.C146507Pj;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C200710s;
import X.C219217x;
import X.C22440B7w;
import X.C22941Dw;
import X.C24921Me;
import X.C25088CWz;
import X.C25491Ok;
import X.C25591Ou;
import X.C26701Td;
import X.C36361nl;
import X.C36401np;
import X.C36531o3;
import X.C40501uo;
import X.C42171xk;
import X.C43251zV;
import X.C56342hJ;
import X.C64282uW;
import X.C72453Mb;
import X.C72473Md;
import X.C74703cE;
import X.C74743cP;
import X.C825148g;
import X.C90044dR;
import X.C95524mN;
import X.C99014s7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.qrcode.WaQrScannerView;
import com.whatsapp.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class IdentityVerificationActivity extends AnonymousClass1FY implements BCN, C22440B7w, C107295Zd {
    public int A00;
    public View A01;
    public ImageView A02;
    public ProgressBar A03;
    public C56342hJ A04;
    public C25591Ou A05;
    public C36361nl A06;
    public AnonymousClass1M9 A07;
    public C24921Me A08;
    public C25491Ok A09;
    public C36531o3 A0A;
    public C219217x A0B;
    public C128396fv A0C;
    public AnonymousClass1E7 A0D;
    public AnonymousClass1RK A0E;
    public C133166oH A0F;
    public C130576jf A0G;
    public C136676uC A0H;
    public AnonymousClass1LU A0I;
    public UserJid A0J;
    public C139306yc A0K;
    public WaQrScannerView A0L;
    public AnonymousClass129 A0M;
    public C36401np A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public boolean A0R;
    public MenuItem A0S;
    public TextView A0T;
    public TextView A0U;
    public Toolbar A0V;
    public C25088CWz A0W;
    public boolean A0X;
    public final C26701Td A0Y;
    public final AnonymousClass7IE A0Z;
    public final AnonymousClass7IE A0a;
    public final Runnable A0b;

    public static final void A0c(Spanned spanned, TextEmojiLabel textEmojiLabel, IdentityVerificationActivity identityVerificationActivity) {
        IdentityVerificationActivity identityVerificationActivity2 = identityVerificationActivity;
        AnonymousClass3Ma.A1L(identityVerificationActivity.A0E, textEmojiLabel);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(spanned);
        Object[] spans = A092.getSpans(0, A092.length(), URLSpan.class);
        if (spans != null) {
            C99014s7 r1 = new C99014s7(spans);
            while (r1.hasNext()) {
                URLSpan uRLSpan = (URLSpan) r1.next();
                AnonymousClass1KB r7 = identityVerificationActivity.A05;
                C18070vi.A0W(r7);
                AnonymousClass11C r8 = identityVerificationActivity.A08;
                C18070vi.A0W(r8);
                C36361nl r6 = identityVerificationActivity.A06;
                if (r6 != null) {
                    C72473Md.A0x(A092, uRLSpan, new C74703cE((Context) identityVerificationActivity2, (AnonymousClass1L8) r6, r7, r8, (AnonymousClass206) null, uRLSpan.getURL()));
                } else {
                    C18070vi.A11("linkLauncher");
                    throw null;
                }
            }
            C99014s7 r12 = new C99014s7(spans);
            while (r12.hasNext()) {
                A092.removeSpan(r12.next());
            }
        }
        AnonymousClass3Ma.A1K(textEmojiLabel, identityVerificationActivity.A08);
        textEmojiLabel.setText(A092, TextView.BufferType.SPANNABLE);
    }

    public static final void A0q(IdentityVerificationActivity identityVerificationActivity) {
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
        C114545r0.A00(translateAnimation, identityVerificationActivity, 4);
        translateAnimation.setDuration(300);
        View view = identityVerificationActivity.A01;
        if (view == null) {
            C18070vi.A11("securityNotificationView");
            throw null;
        } else {
            view.startAnimation(translateAnimation);
        }
    }

    public void Bm5(List list) {
        UserJid userJid;
        C18070vi.A0d(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid != null) {
                userJid = deviceJid.userJid;
            } else {
                userJid = null;
            }
            AnonymousClass1E7 r0 = this.A0D;
            if (r0 == null) {
                C18070vi.A11("contact");
                throw null;
            } else if (C42171xk.A00(AnonymousClass1E7.A01(r0), userJid)) {
                A0w(this, false);
            }
        }
    }

    public void BvA(DeviceJid deviceJid) {
        C18070vi.A0d(deviceJid, 0);
        runOnUiThread(new C146507Pj(deviceJid, this, 15));
    }

    public void Bvj(DeviceJid deviceJid) {
        C18070vi.A0d(deviceJid, 0);
        A0u(this, deviceJid.userJid);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            A0s(this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        C139306yc A4c = A4c();
        UserJid userJid = this.A0J;
        if (userJid == null) {
            C18070vi.A11("jid");
            throw null;
        }
        if (!A4c.A00(userJid)) {
            MenuItem icon = menu.add(0, 2131432625, 0, 2131899418).setIcon(2131232296);
            this.A0S = icon;
            if (icon != null) {
                icon.setShowAsAction(2);
            }
            MenuItem menuItem = this.A0S;
            if (menuItem != null) {
                menuItem.setVisible(AnonymousClass000.A1W(this.A0C));
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        C18070vi.A0d(intent, 0);
        super.onNewIntent(intent);
        setIntent(intent);
        if (C17890vO.A1S(intent, "android.nfc.action.NDEF_DISCOVERED")) {
            A0V(intent);
        }
    }

    public static final String A03(IdentityVerificationActivity identityVerificationActivity, String str) {
        String str2;
        String escapeHtml;
        int i;
        Object[] A1b;
        C24921Me r1 = identityVerificationActivity.A08;
        if (r1 != null) {
            AnonymousClass1E7 r0 = identityVerificationActivity.A0D;
            if (r0 != null) {
                if (r1.A0T(r0, -1) == null) {
                    escapeHtml = "";
                } else {
                    C24921Me r12 = identityVerificationActivity.A08;
                    if (r12 != null) {
                        AnonymousClass1E7 r02 = identityVerificationActivity.A0D;
                        if (r02 != null) {
                            escapeHtml = Html.escapeHtml(r12.A0T(r02, -1));
                        }
                    }
                }
                C128396fv r03 = identityVerificationActivity.A0C;
                if (r03 != null) {
                    boolean A1W = AnonymousClass000.A1W(r03.A01);
                    AnonymousClass11S r13 = identityVerificationActivity.A02;
                    AnonymousClass1E7 r04 = identityVerificationActivity.A0D;
                    if (r04 != null) {
                        if (AnonymousClass3Ma.A1V(r13, r04)) {
                            C25491Ok r05 = identityVerificationActivity.A09;
                            if (r05 != null) {
                                r05.A02.get();
                            }
                            str2 = "businessCoexUtils";
                            C18070vi.A11(str2);
                            throw null;
                        }
                        C25491Ok r06 = identityVerificationActivity.A09;
                        if (r06 != null) {
                            r06.A02.get();
                            C25491Ok r14 = identityVerificationActivity.A09;
                            if (r14 != null) {
                                AnonymousClass1E7 r07 = identityVerificationActivity.A0D;
                                if (r07 != null) {
                                    if (r14.A00(AnonymousClass3MZ.A0x(r07))) {
                                        i = 2131897789;
                                    } else {
                                        AnonymousClass11S r15 = identityVerificationActivity.A02;
                                        AnonymousClass1E7 r08 = identityVerificationActivity.A0D;
                                        if (r08 != null) {
                                            if (AnonymousClass3Ma.A1V(r15, r08)) {
                                                i = 2131892107;
                                            } else {
                                                int i2 = 2131897792;
                                                if (A1W) {
                                                    i2 = 2131897791;
                                                }
                                                A1b = AnonymousClass3MX.A1b(escapeHtml, 0);
                                                A1b[1] = str;
                                                return identityVerificationActivity.getString(i, A1b);
                                            }
                                        }
                                    }
                                    A1b = new Object[]{str};
                                    return identityVerificationActivity.getString(i, A1b);
                                }
                            }
                        }
                        str2 = "businessCoexUtils";
                        C18070vi.A11(str2);
                        throw null;
                    }
                } else {
                    throw C17880vN.A0g();
                }
            }
            C18070vi.A11("contact");
            throw null;
        }
        str2 = "waContactNames";
        C18070vi.A11(str2);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        r1 = getString(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0V(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "android.nfc.extra.NDEF_MESSAGES"
            android.os.Parcelable[] r0 = r7.getParcelableArrayExtra(r0)
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000c
            r1 = r0[r3]
        L_0x000c:
            java.lang.String r0 = "null cannot be cast to non-null type android.nfc.NdefMessage"
            X.C18070vi.A0z(r1, r0)
            android.nfc.NdefMessage r1 = (android.nfc.NdefMessage) r1
            android.nfc.NdefRecord[] r0 = r1.getRecords()
            r0 = r0[r3]
            byte[] r5 = r0.getPayload()
            X.1Dw r4 = com.whatsapp.jid.UserJid.Companion
            android.nfc.NdefRecord[] r0 = r1.getRecords()
            r0 = r0[r3]
            byte[] r2 = r0.getId()
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "US-ASCII"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            com.whatsapp.jid.UserJid r1 = r4.A04(r0)
            if (r1 == 0) goto L_0x0069
            X.1M9 r0 = r6.A07
            if (r0 == 0) goto L_0x00fc
            X.1E7 r1 = r0.A0H(r1)
            r6.A0D = r1
            X.1Me r0 = r6.A08
            if (r0 == 0) goto L_0x00f9
            java.lang.String r4 = X.AnonymousClass3MY.A0q(r0, r1)
            r0 = 2131897773(0x7f122dad, float:1.9430445E38)
            r2 = 1
            java.lang.String r0 = X.C17890vO.A0R(r6, r4, r2, r3, r0)
            r6.A42(r0)
            A0w(r6, r3)
            X.6fv r0 = r6.A0C
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "idverification/ndef/no-fingerprint"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0069:
            return
        L_0x006a:
            X.6uC r0 = r6.A4b()
            X.C18070vi.A0b(r5)
            X.6dr r5 = r0.A00(r5)
            if (r5 == 0) goto L_0x0069
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x007f
            A0x(r6, r2)
            return
        L_0x007f:
            boolean r0 = r5 instanceof X.C116775yb
            if (r0 == 0) goto L_0x009b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "idverification/handleIntentV1Error result = "
            X.C17900vP.A0Z(r5, r0, r1)
            int r1 = r5.A00
            r0 = -3
            if (r1 == r0) goto L_0x00ae
            r0 = -2
            if (r1 == r0) goto L_0x00da
            r0 = 2
            if (r1 != r0) goto L_0x0069
            A0x(r6, r3)
            return
        L_0x009b:
            boolean r0 = r5 instanceof X.C116785yc
            if (r0 == 0) goto L_0x0069
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "idverification/handleIntentV3Error result = "
            X.C17900vP.A0Z(r5, r0, r1)
            int r0 = r5.A00
            switch(r0) {
                case -38: goto L_0x00ea;
                case -37: goto L_0x00ea;
                case -36: goto L_0x00ea;
                case -35: goto L_0x00ea;
                case -34: goto L_0x00ea;
                case -33: goto L_0x00d6;
                case -32: goto L_0x00ad;
                case -31: goto L_0x00d6;
                case -30: goto L_0x00d6;
                case -29: goto L_0x00d6;
                case -28: goto L_0x00d2;
                case -27: goto L_0x00ad;
                case -26: goto L_0x00d2;
                case -25: goto L_0x00ea;
                case -24: goto L_0x00d2;
                case -23: goto L_0x00ad;
                case -22: goto L_0x00ce;
                case -21: goto L_0x00ca;
                case -20: goto L_0x00ca;
                case -19: goto L_0x00ca;
                case -18: goto L_0x00ca;
                case -17: goto L_0x00ce;
                case -16: goto L_0x00ea;
                case -15: goto L_0x00ea;
                case -14: goto L_0x00ea;
                case -13: goto L_0x00c6;
                case -12: goto L_0x00c2;
                case -11: goto L_0x00be;
                case -10: goto L_0x00b2;
                case -9: goto L_0x00b6;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            return
        L_0x00ae:
            r0 = 2131897780(0x7f122db4, float:1.943046E38)
            goto L_0x00dd
        L_0x00b2:
            r0 = 2131890423(0x7f1210f7, float:1.9415537E38)
            goto L_0x00b9
        L_0x00b6:
            r0 = 2131890424(0x7f1210f8, float:1.941554E38)
        L_0x00b9:
            java.lang.String r1 = r6.getString(r0)
            goto L_0x00e1
        L_0x00be:
            r0 = 2131890422(0x7f1210f6, float:1.9415535E38)
            goto L_0x00dd
        L_0x00c2:
            r0 = 2131890421(0x7f1210f5, float:1.9415533E38)
            goto L_0x00dd
        L_0x00c6:
            r0 = 2131890418(0x7f1210f2, float:1.9415527E38)
            goto L_0x00dd
        L_0x00ca:
            r0 = 2131890419(0x7f1210f3, float:1.941553E38)
            goto L_0x00dd
        L_0x00ce:
            r0 = 2131890416(0x7f1210f0, float:1.9415523E38)
            goto L_0x00dd
        L_0x00d2:
            r0 = 2131890417(0x7f1210f1, float:1.9415525E38)
            goto L_0x00dd
        L_0x00d6:
            r0 = 2131890420(0x7f1210f4, float:1.9415531E38)
            goto L_0x00dd
        L_0x00da:
            r0 = 2131897779(0x7f122db3, float:1.9430457E38)
        L_0x00dd:
            java.lang.String r1 = X.C17890vO.A0R(r6, r4, r2, r3, r0)
        L_0x00e1:
            X.C18070vi.A0X(r1)
            X.1KB r0 = r6.A05
            r0.A0G(r1, r2)
            return
        L_0x00ea:
            X.6uC r2 = r6.A4b()
            r1 = 49
            X.Aik r0 = new X.Aik
            r0.<init>(r6, r1)
            r2.A02(r0)
            return
        L_0x00f9:
            java.lang.String r0 = "waContactNames"
            goto L_0x00fe
        L_0x00fc:
            java.lang.String r0 = "contactManager"
        L_0x00fe:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A0V(android.content.Intent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0r(com.whatsapp.identity.IdentityVerificationActivity r22) {
        /*
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            r2 = r22
            android.view.WindowManager r0 = r2.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getSize(r3)
            int r1 = r3.x
            int r0 = r3.y
            int r0 = java.lang.Math.min(r1, r0)
            int r0 = r0 * 2
            int r1 = r0 / 3
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
            android.graphics.Canvas r15 = X.C108955ca.A0E(r4)
            r0 = -1
            r15.drawColor(r0)
            X.CWz r0 = r2.A0W
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "qrCode"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0037:
            X.CWH r14 = r0.A03
            int r13 = r14.A01
            int r12 = r14.A00
            int r11 = r1 / 12
            int r0 = r11 * 2
            int r1 = r1 - r0
            float r10 = (float) r1
            r0 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 * r0
            float r0 = (float) r13
            float r16 = r10 / r0
            float r0 = (float) r12
            float r10 = r10 / r0
            android.graphics.Paint r9 = X.AnonymousClass3MW.A06()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r9.setColor(r0)
            r8 = 0
        L_0x0055:
            r1 = 1
            if (r8 >= r13) goto L_0x008c
            r7 = 0
        L_0x0059:
            if (r7 >= r12) goto L_0x0089
            byte[][] r0 = r14.A02
            r0 = r0[r7]
            byte r0 = r0[r8]
            if (r0 != r1) goto L_0x0085
            float r6 = (float) r11
            float r5 = (float) r8
            float r5 = r5 * r16
            float r5 = r5 + r6
            float r3 = (float) r7
            float r3 = r3 * r10
            float r3 = r3 + r6
            int r0 = r8 + 1
            float r1 = (float) r0
            float r1 = r1 * r16
            float r1 = r1 + r6
            int r0 = r7 + 1
            float r0 = (float) r0
            float r0 = r0 * r10
            float r0 = r0 + r6
            r22 = r9
            r20 = r1
            r21 = r0
            r19 = r3
            r18 = r5
            r17 = r15
            r17.drawRect(r18, r19, r20, r21, r22)
        L_0x0085:
            int r7 = r7 + 1
            r1 = 1
            goto L_0x0059
        L_0x0089:
            int r8 = r8 + 1
            goto L_0x0055
        L_0x008c:
            r9 = 0
            r8 = 1
            X.17r r1 = r2.A04
            java.lang.String r0 = "code.png"
            java.io.File r7 = r1.A0a(r0)
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r7)     // Catch:{ FileNotFoundException -> 0x01c2, IOException -> 0x00aa }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x00a3 }
            r4.compress(r0, r9, r3)     // Catch:{ all -> 0x00a3 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x01c2, IOException -> 0x00aa }
            goto L_0x00ae
        L_0x00a3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ FileNotFoundException -> 0x01c2, IOException -> 0x00aa }
            throw r0     // Catch:{ FileNotFoundException -> 0x01c2, IOException -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x01d4 }
        L_0x00ae:
            r4.recycle()
            X.6fv r0 = r2.A0C
            if (r0 == 0) goto L_0x01bd
            X.6os r0 = r0.A01
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            r11 = 10
            if (r0 == 0) goto L_0x0104
            java.lang.String r3 = r0.A00
            java.lang.String r1 = r0.A01
            int r0 = r3.compareTo(r1)
            if (r0 > 0) goto L_0x00fc
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r3)
            r0.append(r1)
        L_0x00d0:
            java.lang.String r4 = X.C18070vi.A0H(r0)
            int r3 = r4.length()
            if (r8 > r3) goto L_0x0104
            r1 = 1
        L_0x00db:
            int r0 = r1 + -1
            char r0 = r4.charAt(r0)
            r5.append(r0)
            if (r1 == r3) goto L_0x00ed
            int r0 = r1 % 20
            if (r0 != 0) goto L_0x00f2
            r5.append(r11)
        L_0x00ed:
            if (r1 == r3) goto L_0x0104
            int r1 = r1 + 1
            goto L_0x00db
        L_0x00f2:
            int r0 = r1 % 5
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = " "
            r5.append(r0)
            goto L_0x00ed
        L_0x00fc:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r1)
            r0.append(r3)
            goto L_0x00d0
        L_0x0104:
            X.11S r0 = r2.A02
            com.whatsapp.jid.PhoneUserJid r10 = X.AnonymousClass11S.A01(r0)
            X.C18070vi.A0X(r10)
            java.lang.String r0 = "mailto:"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            java.lang.String r0 = "android.intent.action.SEND"
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r0, r1)
            r6 = 2131891243(0x7f12142b, float:1.94172E38)
            java.lang.Object[] r3 = X.AnonymousClass3MW.A1b()
            X.0vb r1 = r2.A00
            X.11S r0 = r2.A02
            java.lang.String r0 = r0.A0D()
            java.lang.String r0 = r1.A0F(r0)
            r3[r9] = r0
            X.0vb r1 = r2.A00
            java.lang.String r0 = r10.user
            java.lang.String r0 = X.AnonymousClass17K.A06(r0)
            java.lang.String r0 = r1.A0G(r0)
            java.lang.String r1 = X.C17880vN.A0q(r2, r0, r3, r8, r6)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r4.putExtra(r0, r1)
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            r0 = 2131891242(0x7f12142a, float:1.9417199E38)
            java.lang.String r0 = r2.getString(r0)
            r10.append(r0)
            r10.append(r11)
            X.0vb r3 = r2.A00
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "\n"
            java.lang.String[] r9 = r1.split(r0)
            X.1Wz r0 = X.C18000vb.A00(r3)
            X.1X3 r8 = r0.A01
            int r1 = r1.length()
            int r6 = r9.length
            int r0 = r6 * 4
            int r1 = r1 + r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r3 = 0
        L_0x0175:
            if (r3 >= r6) goto L_0x0190
            r1 = r9[r3]
            X.1X5 r0 = X.AnonymousClass1X4.A04
            if (r1 != 0) goto L_0x0187
            r0 = 0
        L_0x017e:
            r5.append(r0)
            r5.append(r11)
            int r3 = r3 + 1
            goto L_0x0175
        L_0x0187:
            android.text.SpannableStringBuilder r0 = r8.A02(r0, r1)
            java.lang.String r0 = r0.toString()
            goto L_0x017e
        L_0x0190:
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r10)
            java.lang.String r0 = "android.intent.extra.TEXT"
            r4.putExtra(r0, r1)
            android.content.Context r0 = r2.getApplicationContext()
            android.net.Uri r1 = X.C64062u9.A02(r0, r7)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "image/png"
            r4.setType(r0)
            r0 = 524288(0x80000, float:7.34684E-40)
            r4.addFlags(r0)
            r0 = 0
            android.content.Intent r0 = android.content.Intent.createChooser(r4, r0)
            r2.startActivity(r0)
            return
        L_0x01bd:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x01c2:
            r1 = move-exception
            java.lang.String r0 = "idverification/sharefailed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01d4 }
            X.1KB r1 = r2.A05     // Catch:{ all -> 0x01d4 }
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
            r1.A08(r0, r9)     // Catch:{ all -> 0x01d4 }
            r4.recycle()
            return
        L_0x01d4:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A0r(com.whatsapp.identity.IdentityVerificationActivity):void");
    }

    public static final void A0s(IdentityVerificationActivity identityVerificationActivity) {
        String str;
        WaQrScannerView waQrScannerView = identityVerificationActivity.A0L;
        if (waQrScannerView == null || waQrScannerView.getVisibility() != 0) {
            C219217x r0 = identityVerificationActivity.A0B;
            if (r0 == null) {
                str = "waPermissionsHelper";
            } else if (r0.A02("android.permission.CAMERA") == 0) {
                identityVerificationActivity.findViewById(2131433364).setVisibility(0);
                WaQrScannerView waQrScannerView2 = identityVerificationActivity.A0L;
                if (waQrScannerView2 != null) {
                    waQrScannerView2.setVisibility(0);
                }
                C72453Mb.A1B(identityVerificationActivity.A0T);
                identityVerificationActivity.A05.A0I(identityVerificationActivity.A0b);
                return;
            } else if (identityVerificationActivity.A0I != null) {
                C134126q5 r2 = new C134126q5(identityVerificationActivity);
                r2.A01 = 2131232198;
                r2.A02 = 2131894287;
                r2.A03 = 2131894286;
                r2.A01(new String[]{"android.permission.CAMERA"});
                identityVerificationActivity.startActivityForResult(r2.A00(), 1);
                return;
            } else {
                str = "waIntents";
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0t(com.whatsapp.identity.IdentityVerificationActivity r12) {
        /*
            java.lang.String r6 = "idverification/"
            X.6yc r1 = r12.A4c()
            com.whatsapp.jid.UserJid r0 = r12.A0J
            r11 = 0
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "jid"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0011:
            boolean r8 = r1.A00(r0)
            X.6fv r0 = r12.A0C
            r5 = 1
            java.lang.String r10 = "identityTextView"
            if (r0 != 0) goto L_0x004d
            if (r8 != 0) goto L_0x004c
            r6 = 0
            r12.A0y(r6)
            android.widget.TextView r4 = r12.A0U
            if (r4 != 0) goto L_0x002a
            X.C18070vi.A11(r10)
            throw r11
        L_0x002a:
            r3 = 2131897774(0x7f122dae, float:1.9430447E38)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            X.1Me r1 = r12.A08
            if (r1 == 0) goto L_0x003d
            X.1E7 r0 = r12.A0D
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "contact"
            X.C18070vi.A11(r0)
            throw r11
        L_0x003d:
            java.lang.String r0 = "waContactNames"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0043:
            java.lang.String r0 = X.AnonymousClass3MY.A0q(r1, r0)
            r2[r6] = r0
            X.AnonymousClass3MY.A0y(r12, r4, r2, r3)
        L_0x004c:
            return
        L_0x004d:
            r12.A0Q()
            X.6fv r0 = r12.A0C
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x0192
            X.6os r0 = r0.A01
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x00b4
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A01
            int r0 = r2.compareTo(r1)
            if (r0 > 0) goto L_0x00ac
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r2)
            r0.append(r1)
        L_0x006f:
            java.lang.String r3 = X.C18070vi.A0H(r0)
            int r2 = r3.length()
            if (r5 > r2) goto L_0x00b4
            r7 = r11
            r1 = 1
        L_0x007b:
            int r0 = r1 + -1
            char r0 = r3.charAt(r0)
            r4.append(r0)
            if (r1 == r2) goto L_0x0095
            int r0 = r1 % 20
            if (r0 != 0) goto L_0x009a
            if (r7 != 0) goto L_0x0090
            java.lang.String r7 = r4.toString()
        L_0x0090:
            r0 = 10
            r4.append(r0)
        L_0x0095:
            if (r1 == r2) goto L_0x00b5
            int r1 = r1 + 1
            goto L_0x007b
        L_0x009a:
            int r0 = r1 % 5
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "     "
            r4.append(r0)
            goto L_0x0095
        L_0x00a4:
            if (r8 != 0) goto L_0x0095
            r0 = 32
            r4.append(r0)
            goto L_0x0095
        L_0x00ac:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r1)
            r0.append(r2)
            goto L_0x006f
        L_0x00b4:
            r7 = r11
        L_0x00b5:
            if (r8 == 0) goto L_0x00d6
            X.6jf r0 = r12.A0G
            java.lang.String r2 = "soteriaViewHolder"
            if (r0 != 0) goto L_0x00c1
            X.C18070vi.A11(r2)
            throw r11
        L_0x00c1:
            com.whatsapp.settings.SettingsRowIconText r1 = r0.A06
            r0 = 10
            X.AnonymousClass3MY.A1E(r1, r4, r12, r0)
            X.6jf r0 = r12.A0G
            if (r0 != 0) goto L_0x00d0
            X.C18070vi.A11(r2)
            throw r11
        L_0x00d0:
            com.whatsapp.settings.SettingsRowIconText r0 = r0.A06
            r0.setEnabled(r5)
            return
        L_0x00d6:
            android.widget.TextView r0 = r12.A0U
            if (r0 != 0) goto L_0x00de
            X.C18070vi.A11(r10)
            throw r11
        L_0x00de:
            float r3 = r0.getTextSize()
            if (r7 == 0) goto L_0x00ec
            android.widget.TextView r0 = r12.A0U
            if (r0 != 0) goto L_0x00ee
            X.C18070vi.A11(r10)
            throw r11
        L_0x00ec:
            r8 = 0
            goto L_0x00f6
        L_0x00ee:
            android.text.TextPaint r0 = r0.getPaint()
            float r8 = r0.measureText(r7)
        L_0x00f6:
            android.graphics.Point r0 = X.C72483Me.A0D(r12)
            int r1 = r0.x
            int r0 = r0.y
            int r0 = java.lang.Math.min(r1, r0)
            float r2 = (float) r0
            android.content.res.Resources r1 = r12.getResources()
            r0 = 2131167017(0x7f070729, float:1.7948296E38)
            float r0 = r1.getDimension(r0)
            float r2 = r2 - r0
        L_0x010f:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            float r3 = r3 - r1
            android.widget.TextView r0 = r12.A0U
            if (r0 != 0) goto L_0x0122
            X.C18070vi.A11(r10)
            throw r11
        L_0x0122:
            r0.setTextSize(r3)
            android.widget.TextView r0 = r12.A0U
            if (r0 != 0) goto L_0x012d
            X.C18070vi.A11(r10)
            throw r11
        L_0x012d:
            android.text.TextPaint r0 = r0.getPaint()
            float r8 = r0.measureText(r7)
            goto L_0x010f
        L_0x0136:
            android.widget.TextView r1 = r12.A0U
            if (r1 != 0) goto L_0x013e
            X.C18070vi.A11(r10)
            throw r11
        L_0x013e:
            java.lang.String r0 = r4.toString()
            r1.setText(r0)
            android.widget.TextView r1 = r12.A0U
            if (r1 != 0) goto L_0x014d
            X.C18070vi.A11(r10)
            throw r11
        L_0x014d:
            r0 = 3
            r1.setTextDirection(r0)
            r0 = 2131434246(0x7f0b1b06, float:1.84903E38)
            android.view.View r4 = X.AnonymousClass3MY.A0H(r12, r0)
            com.whatsapp.QrImageView r4 = (com.whatsapp.QrImageView) r4
            java.lang.Class<X.ByL> r0 = X.C24262ByL.class
            java.util.EnumMap r3 = new java.util.EnumMap     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            r3.<init>(r0)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            X.6fv r0 = r12.A0C     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            if (r0 == 0) goto L_0x0185
            X.8aa r0 = r0.A02     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            byte[] r2 = r0.A0M()     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            X.C18070vi.A0X(r0)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            java.lang.String r1 = new java.lang.String     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            r1.<init>(r2, r0)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            X.CWz r0 = X.C25912CoW.A00(r0, r1, r3)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            r12.A0W = r0     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            r4.setQrCode(r0)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            goto L_0x018e
        L_0x0185:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r9)     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
            throw r0     // Catch:{ C2V | UnsupportedEncodingException -> 0x018a }
        L_0x018a:
            r0 = move-exception
            com.whatsapp.util.Log.w(r6, r0)
        L_0x018e:
            r12.A0y(r5)
            return
        L_0x0192:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.identity.IdentityVerificationActivity.A0t(com.whatsapp.identity.IdentityVerificationActivity):void");
    }

    public static final void A0u(IdentityVerificationActivity identityVerificationActivity, UserJid userJid) {
        if (!identityVerificationActivity.A02.A0O(userJid)) {
            if (userJid != null) {
                AnonymousClass1E7 r0 = identityVerificationActivity.A0D;
                if (r0 == null) {
                    C18070vi.A11("contact");
                    throw null;
                } else if (!userJid.equals(AnonymousClass1E7.A01(r0))) {
                    return;
                }
            } else {
                return;
            }
        }
        identityVerificationActivity.runOnUiThread(new C146447Pd(identityVerificationActivity, 1));
    }

    public static final void A0v(IdentityVerificationActivity identityVerificationActivity, String str, String str2) {
        C130576jf r0 = identityVerificationActivity.A0G;
        if (r0 == null) {
            C18070vi.A11("soteriaViewHolder");
            throw null;
        } else {
            C108985cd.A0F(r0.A04).setDuration(150).setListener(new C109065cl(identityVerificationActivity, str, str2, 0));
        }
    }

    public static final void A0x(IdentityVerificationActivity identityVerificationActivity, boolean z) {
        ImageView imageView = identityVerificationActivity.A02;
        if (imageView != null) {
            imageView.setVisibility(0);
            ImageView imageView2 = identityVerificationActivity.A02;
            if (imageView2 != null) {
                int i = 2131232875;
                if (z) {
                    i = 2131231553;
                }
                imageView2.setBackgroundResource(i);
                ImageView imageView3 = identityVerificationActivity.A02;
                if (imageView3 != null) {
                    int i2 = 2131891244;
                    if (z) {
                        i2 = 2131891245;
                    }
                    AnonymousClass3MY.A0w(identityVerificationActivity, imageView3, i2);
                    ImageView imageView4 = identityVerificationActivity.A02;
                    if (imageView4 != null) {
                        int i3 = 2131231895;
                        if (z) {
                            i3 = 2131231804;
                        }
                        imageView4.setImageResource(i3);
                        AnimationSet animationSet = new AnimationSet(true);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        animationSet.addAnimation(scaleAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setInterpolator(new OvershootInterpolator());
                        animationSet.setDuration((long) identityVerificationActivity.getResources().getInteger(17694721));
                        ImageView imageView5 = identityVerificationActivity.A02;
                        if (imageView5 != null) {
                            imageView5.startAnimation(animationSet);
                            ImageView imageView6 = identityVerificationActivity.A02;
                            if (imageView6 != null) {
                                imageView6.setFocusable(true);
                                ImageView imageView7 = identityVerificationActivity.A02;
                                if (imageView7 != null) {
                                    imageView7.setFocusableInTouchMode(true);
                                    ImageView imageView8 = identityVerificationActivity.A02;
                                    if (imageView8 != null) {
                                        imageView8.requestFocus();
                                        identityVerificationActivity.A05.A0K(identityVerificationActivity.A0b, 4000);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C18070vi.A11("resultView");
        throw null;
    }

    private final void A0y(boolean z) {
        MenuItem menuItem = this.A0S;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
        int i = 0;
        findViewById(2131430949).setVisibility(C72453Mb.A07(z ? 1 : 0));
        findViewById(2131436724).setVisibility(C72453Mb.A07(z));
        View findViewById = findViewById(2131434249);
        if (!z) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public void A2y() {
        if (!this.A0X) {
            this.A0X = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r3 = A0A2.A00;
            C109005cf.A0d(A0A2, r3, this);
            C109005cf.A0e(A0A2, r3, this, r3.A5A);
            this.A0O = C000200d.A00(A0A2.A0c);
            this.A09 = (C25491Ok) A0A2.A1F.get();
            this.A0E = (AnonymousClass1RK) A0A2.A2R.get();
            this.A07 = AnonymousClass10E.A4z(A0A2);
            this.A0A = AnonymousClass3Ma.A0T(A0A2);
            this.A04 = (C56342hJ) A0K2.A1O.get();
            this.A0M = C108975cc.A0O(A0A2);
            this.A0F = (C133166oH) r3.ABH.get();
            this.A05 = (C25591Ou) A0A2.A54.get();
            this.A0K = AnonymousClass1K1.A1C(A0K2);
            this.A06 = C108985cd.A0N(A0A2);
            this.A0N = AnonymousClass3MY.A0e(r3);
            this.A0P = C000200d.A00(A0A2.A6x);
            this.A0H = AnonymousClass1K1.A1B(A0K2);
            this.A0Q = C000200d.A00(A0A2.ABC);
            this.A08 = AnonymousClass3MZ.A0g(A0A2);
            this.A0I = AnonymousClass3MY.A0Z(A0A2);
            this.A0B = AnonymousClass3Ma.A0b(A0A2);
        }
    }

    public void A3h(int i) {
        if (i == 101) {
            A0t(this);
            this.A0R = false;
        }
    }

    public final C136676uC A4b() {
        C136676uC r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("qrCodeValidationUtil");
        throw null;
    }

    public final C139306yc A4c() {
        C139306yc r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("keyTransparencyManager");
        throw null;
    }

    public void Bvi(DeviceJid deviceJid) {
        A0u(this, deviceJid.userJid);
    }

    public void Bvk(DeviceJid deviceJid) {
        A0u(this, deviceJid.userJid);
    }

    public void finish() {
        WaQrScannerView waQrScannerView = this.A0L;
        if (waQrScannerView != null && waQrScannerView.getVisibility() == 0 && findViewById(2131432248).getVisibility() == 8) {
            A4b().A02((Runnable) null);
        } else {
            super.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C22941Dw r0 = UserJid.Companion;
            UserJid A032 = C22941Dw.A03(C108955ca.A0r(this, "jid"));
            this.A0J = A032;
            AnonymousClass1M9 r02 = this.A07;
            if (r02 != null) {
                this.A0D = r02.A0H(A032);
                C139306yc A4c = A4c();
                UserJid userJid = this.A0J;
                if (userJid == null) {
                    C18070vi.A11("jid");
                    throw null;
                }
                boolean A002 = A4c.A00(userJid);
                int i = 2131625566;
                if (A002) {
                    i = 2131625567;
                }
                setContentView(i);
                C139306yc A4c2 = A4c();
                UserJid userJid2 = this.A0J;
                if (userJid2 == null) {
                    C18070vi.A11("jid");
                    throw null;
                }
                int i2 = 2131897794;
                if (A4c2.A00(userJid2)) {
                    i2 = 2131897795;
                }
                setTitle(i2);
                Toolbar A0F2 = AnonymousClass3Ma.A0F(this);
                this.A0V = A0F2;
                if (A0F2 == null) {
                    C18070vi.A11("toolbar");
                    throw null;
                }
                C18000vb r6 = this.A00;
                Drawable A003 = C40501uo.A00((Resources.Theme) null, getResources(), 2131231675);
                if (A003 != null) {
                    A0F2.setNavigationIcon((Drawable) new C74743cP(AnonymousClass4aX.A08(A003, AnonymousClass3Ma.A01(this, getResources(), 2130970061, 2131101199)), r6));
                    Toolbar toolbar = this.A0V;
                    if (toolbar == null) {
                        C18070vi.A11("toolbar");
                        throw null;
                    }
                    toolbar.setTitle(i2);
                    AnonymousClass11S r1 = this.A02;
                    AnonymousClass1E7 r03 = this.A0D;
                    if (r03 == null) {
                        C18070vi.A11("contact");
                        throw null;
                    }
                    boolean A1V = AnonymousClass3Ma.A1V(r1, r03);
                    Toolbar toolbar2 = this.A0V;
                    if (A1V) {
                        if (toolbar2 == null) {
                            C18070vi.A11("toolbar");
                            throw null;
                        }
                        C24921Me r3 = this.A08;
                        if (r3 != null) {
                            C18000vb r12 = this.A00;
                            AnonymousClass1E7 r04 = this.A0D;
                            if (r04 == null) {
                                C18070vi.A11("contact");
                                throw null;
                            }
                            toolbar2.setSubtitle((CharSequence) AnonymousClass2T2.A00(this, r3, r12, r04));
                        } else {
                            C18070vi.A11("waContactNames");
                            throw null;
                        }
                    } else if (toolbar2 == null) {
                        C18070vi.A11("toolbar");
                        throw null;
                    } else {
                        Object[] objArr = new Object[1];
                        C24921Me r13 = this.A08;
                        if (r13 != null) {
                            AnonymousClass1E7 r05 = this.A0D;
                            if (r05 == null) {
                                C18070vi.A11("contact");
                                throw null;
                            }
                            String A0q = C17880vN.A0q(this, AnonymousClass3MY.A0q(r13, r05), objArr, 0, 2131897773);
                            Toolbar toolbar3 = this.A0V;
                            if (toolbar3 == null) {
                                C18070vi.A11("toolbar");
                                throw null;
                            }
                            toolbar2.setSubtitle(C43251zV.A05(toolbar3.getContext(), this.A0D, A0q));
                        } else {
                            C18070vi.A11("waContactNames");
                            throw null;
                        }
                    }
                    Toolbar toolbar4 = this.A0V;
                    if (toolbar4 == null) {
                        C18070vi.A11("toolbar");
                        throw null;
                    }
                    toolbar4.setBackgroundResource(AnonymousClass4Z9.A01(AnonymousClass3MY.A04(toolbar4), false));
                    toolbar4.A0Q(this, 2132083960);
                    toolbar4.setNavigationOnClickListener(new C90044dR((Object) this, 36));
                    Toolbar toolbar5 = this.A0V;
                    if (toolbar5 == null) {
                        C18070vi.A11("toolbar");
                        throw null;
                    }
                    setSupportActionBar(toolbar5);
                    C139306yc A4c3 = A4c();
                    UserJid userJid3 = this.A0J;
                    if (userJid3 == null) {
                        C18070vi.A11("jid");
                        throw null;
                    } else if (A4c3.A00(userJid3)) {
                        View view = this.A00;
                        C18070vi.A0X(view);
                        C130576jf r4 = new C130576jf(view);
                        this.A0G = r4;
                        String A0F3 = C18070vi.A0F(this, 2131897788);
                        int A092 = C72453Mb.A09(this);
                        TextEmojiLabel textEmojiLabel = r4.A04;
                        textEmojiLabel.setHeight(C108985cd.A06(textEmojiLabel, ((int) Math.ceil(((double) textEmojiLabel.getPaint().measureText(A0F3)) / ((double) A092))) * textEmojiLabel.getLineHeight()));
                        A0Q();
                        C130576jf r06 = this.A0G;
                        if (r06 == null) {
                            C18070vi.A11("soteriaViewHolder");
                            throw null;
                        }
                        C825148g.A00(r06.A07, this, 36);
                        A0w(this, false);
                        C130576jf r07 = this.A0G;
                        if (r07 == null) {
                            C18070vi.A11("soteriaViewHolder");
                            throw null;
                        }
                        r07.A06.setEnabled(false);
                        if (C18020vd.A05(C18040vf.A02, this.A0E, 8926)) {
                            C146447Pd r62 = new C146447Pd(this, 5);
                            C130576jf r08 = this.A0G;
                            if (r08 == null) {
                                C18070vi.A11("soteriaViewHolder");
                                throw null;
                            }
                            TextEmojiLabel textEmojiLabel2 = r08.A02;
                            C36401np r42 = this.A0N;
                            if (r42 != null) {
                                textEmojiLabel2.setText(r42.A05(textEmojiLabel2.getContext(), r62, getString(2131886634), "learn-how-this-works"));
                                C130576jf r09 = this.A0G;
                                if (r09 == null) {
                                    C18070vi.A11("soteriaViewHolder");
                                    throw null;
                                } else {
                                    AnonymousClass3Ma.A1I(r09.A02, this.A0E);
                                }
                            } else {
                                C18070vi.A11("linkifier");
                                throw null;
                            }
                        } else {
                            AnonymousClass129 r14 = this.A0M;
                            if (r14 != null) {
                                String A062 = r14.A06("28030015");
                                C18070vi.A0X(A062);
                                C130576jf r010 = this.A0G;
                                if (r010 == null) {
                                    C18070vi.A11("soteriaViewHolder");
                                    throw null;
                                }
                                TextEmojiLabel textEmojiLabel3 = r010.A02;
                                Spanned fromHtml = Html.fromHtml(C17890vO.A0R(this, A062, 1, 0, 2131886633));
                                C18070vi.A0X(fromHtml);
                                A0c(fromHtml, textEmojiLabel3, this);
                                return;
                            }
                            C18070vi.A11("faqLinkFactory");
                            throw null;
                        }
                    } else {
                        this.A0U = AnonymousClass3MX.A0L(this, 2131431514);
                        this.A03 = (ProgressBar) findViewById(2131434181);
                        this.A0T = AnonymousClass3MX.A0L(this, 2131430526);
                        this.A0L = (WaQrScannerView) findViewById(2131434258);
                        this.A01 = findViewById(2131431358);
                        if (!this.A0A.A2M() && this.A0A.A2b("security_notifications_alert_timestamp", 2592000000L)) {
                            View view2 = this.A01;
                            if (view2 == null) {
                                C18070vi.A11("securityNotificationView");
                                throw null;
                            }
                            view2.postDelayed(new C146447Pd(this, 2), 1000);
                        }
                        C90044dR.A00(AnonymousClass3MY.A0H(this, 2131430399), this, 37);
                        C825148g.A00(AnonymousClass3MY.A0H(this, 2131429132), this, 37);
                        C136676uC A4b = A4b();
                        View view3 = this.A00;
                        C18070vi.A0X(view3);
                        UserJid userJid4 = this.A0J;
                        if (userJid4 == null) {
                            C18070vi.A11("jid");
                            throw null;
                        }
                        A4b.A01(view3, new AnonymousClass7IG(this, 0), userJid4);
                        C136676uC A4b2 = A4b();
                        WaQrScannerView waQrScannerView = A4b2.A0G;
                        if (waQrScannerView != null) {
                            waQrScannerView.setQrDecodeHints(A4b2.A0I);
                            waQrScannerView.setQrScannerCallback(new C145437Lg(A4b2));
                        }
                        A0y(false);
                        A0w(this, false);
                        this.A02 = AnonymousClass3MX.A0I(this, 2131434658);
                        C90044dR.A00(findViewById(2131434805), this, 38);
                        if (!AnonymousClass112.A0A()) {
                            C219217x r15 = this.A0B;
                            if (r15 == null) {
                                C18070vi.A11("waPermissionsHelper");
                                throw null;
                            } else if (r15.A02("android.permission.NFC") == 0) {
                                NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this);
                                if (defaultAdapter != null) {
                                    try {
                                        Method method = NfcAdapter.class.getMethod("setNdefPushMessageCallback", new Class[]{NfcAdapter.CreateNdefMessageCallback.class, Activity.class, Activity[].class});
                                        C18070vi.A0X(method);
                                        method.invoke(defaultAdapter, new Object[]{new C64282uW(this, 0), this, new Activity[0]});
                                    } catch (Exception e) {
                                        if ((e instanceof IllegalStateException) || (e instanceof SecurityException) || (e instanceof NoSuchMethodException) || (e instanceof IllegalAccessException) || (e instanceof InvocationTargetException)) {
                                            Log.w("idverification/ ", e);
                                        }
                                    }
                                }
                                if ("android.nfc.action.NDEF_DISCOVERED".equals(getIntent().getAction())) {
                                    Intent intent = getIntent();
                                    C18070vi.A0X(intent);
                                    A0V(intent);
                                }
                            }
                        }
                        AnonymousClass00H r011 = this.A0O;
                        if (r011 != null) {
                            C72453Mb.A1Q(r011, this);
                            C25591Ou r012 = this.A05;
                            if (r012 != null) {
                                r012.registerObserver(this);
                                AnonymousClass00H r013 = this.A0Q;
                                if (r013 != null) {
                                    C72453Mb.A1Q(r013, this);
                                    AnonymousClass1RK r16 = this.A0E;
                                    if (r16 != null) {
                                        r16.registerObserver(this.A0Y);
                                    } else {
                                        C18070vi.A11("companionDeviceManager");
                                        throw null;
                                    }
                                } else {
                                    C18070vi.A11("userDeviceChangeObservers");
                                    throw null;
                                }
                            } else {
                                C18070vi.A11("identityObservers");
                                throw null;
                            }
                        } else {
                            C18070vi.A11("axolotlSessionObservable");
                            throw null;
                        }
                    }
                } else {
                    throw C17880vN.A0g();
                }
            } else {
                C18070vi.A11("contactManager");
                throw null;
            }
        } catch (AnonymousClass11T e2) {
            Log.e("idverification/finishing due to invalid jid", e2);
            finish();
        }
    }

    public IdentityVerificationActivity(int i) {
        this.A0X = false;
        C1423279a.A00(this, 2);
    }

    private final void A0Q() {
        String str;
        C139306yc A4c = A4c();
        UserJid userJid = this.A0J;
        if (userJid == null) {
            str = "jid";
        } else {
            if (!A4c.A00(userJid)) {
                runOnUiThread(new C146507Pj(this, AnonymousClass00R.A0C, 16));
            }
            AnonymousClass1E7 r0 = this.A0D;
            if (r0 == null) {
                str = "contact";
            } else {
                Jid A012 = AnonymousClass1E7.A01(r0);
                PhoneUserJid A002 = AnonymousClass11S.A00(this.A02);
                if (A002 != null) {
                    Object[] objArr = new UserJid[2];
                    if (A012 != null) {
                        objArr[0] = A012;
                        List A0O2 = C18070vi.A0O(A002, objArr, 1);
                        C56342hJ r1 = this.A04;
                        if (r1 != null) {
                            r1.A00(new C144677Ig(this), A0O2).A00(1);
                            return;
                        }
                        str = "deviceIdentityVerifierFactory";
                    } else {
                        throw C17880vN.A0g();
                    }
                } else {
                    return;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0d(IdentityVerificationActivity identityVerificationActivity) {
        String str;
        C139306yc A4c = identityVerificationActivity.A4c();
        UserJid userJid = identityVerificationActivity.A0J;
        if (userJid == null) {
            str = "jid";
        } else if (!A4c.A00(userJid)) {
            ProgressBar progressBar = identityVerificationActivity.A03;
            if (progressBar == null) {
                str = "progressBar";
            } else {
                progressBar.setVisibility(8);
                return;
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0w(IdentityVerificationActivity identityVerificationActivity, boolean z) {
        AnonymousClass7IE r5;
        String str;
        identityVerificationActivity.CEx();
        if (z) {
            r5 = identityVerificationActivity.A0a;
        } else {
            r5 = identityVerificationActivity.A0Z;
        }
        C133166oH r4 = identityVerificationActivity.A0F;
        if (r4 != null) {
            AnonymousClass1E7 r0 = identityVerificationActivity.A0D;
            if (r0 == null) {
                str = "contact";
            } else {
                UserJid A0x = AnonymousClass3MZ.A0x(r0);
                C18070vi.A0d(r5, 1);
                C200710s r3 = r4.A08;
                r3.A03();
                new C121946Mc(r5, r4, A0x).A02.executeOnExecutor(r3, new Void[0]);
                return;
            }
        } else {
            str = "fingerprintUtil";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void C9k(UserJid userJid, Set set, Set set2) {
        C18070vi.A0i(userJid, set2);
        if (!set.isEmpty() || !set2.isEmpty()) {
            A0u(this, userJid);
        }
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        AnonymousClass00H r0 = this.A0O;
        if (r0 != null) {
            C108965cb.A1L(r0, this);
            C25591Ou r02 = this.A05;
            if (r02 != null) {
                r02.unregisterObserver(this);
                AnonymousClass00H r03 = this.A0Q;
                if (r03 != null) {
                    C108965cb.A1L(r03, this);
                    AnonymousClass1RK r1 = this.A0E;
                    if (r1 != null) {
                        r1.unregisterObserver(this.A0Y);
                        this.A05.A0I(this.A0b);
                        C136676uC A4b = A4b();
                        A4b.A02 = null;
                        A4b.A0G = null;
                        A4b.A0F = null;
                        A4b.A01 = null;
                        A4b.A06 = null;
                        A4b.A05 = null;
                        return;
                    }
                    str = "companionDeviceManager";
                } else {
                    str = "userDeviceChangeObservers";
                }
            } else {
                str = "identityObservers";
            }
        } else {
            str = "axolotlSessionObservable";
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 2131432625) {
            WaQrScannerView waQrScannerView = this.A0L;
            if (waQrScannerView == null || waQrScannerView.getVisibility() != 0) {
                A0r(this);
                return true;
            }
            A4b().A02(new C146447Pd(this, 6));
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }

    public void onPause() {
        WaQrScannerView waQrScannerView;
        WaQrScannerView waQrScannerView2;
        super.onPause();
        C139306yc A4c = A4c();
        UserJid userJid = this.A0J;
        if (userJid == null) {
            C18070vi.A11("jid");
            throw null;
        } else if (!A4c.A00(userJid) && (waQrScannerView = this.A0L) != null && waQrScannerView.getVisibility() == 0 && (waQrScannerView2 = this.A0L) != null) {
            waQrScannerView2.setVisibility(4);
        }
    }

    public void onResume() {
        WaQrScannerView waQrScannerView;
        super.onResume();
        C139306yc A4c = A4c();
        UserJid userJid = this.A0J;
        if (userJid == null) {
            C18070vi.A11("jid");
            throw null;
        } else if (!A4c.A00(userJid) && (waQrScannerView = this.A0L) != null && waQrScannerView.getVisibility() == 4) {
            C108975cc.A0q(this.A0L);
        }
    }

    public IdentityVerificationActivity() {
        this(0);
        this.A0b = new C146447Pd(this, 3);
        this.A0Y = new C95524mN(this, 2);
        this.A0Z = new C1192467i(this, 0);
        this.A0a = new C1192467i(this, 1);
    }
}
