package X;

import java.util.Iterator;

/* renamed from: X.7Q4  reason: invalid class name */
public class AnonymousClass7Q4 implements Runnable {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;

    public AnonymousClass7Q4(Object obj, float f, int i, int i2, int i3, int i4) {
        this.A01 = i4;
        this.A05 = obj;
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A00 = f;
    }

    public final void run() {
        int i;
        int i2;
        int i3;
        float f;
        DGM dgm;
        int i4 = this.A01;
        Object obj = this.A05;
        switch (i4) {
            case 0:
                i = this.A02;
                i2 = this.A03;
                i3 = this.A04;
                f = this.A00;
                dgm = ((C24847CMq) obj).A01.A01.A0o;
                break;
            case 1:
                Iterator it = ((DGH) obj).A00.iterator();
                while (it.hasNext()) {
                    ((C28613EAh) it.next()).CA2(this.A00, this.A04, this.A02, this.A03);
                }
                return;
            case 2:
                i = this.A02;
                i2 = this.A03;
                i3 = this.A04;
                f = this.A00;
                dgm = ((C22927BVp) obj).A00;
                break;
            default:
                int i5 = this.A02;
                int i6 = this.A03;
                int i7 = this.A04;
                float f2 = this.A00;
                C122076Mr r4 = ((AnonymousClass7B9) obj).A00;
                C122126Mw r3 = r4.A0a;
                float f3 = 1.0f;
                float f4 = 1.0f;
                if (i6 != 0) {
                    f4 = (((float) i5) * f2) / ((float) i6);
                }
                if (!r3.A08) {
                    ((C109855e7) r3.A06).setRotationAngle(i7);
                    if (i7 == 90 || i7 == 270) {
                        if (i6 != 0) {
                            f3 = ((float) i6) / (((float) i5) * f2);
                        }
                        f4 = f3;
                    }
                }
                r3.A07.setAspectRatio(f4);
                if (r4.A0K) {
                    r3.A05.setVisibility(8);
                    r4.A0E = true;
                }
                r4.A0M = true;
                return;
        }
        dgm.CA2(f, i, i2, i3);
    }
}
