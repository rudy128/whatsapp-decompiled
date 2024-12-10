package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

/* renamed from: X.73l  reason: invalid class name and case insensitive filesystem */
public class C1408873l {
    public final C25291Nq A00;

    public static Bitmap A00(RectF rectF, C125996c1 r19, int i, int i2, int i3, int i4, long j, boolean z) {
        C109545dc r4;
        Bitmap bitmap;
        Bitmap A07;
        float f;
        float f2;
        float f3;
        float f4;
        byte[] embeddedPicture;
        try {
            r4 = new C109545dc("ThumbnailUtils/createVideoThumbnail");
            Boolean bool = C17960vV.A01;
            r4.A00(r19.A00);
            int i5 = i3;
            long j2 = j;
            if (Build.VERSION.SDK_INT < 27 || i3 <= 0) {
                bitmap = null;
            } else {
                bitmap = r4.getScaledFrameAtTime(j2, 0, i5, i5);
            }
            if (bitmap == null) {
                bitmap = r4.getFrameAtTime(j2);
            }
            if (bitmap == null) {
                bitmap = r4.getFrameAtTime();
            }
            if (bitmap == null && (embeddedPicture = r4.getEmbeddedPicture()) != null) {
                bitmap = C72473Md.A0E(embeddedPicture);
            }
            if (bitmap != null) {
                int i6 = i;
                if (i > 0) {
                    int i7 = i2;
                    if (i2 > 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(i6, i7, bitmap.getConfig());
                        Matrix A0J = C108945cZ.A0J();
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        float f5 = (float) width;
                        float f6 = (float) height;
                        float f7 = f5 / f6;
                        float f8 = (float) i6;
                        float f9 = (float) i7;
                        float f10 = f8 / f9;
                        if (f7 > f10) {
                            f = f8 / f5;
                            f2 = (f9 - (((float) (height * i)) / f5)) / 2.0f;
                            f3 = 0.0f;
                        } else {
                            f = f9 / f6;
                            f3 = (f8 - (((float) (width * i2)) / f6)) / 2.0f;
                            f2 = 0.0f;
                        }
                        A0J.postScale(f, f);
                        A0J.postTranslate(f3, f2);
                        if (rectF != null) {
                            if (f7 > f10) {
                                f4 = rectF.width();
                            } else {
                                f4 = (rectF.width() * f10) / f7;
                            }
                            float f11 = f4 / 2.0f;
                            A0J.postScale(f11, f11, f8 / 2.0f, f9 / 2.0f);
                            A0J.postTranslate((rectF.centerX() * f8) / 2.0f, ((-rectF.centerY()) * f9) / 2.0f);
                        }
                        C108945cZ.A0I(createBitmap).drawBitmap(bitmap, A0J, (Paint) null);
                        bitmap = createBitmap;
                    }
                }
            }
            if (!(bitmap == null || i3 <= 0 || bitmap == (A07 = C26511Sk.A07(bitmap, (Matrix) null, i5, i5)))) {
                bitmap.recycle();
                bitmap = A07;
            }
            if (!(bitmap == null || !z || bitmap.getConfig() == Bitmap.Config.ARGB_8888)) {
                ByteArrayOutputStream A15 = C108945cZ.A15();
                int i8 = i4;
                if (i4 > 0) {
                    C124316Xw.A00(i8, bitmap);
                }
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, A15);
                bitmap.recycle();
                byte[] byteArray = A15.toByteArray();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inDither = true;
                options.inInputShareable = true;
                options.inPurgeable = true;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, AnonymousClass2WU.A00);
            }
            if (bitmap == null) {
                Log.w("mediafileutils/createVideoThumbnail/no bitmap created");
            }
            r4.close();
            return bitmap;
        } catch (RuntimeException e) {
            Log.e("mediafileutils/createVideoThumbnail/corrupt video file", e);
            return null;
        } catch (IOException e2) {
            Log.e("mediafileutils/createVideoThumbnail/unable to load video", e2);
            return null;
        } catch (Exception e3) {
            Log.e("mediafileutils/createVideoThumbnail/unknown exception", e3);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static Bitmap A01(File file) {
        boolean z;
        String str;
        if (file == null) {
            Log.e("mediafileutils/createVideoThumbnail/file=null");
            return null;
        }
        try {
            DRK.A04(file);
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (!z) {
            return A00((RectF) null, new C125996c1(file), 0, 0, -1, 0, 0, false);
        }
        try {
            return DRK.A00(file);
        } catch (IOException | IllegalArgumentException e) {
            e = e;
            str = "mediafileutils/createGifThumbnail/gif file not read ";
            Log.e(str, e);
            return null;
        } catch (Exception e2) {
            e = e2;
            str = "mediafileutils/createGifThumbnail/unexpected gif exception ";
            Log.e(str, e);
            return null;
        }
    }

    public byte[] A05(Uri uri, int i, int i2, int i3) {
        String str;
        ByteArrayOutputStream A15;
        byte[] bArr = null;
        try {
            A15 = C108945cZ.A15();
            Bitmap A07 = this.A00.A07(uri, i, i2);
            if (i3 > 0) {
                C124316Xw.A00(i3, A07);
            }
            A07.compress(Bitmap.CompressFormat.JPEG, 80, A15);
            bArr = A15.toByteArray();
            A07.recycle();
            A15.close();
            return bArr;
        } catch (AnonymousClass2RM e) {
            e = e;
            str = "thumbnailutils/getImageThumb/file is not an image";
            Log.e(str, e);
            return bArr;
        } catch (IOException e2) {
            e = e2;
            str = "thumbnailutils/getImageThumb/unable to load image";
            Log.e(str, e);
            return bArr;
        } catch (OutOfMemoryError e3) {
            e = e3;
            str = "thumbnailutils/getImageThumb/out of memory when generating the thumbnail";
            Log.e(str, e);
            return bArr;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static Bitmap A02(File file, long j) {
        C109545dc r0;
        if (j == 0) {
            return A01(file);
        }
        Bitmap bitmap = null;
        try {
            r0 = new C109545dc("ThumbnailUtils/createVideoThumbnailAtTime");
            r0.A00(file);
            bitmap = r0.getFrameAtTime(j);
            r0.close();
            return bitmap;
        } catch (Exception | NoSuchMethodError unused) {
            return bitmap;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static byte[] A03(Bitmap bitmap, int i) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A0o(bitmap, "orig_thumbnail/width:", A10);
        A10.append("/height:");
        A10.append(bitmap.getHeight());
        C17900vP.A0j("/maxDimension:", A10, i);
        if (bitmap.getWidth() > i || bitmap.getHeight() > i) {
            float f = (float) i;
            float max = Math.max(((float) bitmap.getWidth()) / f, ((float) bitmap.getHeight()) / f);
            Rect rect = new Rect(0, 0, (int) (((float) bitmap.getWidth()) / max), (int) (((float) bitmap.getHeight()) / max));
            rect.right = Math.max(rect.right, 1);
            rect.bottom = Math.max(rect.bottom, 1);
            Rect A0I = C108995ce.A0I(bitmap);
            Bitmap.Config config = bitmap.getConfig();
            try {
                int width = rect.width();
                int height = rect.height();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas A0I2 = C108945cZ.A0I(createBitmap);
                Paint A07 = AnonymousClass3Ma.A07();
                A07.setFilterBitmap(true);
                A07.setDither(true);
                A0I2.drawBitmap(bitmap, A0I, rect, A07);
                bitmap.recycle();
                StringBuilder A102 = AnonymousClass000.A10();
                C108975cc.A0o(createBitmap, "rescaled_thumbnail/width:", A102);
                A102.append("/height:");
                C17900vP.A0o(A102, createBitmap.getHeight());
                bitmap = createBitmap;
            } catch (OutOfMemoryError e) {
                Log.e("video-thumbnail/scale/out-of-memory", e);
                bitmap.recycle();
                throw e;
            }
        }
        byte[] A1a = C108955ca.A1a(Bitmap.CompressFormat.JPEG, bitmap, C108945cZ.A15(), 80);
        bitmap.recycle();
        return A1a;
    }

    public C1408873l(C25291Nq r1) {
        this.A00 = r1;
    }

    public static byte[] A04(File file) {
        return A03(A01(file), 100);
    }
}
