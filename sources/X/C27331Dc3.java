package X;

import java.util.Map;
import java.util.TimerTask;

/* renamed from: X.Dc3  reason: case insensitive filesystem */
public final class C27331Dc3 extends TimerTask {
    public final /* synthetic */ C25687CkI A00;
    public final /* synthetic */ Map A01;

    public C27331Dc3(C25687CkI ckI, Map map) {
        this.A00 = ckI;
        this.A01 = map;
    }

    public void run() {
        C25687CkI ckI = this.A00;
        COL col = ckI.A07;
        Map map = this.A01;
        C18070vi.A0d(map, 0);
        CCY.A00(col.A00, col.A01, map, 40);
        ckI.A01();
    }
}
