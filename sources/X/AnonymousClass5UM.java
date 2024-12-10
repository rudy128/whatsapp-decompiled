package X;

import com.whatsapp.settings.chat.theme.preview.ThemesThemePreviewActivity;

/* renamed from: X.5UM  reason: invalid class name */
public final class AnonymousClass5UM extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ThemesThemePreviewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UM(ThemesThemePreviewActivity themesThemePreviewActivity) {
        super(1);
        this.this$0 = themesThemePreviewActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        ThemesThemePreviewActivity.A0Q(this.this$0, A0M);
        ThemesThemePreviewActivity themesThemePreviewActivity = this.this$0;
        themesThemePreviewActivity.A0D = true;
        C74393Zu A0j = C72463Mc.A0j(themesThemePreviewActivity);
        if (A0j != null) {
            ThemesThemePreviewActivity themesThemePreviewActivity2 = this.this$0;
            themesThemePreviewActivity2.A4d().setValue(100.0f - ((float) A0j.A0I(A0M)));
            if (!themesThemePreviewActivity2.A06) {
                themesThemePreviewActivity2.A03 = (AnonymousClass4VO) A0j.A0B.get(C74393Zu.A00(A0j, A0M, A0M));
            }
        }
        return C27621Wu.A00;
    }
}
