package X;

import java.nio.ByteBuffer;
import java.util.HashMap;

/* renamed from: X.CSu  reason: case insensitive filesystem */
public class C24994CSu {
    public ByteBuffer A00 = BEA.A0u(0);
    public final C25953CpL A01;
    public final C28594E9k A02;
    public final C26015CqW A03;
    public final ByteBuffer[] A04;
    public final CUT A05;

    public C24994CSu(C25953CpL cpL, C28594E9k e9k, C26015CqW cqW, CUT cut) {
        HashMap A06;
        int i = 0;
        this.A01 = cpL;
        this.A02 = e9k;
        this.A05 = cut;
        C26052CrM crM = cut.A06;
        if (!(crM == null || (A06 = crM.A06(C24322BzJ.AUDIO)) == null)) {
            i = A06.size();
        }
        this.A04 = new ByteBuffer[i];
        this.A03 = cqW;
    }
}
