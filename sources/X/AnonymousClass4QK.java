package X;

import android.widget.Button;
import com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity;

/* renamed from: X.4QK  reason: invalid class name */
public final class AnonymousClass4QK {
    public boolean A00;
    public final /* synthetic */ ThemesDownloadablePreviewActivity A01;

    public AnonymousClass4QK(ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity) {
        this.A01 = themesDownloadablePreviewActivity;
    }

    public void A00(int i) {
        ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = this.A01;
        themesDownloadablePreviewActivity.A08.add(Integer.valueOf(i));
        if (themesDownloadablePreviewActivity.A4l().getCurrentItem() == i) {
            Button button = themesDownloadablePreviewActivity.A00;
            if (button != null) {
                button.setEnabled(true);
            } else {
                C18070vi.A11("setButton");
                throw null;
            }
        }
    }
}
