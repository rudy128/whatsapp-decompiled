package androidx.compose.material3;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17730v8;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.SurfaceKt$Surface$1$2", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SurfaceKt$Surface$1$2 extends C30431dv implements AnonymousClass1OS {
    public int label;

    public SurfaceKt$Surface$1$2(C30391dr r2) {
        super(2, r2);
    }

    /* renamed from: A00 */
    public final Object invoke(C17730v8 r3, C30391dr r4) {
        return ((SurfaceKt$Surface$1$2) create(r3, r4)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        return new SurfaceKt$Surface$1$2(r3);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
