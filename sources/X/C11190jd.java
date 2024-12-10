package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2;

/* renamed from: X.0jd  reason: invalid class name and case insensitive filesystem */
public final class C11190jd extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ C18090vk $itemProviderLambda;
    public final /* synthetic */ C16620sj $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11190jd(C16620sj r2, C18090vk r3, AnonymousClass1OX r4) {
        super(1);
        this.$itemProviderLambda = r3;
        this.$coroutineScope = r4;
        this.$state = r2;
    }

    public final Boolean A00(int i) {
        C16610si r2 = (C16610si) this.$itemProviderLambda.invoke();
        if (i < 0 || i >= ((AnonymousClass0V1) r2).A01.A00.A00) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Can't scroll to index ");
            A10.append(i);
            A10.append(", it is out of bounds [0, ");
            throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, ((AnonymousClass0V1) r2).A01.A00.A00));
        }
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1$2(this.$state, (C30391dr) null, i), this.$coroutineScope, 3);
        return AnonymousClass000.A0i();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00(AnonymousClass000.A0M(obj));
    }
}
