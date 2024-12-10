package X;

import android.text.TextUtils;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import com.whatsapp.util.Log;
import java.security.PublicKey;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;

public abstract class A60 {
    public static final String[] A00 = {"MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAjlh/7UEoTs3y0teyqbR70frEsSnRhkj1hYQS7oa26GlzDtsXrmlCMMdMHfYQsjGouKQ8JCsejtdw8FIIwt1aoaaS5IXtHFsE9rDbL6oROYU4g5TDvi9wZdm4/Q/hEUIopeymVl7LZvJh8LR+l5CsTyoSV0A8aED1e0vaFYN//6RGeNffdt1E86cficxTASORnl7V7QYksZehmvksPlqxzKq/N/2qQnqsSZgZGa2soMc+lxt4TW9JlBTkI3PJVvXdE4ZKiC56I4zDiTTT4rStp9ZA0rznVCN2jhZPBeXHHhUsvtDCTHPv/M83VGurWJmPdw0cf4FZzhTEvp1d7MzZb6+DRTlHQonj8p8NR/sAQBNm9KqzmKqbyPbe8AC6lljt+AvO1/XbxWKzChvXFH7zVbXfxjclm7dsXANgXGeCYGNsm4gHHxy4GcNaX1Vq1d3Q1n+aG5z+ks9BNNpvMX0V6mKQ+UZReCCqPbeP4p7lKN0e97xE/tAUSjPgZGnCcBFHAgMBAAE=", "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEA3jL8MW8+0NAy4RqiB8w57xRQOzZ9xSOJXDiOL0ycf1rOFjHVNvNRECKKf+9yEKFjD/lZLVx33/4vHHykqQW6mS1MH3eenw2du/hG9EKRWCaezIwgqxwYhhZbdDQ7SiM88LUcZxKBZLYgmgfLzJYQD0ycTcaH5VKvye6cpV2P2y3e/eiCSamybQplygLJtS54+mXWZ5cAbfI89WNwFeofXkXF9r6N0zJOvz03GweZQjzcN55xonfLErECMLM4F5MuPNdzLsaWb275A19NDTlcuppbXtqkOA6ZXKOGIwtLekCElv3/L+Xe4i2OkclXJYAQ2oBBm6onW24afaR4Yea5FhBlNsXkPgZ2CuC2k3diabqRAbVDH9c2RrExgH7FYamLeOiE2W/EtWJEEZthRDciXMHgoWr9ZzQNof3ZdSauV3rUHB5FaXQhLP1qA+JS7F/634PogKk0NlO/4qrFKeG6sIiNyRFmbE0I+RTitK8pvJHz7JNDGmTxIRCiDXBZDQ7RAgMBAAE="};
    public static final Set A01;

    static {
        String[] strArr = new String[56];
        strArr[0] = "123qwe";
        strArr[1] = "1q2w3e4r";
        strArr[2] = "1qaz2wsx";
        strArr[3] = "Football";
        strArr[4] = "Million2";
        strArr[5] = "aa123456";
        strArr[6] = "aaron431";
        strArr[7] = "abc123";
        strArr[8] = "access";
        strArr[9] = "admin";
        strArr[10] = "adobe123[a]";
        strArr[11] = "ashley";
        strArr[12] = "azerty";
        strArr[13] = "bailey";
        strArr[14] = "baseball";
        strArr[15] = "batman";
        strArr[16] = "charlie";
        strArr[17] = "donald";
        strArr[18] = "dragon";
        strArr[19] = "flower";
        strArr[20] = "football";
        strArr[21] = "freedom";
        strArr[22] = "hello";
        strArr[23] = "hottie";
        strArr[24] = "iloveyou";
        strArr[25] = "jesus";
        strArr[26] = "letmein";
        strArr[27] = "login";
        strArr[28] = "lovely";
        strArr[29] = "loveme";
        strArr[30] = "master";
        strArr[31] = "michael";
        strArr[32] = "monkey";
        strArr[33] = "mustang";
        strArr[34] = "ninja";
        strArr[35] = "passw0rd";
        strArr[36] = "password";
        strArr[37] = "password1";
        strArr[38] = "photoshop[a]";
        strArr[39] = "picture1";
        strArr[40] = "princess";
        strArr[41] = "qazwsx";
        strArr[42] = "qqww1122";
        strArr[43] = "qwerty";
        strArr[44] = "qwerty123";
        strArr[45] = "qwertyuiop";
        strArr[46] = "senha";
        strArr[47] = "shadow";
        strArr[48] = "solo";
        strArr[49] = "starwars";
        strArr[50] = "sunshine";
        strArr[51] = "superman";
        strArr[52] = "trustno1";
        strArr[53] = "welcome";
        strArr[54] = "whatever";
        A01 = C17900vP.A0I("zaq1zaq1", strArr, 55);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.CUp, java.lang.Object] */
    public static boolean A01(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            ? obj = new Object();
            int length = bArr2.length;
            int length2 = bArr.length;
            int i = length + length2;
            byte[] bArr4 = new byte[i];
            System.arraycopy(bArr2, 0, bArr4, 0, length);
            System.arraycopy(bArr, 0, bArr4, length, length2);
            return C25362CeN.A00(obj, new byte[i], bArr4, bArr3, (long) i) == 0;
        } catch (C21577AmR | IllegalArgumentException e) {
            Log.e("EncryptedBackupUtils/verifyEd25519SignatureAgainstKey/exception.", e);
        }
    }

    public static int A00(String str) {
        String trim = str.trim();
        if (TextUtils.isEmpty(trim)) {
            return 0;
        }
        if (trim.codePointCount(0, trim.length()) < 6) {
            return 1;
        }
        if (!trim.matches(".*\\p{L}+.*")) {
            return 2;
        }
        if (A01.contains(trim) || SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME.equalsIgnoreCase(trim) || TextUtils.isEmpty(trim)) {
            return 3;
        }
        String trim2 = trim.trim();
        int codePointCount = trim2.codePointCount(0, trim2.length());
        if (codePointCount < 3) {
            return 3;
        }
        HashSet hashSet = new HashSet(3);
        int i = 0;
        do {
            if (hashSet.add(Integer.valueOf(trim2.codePointAt(i))) && hashSet.size() >= 3) {
                return 4;
            }
            i++;
        } while (i < codePointCount);
        return 3;
    }

    public static byte[] A02(byte[] bArr, byte[] bArr2) {
        PublicKey A0h = AnonymousClass8BX.A0h(bArr2);
        Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
        instance.init(1, A0h);
        return instance.doFinal(bArr);
    }
}
