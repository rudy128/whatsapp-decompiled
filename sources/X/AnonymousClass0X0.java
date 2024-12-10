package X;

import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

/* renamed from: X.0X0  reason: invalid class name */
public final class AnonymousClass0X0 implements C16870tM {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C04940Pp A01;
    public final /* synthetic */ EBT A02;
    public final /* synthetic */ C26224CvE A03;
    public final /* synthetic */ C28644ECa A04;
    public final /* synthetic */ C22821Di A05;

    public /* synthetic */ int BjA(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A00(r2, this, list, i);
    }

    public /* synthetic */ int Bjw(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A02(r2, this, list, i);
    }

    public /* synthetic */ int Bjz(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A03(r2, this, list, i);
    }

    public AnonymousClass0X0(C04940Pp r1, EBT ebt, C26224CvE cvE, C28644ECa eCa, C22821Di r5, int i) {
        this.A01 = r1;
        this.A05 = r5;
        this.A03 = cvE;
        this.A02 = ebt;
        this.A04 = eCa;
        this.A00 = i;
    }

    public int BjD(C17740v9 r4, List list, int i) {
        C04940Pp r2 = this.A01;
        r2.A00.A09(r4.getLayoutDirection());
        return r2.A00.A03();
    }

    public C16820tH BjZ(C17530uo r9, List list, long j) {
        Snapshot A022;
        C26227CvJ cvJ;
        int i;
        C04940Pp r4 = this.A01;
        Snapshot A002 = C04790Ov.A00();
        try {
            A022 = A002.A02();
            C17330uU r5 = r4.A0A;
            AnonymousClass0NM r0 = (AnonymousClass0NM) r5.getValue();
            if (r0 != null) {
                cvJ = r0.A03();
            } else {
                cvJ = null;
            }
            AnonymousClass0N4.A00(A022);
            A002.A0D();
            AnonymousClass7PS A023 = C05090Qj.A02(r4.A00, cvJ, r9.getLayoutDirection(), j);
            int A0M = AnonymousClass000.A0M(A023.A00());
            int A0M2 = AnonymousClass000.A0M(A023.A01());
            C26227CvJ cvJ2 = (C26227CvJ) A023.A02();
            if (!C18070vi.A18(cvJ, cvJ2)) {
                r5.setValue(new AnonymousClass0NM(cvJ2));
                r4.A02 = false;
                this.A05.invoke(cvJ2);
                C05070Qh.A05(r4, this.A02, this.A03);
            }
            C28644ECa eCa = this.A04;
            if (this.A00 == 1) {
                i = AnonymousClass0E0.A00(cvJ2.A06(0));
            } else {
                i = 0;
            }
            r4.A0B(eCa.CPG(i));
            return r9.BhL(AnonymousClass1D7.A0B(AnonymousClass6YK.A00(AnonymousClass0MK.A00, Integer.valueOf(C22339B3q.A01(cvJ2.A04()))), AnonymousClass6YK.A00(AnonymousClass0MK.A01, Integer.valueOf(C22339B3q.A01(cvJ2.A05())))), C11910ks.A00, A0M, A0M2);
        } catch (Throwable th) {
            A002.A0D();
            throw th;
        }
    }
}
