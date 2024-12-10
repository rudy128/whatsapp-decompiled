package com.whatsapp.ptt.language.ui;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3U1;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99384sj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ptt.language.ui.TranscriptionChooseLanguageViewModel$observeIntents$1", f = "TranscriptionChooseLanguageViewModel.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
public final class TranscriptionChooseLanguageViewModel$observeIntents$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3U1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranscriptionChooseLanguageViewModel$observeIntents$1(AnonymousClass3U1 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranscriptionChooseLanguageViewModel$observeIntents$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranscriptionChooseLanguageViewModel$observeIntents$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass3U1 r3 = this.this$0;
            AnonymousClass1G3 r2 = r3.A0C;
            C99384sj r0 = new C99384sj(r3, 7);
            this.label = 1;
            if (r2.BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }
}
