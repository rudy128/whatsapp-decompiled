package com.whatsapp.bizintegrity.callpermission;

import X.A2A;
import X.A2Y;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass121;
import X.AnonymousClass1DF;
import X.C139436yq;
import X.C170008nw;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C183009Wo;
import X.C183019Wp;
import X.C183999aF;
import X.C190949lm;
import X.C191709n3;
import X.C21859Atl;
import X.C21860Atm;
import X.C21861Atn;
import X.C21862Ato;
import X.C21863Atp;
import X.C21864Atq;
import X.C33251iW;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

public final class CallPermissionRequestBottomSheet extends Hilt_CallPermissionRequestBottomSheet {
    public RadioGroup A00;
    public TextEmojiLabel A01;
    public TextEmojiLabel A02;
    public C33251iW A03;
    public WaImageView A04;
    public C183009Wo A05;
    public C191709n3 A06;
    public C170008nw A07;
    public C183019Wp A08;
    public A2Y A09;
    public A2A A0A;
    public C190949lm A0B;
    public C183999aF A0C;
    public C18000vb A0D;
    public AnonymousClass121 A0E;
    public AnonymousClass10I A0F;
    public AnonymousClass00H A0G;
    public final C18100vl A0H = AnonymousClass1DF.A01(new C21859Atl(this));
    public final C18100vl A0I = AnonymousClass1DF.A01(new C21860Atm(this));
    public final C18100vl A0J = AnonymousClass1DF.A01(new C21861Atn(this));
    public final C18100vl A0K = AnonymousClass1DF.A01(new C21862Ato(this));
    public final C18100vl A0L = AnonymousClass1DF.A01(new C21863Atp(this));
    public final C18100vl A0M = AnonymousClass1DF.A01(new C21864Atq(this));

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624446, viewGroup, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r15, android.view.View r16) {
        /*
            r14 = this;
            r9 = 0
            r1 = r16
            X.C18070vi.A0d(r1, r9)
            super.A21(r15, r1)
            r0 = 2131428716(0x7f0b056c, float:1.8479084E38)
            com.whatsapp.WaImageView r0 = X.AnonymousClass3MW.A0R(r1, r0)
            r14.A04 = r0
            r0 = 2131428717(0x7f0b056d, float:1.8479086E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            r14.A00 = r0
            r0 = 2131428719(0x7f0b056f, float:1.847909E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r1, r0)
            r14.A02 = r0
            r0 = 2131428718(0x7f0b056e, float:1.8479088E38)
            com.whatsapp.TextEmojiLabel r0 = X.AnonymousClass3MX.A0V(r1, r0)
            r14.A01 = r0
            android.content.Context r3 = r14.A1n()
            if (r3 == 0) goto L_0x0050
            com.whatsapp.TextEmojiLabel r2 = r14.A02
            if (r2 == 0) goto L_0x0050
            X.8nw r0 = r14.A07
            if (r0 == 0) goto L_0x022d
            X.0vl r0 = r14.A0J
            boolean r1 = X.C72453Mb.A1a(r0)
            r0 = 1
            if (r1 != r0) goto L_0x020e
            r0 = 2131887822(0x7f1206ce, float:1.9410262E38)
        L_0x0049:
            java.lang.String r0 = X.C18070vi.A0F(r3, r0)
            r2.setText(r0)
        L_0x0050:
            android.content.Context r7 = r14.A1n()
            if (r7 == 0) goto L_0x00f2
            com.whatsapp.TextEmojiLabel r5 = r14.A01
            if (r5 == 0) goto L_0x00f2
            X.8nw r11 = r14.A07
            if (r11 == 0) goto L_0x022d
            X.0vl r0 = r14.A0I
            java.lang.Object r10 = r0.getValue()
            X.1BI r10 = (X.AnonymousClass1BI) r10
            X.0vl r0 = r14.A0L
            java.lang.Object r0 = r0.getValue()
            X.9Wq r0 = (X.C183029Wq) r0
            java.util.List r1 = r0.A00
            X.0vl r0 = r14.A0J
            boolean r4 = X.C72453Mb.A1a(r0)
            r8 = 1
            if (r4 != r8) goto L_0x0207
            r6 = 2131887819(0x7f1206cb, float:1.9410256E38)
        L_0x007c:
            X.C18070vi.A0d(r1, r9)
            java.util.Iterator r3 = r1.iterator()
        L_0x0083:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0204
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.A2Y r0 = (X.A2Y) r0
            X.9IT r1 = r0.A00
            X.9IT r0 = X.AnonymousClass9IT.YES
            if (r1 != r0) goto L_0x0083
        L_0x0096:
            X.A2Y r2 = (X.A2Y) r2
            if (r2 == 0) goto L_0x01fe
            java.lang.Long r0 = r2.A01
            if (r0 == 0) goto L_0x01fe
            long r0 = r0.longValue()
        L_0x00a2:
            r2 = 86400(0x15180, double:4.26873E-319)
            long r0 = r0 / r2
            int r2 = (int) r0
            java.lang.String r2 = X.C170008nw.A00(r7, r11, r10, r2, r6)
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            r6.append(r2)
            r0 = 32
            r6.append(r0)
            r0 = 2131887821(0x7f1206cd, float:1.941026E38)
            if (r4 != r8) goto L_0x00c0
            r0 = 2131887820(0x7f1206cc, float:1.9410258E38)
        L_0x00c0:
            java.lang.String r1 = X.C18070vi.A0F(r7, r0)
            r6.append(r1)
            int r0 = r2.length()
            int r4 = r0 + 1
            int r3 = r1.length()
            int r3 = r3 + r4
            int r3 = r3 - r8
            r1 = 2132084414(0x7f1506be, float:1.9808998E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r7, r1)
            r2 = 18
            r6.setSpan(r0, r4, r3, r2)
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            int r1 = X.C19740yt.A00(r7, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r6.setSpan(r0, r4, r3, r2)
            r5.setText(r6)
        L_0x00f2:
            com.whatsapp.WaImageView r1 = r14.A04
            if (r1 == 0) goto L_0x00fb
            r0 = 22
            X.AnonymousClass3MZ.A1I(r1, r14, r0)
        L_0x00fb:
            X.0vl r12 = r14.A0L
            java.lang.Object r0 = r12.getValue()
            X.9Wq r0 = (X.C183029Wq) r0
            java.util.List r0 = r0.A00
            int r11 = r0.size()
            r10 = 0
        L_0x010a:
            if (r10 >= r11) goto L_0x0222
            java.lang.Object r0 = r12.getValue()
            X.9Wq r0 = (X.C183029Wq) r0
            java.util.List r0 = r0.A00
            java.lang.Object r8 = r0.get(r10)
            X.A2Y r8 = (X.A2Y) r8
            X.9IT r3 = r8.A00
            X.0vl r1 = r14.A0M
            java.lang.Object r0 = r1.getValue()
            X.A2Y r0 = (X.A2Y) r0
            if (r0 == 0) goto L_0x01fb
            X.9IT r0 = r0.A00
        L_0x0128:
            if (r3 == r0) goto L_0x013a
            X.0vl r0 = r14.A0J
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x01f8
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x01f8
            if (r10 != 0) goto L_0x01f8
        L_0x013a:
            r7 = 1
        L_0x013b:
            android.content.Context r6 = r14.A1n()
            if (r6 == 0) goto L_0x01f2
            X.1FL r2 = r14.A1B()
            r1 = 2132083664(0x7f1503d0, float:1.9807477E38)
            X.01k r0 = new X.01k
            r0.<init>(r2, r1)
            androidx.appcompat.widget.AppCompatRadioButton r5 = new androidx.appcompat.widget.AppCompatRadioButton
            r5.<init>(r0)
            r0 = 2
            r5.setMaxLines(r0)
            r2 = -1
            r1 = -2
            android.widget.RadioGroup$LayoutParams r0 = new android.widget.RadioGroup$LayoutParams
            r0.<init>(r2, r1)
            r5.setLayoutParams(r0)
            X.8nw r0 = r14.A07
            if (r0 == 0) goto L_0x0218
            java.lang.String r4 = X.C170008nw.A01(r6, r8)
            X.9Wp r2 = r14.A08
            if (r2 == 0) goto L_0x0215
            int r0 = r3.ordinal()
            if (r0 != r9) goto L_0x01f6
            java.lang.Long r0 = r8.A01
            if (r0 == 0) goto L_0x01f6
            long r0 = r0.longValue()
            X.11P r2 = r2.A00
            long r2 = X.AnonymousClass11P.A01(r2)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r13.toMillis(r0)
            java.lang.Long r0 = X.C17880vN.A0o(r2, r0)
            if (r0 == 0) goto L_0x01f6
            long r0 = r0.longValue()
            X.11Y r3 = X.AnonymousClass11X.A00
            X.0vb r2 = r14.A0D
            if (r2 == 0) goto L_0x021b
            java.lang.String r1 = r3.A09(r2, r0)
            r0 = 2131887817(0x7f1206c9, float:1.9410252E38)
            java.lang.String r1 = X.AnonymousClass3MY.A0o(r14, r1, r9, r0)
        L_0x01a1:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            android.text.SpannableStringBuilder r13 = r0.append(r4)
            if (r1 == 0) goto L_0x01dc
            r0 = 10
            android.text.SpannableStringBuilder r0 = r13.append(r0)
            r0.append(r1)
            int r0 = r4.length()
            int r4 = r0 + 1
            int r3 = r1.length()
            int r3 = r3 + r4
            r1 = 2132084416(0x7f1506c0, float:1.9809002E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r6, r1)
            r2 = 18
            r13.setSpan(r0, r4, r3, r2)
            r0 = 2131103152(0x7f060db0, float:1.7818762E38)
            int r1 = X.C19740yt.A00(r6, r0)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r13.setSpan(r0, r4, r3, r2)
        L_0x01dc:
            r5.setText(r13)
            r5.setChecked(r7)
            if (r7 == 0) goto L_0x01e6
            r14.A09 = r8
        L_0x01e6:
            r0 = 32
            X.AnonymousClass78Q.A00(r5, r8, r14, r0)
            android.widget.RadioGroup r0 = r14.A00
            if (r0 == 0) goto L_0x01f2
            r0.addView(r5)
        L_0x01f2:
            int r10 = r10 + 1
            goto L_0x010a
        L_0x01f6:
            r1 = 0
            goto L_0x01a1
        L_0x01f8:
            r7 = 0
            goto L_0x013b
        L_0x01fb:
            r0 = 0
            goto L_0x0128
        L_0x01fe:
            X.9aE r0 = r11.A01
            long r0 = r0.A00
            goto L_0x00a2
        L_0x0204:
            r2 = 0
            goto L_0x0096
        L_0x0207:
            if (r4 != 0) goto L_0x0223
            r6 = 2131887818(0x7f1206ca, float:1.9410254E38)
            goto L_0x007c
        L_0x020e:
            if (r1 != 0) goto L_0x0228
            r0 = 2131887829(0x7f1206d5, float:1.9410276E38)
            goto L_0x0049
        L_0x0215:
            java.lang.String r0 = "callPermissionReplyOptionUtil"
            goto L_0x021d
        L_0x0218:
            java.lang.String r0 = "nativeFlowAction"
            goto L_0x021d
        L_0x021b:
            java.lang.String r0 = "whatsAppLocale"
        L_0x021d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0222:
            return
        L_0x0223:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0228:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x022d:
            java.lang.String r0 = "nativeFlowAction"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet.A21(android.os.Bundle, android.view.View):void");
    }

    public void A2I(C139436yq r2) {
        C18070vi.A0d(r2, 0);
        r2.A01(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r22) {
        /*
            r21 = this;
            r14 = 0
            r2 = r22
            X.C18070vi.A0d(r2, r14)
            r0 = r21
            X.A2Y r3 = r0.A09
            X.0vl r4 = r0.A0M
            java.lang.Object r1 = r4.getValue()
            boolean r1 = X.C18070vi.A18(r3, r1)
            if (r1 != 0) goto L_0x00bc
            X.A2Y r1 = r0.A09
            if (r1 == 0) goto L_0x00bc
            X.0vl r3 = r0.A0J
            boolean r5 = X.C72453Mb.A1a(r3)
            if (r5 == 0) goto L_0x00d6
            X.0vl r9 = r0.A0I
            java.lang.Object r5 = r9.getValue()
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            r5.getRawString()
            android.content.Context r16 = r0.A1n()
            if (r16 == 0) goto L_0x0094
            X.9lm r15 = r0.A0B
            if (r15 == 0) goto L_0x0150
            java.lang.Object r6 = r9.getValue()
            X.1BI r6 = (X.AnonymousClass1BI) r6
            boolean r20 = X.C72453Mb.A1a(r3)
            X.0vl r5 = r0.A0H
            java.lang.String r19 = X.AnonymousClass3MW.A0y(r5)
            r18 = r6
            r17 = r1
            X.21g r6 = r15.A00(r16, r17, r18, r19, r20)
            X.1iW r11 = r0.A03
            if (r11 == 0) goto L_0x0153
            r10 = 0
            X.10I r8 = r11.A19
            r7 = 2
            X.C21455AkM.A00(r8, r11, r10, r6, r7)
            X.9n3 r11 = r0.A06
            if (r11 == 0) goto L_0x0138
            java.lang.Object r12 = r9.getValue()
            X.9IT r8 = r1.A00
            X.9IT r7 = X.AnonymousClass9IT.YES
            boolean r17 = X.AnonymousClass000.A1Z(r8, r7)
            java.lang.Long r7 = r1.A01
            long r15 = X.C17900vP.A01(r7)
            java.lang.String r13 = X.AnonymousClass3MW.A0y(r5)
            X.C18070vi.A0X(r13)
            X.C18070vi.A0d(r12, r14)
            X.10I r5 = r11.A08
            X.Aj4 r10 = new X.Aj4
            r10.<init>(r11, r12, r13, r14, r15, r17)
            r5.CGF(r10)
            X.9aF r9 = r0.A0C
            if (r9 == 0) goto L_0x0135
            X.10I r8 = r9.A01
            r5 = 42
            X.AkH r7 = new X.AkH
            r7.<init>(r6, r9, r5)
        L_0x0091:
            r8.CGF(r7)
        L_0x0094:
            X.9IT r1 = r1.A00
            int r5 = r1.ordinal()
            if (r5 == r14) goto L_0x00d3
            r1 = 1
            if (r5 != r1) goto L_0x0130
            r6 = 14
        L_0x00a1:
            boolean r1 = X.C72453Mb.A1a(r3)
            if (r1 == 0) goto L_0x00c9
            java.lang.Object r1 = r4.getValue()
            if (r1 != 0) goto L_0x00c9
            r5 = 8
        L_0x00af:
            X.10I r4 = r0.A0F
            if (r4 == 0) goto L_0x0129
            r3 = 1
            X.7RE r1 = new X.7RE
            r1.<init>(r0, r6, r5, r3)
            r4.CGF(r1)
        L_0x00bc:
            super.onDismiss(r2)
            X.9Wo r0 = r0.A05
            if (r0 == 0) goto L_0x00c8
            com.whatsapp.bizintegrity.callpermission.BizCallbackActivity r0 = r0.A00
            r0.finish()
        L_0x00c8:
            return
        L_0x00c9:
            boolean r1 = X.C72453Mb.A1a(r3)
            r5 = 7
            if (r1 == 0) goto L_0x00af
            r5 = 9
            goto L_0x00af
        L_0x00d3:
            r6 = 13
            goto L_0x00a1
        L_0x00d6:
            X.0vl r10 = r0.A0K
            r10.getValue()
            android.content.Context r16 = r0.A1n()
            if (r16 == 0) goto L_0x0094
            java.lang.Object r5 = r10.getValue()
            X.205 r5 = (X.AnonymousClass205) r5
            X.1BI r5 = r5.A00
            if (r5 == 0) goto L_0x0094
            X.9lm r15 = r0.A0B
            if (r15 == 0) goto L_0x0150
            boolean r20 = X.C72453Mb.A1a(r3)
            r19 = 0
            r18 = r5
            r17 = r1
            X.21g r9 = r15.A00(r16, r17, r18, r19, r20)
            X.1iW r8 = r0.A03
            if (r8 == 0) goto L_0x014a
            java.lang.Object r7 = r10.getValue()
            X.10I r6 = r8.A19
            r5 = 2
            X.C21455AkM.A00(r6, r8, r7, r9, r5)
            X.A2A r8 = r0.A0A
            if (r8 == 0) goto L_0x0144
            java.lang.Object r7 = X.AnonymousClass3MX.A14(r10)
            X.10I r6 = r8.A05
            r5 = 32
            X.C21455AkM.A00(r6, r8, r7, r9, r5)
            X.9aF r6 = r0.A0C
            if (r6 == 0) goto L_0x013e
            X.10I r8 = r6.A01
            r5 = 42
            X.AkH r7 = new X.AkH
            r7.<init>(r9, r6, r5)
            goto L_0x0091
        L_0x0129:
            java.lang.String r0 = "waWorkers"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0130:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0135:
            java.lang.String r0 = "callPermissionSettingManager"
            goto L_0x0155
        L_0x0138:
            java.lang.String r0 = "bizCallbackUtils"
            X.C18070vi.A11(r0)
            throw r10
        L_0x013e:
            java.lang.String r0 = "callPermissionSettingManager"
            X.C18070vi.A11(r0)
            throw r19
        L_0x0144:
            java.lang.String r0 = "callPermissionRequestUtil"
            X.C18070vi.A11(r0)
            throw r19
        L_0x014a:
            java.lang.String r0 = "userActions"
            X.C18070vi.A11(r0)
            throw r19
        L_0x0150:
            java.lang.String r0 = "callPermissionResponseUtil"
            goto L_0x0155
        L_0x0153:
            java.lang.String r0 = "userActions"
        L_0x0155:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bizintegrity.callpermission.CallPermissionRequestBottomSheet.onDismiss(android.content.DialogInterface):void");
    }
}
