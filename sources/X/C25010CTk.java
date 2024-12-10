package X;

import android.content.Context;
import android.os.Looper;
import java.util.Iterator;

/* renamed from: X.CTk  reason: case insensitive filesystem */
public final class C25010CTk {
    public final BQm A00;
    public final BTO A01;
    public final C24868CNm A02;
    public final CYR A03;
    public final C25838Cms A04;
    public final C22821Di A05;
    public final C22821Di A06;
    public final C22821Di A07;
    public final AnonymousClass1OS A08;

    public C25010CTk(Context context, Looper looper, BTO bto, C24868CNm cNm, CYR cyr, C25838Cms cms, C22821Di r24, C22821Di r25, C22821Di r26, AnonymousClass1OS r27) {
        C22821Di r13 = r24;
        this.A06 = r13;
        C22821Di r14 = r25;
        this.A07 = r14;
        AnonymousClass1OS r0 = r27;
        this.A08 = r0;
        C22821Di r15 = r26;
        this.A05 = r15;
        C24868CNm cNm2 = cNm;
        this.A02 = cNm2;
        C25838Cms cms2 = cms;
        this.A04 = cms2;
        CYR cyr2 = cyr;
        this.A03 = cyr2;
        BTO bto2 = bto;
        this.A01 = bto2;
        BQm bQm = new BQm(context, looper, bto2, cNm2, cyr2, cms2, r13, r14, r15, r0);
        C25107CYb cYb = new C25107CYb(bQm);
        C22821Di r02 = bQm.A00;
        if (r02 == null) {
            C18070vi.A11("statesBlock");
            throw null;
        }
        r02.invoke(cYb);
        if (cYb.A00) {
            BG4 bg4 = bQm.A00;
            if (bg4 != null) {
                Iterator A0j = C17890vO.A0j(bg4.A0A);
                int i = 0;
                while (A0j.hasNext()) {
                    CWQ cwq = (CWQ) A0j.next();
                    int i2 = 0;
                    while (cwq != null) {
                        cwq = cwq.A01;
                        i2++;
                    }
                    if (i < i2) {
                        i = i2;
                    }
                }
                bg4.A0C = new CWQ[i];
                bg4.A0D = new CWQ[i];
                CWQ cwq2 = (CWQ) bg4.A0A.get(bg4.A04);
                int i3 = 0;
                while (true) {
                    bg4.A01 = i3;
                    if (cwq2 == null) {
                        break;
                    }
                    bg4.A0D[i3] = cwq2;
                    cwq2 = cwq2.A01;
                    i3++;
                }
                bg4.A00 = -1;
                int i4 = 0;
                for (int i5 = i3 - 1; i5 >= 0; i5--) {
                    bg4.A0C[i4] = bg4.A0D[i5];
                    i4++;
                }
                bg4.A00 = i4 - 1;
                bg4.sendMessageAtFrontOfQueue(bg4.obtainMessage(-2, BG4.A0F));
            }
            bQm.A04(BXZ.A00);
            this.A00 = bQm;
            return;
        }
        throw AnonymousClass000.A0n("Must call initial(state)!");
    }
}
