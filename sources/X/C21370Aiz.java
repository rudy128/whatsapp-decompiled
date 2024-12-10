package X;

/* renamed from: X.Aiz  reason: case insensitive filesystem */
public final /* synthetic */ class C21370Aiz implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ A7P A03;
    public final /* synthetic */ String A04;

    public final void run() {
        A7P a7p = this.A03;
        String str = this.A04;
        int i = this.A00;
        int i2 = this.A01;
        long j = this.A02;
        if (str == null) {
            str = a7p.A0J;
        }
        A7P.A02(a7p, str, "failed", A7P.A0K.A00(i));
        C171778sG A002 = A7P.A00(a7p, 1);
        A002.A09 = Integer.valueOf(i2);
        A002.A08 = Integer.valueOf(i);
        A002.A0J = Long.valueOf(j);
        A7P.A01(A002, a7p);
        if (i == 24) {
            a7p.A05.A0G("p2p/fpm/encountered unknown error type", a7p.A04, true);
        }
        a7p.A04 = null;
    }

    public /* synthetic */ C21370Aiz(A7P a7p, String str, int i, int i2, long j) {
        this.A03 = a7p;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
