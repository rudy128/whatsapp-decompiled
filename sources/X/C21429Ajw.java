package X;

/* renamed from: X.Ajw  reason: case insensitive filesystem */
public class C21429Ajw implements Runnable {
    public final int A00;
    public final Object A01;

    public C21429Ajw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9lb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0331, code lost:
        r2.notifyAllObservers(new X.AnonymousClass7KX(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0339, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0427, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0428, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x042b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x047e, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0481, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04e3, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r8 = r2.A01;
        com.whatsapp.util.Log.e("PersistentStore/read-job-error:", r5);
        r8.A00.A01.A0G("jobmanager-job-read-error", r5.getMessage(), false);
        r3 = r15.rawQuery("SELECT count(1) from queue", (java.lang.String[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0503, code lost:
        if (r3.moveToNext() != false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0505, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("PersistentStorage/read-jobs-error/numJobs:");
        r1 = X.C17880vN.A0t(r1, r3.getInt(0));
        X.C18070vi.A0d(r1, 0);
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0521, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        r0.CEz(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00af, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04e3 A[ExcHandler: SQLiteBlobTooBigException | IllegalStateException (r5v7 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:65:0x01bd] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r2 = r24
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x02a0;
                case 1: goto L_0x0007;
                case 2: goto L_0x0007;
                case 3: goto L_0x02a8;
                case 4: goto L_0x0318;
                case 5: goto L_0x0325;
                case 6: goto L_0x033a;
                case 7: goto L_0x036d;
                case 8: goto L_0x0383;
                case 9: goto L_0x038d;
                case 10: goto L_0x0013;
                case 11: goto L_0x0037;
                case 12: goto L_0x0395;
                case 13: goto L_0x03b9;
                case 14: goto L_0x03c3;
                case 15: goto L_0x0063;
                case 16: goto L_0x042f;
                case 17: goto L_0x0097;
                case 18: goto L_0x0455;
                case 19: goto L_0x0478;
                case 20: goto L_0x00b0;
                case 21: goto L_0x0482;
                case 22: goto L_0x0493;
                case 23: goto L_0x04a1;
                case 24: goto L_0x00f9;
                case 25: goto L_0x04a9;
                case 26: goto L_0x04ba;
                case 27: goto L_0x0157;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r2.A01
            X.0vk r1 = (X.C18090vk) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.invoke()
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r4 = r2.A01
            X.ALt r4 = (X.C20456ALt) r4
            java.lang.String r0 = "XFamilyAutoCrosspostManager/registerXmppListener network disconnected"
            r3 = 0
            X.C18070vi.A0d(r0, r3)
            X.1dS r0 = r4.A05
            X.0ve r2 = r0.A01
            r1 = 10743(0x29f7, float:1.5054E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0012
            java.lang.Runnable r1 = r4.A01
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "XFamilyAutoCrosspostManager/registerXmppListener cancelled"
            X.C18070vi.A0d(r0, r3)
            X.10I r0 = r4.A04
            goto L_0x00ac
        L_0x0037:
            java.lang.Object r3 = r2.A01
            X.ALt r3 = (X.C20456ALt) r3
            java.lang.String r1 = "XFamilyAutoCrosspostManager/registerXmppListener network connected"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.1mM r1 = (X.C35511mM) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A09
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0012
            X.1dS r0 = r3.A05
            X.0ve r2 = r0.A01
            r1 = 10743(0x29f7, float:1.5054E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0012
            r3.A00()
            return
        L_0x0063:
            java.lang.Object r5 = r2.A01
            X.9HG r5 = (X.AnonymousClass9HG) r5
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener network connected"
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            X.1mM r1 = r5.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A08
            boolean r0 = r1.A06(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "CrosspostUnsentStatusManager/scheduleSendUnsentCrosspostStatus started scheduling unsent crosspost statuses"
            X.C18070vi.A0d(r0, r2)
            java.lang.Runnable r1 = r5.A01
            if (r1 == 0) goto L_0x0085
            X.10I r0 = r5.A04
            r0.CEz(r1)
        L_0x0085:
            X.10I r4 = r5.A04
            long r2 = X.AnonymousClass9HG.A0A
            r1 = 16
            X.Ajw r0 = new X.Ajw
            r0.<init>(r5, r1)
            X.25d r0 = r4.CGv(r0, r2)
            r5.A01 = r0
            return
        L_0x0097:
            java.lang.Object r3 = r2.A01
            X.9HG r3 = (X.AnonymousClass9HG) r3
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener network disconnected"
            r2 = 0
            X.C18070vi.A0d(r0, r2)
            java.lang.Runnable r1 = r3.A01
            if (r1 == 0) goto L_0x0012
            java.lang.String r0 = "CrosspostUnsentStatusManager/registerXmppListener cancelled"
            X.C18070vi.A0d(r0, r2)
            X.10I r0 = r3.A04
        L_0x00ac:
            r0.CEz(r1)
            return
        L_0x00b0:
            java.lang.Object r1 = r2.A01
            X.1dB r1 = (X.C29971dB) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x0012
            X.00H r0 = r1.A0E
            java.util.Iterator r8 = X.C17890vO.A0h(r0)
        L_0x00c4:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r7 = r8.next()
            X.9gR r7 = (X.C187829gR) r7
            X.0vl r0 = r7.A03
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00c4
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r7.A00
            long r5 = r3 - r0
            X.0vl r0 = r7.A04
            long r1 = X.C72453Mb.A0K(r0)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c4
            X.00H r0 = r7.A02
            java.lang.Object r1 = r0.get()
            X.18K r1 = (X.AnonymousClass18K) r1
            r0 = 1
            r1.CHJ(r0)
            r7.A00 = r3
            goto L_0x00c4
        L_0x00f9:
            java.lang.Object r3 = r2.A01
            org.npci.upi.security.pinactivitycomponent.s r3 = (org.npci.upi.security.pinactivitycomponent.s) r3
            int r4 = r3.A00
            r0 = -1
            if (r4 == r0) goto L_0x0012
            java.util.ArrayList r1 = r3.A04
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x010a
            int r4 = r4 + -1
        L_0x010a:
            java.lang.Object r0 = r1.get(r4)
            boolean r0 = r0 instanceof X.AnonymousClass8Do
            if (r0 == 0) goto L_0x0012
            int r0 = X.AnonymousClass8BY.A04(r1, r3, r4)
            X.8Do r4 = X.AnonymousClass8BR.A1C(r1, r0)
            android.content.Context r0 = r3.A02
            org.npci.upi.security.pinactivitycomponent.GetCredential r0 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r0
            X.9Nq r0 = r0.A0D
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x04ca
            r4.A01()
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x04ca
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r1 = r1.equals(r0)
            r0 = 2131898680(0x7f123138, float:1.9432285E38)
            if (r1 == 0) goto L_0x013b
            r0 = 2131898679(0x7f123137, float:1.9432283E38)
        L_0x013b:
            java.lang.String r7 = r3.A1H(r0)
            X.1FL r1 = r3.A1B()
            r0 = 2131231637(0x7f080395, float:1.807936E38)
            android.graphics.drawable.Drawable r5 = X.C24261Jm.A00(r1, r0)
            r0 = 34
            X.78M r6 = new X.78M
            r6.<init>(r4, r2, r0)
            r8 = 1
            r9 = r8
            r4.BAJ(r5, r6, r7, r8, r9)
            return
        L_0x0157:
            java.lang.Object r3 = r2.A01
            X.9nG r3 = (X.C191829nG) r3
            X.A0C r2 = r3.A07
            r6 = 0
            java.lang.String r18 = "encrypted = 0"
            java.util.LinkedList r5 = X.AnonymousClass8BR.A14()
            java.util.concurrent.locks.ReentrantReadWriteLock r9 = r2.A02     // Catch:{ all -> 0x053d }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r9.readLock()     // Catch:{ all -> 0x053d }
            r0.lock()     // Catch:{ all -> 0x053d }
            X.8CG r0 = r2.A03     // Catch:{ all -> 0x053d }
            android.database.sqlite.SQLiteDatabase r15 = r0.getReadableDatabase()     // Catch:{ all -> 0x053d }
            r14 = 1
            r8 = 0
        L_0x0175:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x053d }
            r4.append(r8)     // Catch:{ all -> 0x053d }
            java.lang.String r0 = ","
            r4.append(r0)     // Catch:{ all -> 0x053d }
            r1 = 50
            java.lang.String r23 = X.C17880vN.A0t(r4, r1)     // Catch:{ all -> 0x053d }
            java.lang.String r16 = "queue"
            java.lang.String r22 = "_id ASC"
            r19 = r6
            r20 = r6
            r21 = r6
            r17 = r6
            android.database.Cursor r4 = r15.query(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x053d }
            int r0 = r4.getCount()     // Catch:{ all -> 0x0531 }
            if (r0 != r1) goto L_0x01a0
            int r8 = r8 + 50
            goto L_0x01a1
        L_0x01a0:
            r14 = 0
        L_0x01a1:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0531 }
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = "_id"
            long r0 = X.C17890vO.A06(r4, r0)     // Catch:{ all -> 0x0531 }
            java.lang.String r7 = "item"
            java.lang.String r10 = X.C17890vO.A0S(r4, r7)     // Catch:{ all -> 0x0531 }
            java.lang.String r7 = "encrypted"
            int r7 = r4.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x0531 }
            r4.getInt(r7)     // Catch:{ all -> 0x0531 }
            r7 = 2
            X.C18070vi.A0d(r10, r7)     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            byte[] r7 = X.C197019w1.A01(r10)     // Catch:{ ClassNotFoundException -> 0x01e3 }
            java.io.ByteArrayInputStream r10 = new java.io.ByteArrayInputStream     // Catch:{ ClassNotFoundException -> 0x01e3 }
            r10.<init>(r7)     // Catch:{ ClassNotFoundException -> 0x01e3 }
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x01e3 }
            r7.<init>(r10)     // Catch:{ ClassNotFoundException -> 0x01e3 }
            java.lang.Object r10 = r7.readObject()     // Catch:{ ClassNotFoundException -> 0x01e3 }
            org.whispersystems.jobqueue.Job r10 = (org.whispersystems.jobqueue.Job) r10     // Catch:{ ClassNotFoundException -> 0x01e3 }
            X.C18070vi.A0X(r10)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            r10.A07(r0)     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            android.content.Context r7 = r2.A00     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            X.C181949Sl.A00(r7, r10)     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            r5.add(r10)     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            goto L_0x01a1
        L_0x01e3:
            r12 = move-exception
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            r11.<init>()     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            java.io.PrintWriter r7 = new java.io.PrintWriter     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            r7.<init>(r11)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            r12.printStackTrace(r7)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            X.AnonymousClass8BS.A1I(r10, r12)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            java.lang.String r7 = "\n"
            r10.append(r7)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            X.AnonymousClass8BS.A1D(r11, r10)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            java.lang.String r7 = r10.toString()     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            java.io.IOException r7 = X.C17880vN.A0f(r7)     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            throw r7     // Catch:{ RuntimeException -> 0x0209, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
        L_0x0209:
            r10 = move-exception
            java.lang.Throwable r7 = r10.getCause()     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            boolean r7 = r7 instanceof java.lang.ClassNotFoundException     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            if (r7 == 0) goto L_0x0218
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            r7.<init>(r10)     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
            throw r7     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
        L_0x0218:
            throw r10     // Catch:{ IOException -> 0x0219, SQLiteBlobTooBigException | IllegalStateException -> 0x04e3 }
        L_0x0219:
            r12 = move-exception
            X.9WO r7 = r2.A01     // Catch:{ all -> 0x0531 }
            java.lang.String r10 = "PersistentStore/read-job-error:"
            com.whatsapp.util.Log.e(r10, r12)     // Catch:{ all -> 0x0531 }
            java.lang.String r13 = r12.getMessage()     // Catch:{ all -> 0x0531 }
            java.lang.String r11 = "jobmanager-job-read-error"
            r10 = 0
            X.1Mm r7 = r7.A00     // Catch:{ all -> 0x0531 }
            X.190 r7 = r7.A01     // Catch:{ all -> 0x0531 }
            r7.A0G(r11, r13, r10)     // Catch:{ all -> 0x0531 }
            java.lang.String r7 = "PersistentStore"
            android.util.Log.w(r7, r12)     // Catch:{ all -> 0x0531 }
            r2.A00(r0)     // Catch:{ all -> 0x0531 }
            goto L_0x01a1
        L_0x0239:
            r4.close()     // Catch:{ all -> 0x053d }
            if (r14 != 0) goto L_0x0175
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r9.readLock()
            r0.unlock()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PersistentStorage/getJobs-total-read:"
            X.C17890vO.A14(r0, r1, r5)
            java.lang.String r1 = r1.toString()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.A1G r2 = r3.A06
            monitor-enter(r2)
            java.util.LinkedList r0 = r2.A01     // Catch:{ all -> 0x052e }
            r0.addAll(r5)     // Catch:{ all -> 0x052e }
            java.util.Iterator r1 = r5.iterator()     // Catch:{ all -> 0x052e }
        L_0x0262:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x052e }
            if (r0 == 0) goto L_0x0272
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x052e }
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0     // Catch:{ all -> 0x052e }
            X.A1G.A00(r0, r2)     // Catch:{ all -> 0x052e }
            goto L_0x0262
        L_0x0272:
            X.Ame r0 = r2.A05     // Catch:{ all -> 0x052e }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x052e }
            r0.open()     // Catch:{ all -> 0x052e }
            monitor-exit(r2)
            X.9WO r0 = r3.A02
            X.1Mm r0 = r0.A00
            X.1Mg r4 = r0.A02
            X.9nG r0 = X.C25001Mm.A00(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A04
            int r3 = r0.get()
            java.util.Iterator r2 = r5.iterator()
        L_0x028e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0012
            java.lang.Object r1 = r2.next()
            org.whispersystems.jobqueue.Job r1 = (org.whispersystems.jobqueue.Job) r1
            X.1Mi r0 = r4.A02
            r0.A00(r1, r3)
            goto L_0x028e
        L_0x02a0:
            java.lang.Object r0 = r2.A01
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r0.A02()
            return
        L_0x02a8:
            java.lang.Object r5 = r2.A01
            X.Ai7 r5 = (X.C21322Ai7) r5
            r6 = 0
            X.C18070vi.A0d(r5, r6)
            java.util.concurrent.ConcurrentHashMap r1 = r5.A03
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            r1.clear()
            java.util.LinkedHashMap r9 = X.C17880vN.A13()
            java.util.Iterator r8 = X.C17890vO.A0i(r0)
        L_0x02c2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02de
            java.util.Map$Entry r7 = X.AnonymousClass000.A16(r8)
            java.lang.Object r0 = r7.getValue()
            long r3 = X.C17880vN.A05(r0)
            r1 = 60
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02c2
            X.C108985cd.A1T(r7, r9)
            goto L_0x02c2
        L_0x02de:
            boolean r0 = X.AnonymousClass8BR.A1Y(r9)
            if (r0 == 0) goto L_0x0307
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FrequentWorkersAnomalyDetector/reportAnomalies too-frequent work detected: "
            X.C17900vP.A0Z(r9, r0, r1)
            java.util.Iterator r3 = X.AnonymousClass000.A15(r9)
        L_0x02f1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0307
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r3)
            X.190 r2 = r5.A00
            java.lang.String r1 = X.C17880vN.A0x(r0)
            java.lang.String r0 = "work-anomaly-FREQUENT_RUNNING_WORK"
            r2.A0G(r0, r1, r6)
            goto L_0x02f1
        L_0x0307:
            X.10I r3 = r5.A02
            X.0vl r0 = r5.A04
            java.lang.Object r2 = r0.getValue()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.CGv(r2, r0)
            return
        L_0x0318:
            java.lang.Object r0 = r2.A01
            X.1mM r0 = (X.C35511mM) r0
            X.00H r0 = r0.A01
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 43
            goto L_0x0331
        L_0x0325:
            java.lang.Object r0 = r2.A01
            X.1mM r0 = (X.C35511mM) r0
            X.00H r0 = r0.A01
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 44
        L_0x0331:
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x033a:
            java.lang.Object r3 = r2.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r3 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r3
            X.1dR r1 = r3.A05
            if (r1 == 0) goto L_0x0363
            java.lang.String r0 = "TAP_NATIVE_AUTH_DIFFERENT_ACCOUNT"
            r1.A04(r0)
            X.0zA r0 = r3.A00
            if (r0 == 0) goto L_0x0366
            r0.A03()
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.xfamily.accountlinking.ui.AccountLinkingWebAuthActivity"
            r2.setClassName(r1, r0)
            r0 = 0
            r3.startActivity(r2, r0)
            r3.finish()
            return
        L_0x0363:
            java.lang.String r0 = "xFamilyUserFlowLogger"
            goto L_0x0368
        L_0x0366:
            java.lang.String r0 = "webAuthLauncher"
        L_0x0368:
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x036d:
            java.lang.Object r3 = r2.A01
            X.1FY r3 = (X.AnonymousClass1FY) r3
            X.1L9 r2 = r3.A01
            X.1LC r1 = r3.A03
            java.lang.String r0 = "https://www.facebook.com/privacy/policy"
            android.net.Uri r0 = r1.A00(r0)
            android.content.Intent r0 = X.AnonymousClass3MY.A07(r0)
            r2.A08(r3, r0)
            return
        L_0x0383:
            java.lang.Object r2 = r2.A01
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity r2 = (com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity) r2
            r1 = 0
            r0 = 1
            com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity.A0Q(r2, r1, r1, r0)
            return
        L_0x038d:
            java.lang.Object r0 = r2.A01
            X.6p4 r0 = (X.C133616p4) r0
            X.1KB r0 = r0.A01
            goto L_0x047e
        L_0x0395:
            java.lang.Object r6 = r2.A01
            X.ALt r6 = (X.C20456ALt) r6
            java.lang.String r0 = "XFamilyAutoCrosspostManager/sendUnsentCrosspostStatus called"
            r5 = 0
            X.C18070vi.A0d(r0, r5)
            X.6LL r0 = r6.A00
            X.C17890vO.A0t(r0)
            X.11P r4 = r6.A03
            X.00H r3 = r6.A07
            X.00H r2 = r6.A09
            X.00H r0 = r6.A08
            X.6LL r1 = new X.6LL
            r1.<init>(r4, r3, r2, r0)
            r6.A00 = r1
            X.10I r0 = r6.A04
            X.AnonymousClass3MW.A1T(r1, r0, r5)
            return
        L_0x03b9:
            java.lang.Object r1 = r2.A01
            X.1dR r1 = (X.C30131dR) r1
            java.lang.String r0 = "BACKGROUND_APP"
            r1.A04(r0)
            return
        L_0x03c3:
            java.lang.Object r0 = r2.A01
            X.2QK r0 = (X.AnonymousClass2QK) r0
            X.00H r0 = r0.A00
            java.lang.Object r8 = r0.get()
            X.72Q r8 = (X.AnonymousClass72Q) r8
            X.2rN r0 = r8.A02()
            X.C62422rN.A00(r0)
            X.00p r7 = r0.A00
            monitor-enter(r7)
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x042c }
            int r5 = r7.A00()     // Catch:{ all -> 0x042c }
            r4 = 0
        L_0x03e2:
            if (r4 >= r5) goto L_0x03f9
            long r2 = r7.A02(r4)     // Catch:{ all -> 0x042c }
            java.lang.Object r0 = r7.A04(r4)     // Catch:{ all -> 0x042c }
            int r1 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x042c }
            r0 = 3
            if (r1 == r0) goto L_0x03f6
            X.C17880vN.A1R(r6, r2)     // Catch:{ all -> 0x042c }
        L_0x03f6:
            int r4 = r4 + 1
            goto L_0x03e2
        L_0x03f9:
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x042c }
        L_0x03fd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x042c }
            if (r0 == 0) goto L_0x040b
            long r0 = X.C17890vO.A07(r2)     // Catch:{ all -> 0x042c }
            r7.A08(r0)     // Catch:{ all -> 0x042c }
            goto L_0x03fd
        L_0x040b:
            monitor-exit(r7)
            X.1Cd r0 = r8.A00
            X.1au r5 = r0.A05()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0425 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0425 }
            java.lang.String r3 = "status_crossposting"
            java.lang.String r2 = "state <> 3"
            java.lang.String r1 = "XFamilyStatusCrosspostingStore/DELETE_ALL_NON_SUCCESS_RECORDS"
            r0 = 0
            r4.A04(r3, r2, r1, r0)     // Catch:{ all -> 0x0425 }
            r5.close()
            return
        L_0x0425:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0427 }
        L_0x0427:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x042c:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x042f:
            java.lang.Object r2 = r2.A01
            X.9HG r2 = (X.AnonymousClass9HG) r2
            java.lang.String r0 = "CrosspostUnsentStatusManager/sendUnsentCrosspostStatus called"
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.6LM r0 = r2.A00
            X.C17890vO.A0t(r0)
            X.11P r4 = r2.A03
            X.00H r5 = r2.A06
            X.00H r6 = r2.A09
            X.00H r7 = r2.A07
            X.00H r8 = r2.A08
            X.6LM r3 = new X.6LM
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            X.10I r0 = r2.A04
            X.AnonymousClass3MW.A1T(r3, r0, r1)
            return
        L_0x0455:
            java.lang.Object r0 = r2.A01
            X.9HG r0 = (X.AnonymousClass9HG) r0
            X.00H r0 = r0.A08
            java.lang.Object r1 = r0.get()
            X.6p6 r1 = (X.AnonymousClass6p6) r1
            X.0vl r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r1.A01
            r0.clear()
            java.lang.String r1 = "CrosspostUnsentStatusManager/onUnlink account unlinked, clean up unsent sessions"
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            return
        L_0x0478:
            java.lang.Object r0 = r2.A01
            X.6fY r0 = (X.C128166fY) r0
            X.1KB r0 = r0.A01
        L_0x047e:
            r0.A04()
            return
        L_0x0482:
            java.lang.Object r2 = r2.A01
            X.1dB r2 = (X.C29971dB) r2
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0K
            r0.set(r1)
            X.C29971dB.A02(r2)
            return
        L_0x0493:
            java.lang.Object r1 = r2.A01
            X.A2s r1 = (X.C20003A2s) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r0 = r1.A00
            X.C20003A2s.A00(r1, r0)
            return
        L_0x04a1:
            java.lang.Object r1 = r2.A01
            org.npci.upi.security.pinactivitycomponent.GetCredential r1 = (org.npci.upi.security.pinactivitycomponent.GetCredential) r1
            r0 = 0
            r1.A0G = r0
            return
        L_0x04a9:
            X.9lb r1 = new X.9lb
            r1.<init>()
            java.lang.String r0 = "SMS"
            r1.A01 = r0
            java.lang.Object r0 = r2.A01
            org.npci.upi.security.pinactivitycomponent.s r0 = (org.npci.upi.security.pinactivitycomponent.s) r0
            r0.A27(r1)
            return
        L_0x04ba:
            java.lang.Object r0 = r2.A01
            X.9nG r0 = (X.C191829nG) r0
            X.A1G r2 = r0.A06
            monitor-enter(r2)
            X.Ame r0 = r2.A05     // Catch:{ all -> 0x052e }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x052e }
            r0.open()     // Catch:{ all -> 0x052e }
            monitor-exit(r2)
            return
        L_0x04ca:
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = "AADHAAR"
            boolean r1 = r1.equals(r0)
            r0 = 2131898724(0x7f123164, float:1.9432374E38)
            if (r1 == 0) goto L_0x04da
            r0 = 2131898641(0x7f123111, float:1.9432205E38)
        L_0x04da:
            java.lang.String r1 = r3.A1H(r0)
            r0 = 1
            r4.A02(r1, r0)
            return
        L_0x04e3:
            r5 = move-exception
            X.9WO r8 = r2.A01     // Catch:{ all -> 0x0531 }
            java.lang.String r0 = "PersistentStore/read-job-error:"
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x0531 }
            java.lang.String r7 = r5.getMessage()     // Catch:{ all -> 0x0531 }
            java.lang.String r3 = "jobmanager-job-read-error"
            r1 = 0
            X.1Mm r0 = r8.A00     // Catch:{ all -> 0x0531 }
            X.190 r0 = r0.A01     // Catch:{ all -> 0x0531 }
            r0.A0G(r3, r7, r1)     // Catch:{ all -> 0x0531 }
            java.lang.String r0 = "SELECT count(1) from queue"
            android.database.Cursor r3 = r15.rawQuery(r0, r6)     // Catch:{ all -> 0x0531 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0522 }
            if (r0 == 0) goto L_0x051e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0522 }
            java.lang.String r0 = "PersistentStorage/read-jobs-error/numJobs:"
            r1.append(r0)     // Catch:{ all -> 0x0522 }
            r0 = 0
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0522 }
            java.lang.String r1 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x0522 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0522 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0522 }
        L_0x051e:
            r3.close()     // Catch:{ all -> 0x0531 }
            throw r5     // Catch:{ all -> 0x0531 }
        L_0x0522:
            r1 = move-exception
            if (r3 == 0) goto L_0x052d
            r3.close()     // Catch:{ all -> 0x0529 }
            goto L_0x052d
        L_0x0529:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0531 }
        L_0x052d:
            throw r1     // Catch:{ all -> 0x0531 }
        L_0x052e:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0531:
            r1 = move-exception
            if (r4 == 0) goto L_0x053c
            r4.close()     // Catch:{ all -> 0x0538 }
            goto L_0x053c
        L_0x0538:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x053d }
        L_0x053c:
            throw r1     // Catch:{ all -> 0x053d }
        L_0x053d:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21429Ajw.run():void");
    }

    public C21429Ajw(C191829nG r2) {
        this.A00 = 27;
        this.A01 = r2;
    }
}
