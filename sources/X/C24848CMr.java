package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

/* renamed from: X.CMr  reason: case insensitive filesystem */
public class C24848CMr {
    public final BlockingQueue A00 = new DelayQueue();
    public final C27238DaI[] A01;

    public C24848CMr(int i) {
        this.A01 = new C27238DaI[i];
        int i2 = 0;
        while (true) {
            C27238DaI[] daIArr = this.A01;
            if (i2 < daIArr.length) {
                daIArr[i2] = new C27238DaI(this);
                this.A01[i2].setName(AnonymousClass001.A1I("GCD-Thread #", AnonymousClass000.A10(), i2));
                this.A01[i2].start();
                i2++;
            } else {
                return;
            }
        }
    }
}
