package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass11P;
import X.AnonymousClass1OS;
import X.AnonymousClass4Z5;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C98494rF;
import android.os.SystemClock;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel$maybeReloadSuggestions$1", f = "CallSuggestionsViewModel.kt", i = {0, 0, 0}, l = {96}, m = "invokeSuspend", n = {"suggestions", "$this$measureTimeUsingUptimeMillis$iv", "start$iv"}, s = {"L$0", "L$1", "J$0"})
public final class CallSuggestionsViewModel$maybeReloadSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ CallSuggestionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallSuggestionsViewModel$maybeReloadSuggestions$1(CallSuggestionsViewModel callSuggestionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callSuggestionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallSuggestionsViewModel$maybeReloadSuggestions$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C98494rF A00;
        CallSuggestionsViewModel callSuggestionsViewModel;
        long uptimeMillis;
        C98494rF r2;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            A00 = C98494rF.A00();
            callSuggestionsViewModel = this.this$0;
            AnonymousClass11P r1 = callSuggestionsViewModel.A05;
            uptimeMillis = SystemClock.uptimeMillis();
            CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1 callSuggestionsViewModel$maybeReloadSuggestions$1$1$1 = new CallSuggestionsViewModel$maybeReloadSuggestions$1$1$1(callSuggestionsViewModel, (C30391dr) null);
            this.L$0 = A00;
            this.L$1 = r1;
            this.L$2 = A00;
            this.L$3 = callSuggestionsViewModel;
            this.J$0 = uptimeMillis;
            this.label = 1;
            obj = AnonymousClass4Z5.A00(this, callSuggestionsViewModel$maybeReloadSuggestions$1$1$1, 5000);
            if (obj == r8) {
                return r8;
            }
            r2 = A00;
        } else if (i == 1) {
            uptimeMillis = this.J$0;
            callSuggestionsViewModel = (CallSuggestionsViewModel) this.L$3;
            A00 = (C98494rF) this.L$2;
            r2 = (C98494rF) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        A00.element = obj;
        callSuggestionsViewModel.A00 = SystemClock.uptimeMillis() - uptimeMillis;
        Object obj2 = r2.element;
        if (obj2 != null) {
            this.this$0.A03.A0E(obj2);
        }
        return C27621Wu.A00;
    }
}
