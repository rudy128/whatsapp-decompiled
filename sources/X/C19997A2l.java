package X;

import android.content.Context;
import android.os.Build;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.A2l  reason: case insensitive filesystem */
public class C19997A2l {
    public A6H A00;
    public final A0B A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass118 A06;
    public final C18030ve A07;
    public final A7U A08;
    public final AXS A09;
    public final C31061ex A0A;
    public final AZ6 A0B;
    public final AnonymousClass1QE A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;

    private String A00(String str) {
        TelephonyManager A0K = this.A04.A0K();
        try {
            Method method = Class.forName(C17890vO.A0U(A0K)).getMethod(str, new Class[]{Integer.TYPE});
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, 1, 0);
            Object invoke = method.invoke(A0K, objArr);
            if (invoke != null) {
                return invoke.toString();
            }
        } catch (Exception e) {
            Log.e("IndiaUpiSimSwapDetectionUtils/getDeviceInfoBySlot device info exception: ", e);
        }
        return null;
    }

    public String A03() {
        int i;
        try {
            Context context = this.A06.A00;
            if (C19740yt.A01(context, "android.permission.READ_PHONE_STATE") != 0 || ((i = Build.VERSION.SDK_INT) >= 30 && C19740yt.A01(context, "android.permission.READ_PHONE_NUMBERS") != 0)) {
                return null;
            }
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            String A022 = AnonymousClass17K.A02(r0.A0D);
            if (i >= 22) {
                return this.A00.A04(A022);
            }
            TelephonyManager A0K = this.A04.A0K();
            String line1Number = A0K.getLine1Number();
            A0B a0b = this.A01;
            AnonymousClass1LA r2 = a0b.A00;
            AZ6 az6 = a0b.A04;
            if (A0B.A00(r2, az6, line1Number, A022)) {
                this.A0C.A04("store first iccid");
                return A0K.getSimSerialNumber();
            } else if (A0B.A00(r2, az6, A00("getLine1Number"), A022)) {
                this.A0C.A04("store second iccid");
                return A00("getSimSerialNumber");
            } else {
                if (A0K.getSimSerialNumber() != null) {
                    return A0K.getSimSerialNumber();
                }
                return null;
            }
        } catch (Exception e) {
            this.A0C.A0A("Unable to get device bind ICCID", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        com.whatsapp.util.Log.w("PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: ", r5);
        r1 = "";
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
            r13 = this;
            X.18O r1 = r13.A03
            X.18R r0 = X.AnonymousClass18O.A0Y
            boolean r0 = r1.A09(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00dd
            X.11S r0 = r13.A02
            r0.A0I()
            X.1E8 r0 = r0.A0D
            java.lang.String r3 = X.AnonymousClass17K.A02(r0)
            X.1QE r2 = r13.A0C
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled : device binding status: "
            r7.append(r0)
            X.AXS r0 = r13.A09
            java.lang.String r5 = "device_binding_sim_id"
            java.lang.String r9 = "device_binding_sim_iccid"
            org.json.JSONObject r8 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r11 = "skipDevBinding"
            monitor-enter(r0)     // Catch:{ JSONException -> 0x0091 }
            r10 = 0
            X.1QD r1 = r0.A01     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r6 = r1.A06()     // Catch:{ JSONException -> 0x0044 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0044 }
            if (r1 != 0) goto L_0x004a
            org.json.JSONObject r1 = X.C17880vN.A16(r6)     // Catch:{ JSONException -> 0x0044 }
            boolean r10 = r1.optBoolean(r11, r4)     // Catch:{ JSONException -> 0x0044 }
            goto L_0x004a
        L_0x0044:
            r6 = move-exception
            java.lang.String r1 = "PAY: IndiaUpiPaymentSharedPrefs readDeviceBinding threw: "
            com.whatsapp.util.Log.w(r1, r6)     // Catch:{ all -> 0x008e }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ JSONException -> 0x0091 }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x0091 }
            r6 = 1
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ JSONException -> 0x0091 }
            r1[r4] = r9     // Catch:{ JSONException -> 0x0091 }
            java.lang.String[] r1 = X.AXS.A09(r0, r1)     // Catch:{ JSONException -> 0x0091 }
            r1 = r1[r4]     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r1 = X.C20088A6q.A01(r1)     // Catch:{ JSONException -> 0x0091 }
            r8.put(r9, r1)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ JSONException -> 0x0091 }
            r1[r4] = r5     // Catch:{ JSONException -> 0x0091 }
            java.lang.String[] r1 = X.AXS.A09(r0, r1)     // Catch:{ JSONException -> 0x0091 }
            r1 = r1[r4]     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r1 = X.C20088A6q.A01(r1)     // Catch:{ JSONException -> 0x0091 }
            r8.put(r5, r1)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r6 = r0.A0G()     // Catch:{ JSONException -> 0x0091 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0091 }
            if (r1 != 0) goto L_0x0089
            java.lang.String r1 = "psp"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x0091 }
            java.lang.String r5 = "devBinding"
            boolean r1 = X.AXS.A08(r0, r6)     // Catch:{ JSONException -> 0x0091 }
            r8.put(r5, r1)     // Catch:{ JSONException -> 0x0091 }
        L_0x0089:
            java.lang.String r1 = r8.toString()     // Catch:{ JSONException -> 0x0091 }
            goto L_0x0099
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ JSONException -> 0x0091 }
            throw r1     // Catch:{ JSONException -> 0x0091 }
        L_0x0091:
            r5 = move-exception
            java.lang.String r1 = "PAY: IndiaUpiPaymentSharedPrefs logDeviceBindingStatus threw: "
            com.whatsapp.util.Log.w(r1, r5)
            java.lang.String r1 = ""
        L_0x0099:
            X.AnonymousClass8BV.A1E(r2, r1, r7)
            X.11P r7 = r13.A05
            X.0ve r8 = r13.A07
            X.00H r1 = r13.A0D
            X.1OZ r9 = X.C17880vN.A0U(r1)
            X.A7U r10 = r13.A08
            X.1ex r11 = r13.A0A
            X.8zE r6 = new X.8zE
            r6.<init>(r7, r8, r9, r10, r11)
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 22
            if (r5 < r1) goto L_0x00bc
            X.A6H r0 = r13.A00
            int r0 = r0.A03(r6, r3)
            return r0
        L_0x00bc:
            r12 = 1
            java.lang.String r1 = "Check sim on version < 22"
            r2.A06(r1)
            X.11C r1 = r13.A04
            android.telephony.TelephonyManager r6 = r1.A0K()
            java.lang.String r9 = r6.getLine1Number()
            X.A0B r1 = r13.A01
            X.1LA r11 = r1.A00
            X.AZ6 r10 = r1.A04
            boolean r1 = X.A0B.A00(r11, r10, r9, r3)
            if (r1 == 0) goto L_0x00de
            java.lang.String r0 = "Phone 1 matched"
        L_0x00da:
            r2.A06(r0)
        L_0x00dd:
            return r4
        L_0x00de:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r1 = "checkSimWithWaRegisteredNumberIsInstalled Phone 1 not matched | sim number : "
            r5.append(r1)
            r5.append(r9)
            java.lang.String r8 = " | waNumber : "
            r5.append(r8)
            X.AnonymousClass8BV.A1E(r2, r3, r5)
            java.lang.String r5 = r6.getSimSerialNumber()
            java.lang.String r6 = r0.A0H()
            boolean r0 = android.text.TextUtils.equals(r5, r6)
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "ICCID 1 matched"
            goto L_0x00da
        L_0x0103:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 1 not matched simId : "
            r1.append(r0)
            java.lang.String r0 = X.C20088A6q.A01(r5)
            r1.append(r0)
            java.lang.String r5 = " | storedId : "
            r1.append(r5)
            java.lang.String r0 = X.C20088A6q.A01(r6)
            X.AnonymousClass8BV.A1E(r2, r0, r1)
            java.lang.String r0 = "getLine1Number"
            java.lang.String r7 = r13.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Phone "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " phone2 "
            r1.append(r0)
            X.AnonymousClass8BV.A1E(r2, r7, r1)
            boolean r0 = X.A0B.A00(r11, r10, r7, r3)
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "Phone 2 matched"
            goto L_0x00da
        L_0x0142:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled Phone 2 not matched | sim number : "
            X.C17900vP.A0c(r0, r9, r8, r3, r1)
            X.AnonymousClass8BS.A19(r2, r1)
            java.lang.String r0 = "getSimSerialNumber"
            java.lang.String r3 = r13.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ID"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " ID2 "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)
            r2.A04(r0)
            boolean r0 = android.text.TextUtils.equals(r6, r3)
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = "ICCID 2 matched"
            goto L_0x00da
        L_0x0173:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "checkSimWithWaRegisteredNumberIsInstalled ICCID 2 not matched simId : "
            r1.append(r0)
            java.lang.String r0 = X.C20088A6q.A01(r3)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.C20088A6q.A01(r6)
            X.AnonymousClass8BV.A1E(r2, r0, r1)
            java.lang.String r0 = "IndiaUpiSimSwapDetectionUtils : No ICCID matched on API 22 or lower"
            r2.A06(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19997A2l.A01():int");
    }

    public C19997A2l(AnonymousClass1LA r9, AnonymousClass11S r10, AnonymousClass18O r11, AnonymousClass11C r12, AnonymousClass11P r13, AnonymousClass118 r14, C18030ve r15, A7U a7u, AXS axs, C31061ex r18, AZ6 az6, A0B a0b, AnonymousClass00H r21, AnonymousClass00H r22) {
        AnonymousClass1QE A002 = AnonymousClass1QE.A00("IndiaUpiSimSwapDetectionUtils", "payment", "IN");
        this.A0C = A002;
        this.A06 = r14;
        this.A05 = r13;
        this.A07 = r15;
        this.A02 = r10;
        this.A03 = r11;
        this.A0D = r21;
        AnonymousClass11C r2 = r12;
        this.A04 = r12;
        A0B a0b2 = a0b;
        this.A01 = a0b2;
        this.A0E = r22;
        this.A08 = a7u;
        this.A0A = r18;
        AZ6 az62 = az6;
        this.A0B = az62;
        AXS axs2 = axs;
        this.A09 = axs2;
        if (Build.VERSION.SDK_INT >= 22) {
            this.A00 = new A6H(r2, A002, r9, a0b2, az62, axs2);
        }
    }

    public SmsManager A02(int i) {
        return A6H.A00(i);
    }

    public List A04(Context context) {
        return A6H.A02(context);
    }
}
