package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.settings.chat.wallpaper.WallpaperImagePreview;
import com.whatsapp.settings.chat.wallpaper.WallpaperMockChatView;

/* renamed from: X.3Pc  reason: invalid class name */
public final class AnonymousClass3Pc extends FrameLayout implements AnonymousClass009 {
    public Resources A00;
    public WallpaperImagePreview A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final C18100vl A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Pc(Context context, String str, String str2) {
        super(context);
        C18070vi.A0d(str2, 3);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = this.A00;
        View.inflate(context, 2131627189, this);
        this.A01 = (WallpaperImagePreview) C18070vi.A05(this, 2131436108);
        ((WallpaperMockChatView) C18070vi.A05(this, 2131436109)).setMessages(str, str2, (C108875cR) null);
        this.A04 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103725Lk(context));
    }

    public final void setWallpaper$app_product_settings_settings(Drawable drawable) {
        C18070vi.A0d(drawable, 0);
        WallpaperImagePreview wallpaperImagePreview = this.A01;
        if (wallpaperImagePreview == null) {
            C18070vi.A11("bgView");
            throw null;
        } else {
            wallpaperImagePreview.setImageDrawable(drawable);
        }
    }

    private final int getDimColorBase() {
        return C72453Mb.A0I(this.A04);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setDimLevel(int i) {
        WallpaperImagePreview wallpaperImagePreview = this.A01;
        if (wallpaperImagePreview == null) {
            C18070vi.A11("bgView");
            throw null;
        } else {
            wallpaperImagePreview.setColorFilter(C72473Md.A01(i, C72453Mb.A0I(this.A04)));
        }
    }
}
