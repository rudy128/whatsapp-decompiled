package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.8Cl  reason: invalid class name and case insensitive filesystem */
public class C161258Cl extends Handler {
    public final AnonymousClass00H A00;
    public final AnonymousClass8pS A01;
    public final A7U A02;
    public final AXS A03;
    public final C30931ek A04;
    public final String A05;
    public final /* synthetic */ A0S A06;

    public boolean sendMessageAtTime(Message message, long j) {
        C18070vi.A0d(message, 0);
        return super.sendMessageAtTime(message, j);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161258Cl(Looper looper, AnonymousClass8pS r3, A7U a7u, AXS axs, A0S a0s, C30931ek r7, AnonymousClass00H r8, String str) {
        super(looper);
        this.A06 = a0s;
        C18070vi.A0d(looper, 1);
        this.A00 = r8;
        this.A04 = r7;
        this.A02 = a7u;
        this.A03 = axs;
        this.A05 = str;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r27) {
        /*
            r26 = this;
            r4 = r26
            X.AXS r3 = r4.A03
            java.lang.String r6 = r4.A05
            monitor-enter(r3)
            X.C17960vV.A07(r6)     // Catch:{ all -> 0x0171 }
            r5 = 0
            X.1QD r0 = r3.A01     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x0041 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x0041 }
            if (r0 != 0) goto L_0x0049
            org.json.JSONObject r7 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0041 }
            java.lang.String r0 = "smsVerifDataSentToPsp"
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch:{ JSONException -> 0x0041 }
            if (r0 == 0) goto L_0x0030
            org.json.JSONObject r1 = r0.optJSONObject(r6)     // Catch:{ JSONException -> 0x0041 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r0 = "smsVerifData"
            java.lang.String r2 = r1.optString(r0, r5)     // Catch:{ JSONException -> 0x0041 }
            goto L_0x0031
        L_0x0030:
            r2 = r5
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x003e }
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "smsVerifData"
            java.lang.String r5 = r7.optString(r0, r5)     // Catch:{ JSONException -> 0x003e }
            goto L_0x0049
        L_0x003e:
            r1 = move-exception
            r5 = r2
            goto L_0x0042
        L_0x0041:
            r1 = move-exception
        L_0x0042:
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsVerificationDataSent threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0171 }
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            monitor-exit(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x015a
            X.1ek r0 = r4.A04
            X.9m2 r1 = r0.A00
            if (r1 != 0) goto L_0x005e
            X.9m2 r1 = X.C30931ek.A00(r0)
            r0.A00 = r1
            if (r1 == 0) goto L_0x008b
        L_0x005e:
            X.1QE r8 = r1.A02
            java.lang.String r0 = "PaymentDeviceId: try to upgrade algorithm ..."
            r8.A04(r0)
            X.1QD r7 = r1.A01
            android.content.SharedPreferences r0 = r7.A03()
            java.lang.String r2 = "payments_device_id_algorithm"
            int r1 = X.C17890vO.A00(r0, r2)
            r0 = 2
            if (r1 >= r0) goto L_0x008b
            java.lang.String r0 = "PaymentDeviceId: algorithm upgraded!"
            r8.A04(r0)
            r1 = 2
            android.content.SharedPreferences$Editor r0 = X.AnonymousClass8BU.A07(r7)
            X.C17880vN.A1C(r0, r2, r1)
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r7)
            java.lang.String r0 = "payments_device_id"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x008b:
            monitor-enter(r3)
            r8 = 0
            X.1QD r0 = r3.A01     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r1 = r0.A06()     // Catch:{ JSONException -> 0x00a4 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00a4 }
            if (r0 != 0) goto L_0x00aa
            org.json.JSONObject r1 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x00a4 }
            java.lang.String r0 = "smsVerifDataGateway"
            java.lang.String r8 = r1.optString(r0, r8)     // Catch:{ JSONException -> 0x00a4 }
            goto L_0x00aa
        L_0x00a4:
            r1 = move-exception
            java.lang.String r0 = "PAY: IndiaUpiPaymentSharedPrefs readSmsGateway threw: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0171 }
        L_0x00aa:
            monitor-exit(r3)
            if (r8 != 0) goto L_0x00b8
            X.A7U r3 = r4.A02
            X.8pS r0 = r4.A01
            java.util.ArrayList r2 = X.A7U.A03(r0, r3)
            if (r2 != 0) goto L_0x015d
            r8 = 0
        L_0x00b8:
            X.A0S r7 = r4.A06
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: sendDeviceBindingIq called with psp: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " verificationData: "
            r1.append(r0)
            java.lang.String r0 = X.C20088A6q.A00(r5)
            X.C17890vO.A1A(r1, r0)
            X.AZ6 r4 = r7.A0E
            r1 = 0
            r0 = 20
            r3 = 0
            r4.A0A(r3, r0, r1)
            X.9ui r2 = r7.A0C
            java.lang.String r0 = "upi-bind-device"
            r2.A02(r0)
            X.1OZ r1 = r7.A09
            java.lang.String r15 = r1.A0B()
            r11 = 0
            X.1ek r0 = r7.A0I
            java.lang.String r16 = r0.A01()
            r9 = 0
            long[] r0 = X.A0S.A0L
            r9 = r0[r9]
            java.lang.Long r13 = java.lang.Long.valueOf(r9)
            java.lang.Long r14 = java.lang.Long.valueOf(r11)
            X.A0B r0 = r7.A0F
            java.lang.String r20 = r0.A01()
            X.AXS r0 = r7.A0A
            boolean r0 = r0.A0R()
            java.lang.String r21 = X.AnonymousClass8BS.A0b(r0)
            X.9F2 r12 = new X.9F2
            r19 = r8
            r18 = r6
            r17 = r5
            r12.<init>((java.lang.Long) r13, (java.lang.Long) r14, (java.lang.String) r15, (java.lang.String) r16, (java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (java.lang.String) r21)
            X.0ve r6 = r7.A08
            r5 = 2227(0x8b3, float:3.12E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r11 = X.C18020vd.A05(r0, r6, r5)
            java.lang.String r10 = "in_upi_device_binding_tag"
            if (r11 == 0) goto L_0x012e
            X.90Z r5 = r7.A0G
            r0 = 185476608(0xb0e2600, float:2.7376793E-32)
            r5.A01(r0, r10)
        L_0x012e:
            java.lang.Object r9 = r12.A02
            X.1ca r9 = (X.C29621ca) r9
            X.118 r0 = r7.A06
            android.content.Context r8 = r0.A00
            X.1KB r6 = r7.A05
            X.1jG r5 = r7.A0B
            if (r11 == 0) goto L_0x015b
            X.90Z r3 = r7.A0G
        L_0x013e:
            r25 = 5
            X.8zY r0 = new X.8zY
            r22 = r4
            r23 = r3
            r24 = r10
            r19 = r5
            r20 = r2
            r21 = r7
            r18 = r6
            r17 = r8
            r16 = r0
            r16.<init>((android.content.Context) r17, (X.AnonymousClass1KB) r18, (X.C33711jG) r19, (X.C196259ui) r20, (X.A0S) r21, (X.AZ6) r22, (X.AnonymousClass90Z) r23, (java.lang.String) r24, (int) r25)
            X.AnonymousClass8BW.A1B(r1, r0, r9, r15)
        L_0x015a:
            return
        L_0x015b:
            r10 = r3
            goto L_0x013e
        L_0x015d:
            java.lang.String r0 = ""
            X.C17960vV.A0A(r0, r2)
            int r1 = r2.size()
            r3.A00 = r1
            int r0 = r3.A02
            int r0 = r0 % r1
            java.lang.String r8 = X.C108945cZ.A1H(r2, r0)
            goto L_0x00b8
        L_0x0171:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161258Cl.handleMessage(android.os.Message):void");
    }
}
