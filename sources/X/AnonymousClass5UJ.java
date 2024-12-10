package X;

import com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity;

/* renamed from: X.5UJ  reason: invalid class name */
public final class AnonymousClass5UJ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ThemesDownloadablePreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UJ(ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity) {
        super(1);
        this.this$0 = themesDownloadablePreviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        ThemesDownloadablePreviewActivity themesDownloadablePreviewActivity = this.this$0;
        themesDownloadablePreviewActivity.A0D = true;
        C74383Zt r1 = (C74383Zt) themesDownloadablePreviewActivity.A4l().getAdapter();
        if (r1 != null) {
            this.this$0.A4d().setValue(100.0f - ((float) r1.A0I(A0M)));
        }
        return C27621Wu.A00;
    }
}
