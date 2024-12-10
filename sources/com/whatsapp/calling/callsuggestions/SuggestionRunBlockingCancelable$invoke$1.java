package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.SuggestionRunBlockingCancelable$invoke$1", f = "SuggestionRunBlockingCancelable.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
public final class SuggestionRunBlockingCancelable$invoke$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $block;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuggestionRunBlockingCancelable$invoke$1(C30391dr r2, AnonymousClass1OS r3) {
        super(2, r2);
        this.$block = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SuggestionRunBlockingCancelable$invoke$1(r4, this.$block);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SuggestionRunBlockingCancelable$invoke$1((C30391dr) obj2, this.$block).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OS r2 = this.$block;
            this.label = 1;
            obj = AnonymousClass4Z5.A00(this, r2, 5000);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
