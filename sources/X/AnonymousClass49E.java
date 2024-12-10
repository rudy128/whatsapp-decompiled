package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.whatsapp.settings.chat.wallpaper.WallPaperView;

/* renamed from: X.49E  reason: invalid class name */
public final class AnonymousClass49E extends A34 {
    public final Context A00;
    public final Resources A01;
    public final C18030ve A02;
    public final WallPaperView A03;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return C88594aB.A02(this.A00, this.A01, this.A02);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Drawable drawable = (Drawable) obj;
        WallPaperView wallPaperView = this.A03;
        if (wallPaperView != null) {
            wallPaperView.setDrawable(drawable);
        }
    }

    public AnonymousClass49E(Context context, Resources resources, C18030ve r3, WallPaperView wallPaperView) {
        this.A00 = context;
        this.A01 = resources;
        this.A03 = wallPaperView;
        this.A02 = r3;
    }
}
