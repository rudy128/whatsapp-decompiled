package X;

/* renamed from: X.Aim  reason: case insensitive filesystem */
public class C21357Aim implements Runnable {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C21357Aim(Object obj, Object obj2, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02cf, code lost:
        r3.notifyAllObservers(new X.AnonymousClass7KY(r2, 31));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x031a, code lost:
        X.AnonymousClass74B.A05(r4, r3, r2, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x031d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A01
            switch(r0) {
                case 0: goto L_0x031e;
                case 1: goto L_0x0304;
                case 2: goto L_0x02ed;
                case 3: goto L_0x02da;
                case 4: goto L_0x02c5;
                case 5: goto L_0x02be;
                case 6: goto L_0x02b0;
                case 7: goto L_0x02b0;
                case 8: goto L_0x027d;
                case 9: goto L_0x0244;
                case 10: goto L_0x0238;
                case 11: goto L_0x022a;
                case 12: goto L_0x0224;
                case 13: goto L_0x0218;
                case 14: goto L_0x020c;
                case 15: goto L_0x00a7;
                case 16: goto L_0x009b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r12.A02     // Catch:{ IOException -> 0x026f }
            org.whispersystems.jobqueue.Job r4 = (org.whispersystems.jobqueue.Job) r4     // Catch:{ IOException -> 0x026f }
            org.whispersystems.jobqueue.JobParameters r0 = r4.parameters     // Catch:{ IOException -> 0x026f }
            boolean r0 = r0.isPersistent     // Catch:{ IOException -> 0x026f }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r0 = r12.A00     // Catch:{ IOException -> 0x026f }
            X.9nG r0 = (X.C191829nG) r0     // Catch:{ IOException -> 0x026f }
            X.A0C r5 = r0.A07     // Catch:{ IOException -> 0x026f }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ IOException -> 0x026f }
            java.io.ByteArrayOutputStream r1 = X.C108945cZ.A15()     // Catch:{ NotSerializableException -> 0x008a }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ NotSerializableException -> 0x008a }
            r0.<init>(r1)     // Catch:{ NotSerializableException -> 0x008a }
            r0.writeObject(r4)     // Catch:{ NotSerializableException -> 0x008a }
            byte[] r0 = r1.toByteArray()     // Catch:{ NotSerializableException -> 0x008a }
            java.lang.String r1 = X.C197019w1.A00(r0)     // Catch:{ NotSerializableException -> 0x008a }
            java.lang.String r0 = "item"
            r6.put(r0, r1)     // Catch:{ IOException -> 0x026f }
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()     // Catch:{ IOException -> 0x026f }
            java.lang.String r0 = "encrypted"
            r6.put(r0, r1)     // Catch:{ IOException -> 0x026f }
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r5.A02     // Catch:{ all -> 0x0055 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()     // Catch:{ all -> 0x0055 }
            r0.lock()     // Catch:{ all -> 0x0055 }
            X.8CG r0 = r5.A03     // Catch:{ all -> 0x0055 }
            android.database.sqlite.SQLiteDatabase r2 = r0.getWritableDatabase()     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "queue"
            r0 = 0
            long r0 = r2.insert(r1, r0, r6)     // Catch:{ all -> 0x0055 }
            r4.A07(r0)     // Catch:{ all -> 0x0055 }
            goto L_0x0060
        L_0x0055:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A02     // Catch:{ IOException -> 0x026f }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()     // Catch:{ IOException -> 0x026f }
            r0.unlock()     // Catch:{ IOException -> 0x026f }
            goto L_0x009a
        L_0x0060:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r3.readLock()     // Catch:{ IOException -> 0x026f }
            r0.unlock()     // Catch:{ IOException -> 0x026f }
        L_0x0067:
            java.lang.Object r1 = r12.A00     // Catch:{ IOException -> 0x026f }
            X.9nG r1 = (X.C191829nG) r1     // Catch:{ IOException -> 0x026f }
            android.content.Context r0 = r1.A01     // Catch:{ IOException -> 0x026f }
            X.C181949Sl.A00(r0, r4)     // Catch:{ IOException -> 0x026f }
            r4.A08()     // Catch:{ IOException -> 0x026f }
            X.A1G r1 = r1.A06     // Catch:{ IOException -> 0x026f }
            monitor-enter(r1)     // Catch:{ IOException -> 0x026f }
            java.util.LinkedList r0 = r1.A01     // Catch:{ all -> 0x0087 }
            r0.add(r4)     // Catch:{ all -> 0x0087 }
            X.A1G.A00(r4, r1)     // Catch:{ all -> 0x0087 }
            X.Ame r0 = r1.A05     // Catch:{ all -> 0x0087 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x0087 }
            r0.open()     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)     // Catch:{ IOException -> 0x026f }
            return
        L_0x0087:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x026f }
            goto L_0x009a
        L_0x008a:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x026f }
            java.lang.String r0 = "Can't serialize job:"
            java.lang.String r0 = X.AnonymousClass001.A1E(r4, r0, r1)     // Catch:{ IOException -> 0x026f }
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ IOException -> 0x026f }
            r2.<init>(r0, r3)     // Catch:{ IOException -> 0x026f }
        L_0x009a:
            throw r2     // Catch:{ IOException -> 0x026f }
        L_0x009b:
            java.lang.Object r1 = r12.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x00a7:
            java.lang.Object r5 = r12.A02
            X.Amf r5 = (X.C21591Amf) r5
            java.lang.Object r8 = r12.A00
            org.whispersystems.jobqueue.Job r8 = (org.whispersystems.jobqueue.Job) r8
            X.9WO r3 = r5.A00
            if (r3 == 0) goto L_0x00d4
            X.1Mm r0 = r3.A00
            X.1Mg r4 = r0.A02
            X.0ve r2 = r4.A01
            r1 = 9630(0x259e, float:1.3495E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00d4
            X.1Mi r2 = r4.A02
            monitor-enter(r2)
            java.util.WeakHashMap r1 = r2.A00     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = X.C108955ca.A0m()     // Catch:{ all -> 0x00d0 }
            r1.put(r8, r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00d3
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d3:
            monitor-exit(r2)
        L_0x00d4:
            java.util.concurrent.atomic.AtomicInteger r4 = r5.A02
            r4.getAndIncrement()
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters
            int r7 = r0.retryCount
            int r6 = r8.A00
            r2 = 0
            r1 = r2
        L_0x00e1:
            if (r6 >= r7) goto L_0x00ed
            r8.A0A()     // Catch:{ Exception -> 0x00f4 }
            org.whispersystems.jobqueue.JobResult r0 = org.whispersystems.jobqueue.JobResult.SUCCESS     // Catch:{ Exception -> 0x00f4 }
            android.util.Pair r9 = X.C108945cZ.A0N(r0, r2)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0114
        L_0x00ed:
            org.whispersystems.jobqueue.JobResult r0 = org.whispersystems.jobqueue.JobResult.FAILURE
            android.util.Pair r9 = X.C108945cZ.A0N(r0, r1)
            goto L_0x0114
        L_0x00f4:
            r1 = move-exception
            int r6 = r6 + 1
            r8.A00 = r6
            java.lang.String r0 = "JobConsumer"
            android.util.Log.w(r0, r1)
            boolean r0 = r1 instanceof java.lang.RuntimeException
            if (r0 != 0) goto L_0x020b
            boolean r0 = r8.A0C(r1)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r8.A0B()
            if (r0 != 0) goto L_0x00e1
            org.whispersystems.jobqueue.JobResult r0 = org.whispersystems.jobqueue.JobResult.DEFERRED
            android.util.Pair r9 = X.C108945cZ.A0N(r0, r2)
        L_0x0114:
            java.lang.Object r1 = r9.first
            org.whispersystems.jobqueue.JobResult r0 = org.whispersystems.jobqueue.JobResult.DEFERRED
            if (r1 != r0) goto L_0x0129
            X.A1G r0 = r5.A03
            r0.A02(r8)
        L_0x011f:
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters
            java.lang.String r2 = r0.groupId
            if (r2 == 0) goto L_0x0187
            X.A1G r1 = r5.A03
            monitor-enter(r1)
            goto L_0x0176
        L_0x0129:
            org.whispersystems.jobqueue.JobResult r0 = org.whispersystems.jobqueue.JobResult.FAILURE
            if (r1 != r0) goto L_0x0157
            r8.A09()
            if (r3 == 0) goto L_0x0157
            int r1 = r8.A00
            r0 = 50
            if (r1 <= r0) goto L_0x0157
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.Object r0 = r9.second
            if (r0 == 0) goto L_0x0145
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.AnonymousClass8BS.A1I(r1, r0)
        L_0x0145:
            java.lang.String r7 = X.C108955ca.A0x(r8)
            java.lang.String r6 = r1.toString()
            java.lang.String r2 = "jobmanager-high-retry-job"
            r1 = 0
            X.1Mm r0 = r3.A00
            X.190 r0 = r0.A01
            r0.A0H(r2, r7, r1, r6)
        L_0x0157:
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters
            boolean r0 = r0.isPersistent
            if (r0 == 0) goto L_0x0164
            X.A0C r2 = r5.A04
            long r0 = r8.A01
            r2.A00(r0)
        L_0x0164:
            android.os.PowerManager$WakeLock r10 = r8.A02
            if (r10 == 0) goto L_0x011f
            org.whispersystems.jobqueue.JobParameters r0 = r8.parameters
            long r1 = r0.wakeLockTimeout
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x011f
            r10.release()
            goto L_0x011f
        L_0x0176:
            java.util.Set r0 = r1.A03     // Catch:{ all -> 0x0183 }
            r0.remove(r2)     // Catch:{ all -> 0x0183 }
            X.Ame r0 = r1.A05     // Catch:{ all -> 0x0183 }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x0183 }
            r0.open()     // Catch:{ all -> 0x0183 }
            goto L_0x0186
        L_0x0183:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0186:
            monitor-exit(r1)
        L_0x0187:
            r4.getAndDecrement()
            if (r3 == 0) goto L_0x027c
            java.lang.Object r1 = r9.first
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.1Mm r0 = r3.A00
            X.1Mg r4 = r0.A02
            java.lang.Class r3 = r8.getClass()
            X.0ve r2 = r4.A01
            r1 = 9630(0x259e, float:1.3495E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x027c
            X.1Mi r7 = r4.A02
            monitor-enter(r7)
            java.util.concurrent.ConcurrentHashMap r0 = r7.A01     // Catch:{ all -> 0x0208 }
            java.lang.String r10 = r3.getName()     // Catch:{ all -> 0x0208 }
            java.lang.Object r9 = r0.get(r10)     // Catch:{ all -> 0x0208 }
            X.2e1 r9 = (X.C54362e1) r9     // Catch:{ all -> 0x0208 }
            if (r9 != 0) goto L_0x01c1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "WaJobStatsCollector cannot find job stats for job "
            X.C17900vP.A0e(r0, r10, r1)     // Catch:{ all -> 0x0208 }
            goto L_0x0206
        L_0x01c1:
            int r0 = r8.A00     // Catch:{ all -> 0x0208 }
            long r1 = (long) r0     // Catch:{ all -> 0x0208 }
            java.util.concurrent.atomic.AtomicLong r5 = r9.A00     // Catch:{ all -> 0x0208 }
            long r3 = r5.get()     // Catch:{ all -> 0x0208 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x01cf
            r1 = r3
        L_0x01cf:
            r5.set(r1)     // Catch:{ all -> 0x0208 }
            java.util.WeakHashMap r6 = r7.A00     // Catch:{ all -> 0x0208 }
            boolean r0 = r6.containsKey(r8)     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r6.get(r8)     // Catch:{ all -> 0x0208 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01f9
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0208 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0208 }
            long r4 = r4 - r0
            java.util.concurrent.atomic.AtomicLong r3 = r9.A01     // Catch:{ all -> 0x0208 }
            long r1 = r3.get()     // Catch:{ all -> 0x0208 }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f6
            r4 = r1
        L_0x01f6:
            r3.set(r4)     // Catch:{ all -> 0x0208 }
        L_0x01f9:
            r6.remove(r8)     // Catch:{ all -> 0x0208 }
            goto L_0x0206
        L_0x01fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0208 }
            java.lang.String r0 = "WaJobStatsCollector cannot find job start time for job "
            X.C17900vP.A0e(r0, r10, r1)     // Catch:{ all -> 0x0208 }
        L_0x0206:
            monitor-exit(r7)
            return
        L_0x0208:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x020b:
            throw r1
        L_0x020c:
            java.lang.Object r1 = r12.A00
            org.wawebrtc.MediaCodecVideoEncoder r1 = (org.wawebrtc.MediaCodecVideoEncoder) r1
            java.lang.Object r0 = r12.A02
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r1.m85lambda$release$0$orgwawebrtcMediaCodecVideoEncoder(r0)
            return
        L_0x0218:
            java.lang.Object r1 = r12.A00
            org.wawebrtc.MediaCodecVideoDecoder r1 = (org.wawebrtc.MediaCodecVideoDecoder) r1
            java.lang.Object r0 = r12.A02
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r1.m84lambda$release$0$orgwawebrtcMediaCodecVideoDecoder(r0)
            return
        L_0x0224:
            java.lang.Object r0 = r12.A00
            X.C108965cb.A1N(r0)
            return
        L_0x022a:
            java.lang.Object r0 = r12.A02
            X.Amt r0 = (X.C21604Amt) r0
            org.npci.upi.security.pinactivitycomponent.s r1 = r0.A02
            java.lang.Object r0 = r12.A00
            X.9lb r0 = (X.C190839lb) r0
            r1.A27(r0)
            return
        L_0x0238:
            java.lang.Object r2 = r12.A00
            X.DXk r2 = (X.C27175DXk) r2
            java.lang.Object r1 = r12.A02
            X.1Wu r0 = X.C27621Wu.A00
            X.C27175DXk.A00(r1, r0, r2)
            return
        L_0x0244:
            r3 = 0
        L_0x0245:
            java.lang.Object r0 = r12.A00     // Catch:{ all -> 0x024b }
            X.C108945cZ.A1P(r0)     // Catch:{ all -> 0x024b }
            goto L_0x0251
        L_0x024b:
            r1 = move-exception
            X.1OR r0 = X.AnonymousClass1OR.A00
            X.C181879Se.A00(r0, r1)
        L_0x0251:
            java.lang.Object r2 = r12.A02
            X.1IH r2 = (X.AnonymousClass1IH) r2
            java.lang.Runnable r0 = X.AnonymousClass1IH.A00(r2)
            if (r0 == 0) goto L_0x027c
            r12.A00 = r0
            int r3 = r3 + 1
            r0 = 16
            if (r3 < r0) goto L_0x0245
            X.0wl r1 = r2.A01
            boolean r0 = r1.A0C(r2)
            if (r0 == 0) goto L_0x0245
            r1.A0D(r12, r2)
            return
        L_0x026f:
            r1 = move-exception
            java.lang.String r0 = "JobManager"
            android.util.Log.w(r0, r1)
            java.lang.Object r0 = r12.A02
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0
            r0.A09()
        L_0x027c:
            return
        L_0x027d:
            java.lang.Object r2 = r12.A02
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            boolean r0 = r2.isCancelled()
            if (r0 == 0) goto L_0x0290
            java.lang.Object r1 = r12.A00
            X.1g5 r1 = (X.C31761g5) r1
            r0 = 0
            r1.BEN(r0)
            return
        L_0x0290:
            java.lang.Object r1 = r12.A00     // Catch:{ ExecutionException -> 0x029c }
            X.1dr r1 = (X.C30391dr) r1     // Catch:{ ExecutionException -> 0x029c }
            java.lang.Object r0 = X.C181049Oy.A00(r2)     // Catch:{ ExecutionException -> 0x029c }
            r1.resumeWith(r0)     // Catch:{ ExecutionException -> 0x029c }
            return
        L_0x029c:
            r0 = move-exception
            java.lang.Object r1 = r12.A00
            X.1dr r1 = (X.C30391dr) r1
            java.lang.Throwable r0 = r0.getCause()
            X.C18070vi.A0b(r0)
            X.1IU r0 = X.C30691eM.A00(r0)
            r1.resumeWith(r0)
            return
        L_0x02b0:
            java.lang.Object r2 = r12.A00
            X.1g5 r2 = (X.C31761g5) r2
            java.lang.Object r1 = r12.A02
            X.0wl r1 = (X.C18600wl) r1
            X.1Wu r0 = X.C27621Wu.A00
            r2.CG2(r0, r1)
            return
        L_0x02be:
            java.lang.Object r3 = r12.A00
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r12.A02
            goto L_0x02cf
        L_0x02c5:
            java.lang.Object r3 = r12.A00
            X.10T r3 = (X.AnonymousClass10T) r3
            java.lang.Object r2 = r12.A02
            r0 = 1
            X.C18070vi.A0d(r2, r0)
        L_0x02cf:
            r1 = 31
            X.7KY r0 = new X.7KY
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x02da:
            java.lang.Object r1 = r12.A00
            X.6kG r1 = (X.C130946kG) r1
            java.lang.Object r2 = r12.A02
            X.34B r2 = (X.AnonymousClass34B) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.1T6 r1 = r1.A04
            r0 = 0
            r1.A0J(r2, r0)
            return
        L_0x02ed:
            java.lang.Object r5 = r12.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r12.A02
            X.730 r1 = (X.AnonymousClass730) r1
            X.1KB r4 = r1.A01
            X.00H r0 = r1.A08
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.2LI r3 = (X.AnonymousClass2LI) r3
            X.00H r2 = r1.A0A
            X.00H r0 = r1.A09
            goto L_0x031a
        L_0x0304:
            java.lang.Object r5 = r12.A00
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r1 = r12.A02
            X.1x7 r1 = (X.C41821x7) r1
            X.1KB r4 = r1.A00
            X.00H r0 = r1.A0D
            java.lang.Object r3 = X.C18070vi.A0E(r0)
            X.2LI r3 = (X.AnonymousClass2LI) r3
            X.00H r2 = r1.A0A
            X.00H r0 = r1.A0G
        L_0x031a:
            X.AnonymousClass74B.A05(r4, r3, r2, r0, r5)
            return
        L_0x031e:
            java.lang.Object r3 = r12.A00
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity) r3
            java.lang.Object r4 = r12.A02
            X.6p4 r4 = (X.C133616p4) r4
            java.lang.String r0 = "AccountLinkingWebAuthActivity/onCreate Launching web auth url"
            r9 = 0
            X.C18070vi.A0d(r0, r9)
            X.1dR r1 = r3.A01
            if (r1 == 0) goto L_0x0410
            java.lang.String r0 = "SEE_WEB_AUTH"
            r1.A04(r0)
            X.00H r0 = r3.A04     // Catch:{ 6QA -> 0x0407 }
            if (r0 == 0) goto L_0x0400
            r0.get()     // Catch:{ 6QA -> 0x0407 }
            X.1D6 r0 = r3.A07     // Catch:{ 6QA -> 0x0407 }
            if (r0 == 0) goto L_0x03fb
            java.lang.Object r2 = r0.second     // Catch:{ 6QA -> 0x0407 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 6QA -> 0x0407 }
            r7 = 1
            X.C18070vi.A0d(r2, r7)     // Catch:{ 6QA -> 0x0407 }
            android.net.Uri r0 = X.C61292pR.A00(r2)     // Catch:{ 6QA -> 0x0407 }
            X.C18070vi.A0X(r0)     // Catch:{ 6QA -> 0x0407 }
            java.lang.String r5 = "android.intent.action.VIEW"
            android.content.Intent r6 = new android.content.Intent     // Catch:{ 6QA -> 0x0407 }
            r6.<init>(r5, r0)     // Catch:{ 6QA -> 0x0407 }
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ 6QA -> 0x0407 }
            r0 = 131072(0x20000, float:1.83671E-40)
            java.util.List r1 = r1.queryIntentActivities(r6, r0)     // Catch:{ 6QA -> 0x0407 }
            X.C18070vi.A0X(r1)     // Catch:{ 6QA -> 0x0407 }
            boolean r0 = r1.isEmpty()     // Catch:{ 6QA -> 0x0407 }
            if (r0 == 0) goto L_0x03a8
            X.0wS r6 = X.C18460wS.A00     // Catch:{ 6QA -> 0x0407 }
        L_0x036b:
            boolean r0 = r6.isEmpty()     // Catch:{ 6QA -> 0x0407 }
            if (r0 != 0) goto L_0x03f3
            java.lang.String r8 = X.AnonymousClass0DQ.A00(r3, r6, r7)     // Catch:{ 6QA -> 0x0407 }
            if (r8 == 0) goto L_0x03e1
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ 6QA -> 0x0407 }
            r0 = 2131100595(0x7f0603b3, float:1.7813576E38)
            int r10 = r1.getColor(r0)     // Catch:{ 6QA -> 0x0407 }
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r10 = r10 | r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)     // Catch:{ 6QA -> 0x0407 }
            r6 = 0
            X.0Mv r5 = new X.0Mv     // Catch:{ 6QA -> 0x0407 }
            r5.<init>()     // Catch:{ 6QA -> 0x0407 }
            r0 = 2
            r5.A00 = r0     // Catch:{ 6QA -> 0x0407 }
            java.lang.String r0 = "android.support.customtabs.extra.SHARE_MENU_ITEM"
            android.content.Intent r1 = r5.A02     // Catch:{ 6QA -> 0x0407 }
            r1.putExtra(r0, r9)     // Catch:{ 6QA -> 0x0407 }
            java.lang.String r0 = "android.support.customtabs.extra.TITLE_VISIBILITY"
            r1.putExtra(r0, r7)     // Catch:{ 6QA -> 0x0407 }
            java.lang.String r0 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
            r1.putExtra(r0, r7)     // Catch:{ 6QA -> 0x0407 }
            android.os.Bundle r1 = X.C17880vN.A0D()     // Catch:{ 6QA -> 0x0407 }
            goto L_0x03c4
        L_0x03a8:
            java.util.ArrayList r6 = X.C29351c6.A0D(r1)     // Catch:{ 6QA -> 0x0407 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 6QA -> 0x0407 }
        L_0x03b0:
            boolean r0 = r1.hasNext()     // Catch:{ 6QA -> 0x0407 }
            if (r0 == 0) goto L_0x036b
            java.lang.Object r0 = r1.next()     // Catch:{ 6QA -> 0x0407 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ 6QA -> 0x0407 }
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ 6QA -> 0x0407 }
            java.lang.String r0 = r0.packageName     // Catch:{ 6QA -> 0x0407 }
            r6.add(r0)     // Catch:{ 6QA -> 0x0407 }
            goto L_0x03b0
        L_0x03c4:
            if (r11 == 0) goto L_0x03cb
            java.lang.String r0 = "android.support.customtabs.extra.TOOLBAR_COLOR"
            r1.putInt(r0, r10)     // Catch:{ 6QA -> 0x0407 }
        L_0x03cb:
            r5.A01 = r1     // Catch:{ 6QA -> 0x0407 }
            X.0Gx r0 = r5.A01()     // Catch:{ 6QA -> 0x0407 }
            android.content.Intent r1 = r0.A00     // Catch:{ 6QA -> 0x0407 }
            r1.setPackage(r8)     // Catch:{ 6QA -> 0x0407 }
            android.net.Uri r0 = X.C61292pR.A00(r2)     // Catch:{ 6QA -> 0x0407 }
            r1.setData(r0)     // Catch:{ 6QA -> 0x0407 }
            r3.startActivity(r1, r6)     // Catch:{ 6QA -> 0x0407 }
            goto L_0x040c
        L_0x03e1:
            android.net.Uri r0 = X.C61292pR.A00(r2)     // Catch:{ 6QA -> 0x0407 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ 6QA -> 0x0407 }
            r1.<init>(r5, r0)     // Catch:{ 6QA -> 0x0407 }
            r0 = 335544320(0x14000000, float:6.4623485E-27)
            r1.addFlags(r0)     // Catch:{ 6QA -> 0x0407 }
            r3.startActivity(r1)     // Catch:{ 6QA -> 0x0407 }
            goto L_0x040c
        L_0x03f3:
            r2 = 3
            r1 = 0
            X.6QA r0 = new X.6QA     // Catch:{ 6QA -> 0x0407 }
            r0.<init>(r1, r1, r1, r2)     // Catch:{ 6QA -> 0x0407 }
            throw r0     // Catch:{ 6QA -> 0x0407 }
        L_0x03fb:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ 6QA -> 0x0407 }
            throw r0     // Catch:{ 6QA -> 0x0407 }
        L_0x0400:
            java.lang.String r0 = "webAuthBrowserLauncher"
            X.C18070vi.A11(r0)     // Catch:{ 6QA -> 0x0407 }
            r0 = 0
            throw r0     // Catch:{ 6QA -> 0x0407 }
        L_0x0407:
            r1 = move-exception
            r0 = 0
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity.A03(r1, r3, r4, r0, r0)
        L_0x040c:
            r0 = 1
            r3.A0A = r0
            return
        L_0x0410:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21357Aim.run():void");
    }
}
