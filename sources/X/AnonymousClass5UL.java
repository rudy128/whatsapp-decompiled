package X;

import com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview;

/* renamed from: X.5UL  reason: invalid class name */
public final class AnonymousClass5UL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ThemesSolidColorWallpaperPreview this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UL(ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview) {
        super(1);
        this.this$0 = themesSolidColorWallpaperPreview;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview = this.this$0;
        themesSolidColorWallpaperPreview.A0D = true;
        C74383Zt r1 = (C74383Zt) themesSolidColorWallpaperPreview.A4l().getAdapter();
        if (r1 != null) {
            this.this$0.A4d().setValue(100.0f - ((float) r1.A0I(A0M)));
        }
        return C27621Wu.A00;
    }
}
