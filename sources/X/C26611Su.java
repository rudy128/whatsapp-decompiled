package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.facebook.animated.webp.WebPImage;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.1Su  reason: invalid class name and case insensitive filesystem */
public class C26611Su {
    public final WamediaManager A00;
    public final AnonymousClass118 A01;
    public volatile AiK A02;
    public volatile boolean A03;

    public static WebPImage A02(byte[] bArr) {
        try {
            return WebPImage.createFromByteArray(bArr, (C25798CmA) null);
        } catch (UnsatisfiedLinkError e) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/unsatisfiedLinkError", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.e("WebPImageLoader/createWebPImageFromBytes/failed to create webp image object", e2);
            return null;
        }
    }

    private AiK A03() {
        if (!this.A03) {
            synchronized (this) {
                if (!this.A03) {
                    File file = new File(this.A01.A00.getCacheDir(), "webp_static_cache");
                    if (file.exists() || file.mkdirs()) {
                        try {
                            this.A02 = AiK.A01((C183489Yl) null, file, 2097152);
                        } catch (IOException e) {
                            Log.e("WebPImageLoader/getDiskLruCache error opening cache", e);
                        }
                    } else {
                        Log.e("WebPImageLoader/getDiskLruCache could not init directory");
                    }
                    this.A03 = true;
                }
            }
        }
        return this.A02;
    }

    public static String A04(int i, int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.replace("/", "-").replace(" ", ""));
        sb.append("_");
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public Bitmap A06(File file, String str, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream;
        String A04 = A04(i, i2, str);
        Bitmap A012 = A01(this, A04);
        if (A012 == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outHeight = i2;
            options.outWidth = i;
            WebpInfo verifyWebpFile = this.A00.verifyWebpFile(file.getAbsolutePath());
            if (verifyWebpFile == null || verifyWebpFile.numFrames != 1) {
                A012 = null;
            } else {
                options.inSampleSize = AnonymousClass204.A00(verifyWebpFile.width, verifyWebpFile.height, i, i2, 1);
                A012 = WebpBitmapFactoryImpl.hookDecodeFile(file.getAbsolutePath(), options);
            }
            if (A012 != null) {
                A05(A012, A04);
            } else {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        C64062u9.A00(fileInputStream, byteArrayOutputStream);
                        Bitmap A07 = A07(str, byteArrayOutputStream.toByteArray(), i, i2);
                        byteArrayOutputStream.close();
                        fileInputStream.close();
                        return A07;
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                } catch (FileNotFoundException | IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadStaticImageAsBitmapFromFile/getting sticker bitmap failed:");
                    sb.append(str);
                    Log.e(sb.toString(), e);
                    return null;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
        }
        return A012;
        throw th;
    }

    public C26611Su(AnonymousClass118 r1, WamediaManager wamediaManager, AnonymousClass198 r3) {
        this.A01 = r1;
        this.A00 = wamediaManager;
        try {
            r3.A00();
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[Catch:{ IllegalStateException -> 0x008f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A00(com.facebook.animated.webp.WebPImage r8, X.C26611Su r9, java.lang.String r10, int r11, int r12) {
        /*
            int r0 = r8.getFrameCount()     // Catch:{ IllegalStateException -> 0x008f }
            r3 = 0
            if (r0 <= 0) goto L_0x0088
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0066, IllegalArgumentException -> 0x006a }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r11, r12, r0)     // Catch:{ OutOfMemoryError -> 0x0066, IllegalArgumentException -> 0x006a }
            r0 = 0
            com.facebook.animated.webp.WebPFrame r2 = r8.getFrame((int) r0)     // Catch:{ IllegalStateException -> 0x008f }
            int r1 = r2.getWidth()     // Catch:{ IllegalStateException -> 0x008f }
            int r7 = r2.getHeight()     // Catch:{ IllegalStateException -> 0x008f }
            int r6 = r8.getWidth()     // Catch:{ IllegalStateException -> 0x008f }
            int r0 = r8.getHeight()     // Catch:{ IllegalStateException -> 0x008f }
            if (r0 != r7) goto L_0x002a
            if (r6 != r1) goto L_0x002a
            r2.renderFrame(r11, r12, r4)     // Catch:{ IllegalStateException -> 0x008f }
            goto L_0x0089
        L_0x002a:
            float r5 = (float) r11     // Catch:{ IllegalStateException -> 0x008f }
            int r0 = java.lang.Math.max(r6, r0)     // Catch:{ IllegalStateException -> 0x008f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x008f }
            float r5 = r5 / r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0062 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r11, r12, r0)     // Catch:{ OutOfMemoryError -> 0x0062 }
            float r0 = (float) r1     // Catch:{ IllegalStateException -> 0x008f }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x008f }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x008f }
            int r8 = (int) r0     // Catch:{ IllegalStateException -> 0x008f }
            float r0 = (float) r7     // Catch:{ IllegalStateException -> 0x008f }
            float r0 = r0 * r5
            double r0 = (double) r0     // Catch:{ IllegalStateException -> 0x008f }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ IllegalStateException -> 0x008f }
            int r7 = (int) r0     // Catch:{ IllegalStateException -> 0x008f }
            r2.renderFrame(r8, r7, r6)     // Catch:{ IllegalStateException -> 0x008f }
            android.graphics.Canvas r7 = new android.graphics.Canvas     // Catch:{ IllegalStateException -> 0x008f }
            r7.<init>(r4)     // Catch:{ IllegalStateException -> 0x008f }
            int r0 = r2.getXOffset()     // Catch:{ IllegalStateException -> 0x008f }
            float r1 = (float) r0     // Catch:{ IllegalStateException -> 0x008f }
            float r1 = r1 * r5
            int r0 = r2.getYOffset()     // Catch:{ IllegalStateException -> 0x008f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x008f }
            float r0 = r0 * r5
            r7.drawBitmap(r6, r1, r0, r3)     // Catch:{ IllegalStateException -> 0x008f }
            r6.recycle()     // Catch:{ IllegalStateException -> 0x008f }
            goto L_0x0089
        L_0x0062:
            r2 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating framebitmap"
            goto L_0x0085
        L_0x0066:
            r2 = move-exception
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap"
            goto L_0x0085
        L_0x006a:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x008f }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x008f }
            java.lang.String r0 = "WebPImageLoader/createStaticImage creating bitmap "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x008f }
            r1.append(r11)     // Catch:{ IllegalStateException -> 0x008f }
            java.lang.String r0 = "x"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x008f }
            r1.append(r12)     // Catch:{ IllegalStateException -> 0x008f }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x008f }
        L_0x0085:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IllegalStateException -> 0x008f }
        L_0x0088:
            r4 = r3
        L_0x0089:
            if (r4 == 0) goto L_0x008e
            r9.A05(r4, r10)     // Catch:{ IllegalStateException -> 0x008f }
        L_0x008e:
            return r4
        L_0x008f:
            r1 = move-exception
            java.lang.String r0 = "WebPImageLoader/createBitmapFromWebPImageAndCache/failed to create static image"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26611Su.A00(com.facebook.animated.webp.WebPImage, X.1Su, java.lang.String, int, int):android.graphics.Bitmap");
    }

    public static Bitmap A01(C26611Su r3, String str) {
        C21326AiB aiB;
        InputStream inputStream;
        AiK A032 = r3.A03();
        if (A032 != null) {
            try {
                aiB = A032.A0B(str);
            } catch (IOException e) {
                Log.e("WebPImageLoader/error getting bitmap from cache", e);
                aiB = null;
            }
            if (aiB == null) {
                return null;
            }
            try {
                inputStream = aiB.A00[0];
                Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                return decodeStream;
            } catch (IOException unused) {
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return null;
        throw th;
    }

    private void A05(Bitmap bitmap, String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        AiK A032 = A03();
        if (A032 != null) {
            try {
                C192399oK A002 = AiK.A00(A032, str);
                if (A002 != null) {
                    AnonymousClass9HU A003 = A002.A00();
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        A003.write(byteArray, 0, byteArray.length);
                        A002.A01();
                        byteArrayOutputStream.close();
                        A003.close();
                        return;
                    } catch (Throwable th) {
                        A003.close();
                        throw th;
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                Log.e("WebPImageLoader/saving bitmap to cache", e);
                return;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
            }
        } else {
            return;
        }
        throw th;
    }

    public Bitmap A07(String str, byte[] bArr, int i, int i2) {
        String A04 = A04(i, i2, str);
        Bitmap A012 = A01(this, A04);
        if (A012 != null) {
            return A012;
        }
        WebPImage A022 = A02(bArr);
        if (A022 == null) {
            return null;
        }
        return A00(A022, this, A04, i, i2);
    }
}
