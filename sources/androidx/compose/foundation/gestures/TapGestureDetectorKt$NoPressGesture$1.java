package androidx.compose.foundation.gestures;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TapGestureDetectorKt$NoPressGesture$1 extends C30431dv implements C36001nB {
    public int label;

    public TapGestureDetectorKt$NoPressGesture$1(C30391dr r2) {
        super(3, r2);
    }

    public static final Object A00(C30391dr r2) {
        return new TapGestureDetectorKt$NoPressGesture$1(r2).invokeSuspend(C27621Wu.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00((C30391dr) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
