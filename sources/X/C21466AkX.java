package X;

/* renamed from: X.AkX  reason: case insensitive filesystem */
public class C21466AkX implements Runnable {
    public final int A00;
    public final Object A01;

    public C21466AkX(C20351AHh aHh, int i) {
        this.A00 = i;
        if (23 - i != 0) {
            this.A01 = aHh;
        } else {
            this.A01 = aHh;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, boolean], vars: [r3v29 ?, r3v31 ?, r3v33 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public final void run() {
        /*
            r21 = this;
            r3 = r21
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0564;
                case 1: goto L_0x0007;
                case 2: goto L_0x0960;
                case 3: goto L_0x04d6;
                case 4: goto L_0x0957;
                case 5: goto L_0x094a;
                case 6: goto L_0x093e;
                case 7: goto L_0x0935;
                case 8: goto L_0x04c2;
                case 9: goto L_0x092b;
                case 10: goto L_0x0924;
                case 11: goto L_0x0915;
                case 12: goto L_0x090d;
                case 13: goto L_0x08da;
                case 14: goto L_0x03aa;
                case 15: goto L_0x08d2;
                case 16: goto L_0x02b8;
                case 17: goto L_0x08c7;
                case 18: goto L_0x08b4;
                case 19: goto L_0x02a5;
                case 20: goto L_0x0975;
                case 21: goto L_0x082e;
                case 22: goto L_0x07a8;
                case 23: goto L_0x024f;
                case 24: goto L_0x06c0;
                case 25: goto L_0x019a;
                case 26: goto L_0x000f;
                case 27: goto L_0x06b8;
                case 28: goto L_0x06b3;
                case 29: goto L_0x018c;
                case 30: goto L_0x06a9;
                case 31: goto L_0x06a0;
                case 32: goto L_0x0173;
                case 33: goto L_0x0162;
                case 34: goto L_0x0698;
                case 35: goto L_0x068f;
                case 36: goto L_0x0678;
                case 37: goto L_0x064e;
                case 38: goto L_0x0644;
                case 39: goto L_0x063c;
                case 40: goto L_0x0133;
                case 41: goto L_0x0125;
                case 42: goto L_0x0109;
                case 43: goto L_0x0019;
                case 44: goto L_0x062b;
                case 45: goto L_0x061d;
                case 46: goto L_0x05f9;
                case 47: goto L_0x05f6;
                case 48: goto L_0x05ec;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r3.A01
            X.1OB r1 = (X.AnonymousClass1OB) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            goto L_0x02b3
        L_0x0019:
            boolean r0 = X.C180499Mu.A00
            if (r0 != 0) goto L_0x000e
            r6 = 1
            X.C180499Mu.A00 = r6
            java.lang.Object r1 = r3.A01
            X.2pV r1 = (X.C61332pV) r1
            X.9ww r4 = new X.9ww
            r4.<init>(r1)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.util.Map r3 = X.AIE.A07
            boolean r0 = r3.containsKey(r0)
            if (r0 != 0) goto L_0x00c9
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.9xE r8 = new X.9xE
            r8.<init>(r1)
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.List r11 = r8.A00
            X.2pV r0 = r8.A01
            X.0ve r10 = r0.A00
            r0 = 8671(0x21df, float:1.215E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            if (r0 == 0) goto L_0x0071
            r0 = 9360(0x2490, float:1.3116E-41)
            boolean r1 = X.C18020vd.A05(r9, r10, r0)
            X.8KZ r0 = new X.8KZ
            r0.<init>(r1)
            r2.add(r0)
            if (r1 == 0) goto L_0x0069
            r11.add(r0)
        L_0x0069:
            X.AIG r0 = new X.AIG
            r0.<init>()
            r2.add(r0)
        L_0x0071:
            r0 = 8672(0x21e0, float:1.2152E-41)
            boolean r0 = X.C18020vd.A05(r9, r10, r0)
            if (r0 == 0) goto L_0x0087
            X.AIH r0 = X.AIH.A03
            if (r0 != 0) goto L_0x0084
            X.AIH r0 = new X.AIH
            r0.<init>()
            X.AIH.A03 = r0
        L_0x0084:
            r2.add(r0)
        L_0x0087:
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C180539My.A01 = r0
            X.9OU r1 = new X.9OU
            r1.<init>()
            X.AIF r0 = new X.AIF
            r0.<init>(r1, r8, r2)
            r7.add(r0)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00c9
            int r0 = r7.size()
            X.B4V[] r2 = new X.B4V[r0]
            r7.toArray(r2)
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C180539My.A02 = r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.9P6 r0 = new X.9P6
            r0.<init>()
            java.lang.Object r0 = r3.get(r1)
            if (r0 != 0) goto L_0x00c6
            X.AIE r0 = new X.AIE
            r0.<init>(r1, r2)
            r3.put(r1, r0)
        L_0x00c6:
            r5.add(r0)
        L_0x00c9:
            int r0 = r5.size()
            X.C180539My.A00 = r0
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x000e
            int r0 = r5.size()
            if (r0 != r6) goto L_0x00f6
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Object r2 = X.AnonymousClass8BS.A0Y(r5)
            X.BCh r2 = (X.C22550BCh) r2
        L_0x00e5:
            java.util.Map r1 = X.C198029xf.A02
            boolean r0 = r1.containsKey(r3)
            if (r0 != 0) goto L_0x000e
            X.9xf r0 = new X.9xf
            r0.<init>(r3, r2, r4)
            r1.put(r3, r0)
            return
        L_0x00f6:
            int r0 = r5.size()
            X.BCh[] r0 = new X.C22550BCh[r0]
            r5.toArray(r0)
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            X.AID r2 = new X.AID
            r2.<init>(r0)
            goto L_0x00e5
        L_0x0109:
            java.lang.Object r4 = r3.A01
            X.D9O r4 = (X.D9O) r4
            X.D91[] r3 = r4.A0H
            int r2 = r3.length
            r1 = 0
        L_0x0111:
            if (r1 >= r2) goto L_0x011b
            r0 = r3[r1]
            r0.A05()
            int r1 = r1 + 1
            goto L_0x0111
        L_0x011b:
            X.CPC r1 = r4.A0P
            X.E8y r0 = r1.A00
            if (r0 == 0) goto L_0x000e
            r0 = 0
            r1.A00 = r0
            return
        L_0x0125:
            java.lang.Object r1 = r3.A01
            X.D9O r1 = (X.D9O) r1
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x000e
            X.ECh r0 = r1.A08
            r0.BqD(r1)
            return
        L_0x0133:
            java.lang.Object r4 = r3.A01
            X.D9O r4 = (X.D9O) r4
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x000e
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x000e
            X.E8W r0 = r4.A07
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x000e
            X.D91[] r3 = r4.A0H
            int r2 = r3.length
            r8 = 0
            r1 = 0
        L_0x014c:
            if (r1 >= r2) goto L_0x098e
            r0 = r3[r1]
            X.CkT r9 = r0.A09
            monitor-enter(r9)
            boolean r0 = r9.A08     // Catch:{ all -> 0x0a5b }
            if (r0 == 0) goto L_0x0158
            goto L_0x015b
        L_0x0158:
            X.D48 r0 = r9.A07     // Catch:{ all -> 0x0a5b }
            goto L_0x015c
        L_0x015b:
            r0 = 0
        L_0x015c:
            monitor-exit(r9)
            if (r0 == 0) goto L_0x000e
            int r1 = r1 + 1
            goto L_0x014c
        L_0x0162:
            java.lang.Object r0 = r3.A01
            X.Cig r0 = (X.C25601Cig) r0
            android.widget.FrameLayout r2 = r0.A00
            if (r2 == 0) goto L_0x000e
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x000e
            goto L_0x0183
        L_0x0173:
            java.lang.Object r0 = r3.A01
            X.CiW r0 = (X.C25591CiW) r0
            android.widget.FrameLayout r2 = r0.A00
            if (r2 == 0) goto L_0x000e
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0188
        L_0x0183:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeView(r2)
        L_0x0188:
            r2.removeAllViews()
            return
        L_0x018c:
            java.lang.Object r1 = r3.A01
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            if (r0 == 0) goto L_0x000e
            r0.invalidateDrawable(r1)
            return
        L_0x019a:
            java.lang.Object r6 = r3.A01
            androidx.work.impl.workers.ConstraintTrackingWorker r6 = (androidx.work.impl.workers.ConstraintTrackingWorker) r6
            X.5oM r4 = r6.A02
            boolean r0 = r4.isCancelled()
            if (r0 != 0) goto L_0x000e
            androidx.work.WorkerParameters r8 = r6.A01
            X.A6Y r0 = r8.A01
            java.lang.String r1 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"
            java.util.Map r0 = r0.A00
            java.lang.String r7 = X.AnonymousClass8BX.A0e(r1, r0)
            X.A5Z r5 = X.A5Z.A00()
            X.C18070vi.A0X(r5)
            if (r7 == 0) goto L_0x0247
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0247
            X.9z4 r2 = r8.A04
            android.content.Context r1 = r6.A00
            androidx.work.WorkerParameters r0 = r6.A01
            X.A2q r0 = r2.A01(r1, r0, r7)
            r6.A00 = r0
            if (r0 != 0) goto L_0x01df
            java.lang.String r1 = X.AnonymousClass9T0.A00
            java.lang.String r0 = "No worker to delegate to."
            r5.A03(r1, r0)
        L_0x01d6:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
        L_0x01db:
            r4.A05(r0)
            return
        L_0x01df:
            X.A7W r2 = X.A7W.A00(r1)
            X.C18070vi.A0X(r2)
            androidx.work.impl.WorkDatabase r0 = r2.A04
            X.BD8 r1 = r0.A0E()
            java.util.UUID r0 = r8.A08
            java.lang.String r0 = X.C18070vi.A0H(r0)
            X.A2t r9 = r1.Bbs(r0)
            if (r9 == 0) goto L_0x01d6
            X.9e5 r0 = r2.A09
            X.C18070vi.A0X(r0)
            X.9ie r3 = new X.9ie
            r3.<init>(r0)
            X.3Kb r0 = r2.A06
            X.AHx r0 = (X.C20367AHx) r0
            X.0wl r0 = r0.A03
            X.C18070vi.A0X(r0)
            X.1OD r2 = X.C197029w2.A00(r6, r3, r9, r0)
            r0 = 26
            X.AkX r1 = new X.AkX
            r1.<init>((java.lang.Object) r2, (int) r0)
            X.Al9 r0 = new X.Al9
            r0.<init>()
            r4.BBG(r1, r0)
            boolean r0 = r3.A00(r9)
            java.lang.String r3 = X.AnonymousClass9T0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x0234
            java.lang.String r0 = "Constraints met for delegate "
            r1.append(r0)
            X.AnonymousClass8BW.A16(r5, r7, r3, r1)
            goto L_0x0a0f
        L_0x0234:
            java.lang.String r0 = "Constraints not met for delegate "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ". Requesting retry."
            X.AnonymousClass8BW.A16(r5, r0, r3, r1)
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            goto L_0x01db
        L_0x0247:
            java.lang.String r1 = X.AnonymousClass9T0.A00
            java.lang.String r0 = "No worker to delegate to."
            r5.A04(r1, r0)
            goto L_0x01d6
        L_0x024f:
            java.lang.Object r4 = r3.A01
            X.AHh r4 = (X.C20351AHh) r4
            java.util.List r1 = r4.A0A
            monitor-enter(r1)
            r2 = 0
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0aef }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ all -> 0x0aef }
            r4.A00 = r0     // Catch:{ all -> 0x0aef }
            monitor-exit(r1)     // Catch:{ all -> 0x0aef }
            android.content.Intent r0 = r4.A00
            if (r0 == 0) goto L_0x000e
            java.lang.String r7 = r0.getAction()
            android.content.Intent r1 = r4.A00
            java.lang.String r0 = "KEY_START_ID"
            int r8 = r1.getIntExtra(r0, r2)
            X.A5Z r2 = X.A5Z.A00()
            java.lang.String r6 = X.C20351AHh.A0B
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Processing command "
            r1.append(r0)
            android.content.Intent r0 = r4.A00
            r1.append(r0)
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r8)
            r2.A03(r6, r0)
            android.content.Context r2 = r4.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)
            java.lang.String r0 = " ("
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.AnonymousClass8BU.A0q(r1)
            android.os.PowerManager$WakeLock r5 = X.C197059w5.A00(r2, r0)
            goto L_0x0a5e
        L_0x02a5:
            java.lang.Object r1 = r3.A01
            androidx.work.CoroutineWorker r1 = (androidx.work.CoroutineWorker) r1
            X.5oM r0 = r1.A00
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x000e
            X.1OD r1 = r1.A02
        L_0x02b3:
            r0 = 0
            r1.BEM(r0)
            return
        L_0x02b8:
            java.lang.Object r3 = r3.A01
            X.A2Q r3 = (X.A2Q) r3
            X.A6c r2 = r3.A02
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A09
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r7 = r0.readLock()
            X.C18070vi.A0X(r7)
            r7.lock()
            r4 = 1
            X.BE3 r0 = r2.A0B     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            if (r0 == 0) goto L_0x0af2
            X.AHQ r0 = (X.AHQ) r0     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            boolean r0 = r0.isOpen()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            if (r0 != r4) goto L_0x0af2
            boolean r0 = r3.A0D     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            if (r0 != 0) goto L_0x02ee
            X.BE1 r0 = r2.A03()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            X.AHV r0 = (X.AHV) r0     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            X.0vl r0 = r0.A04     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            X.8CH r0 = (X.AnonymousClass8CH) r0     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            r0.A00()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
        L_0x02ee:
            boolean r0 = r3.A0D     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            if (r0 != 0) goto L_0x02fb
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "database is not initialized even though it is open"
            android.util.Log.e(r1, r0)     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            goto L_0x0af2
        L_0x02fb:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A07     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            r0 = 0
            boolean r0 = r1.compareAndSet(r4, r0)     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            if (r0 == 0) goto L_0x0af2
            android.database.sqlite.SQLiteDatabase r0 = X.C20076A6c.A00(r2)     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            boolean r0 = r0.inTransaction()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            if (r0 != 0) goto L_0x0af2
            android.database.sqlite.SQLiteDatabase r6 = X.C20076A6c.A00(r2)     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            r6.beginTransactionNonExclusive()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            X.DcS r4 = new X.DcS     // Catch:{ all -> 0x0382 }
            r4.<init>()     // Catch:{ all -> 0x0382 }
            java.lang.String r0 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            X.AHY r1 = new X.AHY     // Catch:{ all -> 0x0382 }
            r1.<init>(r0)     // Catch:{ all -> 0x0382 }
            r2.A05()     // Catch:{ all -> 0x0382 }
            r2.A06()     // Catch:{ all -> 0x0382 }
            X.BE1 r0 = r2.A03()     // Catch:{ all -> 0x0382 }
            X.AHV r0 = (X.AHV) r0     // Catch:{ all -> 0x0382 }
            X.0vl r0 = r0.A04     // Catch:{ all -> 0x0382 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0382 }
            X.8CH r0 = (X.AnonymousClass8CH) r0     // Catch:{ all -> 0x0382 }
            X.BE3 r0 = r0.A00()     // Catch:{ all -> 0x0382 }
            android.database.Cursor r2 = r0.CD7(r1)     // Catch:{ all -> 0x0382 }
            r1 = 0
        L_0x033e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0376 }
            if (r0 == 0) goto L_0x034c
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x0376 }
            X.C17890vO.A1D(r4, r0)     // Catch:{ all -> 0x0376 }
            goto L_0x033e
        L_0x034c:
            r2.close()     // Catch:{ all -> 0x0382 }
            X.DcS r5 = X.AnonymousClass1AO.A00(r4)     // Catch:{ all -> 0x0382 }
            boolean r0 = X.C17880vN.A1X(r5)     // Catch:{ all -> 0x0382 }
            if (r0 == 0) goto L_0x036a
            X.BDc r0 = r3.A0C     // Catch:{ all -> 0x0382 }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0371
            X.BDc r0 = r3.A0C     // Catch:{ all -> 0x0382 }
            if (r0 == 0) goto L_0x037d
            X.8Jb r0 = (X.C162128Jb) r0     // Catch:{ all -> 0x0382 }
            android.database.sqlite.SQLiteStatement r0 = r0.A00     // Catch:{ all -> 0x0382 }
            r0.executeUpdateDelete()     // Catch:{ all -> 0x0382 }
        L_0x036a:
            r6.setTransactionSuccessful()     // Catch:{ all -> 0x0382 }
            r6.endTransaction()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            goto L_0x039c
        L_0x0371:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r1)     // Catch:{ all -> 0x0382 }
            goto L_0x0381
        L_0x0376:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0378 }
        L_0x0378:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ all -> 0x0382 }
            goto L_0x0381
        L_0x037d:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r1)     // Catch:{ all -> 0x0382 }
        L_0x0381:
            throw r1     // Catch:{ all -> 0x0382 }
        L_0x0382:
            r0 = move-exception
            r6.endTransaction()     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
            throw r0     // Catch:{ IllegalStateException -> 0x0392, SQLiteException -> 0x0387 }
        L_0x0387:
            r2 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0b54 }
            X.1Om r5 = X.C25511Om.A00     // Catch:{ all -> 0x0b54 }
            goto L_0x039c
        L_0x0392:
            r2 = move-exception
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0b54 }
            X.1Om r5 = X.C25511Om.A00     // Catch:{ all -> 0x0b54 }
        L_0x039c:
            r7.unlock()
            boolean r0 = X.C108945cZ.A1U(r5)
            if (r0 == 0) goto L_0x000e
            X.00q r4 = r3.A00
            monitor-enter(r4)
            goto L_0x0af6
        L_0x03aa:
            java.lang.Object r6 = r3.A01
            X.BM5 r6 = (X.BM5) r6
            X.1xT r0 = r6.A0H
            if (r0 == 0) goto L_0x000e
            r0 = -9223372036854775808
            long r7 = java.lang.System.currentTimeMillis()
            long r4 = r6.A0A
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x049f
            r13 = 0
        L_0x03c0:
            androidx.recyclerview.widget.RecyclerView r2 = r6.A0I
            X.1qy r9 = r2.getLayoutManager()
            android.graphics.Rect r4 = r6.A0B
            if (r4 != 0) goto L_0x03d0
            android.graphics.Rect r4 = X.AnonymousClass3MW.A07()
            r6.A0B = r4
        L_0x03d0:
            X.1xT r2 = r6.A0H
            android.view.View r2 = r2.A0H
            r9.A0X(r2, r4)
            boolean r2 = r9.A1I()
            r10 = 0
            if (r2 == 0) goto L_0x049c
            float r4 = r6.A04
            float r2 = r6.A00
            float r4 = r4 + r2
            int r5 = (int) r4
            android.graphics.Rect r2 = r6.A0B
            int r2 = r2.left
            int r12 = r5 - r2
            androidx.recyclerview.widget.RecyclerView r2 = r6.A0I
            int r2 = r2.getPaddingLeft()
            int r12 = r12 - r2
            float r4 = r6.A00
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x0479
            if (r12 >= 0) goto L_0x0479
        L_0x03f9:
            boolean r2 = r9.A1J()
            if (r2 == 0) goto L_0x0477
            float r4 = r6.A05
            float r2 = r6.A01
            float r4 = r4 + r2
            int r9 = (int) r4
            android.graphics.Rect r2 = r6.A0B
            int r2 = r2.top
            int r2 = r9 - r2
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0I
            int r4 = r4.getPaddingTop()
            int r2 = r2 - r4
            float r5 = r6.A01
            int r4 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x0455
            if (r2 >= 0) goto L_0x0455
        L_0x041a:
            if (r12 == 0) goto L_0x0431
            X.Cn6 r9 = r6.A0F
            androidx.recyclerview.widget.RecyclerView r10 = r6.A0I
            X.1xT r4 = r6.A0H
            android.view.View r4 = r4.A0H
            int r11 = r4.getWidth()
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0I
            r4.getWidth()
            int r12 = r9.A02(r10, r11, r12, r13)
        L_0x0431:
            if (r2 == 0) goto L_0x044e
            X.Cn6 r15 = r6.A0F
            androidx.recyclerview.widget.RecyclerView r5 = r6.A0I
            X.1xT r4 = r6.A0H
            android.view.View r4 = r4.A0H
            int r17 = r4.getHeight()
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0I
            r4.getHeight()
            r18 = r2
            r19 = r13
            r16 = r5
            int r2 = r15.A02(r16, r17, r18, r19)
        L_0x044e:
            if (r12 != 0) goto L_0x04a3
            if (r2 != 0) goto L_0x04a3
            r6.A0A = r0
            return
        L_0x0455:
            int r2 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0477
            X.1xT r2 = r6.A0H
            android.view.View r2 = r2.A0H
            int r2 = X.AnonymousClass3MW.A02(r2, r9)
            android.graphics.Rect r4 = r6.A0B
            int r4 = r4.bottom
            int r2 = r2 + r4
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0I
            int r5 = r4.getHeight()
            androidx.recyclerview.widget.RecyclerView r4 = r6.A0I
            int r4 = r4.getPaddingBottom()
            int r5 = r5 - r4
            int r2 = r2 - r5
            if (r2 <= 0) goto L_0x0477
            goto L_0x041a
        L_0x0477:
            r2 = 0
            goto L_0x041a
        L_0x0479:
            int r2 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x049c
            X.1xT r2 = r6.A0H
            android.view.View r2 = r2.A0H
            int r2 = r2.getWidth()
            int r5 = r5 + r2
            android.graphics.Rect r2 = r6.A0B
            int r2 = r2.right
            int r5 = r5 + r2
            androidx.recyclerview.widget.RecyclerView r2 = r6.A0I
            int r4 = r2.getWidth()
            androidx.recyclerview.widget.RecyclerView r2 = r6.A0I
            int r2 = r2.getPaddingRight()
            int r4 = r4 - r2
            int r5 = r5 - r4
            r12 = r5
            if (r5 > 0) goto L_0x03f9
        L_0x049c:
            r12 = 0
            goto L_0x03f9
        L_0x049f:
            long r13 = r7 - r4
            goto L_0x03c0
        L_0x04a3:
            long r4 = r6.A0A
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 != 0) goto L_0x04ab
            r6.A0A = r7
        L_0x04ab:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A0I
            r0.scrollBy(r12, r2)
            X.1xT r0 = r6.A0H
            if (r0 == 0) goto L_0x04b7
            r6.A09(r0)
        L_0x04b7:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0I
            java.lang.Runnable r0 = r6.A0P
            r1.removeCallbacks(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r6.A0I
            goto L_0x0560
        L_0x04c2:
            java.lang.Object r0 = r3.A01
            X.1GP r0 = (X.AnonymousClass1GP) r0
            java.util.ArrayList r0 = r0.A0E
            java.util.Iterator r1 = r0.iterator()
        L_0x04cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            r1.next()
            goto L_0x04cc
        L_0x04d6:
            java.lang.Object r2 = r3.A01
            X.AFc r2 = (X.C20294AFc) r2
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x000e
            boolean r0 = r2.A05
            r6 = 0
            if (r0 == 0) goto L_0x04f7
            r2.A05 = r6
            X.9ye r7 = r2.A0F
            long r4 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r7.A06 = r4
            r0 = -1
            r7.A07 = r0
            r7.A05 = r4
            r0 = 1056964608(0x3f000000, float:0.5)
            r7.A00 = r0
        L_0x04f7:
            X.9ye r9 = r2.A0F
            long r4 = r9.A07
            r7 = 0
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0512
            long r7 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r4 = r9.A07
            int r0 = r9.A02
            long r0 = (long) r0
            long r4 = r4 + r0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0512
        L_0x050f:
            r2.A03 = r6
            return
        L_0x0512:
            boolean r0 = r2.A03()
            if (r0 == 0) goto L_0x050f
            boolean r0 = r2.A04
            if (r0 == 0) goto L_0x0535
            r2.A04 = r6
            long r10 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r14 = 3
            r12 = r10
            r16 = r15
            r17 = r6
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10, r12, r14, r15, r16, r17)
            android.view.View r0 = r2.A0C
            r0.onTouchEvent(r1)
            r1.recycle()
        L_0x0535:
            long r6 = r9.A05
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0b59
            long r6 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r1 = X.C198629ye.A00(r9, r6)
            r8 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r8 = r8 * r1
            float r8 = r8 * r1
            r0 = 1082130432(0x40800000, float:4.0)
            float r1 = r1 * r0
            float r8 = r8 + r1
            long r0 = r9.A05
            long r4 = r6 - r0
            r9.A05 = r6
            float r1 = (float) r4
            float r1 = r1 * r8
            float r0 = r9.A01
            float r1 = r1 * r0
            int r1 = (int) r1
            android.widget.ListView r0 = r2.A0E
            r0.scrollListBy(r1)
            android.view.View r0 = r2.A0C
        L_0x0560:
            r0.postOnAnimation(r3)
            return
        L_0x0564:
            java.lang.Object r2 = r3.A01
            X.D64 r2 = (X.D64) r2
            r0 = 0
            r2.A03 = r0
            X.4rF r4 = new X.4rF
            r4.<init>()
            X.4rF r8 = new X.4rF
            r8.<init>()
            X.0a9 r10 = r2.A09
            int r9 = r10.A00
            r3 = 0
            r7 = 1
            if (r9 <= 0) goto L_0x0597
            java.lang.Object[] r6 = r10.A01
            r5 = 0
        L_0x0580:
            r11 = r6[r5]
            X.ByR r11 = (X.C24268ByR) r11
            int r12 = r11.ordinal()
            r1 = 1
            if (r12 == r3) goto L_0x05cc
            if (r12 == r7) goto L_0x05d1
            r0 = 2
            if (r12 == r0) goto L_0x05d8
            r0 = 3
            if (r12 == r0) goto L_0x05d8
        L_0x0593:
            int r5 = r5 + 1
            if (r5 < r9) goto L_0x0580
        L_0x0597:
            r10.A08()
            java.lang.Object r0 = r4.element
            boolean r0 = X.C18070vi.A19(r0, r7)
            if (r0 == 0) goto L_0x05a5
            X.D64.A01(r2)
        L_0x05a5:
            java.lang.Object r0 = r8.element
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x05bc
            boolean r1 = r0.booleanValue()
            X.E0A r0 = r2.A0B
            X.D62 r0 = (X.D62) r0
            X.CgT r0 = r0.A01
            X.C69 r0 = r0.A00
            if (r1 == 0) goto L_0x05c8
            r0.A02()
        L_0x05bc:
            java.lang.Object r0 = r4.element
            boolean r0 = X.C18070vi.A19(r0, r3)
            if (r0 == 0) goto L_0x000e
            X.D64.A01(r2)
            return
        L_0x05c8:
            r0.A01()
            goto L_0x05bc
        L_0x05cc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            goto L_0x05d5
        L_0x05d1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
        L_0x05d5:
            r4.element = r0
            goto L_0x05e9
        L_0x05d8:
            java.lang.Object r0 = r4.element
            boolean r0 = X.C18070vi.A19(r0, r3)
            if (r0 != 0) goto L_0x0593
            X.ByR r0 = X.C24268ByR.A02
            if (r11 == r0) goto L_0x05e5
            r1 = 0
        L_0x05e5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
        L_0x05e9:
            r8.element = r0
            goto L_0x0593
        L_0x05ec:
            java.lang.Object r0 = r3.A01
            X.DAU r0 = (X.DAU) r0
            android.view.TextureView r0 = r0.A0J
            r0.requestLayout()
            return
        L_0x05f6:
            android.widget.LinearLayout$LayoutParams r0 = X.C197999xc.A02
            return
        L_0x05f9:
            java.lang.Object r4 = r3.A01
            X.9xc r4 = (X.C197999xc) r4
            X.EDI r3 = r4.A00
            java.lang.Runnable r0 = r4.A01
            X.BUa r3 = (X.C22889BUa) r3
            android.os.Handler r2 = r3.A00
            r2.removeCallbacks(r0)
            r0 = 47
            X.AkX r1 = new X.AkX
            r1.<init>((java.lang.Object) r4, (int) r0)
            boolean r0 = r3.Bfg()
            if (r0 == 0) goto L_0x0619
            r1.run()
            return
        L_0x0619:
            r2.post(r1)
            return
        L_0x061d:
            java.lang.Object r0 = r3.A01
            X.AIC r0 = (X.AIC) r0
            X.AIC.A00(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A03
            r0 = 0
            r1.set(r0)
            return
        L_0x062b:
            java.lang.Object r0 = r3.A01
            X.AIC r0 = (X.AIC) r0
            X.AIC.A00(r0)
            android.os.Handler r3 = r0.A01
            java.lang.Runnable r2 = r0.A02
            long r0 = r0.A00
            r3.postDelayed(r2, r0)
            return
        L_0x063c:
            java.lang.Object r0 = r3.A01
            X.BFS r0 = (X.BFS) r0
            X.BFS.A01(r0)
            return
        L_0x0644:
            java.lang.Object r1 = r3.A01
            X.BIJ r1 = (X.BIJ) r1
            int r0 = r1.A01
            r1.A03(r0)
            return
        L_0x064e:
            java.lang.Object r3 = r3.A01
            X.D8L r3 = (X.D8L) r3
            X.D54 r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x0672
            r9 = 0
            r11 = 0
            r4 = 0
            r8 = 3
            r6 = r4
            r10 = r9
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            android.view.GestureDetector r0 = r0.A04     // Catch:{ all -> 0x0668 }
            r0.onTouchEvent(r1)     // Catch:{ all -> 0x0668 }
            goto L_0x066d
        L_0x0668:
            r0 = move-exception
            r1.recycle()
            throw r0
        L_0x066d:
            r1.recycle()
            r3.A00 = r2
        L_0x0672:
            r3.A01 = r2
            r0 = 0
            r3.A02 = r0
            return
        L_0x0678:
            java.lang.Object r1 = r3.A01
            X.CWo r1 = (X.C25079CWo) r1
            r1.A00()
            X.DOZ r0 = r1.A02
            X.CXY r0 = r0.A02
            X.E86 r0 = r0.A01
            r0.BNU()
            r0 = 0
            r1.A00 = r0
            r0 = 0
            r1.A01 = r0
            return
        L_0x068f:
            java.lang.Object r1 = r3.A01
            X.Cvl r1 = (X.C26247Cvl) r1
            r0 = 0
            r1.A09(r0)
            return
        L_0x0698:
            java.lang.Object r0 = r3.A01
            X.BEZ r0 = (X.BEZ) r0
            X.BEZ.A00(r0)
            return
        L_0x06a0:
            java.lang.Object r1 = r3.A01
            X.D8A r1 = (X.D8A) r1
            r0 = 0
            r1.A08(r0)
            return
        L_0x06a9:
            java.lang.Object r0 = r3.A01
            X.D8A r0 = (X.D8A) r0
            X.BI8 r0 = r0.A01
            X.C72453Mb.A1D(r0)
            return
        L_0x06b3:
            java.lang.Object r0 = r3.A01
            java.io.InputStream r0 = (java.io.InputStream) r0
            goto L_0x06bc
        L_0x06b8:
            java.lang.Object r0 = r3.A01
            java.util.zip.ZipInputStream r0 = (java.util.zip.ZipInputStream) r0
        L_0x06bc:
            X.C40171uH.A04(r0)
            return
        L_0x06c0:
            java.lang.Object r3 = r3.A01
            X.AHh r3 = (X.C20351AHh) r3
            X.A5Z r1 = X.A5Z.A00()
            java.lang.String r4 = X.C20351AHh.A0B
            java.lang.String r0 = "Checking if commands are complete."
            r1.A03(r4, r0)
            X.C20351AHh.A00()
            java.util.List r5 = r3.A0A
            monitor-enter(r5)
            android.content.Intent r0 = r3.A00     // Catch:{ all -> 0x07a5 }
            if (r0 == 0) goto L_0x0701
            X.A5Z r2 = X.A5Z.A00()     // Catch:{ all -> 0x07a5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07a5 }
            java.lang.String r0 = "Removing command "
            r1.append(r0)     // Catch:{ all -> 0x07a5 }
            android.content.Intent r0 = r3.A00     // Catch:{ all -> 0x07a5 }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ all -> 0x07a5 }
            r2.A03(r4, r0)     // Catch:{ all -> 0x07a5 }
            r0 = 0
            java.lang.Object r1 = r5.remove(r0)     // Catch:{ all -> 0x07a5 }
            android.content.Intent r1 = (android.content.Intent) r1     // Catch:{ all -> 0x07a5 }
            android.content.Intent r0 = r3.A00     // Catch:{ all -> 0x07a5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x07a5 }
            if (r0 == 0) goto L_0x079e
            r0 = 0
            r3.A00 = r0     // Catch:{ all -> 0x07a5 }
        L_0x0701:
            X.3Kb r0 = r3.A09     // Catch:{ all -> 0x07a5 }
            X.AHx r0 = (X.C20367AHx) r0     // Catch:{ all -> 0x07a5 }
            X.AlD r2 = r0.A01     // Catch:{ all -> 0x07a5 }
            X.AHg r0 = r3.A07     // Catch:{ all -> 0x07a5 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x07a5 }
            monitor-enter(r1)     // Catch:{ all -> 0x07a5 }
            java.util.Map r0 = r0.A03     // Catch:{ all -> 0x079b }
            boolean r0 = X.AnonymousClass8BR.A1Y(r0)     // Catch:{ all -> 0x079b }
            monitor-exit(r1)     // Catch:{ all -> 0x079b }
            if (r0 != 0) goto L_0x0790
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x07a5 }
            if (r0 == 0) goto L_0x0790
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x07a5 }
            monitor-enter(r1)     // Catch:{ all -> 0x07a5 }
            java.util.ArrayDeque r0 = r2.A02     // Catch:{ all -> 0x078d }
            boolean r0 = X.C17880vN.A1X(r0)     // Catch:{ all -> 0x078d }
            monitor-exit(r1)     // Catch:{ all -> 0x078d }
            if (r0 != 0) goto L_0x0790
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ all -> 0x07a5 }
            java.lang.String r0 = "No more commands & intents."
            r1.A03(r4, r0)     // Catch:{ all -> 0x07a5 }
            X.B4O r7 = r3.A02     // Catch:{ all -> 0x07a5 }
            if (r7 == 0) goto L_0x0799
            androidx.work.impl.background.systemalarm.SystemAlarmService r7 = (androidx.work.impl.background.systemalarm.SystemAlarmService) r7     // Catch:{ all -> 0x07a5 }
            r0 = 1
            r7.A01 = r0     // Catch:{ all -> 0x07a5 }
            X.A5Z r2 = X.A5Z.A00()     // Catch:{ all -> 0x07a5 }
            java.lang.String r1 = androidx.work.impl.background.systemalarm.SystemAlarmService.A02     // Catch:{ all -> 0x07a5 }
            java.lang.String r0 = "All commands completed in dispatcher"
            r2.A03(r1, r0)     // Catch:{ all -> 0x07a5 }
            java.util.LinkedHashMap r2 = X.C17880vN.A13()     // Catch:{ all -> 0x07a5 }
            X.9wi r1 = X.C197449wi.A00     // Catch:{ all -> 0x07a5 }
            monitor-enter(r1)     // Catch:{ all -> 0x07a5 }
            java.util.WeakHashMap r0 = X.C197449wi.A01     // Catch:{ all -> 0x078a }
            r2.putAll(r0)     // Catch:{ all -> 0x078a }
            monitor-exit(r1)     // Catch:{ all -> 0x07a5 }
            java.util.Iterator r6 = X.AnonymousClass000.A15(r2)     // Catch:{ all -> 0x07a5 }
        L_0x0755:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x07a5 }
            if (r0 == 0) goto L_0x0786
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r6)     // Catch:{ all -> 0x07a5 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x07a5 }
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0     // Catch:{ all -> 0x07a5 }
            java.lang.String r4 = X.AnonymousClass8BR.A10(r1)     // Catch:{ all -> 0x07a5 }
            if (r0 == 0) goto L_0x0755
            boolean r1 = r0.isHeld()     // Catch:{ all -> 0x07a5 }
            r0 = 1
            if (r1 != r0) goto L_0x0755
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x07a5 }
            java.lang.String r2 = X.C197059w5.A00     // Catch:{ all -> 0x07a5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x07a5 }
            java.lang.String r0 = "WakeLock held for "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ all -> 0x07a5 }
            r3.A06(r2, r0)     // Catch:{ all -> 0x07a5 }
            goto L_0x0755
        L_0x0786:
            r7.stopSelf()     // Catch:{ all -> 0x07a5 }
            goto L_0x0799
        L_0x078a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x07a5 }
            goto L_0x07a4
        L_0x078d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x078d }
            goto L_0x07a4
        L_0x0790:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x07a5 }
            if (r0 != 0) goto L_0x0799
            X.C20351AHh.A01(r3)     // Catch:{ all -> 0x07a5 }
        L_0x0799:
            monitor-exit(r5)     // Catch:{ all -> 0x07a5 }
            return
        L_0x079b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x079b }
            goto L_0x07a4
        L_0x079e:
            java.lang.String r0 = "Dequeue-d command is not the first."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x07a5 }
        L_0x07a4:
            throw r0     // Catch:{ all -> 0x07a5 }
        L_0x07a5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x07a5 }
            throw r0
        L_0x07a8:
            java.lang.Object r6 = r3.A01
            X.AHo r6 = (X.C20358AHo) r6
            int r0 = r6.A00
            if (r0 != 0) goto L_0x0815
            r0 = 1
            r6.A00 = r0
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = X.C20358AHo.A0E
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "onAllConstraintsMet for "
            r1.append(r0)
            X.9pp r7 = r6.A08
            java.lang.String r0 = X.C17890vO.A0V(r7, r1)
            r3.A03(r2, r0)
            X.AHh r3 = r6.A06
            X.AHp r2 = r3.A04
            X.9UL r1 = r6.A05
            r0 = 0
            boolean r0 = r2.A04(r0, r1)
            if (r0 == 0) goto L_0x0811
            X.9zv r5 = r3.A08
            java.lang.Object r4 = r5.A01
            monitor-enter(r4)
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x080e }
            java.lang.String r2 = X.C199389zv.A04     // Catch:{ all -> 0x080e }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x080e }
            java.lang.String r0 = "Starting timer for "
            X.AnonymousClass8BX.A12(r3, r7, r0, r2, r1)     // Catch:{ all -> 0x080e }
            r5.A00(r7)     // Catch:{ all -> 0x080e }
            r0 = 28
            X.Akc r3 = new X.Akc     // Catch:{ all -> 0x080e }
            r3.<init>((java.lang.Object) r7, (java.lang.Object) r5, (int) r0)     // Catch:{ all -> 0x080e }
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x080e }
            r0.put(r7, r3)     // Catch:{ all -> 0x080e }
            java.util.Map r0 = r5.A02     // Catch:{ all -> 0x080e }
            r0.put(r7, r6)     // Catch:{ all -> 0x080e }
            X.B4N r0 = r5.A00     // Catch:{ all -> 0x080e }
            r1 = 600000(0x927c0, double:2.964394E-318)
            X.AHe r0 = (X.C20348AHe) r0     // Catch:{ all -> 0x080e }
            android.os.Handler r0 = r0.A00     // Catch:{ all -> 0x080e }
            r0.postDelayed(r3, r1)     // Catch:{ all -> 0x080e }
            monitor-exit(r4)     // Catch:{ all -> 0x080e }
            return
        L_0x080e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x080e }
            throw r0
        L_0x0811:
            X.C20358AHo.A00(r6)
            return
        L_0x0815:
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = X.C20358AHo.A0E
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Already started work for "
            r1.append(r0)
            X.9pp r0 = r6.A08
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            r3.A03(r2, r0)
            return
        L_0x082e:
            java.lang.Object r3 = r3.A01
            X.AHo r3 = (X.C20358AHo) r3
            X.9pp r9 = r3.A08
            java.lang.String r10 = r9.A01
            int r1 = r3.A00
            r0 = 2
            if (r1 >= r0) goto L_0x0896
            r3.A00 = r0
            X.A5Z r2 = X.A5Z.A00()
            java.lang.String r8 = X.C20358AHo.A0E
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Stopping work for WorkSpec "
            r1.append(r0)
            X.AnonymousClass8BW.A16(r2, r10, r8, r1)
            android.content.Context r11 = r3.A04
            java.lang.Class<androidx.work.impl.background.systemalarm.SystemAlarmService> r7 = androidx.work.impl.background.systemalarm.SystemAlarmService.class
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r11, r7)
            java.lang.String r0 = "ACTION_STOP_WORK"
            r1.setAction(r0)
            X.C20350AHg.A00(r1, r9)
            java.util.concurrent.Executor r6 = r3.A09
            X.AHh r5 = r3.A06
            int r4 = r3.A03
            r3 = 5
            X.C21470Akb.A00(r5, r1, r6, r4, r3)
            X.AHp r0 = r5.A04
            boolean r0 = r0.A05(r10)
            X.A5Z r2 = X.A5Z.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r0 == 0) goto L_0x08a6
            java.lang.String r0 = "WorkSpec "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " needs to be rescheduled"
            X.AnonymousClass8BW.A16(r2, r0, r8, r1)
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r11, r7)
            java.lang.String r0 = "ACTION_SCHEDULE_WORK"
            r1.setAction(r0)
            X.C20350AHg.A00(r1, r9)
            X.C21470Akb.A00(r5, r1, r6, r4, r3)
            return
        L_0x0896:
            X.A5Z r2 = X.A5Z.A00()
            java.lang.String r8 = X.C20358AHo.A0E
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Already stopped work for "
            r1.append(r0)
            goto L_0x08b0
        L_0x08a6:
            java.lang.String r0 = "Processor does not have WorkSpec "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = ". No need to reschedule"
        L_0x08b0:
            X.AnonymousClass8BW.A16(r2, r10, r8, r1)
            return
        L_0x08b4:
            java.lang.Object r2 = r3.A01
            X.1GV r2 = (X.AnonymousClass1GV) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.0wS r1 = X.C18460wS.A00
            X.9pG r0 = new X.9pG
            r0.<init>(r1)
            r2.accept(r0)
            return
        L_0x08c7:
            java.lang.Object r1 = r3.A01
            X.BLs r1 = (X.BLs) r1
            r0 = 0
            r1.A01 = r0
            r1.A0V()
            return
        L_0x08d2:
            java.lang.Object r0 = r3.A01
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            r0.A1V()
            return
        L_0x08da:
            java.lang.Object r2 = r3.A01
            X.BM6 r2 = (X.BM6) r2
            int r0 = r2.A02
            r1 = 2
            r4 = 1
            if (r0 == r4) goto L_0x08e7
            if (r0 == r1) goto L_0x08ec
            return
        L_0x08e7:
            android.animation.ValueAnimator r0 = r2.A0K
            r0.cancel()
        L_0x08ec:
            r0 = 3
            r2.A02 = r0
            android.animation.ValueAnimator r3 = r2.A0K
            float[] r2 = new float[r1]
            java.lang.Object r0 = r3.getAnimatedValue()
            float r1 = X.AnonymousClass000.A04(r0)
            r0 = 0
            r2[r0] = r1
            r0 = 0
            r2[r4] = r0
            r3.setFloatValues(r2)
            r0 = 500(0x1f4, double:2.47E-321)
            r3.setDuration(r0)
            r3.start()
            return
        L_0x090d:
            java.lang.Object r0 = r3.A01
            X.8Hv r0 = (X.C161808Hv) r0
            r0.A0V()
            return
        L_0x0915:
            monitor-enter(r3)
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0921 }
            androidx.preference.PreferenceGroup r0 = (androidx.preference.PreferenceGroup) r0     // Catch:{ all -> 0x0921 }
            X.00O r0 = r0.A05     // Catch:{ all -> 0x0921 }
            r0.clear()     // Catch:{ all -> 0x0921 }
            monitor-exit(r3)     // Catch:{ all -> 0x0921 }
            return
        L_0x0921:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0921 }
            throw r0
        L_0x0924:
            java.lang.Object r0 = r3.A01
            androidx.preference.PreferenceFragmentCompat r0 = (androidx.preference.PreferenceFragmentCompat) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A02
            goto L_0x0931
        L_0x092b:
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.ListFragment r0 = (androidx.fragment.app.ListFragment) r0
            android.widget.ListView r0 = r0.A04
        L_0x0931:
            r0.focusableViewAvailable(r0)
            return
        L_0x0935:
            java.lang.Object r1 = r3.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            r0 = 0
            r1.A1X(r0)
            return
        L_0x093e:
            java.lang.Object r0 = r3.A01
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.content.DialogInterface$OnDismissListener r1 = r0.A05
            android.app.Dialog r0 = r0.A03
            r1.onDismiss(r0)
            return
        L_0x094a:
            java.lang.Object r1 = r3.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 4
            X.C25431Cfd.A00(r1, r0)
            return
        L_0x0957:
            java.lang.Object r1 = r3.A01
            X.Cwc r1 = (X.C26281Cwc) r1
            r0 = 0
            r1.A0C(r0)
            return
        L_0x0960:
            java.lang.Object r2 = r3.A01
            android.view.View r2 = (android.view.View) r2
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r0 = 0
            r1.showSoftInput(r2, r0)
            return
        L_0x0975:
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x0983 }
            androidx.work.Worker r0 = (androidx.work.Worker) r0     // Catch:{ all -> 0x0983 }
            X.9Lg r1 = r0.A0B()     // Catch:{ all -> 0x0983 }
            X.5oM r0 = r0.A00     // Catch:{ all -> 0x0983 }
            r0.A05(r1)     // Catch:{ all -> 0x0983 }
            return
        L_0x0983:
            r1 = move-exception
            java.lang.Object r0 = r3.A01
            androidx.work.Worker r0 = (androidx.work.Worker) r0
            X.5oM r0 = r0.A00
            r0.A06(r1)
            return
        L_0x098e:
            X.Ckn r0 = r4.A0T
            r0.A00()
            X.D91[] r0 = r4.A0H
            int r7 = r0.length
            X.D3X[] r6 = new X.D3X[r7]
            boolean[] r0 = new boolean[r7]
            r4.A0K = r0
            boolean[] r0 = new boolean[r7]
            r4.A0I = r0
            boolean[] r0 = new boolean[r7]
            r4.A0J = r0
            X.E8W r0 = r4.A07
            long r0 = r0.BR1()
            r4.A03 = r0
            r5 = 0
        L_0x09ad:
            r3 = 1
            if (r5 >= r7) goto L_0x09f3
            X.D91[] r0 = r4.A0H
            r0 = r0[r5]
            X.CkT r9 = r0.A09
            monitor-enter(r9)
            boolean r0 = r9.A08     // Catch:{ all -> 0x0a5b }
            if (r0 == 0) goto L_0x09bc
            goto L_0x09bf
        L_0x09bc:
            X.D48 r2 = r9.A07     // Catch:{ all -> 0x0a5b }
            goto L_0x09c0
        L_0x09bf:
            r2 = 0
        L_0x09c0:
            monitor-exit(r9)
            X.D48[] r1 = new X.D48[r3]
            r1[r8] = r2
            X.D3X r0 = new X.D3X
            r0.<init>(r1)
            r6[r5] = r0
            java.lang.String r2 = r2.A0S
            java.lang.String r1 = "video"
            java.lang.String r0 = X.C26233CvQ.A04(r2)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x09e7
            java.lang.String r1 = "audio"
            java.lang.String r0 = X.C26233CvQ.A04(r2)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x09e7
            r3 = 0
        L_0x09e7:
            boolean[] r0 = r4.A0K
            r0[r5] = r3
            boolean r0 = r4.A0A
            r3 = r3 | r0
            r4.A0A = r3
            int r5 = r5 + 1
            goto L_0x09ad
        L_0x09f3:
            X.D3a r0 = new X.D3a
            r0.<init>(r6)
            r4.A09 = r0
            r4.A0E = r3
            X.BOy r3 = r4.A0Q
            long r1 = r4.A03
            X.E8W r0 = r4.A07
            boolean r0 = r0.BgN()
            r3.A07(r1, r0)
            X.ECh r0 = r4.A08
            r0.C1a(r4)
            return
        L_0x0a0f:
            X.A2q r0 = r6.A00     // Catch:{ all -> 0x0a28 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0a28 }
            X.EEC r2 = r0.A08()     // Catch:{ all -> 0x0a28 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0a28 }
            r0 = 30
            X.Akc r1 = new X.Akc     // Catch:{ all -> 0x0a28 }
            r1.<init>((java.lang.Object) r6, (java.lang.Object) r2, (int) r0)     // Catch:{ all -> 0x0a28 }
            java.util.concurrent.Executor r0 = r8.A09     // Catch:{ all -> 0x0a28 }
            r2.BBG(r1, r0)     // Catch:{ all -> 0x0a28 }
            return
        L_0x0a28:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Delegated worker "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " threw exception in startWork."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5.A07(r3, r0, r2)
            java.lang.Object r9 = r6.A03
            monitor-enter(r9)
            boolean r0 = r6.A04     // Catch:{ all -> 0x0a5b }
            if (r0 == 0) goto L_0x0a53
            java.lang.String r0 = "Constraints were unmet, Retrying."
            r5.A03(r3, r0)     // Catch:{ all -> 0x0a5b }
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x0a5b }
            r0.<init>()     // Catch:{ all -> 0x0a5b }
        L_0x0a4f:
            r4.A05(r0)     // Catch:{ all -> 0x0a5b }
            goto L_0x0a59
        L_0x0a53:
            X.8Jj r0 = new X.8Jj     // Catch:{ all -> 0x0a5b }
            r0.<init>()     // Catch:{ all -> 0x0a5b }
            goto L_0x0a4f
        L_0x0a59:
            monitor-exit(r9)
            return
        L_0x0a5b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x0a5e:
            X.A5Z r2 = X.A5Z.A00()     // Catch:{ all -> 0x0a8b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0a8b }
            java.lang.String r0 = "Acquiring operation wake lock ("
            r1.append(r0)     // Catch:{ all -> 0x0a8b }
            r1.append(r7)     // Catch:{ all -> 0x0a8b }
            java.lang.String r3 = ") "
            X.AnonymousClass8BX.A12(r2, r5, r3, r6, r1)     // Catch:{ all -> 0x0a8b }
            r5.acquire()     // Catch:{ all -> 0x0a8b }
            X.AHg r1 = r4.A07     // Catch:{ all -> 0x0a8b }
            android.content.Intent r0 = r4.A00     // Catch:{ all -> 0x0a8b }
            r1.A01(r0, r4, r8)     // Catch:{ all -> 0x0a8b }
            X.A5Z r2 = X.A5Z.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Releasing operation wake lock ("
            X.C17890vO.A10(r0, r7, r3, r1)
            goto L_0x0aaa
        L_0x0a8b:
            r2 = move-exception
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ all -> 0x0ac5 }
            java.lang.String r0 = "Unexpected error in onHandleIntent"
            r1.A08(r6, r0, r2)     // Catch:{ all -> 0x0ac5 }
            X.A5Z r2 = X.A5Z.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Releasing operation wake lock ("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") "
            r1.append(r0)
        L_0x0aaa:
            java.lang.String r0 = X.C17890vO.A0V(r5, r1)
            r2.A03(r6, r0)
            r5.release()
            X.3Kb r0 = r4.A09
            X.AHx r0 = (X.C20367AHx) r0
            java.util.concurrent.Executor r2 = r0.A02
            r1 = 24
            X.AkX r0 = new X.AkX
            r0.<init>((X.C20351AHh) r4, (int) r1)
            r2.execute(r0)
            return
        L_0x0ac5:
            r3 = move-exception
            X.A5Z r2 = X.A5Z.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Releasing operation wake lock ("
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ") "
            X.AnonymousClass8BX.A12(r2, r5, r0, r6, r1)
            r5.release()
            X.3Kb r0 = r4.A09
            X.AHx r0 = (X.C20367AHx) r0
            java.util.concurrent.Executor r2 = r0.A02
            r1 = 24
            X.AkX r0 = new X.AkX
            r0.<init>((X.C20351AHh) r4, (int) r1)
            r2.execute(r0)
            throw r3
        L_0x0aef:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0aef }
            throw r0
        L_0x0af2:
            r7.unlock()
            return
        L_0x0af6:
            java.util.Iterator r10 = r4.iterator()     // Catch:{ all -> 0x0b51 }
        L_0x0afa:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0b51 }
            if (r0 == 0) goto L_0x0b4f
            java.lang.Object r7 = X.C17890vO.A0P(r10)     // Catch:{ all -> 0x0b51 }
            X.9e4 r7 = (X.C186359e4) r7     // Catch:{ all -> 0x0b51 }
            r9 = 0
            int[] r8 = r7.A02     // Catch:{ all -> 0x0b51 }
            int r6 = r8.length     // Catch:{ all -> 0x0b51 }
            r0 = 1
            if (r6 == 0) goto L_0x0b38
            r3 = 0
            if (r6 == r0) goto L_0x0b2d
            X.DcS r2 = new X.DcS     // Catch:{ all -> 0x0b51 }
            r2.<init>()     // Catch:{ all -> 0x0b51 }
            r1 = 0
        L_0x0b16:
            r0 = r8[r3]     // Catch:{ all -> 0x0b51 }
            int r9 = r9 + 1
            boolean r0 = X.C108965cb.A1b(r5, r0)     // Catch:{ all -> 0x0b51 }
            if (r0 == 0) goto L_0x0b27
            java.lang.String[] r0 = r7.A03     // Catch:{ all -> 0x0b51 }
            r0 = r0[r1]     // Catch:{ all -> 0x0b51 }
            r2.add(r0)     // Catch:{ all -> 0x0b51 }
        L_0x0b27:
            int r3 = r3 + 1
            r1 = r9
            if (r3 < r6) goto L_0x0b16
            goto L_0x0b3b
        L_0x0b2d:
            r0 = r8[r9]     // Catch:{ all -> 0x0b51 }
            boolean r0 = X.C108965cb.A1b(r5, r0)     // Catch:{ all -> 0x0b51 }
            if (r0 == 0) goto L_0x0b38
            java.util.Set r0 = r7.A01     // Catch:{ all -> 0x0b51 }
            goto L_0x0b3f
        L_0x0b38:
            X.1Om r0 = X.C25511Om.A00     // Catch:{ all -> 0x0b51 }
            goto L_0x0b3f
        L_0x0b3b:
            X.DcS r0 = X.AnonymousClass1AO.A00(r2)     // Catch:{ all -> 0x0b51 }
        L_0x0b3f:
            boolean r0 = X.C108945cZ.A1U(r0)     // Catch:{ all -> 0x0b51 }
            if (r0 == 0) goto L_0x0afa
            X.9ZR r0 = r7.A00     // Catch:{ all -> 0x0b51 }
            X.5bm r1 = r0.A01     // Catch:{ all -> 0x0b51 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0b51 }
            r1.CQ0(r0)     // Catch:{ all -> 0x0b51 }
            goto L_0x0afa
        L_0x0b4f:
            monitor-exit(r4)
            return
        L_0x0b51:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0b54:
            r0 = move-exception
            r7.unlock()
            throw r0
        L_0x0b59:
            java.lang.String r0 = "Cannot compute scroll delta before calling start()"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21466AkX.run():void");
    }

    public C21466AkX(D8A d8a) {
        this.A00 = 31;
        this.A01 = d8a;
    }

    public C21466AkX(D9O d9o, int i) {
        this.A00 = i;
        switch (i) {
            case 40:
            case 41:
                this.A01 = d9o;
                return;
            default:
                this.A01 = d9o;
                return;
        }
    }

    public C21466AkX(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C21466AkX(C18090vk r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }
}
