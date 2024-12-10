package X;

/* renamed from: X.0iL  reason: invalid class name and case insensitive filesystem */
public final class C10440iL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Object $key;
    public final /* synthetic */ C03300Hl $registryHolder;
    public final /* synthetic */ C05850Vy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10440iL(C03300Hl r2, C05850Vy r3, Object obj) {
        super(1);
        this.this$0 = r3;
        this.$key = obj;
        this.$registryHolder = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z = !this.this$0.A01.containsKey(this.$key);
        Object obj2 = this.$key;
        if (z) {
            this.this$0.A02.remove(obj2);
            this.this$0.A01.put(this.$key, this.$registryHolder);
            return new AnonymousClass0VY(this.$registryHolder, this.$key, this.this$0, 1);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Key ");
        A10.append(obj2);
        throw AnonymousClass001.A12(" was used multiple times ", A10);
    }
}
