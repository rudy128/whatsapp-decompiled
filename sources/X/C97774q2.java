package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity;
import com.whatsapp.settings.chat.wallpaper.Hilt_WallpaperDownloadFailedDialogFragment;
import com.whatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4q2  reason: invalid class name and case insensitive filesystem */
public class C97774q2 implements C107655aN {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C97774q2(Object obj, int i, int i2, Object obj2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }

    public final void C6X(C85264Ms r11) {
        if (this.A00 != 0) {
            AnonymousClass47Z r1 = (AnonymousClass47Z) this.A02;
            AnonymousClass47S r4 = (AnonymousClass47S) this.A03;
            int i = this.A01;
            Bitmap bitmap = r11.A01;
            if (bitmap != null) {
                r4.setWallpaper(bitmap);
            }
            int i2 = r11.A00;
            if (i2 == 2) {
                DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = r1.A01.A01;
                downloadableWallpaperPreviewActivity.A08.add(Integer.valueOf(i));
                if (downloadableWallpaperPreviewActivity.A00.getCurrentItem() == i) {
                    downloadableWallpaperPreviewActivity.A00.setEnabled(true);
                }
                r4.A02.setVisibility(8);
            } else if (i2 == 1) {
                r4.A00();
            } else {
                C85314Mx r12 = r1.A01;
                if (!r12.A00) {
                    r12.A00 = true;
                    DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity2 = r12.A01;
                    Hilt_WallpaperDownloadFailedDialogFragment hilt_WallpaperDownloadFailedDialogFragment = new Hilt_WallpaperDownloadFailedDialogFragment();
                    Bundle A0D = C17880vN.A0D();
                    A0D.putInt("ERROR_STATE_KEY", i2);
                    hilt_WallpaperDownloadFailedDialogFragment.A1R(A0D);
                    downloadableWallpaperPreviewActivity2.CMl(hilt_WallpaperDownloadFailedDialogFragment);
                }
                r4.A02.setVisibility(0);
                r4.A03.setVisibility(8);
                r4.A01.setVisibility(0);
            }
        } else {
            AnonymousClass478 r8 = (AnonymousClass478) this.A02;
            int i3 = this.A01;
            AnonymousClass47S r5 = (AnonymousClass47S) this.A03;
            C18070vi.A0d(r11, 3);
            Bitmap bitmap2 = r11.A01;
            if (bitmap2 != null) {
                r5.setWallpaper(bitmap2);
                ChatThemeViewModel chatThemeViewModel = r8.A01;
                String path = ((Uri) r8.A06.get(i3)).getPath();
                if (path == null) {
                    path = "";
                }
                chatThemeViewModel.A0K.A0F(path, bitmap2);
            }
            int i4 = r11.A00;
            if (i4 == 1) {
                r8.A00[i3] = true;
                r5.postDelayed(new C70863Cu(r8, i3, 42, r5), TimeUnit.SECONDS.toMillis(1) / 2);
            } else if (i4 != 2) {
                AnonymousClass4QK r13 = r8.A02;
                if (!r13.A00) {
                    r13.A00 = true;
                    ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = r13.A01;
                    Hilt_WallpaperDownloadFailedDialogFragment hilt_WallpaperDownloadFailedDialogFragment2 = new Hilt_WallpaperDownloadFailedDialogFragment();
                    Bundle A0D2 = C17880vN.A0D();
                    A0D2.putInt("ERROR_STATE_KEY", i4);
                    hilt_WallpaperDownloadFailedDialogFragment2.A1R(A0D2);
                    themesDownloadablePreviewActivity.CMl(hilt_WallpaperDownloadFailedDialogFragment2);
                }
                r5.A02.setVisibility(0);
                r5.A03.setVisibility(8);
                r5.A01.setVisibility(0);
            } else {
                r8.A02.A00(i3);
                boolean[] zArr = r8.A00;
                if (zArr[i3]) {
                    zArr[i3] = false;
                }
                r5.A02.setVisibility(8);
                if (bitmap2 != null) {
                    r5.setWallpaper(bitmap2);
                }
            }
        }
    }
}
