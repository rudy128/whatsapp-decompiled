package X;

import android.graphics.Rect;

public final class CT8 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final DFL A05;
    public final Integer A06;

    public CT8(Rect rect, DFL dfl, Integer num, int i, int i2, int i3, int i4) {
        this.A05 = dfl;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = rect;
        this.A06 = num;
    }
}
