package X;

import com.whatsapp.bot.botmemory.data.MemoryRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.data.MemoryRepository", f = "MemoryRepository.kt", i = {0, 1, 1, 1, 2, 2}, l = {29, 70, 80}, m = "getMemories-gIAlu-s", n = {"this", "this", "networkResult", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* renamed from: X.Ddg  reason: case insensitive filesystem */
public final class C27425Ddg extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemoryRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27425Ddg(MemoryRepository memoryRepository, C30391dr r2) {
        super(r2);
        this.this$0 = memoryRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A02(this, false));
    }
}
