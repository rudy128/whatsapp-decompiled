package X;

import android.view.View;
import androidx.compose.foundation.MagnifierNode$draw$1;

/* renamed from: X.09V  reason: invalid class name */
public final class AnonymousClass09V extends AnonymousClass0XW implements C17660v1, C17640uz, C17600uv, C17610uw, C17560ur {
    public long A00;
    public View A01;
    public AnonymousClass0tA A02;
    public float A03;
    public float A04;
    public float A05;
    public long A06;
    public C17070th A07;
    public C28644ECa A08;
    public C26142Ct5 A09;
    public C22821Di A0A;
    public C22821Di A0B;
    public boolean A0C;
    public boolean A0D;
    public final C17330uU A0E;

    public /* synthetic */ AnonymousClass09V(C17070th r7, C22821Di r8, C22821Di r9, C22821Di r10, AnonymousClass1Y1 r11, float f, float f2, float f3, long j, boolean z, boolean z2) {
        this(r7, r8, r10, j);
    }

    public /* synthetic */ void Bxi() {
    }

    public AnonymousClass09V(C17070th r4, C22821Di r5, C22821Di r6, long j) {
        this.A0B = r5;
        this.A0A = r6;
        this.A05 = Float.NaN;
        this.A0D = true;
        this.A06 = j;
        this.A03 = Float.NaN;
        this.A04 = Float.NaN;
        this.A0C = true;
        this.A07 = r4;
        long j2 = AnonymousClass0QY.A02;
        this.A0E = AnonymousClass0Q9.A02(AnonymousClass000.A0e(j2));
        this.A00 = j2;
    }

    private final void A01() {
        C28644ECa eCa;
        AnonymousClass0tA r4 = this.A02;
        if (r4 != null && (eCa = this.A08) != null) {
            if (!C26142Ct5.A02(this.A09, r4.BZM())) {
                C22821Di r2 = this.A0A;
                if (r2 != null) {
                    r2.invoke(C26200CuV.A02(eCa.CPH(C25293Ccv.A01(r4.BZM()))));
                }
                this.A09 = C26142Ct5.A00(r4.BZM());
            }
        }
    }

    public static final void A02(AnonymousClass09V r10) {
        C28644ECa eCa;
        AnonymousClass0tA r0 = r10.A02;
        if (r0 != null) {
            r0.dismiss();
        }
        View view = r10.A01;
        if (view != null && (eCa = r10.A08) != null) {
            C17070th r02 = r10.A07;
            boolean z = r10.A0D;
            long j = r10.A06;
            r10.A02 = r02.BH8(view, eCa, r10.A03, r10.A04, r10.A05, j, z, r10.A0C);
            r10.A01();
        }
    }

    public static final void A03(AnonymousClass09V r12) {
        C28644ECa eCa;
        long j;
        AnonymousClass0tA r6 = r12.A02;
        if (r6 != null && (eCa = r12.A08) != null) {
            long j2 = ((AnonymousClass0QY) r12.A0B.invoke(eCa)).A00;
            C17330uU r1 = r12.A0E;
            long j3 = ((AnonymousClass0QY) r1.getValue()).A00;
            long j4 = AnonymousClass0QY.A02;
            if (j3 == j4 || j2 == j4) {
                j = j4;
            } else {
                j = AnonymousClass0QY.A05(((AnonymousClass0QY) r1.getValue()).A00, j2);
            }
            r12.A00 = j;
            if (j != j4) {
                r6.CQO(r12.A05, j, j4);
                r12.A01();
                return;
            }
            r6.dismiss();
        }
    }

    public void A0M() {
        AnonymousClass0tA r0 = this.A02;
        if (r0 != null) {
            r0.dismiss();
        }
        this.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        if (X.C18070vi.A18(r12, r3) != false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0N(X.C17070th r12, X.C22821Di r13, X.C22821Di r14, long r15) {
        /*
            r11 = this;
            r7 = 2143289344(0x7fc00000, float:NaN)
            r5 = 1
            float r9 = r11.A05
            long r0 = r11.A06
            float r8 = r11.A03
            float r6 = r11.A04
            boolean r4 = r11.A0C
            X.0th r3 = r11.A07
            r11.A0B = r13
            r11.A05 = r7
            r11.A0D = r5
            r11.A06 = r15
            r11.A03 = r7
            r11.A04 = r7
            r11.A0C = r5
            r11.A0A = r14
            r11.A07 = r12
            X.0tA r2 = r11.A02
            if (r2 == 0) goto L_0x0051
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x002f
            boolean r2 = r12.BOG()
            if (r2 == 0) goto L_0x0051
        L_0x002f:
            long r9 = X.C26200CuV.A02
            int r2 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0051
            int r0 = java.lang.Float.compare(r7, r8)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0051
            int r0 = java.lang.Float.compare(r7, r6)
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 == 0) goto L_0x0051
            if (r5 != r4) goto L_0x0051
            boolean r0 = X.C18070vi.A18(r12, r3)
            if (r0 != 0) goto L_0x0054
        L_0x0051:
            A02(r11)
        L_0x0054:
            A03(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass09V.A0N(X.0th, X.1Di, X.1Di, long):void");
    }

    public void BCT(C16520sO r3) {
        r3.CHj(C04850Pe.A00, new C07780e2(this));
    }

    public void BvI(C16910tQ r5) {
        this.A0E.setValue(AnonymousClass000.A0e(r5.Bhu(AnonymousClass0QY.A03)));
    }

    public void BzO() {
        AnonymousClass0F7.A00(this, new C08460f8(this));
    }

    public void A0L() {
        BzO();
    }

    public void BJM(C17480uj r5) {
        r5.BJR();
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new MagnifierNode$draw$1(this, (C30391dr) null), A0B(), 3);
    }

    public /* synthetic */ boolean BZA() {
        return false;
    }

    public /* synthetic */ boolean BZC() {
        return false;
    }
}
