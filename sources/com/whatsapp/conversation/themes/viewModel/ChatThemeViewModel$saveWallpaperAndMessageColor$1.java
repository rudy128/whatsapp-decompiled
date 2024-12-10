package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4D5;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import X.C72463Mc;
import android.content.Context;
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$saveWallpaperAndMessageColor$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$saveWallpaperAndMessageColor$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $dimLevel;
    public final /* synthetic */ AnonymousClass4D5 $shouldOverrideCustomisations;
    public final /* synthetic */ Uri $uri;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$saveWallpaperAndMessageColor$1(Context context, Uri uri, AnonymousClass4D5 r4, ChatThemeViewModel chatThemeViewModel, C30391dr r6, int i) {
        super(2, r6);
        this.$shouldOverrideCustomisations = r4;
        this.this$0 = chatThemeViewModel;
        this.$uri = uri;
        this.$context = context;
        this.$dimLevel = i;
    }

    public final C30391dr create(Object obj, C30391dr r9) {
        AnonymousClass4D5 r3 = this.$shouldOverrideCustomisations;
        ChatThemeViewModel chatThemeViewModel = this.this$0;
        return new ChatThemeViewModel$saveWallpaperAndMessageColor$1(this.$context, this.$uri, r3, chatThemeViewModel, r9, this.$dimLevel);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.$shouldOverrideCustomisations == AnonymousClass4D5.WALLPAPER) {
                ChatThemeViewModel chatThemeViewModel = this.this$0;
                ChatThemeViewModel.A05(this.$context, this.$uri, chatThemeViewModel, this.$dimLevel);
            }
            ChatThemeViewModel chatThemeViewModel2 = this.this$0;
            AnonymousClass3MW.A1X(chatThemeViewModel2.A0Y, new ChatThemeViewModel$saveSelectedMessageColor$1(chatThemeViewModel2, (C30391dr) null), C41561wd.A00(chatThemeViewModel2));
            C72463Mc.A1B(this.this$0.A0W);
            this.this$0.A04 = true;
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$saveWallpaperAndMessageColor$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
