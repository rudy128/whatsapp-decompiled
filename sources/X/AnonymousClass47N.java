package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.io.Serializable;

/* renamed from: X.47N  reason: invalid class name */
public abstract class AnonymousClass47N extends AnonymousClass47O implements C23321Fo {
    public Button A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public AnonymousClass4RE A03;
    public boolean A04 = false;

    public static void A0V(AnonymousClass10E r1, AnonymousClass10G r2, AnonymousClass47N r3) {
        r3.A01 = (AnonymousClass1M9) r1.A2f.get();
        r3.A02 = (C24921Me) r1.ABX.get();
        r3.A03 = (AnonymousClass4RE) r2.A50.get();
    }

    public String A4b() {
        int i;
        if (this.A00 == null) {
            i = 2131898433;
            if (C28281Zt.A0B(this)) {
                i = 2131898432;
            }
        } else {
            i = 2131898436;
            if (this.A01) {
                i = 2131898437;
            }
        }
        return getString(i);
    }

    public void A4c(AnonymousClass1BI r6) {
        if (this instanceof DownloadableWallpaperPreviewActivity) {
            DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = (DownloadableWallpaperPreviewActivity) this;
            downloadableWallpaperPreviewActivity.A04 = true;
            Intent A0A = C17880vN.A0A();
            int currentItem = downloadableWallpaperPreviewActivity.A00.getCurrentItem();
            if (currentItem < downloadableWallpaperPreviewActivity.A02.size()) {
                A0A.setData(downloadableWallpaperPreviewActivity.A01.A01((Uri) downloadableWallpaperPreviewActivity.A02.get(downloadableWallpaperPreviewActivity.A00.getCurrentItem())));
                A0A.putExtra("FROM_INTERNAL_DOWNLOADS_KEY", true);
            } else {
                A0A.putExtra("selected_res_id", (Serializable) downloadableWallpaperPreviewActivity.A03.get(currentItem - downloadableWallpaperPreviewActivity.A02.size()));
            }
            AnonymousClass3MY.A13(A0A, r6, "chat_jid");
            C72453Mb.A16(downloadableWallpaperPreviewActivity, A0A);
        } else if (this instanceof SolidColorWallpaperPreview) {
            SolidColorWallpaperPreview solidColorWallpaperPreview = (SolidColorWallpaperPreview) this;
            solidColorWallpaperPreview.A04 = true;
            Intent A0A2 = C17880vN.A0A();
            A0A2.putExtra("wallpaper_color_file", solidColorWallpaperPreview.A0C[solidColorWallpaperPreview.A09.getCurrentItem()]);
            A0A2.putExtra("wallpaper_doodle_overlay", solidColorWallpaperPreview.A08.isChecked());
            AnonymousClass3MY.A13(A0A2, r6, "chat_jid");
            solidColorWallpaperPreview.setResult(-1, A0A2);
            solidColorWallpaperPreview.finish();
        } else if (this instanceof GalleryWallpaperPreview) {
            this.A04 = true;
            this.A05.CGF(new C146527Pl(this, r6, 31));
        } else {
            this.A04 = true;
            Intent A0A3 = C17880vN.A0A();
            AnonymousClass3MY.A13(A0A3, r6, "chat_jid");
            A0A3.putExtra("is_default", true);
            C72453Mb.A16(this, A0A3);
        }
    }

    public void C5k(int i, int i2) {
        AnonymousClass1BI r0;
        if (i == 100) {
            if (i2 == 0) {
                r0 = this.A00;
            } else {
                r0 = null;
            }
            A4c(r0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131898422);
        Button button = (Button) C110885hR.A0A(this, 2131435235);
        this.A00 = button;
        C89974dK.A00(button, this, 24);
    }

    public void onDestroy() {
        int i;
        int i2;
        super.onDestroy();
        AnonymousClass4RE r4 = this.A03;
        AnonymousClass1BI r6 = this.A00;
        if (this instanceof DownloadableWallpaperPreviewActivity) {
            i = 1;
            if (!getIntent().getBooleanExtra("IS_BRIGHT_KEY", true)) {
                i = 2;
            }
        } else if (this instanceof SolidColorWallpaperPreview) {
            i = 3;
        } else if (this instanceof GalleryWallpaperPreview) {
            i = 4;
        } else {
            i = 5;
        }
        boolean z = this.A04;
        if (C18020vd.A05(C18040vf.A02, r4.A01, 8320)) {
            C81773zm r2 = new C81773zm();
            if (r6 == null) {
                i2 = 3;
            } else {
                i2 = 1;
                if (AnonymousClass3MW.A0f(r6) != null) {
                    i2 = 2;
                }
            }
            r2.A01 = Integer.valueOf(i2);
            r2.A02 = Integer.valueOf(i);
            r2.A00 = Boolean.valueOf(z);
            r4.A02.CC7(r2);
        }
    }
}
