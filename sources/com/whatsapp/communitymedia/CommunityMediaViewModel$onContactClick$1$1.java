package com.whatsapp.communitymedia;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C108485bm;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C73373Vg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.communitymedia.CommunityMediaViewModel$onContactClick$1$1", f = "CommunityMediaViewModel.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMediaViewModel$onContactClick$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $it;
    public int label;
    public final /* synthetic */ C73373Vg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMediaViewModel$onContactClick$1$1(C73373Vg r2, AnonymousClass1BI r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$it = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommunityMediaViewModel$onContactClick$1$1(this.this$0, this.$it, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108485bm r1 = this.this$0.A0b;
            AnonymousClass1BI r0 = this.$it;
            C18070vi.A0b(r0);
            this.label = 1;
            if (r1.CHH(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMediaViewModel$onContactClick$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
