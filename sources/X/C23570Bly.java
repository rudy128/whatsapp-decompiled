package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;

/* renamed from: X.Bly  reason: case insensitive filesystem */
public abstract class C23570Bly extends C4A implements EEC {
    public static final C24492C6k A00;
    public static final C25060CVs A01;
    public static final boolean A02;
    public static final Object A03 = C17880vN.A0p();
    public volatile C25948CpG listeners;
    public volatile Object value;
    public volatile C25543Chg waiters;

    private void A01(C25543Chg chg) {
        chg.thread = null;
        while (true) {
            C25543Chg chg2 = this.waiters;
            if (chg2 != C25543Chg.A00) {
                C25543Chg chg3 = null;
                while (chg2 != null) {
                    C25543Chg chg4 = chg2.next;
                    if (chg2.thread != null) {
                        chg3 = chg2;
                    } else if (chg3 != null) {
                        chg3.next = chg4;
                        if (chg3.thread == null) {
                        }
                    } else if (!A00.A03(chg2, chg4, this)) {
                    }
                    chg2 = chg4;
                }
                return;
            }
            return;
        }
    }

    public static void A02(C23570Bly bly) {
        C25543Chg chg;
        C25948CpG cpG;
        C25948CpG cpG2 = null;
        C24492C6k c6k = A00;
        C25543Chg chg2 = C25543Chg.A00;
        boolean z = c6k instanceof C23568Blw;
        if (z) {
            do {
                chg = bly.waiters;
                if (chg2 == chg) {
                    break;
                }
            } while (c6k.A03(chg, chg2, bly));
        } else if (c6k instanceof C23566Blu) {
            synchronized (bly) {
                chg = bly.waiters;
                if (chg != chg2) {
                    bly.waiters = chg2;
                }
            }
        } else {
            chg = (C25543Chg) ((C23567Blv) c6k).A04.getAndSet(bly, chg2);
        }
        while (chg != null) {
            Thread thread = chg.thread;
            if (thread != null) {
                chg.thread = null;
                LockSupport.unpark(thread);
            }
            chg = chg.next;
        }
        C25948CpG cpG3 = C25948CpG.A03;
        if (z) {
            do {
                cpG = bly.listeners;
                if (cpG3 == cpG) {
                    break;
                }
            } while (c6k.A02(cpG, cpG3, bly));
        } else if (c6k instanceof C23566Blu) {
            synchronized (bly) {
                cpG = bly.listeners;
                if (cpG != cpG3) {
                    bly.listeners = cpG3;
                }
            }
        } else {
            cpG = (C25948CpG) ((C23567Blv) c6k).A00.getAndSet(bly, cpG3);
        }
        while (cpG != null) {
            C25948CpG cpG4 = cpG.A00;
            cpG.A00 = cpG2;
            cpG2 = cpG;
            cpG = cpG4;
        }
        while (cpG2 != null) {
            C25948CpG cpG5 = cpG2.A00;
            Runnable runnable = cpG2.A01;
            runnable.getClass();
            Executor executor = cpG2.A02;
            executor.getClass();
            try {
                executor.execute(runnable);
            } catch (Exception e) {
                BEB.A1I(runnable, executor, e, A01.A00());
            }
            cpG2 = cpG5;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.Blv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.Blv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.Blv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.Blv} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r0 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r1, r0)     // Catch:{ SecurityException -> 0x000d }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ SecurityException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            A02 = r0
            java.lang.Class<X.Bly> r2 = X.C23570Bly.class
            X.CVs r0 = new X.CVs
            r0.<init>(r2)
            A01 = r0
            r4 = 0
            X.Blw r6 = new X.Blw     // Catch:{ Error | Exception -> 0x0021 }
            r6.<init>()     // Catch:{ Error | Exception -> 0x0021 }
            r5 = r4
            goto L_0x0054
        L_0x0021:
            r5 = move-exception
            java.lang.Class<X.Chg> r3 = X.C25543Chg.class
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r0 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ Error | Exception -> 0x004e }
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r3, r0)     // Catch:{ Error | Exception -> 0x004e }
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r3, r0)     // Catch:{ Error | Exception -> 0x004e }
            java.lang.Class<X.CpG> r1 = X.C25948CpG.class
            java.lang.String r0 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r10 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ Error | Exception -> 0x004e }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r0 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ Error | Exception -> 0x004e }
            X.Blv r6 = new X.Blv     // Catch:{ Error | Exception -> 0x004e }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Error | Exception -> 0x004e }
            goto L_0x0054
        L_0x004e:
            r4 = move-exception
            X.Blu r6 = new X.Blu
            r6.<init>()
        L_0x0054:
            A00 = r6
            if (r4 == 0) goto L_0x006e
            X.CVs r3 = A01
            java.util.logging.Logger r1 = r3.A00()
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r0 = "UnsafeAtomicHelper is broken!"
            r1.log(r2, r0, r5)
            java.util.logging.Logger r1 = r3.A00()
            java.lang.String r0 = "SafeAtomicHelper is broken!"
            r1.log(r2, r0, r4)
        L_0x006e:
            java.lang.Object r0 = X.C17880vN.A0p()
            A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23570Bly.<clinit>():void");
    }

    public static Object A00(Object obj) {
        if (obj instanceof C25512ChA) {
            Throwable th = ((C25512ChA) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C25506Ch4) {
            throw new ExecutionException(((C25506Ch4) obj).A00);
        } else if (obj == A03) {
            return null;
        } else {
            return obj;
        }
    }

    public void A03(Object obj) {
        if (obj == null) {
            obj = A03;
        }
        if (A00.A04(this, obj)) {
            A02(this);
        }
    }

    public void A04(Throwable th) {
        if (A00.A04(this, new C25506Ch4(th))) {
            A02(this);
        }
    }

    public void BBG(Runnable runnable, Executor executor) {
        C25948CpG cpG;
        C25948CpG cpG2;
        C199610h.A05(runnable, "Runnable was null.");
        C199610h.A05(executor, "Executor was null.");
        if (isDone() || (cpG = this.listeners) == (cpG2 = C25948CpG.A03)) {
            try {
                executor.execute(runnable);
            } catch (Exception e) {
                BEB.A1I(runnable, executor, e, A01.A00());
            }
        } else {
            C25948CpG cpG3 = new C25948CpG(runnable, executor);
            do {
                cpG3.A00 = cpG;
                if (!A00.A02(cpG, cpG3, this)) {
                    cpG = this.listeners;
                } else {
                    return;
                }
            } while (cpG != cpG2);
            executor.execute(runnable);
        }
    }

    public boolean cancel(boolean z) {
        C25512ChA chA;
        if (this.value != null) {
            return false;
        }
        if (A02) {
            C25512ChA chA2 = C25512ChA.A01;
            chA = new C25512ChA(new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                chA = C25512ChA.A02;
            } else {
                chA = C25512ChA.A01;
            }
            chA.getClass();
        }
        if (!A00.A04(this, chA)) {
            return false;
        }
        A02(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        if (r2 > 1000) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object get(long r16, java.util.concurrent.TimeUnit r18) {
        /*
            r15 = this;
            r2 = r16
            r7 = r18
            long r0 = r7.toNanos(r2)
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x013f
            java.lang.Object r4 = r15.value
            if (r4 == 0) goto L_0x0017
            java.lang.Object r0 = A00(r4)
            return r0
        L_0x0017:
            r13 = 0
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x004c
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r0
        L_0x0022:
            r11 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x0072
            X.Chg r8 = r15.waiters
            X.Chg r5 = X.C25543Chg.A00
            if (r8 == r5) goto L_0x0042
            X.Chg r6 = new X.Chg
            r6.<init>()
        L_0x0033:
            X.C6k r4 = A00
            r4.A00(r6, r8)
            boolean r4 = r4.A03(r8, r6, r15)
            if (r4 != 0) goto L_0x004f
            X.Chg r8 = r15.waiters
            if (r8 != r5) goto L_0x0033
        L_0x0042:
            java.lang.Object r0 = r15.value
            r0.getClass()
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x004c:
            r9 = 0
            goto L_0x0022
        L_0x004f:
            r4 = 2147483647999999999(0x1dcd64ffffffffff, double:3.98785104510193E-165)
            long r0 = java.lang.Math.min(r0, r4)
            java.util.concurrent.locks.LockSupport.parkNanos(r15, r0)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0136
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0131
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x004f
            r15.A01(r6)
        L_0x0072:
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x008d
            java.lang.Object r0 = r15.value
            if (r0 != 0) goto L_0x0131
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L_0x0087
            long r4 = java.lang.System.nanoTime()
            long r0 = r9 - r4
            goto L_0x0072
        L_0x0087:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x008d:
            java.lang.String r4 = r15.toString()
            java.lang.String r6 = r7.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r9 = r6.toLowerCase(r5)
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()
            java.lang.String r5 = "Waited "
            r6.append(r5)
            r6.append(r2)
            java.lang.String r8 = " "
            java.lang.String r3 = X.AnonymousClass001.A1H(r8, r9, r6)
            long r5 = r0 + r11
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0109
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r3)
            java.lang.String r2 = " (plus "
            java.lang.String r10 = X.AnonymousClass000.A0y(r2, r3)
            long r2 = -r0
            long r5 = X.BE6.A0N(r2, r7)
            long r0 = r7.toNanos(r5)
            long r2 = r2 - r0
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00d0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            r7 = 0
            if (r0 <= 0) goto L_0x00d1
        L_0x00d0:
            r7 = 1
        L_0x00d1:
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r10)
            r0.append(r5)
            java.lang.String r0 = X.AnonymousClass001.A1H(r8, r9, r0)
            if (r7 == 0) goto L_0x00ec
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x00ec:
            java.lang.String r10 = X.C17900vP.A0A(r0, r8)
        L_0x00f0:
            if (r7 == 0) goto L_0x00ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r10)
            r1.append(r2)
            java.lang.String r0 = " nanoseconds "
            java.lang.String r10 = X.AnonymousClass000.A0y(r0, r1)
        L_0x00ff:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r10)
            java.lang.String r0 = "delay)"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0109:
            boolean r0 = r15.isDone()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x0122
            r1.append(r3)
            java.lang.String r0 = " but future completed as timeout expired"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0122:
            r1.append(r3)
            java.lang.String r0 = " for "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0131:
            java.lang.Object r0 = A00(r0)
            return r0
        L_0x0136:
            r15.A01(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x013f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23570Bly.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.value instanceof C25512ChA;
    }

    public boolean isDone() {
        return true & AnonymousClass000.A1W(this.value);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.Class r3 = r6.getClass()
            java.lang.String r1 = r3.getName()
            java.lang.String r0 = "com.google.common.util.concurrent."
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r3.getSimpleName()
            r2.append(r0)
        L_0x001b:
            r0 = 64
            r2.append(r0)
            java.lang.String r0 = X.BE8.A0h(r6)
            r2.append(r0)
            java.lang.String r0 = "[status="
            r2.append(r0)
            boolean r0 = r6.isCancelled()
            if (r0 == 0) goto L_0x003c
            java.lang.String r0 = "CANCELLED"
        L_0x0034:
            r2.append(r0)
        L_0x0037:
            java.lang.String r0 = X.AnonymousClass000.A0z(r2)
            return r0
        L_0x003c:
            boolean r0 = r6.isDone()
            if (r0 != 0) goto L_0x0086
            int r5 = r2.length()
            java.lang.String r0 = "PENDING"
            r2.append(r0)
            java.lang.String r4 = "]"
            boolean r0 = r6 instanceof java.util.concurrent.ScheduledFuture     // Catch:{ Exception | StackOverflowError -> 0x0064 }
            if (r0 == 0) goto L_0x0062
            java.lang.StringBuilder r1 = X.BEB.A0h(r6)     // Catch:{ Exception | StackOverflowError -> 0x0064 }
            java.lang.String r0 = " ms]"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception | StackOverflowError -> 0x0064 }
        L_0x005b:
            boolean r0 = X.C24605CBj.A00(r1)     // Catch:{ Exception | StackOverflowError -> 0x0064 }
            if (r0 == 0) goto L_0x0072
            goto L_0x0079
        L_0x0062:
            r1 = 0
            goto L_0x005b
        L_0x0064:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Exception thrown from implementation: "
            X.BE9.A1G(r3, r0, r1)
            java.lang.String r1 = r1.toString()
        L_0x0072:
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = ", info=["
            X.C17890vO.A10(r0, r1, r4, r2)
        L_0x0079:
            boolean r0 = r6.isDone()
            if (r0 == 0) goto L_0x0037
            int r0 = r2.length()
            r2.delete(r5, r0)
        L_0x0086:
            java.lang.String r4 = "]"
            r3 = 0
        L_0x0089:
            java.lang.Object r1 = r6.get()     // Catch:{ InterruptedException -> 0x008e, all -> 0x00b8 }
            goto L_0x0090
        L_0x008e:
            r3 = 1
            goto L_0x0089
        L_0x0090:
            if (r3 == 0) goto L_0x0095
            X.AnonymousClass8BS.A0x()     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
        L_0x0095:
            java.lang.String r0 = "SUCCESS, result=["
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
            if (r1 != 0) goto L_0x009f
            java.lang.String r0 = "null"
            goto L_0x00b1
        L_0x009f:
            if (r1 != r6) goto L_0x00a2
            goto L_0x00af
        L_0x00a2:
            X.AnonymousClass8BW.A1M(r1, r2)     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
            java.lang.String r0 = "@"
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
            java.lang.String r0 = X.BE8.A0h(r1)     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
            goto L_0x00b1
        L_0x00af:
            java.lang.String r0 = "this future"
        L_0x00b1:
            r2.append(r0)     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
            r2.append(r4)     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
            goto L_0x0037
        L_0x00b8:
            r0 = move-exception
            if (r3 == 0) goto L_0x00be
            X.AnonymousClass8BS.A0x()     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
        L_0x00be:
            throw r0     // Catch:{ ExecutionException -> 0x00cd, CancellationException -> 0x00c9, Exception -> 0x00bf }
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "UNKNOWN, cause=["
            X.BE9.A1G(r1, r0, r2)
            java.lang.String r0 = " thrown from get()]"
            goto L_0x0034
        L_0x00c9:
            java.lang.String r0 = "CANCELLED"
            goto L_0x0034
        L_0x00cd:
            r1 = move-exception
            java.lang.String r0 = "FAILURE, cause=["
            r2.append(r0)
            java.lang.Throwable r0 = r1.getCause()
            r2.append(r0)
            r2.append(r4)
            goto L_0x0037
        L_0x00df:
            r2.append(r1)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23570Bly.toString():java.lang.String");
    }

    public Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                C25543Chg chg = this.waiters;
                C25543Chg chg2 = C25543Chg.A00;
                if (chg != chg2) {
                    C25543Chg chg3 = new C25543Chg();
                    while (true) {
                        C24492C6k c6k = A00;
                        c6k.A00(chg3, chg);
                        if (!c6k.A03(chg, chg3, this)) {
                            chg = this.waiters;
                            if (chg == chg2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A01(chg3);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                    obj.getClass();
                }
            }
            return A00(obj);
        }
        throw new InterruptedException();
    }
}
