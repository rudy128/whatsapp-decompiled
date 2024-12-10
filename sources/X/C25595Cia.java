package X;

import android.graphics.PointF;

/* renamed from: X.Cia  reason: case insensitive filesystem */
public class C25595Cia {
    public long A00;
    public final CX3 A01;
    public final BEu A02 = new PointF(0.0f, 0.0f);
    public final BEu A03;
    public final BEu A04;
    public final BEu A05;

    public static void A00(C25595Cia cia) {
        BEu bEu = cia.A04;
        BEu bEu2 = cia.A02;
        BEu bEu3 = cia.A03;
        float f = bEu2.x - bEu3.x;
        bEu.x = f;
        float f2 = bEu2.y - bEu3.y;
        bEu.y = f2;
        float f3 = f * 0.05f;
        bEu.x = f3;
        float f4 = f2 * 0.05f;
        bEu.y = f4;
        BEu bEu4 = cia.A05;
        float f5 = bEu4.x + f3;
        bEu4.x = f5;
        float f6 = bEu4.y + f4;
        bEu4.y = f6;
        float f7 = f5 * 0.7f;
        bEu4.x = f7;
        float f8 = f6 * 0.7f;
        bEu4.y = f8;
        bEu3.x += f7;
        bEu3.y += f8;
        long j = (long) (((double) cia.A00) + 3.0d);
        cia.A00 = j;
        cia.A01.A00(bEu3, j);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.BEu, android.graphics.PointF] */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.BEu, android.graphics.PointF] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.BEu, android.graphics.PointF] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.BEu, android.graphics.PointF] */
    public C25595Cia(PointF pointF, long j) {
        ? pointF2 = new PointF(0.0f, 0.0f);
        this.A03 = pointF2;
        ? pointF3 = new PointF(0.0f, 0.0f);
        this.A05 = pointF3;
        this.A04 = new PointF(0.0f, 0.0f);
        this.A01 = new CX3(pointF, j);
        this.A00 = j;
        pointF2.set(pointF);
        pointF3.set(0.0f, 0.0f);
    }
}
