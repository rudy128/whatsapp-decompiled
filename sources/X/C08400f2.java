package X;

/* renamed from: X.0f2  reason: invalid class name and case insensitive filesystem */
public final class C08400f2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $finalKey;
    public final /* synthetic */ C05720Vl $holder;
    public final /* synthetic */ Object[] $inputs;
    public final /* synthetic */ AnonymousClass0tC $registry;
    public final /* synthetic */ C16680sp $saver;
    public final /* synthetic */ Object $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08400f2(C05720Vl r2, AnonymousClass0tC r3, C16680sp r4, Object obj, String str, Object[] objArr) {
        super(0);
        this.$holder = r2;
        this.$saver = r4;
        this.$registry = r3;
        this.$finalKey = str;
        this.$value = obj;
        this.$inputs = objArr;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C05720Vl r0 = this.$holder;
        C16680sp r2 = this.$saver;
        r0.A01(this.$registry, r2, this.$value, this.$finalKey, this.$inputs);
        return C27621Wu.A00;
    }
}
