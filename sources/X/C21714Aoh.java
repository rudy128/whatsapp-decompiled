package X;

import com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl", f = "WaAuthenticityInterpreterCallbackImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {89, 103}, m = "idvUploadInternal$app_product_smartcapture_smartcapture", n = {"this", "fileUrisBeforeDeobfuscate", "uploadMediums", "product", "onUploadSuccess", "onUploadFailed", "successMap", "entry", "submissionId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "J$0"})
/* renamed from: X.Aoh  reason: case insensitive filesystem */
public final class C21714Aoh extends C30421du {
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ WaAuthenticityInterpreterCallbackImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21714Aoh(WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl, C30391dr r2) {
        super(r2);
        this.this$0 = waAuthenticityInterpreterCallbackImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A00((String) null, (Map) null, (Map) null, this, (C22821Di) null, (C22821Di) null, 0);
    }
}
