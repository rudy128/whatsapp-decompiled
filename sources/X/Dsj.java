package X;

public final class Dsj extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ CTH $controller;
    public final /* synthetic */ BTQ $model;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dsj(CTH cth, BTQ btq) {
        super(2);
        this.$model = btq;
        this.$controller = cth;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C18090vk r3 = this.$model.A0L;
        if (r3 != null) {
            this.$controller.A01.A00 = new D4H(r3, 0);
        }
        return new AnonymousClass0I3(new C27517Dgk(this.$controller));
    }
}
