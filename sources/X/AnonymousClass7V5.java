package X;

import com.whatsapp.snapl.cron.SnaplWorker;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.snapl.cron.SnaplWorker", f = "SnaplWorker.kt", i = {0, 0, 0, 1, 1, 1}, l = {61, 74, 75}, m = "upload", n = {"this", "payloadBatch", "ids", "this", "payloadBatch", "halfPayloadSize"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "I$0"})
/* renamed from: X.7V5  reason: invalid class name */
public final class AnonymousClass7V5 extends C30421du {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SnaplWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V5(SnaplWorker snaplWorker, C30391dr r2) {
        super(r2);
        this.this$0 = snaplWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return SnaplWorker.A00(this.this$0, (List) null, this);
    }
}
