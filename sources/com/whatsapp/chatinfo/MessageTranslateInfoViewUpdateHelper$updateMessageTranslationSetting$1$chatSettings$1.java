package com.whatsapp.chatinfo;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4OR;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.chatinfo.MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1", f = "MessageTranslateInfoViewUpdateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4OR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1(AnonymousClass4OR r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MessageTranslateInfoViewUpdateHelper$updateMessageTranslationSetting$1$chatSettings$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4OR r0 = this.this$0;
            return r0.A04.A0a(r0.A03);
        }
        throw AnonymousClass000.A0l();
    }
}
