package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1Fv  reason: invalid class name and case insensitive filesystem */
public abstract class C23381Fv {
    public AtomicReference A00 = new AtomicReference();

    public C23401Fx A04() {
        return ((C23391Fw) this).A02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.1GC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.1GC} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.1GD, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r7.A04 != false) goto L_0x004e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C218317o r10) {
        /*
            r9 = this;
            r7 = r9
            X.1Fw r7 = (X.C23391Fw) r7
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.String r0 = "addObserver"
            X.C23391Fw.A03(r0)
            X.1Fx r0 = r7.A02
            X.1Fx r6 = X.C23401Fx.DESTROYED
            if (r0 == r6) goto L_0x0014
            X.1Fx r6 = X.C23401Fx.INITIALIZED
        L_0x0014:
            r2 = r10
            X.1GD r5 = new X.1GD
            r5.<init>()
            r8 = 0
            boolean r1 = r10 instanceof X.AnonymousClass1GC
            boolean r0 = r10 instanceof X.AnonymousClass1GE
            if (r1 == 0) goto L_0x00af
            if (r0 == 0) goto L_0x0107
            r0 = r2
            X.1GE r0 = (X.AnonymousClass1GE) r0
            X.1GC r2 = (X.AnonymousClass1GC) r2
            X.1q6 r1 = new X.1q6
            r1.<init>(r0, r2)
        L_0x002d:
            X.1GC r1 = (X.AnonymousClass1GC) r1
        L_0x002f:
            r5.A01 = r1
            r5.A00 = r6
            X.01G r0 = r7.A01
            java.lang.Object r0 = r0.A02(r10, r5)
            if (r0 != 0) goto L_0x011e
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.1F9 r4 = (X.AnonymousClass1F9) r4
            if (r4 == 0) goto L_0x011e
            int r0 = r7.A00
            if (r0 != 0) goto L_0x004e
            boolean r0 = r7.A04
            r6 = 0
            if (r0 == 0) goto L_0x004f
        L_0x004e:
            r6 = 1
        L_0x004f:
            X.1Fx r1 = X.C23391Fw.A00(r10, r7)
            int r0 = r7.A00
            int r0 = r0 + 1
            r7.A00 = r0
        L_0x0059:
            X.1Fx r0 = r5.A00
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x0113
            X.01G r0 = r7.A01
            java.util.HashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r10)
            if (r0 == 0) goto L_0x0113
            X.1Fx r3 = r5.A00
            java.util.ArrayList r2 = r7.A03
            r2.add(r3)
            int r1 = r3.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0099
            r0 = 3
            if (r1 == r0) goto L_0x0096
            r0 = 1
            if (r1 == r0) goto L_0x009c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "no event up from "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0096:
            X.1Wq r0 = X.C27581Wq.ON_RESUME
            goto L_0x009e
        L_0x0099:
            X.1Wq r0 = X.C27581Wq.ON_START
            goto L_0x009e
        L_0x009c:
            X.1Wq r0 = X.C27581Wq.ON_CREATE
        L_0x009e:
            r5.A00(r0, r4)
            int r0 = r2.size()
            int r0 = r0 + -1
            r2.remove(r0)
            X.1Fx r1 = X.C23391Fw.A00(r10, r7)
            goto L_0x0059
        L_0x00af:
            if (r0 == 0) goto L_0x00bb
            X.1GE r2 = (X.AnonymousClass1GE) r2
            r0 = 0
            X.1q6 r1 = new X.1q6
            r1.<init>(r2, r0)
            goto L_0x002d
        L_0x00bb:
            java.lang.Class r2 = r10.getClass()
            X.CsD r0 = X.C26093CsD.A00
            int r1 = X.C26093CsD.A00(r0, r2)
            r0 = 2
            if (r1 != r0) goto L_0x010c
            java.util.Map r0 = X.C26093CsD.A01
            java.lang.Object r4 = r0.get(r2)
            X.C18070vi.A0b(r4)
            java.util.List r4 = (java.util.List) r4
            int r1 = r4.size()
            r3 = 0
            r0 = 1
            if (r1 != r0) goto L_0x00eb
            java.lang.Object r0 = r4.get(r8)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            X.C26093CsD.A01(r10, r0)
            X.2vd r1 = new X.2vd
            r1.<init>()
            goto L_0x002d
        L_0x00eb:
            int r2 = r4.size()
            X.E0I[] r1 = new X.E0I[r2]
        L_0x00f1:
            if (r3 >= r2) goto L_0x0102
            java.lang.Object r0 = r4.get(r3)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            X.C26093CsD.A01(r10, r0)
            r0 = 0
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x00f1
        L_0x0102:
            X.2ve r2 = new X.2ve
            r2.<init>(r1)
        L_0x0107:
            X.1GC r2 = (X.AnonymousClass1GC) r2
            r1 = r2
            goto L_0x002f
        L_0x010c:
            X.D6i r1 = new X.D6i
            r1.<init>(r10)
            goto L_0x002d
        L_0x0113:
            if (r6 != 0) goto L_0x0118
            X.C23391Fw.A02(r7)
        L_0x0118:
            int r0 = r7.A00
            int r0 = r0 + -1
            r7.A00 = r0
        L_0x011e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23381Fv.A05(X.17o):void");
    }

    public void A06(C218317o r3) {
        C18070vi.A0d(r3, 0);
        C23391Fw.A03("removeObserver");
        ((C23391Fw) this).A01.A01(r3);
    }
}
