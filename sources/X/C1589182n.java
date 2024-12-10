package X;

/* renamed from: X.82n  reason: invalid class name and case insensitive filesystem */
public final class C1589182n extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C135686sb $data;
    public final /* synthetic */ C18090vk $errorCallback;
    public final /* synthetic */ AnonymousClass1OS $handleResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589182n(C135686sb r2, C18090vk r3, AnonymousClass1OS r4) {
        super(1);
        this.$data = r2;
        this.$handleResult = r4;
        this.$errorCallback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        A0S.A00 = new AnonymousClass82E(this.$data, this.$handleResult);
        A0S.A01 = new C157987yy(this.$errorCallback);
        return C27621Wu.A00;
    }
}
