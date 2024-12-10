package X;

/* renamed from: X.0iP  reason: invalid class name and case insensitive filesystem */
public final class C10480iP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ int $first;
    public final /* synthetic */ int $last;
    public final /* synthetic */ AnonymousClass06z $map;
    public final /* synthetic */ AnonymousClass0V5 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10480iP(AnonymousClass06z r2, AnonymousClass0V5 r3, int i, int i2) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C03210Hb r7 = (C03210Hb) obj;
        int i = this.$first;
        int i2 = r7.A01;
        int max = Math.max(i, i2);
        int min = Math.min(this.$last, (i2 + r7.A00) - 1);
        if (max <= min) {
            while (true) {
                AnonymousClass0RK r3 = new AnonymousClass0RK(max);
                AnonymousClass06z r2 = this.$map;
                int A01 = AnonymousClass06z.A01(r2, r3);
                if (A01 < 0) {
                    A01 ^= -1;
                }
                r2.A04[A01] = r3;
                r2.A02[A01] = max;
                AnonymousClass0V5 r0 = this.this$0;
                r0.A01[max - r0.A00] = r3;
                if (max == min) {
                    break;
                }
                max++;
            }
        }
        return C27621Wu.A00;
    }
}
