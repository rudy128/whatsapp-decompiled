package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.triggers.TimeoutFallbackTrigger$getNativeTimeout$$inlined$map$1$2", f = "TimeoutFallbackTrigger.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
/* renamed from: X.Dcz  reason: case insensitive filesystem */
public final class C27386Dcz extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ C27189DXz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27386Dcz(C27189DXz dXz, C30391dr r2) {
        super(r2);
        this.this$0 = dXz;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C27189DXz.A00(this.this$0, this);
    }
}
