package com.whatsapp.registration.verifyphone;

import X.AFS;
import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C108955ca;
import X.C108995ce;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C19963A0w;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RequestOtpCodeBottomSheetFragment extends Hilt_RequestOtpCodeBottomSheetFragment {
    public C18000vb A00;
    public C19963A0w A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public VerifyPhoneNumber A06;
    public WDSButton A07;
    public WDSButton A08;
    public WDSButton A09;
    public WDSButton A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public final HashMap A0E = C17880vN.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r10 = 2131755481;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        r8 = r13.A0B;
        r4 = new X.C146517Pk(r13, r14, 48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r7 = r15;
        r15.setText(r8);
        r15.setIcon(r3);
        r15.setOnClickListener(new X.AnonymousClass78A(r13, r15, r4, 39));
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        if (r17 >= 0) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r15.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r4 = new X.C146767Qn(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a7, code lost:
        if (r17 != 0) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a9, code lost:
        r15.setEnabled(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r15.setEnabled(false);
        r1 = r13.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b6, code lost:
        if (r1.get(r9) == null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b8, code lost:
        ((android.os.CountDownTimer) r1.get(r9)).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c1, code lost:
        r1.put(r9, new X.C109555dd(r5, r6, r7, r8, r9, r10, r11));
        ((android.os.CountDownTimer) r1.get(r9)).start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        r3 = 2131232243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r13.A0D != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        r10 = 2131755479;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r13.A0C == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(com.whatsapp.registration.verifyphone.VerifyPhoneNumber r14, com.whatsapp.wds.components.button.WDSButton r15, java.lang.String r16, long r17) {
        /*
            r13 = this;
            r6 = r14
            r9 = r16
            if (r14 != 0) goto L_0x0017
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RequestOtpCodeBottomSheetFragment/initializeButtonAndStartTimer for "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "/null base activity"
            X.C17890vO.A1A(r1, r0)
            return
        L_0x0017:
            int r0 = r9.hashCode()
            r2 = 0
            r1 = 1
            r5 = r13
            switch(r0) {
                case -795576526: goto L_0x0089;
                case 112386354: goto L_0x0071;
                case 2120743944: goto L_0x005a;
                default: goto L_0x0021;
            }
        L_0x0021:
            r3 = 2131232243(0x7f0805f3, float:1.808059E38)
            boolean r0 = r13.A0D
            if (r0 != 0) goto L_0x002f
            boolean r0 = r13.A0C
            r10 = 2131755479(0x7f1001d7, float:1.9141838E38)
            if (r0 == 0) goto L_0x0032
        L_0x002f:
            r10 = 2131755481(0x7f1001d9, float:1.9141842E38)
        L_0x0032:
            java.lang.String r8 = r13.A0B
            r0 = 48
            X.7Pk r4 = new X.7Pk
            r4.<init>(r13, r14, r0)
        L_0x003b:
            r7 = r15
            r15.setText(r8)
            r15.setIcon((int) r3)
            r3 = 39
            X.78A r0 = new X.78A
            r0.<init>(r13, r15, r4, r3)
            r15.setOnClickListener(r0)
            r3 = 0
            r11 = r17
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a5
            r0 = 8
            r15.setVisibility(r0)
            return
        L_0x005a:
            java.lang.String r0 = "email_otp"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0021
            r3 = 2131232082(0x7f080552, float:1.8080263E38)
            r10 = 2131755362(0x7f100162, float:1.9141601E38)
            r0 = 2131895299(0x7f122403, float:1.9425427E38)
            java.lang.String r8 = r13.A1H(r0)
            r0 = 7
            goto L_0x009f
        L_0x0071:
            java.lang.String r0 = "voice"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0021
            r3 = 2131231742(0x7f0803fe, float:1.8079574E38)
            r10 = 2131755482(0x7f1001da, float:1.9141845E38)
            r0 = 2131897815(0x7f122dd7, float:1.943053E38)
            java.lang.String r8 = r13.A1H(r0)
            r0 = 8
            goto L_0x009f
        L_0x0089:
            java.lang.String r0 = "wa_old"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0021
            r3 = 2131232277(0x7f080615, float:1.8080659E38)
            r10 = 2131755480(0x7f1001d8, float:1.914184E38)
            r0 = 2131897801(0x7f122dc9, float:1.9430502E38)
            java.lang.String r8 = r13.A1H(r0)
            r0 = 6
        L_0x009f:
            X.7Qn r4 = new X.7Qn
            r4.<init>(r14, r0)
            goto L_0x003b
        L_0x00a5:
            int r0 = (r17 > r3 ? 1 : (r17 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00ad
            r15.setEnabled(r1)
            return
        L_0x00ad:
            r15.setEnabled(r2)
            java.util.HashMap r1 = r13.A0E
            java.lang.Object r0 = r1.get(r9)
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r0 = r1.get(r9)
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.cancel()
        L_0x00c1:
            X.5dd r4 = new X.5dd
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.put(r9, r4)
            java.lang.Object r0 = r1.get(r9)
            android.os.CountDownTimer r0 = (android.os.CountDownTimer) r0
            r0.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.RequestOtpCodeBottomSheetFragment.A01(com.whatsapp.registration.verifyphone.VerifyPhoneNumber, com.whatsapp.wds.components.button.WDSButton, java.lang.String, long):void");
    }

    public void A21(Bundle bundle, View view) {
        int i;
        VerifyPhoneNumber verifyPhoneNumber;
        WDSButton wDSButton;
        String str;
        long j;
        super.A21(bundle, view);
        AnonymousClass1HF.A06(view, 2131434590).setOnClickListener(new AFS(this, 34));
        ImageView A0G = AnonymousClass3MW.A0G(view, 2131434592);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131434594);
        TextView A0J2 = AnonymousClass3MW.A0J(view, 2131434591);
        if (this.A0D) {
            A0G.setImageDrawable((Drawable) null);
            A0G.setBackgroundResource(2131232880);
            A0J.setText(2131895277);
            i = 2131895276;
        } else if (this.A0C) {
            A0G.setImageResource(2131232082);
            i = 2131888271;
        } else {
            AnonymousClass3MX.A1B(A1n(), A0G, 2131232243);
            A0G.setBackgroundResource(2131232883);
            A0J.setText(2131895275);
            i = 2131895274;
        }
        A0J2.setText(i);
        A01(this.A06, this.A08, "sms", this.A03);
        A01(this.A06, this.A09, "voice", this.A04);
        if (this.A0D) {
            verifyPhoneNumber = this.A06;
            wDSButton = this.A0A;
            C17960vV.A05(wDSButton);
            str = "wa_old";
            j = this.A05;
        } else if (this.A0C) {
            verifyPhoneNumber = this.A06;
            wDSButton = this.A07;
            C17960vV.A05(wDSButton);
            str = "email_otp";
            j = this.A02;
        } else {
            return;
        }
        A01(verifyPhoneNumber, wDSButton, str, j);
    }

    public static RequestOtpCodeBottomSheetFragment A00(String str, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment = new RequestOtpCodeBottomSheetFragment();
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putLong("EXTRA_SMS_COUNTDOWN_TIME", j);
        A0D2.putLong("EXTRA_VOICE_COUNTDOWN_TIME", j2);
        A0D2.putLong("EXTRA_WA_OLD_COUNTDOWN_TIME", j3);
        A0D2.putLong("EXTRA_EMAIL_OTP_COUNTDOWN_TIME", j4);
        A0D2.putBoolean("EXTRA_REG_STATE_IS_WA_OLD", z);
        A0D2.putBoolean("EXTRA_REG_STATE_IS_EMAIL_OTP", z2);
        A0D2.putString("EXTRA_ENABLE_SMS_STRING", str);
        requestOtpCodeBottomSheetFragment.A1R(A0D2);
        return requestOtpCodeBottomSheetFragment;
    }

    public void A1K() {
        super.A1K();
        this.A06 = null;
        HashMap hashMap = this.A0E;
        Iterator A0i = C17890vO.A0i(hashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (A16.getValue() != null) {
                ((CountDownTimer) A16.getValue()).cancel();
                hashMap.put(A16.getKey(), (Object) null);
            }
        }
        hashMap.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r10, android.view.LayoutInflater r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r0 = 2131626728(0x7f0e0ae8, float:1.88807E38)
            android.view.View r5 = X.AnonymousClass3MX.A0A(r11, r12, r0)
            r0 = 2131434595(0x7f0b1c63, float:1.8491008E38)
            android.view.ViewGroup r4 = X.AnonymousClass3MW.A0C(r5, r0)
            boolean r0 = r9.A0D
            r6 = 0
            if (r0 == 0) goto L_0x0065
            r0 = 2131626729(0x7f0e0ae9, float:1.8880702E38)
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A0A = r0
        L_0x001e:
            r4.addView(r0)
        L_0x0021:
            boolean r0 = r9.A0D
            r7 = 0
            if (r0 == 0) goto L_0x002d
            long r0 = r9.A05
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L_0x0037
        L_0x002d:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0061
            long r1 = r9.A02
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0061
        L_0x0037:
            r0 = 2131626730(0x7f0e0aea, float:1.8880704E38)
        L_0x003a:
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A08 = r0
            long r2 = r9.A03
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 2131626730(0x7f0e0aea, float:1.8880704E38)
            if (r1 >= 0) goto L_0x004e
            r0 = 2131626729(0x7f0e0ae9, float:1.8880702E38)
        L_0x004e:
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A09 = r0
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A08
            r4.addView(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r9.A09
            r4.addView(r0)
            return r5
        L_0x0061:
            r0 = 2131626729(0x7f0e0ae9, float:1.8880702E38)
            goto L_0x003a
        L_0x0065:
            boolean r0 = r9.A0C
            if (r0 == 0) goto L_0x0021
            r0 = 2131626729(0x7f0e0ae9, float:1.8880702E38)
            android.view.View r0 = r11.inflate(r0, r4, r6)
            com.whatsapp.wds.components.button.WDSButton r0 = (com.whatsapp.wds.components.button.WDSButton) r0
            r9.A07 = r0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.RequestOtpCodeBottomSheetFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1x(Context context) {
        super.A1x(context);
        try {
            this.A06 = (VerifyPhoneNumber) A1B();
        } catch (ClassCastException e) {
            C108995ce.A1M("RequestOtpCodeBottomSheetFragment/onAttach/error: ", AnonymousClass000.A10(), e);
        }
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        this.A03 = A15().getLong("EXTRA_SMS_COUNTDOWN_TIME");
        this.A04 = A15().getLong("EXTRA_VOICE_COUNTDOWN_TIME");
        this.A05 = A15().getLong("EXTRA_WA_OLD_COUNTDOWN_TIME");
        this.A02 = A15().getLong("EXTRA_EMAIL_OTP_COUNTDOWN_TIME");
        this.A0D = A15().getBoolean("EXTRA_REG_STATE_IS_WA_OLD");
        this.A0C = A15().getBoolean("EXTRA_REG_STATE_IS_EMAIL_OTP");
        this.A0B = C108955ca.A0s(A15(), "EXTRA_ENABLE_SMS_STRING");
    }
}
