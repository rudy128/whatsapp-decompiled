package X;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.C5q  reason: case insensitive filesystem */
public abstract class C24475C5q {
    public void A02(E59 e59) {
        BasePendingResult basePendingResult = (BasePendingResult) this;
        synchronized (basePendingResult.A05) {
            if (AnonymousClass000.A1P((basePendingResult.A08.getCount() > 0 ? 1 : (basePendingResult.A08.getCount() == 0 ? 0 : -1)))) {
                e59.BpI(basePendingResult.A01);
            } else {
                basePendingResult.A07.add(e59);
            }
        }
    }
}
