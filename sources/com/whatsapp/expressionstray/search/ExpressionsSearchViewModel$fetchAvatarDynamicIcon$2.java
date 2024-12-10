package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass60f;
import X.AnonymousClass6TM;
import X.AnonymousClass71H;
import X.C108975cc;
import X.C1176160g;
import X.C17960vV;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2", f = "ExpressionsSearchViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(ExpressionsSearchViewModel expressionsSearchViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = expressionsSearchViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsSearchViewModel$fetchAvatarDynamicIcon$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object r5;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (C108975cc.A1I(this.this$0.A0E)) {
                AnonymousClass71H r2 = this.this$0.A0D;
                C17960vV.A00();
                Bitmap A00 = AnonymousClass71H.A00(r2, AnonymousClass71H.A01(r2, "meta-avatar-tab-icon", false), "meta-avatar-tab-icon");
                if (A00 != null) {
                    ExpressionsSearchViewModel expressionsSearchViewModel = this.this$0;
                    expressionsSearchViewModel.A02 = A00;
                    AnonymousClass1DT r4 = expressionsSearchViewModel.A08;
                    AnonymousClass6TM r3 = (AnonymousClass6TM) r4.A06();
                    if (r3 instanceof C1176160g) {
                        C1176160g r32 = (C1176160g) r3;
                        r5 = new C1176160g(A00, r32.A02, r32.A03, r32.A00, r32.A05, r32.A04);
                    } else if (r3 instanceof AnonymousClass60f) {
                        AnonymousClass60f r33 = (AnonymousClass60f) r3;
                        r5 = new AnonymousClass60f(A00, r33.A01, r33.A02, r33.A03);
                    }
                    r4.A0E(r5);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
