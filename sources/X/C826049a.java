package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.49a  reason: invalid class name and case insensitive filesystem */
public class C826049a extends A34 {
    public final int A00;
    public final Context A01;
    public final Resources A02;
    public final WallpaperImagePreview A03;
    public final WallpaperImagePreview A04;
    public final int A05;

    public void A0F() {
        Resources resources = this.A02;
        if (resources != null) {
            WallpaperImagePreview wallpaperImagePreview = this.A04;
            wallpaperImagePreview.setImageDrawable(resources.getDrawable(this.A05));
            wallpaperImagePreview.setVisibility(0);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        InputStream openRawResource;
        Resources resources = this.A02;
        if (resources != null) {
            Point A002 = AnonymousClass4aW.A00(this.A01);
            try {
                openRawResource = resources.openRawResource(this.A00);
                Bitmap A0O = C72453Mb.A0O(A002, openRawResource, true);
                if (openRawResource != null) {
                    openRawResource.close();
                }
                return A0O;
            } catch (IOException | OutOfMemoryError e) {
                Log.e("LoadWallpaperImageTask/error when loading wallpaper resource", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return null;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            return;
        }
        if (!this.A02.isCancelled()) {
            this.A03.setImageBitmap(bitmap);
            this.A04.animate().setDuration(500).alpha(0.0f).setInterpolator(new DecelerateInterpolator()).setListener(new AnonymousClass3Mo(this, 24));
            return;
        }
        bitmap.recycle();
    }

    public C826049a(Context context, Resources resources, WallpaperImagePreview wallpaperImagePreview, WallpaperImagePreview wallpaperImagePreview2, int i, int i2) {
        this.A01 = context;
        this.A04 = wallpaperImagePreview;
        this.A03 = wallpaperImagePreview2;
        this.A02 = resources;
        this.A05 = i;
        this.A00 = i2;
    }
}
