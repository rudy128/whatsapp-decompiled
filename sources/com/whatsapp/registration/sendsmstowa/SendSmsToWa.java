package com.whatsapp.registration.sendsmstowa;

import X.A3H;
import X.A9B;
import X.AFS;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass118;
import X.AnonymousClass19D;
import X.AnonymousClass1LU;
import X.AnonymousClass1NV;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Yv;
import X.AnonymousClass4a6;
import X.AnonymousClass6ML;
import X.AnonymousClass6VI;
import X.AnonymousClass758;
import X.AnonymousClass789;
import X.AnonymousClass7w9;
import X.C010105w;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C114855s6;
import X.C137496vY;
import X.C146767Qn;
import X.C153277pG;
import X.C1596585j;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17970vW;
import X.C18000vb;
import X.C18010vc;
import X.C18070vi;
import X.C18090vk;
import X.C192809p1;
import X.C196059uO;
import X.C19880zA;
import X.C21014Ad6;
import X.C26145Ct9;
import X.C27301Vn;
import X.C29491cN;
import X.C33641j9;
import X.C33841jT;
import X.C42771yi;
import X.C56462hV;
import X.C57352iw;
import X.C58712l8;
import X.C72453Mb;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.Telephony;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public final class SendSmsToWa extends C114855s6 implements C1596585j {
    public int A00;
    public C010105w A01;
    public C19880zA A02;
    public C56462hV A03;
    public AnonymousClass118 A04;
    public C27301Vn A05;
    public AnonymousClass19D A06;
    public C18010vc A07;
    public C196059uO A08;
    public C33841jT A09;
    public C33641j9 A0A;
    public C26145Ct9 A0B;
    public C21014Ad6 A0C;
    public C57352iw A0D;
    public SendSmsToWaViewModel A0E;
    public C192809p1 A0F;
    public AnonymousClass6ML A0G;
    public AnonymousClass1NV A0H;
    public WDSTextLayout A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public Runnable A0R;
    public String A0S = "send_sms_to_wa_fraud";
    public String A0T;
    public String A0U;
    public boolean A0V;
    public boolean A0W;
    public int A0X;
    public long A0Y;
    public String A0Z;
    public String A0a;
    public boolean A0b;
    public final Runnable A0c = new C146767Qn(this, 1);

    private final void A0V() {
        boolean A1T = AnonymousClass000.A1T(this.A00, 1);
        View A0D2 = AnonymousClass3MY.A0D(LayoutInflater.from(this), 2131626887);
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0T(false);
        A002.A0c(A0D2);
        C010105w A0L2 = AnonymousClass3MY.A0L(A002);
        TextEmojiLabel A0c2 = C72453Mb.A0c(A0D2, 2131429980);
        TextView A0E2 = AnonymousClass3Ma.A0E(A0D2, 2131433997);
        View A052 = C18070vi.A05(A0D2, 2131432938);
        String A10 = AnonymousClass3Ma.A10(this, A0Q(this), new Object[1], 0, 2131895727);
        AnonymousClass3Ma.A1L(this.A0E, A0c2);
        AnonymousClass3Ma.A1K(A0c2, this.A08);
        A0c2.setText(A3H.A00(this, (TextAppearanceSpan) null, new C146767Qn(this, 4), A10, "edit-number", 0, false));
        int i = 2131897757;
        if (A1T) {
            i = 2131897146;
        }
        AnonymousClass3MY.A0x(this, A0E2, i);
        A0E2.setOnClickListener(new AnonymousClass789(A0L2, this, 5, A1T));
        A052.setOnClickListener(new AFS(A0L2, 33));
        if (!A1T) {
            A052.setVisibility(8);
        }
        A0L2.show();
        C108975cc.A0N(this).A0C("send_sms_to_wa_no_received_dialog");
    }

    public static final void A0q(SendSmsToWa sendSmsToWa) {
        AnonymousClass4Yv.A00(sendSmsToWa, 1);
        AnonymousClass4Yv.A00(sendSmsToWa, 2);
        sendSmsToWa.A0W = false;
        sendSmsToWa.A0Y = 0;
        AnonymousClass1NV r0 = sendSmsToWa.A0H;
        if (r0 == null) {
            C18070vi.A11("exponentialBackoffProvider");
            throw null;
        }
        r0.A02();
        sendSmsToWa.A0X = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01e1, code lost:
        if (r2.length() != 0) goto L_0x01e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r4 = r13
            super.onCreate(r14)
            X.C72463Mc.A0t(r13)
            r0 = 2131626886(0x7f0e0b86, float:1.888102E38)
            r13.setContentView((int) r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r13)
            java.lang.Class<com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel> r0 = com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel r0 = (com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel) r0
            r13.A0E = r0
            X.2iw r0 = r13.A0D
            if (r0 == 0) goto L_0x0202
            r0.A00(r13)
            X.0z4 r1 = r13.A0A
            X.C18070vi.A0W(r1)
            X.9uO r0 = new X.9uO
            r0.<init>(r13, r1)
            r13.A08 = r0
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "changeNumber"
            r6 = 0
            boolean r0 = r1.getBooleanExtra(r0, r6)
            r13.A0V = r0
            X.00H r0 = r13.A0J
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r1 = r0.get()
            X.1cN r1 = (X.C29491cN) r1
            boolean r0 = r13.A0V
            boolean r8 = r1.A0J(r0)
            r13.A0b = r8
            android.view.View r3 = r13.A00
            r5 = 2131435197(0x7f0b1ebd, float:1.849223E38)
            r7 = r6
            X.A9B.A0Q(r3, r4, r5, r6, r7, r8)
            android.view.View r1 = r13.A00
            r0 = 2131435196(0x7f0b1ebc, float:1.8492227E38)
            android.view.View r0 = X.C18070vi.A05(r1, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r0 = (com.whatsapp.wds.components.textlayout.WDSTextLayout) r0
            r13.A0I = r0
            X.0z4 r0 = r13.A0A
            java.lang.String r0 = X.C108955ca.A0t(r0)
            r13.A0Z = r0
            X.0z4 r0 = r13.A0A
            java.lang.String r0 = X.C108955ca.A0u(r0)
            r13.A0a = r0
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "intentType"
            int r2 = r1.getIntExtra(r0, r6)
            r13.A00 = r2
            if (r2 != 0) goto L_0x008e
            android.content.SharedPreferences r2 = A03(r13)
            java.lang.String r1 = "pref_intent_type"
            r0 = 1
            int r2 = r2.getInt(r1, r0)
            r13.A00 = r2
        L_0x008e:
            android.content.SharedPreferences r0 = A03(r13)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_intent_type"
            X.C17880vN.A1C(r1, r0, r2)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "sendSmsNumber"
            java.lang.String r2 = r1.getStringExtra(r0)
            r13.A0U = r2
            if (r2 == 0) goto L_0x00af
            int r0 = r2.length()
            if (r0 != 0) goto L_0x01a9
        L_0x00af:
            android.content.SharedPreferences r1 = A03(r13)
            java.lang.String r0 = "pref_send_sms_number"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            r13.A0U = r2
            if (r2 == 0) goto L_0x00c3
            int r0 = r2.length()
            if (r0 != 0) goto L_0x01a9
        L_0x00c3:
            A0r(r13)
        L_0x00c6:
            com.whatsapp.wds.components.textlayout.WDSTextLayout r2 = r13.A0I
            if (r2 != 0) goto L_0x00d1
            java.lang.String r0 = "textLayout"
        L_0x00cc:
            X.C18070vi.A11(r0)
        L_0x00cf:
            r0 = 0
            throw r0
        L_0x00d1:
            int r1 = r13.A00
            r0 = 1
            if (r1 != r0) goto L_0x0135
            r0 = 2131895721(0x7f1225a9, float:1.9426283E38)
            java.lang.String r0 = r13.getString(r0)
            r2.setHeadlineText(r0)
            r0 = 2131895732(0x7f1225b4, float:1.9426305E38)
        L_0x00e3:
            java.lang.String r0 = r13.getString(r0)
            r2.setDescriptionText(r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r1 = r13.A0I
            java.lang.String r3 = "textLayout"
            if (r1 == 0) goto L_0x01a4
            r0 = 2131895674(0x7f12257a, float:1.9426188E38)
            java.lang.String r0 = r13.getString(r0)
            r1.setPrimaryButtonText(r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r2 = r13.A0I
            if (r2 == 0) goto L_0x01a4
            r1 = 16
            X.48o r0 = new X.48o
            r0.<init>(r13, r1)
            r2.setPrimaryButtonClickListener(r0)
            int r1 = r13.A00
            r0 = 2
            if (r1 != r0) goto L_0x0129
            com.whatsapp.wds.components.textlayout.WDSTextLayout r1 = r13.A0I
            if (r1 == 0) goto L_0x01a4
            r0 = 2131897757(0x7f122d9d, float:1.9430413E38)
            java.lang.String r0 = r13.getString(r0)
            r1.setSecondaryButtonText(r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r2 = r13.A0I
            if (r2 == 0) goto L_0x01a4
            r1 = 17
            X.48o r0 = new X.48o
            r0.<init>(r13, r1)
            r2.setSecondaryButtonClickListener(r0)
        L_0x0129:
            int r1 = r13.A00
            r0 = 2
            if (r1 != r0) goto L_0x015a
            com.whatsapp.registration.sendsmstowa.SendSmsToWaViewModel r0 = r13.A0E
            if (r0 != 0) goto L_0x0143
            java.lang.String r0 = "sendSmsToWaViewModel"
            goto L_0x00cc
        L_0x0135:
            r0 = 2131895722(0x7f1225aa, float:1.9426285E38)
            java.lang.String r0 = r13.getString(r0)
            r2.setHeadlineText(r0)
            r0 = 2131895733(0x7f1225b5, float:1.9426307E38)
            goto L_0x00e3
        L_0x0143:
            X.6Eo r2 = r0.A00
            r1 = 35
            X.7AQ r0 = new X.7AQ
            r0.<init>(r13, r1)
            r2.A03(r13, r0)
            r1 = 5
            X.7Qn r0 = new X.7Qn
            r0.<init>(r13, r1)
            r13.A0R = r0
            java.lang.String r0 = "send_sms_to_wa_non_fraud"
            goto L_0x015c
        L_0x015a:
            java.lang.String r0 = "send_sms_to_wa_fraud"
        L_0x015c:
            r13.A0S = r0
            X.A8V r2 = X.C108975cc.A0N(r13)
            java.lang.String r1 = r13.A0S
            java.lang.String r0 = "view"
            r2.A0H(r1, r0)
            X.19D r1 = r13.A06
            if (r1 == 0) goto L_0x01a0
            r0 = 11571(0x2d33, float:1.6214E-41)
            float r0 = r1.A0E(r0)
            long r11 = (long) r0
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            r7 = 3
            r9 = 60000(0xea60, double:2.9644E-319)
            X.1NV r5 = new X.1NV
            r5.<init>(r6, r7, r9, r11)
            r13.A0H = r5
            X.2hV r2 = r13.A03
            if (r2 == 0) goto L_0x019c
            android.content.SharedPreferences r1 = X.C72453Mb.A0M(r13)
            java.lang.String r0 = "flash_call_eligible"
            int r1 = X.C17890vO.A00(r1, r0)
            boolean r0 = r13.A0V
            X.Ad6 r0 = r2.A00(r13, r1, r0)
            r13.A0C = r0
            return
        L_0x019c:
            java.lang.String r0 = "dynamicBottomSheetNavigatorFactory"
            goto L_0x00cc
        L_0x01a0:
            java.lang.String r0 = "abPreChatdProps"
            goto L_0x00cc
        L_0x01a4:
            X.C18070vi.A11(r3)
            goto L_0x00cf
        L_0x01a9:
            android.content.SharedPreferences r0 = A03(r13)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_send_sms_number"
            X.C17880vN.A1E(r1, r0, r2)
            int r1 = r13.A00
            r0 = 2
            if (r1 != r0) goto L_0x01f2
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "sendSmsCode"
            java.lang.String r2 = r1.getStringExtra(r0)
            r13.A0T = r2
            if (r2 == 0) goto L_0x01cf
            int r0 = r2.length()
            if (r0 != 0) goto L_0x01e5
        L_0x01cf:
            android.content.SharedPreferences r1 = A03(r13)
            java.lang.String r0 = "pref_send_sms_code"
            java.lang.String r2 = X.C17880vN.A0r(r1, r0)
            r13.A0T = r2
            if (r2 == 0) goto L_0x00c6
            int r0 = r2.length()
            if (r0 != 0) goto L_0x01e5
            goto L_0x00c6
        L_0x01e5:
            android.content.SharedPreferences r0 = A03(r13)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "pref_send_sms_code"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x01f2:
            X.1jT r2 = r13.A4b()
            r1 = 22
            r0 = 1
            X.C33841jT.A03(r2, r1, r0)
            goto L_0x00c6
        L_0x01fe:
            java.lang.String r0 = "accountSwitcher"
            goto L_0x00cc
        L_0x0202:
            java.lang.String r0 = "landscapeModeBacktest"
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.sendsmstowa.SendSmsToWa.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        int i2 = 2131895734;
        if (i != 1) {
            if (i != 2) {
                return super.onCreateDialog(i);
            }
            i2 = 2131895731;
        }
        return A9B.A03(this, getString(i2));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        menu.add(0, 1, 0, 2131895081);
        return super.onCreateOptionsMenu(menu);
    }

    public static final SharedPreferences A03(SendSmsToWa sendSmsToWa) {
        C18010vc r1 = sendSmsToWa.A07;
        if (r1 != null) {
            return C108955ca.A0C(r1, "send_sms_to_wa");
        }
        C18070vi.A11("sharedPreferencesFactory");
        throw null;
    }

    public static final String A0Q(SendSmsToWa sendSmsToWa) {
        C18000vb r3 = sendSmsToWa.A00;
        String A0H2 = A9B.A0H(sendSmsToWa.A0A.A0l(), sendSmsToWa.A0A.A0n());
        String str = null;
        if (A0H2 != null) {
            str = A0H2.replace(' ', 160);
            C18070vi.A0X(str);
        }
        return r3.A0G(str);
    }

    private final void A0c() {
        if (this.A00 == 1) {
            Log.i("SendSmsToWa/stopExecutingRequestCodeTask");
            AnonymousClass6ML r0 = this.A0G;
            if (r0 != null) {
                r0.A0B(true);
            }
            this.A05.CEz(this.A0c);
            return;
        }
        Log.i("SendSmsToWa/stopExecutingVerifyCodeTask");
        Runnable runnable = this.A0R;
        if (runnable != null) {
            this.A05.CEz(runnable);
        }
    }

    private final void A0d(long j) {
        if (this.A00 == 1) {
            A0c();
            C17900vP.A0m("SendSmsToWa/executeRequestCodeTask/delay=", AnonymousClass000.A10(), j);
            this.A05.CGv(this.A0c, j);
            return;
        }
        Runnable runnable = this.A0R;
        if (runnable != null) {
            this.A05.CGv(runnable, j);
        }
        C17900vP.A0m("SendSmsToWa/executeVerifyCodeTask/delay=", AnonymousClass000.A10(), j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        if (r0.A00() == 2) goto L_0x0086;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0s(com.whatsapp.registration.sendsmstowa.SendSmsToWa r8, java.lang.Long r9) {
        /*
            if (r9 != 0) goto L_0x0014
            java.lang.String r0 = "SendSmsToWa/reached max attempts, showing try again dialog."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A0q(r8)
            boolean r0 = r8.Bed()
            if (r0 != 0) goto L_0x0013
            r8.A0V()
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r8.A0W
            if (r0 == 0) goto L_0x0099
            long r3 = r8.A0Y
            r1 = 0
            r7 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "SendSmsToWa/first resume after send sms intent was triggered"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11P r0 = r8.A05
            long r0 = X.AnonymousClass11P.A01(r0)
            r8.A0Y = r0
            long r0 = r9.longValue()
            r8.A0d(r0)
        L_0x0035:
            int r0 = r8.A0X
            if (r7 == r0) goto L_0x0013
            r0 = 1
            X.AnonymousClass4Yv.A00(r8, r0)
            r0 = 2
            X.AnonymousClass4Yv.A00(r8, r0)
            X.AnonymousClass4Yv.A01(r8, r7)
            r8.A0X = r7
            return
        L_0x0047:
            X.11P r0 = r8.A05
            long r3 = X.AnonymousClass11P.A01(r0)
            long r0 = r8.A0Y
            long r3 = r3 - r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SendSmsToWa/timeElapsedSinceTriggerMs="
            X.C17900vP.A0m(r0, r1, r3)
            r5 = 10000(0x2710, double:4.9407E-320)
            r2 = 2
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
            long r0 = r9.longValue()
            r8.A0d(r0)
            X.1NV r0 = r8.A0H
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = "exponentialBackoffProvider"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0072:
            int r0 = r0.A00()
            if (r0 != r2) goto L_0x0035
            goto L_0x0086
        L_0x0079:
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            long r0 = r9.longValue()
            r8.A0d(r0)
        L_0x0086:
            r7 = 2
            goto L_0x0035
        L_0x0088:
            java.lang.String r0 = "SendSmsToWa/time out reached for waiting for sms, showing try again dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            A0q(r8)
            boolean r0 = r8.Bed()
            if (r0 != 0) goto L_0x0099
            r8.A0V()
        L_0x0099:
            r7 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.sendsmstowa.SendSmsToWa.A0s(com.whatsapp.registration.sendsmstowa.SendSmsToWa, java.lang.Long):void");
    }

    public final C33841jT A4b() {
        C33841jT r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("registrationManager");
        throw null;
    }

    public final AnonymousClass00H A4c() {
        AnonymousClass00H r0 = this.A0L;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("funnelLogger");
        throw null;
    }

    public final void A4d(String str, String str2) {
        String replace;
        if (this.A00 == 2 && (str == null || str.length() == 0 || str2 == null || str2.length() == 0)) {
            Log.e("SendSmsToWa/failed to initiate send sms via intent due to null number or code");
            A0t(this, new C153277pG(this), 2131897757);
        }
        Intent A0G2 = C108945cZ.A0G("android.intent.action.SENDTO");
        A0G2.setData(Uri.parse(AnonymousClass001.A1H("smsto:", str, AnonymousClass000.A10())));
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(A0G2, 0);
        C18070vi.A0X(queryIntentActivities);
        if (!queryIntentActivities.isEmpty()) {
            String defaultSmsPackage = Telephony.Sms.getDefaultSmsPackage(this);
            if (defaultSmsPackage == null || defaultSmsPackage.length() == 0) {
                ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
                A0G2.setClassName(activityInfo.packageName, activityInfo.name);
            } else {
                A0G2.setPackage(defaultSmsPackage);
            }
            try {
                if (this.A00 == 1) {
                    A0G2.putExtra("sms_body", getString(2131895723));
                } else {
                    String A012 = C17970vW.A01(this.A08.A0O());
                    C18070vi.A0b(A012);
                    C18070vi.A0d(A012, 0);
                    byte[] digest = C108945cZ.A1I().digest(C108975cc.A1O(A012));
                    C18070vi.A0b(digest);
                    C18070vi.A0d(digest, 0);
                    String A14 = C108955ca.A14(digest);
                    StringBuilder A15 = C108955ca.A15(A14);
                    A15.append(getString(2131895724));
                    String A0A2 = C17900vP.A0A(A14, str2);
                    C18070vi.A0d(A0A2, 0);
                    String lowerCase = C137496vY.A00("SHA-1", A0A2).toLowerCase();
                    C18070vi.A0X(lowerCase);
                    A0G2.putExtra("sms_body", AnonymousClass000.A0y(lowerCase, A15));
                }
                this.A0W = true;
                startActivity(A0G2);
                C108975cc.A0N(this).A0H("system", "sms_to_wa_sent");
            } catch (NoSuchAlgorithmException e) {
                Log.e("SendSmsToWa/failed to initiate send sms via intent", e);
                A0t(this, new AnonymousClass7w9(this, str, str2), 2131899286);
            }
        } else {
            Log.e("SendSmsToWa no sms activities");
            C73203Rj A002 = AnonymousClass4a6.A00(this);
            A002.A0E(2131895726);
            Object[] A1b = AnonymousClass3MW.A1b();
            A1b[0] = A0Q(this);
            C18000vb r3 = this.A00;
            String str3 = this.A0U;
            if (str3 == null) {
                Log.e("RegistrationUtils/prettyPrintPhoneNumber/fullPhoneNumber is null");
            } else {
                C42771yi A003 = C42771yi.A00();
                try {
                    str3 = A003.A0J(A003.A0H(AnonymousClass001.A1H("+", str3, AnonymousClass000.A10()), "ZZ"), AnonymousClass00R.A01);
                    if (str3 != null) {
                        replace = str3.replace(' ', 160);
                        C18070vi.A0X(replace);
                        A002.A0S(AnonymousClass6VI.A00(C17880vN.A0q(this, r3.A0G(replace), A1b, 1, 2131895725)));
                        A002.A0T(false);
                        A002.A0L(new AnonymousClass758(this, 11), getString(2131899286));
                        AnonymousClass3MY.A1G(A002);
                    }
                } catch (Exception e2) {
                    Log.e("RegistrationUtils/prettyPrintPhoneNumber/formatter-exception", e2);
                }
            }
            replace = null;
            A002.A0S(AnonymousClass6VI.A00(C17880vN.A0q(this, r3.A0G(replace), A1b, 1, 2131895725)));
            A002.A0T(false);
            A002.A0L(new AnonymousClass758(this, 11), getString(2131899286));
            AnonymousClass3MY.A1G(A002);
        }
    }

    public void onBackPressed() {
        String str;
        if (this.A0b) {
            Log.i("SendSmsToWa/onBackPressed/is adding new account");
            AnonymousClass00H r0 = this.A0J;
            if (r0 != null) {
                A9B.A0I(this, (C29491cN) r0.get(), this.A0A, this.A0B);
                return;
            }
            str = "accountSwitcher";
        } else if (this.A0V) {
            C33841jT.A03(A4b(), 3, true);
            if (!A4b().A0F()) {
                finish();
            }
            AnonymousClass00H r02 = this.A0Q;
            if (r02 != null) {
                Intent A062 = AnonymousClass3MZ.A06(r02);
                A062.setClassName(getPackageName(), "com.whatsapp.registration.phonenumberentry.ChangeNumber");
                startActivity(A062);
                finish();
                return;
            }
            str = "waIntents";
        } else {
            C108975cc.A0N(this).A0I(this.A0S, "back");
            super.onBackPressed();
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0r(SendSmsToWa sendSmsToWa) {
        C33841jT.A03(sendSmsToWa.A4b(), 4, true);
        AnonymousClass00H r0 = sendSmsToWa.A0Q;
        if (r0 != null) {
            Intent className = AnonymousClass3MZ.A06(r0).setClassName(sendSmsToWa.getPackageName(), "com.whatsapp.registration.verifyphone.VerifyPhoneNumber");
            className.putExtra("return_to_phone_number", true);
            sendSmsToWa.startActivity(className);
            sendSmsToWa.finish();
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public static final void A0t(SendSmsToWa sendSmsToWa, C18090vk r3, int i) {
        C73203Rj A002 = AnonymousClass4a6.A00(sendSmsToWa);
        A002.A0E(2131895730);
        A002.A0D(2131895729);
        A002.A0T(true);
        AnonymousClass758.A01(A002, r3, 12, i);
        AnonymousClass3MY.A1G(A002);
        C108975cc.A0N(sendSmsToWa).A0C("send_sms_to_wa_went_wrong_dialog");
    }

    public void onDestroy() {
        super.onDestroy();
        A0c();
        AnonymousClass00H r0 = this.A0O;
        if (r0 != null) {
            ((C58712l8) r0.get()).A00();
        } else {
            C18070vi.A11("registrationHelper");
            throw null;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int A0B2 = C72453Mb.A0B(menuItem);
        if (A0B2 == 1) {
            AnonymousClass00H r0 = this.A0O;
            if (r0 != null) {
                C58712l8 r3 = (C58712l8) r0.get();
                C33641j9 r2 = this.A0A;
                if (r2 != null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("send_sms_to_wa +");
                    String str2 = this.A0Z;
                    if (str2 == null) {
                        str = "countryCode";
                    } else {
                        A10.append(str2);
                        String str3 = this.A0a;
                        if (str3 == null) {
                            str = "phoneNumber";
                        } else {
                            r3.A01(this, r2, AnonymousClass000.A0y(str3, A10));
                        }
                    }
                } else {
                    str = "verificationFlowState";
                }
            } else {
                str = "registrationHelper";
            }
            C18070vi.A11(str);
            throw null;
        } else if (A0B2 == 2) {
            AnonymousClass00H r02 = this.A0Q;
            if (r02 != null) {
                r02.get();
                startActivity(AnonymousClass1LU.A01(this));
                finishAffinity();
                return true;
            }
            str = "waIntents";
            C18070vi.A11(str);
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        if (this.A0W && this.A0Y == 0) {
            C108975cc.A0N(this).A0H(this.A0S, "view");
        }
        A0c();
        A0s(this, C17890vO.A0L());
    }
}
