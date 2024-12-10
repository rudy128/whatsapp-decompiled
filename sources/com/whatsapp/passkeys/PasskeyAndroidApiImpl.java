package com.whatsapp.passkeys;

import X.AX0;
import X.AX2;
import X.AnonymousClass00H;
import X.AnonymousClass9MT;
import X.AnonymousClass9TT;
import X.C108985cd;
import X.C175338yY;
import X.C175348yZ;
import X.C17880vN;
import X.C18070vi;
import X.C193169pe;
import X.C195889u5;
import X.C196759vb;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class PasskeyAndroidApiImpl {
    public final AnonymousClass00H A00;

    public PasskeyAndroidApiImpl(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass9MT A00(String str) {
        C195889u5 r1;
        C18070vi.A0d(str, 0);
        try {
            JSONObject A16 = C17880vN.A16(str);
            if (!A16.has(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS)) {
                Log.w("PasskeyAndroidApi: Creating passkey: PRF extension not found in response");
                return new C175348yZ(AX2.A00);
            }
            JSONObject jSONObject = A16.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS);
            if (!jSONObject.has("prf")) {
                Log.w("PasskeyAndroidApi: Creating passkey: PRF extension not found in response");
                return new C175348yZ(AX2.A00);
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("prf");
            if (!jSONObject2.has("results")) {
                Log.w("PasskeyAndroidApi: Creating passkey: PRF extension not found in response");
                return new C175348yZ(AX2.A00);
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("results");
            C195889u5 r2 = new C195889u5(C196759vb.A00(C18070vi.A0J("first", jSONObject3)));
            if (jSONObject3.has("second")) {
                r1 = new C195889u5(C196759vb.A00(C18070vi.A0J("second", jSONObject3)));
            } else {
                r1 = null;
            }
            return new C175348yZ(new AX0(r2, r1));
        } catch (JSONException e) {
            return new C175338yY(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(android.app.Activity r10, com.whatsapp.passkeys.PasskeyAndroidApiImpl r11, java.lang.String r12, X.C30391dr r13) {
        /*
            boolean r0 = r13 instanceof X.C21655Ank
            if (r0 == 0) goto L_0x0022
            r5 = r13
            X.Ank r5 = (X.C21655Ank) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0022
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r2 = r5.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r0 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 != r0) goto L_0x0028
            java.lang.Object r11 = r5.L$0
            com.whatsapp.passkeys.PasskeyAndroidApiImpl r11 = (com.whatsapp.passkeys.PasskeyAndroidApiImpl) r11
            goto L_0x0081
        L_0x0022:
            X.Ank r5 = new X.Ank
            r5.<init>(r11, r13)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r2)
            r4 = 0
            r6 = r10
            X.C18070vi.A0d(r10, r4)
            X.9UJ r1 = new X.9UJ
            r1.<init>(r10)
            X.BK3 r7 = new X.BK3
            r7.<init>(r12)
            r5.L$0 = r11     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r5.label = r0     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.1g7 r2 = X.C72473Md.A0m(r5)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            android.os.CancellationSignal r8 = new android.os.CancellationSignal     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r8.<init>()     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.AxS r0 = new X.AxS     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r0.<init>(r8)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r2.Bdu(r0)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.AGZ r10 = new X.AGZ     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r10.<init>(r2, r4)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.DVv r9 = new X.DVv     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r9.<init>(r4)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            android.content.Context r1 = r1.A00     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.9z8 r0 = new X.9z8     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r0.<init>(r1)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.BBn r5 = r0.A01()     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            if (r5 != 0) goto L_0x007a
            java.lang.String r1 = "createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"
            X.8EM r0 = new X.8EM     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r0.<init>(r1)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r10.Bsz(r0)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
        L_0x0075:
            java.lang.Object r2 = r2.A0C()     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            goto L_0x007e
        L_0x007a:
            r5.onCreateCredential(r6, r7, r8, r9, r10)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            goto L_0x0075
        L_0x007e:
            if (r2 != r3) goto L_0x0084
            return r3
        L_0x0081:
            X.C30691eM.A01(r2)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
        L_0x0084:
            X.CIa r2 = (X.C24738CIa) r2     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.CreatePublicKeyCredentialResponse"
            X.C18070vi.A0z(r2, r0)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.BK6 r2 = (X.BK6) r2     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            java.lang.String r0 = r2.A00     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            X.8yZ r2 = new X.8yZ     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            r2.<init>(r0)     // Catch:{ BKE -> 0x0197, 8EL -> 0x0193, BKF -> 0x018f, BKG -> 0x0186, 8EM -> 0x00a9, BKH -> 0x00a4, BKI -> 0x009f, 8EQ -> 0x00cb, 8ER -> 0x01a7, C2O -> 0x009a }
            return r2
        L_0x009a:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: exception"
            goto L_0x01aa
        L_0x009f:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: unsupported"
            goto L_0x0189
        L_0x00a4:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: unknown exception"
            goto L_0x01aa
        L_0x00a9:
            r2 = move-exception
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.9u8 r0 = (X.C195909u8) r0
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: ineligible. play services not available"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x0165
        L_0x00c1:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: credential provider configuration exception"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
            goto L_0x00ed
        L_0x00cb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: public key dom exception ("
            r1.append(r0)
            X.CIe r0 = r2.domError
            java.lang.String r0 = X.AnonymousClass001.A1F(r0, r1)
            com.whatsapp.util.Log.i(r0, r2)
            X.CIe r1 = r2.domError
            boolean r0 = r1 instanceof X.BKO
            if (r0 == 0) goto L_0x00f8
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: AbortError"
        L_0x00e6:
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r3 = X.AnonymousClass00R.A0N
        L_0x00eb:
            java.lang.Integer r1 = X.AnonymousClass00R.A0j
        L_0x00ed:
            X.A1k r0 = new X.A1k
            r0.<init>(r3, r1, r2)
        L_0x00f2:
            X.8yY r2 = new X.8yY
            r2.<init>(r0)
            return r2
        L_0x00f8:
            boolean r0 = r1 instanceof X.BKP
            if (r0 == 0) goto L_0x0117
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.9u8 r0 = (X.C195909u8) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device not secured)"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x00ed
        L_0x0114:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Constraint Error (device secured)"
            goto L_0x00e6
        L_0x0117:
            boolean r0 = r1 instanceof X.BKY
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: InvalidStateError"
            goto L_0x00e6
        L_0x011e:
            boolean r0 = r1 instanceof X.C22679BKc
            if (r0 == 0) goto L_0x012c
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotAllowedError"
        L_0x0124:
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x00ed
        L_0x012c:
            boolean r0 = r1 instanceof X.C22682BKf
            if (r0 == 0) goto L_0x015a
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.9u8 r0 = (X.C195909u8) r0
            long r5 = r0.A00()
            r3 = 231300000(0xdc95ba0, double:1.14277384E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1Q(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyGooglePlayChecks / gmsVersionIsNewEnoughForCreate : "
            X.C17900vP.A0n(r0, r1, r3)
            if (r3 != 0) goto L_0x0179
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotSupportedError (gms too old)"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x00ed
        L_0x015a:
            boolean r0 = r1 instanceof X.C22687BKk
            if (r0 == 0) goto L_0x016b
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: SecurityError"
        L_0x0160:
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
        L_0x0165:
            X.A1k r0 = new X.A1k
            r0.<init>(r1, r1, r2)
            goto L_0x00f2
        L_0x016b:
            boolean r0 = r1 instanceof X.C22689BKm
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: TimeoutError"
            goto L_0x0124
        L_0x0172:
            boolean r0 = r1 instanceof X.C22677BKa
            if (r0 == 0) goto L_0x0182
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Network Error"
            goto L_0x0160
        L_0x0179:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: NotSupportedError (gms new enough)"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            goto L_0x00eb
        L_0x0182:
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Other Error"
            goto L_0x00e6
        L_0x0186:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: no create option"
        L_0x0189:
            com.whatsapp.util.Log.i(r0, r3)
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            goto L_0x01af
        L_0x018f:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: interrupted"
            goto L_0x01aa
        L_0x0193:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: custom exception"
            goto L_0x01aa
        L_0x0197:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: cancelled"
            com.whatsapp.util.Log.i(r0, r3)
            java.lang.Integer r2 = X.AnonymousClass00R.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.A1k r1 = new X.A1k
            r1.<init>(r2, r0, r3)
            goto L_0x01b6
        L_0x01a7:
            r3 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: public key exception"
        L_0x01aa:
            com.whatsapp.util.Log.i(r0, r3)
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
        L_0x01af:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            X.A1k r1 = new X.A1k
            r1.<init>(r2, r0, r3)
        L_0x01b6:
            X.8yY r2 = new X.8yY
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyAndroidApiImpl.A02(android.app.Activity, com.whatsapp.passkeys.PasskeyAndroidApiImpl, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.8EP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: X.BKJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: X.8EN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: X.BKK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: X.8EP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: X.8EP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.8EP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: X.BKL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: X.BKM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.BKN} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: X.8EP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.8EP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: X.8EO} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(android.app.Activity r10, com.whatsapp.passkeys.PasskeyAndroidApiImpl r11, java.lang.String r12, X.C30391dr r13) {
        /*
            boolean r0 = r13 instanceof X.C21656Anl
            if (r0 == 0) goto L_0x0022
            r2 = r13
            X.Anl r2 = (X.C21656Anl) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x0022
            int r3 = r3 - r1
            r2.label = r3
        L_0x0012:
            java.lang.Object r1 = r2.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r2.label
            r5 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r5) goto L_0x0028
            java.lang.Object r11 = r2.L$0
            com.whatsapp.passkeys.PasskeyAndroidApiImpl r11 = (com.whatsapp.passkeys.PasskeyAndroidApiImpl) r11
            goto L_0x0085
        L_0x0022:
            X.Anl r2 = new X.Anl
            r2.<init>(r11, r13)
            goto L_0x0012
        L_0x0028:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x002d:
            X.C30691eM.A01(r1)
            r4 = 0
            r6 = r10
            X.C18070vi.A0d(r10, r4)
            X.1Om r1 = X.C25511Om.A00
            X.BKB r0 = new X.BKB
            r0.<init>(r12, r1)
            java.util.List r0 = X.C18070vi.A0M(r0)
            X.CIc r7 = new X.CIc
            r7.<init>(r0)
            r2.L$0 = r11     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r2.label = r5     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.1g7 r2 = X.C72473Md.A0m(r2)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            android.os.CancellationSignal r8 = new android.os.CancellationSignal     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r8.<init>()     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.AxT r0 = new X.AxT     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r0.<init>(r8)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r2.Bdu(r0)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.AGZ r10 = new X.AGZ     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r10.<init>(r2, r5)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.DVv r9 = new X.DVv     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r9.<init>(r4)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.9z8 r0 = new X.9z8     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r0.<init>(r6)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.BBn r5 = r0.A01()     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            if (r5 != 0) goto L_0x007e
            java.lang.String r1 = "getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"
            X.8EP r0 = new X.8EP     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r0.<init>(r1)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r10.Bsz(r0)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
        L_0x0079:
            java.lang.Object r1 = r2.A0C()     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            goto L_0x0082
        L_0x007e:
            r5.onGetCredential(r6, r7, r8, r9, r10)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            goto L_0x0079
        L_0x0082:
            if (r1 != r3) goto L_0x0088
            return r3
        L_0x0085:
            X.C30691eM.A01(r1)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
        L_0x0088:
            X.CId r1 = (X.C24741CId) r1     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.CIb r1 = r1.A00     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.credentials.PublicKeyCredential"
            X.C18070vi.A0z(r1, r0)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.BK9 r1 = (X.BK9) r1     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            java.lang.String r0 = r1.A00     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            X.8yZ r1 = new X.8yZ     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            r1.<init>(r0)     // Catch:{ BKJ -> 0x016b, 8EN -> 0x0167, BKK -> 0x0163, 8EP -> 0x00db, BKL -> 0x00d6, BKM -> 0x00cc, BKN -> 0x00c2, 8ES -> 0x00a5, 8EO -> 0x00a0, C1t -> 0x0174 }
            return r1
        L_0x00a0:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: public key exception"
            goto L_0x0177
        L_0x00a5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: public key dom exception ("
            r1.append(r0)
            X.CIe r0 = r2.domError
            java.lang.String r0 = X.AnonymousClass001.A1F(r0, r1)
            com.whatsapp.util.Log.i(r0, r2)
            X.CIe r1 = r2.domError
            boolean r0 = r1 instanceof X.BKO
            if (r0 == 0) goto L_0x00ed
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: AbortError"
            goto L_0x0177
        L_0x00c2:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: no credentials"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x017c
        L_0x00cc:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: unsupported"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x017c
        L_0x00d6:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: unknown exception"
            goto L_0x0177
        L_0x00db:
            r2 = move-exception
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.9u8 r0 = (X.C195909u8) r0
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x015b
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: ineligible. play services not available"
            goto L_0x0101
        L_0x00ed:
            boolean r0 = r1 instanceof X.BKP
            if (r0 == 0) goto L_0x0107
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.9u8 r0 = (X.C195909u8) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device not secured)"
        L_0x0101:
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            goto L_0x017c
        L_0x0107:
            boolean r0 = r1 instanceof X.C22679BKc
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotAllowedError"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x017c
        L_0x0113:
            boolean r0 = r1 instanceof X.C22682BKf
            if (r0 == 0) goto L_0x0145
            X.00H r0 = r11.A00
            java.lang.Object r0 = r0.get()
            X.9u8 r0 = (X.C195909u8) r0
            long r5 = r0.A00()
            r3 = 231300000(0xdc95ba0, double:1.14277384E-315)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r3 = X.AnonymousClass000.A1Q(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PasskeyGooglePlayChecks / gmsVersionIsNewEnoughForLogin : "
            X.C17900vP.A0n(r0, r1, r3)
            if (r3 != 0) goto L_0x013d
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms too old)"
            goto L_0x0101
        L_0x013a:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Constraint Error (device secured)"
            goto L_0x0177
        L_0x013d:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: NotSupportedError (gms new enough)"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x017c
        L_0x0145:
            boolean r0 = r1 instanceof X.C22687BKk
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: SecurityError"
            goto L_0x0177
        L_0x014c:
            boolean r0 = r1 instanceof X.C22689BKm
            if (r0 == 0) goto L_0x0158
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: TimeoutError"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x017c
        L_0x0158:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: Other Error"
            goto L_0x0177
        L_0x015b:
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: credential provider configuration exception"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x017c
        L_0x0163:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: interrupted"
            goto L_0x0177
        L_0x0167:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: custom exception"
            goto L_0x0177
        L_0x016b:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: cancelled"
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A01
            goto L_0x017c
        L_0x0174:
            r2 = move-exception
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey: exception"
        L_0x0177:
            com.whatsapp.util.Log.i(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
        L_0x017c:
            X.A1a r0 = new X.A1a
            r0.<init>(r1, r2)
            X.8yY r1 = new X.8yY
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyAndroidApiImpl.A03(android.app.Activity, com.whatsapp.passkeys.PasskeyAndroidApiImpl, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(android.app.Activity r10, X.C193139pb r11, X.C193169pe r12, X.C30391dr r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof X.C21622AnD
            if (r0 == 0) goto L_0x00a6
            r3 = r13
            X.AnD r3 = (X.C21622AnD) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a6
            int r2 = r2 - r1
            r3.label = r2
        L_0x0012:
            java.lang.Object r1 = r3.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L_0x003e
            if (r0 != r2) goto L_0x00d7
            X.C30691eM.A01(r1)
        L_0x0020:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00ad
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = (java.lang.String) r0
            X.9MT r1 = A00(r0)
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00b6
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r0 = r1.A00
            X.8yZ r1 = new X.8yZ
            r1.<init>(r0)
            return r1
        L_0x003e:
            X.C30691eM.A01(r1)
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r1 = "type"
            java.lang.String r0 = "public-key"
            r5.put(r1, r0)
            java.lang.String r1 = "id"
            X.9pc r0 = r11.A00
            java.lang.String r0 = X.C196759vb.A01(r0)
            org.json.JSONArray r6 = X.AnonymousClass8BT.A12(r0, r1, r5)
            r6.put(r5)
            org.json.JSONObject r5 = X.C17880vN.A15()
            java.lang.String r8 = "challenge"
            java.security.SecureRandom r7 = new java.security.SecureRandom
            r7.<init>()
            r0 = 32
            byte[] r0 = new byte[r0]
            X.9pc r1 = new X.9pc
            r1.<init>(r0)
            byte[] r0 = r1.A00
            r7.nextBytes(r0)
            java.lang.String r0 = X.C196759vb.A01(r1)
            r5.put(r8, r0)
            java.lang.String r1 = "timeout"
            r0 = 1800000(0x1b7740, float:2.522337E-39)
            r5.put(r1, r0)
            java.lang.String r1 = "userVerification"
            java.lang.String r0 = "required"
            r5.put(r1, r0)
            java.lang.String r1 = "whatsapp.com"
            java.lang.String r0 = "rpId"
            r5.put(r0, r1)
            java.lang.String r0 = "allowCredentials"
            r5.put(r0, r6)
            A04(r12, r5)
            java.lang.String r0 = X.C18070vi.A0H(r5)
            r3.label = r2
            java.lang.Object r1 = A03(r10, r9, r0, r3)
            if (r1 != r4) goto L_0x0020
            return r4
        L_0x00a6:
            X.AnD r3 = new X.AnD
            r3.<init>(r9, r13)
            goto L_0x0012
        L_0x00ad:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00d2
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r0 = r1.A00
            goto L_0x00c7
        L_0x00b6:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00cd
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r2 = r1.A00
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            X.A1a r0 = new X.A1a
            r0.<init>(r1, r2)
        L_0x00c7:
            X.8yY r1 = new X.8yY
            r1.<init>(r0)
            return r1
        L_0x00cd:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00d2:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyAndroidApiImpl.A05(android.app.Activity, X.9pb, X.9pe, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A06(android.app.Activity r6, X.C193169pe r7, java.lang.String r8, X.C30391dr r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C21654Anj
            if (r0 == 0) goto L_0x00b0
            r4 = r9
            X.Anj r4 = (X.C21654Anj) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x0082
            if (r0 != r2) goto L_0x00cf
            java.lang.Object r7 = r4.L$0
            X.C30691eM.A01(r1)
        L_0x0022:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00bc
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r2 = r1.A00
            java.lang.String r2 = (java.lang.String) r2
            if (r7 != 0) goto L_0x0075
            X.AX1 r3 = X.AX1.A00
        L_0x0032:
            X.B5O r3 = (X.B5O) r3
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.lang.String r0 = "clientExtensionResults"
            X.9MT r2 = A01(r2, r0)
            X.Azg r1 = new X.Azg
            r1.<init>(r3)
            boolean r0 = r2 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x006c
            X.8yZ r2 = (X.C175348yZ) r2
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = r1.invoke(r0)
            X.8yZ r2 = new X.8yZ
            r2.<init>(r0)
        L_0x0054:
            X.B3A r1 = X.B3A.A00
            boolean r0 = r2 instanceof X.C175348yZ
            if (r0 != 0) goto L_0x006b
            boolean r0 = r2 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00b7
            X.8yY r2 = (X.C175338yY) r2
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = r1.invoke(r0)
            X.8yY r2 = new X.8yY
            r2.<init>(r0)
        L_0x006b:
            return r2
        L_0x006c:
            boolean r0 = r2 instanceof X.C175338yY
            if (r0 != 0) goto L_0x0054
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0075:
            X.9MT r1 = A00(r2)
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00e1
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r3 = r1.A00
            goto L_0x0032
        L_0x0082:
            X.C30691eM.A01(r1)
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.String r0 = "extensions"
            X.9MT r1 = A01(r8, r0)
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00d4
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r0 = r1.A00
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            A04(r7, r0)
            java.lang.String r0 = X.C18070vi.A0H(r0)
            r4.L$0 = r7
            r4.label = r2
            java.lang.Object r1 = A02(r6, r5, r0, r4)
            if (r1 != r3) goto L_0x0022
            return r3
        L_0x00b0:
            X.Anj r4 = new X.Anj
            r4.<init>(r5, r9)
            goto L_0x0012
        L_0x00b7:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00bc:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00ca
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r1 = r1.A00
            X.8yY r0 = new X.8yY
            r0.<init>(r1)
            return r0
        L_0x00ca:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00cf:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00d4:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x0104
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r3 = r1.A00
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            goto L_0x00f2
        L_0x00e1:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00ff
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r3 = r1.A00
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r0 = "PasskeyAndroidApi: Creating passkey: Failed to parse PRF output"
            com.whatsapp.util.Log.e(r0, r3)
            java.lang.Integer r2 = X.AnonymousClass00R.A0N
        L_0x00f2:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            X.A1k r1 = new X.A1k
            r1.<init>(r2, r0, r3)
            X.8yY r0 = new X.8yY
            r0.<init>(r1)
            return r0
        L_0x00ff:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0104:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyAndroidApiImpl.A06(android.app.Activity, X.9pe, java.lang.String, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A07(android.app.Activity r6, java.lang.String r7, X.C30391dr r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C21623AnE
            if (r0 == 0) goto L_0x0093
            r4 = r8
            X.AnE r4 = (X.C21623AnE) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L_0x006c
            if (r0 != r2) goto L_0x009f
            X.C30691eM.A01(r1)
        L_0x0020:
            X.9MT r1 = (X.AnonymousClass9MT) r1
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00b6
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r1 = r1.A00
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "clientExtensionResults"
            X.9MT r2 = A01(r1, r0)
            boolean r0 = r2 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x0063
            X.8yZ r2 = (X.C175348yZ) r2
            java.lang.Object r1 = r2.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = r1.toString()
            X.8yZ r2 = new X.8yZ
            r2.<init>(r0)
        L_0x004b:
            X.B3B r1 = X.B3B.A00
            boolean r0 = r2 instanceof X.C175348yZ
            if (r0 != 0) goto L_0x0062
            boolean r0 = r2 instanceof X.C175338yY
            if (r0 == 0) goto L_0x009a
            X.8yY r2 = (X.C175338yY) r2
            java.lang.Object r0 = r2.A00
            java.lang.Object r0 = r1.invoke(r0)
            X.8yY r2 = new X.8yY
            r2.<init>(r0)
        L_0x0062:
            return r2
        L_0x0063:
            boolean r0 = r2 instanceof X.C175338yY
            if (r0 != 0) goto L_0x004b
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x006c:
            X.C30691eM.A01(r1)
            java.lang.String r0 = "PasskeyAndroidApi: Logging in with passkey"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r0 = "extensions"
            X.9MT r1 = A01(r7, r0)
            boolean r0 = r1 instanceof X.C175348yZ
            if (r0 == 0) goto L_0x00a4
            X.8yZ r1 = (X.C175348yZ) r1
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = X.C18070vi.A0H(r0)
            r4.label = r2
            java.lang.Object r1 = A03(r6, r5, r0, r4)
            if (r1 != r3) goto L_0x0020
            return r3
        L_0x0093:
            X.AnE r4 = new X.AnE
            r4.<init>(r5, r8)
            goto L_0x0012
        L_0x009a:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00a4:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00c9
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r1 = r1.A00
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.A1a r2 = new X.A1a
            r2.<init>(r0, r1)
            goto L_0x00be
        L_0x00b6:
            boolean r0 = r1 instanceof X.C175338yY
            if (r0 == 0) goto L_0x00c4
            X.8yY r1 = (X.C175338yY) r1
            java.lang.Object r2 = r1.A00
        L_0x00be:
            X.8yY r0 = new X.8yY
            r0.<init>(r2)
            return r0
        L_0x00c4:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00c9:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.passkeys.PasskeyAndroidApiImpl.A07(android.app.Activity, java.lang.String, X.1dr):java.lang.Object");
    }

    public static final AnonymousClass9MT A01(String str, String str2) {
        try {
            JSONObject A16 = C17880vN.A16(str);
            if (A16.has(str2)) {
                Iterator<String> keys = A16.getJSONObject(str2).keys();
                C18070vi.A0b(keys);
                while (keys.hasNext()) {
                    if (!AnonymousClass9TT.A00.contains(keys.next())) {
                        keys.remove();
                    }
                }
            }
            return new C175348yZ(A16);
        } catch (JSONException e) {
            return new C175338yY(new Exception("filterForbiddenExtensions: Failed to parse JSON", e));
        }
    }

    public static final void A04(C193169pe r4, JSONObject jSONObject) {
        JSONObject A0u = C108985cd.A0u(jSONObject);
        if (r4 != null) {
            JSONObject A15 = C17880vN.A15();
            A15.put("first", C196759vb.A01(r4.A00));
            A0u.put("eval", A15);
        }
        if (!jSONObject.has(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS)) {
            jSONObject.put(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS, C17880vN.A15());
        }
        jSONObject.getJSONObject(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS).put("prf", A0u);
    }
}
