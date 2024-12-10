package X;

/* renamed from: X.0mM  reason: invalid class name and case insensitive filesystem */
public final class C12810mM extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ int $index;
    public final /* synthetic */ C16610si $itemProvider;
    public final /* synthetic */ Object $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12810mM(C16610si r2, Object obj, int i) {
        super(2);
        this.$itemProvider = r2;
        this.$index = i;
        this.$key = obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C17130tn r5 = (C17130tn) obj;
        if ((AnonymousClass000.A0M(obj2) & 11) != 2 || !r5.BZO()) {
            this.$itemProvider.BAC(r5, this.$key, this.$index, 64);
        } else {
            r5.CNR();
        }
        return C27621Wu.A00;
    }
}
