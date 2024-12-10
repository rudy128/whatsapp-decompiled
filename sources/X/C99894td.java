package X;

import com.whatsapp.bot.botmemory.data.MemoryRemoteDataSource;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.data.MemoryRemoteDataSource", f = "MemoryRemoteDataSource.kt", i = {}, l = {109}, m = "deleteMemories-gIAlu-s", n = {}, s = {})
/* renamed from: X.4td  reason: invalid class name and case insensitive filesystem */
public final class C99894td extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MemoryRemoteDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99894td(MemoryRemoteDataSource memoryRemoteDataSource, C30391dr r2) {
        super(r2);
        this.this$0 = memoryRemoteDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A00 = this.this$0.A00((List) null, this);
        if (A00 != C31751g4.COROUTINE_SUSPENDED) {
            return new C30671eK(A00);
        }
        return A00;
    }
}
