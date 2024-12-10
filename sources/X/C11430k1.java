package X;

/* renamed from: X.0k1  reason: invalid class name and case insensitive filesystem */
public final class C11430k1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1OX $coroutineScope;
    public final /* synthetic */ boolean $isScrollable;
    public final /* synthetic */ boolean $isVertical;
    public final /* synthetic */ boolean $reverseScrolling;
    public final /* synthetic */ C05400Ua $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11430k1(C05400Ua r2, AnonymousClass1OX r3, boolean z, boolean z2, boolean z3) {
        super(1);
        this.$reverseScrolling = z;
        this.$isVertical = z2;
        this.$isScrollable = z3;
        this.$state = r2;
        this.$coroutineScope = r3;
    }

    public final void A00(C16520sO r5) {
        AnonymousClass0PS r0;
        r5.CHj(C03150Gu.A0E, true);
        C05400Ua r02 = this.$state;
        AnonymousClass0Js r1 = new AnonymousClass0Js(new C07800e4(r02), new C07810e5(r02), this.$reverseScrolling);
        if (this.$isVertical) {
            r0 = C03150Gu.A0T;
        } else {
            r0 = C03150Gu.A08;
        }
        r5.CHj(r0, r1);
        if (this.$isScrollable) {
            C05150Qq.A0E(r5, new AnonymousClass0n2(this.$state, this.$coroutineScope, this.$isVertical));
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C16520sO) obj);
        return C27621Wu.A00;
    }
}
