package X;

import com.whatsapp.async.AsyncFutureCoroutineKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.async.AsyncFutureCoroutineKt", f = "AsyncFutureCoroutine.kt", i = {0, 0}, l = {19}, m = "await", n = {"$this$await", "callback"}, s = {"L$0", "L$1"})
/* renamed from: X.7Te  reason: invalid class name and case insensitive filesystem */
public final class C147447Te extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public C147447Te(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AsyncFutureCoroutineKt.A00((C21132Af0) null, this);
    }
}
