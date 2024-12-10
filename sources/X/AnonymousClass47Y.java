package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import java.util.Map;

/* renamed from: X.47Y  reason: invalid class name */
public class AnonymousClass47Y extends C74373Zs {
    public boolean A00 = false;
    public final Map A01 = C17880vN.A11();
    public final /* synthetic */ SolidColorWallpaperPreview A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass47Y(Context context, SolidColorWallpaperPreview solidColorWallpaperPreview) {
        super(context, (Resources) null);
        this.A02 = solidColorWallpaperPreview;
    }

    public int A0A(Object obj) {
        if (obj instanceof AnonymousClass47S) {
            Object tag = ((View) obj).getTag();
            if (tag instanceof Integer) {
                Map map = this.A01;
                if (!map.containsKey(tag) || Boolean.valueOf(this.A00).equals(map.get(tag))) {
                    return -1;
                }
                return -2;
            }
        }
        return -1;
    }

    public int A0E() {
        return this.A02.A0B.length;
    }

    public boolean A0H(View view, Object obj) {
        return AnonymousClass000.A1Z(view, obj);
    }
}
