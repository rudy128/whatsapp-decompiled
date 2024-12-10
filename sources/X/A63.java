package X;

import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class A63 {
    public static final Set A00;
    public static final Set A01;

    static {
        Integer[] numArr = new Integer[5];
        boolean A1b = C72453Mb.A1b(numArr, 401);
        boolean A1b2 = AnonymousClass8BU.A1b(numArr, 402);
        numArr[2] = 403;
        numArr[3] = 419;
        A01 = Collections.unmodifiableSet(C17900vP.A0I(420, numArr, 4));
        Integer[] numArr2 = new Integer[5];
        C17880vN.A1T(numArr2, 405, A1b ? 1 : 0);
        C17880vN.A1T(numArr2, 416, A1b2 ? 1 : 0);
        C17880vN.A1T(numArr2, 417, 2);
        C17880vN.A1T(numArr2, 418, 3);
        A00 = Collections.unmodifiableSet(C17900vP.A0I(421, numArr2, 4));
    }

    public static AnonymousClass21K A01(AnonymousClass121 r12, AnonymousClass1BI r13, C166418cr r14, boolean z) {
        C20279AEn aEn;
        try {
            String A06 = A8o.A06(r14);
            if (A06 != null) {
                String string = C17880vN.A16(A06).getString("reference_id");
                JSONObject A16 = C17880vN.A16(A06);
                long optLong = A16.optLong("payment_timestamp", 0);
                String optString = A16.optString("payment_status");
                String optString2 = A16.optString("payment_method");
                Iterator it = C26021Qn.A00(((AnonymousClass122) r12).A0W, r13, 4).iterator();
                while (it.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it);
                    if (A0Y instanceof AnonymousClass21K) {
                        AnonymousClass21K r5 = (AnonymousClass21K) A0Y;
                        C20285AEt BPK = r5.BPK();
                        if (!(BPK == null || (aEn = BPK.A02) == null || !string.equals(aEn.A0K))) {
                            if (!TextUtils.isEmpty(optString)) {
                                C20279AEn aEn2 = BPK.A02;
                                aEn2.A07 = optString;
                                if (z) {
                                    if (optString.equals("captured")) {
                                        AEU aeu = aEn2.A0D;
                                        if (aeu.A01.equals("payment_requested")) {
                                            aeu.A01 = "preparing_to_ship";
                                        }
                                    }
                                    if (optString.equals("pending")) {
                                        AEU aeu2 = aEn2.A0D;
                                        if (aeu2.A01.equals("preparing_to_ship")) {
                                            aeu2.A01 = "payment_requested";
                                        }
                                    }
                                }
                            }
                            if (optLong > 0) {
                                BPK.A02.A02 = optLong;
                            }
                            if (!TextUtils.isEmpty(optString2)) {
                                BPK.A02.A06 = optString2;
                            }
                            r12.CQw((AnonymousClass206) r5);
                            return r5;
                        }
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        AnonymousClass206.A06(A0Y, "InteractiveMessageCheckoutInfoManager/updateOrderPaymentMethodInCheckoutInfoMessage: Checkout message should use InteractiveMessage interface. Message row id = ", A10);
                        C17890vO.A0w(A10);
                    }
                }
                C17900vP.A0e("InteractiveMessageCheckoutInfoManager/updateOrderPaymentMethodInCheckoutInfoMessage can not find origin checkout NFM with reference id: ", string, AnonymousClass000.A10());
            }
            return null;
        } catch (JSONException e) {
            Log.e("InteractiveMessageCheckoutInfoManager/updateOrderPaymentMethodInCheckoutInfoMessage failed to parse parameters json", e);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        r5 = (X.AnonymousClass21K) r9.first;
        r3 = (X.AnonymousClass21K) r9.second;
        r2 = (X.C20285AEt) r9.third;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if (r5 == null) goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r9 = X.C20089A6r.A00(r2.A02);
        r0 = X.C20089A6r.A01(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r24 == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r14 = r24.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007f, code lost:
        if (r14.hasNext() == false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        r11 = (X.C184689bM) r14.next();
        X.C18070vi.A0i(r8, r3);
        r12 = r11.A00;
        r13 = X.AnonymousClass000.A10();
        r13.append("onMessageReceived order-status  for reference-id- ");
        r13.append(r8);
        r12.A04(X.AnonymousClass001.A1H(" and status- ", r1, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ab, code lost:
        if (X.C18070vi.A18(X.C20089A6r.A03(r3), "payment_gateway") != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r17 = ((X.AnonymousClass206) r3).A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        if (r17 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b6, code lost:
        ((X.C175748zD) X.C18070vi.A0E(r11.A01)).A00((X.C22565BDa) null, r17, r8, r1, "ORDER_STATUS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0176, code lost:
        r8 = (java.util.Set) X.AnonymousClass000.A0w(X.C20279AEn.A0W, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x017e, code lost:
        if (r8 == null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0184, code lost:
        if (X.C108965cb.A1b(r8, r0) != false) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0186, code lost:
        if (r9 == r0) goto L_0x01a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0188, code lost:
        r3 = r21.A01;
        r0 = r23.A0v;
        r2 = r0.A00;
        X.C17960vV.A07(r2);
        r3.A01(new com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob(r2, r0.A01));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a3, code lost:
        throw X.AnonymousClass8BT.A0b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a4, code lost:
        r8 = r2.A02;
        r8.A0D.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01aa, code lost:
        if (r25 == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b2, code lost:
        if (r1.equals("payment_requested") == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b4, code lost:
        r1 = r8.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b6, code lost:
        if (r1 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01be, code lost:
        if (r1.equals("captured") == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c0, code lost:
        r8.A07 = "pending";
        r8.A02 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d0, code lost:
        if (r7.has("payment") == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r1 = r7.getJSONObject("payment");
        X.C18070vi.A0d(r1, 0);
        r9 = X.C17880vN.A16(X.C18070vi.A0H(X.AnonymousClass84U.A00(new X.B01(r1))));
        r0 = r9.optLong("payment_timestamp", 0);
        r8 = r9.optString("payment_status");
        r9.optString("payment_method");
        r7 = r2.A02;
        r7.A02 = r0;
        r7.A07 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0205, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        com.whatsapp.util.Log.e("InteractiveMessageCheckoutInfoManager/updateOrderStatusWithPaymentInfoMessage failed to parse parameters json", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass21K A00(X.AnonymousClass121 r19, X.AnonymousClass1BI r20, X.AnonymousClass1N9 r21, X.C166418cr r22, X.AnonymousClass206 r23, java.util.Set r24, boolean r25, boolean r26) {
        /*
            r16 = 0
            java.lang.String r1 = X.A8o.A06(r22)     // Catch:{ JSONException -> 0x0227 }
            if (r1 == 0) goto L_0x0226
            org.json.JSONObject r7 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = "reference_id"
            java.lang.String r8 = r7.getString(r0)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r1 = X.C20096A6z.A02(r1)     // Catch:{ JSONException -> 0x0227 }
            if (r1 == 0) goto L_0x0226
            java.lang.String r0 = "order"
            org.json.JSONObject r2 = r7.getJSONObject(r0)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = "description"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ JSONException -> 0x0227 }
            r6 = r19
            r0 = r6
            X.122 r0 = (X.AnonymousClass122) r0     // Catch:{ JSONException -> 0x0227 }
            X.1Qn r3 = r0.A0W     // Catch:{ JSONException -> 0x0227 }
            r0 = 4
            r5 = r20
            java.util.ArrayList r0 = X.C26021Qn.A00(r3, r5, r0)     // Catch:{ JSONException -> 0x0227 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ JSONException -> 0x0227 }
        L_0x0036:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x00d6
            X.206 r10 = X.C17880vN.A0Y(r9)     // Catch:{ JSONException -> 0x0227 }
            boolean r0 = r10 instanceof X.AnonymousClass21K     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x00c8
            X.21K r10 = (X.AnonymousClass21K) r10     // Catch:{ JSONException -> 0x0227 }
            X.AEt r2 = r10.BPK()     // Catch:{ JSONException -> 0x0227 }
            if (r2 == 0) goto L_0x0036
            X.AEn r0 = r2.A02     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.A0K     // Catch:{ JSONException -> 0x0227 }
            boolean r0 = r8.equals(r0)     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0036
            X.7PS r9 = new X.7PS     // Catch:{ JSONException -> 0x0227 }
            r9.<init>(r10, r10, r2)     // Catch:{ JSONException -> 0x0227 }
        L_0x005d:
            java.lang.Object r5 = r9.first     // Catch:{ JSONException -> 0x0227 }
            X.21K r5 = (X.AnonymousClass21K) r5     // Catch:{ JSONException -> 0x0227 }
            java.lang.Object r3 = r9.second     // Catch:{ JSONException -> 0x0227 }
            X.21K r3 = (X.AnonymousClass21K) r3     // Catch:{ JSONException -> 0x0227 }
            java.lang.Object r2 = r9.third     // Catch:{ JSONException -> 0x0227 }
            X.AEt r2 = (X.C20285AEt) r2     // Catch:{ JSONException -> 0x0227 }
            if (r5 == 0) goto L_0x021d
            X.AEn r0 = r2.A02     // Catch:{ JSONException -> 0x0227 }
            int r9 = X.C20089A6r.A00(r0)     // Catch:{ JSONException -> 0x0227 }
            int r0 = X.C20089A6r.A01(r1)     // Catch:{ JSONException -> 0x0227 }
            if (r24 == 0) goto L_0x0176
            java.util.Iterator r14 = r24.iterator()     // Catch:{ JSONException -> 0x0227 }
        L_0x007b:
            boolean r10 = r14.hasNext()     // Catch:{ JSONException -> 0x0227 }
            if (r10 == 0) goto L_0x0176
            java.lang.Object r11 = r14.next()     // Catch:{ JSONException -> 0x0227 }
            X.9bM r11 = (X.C184689bM) r11     // Catch:{ JSONException -> 0x0227 }
            X.C18070vi.A0i(r8, r3)     // Catch:{ JSONException -> 0x0227 }
            X.1QE r12 = r11.A00     // Catch:{ JSONException -> 0x0227 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r10 = "onMessageReceived order-status  for reference-id- "
            r13.append(r10)     // Catch:{ JSONException -> 0x0227 }
            r13.append(r8)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r10 = " and status- "
            java.lang.String r10 = X.AnonymousClass001.A1H(r10, r1, r13)     // Catch:{ JSONException -> 0x0227 }
            r12.A04(r10)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r12 = X.C20089A6r.A03(r3)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r10 = "payment_gateway"
            boolean r10 = X.C18070vi.A18(r12, r10)     // Catch:{ JSONException -> 0x0227 }
            if (r10 != 0) goto L_0x007b
            r10 = r3
            X.206 r10 = (X.AnonymousClass206) r10     // Catch:{ JSONException -> 0x0227 }
            com.whatsapp.jid.UserJid r17 = r10.A0I()     // Catch:{ JSONException -> 0x0227 }
            if (r17 == 0) goto L_0x007b
            X.00H r10 = r11.A01     // Catch:{ JSONException -> 0x0227 }
            java.lang.Object r15 = X.C18070vi.A0E(r10)     // Catch:{ JSONException -> 0x0227 }
            X.8zD r15 = (X.C175748zD) r15     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r20 = "ORDER_STATUS"
            r19 = r1
            r18 = r8
            r15.A00(r16, r17, r18, r19, r20)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x007b
        L_0x00c8:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = "InteractiveMessageCheckoutInfoManager/findInteractiveCheckoutMessage: Checkout message should use InteractiveMessage interface. Message row id = "
            X.AnonymousClass206.A06(r10, r0, r2)     // Catch:{ JSONException -> 0x0227 }
            X.C17890vO.A0w(r2)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x0036
        L_0x00d6:
            if (r26 == 0) goto L_0x021d
            r0 = 6
            java.util.ArrayList r0 = X.C26021Qn.A00(r3, r5, r0)     // Catch:{ JSONException -> 0x0227 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ JSONException -> 0x0227 }
        L_0x00e1:
            boolean r0 = r9.hasNext()     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0117
            X.206 r10 = X.C17880vN.A0Y(r9)     // Catch:{ JSONException -> 0x0227 }
            boolean r0 = r10 instanceof X.AnonymousClass21K     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x010a
            X.21K r10 = (X.AnonymousClass21K) r10     // Catch:{ JSONException -> 0x0227 }
            X.AEt r2 = r10.BPK()     // Catch:{ JSONException -> 0x0227 }
            if (r2 == 0) goto L_0x00e1
            X.AEn r0 = r2.A02     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = r0.A0K     // Catch:{ JSONException -> 0x0227 }
            boolean r0 = r8.equals(r0)     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x00e1
            X.7PS r9 = new X.7PS     // Catch:{ JSONException -> 0x0227 }
            r9.<init>(r10, r10, r2)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x005d
        L_0x010a:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = "InteractiveMessageCheckoutInfoManager/findInteractiveNativeFlowMessage: Checkout message should use InteractiveMessage interface. Message row id = "
            X.AnonymousClass206.A06(r10, r0, r2)     // Catch:{ JSONException -> 0x0227 }
            X.C17890vO.A0w(r2)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x00e1
        L_0x0117:
            r0 = 9
            java.util.ArrayList r0 = X.C26021Qn.A00(r3, r5, r0)     // Catch:{ JSONException -> 0x0227 }
            java.util.Iterator r12 = r0.iterator()     // Catch:{ JSONException -> 0x0227 }
            r9 = 0
        L_0x0122:
            boolean r0 = r12.hasNext()     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0172
            X.206 r5 = X.C17880vN.A0Y(r12)     // Catch:{ JSONException -> 0x0227 }
            r3 = r5
            X.21L r3 = (X.AnonymousClass21L) r3     // Catch:{ JSONException -> 0x0227 }
            java.util.List r0 = r3.A17()     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0122
            java.util.List r0 = r3.A17()     // Catch:{ JSONException -> 0x0227 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ JSONException -> 0x0227 }
        L_0x013d:
            boolean r0 = r11.hasNext()     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0122
            X.206 r10 = X.C17880vN.A0Y(r11)     // Catch:{ JSONException -> 0x0227 }
            boolean r0 = r10 instanceof X.AnonymousClass21K     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x0165
            X.21K r10 = (X.AnonymousClass21K) r10     // Catch:{ JSONException -> 0x0227 }
            X.AEt r2 = r10.BPK()     // Catch:{ JSONException -> 0x0227 }
            if (r2 == 0) goto L_0x013d
            X.AEn r0 = r2.A02     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = r0.A0K     // Catch:{ JSONException -> 0x0227 }
            boolean r0 = r8.equals(r0)     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x013d
            X.7PS r9 = new X.7PS     // Catch:{ JSONException -> 0x0227 }
            r9.<init>(r3, r10, r2)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x0122
        L_0x0165:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = "InteractiveMessageCheckoutInfoManager/findInteractiveCarouselMessage: Carousel message should use InteractiveMessage interface. Message row id = "
            X.AnonymousClass206.A06(r5, r0, r2)     // Catch:{ JSONException -> 0x0227 }
            X.C17890vO.A0w(r2)     // Catch:{ JSONException -> 0x0227 }
            goto L_0x013d
        L_0x0172:
            if (r9 == 0) goto L_0x021d
            goto L_0x005d
        L_0x0176:
            java.util.Map r8 = X.C20279AEn.A0W     // Catch:{ JSONException -> 0x0227 }
            java.lang.Object r8 = X.AnonymousClass000.A0w(r8, r9)     // Catch:{ JSONException -> 0x0227 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ JSONException -> 0x0227 }
            if (r8 == 0) goto L_0x0186
            boolean r8 = X.C108965cb.A1b(r8, r0)     // Catch:{ JSONException -> 0x0227 }
            if (r8 != 0) goto L_0x01a4
        L_0x0186:
            if (r9 == r0) goto L_0x01a4
            r0 = r21
            X.1Mm r3 = r0.A01     // Catch:{ JSONException -> 0x0227 }
            r0 = r23
            X.205 r0 = r0.A0v     // Catch:{ JSONException -> 0x0227 }
            X.1BI r2 = r0.A00     // Catch:{ JSONException -> 0x0227 }
            X.C17960vV.A07(r2)     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r1 = r0.A01     // Catch:{ JSONException -> 0x0227 }
            com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob r0 = new com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob     // Catch:{ JSONException -> 0x0227 }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x0227 }
            r3.A01(r0)     // Catch:{ JSONException -> 0x0227 }
            X.1hd r0 = X.AnonymousClass8BT.A0b()     // Catch:{ JSONException -> 0x0227 }
            throw r0     // Catch:{ JSONException -> 0x0227 }
        L_0x01a4:
            X.AEn r8 = r2.A02     // Catch:{ JSONException -> 0x0227 }
            X.AEU r0 = r8.A0D     // Catch:{ JSONException -> 0x0227 }
            r0.A01 = r1     // Catch:{ JSONException -> 0x0227 }
            if (r25 == 0) goto L_0x01ca
            java.lang.String r0 = "payment_requested"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x01ca
            java.lang.String r1 = r8.A07     // Catch:{ JSONException -> 0x0227 }
            if (r1 == 0) goto L_0x01ca
            java.lang.String r0 = "captured"
            boolean r0 = r1.equals(r0)     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "pending"
            r8.A07 = r0     // Catch:{ JSONException -> 0x0227 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0227 }
            r8.A02 = r0     // Catch:{ JSONException -> 0x0227 }
        L_0x01ca:
            java.lang.String r1 = "payment"
            boolean r0 = r7.has(r1)     // Catch:{ JSONException -> 0x0227 }
            if (r0 == 0) goto L_0x020b
            org.json.JSONObject r1 = r7.getJSONObject(r1)     // Catch:{ JSONException -> 0x0205 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ JSONException -> 0x0205 }
            X.B01 r0 = new X.B01     // Catch:{ JSONException -> 0x0205 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0205 }
            X.84U r0 = X.AnonymousClass84U.A00(r0)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r0 = X.C18070vi.A0H(r0)     // Catch:{ JSONException -> 0x0205 }
            org.json.JSONObject r9 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r7 = "payment_timestamp"
            r0 = 0
            long r0 = r9.optLong(r7, r0)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r7 = "payment_status"
            java.lang.String r8 = r9.optString(r7)     // Catch:{ JSONException -> 0x0205 }
            java.lang.String r7 = "payment_method"
            r9.optString(r7)     // Catch:{ JSONException -> 0x0205 }
            X.AEn r7 = r2.A02     // Catch:{ JSONException -> 0x0205 }
            r7.A02 = r0     // Catch:{ JSONException -> 0x0205 }
            r7.A07 = r8     // Catch:{ JSONException -> 0x0205 }
            goto L_0x020b
        L_0x0205:
            r1 = move-exception
            java.lang.String r0 = "InteractiveMessageCheckoutInfoManager/updateOrderStatusWithPaymentInfoMessage failed to parse parameters json"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ JSONException -> 0x0227 }
        L_0x020b:
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0227 }
            if (r0 != 0) goto L_0x0217
            X.AEn r0 = r2.A02     // Catch:{ JSONException -> 0x0227 }
            X.AEU r0 = r0.A0D     // Catch:{ JSONException -> 0x0227 }
            r0.A00 = r4     // Catch:{ JSONException -> 0x0227 }
        L_0x0217:
            X.206 r5 = (X.AnonymousClass206) r5     // Catch:{ JSONException -> 0x0227 }
            r6.CQw(r5)     // Catch:{ JSONException -> 0x0227 }
            return r3
        L_0x021d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ JSONException -> 0x0227 }
            java.lang.String r0 = "InteractiveMessageCheckoutInfoManager/updateOrderStatusInCheckoutInfoMessage can not find origin checkout NFM with reference id: "
            X.C17900vP.A0e(r0, r8, r1)     // Catch:{ JSONException -> 0x0227 }
        L_0x0226:
            return r16
        L_0x0227:
            r1 = move-exception
            java.lang.String r0 = "InteractiveMessageCheckoutInfoManager/updateOrderStatusInCheckoutInfoMessage failed to parse parameters json"
            com.whatsapp.util.Log.e(r0, r1)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A63.A00(X.121, X.1BI, X.1N9, X.8cr, X.206, java.util.Set, boolean, boolean):X.21K");
    }

    public static void A02(AnonymousClass1KB r12, AnonymousClass121 r13, AnonymousClass1QR r14, C22500BAh bAh, C33651jA r16, AnonymousClass21K r17, AnonymousClass10I r18) {
        C20279AEn aEn;
        Set set;
        AnonymousClass21K r6 = r17;
        C20285AEt BPK = r6.BPK();
        C22500BAh bAh2 = bAh;
        if (!(BPK == null || (aEn = BPK.A02) == null)) {
            AEU aeu = aEn.A0D;
            C20250ADi aDi = aeu.A02;
            int A012 = C20089A6r.A01(aeu.A01);
            if (aDi != null && aDi.A00 <= C17880vN.A04(System.currentTimeMillis()) && (((set = (Set) AnonymousClass000.A0w(C20279AEn.A0W, A012)) != null && C108965cb.A1b(set, 4)) || A012 == 4)) {
                String str = r6.BPK().A02.A08;
                AnonymousClass121 r5 = r13;
                AnonymousClass10I r4 = r18;
                if (TextUtils.isEmpty(str)) {
                    r4.CGF(new C70733Ch(r6, r13, 28));
                    bAh.C6l();
                    return;
                }
                r4.CGF(new AnonymousClass7RG(r14, r4, r5, r6, r12, bAh2, r16, str, 1));
                return;
            }
        }
        bAh.C6i();
    }
}
