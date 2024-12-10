package X;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: X.2u9  reason: invalid class name and case insensitive filesystem */
public abstract class C64062u9 {
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A03(X.C219317y r14, java.io.File r15, int r16, int r17) {
        /*
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "file-utils/truncate-from-end compressedFile:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " compressedInputFileSizeLimit:"
            r1.append(r0)
            r5 = r16
            r1.append(r5)
            java.lang.String r0 = " bufferSize:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " uncompressedTruncatedFileSize:"
            r1.append(r0)
            r12 = r17
            X.C17900vP.A0o(r1, r12)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            r9 = 0
            if (r15 != 0) goto L_0x003b
            java.lang.String r0 = "file-utils/truncate-from-end/no-compressed-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r10, r9)
        L_0x003a:
            return r0
        L_0x003b:
            long r3 = r15.length()
            long r0 = (long) r5
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x004f
            java.lang.String r0 = "file-utils/truncate-from-end/too-small-no-truncation-required"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r10, r15)
            return r2
        L_0x004f:
            r15.length()
            r3 = 16384(0x4000, float:2.2959E-41)
            r17 = 1
            java.lang.String r0 = "uncompressed-crashlog"
            java.io.File r16 = java.io.File.createTempFile(r0, r9)     // Catch:{ IOException -> 0x0167, all -> 0x0186 }
            java.lang.String r2 = "rw"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ SyncFailedException -> 0x0159 }
            r0 = r16
            r1.<init>(r0, r2)     // Catch:{ SyncFailedException -> 0x0159 }
            byte[] r13 = new byte[r3]     // Catch:{ all -> 0x014f }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ all -> 0x014f }
            r4.<init>(r15)     // Catch:{ all -> 0x014f }
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x0145 }
            r5.<init>(r4, r3)     // Catch:{ all -> 0x0145 }
            r16.getAbsolutePath()     // Catch:{ all -> 0x0094 }
        L_0x0075:
            r3 = 0
            r11 = 0
        L_0x0077:
            if (r11 >= r12) goto L_0x008c
            r2 = 16384(0x4000, float:2.2959E-41)
            int r0 = r12 - r11
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x0094 }
            int r0 = r5.read(r13, r3, r0)     // Catch:{ all -> 0x0094 }
            if (r0 <= 0) goto L_0x008c
            r1.write(r13, r3, r0)     // Catch:{ all -> 0x0094 }
            int r11 = r11 + r0
            goto L_0x0077
        L_0x008c:
            r2 = 0
            r1.seek(r2)     // Catch:{ all -> 0x0094 }
            if (r11 == r12) goto L_0x0075
            goto L_0x009e
        L_0x0094:
            r2 = move-exception
            r5.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0145 }
        L_0x009d:
            throw r2     // Catch:{ all -> 0x0145 }
        L_0x009e:
            r5.close()     // Catch:{ all -> 0x0145 }
            r4.close()     // Catch:{ all -> 0x014f }
            java.io.FileDescriptor r0 = r1.getFD()     // Catch:{ all -> 0x014f }
            r0.sync()     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r15.getName()     // Catch:{ IOException -> 0x0132 }
            java.io.File r8 = r14.A00(r0)     // Catch:{ IOException -> 0x0132 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0132 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0132 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0128 }
            r6.<init>(r7)     // Catch:{ all -> 0x0128 }
            long r4 = (long) r11     // Catch:{ all -> 0x0128 }
            r1.seek(r4)     // Catch:{ all -> 0x011e }
            int r15 = r12 - r11
            r5 = 0
            r14 = 0
        L_0x00c5:
            if (r14 >= r15) goto L_0x00da
            int r4 = r15 - r14
            r0 = 16384(0x4000, float:2.2959E-41)
            int r0 = java.lang.Math.min(r0, r4)     // Catch:{ all -> 0x011e }
            int r0 = r1.read(r13, r5, r0)     // Catch:{ all -> 0x011e }
            if (r0 <= 0) goto L_0x00da
            r6.write(r13, r5, r0)     // Catch:{ all -> 0x011e }
            int r14 = r14 + r0
            goto L_0x00c5
        L_0x00da:
            r1.seek(r2)     // Catch:{ all -> 0x011e }
            r3 = 0
        L_0x00de:
            if (r3 >= r11) goto L_0x00f3
            r2 = 16384(0x4000, float:2.2959E-41)
            int r0 = r11 - r3
            int r0 = java.lang.Math.min(r2, r0)     // Catch:{ all -> 0x011e }
            int r0 = r1.read(r13, r5, r0)     // Catch:{ all -> 0x011e }
            if (r0 <= 0) goto L_0x00f3
            r6.write(r13, r5, r0)     // Catch:{ all -> 0x011e }
            int r3 = r3 + r0
            goto L_0x00de
        L_0x00f3:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "file-utils/truncate-from-end uncompressedSize:"
            r4.append(r0)     // Catch:{ all -> 0x011e }
            r4.append(r12)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = " compressedSize:"
            r4.append(r0)     // Catch:{ all -> 0x011e }
            long r2 = r8.length()     // Catch:{ all -> 0x011e }
            X.C17890vO.A16(r4, r2)     // Catch:{ all -> 0x011e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r17)     // Catch:{ all -> 0x011e }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x011e }
            r2.<init>(r0, r8)     // Catch:{ all -> 0x011e }
            r6.close()     // Catch:{ all -> 0x0128 }
            r7.close()     // Catch:{ IOException -> 0x0132 }
            r1.close()     // Catch:{ SyncFailedException -> 0x0159 }
            goto L_0x017e
        L_0x011e:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0123 }
            goto L_0x0127
        L_0x0123:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0128 }
        L_0x0127:
            throw r2     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x012d }
            goto L_0x0131
        L_0x012d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ IOException -> 0x0132 }
        L_0x0131:
            throw r2     // Catch:{ IOException -> 0x0132 }
        L_0x0132:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "file-utils/unable to create compressed file"
            X.C17900vP.A0X(r3, r0, r2)     // Catch:{ all -> 0x014f }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x014f }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x014f }
            r1.close()     // Catch:{ SyncFailedException -> 0x0159 }
            goto L_0x017a
        L_0x0145:
            r2 = move-exception
            r4.close()     // Catch:{ all -> 0x014a }
            goto L_0x014e
        L_0x014a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x014f }
        L_0x014e:
            throw r2     // Catch:{ all -> 0x014f }
        L_0x014f:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0154 }
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ SyncFailedException -> 0x0159 }
        L_0x0158:
            throw r2     // Catch:{ SyncFailedException -> 0x0159 }
        L_0x0159:
            r1 = move-exception
            java.lang.String r0 = "file-utils/truncate-from-end"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0165 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ IOException -> 0x0165 }
            r0.<init>(r10, r9)     // Catch:{ IOException -> 0x0165 }
            goto L_0x0178
        L_0x0165:
            r2 = move-exception
            goto L_0x016a
        L_0x0167:
            r2 = move-exception
            r16 = r9
        L_0x016a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0182 }
            java.lang.String r0 = "fileutils/unable to create tempfile/"
            X.C17900vP.A0Y(r2, r0, r1)     // Catch:{ all -> 0x0182 }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x0182 }
            r0.<init>(r10, r9)     // Catch:{ all -> 0x0182 }
        L_0x0178:
            if (r16 == 0) goto L_0x003a
        L_0x017a:
            r16.delete()
            return r0
        L_0x017e:
            r16.delete()
            return r2
        L_0x0182:
            r0 = move-exception
            r9 = r16
            goto L_0x0187
        L_0x0186:
            r0 = move-exception
        L_0x0187:
            if (r9 == 0) goto L_0x018c
            r9.delete()
        L_0x018c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64062u9.A03(X.17y, java.io.File, int, int):android.util.Pair");
    }

    public static File A06(String str, String str2) {
        try {
            File file = new File(str, str2);
            if (file.getCanonicalPath().startsWith(str)) {
                return file;
            }
            return null;
        } catch (IOException unused) {
        }
    }

    public static String A07(File file) {
        String str;
        try {
            int parseInt = Integer.parseInt(String.valueOf(file.length() / 1024));
            if (parseInt <= 100) {
                return new String(AnonymousClass1EW.A00(file));
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FileUtils/readFile/File size is too big to read into string ");
            A10.append(parseInt);
            C17890vO.A19(A10, "KB. Max allowed is 100KB");
            return null;
        } catch (IOException e) {
            e = e;
            str = "FileUtils/readFile/ioerror";
            Log.e(str, e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            str = "FileUtils/readFile/error in getting file size";
            Log.e(str, e);
            return null;
        }
    }

    public static void A0C(C23577Bm6 bm6, File file) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1, false);
        try {
            deflaterOutputStream = new DeflaterOutputStream(new FileOutputStream(file), deflater);
            bm6.writeTo(deflaterOutputStream);
            deflaterOutputStream.close();
            deflater.end();
            return;
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static boolean A0T(File file, InputStream inputStream) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    bufferedOutputStream.close();
                    return true;
                }
            }
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            C17900vP.A0N(file, "FileUtils/saveInputStreamToFile/could not save file to:", A10);
            C17880vN.A1M(A10, e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static boolean A0U(File file, InputStream inputStream, long j) {
        BufferedOutputStream bufferedOutputStream;
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            byte[] bArr = new byte[DefaultCrypto.BUFFER_SIZE];
            long j2 = 0;
            do {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                    j2 += (long) read;
                } else {
                    bufferedOutputStream.close();
                    return true;
                }
            } while (j2 <= j);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FileUtils/saveInputStreamToFileWithMaxBytes file size of ");
            A10.append(j2);
            throw C17880vN.A0f(C17890vO.A0a(" but max of ", A10, j));
        } catch (IOException e) {
            StringBuilder A102 = AnonymousClass000.A10();
            C17900vP.A0N(file, "FileUtils/saveInputStreamToFileWithMaxBytes/could not save file to:", A102);
            C17880vN.A1M(A102, e);
            return false;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static byte[] A0X(File file) {
        InflaterInputStream inflaterInputStream;
        Inflater inflater = new Inflater(false);
        try {
            inflaterInputStream = new InflaterInputStream(new FileInputStream(file), inflater);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            A00(inflaterInputStream, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            inflaterInputStream.close();
            inflater.end();
            return byteArray;
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
        throw th;
    }

    public static int A00(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return i;
            }
            outputStream.write(bArr, 0, read);
            i += read;
        }
    }

    public static long A01(C42621yT r8, File file) {
        if (r8 != null) {
            r8.A02();
        }
        if (!file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        long j = 0;
        while (linkedList.peek() != null) {
            if (r8 != null) {
                r8.A02();
            }
            Object poll = linkedList.poll();
            C17960vV.A07(poll);
            File[] listFiles = ((File) poll).listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (r8 != null) {
                        r8.A02();
                    }
                    if (file2.exists()) {
                        if (file2.isDirectory()) {
                            linkedList.add(file2);
                        } else {
                            j += file2.length();
                        }
                    }
                }
            }
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0097 A[SYNTHETIC, Splitter:B:49:0x0097] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a2 A[SYNTHETIC, Splitter:B:54:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b5 A[SYNTHETIC, Splitter:B:59:0x00b5] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d6 A[SYNTHETIC, Splitter:B:73:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e0 A[SYNTHETIC, Splitter:B:78:0x00e0] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f2 A[SYNTHETIC, Splitter:B:83:0x00f2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A05(java.io.File r12, java.io.File r13, java.lang.String r14) {
        /*
            java.lang.String r3 = "compress/close/fail "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)
            java.lang.String r0 = ".gz"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r7 = X.C17880vN.A0e(r13, r0)
            boolean r0 = r7.exists()
            r11 = 0
            if (r0 == 0) goto L_0x0023
            boolean r0 = r7.delete()
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = "compress/fail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r11
        L_0x0023:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0085 }
            r4.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0089, all -> 0x0085 }
            java.util.zip.GZIPOutputStream r6 = new java.util.zip.GZIPOutputStream     // Catch:{ FileNotFoundException -> 0x008d, all -> 0x0082 }
            r6.<init>(r4)     // Catch:{ FileNotFoundException -> 0x008d, all -> 0x0082 }
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r8 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x007f, all -> 0x00d3 }
            long r9 = r12.length()     // Catch:{ FileNotFoundException -> 0x007f, all -> 0x00d3 }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x005e
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x007f, all -> 0x00d3 }
            r0.<init>(r12)     // Catch:{ FileNotFoundException -> 0x007f, all -> 0x00d3 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x007f, all -> 0x00d3 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x007f, all -> 0x00d3 }
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = 0
            int r1 = r5.read(r8, r2, r0)     // Catch:{ FileNotFoundException -> 0x005c }
        L_0x004e:
            r0 = -1
            if (r1 == r0) goto L_0x005f
            r6.write(r8, r2, r1)     // Catch:{ FileNotFoundException -> 0x005c }
            r0 = 32768(0x8000, float:4.5918E-41)
            int r1 = r5.read(r8, r2, r0)     // Catch:{ FileNotFoundException -> 0x005c }
            goto L_0x004e
        L_0x005c:
            r1 = move-exception
            goto L_0x0090
        L_0x005e:
            r5 = r11
        L_0x005f:
            if (r5 == 0) goto L_0x006a
            r5.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r7 = r11
        L_0x006a:
            r6.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x007b
        L_0x006e:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = r0.toString()
            X.C17890vO.A19(r1, r0)
            r7 = r11
        L_0x007b:
            r4.close()     // Catch:{ IOException -> 0x00bf }
            return r7
        L_0x007f:
            r1 = move-exception
            r5 = r11
            goto L_0x0090
        L_0x0082:
            r2 = move-exception
            r6 = r11
            goto L_0x00d4
        L_0x0085:
            r2 = move-exception
            r4 = r11
            r6 = r11
            goto L_0x00d4
        L_0x0089:
            r1 = move-exception
            r4 = r11
            r6 = r11
            goto L_0x008f
        L_0x008d:
            r1 = move-exception
            r6 = r11
        L_0x008f:
            r5 = r11
        L_0x0090:
            java.lang.String r0 = "compress/fail "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x00a0
            r5.close()     // Catch:{ IOException -> 0x009b }
            goto L_0x00a0
        L_0x009b:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            r7 = r11
        L_0x00a0:
            if (r6 == 0) goto L_0x00b3
            r6.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00b3
        L_0x00a6:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = r0.toString()
            X.C17890vO.A19(r1, r0)
            r7 = r11
        L_0x00b3:
            if (r4 == 0) goto L_0x00cf
            r4.close()     // Catch:{ IOException -> 0x00b9 }
            return r7
        L_0x00b9:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            goto L_0x00c4
        L_0x00bf:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
        L_0x00c4:
            r1.append(r3)
            java.lang.String r0 = r0.toString()
            X.C17890vO.A19(r1, r0)
            return r11
        L_0x00cf:
            return r7
        L_0x00d0:
            r2 = move-exception
            r11 = r5
            goto L_0x00d4
        L_0x00d3:
            r2 = move-exception
        L_0x00d4:
            if (r11 == 0) goto L_0x00de
            r11.close()     // Catch:{ IOException -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x00de:
            if (r6 == 0) goto L_0x00f0
            r6.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00f0
        L_0x00e4:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = r0.toString()
            X.C17890vO.A19(r1, r0)
        L_0x00f0:
            if (r4 == 0) goto L_0x0102
            r4.close()     // Catch:{ IOException -> 0x00f6 }
            throw r2
        L_0x00f6:
            r0 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = r0.toString()
            X.C17890vO.A19(r1, r0)
        L_0x0102:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64062u9.A05(java.io.File, java.io.File, java.lang.String):java.io.File");
    }

    public static String A09(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (str.lastIndexOf(File.separator) > lastIndexOf || lastIndexOf < 0) {
            return "";
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String A0A(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(File.separator);
        if (lastIndexOf2 > lastIndexOf) {
            lastIndexOf = -1;
        }
        if (lastIndexOf2 < 0) {
            lastIndexOf2 = 0;
        }
        if (lastIndexOf >= 0) {
            return str.substring(lastIndexOf2, lastIndexOf);
        }
        return str.substring(lastIndexOf2);
    }

    public static void A0B(Bitmap bitmap, File file) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            bufferedOutputStream.write(byteArrayOutputStream.toByteArray());
            bufferedOutputStream.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static void A0E(AnonymousClass1NL r3, File file, File file2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            r3.A08(fileInputStream, (String) null, (String) null);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            fileOutputStream = new FileOutputStream(file2);
            A00(fileInputStream, fileOutputStream);
            fileOutputStream.close();
            fileInputStream.close();
            return;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0F(AnonymousClass1NL r1, File file, File file2, boolean z) {
        if (z) {
            r1.A07(file, "EXTERNAL_FILE_MOVE_CRITICAL_EVENT");
        }
        if (!file.renameTo(file2)) {
            A0E(r1, file, file2);
            A0Q(file);
        }
    }

    public static void A0G(AnonymousClass1TI r3, InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
                r3.accept(C17880vN.A0n(read));
            } else {
                return;
            }
        }
    }

    public static void A0H(File file, long j) {
        File[] listFiles = file.listFiles(new AnonymousClass3BT(j));
        if (listFiles != null) {
            for (File file2 : listFiles) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("cleanup/");
                A10.append(file2.getName());
                A10.append(":");
                A10.append(System.currentTimeMillis());
                A10.append(" - ");
                C17890vO.A16(A10, file2.lastModified());
                if (!file2.delete()) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("cleanup/failed to delete ");
                    C17890vO.A1A(A102, file2.getName());
                }
            }
        }
    }

    public static void A0L(File file, byte[] bArr) {
        if (bArr != null) {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        }
    }

    public static boolean A0N(AnonymousClass1NM r5, File file, File file2) {
        AnonymousClass2QW r3;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                r3 = new AnonymousClass2QW(r5.A00(), file2);
                byte[] bArr = new byte[A7Y.A0F];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read >= 0) {
                        r3.write(bArr, 0, read);
                    } else {
                        r3.close();
                        fileInputStream.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("fileutils/copyexternalfile/failed to copy external file", e);
            return false;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public static boolean A0O(AnonymousClass1NM r2, File file, File file2, boolean z) {
        if (z) {
            r2.A00.A07(file, "EXTERNAL_FILE_MOVE_MEDIA_STATE_CRITICAL_EVENT");
        }
        if (file.renameTo(file2)) {
            return true;
        }
        boolean A0N = A0N(r2, file, file2);
        if (!file.delete()) {
            Log.w("fileutils/moveFile/could not delete source file");
        }
        return A0N;
    }

    public static boolean A0P(C219317y r5, File file, File file2) {
        AnonymousClass2QW r3;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                r3 = new AnonymousClass2QW(r5.A00, file2);
                byte[] bArr = new byte[A7Y.A0F];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read >= 0) {
                        r3.write(bArr, 0, read);
                    } else {
                        r3.close();
                        fileInputStream.close();
                        return true;
                    }
                }
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e("fileutils/copyinternalfile/failed to copy internal file", e);
            return false;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public static Uri A02(Context context, File file) {
        if (AnonymousClass112.A01()) {
            return C50082Tb.A00(context, file);
        }
        return Uri.fromFile(file);
    }

    public static File A04(Uri uri) {
        if (uri.getPath() == null || (uri.getScheme() != null && !C17890vO.A1T(uri, "file"))) {
            return null;
        }
        return new File(uri.getPath());
    }

    public static String A08(File file, MessageDigest messageDigest, long j) {
        BufferedInputStream bufferedInputStream;
        if (!file.exists() || j > file.length()) {
            return null;
        }
        messageDigest.reset();
        byte[] bArr = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            long j2 = 0;
            int i = 0;
            while (true) {
                if (i == -1) {
                    break;
                }
                i = bufferedInputStream.read(bArr, 0, ZipDecompressor.UNZIP_BUFFER_SIZE);
                if (i > 0) {
                    long j3 = (long) i;
                    if (j3 + j2 >= j) {
                        messageDigest.update(bArr, 0, (int) (j - j2));
                        break;
                    }
                    messageDigest.update(bArr, 0, i);
                    j2 += j3;
                }
            }
            String A07 = C17970vW.A07(messageDigest.digest());
            bufferedInputStream.close();
            fileInputStream.close();
            return A07;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A0D(AnonymousClass11Z r24, File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            long j = 0;
            for (File length : listFiles) {
                j += length.length();
            }
            if (j > 0) {
                ArrayList A10 = C17880vN.A10(Arrays.asList(listFiles));
                Collections.sort(A10, new C147027Rn(13));
                long A01 = r24.A01();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = A10.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    long lastModified = file2.lastModified();
                    if (currentTimeMillis - lastModified >= 604800000 || j > 20000000 || (j > 2000000 && 50000000 > A01 && A01 > 0)) {
                        long length2 = file2.length();
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("cleanup/");
                        A102.append(file2.getName());
                        A102.append(":");
                        A102.append(currentTimeMillis);
                        A102.append(" - ");
                        A102.append(lastModified);
                        A102.append(" fileLength=");
                        A102.append(length2);
                        A102.append(" directoryLengthBeforeCleanup=");
                        A102.append(j);
                        C17900vP.A0m(" storageAvailableBeforeCleanup=", A102, A01);
                        if (!file2.delete()) {
                            StringBuilder A103 = AnonymousClass000.A10();
                            A103.append("cleanup/failed to delete ");
                            C17890vO.A1A(A103, file2.getName());
                        } else {
                            j -= length2;
                            A01 += length2;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void A0I(File file, File file2) {
        FileOutputStream fileOutputStream;
        if (!file.renameTo(file2)) {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                fileOutputStream = new FileOutputStream(file2);
                A00(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                A0Q(file);
                return;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }

    public static void A0J(File file, String str) {
        int length;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null && (length = listFiles.length) > 0) {
            int i = 0;
            do {
                File file2 = listFiles[i];
                StringBuilder A11 = AnonymousClass000.A11(str);
                A11.append(file2.getName());
                A11.append(" ");
                A11.append(file2.length());
                A11.append(" drw=");
                String str2 = "1";
                String str3 = "0";
                if (file2.isDirectory()) {
                    str3 = str2;
                }
                A11.append(str3);
                String str4 = "0";
                if (file2.canRead()) {
                    str4 = str2;
                }
                A11.append(str4);
                if (!file2.canWrite()) {
                    str2 = "0";
                }
                C17890vO.A1A(A11, str2);
                i++;
            } while (i < length);
        }
    }

    public static void A0K(File file, Set set) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (!file2.isDirectory()) {
                    file2.getPath();
                    A0Q(file2);
                } else if (set == null || !set.contains(file2.getName())) {
                    A0K(file2, (Set) null);
                } else {
                    file2.getPath();
                }
            }
        }
        file.getPath();
        A0Q(file);
    }

    public static boolean A0M(Uri uri, AnonymousClass11C r6, C219217x r7, boolean z) {
        String scheme = uri.getScheme();
        if (!"settings".equals(uri.getAuthority()) && ("file".equals(scheme) || "content".equals(scheme))) {
            try {
                AnonymousClass11B A0O = r6.A0O();
                if (A0O == null) {
                    Log.w("file-utils/ringtone-available/false cr=null");
                    return false;
                }
                AnonymousClass1EY.A02(A0O.A07(uri));
                return true;
            } catch (SQLiteException | FileNotFoundException | NullPointerException e) {
                Log.i(AnonymousClass001.A1E(uri, "file-utils/ringtone-available/false/file-not-found ", AnonymousClass000.A10()), e);
                return false;
            } catch (IllegalStateException e2) {
                Log.i(AnonymousClass001.A1E(uri, "file-utils/ringtone-available/false/illegal-state ", AnonymousClass000.A10()), e2);
                return false;
            } catch (IllegalArgumentException e3) {
                Log.i(AnonymousClass001.A1E(uri, "file-utils/ringtone-available/false/illegal-argument ", AnonymousClass000.A10()), e3);
                return false;
            } catch (SecurityException e4) {
                if (uri.toString().startsWith(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.toString())) {
                    Log.i("file-utils/ringtone-available/false/access-denied", e4);
                    if (!r7.A0G()) {
                        return z;
                    }
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("file-utils/ringtone-available/true/cannot-check ");
                    Log.i(AnonymousClass000.A0y(uri.toString(), A10), e4);
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean A0Q(File file) {
        if (!file.exists() || file.delete()) {
            return true;
        }
        C17900vP.A0Z(file, "file-utils/delete-file/failed ", AnonymousClass000.A10());
        return false;
    }

    public static boolean A0R(File file) {
        if (file.isDirectory()) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File A0R : listFiles) {
                        if (!A0R(A0R)) {
                            return false;
                        }
                    }
                }
            } catch (OutOfMemoryError e) {
                StringBuilder A10 = AnonymousClass000.A10();
                C17900vP.A0N(file, "trash/delete-recursive/out-of-memory ", A10);
                C17880vN.A1M(A10, e);
                return false;
            }
        }
        return file.delete();
    }

    public static boolean A0S(File file) {
        StringBuilder sb;
        String str;
        String absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            boolean isDirectory = file.isDirectory();
            sb = AnonymousClass000.A10();
            if (isDirectory) {
                C17900vP.A0e("FileUtils/prepareEmptyDir/Directory already exists unexpectedly! Cleaning up. ", absolutePath, sb);
                A0H(file, -1);
                return true;
            }
            str = "FileUtils/prepareEmptyDir/Directory already exists unexpectedly and is a file! Wrong call.";
        } else if (file.mkdirs()) {
            return true;
        } else {
            sb = AnonymousClass000.A10();
            str = "FileUtils/prepareEmptyDir/Could not make directory ";
        }
        C17900vP.A0e(str, absolutePath, sb);
        return false;
    }

    public static boolean A0V(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            if (!str.matches("[\\w-.,'\\s]+")) {
                str2 = "FileUtils/fileNameInvalid/file name contains invalid characters, allowed characters are a to z, A to Z, _ , ' - . and space character";
            } else if (!str.contains("..")) {
                return false;
            } else {
                str2 = "FileUtils/fileNameInvalid/file name cannot contain ..";
            }
            Log.e(str2);
        }
        return true;
    }

    public static byte[] A0W(File file) {
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            fileInputStream.read(bArr);
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }
}
