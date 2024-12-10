package X;

/* renamed from: X.25d  reason: invalid class name and case insensitive filesystem */
public class C448825d implements Runnable {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C448825d(C18780x9 r2) {
        this.A01 = 4;
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        com.whatsapp.util.Log.w("Failed to inflate resource in the background! Retrying on the UI thread", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r8 = r8 | java.lang.Thread.interrupted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        ((java.lang.Runnable) r6.A00).run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e9, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3 = X.C18780x9.A05;
        r2 = java.util.logging.Level.SEVERE;
        r1 = new java.lang.StringBuilder();
        r1.append("Exception while executing runnable ");
        r1.append((java.lang.Runnable) r6.A00);
        r3.log(r2, r1.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0118, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r6.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011f, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r6 = r19
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x013c;
                case 1: goto L_0x014c;
                case 2: goto L_0x016f;
                case 3: goto L_0x009e;
                case 4: goto L_0x00b4;
                case 5: goto L_0x0184;
                case 6: goto L_0x0190;
                case 7: goto L_0x0261;
                case 8: goto L_0x0287;
                case 9: goto L_0x028f;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x02b2;
                case 13: goto L_0x02be;
                case 14: goto L_0x02c8;
                case 15: goto L_0x02d4;
                case 16: goto L_0x0417;
                case 17: goto L_0x0423;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r7 = r6.A00
            X.1rx r7 = (X.C38821rx) r7
            java.lang.Object r4 = r6.A02
            X.1s1 r4 = (X.C38861s1) r4
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            r3 = 0
            X.C17960vV.A01()
            X.1ry r0 = r4.A04
            java.lang.ref.WeakReference r6 = new java.lang.ref.WeakReference
            r6.<init>(r0)
            java.lang.Object r0 = r6.get()     // Catch:{ RuntimeException -> 0x0071 }
            boolean r0 = r0 instanceof X.C38831ry     // Catch:{ RuntimeException -> 0x0071 }
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = r6.get()     // Catch:{ RuntimeException -> 0x0071 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.inflater.WaAsyncLayoutInflaterImpl"
            X.C18070vi.A0z(r1, r0)     // Catch:{ RuntimeException -> 0x0071 }
            X.1ry r1 = (X.C38831ry) r1     // Catch:{ RuntimeException -> 0x0071 }
            X.0vl r0 = r1.A01     // Catch:{ RuntimeException -> 0x0071 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ RuntimeException -> 0x0071 }
            X.C18070vi.A0X(r2)     // Catch:{ RuntimeException -> 0x0071 }
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2     // Catch:{ RuntimeException -> 0x0071 }
            int r1 = r4.A00     // Catch:{ RuntimeException -> 0x0071 }
            android.view.ViewGroup r0 = r4.A02     // Catch:{ RuntimeException -> 0x0071 }
            android.view.View r5 = r2.inflate(r1, r0, r3)     // Catch:{ RuntimeException -> 0x0071 }
            r4.A01 = r5     // Catch:{ RuntimeException -> 0x0071 }
            boolean r0 = r4.A06     // Catch:{ RuntimeException -> 0x0071 }
            if (r0 == 0) goto L_0x0077
            if (r5 == 0) goto L_0x0077
            java.util.HashMap r2 = r7.A00     // Catch:{ RuntimeException -> 0x0071 }
            monitor-enter(r2)     // Catch:{ RuntimeException -> 0x0071 }
            int r0 = r4.A00     // Catch:{ all -> 0x006e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006e }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x0067
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x006e }
            r0.<init>()     // Catch:{ all -> 0x006e }
            r2.put(r1, r0)     // Catch:{ all -> 0x006e }
        L_0x0067:
            java.util.LinkedList r0 = (java.util.LinkedList) r0     // Catch:{ all -> 0x006e }
            r0.add(r5)     // Catch:{ all -> 0x006e }
            monitor-exit(r2)     // Catch:{ RuntimeException -> 0x0071 }
            goto L_0x0077
        L_0x006e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ RuntimeException -> 0x0071 }
            throw r0     // Catch:{ RuntimeException -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            java.lang.String r0 = "Failed to inflate resource in the background! Retrying on the UI thread"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0077:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0433
            java.lang.Object r0 = r6.get()
            boolean r0 = r0 instanceof X.C38831ry
            if (r0 == 0) goto L_0x0433
            java.lang.Object r1 = r6.get()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.inflater.WaAsyncLayoutInflaterImpl"
            X.C18070vi.A0z(r1, r0)
            X.1ry r1 = (X.C38831ry) r1
            X.0vl r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r4)
            r0.sendToTarget()
            return
        L_0x009e:
            java.lang.Object r1 = r6.A00
            X.0x7 r1 = (X.C18760x7) r1
            java.lang.Object r2 = r6.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            int r0 = r1.A00
            android.os.Process.setThreadPriority(r0)
            android.os.StrictMode$ThreadPolicy r0 = r1.A01
            if (r0 == 0) goto L_0x0430
            android.os.StrictMode.setThreadPolicy(r0)
            goto L_0x0430
        L_0x00b4:
            r9 = 0
            r8 = 0
        L_0x00b6:
            java.lang.Object r7 = r6.A02     // Catch:{ all -> 0x0120 }
            X.0x9 r7 = (X.C18780x9) r7     // Catch:{ all -> 0x0120 }
            java.util.Deque r5 = r7.A02     // Catch:{ all -> 0x0120 }
            monitor-enter(r5)     // Catch:{ all -> 0x0120 }
            if (r9 != 0) goto L_0x00cf
            java.lang.Integer r0 = r7.A01     // Catch:{ all -> 0x011a }
            java.lang.Integer r4 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x011a }
            if (r0 == r4) goto L_0x010d
            long r2 = r7.A00     // Catch:{ all -> 0x011a }
            r0 = 1
            long r0 = r0 + r2
            r7.A00 = r0     // Catch:{ all -> 0x011a }
            r7.A01 = r4     // Catch:{ all -> 0x011a }
            r9 = 1
        L_0x00cf:
            java.lang.Object r0 = r5.poll()     // Catch:{ all -> 0x011a }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x011a }
            r6.A00 = r0     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x00da
            goto L_0x0109
        L_0x00da:
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0120 }
            r8 = r8 | r0
            r5 = 0
            java.lang.Object r0 = r6.A00     // Catch:{ RuntimeException -> 0x00e9 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ RuntimeException -> 0x00e9 }
            r0.run()     // Catch:{ RuntimeException -> 0x00e9 }
            goto L_0x0106
        L_0x00e9:
            r4 = move-exception
            java.util.logging.Logger r3 = X.C18780x9.A05     // Catch:{ all -> 0x0118 }
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x0118 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "Exception while executing runnable "
            r1.append(r0)     // Catch:{ all -> 0x0118 }
            java.lang.Object r0 = r6.A00     // Catch:{ all -> 0x0118 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0118 }
            r1.append(r0)     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0118 }
            r3.log(r2, r0, r4)     // Catch:{ all -> 0x0118 }
        L_0x0106:
            r6.A00 = r5     // Catch:{ all -> 0x0120 }
            goto L_0x00b6
        L_0x0109:
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x011a }
            r7.A01 = r0     // Catch:{ all -> 0x011a }
        L_0x010d:
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            if (r8 == 0) goto L_0x0433
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x012b }
            r0.interrupt()     // Catch:{ Error -> 0x012b }
            return
        L_0x0118:
            r0 = move-exception
            goto L_0x011d
        L_0x011a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x011a }
            goto L_0x011f
        L_0x011d:
            r6.A00 = r5     // Catch:{ all -> 0x0120 }
        L_0x011f:
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r1 = move-exception
            if (r8 == 0) goto L_0x012a
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Error -> 0x012b }
            r0.interrupt()     // Catch:{ Error -> 0x012b }
        L_0x012a:
            throw r1     // Catch:{ Error -> 0x012b }
        L_0x012b:
            r3 = move-exception
            java.lang.Object r2 = r6.A02
            X.0x9 r2 = (X.C18780x9) r2
            java.util.Deque r1 = r2.A02
            monitor-enter(r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0139 }
            r2.A01 = r0     // Catch:{ all -> 0x0139 }
        L_0x0137:
            monitor-exit(r1)     // Catch:{ all -> 0x0139 }
            goto L_0x013b
        L_0x0139:
            r3 = move-exception
            goto L_0x0137
        L_0x013b:
            throw r3
        L_0x013c:
            java.lang.Object r2 = r6.A00
            X.1t7 r2 = (X.C39461t7) r2
            java.lang.Object r1 = r6.A02
            X.1t9 r1 = (X.C39481t9) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            r2.A0A(r1)
            return
        L_0x014c:
            java.lang.Object r3 = r6.A00
            X.1t7 r3 = (X.C39461t7) r3
            java.lang.Object r1 = r6.A02
            X.1t9 r1 = (X.C39481t9) r1
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.util.List r0 = r3.A03
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0433
            java.lang.Integer r2 = r1.A00
            androidx.fragment.app.Fragment r0 = r1.A07
            android.view.View r1 = r0.A0B
            X.C18070vi.A0W(r1)
            android.view.ViewGroup r0 = r3.A02
            X.C41321wA.A01(r1, r0, r2)
            return
        L_0x016f:
            java.lang.Object r2 = r6.A00
            X.1t7 r2 = (X.C39461t7) r2
            java.lang.Object r1 = r6.A02
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            java.util.List r0 = r2.A03
            r0.remove(r1)
            java.util.List r0 = r2.A04
            r0.remove(r1)
            return
        L_0x0184:
            java.lang.Object r1 = r6.A00
            X.1ns r1 = (X.C36431ns) r1
            java.lang.Object r0 = r6.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r1.A02(r0)
            return
        L_0x0190:
            java.lang.Object r2 = r6.A00
            X.19r r2 = (X.C223819r) r2
            java.lang.Object r0 = r6.A02
            X.0vS r0 = (X.C17930vS) r0
            java.io.File r3 = r0.A01()
            java.lang.String r1 = "app_state"
            java.io.File r0 = new java.io.File
            r0.<init>(r3, r1)
            r2.A04 = r0
            java.io.File r0 = r2.A04
            boolean r0 = r0.exists()
            r3 = 0
            if (r0 == 0) goto L_0x01b6
            java.io.File r0 = r2.A04
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L_0x01c6
        L_0x01b6:
            java.io.File r0 = r2.A04
            r0.delete()
            java.io.File r0 = r2.A04
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L_0x01c6
            r2.A06 = r3
            return
        L_0x01c6:
            r4 = 0
        L_0x01c7:
            java.io.File r0 = r2.A04
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.io.File r5 = new java.io.File
            r5.<init>(r0, r1)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x01f4
            int r4 = r4 + 1
            r0 = 5
            if (r4 < r0) goto L_0x01c7
            long r4 = java.lang.System.currentTimeMillis()
            r0 = 5
            long r4 = r4 % r0
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r2.A05 = r0
            java.io.File r1 = r2.A04
            java.lang.String r0 = r2.A05
            java.io.File r5 = new java.io.File
            r5.<init>(r1, r0)
            goto L_0x01f6
        L_0x01f4:
            r2.A05 = r1
        L_0x01f6:
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x025e }
            r4.<init>(r5, r0)     // Catch:{ IOException -> 0x025e }
            r9 = 1024(0x400, double:5.06E-321)
            r4.setLength(r9)     // Catch:{ all -> 0x0254 }
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch:{ all -> 0x0254 }
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_WRITE     // Catch:{ all -> 0x0254 }
            r7 = 0
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch:{ all -> 0x0254 }
            r2.A01 = r0     // Catch:{ all -> 0x0254 }
            r0.position(r3)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r0 = r2.A01     // Catch:{ all -> 0x0254 }
            byte[] r6 = X.C223819r.A08     // Catch:{ all -> 0x0254 }
            r0.put(r6)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r1 = r2.A01     // Catch:{ all -> 0x0254 }
            int r5 = X.C223819r.A07     // Catch:{ all -> 0x0254 }
            int r0 = r5 + -1
            r1.position(r0)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r1 = r2.A01     // Catch:{ all -> 0x0254 }
            r0 = 10
            r1.put(r0)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r0 = r2.A01     // Catch:{ all -> 0x0254 }
            r0.put(r6)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r0 = r2.A01     // Catch:{ all -> 0x0254 }
            r0.position(r3)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r1 = r2.A01     // Catch:{ all -> 0x0254 }
            java.lang.String r0 = X.C223919s.A00     // Catch:{ all -> 0x0254 }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x0254 }
            r1.put(r0)     // Catch:{ all -> 0x0254 }
            java.nio.MappedByteBuffer r1 = r2.A01     // Catch:{ all -> 0x0254 }
            int r0 = r5 + 2
            r1.position(r0)     // Catch:{ all -> 0x0254 }
            X.19y r0 = new X.19y     // Catch:{ all -> 0x0254 }
            r0.<init>()     // Catch:{ all -> 0x0254 }
            r2.A00 = r0     // Catch:{ all -> 0x0254 }
            r0 = 1
            r2.A06 = r0     // Catch:{ all -> 0x0254 }
            r4.close()     // Catch:{ IOException -> 0x025e }
            return
        L_0x0254:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0259 }
            goto L_0x025d
        L_0x0259:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x025e }
        L_0x025d:
            throw r1     // Catch:{ IOException -> 0x025e }
        L_0x025e:
            r2.A06 = r3
            return
        L_0x0261:
            java.lang.Object r5 = r6.A00
            X.1NA r5 = (X.AnonymousClass1NA) r5
            java.lang.Object r0 = r6.A02
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x026d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0433
            java.lang.Object r3 = r4.next()
            X.1x1 r3 = (X.C41761x1) r3
            X.1NC r0 = r5.A01
            java.util.Map r2 = r0.A01
            long r0 = r3.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r3)
            goto L_0x026d
        L_0x0287:
            java.lang.String r0 = "duration"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x028f:
            java.lang.Object r7 = r6.A00
            X.18C r7 = (X.AnonymousClass18C) r7
            java.lang.Object r6 = r6.A02
            X.1Eg r6 = (X.C23031Eg) r6
            java.util.concurrent.CountDownLatch r5 = r7.A03
            long r3 = r5.getCount()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x02aa
            r6.A00(r7)
            r5.countDown()
            return
        L_0x02aa:
            java.lang.String r0 = "Multiple calls to initializeCommonAttributes"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x02b2:
            java.lang.Object r1 = r6.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r6.A02
            X.1cc r0 = (X.C29641cc) r0
            X.C29631cb.A01(r1, r0)
            return
        L_0x02be:
            java.lang.Object r1 = r6.A00
            X.1Hg r1 = (X.C23691Hg) r1
            java.lang.Object r0 = r6.A02
            r1.CGE(r0)
            return
        L_0x02c8:
            java.lang.Object r1 = r6.A00
            X.10s r1 = (X.C200710s) r1
            java.lang.Object r0 = r6.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.execute(r0)
            return
        L_0x02d4:
            java.lang.Object r13 = r6.A00
            X.1pH r13 = (X.C37291pH) r13
            java.lang.Object r14 = r6.A02
            android.content.Context r14 = (android.content.Context) r14
            X.1iv r0 = r13.A01
            r16 = 0
            X.1ir r5 = r0.A02     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            X.C33461ir.A01(r5)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            X.11P r0 = r5.A01     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            long r11 = X.AnonymousClass11P.A01(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.util.concurrent.ConcurrentHashMap r0 = r5.A04     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
        L_0x02f5:
            boolean r0 = r10.hasNext()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            if (r0 == 0) goto L_0x0433
            java.lang.Object r1 = r10.next()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            X.C18070vi.A0X(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            int r6 = r0.intValue()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            X.C18070vi.A0X(r2)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            X.1tG r2 = (X.C39551tG) r2     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            int r0 = r2.A01     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.util.List r1 = X.C39751ta.A02     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            boolean r0 = r1.contains(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            if (r0 != 0) goto L_0x02f5
            java.lang.String r2 = r2.A06     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            int r0 = r2.length()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            if (r0 == 0) goto L_0x02f5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x03c8 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x03c8 }
            X.00H r0 = r5.A03     // Catch:{ JSONException -> 0x03c8 }
            java.lang.Object r2 = r0.get()     // Catch:{ JSONException -> 0x03c8 }
            X.1v8 r2 = (X.C40701v8) r2     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r0 = "privacy-disclosure"
            org.json.JSONObject r1 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r0 = "timing"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x03c8 }
            X.C18070vi.A0X(r0)     // Catch:{ JSONException -> 0x03c8 }
            X.1vP r7 = r2.A04(r0)     // Catch:{ JSONException -> 0x03c8 }
            X.0vl r3 = r5.A05     // Catch:{ JSONException -> 0x03c8 }
            java.lang.Object r2 = r3.getValue()     // Catch:{ JSONException -> 0x03c8 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ JSONException -> 0x03c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x03c8 }
            r1.<init>()     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r0 = "repeat_last_index_"
            r1.append(r0)     // Catch:{ JSONException -> 0x03c8 }
            r1.append(r6)     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x03c8 }
            r0 = -1
            int r2 = r2.getInt(r1, r0)     // Catch:{ JSONException -> 0x03c8 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ JSONException -> 0x03c8 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ JSONException -> 0x03c8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x03c8 }
            r1.<init>()     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r0 = "repeat_last_ts_"
            r1.append(r0)     // Catch:{ JSONException -> 0x03c8 }
            r1.append(r6)     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r3 = r1.toString()     // Catch:{ JSONException -> 0x03c8 }
            r0 = 0
            long r8 = r4.getLong(r3, r0)     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r1 = r7.A03     // Catch:{ JSONException -> 0x03c8 }
            java.lang.String r0 = "timeBased"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ JSONException -> 0x03c8 }
            if (r0 == 0) goto L_0x02f5
            X.1vL r0 = r7.A02     // Catch:{ JSONException -> 0x03c8 }
            X.1vL r4 = r7.A01     // Catch:{ JSONException -> 0x03c8 }
            if (r0 == 0) goto L_0x03a0
            long r0 = r0.A00     // Catch:{ JSONException -> 0x03c8 }
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x02f5
        L_0x03a0:
            if (r4 == 0) goto L_0x03a8
            long r0 = r4.A00     // Catch:{ JSONException -> 0x03c8 }
            int r3 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x02f5
        L_0x03a8:
            X.1vM r0 = r7.A00     // Catch:{ JSONException -> 0x03c8 }
            if (r0 == 0) goto L_0x03c3
            long[] r7 = r0.A01     // Catch:{ JSONException -> 0x03c8 }
            r1 = 1
            if (r7 == 0) goto L_0x03c3
            int r0 = r7.length     // Catch:{ JSONException -> 0x03c8 }
            if (r0 == 0) goto L_0x03c3
            if (r2 < 0) goto L_0x03c3
            int r0 = r0 - r1
            if (r2 >= r0) goto L_0x02f5
            long r3 = r11 - r8
            int r0 = r2 + 1
            r1 = r7[r0]     // Catch:{ JSONException -> 0x03c8 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02f5
        L_0x03c3:
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)     // Catch:{ JSONException -> 0x03c8 }
            goto L_0x03eb
        L_0x03c8:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            r1.<init>()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.String r0 = "PrivacyDisclosureStore/getAutoStartDisclosureNoticeId() "
            r1.append(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            r1.append(r6)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.String r0 = " : JSONException"
            r1.append(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            r1.append(r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1tZ -> 0x040f, all -> 0x03f5 }
            goto L_0x02f5
        L_0x03eb:
            if (r17 == 0) goto L_0x0433
            X.6wZ r15 = X.C138126wZ.A02
            r18 = r16
            r13.A02(r14, r15, r16, r17, r18)
            return
        L_0x03f5:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PrivacyDisclosureDataManager/getAutoStartDisclosureNoticeId ran into Unknown Exception "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x040f:
            java.lang.String r1 = "getMessage"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0417:
            java.lang.Object r1 = r6.A00
            X.10J r1 = (X.AnonymousClass10J) r1
            java.lang.Object r0 = r6.A02
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.CGF(r0)
            return
        L_0x0423:
            java.lang.Object r0 = r6.A00
            X.10O r0 = (X.AnonymousClass10O) r0
            java.lang.Object r2 = r6.A02
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            int r0 = r0.A00
            android.os.Process.setThreadPriority(r0)
        L_0x0430:
            r2.run()
        L_0x0433:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448825d.run():void");
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (4 - this.A01 != 0) {
            return super.toString();
        }
        Object obj = this.A00;
        if (obj != null) {
            sb.append("SequentialExecutorWorker{running=");
            sb.append(obj);
        } else {
            sb = new StringBuilder();
            sb.append("SequentialExecutorWorker{state=");
            switch (((C18780x9) this.A02).A01.intValue()) {
                case 0:
                    str = "IDLE";
                    break;
                case 1:
                    str = "QUEUING";
                    break;
                case 2:
                    str = "QUEUED";
                    break;
                default:
                    str = "RUNNING";
                    break;
            }
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }

    public C448825d(Object obj, Object obj2, int i) {
        this.A01 = i;
        this.A00 = obj;
        this.A02 = obj2;
    }
}
