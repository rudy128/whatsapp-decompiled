package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.C17330uU;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5", f = "ProduceState.kt", i = {}, l = {219}, m = "invokeSuspend", n = {}, s = {})
public final class SnapshotStateKt__ProduceStateKt$produceState$5 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OS $producer;
    public final /* synthetic */ C17330uU $result;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$5(C17330uU r2, C30391dr r3, AnonymousClass1OS r4) {
        super(2, r3);
        this.$producer = r4;
        this.$result = r2;
    }

    /* renamed from: A00 */
    public final Object invoke(C30391dr r3, AnonymousClass1OX r4) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5) create(r4, r3)).invokeSuspend(C27621Wu.A00);
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        SnapshotStateKt__ProduceStateKt$produceState$5 snapshotStateKt__ProduceStateKt$produceState$5 = new SnapshotStateKt__ProduceStateKt$produceState$5(this.$result, r5, this.$producer);
        snapshotStateKt__ProduceStateKt$produceState$5.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 A03 = AnonymousClass3F6.A03();
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OS r3 = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, ((AnonymousClass1OX) this.L$0).getCoroutineContext());
            this.label = 1;
            if (r3.invoke(produceStateScopeImpl, this) == A03) {
                return A03;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
