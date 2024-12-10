package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.8yf  reason: invalid class name and case insensitive filesystem */
public class C175408yf extends C20992Ack {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175408yf(Context context, C33711jG r2, AnonymousClass119 r3, Object obj, int i) {
        super(context, r2, r3);
        this.A00 = i;
        this.A01 = obj;
    }

    public void A04(A7B a7b) {
        A7B a7b2 = a7b;
        switch (this.A00) {
            case 0:
                C17900vP.A0Y(a7b, "PAY: BrazilAddCardAction onRequestError: ", AnonymousClass000.A10());
                ((C175578yw) this.A01).A0G.A00((AnonymousClass8pK) null, a7b2, (ArrayList) null, false, false);
                return;
            case 1:
                C17900vP.A0Y(a7b, "PAY: BrazilDeviceBindingAction onRequestError: ", AnonymousClass000.A10());
                ((A0N) this.A01).A02.BrN((AnonymousClass8pK) null, a7b, (ArrayList) null, false);
                return;
            case 2:
                C17900vP.A0Y(a7b, "PAY: BrazilDeviceBindingAction onRequestError: ", AnonymousClass000.A10());
                ((C191889nM) this.A01).A06.A00((C188059go) null);
                return;
            case 3:
                C188369hJ r0 = (C188369hJ) this.A01;
                r0.A06.A00(A7B.A00(), r0.A07);
                return;
            case 4:
                return;
            case 5:
                C17900vP.A0X(a7b, "PAY: BrazilMerchantLinkAction request error: ", AnonymousClass000.A10());
                ((C188379hK) this.A01).A06.A00((AnonymousClass8pO) null, a7b);
                return;
            case 6:
                C17900vP.A0X(a7b, "PAY: BrazilMerchantPreLinkAction request error: ", AnonymousClass000.A10());
                ((C175568yv) this.A01).A06.A00(a7b);
                return;
            case 7:
                C17900vP.A0X(a7b, "PAY: BrazilRetokenizeCardAction onRequestError: ", AnonymousClass000.A10());
                ((C175548yt) this.A01).A09.A00((AnonymousClass8pK) null, a7b, (ArrayList) null, false);
                return;
            case 8:
                ((C175558yu) this.A01).A07.A00(A7B.A00());
                return;
            case 9:
                C17900vP.A0Y(a7b, "PAY: BrazilVerifyCardOTPSendAction onRequestError: ", AnonymousClass000.A10());
                ((C175598yy) this.A01).A04.A00((AnonymousClass8pK) null, a7b);
                return;
            case 10:
                C17900vP.A0Y(a7b, "PAY: BrazilVerifyCardSendAuthCodeAction onRequestError: ", AnonymousClass000.A10());
                ((C175588yx) this.A01).A02.A00(a7b);
                return;
            default:
                C191539ml r3 = (C191539ml) this.A01;
                AnonymousClass8BX.A1D(r3.A01, a7b, "onRequestError: ", AnonymousClass000.A10());
                r3.A00.C3r((String) null);
                return;
        }
    }

    public void A05(A7B a7b) {
        A7B a7b2 = a7b;
        switch (this.A00) {
            case 0:
                C17900vP.A0Y(a7b, "PAY: BrazilAddCardAction onResponseError: ", AnonymousClass000.A10());
                ((C175578yw) this.A01).A0G.A00((AnonymousClass8pK) null, a7b2, (ArrayList) null, false, false);
                return;
            case 1:
                C17900vP.A0Y(a7b, "PAY: BrazilDeviceBindingAction onResponseError: ", AnonymousClass000.A10());
                ((A0N) this.A01).A02.BrN((AnonymousClass8pK) null, a7b, (ArrayList) null, false);
                return;
            case 2:
                C17900vP.A0Y(a7b, "PAY: BrazilDeviceBindingAction onResponseError: ", AnonymousClass000.A10());
                ((C191889nM) this.A01).A06.A00((C188059go) null);
                return;
            case 3:
                C188369hJ r0 = (C188369hJ) this.A01;
                r0.A06.A00(A7B.A00(), r0.A07);
                return;
            case 4:
                return;
            case 5:
                C17900vP.A0X(a7b, "PAY: BrazilMerchantLinkAction response error: ", AnonymousClass000.A10());
                ((C188379hK) this.A01).A06.A00((AnonymousClass8pO) null, a7b);
                return;
            case 6:
                C17900vP.A0X(a7b, "PAY: BrazilMerchantPreLinkAction response error: ", AnonymousClass000.A10());
                ((C175568yv) this.A01).A06.A00(a7b);
                return;
            case 7:
                C17900vP.A0X(a7b, "PAY: BrazilRetokenizeCardAction onResponseError: ", AnonymousClass000.A10());
                ((C175548yt) this.A01).A09.A00((AnonymousClass8pK) null, a7b, (ArrayList) null, false);
                return;
            case 8:
                ((C175558yu) this.A01).A07.A00(A7B.A00());
                return;
            case 9:
                C17900vP.A0Y(a7b, "PAY: BrazilVerifyCardOTPSendAction onResponseError: ", AnonymousClass000.A10());
                ((C175598yy) this.A01).A04.A00((AnonymousClass8pK) null, a7b);
                return;
            case 10:
                C17900vP.A0Y(a7b, "PAY: BrazilVerifyCardSendAuthCodeAction onResponseError: ", AnonymousClass000.A10());
                ((C175588yx) this.A01).A02.A00(a7b);
                return;
            default:
                C191539ml r3 = (C191539ml) this.A01;
                AnonymousClass8BX.A1D(r3.A01, a7b, "onResponseError: ", AnonymousClass000.A10());
                r3.A00.C3r((String) null);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.8yw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: X.8yt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: X.8yw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: X.8yw} */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0423, code lost:
        X.A5I.A01(r2, r5, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0426, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0465, code lost:
        r2.A03(new X.ARI(r5, r6, r8, r1), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x046d, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C29621ca r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x03f5;
                case 1: goto L_0x0397;
                case 2: goto L_0x032b;
                case 3: goto L_0x0298;
                case 4: goto L_0x001c;
                case 5: goto L_0x024d;
                case 6: goto L_0x01cc;
                case 7: goto L_0x0120;
                case 8: goto L_0x0062;
                case 9: goto L_0x00e3;
                case 10: goto L_0x00ac;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.1ca r3 = X.AnonymousClass8BR.A0j(r11)
            r2 = 0
            java.lang.Object r0 = r10.A01
            X.9ml r0 = (X.C191539ml) r0
            X.B8o r1 = r0.A00
            if (r3 == 0) goto L_0x0059
            java.lang.String r0 = "token-id"
            java.lang.String r0 = r3.A0Q(r0, r2)
            r1.C3r(r0)
        L_0x001b:
            return
        L_0x001c:
            X.1ca r6 = X.AnonymousClass8BR.A0j(r11)
            if (r6 == 0) goto L_0x001b
            java.lang.String r0 = "is-recoverable"
            r4 = 0
            java.lang.String r1 = r6.A0Q(r0, r4)
            java.lang.String r0 = "1"
            boolean r3 = r0.equals(r1)
            java.lang.Object r5 = r10.A01
            X.9lz r5 = (X.C191079lz) r5
            X.1QD r0 = r5.A01
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r0)
            java.lang.String r0 = "payment_account_recoverable"
            X.C17880vN.A1F(r1, r0, r3)
            r1 = 0
            if (r3 == 0) goto L_0x0486
            java.lang.String r0 = "suspended-ts"
            java.lang.String r0 = r6.A0Q(r0, r4)
            long r3 = X.C20099A7c.A04(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0480
            X.1QD r2 = r5.A01
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r2.A0H(r3)
            return
        L_0x0059:
            X.A7B r0 = new X.A7B
            r0.<init>()
            r1.C3r(r2)
            return
        L_0x0062:
            java.lang.String r0 = "account"
            X.1ca r4 = r11.A0L(r0)     // Catch:{ 1UI -> 0x0099 }
            X.A7B r1 = X.A7B.A01(r4)     // Catch:{ 1UI -> 0x0099 }
            if (r1 == 0) goto L_0x0078
            java.lang.Object r0 = r10.A01     // Catch:{ 1UI -> 0x0099 }
            X.8yu r0 = (X.C175558yu) r0     // Catch:{ 1UI -> 0x0099 }
            X.9jT r0 = r0.A07     // Catch:{ 1UI -> 0x0099 }
            r0.A00(r1)     // Catch:{ 1UI -> 0x0099 }
            return
        L_0x0078:
            X.8pZ r2 = new X.8pZ     // Catch:{ 1UI -> 0x0099 }
            r2.<init>()     // Catch:{ 1UI -> 0x0099 }
            java.lang.Object r3 = r10.A01     // Catch:{ 1UI -> 0x0099 }
            X.8yu r3 = (X.C175558yu) r3     // Catch:{ 1UI -> 0x0099 }
            X.1KI r1 = r3.A03     // Catch:{ 1UI -> 0x0099 }
            java.lang.String r0 = "merchant"
            X.1ca r0 = r4.A0L(r0)     // Catch:{ 1UI -> 0x0099 }
            X.AEs r2 = X.C170278pb.A02(r1, r2, r0)     // Catch:{ 1UI -> 0x0099 }
            X.1QS r0 = r3.A06     // Catch:{ 1UI -> 0x0099 }
            X.A5I r1 = r0.A01()     // Catch:{ 1UI -> 0x0099 }
            r0 = 10
            X.A5I.A01(r1, r2, r10, r0)     // Catch:{ 1UI -> 0x0099 }
            return
        L_0x0099:
            java.lang.String r0 = "PAY: BrazilMerchantRegAction/regMerchant: invalid response message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.Object r0 = r10.A01
            X.8yu r0 = (X.C175558yu) r0
            X.9jT r1 = r0.A07
            X.A7B r0 = X.A7B.A00()
            r1.A00(r0)
            return
        L_0x00ac:
            java.lang.String r0 = "PAY: BrazilVerifyCardSendAuthCodeAction success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ca r1 = X.AnonymousClass8BR.A0j(r11)
            if (r1 == 0) goto L_0x00d9
            java.lang.String r0 = "card"
            X.1ca r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x00d9
            X.8pT r2 = new X.8pT
            r2.<init>()
            java.lang.Object r1 = r10.A01
            X.8yx r1 = (X.C175588yx) r1
            X.1KI r0 = r1.A00
            X.AEs r2 = X.C170278pb.A02(r0, r2, r3)
            X.1QS r0 = r1.A07
            X.A5I r1 = r0.A01()
            r0 = 12
            X.A5I.A01(r1, r2, r10, r0)
        L_0x00d9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: BrazilVerifyCardSendAuthCodeAction onResponseSuccess: "
            X.C17900vP.A0Y(r11, r0, r1)
            return
        L_0x00e3:
            java.lang.String r0 = "PAY: BrazilVerifyCardOTPSendAction success"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1ca r1 = X.AnonymousClass8BR.A0j(r11)
            if (r1 == 0) goto L_0x0111
            java.lang.String r0 = "card"
            X.1ca r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x0111
            X.8pT r2 = new X.8pT
            r2.<init>()
            java.lang.Object r1 = r10.A01
            X.8yy r1 = (X.C175598yy) r1
            X.1KI r0 = r1.A01
            X.AEs r2 = X.C170278pb.A02(r0, r2, r3)
            X.1QS r0 = r1.A07
            X.A5I r1 = r0.A01()
            r0 = 11
            X.A5I.A01(r1, r2, r10, r0)
            return
        L_0x0111:
            java.lang.Object r0 = r10.A01
            X.8yy r0 = (X.C175598yy) r0
            X.9lS r2 = r0.A04
            X.A7B r1 = X.A7B.A00()
            r0 = 0
            r2.A00(r0, r1)
            return
        L_0x0120:
            java.lang.String r0 = "PAY: BrazilRetokenizeCardAction onResponseSuccess: "
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1ca r7 = X.AnonymousClass8BR.A0j(r11)
            r4 = 0
            r3 = 0
            if (r7 == 0) goto L_0x01a9
            r1 = r7
            java.lang.String r0 = "error-code"
            java.lang.String r0 = r7.A0Q(r0, r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01b4
            java.lang.String r0 = "token"
            X.1ca r1 = r7.A0K(r0)
            if (r1 != 0) goto L_0x01b4
            java.lang.String r0 = "card"
            X.1ca r2 = r7.A0K(r0)
            if (r2 == 0) goto L_0x01a9
            X.8pT r1 = new X.8pT
            r1.<init>()
            java.lang.Object r6 = r10.A01
            X.8yt r6 = (X.C175548yt) r6
            X.1KI r0 = r6.A04
            r1.A05(r0, r2, r4)
            X.AEs r5 = r1.A08()
            X.A4g r0 = r6.A08
            X.C20037A4g.A01(r3, r5, r0)
            boolean r0 = r1.A0a
            if (r0 == 0) goto L_0x016f
            X.1QS r0 = r6.A07
            X.A5I r2 = r0.A01()
            r0 = 8
            goto L_0x0423
        L_0x016f:
            boolean r0 = r1.A07
            if (r0 != 0) goto L_0x019f
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.lang.String r0 = "verify-method-list"
            X.1ca r0 = r7.A0K(r0)
            if (r0 == 0) goto L_0x0196
            X.1ca[] r4 = r0.A02
            if (r4 == 0) goto L_0x0196
            int r3 = r4.length
            if (r3 <= 0) goto L_0x0196
            r2 = 0
        L_0x0187:
            r1 = r4[r2]
            X.Aib r0 = new X.Aib
            r0.<init>(r1)
            r8.add(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0196
            goto L_0x0187
        L_0x0196:
            X.1QS r0 = r6.A07
            X.A5I r2 = r0.A01()
            r1 = 1
            goto L_0x0465
        L_0x019f:
            X.1QS r0 = r6.A07
            X.A5I r2 = r0.A01()
            r0 = 9
            goto L_0x0423
        L_0x01a9:
            java.lang.Object r0 = r10.A01
            X.8yt r0 = (X.C175548yt) r0
            X.9ka r0 = r0.A09
            X.A7B r2 = X.A7B.A00()
            goto L_0x01c8
        L_0x01b4:
            X.A7B r2 = new X.A7B
            r2.<init>((X.C29621ca) r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: BrazilRetokenizeCardAction onResponseSuccess error:"
            X.C17900vP.A0X(r2, r0, r1)
            java.lang.Object r0 = r10.A01
            X.8yt r0 = (X.C175548yt) r0
            X.9ka r0 = r0.A09
        L_0x01c8:
            r0.A00(r3, r2, r3, r4)
            return
        L_0x01cc:
            X.1ca r9 = X.AnonymousClass8BR.A0j(r11)
            X.C17960vV.A07(r9)
            java.lang.String r0 = "owner-name"
            r8 = 0
            java.lang.String r6 = X.AnonymousClass8BT.A0u(r9, r0, r8)
            java.lang.String r0 = "business-name"
            java.lang.String r7 = X.AnonymousClass8BT.A0u(r9, r0, r8)
            java.lang.String r0 = "verify-type"
            java.lang.String r5 = X.AnonymousClass8BT.A0u(r9, r0, r8)
            java.lang.String r0 = "bank-name"
            java.lang.String r4 = r9.A0Q(r0, r8)
            java.lang.String r0 = "merchant"
            X.1ca r1 = r9.A0K(r0)
            X.C17960vV.A07(r1)
            java.lang.String r0 = "credential-id"
            java.lang.String r3 = X.AnonymousClass8BT.A0u(r1, r0, r8)
            java.lang.String r1 = "error-code"
            java.lang.String r0 = r9.A0Q(r1, r8)
            if (r0 == 0) goto L_0x0247
            X.A7B r2 = X.A7B.A00()
            java.lang.String r1 = r9.A0Q(r1, r8)
            r0 = 0
            int r1 = X.C20099A7c.A01(r1, r0)
            java.lang.String r0 = "error-text"
            java.lang.String r0 = r9.A0Q(r0, r8)
            r2.A00 = r1
            r2.A07 = r0
        L_0x021a:
            java.lang.Object r0 = r10.A01
            X.8yv r0 = (X.C175568yv) r0
            X.9jU r0 = r0.A06
            if (r2 != 0) goto L_0x0249
            X.9sN r2 = r0.A00
            java.util.HashMap r1 = X.C17880vN.A11()
            java.lang.String r0 = "business_name"
            r1.put(r0, r7)
            java.lang.String r0 = "owner_full_name"
            r1.put(r0, r6)
            java.lang.String r0 = "verify_type"
            r1.put(r0, r5)
            java.lang.String r0 = "bank_name"
            r1.put(r0, r4)
            java.lang.String r0 = "credential_id"
            r1.put(r0, r3)
            java.lang.String r0 = "on_success"
            r2.A01(r0, r1)
            return
        L_0x0247:
            r2 = r8
            goto L_0x021a
        L_0x0249:
            r0.A00(r2)
            return
        L_0x024d:
            r4 = 0
            java.lang.String r0 = "account"
            X.1ca r5 = r11.A0L(r0)     // Catch:{ 1UI -> 0x0284 }
            X.A7B r1 = X.A7B.A01(r5)     // Catch:{ 1UI -> 0x0284 }
            if (r1 == 0) goto L_0x0264
            java.lang.Object r0 = r10.A01     // Catch:{ 1UI -> 0x0284 }
            X.9hK r0 = (X.C188379hK) r0     // Catch:{ 1UI -> 0x0284 }
            X.9jS r0 = r0.A06     // Catch:{ 1UI -> 0x0284 }
            r0.A00(r4, r1)     // Catch:{ 1UI -> 0x0284 }
            return
        L_0x0264:
            X.8pZ r2 = new X.8pZ     // Catch:{ 1UI -> 0x0284 }
            r2.<init>()     // Catch:{ 1UI -> 0x0284 }
            java.lang.Object r3 = r10.A01     // Catch:{ 1UI -> 0x0284 }
            X.9hK r3 = (X.C188379hK) r3     // Catch:{ 1UI -> 0x0284 }
            X.1KI r1 = r3.A02     // Catch:{ 1UI -> 0x0284 }
            java.lang.String r0 = "merchant"
            X.1ca r0 = r5.A0L(r0)     // Catch:{ 1UI -> 0x0284 }
            X.AEs r2 = X.C170278pb.A02(r1, r2, r0)     // Catch:{ 1UI -> 0x0284 }
            X.1QS r0 = r3.A05     // Catch:{ 1UI -> 0x0284 }
            X.A5I r1 = r0.A01()     // Catch:{ 1UI -> 0x0284 }
            r0 = 7
            X.A5I.A01(r1, r2, r10, r0)     // Catch:{ 1UI -> 0x0284 }
            return
        L_0x0284:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilMerchantLinkAction/regMerchant: invalid response message"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Object r0 = r10.A01
            X.9hK r0 = (X.C188379hK) r0
            X.9jS r1 = r0.A06
            X.A7B r0 = X.A7B.A00()
            r1.A00(r4, r0)
            return
        L_0x0298:
            X.1ca r1 = X.AnonymousClass8BR.A0j(r11)
            if (r1 == 0) goto L_0x031b
            java.lang.String r0 = "image"
            X.1ca r1 = r1.A0K(r0)
            if (r1 == 0) goto L_0x031b
            java.lang.Object r0 = r10.A01
            X.9hJ r0 = (X.C188369hJ) r0
            X.9m5 r6 = r0.A06
            java.lang.String r0 = "credential-id"
            r4 = 0
            java.lang.String r8 = r1.A0Q(r0, r4)
            java.lang.String r0 = "image-content-id"
            r1.A0Q(r0, r4)
            java.lang.String r0 = "image-url"
            java.lang.String r7 = r1.A0Q(r0, r4)
            java.lang.String r0 = "image-label-color"
            java.lang.String r5 = r1.A0Q(r0, r4)
            X.AEs r3 = r6.A01
            java.lang.String r2 = r3.A0A
            boolean r0 = r8.equals(r2)
            if (r0 == 0) goto L_0x0309
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x02ed
            X.8pT r0 = r6.A02
            r0.A0E = r7
            android.widget.ImageView r2 = r6.A00
            X.A4g r0 = r6.A03
            X.93V r1 = r0.A01
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.4VT r0 = r1.A00()
            if (r2 == 0) goto L_0x0303
            if (r0 == 0) goto L_0x02ed
            r0.A03(r2, r7)
        L_0x02ed:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x02f7
            X.8pT r0 = r6.A02
            r0.A0D = r5
        L_0x02f7:
            X.A4g r0 = r6.A03
            X.1QS r0 = r0.A00
            X.A5I r0 = r0.A01()
            r0.A03(r4, r3)
            return
        L_0x0303:
            if (r0 == 0) goto L_0x02ed
            r0.A04(r4, r7)
            goto L_0x02ed
        L_0x0309:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: fetchCardArtImageContentDetails credentialIds don't match; request: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " response: "
            X.C17900vP.A0g(r0, r8, r1)
            return
        L_0x031b:
            java.lang.Object r0 = r10.A01
            X.9hJ r0 = (X.C188369hJ) r0
            X.9m5 r2 = r0.A06
            java.lang.String r1 = r0.A07
            X.A7B r0 = X.A7B.A00()
            r2.A00(r0, r1)
            return
        L_0x032b:
            X.1ca r1 = X.AnonymousClass8BR.A0j(r11)
            r5 = 0
            if (r1 == 0) goto L_0x0388
            java.lang.String r0 = "elo"
            X.1ca r2 = r1.A0K(r0)
            if (r2 == 0) goto L_0x0388
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r2.A0Q(r0, r5)
            java.lang.String r0 = "1"
            X.9go r6 = X.C188059go.A00(r0, r1, r5)
            java.lang.String r0 = "ciphered_wallet_secret"
            java.lang.String r1 = r2.A0Q(r0, r5)
            java.lang.Object r4 = r10.A01
            X.9nM r4 = (X.C191889nM) r4
            X.A6a r0 = r4.A02
            X.1QD r3 = r0.A01
            android.content.SharedPreferences r0 = r3.A03()
            java.lang.String r2 = "payment_trusted_device_elo_wallet_store"
            java.lang.String r0 = r0.getString(r2, r5)
            if (r0 == 0) goto L_0x0361
            goto L_0x0366
        L_0x0361:
            org.json.JSONObject r5 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0370 }
            goto L_0x036a
        L_0x0366:
            org.json.JSONObject r5 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0370 }
        L_0x036a:
            java.lang.String r0 = "wallet_secret"
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x0370 }
            goto L_0x0377
        L_0x0370:
            X.1QE r1 = r3.A02
            java.lang.String r0 = "Failed to updated the wallet_secret"
            r1.A06(r0)
        L_0x0377:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r3)
            java.lang.String r0 = r5.toString()
            X.C17880vN.A1E(r1, r2, r0)
            X.9jN r0 = r4.A06
            r0.A00(r6)
            return
        L_0x0388:
            java.lang.Object r0 = r10.A01
            X.9nM r0 = (X.C191889nM) r0
            X.9jN r1 = r0.A06
            X.A7B r0 = new X.A7B
            r0.<init>()
            r1.A00(r5)
            return
        L_0x0397:
            X.1ca r2 = X.AnonymousClass8BR.A0j(r11)
            r8 = 0
            r6 = 0
            if (r2 == 0) goto L_0x03e7
            java.lang.String r0 = "card"
            X.1ca r1 = r2.A0K(r0)
            if (r1 == 0) goto L_0x03e7
            X.8pT r9 = new X.8pT
            r9.<init>()
            java.lang.Object r7 = r10.A01
            X.A0N r7 = (X.A0N) r7
            X.1KI r0 = r7.A00
            r9.A05(r0, r1, r8)
            X.AEs r5 = r9.A08()
            X.8pK r5 = (X.AnonymousClass8pK) r5
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.String r0 = "verify-method-list"
            X.1ca r3 = r2.A0K(r0)
            if (r3 == 0) goto L_0x03df
            X.1ca[] r0 = r3.A02
            if (r0 == 0) goto L_0x03df
            int r2 = r0.length
            if (r2 <= 0) goto L_0x03df
        L_0x03ce:
            X.1ca r1 = r3.A0J(r8)
            X.Aib r0 = new X.Aib
            r0.<init>(r1)
            r4.add(r0)
            int r8 = r8 + 1
            if (r8 >= r2) goto L_0x03df
            goto L_0x03ce
        L_0x03df:
            X.B8e r1 = r7.A02
            boolean r0 = r9.A0a
            r1.BrN(r5, r6, r4, r0)
            return
        L_0x03e7:
            java.lang.Object r0 = r10.A01
            X.A0N r0 = (X.A0N) r0
            X.B8e r1 = r0.A02
            X.A7B r0 = X.A7B.A00()
            r1.BrN(r6, r0, r6, r8)
            return
        L_0x03f5:
            X.1ca r3 = X.AnonymousClass8BR.A0j(r11)
            if (r3 == 0) goto L_0x046e
            java.lang.String r0 = "card"
            X.1ca r1 = r3.A0K(r0)
            if (r1 == 0) goto L_0x046e
            X.8pT r2 = new X.8pT
            r2.<init>()
            java.lang.Object r6 = r10.A01
            X.8yw r6 = (X.C175578yw) r6
            X.1KI r0 = r6.A07
            X.AEs r5 = X.C170278pb.A02(r0, r2, r1)
            X.A4g r1 = r6.A0F
            r0 = 0
            X.C20037A4g.A01(r0, r5, r1)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x0427
            X.1QS r0 = r6.A0C
            X.A5I r2 = r0.A01()
            r0 = 1
        L_0x0423:
            X.A5I.A01(r2, r5, r10, r0)
            return
        L_0x0427:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x0439
            boolean r1 = r2.A06
            X.1QS r0 = r6.A0C
            X.A5I r2 = r0.A01()
            if (r1 == 0) goto L_0x0437
            r0 = 2
            goto L_0x0423
        L_0x0437:
            r0 = 3
            goto L_0x0423
        L_0x0439:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.lang.String r0 = "verify-method-list"
            X.1ca r4 = r3.A0K(r0)
            if (r4 == 0) goto L_0x045e
            X.1ca[] r0 = r4.A02
            if (r0 == 0) goto L_0x045e
            int r3 = r0.length
            if (r3 <= 0) goto L_0x045e
            r2 = 0
        L_0x044d:
            X.1ca r1 = r4.A0J(r2)
            X.Aib r0 = new X.Aib
            r0.<init>(r1)
            r8.add(r0)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x045e
            goto L_0x044d
        L_0x045e:
            X.1QS r0 = r6.A0C
            X.A5I r2 = r0.A01()
            r1 = 0
        L_0x0465:
            X.ARI r0 = new X.ARI
            r0.<init>(r5, r6, r8, r1)
            r2.A03(r0, r5)
            return
        L_0x046e:
            java.lang.Object r0 = r10.A01
            X.8yw r0 = (X.C175578yw) r0
            X.9kY r0 = r0.A0G
            X.A7B r2 = X.A7B.A00()
            r1 = 0
            r4 = 0
            r3 = r1
            r5 = r4
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x0480:
            X.1QD r0 = r5.A01
            r0.A0B()
            return
        L_0x0486:
            X.1QD r0 = r5.A01
            r0.A0H(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175408yf.A06(X.1ca):void");
    }
}
