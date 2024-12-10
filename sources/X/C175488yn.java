package X;

import android.content.Context;

/* renamed from: X.8yn  reason: invalid class name and case insensitive filesystem */
public class C175488yn extends C20992Ack {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175488yn(Context context, C33711jG r2, AnonymousClass119 r3, Object obj, Object obj2, Object obj3, int i) {
        super(context, r2, r3);
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public static void A00(C175488yn r2, A7B a7b) {
        BD4 bd4 = (BD4) r2.A03;
        if (bd4 != null) {
            bd4.Bi4(a7b, 18);
        }
        C197919xU.A00(a7b, (C197919xU) r2.A02);
    }

    public void A04(A7B a7b) {
        switch (this.A00) {
            case 2:
                ((C190249kc) this.A02).A00(a7b);
                return;
            case 3:
                A00(this, a7b);
                return;
            case 4:
                C18070vi.A0d(a7b, 0);
                ((C22455B8n) this.A01).Bss(a7b);
                return;
            case 5:
                ((C191119m3) this.A02).A00(a7b);
                return;
            case 6:
                ((C22543BCa) this.A02).Bi3(a7b, (Integer) this.A03);
                return;
            case 7:
                break;
            case 8:
                ((C190769lU) this.A02).A00(a7b);
                return;
            default:
                AnonymousClass8BX.A1C(((C31061ex) this.A01).A0D, a7b, "Tos onRequestError: ", AnonymousClass000.A10());
                break;
        }
        ((C33661jB) this.A02).C3L(a7b);
    }

    public void A05(A7B a7b) {
        switch (this.A00) {
            case 2:
                ((C190249kc) this.A02).A00(a7b);
                return;
            case 3:
                A00(this, a7b);
                return;
            case 4:
                C18070vi.A0d(a7b, 0);
                ((C22455B8n) this.A01).Bss(a7b);
                return;
            case 5:
                ((C191119m3) this.A02).A00(a7b);
                return;
            case 6:
                ((C22543BCa) this.A02).Bi3(a7b, (Integer) this.A03);
                return;
            case 7:
                break;
            case 8:
                A04(a7b);
                return;
            default:
                AnonymousClass8BX.A1C(((C31061ex) this.A01).A0D, a7b, "Tos onResponseError: ", AnonymousClass000.A10());
                break;
        }
        ((C33661jB) this.A02).C3X(a7b);
    }

    /* JADX WARNING: type inference failed for: r1v200, types: [java.lang.Object, X.9dd] */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x06e4, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C29621ca r28) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r0.A00
            r13 = r28
            switch(r1) {
                case 0: goto L_0x0610;
                case 1: goto L_0x0537;
                case 2: goto L_0x0124;
                case 3: goto L_0x050d;
                case 4: goto L_0x038f;
                case 5: goto L_0x0049;
                case 6: goto L_0x024b;
                case 7: goto L_0x0096;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1ca r1 = X.AnonymousClass8BR.A0j(r13)
            if (r1 == 0) goto L_0x0038
            X.A7B r4 = X.A7B.A01(r1)
            if (r4 == 0) goto L_0x0039
            int r2 = r4.A00
            if (r2 == 0) goto L_0x0039
            r1 = 1448(0x5a8, float:2.029E-42)
            if (r2 != r1) goto L_0x0030
            java.lang.Object r1 = r0.A01
            X.9yp r1 = (X.C198739yp) r1
            X.A54 r3 = r1.A06
            java.lang.Object r1 = r0.A03
            X.9zC r1 = (X.C198959zC) r1
            X.AZ2 r1 = r1.A00
            java.lang.String r2 = r1.A05
            java.lang.String r1 = "PIN"
            r3.A02(r4, r2, r1)
        L_0x0030:
            java.lang.Object r0 = r0.A02
            X.9lU r0 = (X.C190769lU) r0
            r0.A00(r4)
        L_0x0037:
            return
        L_0x0038:
            r4 = 0
        L_0x0039:
            java.lang.Object r1 = r0.A01
            X.9yp r1 = (X.C198739yp) r1
            X.9uA r3 = r1.A07
            r1 = 1
            r3.A02(r1)
            r1 = 0
            r3.A01(r1)
            goto L_0x0030
        L_0x0049:
            java.lang.Object r5 = r0.A02     // Catch:{ 1UI -> 0x0700 }
            X.9m3 r5 = (X.C191119m3) r5     // Catch:{ 1UI -> 0x0700 }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x0700 }
            X.9F6 r1 = (X.AnonymousClass9F6) r1     // Catch:{ 1UI -> 0x0700 }
            X.9FN r4 = new X.9FN     // Catch:{ 1UI -> 0x0700 }
            r4.<init>(r13, r1)     // Catch:{ 1UI -> 0x0700 }
            X.1ig r8 = r5.A01     // Catch:{ 1UI -> 0x0700 }
            X.2r1 r3 = r5.A02     // Catch:{ 1UI -> 0x0700 }
            java.lang.String r2 = r5.A03     // Catch:{ 1UI -> 0x0700 }
            X.9lP r7 = r5.A00     // Catch:{ 1UI -> 0x0700 }
            X.1KI r1 = r8.A04     // Catch:{ Exception -> 0x0087 }
            X.9ys r6 = new X.9ys     // Catch:{ Exception -> 0x0087 }
            r6.<init>(r1, r3, r4, r2)     // Catch:{ Exception -> 0x0087 }
            X.1ih r5 = r8.A06     // Catch:{ Exception -> 0x0087 }
            X.2r1 r1 = r6.A08     // Catch:{ Exception -> 0x0087 }
            long r2 = r1.A01     // Catch:{ Exception -> 0x0087 }
            X.9ys r4 = r5.A01(r2)     // Catch:{ Exception -> 0x0087 }
            if (r4 == 0) goto L_0x007d
            boolean r1 = r4.A02     // Catch:{ Exception -> 0x0087 }
            r6.A02 = r1     // Catch:{ Exception -> 0x0087 }
            int r1 = r4.A00     // Catch:{ Exception -> 0x0087 }
            r6.A00 = r1     // Catch:{ Exception -> 0x0087 }
            int r1 = r4.A01     // Catch:{ Exception -> 0x0087 }
            r6.A01 = r1     // Catch:{ Exception -> 0x0087 }
        L_0x007d:
            r5.A04(r6, r2)     // Catch:{ Exception -> 0x0087 }
            if (r7 == 0) goto L_0x0037
            r7.A00(r6)     // Catch:{ Exception -> 0x0087 }
            goto L_0x06f4
        L_0x0087:
            r2 = move-exception
            java.lang.String r1 = "PAY: PaymentIncentiveManager/processSuccessfulGetOfferDetails : Error while parsing "
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 1UI -> 0x0700 }
            X.1ih r1 = r8.A06     // Catch:{ 1UI -> 0x0700 }
            r1.A02()     // Catch:{ 1UI -> 0x0700 }
            if (r7 == 0) goto L_0x0037
            goto L_0x06f5
        L_0x0096:
            java.lang.String r1 = "account"
            X.1ca r2 = r13.A0L(r1)     // Catch:{ 1UI -> 0x011c }
            java.lang.String r1 = "pay"
            X.1ca r2 = r2.A0L(r1)     // Catch:{ 1UI -> 0x011c }
            java.lang.String r1 = "currency"
            java.lang.String r12 = r2.A0P(r1)     // Catch:{ 1UI -> 0x011c }
            java.lang.String r1 = "amount"
            java.lang.String r4 = r2.A0P(r1)     // Catch:{ 1UI -> 0x011c }
            java.lang.Object r6 = r0.A01     // Catch:{ 1UI -> 0x011c }
            X.1jA r6 = (X.C33651jA) r6     // Catch:{ 1UI -> 0x011c }
            X.1KI r3 = r6.A03     // Catch:{ 1UI -> 0x011c }
            X.1KJ r2 = r3.A01(r12)     // Catch:{ 1UI -> 0x011c }
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 1UI -> 0x011c }
            if (r1 != 0) goto L_0x0111
            X.1KN r9 = X.AnonymousClass8BT.A0H(r2, r4)     // Catch:{ 1UI -> 0x011c }
        L_0x00c2:
            X.00H r1 = r6.A09     // Catch:{ 1UI -> 0x011c }
            X.2lL r2 = X.AnonymousClass8BR.A0N(r1)     // Catch:{ 1UI -> 0x011c }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x011c }
            X.205 r1 = (X.AnonymousClass205) r1     // Catch:{ 1UI -> 0x011c }
            X.206 r5 = r2.A02(r1)     // Catch:{ 1UI -> 0x011c }
            if (r5 == 0) goto L_0x0114
            X.AW0 r4 = X.AnonymousClass25B.A00(r5)     // Catch:{ 1UI -> 0x011c }
            if (r4 == 0) goto L_0x0114
            com.whatsapp.jid.UserJid r10 = r4.A0E     // Catch:{ 1UI -> 0x011c }
            com.whatsapp.jid.UserJid r11 = r4.A0D     // Catch:{ 1UI -> 0x011c }
            X.1KJ r8 = r3.A01(r12)     // Catch:{ 1UI -> 0x011c }
            long r1 = r4.A05     // Catch:{ 1UI -> 0x011c }
            java.lang.String r14 = r4.A0G     // Catch:{ 1UI -> 0x011c }
            int r7 = r4.A04     // Catch:{ 1UI -> 0x011c }
            int r3 = r4.A01     // Catch:{ 1UI -> 0x011c }
            r15 = 3
            r13 = 0
            r16 = 0
            r19 = r16
            r20 = r1
            r18 = r3
            r17 = r7
            X.AW0 r3 = X.C20128A8n.A02(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ 1UI -> 0x011c }
            java.lang.String r1 = r4.A0K     // Catch:{ 1UI -> 0x011c }
            r3.A0C(r1)     // Catch:{ 1UI -> 0x011c }
            X.121 r2 = r6.A02     // Catch:{ 1UI -> 0x011c }
            X.205 r1 = r5.A0v     // Catch:{ 1UI -> 0x011c }
            r2.CQz(r3, r1)     // Catch:{ 1UI -> 0x011c }
            java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x011c }
            X.1jB r2 = (X.C33661jB) r2     // Catch:{ 1UI -> 0x011c }
            X.9dd r1 = new X.9dd     // Catch:{ 1UI -> 0x011c }
            r1.<init>()     // Catch:{ 1UI -> 0x011c }
            r2.C3Y(r1)     // Catch:{ 1UI -> 0x011c }
            goto L_0x0113
        L_0x0111:
            r9 = 0
            goto L_0x00c2
        L_0x0113:
            return
        L_0x0114:
            X.A7B r1 = X.A7B.A00()     // Catch:{ 1UI -> 0x011c }
            r0.A05(r1)     // Catch:{ 1UI -> 0x011c }
            return
        L_0x011c:
            X.A7B r1 = X.A7B.A00()
            r0.A05(r1)
            return
        L_0x0124:
            java.lang.String r9 = "account"
            X.1ca r6 = r13.A0L(r9)     // Catch:{ 1UI -> 0x0233 }
            java.util.ArrayList r11 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x0233 }
            java.lang.Object r5 = r0.A01     // Catch:{ 1UI -> 0x0233 }
            X.9hb r5 = (X.C188549hb) r5     // Catch:{ 1UI -> 0x0233 }
            X.1QO r1 = r5.A04     // Catch:{ 1UI -> 0x0233 }
            X.0ve r3 = r1.A02     // Catch:{ 1UI -> 0x0233 }
            r2 = 2984(0xba8, float:4.181E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ 1UI -> 0x0233 }
            boolean r1 = X.C18020vd.A05(r1, r3, r2)     // Catch:{ 1UI -> 0x0233 }
            r12 = 0
            if (r1 == 0) goto L_0x01c5
            X.1em r1 = r5.A0A     // Catch:{ 1UI -> 0x0233 }
            java.util.ArrayList r3 = r1.A05(r6)     // Catch:{ 1UI -> 0x0233 }
            if (r3 == 0) goto L_0x0191
            boolean r1 = r3.isEmpty()     // Catch:{ 1UI -> 0x0233 }
            if (r1 != 0) goto L_0x0191
            int r10 = r3.size()     // Catch:{ 1UI -> 0x0233 }
            r2 = 0
            boolean r1 = X.AnonymousClass1KH.A05(r3)     // Catch:{ 1UI -> 0x0233 }
            if (r1 == 0) goto L_0x0166
            X.1QS r1 = r5.A05     // Catch:{ 1UI -> 0x0233 }
            X.A5I r1 = r1.A01()     // Catch:{ 1UI -> 0x0233 }
            X.C17960vV.A07(r1)     // Catch:{ 1UI -> 0x0233 }
            r1.A05(r2, r3)     // Catch:{ 1UI -> 0x0233 }
        L_0x0166:
            java.lang.Object r2 = r0.A03     // Catch:{ 1UI -> 0x0233 }
            X.9F6 r2 = (X.AnonymousClass9F6) r2     // Catch:{ 1UI -> 0x0233 }
            r8 = 1
            r1 = 2
            X.AnonymousClass8BT.A1I(r13, r2, r1)     // Catch:{ 1UI -> 0x0233 }
            java.lang.Object r7 = r2.A00     // Catch:{ 1UI -> 0x0233 }
            X.2rm r4 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0233 }
            X.A8Z r3 = X.A8Z.A00     // Catch:{ 1UI -> 0x0233 }
            r1 = 26
            X.Ahb r2 = new X.Ahb     // Catch:{ 1UI -> 0x0233 }
            r2.<init>(r7, r3, r1)     // Catch:{ 1UI -> 0x0233 }
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ 1UI -> 0x0233 }
            r1[r12] = r9     // Catch:{ 1UI -> 0x0233 }
            java.lang.Object r2 = r4.A03(r13, r2, r1)     // Catch:{ 1UI -> 0x0233 }
            X.9Cx r2 = (X.C178389Cx) r2     // Catch:{ 1UI -> 0x0233 }
            if (r2 == 0) goto L_0x01c0
            r1 = 27
            java.lang.Object r1 = X.C21290Ahb.A02(r13, r4, r7, r3, r1)     // Catch:{ 1UI -> 0x0233 }
            goto L_0x0193
        L_0x0191:
            r10 = 0
            goto L_0x0166
        L_0x0193:
            if (r1 == 0) goto L_0x01bb
            java.util.List r1 = r2.A00     // Catch:{ 1UI -> 0x0233 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 1UI -> 0x0233 }
        L_0x019b:
            boolean r1 = r4.hasNext()     // Catch:{ 1UI -> 0x0233 }
            if (r1 == 0) goto L_0x01b9
            java.lang.Object r1 = r4.next()     // Catch:{ 1UI -> 0x0233 }
            X.9zG r1 = (X.C198999zG) r1     // Catch:{ 1UI -> 0x0233 }
            X.8pT r3 = new X.8pT     // Catch:{ 1UI -> 0x0233 }
            r3.<init>()     // Catch:{ 1UI -> 0x0233 }
            X.1KI r2 = r5.A01     // Catch:{ 1UI -> 0x0233 }
            X.1ca r1 = r1.A03()     // Catch:{ 1UI -> 0x0233 }
            r3.A05(r2, r1, r12)     // Catch:{ 1UI -> 0x0233 }
            r11.add(r3)     // Catch:{ 1UI -> 0x0233 }
            goto L_0x019b
        L_0x01b9:
            r12 = r10
            goto L_0x01c5
        L_0x01bb:
            X.1UI r1 = X.AnonymousClass1O9.A00(r4)     // Catch:{ 1UI -> 0x0233 }
            goto L_0x01c4
        L_0x01c0:
            X.1UI r1 = X.AnonymousClass1O9.A00(r4)     // Catch:{ 1UI -> 0x0233 }
        L_0x01c4:
            throw r1     // Catch:{ 1UI -> 0x0233 }
        L_0x01c5:
            X.A7B r2 = X.A7B.A01(r6)     // Catch:{ 1UI -> 0x0233 }
            if (r2 == 0) goto L_0x01d3
            java.lang.Object r1 = r0.A02     // Catch:{ 1UI -> 0x0233 }
            X.9kc r1 = (X.C190249kc) r1     // Catch:{ 1UI -> 0x0233 }
            r1.A00(r2)     // Catch:{ 1UI -> 0x0233 }
            return
        L_0x01d3:
            java.lang.Object r4 = r0.A02     // Catch:{ 1UI -> 0x0233 }
            X.9kc r4 = (X.C190249kc) r4     // Catch:{ 1UI -> 0x0233 }
            X.AZX r3 = r4.A00     // Catch:{ 1UI -> 0x0233 }
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r1 = r3.A01     // Catch:{ 1UI -> 0x0233 }
            if (r1 == 0) goto L_0x021d
            r1.A2M()     // Catch:{ 1UI -> 0x0233 }
            r1.A29()     // Catch:{ 1UI -> 0x0233 }
        L_0x01e3:
            X.A5F r9 = r3.A02     // Catch:{ 1UI -> 0x0233 }
            X.1QL r2 = r9.A07     // Catch:{ 1UI -> 0x0233 }
            java.lang.String r1 = "tos_no_wallet"
            r2.A0B(r1)     // Catch:{ 1UI -> 0x0233 }
            X.9uA r1 = r9.A0J     // Catch:{ 1UI -> 0x0233 }
            r5 = 1
            r1.A02(r5)     // Catch:{ 1UI -> 0x0233 }
            X.1QL r2 = r9.A07     // Catch:{ 1UI -> 0x0233 }
            java.lang.String r1 = "kyc"
            r2.A0B(r1)     // Catch:{ 1UI -> 0x0233 }
            X.1QD r2 = r9.A08     // Catch:{ 1UI -> 0x0233 }
            java.lang.String r1 = "pending"
            r2.A0N(r1)     // Catch:{ 1UI -> 0x0233 }
            X.1QD r1 = r9.A08     // Catch:{ 1UI -> 0x0233 }
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BU.A07(r1)     // Catch:{ 1UI -> 0x0233 }
            java.lang.String r1 = "payment_account_recovered"
            X.C17880vN.A1F(r2, r1, r5)     // Catch:{ 1UI -> 0x0233 }
            X.1FY r8 = r3.A00     // Catch:{ 1UI -> 0x0233 }
            boolean r1 = r8 instanceof com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity     // Catch:{ 1UI -> 0x0233 }
            if (r1 == 0) goto L_0x0228
            X.9mU r3 = r9.A0F     // Catch:{ 1UI -> 0x0233 }
            X.AYm r2 = new X.AYm     // Catch:{ 1UI -> 0x0233 }
            r2.<init>(r4, r11, r12)     // Catch:{ 1UI -> 0x0233 }
            r1 = 0
            r3.A00(r2, r1)     // Catch:{ 1UI -> 0x0233 }
            goto L_0x0227
        L_0x021d:
            X.1FY r2 = r3.A00     // Catch:{ 1UI -> 0x0233 }
            boolean r1 = r2 instanceof com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity     // Catch:{ 1UI -> 0x0233 }
            if (r1 == 0) goto L_0x01e3
            r2.CEx()     // Catch:{ 1UI -> 0x0233 }
            goto L_0x01e3
        L_0x0227:
            return
        L_0x0228:
            boolean r13 = r3.A03     // Catch:{ 1UI -> 0x0233 }
            boolean r1 = r3.A04     // Catch:{ 1UI -> 0x0233 }
            java.lang.String r10 = r4.A01     // Catch:{ 1UI -> 0x0233 }
            r14 = r1
            X.A5F.A01(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 1UI -> 0x0233 }
            return
        L_0x0233:
            r3 = move-exception
            java.lang.Object r1 = r0.A01
            X.9hb r1 = (X.C188549hb) r1
            X.1QE r2 = r1.A08
            java.lang.String r1 = "PAY: BrazilAccountRecoveryAction : invalid response"
            r2.A0A(r1, r3)
            java.lang.Object r1 = r0.A02
            X.9kc r1 = (X.C190249kc) r1
            X.A7B r0 = X.A7B.A00()
            r1.A00(r0)
            return
        L_0x024b:
            r5 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = "account"
            X.1ca r2 = r13.A0L(r1)     // Catch:{ 1UI -> 0x036e }
            X.A7B r4 = X.A7B.A01(r2)     // Catch:{ 1UI -> 0x036e }
            java.lang.String r1 = "offer_eligibility"
            X.1ca r12 = r2.A0K(r1)     // Catch:{ 1UI -> 0x036e }
            if (r4 == 0) goto L_0x02b0
            int r2 = r4.A00     // Catch:{ 1UI -> 0x036e }
            r1 = 1441(0x5a1, float:2.019E-42)
            if (r2 != r1) goto L_0x0271
            java.lang.Object r1 = r0.A01     // Catch:{ 1UI -> 0x036e }
            X.9yw r1 = (X.C198809yw) r1     // Catch:{ 1UI -> 0x036e }
            X.9uA r3 = r1.A0O     // Catch:{ 1UI -> 0x036e }
            long r1 = r4.A02     // Catch:{ 1UI -> 0x036e }
            r3.A01(r1)     // Catch:{ 1UI -> 0x036e }
            goto L_0x0293
        L_0x0271:
            r1 = 1448(0x5a8, float:2.029E-42)
            if (r2 != r1) goto L_0x0283
            java.lang.Object r1 = r0.A01     // Catch:{ 1UI -> 0x036e }
            X.9yw r1 = (X.C198809yw) r1     // Catch:{ 1UI -> 0x036e }
            X.A54 r3 = r1.A0I     // Catch:{ 1UI -> 0x036e }
            java.lang.String r2 = "FB"
            java.lang.String r1 = "PIN"
            r3.A02(r4, r2, r1)     // Catch:{ 1UI -> 0x036e }
            goto L_0x0293
        L_0x0283:
            r1 = 2896004(0x2c3084, float:4.058166E-39)
            if (r2 != r1) goto L_0x0293
            java.lang.Object r1 = r0.A01     // Catch:{ 1UI -> 0x036e }
            X.9yw r1 = (X.C198809yw) r1     // Catch:{ 1UI -> 0x036e }
            X.10I r2 = r1.A0R     // Catch:{ 1UI -> 0x036e }
            r1 = 45
            X.C17890vO.A0v(r2, r0, r1)     // Catch:{ 1UI -> 0x036e }
        L_0x0293:
            if (r12 == 0) goto L_0x02a4
            java.lang.Object r2 = r0.A01     // Catch:{ 1UI -> 0x036e }
            X.9yw r2 = (X.C198809yw) r2     // Catch:{ 1UI -> 0x036e }
            X.2r1 r1 = r2.A0M     // Catch:{ 1UI -> 0x036e }
            if (r1 == 0) goto L_0x02a4
            X.1ig r3 = r2.A0L     // Catch:{ 1UI -> 0x036e }
            long r1 = r1.A01     // Catch:{ 1UI -> 0x036e }
            r3.A08(r12, r1)     // Catch:{ 1UI -> 0x036e }
        L_0x02a4:
            java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x036e }
            X.BCa r2 = (X.C22543BCa) r2     // Catch:{ 1UI -> 0x036e }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x036e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1UI -> 0x036e }
            r2.Bi3(r4, r1)     // Catch:{ 1UI -> 0x036e }
            return
        L_0x02b0:
            java.lang.String r1 = "transaction"
            X.1ca r7 = r2.A0K(r1)     // Catch:{ 1UI -> 0x036e }
            if (r7 == 0) goto L_0x035d
            java.lang.Object r6 = r0.A01     // Catch:{ 1UI -> 0x036e }
            X.9yw r6 = (X.C198809yw) r6     // Catch:{ 1UI -> 0x036e }
            java.lang.String r1 = "elo"
            X.1ca r2 = r7.A0K(r1)     // Catch:{ 1UI -> 0x036e }
            if (r2 == 0) goto L_0x02dd
            java.lang.String r1 = "challenge_id"
            java.lang.String r2 = X.C29621ca.A02(r2, r1)     // Catch:{ 1UI -> 0x036e }
            X.9nS r1 = r6.A0K     // Catch:{ 1UI -> 0x036e }
            r1.A00(r2)     // Catch:{ 1UI -> 0x036e }
            java.lang.String r4 = r6.A0S     // Catch:{ 1UI -> 0x036e }
            X.BDa r3 = r6.A05     // Catch:{ 1UI -> 0x036e }
            java.lang.String r2 = r6.A0W     // Catch:{ 1UI -> 0x036e }
            X.9go r1 = r1.A00     // Catch:{ 1UI -> 0x036e }
            r1.A03 = r4     // Catch:{ 1UI -> 0x036e }
            r1.A01 = r3     // Catch:{ 1UI -> 0x036e }
            r1.A05 = r2     // Catch:{ 1UI -> 0x036e }
        L_0x02dd:
            java.lang.String r1 = "id"
            java.lang.String r3 = r7.A0P(r1)     // Catch:{ 1UI -> 0x036e }
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1UI -> 0x036e }
            if (r1 != 0) goto L_0x035d
            if (r12 == 0) goto L_0x0351
            X.2r1 r1 = r6.A0M     // Catch:{ 1UI -> 0x036e }
            if (r1 == 0) goto L_0x0351
            X.1ig r4 = r6.A0L     // Catch:{ 1UI -> 0x036e }
            long r13 = r1.A01     // Catch:{ 1UI -> 0x036e }
            X.11P r1 = r4.A02     // Catch:{ Exception -> 0x0338 }
            long r15 = X.AnonymousClass11P.A01(r1)     // Catch:{ Exception -> 0x0338 }
            X.A03 r11 = new X.A03     // Catch:{ Exception -> 0x0338 }
            r11.<init>(r12, r13, r15)     // Catch:{ Exception -> 0x0338 }
            java.lang.Object r10 = X.C33351ig.A0H     // Catch:{ Exception -> 0x0338 }
            monitor-enter(r10)     // Catch:{ Exception -> 0x0338 }
            X.1ih r1 = r4.A06     // Catch:{ all -> 0x0335 }
            X.9ys r9 = r1.A01(r13)     // Catch:{ all -> 0x0335 }
            if (r9 == 0) goto L_0x031d
            int r1 = r9.A01     // Catch:{ all -> 0x0335 }
            if (r1 <= 0) goto L_0x031d
            int r2 = r11.A00     // Catch:{ all -> 0x0335 }
            int r1 = r11.A01     // Catch:{ all -> 0x0335 }
            int r2 = r2 + r1
            long r6 = (long) r2     // Catch:{ all -> 0x0335 }
            long r1 = r9.A05     // Catch:{ all -> 0x0335 }
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1Q(r8)
            r9.A01 = r1     // Catch:{ all -> 0x0335 }
        L_0x031d:
            r4.A01 = r11     // Catch:{ all -> 0x0335 }
            X.1QD r2 = r4.A05     // Catch:{ all -> 0x0335 }
            java.lang.String r1 = r11.A00()     // Catch:{ all -> 0x0335 }
            r2.A0K(r1)     // Catch:{ all -> 0x0335 }
            monitor-exit(r10)     // Catch:{ all -> 0x0335 }
            java.lang.Object r2 = r0.A02     // Catch:{ Exception -> 0x0338 }
            X.BDs r2 = (X.BDs) r2     // Catch:{ Exception -> 0x0338 }
            java.lang.Object r1 = r0.A03     // Catch:{ Exception -> 0x0338 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0338 }
            r2.C3n(r3, r1)     // Catch:{ Exception -> 0x0338 }
            return
        L_0x0335:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0335 }
            throw r1     // Catch:{ Exception -> 0x0338 }
        L_0x0338:
            r6 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x036e }
            java.lang.String r1 = "processSuccessfulGetClaimStatus: Error while parsing: "
            X.C17900vP.A0X(r6, r1, r2)     // Catch:{ 1UI -> 0x036e }
            r4.A04()     // Catch:{ 1UI -> 0x036e }
            java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x036e }
            X.BDs r2 = (X.BDs) r2     // Catch:{ 1UI -> 0x036e }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x036e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1UI -> 0x036e }
            r2.C3n(r3, r1)     // Catch:{ 1UI -> 0x036e }
            return
        L_0x0351:
            java.lang.Object r2 = r0.A02     // Catch:{ 1UI -> 0x036e }
            X.BDs r2 = (X.BDs) r2     // Catch:{ 1UI -> 0x036e }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x036e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1UI -> 0x036e }
            r2.C3n(r3, r1)     // Catch:{ 1UI -> 0x036e }
            return
        L_0x035d:
            java.lang.Object r3 = r0.A02     // Catch:{ 1UI -> 0x036e }
            X.BCa r3 = (X.C22543BCa) r3     // Catch:{ 1UI -> 0x036e }
            X.A7B r2 = new X.A7B     // Catch:{ 1UI -> 0x036e }
            r2.<init>((int) r5)     // Catch:{ 1UI -> 0x036e }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x036e }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ 1UI -> 0x036e }
            r3.Bi3(r2, r1)     // Catch:{ 1UI -> 0x036e }
            return
        L_0x036e:
            r4 = move-exception
            java.lang.Object r1 = r0.A01
            X.9yw r1 = (X.C198809yw) r1
            X.1QE r3 = r1.A0J
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "sendPrecheckWithSignature/onResponseSuccess/corrupt stream exception: "
            X.AnonymousClass8BX.A1C(r3, r4, r1, r2)
            java.lang.Object r2 = r0.A02
            X.BCa r2 = (X.C22543BCa) r2
            X.A7B r1 = new X.A7B
            r1.<init>((int) r5)
            java.lang.Object r0 = r0.A03
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.Bi3(r1, r0)
            return
        L_0x038f:
            r4 = 0
            X.C18070vi.A0d(r13, r4)
            java.lang.Object r3 = r0.A02     // Catch:{ 1UI -> 0x0502 }
            X.9F6 r3 = (X.AnonymousClass9F6) r3     // Catch:{ 1UI -> 0x0502 }
            r2 = 1
            r1 = 2
            X.AnonymousClass8BT.A1I(r13, r3, r1)     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r15 = r3.A00     // Catch:{ 1UI -> 0x0502 }
            X.1ca r15 = (X.C29621ca) r15     // Catch:{ 1UI -> 0x0502 }
            X.2rm r14 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x0502 }
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r7 = "account"
            r5[r4] = r7     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r3 = "action"
            r5[r2] = r3     // Catch:{ 1UI -> 0x0502 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ 1UI -> 0x0502 }
            r1[r4] = r7     // Catch:{ 1UI -> 0x0502 }
            java.lang.Long r17 = X.AnonymousClass8BW.A0Z(r3, r1, r2)     // Catch:{ 1UI -> 0x0502 }
            java.lang.Long r18 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x0502 }
            r3 = 0
            r19 = r3
            r20 = r1
            r21 = r4
            java.lang.Object r24 = r14.A05(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 1UI -> 0x0502 }
            if (r24 == 0) goto L_0x04f8
            r19 = r14
            r20 = r13
            r21 = r16
            r22 = r17
            r23 = r18
            r25 = r5
            r26 = r2
            java.lang.Object r1 = r19.A05(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x04f3
            X.A8Z r6 = X.A8Z.A00     // Catch:{ 1UI -> 0x0502 }
            X.AhU r5 = new X.AhU     // Catch:{ 1UI -> 0x0502 }
            r5.<init>(r6, r4)     // Catch:{ 1UI -> 0x0502 }
            java.lang.String[] r1 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0502 }
            r1[r4] = r7     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r9 = r14.A03(r13, r5, r1)     // Catch:{ 1UI -> 0x0502 }
            X.9Cw r9 = (X.C178379Cw) r9     // Catch:{ 1UI -> 0x0502 }
            if (r9 == 0) goto L_0x04fd
            r1 = 23
            X.Ahb r1 = X.C21290Ahb.A00(r15, r6, r1)     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r1 = r1.BCF(r13, r14)     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x04ee
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0502 }
            r2[r4] = r7     // Catch:{ 1UI -> 0x0502 }
            X.9S9 r1 = new X.9S9     // Catch:{ 1UI -> 0x0502 }
            r1.<init>()     // Catch:{ 1UI -> 0x0502 }
            X.AnonymousClass8BS.A1A(r13, r2)     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r12 = r0.A03     // Catch:{ 1UI -> 0x0502 }
            X.9yc r12 = (X.C198609yc) r12     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r1 = r9.A03     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r1 = "INACTIVE"
            boolean r1 = X.C18070vi.A18(r2, r1)     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x048e
            X.9I2 r10 = X.AnonymousClass9I2.INACTIVE     // Catch:{ 1UI -> 0x0502 }
        L_0x041c:
            X.9DN r1 = r9.A00     // Catch:{ 1UI -> 0x0502 }
            r13 = 0
            if (r1 == 0) goto L_0x049c
            java.lang.Object r2 = r1.A00     // Catch:{ 1UI -> 0x0502 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ 1UI -> 0x0502 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x0502 }
            boolean r1 = r2.isEmpty()     // Catch:{ 1UI -> 0x0502 }
            if (r1 != 0) goto L_0x049c
            java.util.Iterator r16 = r2.iterator()     // Catch:{ 1UI -> 0x0502 }
        L_0x0433:
            boolean r1 = r16.hasNext()     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x049c
            java.lang.Object r1 = r16.next()     // Catch:{ 1UI -> 0x0502 }
            X.9DN r1 = (X.AnonymousClass9DN) r1     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r1 = r1.A00     // Catch:{ 1UI -> 0x0502 }
            X.9DG r1 = (X.AnonymousClass9DG) r1     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r14 = r1.A02     // Catch:{ 1UI -> 0x0502 }
            java.lang.String r11 = r1.A03     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r2 = r1.A00     // Catch:{ 1UI -> 0x0502 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ 1UI -> 0x0502 }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ 1UI -> 0x0502 }
            boolean r1 = r2.isEmpty()     // Catch:{ 1UI -> 0x0502 }
            if (r1 != 0) goto L_0x0485
            java.util.Iterator r15 = r2.iterator()     // Catch:{ 1UI -> 0x0502 }
        L_0x0459:
            boolean r1 = r15.hasNext()     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x0485
            java.lang.Object r1 = r15.next()     // Catch:{ 1UI -> 0x0502 }
            X.9DN r1 = (X.AnonymousClass9DN) r1     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r2 = r1.A00     // Catch:{ 1UI -> 0x0502 }
            X.9DF r2 = (X.AnonymousClass9DF) r2     // Catch:{ 1UI -> 0x0502 }
            long r5 = r2.A00     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r1 = r2.A01     // Catch:{ 1UI -> 0x0502 }
            X.9DD r1 = (X.AnonymousClass9DD) r1     // Catch:{ 1UI -> 0x0502 }
            X.ARR r7 = X.C198609yc.A00(r12, r1)     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r1 = r2.A02     // Catch:{ 1UI -> 0x0502 }
            X.9DD r1 = (X.AnonymousClass9DD) r1     // Catch:{ 1UI -> 0x0502 }
            X.ARR r4 = X.C198609yc.A00(r12, r1)     // Catch:{ 1UI -> 0x0502 }
            int r2 = (int) r5     // Catch:{ 1UI -> 0x0502 }
            X.ADw r1 = new X.ADw     // Catch:{ 1UI -> 0x0502 }
            r1.<init>(r7, r4, r2)     // Catch:{ 1UI -> 0x0502 }
            r8.add(r1)     // Catch:{ 1UI -> 0x0502 }
            goto L_0x0459
        L_0x0485:
            X.ADx r1 = new X.ADx     // Catch:{ 1UI -> 0x0502 }
            r1.<init>(r11, r14, r8)     // Catch:{ 1UI -> 0x0502 }
            r3.add(r1)     // Catch:{ 1UI -> 0x0502 }
            goto L_0x0433
        L_0x048e:
            java.lang.String r1 = "ACTIVE"
            boolean r1 = X.C18070vi.A18(r2, r1)     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x0499
            X.9I2 r10 = X.AnonymousClass9I2.ACTIVE     // Catch:{ 1UI -> 0x0502 }
            goto L_0x041c
        L_0x0499:
            X.9I2 r10 = X.AnonymousClass9I2.NONE     // Catch:{ 1UI -> 0x0502 }
            goto L_0x041c
        L_0x049c:
            X.9DG r1 = r9.A01     // Catch:{ 1UI -> 0x0502 }
            if (r1 == 0) goto L_0x04a2
            java.lang.String r13 = r1.A02     // Catch:{ 1UI -> 0x0502 }
        L_0x04a2:
            java.lang.String r4 = r9.A02     // Catch:{ 1UI -> 0x0502 }
            if (r13 != 0) goto L_0x04a8
            r1 = 0
            goto L_0x04ae
        L_0x04a8:
            java.lang.String r1 = "1"
            boolean r1 = r13.equals(r1)     // Catch:{ 1UI -> 0x0502 }
        L_0x04ae:
            X.ADY r2 = new X.ADY     // Catch:{ 1UI -> 0x0502 }
            r2.<init>(r1)     // Catch:{ 1UI -> 0x0502 }
            X.AED r1 = new X.AED     // Catch:{ 1UI -> 0x0502 }
            r1.<init>(r2, r10, r4, r3)     // Catch:{ 1UI -> 0x0502 }
            java.lang.Object r3 = r0.A01     // Catch:{ 1UI -> 0x0502 }
            X.B8n r3 = (X.C22455B8n) r3     // Catch:{ 1UI -> 0x0502 }
            X.AYT r3 = (X.AYT) r3     // Catch:{ 1UI -> 0x0502 }
            int r0 = r3.A00     // Catch:{ 1UI -> 0x0502 }
            if (r0 == 0) goto L_0x04ca
            java.lang.Object r0 = r3.A01     // Catch:{ 1UI -> 0x0502 }
            X.8Gd r0 = (X.AnonymousClass8Gd) r0     // Catch:{ 1UI -> 0x0502 }
            r0.A0Z(r1)     // Catch:{ 1UI -> 0x0502 }
            return
        L_0x04ca:
            X.ADY r2 = r1.A00     // Catch:{ 1UI -> 0x0502 }
            X.9I2 r1 = r1.A01     // Catch:{ 1UI -> 0x0502 }
            X.9I2 r0 = X.AnonymousClass9I2.ACTIVE     // Catch:{ 1UI -> 0x0502 }
            if (r1 != r0) goto L_0x04dc
            if (r2 == 0) goto L_0x04dc
            java.lang.Object r1 = r3.A01     // Catch:{ 1UI -> 0x0502 }
            com.whatsapp.payments.ui.BrazilPaymentActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r1     // Catch:{ 1UI -> 0x0502 }
            boolean r0 = r2.A00     // Catch:{ 1UI -> 0x0502 }
            r1.A0m = r0     // Catch:{ 1UI -> 0x0502 }
        L_0x04dc:
            java.lang.Object r1 = r3.A01     // Catch:{ 1UI -> 0x0502 }
            com.whatsapp.payments.ui.BrazilPaymentActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r1     // Catch:{ 1UI -> 0x0502 }
            int r0 = r1.A01     // Catch:{ 1UI -> 0x0502 }
            r0 = r0 ^ 2
            r1.A01 = r0     // Catch:{ 1UI -> 0x0502 }
            X.1KB r1 = r1.A05     // Catch:{ 1UI -> 0x0502 }
            r0 = 22
            X.C21426Ajt.A00(r1, r3, r0)     // Catch:{ 1UI -> 0x0502 }
            return
        L_0x04ee:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0502 }
            goto L_0x0501
        L_0x04f3:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0502 }
            goto L_0x0501
        L_0x04f8:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0502 }
            goto L_0x0501
        L_0x04fd:
            X.1UI r0 = X.AnonymousClass1O9.A00(r14)     // Catch:{ 1UI -> 0x0502 }
        L_0x0501:
            throw r0     // Catch:{ 1UI -> 0x0502 }
        L_0x0502:
            r0 = move-exception
            java.lang.String r1 = "PaymentConfigActions"
            java.lang.String r0 = r0.getMessage()
            X.AnonymousClass8BS.A1F(r1, r0)
            return
        L_0x050d:
            X.1ca r2 = X.AnonymousClass8BR.A0j(r13)
            if (r2 != 0) goto L_0x051a
            X.A7B r1 = X.A7B.A00()
            A00(r0, r1)
        L_0x051a:
            java.lang.String r1 = "transaction"
            X.1ca r4 = r2.A0K(r1)
            if (r4 != 0) goto L_0x0529
            X.A7B r1 = X.A7B.A00()
            A00(r0, r1)
        L_0x0529:
            java.lang.Object r1 = r0.A01
            X.8z5 r1 = (X.C175668z5) r1
            X.10I r3 = r1.A06
            java.lang.Object r2 = r0.A02
            r1 = 26
            X.C21435Ak2.A00(r3, r0, r4, r2, r1)
            return
        L_0x0537:
            r4 = 0
            X.8zd r3 = new X.8zd     // Catch:{ 1UI -> 0x06e5 }
            r3.<init>()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x06e5 }
            X.9F3 r1 = (X.AnonymousClass9F3) r1     // Catch:{ 1UI -> 0x06e5 }
            r2 = 1
            int r7 = X.C72453Mb.A0G(r13, r1, r2)     // Catch:{ 1UI -> 0x06e5 }
            X.C108945cZ.A1N(r13)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r10 = r1.A04     // Catch:{ 1UI -> 0x06e5 }
            X.2rm r12 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r5 = X.AnonymousClass8BR.A1b()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "FBPAY"
            r5[r4] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "NOVI"
            r5[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "UPI"
            java.util.List r6 = X.C18070vi.A0O(r1, r5, r7)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r11 = "accept_pay"
            r5[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "service"
            r5[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            r12.A07(r13, r6, r5)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r9 = "0"
            r1[r4] = r9     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r5 = "1"
            java.util.List r8 = X.C18070vi.A0O(r5, r1, r2)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r6[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "consumer"
            r6[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r8 = r12.A07(r13, r8, r6)     // Catch:{ 1UI -> 0x06e5 }
            if (r8 == 0) goto L_0x060a
            java.util.List r9 = X.AnonymousClass8BX.A0o(r9, r5, r7, r2)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r6[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "merchant"
            r6[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = r12.A07(r13, r9, r6)     // Catch:{ 1UI -> 0x06e5 }
            if (r1 == 0) goto L_0x0604
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r6[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "outage"
            r6[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Long r15 = X.AnonymousClass8BU.A0i()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Long r16 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x06e5 }
            r18 = r6
            r19 = r4
            r17 = r5
            java.lang.Object r6 = r12.A05(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r7[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "sandbox"
            r7[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            r18 = r7
            java.lang.Object r7 = r12.A05(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 1UI -> 0x06e5 }
            X.A5w r9 = X.C20071A5w.A00     // Catch:{ 1UI -> 0x06e5 }
            r1 = 6
            X.Ahb r1 = X.C21290Ahb.A00(r10, r9, r1)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r1 = r1.BCF(r13, r12)     // Catch:{ 1UI -> 0x06e5 }
            if (r1 == 0) goto L_0x05fe
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x06e5 }
            r2[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            X.9S1 r1 = new X.9S1     // Catch:{ 1UI -> 0x06e5 }
            r1.<init>()     // Catch:{ 1UI -> 0x06e5 }
            X.AnonymousClass8BS.A1A(r13, r2)     // Catch:{ 1UI -> 0x06e5 }
            boolean r1 = r5.equals(r8)     // Catch:{ 1UI -> 0x06e5 }
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r3.A02 = r1     // Catch:{ 1UI -> 0x06e5 }
            boolean r1 = r5.equals(r6)     // Catch:{ 1UI -> 0x06e5 }
            r3.A00 = r1     // Catch:{ 1UI -> 0x06e5 }
            boolean r2 = r5.equals(r7)     // Catch:{ 1UI -> 0x06e5 }
            r3.A01 = r2     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r1 = r0.A01     // Catch:{ 1UI -> 0x06e5 }
            X.1ex r1 = (X.C31061ex) r1     // Catch:{ 1UI -> 0x06e5 }
            X.1QD r1 = r1.A08     // Catch:{ 1UI -> 0x06e5 }
            r1.A0P(r2)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06ec
        L_0x05fe:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06e4
        L_0x0604:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06e4
        L_0x060a:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06e4
        L_0x0610:
            r4 = 0
            X.8zd r3 = new X.8zd     // Catch:{ 1UI -> 0x06e5 }
            r3.<init>()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r1 = r0.A03     // Catch:{ 1UI -> 0x06e5 }
            X.9F3 r1 = (X.AnonymousClass9F3) r1     // Catch:{ 1UI -> 0x06e5 }
            r2 = 1
            int r7 = X.C72453Mb.A0G(r13, r1, r2)     // Catch:{ 1UI -> 0x06e5 }
            X.C108945cZ.A1N(r13)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r10 = r1.A04     // Catch:{ 1UI -> 0x06e5 }
            X.2rm r12 = X.AnonymousClass8BR.A0s()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r5 = X.AnonymousClass8BR.A1b()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "FBPAY"
            r5[r4] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "NOVI"
            r5[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "UPI"
            java.util.List r6 = X.C18070vi.A0O(r1, r5, r7)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r11 = "accept_pay"
            r5[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "service"
            r5[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            r12.A07(r13, r6, r5)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r1 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r9 = "0"
            r1[r4] = r9     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r5 = "1"
            java.util.List r8 = X.C18070vi.A0O(r5, r1, r2)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r6[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "consumer"
            r6[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r8 = r12.A07(r13, r8, r6)     // Catch:{ 1UI -> 0x06e5 }
            if (r8 == 0) goto L_0x06db
            java.util.List r9 = X.AnonymousClass8BX.A0o(r9, r5, r7, r2)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r6[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "merchant"
            r6[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = r12.A07(r13, r9, r6)     // Catch:{ 1UI -> 0x06e5 }
            if (r1 == 0) goto L_0x06d6
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r6[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "outage"
            r6[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            java.lang.Long r15 = X.AnonymousClass8BU.A0i()     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Long r16 = X.AnonymousClass8BU.A0j()     // Catch:{ 1UI -> 0x06e5 }
            r18 = r6
            r19 = r4
            r17 = r5
            java.lang.Object r6 = r12.A05(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x06e5 }
            r7[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            java.lang.String r1 = "sandbox"
            r7[r2] = r1     // Catch:{ 1UI -> 0x06e5 }
            r18 = r7
            java.lang.Object r7 = r12.A05(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 1UI -> 0x06e5 }
            X.A5w r9 = X.C20071A5w.A00     // Catch:{ 1UI -> 0x06e5 }
            r1 = 6
            X.Ahb r1 = X.C21290Ahb.A00(r10, r9, r1)     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r1 = r1.BCF(r13, r12)     // Catch:{ 1UI -> 0x06e5 }
            if (r1 == 0) goto L_0x06e0
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x06e5 }
            r2[r4] = r11     // Catch:{ 1UI -> 0x06e5 }
            X.9S1 r1 = new X.9S1     // Catch:{ 1UI -> 0x06e5 }
            r1.<init>()     // Catch:{ 1UI -> 0x06e5 }
            X.AnonymousClass8BS.A1A(r13, r2)     // Catch:{ 1UI -> 0x06e5 }
            boolean r1 = r5.equals(r8)     // Catch:{ 1UI -> 0x06e5 }
            boolean r1 = X.AnonymousClass000.A1O(r1)
            r3.A02 = r1     // Catch:{ 1UI -> 0x06e5 }
            boolean r1 = r5.equals(r6)     // Catch:{ 1UI -> 0x06e5 }
            r3.A00 = r1     // Catch:{ 1UI -> 0x06e5 }
            boolean r2 = r5.equals(r7)     // Catch:{ 1UI -> 0x06e5 }
            r3.A01 = r2     // Catch:{ 1UI -> 0x06e5 }
            java.lang.Object r1 = r0.A01     // Catch:{ 1UI -> 0x06e5 }
            X.1ex r1 = (X.C31061ex) r1     // Catch:{ 1UI -> 0x06e5 }
            X.1QD r1 = r1.A08     // Catch:{ 1UI -> 0x06e5 }
            r1.A0P(r2)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06ec
        L_0x06d6:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06e4
        L_0x06db:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ 1UI -> 0x06e5 }
            goto L_0x06e4
        L_0x06e0:
            X.1UI r1 = X.AnonymousClass1O9.A00(r12)     // Catch:{ 1UI -> 0x06e5 }
        L_0x06e4:
            throw r1     // Catch:{ 1UI -> 0x06e5 }
        L_0x06e5:
            X.8zd r3 = new X.8zd
            r3.<init>()
            r3.A02 = r4
        L_0x06ec:
            java.lang.Object r0 = r0.A02
            X.1jB r0 = (X.C33661jB) r0
            r0.C3Y(r3)
            return
        L_0x06f4:
            return
        L_0x06f5:
            java.lang.String r1 = "PAY: PaymentIncentiveManager/syncIncentiveData/refreshGetIncentiveOfferInfo failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1UI -> 0x0700 }
            X.BB5 r1 = r7.A00     // Catch:{ 1UI -> 0x0700 }
            r1.Bsl()     // Catch:{ 1UI -> 0x0700 }
            return
        L_0x0700:
            r1 = move-exception
            java.lang.String r2 = "GetIncentiveOffer"
            java.lang.String r1 = r1.getMessage()
            X.AnonymousClass8BS.A1F(r2, r1)
            java.lang.Object r1 = r0.A02
            X.9m3 r1 = (X.C191119m3) r1
            X.A7B r0 = X.A7B.A00()
            r1.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175488yn.A06(X.1ca):void");
    }
}
