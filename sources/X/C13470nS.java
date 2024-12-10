package X;

/* renamed from: X.0nS  reason: invalid class name and case insensitive filesystem */
public final class C13470nS extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ AnonymousClass1OS $content;
    public final /* synthetic */ int $index;
    public final /* synthetic */ Object $key;
    public final /* synthetic */ C06830Zv $pinnedItemList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13470nS(C06830Zv r2, Object obj, AnonymousClass1OS r4, int i, int i2) {
        super(2);
        this.$key = obj;
        this.$index = i;
        this.$pinnedItemList = r2;
        this.$content = r4;
        this.$$changed = i2;
    }

    public final void A00(C17130tn r8) {
        C17130tn r2 = r8;
        C02340Dq.A00(this.$pinnedItemList, r2, this.$key, this.$content, this.$index, AnonymousClass0L8.A00(this.$$changed));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        A00(AnonymousClass000.A0b(obj, obj2));
        return C27621Wu.A00;
    }
}
