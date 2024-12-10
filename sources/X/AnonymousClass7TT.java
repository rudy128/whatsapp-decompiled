package X;

import com.whatsapp.ml.v2.postprocessing.PersistModelInfoStep;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.postprocessing.PersistModelInfoStep", f = "PersistModelInfoStep.kt", i = {}, l = {18}, m = "process", n = {}, s = {})
/* renamed from: X.7TT  reason: invalid class name */
public final class AnonymousClass7TT extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ PersistModelInfoStep this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TT(PersistModelInfoStep persistModelInfoStep, C30391dr r2) {
        super(r2);
        this.this$0 = persistModelInfoStep;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.CCc((AnonymousClass708) null, (File) null, (String) null, this);
    }
}
