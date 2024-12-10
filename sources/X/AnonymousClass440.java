package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.440  reason: invalid class name */
public final class AnonymousClass440 extends AnonymousClass3VT {
    public final AnonymousClass1DS A00;
    public final AnonymousClass1DS A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1M9 A04;
    public final C29681ch A05;
    public final AnonymousClass1CJ A06;
    public final C132876nm A07;

    public final C46162Dk A0U() {
        C86924Tp A022 = this.A02.A02(this.A05);
        if (A022 != null) {
            return A022.A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r5 = r14.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C6U(X.C27581Wq r15, X.AnonymousClass1F9 r16) {
        /*
            r14 = this;
            r0 = r16
            X.C18070vi.A0h(r0, r15)
            super.C6U(r15, r0)
            X.1Wq r0 = X.C27581Wq.ON_RESUME
            if (r15 != r0) goto L_0x005a
            X.1DT r5 = r14.A02
            java.util.List r0 = X.AnonymousClass3MW.A10(r5)
            if (r0 == 0) goto L_0x005a
            java.util.ArrayList r4 = X.C29351c6.A0D(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x001c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0057
            java.lang.Object r6 = r7.next()
            X.6s7 r6 = (X.C135386s7) r6
            X.2Dk r10 = r6.A02
            X.1CJ r1 = r14.A06
            X.1ch r0 = r10.A0M()
            X.1ci r1 = r1.A0A(r0)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0054
            X.2Dk r1 = (X.C46162Dk) r1
            if (r1 == 0) goto L_0x0054
            X.9Ig r9 = r1.A02
        L_0x003e:
            r8 = 0
            r12 = 0
            r11 = -16385(0xffffffffffffbfff, float:NaN)
            X.2Dk r3 = X.C46162Dk.A00(r8, r9, r10, r11, r12)
            X.1E7 r2 = r6.A00
            boolean r1 = r6.A01
            X.6s7 r0 = new X.6s7
            r0.<init>(r3, r2, r1)
            r4.add(r0)
            goto L_0x001c
        L_0x0054:
            X.9Ig r9 = r10.A02
            goto L_0x003e
        L_0x0057:
            r5.A0E(r4)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass440.C6U(X.1Wq, X.1F9):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass440(AnonymousClass1M9 r2, AnonymousClass1CJ r3, C29681ch r4, C175308yV r5, C95424mD r6, C35681md r7, C1601287f r8) {
        super(r5, r6, r7);
        C18070vi.A0w(r6, r7, r5, r8, r2);
        C18070vi.A0d(r3, 6);
        this.A04 = r2;
        this.A06 = r3;
        this.A05 = r4;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A03 = A0L;
        this.A01 = A0L;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A02 = A0L2;
        this.A00 = A0L2;
        this.A07 = r8.BGa(C41561wd.A00(this));
    }

    public final void A0V(C46162Dk r7, Integer num, Long l, C18090vk r10) {
        Object obj;
        AnonymousClass1BI A08 = r7.A08();
        C18070vi.A0X(A08);
        AnonymousClass1DT r4 = this.A02;
        List A10 = AnonymousClass3MW.A10(r4);
        if (A10 != null) {
            Iterator it = A10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((C135386s7) obj).A02.A08(), A08)) {
                    break;
                }
            }
            C135386s7 r2 = (C135386s7) obj;
            if (r2 != null) {
                r2.A01 = true;
                C137196v4.A00(r4);
                this.A07.A00(r7, num, l, new AnonymousClass5VR(this, r2, r10));
            }
        }
    }

    public void Bkr(C29681ch r2, Integer num, Throwable th) {
        AnonymousClass1BI r0;
        C46162Dk A0U = A0U();
        if (A0U != null) {
            r0 = A0U.A08();
        } else {
            r0 = null;
        }
        if (C18070vi.A18(r2, r0)) {
            super.Bkr(r2, num, th);
        }
    }

    public void Bkv(C29681ch r2, Integer num) {
        AnonymousClass1BI r0;
        C46162Dk A0U = A0U();
        if (A0U != null) {
            r0 = A0U.A08();
        } else {
            r0 = null;
        }
        if (C18070vi.A18(r2, r0)) {
            super.Bkv(r2, num);
        }
    }
}
