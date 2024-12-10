package androidx.compose.ui.platform;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import android.view.Choreographer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends C30431dv implements AnonymousClass1OS {
    public int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1(C30391dr r2) {
        super(2, r2);
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r3) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(r3);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return Choreographer.getInstance();
        }
        throw AnonymousClass000.A0l();
    }
}
