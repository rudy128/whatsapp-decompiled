package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Logger;

public abstract class DMr implements EEC {
    public static final C6S A00;
    public static final Logger A01;
    public static final boolean A02 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Object A03 = C17880vN.A0p();
    public volatile C25565Ci3 listeners;
    public volatile Object value;
    public volatile C25531ChT waiters;

    private void A01(C25531ChT chT) {
        chT.thread = null;
        while (true) {
            C25531ChT chT2 = this.waiters;
            if (chT2 != C25531ChT.A00) {
                C25531ChT chT3 = null;
                while (chT2 != null) {
                    C25531ChT chT4 = chT2.next;
                    if (chT2.thread != null) {
                        chT3 = chT2;
                    } else if (chT3 != null) {
                        chT3.next = chT4;
                        if (chT3.thread == null) {
                        }
                    } else if (!A00.A01(chT2, chT4, this)) {
                    }
                    chT2 = chT4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (((X.C25547Chl) r1).A01 == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.DMr r6) {
        /*
            r5 = 0
        L_0x0001:
            X.ChT r1 = r6.waiters
            X.C6S r3 = A00
            X.ChT r0 = X.C25531ChT.A00
            boolean r0 = r3.A01(r1, r0, r6)
            if (r0 == 0) goto L_0x0001
        L_0x000d:
            if (r1 == 0) goto L_0x001b
            java.lang.Thread r0 = r1.thread
            if (r0 == 0) goto L_0x0018
            r1.thread = r5
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L_0x0018:
            X.ChT r1 = r1.next
            goto L_0x000d
        L_0x001b:
            boolean r0 = r6 instanceof X.BJN
            if (r0 == 0) goto L_0x0035
            r0 = r6
            X.BJN r0 = (X.BJN) r0
            java.util.concurrent.ScheduledFuture r2 = r0.A00
            java.lang.Object r1 = r0.value
            boolean r0 = r1 instanceof X.C25547Chl
            if (r0 == 0) goto L_0x0031
            X.Chl r1 = (X.C25547Chl) r1
            boolean r1 = r1.A01
            r0 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r2.cancel(r0)
        L_0x0035:
            X.Ci3 r1 = r6.listeners
            X.Ci3 r0 = X.C25565Ci3.A03
            boolean r0 = r3.A00(r1, r0, r6)
            if (r0 == 0) goto L_0x0035
        L_0x003f:
            if (r1 == 0) goto L_0x0048
            X.Ci3 r0 = r1.A00
            r1.A00 = r5
            r5 = r1
            r1 = r0
            goto L_0x003f
        L_0x0048:
            if (r5 == 0) goto L_0x005c
            X.Ci3 r4 = r5.A00
            java.lang.Runnable r3 = r5.A01
            java.util.concurrent.Executor r2 = r5.A02
            r2.execute(r3)     // Catch:{ RuntimeException -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r1 = move-exception
            java.util.logging.Logger r0 = A01
            X.BEB.A1I(r3, r2, r1, r0)
        L_0x005a:
            r5 = r4
            goto L_0x0048
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMr.A02(X.DMr):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.BJK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.BJK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.BJK} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r0 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r1, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            A02 = r0
            java.lang.Class<X.DMr> r3 = X.DMr.class
            java.util.logging.Logger r0 = X.BE7.A0w(r3)
            A01 = r0
            java.lang.Class<X.ChT> r2 = X.C25531ChT.class
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r0 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0042 }
            java.lang.Class<X.Ci3> r1 = X.C25565Ci3.class
            java.lang.String r0 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0042 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r0 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0042 }
            X.BJK r4 = new X.BJK     // Catch:{ all -> 0x0042 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0042 }
            goto L_0x0049
        L_0x0042:
            r3 = move-exception
            X.BJJ r4 = new X.BJJ
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
        throw new UnsupportedOperationException("Method not decompiled: X.DMr.<clinit>():void");
    }

    public static Object A00(Object obj) {
        if (obj instanceof C25547Chl) {
            Throwable th = ((C25547Chl) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C25492Cgn) {
            throw new ExecutionException(((C25492Cgn) obj).A00);
        } else if (obj == A03) {
            return null;
        } else {
            return obj;
        }
    }

    public void A03(Throwable th) {
        if (A00.A02(this, new C25492Cgn(th))) {
            A02(this);
        }
    }

    public boolean A04(Object obj) {
        if (obj == null) {
            obj = A03;
        }
        if (!A00.A02(this, obj)) {
            return false;
        }
        A02(this);
        return true;
    }

    public final void BBG(Runnable runnable, Executor executor) {
        if (runnable == null) {
            throw BE6.A0m();
        } else if (executor != null) {
            C25565Ci3 ci3 = this.listeners;
            C25565Ci3 ci32 = C25565Ci3.A03;
            if (ci3 != ci32) {
                C25565Ci3 ci33 = new C25565Ci3(runnable, executor);
                do {
                    ci33.A00 = ci3;
                    if (!A00.A00(ci3, ci33, this)) {
                        ci3 = this.listeners;
                    } else {
                        return;
                    }
                } while (ci3 != ci32);
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
        C25547Chl chl;
        if (this.value != null) {
            return false;
        }
        if (A02) {
            C25547Chl chl2 = C25547Chl.A02;
            chl = new C25547Chl(new CancellationException("Future.cancel() was called."), z);
        } else if (z) {
            chl = C25547Chl.A03;
        } else {
            chl = C25547Chl.A02;
        }
        if (!A00.A02(this, chl)) {
            return false;
        }
        A02(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        if (r2 > 1000) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            r18 = this;
            r2 = r19
            r7 = r21
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x0141
            r8 = r18
            java.lang.Object r4 = r8.value
            if (r4 == 0) goto L_0x0019
            java.lang.Object r0 = A00(r4)
            return r0
        L_0x0019:
            r16 = 0
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x0057
            long r14 = java.lang.System.nanoTime()
            long r14 = r14 + r0
        L_0x0024:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0074
            X.ChT r10 = r8.waiters
            X.ChT r9 = X.C25531ChT.A00
            if (r10 == r9) goto L_0x0047
            X.ChT r6 = new X.ChT
            r6.<init>()
        L_0x0035:
            X.C6S r5 = A00
            boolean r4 = r5 instanceof X.BJJ
            if (r4 == 0) goto L_0x004e
            r6.next = r10
        L_0x003d:
            boolean r4 = r5.A01(r10, r6, r8)
            if (r4 != 0) goto L_0x005a
            X.ChT r10 = r8.waiters
            if (r10 != r9) goto L_0x0035
        L_0x0047:
            java.lang.Object r0 = r8.value
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x004e:
            r4 = r5
            X.BJK r4 = (X.BJK) r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = r4.A02
            r4.lazySet(r6, r10)
            goto L_0x003d
        L_0x0057:
            r14 = 0
            goto L_0x0024
        L_0x005a:
            java.util.concurrent.locks.LockSupport.parkNanos(r8, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0138
            java.lang.Object r0 = r8.value
            if (r0 != 0) goto L_0x0133
            long r4 = java.lang.System.nanoTime()
            long r0 = r14 - r4
            int r4 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x005a
            r8.A01(r6)
        L_0x0074:
            int r4 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x008f
            java.lang.Object r0 = r8.value
            if (r0 != 0) goto L_0x0133
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0089
            long r4 = java.lang.System.nanoTime()
            long r0 = r14 - r4
            goto L_0x0074
        L_0x0089:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x008f:
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
            if (r2 >= 0) goto L_0x010b
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r11 = X.AnonymousClass000.A0y(r2, r3)
            long r2 = -r0
            long r5 = X.BE6.A0N(r2, r7)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00d2
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            r7 = 0
            if (r0 <= 0) goto L_0x00d3
        L_0x00d2:
            r7 = 1
        L_0x00d3:
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f2
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r11)
            r0.append(r5)
            java.lang.String r0 = X.AnonymousClass001.A1H(r9, r10, r0)
            if (r7 == 0) goto L_0x00ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x00ee:
            java.lang.String r11 = X.C17900vP.A0A(r0, r9)
        L_0x00f2:
            if (r7 == 0) goto L_0x0101
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r11 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0101:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
        L_0x010b:
            boolean r0 = r8.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x0124
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0124:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0133:
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x0138:
            r8.A01(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0141:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DMr.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof C25547Chl;
    }

    public final boolean isDone() {
        return true & AnonymousClass000.A1W(this.value);
    }

    public String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        A10.append("[status=");
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    if (this instanceof BJM) {
                        C25113CYi cYi = (C25113CYi) ((BJM) this).A00.A01.get();
                        if (cYi == null) {
                            str3 = "Completer object has been garbage collected, future will fail soon";
                        } else {
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("tag=[");
                            A102.append(cYi.A02);
                            str3 = AnonymousClass000.A0z(A102);
                        }
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
            if (obj == null) {
                C25531ChT chT = this.waiters;
                C25531ChT chT2 = C25531ChT.A00;
                if (chT != chT2) {
                    C25531ChT chT3 = new C25531ChT();
                    while (true) {
                        C6S c6s = A00;
                        if (c6s instanceof BJJ) {
                            chT3.next = chT;
                        } else {
                            ((BJK) c6s).A02.lazySet(chT3, chT);
                        }
                        if (!c6s.A01(chT, chT3, this)) {
                            chT = this.waiters;
                            if (chT == chT2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A01(chT3);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                    obj = this.value;
                } else {
                    obj = this.value;
                }
            }
            return A00(obj);
        }
        throw new InterruptedException();
    }
}
