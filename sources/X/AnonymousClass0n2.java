package X;

import androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1;

/* renamed from: X.0n2  reason: invalid class name */
public final class AnonymousClass0n2 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C05400Ua $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0n2(C05400Ua r2, AnonymousClass1OX r3, boolean z) {
        super(2);
        this.$coroutineScope = r3;
        this.$isVertical = z;
        this.$state = r2;
    }

    public final Boolean A00(float f, float f2) {
        float f3 = f2;
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new ScrollKt$scroll$2$semantics$1$1$1(this.$state, (C30391dr) null, f3, f, this.$isVertical), this.$coroutineScope, 3);
        return AnonymousClass000.A0i();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00(AnonymousClass000.A04(obj), AnonymousClass000.A04(obj2));
    }
}
