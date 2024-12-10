package X;

import android.widget.CheckBox;
import com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview;

/* renamed from: X.5Lj  reason: invalid class name and case insensitive filesystem */
public final class C103715Lj extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ThemesSolidColorWallpaperPreview this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C103715Lj(ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview) {
        super(0);
        this.this$0 = themesSolidColorWallpaperPreview;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview = this.this$0;
        themesSolidColorWallpaperPreview.A00 = (CheckBox) AnonymousClass3MY.A0C(themesSolidColorWallpaperPreview, 2131429196);
        CheckBox checkBox = this.this$0.A00;
        if (checkBox != null) {
            checkBox.setVisibility(0);
            ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview2 = this.this$0;
            AnonymousClass477 r2 = new AnonymousClass477(themesSolidColorWallpaperPreview2, themesSolidColorWallpaperPreview2);
            CheckBox checkBox2 = this.this$0.A00;
            if (checkBox2 != null) {
                r2.A00 = checkBox2.isChecked();
                CheckBox checkBox3 = this.this$0.A00;
                if (checkBox3 != null) {
                    C90874em.A00(checkBox3, r2, 23);
                    return r2;
                }
            }
        }
        C18070vi.A11("showDoodleCheckbox");
        throw null;
    }
}
