package X;

import androidx.compose.ui.Alignment;
import java.util.List;

/* renamed from: X.0X1  reason: invalid class name */
public final class AnonymousClass0X1 implements C16870tM {
    public final Alignment A00;
    public final boolean A01;

    public /* synthetic */ int BjA(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A00(r2, this, list, i);
    }

    public /* synthetic */ int BjD(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A01(r2, this, list, i);
    }

    public /* synthetic */ int Bjw(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A02(r2, this, list, i);
    }

    public /* synthetic */ int Bjz(C17740v9 r2, List list, int i) {
        return AnonymousClass0P1.A03(r2, this, list, i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0X1) {
                AnonymousClass0X1 r5 = (AnonymousClass0X1) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [X.0k7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16820tH BjZ(X.C17530uo r24, java.util.List r25, long r26) {
        /*
            r23 = this;
            r5 = r25
            boolean r0 = r5.isEmpty()
            r13 = r24
            r19 = r26
            if (r0 == 0) goto L_0x001b
            int r15 = androidx.compose.ui.unit.Constraints.A03(r19)
            int r0 = androidx.compose.ui.unit.Constraints.A02(r19)
            X.0kk r10 = X.C11830kk.A00
        L_0x0016:
            X.0tH r0 = r13.BhL(X.AnonymousClass1D7.A0I(), r10, r15, r0)
            return r0
        L_0x001b:
            r11 = r23
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00b7
            r1 = r19
        L_0x0023:
            int r4 = r5.size()
            r3 = 1
            r0 = 0
            if (r4 != r3) goto L_0x0056
            java.lang.Object r12 = r5.get(r0)
            X.0ul r12 = (X.C17500ul) r12
            r12.BWC()
            X.0XJ r14 = r12.Bjb(r1)
            int r1 = androidx.compose.ui.unit.Constraints.A03(r19)
            int r0 = r14.A01
            int r15 = java.lang.Math.max(r1, r0)
            int r1 = androidx.compose.ui.unit.Constraints.A02(r19)
            int r0 = r14.A00
            int r0 = java.lang.Math.max(r1, r0)
            X.0k7 r10 = new X.0k7
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
        L_0x0053:
            X.1Di r10 = (X.C22821Di) r10
            goto L_0x0016
        L_0x0056:
            int r0 = r5.size()
            X.0XJ[] r7 = new X.AnonymousClass0XJ[r0]
            X.4rD r6 = new X.4rD
            r6.<init>()
            int r0 = androidx.compose.ui.unit.Constraints.A03(r19)
            r6.element = r0
            X.4rD r4 = new X.4rD
            r4.<init>()
            int r0 = androidx.compose.ui.unit.Constraints.A02(r19)
            r4.element = r0
            int r9 = r5.size()
            r8 = 0
        L_0x0077:
            if (r8 >= r9) goto L_0x009f
            java.lang.Object r0 = r5.get(r8)
            X.0ul r0 = (X.C17500ul) r0
            r0.BWC()
            X.0XJ r10 = r0.Bjb(r1)
            r7[r8] = r10
            int r3 = r6.element
            int r0 = r10.A01
            int r0 = java.lang.Math.max(r3, r0)
            r6.element = r0
            int r3 = r4.element
            int r0 = r10.A00
            int r0 = java.lang.Math.max(r3, r0)
            r4.element = r0
            int r8 = r8 + 1
            goto L_0x0077
        L_0x009f:
            int r15 = r6.element
            int r0 = r4.element
            X.0k8 r10 = new X.0k8
            r16 = r10
            r17 = r11
            r18 = r13
            r19 = r5
            r20 = r6
            r21 = r4
            r22 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            goto L_0x0053
        L_0x00b7:
            r18 = 10
            r14 = 0
            r16 = r14
            r17 = r14
            r15 = r14
            long r1 = androidx.compose.ui.unit.Constraints.A04(r14, r15, r16, r17, r18, r19)
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0X1.BjZ(X.0uo, java.util.List, long):X.0tH");
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A00);
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return A0L + i;
    }

    public AnonymousClass0X1(Alignment alignment, boolean z) {
        this.A00 = alignment;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BoxMeasurePolicy(alignment=");
        A10.append(this.A00);
        A10.append(", propagateMinConstraints=");
        A10.append(this.A01);
        return AnonymousClass001.A1J(A10);
    }
}
