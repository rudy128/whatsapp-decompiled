package com.whatsapp.stickers;

import X.AnonymousClass0DT;
import X.AnonymousClass190;
import X.AnonymousClass1S5;
import X.AnonymousClass2H9;
import X.C17960vV;
import X.C19620yd;
import X.C64062u9;
import android.util.Base64;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class WebpUtils {
    public Random A00 = new Random();
    public final AnonymousClass190 A01;
    public final AnonymousClass1S5 A02;

    public static String A02(MessageDigest messageDigest, InputStream inputStream) {
        MessageDigest messageDigest2;
        int i;
        int i2;
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        InputStream inputStream2 = inputStream;
        inputStream2.skip(8);
        char c = 0;
        int i3 = 0;
        boolean z = true;
        int i4 = 0;
        while (true) {
            int read = inputStream2.read(bArr);
            messageDigest2 = messageDigest;
            if (read <= 0) {
                i = 0;
                break;
            }
            byte b = bArr[c];
            if (b == 69 && bArr[1] == 88 && bArr[2] == 73 && bArr[3] == 70) {
                i4 = 4;
            } else {
                byte b2 = bArr2[3];
                if (b2 == 69 && b == 88 && bArr[1] == 73 && bArr[2] == 70) {
                    i4 = 3;
                } else {
                    byte b3 = bArr2[2];
                    if (b3 == 69 && b2 == 88 && b == 73 && bArr[1] == 70) {
                        i4 = 2;
                    } else if (bArr2[1] == 69 && b3 == 88 && b2 == 73 && b == 70) {
                        i4 = 1;
                    }
                }
            }
            i = 0;
            if (z) {
                i2 = 4;
                if (i4 == 4) {
                    break;
                }
            } else if (i4 > 0) {
                messageDigest2.update(bArr2, 0, i4);
                break;
            } else {
                messageDigest2.update(bArr2, 0, i3);
                i2 = 4;
            }
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            i3 = read;
            c = 0;
            z = false;
        }
        messageDigest2.update(bArr2, i, i3);
        return Base64.encodeToString(messageDigest2.digest(), 2);
    }

    public static native int createFirstThumbnail(byte[] bArr, int i, String str);

    public static native ExifMetadata fetchWebpMetadata(String str);

    public static native int getFirstWebpThumbnailMinimumFileLength(String str);

    public static native int insertWebpMetadata(String str, String str2, byte[] bArr);

    public static native WebpInfoResult verifyWebpFileIntegrity(String str);

    public class ExifMetadata {
        public final int length;
        public final byte[] metadata;
        public final int returnCode;

        public ExifMetadata(int i) {
            this.metadata = null;
            this.returnCode = i;
            this.length = 0;
        }

        private byte[] getMetadata() {
            return this.metadata;
        }

        public ExifMetadata(byte[] bArr) {
            this.metadata = bArr;
            this.returnCode = 0;
            this.length = bArr.length;
        }
    }

    public class WebpInfoResult {
        public final int returnCode;
        public final WebpInfo webpInfo;

        public WebpInfoResult(int i) {
            this.webpInfo = null;
            this.returnCode = i;
        }

        public WebpInfoResult(int i, int i2, int i3, int i4, long j) {
            this.webpInfo = new WebpInfo(i, i2, i3, i4, j);
            this.returnCode = 0;
        }
    }

    public WebpUtils(AnonymousClass190 r2, AnonymousClass1S5 r3) {
        this.A02 = r3;
        this.A01 = r2;
    }

    public static File A00(WebpUtils webpUtils, File file, byte[] bArr) {
        int length;
        AnonymousClass2H9 r2;
        if (!(!file.exists() || bArr == null || (length = bArr.length) == 0)) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.getAbsolutePath());
            sb.append(".");
            sb.append(webpUtils.A00.nextLong());
            sb.append(".tmp");
            File file2 = new File(sb.toString());
            try {
                new String(bArr, C19620yd.A0A);
                int insertWebpMetadata = insertWebpMetadata(file.getAbsolutePath(), file2.getAbsolutePath(), bArr);
                file.getAbsolutePath();
                AnonymousClass1S5 r4 = webpUtils.A02;
                String absolutePath = file.getAbsolutePath();
                long j = (long) length;
                if (!AnonymousClass1S5.A01(r4, 3)) {
                    r2 = null;
                } else {
                    r2 = new AnonymousClass2H9();
                    File file3 = new File(absolutePath);
                    r2.A03 = 0L;
                    r2.A04 = 0L;
                    r2.A05 = Long.valueOf(file3.length());
                    r2.A06 = Long.valueOf(file3.length() + j);
                    r2.A00 = 1;
                    r2.A07 = 0L;
                    r2.A08 = 0L;
                    r2.A09 = 0L;
                    r2.A0A = 0L;
                    r2.A0B = 0L;
                    r2.A0C = Long.valueOf(System.nanoTime());
                    r2.A02 = 3;
                    r2.A01 = Mp4Ops.A00();
                }
                if (r2 != null) {
                    r2.A0B = Long.valueOf((long) insertWebpMetadata);
                }
                r4.A04(r2);
                return file2;
            } catch (UnsupportedEncodingException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("WebpUtils/insertWebpMetadataToTempFile/error when converting bytes to string, input file:");
                sb2.append(file);
                Log.e(sb2.toString(), e);
                C64062u9.A0Q(file2);
            }
        }
        return null;
    }

    public static String A01(File file) {
        StringBuilder sb;
        String str;
        BufferedInputStream bufferedInputStream;
        C17960vV.A01();
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            String A022 = A02(MessageDigest.getInstance("SHA-256"), bufferedInputStream);
            file.getAbsolutePath();
            bufferedInputStream.close();
            return A022;
        } catch (FileNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str = "WebpUtils/getFileHashExcludingMetadata/file not found:";
            sb.append(str);
            sb.append(file.getAbsolutePath());
            Log.e(sb.toString(), e);
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "WebpUtils/getFileHashExcludingMetadata/io exception, file path:";
            sb.append(str);
            sb.append(file.getAbsolutePath());
            Log.e(sb.toString(), e);
            return null;
        } catch (NoSuchAlgorithmException e3) {
            Log.e("WebpUtils/getFileHashExcludingMetadata/no such algorithms exception", e3);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }
}
