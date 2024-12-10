package X;

import com.whatsapp.bot.botmemory.data.MemoryRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.data.MemoryRepository", f = "MemoryRepository.kt", i = {0, 1, 1}, l = {41, 70}, m = "deleteAllMemories-IoAF18A", n = {"this", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$0", "L$1"})
/* renamed from: X.DdF  reason: case insensitive filesystem */
public final class C27398DdF extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemoryRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27398DdF(MemoryRepository memoryRepository, C30391dr r2) {
        super(r2);
        this.this$0 = memoryRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A01(this));
    }
}
