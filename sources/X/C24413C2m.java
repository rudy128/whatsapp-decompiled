package X;

import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.C2m  reason: case insensitive filesystem */
public final class C24413C2m extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public C24413C2m(Timeline timeline2, int i, long j) {
        this.timeline = timeline2;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
