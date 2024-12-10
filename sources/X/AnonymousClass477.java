package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.settings.chat.theme.preview.ThemesSolidColorWallpaperPreview;
import java.util.Map;

/* renamed from: X.477  reason: invalid class name */
public final class AnonymousClass477 extends C74383Zt {
    public boolean A00;
    public final Map A01 = C17880vN.A11();
    public final /* synthetic */ ThemesSolidColorWallpaperPreview A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass477(Context context, ThemesSolidColorWallpaperPreview themesSolidColorWallpaperPreview) {
        super(context, themesSolidColorWallpaperPreview.A4k());
        C18070vi.A0d(context, 2);
        this.A02 = themesSolidColorWallpaperPreview;
    }

    public int A0E() {
        int[] iArr = this.A02.A03;
        if (iArr != null) {
            return iArr.length;
        }
        C18070vi.A11("colors");
        throw null;
    }

    public boolean A0H(View view, Object obj) {
        C18070vi.A0h(view, obj);
        return AnonymousClass000.A1Z(view, obj);
    }
}
