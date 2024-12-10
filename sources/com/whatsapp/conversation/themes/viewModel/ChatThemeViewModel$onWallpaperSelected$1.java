package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C22971Dz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import X.C72463Mc;
import X.C85274Mt;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$onWallpaperSelected$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$onWallpaperSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$onWallpaperSelected$1(Context context, ChatThemeViewModel chatThemeViewModel, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = chatThemeViewModel;
        this.$context = context;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatThemeViewModel$onWallpaperSelected$1(this.$context, this.this$0, r6, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C85274Mt A02;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ChatThemeViewModel chatThemeViewModel = this.this$0;
            ArrayList A13 = AnonymousClass000.A13();
            if (chatThemeViewModel.A01 == null && (A02 = chatThemeViewModel.A0S.A02()) != null) {
                for (File fromFile : A02.A01) {
                    A13.add(Uri.fromFile(fromFile));
                }
                chatThemeViewModel.A01 = A13;
            }
            ArrayList arrayList = chatThemeViewModel.A01;
            if (arrayList != null) {
                ChatThemeViewModel chatThemeViewModel2 = this.this$0;
                Context context = this.$context;
                int i = this.$position;
                C41731wy r5 = chatThemeViewModel2.A0U;
                AnonymousClass1BI r4 = chatThemeViewModel2.A0Q;
                boolean A1X = AnonymousClass000.A1X(r4);
                Intent A0G = C72463Mc.A0G(context);
                A0G.setClassName(context.getPackageName(), "com.whatsapp.settings.chat.theme.preview.ThemesDownloadablePreviewActivity");
                A0G.putExtra("STARTING_POSITION_KEY", i);
                A0G.putExtra("THUMBNAIL_URIS_KEY", arrayList);
                A0G.putExtra("chat_jid", C22971Dz.A06(r4));
                A0G.putExtra("is_using_global_wallpaper", A1X);
                r5.A0E(AnonymousClass1D6.A01(A0G, AnonymousClass3MW.A0v(20)));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$onWallpaperSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
