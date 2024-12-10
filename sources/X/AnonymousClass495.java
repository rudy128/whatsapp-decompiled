package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.widget.ImageView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.495  reason: invalid class name */
public class AnonymousClass495 extends A34 {
    public final Context A00;
    public final ImageView A01;
    public final File A02;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        FileInputStream fileInputStream;
        Point A002 = AnonymousClass4aW.A00(this.A00);
        try {
            fileInputStream = new FileInputStream(this.A02);
            Bitmap A0O = C72453Mb.A0O(A002, fileInputStream, true);
            fileInputStream.close();
            return A0O;
        } catch (IOException | OutOfMemoryError e) {
            Log.e("LoadThumbnailWallpaperImageTask/error when loading wallpaper resource", e);
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!this.A02.isCancelled()) {
            this.A01.setImageBitmap(bitmap);
        } else {
            bitmap.recycle();
        }
    }

    public AnonymousClass495(Context context, ImageView imageView, File file) {
        this.A00 = context;
        this.A01 = imageView;
        this.A02 = file;
    }
}
