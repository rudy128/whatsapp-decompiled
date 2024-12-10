package com.whatsapp.compose.core;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3U6;
import X.AnonymousClass4XD;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.compose.core.WaNavigationViewModel$navigation$1", f = "WaNavigationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class WaNavigationViewModel$navigation$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass3U6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaNavigationViewModel$navigation$1(AnonymousClass3U6 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new WaNavigationViewModel$navigation$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new WaNavigationViewModel$navigation$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass4XD r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3U6 r1 = this.this$0;
            if (r1 instanceof UsernameNavigationViewModel) {
                r0 = ((UsernameNavigationViewModel) r1).A02;
            } else {
                r0 = r1.A00;
            }
            r0.A01();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
