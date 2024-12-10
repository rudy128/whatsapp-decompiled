package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.FileDescriptor;

/* renamed from: X.6v8  reason: invalid class name and case insensitive filesystem */
public abstract class C137236v8 {
    public static final Bitmap A00(Bitmap bitmap, int i) {
        Bitmap bitmap2 = bitmap;
        if (i != 0) {
            Matrix A0J = C108945cZ.A0J();
            A0J.setRotate((float) i, C108945cZ.A02(bitmap2.getWidth()), C108945cZ.A02(bitmap2.getHeight()));
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), A0J, true);
                C18070vi.A0X(createBitmap);
                if (!bitmap2.equals(createBitmap)) {
                    bitmap2.recycle();
                    return createBitmap;
                }
            } catch (OutOfMemoryError e) {
                Log.e("Util/rotate/", e);
                return bitmap2;
            }
        }
        return bitmap2;
    }

    public static final Bitmap A01(ParcelFileDescriptor parcelFileDescriptor, int i, long j) {
        int i2;
        int i3;
        Long valueOf;
        int i4 = i;
        Bitmap bitmap = null;
        if (parcelFileDescriptor != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                options.inJustDecodeBounds = true;
                C1403471a.A01().A02(options, fileDescriptor);
                if (!(options.mCancel || (i2 = options.outWidth) == -1 || (i3 = options.outHeight) == -1)) {
                    if (i == -1) {
                        i4 = Integer.MAX_VALUE;
                    }
                    if (j == -1) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(j);
                    }
                    options.inSampleSize = AnonymousClass204.A02(new AnonymousClass25O((BitmapFactory.Options) null, valueOf, i4, i4, true), i2, i3);
                    options.inJustDecodeBounds = false;
                    options.inDither = false;
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    bitmap = C1403471a.A01().A02(options, fileDescriptor);
                }
            } catch (OutOfMemoryError e) {
                Log.e("GalleryPickerUtil/Got oom exception ", e);
            } catch (Throwable th) {
                try {
                    parcelFileDescriptor.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable unused2) {
            }
        }
        return bitmap;
    }
}
