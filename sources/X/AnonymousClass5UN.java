package X;

import android.graphics.drawable.Drawable;

/* renamed from: X.5UN  reason: invalid class name */
public final class AnonymousClass5UN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C74393Zu $adapter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UN(C74393Zu r2) {
        super(1);
        this.$adapter = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4SC r5 = (AnonymousClass4SC) obj;
        if (r5 != null) {
            C74393Zu r3 = this.$adapter;
            r3.A03 = r5;
            Drawable drawable = r5.A00;
            if (drawable != null) {
                for (AnonymousClass3Pc wallpaper$app_product_settings_settings : r3.A04) {
                    wallpaper$app_product_settings_settings.setWallpaper$app_product_settings_settings(drawable);
                }
            }
            r3.A04();
        }
        return C27621Wu.A00;
    }
}
