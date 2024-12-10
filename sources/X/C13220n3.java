package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1;

/* renamed from: X.0n3  reason: invalid class name and case insensitive filesystem */
public final class C13220n3 extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ C16620sj $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13220n3(C16620sj r2, AnonymousClass1OX r3, boolean z) {
        super(2);
        this.$isVertical = z;
        this.$coroutineScope = r3;
        this.$state = r2;
    }

    public final Boolean A00(float f, float f2) {
        if (this.$isVertical) {
            f = f2;
        }
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1$1(this.$state, (C30391dr) null, f), this.$coroutineScope, 3);
        return AnonymousClass000.A0i();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return A00(AnonymousClass000.A04(obj), AnonymousClass000.A04(obj2));
    }
}
