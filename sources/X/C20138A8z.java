package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.tasks.zzw;
import com.whatsapp.util.LRUCache;
import com.whatsapp.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.InvalidParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.A8z  reason: case insensitive filesystem */
public class C20138A8z {
    public static final Object A00 = C17880vN.A0p();
    public static final byte[] A01 = {0, 2};

    public static LRUCache A00(Context context, AnonymousClass190 r6, C19830z4 r7, String str, byte[] bArr, int i) {
        ObjectInputStream objectInputStream;
        if (bArr != null) {
            try {
                objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bArr));
                LRUCache lRUCache = (LRUCache) objectInputStream.readObject();
                objectInputStream.close();
                return lRUCache;
            } catch (IOException | ClassNotFoundException e) {
                Log.e("BackupTokenUtils/convertByteArrayToLRUCache/failed with exception:", e);
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("BackupTokenUtils/convertByteArrayToLRUCache/type: ");
                A10.append(i);
                String A1H = AnonymousClass001.A1H("/reason: ", str, A10);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append(e.getClass().getCanonicalName());
                r6.A0E(A1H, C17900vP.A0C(" : ", A102, e), e);
                if ((e instanceof InvalidClassException) || (e instanceof ClassNotFoundException)) {
                    A04(context, r7, i);
                }
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return new LRUCache(5);
        throw th;
    }

    public static void A03(Context context, AnonymousClass190 r14, C19830z4 r15, String str) {
        byte[] bArr;
        int[] iArr = {1, 2};
        int i = 0;
        do {
            int i2 = iArr[i];
            LRUCache A002 = A00(context, r14, r15, "delete", A07(context, i2), i2);
            String A05 = C17970vW.A05(str);
            if (!TextUtils.isEmpty(A05)) {
                A002.remove(A05);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("BackupTokenUtils/deleteBackupToken/updated LRUCache size is ");
            C17900vP.A0o(A10, A002.size());
            if (A002.size() == 0) {
                A04(context, r15, i2);
            } else {
                try {
                    ByteArrayOutputStream A15 = C108945cZ.A15();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(A15);
                    objectOutputStream.writeObject(A002);
                    objectOutputStream.flush();
                    bArr = A15.toByteArray();
                } catch (IOException e) {
                    Log.e("BackupTokenUtils/deleteBackupToken/write token byte array failed/IOException:", e);
                    bArr = null;
                }
                A05(context, r15, (C57342iv) null, bArr, i2);
            }
            i++;
        } while (i < 2);
    }

    public static void A04(Context context, C19830z4 r5, int i) {
        String str;
        String str2;
        synchronized (A00) {
            File filesDir = context.getFilesDir();
            if (i == 2) {
                str = "foa_backup_token";
            } else {
                str = "backup_token";
            }
            C17880vN.A0e(filesDir, str).delete();
        }
        SharedPreferences.Editor A002 = C19830z4.A00(r5);
        if (i == 2) {
            str2 = "backup_token_foa_file_timestamp";
        } else {
            C17880vN.A1B(A002, "backup_token_file_timestamp");
            A002 = C19830z4.A00(r5);
            str2 = "backup_token_source";
        }
        C17880vN.A1B(A002, str2);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.B4e, X.BZ6, X.Cso] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.9Zo, java.lang.Object] */
    public static void A05(Context context, C19830z4 r8, C57342iv r9, byte[] bArr, int i) {
        String str;
        Log.i("BackupTokenUtils/saveEncryptedBackupToken/update block store");
        if (i == 1) {
            ? cso = new C26126Cso(context, C28622EAu.A00, BZ6.A00, C25540Chd.A02);
            ? obj = new Object();
            C25069CWc A002 = C25558Chw.A00();
            A002.A03 = new C23191Bcl[]{AnonymousClass9UG.A04};
            A002.A01 = new DIK(cso);
            A002.A02 = false;
            A002.A00 = 1651;
            zzw A02 = C26126Cso.A02(cso, A002.A00(), 0);
            A02.addOnSuccessListener(new AJL(cso, obj, r9, bArr));
            AJI.A00(A02, r9, 4);
            C17880vN.A1E(C19830z4.A00(r8), "token_used_for_migration", Base64.encodeToString(bArr, 3));
        }
        synchronized (A00) {
            try {
                File filesDir = context.getFilesDir();
                if (i == 2) {
                    str = "foa_backup_token";
                } else {
                    str = "backup_token";
                }
                C17970vW.A0A(C17880vN.A0e(filesDir, str), bArr);
                Log.i("BackupTokenUtils/saveEncryptedBackupToken/successfully write to backup_token file");
            } catch (IOException e) {
                Log.e("BackupTokenUtils/saveEncryptedBackupToken/unable to write to backup_token file:", e);
            }
        }
    }

    public static void A06(C19830z4 r3, Exception exc, int i) {
        String str;
        if (exc != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BW.A1M(exc, A10);
            str = C17900vP.A0C(" | ", A10, exc);
        } else if (i == 0) {
            str = "null_token";
        } else {
            str = "success";
        }
        C17900vP.A0f("BackupTokenUtils/saveBackupTokenRetrievalErrorMessage/Block Store token error message: ", str, AnonymousClass000.A10());
        if (str.length() > 256) {
            str = AnonymousClass8BS.A0o(str, 256);
        }
        C17880vN.A1E(C19830z4.A00(r3), "backup_token_retrieval_error", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r13.length == 0) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A08(android.content.Context r9, X.AnonymousClass190 r10, X.C19830z4 r11, java.lang.String r12, byte[] r13, int r14) {
        /*
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = r13
            if (r13 == 0) goto L_0x000c
            int r1 = r13.length
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r3 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no data read from backup_token file"
        L_0x0012:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x0016:
            int r1 = r13.length
            r0 = 42
            if (r1 > r0) goto L_0x002b
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/single token found"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = A01(r12)
            byte[] r0 = A01
            byte[] r0 = A09(r1, r13, r0)
            return r0
        L_0x002b:
            java.lang.String r7 = "get"
            r4 = r9
            r5 = r10
            r6 = r11
            r9 = r14
            com.whatsapp.util.LRUCache r2 = A00(r4, r5, r6, r7, r8, r9)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/LRUCache size is "
            r1.append(r0)
            int r0 = r2.size()
            X.C17900vP.A0o(r1, r0)
            java.lang.String r0 = X.C17970vW.A05(r12)
            java.lang.Object r2 = r2.get(r0)
            byte[] r2 = (byte[]) r2
            if (r2 == 0) goto L_0x0064
            int r0 = r2.length
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from LRUCache"
        L_0x0056:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = A01(r12)
            byte[] r0 = A01
            byte[] r0 = A09(r1, r2, r0)
            return r0
        L_0x0064:
            r0 = 1
            if (r14 != r0) goto L_0x0073
            byte[] r2 = r11.A2d()
            if (r2 == 0) goto L_0x0073
            int r0 = r2.length
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/decrypt token from shared preferences"
            goto L_0x0056
        L_0x0073:
            java.lang.String r0 = "BackupTokenUtils/getTokenByPhoneNumber/no token saved for this phone number"
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20138A8z.A08(android.content.Context, X.190, X.0z4, java.lang.String, byte[], int):byte[]");
    }

    public static byte[] A09(String str, byte[] bArr, byte[] bArr2) {
        Throwable th;
        try {
            int length = bArr.length;
            if (length >= 42) {
                byte[] bArr3 = new byte[2];
                System.arraycopy(bArr, 0, bArr3, 0, 2);
                if (Arrays.equals(bArr3, bArr2)) {
                    byte[] bArr4 = new byte[4];
                    System.arraycopy(bArr, 2, bArr4, 0, 4);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(bArr, 6, bArr5, 0, 16);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(A0A(bArr4, str), "AES/OFB/NoPadding");
                    Cipher instance = Cipher.getInstance("AES/OFB/NoPadding");
                    instance.init(2, secretKeySpec, AnonymousClass8BR.A19(bArr5));
                    return instance.doFinal(bArr, 22, length - 22);
                }
                th = new C18130vo();
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("size mismatch expected length:");
                A10.append(42);
                th = new InvalidParameterException(AnonymousClass001.A1I(", actual length:", A10, length));
            }
            throw th;
        } catch (Exception e) {
            Log.e("BackupTokenUtils/decrypt/unable to decrypt", e);
            return null;
        }
    }

    public static String A01(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(C197569wu.A0Z);
        return AnonymousClass000.A0y(str.substring(Math.max(str.length() - 4, 0)), A10);
    }

    public static void A02(Context context, AnonymousClass190 r11, AnonymousClass11P r12, C19830z4 r13, C57342iv r14, String str, byte[] bArr, int i) {
        byte[] bArr2;
        String str2;
        String A012 = A01(str);
        byte[] bArr3 = A01;
        try {
            byte[] A0I = C17970vW.A0I(4);
            byte[] A0I2 = C17970vW.A0I(16);
            byte[] A1Q = AnonymousClass8BS.A1Q(new SecretKeySpec(A0A(A0I, A012), "AES/OFB/NoPadding"), AnonymousClass8BR.A19(A0I2), Cipher.getInstance("AES/OFB/NoPadding"), bArr, 1);
            bArr2 = new byte[(2 + A0I.length + A0I2.length + A1Q.length)];
            byte[][] bArr4 = new byte[4][];
            bArr4[0] = bArr3;
            bArr4[1] = A0I;
            AnonymousClass001.A1R(A0I2, A1Q, bArr4);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[] bArr5 = bArr4[i2];
                System.arraycopy(bArr5, 0, bArr2, i3, bArr5.length);
                i3 += bArr5.length;
                i2++;
                if (i2 >= 4) {
                    break;
                }
            }
        } catch (Exception e) {
            Log.e("BackupTokenUtils/encrypt/unable to encrypt", e);
            bArr2 = null;
        }
        Log.i("BackupTokenUtils/encryptAndSaveToken/save token to LRUCache");
        Context context2 = context;
        int i4 = i;
        LRUCache A002 = A00(context2, r11, r13, "set", A07(context2, i4), i4);
        String A05 = C17970vW.A05(str);
        if (!(TextUtils.isEmpty(A05) || bArr2 == null || bArr2.length == 0)) {
            A002.put(A05, bArr2);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupTokenUtils/encryptAndSaveToken/updated LRUCache size is ");
        C17900vP.A0o(A10, A002.size());
        ByteArrayOutputStream A15 = C108945cZ.A15();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(A15);
        objectOutputStream.writeObject(A002);
        objectOutputStream.flush();
        byte[] byteArray = A15.toByteArray();
        if (!(byteArray == null || byteArray.length == 0)) {
            A05(context2, r13, r14, byteArray, i4);
        }
        long A013 = AnonymousClass11P.A01(r12);
        if (i4 == 2) {
            str2 = "backup_token_foa_file_timestamp";
        } else {
            str2 = "backup_token_file_timestamp";
        }
        r13.A1q(str2, A013);
    }

    public static byte[] A07(Context context, int i) {
        String str;
        byte[] A0K;
        File filesDir = context.getFilesDir();
        if (i == 2) {
            str = "foa_backup_token";
        } else {
            str = "backup_token";
        }
        File A0e = C17880vN.A0e(filesDir, str);
        if (!A0e.exists()) {
            Log.i("BackupTokenUtils/getBackupTokenFromLocalFile/no content found");
            return null;
        }
        synchronized (A00) {
            A0K = C17970vW.A0K(A0e);
        }
        return A0K;
    }

    public static byte[] A0A(byte[] bArr, String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) bytes[i];
        }
        return AnonymousClass8BS.A0v(C17970vW.A08("PBKDF2WithHmacSHA1And8BIT", bArr, cArr, 16, 128).getEncoded()).getEncoded();
    }
}
