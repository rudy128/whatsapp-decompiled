package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.204  reason: invalid class name */
public class AnonymousClass204 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r2 == 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(android.graphics.Bitmap.Config r2, int r3, int r4) {
        /*
            int r3 = r3 * r4
            int[] r1 = X.CG5.A00
            int r0 = r2.ordinal()
            r2 = r1[r0]
            r0 = 1
            r1 = 4
            if (r2 == r0) goto L_0x0015
            r0 = 2
            if (r2 == r0) goto L_0x0014
            r0 = 3
            r1 = 1
            if (r2 != r0) goto L_0x0015
        L_0x0014:
            r1 = 2
        L_0x0015:
            int r3 = r3 * r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass204.A01(android.graphics.Bitmap$Config, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (r13 < 0) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.AnonymousClass25O r11, int r12, int r13) {
        /*
            r9 = 1
            if (r12 < 0) goto L_0x0006
            r2 = 1
            if (r13 >= 0) goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "bitmaputils/wrong raw image/"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            X.C17960vV.A0F(r2, r0)
            if (r2 != 0) goto L_0x0026
            return r9
        L_0x0026:
            android.graphics.BitmapFactory$Options r0 = r11.A03
            int r8 = r0.inSampleSize
            long r3 = r11.A02
            r10 = r12
            r2 = r13
            r7 = 1
        L_0x002f:
            long r5 = (long) r10
            long r0 = (long) r2
            long r5 = r5 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            r1 = 2
            int r0 = r10 + -1
            int r0 = r0 / r1
            int r10 = r0 + 1
            int r0 = r2 + -1
            int r0 = r0 / r1
            int r2 = r0 + 1
            int r7 = r7 * 2
            goto L_0x002f
        L_0x0044:
            r1 = 25000000(0x17d7840, double:1.2351641E-316)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            if (r7 <= r9) goto L_0x0052
            java.lang.String r0 = "bitmaputils/findInSampleSizeByMaxPixels/downsizing image exceeding max spec pixels"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0052:
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x005b
            int r12 = java.lang.Math.max(r12, r13)
            r13 = r12
        L_0x005b:
            int r2 = java.lang.Math.max(r8, r7)
            int r1 = r11.A01
            int r0 = r11.A00
            int r0 = A00(r12, r13, r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass204.A02(X.25O, int, int):int");
    }

    public static Bitmap A03(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap2.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        loop0:
        while (true) {
            if (i2 >= bitmap2.getWidth()) {
                i2 = 0;
                break;
            }
            for (int i3 = 0; i3 < bitmap2.getHeight(); i3++) {
                if (iArr[(bitmap2.getWidth() * i3) + i2] != 0) {
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 0;
        loop2:
        while (true) {
            if (i4 >= bitmap2.getHeight()) {
                break;
            }
            for (int i5 = i2; i5 < bitmap2.getWidth(); i5++) {
                if (iArr[(bitmap2.getWidth() * i4) + i5] != 0) {
                    i = i4;
                    break loop2;
                }
            }
            i4++;
        }
        int width2 = bitmap2.getWidth();
        loop4:
        while (true) {
            width2--;
            if (width2 < i2) {
                break;
            }
            int height2 = bitmap2.getHeight();
            while (true) {
                height2--;
                if (height2 >= i) {
                    if (iArr[(bitmap2.getWidth() * height2) + width2] != 0) {
                        width = width2;
                        break loop4;
                    }
                }
            }
        }
        int height3 = bitmap2.getHeight();
        loop6:
        while (true) {
            height3--;
            if (height3 < i) {
                break;
            }
            int width3 = bitmap2.getWidth();
            while (true) {
                width3--;
                if (width3 >= i2) {
                    if (iArr[(bitmap2.getWidth() * height3) + width3] != 0) {
                        height = height3;
                        break loop6;
                    }
                }
            }
        }
        return Bitmap.createBitmap(bitmap2, i2, i, width - i2, height - i);
    }

    public static Bitmap A06(BitmapFactory.Options options, InputStream inputStream) {
        try {
            return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        } catch (Throwable th) {
            Log.w("bitmaputils/error-on-decode-stream", th);
            return null;
        }
    }

    public static AnonymousClass25P A0B(AnonymousClass25O r2, InputStream inputStream) {
        return A08((C58622kz) null, r2, inputStream, false);
    }

    public static AnonymousClass25P A0C(AnonymousClass25O r2, byte[] bArr) {
        return A09((C58622kz) null, r2, bArr, false);
    }

    public static C134746r5 A0D(String str, boolean z) {
        String str2;
        int i;
        C134746r5 r0;
        if (str == null || str.isEmpty()) {
            str2 = "BitmapUtils/getImageDimensions/invalid file path";
        } else {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeFile(str, options);
                int i2 = options.outWidth;
                if (i2 <= 0 || (i = options.outHeight) <= 0) {
                    str2 = "BitmapUtils/getImageDimensions/invalid image dimensions";
                } else if (z) {
                    return r0;
                } else {
                    r0 = new C134746r5(i2, i);
                    return r0;
                }
            } catch (IllegalArgumentException e) {
                Log.e("BitmapUtils/getImageDimensions/cannot decode file", e);
                return null;
            }
        }
        Log.e(str2);
        return null;
    }

    public static int A00(int i, int i2, int i3, int i4, int i5) {
        int i6 = ((i - 1) / i5) + 1;
        int i7 = ((i2 - 1) / i5) + 1;
        while (((i6 - 1) / 2) + 1 >= i3 && ((i7 - 1) / 2) + 1 >= i4) {
            i6 = ((i6 - 1) / 2) + 1;
            i7 = ((i7 - 1) / 2) + 1;
            i5 *= 2;
        }
        return i5;
    }

    public static Path A07(RectF rectF) {
        RectF rectF2 = new RectF(rectF);
        float min = Math.min(rectF2.width(), rectF2.height());
        rectF2.right = rectF2.left + min;
        rectF2.bottom = rectF2.top + min;
        Path path = new Path();
        path.moveTo(rectF2.centerX(), rectF2.top);
        float f = rectF2.left;
        float f2 = rectF2.top;
        float f3 = f;
        float f4 = f2;
        path.cubicTo(f, f2, f3, f4, f, rectF2.centerY());
        float f5 = rectF2.left;
        float f6 = rectF2.bottom;
        path.cubicTo(f5, f6, f5, f6, rectF2.centerX(), rectF2.bottom);
        float f7 = rectF2.right;
        float f8 = rectF2.bottom;
        float f9 = f7;
        float f10 = f8;
        path.cubicTo(f7, f8, f9, f10, f7, rectF2.centerY());
        float f11 = rectF2.right;
        float f12 = rectF2.top;
        path.cubicTo(f11, f12, f11, f12, rectF2.centerX(), rectF2.top);
        path.close();
        return path;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.graphics.Bitmap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass25P A09(X.C58622kz r12, X.AnonymousClass25O r13, byte[] r14, boolean r15) {
        /*
            android.graphics.BitmapFactory$Options r8 = r13.A03
            boolean r0 = r8.inJustDecodeBounds
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x000e
            r8.inJustDecodeBounds = r3
            int r0 = r14.length
            android.graphics.BitmapFactory.decodeByteArray(r14, r1, r0, r8)
        L_0x000e:
            int r6 = r8.outWidth
            int r5 = r8.outHeight
            r2 = 0
            if (r6 <= 0) goto L_0x00ca
            if (r5 <= 0) goto L_0x00ca
            int r0 = A02(r13, r6, r5)
            r8.inSampleSize = r0
            r8.inJustDecodeBounds = r1
            r8.inPurgeable = r3
            r8.inInputShareable = r3
            if (r15 != 0) goto L_0x0034
            int r0 = r14.length     // Catch:{ all -> 0x002c }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r14, r1, r0, r8)     // Catch:{ all -> 0x002c }
            goto L_0x00d4
        L_0x002c:
            r1 = move-exception
            java.lang.String r0 = "bitmaputils/decodeRawBytes failed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00d4
        L_0x0034:
            X.C17960vV.A07(r12)
            r8.inMutable = r3
            int r4 = r8.outWidth
            int r3 = r8.outHeight
            X.00z r7 = r12.A00
            monitor-enter(r7)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x00c7 }
            int r0 = A01(r0, r4, r3)     // Catch:{ all -> 0x00c7 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00c7 }
            java.util.TreeSet r10 = r12.A02     // Catch:{ all -> 0x00c7 }
            boolean r0 = X.C29431cG.A18(r10, r3)     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0058
            java.lang.Object r3 = r10.ceiling(r3)     // Catch:{ all -> 0x00c7 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00c7 }
        L_0x0058:
            r9 = 0
            if (r3 == 0) goto L_0x0090
            int r11 = r3.intValue()     // Catch:{ all -> 0x00c7 }
            java.util.HashMap r0 = r12.A01     // Catch:{ all -> 0x00c7 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x00c7 }
            java.util.LinkedHashSet r4 = (java.util.LinkedHashSet) r4     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x0090
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x0090
            java.lang.Object r3 = X.C29431cG.A0Y(r4)     // Catch:{ all -> 0x00c7 }
            if (r3 == 0) goto L_0x0090
            r4.remove(r3)     // Catch:{ all -> 0x00c7 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0085
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00c7 }
            r10.remove(r0)     // Catch:{ all -> 0x00c7 }
        L_0x0085:
            java.lang.Object r0 = r7.A05(r3)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0090
            X.1D6 r9 = new X.1D6     // Catch:{ all -> 0x00c7 }
            r9.<init>(r0, r3)     // Catch:{ all -> 0x00c7 }
        L_0x0090:
            monitor-exit(r7)
            r4 = 0
            if (r9 == 0) goto L_0x00a1
            java.lang.Object r3 = r9.first
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r2 = r9.second
            java.lang.String r2 = (java.lang.String) r2
            if (r3 == 0) goto L_0x00a2
            r8.inBitmap = r3
            goto L_0x00a2
        L_0x00a1:
            r3 = r2
        L_0x00a2:
            int r0 = r14.length     // Catch:{ IllegalArgumentException -> 0x00a8 }
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeByteArray(r14, r1, r0, r8)     // Catch:{ IllegalArgumentException -> 0x00a8 }
            goto L_0x00c1
        L_0x00a8:
            java.lang.String r0 = "bitmaputils/decode failed with bitmap pool"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r3 == 0) goto L_0x00c1
            if (r2 == 0) goto L_0x00c1
            monitor-enter(r7)
            r7.A08(r2, r3)     // Catch:{ all -> 0x00c7 }
            int r1 = r3.getWidth()     // Catch:{ all -> 0x00c7 }
            int r0 = r3.getHeight()     // Catch:{ all -> 0x00c7 }
            r12.A00(r1, r0, r2)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r7)
        L_0x00c1:
            X.25P r0 = new X.25P
            r0.<init>(r4, r6, r5)
            return r0
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x00ca:
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>()
            java.lang.String r0 = "bitmaputils/decodeRawBytes bad image"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00d4:
            X.25P r0 = new X.25P
            r0.<init>(r2, r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass204.A09(X.2kz, X.25O, byte[], boolean):X.25P");
    }

    public static AnonymousClass25P A0A(AnonymousClass25O r6, File file) {
        BitmapFactory.Options options = r6.A03;
        Bitmap bitmap = null;
        if (!options.inJustDecodeBounds) {
            options.inJustDecodeBounds = true;
            try {
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            } catch (Throwable th) {
                Log.w("bitmaputils/error-on-decode-bounds", th);
                return new AnonymousClass25P((Bitmap) null, 0, 0);
            }
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i <= 0 || i2 <= 0) {
            Log.e("bitmaputils/decodeFile bad image", new Throwable());
        } else {
            options.inSampleSize = A02(r6, i, i2);
            options.inJustDecodeBounds = false;
            try {
                bitmap = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            } catch (Throwable th2) {
                Log.w("bitmaputils/error-on-decode-api21+", th2);
            }
        }
        return new AnonymousClass25P(bitmap, i, i2);
    }

    public static String A0E(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        AnonymousClass1EY.A02(byteArrayOutputStream);
        return encodeToString;
    }

    public static Bitmap A04(Bitmap bitmap, int i, int i2) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        float f = (float) i2;
        float f2 = (float) (i - i2);
        RectF rectF2 = new RectF(f, f, f2, f2);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0);
        canvas.drawBitmap(bitmap, matrix, new Paint(2));
        return createBitmap;
    }

    public static Bitmap A05(Bitmap bitmap, ColorFilter colorFilter, float f) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColorFilter(colorFilter);
        float f2 = (float) (((double) f) * 0.70710678118d);
        float f3 = -f2;
        canvas.drawBitmap(bitmap, f3, f3, paint);
        canvas.drawBitmap(bitmap, f2, f3, paint);
        canvas.drawBitmap(bitmap, f3, f2, paint);
        canvas.drawBitmap(bitmap, f2, f2, paint);
        float f4 = -f;
        canvas.drawBitmap(bitmap, f4, 0.0f, paint);
        canvas.drawBitmap(bitmap, 0.0f, f4, paint);
        canvas.drawBitmap(bitmap, f, 0.0f, paint);
        canvas.drawBitmap(bitmap, 0.0f, f, paint);
        paint.setColorFilter((ColorFilter) null);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static AnonymousClass25P A08(C58622kz r1, AnonymousClass25O r2, InputStream inputStream, boolean z) {
        try {
            return A09(r1, r2, AnonymousClass1EY.A04(inputStream), z);
        } catch (IOException e) {
            Log.e("bitmaputils/decoder failed", e);
            return new AnonymousClass25P((Bitmap) null, 0, 0);
        }
    }
}
