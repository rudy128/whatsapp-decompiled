package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C107065Yg;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C92334h8;
import android.content.Context;
import android.view.View;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$doWithFlmConsentCheck$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {901}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$doWithFlmConsentCheck$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C107065Yg $callback;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ View.OnClickListener $onRetry;
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$doWithFlmConsentCheck$1(Context context, View.OnClickListener onClickListener, C107065Yg r4, BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r6) {
        super(2, r6);
        this.this$0 = baseArEffectsViewModel;
        this.$context = context;
        this.$callback = r4;
        this.$onRetry = onClickListener;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        BaseArEffectsViewModel baseArEffectsViewModel = this.this$0;
        return new BaseArEffectsViewModel$doWithFlmConsentCheck$1(this.$context, this.$onRetry, this.$callback, baseArEffectsViewModel, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Context context = this.$context;
            C92334h8 r0 = new C92334h8(this.$onRetry, this.$callback, this.this$0);
            this.label = 1;
            if (((ArEffectsFlmConsentManager) this.this$0.A04.get()).A00(context, r0, this) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BaseArEffectsViewModel$doWithFlmConsentCheck$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
