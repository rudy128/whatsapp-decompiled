package X;

import com.whatsapp.dobverification.DosaRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.dobverification.DosaRepository", f = "DosaRepository.kt", i = {0}, l = {198, 199}, m = "startRemediation", n = {"this"}, s = {"L$0"})
/* renamed from: X.3FG  reason: invalid class name */
public final class AnonymousClass3FG extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DosaRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3FG(DosaRepository dosaRepository, C30391dr r2) {
        super(r2);
        this.this$0 = dosaRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.COA(this);
    }
}
