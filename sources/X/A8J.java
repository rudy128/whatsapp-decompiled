package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.security.auth.x500.X500Principal;

public class A8J {
    public Cipher A00 = Cipher.getInstance("AES/CBC/PKCS5Padding");

    public static String A02(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 * 2);
        for (byte b : bArr) {
            Object[] A1a = AnonymousClass3MW.A1a();
            C17880vN.A1T(A1a, b & 255, 0);
            sb.append(String.format("%02x", A1a));
        }
        return sb.toString();
    }

    public static SecretKey A03(String str) {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(new String[]{"GCM"}).setUserAuthenticationRequired(false).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            return instance.generateKey();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            throw new RuntimeException("Failed to create symmetric key ", e);
        }
    }

    public static byte[] A04(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes(DefaultCrypto.UTF_8));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException unused) {
        }
        return messageDigest.digest();
    }

    public static String A01(String str, String str2) {
        String[] split = str.split("\\|");
        byte[] decode = Base64.decode(split[0], 2);
        byte[] decode2 = Base64.decode(str2, 2);
        return new String(AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(decode2), AnonymousClass8BT.A11(Base64.decode(split[1], 2)), AnonymousClass8BR.A18(), decode, 2));
    }

    public static String A00(Boolean bool, String str) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance2.add(1, 999);
        KeyPairGenerator instance3 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        if (Build.VERSION.SDK_INT >= 23) {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(str, 12);
            if (Build.VERSION.SDK_INT >= 30) {
                builder.setUserAuthenticationParameters(15, 3);
            } else {
                builder.setUserAuthenticationValidityDurationSeconds(15);
            }
            instance3.initialize(builder.setKeySize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH).setKeyValidityStart(instance.getTime()).setKeyValidityEnd(instance2.getTime()).setDigests(new String[]{"SHA-512"}).setUserAuthenticationRequired(bool.booleanValue()).setSignaturePaddings(new String[]{"PSS"}).setCertificateSubject(new X500Principal("CN=NPCI_CERT")).setCertificateSerialNumber(BigInteger.ONE).build());
        }
        KeyPair genKeyPair = instance3.genKeyPair();
        PrivateKey privateKey = genKeyPair.getPrivate();
        if (((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore").getKeySpec(privateKey, KeyInfo.class)).isInsideSecureHardware()) {
            return C108955ca.A14(genKeyPair.getPublic().getEncoded());
        }
        throw new InvalidKeySpecException("TEE is unavailable");
    }

    public static byte[] A05(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(bArr2), AnonymousClass8BT.A11(bArr3), AnonymousClass8BR.A18(), bArr, 1);
    }

    public static byte[] A06(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(bArr2), AnonymousClass8BT.A11(bArr3), AnonymousClass8BR.A18(), bArr, 2);
    }
}
