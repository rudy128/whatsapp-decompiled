package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.BotPrewarmer$getDefaultBotForInvoke$1$1", f = "BotPrewarmer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BotPrewarmer$getDefaultBotForInvoke$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $bot;
    public final /* synthetic */ C22821Di $callback;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BotPrewarmer$getDefaultBotForInvoke$1$1(AnonymousClass1E7 r2, C30391dr r3, C22821Di r4) {
        super(2, r3);
        this.$callback = r4;
        this.$bot = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new BotPrewarmer$getDefaultBotForInvoke$1$1(this.$bot, r5, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$callback.invoke(this.$bot);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BotPrewarmer$getDefaultBotForInvoke$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
