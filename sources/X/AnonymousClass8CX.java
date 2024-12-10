package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.sql.Date;
import java.text.SimpleDateFormat;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl;
import org.npci.upi.security.pinactivitycomponent.GetCredential;
import org.npci.upi.security.pinactivitycomponent.w;
import org.npci.upi.security.services.CLRemoteService;
import org.npci.upi.security.services.CLResultReceiver;

/* renamed from: X.8CX  reason: invalid class name */
public class AnonymousClass8CX extends Binder implements CLRemoteService {
    public Context A00;
    public final /* synthetic */ CLRemoteServiceImpl A01;

    public AnonymousClass8CX() {
        attachInterface(this, "org.npci.upi.security.services.CLRemoteService");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8CX(Context context, CLRemoteServiceImpl cLRemoteServiceImpl) {
        this();
        this.A01 = cLRemoteServiceImpl;
        this.A00 = context;
    }

    public IBinder asBinder() {
        return this;
    }

    public void BKn(String str) {
        String A1H;
        GetCredential getCredential = GetCredential.A0L;
        if (getCredential != null) {
            w wVar = (w) getCredential.A07;
            try {
                JSONObject A16 = C17880vN.A16(str);
                if (!A16.has(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE) || !A16.has("data") || A16.getJSONObject("data").getInt("status") != -1) {
                    ((BDB) wVar.A04.get(wVar.A03)).BAH(wVar.A1H(2131898722));
                    return;
                }
                if (A16.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("TRIGGERED_OTP_RESPONSE")) {
                    wVar.A04.get(wVar.A03);
                    A1H = wVar.A1H(2131898722);
                } else if (A16.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("TRIGGERED_AADHAAR_OTP_RESPONSE")) {
                    wVar.A04.get(wVar.A03);
                    A1H = wVar.A1H(2131899560);
                } else {
                    return;
                }
                wVar.A26(A1H);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [X.9fB, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v32, types: [X.9fB, java.lang.Object] */
    public String BOR(String str, String str2) {
        String str3;
        String str4;
        PublicKey publicKey;
        byte[] bArr;
        C161458Dx r5 = this.A01.A00;
        String str5 = "";
        String format = new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis()));
        try {
            str3 = A8J.A02(AnonymousClass8BX.A0r().getEncoded());
        } catch (Exception unused) {
            str3 = null;
        }
        try {
            r5.A01 = str3;
            try {
                str4 = A8J.A02(AnonymousClass8BX.A0r().getEncoded());
            } catch (Exception unused2) {
                str4 = null;
            }
        } catch (Exception unused3) {
            str4 = str5;
        }
        try {
            new A8J();
            if (str.equalsIgnoreCase("initial")) {
                C192349oE r6 = r5.A04;
                SharedPreferences.Editor edit = r6.A01.edit();
                edit.clear();
                edit.commit();
                if (r6.A00().size() <= 0) {
                    String str6 = r5.A01;
                    ? obj = new Object();
                    obj.A02 = str4;
                    obj.A01 = str6;
                    obj.A03 = format;
                    r6.A01(obj);
                }
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A10(r5.A01, "|", str4, A10);
                A10.append("|");
                A10.append(str2);
                str5 = A10.toString();
                Certificate certificate = C182179Tj.A00;
                if (certificate != null) {
                    publicKey = certificate.getPublicKey();
                } else {
                    publicKey = null;
                }
                try {
                    bArr = AnonymousClass8BY.A1Y(publicKey, str5.getBytes());
                } catch (Exception unused4) {
                    bArr = null;
                }
                str5 = Base64.encodeToString(bArr, 2);
            } else {
                C192349oE r62 = r5.A04;
                String str7 = ((C187049fB) AnonymousClass8BS.A0Y(r62.A00())).A02;
                StringBuilder A102 = AnonymousClass000.A10();
                C17890vO.A10(r5.A01, "|", str4, A102);
                A102.append("|");
                A102.append(str2);
                String obj2 = A102.toString();
                byte[] A1b = AnonymousClass8BX.A1b("AES/GCM/NoPadding", new SecureRandom());
                String encodeToString = Base64.encodeToString(A1b, 2);
                int length = str7.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i = 0; i < length; i++) {
                    AnonymousClass8BY.A1L(str7, bArr2, i);
                }
                str5 = C17900vP.A0H(Base64.encodeToString(A8J.A05(obj2.getBytes(), bArr2, A1b), 2), "|", encodeToString).toString();
                SharedPreferences.Editor edit2 = r62.A01.edit();
                edit2.clear();
                edit2.commit();
                String str8 = r5.A01;
                ? obj3 = new Object();
                obj3.A02 = str4;
                obj3.A01 = str8;
                obj3.A03 = format;
                r62.A01(obj3);
            }
        } catch (Exception unused5) {
        }
        return AnonymousClass001.A1H("2.3-v1.8|", str5, AnonymousClass000.A10());
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.os.ResultReceiver, X.8Cq] */
    public void BPh(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver) {
        Context context = this.A00;
        SharedPreferences.Editor edit = new AnonymousClass9ZM(context).A00.edit();
        edit.putString("org.npci.upi.language.pref", str8);
        edit.commit();
        Bundle A0D = C17880vN.A0D();
        A0D.putString("keyCode", str);
        A0D.putString("keyXmlPayload", str2);
        A0D.putString("controls", str3);
        A0D.putString("configuration", str4);
        A0D.putString("salt", str5);
        A0D.putString("payInfo", str6);
        A0D.putString("trust", str7);
        A0D.putString("languagePref", str8);
        ? resultReceiver = new ResultReceiver(new Handler());
        resultReceiver.A00 = cLResultReceiver;
        C188559hc.A0B = resultReceiver;
        Intent A07 = AnonymousClass8BR.A07(context, GetCredential.class);
        A07.setFlags(268435456);
        A07.putExtras(A0D);
        context.startActivity(A07);
    }

    public boolean CDr(String str, String str2, String str3, String str4, String str5) {
        try {
            String str6 = ((C187049fB) this.A01.A00.A04.A00().get(0)).A01;
            int length = str6.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                AnonymousClass8BY.A1L(str6, bArr, i);
            }
            String encodeToString = Base64.encodeToString(A8J.A06(Base64.decode(str4, 0), bArr, AnonymousClass8BT.A1a(str5)), 0);
            String A1H = AnonymousClass001.A1H("|", str3, C17900vP.A0H(str, "|", str2));
            byte[] A1a = AnonymousClass8BT.A1a(str5);
            MessageDigest A1I = C108945cZ.A1I();
            A1I.update(A1a);
            if (!Base64.encodeToString(A1I.digest(A1H.getBytes(DefaultCrypto.UTF_8)), 0).equalsIgnoreCase(encodeToString)) {
                return false;
            }
            return true;
        } catch (Exception | NoSuchAlgorithmException e) {
            e.getLocalizedMessage();
        }
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [android.os.ResultReceiver, X.8Cq] */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:29|30|31|32|33|34|35|36|(2:38|(1:40))) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:47|48|49|50|51|52|53|54|(3:56|57|(2:59|60)(4:61|(4:64|(2:66|86)(1:87)|67|62)|85|68))) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0176, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02ab, code lost:
        r1.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02ae, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0156 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x01d5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r24, android.os.Parcel r25, android.os.Parcel r26, int r27) {
        /*
            r23 = this;
            r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
            r0 = 1
            java.lang.String r3 = "org.npci.upi.security.services.CLRemoteService"
            r4 = r24
            r1 = r26
            if (r4 == r2) goto L_0x0329
            r13 = r23
            r2 = r25
            switch(r24) {
                case 1: goto L_0x025c;
                case 2: goto L_0x001a;
                case 3: goto L_0x0037;
                case 4: goto L_0x0040;
                case 5: goto L_0x017a;
                case 6: goto L_0x008c;
                case 7: goto L_0x0114;
                case 8: goto L_0x0198;
                case 9: goto L_0x0272;
                case 10: goto L_0x02a1;
                case 11: goto L_0x02af;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = r27
            boolean r0 = super.onTransact(r4, r2, r1, r0)
            return r0
        L_0x001a:
            r2.enforceInterface(r3)
            java.lang.String r14 = r2.readString()
            java.lang.String r15 = r2.readString()
            java.lang.String r16 = r2.readString()
            java.lang.String r17 = r2.readString()
            java.lang.String r18 = r2.readString()
            boolean r2 = r13.CDr(r14, r15, r16, r17, r18)
            goto L_0x0191
        L_0x0037:
            r2.enforceInterface(r3)
            boolean r2 = X.C161458Dx.A03()
            goto L_0x0191
        L_0x0040:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.8Dx r5 = r2.A00
            java.lang.StringBuilder r2 = X.C17900vP.A0H(r4, r6, r3)
            java.lang.String r2 = r2.toString()
            byte[] r2 = X.A8J.A04(r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r4 = X.C108955ca.A14(r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "AndroidKeyStore"
            java.security.KeyStore r3 = java.security.KeyStore.getInstance(r2)     // Catch:{ Exception -> 0x0178 }
            r2 = 0
            r3.load(r2)     // Catch:{ Exception -> 0x0178 }
            java.security.cert.Certificate r2 = r3.getCertificate(r4)     // Catch:{ Exception -> 0x0178 }
            r2.getPublicKey()     // Catch:{ Exception -> 0x0178 }
            android.content.Context r2 = r5.A00     // Catch:{ Exception -> 0x0178 }
            X.9s9 r3 = X.C194699s9.A00(r2, r4)     // Catch:{ Exception -> 0x0178 }
            r5.A05 = r3     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "ServerRiskParams"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = ""
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0178 }
            if (r2 != 0) goto L_0x0178
            goto L_0x0176
        L_0x008c:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.8Dx r8 = r2.A00
            X.9zH r2 = new X.9zH
            r2.<init>()
            boolean r2 = r2.A01(r3)     // Catch:{ Exception -> 0x0178 }
            if (r2 == 0) goto L_0x0178
            X.B4E r2 = new X.B4E     // Catch:{ Exception -> 0x0178 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0178 }
            java.util.List r7 = X.B4E.A01     // Catch:{ Exception -> 0x0178 }
            java.lang.StringBuilder r2 = X.C17900vP.A0H(r5, r6, r4)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0178 }
            byte[] r2 = X.A8J.A04(r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r3 = X.C108955ca.A14(r2)     // Catch:{ Exception -> 0x0178 }
            android.content.Context r2 = r8.A00     // Catch:{ Exception -> 0x0178 }
            X.9s9 r3 = X.C194699s9.A00(r2, r3)     // Catch:{ Exception -> 0x0178 }
            r8.A05 = r3     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "AES"
            java.lang.String r6 = r3.A01(r2)     // Catch:{ Exception -> 0x0178 }
            int r2 = r7.size()     // Catch:{ Exception -> 0x0178 }
            if (r2 == 0) goto L_0x0178
            r5 = 0
        L_0x00da:
            int r2 = r7.size()     // Catch:{ Exception -> 0x0178 }
            if (r5 >= r2) goto L_0x0176
            java.lang.Object r4 = r7.get(r5)     // Catch:{ Exception -> 0x0178 }
            X.9cH r4 = (X.C185249cH) r4     // Catch:{ Exception -> 0x0178 }
            java.lang.String r3 = r4.A00     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "STATE"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0178 }
            if (r2 == 0) goto L_0x00fa
            java.lang.String r2 = r4.A01     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = X.A8J.A01(r2, r6)     // Catch:{ Exception -> 0x0178 }
            X.C161458Dx.A00(r2, r8)     // Catch:{ Exception -> 0x0178 }
            goto L_0x0111
        L_0x00fa:
            java.lang.String r3 = r4.A00     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "DEVICE-CERT"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0178 }
            if (r2 == 0) goto L_0x0111
            java.lang.String r2 = r4.A01     // Catch:{ Exception -> 0x0178 }
            java.lang.String r4 = X.A8J.A01(r2, r6)     // Catch:{ Exception -> 0x0178 }
            X.9s9 r3 = r8.A05     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "DeviceCertificate"
            r3.A03(r4, r2)     // Catch:{ Exception -> 0x0178 }
        L_0x0111:
            int r5 = r5 + 1
            goto L_0x00da
        L_0x0114:
            r2.enforceInterface(r3)
            java.lang.String r6 = r2.readString()
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r8 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.8Dx r7 = r2.A00
            java.lang.StringBuilder r2 = X.C17900vP.A0H(r5, r6, r4)
            java.lang.String r2 = r2.toString()
            byte[] r2 = X.A8J.A04(r2)
            java.lang.String r3 = X.C108955ca.A14(r2)
            android.content.Context r2 = r7.A00     // Catch:{ Exception -> 0x0178 }
            X.9s9 r3 = X.C194699s9.A00(r2, r3)     // Catch:{ Exception -> 0x0178 }
            r7.A05 = r3     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "AES"
            java.lang.String r2 = r3.A01(r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r3 = X.A8J.A01(r8, r2)     // Catch:{ Exception -> 0x0178 }
            org.json.JSONObject r2 = X.C17880vN.A16(r3)     // Catch:{ Exception -> 0x0156 }
            java.lang.Boolean r2 = X.C20010A3a.A00(r2)     // Catch:{ Exception -> 0x0156 }
            goto L_0x015a
        L_0x0156:
            java.lang.Boolean r2 = X.AnonymousClass000.A0h()     // Catch:{ Exception -> 0x0178 }
        L_0x015a:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0178 }
            if (r2 == 0) goto L_0x0178
            X.C161458Dx.A00(r3, r7)     // Catch:{ Exception -> 0x0178 }
            org.json.JSONObject r3 = r7.A02     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "ACSTATUS"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x0178 }
            java.lang.String r2 = "DA"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x0178 }
            if (r2 == 0) goto L_0x0176
            r7.A2x(r6, r5, r4)     // Catch:{ Exception -> 0x0178 }
        L_0x0176:
            r2 = 1
            goto L_0x0191
        L_0x0178:
            r2 = 0
            goto L_0x0191
        L_0x017a:
            r2.enforceInterface(r3)
            java.lang.String r5 = r2.readString()
            java.lang.String r4 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.8Dx r2 = r2.A00
            boolean r2 = r2.A2x(r5, r4, r3)
        L_0x0191:
            r1.writeNoException()
            r1.writeInt(r2)
            return r0
        L_0x0198:
            r2.enforceInterface(r3)
            java.lang.String r7 = r2.readString()
            java.lang.String r6 = r2.readString()
            java.lang.String r3 = r2.readString()
            org.npci.upi.security.pinactivitycomponent.CLRemoteServiceImpl r2 = r13.A01
            X.8Dx r4 = r2.A00
            java.lang.String r5 = ""
            java.lang.StringBuilder r2 = X.C17900vP.A0H(r6, r7, r3)
            java.lang.String r2 = r2.toString()
            byte[] r2 = X.A8J.A04(r2)
            r6 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r2, r6)
            android.content.Context r2 = r4.A00     // Catch:{ Exception -> 0x026b }
            X.9s9 r3 = X.C194699s9.A00(r2, r3)     // Catch:{ Exception -> 0x026b }
            r4.A05 = r3     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "ServerRiskParams"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x026b }
            org.json.JSONObject r2 = X.C17880vN.A16(r3)     // Catch:{ Exception -> 0x01d5 }
            java.lang.Boolean r2 = X.C20010A3a.A00(r2)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x01d9
        L_0x01d5:
            java.lang.Boolean r2 = X.AnonymousClass000.A0h()     // Catch:{ Exception -> 0x026b }
        L_0x01d9:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x026b }
            if (r2 == 0) goto L_0x026b
            org.json.JSONObject r3 = X.C17880vN.A16(r3)     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "riskRules"
            java.lang.String r2 = r3.getString(r2)     // Catch:{ Exception -> 0x026b }
            byte[] r2 = android.util.Base64.decode(r2, r6)     // Catch:{ Exception -> 0x026b }
            org.json.JSONObject r3 = X.AnonymousClass8BW.A0x(r2)     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "BAL"
            java.lang.String r10 = r3.optString(r2, r5)     // Catch:{ Exception -> 0x026b }
            X.9s9 r3 = r4.A05     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "PendingTxn"
            java.lang.String r3 = r3.A01(r2)     // Catch:{ Exception -> 0x026b }
            boolean r2 = r3.equals(r5)     // Catch:{ Exception -> 0x026b }
            java.lang.String r4 = "%.2f"
            r9 = 0
            if (r2 == 0) goto L_0x0219
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x026b }
            float r2 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x026b }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x026b }
            r3[r9] = r2     // Catch:{ Exception -> 0x026b }
            java.lang.String r5 = java.lang.String.format(r4, r3)     // Catch:{ Exception -> 0x026b }
            goto L_0x026b
        L_0x0219:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ Exception -> 0x026b }
            r7.<init>(r3)     // Catch:{ Exception -> 0x026b }
            r8 = 0
            r6 = 0
        L_0x0220:
            int r2 = r7.length()     // Catch:{ Exception -> 0x026b }
            if (r6 >= r2) goto L_0x024a
            org.json.JSONObject r3 = r7.getJSONObject(r6)     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "isCredit"
            java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "false"
            boolean r2 = r3.equals(r2)     // Catch:{ Exception -> 0x026b }
            if (r2 == 0) goto L_0x0247
            org.json.JSONObject r3 = r7.getJSONObject(r6)     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = "txnAmount"
            java.lang.String r2 = r3.getString(r2)     // Catch:{ Exception -> 0x026b }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ Exception -> 0x026b }
            float r8 = r8 + r2
        L_0x0247:
            int r6 = r6 + 1
            goto L_0x0220
        L_0x024a:
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x026b }
            float r2 = java.lang.Float.parseFloat(r10)     // Catch:{ Exception -> 0x026b }
            float r2 = r2 - r8
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x026b }
            r3[r9] = r2     // Catch:{ Exception -> 0x026b }
            java.lang.String r5 = java.lang.String.format(r4, r3)     // Catch:{ Exception -> 0x026b }
            goto L_0x026b
        L_0x025c:
            r2.enforceInterface(r3)
            java.lang.String r3 = r2.readString()
            java.lang.String r2 = r2.readString()
            java.lang.String r5 = r13.BOR(r3, r2)
        L_0x026b:
            r1.writeNoException()
            r1.writeString(r5)
            return r0
        L_0x0272:
            r2.enforceInterface(r3)
            java.lang.String r14 = r2.readString()
            java.lang.String r15 = r2.readString()
            java.lang.String r16 = r2.readString()
            java.lang.String r17 = r2.readString()
            java.lang.String r18 = r2.readString()
            java.lang.String r19 = r2.readString()
            java.lang.String r20 = r2.readString()
            java.lang.String r21 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            org.npci.upi.security.services.CLResultReceiver r22 = X.AnonymousClass8CY.A01(r2)
            r13.BPh(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x02ab
        L_0x02a1:
            r2.enforceInterface(r3)
            java.lang.String r2 = r2.readString()
            r13.BKn(r2)
        L_0x02ab:
            r1.writeNoException()
            return r0
        L_0x02af:
            r2.enforceInterface(r3)
            java.lang.String r12 = r2.readString()
            java.lang.String r11 = r2.readString()
            java.lang.String r10 = r2.readString()
            java.lang.String r9 = r2.readString()
            java.lang.String r8 = r2.readString()
            java.lang.String r7 = r2.readString()
            java.lang.String r6 = r2.readString()
            java.lang.String r3 = r2.readString()
            android.os.IBinder r2 = r2.readStrongBinder()
            org.npci.upi.security.services.CLResultReceiver r5 = X.AnonymousClass8CY.A01(r2)
            android.os.Bundle r4 = X.C17880vN.A0D()
            java.lang.String r2 = "keyCode"
            r4.putString(r2, r12)
            java.lang.String r2 = "keyXmlPayload"
            r4.putString(r2, r11)
            java.lang.String r2 = "controls"
            r4.putString(r2, r10)
            java.lang.String r2 = "configuration"
            r4.putString(r2, r9)
            java.lang.String r2 = "salt"
            r4.putString(r2, r8)
            java.lang.String r2 = "payInfo"
            r4.putString(r2, r7)
            java.lang.String r2 = "trust"
            r4.putString(r2, r6)
            java.lang.String r2 = "languagePref"
            r4.putString(r2, r3)
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            X.8Cq r2 = new X.8Cq
            r2.<init>(r3)
            r2.A00 = r5
            X.C188559hc.A0B = r2
            android.content.Context r3 = r13.A00
            java.lang.Class<org.npci.upi.security.pinactivitycomponent.GetCredential> r2 = org.npci.upi.security.pinactivitycomponent.GetCredential.class
            android.content.Intent r2 = X.AnonymousClass8BR.A07(r3, r2)
            r2.putExtras(r4)
            r1.writeNoException()
            r1.writeInt(r0)
            r2.writeToParcel(r1, r0)
            return r0
        L_0x0329:
            r1.writeString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CX.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
