package X;

/* renamed from: X.Dsu  reason: case insensitive filesystem */
public final class C28184Dsu extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C23736Boh $environment;
    public final /* synthetic */ E8A $onSuccessExpression;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28184Dsu(C23736Boh boh, E8A e8a) {
        super(2);
        this.$environment = boh;
        this.$onSuccessExpression = e8a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        char A17 = C18070vi.A17(obj, obj2);
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.$environment.A00;
        A1a[A17] = obj;
        C25974Cph.A00(this.$environment, new C199029zJ(C18070vi.A0O(obj2, A1a, 2)), this.$onSuccessExpression);
        return C27621Wu.A00;
    }
}
