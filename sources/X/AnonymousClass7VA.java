package X;

import com.whatsapp.ml.v2.postprocessing.PostProcessingManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.postprocessing.PostProcessingManager", f = "PostProcessingManager.kt", i = {0, 0, 0, 0, 0}, l = {52}, m = "process", n = {"mlQplLogger", "model", "targetFilePath", "tempFile", "step"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5"})
/* renamed from: X.7VA  reason: invalid class name */
public final class AnonymousClass7VA extends C30421du {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PostProcessingManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VA(PostProcessingManager postProcessingManager, C30391dr r2) {
        super(r2);
        this.this$0 = postProcessingManager;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((AnonymousClass8AS) null, (AnonymousClass8Ak) null, this);
    }
}
