package X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.security.keystore.UserNotAuthenticatedException;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;
import org.npci.upi.security.pinactivitycomponent.GetCredential;

public class A7M {
    public float A00;
    public Activity A01;
    public KeyguardManager A02;
    public Context A03;
    public Boolean A04 = AnonymousClass000.A0h();
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public HashMap A09 = C17880vN.A11();
    public JSONObject A0A;
    public JSONObject A0B;
    public JSONObject A0C;
    public C194699s9 A0D;
    public String A0E = null;
    public JSONArray A0F;
    public JSONObject A0G;
    public AnonymousClass9Nz A0H;
    public A8J A0I;

    private String A01(String str, String str2, int i) {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            Signature instance2 = Signature.getInstance("SHA512withRSA/PSS");
            instance2.initSign((PrivateKey) instance.getKey(str2, (char[]) null));
            instance2.update(str.getBytes("UTF8"));
            return C108955ca.A14(instance2.sign());
        } catch (UserNotAuthenticatedException unused) {
            KeyguardManager keyguardManager = (KeyguardManager) this.A03.getSystemService("keyguard");
            this.A02 = keyguardManager;
            Intent createConfirmDeviceCredentialIntent = keyguardManager.createConfirmDeviceCredentialIntent((CharSequence) null, (CharSequence) null);
            if (createConfirmDeviceCredentialIntent != null) {
                this.A01.startActivityForResult(createConfirmDeviceCredentialIntent, i);
            }
            return null;
        }
    }

    private void A02() {
        boolean booleanValue = this.A04.booleanValue();
        String str = "ATC";
        JSONObject jSONObject = this.A0B;
        String valueOf = String.valueOf(Integer.parseInt(jSONObject.getString(str)) + 1);
        if (booleanValue) {
            jSONObject.put(str, valueOf);
            JSONObject jSONObject2 = this.A0B;
            jSONObject2.put("OTC", String.valueOf(Integer.parseInt(jSONObject2.getString("OTC")) + 1));
            jSONObject = this.A0B;
            str = "COTA";
            valueOf = String.format("%.2f", new Object[]{Float.valueOf(Float.parseFloat(jSONObject.getString(str)) + this.A00)});
        }
        jSONObject.put(str, valueOf);
        this.A0D.A03(this.A0B.toString(), "ClientRiskRules");
    }

    public void A04() {
        String A002 = A00(1);
        if (A002 != null) {
            A02();
            if (this.A04.booleanValue()) {
                String encodeToString = Base64.encodeToString(this.A0C.toString().getBytes(DefaultCrypto.UTF_8), 2);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(this.A07);
                String A1H = AnonymousClass001.A1H("|", encodeToString, A10);
                JSONObject A15 = C17880vN.A15();
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, A01(A1H, this.A08, 1));
                A15.put("dynamicData", A1H);
                this.A0E = Base64.encodeToString(AnonymousClass8BS.A0k(this.A06, "deviceCert", A15).getBytes("UTF8"), 2);
            }
            A03("false");
            A06(C108975cc.A1b(A002));
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.9js, java.lang.Object] */
    public void A06(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            JSONArray jSONArray = this.A0F;
            String optString = AnonymousClass8BR.A1B(jSONArray, i).optString("subtype", "");
            String optString2 = AnonymousClass8BR.A1B(jSONArray, i).optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "");
            Boolean bool = Boolean.TRUE;
            if (optString.equals("MPIN")) {
                bool = Boolean.FALSE;
            }
            JSONObject jSONObject = this.A0A;
            JSONObject A16 = C17880vN.A16(AnonymousClass8BS.A0k(strArr[i], "credential", jSONObject));
            JSONObject A15 = C17880vN.A15();
            JSONArray A1A = AnonymousClass8BR.A1A();
            JSONArray jSONArray2 = jSONObject.getJSONArray("credType");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                A16.put("txnId", jSONObject.getJSONArray("txnId").get(i2));
                A16.put("credType", jSONObject.getJSONArray("credType").get(i2));
                AnonymousClass9Nz r0 = ((GetCredential) this.A03).A0D.A0G;
                this.A0H = r0;
                A1A.put(r0.A0A.A00(A16));
                C21336AiM A002 = this.A0H.A01().A00(bool, A1A.getString(i2), optString2, optString, A16);
                if (this.A04.booleanValue()) {
                    A002.data.oda = this.A0E;
                }
                String string = jSONArray2.getString(i2);
                StringBuilder A10 = AnonymousClass000.A10();
                C181919Si.A00(A002, A10);
                AnonymousClass8BS.A1C(A10, string, A15);
            }
            this.A09.put(optString, A15.toString());
        }
        Boolean A0h = AnonymousClass000.A0h();
        JSONObject jSONObject2 = this.A0G;
        if (jSONObject2 != null) {
            A0h = AnonymousClass8BU.A0g(jSONObject2.optString("getDeviceDetails", "false"));
        }
        if (A0h.booleanValue()) {
            Context context = this.A03;
            ? obj = new Object();
            obj.A00 = context;
            this.A09.put("det", this.A0H.A01().A01(obj.A01(), this.A0A));
        }
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putSerializable("credBlocks", this.A09);
        C188559hc.A0B.send(1, A0D2);
        AnonymousClass3MW.A1U(this.A03);
    }

    private String A00(int i) {
        JSONObject jSONObject = this.A0A;
        String string = jSONObject.getString("txnAmount");
        String string2 = jSONObject.getString("txnTimestamp");
        String string3 = jSONObject.getString("payerLiteAccNumber");
        String string4 = jSONObject.getString("payeeAddr");
        String string5 = jSONObject.getString("appId");
        String string6 = jSONObject.getString("mobileNumber");
        String string7 = jSONObject.getString("deviceId");
        String A012 = this.A0D.A01("AES");
        byte[] bytes = AnonymousClass8BS.A0k(C108955ca.A14(this.A0B.toString().getBytes(DefaultCrypto.UTF_8)), "clientRiskRules", C17880vN.A16(this.A0C.toString())).getBytes();
        byte[] decode = Base64.decode(A012, 2);
        byte[] A1b = AnonymousClass8BX.A1b("AES/GCM/NoPadding", new SecureRandom());
        byte[] A1Q = AnonymousClass8BS.A1Q(new SecretKeySpec(decode, "AES"), AnonymousClass8BT.A11(A1b), Cipher.getInstance("AES/GCM/NoPadding"), bytes, 1);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(Base64.encodeToString(A1Q, 2));
        A10.append("|");
        String A0y = AnonymousClass000.A0y(Base64.encodeToString(A1b, 2), A10);
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0c("1.0|", string, "|", (String) jSONObject.getJSONArray("txnId").get(0), A102);
        A102.append("|");
        A102.append(string2);
        A102.append("|");
        C17890vO.A10(string3, "|", string4, A102);
        A102.append("|");
        C17890vO.A10(string5, "|", string6, A102);
        String A1H = AnonymousClass001.A1H("|", string7, A102);
        this.A07 = A1H;
        String A013 = A01(Base64.encodeToString(C17900vP.A0H(A1H, "|", A0y).toString().getBytes(DefaultCrypto.UTF_8), 2), this.A08, i);
        if (A013 == null) {
            return A013;
        }
        JSONObject A15 = C17880vN.A15();
        A15.put("riskParams", A0y);
        return Base64.encodeToString(AnonymousClass8BS.A0k(A013, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, A15).getBytes(DefaultCrypto.UTF_8), 2);
    }

    public void A05(String str) {
        try {
            this.A05 = str;
            String A002 = A00(0);
            if (A002 != null) {
                A02();
                A03("true");
                String[] A1Z = C17880vN.A1Z();
                AnonymousClass001.A1Q(str, A002, A1Z);
                A06(A1Z);
            }
        } catch (Exception unused) {
            ((GetCredential) this.A03).A2x("TECHNICAL_ERROR");
        }
    }

    public boolean A07(Integer num) {
        Boolean bool;
        boolean A1P;
        boolean equals;
        JSONObject jSONObject = this.A0G;
        if (jSONObject != null) {
            this.A04 = AnonymousClass8BU.A0g(jSONObject.optString("isAuthOffline", "false"));
        }
        JSONObject jSONObject2 = this.A0A;
        String A14 = C108955ca.A14(A8J.A04(C17900vP.A0H(jSONObject2.getString("deviceId"), jSONObject2.getString("mobileNumber"), jSONObject2.getString("accountRef")).toString()));
        this.A08 = A14;
        C194699s9 A002 = C194699s9.A00(this.A03, A14);
        this.A0D = A002;
        if (A002.A01("PendingTxn").equals("")) {
            this.A0B = C17880vN.A16(this.A0D.A01("ClientRiskRules"));
            this.A0C = C17880vN.A16(this.A0D.A01("ServerRiskParams"));
            try {
                String A012 = this.A0D.A01("DeviceCertificate");
                this.A06 = A012;
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(A012.getBytes());
                    try {
                        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                        byteArrayInputStream.close();
                        x509Certificate.checkValidity();
                        if (!num.equals(C182339Tz.A01)) {
                            try {
                                bool = C20010A3a.A00(this.A0C);
                            } catch (Exception unused) {
                                bool = AnonymousClass000.A0h();
                            }
                            if (bool.booleanValue()) {
                                JSONObject A0x = AnonymousClass8BW.A0x(AnonymousClass8BT.A1a(this.A0C.getString("riskRules")));
                                this.A00 = Float.parseFloat(jSONObject2.getString("txnAmount"));
                                float parseFloat = Float.parseFloat(A0x.getString("LTL"));
                                float parseFloat2 = Float.parseFloat(A0x.getString("BAL"));
                                String string = A0x.getString("ACSTATUS");
                                if (this.A04.booleanValue()) {
                                    boolean parseBoolean = Boolean.parseBoolean(A0x.getString("EOT"));
                                    float parseFloat3 = Float.parseFloat(A0x.getString("OTL"));
                                    int parseInt = Integer.parseInt(this.A0B.getString("OTC"));
                                    int parseInt2 = Integer.parseInt(A0x.getString("MOTC"));
                                    float parseFloat4 = Float.parseFloat(this.A0B.getString("COTA"));
                                    float parseFloat5 = Float.parseFloat(A0x.getString("COTAL"));
                                    float f = this.A00;
                                    A1P = C108975cc.A1A(((parseFloat4 + f) > parseFloat5 ? 1 : ((parseFloat4 + f) == parseFloat5 ? 0 : -1))) & C108975cc.A1A((f > parseFloat ? 1 : (f == parseFloat ? 0 : -1))) & C108975cc.A1A((f > parseFloat2 ? 1 : (f == parseFloat2 ? 0 : -1))) & C108975cc.A1A((f > parseFloat3 ? 1 : (f == parseFloat3 ? 0 : -1))) & AnonymousClass000.A1U(parseInt, parseInt2) & parseBoolean;
                                    equals = string.equals("A");
                                } else {
                                    float f2 = this.A00;
                                    boolean A1A = C108975cc.A1A((f2 > parseFloat ? 1 : (f2 == parseFloat ? 0 : -1))) & C108975cc.A1A((f2 > parseFloat2 ? 1 : (f2 == parseFloat2 ? 0 : -1)));
                                    boolean equals2 = string.equals("A");
                                    if (!A1A || !equals2) {
                                        A1P = AnonymousClass000.A1P((f2 > parseFloat2 ? 1 : (f2 == parseFloat2 ? 0 : -1))) & equals2;
                                        equals = jSONObject2.getString("payerAddr").equals(jSONObject2.getString("payeeAddr"));
                                    }
                                }
                                if (A1P && equals) {
                                    return true;
                                }
                            }
                            throw AnonymousClass000.A0k("Lite validation Failed");
                        }
                        return true;
                    } catch (Throwable th) {
                        th = th;
                        byteArrayInputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Exception unused2) {
                throw new CertificateException("Device Certificate Expired");
            }
        } else {
            throw AnonymousClass000.A0n("Pending transaction for Sync");
        }
    }

    public A7M(Context context, JSONArray jSONArray, JSONObject jSONObject, JSONObject jSONObject2) {
        this.A03 = context;
        this.A0A = jSONObject;
        this.A0F = jSONArray;
        this.A0G = jSONObject2;
        this.A01 = (Activity) context;
        this.A0I = new A8J();
    }

    private void A03(String str) {
        JSONArray jSONArray;
        JSONObject A15 = C17880vN.A15();
        JSONObject jSONObject = this.A0A;
        A15.put("txnId", jSONObject.getJSONArray("txnId").get(0));
        A15.put("txnAmount", jSONObject.getString("txnAmount"));
        A15.put("isCredit", str);
        try {
            jSONArray = new JSONArray(this.A0D.A01("PendingTxn"));
        } catch (Exception unused) {
            jSONArray = AnonymousClass8BR.A1A();
        }
        jSONArray.put(A15);
        this.A0D.A03(jSONArray.toString(), "PendingTxn");
    }
}
