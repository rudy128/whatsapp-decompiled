package X;

import android.os.Bundle;
import android.view.ViewGroup;
import com.whatsapp.settings.chat.theme.preview.ThemesGalleryWallpaperPreviewActivity;
import com.whatsapp.settings.chat.wallpaper.DefaultWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPickerActivity;

/* renamed from: X.47Q  reason: invalid class name */
public abstract class AnonymousClass47Q extends C75183e8 {
    public AnonymousClass1BI A00 = null;
    public boolean A01 = false;

    public static void A0d(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass47H r3) {
        r3.A04 = (AnonymousClass1M9) r2.A2f.get();
        r3.A09 = C000200d.A00(r2.ABX);
        r3.A0A = C000200d.A00(r2.A2o);
        r3.A03 = (C84314Ja) r1.A0d.get();
        r3.A05 = (C24921Me) r2.ABX.get();
        r3.A07 = (AnonymousClass118) r2.ABY.get();
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this instanceof DownloadableWallpaperPickerActivity) {
            i = 2131624047;
        } else if (this instanceof AnonymousClass47N) {
            AnonymousClass47N r1 = (AnonymousClass47N) this;
            if (r1 instanceof GalleryWallpaperPreview) {
                i = 2131625440;
            } else if (r1 instanceof DefaultWallpaperPreview) {
                i = 2131627542;
            } else {
                i = 2131627543;
            }
        } else {
            AnonymousClass47H r12 = (AnonymousClass47H) this;
            if (r12 instanceof ThemesGalleryWallpaperPreviewActivity) {
                i = 2131627190;
            } else {
                boolean A1Y = C72463Mc.A1Y(r12.A0B);
                i = 2131896850;
                if (!A1Y) {
                    i = 2131627192;
                }
            }
        }
        setContentView(i);
        AnonymousClass1ZO.A04((ViewGroup) C110885hR.A0A(this, 2131429504), new C91264fP(this, 13));
        AnonymousClass1ZO.A03(this);
        C28281Zt.A06(this, AnonymousClass4Z9.A00(this, 2130971093));
        this.A01 = AnonymousClass3MY.A1a(getIntent(), "is_using_global_wallpaper");
        this.A00 = C88594aB.A03(this);
        AnonymousClass3MY.A0K(this, AnonymousClass3Ma.A0F(this)).A0W(true);
        C72453Mb.A1B(findViewById(2131435209));
    }
}
