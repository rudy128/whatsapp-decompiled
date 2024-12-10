package com.whatsapp.communitymedia;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C73373Vg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.communitymedia.CommunityMediaViewModel$refreshName$1", f = "CommunityMediaViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMediaViewModel$refreshName$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C73373Vg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMediaViewModel$refreshName$1(C73373Vg r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CommunityMediaViewModel$refreshName$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CommunityMediaViewModel$refreshName$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C73373Vg r4 = this.this$0;
            AnonymousClass1G4 r3 = r4.A0m;
            do {
                value = r3.getValue();
                AnonymousClass1E7 A0E = r4.A0K.A0E(r4.A0Q);
                if (A0E != null) {
                    str = r4.A0L.A0I(A0E);
                } else {
                    str = null;
                }
            } while (!r3.BFK(value, str));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
