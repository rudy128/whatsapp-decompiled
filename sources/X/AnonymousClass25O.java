package X;

import android.graphics.BitmapFactory;

/* renamed from: X.25O  reason: invalid class name */
public class AnonymousClass25O {
    public final int A00;
    public final int A01;
    public final long A02;
    public final BitmapFactory.Options A03;
    public final boolean A04;

    public AnonymousClass25O(int i, int i2) {
        this((BitmapFactory.Options) null, (Long) null, i, i2, false);
    }

    public AnonymousClass25O(BitmapFactory.Options options, Long l, int i, int i2, boolean z) {
        boolean z2;
        if (i < 2 || i2 < 2 || ((l != null && l.longValue() <= 0) || (z && i != i2))) {
            z2 = false;
        } else {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bitmaputils/bitmapspec/wrong/ ");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(l);
        sb.append(",");
        sb.append(z);
        C17960vV.A0F(z2, sb.toString());
        long j = 25000000;
        if (!z2) {
            this.A01 = Integer.MAX_VALUE;
            this.A00 = Integer.MAX_VALUE;
            this.A02 = 25000000;
            this.A04 = false;
        } else {
            this.A01 = i;
            this.A00 = i2;
            this.A02 = l != null ? Math.min(l.longValue(), 25000000) : j;
            this.A04 = z;
        }
        this.A03 = options == null ? new BitmapFactory.Options() : options;
    }
}
