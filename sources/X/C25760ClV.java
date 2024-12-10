package X;

import android.os.Build;
import android.os.Bundle;

/* renamed from: X.ClV  reason: case insensitive filesystem */
public class C25760ClV {
    public final Object A00;

    public C26228CvK A00(int i) {
        return null;
    }

    public C26228CvK A01(int i) {
        return null;
    }

    public boolean A02(int i, int i2, Bundle bundle) {
        return false;
    }

    public C25760ClV(Object obj) {
        this.A00 = obj;
    }

    public C25760ClV() {
        Object bHu;
        if (Build.VERSION.SDK_INT >= 26) {
            bHu = new C22675BJt(this);
        } else {
            bHu = new BHu(this);
        }
        this.A00 = bHu;
    }
}
