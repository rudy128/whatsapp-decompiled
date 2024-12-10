package X;

import com.facebook.android.exoplayer2.Timeline;

public final class BOD extends BOO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Timeline A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BOD(Timeline timeline, int i) {
        super(new D9X(i));
        boolean z = false;
        this.A03 = timeline;
        int A002 = timeline.A00();
        this.A00 = A002;
        this.A01 = timeline.A01();
        this.A02 = i;
        if (A002 > 0) {
            if (!(i <= Integer.MAX_VALUE / A002 ? true : z)) {
                throw AnonymousClass000.A0n(String.valueOf("LoopingMediaSource contains too many periods"));
            }
        }
    }
}
