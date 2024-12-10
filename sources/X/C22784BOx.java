package X;

import android.net.Uri;
import com.facebook.android.exoplayer2.Timeline;

/* renamed from: X.BOx  reason: case insensitive filesystem */
public final class C22784BOx extends D9Q {
    public final long A00;
    public final D48 A01;
    public final Timeline A02;
    public final E41 A03;
    public final C26115Csd A04;

    public void A05() {
    }

    public void BjW() {
    }

    public void A06(C26206Cue cue, boolean z) {
        A04(this.A02, (Object) null);
    }

    public C28649ECi BHj(C25199Caq caq, C25215CbB cbB, long j) {
        C26115Csd csd = this.A04;
        E41 e41 = this.A03;
        return new D9N(this.A01, new C26154CtM(caq, this.A03.A02, 0), e41, csd, this.A00);
    }

    public void CEL(C28649ECi eCi) {
        D9N d9n = (D9N) eCi;
        C25667Cjx cjx = d9n.A08;
        BG8 bg8 = cjx.A00;
        if (bg8 != null) {
            bg8.A00(true);
        }
        cjx.A02.shutdown();
        d9n.A07.A03();
    }

    public C22784BOx(Uri uri, D48 d48, E41 e41, long j) {
        this.A03 = e41;
        this.A01 = d48;
        this.A00 = j;
        this.A04 = new C26115Csd(uri);
        this.A02 = new BOP(j, true);
    }
}
