package com.whatsapp.calling.banner.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1VE;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18020vd;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import X.C84674Kk;
import android.content.SharedPreferences;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel$onReturnToCallVisible$1", f = "MinimizedCallBannerViewModel.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
public final class MinimizedCallBannerViewModel$onReturnToCallVisible$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MinimizedCallBannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MinimizedCallBannerViewModel$onReturnToCallVisible$1(MinimizedCallBannerViewModel minimizedCallBannerViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = minimizedCallBannerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MinimizedCallBannerViewModel$onReturnToCallVisible$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MinimizedCallBannerViewModel$onReturnToCallVisible$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 3000) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (AnonymousClass000.A0M(this.this$0.A08.getValue()) == 0) {
            AnonymousClass1VE r4 = ((C84674Kk) ((MinimizedCallBannerUseCase) this.this$0.A04.get()).A0B.get()).A00;
            if (!r4.A09()) {
                boolean A05 = C18020vd.A05(C18040vf.A02, r4.A01, 12289);
                SharedPreferences.Editor putBoolean = AnonymousClass3MZ.A08(r4).putBoolean("hide_return_to_call_text_for_call", true);
                if (A05) {
                    putBoolean.apply();
                } else {
                    putBoolean.commit();
                }
            }
        }
        AnonymousClass3MY.A1Y(this.this$0.A09, false);
        return C27621Wu.A00;
    }
}
