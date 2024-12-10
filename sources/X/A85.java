package X;

import android.content.Context;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.security.InvalidParameterException;
import java.util.Arrays;

public abstract class A85 {
    public static final byte[] A00 = {0, 1};
    public static final byte[] A01 = {0, 1};
    public static final byte[] A02 = {0, 2};

    public static final C191279mJ A00(InputStream inputStream) {
        byte[] bArr = new byte[2];
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[67];
        inputStream.read(bArr5);
        System.arraycopy(bArr5, 0, bArr, 0, 2);
        if (Arrays.equals(A02, bArr) || Arrays.equals(A01, bArr)) {
            int i = 3;
            String valueOf = String.valueOf(bArr5[2]);
            byte[][] bArr6 = {bArr2, bArr3, bArr4};
            int i2 = 0;
            do {
                byte[] bArr7 = bArr6[i2];
                System.arraycopy(bArr5, i, bArr7, 0, bArr7.length);
                i += bArr7.length;
                i2++;
            } while (i2 < 3);
            return new C191279mJ(valueOf, bArr, bArr2, bArr3, bArr4);
        }
        throw new C18130vo();
    }

    public static final C190419ku A01(Context context) {
        File A0T = AnonymousClass8BX.A0T(context);
        if (!A0T.exists()) {
            Log.w("backupkey/getinfo/does-not-exist");
        } else {
            byte[] A0K = C17970vW.A0K(A0T);
            if (A0K != null) {
                int length = A0K.length;
                byte[] bArr = A00;
                if (length >= 131) {
                    byte[] bArr2 = new byte[2];
                    System.arraycopy(A0K, 0, bArr2, 0, 2);
                    if (Arrays.equals(bArr2, bArr)) {
                        String valueOf = String.valueOf(A0K[2]);
                        byte[] bArr3 = new byte[32];
                        System.arraycopy(A0K, 3, bArr3, 0, 32);
                        byte[] bArr4 = new byte[16];
                        System.arraycopy(A0K, 35, bArr4, 0, 16);
                        byte[] bArr5 = new byte[32];
                        System.arraycopy(A0K, 51, bArr5, 0, 32);
                        byte[] A0I = C17970vW.A0I(16);
                        byte[] bArr6 = new byte[32];
                        System.arraycopy(A0K, 99, bArr6, 0, 32);
                        return new C190419ku(valueOf, bArr2, bArr3, bArr4, bArr5, A0I, bArr6);
                    }
                    throw new C18130vo();
                }
                throw new InvalidParameterException(AnonymousClass000.A0y(" size mismatch", C17890vO.A0f(A0T)));
            }
        }
        return null;
    }

    public static final void A03(Context context, C27341Vs r8, C57372iy r9) {
        String str;
        int i;
        boolean A17 = C18070vi.A17(context, r8);
        C18070vi.A0d(r9, 2);
        synchronized (r9) {
            r9.A00 = A17;
        }
        r9.A00("CoreBackupUtils/sendCreateBackupKeyIfNeeded/started", 2);
        if (A05(context)) {
            byte[] A0I = C17970vW.A0I(16);
            byte[] A05 = A8L.A05(A0I);
            if (A05 != null) {
                ConditionVariable conditionVariable = new ConditionVariable(false);
                r8.A01(AnonymousClass00R.A00, new C21457AkO((Object) conditionVariable, 9), A05, A0I);
                r9.A00("CoreBackupUtils/backup/waiting-for-the-key", 2);
                if (!conditionVariable.block(32000)) {
                    str = "CoreBackupUtils/backup/backup-key-not-received";
                    i = 4;
                } else {
                    r9.A00("CoreBackupUtils/backup/key-received", 2);
                    return;
                }
            } else {
                str = "CoreBackupUtils/backup/backup-key/null/account-hash/null";
                i = 3;
            }
            r9.A00(str, i);
        }
    }

    public static final void A04(Context context, String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        String str2 = str;
        C17900vP.A0f("backupkey/set/v=", str2, AnonymousClass000.A10());
        byte[] bArr5 = bArr;
        AnonymousClass8BS.A1K(bArr5);
        byte[] bArr6 = bArr2;
        AnonymousClass8BS.A1K(bArr6);
        File A0e = C17880vN.A0e(context.getFilesDir(), "key");
        byte[] bArr7 = new byte[16];
        AnonymousClass8BS.A1K(bArr7);
        byte[] bArr8 = {Byte.parseByte(str2)};
        byte[] bArr9 = A00;
        byte[] bArr10 = new byte[(bArr5.length + 3 + bArr4.length + bArr3.length + 16 + bArr6.length)];
        byte[][] bArr11 = {bArr9, bArr8, bArr, bArr4, bArr3, bArr7, bArr2};
        int i = 0;
        int i2 = 0;
        do {
            byte[] bArr12 = bArr11[i];
            System.arraycopy(bArr12, 0, bArr10, i2, bArr12.length);
            i2 += bArr12.length;
            i++;
        } while (i < 7);
        AnonymousClass8BS.A1K(bArr10);
        try {
            C17970vW.A0A(A0e, bArr10);
            byte[] A0K = C17970vW.A0K(A0e);
            A01(context);
            Arrays.equals(bArr10, A0K);
        } catch (Exception e) {
            Log.e("backupkey/set/unable-to-write ", e);
        }
    }

    public static final void A02(Context context) {
        AnonymousClass8BX.A0T(context).delete();
    }

    public static final boolean A05(Context context) {
        String str = null;
        if (AnonymousClass8BX.A0T(context).exists()) {
            try {
                C190419ku A012 = A01(context);
                if (A012 != null) {
                    str = A012.A00.A00;
                    if (str == null || str.length() == 0) {
                        return true;
                    }
                    return false;
                }
            } catch (C18130vo | InvalidParameterException unused) {
            }
        }
        return true;
    }
}
