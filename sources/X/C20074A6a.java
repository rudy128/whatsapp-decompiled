package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A6a  reason: case insensitive filesystem */
public class C20074A6a {
    public final AnonymousClass11P A00;
    public final AnonymousClass1QD A01;
    public final C197669x4 A02;
    public final A7I A03;
    public final JniBridge A04;

    public String A05(String str) {
        String A002 = A00(this, 1);
        if (!TextUtils.isEmpty(A002)) {
            byte[] bArr = (byte[]) JniBridge.jvidispatchOOO(13, A002.getBytes(), AnonymousClass001.A1H("C=US,ST=California,L=Menlo Park,O=Facebook,OU=WhatsApp,CN=", str, AnonymousClass000.A10()).getBytes());
            if (bArr != null) {
                return new String(bArr).split("\u0000")[0];
            }
        }
        return null;
    }

    public static String A00(C20074A6a a6a, int i) {
        PrivateKey A042 = a6a.A03.A04(i);
        if (A042 == null) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("-----BEGIN PRIVATE KEY-----\r\n");
        A10.append(Base64.encodeToString(A042.getEncoded(), 0));
        return AnonymousClass000.A0y("-----END PRIVATE KEY-----\r\n\u0000", A10);
    }

    public static String A01(C20074A6a a6a, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            try {
                String str3 = C19620yd.A0A;
                String join = TextUtils.join(".", new String[]{Base64.encodeToString(str.getBytes(str3), 11), Base64.encodeToString(str2.getBytes(str3), 11)});
                String A002 = A00(a6a, 1);
                if (!TextUtils.isEmpty(A002)) {
                    return AnonymousClass000.A0y(Base64.encodeToString((byte[]) JniBridge.jvidispatchOOO(12, join.getBytes(), A002.getBytes()), 11), AnonymousClass8BW.A0o(join, "."));
                }
            } catch (UnsupportedEncodingException e) {
                Log.w("PAY: generateJwsToken threw UnsupportedEncoding Exception: ", e);
            }
        }
        return null;
    }

    public String A03(AZ0 az0, String str) {
        String str2;
        try {
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            byte[] A0I = C17970vW.A0I(12);
            String encodeToString = Base64.encodeToString(A0I, 11);
            JSONObject A15 = C17880vN.A15();
            ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
            try {
                A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "ECDH-ES").put("enc", "A256GCM").put("epk", C17880vN.A15().put("kty", "EC").put("crv", "P-256").put("x", Base64.encodeToString(w.getAffineX().toByteArray(), 2)).put("y", Base64.encodeToString(w.getAffineY().toByteArray(), 2)));
            } catch (JSONException e) {
                Log.e("PAY: BrazilTokenizationHelper/generateEncodedEloHeader failed: ", e);
            }
            try {
                str2 = Base64.encodeToString(AnonymousClass8BR.A1Z(A15.toString()), 11);
            } catch (UnsupportedEncodingException e2) {
                Log.e("PAY: BrazilTokenizationHelper/generateEncodedEloHeader failed: ", e2);
                str2 = "";
            }
            byte[] bArr = new byte[0];
            try {
                bArr = str2.getBytes("US-ASCII");
            } catch (UnsupportedEncodingException e3) {
                Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating aad: ", e3);
            }
            try {
                PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(az0.A00));
                if (generatePublic != null) {
                    byte[] bArr2 = new byte[0];
                    try {
                        PrivateKey privateKey = generateKeyPair.getPrivate();
                        KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
                        instance2.init(privateKey);
                        instance2.doPhase(generatePublic, true);
                        bArr2 = instance2.generateSecret();
                    } catch (InvalidKeyException | NoSuchAlgorithmException e4) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating sharedSecret: ", e4);
                    }
                    byte[] bArr3 = new byte[0];
                    try {
                        byte[] A032 = A8G.A03(0);
                        byte[] A033 = A8G.A03(0);
                        byte[] A034 = A8G.A03(1);
                        byte[] A1Z = AnonymousClass8BR.A1Z("A256GCM");
                        byte[] A035 = A8G.A03(256);
                        int length = bArr2.length;
                        int i = 4 + length;
                        int length2 = A1Z.length;
                        int i2 = i + 4;
                        int i3 = i2 + length2;
                        int i4 = i3 + 4;
                        int i5 = i4 + 4;
                        byte[] bArr4 = new byte[(i5 + 4)];
                        System.arraycopy(A034, 0, bArr4, 0, 4);
                        System.arraycopy(bArr2, 0, bArr4, 4, length);
                        System.arraycopy(A8G.A03(length2), 0, bArr4, i, 4);
                        System.arraycopy(A1Z, 0, bArr4, i2, length2);
                        System.arraycopy(A032, 0, bArr4, i3, 4);
                        System.arraycopy(A033, 0, bArr4, i4, 4);
                        System.arraycopy(A035, 0, bArr4, i5, 4);
                        Boolean bool = C17960vV.A01;
                        bArr3 = C108945cZ.A1I().digest(bArr4);
                    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e5) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed symmetric key generation: ", e5);
                    }
                    byte[] bArr5 = new byte[0];
                    try {
                        bArr5 = this.A04.WCIAPIGcmAesCreateEncryptedCiphertext(bArr3, A0I, AnonymousClass8BR.A1Z(str), bArr, 16);
                    } catch (UnsupportedEncodingException e6) {
                        Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed: ", e6);
                    }
                    if (bArr5 != null) {
                        int length3 = bArr5.length;
                        int i6 = length3 - 16;
                        byte[] copyOfRange = Arrays.copyOfRange(bArr5, 0, i6);
                        C17960vV.A07(copyOfRange);
                        String encodeToString2 = Base64.encodeToString(copyOfRange, 11);
                        byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, i6, length3);
                        C17960vV.A07(copyOfRange2);
                        String encodeToString3 = Base64.encodeToString(copyOfRange2, 11);
                        String[] strArr = new String[5];
                        strArr[0] = str2;
                        strArr[1] = "";
                        AnonymousClass001.A1R(encodeToString, encodeToString2, strArr);
                        strArr[4] = encodeToString3;
                        return TextUtils.join(".", strArr);
                    }
                }
                return null;
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e7) {
                throw AnonymousClass8BR.A0v(e7);
            }
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e8) {
            Log.e("PAY: BrazilTokenizationHelper/fetchBindingInfo failed generating ephemeral key: ", e8);
        }
    }

    public C20074A6a(AnonymousClass11P r1, AnonymousClass1QD r2, C197669x4 r3, A7I a7i, JniBridge jniBridge) {
        this.A00 = r1;
        this.A04 = jniBridge;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = a7i;
    }

    public static String A02(String str, String str2, String str3) {
        JSONObject A15 = C17880vN.A15();
        A15.put("clientDeviceID", str);
        if (!TextUtils.isEmpty(str2)) {
            A15.put("clientReferenceID", str2);
        }
        A15.put("vProvisionedTokenID", str3);
        return AnonymousClass8BS.A0k(String.valueOf(new SecureRandom().nextInt(100000)), "nonce", A15);
    }

    public String A04(AZ2 az2, String str) {
        BigInteger bigInteger;
        try {
            String A0k = AnonymousClass8BS.A0k("PS256", PublicKeyCredentialControllerUtility.JSON_KEY_ALG, C17880vN.A15());
            PrivateKey A042 = this.A03.A04(1);
            String str2 = null;
            if (A042 != null) {
                try {
                    JSONObject put = C17880vN.A15().put("otp", str).put("certID", C197669x4.A00(((RSAKey) A042).getModulus()));
                    C197669x4 r6 = this.A02;
                    String obj = put.toString();
                    AZ2 az22 = az2;
                    try {
                        bigInteger = ((RSAPublicKey) AnonymousClass8BX.A0h(az22.A06)).getModulus();
                    } catch (Exception e) {
                        try {
                            Log.w("PAY: JweCompactSerializer/getModulusFromProviderKey failed: ", e);
                            bigInteger = null;
                        } catch (Exception e2) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("PAY: JweCompactSerializer/encryptCek");
                            C17890vO.A1B(A10, e2.toString());
                            throw AnonymousClass8BR.A0x(e2);
                        } catch (Exception e3) {
                            Log.w("PAY: JweCompactSerializer/generateStepUpJweToken failed: ", e3);
                        }
                    }
                    String obj2 = C17880vN.A15().put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "RSA-OAEP-256").put("enc", "A256GCM").put("typ", "JOSE").put("kid", C197669x4.A00(bigInteger)).toString();
                    String str3 = C19620yd.A0A;
                    String encodeToString = Base64.encodeToString(obj2.getBytes(str3), 11);
                    byte[] bArr = new byte[32];
                    SecureRandom secureRandom = new SecureRandom();
                    secureRandom.nextBytes(bArr);
                    PublicKey A0h = AnonymousClass8BX.A0h(az22.A06);
                    Cipher instance = Cipher.getInstance("RSA/ECB/OAEPwithSHA-256andMGF1Padding");
                    instance.init(1, A0h);
                    String encodeToString2 = Base64.encodeToString(instance.doFinal(bArr), 11);
                    byte[] bArr2 = new byte[12];
                    secureRandom.nextBytes(bArr2);
                    String encodeToString3 = Base64.encodeToString(bArr2, 11);
                    byte[] bytes = obj.getBytes(str3);
                    byte[] WCIAPIGcmAesCreateEncryptedCiphertext = r6.A00.WCIAPIGcmAesCreateEncryptedCiphertext(bArr, bArr2, bytes, encodeToString.getBytes("US-ASCII"), 16);
                    if (WCIAPIGcmAesCreateEncryptedCiphertext != null) {
                        int length = bytes.length;
                        byte[] copyOfRange = Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length);
                        byte[] copyOfRange2 = Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, length, WCIAPIGcmAesCreateEncryptedCiphertext.length);
                        String encodeToString4 = Base64.encodeToString(copyOfRange, 11);
                        String encodeToString5 = Base64.encodeToString(copyOfRange2, 11);
                        String[] A1b = C17880vN.A1b(encodeToString, encodeToString2, 5, 1);
                        AnonymousClass001.A1R(encodeToString3, encodeToString4, A1b);
                        A1b[4] = encodeToString5;
                        str2 = TextUtils.join(".", A1b);
                    }
                } catch (JSONException e4) {
                    Log.w("PAY: BrazilTokenizationHelper/generateStepUpJweToken failed: ", e4);
                }
            }
            return A01(this, A0k, str2);
        } catch (JSONException e5) {
            Log.w("PAY: generateJwsTokenForCode failed: ", e5);
            return null;
        }
    }

    public String A06(String str) {
        if (!TextUtils.isEmpty(str)) {
            String A002 = A00(this, 5);
            if (!TextUtils.isEmpty(A002)) {
                return C108955ca.A14((byte[]) JniBridge.jvidispatchOOO(14, str.getBytes(), A002.getBytes()));
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.A02.A06("Failed to get the wallet_secret");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        com.whatsapp.util.Log.e("PAY: BrazilTokenizationHelper/fetchEloWalletSecret failed: ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        com.whatsapp.util.Log.e("PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed: ", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0094 A[Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6 A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (r1v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:3:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            r3 = 0
            if (r0 != 0) goto L_0x00ac
            java.lang.String r9 = "SHA-256"
            java.lang.String r4 = ""
            X.1QD r2 = r10.A01     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            android.content.SharedPreferences r1 = r2.A03()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "payment_trusted_device_elo_wallet_store"
            r8 = 0
            java.lang.String r0 = r1.getString(r0, r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            if (r0 == 0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            org.json.JSONObject r1 = X.C17880vN.A15()     // Catch:{ JSONException -> 0x002b, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            goto L_0x0024
        L_0x0020:
            org.json.JSONObject r1 = X.C17880vN.A16(r0)     // Catch:{ JSONException -> 0x002b, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
        L_0x0024:
            java.lang.String r0 = "wallet_secret"
            java.lang.String r8 = r1.getString(r0)     // Catch:{ JSONException -> 0x002b, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            goto L_0x0032
        L_0x002b:
            X.1QE r1 = r2.A02     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "Failed to get the wallet_secret"
            r1.A06(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
        L_0x0032:
            X.A7I r1 = r10.A03     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            r0 = 5
            java.security.PrivateKey r7 = r1.A04(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            if (r7 == 0) goto L_0x008b
            boolean r0 = android.text.TextUtils.isEmpty(r8)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "RSA/ECB/OAEPPadding"
            javax.crypto.Cipher r6 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r5 = "MGF1"
            java.security.spec.MGF1ParameterSpec r2 = new java.security.spec.MGF1ParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            r2.<init>(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            javax.crypto.spec.PSource$PSpecified r0 = javax.crypto.spec.PSource.PSpecified.DEFAULT     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            javax.crypto.spec.OAEPParameterSpec r1 = new javax.crypto.spec.OAEPParameterSpec     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            r1.<init>(r9, r5, r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            r0 = 2
            r6.init(r0, r7, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            byte[] r0 = android.util.Base64.decode(r8, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            byte[] r2 = r6.doFinal(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r1 = new java.lang.String     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            r1.<init>(r2, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "-----BEGIN (.*)-----"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "-----END (.*)----"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "\r\n"
            java.lang.String r1 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = r0.trim()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0085, InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            goto L_0x008c
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/fetchEloWalletSecret failed: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
        L_0x008b:
            r0 = 0
        L_0x008c:
            if (r0 != 0) goto L_0x0094
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed because secret is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            return r3
        L_0x0094:
            r2 = 2
            byte[] r1 = android.util.Base64.decode(r0, r2)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            byte[] r0 = r11.getBytes()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            byte[] r0 = X.AnonymousClass9QC.A00(r0, r1)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x00a6 }
            return r0
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = "PAY: BrazilTokenizationHelper/signEloDataWithWalletSecret failed: "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00ac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20074A6a.A07(java.lang.String):java.lang.String");
    }

    public String A08(String str, String str2, String str3) {
        try {
            JSONObject A15 = C17880vN.A15();
            A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "PS256");
            A15.put("typ", "JOSE");
            return A01(this, AnonymousClass8BS.A0k(str, "kid", A15), A02(str, str2, str3));
        } catch (JSONException e) {
            Log.w("PAY: generateDeviceBindingJwsToken threw creating json string: ", e);
            return null;
        }
    }
}
