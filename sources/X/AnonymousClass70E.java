package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.conversation.conversationrow.TemplateButtonListBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.70E  reason: invalid class name */
public class AnonymousClass70E {
    public final AnonymousClass1L9 A00;
    public final C36391no A01;
    public final C32981i4 A02;
    public final C18030ve A03;
    public final A19 A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass4VN A0F;
    public final AnonymousClass12L A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    public static void A00(Context context, AnonymousClass70E r10, AnonymousClass3uP r11, AnonymousClass206 r12, C61762qD r13, boolean z) {
        String str;
        AnonymousClass70E r4 = r10;
        C61762qD r6 = r13;
        AnonymousClass206 r5 = r12;
        ((C190319kk) r10.A0B.get()).A00(r12, "cta-url", String.valueOf(r13.A06));
        AnonymousClass00H r3 = r10.A0C;
        if (!((AnonymousClass70P) r3.get()).A08(r13) && !((AnonymousClass70P) r3.get()).A07(r13)) {
            AnonymousClass00H r2 = r10.A09;
            if (((C136286tZ) r2.get()).A02(r13)) {
                C439421n r1 = (C439421n) r11.getFMessage();
                C136286tZ r32 = (C136286tZ) r2.get();
                C18070vi.A0d(r1, 0);
                List list = r1.BaE().A06;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C61762qD r14 = (C61762qD) it.next();
                        C18070vi.A0b(r14);
                        if (r32.A02(r14)) {
                            if (r14 != null) {
                                str = r32.A00(r14.A01);
                            }
                        }
                    }
                }
                str = null;
                r32.A01(str);
                r10.A05.CGF(new C70773Cl(r10, r12, r13, 48));
            } else {
                String str2 = r13.A01;
                AnonymousClass1FU r22 = (AnonymousClass1FU) C18050vg.A01(context, AnonymousClass1FU.class);
                if (r22 != null) {
                    Set A002 = r10.A01.A00(r12.A0I(), str2);
                    if (A002 != null) {
                        r22.CMl(C123646Vg.A00(str2, r12.A0v.A01, A002));
                        return;
                    }
                } else {
                    Log.e("ClickToActionButtonUtils/suspiciousLinkHandler/error: not click in Conversation");
                }
                r10.A05.CGF(new AnonymousClass7RT(r4, r5, r6, 18, z));
                r10.A04(context, r12, r13);
                return;
            }
        } else if (((AnonymousClass70P) r3.get()).A08(r13)) {
            ((AnonymousClass70P) r3.get()).A05((C439521o) r11.getFMessage(), 2);
        } else if (((AnonymousClass70P) r3.get()).A07(r13)) {
            ((AnonymousClass70P) r3.get()).A04(context, (C439521o) r11.getFMessage(), 2);
        } else {
            return;
        }
        C108885cS A012 = C88404Zo.A01(r11.getContext());
        if (A012 != null) {
            A012.CDo();
        }
    }

    public void A01(Context context, TextEmojiLabel textEmojiLabel, AnonymousClass3uP r15, TemplateButtonListBottomSheet templateButtonListBottomSheet, C61762qD r17, boolean z, boolean z2) {
        int A002;
        CharSequence A012;
        long parseLong;
        Context context2 = context;
        C108995ce.A0k(context, textEmojiLabel, this.A0F);
        C61762qD r8 = r17;
        if (C43381zi.A02(this.A03, r8)) {
            A012 = r8.A09;
        } else {
            AnonymousClass00H r4 = this.A0C;
            if (((AnonymousClass70P) r4.get()).A07(r8)) {
                A012 = Uri.parse(r8.A01).getQueryParameter("cta_display_name");
            } else {
                if (z2) {
                    A002 = 2131102701;
                } else {
                    A002 = AnonymousClass1YL.A00(context, 2130971977, 2131103150);
                }
                if (!z) {
                    A002 = 2131100251;
                }
                int i = 2131232150;
                if (r8.A07 == 3) {
                    i = 2131231762;
                } else if (((AnonymousClass70P) r4.get()).A08(r8) || ((C136286tZ) this.A09.get()).A02(r8)) {
                    i = 2131231835;
                }
                Drawable A022 = AnonymousClass4aX.A02(context, i, A002);
                A022.setAlpha(204);
                Resources resources = context.getResources();
                int i2 = 2131169001;
                if (z2) {
                    i2 = 2131168999;
                }
                int dimensionPixelSize = resources.getDimensionPixelSize(i2);
                A012 = C72813Np.A01(textEmojiLabel.getPaint(), A022, r8.A09, dimensionPixelSize, context.getResources().getInteger(2131492940));
            }
        }
        textEmojiLabel.setText(A012);
        AnonymousClass00H r1 = this.A0C;
        AnonymousClass3uP r9 = r15;
        if (((AnonymousClass70P) r1.get()).A07(r8)) {
            AnonymousClass70P r3 = (AnonymousClass70P) r1.get();
            AnonymousClass206 fMessage = r15.getFMessage();
            C18070vi.A0d(fMessage, 1);
            if (r8.A0B.get() == 1) {
                long A052 = AnonymousClass3MZ.A05(r3.A00, fMessage);
                TimeUnit timeUnit = TimeUnit.MINUTES;
                String queryParameter = Uri.parse(r8.A01).getQueryParameter("code_expiration_minutes");
                if (queryParameter == null) {
                    parseLong = 10;
                } else {
                    parseLong = Long.parseLong(queryParameter);
                }
                if (A052 > timeUnit.toMillis(parseLong)) {
                    textEmojiLabel.setClickable(false);
                    AnonymousClass3MX.A1C(context, textEmojiLabel, 2131100251);
                    return;
                }
            }
        }
        textEmojiLabel.setClickable(true);
        textEmojiLabel.setOnClickListener(new AnonymousClass78H(this, context2, r8, r9, templateButtonListBottomSheet, 2));
    }

    public void A02(Context context, AnonymousClass3uP r17, AnonymousClass206 r18, C61762qD r19, String str, boolean z, boolean z2) {
        DialogFragment waDialogFragment;
        AnonymousClass206 r10 = r18;
        AnonymousClass1BI r5 = r10.A0v.A00;
        Context context2 = context;
        AnonymousClass1FU r4 = (AnonymousClass1FU) C18050vg.A01(context2, AnonymousClass1FU.class);
        if (r5 != null && r4 != null) {
            if (((AnonymousClass73F) this.A0H.get()).A05()) {
                waDialogFragment = AnonymousClass4GZ.A00(r5, AnonymousClass00R.A00);
            } else {
                waDialogFragment = new WaDialogFragment();
                AnonymousClass1D6[] r2 = new AnonymousClass1D6[1];
                AnonymousClass1D6.A03("chat.jid", r5.getRawString(), r2, 0);
                AnonymousClass3MX.A1I(waDialogFragment, r2);
            }
            if (waDialogFragment instanceof C107315Zf) {
                ((C107315Zf) waDialogFragment).CIB(new AnonymousClass7FY(context2, waDialogFragment, this, r17, r10, r19, str, z, z2));
            }
            r4.CMl(waDialogFragment);
        }
    }

    public void A03(Context context, AnonymousClass3uP r16, C61762qD r17, boolean z) {
        AnonymousClass706 r2;
        Boolean A1A;
        int i;
        AnonymousClass3uP r8 = r16;
        AnonymousClass206 fMessage = r8.getFMessage();
        C61762qD r10 = r17;
        int i2 = r10.A07;
        if (i2 != 1) {
            Context context2 = context;
            if (i2 == 2) {
                String str = r10.A0A;
                UserJid A0I2 = fMessage.A0I();
                AnonymousClass00H r22 = this.A08;
                ((AnonymousClass706) r22.get()).A04(fMessage, C108945cZ.A1A(AnonymousClass1EG.A0H(str)), 0, false);
                boolean z2 = z;
                if (A05(fMessage)) {
                    A02(context2, r8, fMessage, r10, str, false, z2);
                    if (A0I2 != null) {
                        ((AnonymousClass706) r22.get()).A01(A0I2);
                        ((AnonymousClass706) r22.get()).A04(fMessage, C108945cZ.A1A(AnonymousClass1EG.A0H(str)), 2, false);
                        return;
                    }
                    return;
                }
                ((AnonymousClass706) r22.get()).A04(fMessage, C108945cZ.A1A(AnonymousClass1EG.A0H(str)), 3, false);
                if (A0I2 == null || !((AnonymousClass73F) this.A0H.get()).A08(A0I2) || str == null || str.isEmpty()) {
                    r2 = (AnonymousClass706) r22.get();
                    A1A = C108945cZ.A1A(AnonymousClass1EG.A0H(str));
                    i = 5;
                } else {
                    r10.A01 = str;
                    ((AnonymousClass706) r22.get()).A01(A0I2);
                    r2 = (AnonymousClass706) r22.get();
                    A1A = C108945cZ.A1A(AnonymousClass1EG.A0H(str));
                    i = 4;
                }
                r2.A04(fMessage, A1A, i, false);
                A00(context, this, r8, fMessage, r10, z2);
            } else if (i2 == 3) {
                ((C190319kk) this.A0B.get()).A00(fMessage, "cta-call", String.valueOf(r10.A06));
                this.A05.CGF(new C70773Cl(this, fMessage, r10, 47));
                AnonymousClass1L9 r23 = this.A00;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("tel:");
                r23.CGU(context, Uri.parse(AnonymousClass000.A0y(r10.A01, A10)), (AnonymousClass206) null);
            }
        } else {
            Log.e("ClickToActionButtonUtils/fillButton/the button is in wrong type.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0113, code lost:
        if ("compact".equalsIgnoreCase(r6) == false) goto L_0x0116;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(android.content.Context r21, X.AnonymousClass206 r22, X.C61762qD r23) {
        /*
            r20 = this;
            r5 = r22
            r2 = r20
            X.0ve r1 = r2.A03
            r3 = r23
            boolean r0 = X.C43381zi.A02(r1, r3)
            r14 = r21
            if (r0 == 0) goto L_0x0025
            X.00H r0 = r2.A0E
            r0.get()
            java.lang.String r4 = r3.A01
            java.lang.String r3 = "research-survey"
            r1 = 1
            r0 = 0
            android.content.Intent r1 = X.AnonymousClass1LU.A1g(r14, r4, r3, r1, r0)
        L_0x001f:
            X.1L9 r0 = r2.A00
            r0.A08(r14, r1)
            return
        L_0x0025:
            java.lang.String r7 = r3.A01
            X.1i4 r4 = r2.A02     // Catch:{ Exception -> 0x0051 }
            android.net.Uri r0 = android.net.Uri.parse(r7)     // Catch:{ Exception -> 0x0051 }
            int r4 = r4.A0E(r0)     // Catch:{ Exception -> 0x0051 }
            r0 = 1
            if (r4 == r0) goto L_0x0063
            X.00H r0 = r2.A07
            java.lang.Object r1 = r0.get()
            X.A74 r1 = (X.A74) r1
            r0 = 4
            X.A74.A03(r1, r5, r0)
            X.00H r0 = r2.A0E
            r0.get()
            java.lang.String r0 = r3.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 2
            android.content.Intent r1 = X.AnonymousClass1LU.A0O(r14, r1, r0)
            goto L_0x001f
        L_0x0051:
            r6 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ClickToActionButtonUtils/isDeepLinkUri/<"
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = "> is not a valid URL. Error="
            X.C17900vP.A0X(r6, r0, r4)
        L_0x0063:
            X.12L r4 = r2.A0G
            if (r22 == 0) goto L_0x008a
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C42761yh.A01(r4, r0)
            if (r0 == 0) goto L_0x008a
            X.00H r0 = r2.A07
            java.lang.Object r1 = r0.get()
            X.A74 r1 = (X.A74) r1
            r0 = 4
            X.A74.A03(r1, r5, r0)
        L_0x007d:
            X.1L9 r2 = r2.A00
            java.lang.String r0 = r3.A01
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r2.CGU(r14, r1, r0)
            return
        L_0x008a:
            r0 = 11720(0x2dc8, float:1.6423E-41)
            X.0vf r4 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r7 = r3.A01
            X.205 r0 = r5.A0v
            X.1BI r6 = r0.A00
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            if (r6 == 0) goto L_0x00eb
            boolean r0 = X.C196919vr.A01(r1, r6, r7)
            if (r0 == 0) goto L_0x00eb
        L_0x00a6:
            r8 = 1
        L_0x00a7:
            X.205 r6 = r5.A0v
            X.1BI r9 = r6.A00
            java.lang.String r0 = r3.A01
            java.lang.String r7 = X.C196919vr.A00(r1, r9, r0)
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0118
            if (r8 != 0) goto L_0x0118
            java.lang.String r0 = "webview"
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "browser_tab"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x007d
            java.util.List r1 = java.util.Collections.emptyList()
            r0 = 0
            java.lang.String r0 = X.AnonymousClass0DQ.A00(r14, r1, r0)
            if (r0 == 0) goto L_0x007d
            X.0Mv r0 = new X.0Mv
            r0.<init>()
            X.0Gx r1 = r0.A01()
            java.lang.String r0 = r3.A01
            android.net.Uri r0 = com.whatsapp.wamsys.SecureUriParser.parseEncodedRFC2396(r0)
            android.content.Intent r1 = r1.A00
            r1.setData(r0)
            r0 = 0
            r14.startActivity(r1, r0)
            return
        L_0x00eb:
            r0 = 5970(0x1752, float:8.366E-42)
            boolean r0 = X.C18020vd.A05(r4, r1, r0)
            if (r0 == 0) goto L_0x0116
            java.lang.String r0 = r3.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0116
            java.lang.String r0 = "full"
            java.lang.String r6 = r3.A03
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "tall"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = "compact"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0116
            goto L_0x00a6
        L_0x0116:
            r8 = 0
            goto L_0x00a7
        L_0x0118:
            X.10I r8 = r2.A05
            r7 = 41
            X.7Pi r0 = new X.7Pi
            r0.<init>(r2, r3, r7)
            r8.CGF(r0)
            X.A19 r8 = r2.A04
            boolean r0 = r5 instanceof X.C439521o
            if (r0 == 0) goto L_0x01c9
            X.21o r5 = (X.C439521o) r5
            X.2k6 r0 = r5.A00
            java.lang.String r11 = r0.A05
        L_0x0130:
            java.lang.String r10 = "marketing_msg_webview"
            r12 = 0
            r13 = r12
            r8.A01(r9, r10, r11, r12, r13)
            if (r9 == 0) goto L_0x01c6
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://api.whatsapp.com/send/?phone="
            r5.append(r0)
            java.lang.String r0 = r9.user
            java.lang.String r16 = X.AnonymousClass000.A0y(r0, r5)
        L_0x0148:
            java.lang.String r15 = r3.A01
            X.00H r0 = r2.A0E
            r0.get()
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = r6.A01
            r5.append(r0)
            int r3 = r3.A06
            java.lang.String r18 = X.C17880vN.A0t(r5, r3)
            r17 = 0
            r19 = 1
            android.content.Intent r3 = X.AnonymousClass1LU.A1f(r14, r15, r16, r17, r18, r19)
            java.lang.String r5 = "webview_should_ask_before_close"
            r3.putExtra(r5, r12)
            java.lang.String r5 = "message_cta_type"
            r3.putExtra(r5, r10)
            r5 = 10466(0x28e2, float:1.4666E-41)
            boolean r5 = X.C18020vd.A05(r4, r1, r5)
            r6 = r5 ^ 1
            java.lang.String r5 = "clear_webview"
            r3.putExtra(r5, r6)
            r7 = 11115(0x2b6b, float:1.5575E-41)
            boolean r5 = X.C18020vd.A05(r4, r1, r7)
            r6 = r5 ^ 1
            java.lang.String r5 = "webview_open_new_tab_in_external_browser"
            r3.putExtra(r5, r6)
            boolean r6 = X.C18020vd.A05(r4, r1, r7)
            java.lang.String r5 = "show_app_redirection_dialog"
            r3.putExtra(r5, r6)
            r5 = 12558(0x310e, float:1.7598E-41)
            boolean r6 = X.C18020vd.A05(r4, r1, r5)
            java.lang.String r5 = "user_gesture_check_enabled"
            r3.putExtra(r5, r6)
            java.lang.String r5 = "message_id"
            r3.putExtra(r5, r0)
            r0 = 11383(0x2c77, float:1.5951E-41)
            boolean r1 = X.C18020vd.A05(r4, r1, r0)
            java.lang.String r0 = "report_menu_option"
            r3.putExtra(r0, r1)
            if (r9 == 0) goto L_0x01b9
            java.lang.String r1 = r9.getRawString()
            java.lang.String r0 = "webview_receiver_jid"
            r3.putExtra(r0, r1)
        L_0x01b9:
            if (r11 == 0) goto L_0x01c0
            java.lang.String r0 = "webview_message_template_id"
            r3.putExtra(r0, r11)
        L_0x01c0:
            X.1L9 r0 = r2.A00
            r0.A08(r14, r3)
            return
        L_0x01c6:
            r16 = 0
            goto L_0x0148
        L_0x01c9:
            r11 = 0
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass70E.A04(android.content.Context, X.206, X.2qD):void");
    }

    public boolean A05(AnonymousClass206 r10) {
        String str;
        int i;
        AnonymousClass7S1 r0;
        AnonymousClass1BI r4 = r10.A0v.A00;
        C20956AcA A002 = AnonymousClass9RV.A00(r10);
        if (r10 instanceof C439521o) {
            str = ((C439521o) r10).A00.A05;
        } else {
            str = null;
        }
        if (r4 == null || A002 == null || !A002.A02) {
            return false;
        }
        AnonymousClass73F r3 = (AnonymousClass73F) this.A0H.get();
        EAv eAv = (EAv) this.A0I.get();
        C18070vi.A0d(eAv, 1);
        if (!C18020vd.A05(C18040vf.A02, r3.A03, 5869)) {
            i = 3;
        } else if (((C133736pP) r3.A06.get()).A01(AnonymousClass00R.A01)) {
            AnonymousClass73F.A00(r3).A03(r4, str, 1);
            return false;
        } else if (((C133556oy) r3.A09.get()).A01()) {
            AnonymousClass73F.A00(r3).A03(r4, str, 2);
            return false;
        } else {
            AnonymousClass00H r7 = r3.A08;
            if (C18070vi.A03(((C127666ej) r7.get()).A01).getBoolean(r4.getRawString(), false)) {
                boolean A052 = r3.A05();
                if (!r3.A01.A2V() && (A052 || ((C145887Mz) eAv).A01("20210210") == 1)) {
                    return true;
                }
            }
            if (!C18070vi.A03(((C127666ej) r7.get()).A01).getBoolean(r4.getRawString(), false)) {
                i = 0;
            } else if (r3.A01.A2V()) {
                r0 = new AnonymousClass7S1(r4, r3, str, 1);
                AnonymousClass73F.A01(r3, r0);
                return false;
            } else {
                i = 2;
            }
        }
        r0 = new AnonymousClass7S1(r4, r3, str, i);
        AnonymousClass73F.A01(r3, r0);
        return false;
    }

    public AnonymousClass70E(AnonymousClass1L9 r2, AnonymousClass4VN r3, C36391no r4, C32981i4 r5, C18030ve r6, AnonymousClass12L r7, A19 a19, AnonymousClass10I r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17, AnonymousClass00H r18, AnonymousClass00H r19, AnonymousClass00H r20) {
        this.A03 = r6;
        this.A05 = r9;
        this.A00 = r2;
        this.A07 = r11;
        this.A02 = r5;
        this.A0B = r10;
        this.A01 = r4;
        this.A0F = r3;
        this.A0C = r12;
        this.A0G = r7;
        this.A0I = r13;
        this.A09 = r14;
        this.A04 = a19;
        this.A0H = r15;
        this.A0D = r16;
        this.A08 = r17;
        this.A06 = r18;
        this.A0A = r19;
        this.A0E = r20;
    }
}
