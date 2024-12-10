package X;

import android.animation.ValueAnimator;
import android.view.animation.AnimationUtils;

public class BER extends ValueAnimator {
    public long A00;
    public long A01;
    public long A02 = -1;
    public long A03;
    public long A04 = -1;
    public long A05;
    public long A06 = -1;
    public final BEQ A07;

    public static final void A01(BER ber) {
        ber.A06 = -1;
        ber.A04 = -1;
        ber.A05 = 0;
        ber.A02 = -1;
        ber.A00 = 0;
        super.setStartDelay(ber.A03);
        ber.A01 = 0;
    }

    public long getCurrentPlayTime() {
        long j;
        if (this.A06 == -1) {
            long j2 = this.A05;
            if (j2 != -1) {
                return j2;
            }
            return 0;
        } else if (isPaused() && this.A04 > this.A02) {
            return this.A05;
        } else {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j3 = this.A01;
            if (j3 == 0) {
                long j4 = (this.A05 + currentAnimationTimeMillis) - this.A06;
                boolean isPaused = isPaused();
                long j5 = this.A00;
                if (isPaused) {
                    j5 = (j5 + AnimationUtils.currentAnimationTimeMillis()) - this.A02;
                }
                j = j4 - j5;
            } else {
                j = this.A03 + j3;
            }
            long duration = this.A03 + getDuration();
            if (j > duration) {
                return duration;
            }
            return j;
        }
    }

    public long getStartDelay() {
        return this.A03;
    }

    public long getTotalDuration() {
        return this.A03 + getDuration();
    }

    public void setCurrentPlayTime(long j) {
        long A052 = C28851b7.A05(j, 0, this.A03 + getDuration());
        this.A04 = AnimationUtils.currentAnimationTimeMillis();
        this.A05 = A052;
        long j2 = this.A03;
        if (A052 < j2) {
            super.setStartDelay(j2 - A052);
            if (isPaused()) {
                super.setCurrentPlayTime(0);
            } else if (this.A01 > 0) {
                start();
            }
        } else {
            super.setStartDelay(0);
            super.setCurrentPlayTime(A052 - j2);
        }
    }

    public BER() {
        BEQ beq = new BEQ(this, 6);
        this.A07 = beq;
        super.addListener(beq);
        super.addUpdateListener(new C26323Cxg(this, 3));
    }

    public void pause() {
        boolean isPaused = isPaused();
        super.pause();
        if (!isPaused && isPaused()) {
            this.A02 = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    public void resume() {
        boolean isPaused = isPaused();
        super.resume();
        if (isPaused && !isPaused()) {
            this.A00 += AnimationUtils.currentAnimationTimeMillis() - this.A02;
            this.A02 = -1;
        }
    }

    public void setStartDelay(long j) {
        super.setStartDelay(j);
        this.A03 = j;
    }

    public void start() {
        super.start();
        this.A06 = AnimationUtils.currentAnimationTimeMillis();
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
    }
}
