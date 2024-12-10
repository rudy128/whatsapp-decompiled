package X;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", i = {}, l = {58}, m = "joinAll", n = {}, s = {})
/* renamed from: X.AnU  reason: case insensitive filesystem */
public final class C21639AnU extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C21639AnU(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C197009w0.A01((Collection) null, this);
    }
}
