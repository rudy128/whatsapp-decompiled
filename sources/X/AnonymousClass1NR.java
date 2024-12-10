package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.1NR  reason: invalid class name */
public class AnonymousClass1NR {
    public final AnonymousClass1NP A00;
    public final AnonymousClass1NO A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final C219317y A05;

    public static int A00(AnonymousClass1NR r11, File file, FileDescriptor fileDescriptor) {
        FileInputStream fileInputStream;
        Log.i("MigrateFileDirectlyHelper/replaceFile");
        try {
            AnonymousClass2QW r4 = new AnonymousClass2QW(r11.A05.A00, file);
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                FileChannel channel = fileInputStream.getChannel();
                WritableByteChannel newChannel = Channels.newChannel(r4);
                for (long j = 0; j < channel.size(); j += 131072) {
                    channel.transferTo(j, Math.min(131072, channel.size() - j), newChannel);
                }
                r4.close();
                fileInputStream.close();
                r4.close();
                return 19;
            } catch (Throwable th) {
                r4.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("MigrateFileDirectlyHelper/replaceFile/error while moving file. File to replace is ");
            sb.append(file.toString());
            sb.append(" error message is: ");
            sb.append(e);
            Log.e(sb.toString());
            if (e.getMessage() == null || !e.getMessage().contains("No space")) {
                return 15;
            }
            return 5;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public static Uri A01(String str, String str2, String str3) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.whatsapp.provider.MigrationContentProvider").appendPath(str);
        if (str2 != null) {
            appendPath.appendQueryParameter("query_param_country_code", str2);
        }
        if (str3 != null) {
            appendPath.appendQueryParameter("query_param_phone_number", str3);
        }
        return appendPath.build();
    }

    public int A03(File file, String str) {
        ParcelFileDescriptor A06;
        C19830z4 r0 = this.A04;
        String A0l = r0.A0l();
        String A0n = r0.A0n();
        StringBuilder sb = new StringBuilder();
        sb.append("MigrateFileDirectlyHelper/migrateFile/registered cc is ");
        sb.append(A0l);
        sb.append(" phone number");
        sb.append(AnonymousClass1EG.A09('*', A0n));
        Log.i(sb.toString());
        try {
            A06 = this.A02.A0O().A06(A01(str, A0l, A0n), "r");
            if (A06 != null) {
                if (A06.getFileDescriptor() != null) {
                    int A002 = A00(this, file, A06.getFileDescriptor());
                    A06.close();
                    return A002;
                }
            }
            Log.i("MigrateFileDirectlyHelper/migrateFile/consumer file is null");
            if (A06 == null) {
                return 15;
            }
            A06.close();
            return 15;
        } catch (IOException | SecurityException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MigrateFileDirectlyHelper/migrateFile/error while fetching internal file: ");
            sb2.append(str);
            sb2.append(" from consumer app. error message is: ");
            sb2.append(e);
            Log.e(sb2.toString());
            return 15;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public AnonymousClass1NR(AnonymousClass1NP r1, AnonymousClass1NO r2, AnonymousClass11C r3, AnonymousClass118 r4, C19830z4 r5, C219317y r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
    }

    public static byte[] A02(Bundle bundle, String str, byte[] bArr) {
        byte[] byteArray = bundle.getByteArray(str);
        if (byteArray == null) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData erk is null");
            return null;
        }
        try {
            PrivateKey generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr));
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            instance.init(2, generatePrivate);
            return instance.doFinal(byteArray);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
            Log.e("MigrateFileDirectlyHelper/getEncryptedData failed to decrypt erk");
            return null;
        }
    }
}
