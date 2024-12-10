package X;

import com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor", f = "TranscriptionMLProcessor.kt", i = {0, 0, 0, 0}, l = {127}, m = "process", n = {"this", "message", "transcriptionId", "logger"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.Ddn  reason: case insensitive filesystem */
public final class C27432Ddn extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TranscriptionMLProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27432Ddn(TranscriptionMLProcessor transcriptionMLProcessor, C30391dr r2) {
        super(r2);
        this.this$0 = transcriptionMLProcessor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.CCX((C24027BuE) null, this);
    }
}
