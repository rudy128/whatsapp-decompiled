package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1eD  reason: invalid class name and case insensitive filesystem */
public abstract class C30601eD extends C30591eC {
    public int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r8.A15() != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a5, code lost:
        if (r8.A15() != false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            r9 = r10
            boolean r6 = r10 instanceof X.C30611eE     // Catch:{ all -> 0x00ab }
            if (r6 == 0) goto L_0x0025
            r1 = r9
            X.1eE r1 = (X.C30611eE) r1     // Catch:{ all -> 0x00ab }
        L_0x0008:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x00ab }
            X.1eE r1 = (X.C30611eE) r1     // Catch:{ all -> 0x00ab }
            X.1dr r5 = r1.A02     // Catch:{ all -> 0x00ab }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00ab }
            X.0wh r3 = r5.getContext()     // Catch:{ all -> 0x00ab }
            java.lang.Object r2 = X.C30631eG.A00(r0, r3)     // Catch:{ all -> 0x00ab }
            X.1I8 r0 = X.C30631eG.A00     // Catch:{ all -> 0x00ab }
            r4 = 0
            if (r2 == r0) goto L_0x002b
            X.1wp r8 = X.C30471e0.A03(r2, r5, r3)     // Catch:{ all -> 0x00ab }
            goto L_0x002c
        L_0x0025:
            r0 = r9
            X.1g7 r0 = (X.C31781g7) r0     // Catch:{ all -> 0x00ab }
            X.1dr r1 = r0.A00     // Catch:{ all -> 0x00ab }
            goto L_0x0008
        L_0x002b:
            r8 = r4
        L_0x002c:
            X.0wh r7 = r5.getContext()     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0046
            X.1eE r9 = (X.C30611eE) r9     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = r9.A00     // Catch:{ all -> 0x009e }
            X.1I8 r0 = X.C30621eF.A01     // Catch:{ all -> 0x009e }
            r9.A00 = r0     // Catch:{ all -> 0x009e }
        L_0x003a:
            java.lang.Throwable r1 = r10.A0B(r6)     // Catch:{ all -> 0x009e }
            if (r1 != 0) goto L_0x0051
            int r1 = r10.A00     // Catch:{ all -> 0x009e }
            r0 = 1
            if (r1 == r0) goto L_0x005a
            goto L_0x004d
        L_0x0046:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C31781g7.A04     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = r0.get(r10)     // Catch:{ all -> 0x009e }
            goto L_0x003a
        L_0x004d:
            r0 = 2
            if (r1 != r0) goto L_0x007d
            goto L_0x005a
        L_0x0051:
            X.1IU r0 = new X.1IU     // Catch:{ all -> 0x009e }
            r0.<init>(r1)     // Catch:{ all -> 0x009e }
            r5.resumeWith(r0)     // Catch:{ all -> 0x009e }
            goto L_0x0078
        L_0x005a:
            X.1OU r0 = X.AnonymousClass1OB.A00     // Catch:{ all -> 0x009e }
            X.0wi r1 = r7.get(r0)     // Catch:{ all -> 0x009e }
            X.1OB r1 = (X.AnonymousClass1OB) r1     // Catch:{ all -> 0x009e }
            if (r1 == 0) goto L_0x007d
            boolean r0 = r1.Be2()     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x007d
            java.util.concurrent.CancellationException r0 = r1.BOI()     // Catch:{ all -> 0x009e }
            r10.A09(r0)     // Catch:{ all -> 0x009e }
            X.1IU r0 = X.C30691eM.A00(r0)     // Catch:{ all -> 0x009e }
            r5.resumeWith(r0)     // Catch:{ all -> 0x009e }
        L_0x0078:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x009e }
            if (r8 == 0) goto L_0x0093
            goto L_0x008d
        L_0x007d:
            boolean r0 = r10 instanceof X.C31781g7     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0089
            boolean r0 = r6 instanceof X.C59682mi     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0089
            X.2mi r6 = (X.C59682mi) r6     // Catch:{ all -> 0x009e }
            java.lang.Object r6 = r6.A01     // Catch:{ all -> 0x009e }
        L_0x0089:
            r5.resumeWith(r6)     // Catch:{ all -> 0x009e }
            goto L_0x0078
        L_0x008d:
            boolean r0 = r8.A15()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x0096
        L_0x0093:
            X.C30631eG.A02(r2, r3)     // Catch:{ all -> 0x00ab }
        L_0x0096:
            java.lang.Throwable r0 = X.C30671eK.A00(r1)
            r10.A0A(r4, r0)
            return
        L_0x009e:
            r1 = move-exception
            if (r8 == 0) goto L_0x00a7
            boolean r0 = r8.A15()     // Catch:{ all -> 0x00ab }
            if (r0 == 0) goto L_0x00aa
        L_0x00a7:
            X.C30631eG.A02(r2, r3)     // Catch:{ all -> 0x00ab }
        L_0x00aa:
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r2 = move-exception
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x00af }
            goto L_0x00b5
        L_0x00af:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x00b5:
            java.lang.Throwable r0 = X.C30671eK.A00(r1)
            r10.A0A(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30601eD.run():void");
    }

    public void A09(Throwable th) {
        if (!(this instanceof C30611eE)) {
            C31781g7 r3 = (C31781g7) this;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C31781g7.A04;
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(r3);
                if (obj instanceof C35941n5) {
                    throw new IllegalStateException("Not completed");
                } else if (!(obj instanceof C30681eL)) {
                    Throwable th2 = th;
                    if (obj instanceof C59682mi) {
                        C59682mi r1 = (C59682mi) obj;
                        if (r1.A02 != null) {
                            throw new IllegalStateException("Must be called at most once");
                        }
                        Object obj2 = r1.A01;
                        AnonymousClass3MV r9 = r1.A04;
                        C22821Di r8 = r1.A03;
                        if (C30561e9.A00(r3, obj, new C59682mi(obj2, r1.A00, th2, r8, r9), atomicReferenceFieldUpdater)) {
                            if (r9 != null) {
                                r3.A0J(th2, r9);
                            }
                            if (r8 != null) {
                                r3.A0I(th2, r8);
                                return;
                            }
                            return;
                        }
                    } else if (C30561e9.A00(r3, obj, new C59682mi(obj, (Object) null, th2, (C22821Di) null, (AnonymousClass3MV) null), atomicReferenceFieldUpdater)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A0A(Throwable th, Throwable th2) {
        C30391dr r1;
        if (th == null) {
            if (th2 != null) {
                th = th2;
            } else {
                return;
            }
        } else if (th2 != null) {
            C25359CeJ.A01(th, th2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        AnonymousClass2RJ r2 = new AnonymousClass2RJ(sb.toString(), th);
        if (this instanceof C30611eE) {
            r1 = (C30611eE) this;
        } else {
            r1 = ((C31781g7) this).A00;
        }
        C181879Se.A00(r1.getContext(), r2);
    }

    public Throwable A0B(Object obj) {
        C30681eL r3;
        if (!(obj instanceof C30681eL) || (r3 = (C30681eL) obj) == null) {
            return null;
        }
        return r3.A00;
    }
}
