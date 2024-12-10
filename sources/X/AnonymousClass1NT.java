package X;

import android.text.TextUtils;
import android.util.Base64;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.1NT  reason: invalid class name */
public class AnonymousClass1NT {
    public static final byte[] A09 = "backup encryption".getBytes();
    public static final byte[] A0A = "metadata authentication".getBytes();
    public static final byte[] A0B = "metadata encryption".getBytes();
    public final C25001Mm A00;
    public final AnonymousClass1NP A01;
    public final AnonymousClass1NO A02;
    public final AnonymousClass1NU A03;
    public final AnonymousClass1NM A04;
    public final C19830z4 A05;
    public final AnonymousClass1NV A06 = new AnonymousClass1NV(new Random(), 3, 200, 1000);
    public final AnonymousClass10I A07;
    public final JniBridge A08;

    public void A02() {
        AnonymousClass1NP r1 = this.A01;
        r1.A0J(C49532Qv.UNENCRYPTED);
        r1.A0D(0);
        r1.A0N(false);
        C64062u9.A0Q(new File(this.A02.A00.A00.getFilesDir(), "encrypted_backup.key"));
        Log.i("encb/EncBackupManager/encrypted backup has been disabled");
    }

    public boolean A04() {
        if (this.A01.A08() != C49532Qv.UNENCRYPTED) {
            return true;
        }
        return false;
    }

    public byte[] A05() {
        AnonymousClass1NO r2 = this.A02;
        byte[] A032 = r2.A03();
        if (A032 != null) {
            return A032;
        }
        byte[] A0I = C17970vW.A0I(32);
        r2.A02(new C193149pc(A0I));
        return A0I;
    }

    public AnonymousClass1NT(C25001Mm r9, AnonymousClass1NP r10, AnonymousClass1NO r11, AnonymousClass1NU r12, AnonymousClass1NM r13, C19830z4 r14, AnonymousClass10I r15, JniBridge jniBridge) {
        this.A07 = r15;
        this.A08 = jniBridge;
        this.A00 = r9;
        this.A04 = r13;
        this.A05 = r14;
        this.A02 = r11;
        this.A01 = r10;
        this.A03 = r12;
    }

    public String A00(String str) {
        if (!TextUtils.isEmpty(str) && A04()) {
            try {
                AnonymousClass1NO r4 = this.A02;
                byte[] A032 = r4.A03();
                boolean z = false;
                if (A032 != null) {
                    z = true;
                }
                C17960vV.A0H(z, "root key is not defined");
                byte[] A002 = C20058A5h.A00(A032, A0B, 32);
                byte[] A033 = r4.A03();
                boolean z2 = false;
                if (A033 != null) {
                    z2 = true;
                }
                C17960vV.A0H(z2, "root key is not defined");
                byte[] A003 = C20058A5h.A00(A033, A0A, 32);
                boolean z3 = true;
                boolean z4 = false;
                if (A002.length == 32) {
                    z4 = true;
                }
                C17960vV.A0G(z4, "wrong length of enc key");
                boolean z5 = false;
                if (A003.length == 32) {
                    z5 = true;
                }
                C17960vV.A0G(z5, "wrong length of auth key");
                ByteBuffer wrap = ByteBuffer.wrap(Base64.decode(str, 2));
                int i = wrap.get();
                boolean z6 = false;
                if (i == 16) {
                    z6 = true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected size of iv (");
                sb.append(i);
                sb.append(")");
                C17960vV.A0G(z6, sb.toString());
                byte[] bArr = new byte[i];
                wrap.get(bArr);
                int i2 = wrap.get();
                if (i2 != 32) {
                    z3 = false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unexpected size of mac (");
                sb2.append(i2);
                sb2.append(")");
                C17960vV.A0G(z3, sb2.toString());
                byte[] bArr2 = new byte[i2];
                wrap.get(bArr2);
                byte[] bArr3 = new byte[wrap.remaining()];
                wrap.get(bArr3);
                Mac instance = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
                instance.init(new SecretKeySpec(A003, DefaultCrypto.HMAC_SHA256));
                instance.update(bArr);
                instance.update(bArr3);
                if (MessageDigest.isEqual(instance.doFinal(), bArr2)) {
                    Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                    instance2.init(2, new SecretKeySpec(A002, "AES"), new IvParameterSpec(bArr));
                    return new String(instance2.doFinal(bArr3));
                }
                throw new SecurityException("cannot authenticate");
            } catch (SecurityException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                Log.e("encb/EncBackupManager/failed to decrypt backup metadata", e);
            }
        }
        return null;
    }

    public String A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!A04()) {
            return str;
        }
        try {
            AnonymousClass1NO r4 = this.A02;
            byte[] A032 = r4.A03();
            boolean z = false;
            if (A032 != null) {
                z = true;
            }
            C17960vV.A0H(z, "root key is not defined");
            byte[] A002 = C20058A5h.A00(A032, A0B, 32);
            byte[] A033 = r4.A03();
            boolean z2 = false;
            if (A033 != null) {
                z2 = true;
            }
            C17960vV.A0H(z2, "root key is not defined");
            byte[] A003 = C20058A5h.A00(A033, A0A, 32);
            byte[] A0I = C17970vW.A0I(16);
            boolean z3 = false;
            boolean z4 = false;
            if (A002.length == 32) {
                z4 = true;
            }
            C17960vV.A0G(z4, "wrong length of enc key");
            boolean z5 = false;
            if (A003.length == 32) {
                z5 = true;
            }
            C17960vV.A0G(z5, "wrong length of auth key");
            int length = A0I.length;
            if (length == 16) {
                z3 = true;
            }
            C17960vV.A0G(z3, "wrong length of iv");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(A002, "AES"), new IvParameterSpec(A0I));
            byte[] doFinal = instance.doFinal(str.getBytes());
            Mac instance2 = Mac.getInstance(DefaultCrypto.HMAC_SHA256);
            instance2.init(new SecretKeySpec(A003, DefaultCrypto.HMAC_SHA256));
            instance2.update(A0I);
            instance2.update(doFinal);
            byte[] doFinal2 = instance2.doFinal();
            int length2 = doFinal2.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 1 + 1 + length2 + doFinal.length);
            allocate.put((byte) length);
            allocate.put(A0I);
            allocate.put((byte) length2);
            allocate.put(doFinal2);
            allocate.put(doFinal);
            return Base64.encodeToString(allocate.array(), 2);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            Log.e("encb/EncBackupManager/failed to encrypt backup metadata", e);
            return null;
        }
    }

    public void A03(String str) {
        byte[] bytes = str.getBytes();
        byte[] A0I = C17970vW.A0I(64);
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        try {
            this.A02.A01(new C59282m3(new C193149pc(C17970vW.A08("PBKDF2WithHmacSHA512", A0I, cArr, 100000, 512).getEncoded()), new C193149pc(A0I), 100000));
            this.A01.A0E(5);
        } catch (IOException e) {
            Log.e("encb/EncBackupManager/storePasswordHash failed", e);
        }
    }
}
