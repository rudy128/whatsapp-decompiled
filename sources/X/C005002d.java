package X;

import android.window.BackEvent;

/* renamed from: X.02d  reason: invalid class name and case insensitive filesystem */
public final class C005002d {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackEventCompat{touchX=");
        sb.append(this.A01);
        sb.append(", touchY=");
        sb.append(this.A02);
        sb.append(", progress=");
        sb.append(this.A00);
        sb.append(", swipeEdge=");
        sb.append(this.A03);
        sb.append('}');
        return sb.toString();
    }

    public C005002d(BackEvent backEvent) {
        float A012 = C04720Om.A01(backEvent);
        float A022 = C04720Om.A02(backEvent);
        float A002 = C04720Om.A00(backEvent);
        int A032 = C04720Om.A03(backEvent);
        this.A01 = A012;
        this.A02 = A022;
        this.A00 = A002;
        this.A03 = A032;
    }
}
