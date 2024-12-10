package X;

/* renamed from: X.Cfs  reason: case insensitive filesystem */
public abstract class C25443Cfs {
    public static int A00;
    public static C22912BUx A01;

    static {
        Boolean bool = C17970vW.A03;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: X.Cn8[]} */
    /* JADX WARNING: type inference failed for: r0v33, types: [X.D3s, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v10, types: [java.lang.Object, X.C5Z] */
    /* JADX WARNING: type inference failed for: r12v9, types: [java.lang.Object, X.C5Y] */
    /* JADX WARNING: type inference failed for: r4v54, types: [X.E4p] */
    /* JADX WARNING: type inference failed for: r12v11, types: [X.C5S, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v36, types: [X.BUx, X.Cn8] */
    /* JADX WARNING: type inference failed for: r0v64, types: [X.Cet, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v69 */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:195|196) */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        r9.A02 = true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:195:0x03e3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r23, X.AnonymousClass198 r24, int r25) {
        /*
            int r1 = A00
            if (r1 != 0) goto L_0x0102
            r2 = 1
            r24.A00()     // Catch:{ IOException -> 0x00f5 }
            android.util.SparseArray r6 = new android.util.SparseArray     // Catch:{ all -> 0x0100 }
            r6.<init>(r2)     // Catch:{ all -> 0x0100 }
            int r1 = X.C25546Chj.A02     // Catch:{ all -> 0x0100 }
            X.Chj r0 = new X.Chj     // Catch:{ all -> 0x0100 }
            r0.<init>()     // Catch:{ all -> 0x0100 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0100 }
            X.BUx r1 = new X.BUx     // Catch:{ all -> 0x0100 }
            r1.<init>()     // Catch:{ all -> 0x0100 }
            A01 = r1     // Catch:{ all -> 0x0100 }
            r0 = 5
            X.Cn8[] r4 = new X.Cn8[r0]     // Catch:{ all -> 0x0100 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x0100 }
            com.facebook.profilo.provider.systemcounters.SystemCounterThread r0 = new com.facebook.profilo.provider.systemcounters.SystemCounterThread     // Catch:{ all -> 0x0100 }
            r0.<init>()     // Catch:{ all -> 0x0100 }
            r4[r2] = r0     // Catch:{ all -> 0x0100 }
            com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider r1 = new com.facebook.profilo.provider.threadmetadata.ThreadMetadataProvider     // Catch:{ all -> 0x0100 }
            r1.<init>()     // Catch:{ all -> 0x0100 }
            r0 = 2
            r4[r0] = r1     // Catch:{ all -> 0x0100 }
            com.facebook.profilo.provider.stacktrace.StackFrameThread r0 = new com.facebook.profilo.provider.stacktrace.StackFrameThread     // Catch:{ all -> 0x0100 }
            r5 = r23
            r0.<init>(r5)     // Catch:{ all -> 0x0100 }
            r1 = 3
            r4[r1] = r0     // Catch:{ all -> 0x0100 }
            X.BUw r1 = new X.BUw     // Catch:{ all -> 0x0100 }
            r1.<init>()     // Catch:{ all -> 0x0100 }
            r0 = 4
            r4[r0] = r1     // Catch:{ all -> 0x0100 }
            java.io.File r0 = r5.getCacheDir()     // Catch:{ all -> 0x0100 }
            java.lang.String r3 = "profilo"
            java.io.File r2 = X.C17880vN.A0e(r0, r3)     // Catch:{ all -> 0x0100 }
            r1 = 0
            X.Cet r0 = new X.Cet     // Catch:{ all -> 0x0100 }
            r0.<init>()     // Catch:{ all -> 0x0100 }
            X.DFA r8 = new X.DFA     // Catch:{ all -> 0x0100 }
            r8.<init>(r5, r0, r2, r4)     // Catch:{ all -> 0x0100 }
            java.util.concurrent.atomic.AtomicReference r0 = X.DFA.A09     // Catch:{ all -> 0x0100 }
            boolean r0 = X.AnonymousClass00N.A00(r1, r8, r0)     // Catch:{ all -> 0x0100 }
            if (r0 == 0) goto L_0x00ee
            monitor-enter(r8)     // Catch:{ all -> 0x0100 }
            X.CNR r7 = X.C25392Cet.A00     // Catch:{ all -> 0x00eb }
            monitor-exit(r8)     // Catch:{ all -> 0x00eb }
            monitor-enter(r8)     // Catch:{ all -> 0x0100 }
            X.Cim r2 = r8.A00     // Catch:{ all -> 0x00e8 }
            java.io.File r11 = r2.A06     // Catch:{ all -> 0x00e8 }
            com.facebook.profilo.mmapbuf.core.MmapBufferManager r0 = com.facebook.profilo.mmapbuf.core.MmapBufferManager.$redex_init_class     // Catch:{ all -> 0x00e8 }
            java.io.File r0 = r2.A03     // Catch:{ all -> 0x00e8 }
            com.facebook.profilo.mmapbuf.core.MmapBufferManager r10 = new com.facebook.profilo.mmapbuf.core.MmapBufferManager     // Catch:{ all -> 0x00e8 }
            r10.<init>(r0)     // Catch:{ all -> 0x00e8 }
            r8.A01 = r10     // Catch:{ all -> 0x00e8 }
            X.Cvb r0 = X.C26238Cvb.A0A     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00e1
            java.lang.Class<X.Cvb> r1 = X.C26238Cvb.class
            monitor-enter(r1)     // Catch:{ all -> 0x00e8 }
            X.Cvb r0 = X.C26238Cvb.A0A     // Catch:{ all -> 0x00de }
            if (r0 != 0) goto L_0x00d7
            X.Cvb r5 = new X.Cvb     // Catch:{ all -> 0x00de }
            r9 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00de }
            X.C26238Cvb.A0A = r5     // Catch:{ all -> 0x00de }
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            X.AnonymousClass1A8.A06(r3)     // Catch:{ all -> 0x00e8 }
            X.CNR r0 = r8.A08     // Catch:{ all -> 0x00e8 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00ae
            r8.A08 = r7     // Catch:{ all -> 0x00e8 }
            X.Cvb r0 = X.C26238Cvb.A0A     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00d0
            java.util.concurrent.atomic.AtomicReference r1 = r0.A05     // Catch:{ all -> 0x00e8 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x00e8 }
            boolean r0 = X.AnonymousClass00N.A00(r0, r7, r1)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r1 = "Profilo/TraceControl"
            java.lang.String r0 = "Tried to update the config and failed due to CAS"
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x00e8 }
        L_0x00ae:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x00e8 }
            r0 = 1
            long r3 = r3.toSeconds(r0)     // Catch:{ all -> 0x00e8 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r0
            r2.A01 = r3     // Catch:{ all -> 0x00e8 }
            r0 = 10
            r2.A00 = r0     // Catch:{ all -> 0x00e8 }
            X.DF9 r0 = r8.A05     // Catch:{ all -> 0x00e8 }
            X.DF8 r1 = new X.DF8     // Catch:{ all -> 0x00e8 }
            r1.<init>()     // Catch:{ all -> 0x00e8 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A00     // Catch:{ all -> 0x00e8 }
            r0.add(r1)     // Catch:{ all -> 0x00e8 }
            monitor-exit(r8)     // Catch:{ all -> 0x00e8 }
            r0 = 2
            A00 = r0     // Catch:{ all -> 0x0100 }
            goto L_0x0106
        L_0x00d0:
            java.lang.String r0 = "Performing config change before TraceControl has been initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e7
        L_0x00d7:
            java.lang.String r0 = "TraceControl already initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00de }
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00de }
            goto L_0x00e7
        L_0x00e1:
            java.lang.String r0 = "TraceControl already initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00e8 }
        L_0x00e7:
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e8 }
            goto L_0x00f4
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00eb }
            goto L_0x00f4
        L_0x00ee:
            java.lang.String r0 = "Orchestrator already initialized"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0100 }
        L_0x00f4:
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x00f5:
            r1 = move-exception
            java.lang.String r0 = "profilo/SoLoader initialization failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00fe }
            A00 = r2     // Catch:{ all -> 0x00fe }
            return
        L_0x00fe:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            throw r0
        L_0x0102:
            r0 = 1
            if (r1 != r0) goto L_0x0106
        L_0x0105:
            return
        L_0x0106:
            X.Cvb r2 = X.C26238Cvb.A0A
            if (r2 == 0) goto L_0x0105
            int r12 = X.C25546Chj.A02
            r22 = 0
            r0 = r25
            long r0 = (long) r0
            r24 = r0
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A04
            r23 = r0
            int r0 = r23.get()
            r4 = 4
            r1 = r0 | 7
            int r0 = r1 + 1
            r1 = r1 ^ -1
            r1 = r1 & r0
            r0 = 1
            int r21 = r0 << r4
            int r21 = r21 - r0
            r1 = r1 & r21
            if (r1 == 0) goto L_0x0105
            android.util.SparseArray r0 = r2.A01
            java.lang.Object r13 = r0.get(r12)
            X.Chj r13 = (X.C25546Chj) r13
            if (r13 == 0) goto L_0x051c
            r0 = r24
            X.D3s r0 = X.C26238Cvb.A00(r2, r12, r0)
            java.lang.String r20 = "Profilo/TraceControl"
            if (r0 == 0) goto L_0x0149
            java.lang.String r1 = "Attempted start during a trace with the same Id"
        L_0x0143:
            r0 = r20
            android.util.Log.d(r0, r1)
            return
        L_0x0149:
            java.util.concurrent.atomic.AtomicReference r0 = r2.A05
            java.lang.Object r1 = r0.get()
            X.CNR r1 = (X.CNR) r1
            java.util.ArrayList r4 = r13.A00
            X.CaA r19 = com.facebook.profilo.core.ProvidersRegistry.A00
            r0 = r19
            int r18 = r0.A00(r4)
            if (r18 != 0) goto L_0x015e
            return
        L_0x015e:
            java.lang.ThreadLocal r0 = X.C26238Cvb.A09
            java.lang.Object r0 = r0.get()
            java.util.Random r0 = (java.util.Random) r0
            long r4 = r0.nextLong()
            long r4 = java.lang.Math.abs(r4)
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x015e
            java.lang.String r10 = X.C25380Ceg.A00(r4)
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r6 = "START PROFILO_TRACEID: "
            r0 = r20
            X.BEA.A1N(r6, r10, r0, r7)
            java.util.TreeMap r8 = new java.util.TreeMap
            r8.<init>()
            boolean r6 = r13.A01
            r0 = 31
            if (r6 == 0) goto L_0x0190
            r0 = 13
        L_0x0190:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "provider.stack_trace.cpu_sampling_rate_ms"
            r8.put(r0, r6)
            r0 = 19
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "provider.native_stack_trace.unwinder_thread_pri"
            r8.put(r0, r6)
            r0 = 512(0x200, float:7.175E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "provider.native_stack_trace.unwinder_queue_size"
            r8.put(r0, r6)
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.lang.Boolean r6 = X.AnonymousClass000.A0i()
            java.lang.String r0 = "provider.native_stack_trace.unwind_dex_frames"
            r7.put(r0, r6)
            X.D3x r11 = new X.D3x
            r11.<init>(r8, r7)
            java.lang.String r6 = "trace_config.buffers"
            r0 = 1
            int r7 = r11.A00(r6, r0)
            java.lang.String r9 = "system_config.buffer_size"
            r6 = 5000(0x1388, float:7.006E-42)
            com.facebook.profilo.config.ConfigParams r0 = r1.A00
            java.util.TreeMap r8 = r0.intParams
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            if (r8 == 0) goto L_0x01e1
            boolean r0 = r8.containsKey(r9)
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r6 = r8.get(r9)
        L_0x01e1:
            int r17 = X.AnonymousClass000.A0M(r6)
            java.lang.String r0 = "trace_config.mmap_buffer"
            r14 = 0
            boolean r16 = r11.A01(r0, r3)
            java.lang.String r6 = "trace_config.buffer_sizes"
            java.util.TreeMap r0 = r11.A00
            if (r0 != 0) goto L_0x020f
            r9 = 0
        L_0x01f3:
            com.facebook.profilo.mmapbuf.core.Buffer[] r6 = new com.facebook.profilo.mmapbuf.core.Buffer[r7]
        L_0x01f5:
            if (r14 >= r7) goto L_0x0216
            com.facebook.profilo.mmapbuf.core.MmapBufferManager r0 = r2.A02
            r8 = r0
            if (r9 == 0) goto L_0x020c
            int r0 = r9.length
            if (r14 >= r0) goto L_0x020c
            r15 = r9[r14]
        L_0x0201:
            r0 = r16
            com.facebook.profilo.mmapbuf.core.Buffer r0 = r8.allocateBuffer(r15, r0)
            r6[r14] = r0
            int r14 = r14 + 1
            goto L_0x01f5
        L_0x020c:
            r15 = r17
            goto L_0x0201
        L_0x020f:
            java.lang.Object r9 = r0.get(r6)
            int[] r9 = (int[]) r9
            goto L_0x01f3
        L_0x0216:
            r9 = r6[r3]
            java.io.File r0 = r2.A03
            r15 = r0
            java.lang.String r8 = "+"
            java.lang.String r0 = "_p_"
            java.lang.String r0 = r10.replace(r8, r0)
            java.lang.String r14 = "/"
            java.lang.String r8 = "_s_"
            java.lang.String r8 = r0.replace(r14, r8)
            java.io.File r14 = X.C17880vN.A0e(r15, r8)
            java.lang.String r8 = "main"
            X.D3s r0 = new X.D3s
            r0.<init>()
            r0.A06 = r4
            r0.A0D = r10
            r0.A07 = r1
            r0.A01 = r12
            r0.A0C = r13
            r1 = r22
            r0.A0B = r1
            r4 = r24
            r0.A05 = r4
            r1 = r18
            r0.A02 = r1
            r0.A03 = r3
            r0.A00 = r3
            r1 = -1
            r0.A04 = r1
            r0.A08 = r11
            r0.A09 = r9
            r0.A0F = r6
            r0.A0A = r14
            r0.A0E = r8
            r4 = 0
            if (r7 == 0) goto L_0x0262
            if (r9 != 0) goto L_0x027a
        L_0x0262:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No buffer was allocated for trace "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ", failing startTrace"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0274:
            r0 = r20
            android.util.Log.e(r0, r1)
            return
        L_0x027a:
            int r8 = r23.get()
            r5 = r8 | 7
            int r1 = r5 + 1
            r9 = r5 ^ -1
            r9 = r9 & r1
            r9 = r9 & r21
            if (r9 != 0) goto L_0x028d
            java.lang.String r1 = "Tried to start a trace and failed because no free slots were left"
            goto L_0x0143
        L_0x028d:
            r5 = r8 | r9
            r1 = r23
            boolean r1 = r1.compareAndSet(r8, r5)
            if (r1 == 0) goto L_0x027a
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r2.A06
            r5 = -1
        L_0x029a:
            if (r9 == 0) goto L_0x02a1
            int r5 = r5 + 1
            int r9 = r9 >> 1
            goto L_0x029a
        L_0x02a1:
            r1 = r22
            boolean r1 = X.C24565C9m.A00(r1, r0, r8, r5)
            if (r1 != 0) goto L_0x02b0
            java.lang.String r0 = "ORDERING VIOLATION - ACQUIRED SLOT BUT SLOT NOT EMPTY"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x02b0:
            r8 = r6[r4]
            int r9 = r0.A02
            long r10 = r0.A05
            long r12 = r0.A06
            r14 = 0
            r8.updateHeader(r9, r10, r12, r14)
            int r4 = r4 + 1
            if (r4 < r7) goto L_0x02b0
            int r1 = r0.A03
            r1 = r1 & 3
            if (r1 == 0) goto L_0x02cc
            r6 = 2147483647(0x7fffffff, float:NaN)
        L_0x02ca:
            monitor-enter(r2)
            goto L_0x02d7
        L_0x02cc:
            X.D3x r5 = r0.A08
            java.lang.String r4 = "trace_config.trace_timeout_ms"
            r1 = 30000(0x7530, float:4.2039E-41)
            int r6 = r5.A00(r4, r1)
            goto L_0x02ca
        L_0x02d7:
            X.C26238Cvb.A02(r2)     // Catch:{ all -> 0x0519 }
            long r4 = r0.A06     // Catch:{ all -> 0x0519 }
            X.D3s r1 = X.C26238Cvb.A01(r2, r4)     // Catch:{ all -> 0x0519 }
            if (r1 == 0) goto L_0x04d2
            X.BG5 r1 = r2.A00     // Catch:{ all -> 0x0519 }
            monitor-enter(r1)     // Catch:{ all -> 0x0519 }
            X.CKZ r8 = r1.A00     // Catch:{ all -> 0x0516 }
            monitor-enter(r8)     // Catch:{ all -> 0x0516 }
            X.C5Z r9 = new X.C5Z     // Catch:{ all -> 0x0510 }
            r9.<init>()     // Catch:{ all -> 0x0510 }
            r7 = 1
            X.D3x r4 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r5 = "trace_config.duration_condition"
            java.util.TreeMap r4 = r4.A00     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r4 == 0) goto L_0x033a
            java.lang.Object r13 = r4.get(r5)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            int[] r13 = (int[]) r13     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r13 == 0) goto L_0x033a
            int r10 = r13.length     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r10 <= 0) goto L_0x033a
            X.C5S r12 = new X.C5S     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.<init>()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r4 = -1
            r12.A00 = r4     // Catch:{ IllegalArgumentException -> 0x03e3 }
            int r4 = r10 % 2
            if (r4 != 0) goto L_0x03d1
            int r15 = r10 / 2
            int[] r14 = new int[r15]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.A01 = r14     // Catch:{ IllegalArgumentException -> 0x03e3 }
            int[] r11 = new int[r15]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.A02 = r11     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r10 = 0
            r16 = 0
        L_0x031b:
            if (r10 >= r15) goto L_0x033b
            int r5 = r16 + 1
            r4 = r13[r16]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r14[r10] = r4     // Catch:{ IllegalArgumentException -> 0x03e3 }
            int r16 = r5 + 1
            r5 = r13[r5]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r11[r10] = r5     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r4 = r14[r10]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r4 < 0) goto L_0x0332
            if (r5 < 0) goto L_0x0332
            int r10 = r10 + 1
            goto L_0x031b
        L_0x0332:
            java.lang.String r4 = "Int conditions should be > 0"
            java.lang.IllegalArgumentException r4 = X.AnonymousClass000.A0k(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x03d7
        L_0x033a:
            r12 = 0
        L_0x033b:
            r9.A01 = r12     // Catch:{ IllegalArgumentException -> 0x03e3 }
            X.D3x r4 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r5 = "trace_config.string_list_condition"
            java.util.TreeMap r4 = r4.A01     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r13 = 0
            if (r4 == 0) goto L_0x0356
            java.lang.Object r5 = r4.get(r5)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r5 == 0) goto L_0x0356
            int r4 = r5.size()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String[] r13 = X.C17890vO.A1b(r5, r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
        L_0x0356:
            r12 = 0
            if (r13 == 0) goto L_0x03e0
            int r14 = r13.length     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r14 <= 0) goto L_0x03e0
            r5 = 0
            r10 = r13[r3]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r4 = "annotation"
            boolean r4 = r10.equals(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r4 == 0) goto L_0x03e0
            X.D3x r10 = r0.A08     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r4 = "trace_config.fallback_sampling_rate_for_string_list_condition"
            int r11 = r10.A00(r4, r3)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r11 == r7) goto L_0x03e0
            X.C5Y r12 = new X.C5Y     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.<init>()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r4 = 3
            if (r14 < r4) goto L_0x03ca
            if (r11 < 0) goto L_0x03bf
            r10 = r13[r7]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r4 = "any"
            boolean r4 = r10.equals(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r4 == 0) goto L_0x0393
            X.DF7 r4 = new X.DF7     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x03e3 }
        L_0x038a:
            r12.A01 = r4     // Catch:{ IllegalArgumentException -> 0x03e3 }
            int r14 = r14 + -2
            java.lang.String[] r10 = new java.lang.String[r14]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.A03 = r10     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x03a1
        L_0x0393:
            java.lang.String r4 = "all"
            boolean r4 = r10.equals(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            if (r4 == 0) goto L_0x03ac
            X.DF6 r4 = new X.DF6     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r4.<init>()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x038a
        L_0x03a1:
            if (r5 >= r14) goto L_0x03d8
            int r4 = r5 + 2
            r4 = r13[r4]     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r10[r5] = r4     // Catch:{ IllegalArgumentException -> 0x03e3 }
            int r5 = r5 + 1
            goto L_0x03a1
        L_0x03ac:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r4 = "'"
            r5.append(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r5.append(r10)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r4 = "' is not a valid operation"
            java.lang.IllegalArgumentException r4 = X.AnonymousClass001.A12(r4, r5)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x03d7
        L_0x03bf:
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            java.lang.String r4 = "Fallback sampling rate < 0: "
            java.lang.IllegalArgumentException r4 = X.AnonymousClass001.A13(r4, r5, r11)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x03d7
        L_0x03ca:
            java.lang.String r4 = "Annotation conditions should have at least 3 elements"
            java.lang.IllegalArgumentException r4 = X.AnonymousClass000.A0k(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x03d7
        L_0x03d1:
            java.lang.String r4 = "Int conditions should come in pairs"
            java.lang.IllegalArgumentException r4 = X.AnonymousClass000.A0k(r4)     // Catch:{ IllegalArgumentException -> 0x03e3 }
        L_0x03d7:
            throw r4     // Catch:{ IllegalArgumentException -> 0x03e3 }
        L_0x03d8:
            java.util.HashSet r4 = X.C17880vN.A12()     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.A02 = r4     // Catch:{ IllegalArgumentException -> 0x03e3 }
            r12.A00 = r11     // Catch:{ IllegalArgumentException -> 0x03e3 }
        L_0x03e0:
            r9.A00 = r12     // Catch:{ IllegalArgumentException -> 0x03e3 }
            goto L_0x03e5
        L_0x03e3:
            r9.A02 = r7     // Catch:{ all -> 0x0510 }
        L_0x03e5:
            X.C5S r4 = r9.A01     // Catch:{ all -> 0x0510 }
            if (r4 != 0) goto L_0x03ed
            X.C5Y r4 = r9.A00     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x03ef
        L_0x03ed:
            r9.A03 = r7     // Catch:{ all -> 0x0510 }
        L_0x03ef:
            boolean r4 = r9.A02     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x03f8
            monitor-exit(r8)     // Catch:{ all -> 0x0516 }
            monitor-exit(r1)     // Catch:{ all -> 0x0519 }
            r1 = 0
            goto L_0x04d3
        L_0x03f8:
            boolean r4 = r9.A03     // Catch:{ all -> 0x0510 }
            if (r4 == 0) goto L_0x0403
            android.util.LongSparseArray r7 = r8.A00     // Catch:{ all -> 0x0510 }
            long r4 = r0.A06     // Catch:{ all -> 0x0510 }
            r7.put(r4, r9)     // Catch:{ all -> 0x0510 }
        L_0x0403:
            monitor-exit(r8)     // Catch:{ all -> 0x0516 }
            long r12 = r0.A06     // Catch:{ IOException -> 0x04fa }
            java.io.File r4 = r0.A0A     // Catch:{ IOException -> 0x04fa }
            java.lang.String r9 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x04fa }
            java.lang.String r10 = r0.A0E     // Catch:{ IOException -> 0x04fa }
            com.facebook.profilo.mmapbuf.core.Buffer[] r11 = r0.A0F     // Catch:{ IOException -> 0x04fa }
            X.DFB r8 = new X.DFB     // Catch:{ IOException -> 0x04fa }
            r8.<init>(r1, r0)     // Catch:{ IOException -> 0x04fa }
            X.DaM r7 = new X.DaM     // Catch:{ IOException -> 0x04fa }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x04fa }
            r0.A0G = r7     // Catch:{ all -> 0x0516 }
            int r5 = r0.A03     // Catch:{ all -> 0x0516 }
            r4 = r5 & 2
            if (r4 != 0) goto L_0x0444
            com.facebook.profilo.writer.NativeTraceWriter r8 = r7.A01     // Catch:{ all -> 0x0516 }
            com.facebook.profilo.mmapbuf.core.Buffer r9 = r0.A09     // Catch:{ all -> 0x0516 }
            long r10 = r0.A06     // Catch:{ all -> 0x0516 }
            r4 = r5 & 3
            if (r4 == 0) goto L_0x0430
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x043a
        L_0x0430:
            X.D3x r7 = r0.A08     // Catch:{ all -> 0x0516 }
            java.lang.String r5 = "trace_config.trace_timeout_ms"
            r4 = 30000(0x7530, float:4.2039E-41)
            int r13 = r7.A00(r5, r4)     // Catch:{ all -> 0x0516 }
        L_0x043a:
            int r14 = r0.A03     // Catch:{ all -> 0x0516 }
            long r4 = r0.A06     // Catch:{ all -> 0x0516 }
            r12 = 39
            r15 = r4
            com.facebook.profilo.logger.BufferLogger.writeAndWakeupTraceWriter(r8, r9, r10, r12, r13, r14, r15)     // Catch:{ all -> 0x0516 }
        L_0x0444:
            java.util.HashSet r7 = r1.A03     // Catch:{ all -> 0x0516 }
            long r4 = r0.A06     // Catch:{ all -> 0x0516 }
            X.C17880vN.A1R(r7, r4)     // Catch:{ all -> 0x0516 }
            X.DFA r9 = r1.A01     // Catch:{ all -> 0x0516 }
            if (r9 == 0) goto L_0x04c5
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r13 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r13)     // Catch:{ all -> 0x0516 }
            r4 = r19
            java.util.ArrayList r7 = r4.A01     // Catch:{ all -> 0x0513 }
            int r5 = r4.A00(r7)     // Catch:{ all -> 0x0513 }
            int r4 = com.facebook.profilo.core.TraceEvents.sLastNameRefreshProvidersState     // Catch:{ all -> 0x0513 }
            if (r5 == r4) goto L_0x048e
            com.facebook.profilo.core.TraceEvents.sLastNameRefreshProvidersState = r5     // Catch:{ all -> 0x0513 }
            monitor-enter(r7)     // Catch:{ all -> 0x0513 }
            java.util.ArrayList r5 = X.C17880vN.A10(r7)     // Catch:{ all -> 0x04f1 }
            monitor-exit(r7)     // Catch:{ all -> 0x04f1 }
            int r4 = r5.size()     // Catch:{ all -> 0x0513 }
            int[] r12 = new int[r4]     // Catch:{ all -> 0x0513 }
            java.lang.String[] r11 = new java.lang.String[r4]     // Catch:{ all -> 0x0513 }
            java.util.Iterator r10 = r5.iterator()     // Catch:{ all -> 0x0513 }
            r8 = 0
        L_0x0473:
            boolean r4 = r10.hasNext()     // Catch:{ all -> 0x0513 }
            if (r4 == 0) goto L_0x048b
            java.lang.String r7 = X.C17880vN.A0v(r10)     // Catch:{ all -> 0x0513 }
            r11[r8] = r7     // Catch:{ all -> 0x0513 }
            int r5 = r8 + 1
            r4 = r19
            int r4 = r4.A01(r7)     // Catch:{ all -> 0x0513 }
            r12[r8] = r4     // Catch:{ all -> 0x0513 }
            r8 = r5
            goto L_0x0473
        L_0x048b:
            com.facebook.profilo.core.TraceEvents.nativeRefreshProviderNames(r12, r11)     // Catch:{ all -> 0x0513 }
        L_0x048e:
            monitor-exit(r13)     // Catch:{ all -> 0x0516 }
            int r4 = r0.A02     // Catch:{ all -> 0x0516 }
            monitor-enter(r13)     // Catch:{ all -> 0x0516 }
            int r4 = com.facebook.profilo.core.TraceEvents.nativeEnableProviders(r4)     // Catch:{ all -> 0x0513 }
            com.facebook.profilo.core.TraceEvents.sProviders = r4     // Catch:{ all -> 0x0513 }
            monitor-exit(r13)     // Catch:{ all -> 0x0516 }
            monitor-enter(r9)     // Catch:{ all -> 0x0516 }
            X.Cn8[] r12 = r9.A03     // Catch:{ all -> 0x04f7 }
            monitor-exit(r9)     // Catch:{ all -> 0x04f7 }
            java.lang.Object r11 = r9.A06     // Catch:{ all -> 0x0516 }
            monitor-enter(r11)     // Catch:{ all -> 0x0516 }
            int r10 = r12.length     // Catch:{ all -> 0x04f4 }
            r8 = 0
        L_0x04a2:
            if (r8 >= r10) goto L_0x04c4
            r7 = r12[r8]     // Catch:{ all -> 0x04f4 }
            int r5 = r0.A02     // Catch:{ all -> 0x04f4 }
            int r4 = r7.getSupportedProviders()     // Catch:{ all -> 0x04f4 }
            r5 = r5 & r4
            if (r5 == 0) goto L_0x04c1
            com.facebook.profilo.logger.MultiBufferLogger r5 = r7.A01()     // Catch:{ all -> 0x04f4 }
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r0.A09     // Catch:{ all -> 0x04f4 }
            r5.addBuffer(r4)     // Catch:{ all -> 0x04f4 }
            r7.A02()     // Catch:{ all -> 0x04f4 }
            X.Cn8.A00(r7, r0)     // Catch:{ all -> 0x04f4 }
            r7.onTraceStarted(r0, r9)     // Catch:{ all -> 0x04f4 }
        L_0x04c1:
            int r8 = r8 + 1
            goto L_0x04a2
        L_0x04c4:
            monitor-exit(r11)     // Catch:{ all -> 0x04f4 }
        L_0x04c5:
            r4 = 1
            X.C108955ca.A1F(r1, r0, r4)     // Catch:{ all -> 0x0516 }
            android.os.Message r5 = r1.obtainMessage(r3, r0)     // Catch:{ all -> 0x0516 }
            long r3 = (long) r6     // Catch:{ all -> 0x0516 }
            r1.sendMessageDelayed(r5, r3)     // Catch:{ all -> 0x0516 }
            monitor-exit(r1)     // Catch:{ all -> 0x0519 }
        L_0x04d2:
            r1 = 1
        L_0x04d3:
            monitor-exit(r2)     // Catch:{ all -> 0x0519 }
            if (r1 != 0) goto L_0x0105
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Failed to start trace "
            r2.append(r1)
            java.lang.String r1 = r0.A0D
            r2.append(r1)
            java.lang.String r1 = " due to malformed config for context "
            r2.append(r1)
            long r0 = r0.A05
            java.lang.String r1 = X.C17880vN.A0u(r2, r0)
            goto L_0x0274
        L_0x04f1:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x04f1 }
            throw r0     // Catch:{ all -> 0x0513 }
        L_0x04f4:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x04f4 }
            goto L_0x0515
        L_0x04f7:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x04f7 }
            goto L_0x0515
        L_0x04fa:
            r5 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0516 }
            java.lang.String r3 = "Could not get canonical path of trace directory "
            r4.append(r3)     // Catch:{ all -> 0x0516 }
            java.io.File r0 = r0.A0A     // Catch:{ all -> 0x0516 }
            java.lang.String r0 = X.C17890vO.A0V(r0, r4)     // Catch:{ all -> 0x0516 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0516 }
            r3.<init>(r0, r5)     // Catch:{ all -> 0x0516 }
            goto L_0x0515
        L_0x0510:
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0516 }
            goto L_0x0515
        L_0x0513:
            r3 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0516 }
        L_0x0515:
            throw r3     // Catch:{ all -> 0x0516 }
        L_0x0516:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0519 }
            throw r0     // Catch:{ all -> 0x0519 }
        L_0x0519:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0519 }
            throw r0
        L_0x051c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unregistered controller for id = "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25443Cfs.A00(android.content.Context, X.198, int):void");
    }
}
