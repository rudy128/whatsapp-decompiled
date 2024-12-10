package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass0CU;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Recomposer$join$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;

    public Recomposer$join$2(C30391dr r2) {
        super(2, r2);
    }

    /* renamed from: A00 */
    public final Object invoke(AnonymousClass0CU r3, C30391dr r4) {
        return ((Recomposer$join$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        Recomposer$join$2 recomposer$join$2 = new Recomposer$join$2(r3);
        recomposer$join$2.L$0 = obj;
        return recomposer$join$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Boolean.valueOf(AnonymousClass000.A1Z(this.L$0, AnonymousClass0CU.ShutDown));
        }
        throw AnonymousClass000.A0l();
    }
}
