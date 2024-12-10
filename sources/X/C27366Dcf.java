package X;

import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {22}, m = "toCollection", n = {"destination"}, s = {"L$0"})
/* renamed from: X.Dcf  reason: case insensitive filesystem */
public final class C27366Dcf extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public C27366Dcf(C30391dr r1) {
        super(r1);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C24640CDa.A00((Collection) null, this, (C23421Fz) null);
    }
}
