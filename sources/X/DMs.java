package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

public abstract class DMs implements EEC {
    public static final C6U A00;
    public static final Logger A01;
    public static final boolean A02 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Object A03 = C17880vN.A0p();
    public volatile C25566Ci4 listeners;
    public volatile Object value;
    public volatile C25532ChU waiters;

    private void A02(C25532ChU chU) {
        chU.thread = null;
        while (true) {
            C25532ChU chU2 = this.waiters;
            if (chU2 != C25532ChU.A00) {
                C25532ChU chU3 = null;
                while (chU2 != null) {
                    C25532ChU chU4 = chU2.next;
                    if (chU2.thread != null) {
                        chU3 = chU2;
                    } else if (chU3 != null) {
                        chU3.next = chU4;
                        if (chU3.thread == null) {
                        }
                    } else if (!A00.A01(chU2, chU4, this)) {
                    }
                    chU2 = chU4;
                }
                return;
            }
            return;
        }
    }

    public static void A03(DMs dMs) {
        C25566Ci4 ci4;
        C25566Ci4 ci42 = null;
        while (true) {
            C25532ChU chU = dMs.waiters;
            C6U c6u = A00;
            if (c6u.A01(chU, C25532ChU.A00, dMs)) {
                while (chU != null) {
                    Thread thread = chU.thread;
                    if (thread != null) {
                        chU.thread = null;
                        LockSupport.unpark(thread);
                    }
                    chU = chU.next;
                }
                do {
                    ci4 = dMs.listeners;
                } while (!c6u.A00(ci4, C25566Ci4.A03, dMs));
                while (ci4 != null) {
                    C25566Ci4 ci43 = ci4.A00;
                    ci4.A00 = ci42;
                    ci42 = ci4;
                    ci4 = ci43;
                }
                while (true) {
                    C25566Ci4 ci44 = ci42;
                    if (ci42 != null) {
                        ci42 = ci42.A00;
                        Runnable runnable = ci44.A01;
                        if (C21471Akc.A01(runnable)) {
                            C21471Akc akc = (C21471Akc) runnable;
                            dMs = (DMs) akc.A02;
                            if (dMs.value == akc && c6u.A02(dMs, akc, A00((EEC) akc.A01))) {
                                break;
                            }
                        } else {
                            Executor executor = ci44.A02;
                            try {
                                executor.execute(runnable);
                            } catch (RuntimeException e) {
                                BEB.A1I(runnable, executor, e, A01);
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.BMs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.BMs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.BMs} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r0 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r1, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            A02 = r0
            java.lang.Class<X.DMs> r3 = X.DMs.class
            java.util.logging.Logger r0 = X.BE7.A0w(r3)
            A01 = r0
            java.lang.Class<X.ChU> r2 = X.C25532ChU.class
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r0 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0042 }
            java.lang.Class<X.Ci4> r1 = X.C25566Ci4.class
            java.lang.String r0 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0042 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r0 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0042 }
            X.BMs r4 = new X.BMs     // Catch:{ all -> 0x0042 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0042 }
            goto L_0x0049
        L_0x0042:
            r3 = move-exception
            X.BMr r4 = new X.BMr
            r4.<init>()
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            A00 = r4
            if (r3 == 0) goto L_0x0057
            java.util.logging.Logger r2 = A01
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r0 = "SafeAtomicHelper is broken!"
            r2.log(r1, r0, r3)
        L_0x0057:
            java.lang.Object r0 = X.C17880vN.A0p()
            A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMs.<clinit>():void");
    }

    public static Object A00(EEC eec) {
        Object obj;
        if (eec instanceof DMs) {
            Object obj2 = ((DMs) eec).value;
            if (!(obj2 instanceof C25548Chm)) {
                return obj2;
            }
            C25548Chm chm = (C25548Chm) obj2;
            if (!chm.A01) {
                return obj2;
            }
            Throwable th = chm.A00;
            if (th != null) {
                return new C25548Chm(th, false);
            }
        } else {
            boolean isCancelled = eec.isCancelled();
            if (!(!A02) || !isCancelled) {
                boolean z = false;
                while (true) {
                    try {
                        obj = eec.get();
                        break;
                    } catch (InterruptedException unused) {
                        z = true;
                    } catch (ExecutionException e) {
                        C25494Cgp cgp = C25494Cgp.A01;
                        th = e.getCause();
                        return new C25494Cgp(th);
                    } catch (CancellationException e2) {
                        if (isCancelled) {
                            return new C25548Chm(e2, false);
                        }
                        C25494Cgp cgp2 = C25494Cgp.A01;
                        th = new IllegalArgumentException(AnonymousClass001.A1E(eec, "get() threw CancellationException, despite reporting isCancelled() == false: ", AnonymousClass000.A10()), e2);
                        return new C25494Cgp(th);
                    } catch (Throwable th2) {
                        th = th2;
                        return new C25494Cgp(th);
                    }
                }
                if (z) {
                    AnonymousClass8BS.A0x();
                }
                if (obj == null) {
                    return A03;
                }
                return obj;
            }
        }
        return C25548Chm.A02;
    }

    public static Object A01(Object obj) {
        if (obj instanceof C25548Chm) {
            Throwable th = ((C25548Chm) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C25494Cgp) {
            throw new ExecutionException(((C25494Cgp) obj).A00);
        } else if (obj == A03) {
            return null;
        } else {
            return obj;
        }
    }

    public void A04(EEC eec) {
        C21471Akc akc;
        C6U c6u;
        C25494Cgp cgp;
        if (eec != null) {
            Object obj = this.value;
            if (obj == null) {
                if (eec.isDone()) {
                    if (A00.A02(this, (Object) null, A00(eec))) {
                        A03(this);
                        return;
                    }
                    return;
                }
                akc = new C21471Akc((Object) eec, (Object) this, 29);
                c6u = A00;
                if (c6u.A02(this, (Object) null, akc)) {
                    try {
                        eec.BBG(akc, C19.A01);
                        return;
                    } catch (Throwable unused) {
                        cgp = C25494Cgp.A01;
                    }
                } else {
                    obj = this.value;
                }
            }
            if (obj instanceof C25548Chm) {
                eec.cancel(((C25548Chm) obj).A01);
                return;
            }
            return;
        }
        throw BE6.A0m();
        c6u.A02(this, akc, cgp);
    }

    public void A05(Object obj) {
        if (obj == null) {
            obj = A03;
        }
        if (A00.A02(this, (Object) null, obj)) {
            A03(this);
        }
    }

    public void A06(Throwable th) {
        C25494Cgp cgp = C25494Cgp.A01;
        if (th != null) {
            if (A00.A02(this, (Object) null, new C25494Cgp(th))) {
                A03(this);
                return;
            }
            return;
        }
        throw BE6.A0m();
    }

    public final void BBG(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw BE6.A0m();
        } else if (executor != null) {
            C25566Ci4 ci4 = this.listeners;
            C25566Ci4 ci42 = C25566Ci4.A03;
            if (ci4 != ci42) {
                C25566Ci4 ci43 = new C25566Ci4(runnable, executor);
                do {
                    ci43.A00 = ci4;
                    if (!A00.A00(ci4, ci43, this)) {
                        ci4 = this.listeners;
                    } else {
                        return;
                    }
                } while (ci4 != ci42);
            }
            try {
                executor.execute(runnable);
            } catch (RuntimeException e) {
                BEB.A1I(runnable, executor, e, A01);
            }
        } else {
            throw BE6.A0m();
        }
    }

    public final boolean cancel(boolean z) {
        C25548Chm chm;
        Object obj = this.value;
        if (!AnonymousClass000.A1X(obj) && !C21471Akc.A01(obj)) {
            return false;
        }
        if (A02) {
            C25548Chm chm2 = C25548Chm.A02;
            chm = new C25548Chm(new CancellationException("Future.cancel() was called."), z);
        } else if (z) {
            chm = C25548Chm.A03;
        } else {
            chm = C25548Chm.A02;
        }
        boolean z2 = false;
        DMs dMs = this;
        while (true) {
            if (A00.A02(dMs, obj, chm)) {
                A03(dMs);
                if (!C21471Akc.A01(obj)) {
                    break;
                }
                EEC eec = (EEC) ((C21471Akc) obj).A01;
                if (!(eec instanceof DMs)) {
                    eec.cancel(z);
                    break;
                }
                dMs = (DMs) eec;
                obj = dMs.value;
                if (!AnonymousClass000.A1X(obj) && !C21471Akc.A01(obj)) {
                    break;
                }
                z2 = true;
            } else {
                obj = dMs.value;
                if (!C21471Akc.A01(obj)) {
                    return z2;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f1, code lost:
        if (r2 > 1000) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            r18 = this;
            r2 = r19
            r7 = r21
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0162
            r8 = r18
            java.lang.Object r6 = r8.value
            boolean r5 = X.AnonymousClass000.A1W(r6)
            boolean r4 = X.C21471Akc.A01(r6)
            r4 = r4 ^ 1
            r5 = r5 & r4
            if (r5 == 0) goto L_0x0024
            java.lang.Object r0 = A01(r6)
            return r0
        L_0x0024:
            r16 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x0062
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 + r0
        L_0x002f:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x008a
            X.ChU r10 = r8.waiters
            X.ChU r9 = X.C25532ChU.A00
            if (r10 == r9) goto L_0x0052
            X.ChU r6 = new X.ChU
            r6.<init>()
        L_0x0040:
            X.C6U r5 = A00
            boolean r4 = r5 instanceof X.C22729BMr
            if (r4 == 0) goto L_0x0059
            r6.next = r10
        L_0x0048:
            boolean r4 = r5.A01(r10, r6, r8)
            if (r4 != 0) goto L_0x0065
            X.ChU r10 = r8.waiters
            if (r10 != r9) goto L_0x0040
        L_0x0052:
            java.lang.Object r0 = r8.value
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x0059:
            r4 = r5
            X.BMs r4 = (X.C22730BMs) r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = r4.A02
            r4.lazySet(r6, r10)
            goto L_0x0048
        L_0x0062:
            r14 = 0
            goto L_0x002f
        L_0x0065:
            java.util.concurrent.locks.LockSupport.parkNanos(r8, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0159
            java.lang.Object r4 = r8.value
            boolean r1 = X.AnonymousClass000.A1W(r4)
            boolean r0 = X.C21471Akc.A01(r4)
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0154
            long r4 = java.lang.System.nanoTime()
            long r0 = r14 - r4
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x0065
            r8.A02(r6)
        L_0x008a:
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b0
            java.lang.Object r4 = r8.value
            boolean r1 = X.AnonymousClass000.A1W(r4)
            boolean r0 = X.C21471Akc.A01(r4)
            r0 = r0 ^ 1
            r1 = r1 & r0
            if (r1 != 0) goto L_0x0154
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x00aa
            long r4 = java.lang.System.nanoTime()
            long r0 = r14 - r4
            goto L_0x008a
        L_0x00aa:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x00b0:
            java.lang.String r4 = r8.toString()
            java.lang.String r6 = r7.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r10 = r6.toLowerCase(r5)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r5 = "Waited "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r9 = " "
            java.lang.String r3 = X.AnonymousClass001.A1H(r9, r10, r6)
            long r5 = r0 + r12
            int r2 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r2 >= 0) goto L_0x012c
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r11 = X.AnonymousClass000.A0y(r2, r3)
            long r2 = -r0
            long r5 = X.BE6.A0N(r2, r7)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00f3
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            r7 = 0
            if (r0 <= 0) goto L_0x00f4
        L_0x00f3:
            r7 = 1
        L_0x00f4:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0113
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r11)
            r0.append(r5)
            java.lang.String r0 = X.AnonymousClass001.A1H(r9, r10, r0)
            if (r7 == 0) goto L_0x010f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x010f:
            java.lang.String r11 = X.C17900vP.A0A(r0, r9)
        L_0x0113:
            if (r7 == 0) goto L_0x0122
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r11 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0122:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
        L_0x012c:
            boolean r0 = r8.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x0145
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0145:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0154:
            java.lang.Object r0 = A01(r4)
            return r0
        L_0x0159:
            r8.A02(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0162:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMs.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C25548Chm;
    }

    public final boolean isDone() {
        Object obj = this.value;
        return (!C21471Akc.A01(obj)) & AnonymousClass000.A1W(obj);
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        String valueOf;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        A10.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    Object obj2 = this.value;
                    if (C21471Akc.A01(obj2)) {
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("setFuture=[");
                        EEC eec = (EEC) ((C21471Akc) obj2).A01;
                        if (eec == this) {
                            valueOf = "this future";
                        } else {
                            valueOf = String.valueOf(eec);
                        }
                        str3 = AnonymousClass001.A1H(valueOf, "]", A102);
                    } else if (this instanceof ScheduledFuture) {
                        str3 = AnonymousClass000.A0y(" ms]", BEB.A0h(this));
                    } else {
                        str3 = null;
                    }
                } catch (RuntimeException e) {
                    StringBuilder A103 = AnonymousClass000.A10();
                    BE9.A1G(e, "Exception thrown from implementation: ", A103);
                    str3 = A103.toString();
                }
                if (str3 != null && !str3.isEmpty()) {
                    C17890vO.A10("PENDING, info=[", str3, "]", A10);
                    return AnonymousClass000.A0y("]", A10);
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            boolean z = false;
            while (true) {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e2) {
                    A10.append("FAILURE, cause=[");
                    A10.append(e2.getCause());
                    A10.append("]");
                } catch (CancellationException unused2) {
                    str = "CANCELLED";
                } catch (RuntimeException e3) {
                    BE9.A1G(e3, "UNKNOWN, cause=[", A10);
                    str = " thrown from get()]";
                } catch (Throwable th) {
                    if (z) {
                        AnonymousClass8BS.A0x();
                    }
                    throw th;
                }
            }
            if (z) {
                AnonymousClass8BS.A0x();
            }
            A10.append("SUCCESS, result=[");
            if (obj == this) {
                str2 = "this future";
            } else {
                str2 = String.valueOf(obj);
            }
            A10.append(str2);
            A10.append("]");
            return AnonymousClass000.A0y("]", A10);
        }
        A10.append(str);
        return AnonymousClass000.A0y("]", A10);
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (!AnonymousClass000.A1W(obj) || !(!C21471Akc.A01(obj))) {
                C25532ChU chU = this.waiters;
                C25532ChU chU2 = C25532ChU.A00;
                if (chU != chU2) {
                    C25532ChU chU3 = new C25532ChU();
                    while (true) {
                        C6U c6u = A00;
                        if (c6u instanceof C22729BMr) {
                            chU3.next = chU;
                        } else {
                            ((C22730BMs) c6u).A02.lazySet(chU3, chU);
                        }
                        if (!c6u.A01(chU, chU3, this)) {
                            chU = this.waiters;
                            if (chU == chU2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A02(chU3);
                                    throw new InterruptedException();
                                }
                            } while (!(AnonymousClass000.A1W(obj) & (!C21471Akc.A01(obj))));
                        }
                    }
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
