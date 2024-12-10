package com.whatsapp.conversation.themes.viewModel;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass4RE;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.themes.viewModel.ChatThemeViewModel$initLoggingIfNeeded$1", f = "ChatThemeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChatThemeViewModel$initLoggingIfNeeded$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public int label;
    public final /* synthetic */ ChatThemeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThemeViewModel$initLoggingIfNeeded$1(Context context, ChatThemeViewModel chatThemeViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = chatThemeViewModel;
        this.$context = context;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ChatThemeViewModel$initLoggingIfNeeded$1(this.$context, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ChatThemeViewModel chatThemeViewModel = this.this$0;
            if (chatThemeViewModel.A00 == null) {
                ChatThemeViewModel chatThemeViewModel2 = this.this$0;
                AnonymousClass1BI r2 = chatThemeViewModel2.A0Q;
                chatThemeViewModel.A00 = ((AnonymousClass4RE) chatThemeViewModel.A0X.get()).A00(r2, chatThemeViewModel2.A0T.A0E(this.$context, r2));
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChatThemeViewModel$initLoggingIfNeeded$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
