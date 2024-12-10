package X;

/* renamed from: X.9BI  reason: invalid class name */
public class AnonymousClass9BI extends A34 {
    public final int A00 = 15;
    public final int A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass1QS A04;
    public final Runnable A05;
    public final String A06;

    public AnonymousClass9BI(AnonymousClass1QS r2, Runnable runnable, String str, int i, long j, long j2) {
        this.A06 = str;
        this.A01 = i;
        this.A02 = j;
        this.A03 = j2;
        this.A04 = r2;
        this.A05 = runnable;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        this.A05.run();
    }
}
