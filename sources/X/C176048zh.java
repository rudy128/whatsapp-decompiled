package X;

import android.text.TextUtils;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.crypto.KeyAgreement;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.8zh  reason: invalid class name and case insensitive filesystem */
public class C176048zh extends C192279o6 {
    public String A00;
    public final JniBridge A01;
    public final JSONObject A02;
    public final JSONObject A03;
    public final byte[] A04 = C17970vW.A0I(12);
    public final AnonymousClass17F A05;

    public void A01(PublicKey... publicKeyArr) {
        C17960vV.A0C(AnonymousClass000.A1X(this.A00));
        super.A01(publicKeyArr);
        try {
            String A0x = AnonymousClass8BT.A0x(AnonymousClass8BR.A1Z(this.A03.toString()));
            byte[] bArr = this.A04;
            byte[] bArr2 = bArr;
            String encodeToString = Base64.encodeToString(bArr, 11);
            ECGenParameterSpec eCGenParameterSpec = new ECGenParameterSpec("secp256r1");
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(eCGenParameterSpec);
            KeyPair generateKeyPair = instance.generateKeyPair();
            PublicKey publicKey = generateKeyPair.getPublic();
            JSONObject A15 = C17880vN.A15();
            JSONObject put = A15.put(PublicKeyCredentialControllerUtility.JSON_KEY_ALG, "ECDH-ES").put("enc", "A256GCM");
            List list = this.A00;
            C17960vV.A07(list);
            Collections.sort(list);
            put.put("apu", AnonymousClass8BT.A0x(AnonymousClass8BR.A1Z(TextUtils.join(";", list)))).put("apv", AnonymousClass8BT.A0x(AnonymousClass8BR.A1Z(AnonymousClass9R7.A00((PublicKey) null)))).put("epk", C17880vN.A15().put("kty", "EC").put("crv", "P-256").put("der", C108955ca.A14(publicKey.getEncoded())));
            String A0x2 = AnonymousClass8BT.A0x(AnonymousClass8BR.A1Z(A15.toString()));
            byte[] bytes = TextUtils.join(".", new String[]{A0x2, A0x}).getBytes();
            PrivateKey privateKey = generateKeyPair.getPrivate();
            KeyAgreement instance2 = KeyAgreement.getInstance("ECDH");
            instance2.init(privateKey);
            instance2.doPhase((Key) null, true);
            byte[] generateSecret = instance2.generateSecret();
            List list2 = this.A00;
            C17960vV.A07(list2);
            Collections.sort(list2);
            byte[] bytes2 = TextUtils.join(";", list2).getBytes();
            byte[] bytes3 = AnonymousClass9R7.A00((PublicKey) null).getBytes();
            byte[] A032 = A8G.A03(1);
            byte[] A1Z = AnonymousClass8BR.A1Z("A256GCM");
            byte[] A033 = A8G.A03(256);
            int length = generateSecret.length;
            int i = length + 4;
            int i2 = i + 4;
            int length2 = A1Z.length;
            int i3 = i2 + length2;
            int i4 = i3 + 4;
            int length3 = bytes2.length;
            int i5 = i4 + length3;
            int i6 = i5 + 4;
            int length4 = bytes3.length;
            int i7 = i6 + length4;
            byte[] bArr3 = new byte[(i7 + 4)];
            System.arraycopy(A032, 0, bArr3, 0, 4);
            System.arraycopy(generateSecret, 0, bArr3, 4, length);
            System.arraycopy(A8G.A03(length2), 0, bArr3, i, 4);
            System.arraycopy(A1Z, 0, bArr3, i2, length2);
            System.arraycopy(A8G.A03(length3), 0, bArr3, i3, 4);
            System.arraycopy(bytes2, 0, bArr3, i4, length3);
            System.arraycopy(A8G.A03(length4), 0, bArr3, i5, 4);
            System.arraycopy(bytes3, 0, bArr3, i6, length4);
            System.arraycopy(A033, 0, bArr3, i7, 4);
            byte[] WCIAPIGcmAesCreateEncryptedCiphertext = this.A01.WCIAPIGcmAesCreateEncryptedCiphertext(C108945cZ.A1I().digest(bArr3), bArr2, this.A02.toString().getBytes(), bytes, 16);
            if (WCIAPIGcmAesCreateEncryptedCiphertext == null) {
                throw new AnonymousClass9LF(AnonymousClass000.A0n("cipher failed"));
            }
            int length5 = WCIAPIGcmAesCreateEncryptedCiphertext.length;
            int i8 = length5 - 16;
            C19760yx A0B = AnonymousClass8BR.A0B(Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, 0, i8), Arrays.copyOfRange(WCIAPIGcmAesCreateEncryptedCiphertext, i8, length5));
            Object obj = A0B.A00;
            C17960vV.A07(obj);
            String encodeToString2 = Base64.encodeToString((byte[]) obj, 11);
            Object obj2 = A0B.A01;
            C17960vV.A07(obj2);
            String encodeToString3 = Base64.encodeToString((byte[]) obj2, 11);
            String[] A1b = C17880vN.A1b(A0x, A0x2, 6, 1);
            A1b[2] = "";
            A1b[3] = encodeToString;
            A1b[4] = encodeToString2;
            A1b[5] = encodeToString3;
            this.A00 = TextUtils.join(".", A1b);
        } catch (UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | JSONException e) {
            Log.w("PAY: EncryptedTrustTokenBuilder/declareSigningKeys", e);
            throw new AnonymousClass9LF(e);
        }
    }

    public C176048zh(AnonymousClass17F r2, JniBridge jniBridge, JSONObject jSONObject, JSONObject jSONObject2) {
        C17960vV.A0C(AnonymousClass000.A1R(jSONObject2.length()));
        this.A01 = jniBridge;
        this.A05 = r2;
        this.A03 = jSONObject;
        this.A02 = jSONObject2;
    }
}
