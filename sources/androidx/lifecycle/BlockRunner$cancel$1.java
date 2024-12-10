package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import X.C85614Ob;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", i = {}, l = {188}, m = "invokeSuspend", n = {}, s = {})
public final class BlockRunner$cancel$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C85614Ob this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(C85614Ob r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BlockRunner$cancel$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BlockRunner$cancel$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 5000) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C85614Ob r1 = this.this$0;
        if (r1.A02.A00 <= 0) {
            AnonymousClass1OB r0 = r1.A01;
            if (r0 != null) {
                r0.BEM((CancellationException) null);
            }
            this.this$0.A01 = null;
        }
        return C27621Wu.A00;
    }
}
