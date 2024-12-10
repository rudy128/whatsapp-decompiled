package X;

import android.content.Context;
import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.8yh  reason: invalid class name and case insensitive filesystem */
public class C175428yh extends C20992Ack {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175428yh(Context context, C33711jG r2, AnonymousClass119 r3, Object obj, Object obj2, int i) {
        super(context, r2, r3);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void A04(A7B a7b) {
        C33661jB r0;
        switch (this.A00) {
            case 0:
                AnonymousClass8BX.A1C(((C31061ex) this.A01).A0D, a7b, "tosv3 onRequestError: ", AnonymousClass000.A10());
                break;
            case 3:
                ((C191329mQ) this.A02).A00();
                return;
            case 4:
                return;
            case 5:
                AnonymousClass8BX.A1C(((C198709ym) this.A01).A07, a7b, "BrazilAddCredentialAction : onRequestError: ", AnonymousClass000.A10());
                AnonymousClass91q.A0q(((C184839bb) this.A02).A00, (Map) null, a7b.A00);
                return;
            case 6:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((AnonymousClass9YK) this.A02).A00;
                brazilPaymentTransactionDetailActivity.CEx();
                C108965cb.A18(brazilPaymentTransactionDetailActivity, 2131887913, 2131893867);
                return;
            case 7:
                C17900vP.A0Y(a7b, "PAY: BrazilFetchNetworkInfoAction/onRequestError: ", AnonymousClass000.A10());
                ((C190759lT) this.A02).A00((C188059go) null);
                return;
            case 8:
                C17900vP.A0Y(a7b, "PAY: BrazilGetVerificationMethods onRequestError: ", AnonymousClass000.A10());
                ((BB9) this.A02).C3s(a7b, (List) null);
                return;
            case 9:
                C17900vP.A0Y(a7b, "PAY: BrazilFetchEloChallengeIdAction onRequestError: ", AnonymousClass000.A10());
                ((AnonymousClass9Y8) this.A02).A00.A03(a7b, (String) null);
                return;
            case 10:
                C17900vP.A0Y(a7b, "PAY: BrazilSubmitVerificationMethodAction onRequestError: ", AnonymousClass000.A10());
                ((C190739lR) this.A02).A00(a7b, (AnonymousClass8pT) null);
                return;
            case 11:
                StringBuilder A0K = C18070vi.A0K(a7b);
                A0K.append("PAY: MFAAction/onRequestError - ");
                A0K.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                C17900vP.A0Z(a7b, ": ", A0K);
                ((C184719bP) this.A01).A00.Bst(new C199169zY(a7b));
                return;
            case 12:
                BD4 A0U = AnonymousClass8BT.A0U(((C192839p4) this.A01).A07);
                if (A0U != null) {
                    A0U.reset();
                }
                r0 = (C33661jB) this.A02;
                if (r0 == null) {
                    return;
                }
                break;
            case 13:
                ((C191419mZ) this.A02).A00(a7b);
                return;
            case 15:
                ((C190179kV) this.A02).A00(a7b);
                return;
            case 16:
                C184749bS r3 = (C184749bS) this.A02;
                AnonymousClass8BX.A1D(r3.A01.A05, a7b, "performNameCheck onError: ", AnonymousClass000.A10());
                r3.A00.Bss(a7b);
                return;
            case 17:
                C184759bT r32 = (C184759bT) this.A02;
                AnonymousClass8BX.A1D(r32.A01.A05, a7b, "performDobComplianceCheck onError: ", AnonymousClass000.A10());
                r32.A00.Bss(a7b);
                return;
            case 18:
                C17900vP.A0X(a7b, "getOfferDetails: failed with error: ", AnonymousClass000.A10());
                AnonymousClass9YA r1 = ((C186129dh) this.A02).A01;
                if (r1 != null) {
                    Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed");
                    r1.A00.A00.Bsl();
                    return;
                }
                return;
            case 19:
                C18070vi.A0d(a7b, 0);
                AnonymousClass1QE r2 = ((C191619mt) this.A02).A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("providerKey: onRequestError ");
                r2.A05(C17880vN.A0t(A10, a7b.A00));
                ((BBF) this.A01).C26(a7b);
                return;
            case 20:
                ((BBG) this.A02).Bss(a7b);
                return;
            case 21:
                ((C190769lU) this.A02).A00(a7b);
                return;
            case 22:
                BrazilPayBloksActivity.A0u((C194839sN) this.A02, (BrazilPayBloksActivity) this.A01);
                return;
        }
        r0 = (C33661jB) this.A02;
        r0.C3L(a7b);
    }

    public void A05(A7B a7b) {
        C33661jB r0;
        switch (this.A00) {
            case 0:
                AnonymousClass8BX.A1C(((C31061ex) this.A01).A0D, a7b, "tosv3 onResponseError: ", AnonymousClass000.A10());
                break;
            case 3:
                ((C191329mQ) this.A02).A00();
                return;
            case 4:
                return;
            case 5:
                AnonymousClass8BX.A1C(((C198709ym) this.A01).A07, a7b, "BrazilAddCredentialAction : onResponseError: ", AnonymousClass000.A10());
                AnonymousClass91q.A0q(((C184839bb) this.A02).A00, (Map) null, a7b.A00);
                return;
            case 6:
                BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = ((AnonymousClass9YK) this.A02).A00;
                brazilPaymentTransactionDetailActivity.CEx();
                C108965cb.A18(brazilPaymentTransactionDetailActivity, 2131887913, 2131893867);
                return;
            case 7:
                C17900vP.A0Y(a7b, "PAY: BrazilFetchNetworkInfoAction/onResponseError: ", AnonymousClass000.A10());
                ((C190759lT) this.A02).A00((C188059go) null);
                return;
            case 8:
                C17900vP.A0Y(a7b, "PAY: BrazilGetVerificationMethods onResponseError: ", AnonymousClass000.A10());
                ((BB9) this.A02).C3s(a7b, (List) null);
                return;
            case 9:
                C17900vP.A0Y(a7b, "PAY: BrazilFetchEloChallengeIdAction onResponseError: ", AnonymousClass000.A10());
                ((AnonymousClass9Y8) this.A02).A00.A03(a7b, (String) null);
                return;
            case 10:
                C17900vP.A0Y(a7b, "PAY: BrazilSubmitVerificationMethodAction onResponseError: ", AnonymousClass000.A10());
                ((C190739lR) this.A02).A00(a7b, (AnonymousClass8pT) null);
                return;
            case 11:
                StringBuilder A0K = C18070vi.A0K(a7b);
                A0K.append("PAY: MFAAction/onResponseError - ");
                A0K.append("CREATE_AUTH_TICKET_BASED_FACTOR");
                C17900vP.A0X(a7b, ": ", A0K);
                ((C184719bP) this.A01).A00.Bst(new C199169zY(a7b));
                return;
            case 12:
                BD4 A0U = AnonymousClass8BT.A0U(((C192839p4) this.A01).A07);
                if (A0U != null) {
                    A0U.reset();
                }
                r0 = (C33661jB) this.A02;
                if (r0 == null) {
                    return;
                }
                break;
            case 13:
                ((C191419mZ) this.A02).A00(a7b);
                return;
            case 15:
                ((C190179kV) this.A02).A00(a7b);
                return;
            case 16:
                C184749bS r3 = (C184749bS) this.A02;
                AnonymousClass8BX.A1D(r3.A01.A05, a7b, "performNameCheck onError: ", AnonymousClass000.A10());
                r3.A00.Bss(a7b);
                return;
            case 17:
                AnonymousClass8BX.A1C(((C187749gJ) this.A01).A05, a7b, "performDobComplianceCheck onResponseError: ", AnonymousClass000.A10());
                C184759bT r32 = (C184759bT) this.A02;
                AnonymousClass8BX.A1D(r32.A01.A05, a7b, "performDobComplianceCheck onError: ", AnonymousClass000.A10());
                r32.A00.Bss(a7b);
                return;
            case 18:
                C17900vP.A0X(a7b, "getOfferDetails: failed with error: ", AnonymousClass000.A10());
                AnonymousClass9YA r1 = ((C186129dh) this.A02).A01;
                if (r1 != null) {
                    Log.e("PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed");
                    r1.A00.A00.Bsl();
                    return;
                }
                return;
            case 19:
                C18070vi.A0d(a7b, 0);
                AnonymousClass1QE r2 = ((C191619mt) this.A02).A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("providerKey: onResponseError ");
                r2.A05(C17880vN.A0t(A10, a7b.A00));
                ((BBF) this.A01).C26(a7b);
                return;
            case 20:
                ((BBG) this.A02).Bss(a7b);
                return;
            case 21:
                A04(a7b);
                return;
            case 22:
                BrazilPayBloksActivity.A0u((C194839sN) this.A02, (BrazilPayBloksActivity) this.A01);
                return;
        }
        r0 = (C33661jB) this.A02;
        r0.C3X(a7b);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9dd] */
    /* JADX WARNING: type inference failed for: r1v21, types: [X.9go, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0777, code lost:
        com.whatsapp.util.Log.e("Pay: requestDyiReport -> error parsing the response");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x077c, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0788  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x078c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C29621ca r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            r4 = r16
            switch(r0) {
                case 0: goto L_0x073a;
                case 1: goto L_0x072a;
                case 2: goto L_0x0241;
                case 3: goto L_0x06db;
                case 4: goto L_0x0007;
                case 5: goto L_0x0629;
                case 6: goto L_0x0007;
                case 7: goto L_0x054b;
                case 8: goto L_0x019e;
                case 9: goto L_0x0524;
                case 10: goto L_0x04d9;
                case 11: goto L_0x03ee;
                case 12: goto L_0x0169;
                case 13: goto L_0x0092;
                case 14: goto L_0x0008;
                case 15: goto L_0x0394;
                case 16: goto L_0x0378;
                case 17: goto L_0x035c;
                case 18: goto L_0x000e;
                case 19: goto L_0x02f0;
                case 20: goto L_0x01f1;
                case 21: goto L_0x02dc;
                case 22: goto L_0x0285;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r1 = r15.A02
            X.1jB r1 = (X.C33661jB) r1
            goto L_0x0195
        L_0x000e:
            java.lang.Object r3 = r15.A02
            X.9dh r3 = (X.C186129dh) r3
            java.lang.String r0 = "account"
            X.1ca r1 = r4.A0L(r0)     // Catch:{ 1UI -> 0x074c }
            java.lang.String r0 = "offer_eligibility"
            X.1ca r10 = r1.A0L(r0)     // Catch:{ 1UI -> 0x074c }
            X.1ig r4 = r3.A02     // Catch:{ 1UI -> 0x074c }
            long r11 = r3.A00     // Catch:{ 1UI -> 0x074c }
            X.11P r0 = r4.A02     // Catch:{ Exception -> 0x006e }
            long r13 = X.AnonymousClass11P.A01(r0)     // Catch:{ Exception -> 0x006e }
            X.A03 r9 = new X.A03     // Catch:{ Exception -> 0x006e }
            r9.<init>(r10, r11, r13)     // Catch:{ Exception -> 0x006e }
            java.lang.Object r8 = X.C33351ig.A0H     // Catch:{ Exception -> 0x006e }
            monitor-enter(r8)     // Catch:{ Exception -> 0x006e }
            X.1ih r0 = r4.A06     // Catch:{ all -> 0x006b }
            X.9ys r7 = r0.A01(r11)     // Catch:{ all -> 0x006b }
            if (r7 == 0) goto L_0x004c
            int r0 = r7.A01     // Catch:{ all -> 0x006b }
            if (r0 <= 0) goto L_0x004c
            int r1 = r9.A00     // Catch:{ all -> 0x006b }
            int r0 = r9.A01     // Catch:{ all -> 0x006b }
            int r1 = r1 + r0
            long r5 = (long) r1     // Catch:{ all -> 0x006b }
            long r0 = r7.A05     // Catch:{ all -> 0x006b }
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r2)
            r7.A01 = r0     // Catch:{ all -> 0x006b }
        L_0x004c:
            r4.A01 = r9     // Catch:{ all -> 0x006b }
            X.1QD r1 = r4.A05     // Catch:{ all -> 0x006b }
            java.lang.String r0 = r9.A00()     // Catch:{ all -> 0x006b }
            r1.A0K(r0)     // Catch:{ all -> 0x006b }
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            X.9YA r0 = r3.A01     // Catch:{ Exception -> 0x006e }
            if (r0 == 0) goto L_0x0007
            X.9lP r0 = r0.A00     // Catch:{ Exception -> 0x006e }
            X.BB5 r1 = r0.A00     // Catch:{ Exception -> 0x006e }
            X.1ig r0 = r0.A01     // Catch:{ Exception -> 0x006e }
            X.A0v r0 = r0.A01()     // Catch:{ Exception -> 0x006e }
            r1.C7L(r0)     // Catch:{ Exception -> 0x006e }
            goto L_0x074a
        L_0x006b:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x074c }
            java.lang.String r0 = "processSuccessfulGetClaimStatus: Error while parsing: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ 1UI -> 0x074c }
            r4.A04()     // Catch:{ 1UI -> 0x074c }
            java.lang.String r0 = "PAY: PaymentIncentiveManager/refreshUserClaimInfo/processSuccessfulGetClaimInfo failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1UI -> 0x074c }
            X.9YA r1 = r3.A01     // Catch:{ 1UI -> 0x074c }
            if (r1 == 0) goto L_0x0007
            java.lang.String r0 = "PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1UI -> 0x074c }
            X.9lP r0 = r1.A00     // Catch:{ 1UI -> 0x074c }
            X.BB5 r0 = r0.A00     // Catch:{ 1UI -> 0x074c }
            r0.Bsl()     // Catch:{ 1UI -> 0x074c }
            goto L_0x074b
        L_0x0092:
            java.lang.Object r5 = r15.A02
            X.9mZ r5 = (X.C191419mZ) r5
            X.1ca r2 = X.AnonymousClass8BR.A0j(r4)     // Catch:{ Exception -> 0x0777 }
            X.A7B r0 = X.A7B.A01(r2)     // Catch:{ Exception -> 0x0777 }
            if (r0 != 0) goto L_0x0773
            r1 = 500(0x1f4, float:7.0E-43)
            if (r2 != 0) goto L_0x00a6
            goto L_0x076e
        L_0x00a6:
            java.lang.String r0 = "document"
            X.1ca r8 = r2.A0K(r0)     // Catch:{ Exception -> 0x0777 }
            if (r8 != 0) goto L_0x00b5
            X.A7B r0 = new X.A7B     // Catch:{ Exception -> 0x0777 }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x0777 }
            goto L_0x0773
        L_0x00b5:
            java.lang.String r0 = "creation"
            r6 = 0
            long r3 = r8.A0D(r0, r6)     // Catch:{ Exception -> 0x0777 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            java.lang.String r2 = "expiration"
            long r6 = r8.A0D(r2, r6)     // Catch:{ Exception -> 0x0777 }
            long r0 = r0 * r6
            byte[] r9 = r8.A01     // Catch:{ Exception -> 0x0777 }
            java.lang.String r2 = "DyiViewModel/request-report/on-success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ Exception -> 0x0777 }
            X.96M r2 = r5.A03     // Catch:{ Exception -> 0x0777 }
            X.A5B r6 = r2.A06     // Catch:{ Exception -> 0x0777 }
            java.lang.String r7 = r2.A08     // Catch:{ Exception -> 0x0777 }
            monitor-enter(r6)     // Catch:{ Exception -> 0x0777 }
            java.lang.String r8 = "dyiReportManager/on-report-available"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ all -> 0x076b }
            java.io.File r8 = X.A5B.A01(r6, r7)     // Catch:{ IOException -> 0x0119 }
            X.C17970vW.A0A(r8, r9)     // Catch:{ IOException -> 0x0119 }
            X.9de r8 = X.A5B.A00(r9, r3)     // Catch:{ all -> 0x076b }
            r6.A01 = r8     // Catch:{ all -> 0x076b }
            if (r8 != 0) goto L_0x00ef
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-create-message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x076b }
            goto L_0x011f
        L_0x00ef:
            X.1QD r10 = r6.A07     // Catch:{ all -> 0x076b }
            android.content.SharedPreferences$Editor r11 = X.AnonymousClass8BU.A07(r10)     // Catch:{ all -> 0x076b }
            java.lang.String r8 = "personal"
            boolean r9 = r8.equals(r7)     // Catch:{ all -> 0x076b }
            if (r9 == 0) goto L_0x0107
            java.lang.String r8 = "payment_dyi_report_timestamp"
        L_0x00ff:
            X.C17880vN.A1D(r11, r8, r3)     // Catch:{ all -> 0x076b }
            android.content.SharedPreferences$Editor r4 = X.AnonymousClass8BU.A07(r10)     // Catch:{ all -> 0x076b }
            goto L_0x010a
        L_0x0107:
            java.lang.String r8 = "business_payment_dyi_report_timestamp"
            goto L_0x00ff
        L_0x010a:
            if (r9 == 0) goto L_0x010f
            java.lang.String r3 = "payment_dyi_report_expiration_timestamp"
            goto L_0x0111
        L_0x010f:
            java.lang.String r3 = "business_payment_dyi_report_expiration_timestamp"
        L_0x0111:
            X.C17880vN.A1D(r4, r3, r0)     // Catch:{ all -> 0x076b }
            r0 = 2
            r10.A0F(r0, r7)     // Catch:{ all -> 0x076b }
            goto L_0x011f
        L_0x0119:
            r1 = move-exception
            java.lang.String r0 = "dyiReportManager/on-report-available/cannot-save"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x076b }
        L_0x011f:
            monitor-exit(r6)     // Catch:{ Exception -> 0x0777 }
            X.9de r0 = r6.A03(r7)     // Catch:{ Exception -> 0x0777 }
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "DyiViewModel/request-report/on-error :: invalid report info"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0777 }
            X.1DT r0 = r2.A02     // Catch:{ Exception -> 0x0777 }
            java.lang.Integer r3 = X.AnonymousClass3MY.A0f()     // Catch:{ Exception -> 0x0777 }
            r0.A0E(r3)     // Catch:{ Exception -> 0x0777 }
            X.1DT r2 = r2.A03     // Catch:{ Exception -> 0x0777 }
            r1 = 500(0x1f4, float:7.0E-43)
            X.A7B r0 = new X.A7B     // Catch:{ Exception -> 0x0777 }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x0777 }
            X.0yx r0 = X.AnonymousClass8BR.A0B(r3, r0)     // Catch:{ Exception -> 0x0777 }
            r2.A0E(r0)     // Catch:{ Exception -> 0x0777 }
        L_0x0144:
            int r1 = r5.A00     // Catch:{ Exception -> 0x0777 }
            r0 = 1
            if (r1 != r0) goto L_0x0165
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = r5.A02     // Catch:{ Exception -> 0x0777 }
            if (r0 == 0) goto L_0x0007
            r0.A29()     // Catch:{ Exception -> 0x0777 }
            goto L_0x0761
        L_0x0152:
            X.1DT r1 = r2.A01     // Catch:{ Exception -> 0x0777 }
            X.9de r0 = r6.A03(r7)     // Catch:{ Exception -> 0x0777 }
            r1.A0E(r0)     // Catch:{ Exception -> 0x0777 }
            X.1DT r1 = r2.A02     // Catch:{ Exception -> 0x0777 }
            int r0 = r6.A02(r7)     // Catch:{ Exception -> 0x0777 }
            X.AnonymousClass3MX.A1K(r1, r0)     // Catch:{ Exception -> 0x0777 }
            goto L_0x0144
        L_0x0165:
            if (r1 != 0) goto L_0x0007
            goto L_0x0762
        L_0x0169:
            java.lang.Object r2 = r15.A01
            X.9p4 r2 = (X.C192839p4) r2
            X.1QD r0 = r2.A04
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "has_p2mlite_transactions"
            r4 = 0
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x018f
            X.10I r3 = r2.A08
            X.122 r2 = r2.A02
            r0 = 43
            X.Ajs r1 = new X.Ajs
            r1.<init>((java.lang.Object) r15, (int) r0)
            X.9Ar r0 = new X.9Ar
            r0.<init>(r2, r1)
            X.AnonymousClass3MW.A1T(r0, r3, r4)
        L_0x018f:
            java.lang.Object r1 = r15.A02
            X.1jB r1 = (X.C33661jB) r1
            if (r1 == 0) goto L_0x0007
        L_0x0195:
            X.8zd r0 = new X.8zd
            r0.<init>()
            r1.C3Y(r0)
            return
        L_0x019e:
            X.1ca r1 = X.AnonymousClass8BR.A0j(r4)
            if (r1 == 0) goto L_0x0007
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.lang.String r0 = "verify-method-list"
            X.1ca r5 = r1.A0K(r0)
            java.lang.String r0 = "card"
            X.1ca r1 = r1.A0K(r0)
            r3 = 0
            if (r1 == 0) goto L_0x01d7
            X.8pT r2 = new X.8pT
            r2.<init>()
            java.lang.Object r0 = r15.A01
            X.9nO r0 = (X.C191909nO) r0
            X.1KI r0 = r0.A00
            r2.A05(r0, r1, r3)
            X.AEs r1 = r2.A08()
            X.8pK r1 = (X.AnonymousClass8pK) r1
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r0 = r15.A02
            X.BB9 r0 = (X.BB9) r0
            r0.Bo0(r1)
            return
        L_0x01d7:
            if (r5 == 0) goto L_0x0007
            X.1ca[] r0 = r5.A02
            if (r0 == 0) goto L_0x077d
            int r2 = r0.length
            if (r2 <= 0) goto L_0x077d
        L_0x01e0:
            X.1ca r1 = r5.A0J(r3)
            X.Aib r0 = new X.Aib
            r0.<init>(r1)
            r4.add(r0)
            int r3 = r3 + 1
            if (r3 >= r2) goto L_0x077d
            goto L_0x01e0
        L_0x01f1:
            java.lang.String r0 = "account"
            X.1ca r3 = r4.A0L(r0)     // Catch:{ 1UI -> 0x0229 }
            X.A7B r1 = X.A7B.A01(r3)     // Catch:{ 1UI -> 0x0229 }
            if (r1 == 0) goto L_0x0202
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x0229 }
            X.BBG r0 = (X.BBG) r0
            goto L_0x0217
        L_0x0202:
            java.lang.String r0 = "webview_url"
            r1 = 0
            java.lang.String r2 = r3.A0Q(r0, r1)     // Catch:{ 1UI -> 0x0229 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 1UI -> 0x0229 }
            if (r0 == 0) goto L_0x021b
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x0229 }
            X.BBG r0 = (X.BBG) r0     // Catch:{ 1UI -> 0x0229 }
            X.A7B r1 = X.A7B.A00()     // Catch:{ 1UI -> 0x0229 }
        L_0x0217:
            r0.Bss(r1)     // Catch:{ 1UI -> 0x0229 }
            return
        L_0x021b:
            java.lang.String r0 = "callback_url"
            java.lang.String r1 = r3.A0Q(r0, r1)     // Catch:{ 1UI -> 0x0229 }
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x0229 }
            X.BBG r0 = (X.BBG) r0     // Catch:{ 1UI -> 0x0229 }
            r0.C7S(r2, r1)     // Catch:{ 1UI -> 0x0229 }
            return
        L_0x0229:
            r2 = move-exception
            java.lang.Object r0 = r15.A01
            X.9mT r0 = (X.C191359mT) r0
            X.1QE r1 = r0.A00
            java.lang.String r0 = "PAY: PaymentStepUpWebviewAction : invalid response"
            r1.A0A(r0, r2)
            java.lang.Object r1 = r15.A02
            X.BBG r1 = (X.BBG) r1
            X.A7B r0 = X.A7B.A00()
            r1.Bss(r0)
            return
        L_0x0241:
            java.lang.String r0 = "account"
            X.1ca r0 = r4.A0L(r0)     // Catch:{ 1UI -> 0x0266 }
            X.A7B r1 = X.A7B.A01(r0)     // Catch:{ 1UI -> 0x0266 }
            if (r1 == 0) goto L_0x0255
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x0266 }
            X.1jB r0 = (X.C33661jB) r0     // Catch:{ 1UI -> 0x0266 }
            r0.C3X(r1)     // Catch:{ 1UI -> 0x0266 }
            return
        L_0x0255:
            java.lang.Object r1 = r15.A02
            r0 = 2
            X.ARF r2 = new X.ARF
            r2.<init>(r1, r0)
            java.lang.Object r1 = r15.A01
            X.1ex r1 = (X.C31061ex) r1
            r0 = 1
            r1.A08(r2, r4, r0)
            return
        L_0x0266:
            r3 = move-exception
            java.lang.Object r0 = r15.A01
            X.1ex r0 = (X.C31061ex) r0
            X.1QE r2 = r0.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "removePaymentMethod/onResponseSuccess/corrupt stream exception: "
            X.AnonymousClass8BX.A1C(r2, r3, r0, r1)
            java.lang.Object r2 = r15.A02
            X.1jB r2 = (X.C33661jB) r2
            r1 = 500(0x1f4, float:7.0E-43)
            X.A7B r0 = new X.A7B
            r0.<init>((int) r1)
            r2.C3X(r0)
            return
        L_0x0285:
            java.lang.String r3 = "1"
            java.util.HashMap r2 = X.C17880vN.A11()
            java.lang.String r0 = "account"
            X.1ca r1 = r4.A0L(r0)     // Catch:{ 1UI -> 0x02c4 }
            X.A7B r0 = X.A7B.A01(r1)     // Catch:{ 1UI -> 0x02c4 }
            if (r0 == 0) goto L_0x02a3
            java.lang.Object r1 = r15.A01     // Catch:{ 1UI -> 0x02c4 }
            com.whatsapp.payments.ui.BrazilPayBloksActivity r1 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r1     // Catch:{ 1UI -> 0x02c4 }
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x02c4 }
            X.9sN r0 = (X.C194839sN) r0     // Catch:{ 1UI -> 0x02c4 }
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0u(r0, r1)     // Catch:{ 1UI -> 0x02c4 }
            return
        L_0x02a3:
            java.lang.String r0 = "result"
            X.1ca r1 = r1.A0L(r0)     // Catch:{ 1UI -> 0x02c4 }
            java.lang.String r0 = "upload_status"
            java.lang.String r0 = X.C29621ca.A02(r1, r0)     // Catch:{ 1UI -> 0x02c4 }
            boolean r0 = r3.equals(r0)     // Catch:{ 1UI -> 0x02c4 }
            if (r0 == 0) goto L_0x02d0
            java.lang.String r0 = "is_doc_upload_completed"
            r2.put(r0, r3)     // Catch:{ 1UI -> 0x02c4 }
            java.lang.Object r1 = r15.A02     // Catch:{ 1UI -> 0x02c4 }
            X.9sN r1 = (X.C194839sN) r1     // Catch:{ 1UI -> 0x02c4 }
            java.lang.String r0 = "on_success"
            r1.A01(r0, r2)     // Catch:{ 1UI -> 0x02c4 }
            return
        L_0x02c4:
            r2 = move-exception
            java.lang.Object r0 = r15.A01
            X.91q r0 = (X.AnonymousClass91q) r0
            X.1QE r1 = r0.A0K
            java.lang.String r0 = "PAY: performAnswerDocUploadStepUp : invalid response"
            r1.A0A(r0, r2)
        L_0x02d0:
            java.lang.Object r1 = r15.A01
            com.whatsapp.payments.ui.BrazilPayBloksActivity r1 = (com.whatsapp.payments.ui.BrazilPayBloksActivity) r1
            java.lang.Object r0 = r15.A02
            X.9sN r0 = (X.C194839sN) r0
            com.whatsapp.payments.ui.BrazilPayBloksActivity.A0u(r0, r1)
            return
        L_0x02dc:
            X.1ca r0 = X.AnonymousClass8BR.A0j(r4)
            if (r0 == 0) goto L_0x02ee
            X.A7B r1 = X.A7B.A01(r0)
        L_0x02e6:
            java.lang.Object r0 = r15.A02
            X.9lU r0 = (X.C190769lU) r0
            r0.A00(r1)
            return
        L_0x02ee:
            r1 = 0
            goto L_0x02e6
        L_0x02f0:
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = "account"
            X.1ca r1 = r4.A0L(r0)     // Catch:{ 1UI -> 0x0341 }
            java.lang.String r0 = "key"
            X.1ca r0 = r1.A0L(r0)     // Catch:{ 1UI -> 0x0341 }
            java.lang.Object r4 = r15.A02     // Catch:{ 1UI -> 0x0341 }
            X.9mt r4 = (X.C191619mt) r4     // Catch:{ 1UI -> 0x0341 }
            X.AZ2 r3 = X.A54.A00(r0)     // Catch:{ 1UI -> 0x0341 }
            X.1QE r2 = r4.A01     // Catch:{ 1UI -> 0x0341 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 1UI -> 0x0341 }
            java.lang.String r0 = "providerKey/onSuccess: isValidSignature="
            r1.append(r0)     // Catch:{ 1UI -> 0x0341 }
            boolean r0 = X.AnonymousClass000.A1W(r3)
            java.lang.String r0 = X.AnonymousClass3MY.A0r(r1, r0)     // Catch:{ 1UI -> 0x0341 }
            r2.A07(r0)     // Catch:{ 1UI -> 0x0341 }
            if (r3 == 0) goto L_0x032d
            X.A54 r0 = r4.A00     // Catch:{ 1UI -> 0x0341 }
            r0.A03(r3)     // Catch:{ 1UI -> 0x0341 }
            java.lang.Object r0 = r15.A01     // Catch:{ 1UI -> 0x0341 }
            X.BBF r0 = (X.BBF) r0     // Catch:{ 1UI -> 0x0341 }
            r0.C27(r3)     // Catch:{ 1UI -> 0x0341 }
            return
        L_0x032d:
            java.lang.String r0 = "providerKey/onSuccess signature is not valid"
            r2.A05(r0)     // Catch:{ 1UI -> 0x0341 }
            java.lang.Object r2 = r15.A01     // Catch:{ 1UI -> 0x0341 }
            X.BBF r2 = (X.BBF) r2     // Catch:{ 1UI -> 0x0341 }
            r1 = 8
            X.A7B r0 = new X.A7B     // Catch:{ 1UI -> 0x0341 }
            r0.<init>((int) r1)     // Catch:{ 1UI -> 0x0341 }
            r2.C26(r0)     // Catch:{ 1UI -> 0x0341 }
            return
        L_0x0341:
            r2 = move-exception
            java.lang.Object r0 = r15.A02
            X.9mt r0 = (X.C191619mt) r0
            X.1QE r1 = r0.A01
            java.lang.String r0 = "providerKey/parseResponse failed: "
            r1.A0A(r0, r2)
            java.lang.Object r2 = r15.A01
            X.BBF r2 = (X.BBF) r2
            r1 = 9
            X.A7B r0 = new X.A7B
            r0.<init>((int) r1)
            r2.C26(r0)
            return
        L_0x035c:
            java.lang.Object r4 = r15.A02
            X.9bT r4 = (X.C184759bT) r4
            r3 = 1
            X.A2C r0 = r4.A01
            X.1QE r2 = r0.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "performDobComplianceCheck onDobCheckComplete, eligible: "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r3)
            r2.A06(r0)
            X.BBJ r0 = r4.A00
            r0.Bs2()
            return
        L_0x0378:
            java.lang.Object r4 = r15.A02
            X.9bS r4 = (X.C184749bS) r4
            r3 = 1
            X.A2C r0 = r4.A01
            X.1QE r2 = r0.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "performNameCheck onNameCheckComplete, eligible: "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r3)
            r2.A06(r0)
            X.BBK r0 = r4.A00
            r0.Byv()
            return
        L_0x0394:
            if (r16 == 0) goto L_0x03e2
            r0 = 0
            X.1ca r1 = r4.A0J(r0)
            if (r1 == 0) goto L_0x03e2
            java.lang.String r0 = "account-eligibility-state"
            java.lang.String r5 = X.C29621ca.A02(r1, r0)
            if (r5 == 0) goto L_0x03e2
            java.lang.Object r4 = r15.A02
            X.9kV r4 = (X.C190179kV) r4
            X.A2C r3 = r4.A01
            X.1QE r2 = r3.A05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "getComplianceStatus onStatus: "
            r1.append(r0)
            X.AnonymousClass8BV.A1E(r2, r5, r1)
            int r0 = r5.hashCode()
            switch(r0) {
                case -2093369835: goto L_0x03d2;
                case -1753873386: goto L_0x03cf;
                case 35394935: goto L_0x03cc;
                case 696544716: goto L_0x03c9;
                case 1383663147: goto L_0x03c6;
                default: goto L_0x03c0;
            }
        L_0x03c0:
            java.lang.String r0 = "Compliance state unknown"
            r2.A06(r0)
            return
        L_0x03c6:
            java.lang.String r0 = "COMPLETED"
            goto L_0x03d4
        L_0x03c9:
            java.lang.String r0 = "BLOCKED"
            goto L_0x03d4
        L_0x03cc:
            java.lang.String r0 = "PENDING"
            goto L_0x03d4
        L_0x03cf:
            java.lang.String r0 = "NEEDS_MORE_INFO"
            goto L_0x03d4
        L_0x03d2:
            java.lang.String r0 = "UNSUPPORTED"
        L_0x03d4:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x03c0
            r3.A00 = r5
            X.BBI r0 = r4.A00
            r0.BpT(r5)
            return
        L_0x03e2:
            java.lang.Object r1 = r15.A02
            X.9kV r1 = (X.C190179kV) r1
            X.A7B r0 = X.A7B.A00()
            r1.A00(r0)
            return
        L_0x03ee:
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            java.lang.Object r5 = r15.A01
            X.9bP r5 = (X.C184719bP) r5
            r7 = 1
            X.C18070vi.A0d(r5, r7)
            X.1ca r1 = X.AnonymousClass8BR.A0j(r4)
            r8 = 9
            r6 = 0
            if (r1 == 0) goto L_0x046e
            X.A7B r0 = X.A7B.A01(r1)     // Catch:{ 1UI -> 0x045e }
            if (r0 == 0) goto L_0x040e
            X.0yx r1 = X.AnonymousClass8BR.A0B(r6, r0)     // Catch:{ 1UI -> 0x045e }
            goto L_0x0477
        L_0x040e:
            java.lang.String r0 = "auth-ticket"
            X.1ca r1 = r1.A0K(r0)     // Catch:{ 1UI -> 0x045e }
            if (r1 != 0) goto L_0x0420
            X.A7B r0 = new X.A7B     // Catch:{ 1UI -> 0x045e }
            r0.<init>((int) r8)     // Catch:{ 1UI -> 0x045e }
            X.0yx r1 = X.AnonymousClass8BR.A0B(r6, r0)     // Catch:{ 1UI -> 0x045e }
            goto L_0x0477
        L_0x0420:
            java.lang.String r0 = "id"
            r1.A0P(r0)     // Catch:{ 1UI -> 0x045e }
            java.lang.String r0 = "issued-at"
            r1.A0C(r0)     // Catch:{ 1UI -> 0x045e }
            java.lang.String r11 = "ttl"
            r1.A0C(r11)     // Catch:{ 1UI -> 0x045e }
            X.9Y9 r10 = new X.9Y9     // Catch:{ 1UI -> 0x045e }
            r10.<init>()     // Catch:{ 1UI -> 0x045e }
            java.lang.String r0 = "capabilities"
            X.1ca r0 = r1.A0L(r0)     // Catch:{ 1UI -> 0x045e }
            X.1ca[] r9 = r0.A02     // Catch:{ 1UI -> 0x045e }
            if (r9 == 0) goto L_0x0459
            int r4 = r9.length     // Catch:{ 1UI -> 0x045e }
            r2 = 0
        L_0x0440:
            if (r2 >= r4) goto L_0x0459
            r1 = r9[r2]     // Catch:{ 1UI -> 0x045e }
            java.lang.String r0 = "name"
            r1.A0P(r0)     // Catch:{ 1UI -> 0x045e }
            r1.A0C(r11)     // Catch:{ 1UI -> 0x045e }
            X.9R6 r1 = new X.9R6     // Catch:{ 1UI -> 0x045e }
            r1.<init>()     // Catch:{ 1UI -> 0x045e }
            java.util.List r0 = r10.A00     // Catch:{ 1UI -> 0x045e }
            r0.add(r1)     // Catch:{ 1UI -> 0x045e }
            int r2 = r2 + 1
            goto L_0x0440
        L_0x0459:
            X.0yx r1 = X.AnonymousClass8BR.A0B(r10, r6)     // Catch:{ 1UI -> 0x045e }
            goto L_0x0477
        L_0x045e:
            r1 = move-exception
            java.lang.String r0 = "PAY: parseResult corruptStreamException"
            com.whatsapp.util.Log.e(r0, r1)
            X.A7B r0 = new X.A7B
            r0.<init>((int) r8)
            X.0yx r1 = X.AnonymousClass8BR.A0B(r6, r0)
            goto L_0x0477
        L_0x046e:
            X.A7B r0 = new X.A7B
            r0.<init>((int) r8)
            X.0yx r1 = X.AnonymousClass8BR.A0B(r6, r0)
        L_0x0477:
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x04c7
            X.9mU r0 = r5.A01     // Catch:{ JSONException -> 0x04b2 }
            X.9bR r0 = r0.A02     // Catch:{ JSONException -> 0x04b2 }
            java.lang.String r6 = "td"
            X.1QD r4 = r0.A00     // Catch:{ JSONException -> 0x04ab }
            java.lang.String r1 = r4.A06()     // Catch:{ JSONException -> 0x04ab }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x04ab }
            if (r0 != 0) goto L_0x04a0
            org.json.JSONObject r2 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x04ab }
            org.json.JSONObject r1 = X.AnonymousClass8BW.A0w(r6, r2)     // Catch:{ JSONException -> 0x04ab }
            java.lang.String r0 = "td_is_committed"
            r1.put(r0, r7)     // Catch:{ JSONException -> 0x04ab }
            r2.put(r6, r1)     // Catch:{ JSONException -> 0x04ab }
            X.AnonymousClass8BT.A1G(r4, r2)     // Catch:{ JSONException -> 0x04ab }
        L_0x04a0:
            X.BBH r1 = r5.A00     // Catch:{ JSONException -> 0x04b2 }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ JSONException -> 0x04b2 }
            r0.<init>()     // Catch:{ JSONException -> 0x04b2 }
            r1.C3u()     // Catch:{ JSONException -> 0x04b2 }
            return
        L_0x04ab:
            r1 = move-exception
            java.lang.String r0 = "PAY: TrustedDeviceKeyStore markCommitted failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x04b2 }
            throw r1     // Catch:{ JSONException -> 0x04b2 }
        L_0x04b2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: MultiFactorAuthFactors/createTrustedDevice/error while marking trusted device as commited: "
            X.C17900vP.A0X(r2, r0, r1)
            X.BBH r1 = r5.A00
            X.9zY r0 = new X.9zY
            r0.<init>((int) r3)
            r1.Bst(r0)
            return
        L_0x04c7:
            X.BBH r2 = r5.A00
            java.lang.Object r1 = r1.A01
            X.C17960vV.A07(r1)
            X.A7B r1 = (X.A7B) r1
            X.9zY r0 = new X.9zY
            r0.<init>((X.A7B) r1)
            r2.Bst(r0)
            return
        L_0x04d9:
            X.1ca r5 = X.AnonymousClass8BR.A0j(r4)
            r4 = 0
            if (r5 == 0) goto L_0x0518
            java.lang.String r0 = "card"
            X.1ca r3 = r5.A0K(r0)
            if (r3 == 0) goto L_0x0516
            X.8pT r2 = new X.8pT
            r2.<init>()
            java.lang.Object r0 = r15.A01
            X.9hL r0 = (X.C188389hL) r0
            X.1KI r1 = r0.A02
            r0 = 0
            r2.A05(r1, r3, r0)
        L_0x04f7:
            java.lang.String r0 = "elo"
            X.1ca r1 = r5.A0K(r0)
            if (r1 == 0) goto L_0x050e
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r1.A0Q(r0, r4)
            java.lang.Object r0 = r15.A01
            X.9hL r0 = (X.C188389hL) r0
            X.9nS r0 = r0.A05
            r0.A00(r1)
        L_0x050e:
            java.lang.Object r0 = r15.A02
            X.9lR r0 = (X.C190739lR) r0
            r0.A00(r4, r2)
            return
        L_0x0516:
            r2 = r4
            goto L_0x04f7
        L_0x0518:
            java.lang.Object r1 = r15.A02
            X.9lR r1 = (X.C190739lR) r1
            X.A7B r0 = X.A7B.A00()
            r1.A00(r0, r4)
            return
        L_0x0524:
            X.1ca r1 = X.AnonymousClass8BR.A0j(r4)
            r2 = 0
            if (r1 == 0) goto L_0x053d
            java.lang.String r0 = "challenge_id"
            java.lang.String r1 = r1.A0Q(r0, r2)
            if (r1 == 0) goto L_0x053d
            java.lang.Object r0 = r15.A02
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            X.9to r0 = r0.A00
            r0.A03(r2, r1)
            return
        L_0x053d:
            java.lang.Object r0 = r15.A02
            X.9Y8 r0 = (X.AnonymousClass9Y8) r0
            X.A7B r1 = X.A7B.A00()
            X.9to r0 = r0.A00
            r0.A03(r1, r2)
            return
        L_0x054b:
            java.lang.String r5 = "registration_status"
            X.1ca r4 = X.AnonymousClass8BR.A0j(r4)
            r2 = 0
            if (r4 == 0) goto L_0x061c
            java.lang.String r0 = "network_type"
            java.lang.String r1 = r4.A0Q(r0, r2)
            java.lang.String r0 = "ELO"
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L_0x0603
            java.lang.String r0 = "elo"
            X.1ca r3 = r4.A0L(r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r1 = r3.A0Q(r5, r2)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r0)     // Catch:{ 1UI -> 0x05f4 }
            if (r0 == 0) goto L_0x05de
            java.lang.String r0 = "key"
            X.1ca r4 = r4.A0L(r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.Object r1 = r15.A01     // Catch:{ 1UI -> 0x05f4 }
            X.9hI r1 = (X.C188359hI) r1     // Catch:{ 1UI -> 0x05f4 }
            byte[] r0 = X.A54.A04     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "key-type"
            java.lang.String r10 = r4.A0P(r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "provider"
            java.lang.String r8 = r4.A0P(r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "key-version"
            java.lang.String r11 = r4.A0P(r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "key-scope"
            java.lang.String r9 = r4.A0P(r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "expiry-ts"
            r12 = 0
            java.lang.String r6 = r4.A0Q(r0, r2)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r10)     // Catch:{ 1UI -> 0x05f4 }
            r7 = 0
            if (r0 != 0) goto L_0x05b0
            java.lang.String r0 = "data"
            X.1ca r0 = r4.A0L(r0)     // Catch:{ 1UI -> 0x05f4 }
            byte[] r12 = r0.A01     // Catch:{ 1UI -> 0x05f4 }
        L_0x05b0:
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 1UI -> 0x05f4 }
            if (r0 != 0) goto L_0x05be
            long r6 = X.C20099A7c.A03(r6)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.Long r7 = java.lang.Long.valueOf(r6)     // Catch:{ 1UI -> 0x05f4 }
        L_0x05be:
            X.AZ2 r6 = new X.AZ2     // Catch:{ 1UI -> 0x05f4 }
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch:{ 1UI -> 0x05f4 }
            X.A54 r0 = r1.A06     // Catch:{ 1UI -> 0x05f4 }
            r0.A03(r6)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r1 = r3.A0Q(r5, r2)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "wallet_id"
            java.lang.String r0 = r3.A0Q(r0, r2)     // Catch:{ 1UI -> 0x05f4 }
            X.9go r1 = X.C188059go.A00(r1, r2, r0)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x05f4 }
            X.9lT r0 = (X.C190759lT) r0     // Catch:{ 1UI -> 0x05f4 }
            r0.A00(r1)     // Catch:{ 1UI -> 0x05f4 }
            return
        L_0x05de:
            java.lang.String r1 = r3.A0Q(r5, r2)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.String r0 = "challenge_id"
            java.lang.String r0 = r3.A0Q(r0, r2)     // Catch:{ 1UI -> 0x05f4 }
            X.9go r1 = X.C188059go.A00(r1, r0, r2)     // Catch:{ 1UI -> 0x05f4 }
            java.lang.Object r0 = r15.A02     // Catch:{ 1UI -> 0x05f4 }
            X.9lT r0 = (X.C190759lT) r0     // Catch:{ 1UI -> 0x05f4 }
            r0.A00(r1)     // Catch:{ 1UI -> 0x05f4 }
            return
        L_0x05f4:
            java.lang.Object r3 = r15.A02
            X.9lT r3 = (X.C190759lT) r3
            r1 = 9
            X.A7B r0 = new X.A7B
            r0.<init>((int) r1)
            r3.A00(r2)
            return
        L_0x0603:
            int r0 = X.C20085A6m.A01(r1)
            X.9go r1 = new X.9go
            r1.<init>()
            r1.A00 = r0
            r1.A04 = r2
            r1.A02 = r2
            r1.A06 = r2
            java.lang.Object r0 = r15.A02
            X.9lT r0 = (X.C190759lT) r0
            r0.A00(r1)
            return
        L_0x061c:
            java.lang.Object r1 = r15.A02
            X.9lT r1 = (X.C190759lT) r1
            X.A7B r0 = new X.A7B
            r0.<init>()
            r1.A00(r2)
            return
        L_0x0629:
            java.lang.Object r8 = r15.A01
            X.9ym r8 = (X.C198709ym) r8
            X.1QE r1 = r8.A07
            java.lang.String r0 = "BrazilAddCredentialAction : onResponseSuccess received"
            r1.A05(r0)
            X.1ca r1 = X.AnonymousClass8BR.A0j(r4)
            if (r1 == 0) goto L_0x06ca
            java.lang.String r0 = "callback_url"
            java.lang.String r5 = X.C29621ca.A02(r1, r0)
            java.lang.String r0 = "credential"
            X.1ca r3 = r1.A0K(r0)
            if (r3 == 0) goto L_0x06ca
            java.lang.String r0 = "card"
            X.1ca r1 = r3.A0K(r0)
            if (r1 == 0) goto L_0x06ca
            X.8pT r2 = new X.8pT
            r2.<init>()
            X.1KI r0 = r8.A02
            r7 = 0
            r2.A05(r0, r1, r7)
            X.AEs r4 = r2.A08()
            X.8pK r4 = (X.AnonymousClass8pK) r4
            X.A4g r1 = r8.A08
            r0 = 0
            X.C20037A4g.A01(r0, r4, r1)
            boolean r0 = r2.A0a
            if (r0 == 0) goto L_0x067e
            X.1QS r0 = r8.A05
            X.A5I r3 = r0.A01()
            java.lang.Object r0 = r15.A02
            X.9bb r0 = (X.C184839bb) r0
            X.ARH r2 = new X.ARH
            r2.<init>(r4, r0, r5, r7)
        L_0x067a:
            r3.A03(r2, r4)
            return
        L_0x067e:
            boolean r0 = r2.A07
            if (r0 != 0) goto L_0x06a6
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.lang.String r0 = "verify-method-list"
            X.1ca r3 = r3.A0K(r0)
            if (r3 == 0) goto L_0x06b7
            X.1ca[] r0 = r3.A02
            if (r0 == 0) goto L_0x06b7
            int r2 = r0.length
            if (r2 <= 0) goto L_0x06b7
        L_0x0695:
            X.1ca r1 = r3.A0J(r7)
            X.Aib r0 = new X.Aib
            r0.<init>(r1)
            r6.add(r0)
            int r7 = r7 + 1
            if (r7 >= r2) goto L_0x06b7
            goto L_0x0695
        L_0x06a6:
            X.1QS r0 = r8.A05
            X.A5I r3 = r0.A01()
            java.lang.Object r1 = r15.A02
            X.9bb r1 = (X.C184839bb) r1
            r0 = 1
            X.ARH r2 = new X.ARH
            r2.<init>(r4, r1, r5, r0)
            goto L_0x067a
        L_0x06b7:
            X.1QS r0 = r8.A05
            X.A5I r2 = r0.A01()
            java.lang.Object r1 = r15.A02
            X.9bb r1 = (X.C184839bb) r1
            X.ARJ r0 = new X.ARJ
            r0.<init>(r4, r1, r5, r6)
            r2.A03(r0, r4)
            return
        L_0x06ca:
            java.lang.Object r1 = r15.A02
            X.9bb r1 = (X.C184839bb) r1
            X.A7B r0 = X.A7B.A00()
            int r2 = r0.A00
            X.9sN r1 = r1.A00
            r0 = 0
            X.AnonymousClass91q.A0q(r1, r0, r2)
            return
        L_0x06db:
            X.1ca r1 = X.AnonymousClass8BR.A0j(r4)
            if (r1 == 0) goto L_0x0722
            java.lang.String r0 = "cancel-status"
            java.lang.String r1 = X.C29621ca.A02(r1, r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0722
            java.lang.Object r3 = r15.A02
            X.9mQ r3 = (X.C191329mQ) r3
            X.A6R r1 = r3.A03
            X.10I r2 = r1.A07
            X.11P r4 = r1.A01
            X.1Q2 r5 = r1.A02
            X.1QS r10 = r1.A05
            X.1PP r11 = r1.A06
            X.00H r0 = r1.A08
            X.2lL r6 = X.AnonymousClass8BR.A0N(r0)
            X.1ex r9 = r1.A04
            X.AW0 r7 = r3.A01
            com.whatsapp.jid.UserJid r8 = r3.A02
            X.B8b r1 = r3.A04
            r1.getClass()
            r0 = 35
            X.Ajs r12 = new X.Ajs
            r12.<init>((java.lang.Object) r1, (int) r0)
            r13 = 18
            X.2Pg r3 = new X.2Pg
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.C17890vO.A0u(r3, r2)
            return
        L_0x0722:
            java.lang.Object r0 = r15.A02
            X.9mQ r0 = (X.C191329mQ) r0
            r0.A00()
            return
        L_0x072a:
            java.lang.Object r0 = r15.A02
            r2 = 1
            X.ARF r1 = new X.ARF
            r1.<init>(r0, r2)
            java.lang.Object r0 = r15.A01
            X.1ex r0 = (X.C31061ex) r0
            r0.A08(r1, r4, r2)
            return
        L_0x073a:
            X.9dd r1 = new X.9dd
            r1.<init>()
            r0 = 1
            r1.A02 = r0
            java.lang.Object r0 = r15.A02
            X.1jB r0 = (X.C33661jB) r0
            r0.C3Y(r1)
            return
        L_0x074a:
            return
        L_0x074b:
            return
        L_0x074c:
            r2 = move-exception
            X.9YA r1 = r3.A01
            if (r1 == 0) goto L_0x075d
            java.lang.String r0 = "PAY: PaymentIncentiveManager/syncIncentiveData/refreshUserClaimInfo failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.9lP r0 = r1.A00
            X.BB5 r0 = r0.A00
            r0.Bsl()
        L_0x075d:
            r2.printStackTrace()
            return
        L_0x0761:
            return
        L_0x0762:
            X.1FY r0 = r5.A01     // Catch:{ Exception -> 0x0777 }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x0777 }
            r0.CEx()     // Catch:{ Exception -> 0x0777 }
            return
        L_0x076b:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ Exception -> 0x0777 }
            throw r0     // Catch:{ Exception -> 0x0777 }
        L_0x076e:
            X.A7B r0 = new X.A7B     // Catch:{ Exception -> 0x0777 }
            r0.<init>((int) r1)     // Catch:{ Exception -> 0x0777 }
        L_0x0773:
            r5.A00(r0)     // Catch:{ Exception -> 0x0777 }
            return
        L_0x0777:
            java.lang.String r0 = "Pay: requestDyiReport -> error parsing the response"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x077d:
            boolean r0 = r4.isEmpty()
            r2 = 0
            java.lang.Object r1 = r15.A02
            X.BB9 r1 = (X.BB9) r1
            if (r0 != 0) goto L_0x078c
            r1.C3s(r2, r4)
            return
        L_0x078c:
            X.A7B r0 = X.A7B.A00()
            r1.C3s(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175428yh.A06(X.1ca):void");
    }
}
