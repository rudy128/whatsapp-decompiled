package X;

import androidx.lifecycle.CoroutineLiveData;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", i = {0}, l = {235}, m = "clearSource$lifecycle_livedata_release", n = {"this"}, s = {"L$0"})
/* renamed from: X.4u0  reason: invalid class name and case insensitive filesystem */
public final class C100124u0 extends C30421du {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CoroutineLiveData this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100124u0(CoroutineLiveData coroutineLiveData, C30391dr r2) {
        super(r2);
        this.this$0 = coroutineLiveData;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.A0I(this);
    }
}
