package com.whatsapp.registration.verifyphone;

import X.A8V;
import X.A9B;
import X.AnonymousClass000;
import X.AnonymousClass19D;
import X.AnonymousClass1CM;
import X.AnonymousClass1FL;
import X.AnonymousClass1YF;
import X.AnonymousClass3MY;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.C108995ce;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C192319oA;
import X.C195499tR;
import X.C197939xW;
import X.C19830z4;
import X.C33841jT;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class RequestServerDrivenOtpCodeFullScreenFragment extends Hilt_RequestServerDrivenOtpCodeFullScreenFragment {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass1FL A03;
    public RecyclerView A04;
    public C19830z4 A05;
    public C18000vb A06;
    public AnonymousClass19D A07;
    public C33841jT A08;
    public AnonymousClass1CM A09;
    public A8V A0A;
    public C192319oA A0B;
    public Long A0C;
    public Long A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public String A0I;
    public String A0J;
    public List A0K = AnonymousClass000.A13();
    public List A0L;
    public boolean A0M;
    public View A0N;
    public WaImageButton A0O;
    public WaTextView A0P;
    public WDSButton A0Q;
    public String A0R;
    public String A0S;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02b4, code lost:
        r7.add(new X.C195499tR(r4, r14, r15, r0, r17, r18));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A1q(android.os.Bundle r21, android.view.LayoutInflater r22, android.view.ViewGroup r23) {
        /*
            r20 = this;
            r3 = 0
            r2 = r22
            X.C18070vi.A0d(r2, r3)
            r0 = 2131626888(0x7f0e0b88, float:1.8881025E38)
            r11 = 1
            r1 = r23
            android.view.View r2 = r2.inflate(r0, r1, r11)
            r0 = 2131434594(0x7f0b1c62, float:1.8491006E38)
            com.whatsapp.WaTextView r0 = X.AnonymousClass3MW.A0T(r2, r0)
            r1 = r20
            r1.A0P = r0
            r0 = 2131436700(0x7f0b249c, float:1.8495278E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.C108945cZ.A0U(r2, r0)
            r1.A04 = r0
            r0 = 2131429141(0x7f0b0715, float:1.8479946E38)
            r10 = 2131429141(0x7f0b0715, float:1.8479946E38)
            android.widget.ImageView r6 = X.C108975cc.A0B(r2, r0)
            r0 = 2131436699(0x7f0b249b, float:1.8495276E38)
            com.whatsapp.TextEmojiLabel r5 = X.AnonymousClass3MX.A0W(r2, r0)
            boolean r0 = r1.A0M
            r8 = 8
            android.content.Context r4 = r1.A14()
            if (r0 == 0) goto L_0x02ca
            r0 = 2131231675(0x7f0803bb, float:1.8079438E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r4, r0)
            if (r0 == 0) goto L_0x004b
            r6.setImageDrawable(r0)
        L_0x004b:
            com.whatsapp.WaTextView r9 = r1.A0P
            if (r9 == 0) goto L_0x0061
            r7 = 2131890346(0x7f1210aa, float:1.9415381E38)
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r4 = r1.A0R
            java.lang.String r0 = r1.A0S
            java.lang.String r0 = X.A9B.A0H(r4, r0)
            r6[r3] = r0
            X.AnonymousClass8BT.A18(r9, r1, r6, r7)
        L_0x0061:
            X.19D r6 = r1.A07
            if (r6 == 0) goto L_0x036c
            r4 = 12405(0x3075, float:1.7383E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r4)
            if (r0 == 0) goto L_0x02c5
            X.0ve r0 = r1.A02
            X.AnonymousClass3Ma.A1L(r0, r5)
            r0 = 2131890347(0x7f1210ab, float:1.9415383E38)
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            X.1FL r11 = r1.A1D()
            android.content.Context r7 = r1.A14()
            android.content.Context r6 = r1.A14()
            r4 = 2130971935(0x7f040d1f, float:1.7552622E38)
            r0 = 2131103036(0x7f060d3c, float:1.7818527E38)
            int r16 = X.AnonymousClass3MZ.A02(r6, r7, r4, r0)
            r0 = 9
            X.7Qn r13 = new X.7Qn
            r13.<init>(r1, r0)
            java.lang.String r15 = "direct-entry"
            r12 = 0
            r17 = r3
            android.text.SpannableStringBuilder r0 = X.A3H.A00(r11, r12, r13, r14, r15, r16, r17)
            r5.setText(r0)
        L_0x00a4:
            java.lang.String r0 = r1.A0R
            if (r0 == 0) goto L_0x00b8
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x00b8
            java.lang.String r0 = r1.A0S
            if (r0 == 0) goto L_0x00b8
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 == 0) goto L_0x00c0
        L_0x00b8:
            java.lang.String r0 = "RESTART_REG"
            A02(r1, r0)
            r1.A29()
        L_0x00c0:
            X.1FL r9 = r1.A03
            if (r9 == 0) goto L_0x033e
            java.util.List r8 = r1.A0L
            if (r8 == 0) goto L_0x033e
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            int r6 = r8.size()
            r5 = 0
        L_0x00d1:
            if (r5 >= r6) goto L_0x0323
            java.lang.String r4 = X.C17880vN.A0w(r8, r5)
            X.C18070vi.A0d(r4, r3)
            int r0 = r4.hashCode()
            r12 = 1
            r11 = 0
            switch(r0) {
                case -795576526: goto L_0x00e6;
                case -792038226: goto L_0x013d;
                case 114009: goto L_0x0194;
                case 97513456: goto L_0x01c3;
                case 112386354: goto L_0x01fe;
                case 1247787042: goto L_0x022f;
                case 2120743944: goto L_0x0271;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00e6:
            boolean r0 = X.AnonymousClass8BR.A1W(r4)
            if (r0 == 0) goto L_0x00e3
            int r0 = r1.A02
            if (r0 == 0) goto L_0x00e3
            X.9oA r0 = r1.A0B
            if (r0 == 0) goto L_0x02e1
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x02db
            int r11 = r0.A00(r3)
            r0 = 15
            if (r11 != r0) goto L_0x0139
            r0 = 2131890339(0x7f1210a3, float:1.9415367E38)
        L_0x0109:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            java.lang.String r11 = r1.A0J
            if (r11 == 0) goto L_0x0131
            int r0 = r11.length()
            if (r0 == 0) goto L_0x0131
            r0 = 2131890357(0x7f1210b5, float:1.9415404E38)
            java.lang.String r15 = X.AnonymousClass3MY.A0o(r1, r11, r3, r0)
        L_0x011e:
            X.C18070vi.A0b(r15)
            r17 = 2131233432(0x7f080a98, float:1.8083001E38)
            java.lang.Long r0 = r1.A0H
            long r18 = A00(r0)
            X.Avr r0 = new X.Avr
            r0.<init>(r1)
            goto L_0x02b4
        L_0x0131:
            r0 = 2131890358(0x7f1210b6, float:1.9415406E38)
            java.lang.String r15 = r1.A1H(r0)
            goto L_0x011e
        L_0x0139:
            r0 = 2131890359(0x7f1210b7, float:1.9415408E38)
            goto L_0x0109
        L_0x013d:
            java.lang.String r0 = "passkey"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00e3
            X.9oA r13 = r1.A0B
            if (r13 == 0) goto L_0x02ed
            X.0z4 r0 = r13.A00
            android.content.SharedPreferences r12 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "reg_passkey_auth_challenge"
            java.lang.String r0 = r12.getString(r0, r11)
            if (r0 == 0) goto L_0x00e3
            int r0 = r0.length()
            if (r0 == 0) goto L_0x00e3
            X.00H r0 = r13.A01
            java.lang.Object r0 = r0.get()
            X.9on r0 = (X.C192679on) r0
            java.lang.Integer r12 = r0.A00()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r12 != r0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x02e7
            boolean r11 = r0.A03()
            r0 = 2131890335(0x7f12109f, float:1.9415359E38)
            if (r11 == 0) goto L_0x017d
            r0 = 2131890340(0x7f1210a4, float:1.941537E38)
        L_0x017d:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            r0 = 2131890354(0x7f1210b2, float:1.9415397E38)
            java.lang.String r15 = X.AnonymousClass3MY.A0n(r1, r0)
            r17 = 2131232082(0x7f080552, float:1.8080263E38)
            X.Avt r0 = new X.Avt
            r0.<init>(r1)
            r18 = 0
            goto L_0x02b4
        L_0x0194:
            boolean r0 = X.AnonymousClass8BR.A1U(r4)
            if (r0 == 0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x02f3
            int r12 = r0.A00(r3)
            r11 = 4
            r0 = 2131890350(0x7f1210ae, float:1.941539E38)
            if (r12 != r11) goto L_0x01ab
            r0 = 2131890349(0x7f1210ad, float:1.9415387E38)
        L_0x01ab:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            java.lang.String r15 = r1.A2H(r4)
            r17 = 2131233620(0x7f080b54, float:1.8083383E38)
            java.lang.Long r0 = r1.A0F
            long r18 = A00(r0)
            X.Avo r0 = new X.Avo
            r0.<init>(r1)
            goto L_0x02b4
        L_0x01c3:
            boolean r0 = X.AnonymousClass8BR.A1V(r4)
            if (r0 == 0) goto L_0x00e3
            X.9oA r0 = r1.A0B
            if (r0 == 0) goto L_0x02ff
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x02f9
            int r11 = r0.A00(r3)
            r0 = 8
            if (r11 != r0) goto L_0x01fa
            r0 = 2131890337(0x7f1210a1, float:1.9415363E38)
        L_0x01e2:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            java.lang.String r15 = r1.A2H(r4)
            r17 = 2131231760(0x7f080410, float:1.807961E38)
            java.lang.Long r0 = r1.A0D
            long r18 = A00(r0)
            X.Avq r0 = new X.Avq
            r0.<init>(r1)
            goto L_0x02b4
        L_0x01fa:
            r0 = 2131890334(0x7f12109e, float:1.9415357E38)
            goto L_0x01e2
        L_0x01fe:
            java.lang.String r0 = "voice"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x0305
            int r12 = r0.A00(r3)
            r11 = 5
            r0 = 2131890342(0x7f1210a6, float:1.9415373E38)
            if (r12 != r11) goto L_0x0217
            r0 = 2131890351(0x7f1210af, float:1.9415391E38)
        L_0x0217:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            java.lang.String r15 = r1.A2H(r4)
            r17 = 2131231742(0x7f0803fe, float:1.8079574E38)
            java.lang.Long r0 = r1.A0G
            long r18 = A00(r0)
            X.Avp r0 = new X.Avp
            r0.<init>(r1)
            goto L_0x02b4
        L_0x022f:
            java.lang.String r0 = "send_sms"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00e3
            int r0 = r1.A01
            if (r0 != r12) goto L_0x00e3
            X.9oA r0 = r1.A0B
            if (r0 == 0) goto L_0x0311
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x030b
            int r12 = r0.A00(r3)
            r11 = 22
            r0 = 2131890341(0x7f1210a5, float:1.9415371E38)
            if (r12 != r11) goto L_0x0257
            r0 = 2131890338(0x7f1210a2, float:1.9415365E38)
        L_0x0257:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            r0 = 2131890355(0x7f1210b3, float:1.94154E38)
            java.lang.String r15 = X.AnonymousClass3MY.A0n(r1, r0)
            r17 = 2131232276(0x7f080614, float:1.8080657E38)
            java.lang.Long r0 = r1.A0E
            long r18 = A00(r0)
            X.Avu r0 = new X.Avu
            r0.<init>(r1)
            goto L_0x02b4
        L_0x0271:
            boolean r0 = X.AnonymousClass8BR.A1X(r4)
            if (r0 == 0) goto L_0x00e3
            int r0 = r1.A00
            if (r0 != r12) goto L_0x00e3
            X.9oA r0 = r1.A0B
            if (r0 == 0) goto L_0x031d
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00e3
            X.1CM r0 = r1.A09
            if (r0 == 0) goto L_0x0317
            int r11 = r0.A00(r3)
            r0 = 17
            if (r11 != r0) goto L_0x02c1
            r0 = 2131890336(0x7f1210a0, float:1.941536E38)
        L_0x0294:
            java.lang.String r14 = X.AnonymousClass3MY.A0n(r1, r0)
            r13 = 2131890353(0x7f1210b1, float:1.9415395E38)
            java.lang.Object[] r11 = new java.lang.Object[r12]
            java.lang.String r0 = r1.A0I
            java.lang.String r15 = X.AnonymousClass3MX.A16(r1, r0, r11, r3, r13)
            X.C18070vi.A0X(r15)
            r17 = 2131232082(0x7f080552, float:1.8080263E38)
            java.lang.Long r0 = r1.A0C
            long r18 = A00(r0)
            X.Avs r0 = new X.Avs
            r0.<init>(r1)
        L_0x02b4:
            X.9tR r12 = new X.9tR
            r13 = r4
            r16 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r7.add(r12)
            goto L_0x00e3
        L_0x02c1:
            r0 = 2131897176(0x7f122b58, float:1.9429234E38)
            goto L_0x0294
        L_0x02c5:
            r5.setVisibility(r8)
            goto L_0x00a4
        L_0x02ca:
            r0 = 2131233243(0x7f0809db, float:1.8082618E38)
            android.graphics.drawable.Drawable r0 = X.C24261Jm.A00(r4, r0)
            r5.setVisibility(r8)
            if (r0 == 0) goto L_0x00a4
            r6.setImageDrawable(r0)
            goto L_0x00a4
        L_0x02db:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02e1:
            java.lang.String r0 = "serverDrivenOtpManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02e7:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02ed:
            java.lang.String r0 = "serverDrivenOtpManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02f3:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02f9:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x02ff:
            java.lang.String r0 = "serverDrivenOtpManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0305:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x030b:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0311:
            java.lang.String r0 = "serverDrivenOtpManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0317:
            java.lang.String r0 = "registrationStateManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x031d:
            java.lang.String r0 = "serverDrivenOtpManager"
            X.C18070vi.A11(r0)
            throw r11
        L_0x0323:
            r1.A0K = r7
            X.0vb r0 = r1.A06
            X.C18070vi.A0W(r0)
            X.8Hl r5 = new X.8Hl
            r5.<init>(r9, r0, r7)
            r4 = 1
            X.Adc r0 = new X.Adc
            r0.<init>(r1, r4)
            r5.A01 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r1.A04
            if (r0 == 0) goto L_0x033e
            r0.setAdapter(r5)
        L_0x033e:
            r0 = 2131429535(0x7f0b089f, float:1.8480745E38)
            com.whatsapp.wds.components.button.WDSButton r0 = X.AnonymousClass3MW.A0q(r2, r0)
            r1.A0Q = r0
            A01(r1)
            com.whatsapp.wds.components.button.WDSButton r4 = r1.A0Q
            if (r4 == 0) goto L_0x0353
            r0 = 36
            X.AnonymousClass3MZ.A1L(r4, r1, r0)
        L_0x0353:
            android.view.View r0 = X.AnonymousClass1HF.A06(r2, r10)
            com.whatsapp.WaImageButton r0 = (com.whatsapp.WaImageButton) r0
            r1.A0O = r0
            if (r0 == 0) goto L_0x0360
            r0.setVisibility(r3)
        L_0x0360:
            com.whatsapp.WaImageButton r3 = r1.A0O
            if (r3 == 0) goto L_0x0369
            r0 = 37
            X.AnonymousClass3MZ.A1L(r3, r1, r0)
        L_0x0369:
            r1.A0N = r2
            return r2
        L_0x036c:
            java.lang.String r0 = "abPreChatdProps"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.verifyphone.RequestServerDrivenOtpCodeFullScreenFragment.A1q(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        try {
            this.A03 = A1B();
        } catch (ClassCastException e) {
            C108995ce.A1M("RequestServerDrivenOtpCodeFullScreenFragment/onAttach/error: ", AnonymousClass000.A10(), e);
        }
    }

    public final String A2H(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        String str4;
        int i;
        String str5 = this.A0R;
        if (str5 == null || AnonymousClass1YF.A0T(str5) || (str3 = this.A0S) == null || AnonymousClass1YF.A0T(str3)) {
            sb = AnonymousClass8BW.A0o("RequestServerDrivenOtpCodeFullScreenFragment/getDescriptionText for ", str);
            str2 = "/phone number is null/blank";
        } else {
            String A0H2 = A9B.A0H(this.A0R, this.A0S);
            int hashCode = str.hashCode();
            if (hashCode != 114009) {
                if (hashCode != 97513456) {
                    if (hashCode == 112386354) {
                        str4 = "voice";
                    }
                } else if (AnonymousClass8BR.A1V(str)) {
                    i = 2131890343;
                    String A0o = AnonymousClass3MY.A0o(this, A0H2, 0, i);
                    C18070vi.A0X(A0o);
                    return A0o;
                }
                sb = AnonymousClass8BW.A0o("RequestServerDrivenOtpCodeFullScreenFragment/getDescriptionText for ", str);
                str2 = "/unsupported method";
            } else {
                str4 = "sms";
            }
            if (str.equals(str4)) {
                i = 2131890352;
                String A0o2 = AnonymousClass3MY.A0o(this, A0H2, 0, i);
                C18070vi.A0X(A0o2);
                return A0o2;
            }
            sb = AnonymousClass8BW.A0o("RequestServerDrivenOtpCodeFullScreenFragment/getDescriptionText for ", str);
            str2 = "/unsupported method";
        }
        C17890vO.A1A(sb, str2);
        return "";
    }

    public static final void A01(RequestServerDrivenOtpCodeFullScreenFragment requestServerDrivenOtpCodeFullScreenFragment) {
        List list = requestServerDrivenOtpCodeFullScreenFragment.A0K;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C195499tR) it.next()).A06) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        WDSButton wDSButton = requestServerDrivenOtpCodeFullScreenFragment.A0Q;
        if (wDSButton != null) {
            wDSButton.setEnabled(z);
        }
    }

    public static final long A00(Long l) {
        long currentTimeMillis = System.currentTimeMillis();
        if (l == null) {
            return 0;
        }
        long longValue = l.longValue();
        if (longValue == -1) {
            return -1;
        }
        if (longValue > currentTimeMillis) {
            return longValue - currentTimeMillis;
        }
        return 0;
    }

    public static final void A02(RequestServerDrivenOtpCodeFullScreenFragment requestServerDrivenOtpCodeFullScreenFragment, String str) {
        String str2;
        Bundle A0D2 = C17880vN.A0D();
        String str3 = requestServerDrivenOtpCodeFullScreenFragment.A0R;
        if (str3 == null || AnonymousClass1YF.A0T(str3) || (str2 = requestServerDrivenOtpCodeFullScreenFragment.A0S) == null || AnonymousClass1YF.A0T(str2)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("RequestServerDrivenOtpCodeFullScreenFragment/setResult for ");
            A10.append(str);
            C17890vO.A1A(A10, "/phone number is null/blank");
            str = "RESTART_REG";
        }
        A0D2.putString("REQUEST_SERVER_DRIVEN_OTP_CODE_METHOD", str);
        requestServerDrivenOtpCodeFullScreenFragment.A1F().A0w("REQUEST_SERVER_DRIVEN_OTP_FRAGMENT_RESULT", A0D2);
    }

    public void A1K() {
        super.A1K();
        this.A03 = null;
    }

    public void A1z(Bundle bundle) {
        String str;
        super.A1z(bundle);
        A2A(2, 2132083332);
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A0F = AnonymousClass8BU.A0k(bundle2, "EXTRA_SMS_RETRY_TIME");
            this.A0D = AnonymousClass8BU.A0k(bundle2, "EXTRA_FLASH_RETRY_TIME");
            this.A0G = AnonymousClass8BU.A0k(bundle2, "EXTRA_VOICE_RETRY_TIME");
            this.A0H = AnonymousClass8BU.A0k(bundle2, "EXTRA_WA_OLD_RETRY_TIME");
            this.A0C = AnonymousClass8BU.A0k(bundle2, "EXTRA_EMAIL_OTP_RETRY_TIME");
            this.A0E = AnonymousClass8BU.A0k(bundle2, "EXTRA_SEND_SMS_RETRY_TIME");
            this.A0J = bundle2.getString("EXTRA_WA_OLD_DEVICE_NAME");
            this.A0M = bundle2.getBoolean("EXTRA_IS_FIRST_DBS");
        }
        C19830z4 r0 = this.A05;
        if (r0 != null) {
            this.A0L = r0.A0u();
            C19830z4 r02 = this.A05;
            if (r02 != null) {
                this.A0R = r02.A0l();
                C19830z4 r03 = this.A05;
                if (r03 != null) {
                    this.A0S = r03.A0n();
                    C19830z4 r04 = this.A05;
                    if (r04 != null) {
                        this.A00 = C17890vO.A0B(r04).getInt("pref_email_otp_eligibility", 0);
                        C19830z4 r05 = this.A05;
                        if (r05 != null) {
                            this.A01 = C17890vO.A0B(r05).getInt("pref_send_sms_eligibility", 0);
                            C19830z4 r06 = this.A05;
                            if (r06 != null) {
                                this.A02 = C17890vO.A0B(r06).getInt("pref_wa_old_eligibility", 0);
                                C19830z4 r07 = this.A05;
                                if (r07 != null) {
                                    this.A0I = r07.A0k();
                                    A8V a8v = this.A0A;
                                    if (a8v != null) {
                                        a8v.A0A(new C197939xW(this.A0L, (String) null), "view_fallback_options", this.A0M);
                                        return;
                                    }
                                    str = "funnelLogger";
                                    C18070vi.A11(str);
                                    throw null;
                                }
                            }
                        }
                    }
                }
            }
        }
        str = "waSharedPreferences";
        C18070vi.A11(str);
        throw null;
    }
}
