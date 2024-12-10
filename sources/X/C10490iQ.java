package X;

/* renamed from: X.0iQ  reason: invalid class name and case insensitive filesystem */
public final class C10490iQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0I0 $calculationLevelRef;
    public final /* synthetic */ int $nestedCalculationLevel;
    public final /* synthetic */ AnonymousClass06z $newDependencies;
    public final /* synthetic */ AnonymousClass08W this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10490iQ(AnonymousClass06z r2, AnonymousClass08W r3, AnonymousClass0I0 r4, int i) {
        super(1);
        this.this$0 = r3;
        this.$calculationLevelRef = r4;
        this.$newDependencies = r2;
        this.$nestedCalculationLevel = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        if (obj != this.this$0) {
            if (obj instanceof AnonymousClass0t4) {
                int i2 = this.$calculationLevelRef.A00;
                AnonymousClass06z r3 = this.$newDependencies;
                int i3 = i2 - this.$nestedCalculationLevel;
                int A04 = r3.A04(obj);
                if (A04 >= 0) {
                    i = r3.A02[A04];
                } else {
                    i = Integer.MAX_VALUE;
                }
                int min = Math.min(i3, i);
                int A01 = AnonymousClass06z.A01(r3, obj);
                if (A01 < 0) {
                    A01 ^= -1;
                }
                r3.A04[A01] = obj;
                r3.A02[A01] = min;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0n("A derived state calculation cannot read itself");
    }
}
