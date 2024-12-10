package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;

/* renamed from: X.4q3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C97784q3 implements C107655aN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ C74393Zu A02;
    public final /* synthetic */ AnonymousClass3Pc A03;

    public final void C6X(C85264Ms r8) {
        AnonymousClass3Pc r6 = this.A03;
        C74393Zu r5 = this.A02;
        Uri uri = this.A01;
        int i = this.A00;
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(r8, 4);
        Bitmap bitmap = r8.A01;
        if (bitmap != null) {
            r6.setWallpaper$app_product_settings_settings(new BitmapDrawable(bitmap));
            if (r8.A00 == 2) {
                ChatThemeViewModel chatThemeViewModel = r5.A07;
                String path = uri.getPath();
                if (path == null) {
                    path = "";
                }
                chatThemeViewModel.A0K.A0F(path, bitmap);
                r5.A0D.remove(Integer.valueOf(i));
            }
        }
    }

    public /* synthetic */ C97784q3(Uri uri, C74393Zu r2, AnonymousClass3Pc r3, int i) {
        this.A03 = r3;
        this.A02 = r2;
        this.A01 = uri;
        this.A00 = i;
    }
}
