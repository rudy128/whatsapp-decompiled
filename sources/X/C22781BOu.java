package X;

import com.facebook.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.BOu  reason: case insensitive filesystem */
public final class C22781BOu extends C22783BOw {
    public int A00 = -1;
    public Timeline A01;
    public C24200BxC A02;
    public Object A03;
    public final C88 A04;
    public final ArrayList A05;
    public final E9e[] A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C88, java.lang.Object] */
    public C22781BOu(E9e... e9eArr) {
        ? obj = new Object();
        this.A06 = e9eArr;
        this.A04 = obj;
        this.A05 = C17880vN.A10(Arrays.asList(e9eArr));
    }

    public C28649ECi BHj(C25199Caq caq, C25215CbB cbB, long j) {
        E9e[] e9eArr = this.A06;
        C28649ECi[] eCiArr = new C28649ECi[2];
        int i = 0;
        do {
            eCiArr[i] = e9eArr[i].BHj(caq, cbB, j);
            i++;
        } while (i < 2);
        return new D9M(this.A04, eCiArr);
    }

    public void BjW() {
        C24200BxC bxC = this.A02;
        if (bxC == null) {
            super.BjW();
            return;
        }
        throw bxC;
    }

    public void CEL(C28649ECi eCi) {
        D9M d9m = (D9M) eCi;
        int i = 0;
        while (true) {
            E9e[] e9eArr = this.A06;
            if (i < 2) {
                e9eArr[i].CEL(d9m.A04[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public void A05() {
        super.A05();
        this.A01 = null;
        this.A03 = null;
        this.A00 = -1;
        this.A02 = null;
        ArrayList arrayList = this.A05;
        arrayList.clear();
        Collections.addAll(arrayList, this.A06);
    }

    public void A06(C26206Cue cue, boolean z) {
        super.A06(cue, z);
        int i = 0;
        while (true) {
            E9e[] e9eArr = this.A06;
            if (i < 2) {
                A07(e9eArr[i], Integer.valueOf(i));
                i++;
            } else {
                return;
            }
        }
    }
}
