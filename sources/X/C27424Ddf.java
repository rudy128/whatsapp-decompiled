package X;

import com.whatsapp.bot.botmemory.data.MemoryRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.data.MemoryRepository", f = "MemoryRepository.kt", i = {0, 0, 1, 1, 1}, l = {54, 70}, m = "deleteMemories-gIAlu-s", n = {"this", "memoryIds", "this", "memoryIds", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* renamed from: X.Ddf  reason: case insensitive filesystem */
public final class C27424Ddf extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemoryRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27424Ddf(MemoryRepository memoryRepository, C30391dr r2) {
        super(r2);
        this.this$0 = memoryRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C108985cd.A0e(this.this$0.A00((List) null, this));
    }
}
