package X;

import com.whatsapp.ml.v2.MLModelUtilV2;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.ml.v2.MLModelUtilV2", f = "MLModelUtilV2.kt", i = {}, l = {186}, m = "saveFile", n = {}, s = {})
/* renamed from: X.7TR  reason: invalid class name */
public final class AnonymousClass7TR extends C30421du {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ MLModelUtilV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TR(MLModelUtilV2 mLModelUtilV2, C30391dr r2) {
        super(r2);
        this.this$0 = mLModelUtilV2;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A02((AnonymousClass708) null, (InputStream) null, this, (C22821Di) null, false);
    }
}
