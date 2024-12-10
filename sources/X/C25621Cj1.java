package X;

import android.graphics.Rect;

/* renamed from: X.Cj1  reason: case insensitive filesystem */
public class C25621Cj1 {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final float A0C;
    public final float A0D;

    public C25621Cj1(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.A0B = f;
        this.A05 = f2;
        this.A0A = f3;
        this.A01 = f4;
        this.A00 = f5;
        this.A02 = f6;
        this.A0C = f7;
        this.A0D = f8;
        this.A03 = f9;
        this.A04 = f10;
        this.A09 = f11;
        this.A06 = f12;
        this.A07 = f13;
        this.A08 = f14;
    }

    public static void A00(Rect rect, C18100vl r3) {
        float f;
        float f2;
        float f3;
        C25621Cj1 cj1 = (C25621Cj1) r3.getValue();
        if (cj1 instanceof C23807Bpz) {
            f = ((C23807Bpz) cj1).A0C;
        } else {
            f = cj1.A08;
        }
        rect.right = (int) f;
        C25621Cj1 cj12 = (C25621Cj1) r3.getValue();
        if (cj12 instanceof C23807Bpz) {
            f2 = ((C23807Bpz) cj12).A0D;
        } else {
            f2 = cj12.A09;
        }
        rect.top = (int) f2;
        C25621Cj1 cj13 = (C25621Cj1) r3.getValue();
        if (cj13 instanceof C23807Bpz) {
            f3 = ((C23807Bpz) cj13).A09;
        } else {
            f3 = cj13.A06;
        }
        rect.bottom = (int) f3;
    }
}
