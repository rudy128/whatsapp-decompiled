package X;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CbD  reason: case insensitive filesystem */
public class C25217CbD {
    public C25774Cll A00;
    public Iterator A01;
    public C24322BzJ A02;
    public C25833Cmm A03;
    public final C26052CrM A04;

    public float A00(TimeUnit timeUnit, long j) {
        C25774Cll cll;
        C26171Ctn.A03(AnonymousClass000.A1W(this.A02), "No track is selected");
        while (true) {
            C25774Cll cll2 = this.A00;
            if (cll2 == null || j < cll2.A01.A03(timeUnit)) {
                return 1.0f;
            }
            if (this.A00.A01.A05(j, timeUnit)) {
                return this.A00.A00;
            }
            Iterator it = this.A01;
            if (it == null || !it.hasNext()) {
                cll = null;
            } else {
                cll = (C25774Cll) this.A01.next();
            }
            this.A00 = cll;
        }
        return 1.0f;
    }

    public void A01(C24322BzJ bzJ, int i) {
        this.A02 = bzJ;
        C25833Cmm A032 = this.A04.A03(bzJ, i);
        this.A03 = A032;
        if (A032 != null) {
            Iterator A0y = AnonymousClass8BV.A0y(A032.A07);
            this.A01 = A0y;
            if (A0y.hasNext()) {
                this.A00 = (C25774Cll) this.A01.next();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("Requested Track is not available");
    }

    public C25217CbD(C26052CrM crM) {
        this.A04 = crM;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TimelineSpeedProvider{mMediaComposition=");
        A10.append(this.A04);
        A10.append(", mTimelineSpeedIterator=");
        A10.append(this.A01);
        A10.append(", mCurrentTimelineSpeed=");
        A10.append(this.A00);
        A10.append(", mMediaTrackComposition=");
        A10.append(this.A03);
        A10.append(", mSelectedTrackType=");
        return AnonymousClass8BX.A0c(this.A02, A10);
    }
}
