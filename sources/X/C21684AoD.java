package X;

import com.whatsapp.messagetranslation.TranslationMLProcessor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.TranslationMLProcessor", f = "TranslationManager.kt", i = {0, 0}, l = {185}, m = "process", n = {"this", "request"}, s = {"L$0", "L$1"})
/* renamed from: X.AoD  reason: case insensitive filesystem */
public final class C21684AoD extends C30421du {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TranslationMLProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21684AoD(TranslationMLProcessor translationMLProcessor, C30391dr r2) {
        super(r2);
        this.this$0 = translationMLProcessor;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.CCX((C173708vb) null, this);
    }
}
