package X;

import com.whatsapp.calling.header.CallHeaderStateHolder;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.header.CallHeaderStateHolder", f = "CallHeaderStateHolder.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6}, l = {266, 267, 268, 269, 270, 271, 272}, m = "startE2EEAnimation", n = {"this", "callId", "$this$startE2EEAnimation_u24lambda_u242", "this", "callId", "$this$startE2EEAnimation_u24lambda_u242", "this", "callId", "$this$startE2EEAnimation_u24lambda_u242", "this", "callId", "$this$startE2EEAnimation_u24lambda_u242", "this", "callId", "$this$startE2EEAnimation_u24lambda_u242", "this", "callId", "$this$startE2EEAnimation_u24lambda_u242", "this", "callId"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* renamed from: X.4v3  reason: invalid class name and case insensitive filesystem */
public final class C100774v3 extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CallHeaderStateHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100774v3(CallHeaderStateHolder callHeaderStateHolder, C30391dr r2) {
        super(r2);
        this.this$0 = callHeaderStateHolder;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return CallHeaderStateHolder.A00(this.this$0, (String) null, this);
    }
}
