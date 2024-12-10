package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.0Vf  reason: invalid class name and case insensitive filesystem */
public final class C05660Vf implements C15740r7 {
    public int A00;
    public int A01;
    public AnonymousClass06z A02;
    public AnonymousClass070 A03;
    public C02090Cr A04;
    public C16660sn A05;
    public AnonymousClass1OS A06;

    public final boolean A05(C06990aB r8) {
        AnonymousClass070 r5;
        if (!(r8 == null || (r5 = this.A03) == null || !r8.A03())) {
            if ((r8 instanceof Collection) && r8.isEmpty()) {
                return false;
            }
            Iterator it = r8.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof C17320uT) {
                    C17320uT r3 = (C17320uT) next;
                    C16290s1 r2 = ((AnonymousClass08W) r3).A01;
                    if (r2 == null) {
                        r2 = AnonymousClass0Q9.A06();
                    }
                    if (!r2.BKT(r3.BQ0().A04, r5.A02(r3))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0040: MOVE  (r1v2 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final X.C11260jk A00(int r18) {
        /*
            r17 = this;
            r12 = r17
            X.06z r11 = r12.A02
            r10 = 0
            if (r11 == 0) goto L_0x0049
            int r0 = r12.A01
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0049
            int[] r9 = r11.A02
            long[] r8 = r11.A03
            int r0 = r8.length
            int r7 = r0 + -2
            if (r7 < 0) goto L_0x0049
            r6 = 0
        L_0x0017:
            r15 = r8[r6]
            long r3 = X.AnonymousClass001.A0q(r15)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0050
            int r0 = X.AnonymousClass000.A0D(r6, r7)
            r5 = 8
            int r4 = 8 - r0
            r3 = 0
        L_0x0030:
            if (r3 >= r4) goto L_0x004e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004a
            int r0 = r6 << 3
            int r0 = r0 + r3
            r0 = r9[r0]
            r1 = r18
            if (r0 == r1) goto L_0x004a
            X.0jk r10 = new X.0jk
            r10.<init>(r11, r12, r1)
        L_0x0049:
            return r10
        L_0x004a:
            long r15 = r15 >> r5
            int r3 = r3 + 1
            goto L_0x0030
        L_0x004e:
            if (r4 != r5) goto L_0x0049
        L_0x0050:
            if (r6 == r7) goto L_0x0049
            int r6 = r6 + 1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05660Vf.A00(int):X.0jk");
    }

    public final void A01() {
        C16660sn r1 = this.A05;
        if (r1 != null) {
            ((AnonymousClass0VT) r1).A02 = true;
        }
        this.A05 = null;
        this.A02 = null;
        this.A03 = null;
    }

    public final void A02(C17130tn r3) {
        AnonymousClass1OS r1 = this.A06;
        if (r1 != null) {
            r1.invoke(r3, 1);
            return;
        }
        throw AnonymousClass000.A0n("Invalid restart scope");
    }

    public final boolean A04() {
        return AnonymousClass000.A1W(this.A06);
    }

    public void A03(AnonymousClass1OS r1) {
        this.A06 = r1;
    }
}
