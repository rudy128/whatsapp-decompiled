package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9ue  reason: invalid class name and case insensitive filesystem */
public class C196219ue {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public C22565BDa A05;
    public C1418477e A06;
    public C1418477e A07;
    public C1418477e A08;
    @Deprecated
    public C1418477e A09;
    public C1418477e A0A;
    public C191059lx A0B;
    public AnonymousClass9O4 A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public C180659Nk[] A0P;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: X.9Nk[]} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.9Nk] */
    /* JADX WARNING: type inference failed for: r8v3, types: [X.9lx, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.9O4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0258, code lost:
        r9 = new org.json.JSONArray(r4.optString("instanceTransactions", "[]"));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C196219ue(java.lang.String r19) {
        /*
            r18 = this;
            java.lang.String r17 = "instanceTransactions"
            java.lang.String r16 = "pauseResumeStatusDetails"
            java.lang.String r11 = "pendingMandateUpdate"
            java.lang.String r10 = "mandateInfo"
            java.lang.String r9 = "upiPurposeCode"
            java.lang.String r8 = "mandateName"
            java.lang.String r7 = "mandateNo"
            java.lang.String r6 = "originalMoney"
            r5 = r18
            r5.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x02c0
            org.json.JSONObject r4 = X.C17880vN.A16(r19)     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r0 = "isMandate"
            r1 = 0
            boolean r0 = r4.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x02ba }
            r5.A0M = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r3 = "isRevocable"
            boolean r0 = r4.optBoolean(r3, r1)     // Catch:{ JSONException -> 0x02ba }
            r5.A0N = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r0 = "isShareToPayee"
            boolean r0 = r4.optBoolean(r0, r1)     // Catch:{ JSONException -> 0x02ba }
            r5.A0O = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r2 = "mandateStartTs"
            long r0 = r5.A02     // Catch:{ JSONException -> 0x02ba }
            long r0 = r4.optLong(r2, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A02 = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r2 = "mandateEndTs"
            long r0 = r5.A01     // Catch:{ JSONException -> 0x02ba }
            long r0 = r4.optLong(r2, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A01 = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r1 = "debitTs"
            java.lang.String r0 = r5.A0D     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r0 = r4.optString(r1, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A0D = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r1 = "previousDebitTs"
            java.lang.String r0 = r5.A0I     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r0 = r4.optString(r1, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A0I = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r12 = "nextPaymentTs"
            long r0 = r5.A04     // Catch:{ JSONException -> 0x02ba }
            long r0 = r4.optLong(r12, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A04 = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r12 = "nextPaymentEndTs"
            long r0 = r5.A03     // Catch:{ JSONException -> 0x02ba }
            long r0 = r4.optLong(r12, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A03 = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r1 = "totalRecurringTxnCount"
            int r0 = r5.A00     // Catch:{ JSONException -> 0x02ba }
            int r0 = r4.optInt(r1, r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A00 = r0     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r0 = "mandateAmountRule"
            java.lang.String r1 = r5.A0G     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r1 = r4.optString(r0, r1)     // Catch:{ JSONException -> 0x02ba }
            r5.A0G = r1     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r12 = "moneyStringValue"
            X.7Ik r14 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x02ba }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r15 = "originalAmount"
            X.77e r13 = r5.A09     // Catch:{ JSONException -> 0x02ba }
            if (r13 == 0) goto L_0x0163
            java.lang.Object r13 = r13.A00     // Catch:{ JSONException -> 0x02ba }
        L_0x0098:
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r13 = r4.optString(r15, r13)     // Catch:{ JSONException -> 0x02ba }
            X.77e r13 = X.AnonymousClass8BR.A0Y(r14, r1, r13, r12)     // Catch:{ JSONException -> 0x02ba }
            r5.A09 = r13     // Catch:{ JSONException -> 0x02ba }
            boolean r13 = r4.has(r6)     // Catch:{ JSONException -> 0x02ba }
            if (r13 == 0) goto L_0x00b4
            org.json.JSONObject r6 = r4.optJSONObject(r6)     // Catch:{ JSONException -> 0x02ba }
            X.ARR r6 = X.AnonymousClass8BU.A0I(r6)     // Catch:{ JSONException -> 0x02ba }
            r5.A05 = r6     // Catch:{ JSONException -> 0x02ba }
        L_0x00b4:
            X.7Ik r13 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = r5.A08     // Catch:{ JSONException -> 0x02ba }
            if (r6 == 0) goto L_0x0160
            java.lang.Object r6 = r6.A00     // Catch:{ JSONException -> 0x02ba }
        L_0x00be:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r7, r6)     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = X.AnonymousClass8BR.A0Y(r13, r1, r6, r7)     // Catch:{ JSONException -> 0x02ba }
            r5.A08 = r6     // Catch:{ JSONException -> 0x02ba }
            X.7Ik r7 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = r5.A07     // Catch:{ JSONException -> 0x02ba }
            if (r6 == 0) goto L_0x015d
            java.lang.Object r6 = r6.A00     // Catch:{ JSONException -> 0x02ba }
        L_0x00d4:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r8, r6)     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = X.AnonymousClass8BR.A0Y(r7, r1, r6, r8)     // Catch:{ JSONException -> 0x02ba }
            r5.A07 = r6     // Catch:{ JSONException -> 0x02ba }
            X.7Ik r7 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = r5.A0A     // Catch:{ JSONException -> 0x02ba }
            if (r6 == 0) goto L_0x015b
            java.lang.Object r6 = r6.A00     // Catch:{ JSONException -> 0x02ba }
        L_0x00ea:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r9, r6)     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = X.AnonymousClass8BR.A0Y(r7, r1, r6, r9)     // Catch:{ JSONException -> 0x02ba }
            r5.A0A = r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r7 = "mandateErrorCode"
            java.lang.String r6 = r5.A0H     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r7, r6)     // Catch:{ JSONException -> 0x02ba }
            r5.A0H = r6     // Catch:{ JSONException -> 0x02ba }
            X.7Ik r7 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = r5.A06     // Catch:{ JSONException -> 0x02ba }
            if (r6 == 0) goto L_0x0159
            java.lang.Object r6 = r6.A00     // Catch:{ JSONException -> 0x02ba }
        L_0x010a:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r10, r6)     // Catch:{ JSONException -> 0x02ba }
            X.77e r6 = X.AnonymousClass8BR.A0Y(r7, r1, r6, r10)     // Catch:{ JSONException -> 0x02ba }
            r5.A06 = r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r7 = "frequencyRule"
            java.lang.String r6 = r5.A0E     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r7, r6)     // Catch:{ JSONException -> 0x02ba }
            r5.A0E = r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r7 = "recurrenceRule"
            java.lang.String r6 = r5.A0K     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r7, r6)     // Catch:{ JSONException -> 0x02ba }
            r5.A0K = r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r7 = "recurrenceDay"
            java.lang.String r6 = r5.A0J     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r7, r6)     // Catch:{ JSONException -> 0x02ba }
            r5.A0J = r6     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r7 = "refId"
            java.lang.String r6 = r5.A0L     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r6 = r4.optString(r7, r6)     // Catch:{ JSONException -> 0x02ba }
            r5.A0L = r6     // Catch:{ JSONException -> 0x02ba }
            boolean r6 = r4.has(r11)     // Catch:{ JSONException -> 0x02ba }
            r8 = 0
            if (r6 == 0) goto L_0x0208
            java.lang.String r11 = r4.optString(r11, r8)     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r10 = "upiMandateUpdateInfo"
            java.lang.String r7 = "pendingMoney"
            X.9O4 r9 = new X.9O4     // Catch:{ JSONException -> 0x02ba }
            r9.<init>()     // Catch:{ JSONException -> 0x02ba }
            boolean r6 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x02ba }
            if (r6 != 0) goto L_0x0206
            goto L_0x0166
        L_0x0159:
            r6 = 0
            goto L_0x010a
        L_0x015b:
            r6 = 0
            goto L_0x00ea
        L_0x015d:
            r6 = 0
            goto L_0x00d4
        L_0x0160:
            r6 = 0
            goto L_0x00be
        L_0x0163:
            r13 = 0
            goto L_0x0098
        L_0x0166:
            org.json.JSONObject r11 = X.C17880vN.A16(r11)     // Catch:{ JSONException -> 0x0200 }
            X.7Ik r13 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r14 = "pendingAmount"
            X.77e r6 = r9.A03     // Catch:{ JSONException -> 0x0200 }
            if (r6 == 0) goto L_0x01fd
            java.lang.Object r6 = r6.A00     // Catch:{ JSONException -> 0x0200 }
        L_0x0176:
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r6 = r11.optString(r14, r6)     // Catch:{ JSONException -> 0x0200 }
            X.77e r6 = X.AnonymousClass8BR.A0Y(r13, r1, r6, r12)     // Catch:{ JSONException -> 0x0200 }
            r9.A03 = r6     // Catch:{ JSONException -> 0x0200 }
            org.json.JSONObject r6 = r11.optJSONObject(r7)     // Catch:{ JSONException -> 0x0200 }
            if (r6 == 0) goto L_0x0192
            org.json.JSONObject r6 = r11.optJSONObject(r7)     // Catch:{ JSONException -> 0x0200 }
            X.ARR r6 = X.AnonymousClass8BU.A0I(r6)     // Catch:{ JSONException -> 0x0200 }
            r9.A01 = r6     // Catch:{ JSONException -> 0x0200 }
        L_0x0192:
            java.lang.String r6 = r9.A06     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r3 = r11.optString(r3, r6)     // Catch:{ JSONException -> 0x0200 }
            r9.A06 = r3     // Catch:{ JSONException -> 0x0200 }
            long r6 = r9.A00     // Catch:{ JSONException -> 0x0200 }
            long r2 = r11.optLong(r2, r6)     // Catch:{ JSONException -> 0x0200 }
            r9.A00 = r2     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r2 = r9.A07     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r0 = r11.optString(r0, r2)     // Catch:{ JSONException -> 0x0200 }
            r9.A07 = r0     // Catch:{ JSONException -> 0x0200 }
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r2 = "seqNum"
            X.77e r0 = r9.A04     // Catch:{ JSONException -> 0x0200 }
            if (r0 == 0) goto L_0x01fb
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x0200 }
        L_0x01b6:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r0 = r11.optString(r2, r0)     // Catch:{ JSONException -> 0x0200 }
            X.77e r0 = X.AnonymousClass8BR.A0Y(r3, r1, r0, r10)     // Catch:{ JSONException -> 0x0200 }
            r9.A04 = r0     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r2 = "errorCode"
            java.lang.String r0 = r9.A05     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r0 = r11.optString(r2, r0)     // Catch:{ JSONException -> 0x0200 }
            r9.A05 = r0     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r2 = "mandateUpdateStatus"
            java.lang.String r0 = r9.A09     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r0 = r11.optString(r2, r0)     // Catch:{ JSONException -> 0x0200 }
            r9.A09 = r0     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r2 = "mandateUpdateAction"
            java.lang.String r0 = r9.A08     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r0 = r11.optString(r2, r0)     // Catch:{ JSONException -> 0x0200 }
            r9.A08 = r0     // Catch:{ JSONException -> 0x0200 }
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r2 = "mandateUpdateInfo"
            X.77e r0 = r9.A02     // Catch:{ JSONException -> 0x0200 }
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r0 = r0.A00     // Catch:{ JSONException -> 0x0200 }
        L_0x01ec:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0200 }
            java.lang.String r0 = r11.optString(r2, r0)     // Catch:{ JSONException -> 0x0200 }
            X.77e r0 = X.AnonymousClass8BR.A0Y(r3, r1, r0, r10)     // Catch:{ JSONException -> 0x0200 }
            r9.A02 = r0     // Catch:{ JSONException -> 0x0200 }
            goto L_0x0206
        L_0x01f9:
            r0 = 0
            goto L_0x01ec
        L_0x01fb:
            r0 = 0
            goto L_0x01b6
        L_0x01fd:
            r6 = 0
            goto L_0x0176
        L_0x0200:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiTransactionPendingUpdateMetadata threw: "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ JSONException -> 0x02ba }
        L_0x0206:
            r5.A0C = r9     // Catch:{ JSONException -> 0x02ba }
        L_0x0208:
            r0 = r16
            boolean r0 = r4.has(r0)     // Catch:{ JSONException -> 0x02ba }
            if (r0 == 0) goto L_0x0250
            r0 = r16
            java.lang.String r2 = r4.optString(r0, r8)     // Catch:{ JSONException -> 0x02ba }
            X.9lx r8 = new X.9lx     // Catch:{ JSONException -> 0x02ba }
            r8.<init>()     // Catch:{ JSONException -> 0x02ba }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x02ba }
            if (r0 != 0) goto L_0x024e
            org.json.JSONObject r9 = X.C17880vN.A16(r2)     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r0 = "action"
            java.lang.String r0 = r9.optString(r0)     // Catch:{ JSONException -> 0x0248 }
            r8.A02 = r0     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r0 = "status"
            java.lang.String r0 = r9.optString(r0)     // Catch:{ JSONException -> 0x0248 }
            r8.A03 = r0     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r0 = "pauseStartTs"
            r2 = -1
            long r6 = r9.optLong(r0, r2)     // Catch:{ JSONException -> 0x0248 }
            r8.A01 = r6     // Catch:{ JSONException -> 0x0248 }
            java.lang.String r0 = "pauseEndTs"
            long r2 = r9.optLong(r0, r2)     // Catch:{ JSONException -> 0x0248 }
            r8.A00 = r2     // Catch:{ JSONException -> 0x0248 }
            goto L_0x024e
        L_0x0248:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails threw: "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ JSONException -> 0x02ba }
        L_0x024e:
            r5.A0B = r8     // Catch:{ JSONException -> 0x02ba }
        L_0x0250:
            r0 = r17
            boolean r0 = r4.has(r0)     // Catch:{ JSONException -> 0x02ba }
            if (r0 == 0) goto L_0x02b1
            java.lang.String r2 = "[]"
            r0 = r17
            java.lang.String r0 = r4.optString(r0, r2)     // Catch:{ JSONException -> 0x02ba }
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02ba }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x02ba }
            int r8 = r9.length()     // Catch:{ JSONException -> 0x02ba }
            if (r8 <= 0) goto L_0x02b1
            X.9Nk[] r0 = new X.C180659Nk[r8]     // Catch:{ JSONException -> 0x02ba }
            r5.A0P = r0     // Catch:{ JSONException -> 0x02ba }
            r7 = 0
        L_0x0270:
            X.9Nk[] r6 = r5.A0P     // Catch:{ JSONException -> 0x02ba }
            java.lang.Object r0 = r9.get(r7)     // Catch:{ JSONException -> 0x02ba }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x02ba }
            X.9Nk r3 = new X.9Nk     // Catch:{ JSONException -> 0x02ba }
            r3.<init>()     // Catch:{ JSONException -> 0x02ba }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x02ba }
            if (r0 != 0) goto L_0x02aa
            org.json.JSONObject r11 = X.C17880vN.A16(r2)     // Catch:{ JSONException -> 0x02a4 }
            java.lang.String r10 = "upiSequenceNumber"
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()     // Catch:{ JSONException -> 0x02a4 }
            java.lang.String r0 = "id"
            java.lang.String r0 = r11.optString(r0)     // Catch:{ JSONException -> 0x02a4 }
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r0, r10)     // Catch:{ JSONException -> 0x02a4 }
            r3.A00 = r0     // Catch:{ JSONException -> 0x02a4 }
            java.lang.String r0 = "status"
            java.lang.String r0 = r11.optString(r0)     // Catch:{ JSONException -> 0x02a4 }
            r3.A01 = r0     // Catch:{ JSONException -> 0x02a4 }
            goto L_0x02aa
        L_0x02a4:
            r2 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata:InstanceTransaction threw: "
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ JSONException -> 0x02ba }
        L_0x02aa:
            r6[r7] = r3     // Catch:{ JSONException -> 0x02ba }
            int r7 = r7 + 1
            if (r7 >= r8) goto L_0x02b1
            goto L_0x0270
        L_0x02b1:
            java.lang.String r0 = "initiationMode"
            java.lang.String r0 = r4.optString(r0)     // Catch:{ JSONException -> 0x02ba }
            r5.A0F = r0     // Catch:{ JSONException -> 0x02ba }
            return
        L_0x02ba:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiTransactionPendingUpdateMetadata threw: "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x02c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196219ue.<init>(java.lang.String):void");
    }

    public int A00() {
        C191059lx r7 = this.A0B;
        if (r7 != null) {
            String str = r7.A02;
            if (!str.equals("RESUME")) {
                if (str.equals("PAUSE")) {
                    String str2 = r7.A03;
                    switch (str2.hashCode()) {
                        case -1149187101:
                            if (str2.equals("SUCCESS")) {
                                return 2;
                            }
                            break;
                        case -368591510:
                            if (str2.equals("FAILURE")) {
                                return 3;
                            }
                            break;
                        case 35394935:
                            if (str2.equals("PENDING")) {
                                return 1;
                            }
                            break;
                    }
                }
            }
            String str3 = r7.A03;
            switch (str3.hashCode()) {
                case -1149187101:
                    if (str3.equals("SUCCESS")) {
                        return 5;
                    }
                    break;
                case -368591510:
                    if (str3.equals("FAILURE")) {
                        return 6;
                    }
                    break;
                case 35394935:
                    if (str3.equals("PENDING")) {
                        return 4;
                    }
                    break;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C196219ue)) {
            return false;
        }
        return A01().equals(((C196219ue) obj).A01());
    }

    public int hashCode() {
        Object[] objArr = new Object[26];
        objArr[0] = Boolean.valueOf(this.A0M);
        objArr[1] = Boolean.valueOf(this.A0N);
        AnonymousClass8BU.A1Q(objArr, this.A0O);
        C17890vO.A1O(objArr, this.A02);
        C17890vO.A1P(objArr, this.A01);
        objArr[5] = this.A0D;
        objArr[6] = this.A0I;
        objArr[7] = Long.valueOf(this.A04);
        objArr[8] = Long.valueOf(this.A03);
        objArr[9] = Integer.valueOf(this.A00);
        objArr[10] = this.A0G;
        objArr[11] = this.A08;
        objArr[12] = this.A07;
        objArr[13] = this.A0A;
        objArr[14] = this.A0H;
        objArr[15] = this.A05;
        objArr[16] = this.A09;
        objArr[17] = this.A06;
        objArr[18] = this.A0E;
        objArr[19] = this.A0K;
        objArr[20] = this.A0J;
        objArr[21] = this.A0L;
        objArr[22] = this.A0B;
        objArr[23] = this.A0P;
        objArr[24] = this.A0C;
        return AnonymousClass000.A0P(this.A0F, objArr, 25);
    }

    public String toString() {
        String obj;
        AnonymousClass9O4 r0 = this.A0C;
        String str = "null";
        if (r0 == null) {
            obj = str;
        } else {
            obj = r0.toString();
        }
        C191059lx r02 = this.A0B;
        if (r02 != null) {
            str = r02.toString();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ ");
        C180659Nk[] r6 = this.A0P;
        if (r6 != null) {
            for (C180659Nk A1D : r6) {
                AnonymousClass8BS.A1D(A1D, A10);
            }
        }
        StringBuilder A0y = AnonymousClass8BT.A0y(" ]", A10);
        A0y.append("[ mandateNo: ");
        A0y.append(this.A08);
        A0y.append(" mandateErrorCode: ");
        A0y.append(this.A0H);
        A0y.append(" isMandate : ");
        A0y.append(this.A0M);
        A0y.append(" mandateName : ");
        A0y.append(this.A07);
        A0y.append(" upiPurposeCode : ");
        A0y.append(this.A0A);
        StringBuilder A0y2 = AnonymousClass8BT.A0y(" mandateStartTs: ", A0y);
        A0y2.append(this.A02);
        C20088A6q.A04(A0y2, A0y);
        StringBuilder A0y3 = AnonymousClass8BT.A0y(" mandateEndTs: ", A0y);
        A0y3.append(this.A01);
        C20088A6q.A04(A0y3, A0y);
        StringBuilder A0y4 = AnonymousClass8BT.A0y(" debitTs: ", A0y);
        A0y4.append(this.A0D);
        C20088A6q.A04(A0y4, A0y);
        StringBuilder A0y5 = AnonymousClass8BT.A0y(" previousDebitTs: ", A0y);
        A0y5.append(this.A0I);
        C20088A6q.A04(A0y5, A0y);
        StringBuilder A0y6 = AnonymousClass8BT.A0y(" nextPaymentTs: ", A0y);
        A0y6.append(this.A04);
        C20088A6q.A04(A0y6, A0y);
        StringBuilder A0y7 = AnonymousClass8BT.A0y(" nextPaymentEndTs: ", A0y);
        A0y7.append(this.A03);
        C20088A6q.A04(A0y7, A0y);
        StringBuilder A0y8 = AnonymousClass8BT.A0y(" totalRecurringTxnCount: ", A0y);
        A0y8.append(this.A00);
        C20088A6q.A04(A0y8, A0y);
        StringBuilder A0y9 = AnonymousClass8BT.A0y(" initiationMode: ", A0y);
        A0y9.append(this.A0F);
        C20088A6q.A04(A0y9, A0y);
        A0y.append(" mandateInfo: ");
        A0y.append(this.A06);
        A0y.append(" pendingMandateUpdate: {");
        A0y.append(obj);
        A0y.append("}  pauseResumeStatusDetails: {");
        A0y.append(str);
        A0y.append("}  instanceTransactions: {");
        AnonymousClass8BS.A1D(A10, A0y);
        return AnonymousClass000.A0y("} ]", A0y);
    }

    public String A01() {
        String str;
        Object obj;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put("isMandate", this.A0M);
            A15.put("isRevocable", this.A0N);
            A15.put("isShareToPayee", this.A0O);
            long j = this.A02;
            if (j > 0) {
                A15.put("mandateStartTs", j);
            }
            long j2 = this.A01;
            if (j2 > 0) {
                A15.put("mandateEndTs", j2);
            }
            String str4 = this.A0G;
            if (str4 != null) {
                A15.put("mandateAmountRule", str4);
            }
            C1418477e r0 = this.A08;
            if (r0 != null) {
                A15.put("mandateNo", r0.A00);
            }
            C1418477e r02 = this.A07;
            if (r02 != null) {
                A15.put("mandateName", r02.A00);
            }
            C1418477e r03 = this.A0A;
            if (r03 != null) {
                A15.put("upiPurposeCode", r03.A00);
            }
            String str5 = this.A0H;
            if (str5 != null) {
                A15.put("mandateErrorCode", str5);
            }
            C1418477e r2 = this.A09;
            if (!C20061A5k.A03(r2)) {
                A15.put("originalAmount", r2.A00);
            }
            C22565BDa bDa = this.A05;
            if (bDa != null) {
                A15.put("originalMoney", bDa.CPM());
            }
            AnonymousClass9O4 r22 = this.A0C;
            if (r22 != null) {
                try {
                    JSONObject A152 = C17880vN.A15();
                    C1418477e r04 = r22.A03;
                    if (r04 != null) {
                        A152.put("pendingAmount", r04.A00);
                    }
                    C22565BDa bDa2 = r22.A01;
                    if (bDa2 != null) {
                        A152.put("pendingMoney", bDa2.CPM());
                    }
                    String str6 = r22.A06;
                    if (str6 != null) {
                        A152.put("isRevocable", str6);
                    }
                    long j3 = r22.A00;
                    if (j3 > 0) {
                        A152.put("mandateEndTs", j3);
                    }
                    String str7 = r22.A07;
                    if (str7 != null) {
                        A152.put("mandateAmountRule", str7);
                    }
                    C1418477e r6 = r22.A04;
                    if (!C20061A5k.A03(r6)) {
                        if (r6 != null) {
                            obj3 = r6.A00;
                        } else {
                            obj3 = null;
                        }
                        A152.put("seqNum", obj3);
                    }
                    String str8 = r22.A05;
                    if (str8 != null) {
                        A152.put("errorCode", str8);
                    }
                    String str9 = r22.A09;
                    if (str9 != null) {
                        A152.put("mandateUpdateStatus", str9);
                    }
                    String str10 = r22.A08;
                    if (str10 != null) {
                        A152.put("mandateUpdateAction", str10);
                    }
                    C1418477e r23 = r22.A02;
                    if (!C20061A5k.A03(r23)) {
                        if (r23 != null) {
                            obj2 = r23.A00;
                        } else {
                            obj2 = null;
                        }
                        A152.put("mandateUpdateInfo", obj2);
                    }
                    str3 = A152.toString();
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiTransactionPendingUpdateMetadata toJsonString threw: ", e);
                    str3 = null;
                }
                A15.put("pendingMandateUpdate", str3);
            }
            C1418477e r05 = this.A06;
            if (r05 != null) {
                A15.put("mandateInfo", r05.A00);
            }
            String str11 = this.A0E;
            if (str11 != null) {
                A15.put("frequencyRule", str11);
            }
            String str12 = this.A0K;
            if (str12 != null) {
                A15.put("recurrenceRule", str12);
            }
            String str13 = this.A0J;
            if (str13 != null) {
                A15.put("recurrenceDay", str13);
            }
            String str14 = this.A0L;
            if (str14 != null) {
                A15.put("refId", str14);
            }
            int i = this.A00;
            if (i > 0) {
                A15.put("totalRecurringTxnCount", i);
            }
            String str15 = this.A0D;
            if (str15 != null) {
                A15.put("debitTs", str15);
            }
            String str16 = this.A0I;
            if (str16 != null) {
                A15.put("previousDebitTs", str16);
            }
            long j4 = this.A04;
            if (j4 > 0) {
                A15.put("nextPaymentTs", j4);
            }
            long j5 = this.A03;
            if (j5 > 0) {
                A15.put("nextPaymentEndTs", j5);
            }
            C191059lx r62 = this.A0B;
            if (r62 != null) {
                JSONObject A153 = C17880vN.A15();
                try {
                    A153.put("action", r62.A02);
                    A153.put("status", r62.A03);
                    A153.put("pauseStartTs", r62.A01);
                    A153.put("pauseEndTs", r62.A00);
                    str2 = A153.toString();
                } catch (JSONException e2) {
                    Log.w("PAY: IndiaUpiMandateMetadata:PauseResumeStatusDetails toJsonString threw: ", e2);
                    str2 = null;
                }
                A15.put("pauseResumeStatusDetails", str2);
            }
            C180659Nk[] r06 = this.A0P;
            if (r06 != null && r06.length > 0) {
                JSONArray A1A = AnonymousClass8BR.A1A();
                for (C180659Nk r3 : this.A0P) {
                    JSONObject A154 = C17880vN.A15();
                    try {
                        C1418477e r07 = r3.A00;
                        if (r07 != null) {
                            obj = r07.A00;
                        } else {
                            obj = null;
                        }
                        A154.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, obj);
                        str = AnonymousClass8BS.A0k(r3.A01, "status", A154);
                    } catch (JSONException e3) {
                        Log.w("PAY: IndiaUpiMandateMetadata:InstanceTransaction toJsonString threw: ", e3);
                        str = null;
                    }
                    A1A.put(str);
                }
                A15.put("instanceTransactions", A1A);
            }
            String str17 = this.A0F;
            if (str17 != null) {
                A15.put("initiationMode", str17);
            }
            return A15.toString();
        } catch (JSONException e4) {
            Log.w("PAY: IndiaUpiTransactionMetadata toDBString threw: ", e4);
            return null;
        }
    }
}
