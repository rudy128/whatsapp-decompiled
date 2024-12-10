package X;

import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.android.kt", i = {1, 1}, l = {223, 248}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
/* renamed from: X.0bF  reason: invalid class name and case insensitive filesystem */
public final class C07510bF extends C30421du {
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C07510bF(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, C30391dr r2) {
        super(r2);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.BCX(this, (AnonymousClass1OS) null, 0);
    }
}
