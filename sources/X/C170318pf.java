package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8pf  reason: invalid class name and case insensitive filesystem */
public final class C170318pf extends AnonymousClass8pG {
    public static final Parcelable.Creator CREATOR = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 1;
    public long A04;
    public long A05 = -1;
    public C22565BDa A06;
    public C22565BDa A07;
    public C1418477e A08;
    public C1418477e A09;
    public C1418477e A0A;
    public C1418477e A0B;
    public C1418477e A0C;
    public C1418477e A0D;
    public C1418477e A0E;
    public ADP A0F;
    public C190159kT A0G;
    public C196219ue A0H;
    public ADS A0I;
    public Boolean A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public List A0Z;
    public boolean A0a;

    public String A04() {
        throw AnonymousClass04E.createAndThrow();
    }

    public void A07(List list) {
        String str;
        C1418477e r0;
        String str2;
        C1418477e r02;
        String str3;
        String str4;
        C18070vi.A0d(list, 1);
        if (!C20061A5k.A02(this.A0E) && (str4 = (String) AnonymousClass8BT.A0q(this.A0E)) != null) {
            AnonymousClass8BT.A1S("mpin", str4, list);
        }
        String str5 = this.A0V;
        if (str5 != null && str5.length() > 0) {
            AnonymousClass8BT.A1S("seq-no", str5, list);
        }
        String str6 = this.A0T;
        if (str6 != null && str6.length() > 0) {
            AnonymousClass8BT.A1S("sender-vpa", str6, list);
        }
        String str7 = this.A0U;
        if (str7 != null && str7.length() > 0) {
            AnonymousClass8BT.A1S("sender-vpa-id", str7, list);
        }
        String str8 = this.A0R;
        if (str8 != null && str8.length() > 0) {
            AnonymousClass8BT.A1S("receiver-vpa", str8, list);
        }
        String str9 = this.A0S;
        if (str9 != null && str9.length() > 0) {
            AnonymousClass8BT.A1S("receiver-vpa-id", str9, list);
        }
        if (!(C20061A5k.A02(this.A0B) || (r02 = this.A0B) == null || (str3 = (String) r02.A00) == null)) {
            AnonymousClass8BT.A1S("receiver-name", str3, list);
        }
        if (!(C20061A5k.A02(this.A0C) || (r0 = this.A0C) == null || (str2 = (String) r0.A00) == null)) {
            AnonymousClass8BT.A1S("sender-name", str2, list);
        }
        String str10 = this.A0K;
        if (str10 != null && str10.length() > 0) {
            AnonymousClass8BT.A1S("device-id", str10, list);
        }
        if (!C20061A5k.A02(this.A0D) && (str = (String) AnonymousClass8BT.A0q(this.A0D)) != null) {
            AnonymousClass8BT.A1S("upi-bank-info", str, list);
        }
        String str11 = this.A0O;
        if (str11 != null && str11.length() > 0) {
            AnonymousClass8BT.A1S("mcc", str11, list);
        }
        Boolean bool = this.A0J;
        if (bool != null) {
            AnonymousClass8BT.A1S("is_first_send", AnonymousClass8BS.A0b(bool.booleanValue() ? 1 : 0), list);
        }
        C20280AEo aEo = this.A02;
        if (aEo != null) {
            AnonymousClass8BT.A1S("ref-id", aEo.A01, list);
        }
        String str12 = this.A0P;
        if (str12 != null && str12.length() > 0) {
            AnonymousClass8BT.A1S("purpose-code", str12, list);
        }
        String str13 = this.A0N;
        if (str13 != null && str13.length() > 0) {
            AnonymousClass8BT.A1S("mandate-transaction-id", str13, list);
        }
        String str14 = this.A0L;
        if (str14 != null && str14.length() != 0) {
            AnonymousClass8BT.A1S("note", str14, list);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2r3, java.lang.Object] */
    public static final ARR A00(AnonymousClass1KI r3, C29621ca r4) {
        AnonymousClass1KJ A012 = r3.A01(C29621ca.A02(r4, "currency"));
        ? obj = new Object();
        obj.A01 = r4.A0C("value");
        obj.A00 = r4.A09("offset");
        obj.A02 = A012;
        return obj.A00();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: X.9Nk[]} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.9kT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, X.9NQ] */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.ADS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.9ue] */
    /* JADX WARNING: type inference failed for: r2v11, types: [X.9O4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v3, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.lang.Object, X.9Nk] */
    /* JADX WARNING: type inference failed for: r11v3, types: [X.9lx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x027e, code lost:
        if (r3.equals(r1) == false) goto L_0x0280;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.AnonymousClass1KI r29, X.C29621ca r30, int r31) {
        /*
            r28 = this;
            r27 = r29
            r8 = r30
            r0 = r27
            X.C18070vi.A0i(r0, r8)
            java.lang.String r25 = "seq-no"
            r2 = 0
            r0 = r25
            java.lang.String r1 = r8.A0Q(r0, r2)
            r7 = r28
            if (r1 == 0) goto L_0x001e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x001e
            r7.A0V = r1
        L_0x001e:
            java.lang.String r0 = "ref-url"
            java.lang.String r1 = r8.A0Q(r0, r2)
            if (r1 == 0) goto L_0x002e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x002e
            r7.A0Y = r1
        L_0x002e:
            java.lang.String r0 = "sync-status"
            java.lang.String r1 = r8.A0Q(r0, r2)
            if (r1 == 0) goto L_0x003e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x003e
            r7.A0W = r1
        L_0x003e:
            java.lang.String r0 = "upi-bank-info"
            java.lang.String r3 = r8.A0Q(r0, r2)
            if (r3 == 0) goto L_0x0054
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "bankInfo"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r3, r0)
            r7.A0D = r0
        L_0x0054:
            java.lang.String r0 = "sender-name"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            java.lang.String r1 = "legalName"
            if (r0 == 0) goto L_0x0064
            X.77e r0 = X.AnonymousClass8BX.A0K(r0, r1)
            r7.A0C = r0
        L_0x0064:
            java.lang.String r0 = "receiver-name"
            java.lang.String r0 = X.C29621ca.A02(r8, r0)
            if (r0 == 0) goto L_0x0072
            X.77e r0 = X.AnonymousClass8BX.A0K(r0, r1)
            r7.A0B = r0
        L_0x0072:
            java.lang.String r0 = "mandate"
            X.1ca r6 = r8.A0K(r0)
            if (r6 == 0) goto L_0x032d
            X.9ue r5 = new X.9ue
            r5.<init>()
            r3 = 1
            r5.A0M = r3
            java.lang.String r0 = "mandate-no"
            java.lang.String r4 = X.C29621ca.A02(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x009c
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "mandateNo"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r4, r0)
            r5.A08 = r0
        L_0x009c:
            java.lang.String r24 = "amount-rule"
            r2 = 0
            r0 = r24
            java.lang.String r1 = r6.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00ad
            r5.A0G = r1
        L_0x00ad:
            java.lang.String r23 = "is-revocable"
            r0 = r23
            java.lang.String r0 = r6.A0Q(r0, r2)
            r9 = 0
            if (r0 == 0) goto L_0x00c1
            int r0 = X.C20099A7c.A01(r0, r9)
            if (r0 == r3) goto L_0x00bf
            r3 = 0
        L_0x00bf:
            r5.A0N = r3
        L_0x00c1:
            java.lang.String r0 = "mandate-name"
            java.lang.String r3 = r6.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00db
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "mandateName"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r3, r0)
            r5.A07 = r0
        L_0x00db:
            java.lang.String r0 = "purpose-code"
            java.lang.String r3 = X.C29621ca.A02(r6, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x00f5
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiPurposeCode"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r3, r0)
            r5.A0A = r0
        L_0x00f5:
            java.lang.String r0 = "start-ts"
            r4 = 0
            java.lang.String r0 = r6.A0Q(r0, r4)
            r18 = 1000(0x3e8, double:4.94E-321)
            r2 = 0
            if (r0 == 0) goto L_0x010a
            long r0 = X.C20099A7c.A04(r0, r2)
            long r0 = r0 * r18
            r5.A02 = r0
        L_0x010a:
            java.lang.String r22 = "end-ts"
            r0 = r22
            java.lang.String r0 = r6.A0Q(r0, r4)
            if (r0 == 0) goto L_0x011c
            long r0 = X.C20099A7c.A04(r0, r2)
            long r0 = r0 * r18
            r5.A01 = r0
        L_0x011c:
            java.lang.String r0 = "debit-ts"
            java.lang.String r0 = r6.A0Q(r0, r4)
            if (r0 == 0) goto L_0x0126
            r5.A0D = r0
        L_0x0126:
            java.lang.String r0 = "next-payment-ts"
            java.lang.String r0 = r6.A0Q(r0, r4)
            if (r0 == 0) goto L_0x0136
            long r0 = X.C20099A7c.A04(r0, r2)
            long r0 = r0 * r18
            r5.A04 = r0
        L_0x0136:
            java.lang.String r0 = "next-payment-end-ts"
            java.lang.String r0 = r6.A0Q(r0, r4)
            if (r0 == 0) goto L_0x0146
            long r0 = X.C20099A7c.A04(r0, r2)
            long r0 = r0 * r18
            r5.A03 = r0
        L_0x0146:
            java.lang.String r21 = "error-code"
            r0 = r21
            java.lang.String r0 = r6.A0Q(r0, r4)
            if (r0 == 0) goto L_0x0152
            r5.A0H = r0
        L_0x0152:
            java.lang.String r0 = "original-amount"
            X.1ca r1 = r6.A0K(r0)
            java.lang.String r10 = "moneyStringValue"
            if (r1 != 0) goto L_0x0169
            java.lang.String r0 = r6.A0Q(r0, r4)
            if (r0 == 0) goto L_0x0193
            X.77e r0 = X.AnonymousClass8BX.A0K(r0, r10)
            r5.A09 = r0
            goto L_0x0193
        L_0x0169:
            java.lang.String r0 = "money"
            X.1ca r1 = r1.A0K(r0)
            if (r1 == 0) goto L_0x0193
            r0 = r27
            X.ARR r0 = A00(r0, r1)
            r5.A05 = r0     // Catch:{ Exception -> 0x018e }
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()     // Catch:{ Exception -> 0x018e }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.1KN r0 = r0.A02     // Catch:{ Exception -> 0x018e }
            java.math.BigDecimal r0 = r0.A00     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x018e }
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r0, r10)     // Catch:{ Exception -> 0x018e }
            r5.A09 = r0     // Catch:{ Exception -> 0x018e }
            goto L_0x0193
        L_0x018e:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0193:
            java.lang.String r0 = "total-expected-txns"
            int r0 = r6.A0A(r0, r9)     // Catch:{ 1UI -> 0x0220 }
            r5.A00 = r0     // Catch:{ 1UI -> 0x0220 }
            java.lang.String r0 = "pause-resume-status-details"
            X.1ca r12 = r6.A0K(r0)     // Catch:{ 1UI -> 0x0220 }
            if (r12 == 0) goto L_0x01dc
            X.9lx r11 = new X.9lx     // Catch:{ 1UI -> 0x0220 }
            r11.<init>()     // Catch:{ 1UI -> 0x0220 }
            java.lang.String r0 = "action"
            java.lang.String r0 = r12.A0Q(r0, r4)     // Catch:{ 1UI -> 0x0220 }
            r11.A02 = r0     // Catch:{ 1UI -> 0x0220 }
            java.lang.String r0 = "status"
            java.lang.String r0 = r12.A0Q(r0, r4)     // Catch:{ 1UI -> 0x0220 }
            r11.A03 = r0     // Catch:{ 1UI -> 0x0220 }
            java.lang.String r0 = "pause-start-ts"
            java.lang.String r0 = r12.A0Q(r0, r4)     // Catch:{ 1UI -> 0x0220 }
            r2 = 0
            if (r0 == 0) goto L_0x01ca
            long r0 = X.C20099A7c.A04(r0, r2)     // Catch:{ 1UI -> 0x0220 }
            long r0 = r0 * r18
            r11.A01 = r0     // Catch:{ 1UI -> 0x0220 }
        L_0x01ca:
            java.lang.String r0 = "pause-end-ts"
            java.lang.String r0 = r12.A0Q(r0, r4)     // Catch:{ 1UI -> 0x0220 }
            if (r0 == 0) goto L_0x01da
            long r0 = X.C20099A7c.A04(r0, r2)     // Catch:{ 1UI -> 0x0220 }
            long r0 = r0 * r18
            r11.A00 = r0     // Catch:{ 1UI -> 0x0220 }
        L_0x01da:
            r5.A0B = r11     // Catch:{ 1UI -> 0x0220 }
        L_0x01dc:
            java.lang.String r0 = "transaction"
            java.util.List r15 = r6.A0R(r0)     // Catch:{ 1UI -> 0x0220 }
            boolean r0 = r15.isEmpty()     // Catch:{ 1UI -> 0x0220 }
            if (r0 != 0) goto L_0x0225
            int r14 = r15.size()     // Catch:{ 1UI -> 0x0220 }
            X.9Nk[] r0 = new X.C180659Nk[r14]     // Catch:{ 1UI -> 0x0220 }
            r5.A0P = r0     // Catch:{ 1UI -> 0x0220 }
        L_0x01f0:
            if (r9 >= r14) goto L_0x0225
            X.9Nk[] r13 = r5.A0P     // Catch:{ 1UI -> 0x0220 }
            java.lang.Object r12 = r15.get(r9)     // Catch:{ 1UI -> 0x0220 }
            X.1ca r12 = (X.C29621ca) r12     // Catch:{ 1UI -> 0x0220 }
            X.9Nk r11 = new X.9Nk     // Catch:{ 1UI -> 0x0220 }
            r11.<init>()     // Catch:{ 1UI -> 0x0220 }
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()     // Catch:{ 1UI -> 0x0220 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r0 = "id"
            java.lang.String r1 = r12.A0Q(r0, r4)     // Catch:{ 1UI -> 0x0220 }
            java.lang.String r0 = "upiSequenceNumber"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r3, r2, r1, r0)     // Catch:{ 1UI -> 0x0220 }
            r11.A00 = r0     // Catch:{ 1UI -> 0x0220 }
            java.lang.String r0 = "status"
            java.lang.String r0 = r12.A0Q(r0, r4)     // Catch:{ 1UI -> 0x0220 }
            r11.A01 = r0     // Catch:{ 1UI -> 0x0220 }
            r13[r9] = r11     // Catch:{ 1UI -> 0x0220 }
            int r9 = r9 + 1
            goto L_0x01f0
        L_0x0220:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occurred while parsing recurring mandate info"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0225:
            java.lang.String r0 = "mandate-info"
            java.lang.String r3 = r6.A0Q(r0, r4)
            if (r3 == 0) goto L_0x023b
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "mandateInfo"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r3, r0)
            r5.A06 = r0
        L_0x023b:
            java.lang.String r0 = "frequency-rule"
            java.lang.String r15 = r6.A0Q(r0, r4)
            java.lang.String r20 = "UNKNOWN"
            r26 = r20
            if (r15 == 0) goto L_0x0262
            int r17 = r15.hashCode()
            java.lang.String r16 = "MONTHLY"
            java.lang.String r0 = "ASPRESENTED"
            java.lang.String r14 = "QUARTERLY"
            java.lang.String r13 = "BIMONTHLY"
            java.lang.String r12 = "FORTNIGHTLY"
            java.lang.String r11 = "HALFYEARLY"
            java.lang.String r9 = "DAILY"
            java.lang.String r3 = "ONETIME"
            java.lang.String r2 = "YEARLY"
            java.lang.String r1 = "WEEKLY"
            switch(r17) {
                case -1738378111: goto L_0x04df;
                case -1681232246: goto L_0x04e9;
                case -602281453: goto L_0x04f3;
                case 64808441: goto L_0x04fd;
                case 1134556285: goto L_0x0507;
                case 1271097434: goto L_0x0511;
                case 1297843654: goto L_0x051b;
                case 1720567065: goto L_0x0525;
                case 1896178312: goto L_0x052f;
                case 1954618349: goto L_0x0539;
                default: goto L_0x0262;
            }
        L_0x0262:
            r0 = r20
            r5.A0E = r0
            java.lang.String r0 = "recurrence-rule"
            java.lang.String r3 = r6.A0Q(r0, r4)
            java.lang.String r2 = "ON"
            if (r3 == 0) goto L_0x0280
            java.lang.String r1 = "AFTER"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x04dc
            java.lang.String r1 = "BEFORE"
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x04dc
        L_0x0280:
            r5.A0K = r2
            java.lang.String r0 = "recurrence-day"
            java.lang.String r0 = r6.A0Q(r0, r4)
            r5.A0J = r0
            java.lang.String r0 = "ref-id"
            java.lang.String r0 = r6.A0Q(r0, r4)
            r5.A0L = r0
            java.lang.String r0 = "mandate-update"
            X.1ca r3 = r6.A0K(r0)
            if (r3 == 0) goto L_0x032b
            X.9O4 r2 = new X.9O4
            r2.<init>()
            java.lang.String r0 = "amount"
            X.1ca r1 = r3.A0K(r0)
            if (r1 != 0) goto L_0x0490
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r0 == 0) goto L_0x02b3
            X.77e r0 = X.AnonymousClass8BX.A0K(r0, r10)
            r2.A03 = r0
        L_0x02b3:
            r0 = r24
            java.lang.String r1 = r3.A0Q(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x02c1
            r2.A07 = r1
        L_0x02c1:
            r0 = r23
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r0 == 0) goto L_0x02cb
            r2.A06 = r0
        L_0x02cb:
            r0 = r22
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r0 == 0) goto L_0x02db
            long r0 = X.C20099A7c.A03(r0)
            long r0 = r0 * r18
            r2.A00 = r0
        L_0x02db:
            r0 = r25
            java.lang.String r9 = r3.A0Q(r0, r4)
            if (r9 == 0) goto L_0x02f1
            X.7Ik r6 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiSequenceNumber"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r6, r1, r9, r0)
            r2.A04 = r0
        L_0x02f1:
            r0 = r21
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r0 == 0) goto L_0x02fb
            r2.A05 = r0
        L_0x02fb:
            java.lang.String r0 = "mandate-update-info"
            java.lang.String r9 = r3.A0Q(r0, r4)
            if (r9 == 0) goto L_0x0311
            X.7Ik r6 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "upiMandateUpdateInfo"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r6, r1, r9, r0)
            r2.A02 = r0
        L_0x0311:
            java.lang.String r0 = "status"
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r0 != 0) goto L_0x031b
            java.lang.String r0 = "INIT"
        L_0x031b:
            r2.A09 = r0
            java.lang.String r0 = "action"
            java.lang.String r0 = r3.A0Q(r0, r4)
            if (r0 != 0) goto L_0x0327
            r0 = r26
        L_0x0327:
            r2.A08 = r0
            r5.A0C = r2
        L_0x032b:
            r7.A0H = r5
        L_0x032d:
            java.lang.String r0 = "is-complaint-eligible"
            r2 = 0
            java.lang.String r1 = r8.A0Q(r0, r2)
            java.lang.String r0 = "complaint"
            X.1ca r6 = r8.A0K(r0)
            if (r1 != 0) goto L_0x033e
            if (r6 == 0) goto L_0x038e
        L_0x033e:
            r0 = 0
            r3 = 0
            X.ADS r5 = new X.ADS
            r5.<init>()
            r5.A03 = r0
            r5.A00 = r3
            r5.A01 = r3
            r5.A02 = r2
            if (r1 == 0) goto L_0x035a
            int r0 = X.C20099A7c.A01(r1, r0)
            boolean r0 = X.C108975cc.A1B(r0)
            r5.A03 = r0
        L_0x035a:
            if (r6 == 0) goto L_0x038c
            java.lang.String r0 = "created-ts"
            java.lang.String r0 = r6.A0Q(r0, r2)
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r0 == 0) goto L_0x036d
            long r0 = X.C20099A7c.A04(r0, r3)
            long r0 = r0 * r9
            r5.A00 = r0
        L_0x036d:
            java.lang.String r0 = "updated-ts"
            java.lang.String r0 = r6.A0Q(r0, r2)
            if (r0 == 0) goto L_0x037c
            long r0 = X.C20099A7c.A04(r0, r3)
            long r0 = r0 * r9
            r5.A01 = r0
        L_0x037c:
            java.lang.String r0 = "complaint-status"
            java.lang.String r1 = r6.A0Q(r0, r2)
            if (r1 == 0) goto L_0x038c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x038c
            r5.A02 = r1
        L_0x038c:
            r7.A0I = r5
        L_0x038e:
            java.lang.String r0 = "international-transaction-detail"
            X.1ca r3 = r8.A0K(r0)
            if (r3 == 0) goto L_0x0408
            X.9kT r4 = new X.9kT
            r4.<init>()
            java.lang.String r0 = "invoice-number"
            java.lang.String r1 = r3.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x03a9
            r4.A01 = r1
        L_0x03a9:
            java.lang.String r0 = "fx-detail"
            X.1ca r6 = r3.A0K(r0)
            if (r6 == 0) goto L_0x0406
            X.9NQ r3 = new X.9NQ
            r3.<init>()
            java.lang.String r0 = "base-currency"
            java.lang.String r1 = r6.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x03c4
            r3.A01 = r1
        L_0x03c4:
            java.lang.String r0 = "base-amount"
            java.lang.String r9 = r6.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x03de
            X.7Ik r5 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "moneyStringValue"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r5, r1, r9, r0)
            r3.A00 = r0
        L_0x03de:
            java.lang.String r0 = "currency-fx"
            java.lang.String r1 = r6.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x03f1
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            r3.A02 = r0
        L_0x03f1:
            java.lang.String r0 = "currency-markup"
            java.lang.String r1 = r6.A0Q(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0404
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            r3.A03 = r0
        L_0x0404:
            r4.A00 = r3
        L_0x0406:
            r7.A0G = r4
        L_0x0408:
            java.lang.String r0 = "mandate-transaction-id"
            java.lang.String r1 = r8.A0Q(r0, r2)
            if (r1 == 0) goto L_0x0418
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0418
            r7.A0N = r1
        L_0x0418:
            java.lang.String r0 = "mcc"
            java.lang.String r1 = r8.A0Q(r0, r2)
            if (r1 == 0) goto L_0x0428
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0428
            r7.A0O = r1
        L_0x0428:
            java.lang.String r0 = "is_p2m_hybrid"
            java.lang.String r1 = r8.A0Q(r0, r2)
            if (r1 == 0) goto L_0x043e
            int r0 = r1.length()
            if (r0 == 0) goto L_0x043e
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r7.A0a = r0
        L_0x043e:
            java.lang.String r0 = "payment_instrument_type"
            java.lang.String r3 = r8.A0Q(r0, r2)
            if (r3 == 0) goto L_0x045a
            int r0 = r3.length()
            if (r0 == 0) goto L_0x045a
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "paymentInstrumentType"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r3, r0)
            r7.A09 = r0
        L_0x045a:
            java.lang.String r0 = "psp_transaction_id"
            java.lang.String r3 = X.C29621ca.A02(r8, r0)
            if (r3 == 0) goto L_0x0476
            int r0 = r3.length()
            if (r0 == 0) goto L_0x0476
            X.7Ik r2 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.String r0 = "pspTransactionId"
            X.77e r0 = X.AnonymousClass8BR.A0Y(r2, r1, r3, r0)
            r7.A0A = r0
        L_0x0476:
            java.lang.String r0 = "receiver-tpap-name"
            java.lang.String r1 = X.C29621ca.A02(r8, r0)
            if (r1 == 0) goto L_0x0486
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0486
            r7.A0Q = r1
        L_0x0486:
            java.lang.String r0 = "external_payment_method"
            X.1ca r1 = r8.A0K(r0)
            if (r1 == 0) goto L_0x055e
            goto L_0x0545
        L_0x0490:
            java.lang.String r0 = "money"
            X.1ca r11 = r1.A0K(r0)
            if (r11 == 0) goto L_0x02b3
            java.lang.String r0 = "currency"
            java.lang.String r1 = r11.A0Q(r0, r4)     // Catch:{ Exception -> 0x04d5 }
            r0 = r27
            X.1KJ r9 = r0.A01(r1)     // Catch:{ Exception -> 0x04d5 }
            X.2r3 r6 = new X.2r3     // Catch:{ Exception -> 0x04d5 }
            r6.<init>()     // Catch:{ Exception -> 0x04d5 }
            java.lang.String r0 = "value"
            long r0 = r11.A0C(r0)     // Catch:{ Exception -> 0x04d5 }
            r6.A01 = r0     // Catch:{ Exception -> 0x04d5 }
            java.lang.String r0 = "offset"
            int r0 = r11.A09(r0)     // Catch:{ Exception -> 0x04d5 }
            r6.A00 = r0     // Catch:{ Exception -> 0x04d5 }
            r6.A02 = r9     // Catch:{ Exception -> 0x04d5 }
            X.ARR r0 = r6.A00()     // Catch:{ Exception -> 0x04d5 }
            r2.A01 = r0     // Catch:{ Exception -> 0x04d5 }
            X.7Ik r6 = X.AnonymousClass8BR.A0Z()     // Catch:{ Exception -> 0x04d5 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            X.1KN r0 = r0.A02     // Catch:{ Exception -> 0x04d5 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04d5 }
            X.77e r0 = X.AnonymousClass8BR.A0Y(r6, r1, r0, r10)     // Catch:{ Exception -> 0x04d5 }
            r2.A03 = r0     // Catch:{ Exception -> 0x04d5 }
            goto L_0x02b3
        L_0x04d5:
            java.lang.String r0 = "PAY: IndiaUpiMandateMetadata - and error occured while parsing the money node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x02b3
        L_0x04dc:
            r2 = r1
            goto L_0x0280
        L_0x04df:
            boolean r0 = r15.equals(r1)
            if (r0 == 0) goto L_0x0262
            r20 = r1
            goto L_0x0262
        L_0x04e9:
            boolean r0 = r15.equals(r2)
            if (r0 == 0) goto L_0x0262
            r20 = r2
            goto L_0x0262
        L_0x04f3:
            boolean r0 = r15.equals(r3)
            if (r0 == 0) goto L_0x0262
            r20 = r3
            goto L_0x0262
        L_0x04fd:
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L_0x0262
            r20 = r9
            goto L_0x0262
        L_0x0507:
            boolean r0 = r15.equals(r11)
            if (r0 == 0) goto L_0x0262
            r20 = r11
            goto L_0x0262
        L_0x0511:
            boolean r0 = r15.equals(r12)
            if (r0 == 0) goto L_0x0262
            r20 = r12
            goto L_0x0262
        L_0x051b:
            boolean r0 = r15.equals(r13)
            if (r0 == 0) goto L_0x0262
            r20 = r13
            goto L_0x0262
        L_0x0525:
            boolean r0 = r15.equals(r14)
            if (r0 == 0) goto L_0x0262
            r20 = r14
            goto L_0x0262
        L_0x052f:
            boolean r1 = r15.equals(r0)
            if (r1 == 0) goto L_0x0262
            r20 = r0
            goto L_0x0262
        L_0x0539:
            r0 = r16
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0262
            r20 = r16
            goto L_0x0262
        L_0x0545:
            java.lang.String r0 = "type"
            java.lang.String r2 = r1.A0P(r0)     // Catch:{ 1UI -> 0x0557 }
            java.lang.String r0 = "name"
            java.lang.String r1 = r1.A0P(r0)     // Catch:{ 1UI -> 0x0557 }
            X.ADP r0 = new X.ADP     // Catch:{ 1UI -> 0x0557 }
            r0.<init>(r2, r1)     // Catch:{ 1UI -> 0x0557 }
            goto L_0x055c
        L_0x0557:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0 = 0
        L_0x055c:
            r7.A0F = r0
        L_0x055e:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r7.A0Z = r0
            java.lang.String r0 = "offer"
            java.util.Iterator r3 = X.C29621ca.A03(r8, r0)
        L_0x056a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0597
            X.1ca r1 = X.C17880vN.A0a(r3)
            if (r1 == 0) goto L_0x056a
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.A0P(r0)     // Catch:{ 1UI -> 0x0590 }
            X.ADc r2 = new X.ADc     // Catch:{ 1UI -> 0x0590 }
            r2.<init>(r0)     // Catch:{ 1UI -> 0x0590 }
            java.util.List r1 = r7.A0Z
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.whatsapp.payments.IndiaUpiTransactionOfferData>"
            X.C18070vi.A0z(r1, r0)
            java.util.List r0 = X.C41681wt.A01(r1)
            r0.add(r2)
            goto L_0x056a
        L_0x0590:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiTransactionOfferData/fromProtocolNode threw: "
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x056a
        L_0x0597:
            java.lang.String r0 = "offer_amount"
            X.1ca r0 = r8.A0K(r0)
            java.lang.String r2 = "money"
            if (r0 == 0) goto L_0x05af
            X.1ca r1 = r0.A0K(r2)
            if (r1 == 0) goto L_0x05af
            r0 = r27
            X.ARR r0 = A00(r0, r1)
            r7.A07 = r0
        L_0x05af:
            java.lang.String r0 = "amount_modifiers"
            X.1ca r1 = r8.A0K(r0)
            if (r1 == 0) goto L_0x05cd
            java.lang.String r0 = "fee"
            X.1ca r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x05cd
            X.1ca r1 = r0.A0K(r2)
            if (r1 == 0) goto L_0x05cd
            r0 = r27
            X.ARR r0 = A00(r0, r1)
            r7.A06 = r0
        L_0x05cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170318pf.A05(X.1KI, X.1ca, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v23, types: [X.2r3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v24, types: [X.2r3, java.lang.Object] */
    public void A06(String str) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ADP adp;
        String str2 = str;
        C18070vi.A0d(str2, 0);
        try {
            super.A06(str2);
            JSONObject A16 = C17880vN.A16(str2);
            this.A03 = A16.optInt("v", 1);
            this.A0V = A16.optString("seqNum", this.A0V);
            this.A00 = A16.optInt("counter", 0);
            this.A0K = A16.optString("deviceId", this.A0K);
            this.A0T = A16.optString("senderVpa", this.A0T);
            this.A0U = A16.optString("senderVpaId", this.A0U);
            C144717Ik A0Z2 = AnonymousClass8BR.A0Z();
            Class<String> cls = String.class;
            C1418477e r0 = this.A0C;
            if (r0 != null) {
                obj = r0.A00;
            } else {
                obj = null;
            }
            this.A0C = AnonymousClass8BR.A0Y(A0Z2, cls, A16.optString("senderName", (String) obj), "legalName");
            this.A0R = A16.optString("receiverVpa", this.A0R);
            this.A0S = A16.optString("receiverVpaId", this.A0S);
            C144717Ik A0Z3 = AnonymousClass8BR.A0Z();
            C1418477e r02 = this.A0B;
            if (r02 != null) {
                obj2 = r02.A00;
            } else {
                obj2 = null;
            }
            this.A0B = AnonymousClass8BR.A0Y(A0Z3, cls, A16.optString("receiverName", (String) obj2), "legalName");
            C144717Ik A0Z4 = AnonymousClass8BR.A0Z();
            C1418477e r03 = this.A0E;
            if (r03 != null) {
                obj3 = r03.A00;
            } else {
                obj3 = null;
            }
            this.A0E = AnonymousClass8BR.A0Y(A0Z4, cls, A16.optString("blob", (String) obj3), "pin");
            this.A0X = A16.optString("token", this.A0X);
            this.A04 = A16.optLong("expiryTs", this.A04);
            this.A01 = A16.optInt("previousStatus", this.A01);
            this.A02 = A16.optInt("previousType", this.A02);
            this.A0Y = A16.optString("url", this.A0Y);
            C144717Ik A0Z5 = AnonymousClass8BR.A0Z();
            C1418477e r04 = this.A0D;
            if (r04 != null) {
                obj4 = r04.A00;
            } else {
                obj4 = null;
            }
            this.A0D = AnonymousClass8BR.A0Y(A0Z5, cls, A16.optString("upiBankInfo", (String) obj4), "bankInfo");
            this.A0W = A16.optString("syncStatus", this.A0W);
            this.A0O = A16.optString("mcc", this.A0O);
            this.A0P = A16.optString("purposeCode", this.A0P);
            ArrayList arrayList = null;
            if (A16.has("indiaUpiMandateMetadata")) {
                this.A0H = new C196219ue(A16.optString("indiaUpiMandateMetadata", (String) null));
            }
            if (A16.has("isFirstSend")) {
                this.A0J = Boolean.valueOf(A16.optBoolean("isFirstSend", false));
            }
            if (A16.has("indiaUpiTransactionComplaintData")) {
                this.A0I = new ADS(A16.optString("indiaUpiTransactionComplaintData", (String) null));
            }
            if (A16.has("indiaUpiInternationalTransactionDetailData")) {
                this.A0G = new C190159kT(A16.optString("indiaUpiInternationalTransactionDetailData", (String) null));
            }
            this.A0N = A16.optString("mandateTransactionId", this.A0N);
            C144717Ik A0Z6 = AnonymousClass8BR.A0Z();
            C1418477e r05 = this.A08;
            if (r05 != null) {
                obj5 = r05.A00;
            } else {
                obj5 = null;
            }
            this.A08 = AnonymousClass8BR.A0Y(A0Z6, cls, A16.optString("note", (String) obj5), "interopNote");
            this.A0L = A16.optString("encryptedInteropNote");
            this.A0a = A16.optBoolean("isP2mHybrid", false);
            String optString = A16.optString("paymentInstrumentType");
            if (!AnonymousClass1EG.A0H(optString)) {
                this.A09 = AnonymousClass8BW.A0K(optString, "paymentInstrumentType");
            }
            String optString2 = A16.optString("pspTransactionId");
            if (!AnonymousClass1EG.A0H(optString2)) {
                this.A0A = AnonymousClass8BW.A0K(optString2, "pspTransactionId");
            }
            if (A16.has("externalPaymentMethod")) {
                JSONObject jSONObject = A16.getJSONObject("externalPaymentMethod");
                if (jSONObject != null) {
                    adp = new ADP(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, jSONObject), C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, jSONObject));
                } else {
                    adp = null;
                }
                this.A0F = adp;
            }
            if (A16.has("offers")) {
                JSONArray jSONArray = A16.getJSONArray("offers");
                if (jSONArray != null) {
                    arrayList = AnonymousClass000.A13();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            arrayList.add(new C20244ADc(C18070vi.A0J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, jSONObject2)));
                        }
                    }
                }
                this.A0Z = arrayList;
            }
            if (A16.has("offerAmount")) {
                ? obj6 = new Object();
                obj6.A02 = AnonymousClass1KL.A0B;
                obj6.A00();
                this.A07 = AnonymousClass8BU.A0I(A16.getJSONObject("offerAmount"));
            }
            if (A16.has("receiverTpapName")) {
                this.A0Q = A16.getString("receiverTpapName");
            }
            if (A16.has("feeAmount")) {
                ? obj7 = new Object();
                obj7.A02 = AnonymousClass1KL.A0B;
                obj7.A00();
                this.A06 = AnonymousClass8BU.A0I(A16.getJSONObject("feeAmount"));
            }
        } catch (JSONException e) {
            Log.w("PAY: IndiaUpiTransactionMetadata fromDBString threw: ", e);
        }
    }

    public String toString() {
        String valueOf;
        String valueOf2;
        String valueOf3;
        String str;
        String str2;
        String str3;
        Object obj;
        String str4;
        String str5;
        String str6;
        C196219ue r0 = this.A0H;
        String str7 = "null";
        if (r0 == null) {
            valueOf = str7;
        } else {
            valueOf = String.valueOf(r0);
        }
        ADS ads = this.A0I;
        if (ads == null) {
            valueOf2 = str7;
        } else {
            valueOf2 = String.valueOf(ads);
        }
        C190159kT r02 = this.A0G;
        if (r02 == null) {
            valueOf3 = str7;
        } else {
            valueOf3 = String.valueOf(r02);
        }
        C20280AEo aEo = this.A02;
        String str8 = "order = [";
        if (aEo != null) {
            StringBuilder A11 = AnonymousClass000.A11(str8);
            A11.append("id: ");
            StringBuilder A112 = AnonymousClass000.A11(AnonymousClass000.A0y(C20088A6q.A00(aEo.A01), A11));
            A112.append("expiryTsInSec:");
            StringBuilder A113 = AnonymousClass000.A11(C17880vN.A0u(A112, aEo.A00));
            A113.append("messageId:");
            str8 = AnonymousClass000.A0y(C20088A6q.A00(aEo.A02), A113);
        }
        C22565BDa bDa = this.A06;
        if (bDa != null) {
            str = String.valueOf(bDa);
        } else {
            str = str7;
        }
        String A0c = C17890vO.A0c(AnonymousClass000.A11(str8), ']');
        ADP adp = this.A0F;
        if (adp != null) {
            str7 = String.valueOf(adp);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[ seq-no: ");
        C20088A6q.A03(A10, this.A0V);
        A10.append(" timestamp: ");
        A10.append(this.A05);
        A10.append(" deviceId: ");
        A10.append(this.A0K);
        A10.append(" sender: ");
        A10.append(C20088A6q.A02(this.A0T));
        A10.append(" senderVpaId: ");
        A10.append(this.A0U);
        A10.append(" senderName: ");
        C1418477e r03 = this.A0C;
        String str9 = null;
        if (r03 != null) {
            str2 = String.valueOf(r03);
        } else {
            str2 = null;
        }
        C20088A6q.A03(A10, str2);
        A10.append(" receiver: ");
        A10.append(C20088A6q.A02(this.A0R));
        A10.append(" receiverVpaId: ");
        A10.append(C20088A6q.A02(this.A0S));
        A10.append(" receiverName : ");
        C1418477e r04 = this.A0B;
        if (r04 != null) {
            str3 = String.valueOf(r04);
        } else {
            str3 = null;
        }
        C20088A6q.A03(A10, str3);
        A10.append(" encryptedKeyLength: ");
        C1418477e r5 = this.A0E;
        if (C20061A5k.A03(r5)) {
            obj = "0";
        } else if (r5 == null || (str4 = (String) r5.A00) == null) {
            obj = null;
        } else {
            obj = AnonymousClass8BT.A0j(str4);
        }
        A10.append(obj);
        A10.append(" previousType: ");
        A10.append(this.A02);
        A10.append(" previousStatus: ");
        A10.append(this.A01);
        A10.append(" token: ");
        C20088A6q.A03(A10, this.A0X);
        A10.append(" url: ");
        C20088A6q.A03(A10, this.A0Y);
        A10.append(" upiBankInfo: ");
        A10.append(this.A0D);
        A10.append(" order : ");
        A10.append(A0c);
        A10.append(" mcc: ");
        C20088A6q.A03(A10, this.A0O);
        A10.append(" purposeCode: ");
        C20088A6q.A03(A10, this.A0P);
        A10.append(" isFirstSend: ");
        A10.append(this.A0J);
        A10.append(" indiaUpiMandateMetadata: {");
        A10.append(valueOf);
        A10.append("} ] indiaUpiTransactionComplaintData: {");
        A10.append(valueOf2);
        A10.append("}  indiaUpiInternationalTransactionDetailData: {");
        A10.append(valueOf3);
        A10.append("}  mandateTransactionId: ");
        C20088A6q.A03(A10, this.A0N);
        A10.append(" note : ");
        C1418477e r05 = this.A08;
        if (r05 != null) {
            str5 = String.valueOf(r05);
        } else {
            str5 = null;
        }
        C20088A6q.A03(A10, str5);
        A10.append(" isPendingRequestViewed: ");
        A10.append(this.A03);
        A10.append(" isP2mHybrid: ");
        A10.append(this.A0a);
        A10.append(" paymentInstrumentType: ");
        C1418477e r06 = this.A09;
        if (r06 != null) {
            str6 = String.valueOf(r06);
        } else {
            str6 = null;
        }
        C20088A6q.A03(A10, str6);
        A10.append(" pspTransactionId: ");
        C1418477e r07 = this.A0A;
        if (r07 != null) {
            str9 = String.valueOf(r07);
        }
        C20088A6q.A03(A10, str9);
        A10.append(" externalPaymentMethodData: ");
        A10.append(str7);
        A10.append(" receiverTpapName: ");
        A10.append(this.A0Q);
        A10.append(" feeAmount: ");
        return AnonymousClass8BW.A0l(str, A10, ']');
    }

    public void A0R(AnonymousClass8pG r8) {
        C196219ue r1;
        super.A0R(r8);
        C170318pf r82 = (C170318pf) r8;
        String str = r82.A0V;
        if (str != null) {
            this.A0V = str;
        }
        String str2 = r82.A0K;
        if (str2 != null) {
            this.A0K = str2;
        }
        String str3 = r82.A0R;
        if (str3 != null) {
            this.A0R = str3;
        }
        String str4 = r82.A0S;
        if (str4 != null) {
            this.A0S = str4;
        }
        C1418477e r0 = r82.A0B;
        if (r0 != null) {
            this.A0B = r0;
        }
        String str5 = r82.A0T;
        if (str5 != null) {
            this.A0T = str5;
        }
        String str6 = r82.A0U;
        if (str6 != null) {
            this.A0U = str6;
        }
        C1418477e r12 = r82.A0C;
        if (!C20061A5k.A03(r12)) {
            this.A0C = r12;
        }
        long j = r82.A04;
        if (j > 0) {
            this.A04 = j;
        }
        int i = r82.A01;
        if (i > 0) {
            this.A01 = i;
        }
        int i2 = r82.A00;
        if (i2 > 0) {
            this.A00 = i2;
        }
        int i3 = r82.A02;
        if (i3 > 0) {
            this.A02 = i3;
        }
        String str7 = r82.A0Y;
        if (str7 != null) {
            this.A0Y = str7;
        }
        C1418477e r13 = r82.A0D;
        if (!C20061A5k.A03(r13)) {
            this.A0D = r13;
        }
        String str8 = r82.A0W;
        if (str8 != null) {
            this.A0W = str8;
        }
        String str9 = r82.A0O;
        if (str9 != null) {
            this.A0O = str9;
        }
        String str10 = r82.A0P;
        if (str10 != null) {
            this.A0P = str10;
        }
        C196219ue r2 = r82.A0H;
        if (!(r2 == null || (r1 = this.A0H) == null)) {
            C1418477e r02 = r2.A08;
            if (r02 != null) {
                r1.A08 = r02;
            }
            C1418477e r03 = r2.A07;
            if (r03 != null) {
                r1.A07 = r03;
            }
            C1418477e r04 = r2.A0A;
            if (r04 != null) {
                r1.A0A = r04;
            }
            r1.A0H = r2.A0H;
            String str11 = r2.A0G;
            if (str11 != null) {
                r1.A0G = str11;
            }
            r1.A0M = r2.A0M;
            r1.A0N = r2.A0N;
            r1.A0O = r2.A0O;
            long j2 = r2.A02;
            if (j2 > 0) {
                r1.A02 = j2;
            }
            long j3 = r2.A01;
            if (j3 > 0) {
                r1.A01 = j3;
            }
            String str12 = r2.A0D;
            if (str12 != null) {
                r1.A0D = str12;
            }
            String str13 = r2.A0I;
            if (str13 != null) {
                r1.A0I = str13;
            }
            long j4 = r2.A04;
            if (j4 > 0) {
                r1.A04 = j4;
            }
            long j5 = r2.A03;
            if (j5 > 0) {
                r1.A03 = j5;
            }
            int i4 = r2.A00;
            if (i4 > 0) {
                r1.A00 = i4;
            }
            C1418477e r05 = r2.A09;
            if (r05 != null) {
                r1.A09 = r05;
            }
            C22565BDa bDa = r2.A05;
            if (bDa != null) {
                r1.A05 = bDa;
            }
            C1418477e r06 = r2.A06;
            if (r06 != null) {
                r1.A06 = r06;
            }
            String str14 = r2.A0E;
            if (str14 != null) {
                r1.A0E = str14;
            }
            String str15 = r2.A0K;
            if (str15 != null) {
                r1.A0K = str15;
            }
            String str16 = r2.A0J;
            if (str16 != null) {
                r1.A0J = str16;
            }
            String str17 = r2.A0L;
            if (str17 != null) {
                r1.A0L = str17;
            }
            String str18 = r2.A0F;
            if (str18 != null) {
                r1.A0F = str18;
            }
            r1.A0C = r2.A0C;
            r1.A0P = r2.A0P;
            r1.A0B = r2.A0B;
        }
        Boolean bool = r82.A0J;
        if (bool != null) {
            this.A0J = bool;
        }
        ADS ads = r82.A0I;
        if (ads != null) {
            ADS ads2 = this.A0I;
            if (ads2 == null) {
                this.A0I = new ADS(ads.A00());
            } else {
                ads2.A03 = ads.A03;
                long j6 = ads.A00;
                if (j6 > 0) {
                    ads2.A00 = j6;
                }
                long j7 = ads.A01;
                if (j7 > 0) {
                    ads2.A01 = j7;
                }
                String str19 = ads.A02;
                if (str19 != null) {
                    ads2.A02 = str19;
                }
            }
        }
        C190159kT r22 = r82.A0G;
        if (r22 != null) {
            C190159kT r14 = this.A0G;
            if (r14 == null) {
                this.A0G = new C190159kT(r22.A00());
            } else {
                String str20 = r22.A01;
                if (str20 != null) {
                    r14.A01 = str20;
                }
                r14.A00 = r22.A00;
            }
        }
        String str21 = r82.A0N;
        if (str21 != null) {
            this.A0N = str21;
        }
        C1418477e r15 = r82.A08;
        if (!C20061A5k.A03(r15)) {
            this.A08 = r15;
        }
        String str22 = r82.A0L;
        if (!(str22 == null || str22.length() == 0)) {
            this.A0L = str22;
        }
        this.A0a = r82.A0a;
        C1418477e r16 = r82.A09;
        if (!C20061A5k.A03(r16)) {
            this.A09 = r16;
        }
        C1418477e r17 = r82.A0A;
        if (!C20061A5k.A03(r17)) {
            this.A0A = r17;
        }
        ADP adp = r82.A0F;
        if (adp != null) {
            this.A0F = adp;
        }
        List list = r82.A0Z;
        if (list != null) {
            this.A0Z = list;
        }
        C22565BDa bDa2 = r82.A07;
        if (bDa2 != null) {
            this.A07 = bDa2;
        }
        String str23 = r82.A0Q;
        if (str23 != null) {
            this.A0Q = str23;
        }
        C22565BDa bDa3 = r82.A06;
        if (bDa3 != null) {
            this.A06 = bDa3;
        }
    }

    public void A0Y(String str) {
        this.A0B = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str, "legalName");
    }
}
