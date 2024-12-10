package X;

import android.graphics.Rect;

/* renamed from: X.Ckz  reason: case insensitive filesystem */
public class C25729Ckz {
    public static final CKM A04 = new CKM(2);
    public static final CKM A05 = new CKM(5);
    public static final CKM A06 = new CKM(4);
    public static final CKM A07 = new CKM(3);
    public static final CKM A08 = new CKM(1);
    public Rect A00;
    public boolean A01 = false;
    public boolean A02;
    public boolean A03 = true;

    public Object A00(CKM ckm) {
        boolean z;
        int i = ckm.A00;
        if (i == 1) {
            return this.A00;
        }
        if (i == 2) {
            z = this.A01;
        } else if (i == 3) {
            z = this.A03;
        } else if (i != 4) {
            z = false;
        } else {
            z = this.A02;
        }
        return Boolean.valueOf(z);
    }

    public void A01(CKM ckm, Object obj) {
        int i = ckm.A00;
        if (i == 1) {
            this.A00 = (Rect) obj;
        } else if (i != 2) {
            boolean A1Y = AnonymousClass000.A1Y(obj);
            if (i != 3) {
                this.A02 = A1Y;
            } else {
                this.A03 = A1Y;
            }
        } else {
            this.A01 = AnonymousClass000.A1Y(obj);
        }
    }
}
