package X;

import com.facebook.android.exoplayer2.Timeline;

public abstract class BOO extends Timeline {
    public final int A00;
    public final EA2 A01;

    public int A0A(int i) {
        if (this instanceof BOD) {
            return i * ((BOD) this).A01;
        }
        return ((BOE) this).A04[i];
    }

    public Timeline A0B(int i) {
        if (this instanceof BOD) {
            return ((BOD) this).A03;
        }
        return ((BOE) this).A06[i];
    }

    public BOO(EA2 ea2) {
        this.A01 = ea2;
        this.A00 = ea2.getLength();
    }
}
