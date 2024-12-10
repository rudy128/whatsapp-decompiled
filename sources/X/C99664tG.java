package X;

import java.util.ArrayList;

/* renamed from: X.4tG  reason: invalid class name and case insensitive filesystem */
public abstract class C99664tG implements AnonymousClass1G5 {
    public final int A00;
    public final C18560wh A01;
    public final C25691Pg A02;

    public abstract Object A00(C30391dr r1, C108475bl r2);

    public Object BFC(C30391dr r3, AnonymousClass1G2 r4) {
        return AnonymousClass3MX.A13(AnonymousClass1OW.A00(r3, new AnonymousClass57K((C30391dr) null, r4, this)));
    }

    public String toString() {
        ArrayList A0z = C17880vN.A0z(4);
        if (this instanceof AnonymousClass5WO) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("channel=");
            String A0V = C17890vO.A0V(((AnonymousClass5WO) this).A00, A10);
            if (A0V != null) {
                A0z.add(A0V);
            }
        }
        C18560wh r2 = this.A01;
        if (r2 != AnonymousClass1OR.A00) {
            A0z.add(AnonymousClass001.A1E(r2, "context=", AnonymousClass000.A10()));
        }
        int i = this.A00;
        if (i != -3) {
            A0z.add(AnonymousClass001.A1I("capacity=", AnonymousClass000.A10(), i));
        }
        C25691Pg r22 = this.A02;
        if (r22 != C25691Pg.SUSPEND) {
            A0z.add(AnonymousClass001.A1E(r22, "onBufferOverflow=", AnonymousClass000.A10()));
        }
        StringBuilder A102 = AnonymousClass000.A10();
        C17900vP.A0a(this, A102);
        A102.append('[');
        A102.append(C29431cG.A0h(", ", A0z, (C22821Di) null));
        return C17890vO.A0c(A102, ']');
    }

    public C108585bw A01(AnonymousClass1OX r7) {
        C18560wh r5 = this.A01;
        int i = this.A00;
        if (i == -3) {
            i = -2;
        }
        C25691Pg r1 = this.A02;
        Integer num = AnonymousClass00R.A0C;
        AnonymousClass55R r3 = new AnonymousClass55R((C30391dr) null, this);
        AnonymousClass5WI r0 = new AnonymousClass5WI(C30471e0.A02(r5, r7), AnonymousClass4W8.A01(r1, i));
        r0.A11(num, r0, r3);
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1 >= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C23421Fz BLm(X.C18560wh r15, X.C25691Pg r16, int r17) {
        /*
            r14 = this;
            r7 = r17
            r5 = r16
            X.0wh r2 = r14.A01
            X.0wh r3 = r15.plus(r2)
            X.1Pg r0 = X.C25691Pg.SUSPEND
            if (r5 != r0) goto L_0x0024
            int r1 = r14.A00
            r0 = -3
            if (r1 == r0) goto L_0x0022
            if (r7 == r0) goto L_0x0021
            r0 = -2
            if (r1 == r0) goto L_0x0022
            if (r7 == r0) goto L_0x0021
            int r1 = r1 + r17
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < 0) goto L_0x0022
        L_0x0021:
            r7 = r1
        L_0x0022:
            X.1Pg r5 = r14.A02
        L_0x0024:
            boolean r0 = X.C18070vi.A18(r3, r2)
            if (r0 == 0) goto L_0x0033
            int r0 = r14.A00
            if (r7 != r0) goto L_0x0033
            X.1Pg r0 = r14.A02
            if (r5 != r0) goto L_0x0033
            return r14
        L_0x0033:
            r1 = r14
            boolean r0 = r14 instanceof X.AnonymousClass5WN
            if (r0 == 0) goto L_0x0042
            X.5WN r1 = (X.AnonymousClass5WN) r1
            java.lang.Iterable r0 = r1.A00
            X.5WN r2 = new X.5WN
            r2.<init>(r0, r3, r5, r7)
            return r2
        L_0x0042:
            boolean r0 = r14 instanceof X.AnonymousClass5WQ
            if (r0 == 0) goto L_0x0052
            X.5WQ r1 = (X.AnonymousClass5WQ) r1
            X.1nB r4 = r1.A00
            X.1Fz r6 = r1.A00
            X.5WQ r2 = new X.5WQ
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x0052:
            boolean r0 = r14 instanceof X.AnonymousClass5WP
            if (r0 == 0) goto L_0x0060
            X.5WR r1 = (X.AnonymousClass5WR) r1
            X.1Fz r0 = r1.A00
            X.5WP r2 = new X.5WP
            r2.<init>(r3, r5, r0, r7)
            return r2
        L_0x0060:
            boolean r0 = r14 instanceof X.AnonymousClass5WO
            if (r0 == 0) goto L_0x0074
            X.5WO r1 = (X.AnonymousClass5WO) r1
            X.5bw r11 = r1.A00
            boolean r13 = r1.A01
            X.5WO r2 = new X.5WO
            r8 = r2
            r9 = r3
            r10 = r5
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            return r2
        L_0x0074:
            X.5WM r1 = (X.AnonymousClass5WM) r1
            boolean r0 = r1 instanceof X.AnonymousClass5WL
            if (r0 == 0) goto L_0x0084
            X.5WL r1 = (X.AnonymousClass5WL) r1
            X.1OS r0 = r1.A00
            X.5WL r2 = new X.5WL
            r2.<init>(r3, r0, r5, r7)
            return r2
        L_0x0084:
            X.1OS r0 = r1.A00
            X.5WM r2 = new X.5WM
            r2.<init>(r3, r0, r5, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99664tG.BLm(X.0wh, X.1Pg, int):X.1Fz");
    }

    public C99664tG(C18560wh r1, C25691Pg r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }
}
