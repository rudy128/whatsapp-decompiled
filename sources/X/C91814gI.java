package X;

import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;

/* renamed from: X.4gI  reason: invalid class name and case insensitive filesystem */
public class C91814gI implements C23521Gp {
    public final int A00;
    public final Object A01;

    public C91814gI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bzy(int i) {
        if (this.A00 != 0) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this.A01;
            downloadableWallpaperPreviewActivity.A00.setEnabled(downloadableWallpaperPreviewActivity.A08.contains(Integer.valueOf(i)));
            return;
        }
        ((C22821Di) this.A01).invoke(Integer.valueOf(i));
    }

    public void Bzw(int i) {
    }

    public void Bzx(int i, float f, int i2) {
    }
}
