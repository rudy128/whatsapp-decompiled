package X;

import com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.voicetranscription.scheduler.TranscriptionMLProcessor", f = "TranscriptionMLProcessor.kt", i = {0, 0, 0, 0}, l = {264}, m = "doTranscription", n = {"logger", "decodedFile", "requestLocale", "durationWrittenInSeconds"}, s = {"L$0", "L$1", "L$2", "D$0"})
/* renamed from: X.Ddm  reason: case insensitive filesystem */
public final class C27431Ddm extends C30421du {
    public double D$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TranscriptionMLProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27431Ddm(TranscriptionMLProcessor transcriptionMLProcessor, C30391dr r2) {
        super(r2);
        this.this$0 = transcriptionMLProcessor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return TranscriptionMLProcessor.A00((C24027BuE) null, (CXW) null, this.this$0, this);
    }
}
