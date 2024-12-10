package X;

import android.content.ClipData;
import android.os.Build;

/* renamed from: X.Ckf  reason: case insensitive filesystem */
public final class C25709Ckf {
    public final E9N A00;

    public C25997CqD A00() {
        return this.A00.BDP();
    }

    public void A01(int i) {
        this.A00.CIu(i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.D6O, java.lang.Object] */
    public C25709Ckf(ClipData clipData, int i) {
        D6P d6p;
        if (Build.VERSION.SDK_INT >= 31) {
            d6p = new D6P(clipData, i);
        } else {
            ? obj = new Object();
            obj.A02 = clipData;
            obj.A01 = i;
            d6p = obj;
        }
        this.A00 = d6p;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.D6O, java.lang.Object] */
    public C25709Ckf(C25997CqD cqD) {
        D6P d6p;
        if (Build.VERSION.SDK_INT >= 31) {
            d6p = new D6P(cqD);
        } else {
            ? obj = new Object();
            E9Z e9z = cqD.A00;
            obj.A02 = e9z.BOm();
            obj.A01 = e9z.BZT();
            obj.A00 = e9z.BRq();
            obj.A03 = e9z.getLinkUri();
            obj.A04 = e9z.getExtras();
            d6p = obj;
        }
        this.A00 = d6p;
    }
}
