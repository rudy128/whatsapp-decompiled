package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11S;
import X.AnonymousClass1HF;
import X.AnonymousClass1PM;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C108955ca;
import X.C17900vP;
import X.C18000vb;
import X.C18030ve;
import X.C24751Ln;
import X.C27691Xc;
import X.C33251iW;
import X.C85754Op;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.whatsapp.TextEmojiLabel;
import java.util.Map;
import java.util.Set;

public class InteractiveMessageButton extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass11S A00;
    public C33251iW A01;
    public AnonymousClass1PM A02;
    public C18000vb A03;
    public C24751Ln A04;
    public C18030ve A05;
    public AnonymousClass1QJ A06;
    public AnonymousClass1QO A07;
    public AnonymousClass1QS A08;
    public C85754Op A09;
    public AnonymousClass1R2 A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public AnonymousClass00H A0D;
    public AnonymousClass00H A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass031 A0H;
    public Map A0I;
    public boolean A0J;
    public final TextEmojiLabel A0K;
    public final InteractiveButtonsRowContentLayout A0L;
    public final Set A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ec, code lost:
        if (r2 < 2) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (android.text.TextUtils.equals(r1, "active") != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(X.C20279AEn r12, X.AnonymousClass206 r13, java.util.List r14) {
        /*
            r11 = this;
            r0 = 3
            java.util.ArrayList r6 = X.C17880vN.A0z(r0)
            X.1R2 r0 = r11.A0A
            java.util.HashSet r5 = r0.A0g(r12, r13)
            r4 = 0
            boolean r0 = X.C108965cb.A1Z(r5, r4)
            r3 = -1
            r10 = 1
            if (r0 == 0) goto L_0x01e1
            X.1QO r0 = r11.A07
            X.0ve r2 = r0.A02
            r1 = 7102(0x1bbe, float:9.952E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01e1
            X.1QS r0 = r11.A08
            X.1KH r2 = X.AnonymousClass8BR.A0R(r0)
            X.205 r0 = r13.A0v
            X.1BI r1 = r0.A00
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.1Ln r0 = r11.A04
            X.8pI r7 = X.C62862s7.A00(r0, r2, r1)
            r2 = 1
            java.lang.String r0 = "cards"
            r6.add(r0)
            android.content.Context r1 = r11.getContext()
            r0 = 2131888286(0x7f12089e, float:1.9411203E38)
            java.lang.String r8 = r1.getString(r0)
            if (r7 == 0) goto L_0x0054
            java.lang.String r1 = r7.A04
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "active"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            r7 = 1
            if (r0 == 0) goto L_0x0055
        L_0x0054:
            r7 = 0
        L_0x0055:
            r0 = 6
            X.4kv r1 = new X.4kv
            r1.<init>(r11, r13, r0)
            X.4Ns r0 = new X.4Ns
            r0.<init>(r1, r8, r3, r7)
            r14.add(r0)
        L_0x0063:
            r0 = 6
            boolean r0 = X.C108965cb.A1Z(r5, r0)
            if (r0 == 0) goto L_0x00bf
            X.1QO r0 = r11.A07
            X.0ve r1 = r0.A02
            r0 = 7101(0x1bbd, float:9.95E-42)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x00bf
            int r2 = r2 + 1
            java.lang.String r0 = "pix_dynamic_code"
            r6.add(r0)
            r7 = 2131888297(0x7f1208a9, float:1.9411225E38)
            boolean r0 = r12.A08()
            if (r0 == 0) goto L_0x009e
            X.1PM r1 = r11.A02
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3Ma.A0o(r13)
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x01dd
            X.0ve r1 = r11.A05
            r0 = 10566(0x2946, float:1.4806E-41)
            boolean r0 = X.C18020vd.A05(r8, r1, r0)
            if (r0 == 0) goto L_0x01dd
        L_0x009e:
            r7 = 2131889051(0x7f120b9b, float:1.9412755E38)
            java.lang.Integer r0 = X.AnonymousClass00R.A06
        L_0x00a3:
            int r0 = r0.intValue()
            switch(r0) {
                case 5: goto L_0x01da;
                case 6: goto L_0x01d7;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01d1;
                case 9: goto L_0x00aa;
                case 10: goto L_0x01cd;
                case 11: goto L_0x01c9;
                case 12: goto L_0x01c5;
                case 13: goto L_0x01c1;
                case 14: goto L_0x01bd;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            r0 = 3
        L_0x00ab:
            java.lang.String r8 = X.AnonymousClass3Ma.A11(r11, r7)
            r7 = 2131231835(0x7f08045b, float:1.8079762E38)
            X.AQJ r1 = new X.AQJ
            r1.<init>(r11, r13, r0)
            X.4Ns r0 = new X.4Ns
            r0.<init>(r1, r8, r7, r4)
            r14.add(r0)
        L_0x00bf:
            r8 = 2
            if (r2 >= r8) goto L_0x011a
            r0 = 5
            boolean r0 = X.C108965cb.A1Z(r5, r0)
            if (r0 == 0) goto L_0x00ee
            int r2 = r2 + 1
            java.lang.String r0 = "payment_link"
            r6.add(r0)
            android.content.Context r1 = r11.getContext()
            r0 = 2131888295(0x7f1208a7, float:1.9411221E38)
            java.lang.String r9 = r1.getString(r0)
            r7 = 2131231636(0x7f080394, float:1.8079359E38)
            r0 = 7
            X.4kv r1 = new X.4kv
            r1.<init>(r11, r13, r0)
            X.4Ns r0 = new X.4Ns
            r0.<init>(r1, r9, r7, r4)
            r14.add(r0)
            if (r2 >= r8) goto L_0x011a
        L_0x00ee:
            r0 = 8
            boolean r0 = X.C108965cb.A1Z(r5, r0)
            if (r0 == 0) goto L_0x011a
            int r2 = r2 + 1
            java.lang.String r0 = "boleto"
            r6.add(r0)
            android.content.Context r1 = r11.getContext()
            r0 = 2131888292(0x7f1208a4, float:1.9411215E38)
            java.lang.String r9 = r1.getString(r0)
            r7 = 2131231835(0x7f08045b, float:1.8079762E38)
            r0 = 8
            X.4kv r1 = new X.4kv
            r1.<init>(r11, r13, r0)
            X.4Ns r0 = new X.4Ns
            r0.<init>(r1, r9, r7, r4)
            r14.add(r0)
        L_0x011a:
            X.00H r0 = r11.A0G
            java.lang.Object r0 = r0.get()
            X.1ej r0 = (X.C30921ej) r0
            if (r0 == 0) goto L_0x0168
            X.1ei r0 = r0.A00()
            if (r0 == 0) goto L_0x0168
            X.0ve r7 = r0.A00
            r1 = 12476(0x30bc, float:1.7483E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r1)
            if (r0 == 0) goto L_0x0168
            java.lang.String r7 = r12.A0J
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0168
            int r0 = r6.size()
            if (r0 < r8) goto L_0x0168
            int r1 = r6.size()
            int r0 = r14.size()
            if (r1 != r0) goto L_0x0168
            r1 = 0
        L_0x014f:
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0168
            java.lang.String r0 = X.C108945cZ.A1H(r6, r1)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x01ba
            if (r1 <= 0) goto L_0x0168
            java.lang.Object r0 = r14.remove(r1)
            r14.add(r4, r0)
        L_0x0168:
            int r0 = r5.size()
            if (r0 <= r2) goto L_0x0191
            if (r2 <= 0) goto L_0x0191
            X.1QO r0 = r11.A07
            boolean r1 = X.AnonymousClass8BU.A1R(r0)
            r0 = 2131888281(0x7f120899, float:1.9411193E38)
            if (r1 == 0) goto L_0x017e
            r0 = 2131888302(0x7f1208ae, float:1.9411235E38)
        L_0x017e:
            java.lang.String r6 = X.AnonymousClass3Ma.A11(r11, r0)
            r0 = 10
            X.4kv r1 = new X.4kv
            r1.<init>(r11, r13, r0)
            X.4Ns r0 = new X.4Ns
            r0.<init>(r1, r6, r3, r4)
            r14.add(r0)
        L_0x0191:
            int r0 = r5.size()
            if (r0 != 0) goto L_0x01e4
            X.1QO r0 = r11.A07
            boolean r0 = X.AnonymousClass8BU.A1R(r0)
            if (r0 == 0) goto L_0x01e4
            android.content.Context r1 = r11.getContext()
            r0 = 2131888303(0x7f1208af, float:1.9411238E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 11
            X.4kv r1 = new X.4kv
            r1.<init>(r11, r13, r0)
            X.4Ns r0 = new X.4Ns
            r0.<init>(r1, r2, r3, r4)
            r14.add(r0)
            return r10
        L_0x01ba:
            int r1 = r1 + 1
            goto L_0x014f
        L_0x01bd:
            r0 = 14
            goto L_0x00ab
        L_0x01c1:
            r0 = 13
            goto L_0x00ab
        L_0x01c5:
            r0 = 12
            goto L_0x00ab
        L_0x01c9:
            r0 = 11
            goto L_0x00ab
        L_0x01cd:
            r0 = 10
            goto L_0x00ab
        L_0x01d1:
            r0 = 1
            goto L_0x00ab
        L_0x01d4:
            r0 = 0
            goto L_0x00ab
        L_0x01d7:
            r0 = 5
            goto L_0x00ab
        L_0x01da:
            r0 = 4
            goto L_0x00ab
        L_0x01dd:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x00a3
        L_0x01e1:
            r2 = 0
            goto L_0x0063
        L_0x01e4:
            if (r2 <= 0) goto L_0x01e7
            r4 = 1
        L_0x01e7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageButton.A00(X.AEn, X.206, java.util.List):boolean");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9NP, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0308, code lost:
        if (r3 != false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0378, code lost:
        if (A00(r1, r4, r7) != false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03a2, code lost:
        if (r2.A07.A0Q(r1.A0Q) != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0470, code lost:
        if (android.text.TextUtils.isEmpty(r1.A08) != false) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0476, code lost:
        if (A00(r1, r4, r7) != false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x047a, code lost:
        if (r12 != false) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x04c7, code lost:
        if (r11 == false) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0678, code lost:
        if (r1 != 6) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x067a, code lost:
        r13.setMessageText(r3, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x067d, code lost:
        if (r6 == null) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x06ec, code lost:
        if (r6 != null) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x021d, code lost:
        if (X.C20089A6r.A01(r3.A01) == 4) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0294, code lost:
        if (703 == r3) goto L_0x0296;
     */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x04bc  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04e1  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x053a  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05c7  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x068a  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x06bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.AnonymousClass1GP r23, X.AnonymousClass3uP r24, X.C108875cR r25, X.AnonymousClass206 r26) {
        /*
            r22 = this;
            r4 = r26
            boolean r0 = r4 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x00d5
            r2 = r22
            com.whatsapp.TextEmojiLabel r5 = r2.A0K
            r0 = 8
            r5.setVisibility(r0)
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout r15 = r2.A0L
            r15.setVisibility(r0)
            r0 = r4
            X.21K r0 = (X.AnonymousClass21K) r0
            X.AEt r6 = r0.BPK()
            r13 = r24
            if (r6 == 0) goto L_0x0654
            X.AEn r1 = r6.A02
            if (r1 == 0) goto L_0x00d6
            int r3 = r6.A00
            r1 = 3
            if (r3 != r1) goto L_0x00d6
            java.lang.String r1 = "review_order"
            boolean r1 = X.AnonymousClass8BU.A1S(r6, r1)
            if (r1 == 0) goto L_0x017b
            r7 = 0
            r15.setVisibility(r7)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            android.content.Context r3 = r2.getContext()
            r1 = 2131894876(0x7f12225c, float:1.942457E38)
            java.lang.String r9 = r3.getString(r1)
            android.content.Context r3 = r2.getContext()
            r1 = 2131892042(0x7f12174a, float:1.9418821E38)
            java.lang.String r5 = r3.getString(r1)
            java.lang.String r18 = "menu_button"
            boolean r8 = X.AnonymousClass8BU.A1X(r9)
            r11 = 0
            X.9t8 r10 = new X.9t8
            r17 = r11
            r19 = r9
            r20 = r8
            r21 = r7
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            X.0ve r1 = r2.A05
            int r1 = X.AnonymousClass8BX.A03(r1)
            boolean r12 = X.AnonymousClass000.A1O(r1)
            android.content.Context r3 = r2.getContext()
            r1 = 2131888291(0x7f1208a3, float:1.9411213E38)
            if (r12 == 0) goto L_0x007a
            r1 = 2131888290(0x7f1208a2, float:1.9411211E38)
        L_0x007a:
            java.lang.String r12 = r3.getString(r1)
            r3 = 16
            X.4kv r1 = new X.4kv
            r1.<init>(r2, r4, r3)
            r3 = -1
            X.AnonymousClass8BT.A1B(r1, r12, r6, r3, r7)
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x00af
            X.AEn r1 = r0.A02
            if (r1 == 0) goto L_0x00af
            X.1R2 r0 = r2.A0A
            boolean r0 = r0.A0m(r11, r1)
            if (r0 == 0) goto L_0x00af
            android.content.Context r1 = r2.getContext()
            r0 = 2131888294(0x7f1208a6, float:1.941122E38)
            java.lang.String r11 = r1.getString(r0)
            r1 = 2
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r1)
            X.AnonymousClass8BT.A1B(r0, r11, r6, r3, r7)
        L_0x00af:
            X.1PM r1 = r2.A02
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3Ma.A0o(r4)
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x00ce
            boolean r1 = r10.A00
            X.AQL r0 = new X.AQL
            r0.<init>(r4, r2, r9, r8)
            X.AnonymousClass8BT.A1B(r0, r9, r6, r3, r1)
            r1 = 2
            X.AQL r0 = new X.AQL
            r0.<init>(r4, r2, r5, r1)
            X.AnonymousClass8BT.A1B(r0, r5, r6, r3, r7)
        L_0x00ce:
            int r0 = r6.size()
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(r13, r15, r6, r0)
        L_0x00d5:
            return
        L_0x00d6:
            int r1 = r6.A00
            r0 = 5
            if (r1 == r0) goto L_0x00df
            r0 = 9
            if (r1 != r0) goto L_0x0654
        L_0x00df:
            X.AEk r7 = r6.A06
            if (r7 == 0) goto L_0x00d5
            java.util.List r0 = r7.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x00e9:
            boolean r0 = r8.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x016b
            java.lang.Object r1 = r8.next()
            X.ADl r1 = (X.C20253ADl) r1
            X.00H r0 = r2.A0F
            java.lang.Object r5 = r0.get()
            X.1l7 r5 = (X.C34811l7) r5
            X.AEe r3 = r1.A01
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r3.A00
            X.9ul r1 = r5.A02(r1, r0)
            if (r1 == 0) goto L_0x00e9
            android.content.Context r0 = r2.getContext()
            java.lang.String r0 = r1.A09(r0, r6, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e9
        L_0x0118:
            r0 = 0
            r15.setVisibility(r0)
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            r7 = 0
        L_0x0121:
            X.AEk r0 = r6.A06
            java.util.List r0 = r0.A03
            int r1 = r0.size()
            X.AEk r0 = r6.A06
            if (r7 >= r1) goto L_0x0504
            java.util.List r0 = r0.A03
            java.lang.Object r8 = r0.get(r7)
            X.ADl r8 = (X.C20253ADl) r8
            X.00H r0 = r2.A0F
            java.lang.Object r5 = r0.get()
            X.1l7 r5 = (X.C34811l7) r5
            X.AEe r3 = r8.A01
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r3.A00
            X.9ul r1 = r5.A02(r1, r0)
            if (r1 == 0) goto L_0x0168
            if (r7 != 0) goto L_0x014e
            r0 = 1
            r15.A04 = r0
        L_0x014e:
            android.content.Context r0 = r2.getContext()
            java.lang.String r5 = r1.A09(r0, r6, r3)
            boolean r3 = r8.A00
            if (r5 != 0) goto L_0x015c
            java.lang.String r5 = ""
        L_0x015c:
            int r1 = r1.A05(r6)
            X.4kw r0 = new X.4kw
            r0.<init>(r2, r4, r6, r3)
            X.AnonymousClass8BT.A1B(r0, r5, r10, r1, r3)
        L_0x0168:
            int r7 = r7 + 1
            goto L_0x0121
        L_0x016b:
            int r1 = r7.A01
            r0 = 2
            if (r1 != r0) goto L_0x00d5
            java.util.List r0 = r7.A04
            if (r0 == 0) goto L_0x00d5
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != r3) goto L_0x00d5
            goto L_0x0118
        L_0x017b:
            X.AEn r1 = r6.A02
            r0 = 0
            r15.setVisibility(r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.1QJ r0 = r2.A06
            X.2tK r0 = r0.A02()
            if (r0 == 0) goto L_0x01db
            java.lang.String r3 = r0.A03
            java.util.Map r0 = r2.A0I
            java.lang.Object r6 = r0.get(r3)
            X.0vp r6 = (X.C18140vp) r6
            if (r6 == 0) goto L_0x01db
            X.0ve r5 = r2.A05
            r3 = 10077(0x275d, float:1.4121E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r3)
            if (r0 == 0) goto L_0x01db
            java.lang.Object r0 = r6.get()
            X.B7v r0 = (X.C22439B7v) r0
            X.9rW r9 = r0.BOZ(r1, r4)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.List r0 = r9.A00
            java.util.Iterator r10 = r0.iterator()
        L_0x01b9:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x04f2
            java.lang.Object r8 = r10.next()
            X.A1r r8 = (X.C19981A1r) r8
            android.content.Context r3 = r2.getContext()
            int r0 = r8.A01
            java.lang.String r6 = r3.getString(r0)
            int r5 = r8.A00
            X.AQK r3 = new X.AQK
            r3.<init>(r8, r2, r4)
            r0 = 0
            X.AnonymousClass8BT.A1B(r3, r6, r7, r5, r0)
            goto L_0x01b9
        L_0x01db:
            X.205 r6 = r4.A0v
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0255
            X.1R2 r0 = r2.A0A
            X.1QO r0 = r0.A09
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0255
            X.1R2 r5 = r2.A0A
            X.11S r0 = r5.A00
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)
            X.1QO r0 = r5.A09
            int r0 = r0.A05(r3)
            r5 = 1
            if (r0 != r5) goto L_0x0255
            X.1R2 r0 = r2.A0A
            X.1BI r3 = r6.A00
            X.1QO r0 = r0.A09
            int r0 = r0.A05(r3)
            if (r0 != r5) goto L_0x0255
            r15.A04 = r5
            X.AEU r3 = r1.A0D
            java.lang.String r0 = r3.A01
            int r1 = X.C20089A6r.A01(r0)
            r0 = 3
            if (r1 == r0) goto L_0x021f
            java.lang.String r0 = r3.A01
            int r3 = X.C20089A6r.A01(r0)
            r1 = 4
            r0 = 1
            if (r3 != r1) goto L_0x0220
        L_0x021f:
            r0 = 0
        L_0x0220:
            r6 = 0
            r5 = -1
            if (r0 == 0) goto L_0x0239
            android.content.Context r1 = r2.getContext()
            r0 = 2131897376(0x7f122c20, float:1.942964E38)
            java.lang.String r3 = r1.getString(r0)
            r1 = 14
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r1)
            X.AnonymousClass8BT.A1B(r0, r3, r7, r5, r6)
        L_0x0239:
            android.content.Context r1 = r2.getContext()
            r0 = 2131897884(0x7f122e1c, float:1.943067E38)
            java.lang.String r3 = r1.getString(r0)
            r1 = 15
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r1)
            X.4Ns r2 = new X.4Ns
            r2.<init>(r0, r3, r5, r6)
        L_0x0250:
            r7.add(r2)
            goto L_0x04fc
        L_0x0255:
            X.1PM r0 = r2.A02
            X.1BI r10 = r6.A00
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r10)
            boolean r12 = r0.A04(r6)
            r0 = 1
            r15.A04 = r0
            r8 = 0
            if (r12 == 0) goto L_0x030c
            if (r10 == 0) goto L_0x027b
            X.00H r0 = r2.A0D
            java.lang.Object r5 = r0.get()
            X.9ke r5 = (X.C190269ke) r5
            r3 = 7751(0x1e47, float:1.0861E-41)
            java.lang.String r0 = r10.user
            boolean r0 = r5.A00(r3, r0)
            if (r0 != 0) goto L_0x0283
        L_0x027b:
            X.1R2 r0 = r2.A0A
            boolean r0 = r0.A0q(r1)
            if (r0 == 0) goto L_0x030c
        L_0x0283:
            int r3 = r1.A00
            r0 = 106(0x6a, float:1.49E-43)
            if (r0 == r3) goto L_0x0296
            r0 = 405(0x195, float:5.68E-43)
            if (r0 == r3) goto L_0x0296
            r0 = 604(0x25c, float:8.46E-43)
            if (r0 == r3) goto L_0x0296
            r0 = 703(0x2bf, float:9.85E-43)
            r5 = 0
            if (r0 != r3) goto L_0x0297
        L_0x0296:
            r5 = 1
        L_0x0297:
            java.lang.String r3 = "captured"
            java.lang.String r0 = r1.A07
            boolean r3 = r3.equals(r0)
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r11 = -1
            if (r0 != 0) goto L_0x02c3
            if (r3 != 0) goto L_0x02ac
            if (r5 == 0) goto L_0x02c3
        L_0x02ac:
            android.content.Context r1 = r2.getContext()
            r0 = 2131897884(0x7f122e1c, float:1.943067E38)
            java.lang.String r3 = r1.getString(r0)
            r1 = 3
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r1)
            X.4Ns r2 = new X.4Ns
            r2.<init>(r0, r3, r11, r8)
            goto L_0x0250
        L_0x02c3:
            X.1R2 r0 = r2.A0A
            java.util.HashSet r9 = r0.A0g(r1, r4)
            boolean r0 = X.C108965cb.A1Z(r9, r8)
            if (r0 == 0) goto L_0x0306
            android.content.Context r3 = r2.getContext()
            r0 = 2131888286(0x7f12089e, float:1.9411203E38)
            java.lang.String r5 = r3.getString(r0)
            r3 = 4
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r3)
            X.AnonymousClass8BT.A1B(r0, r5, r7, r11, r8)
            r3 = 1
        L_0x02e4:
            r0 = 6
            boolean r0 = X.C108965cb.A1Z(r9, r0)
            if (r0 == 0) goto L_0x0308
            android.content.Context r1 = r2.getContext()
            r0 = 2131888297(0x7f1208a9, float:1.9411225E38)
            java.lang.String r5 = r1.getString(r0)
            r3 = 2131231835(0x7f08045b, float:1.8079762E38)
            r1 = 5
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r1)
            X.4Ns r2 = new X.4Ns
            r2.<init>(r0, r5, r3, r8)
            goto L_0x0250
        L_0x0306:
            r3 = 0
            goto L_0x02e4
        L_0x0308:
            if (r3 == 0) goto L_0x030c
            goto L_0x04fc
        L_0x030c:
            java.lang.String r3 = "pending_buyer_confirmation"
            java.lang.String r0 = r1.A07
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0341
            X.1QO r0 = r2.A07
            boolean r0 = X.AnonymousClass8BU.A1R(r0)
            if (r0 == 0) goto L_0x047a
            if (r12 == 0) goto L_0x046a
            int r5 = X.C20089A6r.A00(r1)
            r0 = 3
            if (r5 != r0) goto L_0x046a
            android.content.Context r1 = r2.getContext()
            r0 = 2131897884(0x7f122e1c, float:1.943067E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 13
        L_0x0334:
            X.4kv r1 = new X.4kv
            r1.<init>(r2, r4, r0)
            r0 = -1
            X.4Ns r2 = new X.4Ns
            r2.<init>(r1, r3, r0, r8)
            goto L_0x0250
        L_0x0341:
            X.1QO r5 = r2.A07
            r0 = r10
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r5.A0J(r0, r1)
            if (r0 == 0) goto L_0x038a
            java.lang.String r5 = "captured"
            java.lang.String r0 = r1.A07
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x037c
            X.AEU r9 = r1.A0D
            java.lang.String r0 = r9.A01
            int r5 = X.C20089A6r.A01(r0)
            r0 = 3
            if (r5 == r0) goto L_0x037c
            java.lang.String r0 = r9.A01
            int r5 = X.C20089A6r.A01(r0)
            r0 = 4
            if (r5 == r0) goto L_0x037c
            X.1QO r5 = r2.A07
            java.util.List r0 = r1.A0Q
            boolean r0 = r5.A0Q(r0)
            if (r0 == 0) goto L_0x038a
            boolean r0 = r2.A00(r1, r4, r7)
            if (r0 == 0) goto L_0x038a
            goto L_0x04fc
        L_0x037c:
            android.content.Context r1 = r2.getContext()
            r0 = 2131897884(0x7f122e1c, float:1.943067E38)
            java.lang.String r3 = r1.getString(r0)
            r0 = 12
            goto L_0x0334
        L_0x038a:
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03a4
            java.lang.String r0 = r1.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x03a4
            X.1QO r5 = r2.A07
            java.util.List r0 = r1.A0Q
            boolean r0 = r5.A0Q(r0)
            if (r0 != 0) goto L_0x0472
        L_0x03a4:
            X.4Op r0 = r2.A09
            X.0ve r5 = r0.A01
            r0 = 1107(0x453, float:1.551E-42)
            r5.A0N(r0)
            java.util.Set r5 = r2.A0M
            X.AEU r9 = r1.A0D
            java.lang.String r0 = r9.A01
            int r0 = X.C20089A6r.A01(r0)
            boolean r0 = X.C108965cb.A1b(r5, r0)
            if (r0 != 0) goto L_0x03e7
            android.content.Context r3 = r2.getContext()
            r0 = 2131888290(0x7f1208a2, float:1.9411211E38)
            java.lang.String r8 = r3.getString(r0)
        L_0x03c8:
            X.0ve r0 = r2.A05
            boolean r11 = X.AnonymousClass1R2.A0F(r0, r1)
            r6 = -1
            r5 = 0
            if (r11 != 0) goto L_0x03db
            r3 = 1
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r3)
            X.AnonymousClass8BT.A1B(r0, r8, r7, r6, r5)
        L_0x03db:
            X.0ve r3 = r2.A05
            r0 = 1600(0x640, float:2.242E-42)
            java.lang.String r0 = r3.A0I(r0)
            if (r0 == 0) goto L_0x0493
            goto L_0x047e
        L_0x03e7:
            X.1PM r0 = r2.A02
            boolean r12 = r0.A04(r6)
            X.1R2 r11 = r2.A0A
            X.00H r0 = r11.A0B
            r0.get()
            X.11S r5 = r11.A00
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r5)
            java.lang.String r0 = X.AnonymousClass17K.A05(r0)
            java.lang.String r8 = X.C20056A5f.A02(r0)
            if (r8 == 0) goto L_0x045d
            com.whatsapp.jid.PhoneUserJid r5 = X.AnonymousClass11S.A00(r5)
            X.1Ln r0 = r11.A06
            boolean r0 = r11.A0i(r0, r5, r6, r8)
            if (r0 == 0) goto L_0x045d
            int r5 = r11.A0H(r6)
            r0 = 2
            if (r5 != r0) goto L_0x045d
            X.1R2 r0 = r2.A0A
            boolean r0 = r0.A0p(r1)
            if (r0 != 0) goto L_0x0429
            if (r12 == 0) goto L_0x0431
            java.lang.String r0 = r1.A07
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0431
        L_0x0429:
            r5 = 2131888290(0x7f1208a2, float:1.9411211E38)
        L_0x042c:
            java.lang.String r8 = X.AnonymousClass3Ma.A11(r2, r5)
            goto L_0x03c8
        L_0x0431:
            X.0ve r3 = r2.A05
            r0 = 5944(0x1738, float:8.33E-42)
            org.json.JSONObject r5 = r3.A0J(r0)
            java.lang.String r3 = "updated_order_cta"
            boolean r0 = r5.has(r3)
            if (r0 == 0) goto L_0x0459
            int r3 = r5.getInt(r3)     // Catch:{ JSONException -> 0x0453 }
            r0 = 1
            if (r3 == r0) goto L_0x044f
            r0 = 2
            r5 = 2131888280(0x7f120898, float:1.941119E38)
            if (r3 == r0) goto L_0x042c
            goto L_0x0459
        L_0x044f:
            r5 = 2131888279(0x7f120897, float:1.9411189E38)
            goto L_0x042c
        L_0x0453:
            r3 = move-exception
            java.lang.String r0 = "failed to parse config for ab prop BR_BUYER_AWARENESS_EXPERIENCES_CODE#updated_order_cta"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x0459:
            r5 = 2131888278(0x7f120896, float:1.9411187E38)
            goto L_0x042c
        L_0x045d:
            r5 = 2131888291(0x7f1208a3, float:1.9411213E38)
            X.1R2 r0 = r2.A0A
            X.1QO r0 = r0.A09
            X.1QJ r0 = r0.A04
            r0.A02()
            goto L_0x042c
        L_0x046a:
            java.lang.String r0 = r1.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x047a
        L_0x0472:
            boolean r0 = r2.A00(r1, r4, r7)
            if (r0 != 0) goto L_0x04fc
            goto L_0x03a4
        L_0x047a:
            if (r12 == 0) goto L_0x038a
            goto L_0x03a4
        L_0x047e:
            org.json.JSONObject r3 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0489 }
            java.lang.String r0 = "allowed_product_type"
            java.lang.String r8 = r3.getString(r0)     // Catch:{ JSONException -> 0x0489 }
            goto L_0x0495
        L_0x0489:
            r8 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OrderDetailsQuickPayConfig/init failed to parse config json: "
            X.C108995ce.A1M(r0, r3, r8)
        L_0x0493:
            java.lang.String r8 = "none"
        L_0x0495:
            java.lang.String r3 = r1.A0M
            java.lang.String r0 = "any"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x04a5
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L_0x04a9
        L_0x04a5:
            X.AES r0 = r1.A0B
            if (r0 == 0) goto L_0x04ab
        L_0x04a9:
            if (r11 == 0) goto L_0x04fc
        L_0x04ab:
            r8 = 1
            if (r10 == 0) goto L_0x04f0
            X.1R2 r0 = r2.A0A
            X.1QS r0 = r0.A0A
            X.BD1 r0 = r0.A06()
            boolean r0 = r0.Bfk()
            if (r0 == 0) goto L_0x04f0
            r3 = 1
            X.1R2 r0 = r2.A0A
            java.lang.Integer r1 = r0.A0O(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x04c9
            if (r11 == 0) goto L_0x04fc
        L_0x04c9:
            android.content.Context r1 = r2.getContext()
            r0 = 2131888288(0x7f1208a0, float:1.9411207E38)
            if (r3 == 0) goto L_0x04d5
            r0 = 2131888285(0x7f12089d, float:1.94112E38)
        L_0x04d5:
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r0 = r9.A01
            int r0 = X.C20089A6r.A01(r0)
            if (r0 == r8) goto L_0x04e2
            r5 = 1
        L_0x04e2:
            r1 = 9
            X.4kv r0 = new X.4kv
            r0.<init>(r2, r4, r1)
            X.4Ns r2 = new X.4Ns
            r2.<init>(r0, r3, r6, r5)
            goto L_0x0250
        L_0x04f0:
            r3 = 0
            goto L_0x04c9
        L_0x04f2:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01db
            boolean r0 = r9.A01
            r15.A04 = r0
        L_0x04fc:
            int r0 = r7.size()
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(r13, r15, r7, r0)
            return
        L_0x0504:
            java.lang.String r5 = r0.A02
            if (r5 == 0) goto L_0x051d
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x051d
            org.json.JSONObject r7 = X.C17880vN.A16(r5)     // Catch:{ JSONException -> 0x0513 }
            goto L_0x0521
        L_0x0513:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InteractiveMessageButton/parseNfmMessageParamsJson/invalid json="
            X.C17900vP.A0h(r0, r5, r1, r3)
        L_0x051d:
            org.json.JSONObject r7 = X.C17880vN.A15()
        L_0x0521:
            java.lang.String r0 = "type"
            java.lang.String r3 = r7.optString(r0)
            X.00H r0 = r2.A0F
            java.lang.Object r1 = r0.get()
            X.1l7 r1 = (X.C34811l7) r1
            X.AEk r0 = r6.A06
            java.lang.String r0 = r0.A02
            X.9ul r1 = r1.A02(r3, r0)
            r5 = 0
            if (r1 == 0) goto L_0x055a
            android.content.Context r0 = r2.getContext()
            java.lang.String r8 = r1.A09(r0, r6, r5)
            X.AEk r0 = r6.A06
            X.ADE r0 = r0.A00
            if (r0 == 0) goto L_0x0651
            boolean r3 = r0.A00
        L_0x054a:
            if (r8 != 0) goto L_0x054e
            java.lang.String r8 = ""
        L_0x054e:
            int r1 = r1.A05(r6)
            X.4kw r0 = new X.4kw
            r0.<init>(r2, r4, r6, r3)
            X.AnonymousClass8BT.A1B(r0, r8, r10, r1, r3)
        L_0x055a:
            int r3 = r10.size()
            X.9NP r4 = new X.9NP
            r4.<init>()
            r0 = -1
            r4.A00 = r0
            java.lang.String r1 = "bottom_sheet"
            boolean r0 = r7.has(r1)
            if (r0 == 0) goto L_0x064d
            org.json.JSONObject r1 = X.AnonymousClass8BW.A0w(r1, r7)
            java.lang.String r0 = "in_thread_buttons_limit"
            int r0 = r1.optInt(r0, r3)
            if (r0 <= r3) goto L_0x057b
            r0 = r3
        L_0x057b:
            r4.A00 = r0
            java.lang.String r0 = "divider_indices"
            org.json.JSONArray r0 = r1.optJSONArray(r0)
            r4.A03 = r0
            java.lang.String r0 = "button_title"
            java.lang.String r0 = r1.optString(r0, r5)
            r4.A01 = r0
            java.lang.String r0 = "list_title"
            java.lang.String r0 = r1.optString(r0, r5)
            r4.A02 = r0
        L_0x0595:
            java.lang.String r7 = r6.A0D
            X.0ve r3 = r15.A02
            r1 = 12301(0x300d, float:1.7237E-41)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r3, r1)
            int r0 = r4.A00
            r6 = 1
            int r1 = java.lang.Math.max(r0, r6)
            java.lang.String r0 = "MARKETING"
            boolean r0 = X.AnonymousClass026.A00(r7, r0)
            if (r0 == 0) goto L_0x05b6
            if (r3 <= 0) goto L_0x05b6
            int r1 = java.lang.Math.min(r3, r1)
        L_0x05b6:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x05be
            int r1 = r1 + -1
        L_0x05be:
            com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A01(r13, r15, r10, r1)
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0643
            X.206 r0 = r13.getFMessage()
            X.205 r0 = r0.A0v
            java.lang.String r3 = r0.toString()
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r3)
            java.lang.String r0 = "NativeFlowMessageButtonBottomSheet_"
            java.lang.String r8 = X.AnonymousClass001.A1H(r0, r3, r1)
            r9 = r23
            androidx.fragment.app.Fragment r7 = r9.A0Q(r8)
            boolean r0 = r7 instanceof com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet
            if (r0 == 0) goto L_0x0647
            com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet r7 = (com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet) r7
        L_0x05e7:
            X.9mM r3 = new X.9mM
            r16 = r3
            r17 = r13
            r18 = r15
            r19 = r7
            r20 = r4
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            X.9mM r0 = r7.A03
            if (r0 != 0) goto L_0x0607
            android.view.View r0 = r7.A0B
            if (r0 == 0) goto L_0x0607
            android.widget.LinearLayout r1 = r7.A00
            com.whatsapp.TextEmojiLabel r0 = r7.A01
            r3.A00(r1, r0)
        L_0x0607:
            r7.A03 = r3
            java.lang.String r3 = r4.A01
            if (r3 != 0) goto L_0x0618
            android.content.res.Resources r1 = r15.getResources()
            r0 = 2131895584(0x7f122520, float:1.9426005E38)
            java.lang.String r3 = r1.getString(r0)
        L_0x0618:
            r1 = 2131231926(0x7f0804b6, float:1.8079947E38)
            r4 = 0
            X.AQL r0 = new X.AQL
            r0.<init>(r9, r7, r8, r4)
            X.4Ns r14 = new X.4Ns
            r14.<init>(r0, r3, r1, r4)
            android.widget.LinearLayout r3 = r15.A06
            android.content.Context r1 = r15.getContext()
            r0 = 2131100252(0x7f06025c, float:1.781288E38)
            android.content.res.ColorStateList r11 = X.C19740yt.A03(r1, r0)
            r18 = r6
            r16 = r6
            r12 = r11
            r17 = r6
            r19 = r4
            android.view.View r0 = com.whatsapp.conversation.conversationrow.InteractiveButtonsRowContentLayout.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.addView(r0)
        L_0x0643:
            r2.setOnClickListener(r5)
            return
        L_0x0647:
            com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet r7 = new com.whatsapp.conversation.conversationrow.NativeFlowMessageButtonBottomSheet
            r7.<init>()
            goto L_0x05e7
        L_0x064d:
            r4.A00 = r3
            goto L_0x0595
        L_0x0651:
            r3 = 0
            goto L_0x054a
        L_0x0654:
            r1 = 0
            r5.setVisibility(r1)
            if (r25 == 0) goto L_0x06ef
            boolean r0 = r25.CMu()
            if (r0 == 0) goto L_0x06ef
            r2.setVisibility(r1)
            if (r6 == 0) goto L_0x06ea
            java.lang.String r0 = r6.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x06ea
            java.lang.String r3 = r6.A0A
        L_0x066f:
            int r1 = r6.A00
            r0 = 2
            if (r1 == r0) goto L_0x06db
            r0 = 4
            if (r1 == r0) goto L_0x06d4
            r0 = 6
            if (r1 == r0) goto L_0x06db
        L_0x067a:
            r13.setMessageText(r3, r5, r4)
            if (r6 == 0) goto L_0x06c0
        L_0x067f:
            int r1 = r6.A00
            r0 = 2
            if (r1 == r0) goto L_0x06bc
            r0 = 4
            if (r1 == r0) goto L_0x06bc
            r0 = 6
            if (r1 == r0) goto L_0x06bc
            r0 = 3
            if (r1 != r0) goto L_0x06c0
            r5.A0N()
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r2)
            r0 = 2131167739(0x7f0709fb, float:1.794976E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMinimumHeight(r0)
        L_0x069e:
            java.lang.String r0 = "Button"
            X.AnonymousClass1Y5.A07(r2, r0)
            r1 = 37
            X.4dU r0 = new X.4dU
            r0.<init>(r2, r4, r1)
            r2.setOnClickListener(r0)
            r0 = 1
            r2.setLongClickable(r0)
            r1 = 11
            X.BJi r0 = new X.BJi
            r0.<init>(r2, r1)
            X.AnonymousClass1HF.A0f(r2, r0)
            return
        L_0x06bc:
            r5.A0N()
            goto L_0x069e
        L_0x06c0:
            X.0vb r3 = r2.A03
            android.content.Context r1 = r2.getContext()
            r0 = 2131231926(0x7f0804b6, float:1.8079947E38)
            X.3cP r1 = X.AnonymousClass3NL.A00(r1, r3, r0)
            r0 = 2131165569(0x7f070181, float:1.7945359E38)
            r5.A0P(r1, r0)
            goto L_0x069e
        L_0x06d4:
            r0 = 2131896134(0x7f122746, float:1.942712E38)
            r5.setText(r0)
            goto L_0x067f
        L_0x06db:
            android.content.Context r1 = r2.getContext()
            r0 = 2131894786(0x7f122202, float:1.9424387E38)
            java.lang.String r0 = r1.getString(r0)
            r13.setMessageText(r0, r5, r4)
            goto L_0x067f
        L_0x06ea:
            java.lang.String r3 = ""
            if (r6 == 0) goto L_0x067a
            goto L_0x066f
        L_0x06ef:
            r0 = 8
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.InteractiveMessageButton.A01(X.1GP, X.3uP, X.5cR, X.206):void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0H;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0H = r0;
        }
        return r0.generatedComponent();
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A0J) {
            this.A0J = true;
            C27691Xc.A0t((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
    }

    public InteractiveMessageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public InteractiveMessageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0J) {
            this.A0J = true;
            C27691Xc.A0t((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        Integer[] numArr = new Integer[2];
        AnonymousClass000.A1L(numArr, 1);
        this.A0M = C17900vP.A0I(C108955ca.A0e(), numArr, 1);
        LayoutInflater.from(context).inflate(2131625720, this, true);
        this.A0K = AnonymousClass3MX.A0V(this, 2131428591);
        this.A0L = (InteractiveButtonsRowContentLayout) AnonymousClass1HF.A06(this, 2131428628);
    }
}
