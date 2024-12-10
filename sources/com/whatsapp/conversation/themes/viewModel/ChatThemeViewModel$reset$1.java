package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass1OS;
import X.AnonymousClass4D5;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$reset$1", f = "ChatThemeViewModel.kt", i = {}, l = {590, 594, 598}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$reset$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass4D5 $customUserThemeSetting;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$reset$1(Context context, AnonymousClass4D5 r3, ChatThemeViewModel chatThemeViewModel, C30391dr r5) {
        super(2, r5);
        this.$customUserThemeSetting = r3;
        this.this$0 = chatThemeViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ChatThemeViewModel$reset$1(this.$context, this.$customUserThemeSetting, this.this$0, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 3
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r2) goto L_0x0046
            if (r0 == r5) goto L_0x0062
            if (r0 != r4) goto L_0x007e
            X.C30691eM.A01(r7)
        L_0x0012:
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r6.this$0
            X.4aW r4 = r0.A0T
            X.1BI r3 = r0.A0Q
            android.content.Context r0 = r6.$context
            if (r3 != 0) goto L_0x002f
            X.4Na r1 = X.AnonymousClass4aW.A0L
        L_0x001e:
            boolean r0 = X.C28281Zt.A0B(r0)
            X.AnonymousClass4aW.A09(r3, r1, r4, r0, r2)
        L_0x0025:
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r1 = r6.this$0
            android.content.Context r0 = r6.$context
            r1.A0T(r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002f:
            r1 = 0
            goto L_0x001e
        L_0x0031:
            X.C30691eM.A01(r7)
            X.4D5 r1 = r6.$customUserThemeSetting
            X.4D5 r0 = X.AnonymousClass4D5.THEME_AND_WALLPAPER
            if (r1 != r0) goto L_0x0049
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r6.this$0
            X.5by r1 = r0.A0L
            X.1BI r0 = r0.A0Q
            r6.label = r2
            r1.CFo(r0)
            goto L_0x0049
        L_0x0046:
            X.C30691eM.A01(r7)
        L_0x0049:
            X.4D5 r1 = r6.$customUserThemeSetting
            X.4D5 r0 = X.AnonymousClass4D5.THEME_AND_WALLPAPER
            if (r1 == r0) goto L_0x0053
            X.4D5 r0 = X.AnonymousClass4D5.THEME
            if (r1 != r0) goto L_0x0065
        L_0x0053:
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r6.this$0
            X.5by r1 = r0.A0L
            X.1BI r0 = r0.A0Q
            r6.label = r5
            java.lang.Object r0 = r1.CFh(r0, r6)
            if (r0 != r3) goto L_0x0065
            return r3
        L_0x0062:
            X.C30691eM.A01(r7)
        L_0x0065:
            X.4D5 r1 = r6.$customUserThemeSetting
            X.4D5 r0 = X.AnonymousClass4D5.THEME_AND_WALLPAPER
            if (r1 == r0) goto L_0x006f
            X.4D5 r0 = X.AnonymousClass4D5.WALLPAPER
            if (r1 != r0) goto L_0x0025
        L_0x006f:
            com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel r0 = r6.this$0
            X.5by r1 = r0.A0L
            X.1BI r0 = r0.A0Q
            r6.label = r4
            java.lang.Object r0 = r1.CFh(r0, r6)
            if (r0 != r3) goto L_0x0012
            return r3
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$reset$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$reset$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
