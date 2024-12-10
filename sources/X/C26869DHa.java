package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.DHa  reason: case insensitive filesystem */
public class C26869DHa implements EAT {
    public int A00;
    public long A01 = 0;
    public long A02;
    public Context A03;
    public DRN A04;
    public C28559E7l A05;
    public EAS A06;
    public CUT A07;
    public E7t A08;
    public boolean A09;
    public long A0A;
    public boolean A0B;
    public final D4A A0C;

    public C25225CbM BUZ() {
        return null;
    }

    public boolean BeS() {
        return false;
    }

    public void CRW(A5W a5w) {
    }

    public void CS4() {
    }

    public void cancel() {
    }

    /* JADX INFO: finally extract failed */
    private void A00() {
        if (!this.A09) {
            try {
                DRN drn = this.A04;
                C26159CtX.A01(drn);
                EAS eas = this.A06;
                C26159CtX.A01(eas);
                eas.CQV(this.A00, (Bitmap) drn.A05());
                DRN drn2 = this.A04;
                if (drn2 != null) {
                    drn2.close();
                    this.A04 = null;
                }
                this.A09 = true;
            } catch (Throwable th) {
                DRN drn3 = this.A04;
                if (drn3 != null) {
                    drn3.close();
                    this.A04 = null;
                }
                throw th;
            }
        }
    }

    public void BFX(int i) {
        boolean z;
        long j;
        this.A00 = i;
        CUT cut = this.A07;
        C26052CrM crM = cut.A06;
        C26159CtX.A01(crM);
        C25833Cmm A032 = crM.A03(C24322BzJ.VIDEO, this.A00);
        if (A032 != null) {
            List list = A032.A04;
            if (!C17880vN.A10(list).isEmpty()) {
                int i2 = ((C25271CcJ) C17880vN.A10(list).get(0)).A00;
                long j2 = BE9.A0Q(list).A02;
                this.A02 = j2;
                CZT czt = cut.A08;
                if (czt instanceof BWB) {
                    z = AnonymousClass000.A1O(((BWB) czt).A01 ? 1 : 0);
                } else {
                    z = false;
                }
                this.A0B = z;
                long j3 = C24707CGt.A00;
                if (z) {
                    j = j2 - 1;
                } else if (i2 > 0) {
                    j = (long) (BEA.A01() / ((double) i2));
                } else {
                    j = C24707CGt.A00;
                }
                this.A0A = j;
            }
        }
        this.A06 = this.A08.BHI();
    }

    public long BQJ() {
        return this.A01;
    }

    public void release() {
        EAS eas = this.A06;
        if (eas != null) {
            eas.finish();
        }
        DRN drn = this.A04;
        if (drn != null) {
            drn.close();
        }
    }

    public void start() {
        C26052CrM crM = this.A07.A06;
        C26159CtX.A01(crM);
        C25833Cmm A032 = crM.A03(C24322BzJ.VIDEO, this.A00);
        C26159CtX.A01(A032);
        File file = ((C25271CcJ) AnonymousClass8BS.A0Y(C17880vN.A10(A032.A04))).A05;
        C26171Ctn.A02(file);
        Uri fromFile = Uri.fromFile(file);
        C28559E7l e7l = this.A05;
        C26171Ctn.A02(e7l);
        DRN Bhm = e7l.Bhm(this.A03, fromFile, this.A0C);
        this.A04 = Bhm;
        if (Bhm == null) {
            throw C17880vN.A0f("Bitmap cannot be loaded");
        }
    }

    public C26869DHa(Context context, C28559E7l e7l, CUT cut, E7t e7t) {
        if (!"PhotoDemuxDecodeWrapper".isEmpty()) {
            this.A0C = new D4A((D4B) null, "PhotoDemuxDecodeWrapper", (String) null, (String) null, (String) null);
            this.A00 = -1;
            this.A0A = C24707CGt.A00;
            this.A03 = context;
            this.A05 = e7l;
            this.A07 = cut;
            this.A08 = e7t;
            return;
        }
        throw AnonymousClass000.A0k("callingClassName for the CallerContext cannot be null nor empty.");
    }

    public long BI6() {
        long j;
        A00();
        long j2 = this.A01;
        if (this.A0B) {
            long j3 = this.A02 - C24707CGt.A01;
            long j4 = 0;
            if (0 < j3) {
                j4 = j3;
            }
            if (j2 >= j4) {
                j = j2 + C24707CGt.A00;
            } else {
                long j5 = j2 + this.A0A;
                long j6 = 0;
                if (0 < j3) {
                    j6 = j3;
                }
                j = Math.min(j5, j6);
            }
        } else {
            j = this.A0A + j2;
        }
        this.A01 = j;
        return j2;
    }

    public void BI7(long j) {
        A00();
        this.A01 = j;
    }

    public void CHA(long j) {
        A00();
        this.A01 = j;
    }
}
