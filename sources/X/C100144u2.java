package X;

import com.whatsapp.areffects.util.ArEffectsGatingUtil;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.util.ArEffectsGatingUtil", f = "ArEffectsGatingUtil.kt", i = {0}, l = {126}, m = "getArClassForMetadataQuery", n = {"this"}, s = {"L$0"})
/* renamed from: X.4u2  reason: invalid class name and case insensitive filesystem */
public final class C100144u2 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ArEffectsGatingUtil this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100144u2(ArEffectsGatingUtil arEffectsGatingUtil, C30391dr r2) {
        super(r2);
        this.this$0 = arEffectsGatingUtil;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A01((AnonymousClass4D9) null, this);
    }
}
