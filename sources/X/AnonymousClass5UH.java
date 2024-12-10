package X;

import android.content.Context;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel;
import com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onWallpaperSelected$1;
import com.whatsapp.settings.chat.theme.fragment.ThemesWallpaperCategoryFragment;

/* renamed from: X.5UH  reason: invalid class name */
public final class AnonymousClass5UH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ThemesWallpaperCategoryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UH(ThemesWallpaperCategoryFragment themesWallpaperCategoryFragment) {
        super(1);
        this.this$0 = themesWallpaperCategoryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        ThemesWallpaperCategoryFragment themesWallpaperCategoryFragment = this.this$0;
        ChatThemeViewModel chatThemeViewModel = themesWallpaperCategoryFragment.A01;
        if (chatThemeViewModel != null) {
            Context A14 = themesWallpaperCategoryFragment.A14();
            AnonymousClass3MW.A1X(chatThemeViewModel.A0Y, new ChatThemeViewModel$onWallpaperSelected$1(A14, chatThemeViewModel, (C30391dr) null, A0M), C41561wd.A00(chatThemeViewModel));
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }
}
