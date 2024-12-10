package com.whatsapp.communitymedia;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27183DXs;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C73373Vg;
import X.C99614tB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.communitymedia.CommunityMediaViewModel$observePages$1", f = "CommunityMediaViewModel.kt", i = {}, l = {239}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMediaViewModel$observePages$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C73373Vg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMediaViewModel$observePages$1(C73373Vg r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMediaViewModel$observePages$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMediaViewModel$observePages$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C27183DXs A0T = this.this$0.A0T();
            C99614tB A00 = C99614tB.A00(this.this$0, 10);
            this.label = 1;
            if (A0T.BFC(this, A00) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
