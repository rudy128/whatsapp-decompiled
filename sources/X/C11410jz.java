package X;

/* renamed from: X.0jz  reason: invalid class name and case insensitive filesystem */
public final class C11410jz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $direction;
    public final /* synthetic */ C015408x $focusedItem;
    public final /* synthetic */ C22821Di $onFound;
    public final /* synthetic */ C015408x $this_generateAndSearchChildren;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11410jz(C015408x r2, C015408x r3, C22821Di r4, int i) {
        super(1);
        this.$this_generateAndSearchChildren = r2;
        this.$focusedItem = r3;
        this.$direction = i;
        this.$onFound = r4;
    }

    /* renamed from: A00 */
    public final Boolean invoke(C16400sC r5) {
        boolean A06 = C05080Qi.A05(this.$this_generateAndSearchChildren, this.$focusedItem, this.$onFound, this.$direction);
        Boolean valueOf = Boolean.valueOf(A06);
        if (A06 || !r5.BSJ()) {
            return valueOf;
        }
        return null;
    }
}
