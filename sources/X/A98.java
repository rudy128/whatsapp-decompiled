package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import com.whatsapp.Me;
import com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$f55045632c289a1af09ec$1;
import com.whatsapp.registration.integritysignals.F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class A98 {
    public C198509yS A00;
    public String A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass181 A03;
    public final AnonymousClass11C A04;
    public final AnonymousClass118 A05;
    public final C219217x A06;
    public final C19830z4 A07;
    public final AnonymousClass1D9 A08;
    public final C52742bP A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C = C201811d.A00(32855);
    public final AnonymousClass00H A0D = C217517g.A00(32856);
    public final AnonymousClass1LA A0E;
    public final AnonymousClass11S A0F;
    public final AnonymousClass11E A0G;
    public final AnonymousClass11P A0H;
    public final C18000vb A0I;
    public final AnonymousClass19D A0J;
    public final AnonymousClass18K A0K;
    public final A4H A0L;
    public final C31391fU A0M;
    public final C65292wA A0N;
    public final C220418j A0O;
    public final AnonymousClass11W A0P;
    public final AnonymousClass10I A0Q;
    public final AnonymousClass1DA A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;

    public static final List A05(Object[] objArr, int i) {
        int i2 = 0;
        if (i < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Requested element count ");
            A10.append(i);
            throw AnonymousClass001.A12(" is less than zero.", A10);
        } else if (i == 0) {
            return C18460wS.A00;
        } else {
            int length = objArr.length;
            if (i >= length) {
                return C200410p.A0Q(objArr);
            }
            int i3 = 0;
            if (i == 1) {
                return C18070vi.A0M(objArr[0]);
            }
            ArrayList A0z = C17880vN.A0z(i);
            do {
                A0z.add(objArr[i3]);
                i2++;
                if (i2 == i || (i3 = i3 + 1) >= length) {
                    return A0z;
                }
                A0z.add(objArr[i3]);
                i2++;
                break;
            } while ((i3 = i3 + 1) >= length);
            return A0z;
        }
    }

    public static Integer[] A0E(Integer[] numArr, int i, int i2, int i3) {
        return (Integer[]) C200310o.A0F(A0J(A0H(C28851b7.A08(i, numArr.length), numArr)), A0H(new C25411Oc(i2, i3), numArr));
    }

    public static final Object[] A0H(C25411Oc r2, Object[] objArr) {
        if (r2.A04()) {
            return C200310o.A0E(objArr, 0, 0);
        }
        return C200310o.A0E(objArr, r2.A00, r2.A01 + 1);
    }

    public static Object[] A0I(Integer[] numArr, int i) {
        return A0J(A0H(C28851b7.A08(i, numArr.length), numArr));
    }

    public static final Object[] A0J(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return objArr;
        }
        Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), length);
        C18070vi.A0z(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        Object[] objArr2 = (Object[]) newInstance;
        int i = length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                objArr2[i - i2] = objArr[i2];
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        return objArr2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C198819yx A0L(X.C199199zb r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, org.json.JSONObject r32, byte[] r33, boolean r34) {
        /*
            r26 = this;
            r1 = 0
            r13 = r28
            r15 = r29
            boolean r0 = X.C18070vi.A17(r13, r15)
            r5 = r26
            boolean r2 = r5.A0T()
            if (r2 != 0) goto L_0x0019
            java.lang.Integer r2 = X.AnonymousClass00R.A00
            X.9yx r0 = new X.9yx
            r0.<init>(r1, r2)
            return r0
        L_0x0019:
            r5.A0S(r0)
            byte[] r22 = r5.A0V(r13, r15)
            X.118 r2 = r5.A05
            android.content.Context r8 = r2.A00
            X.0z4 r7 = r5.A07
            X.190 r6 = r5.A02
            java.lang.String r3 = "BackupTokenUtils/getTokenByPhoneNumber"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            byte[] r20 = X.C20138A8z.A07(r8, r0)
            r16 = r8
            r17 = r6
            r18 = r7
            r19 = r15
            r21 = r0
            byte[] r4 = X.C20138A8z.A08(r16, r17, r18, r19, r20, r21)
            if (r4 != 0) goto L_0x0048
            byte[] r4 = X.C17970vW.A0H()
            X.C18070vi.A0X(r4)
        L_0x0048:
            r2 = 2
            com.whatsapp.util.Log.i((java.lang.String) r3)
            byte[] r20 = X.C20138A8z.A07(r8, r2)
            r21 = r2
            byte[] r24 = X.C20138A8z.A08(r16, r17, r18, r19, r20, r21)
            r7.A2G(r4)
            X.17x r2 = r5.A06
            boolean r16 = r2.A0I()
            X.11C r3 = r5.A04
            android.telephony.TelephonyManager r2 = r3.A0K()
            if (r2 == 0) goto L_0x00fe
            int r2 = r2.getSimState()
        L_0x006b:
            java.lang.String r14 = java.lang.String.valueOf(r2)
            android.telephony.TelephonyManager r3 = r3.A0K()
            if (r3 == 0) goto L_0x00fb
            java.lang.String r10 = r3.getNetworkOperatorName()
        L_0x0079:
            java.lang.String r2 = ""
            if (r10 != 0) goto L_0x007e
            r10 = r2
        L_0x007e:
            if (r3 == 0) goto L_0x0086
            java.lang.String r9 = r3.getSimOperatorName()
            if (r9 != 0) goto L_0x0087
        L_0x0086:
            r9 = r2
        L_0x0087:
            r25 = r33
            if (r33 != 0) goto L_0x0090
            java.lang.String r2 = "RegistrationHttpManager/checkIfExists/null clientCapabilities"
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0090:
            X.1D6[] r3 = new X.AnonymousClass1D6[r0]
            java.nio.charset.Charset r6 = X.C26571Sq.A05
            r0 = r30
            byte[] r2 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "token"
            X.AnonymousClass1D6.A03(r0, r2, r3, r1)
            java.util.LinkedHashMap r3 = X.AnonymousClass1D7.A0C(r3)
            if (r34 == 0) goto L_0x00b0
            java.lang.String r0 = "poll_2fa"
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "context"
            r3.put(r0, r1)
        L_0x00b0:
            X.00H r0 = r5.A0C
            r0.get()
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            X.C18070vi.A0X(r0)
            java.lang.Integer r0 = X.C137366vL.A00(r0)
            if (r0 == 0) goto L_0x00dc
            int r2 = r0.intValue()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "RegistrationHttpManager/checkIfExists/tmobile_exp:"
            X.C17900vP.A0j(r0, r1, r2)
            java.lang.String r0 = java.lang.String.valueOf(r2)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "tmobile_exp"
            r3.put(r0, r1)
        L_0x00dc:
            r0 = r31
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "mistyped"
            r3.put(r0, r1)
            if (r32 == 0) goto L_0x00f6
            java.lang.String r0 = X.C18070vi.A0H(r32)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "offline_ab"
            r3.put(r0, r1)
        L_0x00f6:
            org.json.JSONObject r12 = r27.A01()
            goto L_0x0101
        L_0x00fb:
            r10 = 0
            goto L_0x0079
        L_0x00fe:
            r2 = -1
            goto L_0x006b
        L_0x0101:
            java.lang.String r11 = "was_activated_from_stub"
            java.lang.String r0 = "downloader_stub"
            r2 = 0
            android.content.SharedPreferences r1 = r8.getSharedPreferences(r0, r2)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r0 = "activated"
            boolean r0 = r1.getBoolean(r0, r2)     // Catch:{ JSONException -> 0x0114 }
            r12.put(r11, r0)     // Catch:{ JSONException -> 0x0114 }
            goto L_0x0119
        L_0x0114:
            java.lang.String r0 = "RegistrationHttpManager/Failed to add stub activation metric."
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0119:
            java.lang.String r0 = X.C18070vi.A0H(r12)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "client_metrics"
            r3.put(r0, r1)
            java.lang.String r0 = X.AnonymousClass8BS.A0b(r16)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "read_phone_permission_granted"
            r3.put(r0, r1)
            byte[] r1 = X.C18070vi.A1A(r14, r6)
            java.lang.String r0 = "sim_state"
            r3.put(r0, r1)
            byte[] r1 = X.C18070vi.A1A(r10, r6)
            java.lang.String r0 = "network_operator_name"
            r3.put(r0, r1)
            byte[] r1 = X.C18070vi.A1A(r9, r6)
            java.lang.String r0 = "sim_operator_name"
            r3.put(r0, r1)
            java.lang.String r0 = android.os.Build.DEVICE
            X.C18070vi.A0Z(r0)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "device_name"
            r3.put(r0, r1)
            X.00H r10 = r7.A00
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r10)
            java.lang.String r1 = "backup_token_retrieval_error"
            java.lang.String r0 = "default-value"
            java.lang.String r1 = r2.getString(r1, r0)
            if (r1 == 0) goto L_0x017b
            int r0 = r1.length()
            if (r0 == 0) goto L_0x017b
            byte[] r1 = X.C18070vi.A1A(r1, r6)
            java.lang.String r0 = "backup_token_error"
            r3.put(r0, r1)
        L_0x017b:
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r10)
            java.lang.String r1 = "pref_autoconf_feo2_query_status"
            java.lang.String r0 = "did_not_query"
            java.lang.String r0 = r2.getString(r1, r0)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "feo2_query_status"
            r3.put(r0, r1)
            java.util.ArrayList r0 = X.C20013A3d.A00(r8)
            boolean r0 = X.C17880vN.A1X(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = X.C18070vi.A1A(r0, r6)
            java.lang.String r0 = "is_foa_fdid_app_installed"
            r3.put(r0, r1)
            A08(r5, r3)
            A0B(r5, r3)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r10)
            java.lang.String r2 = "language_selector_time_spent"
            long r0 = X.C17890vO.A05(r0, r2)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r10)
            java.lang.String r8 = "language_selector_clicked_count"
            int r0 = X.C17890vO.A00(r0, r8)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            byte[] r0 = X.C18070vi.A1A(r9, r6)
            r3.put(r2, r0)
            byte[] r0 = X.C18070vi.A1A(r1, r6)
            r3.put(r8, r0)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r7)
            X.C17880vN.A1B(r0, r8)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r7)
            X.C17880vN.A1B(r0, r2)
            A0A(r5, r3)
            A07(r5, r3)
            r5.A0R(r3)
            A06(r5, r3)
            A09(r5, r3)
            A0C(r5, r3)
            X.00H r0 = r5.A0B
            java.lang.Object r0 = r0.get()
            X.2jJ r0 = (X.C57582jJ) r0
            r0.A00()
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r7)
            java.lang.String r0 = "registration_push_notif_code"
            X.C17880vN.A1E(r1, r0, r2)
            java.lang.String r1 = r7.A0g()
            if (r1 == 0) goto L_0x0225
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0225
            byte[] r1 = X.C18070vi.A1A(r1, r6)
            java.lang.String r0 = "push_token"
            r3.put(r0, r1)
        L_0x0225:
            X.A7d r16 = A00(r5)
            java.lang.String r0 = "exist_entrypoint"
            java.lang.String r19 = r5.A0P(r13, r0)
            java.util.List r20 = A04(r5)
            X.2bP r0 = r5.A09
            X.9CK r14 = new X.9CK
            r23 = r4
            r21 = r3
            r18 = r15
            r15 = r0
            r17 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.Object r0 = X.C19951A0i.A00(r14)
            X.9yx r0 = (X.C198819yx) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A98.A0L(X.9zb, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.json.JSONObject, byte[], boolean):X.9yx");
    }

    public C198499yR A0M(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C18070vi.A0h(str, str2);
        if (!A0T()) {
            return new C198499yR();
        }
        Log.i("RegistrationHttpManager/checkPreChatdABProps/wamsys/reg-onboard-abprop-request");
        LinkedHashMap A13 = C17880vN.A13();
        String obj = Integer.valueOf(AnonymousClass9K5.RELEASE.value).toString();
        if (obj == null) {
            obj = "";
        }
        Charset charset = C26571Sq.A05;
        A13.put("rc", C18070vi.A1A(obj, charset));
        String A0r = C17880vN.A0r(C17890vO.A0B(this.A07), "pref_pre_chatd_ab_hash");
        if (A0r != null) {
            A13.put("ab_hash", C18070vi.A1A(A0r, charset));
        }
        return (C198499yR) C19951A0i.A00(new AnonymousClass9CD(this.A09, A00(this), str3, str4, A13));
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.9Na] */
    public C180559Na A0N(C199199zb r14, String str, String str2, String str3, String str4) {
        byte[] bArr;
        String str5 = str;
        String str6 = str2;
        boolean A16 = C18070vi.A16(str, str6);
        if (!A0T()) {
            AnonymousClass9IN r1 = AnonymousClass9IN.ERROR_FAIL_TO_INITIALIZE_WAMSYS;
            ? obj = new Object();
            obj.A03 = r1;
            return obj;
        }
        int i = 1;
        A0S(A16);
        byte[] A0V = A0V(str, str6);
        byte[] A0U = A0U("resetSecurityCode");
        LinkedHashMap A13 = C17880vN.A13();
        String A0H2 = C18070vi.A0H(r14.A01());
        Charset charset = C26571Sq.A05;
        A13.put("client_metrics", C18070vi.A1A(A0H2, charset));
        A06(this, A13);
        String str7 = str4;
        if (str4 != null) {
            bArr = C18070vi.A1A(str7, charset);
        } else {
            bArr = null;
        }
        String str8 = str3;
        if ("wipe".equals(str8)) {
            i = 2;
        } else if (!"email".equals(str8)) {
            i = 0;
        }
        return (C180559Na) C19951A0i.A00(new AnonymousClass9CM(this.A09, A00(this), (String) null, str5, str6, A0P(str, "security_entrypoint"), A04(this), A13, bArr, A0V, A0U, i));
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [java.lang.Object, X.9Na] */
    public C180559Na A0O(C199199zb r15, String str, String str2, String str3, AnonymousClass1D6 r19, AnonymousClass1D6 r20, AnonymousClass1D6 r21, AnonymousClass1D6 r22) {
        String str4 = str;
        String str5 = str2;
        boolean A17 = C18070vi.A17(str4, str5);
        if (!A0T()) {
            AnonymousClass9IN r1 = AnonymousClass9IN.ERROR_FAIL_TO_INITIALIZE_WAMSYS;
            ? obj = new Object();
            obj.A03 = r1;
            return obj;
        }
        A0S(A17);
        byte[] A0V = A0V(str4, str5);
        byte[] A0U = A0U("verifySecurityCode");
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass1D6 r0 = r19;
        if (r19 != null) {
            AnonymousClass1D6 r4 = r20;
            if (r20 != null) {
                AnonymousClass1D6 r3 = r21;
                if (r21 != null) {
                    Object obj2 = r0.first;
                    Charset charset = C26571Sq.A05;
                    A13.put(obj2, C18070vi.A1A((String) r0.second, charset));
                    A13.put(r4.first, C18070vi.A1A((String) r4.second, charset));
                    A13.put(r3.first, C18070vi.A1A((String) r3.second, charset));
                }
            }
        }
        AnonymousClass1D6 r02 = r22;
        if (r22 != null) {
            A13.put(r02.first, C108975cc.A1O((String) r02.second));
        }
        A13.put("client_metrics", C108975cc.A1O(C18070vi.A0H(r15.A01())));
        A08(this, A13);
        A0B(this, A13);
        A06(this, A13);
        A0A(this, A13);
        return (C180559Na) C19951A0i.A00(new AnonymousClass9CM(this.A09, A00(this), str3, str4, str5, A0P(str4, "security_entrypoint"), A04(this), A13, (byte[]) null, A0V, A0U, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r0 == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ InterruptedException -> 0x003e }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch     // Catch:{ InterruptedException -> 0x003e }
            r4.<init>(r0)     // Catch:{ InterruptedException -> 0x003e }
            X.1DA r5 = r6.A0R     // Catch:{ InterruptedException -> 0x003e }
            r3 = 0
            if (r7 == 0) goto L_0x000c
            r3 = r4
        L_0x000c:
            boolean r0 = r5.A00     // Catch:{ InterruptedException -> 0x003e }
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "blacknoise: not boostrapped for reg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x003e }
            if (r3 == 0) goto L_0x002e
            goto L_0x002b
        L_0x0018:
            X.10I r2 = r5.A06     // Catch:{ InterruptedException -> 0x003e }
            r0 = 39
            X.7RN r1 = new X.7RN     // Catch:{ InterruptedException -> 0x003e }
            r1.<init>(r5, r3, r0)     // Catch:{ InterruptedException -> 0x003e }
            java.lang.String r0 = "regtime_ka"
            boolean r0 = r2.CGO(r1, r0)     // Catch:{ InterruptedException -> 0x003e }
            if (r3 == 0) goto L_0x002e
            if (r0 != 0) goto L_0x002e
        L_0x002b:
            r3.countDown()     // Catch:{ InterruptedException -> 0x003e }
        L_0x002e:
            if (r7 == 0) goto L_0x0044
            X.19D r1 = r6.A0J     // Catch:{ InterruptedException -> 0x003e }
            r0 = 4696(0x1258, float:6.58E-42)
            long r1 = X.AnonymousClass8BR.A05(r1, r0)     // Catch:{ InterruptedException -> 0x003e }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x003e }
            r4.await(r1, r0)     // Catch:{ InterruptedException -> 0x003e }
            return
        L_0x003e:
            r1 = move-exception
            java.lang.String r0 = "blacknoise: bad reg time work"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A98.A0S(boolean):void");
    }

    public static C20100A7d A00(A98 a98) {
        return (C20100A7d) a98.A0D.get();
    }

    public static final LinkedHashMap A01(C165038aU r8, A98 a98, AnonymousClass99E r10, String str, int i) {
        String str2;
        String str3;
        String simOperatorName;
        TelephonyManager A0K2 = a98.A04.A0K();
        String str4 = null;
        if (A0K2 != null) {
            str2 = A0K2.getNetworkOperator();
        } else {
            str2 = null;
        }
        A6P A002 = A6P.A00(str2);
        if (A0K2 != null) {
            str3 = A0K2.getSimOperator();
        } else {
            str3 = null;
        }
        A6P A003 = A6P.A00(str3);
        if (A0K2 != null) {
            str4 = A0K2.getNetworkOperatorName();
        }
        String str5 = "";
        if (str4 == null) {
            str4 = str5;
        }
        if (!(A0K2 == null || (simOperatorName = A0K2.getSimOperatorName()) == null)) {
            str5 = simOperatorName;
        }
        Log.i("RegistrationHttpManager/msys/verify");
        LinkedHashMap A13 = C17880vN.A13();
        if (str != null) {
            A13.put("mistyped", C108975cc.A1O(str));
        }
        if (r8 != null) {
            byte[] encode = Base64.encode(r8.A0M(), 11);
            C18070vi.A0X(encode);
            A13.put("vname", encode);
        }
        String A0H2 = C18070vi.A0H(r10.A01());
        Charset charset = C26571Sq.A05;
        A13.put("client_metrics", C18070vi.A1A(A0H2, charset));
        A13.put("entered", C18070vi.A1A(String.valueOf(i), charset));
        A0D(A002, A003, charset, A13);
        A13.put("network_operator_name", C18070vi.A1A(str4, charset));
        A13.put("sim_operator_name", C18070vi.A1A(str5, charset));
        A06(a98, A13);
        A09(a98, A13);
        return A13;
    }

    public static final List A04(A98 a98) {
        A4H a4h = a98.A0L;
        try {
            A4H.A00(a4h);
        } catch (IOException e) {
            Log.e("DomainFrontingManager/get-providers/error getting providers from the file", e);
        }
        ArrayList A13 = AnonymousClass000.A13();
        A13.addAll(a4h.A05);
        A13.addAll(a4h.A06);
        A13.addAll(a4h.A04);
        ArrayList A0D2 = C29351c6.A0D(A13);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            C186789el r3 = (C186789el) it.next();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(r3.A02);
            A10.append(" ");
            A10.append(r3.A01);
            A10.append(" ");
            A10.append(r3.A03);
            C108955ca.A1U(A10, A0D2);
        }
        return A0D2;
    }

    public static final void A07(A98 a98, Map map) {
        if (C18020vd.A05(C18040vf.A02, a98.A0J, 7999)) {
            ContentResolver contentResolver = a98.A05.A00.getContentResolver();
            Integer[] numArr = new Integer[16];
            int A1b = C72453Mb.A1b(numArr, 37);
            boolean A1b2 = AnonymousClass8BU.A1b(numArr, 51);
            numArr[2] = 36;
            C17890vO.A1G(numArr, 52);
            numArr[4] = 41;
            AnonymousClass3Ma.A1U(numArr, 39);
            C17880vN.A1T(numArr, 16, 6);
            numArr[7] = 11;
            numArr[8] = 33;
            numArr[9] = 41;
            numArr[10] = 34;
            C17880vN.A1T(numArr, 13, 11);
            AnonymousClass3MX.A1R(numArr, 12);
            C17880vN.A1T(numArr, 10, 13);
            numArr[14] = 46;
            numArr[15] = 46;
            Integer[] A0E2 = A0E(A0F(numArr, 11, 16, A1b), 8, A1b, 7);
            Integer[] A0F2 = A0F(A0E2, 15, A0E2.length, A1b);
            Integer[] A0F3 = A0F(A0F2, 15, A0F2.length, A1b);
            Integer[] A0G2 = A0G(A0F3, A0I(A0F3, 7), A1b, 6);
            Integer[] A0F4 = A0F(A0G2, 10, A0G2.length, A1b);
            Integer[] A0G3 = A0G(A0F4, A0I(A0F4, 7), A1b, 6);
            Integer[] A0F5 = A0F(A0G3, 12, A0G3.length, A1b);
            Integer[] A0F6 = A0F(A0F5, 15, A0F5.length, A1b);
            Integer[] A0F7 = A0F(A0F6, 16, A0F6.length, A1b);
            int length = A0F7.length - (A1b2 ? 1 : 0);
            while (A1b < length) {
                C17880vN.A1T(A0F7, A0F7[A1b].intValue() - A1b, A1b);
                A1b++;
            }
            List A052 = A05(A0F7, A0F7[15].intValue());
            ArrayList A0E3 = C29351c6.A0E(A052);
            Iterator it = A052.iterator();
            while (it.hasNext()) {
                A0E3.add(Character.valueOf((char) (C72453Mb.A0H(it) + 64)));
            }
            int i = Settings.Global.getInt(contentResolver, C29431cG.A0g("", "", "", A0E3, (C22821Di) null), 0);
            Integer[] numArr2 = new Integer[4];
            numArr2[0] = 36;
            C17880vN.A1T(numArr2, 35, A1b2);
            numArr2[2] = 3;
            C17880vN.A1T(numArr2, 2, 3);
            Integer[] A0G4 = A0G(numArr2, A0J(A0H(new C25411Oc(4, 3), numArr2)), 0, 3);
            Integer[] A0E4 = A0E(A0E(A0E(A0G(A0G4, A0I(A0G4, 3), 0, 2), 3, 0, 2), 4, 0, 3), 4, 0, 3);
            Integer[] A0E5 = A0E(A0G(A0E4, A0I(A0E4, 3), 0, 2), 4, 0, 3);
            Integer[] A0E6 = A0E(A0E(A0G(A0E5, A0I(A0E5, 3), 0, 2), 4, 0, 3), 4, 0, 3);
            int length2 = A0E6.length - A1b2;
            for (int i2 = 0; i2 < length2; i2++) {
                C17880vN.A1T(A0E6, A0E6[i2].intValue() - i2, i2);
            }
            List A053 = A05(A0E6, A0E6[3].intValue());
            ArrayList A0D2 = C29351c6.A0D(A053);
            Iterator it2 = A053.iterator();
            while (it2.hasNext()) {
                A0D2.add(Character.valueOf((char) (C72453Mb.A0H(it2) + 64)));
            }
            map.put(C29431cG.A0g("", "", "", A0D2, (C22821Di) null), C108975cc.A1O(String.valueOf(i)));
        }
    }

    public static final void A08(A98 a98, Map map) {
        String str = a98.A01;
        if (str == null) {
            str = new DecimalFormat("#.##").format(((double) C24171Jd.A02(a98.A04)) / 1.073741824E9d);
            a98.A01 = str;
            if (str == null) {
                throw C17880vN.A0g();
            }
        }
        map.put("device_ram", C108975cc.A1O(str));
    }

    public static final void A09(A98 a98, Map map) {
        int i;
        int i2;
        TelephonyManager A0K2;
        int i3;
        AnonymousClass19D r4 = a98.A0J;
        C18040vf r3 = C18040vf.A02;
        if (C18020vd.A05(r3, r4, 4435)) {
            if (C18020vd.A05(r3, r4, 4399)) {
                TelephonyManager A0K3 = a98.A04.A0K();
                if (A0K3 == null) {
                    i3 = 2;
                } else {
                    i3 = 1;
                    if (A0K3.getSimState() == 1) {
                        i3 = 0;
                    }
                }
                map.put("sim_type", C108975cc.A1O(String.valueOf(i3)));
            }
            if (C18020vd.A05(r3, r4, 4400)) {
                map.put("airplane_mode_type", C108975cc.A1O(String.valueOf(AnonymousClass11E.A02(a98.A05.A00) ? 1 : 0)));
            }
            if (C18020vd.A05(r3, r4, 4401)) {
                AnonymousClass11C r2 = a98.A04;
                if (Build.VERSION.SDK_INT < 28 || (A0K2 = r2.A0K()) == null || A0K2.getSignalStrength() == null) {
                    i2 = 5;
                } else {
                    i2 = A0K2.getSignalStrength().getLevel();
                }
                map.put("cellular_strength", C108975cc.A1O(String.valueOf(i2)));
            }
            if (C18020vd.A05(r3, r4, 4402) && a98.A0G.A04() != null) {
                TelephonyManager A0K4 = a98.A04.A0K();
                if (A0K4 != null) {
                    i = A0K4.isNetworkRoaming();
                } else {
                    i = 2;
                }
                map.put("roaming_type", C108975cc.A1O(String.valueOf(i)));
            }
        }
    }

    public static final void A0A(A98 a98, Map map) {
        AnonymousClass00H r5 = a98.A0S;
        C188119gu r3 = (C188119gu) r5.get();
        if (!C18020vd.A05(C18040vf.A02, r3.A03, 3753)) {
            Log.w("094F163801F883C27FD4");
            return;
        }
        Boolean bool = C17970vW.A01;
        F43FA254595FE297CBAE8$f55045632c289a1af09ec$1 f43FA254595FE297CBAE8$f55045632c289a1af09ec$1 = new F43FA254595FE297CBAE8$f55045632c289a1af09ec$1(r3, (C30391dr) null);
        AnonymousClass1OR r6 = AnonymousClass1OR.A00;
        C197949xX r0 = (C197949xX) AnonymousClass4GT.A00(r6, f43FA254595FE297CBAE8$f55045632c289a1af09ec$1);
        if (r0 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            map.put("gpia", C108975cc.A1O((String) AnonymousClass4GT.A00(r6, new F43FA254595FE297CBAE8$fc2fddb3af70aaa205f6f$1((C188119gu) r5.get(), r0.A01, (C30391dr) null, r0.A00))));
            C22681Cu r2 = new C22681Cu();
            r2.A00 = C108945cZ.A1B(System.currentTimeMillis(), currentTimeMillis);
            r2.A02 = "gpia-param-prepare";
            a98.A0K.CC7(r2);
        }
    }

    public static final void A0B(A98 a98, Map map) {
        Me A072 = a98.A0F.A07();
        if (A072 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A072.cc);
            map.put("old_phone_number", C108975cc.A1O(AnonymousClass000.A0y(A072.number, A10)));
        }
    }

    public static final void A0C(A98 a98, Map map) {
        C57082iV BX3 = a98.A0N.BX3();
        String str = BX3.A01;
        if (!AnonymousClass1EG.A0H(str)) {
            StringBuilder A11 = AnonymousClass000.A11(str);
            A11.append('|');
            map.put("fid", C108975cc.A1O(C17880vN.A0u(A11, C17880vN.A04(BX3.A00))));
        }
    }

    public static void A0D(A6P a6p, A6P a6p2, Charset charset, Map map) {
        String str = a6p.A00;
        C18070vi.A0X(str);
        byte[] bytes = str.getBytes(charset);
        C18070vi.A0X(bytes);
        map.put("mcc", bytes);
        String str2 = a6p.A01;
        C18070vi.A0X(str2);
        byte[] bytes2 = str2.getBytes(charset);
        C18070vi.A0X(bytes2);
        map.put("mnc", bytes2);
        String str3 = a6p2.A00;
        C18070vi.A0X(str3);
        byte[] bytes3 = str3.getBytes(charset);
        C18070vi.A0X(bytes3);
        map.put("sim_mcc", bytes3);
        String str4 = a6p2.A01;
        C18070vi.A0X(str4);
        byte[] bytes4 = str4.getBytes(charset);
        C18070vi.A0X(bytes4);
        map.put("sim_mnc", bytes4);
    }

    public static Integer[] A0G(Object[] objArr, Object[] objArr2, int i, int i2) {
        return (Integer[]) C200310o.A0F(objArr2, A0H(new C25411Oc(i, i2), objArr));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0P(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r4 = " failed"
            java.lang.String r3 = "RegistrationHttpManager/RegistrationHelper/getAdvertisingId at "
            r2 = 0
            java.lang.String r1 = "eu"
            X.1LA r0 = r5.A0E     // Catch:{ BYT | C1p | IOException -> 0x001c }
            java.lang.String r0 = r0.A04(r6)     // Catch:{ BYT | C1p | IOException -> 0x001c }
            boolean r0 = r1.equals(r0)     // Catch:{ BYT | C1p | IOException -> 0x001c }
            if (r0 != 0) goto L_0x0024
            X.118 r0 = r5.A05     // Catch:{ BYT | C1p | IOException -> 0x001c }
            android.content.Context r0 = r0.A00     // Catch:{ BYT | C1p | IOException -> 0x001c }
            X.CVo r0 = X.C25731Cl1.A00(r0)     // Catch:{ BYT | C1p | IOException -> 0x001c }
            goto L_0x0025
        L_0x001c:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r3)
            X.C17900vP.A0h(r7, r4, r0, r1)
        L_0x0024:
            r0 = r2
        L_0x0025:
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = r0.A00
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A98.A0P(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        if (r5 != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bd, code lost:
        if (r5 != null) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(java.util.Map r9) {
        /*
            r8 = this;
            X.00H r4 = r8.A0T
            java.lang.Object r0 = r4.get()
            X.9p7 r0 = (X.C192869p7) r0
            X.0z4 r0 = r0.A07
            X.00H r1 = r0.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r1)
            java.lang.String r5 = "less_beep_beep_identi"
            r6 = 0
            java.lang.String r2 = r0.getString(r5, r6)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r1)
            java.lang.String r3 = "less_beep_beep_time"
            long r0 = X.C17890vO.A04(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r2 == 0) goto L_0x002b
            X.0yx r6 = X.AnonymousClass8BR.A0B(r2, r0)
        L_0x002b:
            r7 = 0
            if (r6 == 0) goto L_0x00c6
            java.lang.Object r6 = r6.A00
            java.lang.String r6 = (java.lang.String) r6
        L_0x0032:
            java.lang.Object r0 = r4.get()
            X.9p7 r0 = (X.C192869p7) r0
            X.0z4 r0 = r0.A07
            X.00H r1 = r0.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r1)
            java.lang.String r2 = r0.getString(r5, r7)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r1)
            long r0 = X.C17890vO.A04(r0, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r2 == 0) goto L_0x00c4
            X.0yx r0 = X.AnonymousClass8BR.A0B(r2, r0)
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r1 = r0.A01
            java.lang.Number r1 = (java.lang.Number) r1
        L_0x005c:
            java.lang.Object r0 = r4.get()
            X.9p7 r0 = (X.C192869p7) r0
            java.lang.Exception r5 = r0.A03
            if (r1 == 0) goto L_0x00c2
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r1.longValue()
            java.lang.Long r3 = X.C108945cZ.A1B(r2, r0)
        L_0x0072:
            org.json.JSONObject r2 = X.C17880vN.A15()
            if (r6 == 0) goto L_0x00c0
            r0 = 7500(0x1d4c, float:1.051E-41)
            java.lang.String r1 = X.C29361c9.A0Q(r6, r0)
        L_0x007e:
            java.lang.String r0 = "token"
            r2.put(r0, r1)
            if (r6 == 0) goto L_0x0089
            java.lang.Integer r7 = X.AnonymousClass8BT.A0j(r6)
        L_0x0089:
            java.lang.String r0 = "token_length"
            r2.put(r0, r7)
            java.lang.String r0 = "token_age"
            r2.put(r0, r3)
            if (r6 == 0) goto L_0x00bd
            if (r5 == 0) goto L_0x00af
        L_0x0097:
            java.lang.String r1 = r5.toString()
            if (r1 == 0) goto L_0x00a2
            java.lang.String r0 = "error"
            r2.put(r0, r1)
        L_0x00a2:
            java.lang.Object r0 = r4.get()
            X.9p7 r0 = (X.C192869p7) r0
            X.9IK r1 = r0.A02
            java.lang.String r0 = "stage"
            r2.put(r0, r1)
        L_0x00af:
            java.lang.String r0 = X.C18070vi.A0H(r2)
            byte[] r1 = X.C108975cc.A1O(r0)
            java.lang.String r0 = "recaptcha"
            r9.put(r0, r1)
            return
        L_0x00bd:
            if (r5 == 0) goto L_0x00a2
            goto L_0x0097
        L_0x00c0:
            r1 = r7
            goto L_0x007e
        L_0x00c2:
            r3 = r7
            goto L_0x0072
        L_0x00c4:
            r1 = r7
            goto L_0x005c
        L_0x00c6:
            r6 = r7
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A98.A0R(java.util.Map):void");
    }

    public final boolean A0T() {
        String str = this.A0M.BX3().A01;
        AnonymousClass1DA r1 = this.A0R;
        AnonymousClass118 r3 = this.A05;
        AnonymousClass11W r7 = this.A0P;
        AnonymousClass10I r8 = this.A0Q;
        if (r1.A03(this.A03, r3, this.A07, this.A0I, this.A0O, r7, r8, str, (String) ((AnonymousClass2ZS) this.A0A.get()).A00.get())) {
            return true;
        }
        Log.e("RegistrationHttpManager/ensureWamsysForRegBootstrapped/waMsysSetup.bootstrapForReg failed");
        return false;
    }

    public byte[] A0U(String str) {
        C19830z4 r2 = this.A07;
        byte[] A2d = r2.A2d();
        C18070vi.A0X(A2d);
        if (A2d.length != 0) {
            return A2d;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RegistrationHttpManager/");
        A10.append(str);
        C17890vO.A1A(A10, "/no backup token read from shared preferences, generate a new one");
        byte[] A0H2 = C17970vW.A0H();
        C18070vi.A0X(A0H2);
        r2.A2G(A0H2);
        return A0H2;
    }

    public byte[] A0V(String str, String str2) {
        Context A0E2 = C108945cZ.A0E(this.A05);
        String A002 = C181659Ri.A00(C17900vP.A0A(str, str2));
        byte[] A0J2 = C17970vW.A0J(A0E2, A002);
        if (A0J2 != null) {
            return A0J2;
        }
        byte[] A0H2 = C17970vW.A0H();
        C17970vW.A0E(A0E2, A002, A0H2);
        return A0H2;
    }

    public static final LinkedHashMap A02(A98 a98, C199199zb r5, A6P a6p, A6P a6p2, String str, String str2) {
        LinkedHashMap A13 = C17880vN.A13();
        if (str2 != null) {
            A13.put("mistyped", C108975cc.A1O(str2));
        }
        Charset charset = C26571Sq.A05;
        A13.put("reason", C18070vi.A1A(str, charset));
        A13.put("client_metrics", C18070vi.A1A(C18070vi.A0H(r5.A01()), charset));
        A0D(a6p, a6p2, charset, A13);
        A06(a98, A13);
        return A13;
    }

    public static final LinkedHashMap A03(A98 a98, AnonymousClass99F r7, A6P a6p, A6P a6p2, String str, String str2, String str3) {
        LinkedHashMap A13 = C17880vN.A13();
        if (str2 != null) {
            A13.put("mistyped", C108975cc.A1O(str2));
        }
        Charset charset = C26571Sq.A05;
        A13.put("reason", C18070vi.A1A(str, charset));
        if (str3 != null) {
            A13.put("hasav", C18070vi.A1A(str3, charset));
        }
        A13.put("client_metrics", C18070vi.A1A(C18070vi.A0H(r7.A01()), charset));
        A0D(a6p, a6p2, charset, A13);
        AnonymousClass00H r5 = a98.A07.A00;
        A13.put("education_screen_displayed", C18070vi.A1A(String.valueOf(C17880vN.A0B(r5).getBoolean("pref_flash_call_education_screen_displayed", false)), charset));
        A13.put("prefer_sms_over_flash", C18070vi.A1A(String.valueOf(C17880vN.A0B(r5).getBoolean("pref_prefer_sms_over_flash", false)), charset));
        A06(a98, A13);
        A09(a98, A13);
        String string = C17880vN.A0B(r5).getString("registration_push_notif_code", (String) null);
        if (!(string == null || string.length() == 0)) {
            A13.put("push_code", C18070vi.A1A(string, charset));
        }
        String string2 = C17880vN.A0B(r5).getString("pref_multi_account_priming_token", (String) null);
        if (!(string2 == null || string2.length() == 0)) {
            A13.put("new_acc_uuid", C18070vi.A1A(string2, charset));
        }
        return A13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r0.length() < 6) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.A98 r6, java.util.Map r7) {
        /*
            r7.size()
            X.11E r0 = r6.A0G
            X.1LR r0 = r0.A04()
            java.lang.Integer r0 = X.AnonymousClass1LS.A00(r0)
            if (r0 != 0) goto L_0x0091
            r0 = -1
        L_0x0010:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.nio.charset.Charset r2 = X.C26571Sq.A05
            byte[] r1 = X.C18070vi.A1A(r0, r2)
            java.lang.String r0 = "network_radio_type"
            r7.put(r0, r1)
            X.118 r5 = r6.A05
            X.11C r1 = r6.A04
            X.17x r0 = r6.A06
            java.lang.String r0 = X.C20056A5f.A01(r1, r5, r0)
            if (r0 == 0) goto L_0x0033
            int r3 = r0.length()
            r0 = 6
            r1 = 1
            if (r3 >= r0) goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            java.lang.String r4 = "1"
            java.lang.String r3 = "0"
            r0 = r3
            if (r1 == 0) goto L_0x003c
            r0 = r4
        L_0x003c:
            byte[] r1 = X.C18070vi.A1A(r0, r2)
            java.lang.String r0 = "simnum"
            r7.put(r0, r1)
            android.content.Context r1 = r5.A00
            java.lang.Boolean r0 = X.C17970vW.A01
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r0 = "rc2"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x005a
            r4 = r3
        L_0x005a:
            byte[] r1 = X.C18070vi.A1A(r4, r2)
            java.lang.String r0 = "hasinrc"
            r7.put(r0, r1)
            int r0 = android.os.Process.myPid()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            byte[] r1 = X.C18070vi.A1A(r0, r2)
            java.lang.String r0 = "pid"
            r7.put(r0, r1)
            X.9K5 r0 = X.AnonymousClass9K5.RELEASE
            int r0 = r0.value
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = ""
        L_0x0084:
            byte[] r1 = X.C18070vi.A1A(r0, r2)
            java.lang.String r0 = "rc"
            r7.put(r0, r1)
            r7.size()
            return
        L_0x0091:
            int r0 = r0.intValue()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A98.A06(X.A98, java.util.Map):void");
    }

    public static Integer[] A0F(Object[] objArr, int i, int i2, int i3) {
        return (Integer[]) C200310o.A0F(A0J(A0H(C28851b7.A08(i, i2), objArr)), A0H(C28851b7.A08(i3, i), objArr));
    }

    public C130846k6 A0K(String str, String str2, String str3, String str4) {
        if (!A0T()) {
            return new C130846k6(AnonymousClass00R.A01);
        }
        byte[] A0V = A0V(str, str2);
        byte[] A0U = A0U("consent");
        C20100A7d A002 = A00(this);
        String A0r = C17880vN.A0r(C17890vO.A0B(this.A07), "2fa");
        String A0P2 = A0P(str, "consent_entrypoint");
        return (C130846k6) C19951A0i.A00(new C122296Os(this.A09, A002, str, str2, str3, A0r, A0P2, str4, A0V, A0U));
    }

    public void A0Q(String str, String str2, String str3, String str4, String str5, Map map) {
        if (A0T()) {
            byte[] A0V = A0V(str, str2);
            byte[] A0U = A0U("sendClientFunnelLog");
            C20100A7d A002 = A00(this);
            C19951A0i.A00(new AnonymousClass9CI(this.A09, A002, str, str2, str3, str4, str5, map, A0V, A0U));
        }
    }

    public A98(AnonymousClass1LA r29, AnonymousClass190 r30, AnonymousClass11S r31, AnonymousClass181 r32, AnonymousClass11E r33, AnonymousClass11C r34, AnonymousClass11P r35, AnonymousClass118 r36, C219217x r37, C19830z4 r38, C18000vb r39, AnonymousClass19D r40, AnonymousClass18K r41, A4H a4h, AnonymousClass1D9 r43, C31391fU r44, C65292wA r45, C220418j r46, AnonymousClass11W r47, AnonymousClass10I r48, C52742bP r49, AnonymousClass1DA r50, AnonymousClass00H r51, AnonymousClass00H r52, AnonymousClass00H r53, AnonymousClass00H r54) {
        AnonymousClass11W r9 = r47;
        AnonymousClass10I r8 = r48;
        AnonymousClass11S r25 = r31;
        AnonymousClass11P r21 = r35;
        AnonymousClass118 r20 = r36;
        C18070vi.A0w(r21, r25, r9, r20, r8);
        AnonymousClass1D9 r13 = r43;
        C31391fU r12 = r44;
        AnonymousClass1DA r6 = r50;
        AnonymousClass181 r24 = r32;
        AnonymousClass18K r15 = r41;
        C18070vi.A0x(r24, r15, r6, r12, r13);
        C65292wA r11 = r45;
        AnonymousClass00H r5 = r51;
        AnonymousClass11C r22 = r34;
        C18000vb r17 = r39;
        AnonymousClass19D r16 = r40;
        C18070vi.A0y(r11, r5, r22, r17, r16);
        C220418j r10 = r46;
        C219217x r19 = r37;
        C19830z4 r18 = r38;
        AnonymousClass1LA r27 = r29;
        C18070vi.A0t(r27, r10, r19, r18);
        A4H a4h2 = a4h;
        C52742bP r7 = r49;
        AnonymousClass00H r4 = r52;
        AnonymousClass190 r26 = r30;
        C18070vi.A0u(r26, r7, r4, a4h2);
        AnonymousClass00H r3 = r53;
        C18070vi.A0d(r3, 24);
        AnonymousClass11E r23 = r33;
        C18070vi.A0d(r23, 25);
        AnonymousClass00H r2 = r54;
        C18070vi.A0d(r2, 26);
        this.A0H = r21;
        this.A0F = r25;
        this.A0P = r9;
        this.A05 = r20;
        this.A0Q = r8;
        this.A03 = r24;
        this.A0K = r15;
        this.A0R = r6;
        this.A0M = r12;
        this.A08 = r13;
        this.A0N = r11;
        this.A0S = r5;
        this.A04 = r22;
        this.A0I = r17;
        this.A0J = r16;
        this.A0E = r27;
        this.A0O = r10;
        this.A06 = r19;
        this.A07 = r18;
        this.A02 = r26;
        this.A09 = r7;
        this.A0B = r4;
        this.A0L = a4h2;
        this.A0T = r3;
        this.A0G = r23;
        this.A0A = r2;
    }
}
