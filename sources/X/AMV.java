package X;

public class AMV implements B73 {
    public long A00 = 0;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C175238yN A02;
    public final /* synthetic */ C188819i2 A03;

    public AMV(C175238yN r3, C188819i2 r4, long j) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = j;
    }

    public void Bqp(long j) {
        this.A03.A04.Bqp(j);
        long j2 = this.A00 + j;
        this.A00 = j2;
        if (j > 0) {
            this.A02.notifyAllObservers(new AnonymousClass35L(j2, 3, this.A01));
        }
    }
}
