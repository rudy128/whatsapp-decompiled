package X;

import android.view.ViewGroup;

/* renamed from: X.5lC  reason: invalid class name and case insensitive filesystem */
public class C112265lC extends C38391rD {
    public final C38391rD A00;
    public final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r2 = r2 << 32;
        r0 = (long) (r6 + (r8 - r5));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A00(X.C112265lC r7, int r8) {
        /*
            X.1rD r7 = r7.A00
            X.8AZ r7 = (X.AnonymousClass8AZ) r7
            int r3 = r7.BSM()
            r2 = 0
            r6 = 0
            r5 = 0
        L_0x000b:
            r4 = 32
            if (r2 >= r3) goto L_0x001a
            if (r5 != r8) goto L_0x001e
            long r2 = (long) r2
            long r2 = r2 << r4
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L_0x0018:
            long r2 = r2 | r0
            return r2
        L_0x001a:
            int r0 = r3 + -1
            long r2 = (long) r0
            goto L_0x0029
        L_0x001e:
            int r5 = r5 + 1
            int r1 = r7.BPU(r2)
            int r0 = r5 + r1
            if (r0 <= r8) goto L_0x002e
            long r2 = (long) r2
        L_0x0029:
            long r2 = r2 << r4
            int r8 = r8 - r5
            int r6 = r6 + r8
            long r0 = (long) r6
            goto L_0x0018
        L_0x002e:
            int r5 = r5 + r1
            int r6 = r6 + r1
            int r2 = r2 + 1
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112265lC.A00(X.5lC, int):long");
    }

    public int A0Q() {
        C38391rD r0 = this.A00;
        return r0.A0Q() + ((AnonymousClass8AZ) r0).BSM();
    }

    public void A0R(C42011xT r2) {
        if (this.A01) {
            this.A00.A0R(r2);
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i == -1000) {
            return ((AnonymousClass8AZ) this.A00).BqT(viewGroup);
        }
        return this.A00.BqY(viewGroup, i);
    }

    public C112265lC(C38391rD r2, boolean z) {
        this.A01 = z;
        this.A00 = r2;
        A0K(r2.A00);
        r2.CDq(new C112455lV(this, z));
    }

    public long A0M(int i) {
        long A002 = A00(this, i);
        long j = A002 & 4294967295L;
        boolean A1P = AnonymousClass000.A1P((j > 4294967295L ? 1 : (j == 4294967295L ? 0 : -1)));
        C38391rD r1 = this.A00;
        if (A1P) {
            return ((AnonymousClass8AZ) r1).BSN((int) (A002 >> 32));
        }
        return r1.A0M((int) j);
    }

    public void Bmc(C42011xT r9, int i) {
        long A002 = A00(this, i);
        long j = A002 & 4294967295L;
        boolean A1P = AnonymousClass000.A1P((j > 4294967295L ? 1 : (j == 4294967295L ? 0 : -1)));
        C38391rD r1 = this.A00;
        if (A1P) {
            ((AnonymousClass8AZ) r1).Bma(r9, (int) (A002 >> 32));
        } else {
            r1.Bmc(r9, (int) j);
        }
    }

    public int getItemViewType(int i) {
        long A002 = A00(this, i) & 4294967295L;
        if (AnonymousClass000.A1P((A002 > 4294967295L ? 1 : (A002 == 4294967295L ? 0 : -1)))) {
            return -1000;
        }
        return this.A00.getItemViewType((int) A002);
    }
}
