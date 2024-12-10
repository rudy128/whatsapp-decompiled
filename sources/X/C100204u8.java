package X;

import com.whatsapp.bot.creation.QuickCreateFragment;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.QuickCreateFragment", f = "QuickCreateFragment.kt", i = {0}, l = {111}, m = "completeCreation", n = {"this"}, s = {"L$0"})
/* renamed from: X.4u8  reason: invalid class name and case insensitive filesystem */
public final class C100204u8 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ QuickCreateFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100204u8(QuickCreateFragment quickCreateFragment, C30391dr r2) {
        super(r2);
        this.this$0 = quickCreateFragment;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return QuickCreateFragment.A00(this.this$0, this);
    }
}
