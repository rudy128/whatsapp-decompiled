package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6yZ  reason: invalid class name and case insensitive filesystem */
public final class C139276yZ {
    public final AnonymousClass1KB A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass10I A07;
    public final AnonymousClass00H A08;

    public final void A01(AnonymousClass73D r15, C18090vk r16, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C18070vi.A0d(r15, 0);
        ArrayList A042 = r15.A04();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A042.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C34501ka) this.A08.get()).A01((AnonymousClass72S) next) == 3) {
                A13.add(next);
            }
        }
        C18090vk r6 = r16;
        if (!A13.isEmpty()) {
            boolean z8 = z3;
            this.A07.CGF(new AnonymousClass7QX(this, A13, r6, z8, z2, z4, z, z6, z7, z5));
        } else if (r16 != null) {
            r6.invoke();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r13 > (r2 * 1048576)) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass1D6 A00(X.C59382mD r10, X.C139276yZ r11, X.C1405471x r12, long r13, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            long r0 = r12.A03
            r8 = 1048576(0x100000, double:5.180654E-318)
            if (r16 == 0) goto L_0x006b
            X.00H r7 = r11.A01
            X.0vd r2 = X.C17880vN.A0P(r7)
            r6 = 8606(0x219e, float:1.206E-41)
            X.0vf r5 = X.C18040vf.A02
            int r2 = X.C18020vd.A00(r5, r2, r6)
            long r2 = (long) r2
            long r2 = r2 * r8
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0027
            X.0vd r2 = X.C17880vN.A0P(r7)
            int r2 = X.C18020vd.A00(r5, r2, r6)
            long r2 = (long) r2
        L_0x0024:
            long r0 = r0 * r2
            long r0 = r0 * r8
            long r0 = r0 / r13
        L_0x0027:
            if (r15 == 0) goto L_0x0058
            X.00H r2 = r11.A01
            java.lang.Object r2 = X.C18070vi.A0E(r2)
            X.0ve r2 = (X.C18030ve) r2
            int r6 = X.AnonymousClass6XV.A00(r2, r0)
        L_0x0035:
            r5 = 0
            if (r6 <= 0) goto L_0x004f
            long r3 = X.C17890vO.A03(r6)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x004f
            r0 = r3
            if (r18 == 0) goto L_0x004f
            X.1KB r4 = r11.A00
            r3 = 3
            X.7Qu r2 = new X.7Qu
            r2.<init>(r11, r6, r3, r15)
            r4.A0J(r2)
            r5 = 1
        L_0x004f:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.1D6 r0 = X.C108975cc.A0i(r0, r5)
            return r0
        L_0x0058:
            if (r17 == 0) goto L_0x0069
            X.00H r2 = r11.A01
            X.0vd r4 = X.C17880vN.A0P(r2)
            r3 = 3402(0xd4a, float:4.767E-42)
            X.0vf r2 = X.C18040vf.A02
            int r6 = X.C18020vd.A00(r2, r4, r3)
            goto L_0x0035
        L_0x0069:
            r6 = -1
            goto L_0x0035
        L_0x006b:
            int r2 = r10.A00
            long r2 = (long) r2
            long r5 = r2 * r8
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0027
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139276yZ.A00(X.2mD, X.6yZ, X.71x, long, boolean, boolean, boolean, boolean):X.1D6");
    }

    public C139276yZ(AnonymousClass1KB r2, AnonymousClass10I r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r4, r5, r6, r7, r8);
        C18070vi.A0q(r9, r10, r3);
        C18070vi.A0d(r2, 9);
        this.A08 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r8;
        this.A02 = r9;
        this.A03 = r10;
        this.A07 = r3;
        this.A00 = r2;
    }
}
