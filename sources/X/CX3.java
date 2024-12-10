package X;

import android.graphics.PointF;

public class CX3 {
    public BEu A00;
    public BEu A01;
    public final long A02;
    public final C25683CkE A03;
    public final BEu A04;

    /* JADX WARNING: type inference failed for: r0v9, types: [X.BEu, android.graphics.PointF] */
    public void A00(PointF pointF, long j) {
        if (j >= this.A02) {
            BEu bEu = this.A00;
            BEu bEu2 = this.A01;
            if (bEu == bEu2) {
                this.A00 = new PointF(pointF.x, pointF.y);
                return;
            }
            BEu bEu3 = this.A04;
            float f = pointF.x - bEu2.x;
            bEu3.x = f;
            float f2 = pointF.y - bEu2.y;
            bEu3.y = f2;
            bEu3.x = f * 0.5f;
            bEu3.y = f2 * 0.5f;
            this.A03.A00(bEu, bEu3);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw AnonymousClass000.A0n("events must deliver in order");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.BEu, android.graphics.PointF] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BEu, android.graphics.PointF] */
    public CX3(PointF pointF, long j) {
        C25683CkE ckE = new C25683CkE();
        this.A03 = ckE;
        ? pointF2 = new PointF(0.0f, 0.0f);
        this.A04 = pointF2;
        ? pointF3 = new PointF(pointF.x, pointF.y);
        this.A00 = pointF3;
        this.A01 = pointF3;
        this.A02 = j;
        ckE.A00(pointF3, pointF2);
    }
}
