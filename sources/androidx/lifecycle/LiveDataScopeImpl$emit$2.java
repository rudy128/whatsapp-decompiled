package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C91464fj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class LiveDataScopeImpl$emit$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Object $value;
    public int label;
    public final /* synthetic */ C91464fj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveDataScopeImpl$emit$2(C91464fj r2, Object obj, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$value = obj;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new LiveDataScopeImpl$emit$2(this.this$0, this.$value, r5);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CoroutineLiveData coroutineLiveData = this.this$0.A00;
            this.label = 1;
            coroutineLiveData.A0I(this);
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A00.A0F(this.$value);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LiveDataScopeImpl$emit$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
