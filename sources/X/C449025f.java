package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.25f  reason: invalid class name and case insensitive filesystem */
public class C449025f implements Runnable {
    public final int A00;
    public final Object A01;

    public C449025f(Runnable runnable) {
        this.A00 = 12;
        this.A01 = runnable;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x055f;
                case 1: goto L_0x085b;
                case 2: goto L_0x0853;
                case 3: goto L_0x084a;
                case 4: goto L_0x0835;
                case 5: goto L_0x0549;
                case 6: goto L_0x0826;
                case 7: goto L_0x0818;
                case 8: goto L_0x053f;
                case 9: goto L_0x0530;
                case 10: goto L_0x086c;
                case 11: goto L_0x0767;
                case 12: goto L_0x075b;
                case 13: goto L_0x0500;
                case 14: goto L_0x0751;
                case 15: goto L_0x0732;
                case 16: goto L_0x04df;
                case 17: goto L_0x045c;
                case 18: goto L_0x0429;
                case 19: goto L_0x0413;
                case 20: goto L_0x0722;
                case 21: goto L_0x03fd;
                case 22: goto L_0x03ef;
                case 23: goto L_0x03c4;
                case 24: goto L_0x0573;
                case 25: goto L_0x038d;
                case 26: goto L_0x0363;
                case 27: goto L_0x033c;
                case 28: goto L_0x0718;
                case 29: goto L_0x02ce;
                case 30: goto L_0x0710;
                case 31: goto L_0x0702;
                case 32: goto L_0x06f3;
                case 33: goto L_0x06e6;
                case 34: goto L_0x06ac;
                case 35: goto L_0x02af;
                case 36: goto L_0x0247;
                case 37: goto L_0x0217;
                case 38: goto L_0x0695;
                case 39: goto L_0x0684;
                case 40: goto L_0x01d2;
                case 41: goto L_0x062c;
                case 42: goto L_0x05b8;
                case 43: goto L_0x059f;
                case 44: goto L_0x002e;
                case 45: goto L_0x0597;
                case 46: goto L_0x058f;
                case 47: goto L_0x057b;
                case 48: goto L_0x000f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.1dT r0 = (X.C30151dT) r0
            X.C30151dT.A02(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r1 = r1.A01
            X.1dT r1 = (X.C30151dT) r1
            r0 = 1
            r1.A01 = r0
            X.C30151dT.A01(r1)
            X.1dn r2 = r1.A00
            if (r2 == 0) goto L_0x000e
            java.lang.Long r0 = r2.A05
            if (r0 != 0) goto L_0x000e
            X.19T r0 = r2.A09
            long r0 = r0.currentMonotonicTimestampNanos()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            return
        L_0x002e:
            java.lang.Object r5 = r1.A01
            X.1Mg r5 = (X.C24941Mg) r5
            r6 = 0
            X.C18070vi.A0d(r5, r6)
            X.1Mi r1 = r5.A02
            monitor-enter(r1)
            X.2AI r4 = new X.2AI     // Catch:{ all -> 0x087d }
            r4.<init>()     // Catch:{ all -> 0x087d }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A01     // Catch:{ all -> 0x087d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x087d }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x087d }
        L_0x0048:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x087d }
            if (r0 == 0) goto L_0x0089
            java.lang.Object r7 = r8.next()     // Catch:{ all -> 0x087d }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ all -> 0x087d }
            java.lang.Object r10 = r7.getKey()     // Catch:{ all -> 0x087d }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x087d }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x087d }
            X.2e1 r0 = (X.C54362e1) r0     // Catch:{ all -> 0x087d }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A02     // Catch:{ all -> 0x087d }
            r2 = 0
            long r11 = r0.getAndSet(r2)     // Catch:{ all -> 0x087d }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x087d }
            X.2e1 r0 = (X.C54362e1) r0     // Catch:{ all -> 0x087d }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A00     // Catch:{ all -> 0x087d }
            long r13 = r0.get()     // Catch:{ all -> 0x087d }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x087d }
            X.2e1 r0 = (X.C54362e1) r0     // Catch:{ all -> 0x087d }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01     // Catch:{ all -> 0x087d }
            long r15 = r0.get()     // Catch:{ all -> 0x087d }
            X.2mV r9 = new X.2mV     // Catch:{ all -> 0x087d }
            r9.<init>(r10, r11, r13, r15)     // Catch:{ all -> 0x087d }
            r4.add((java.lang.Object) r9)     // Catch:{ all -> 0x087d }
            goto L_0x0048
        L_0x0089:
            X.1IX r11 = r4.build()     // Catch:{ all -> 0x087d }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x087d }
            monitor-exit(r1)
            X.1Mj r9 = r5.A03
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.A01
            boolean r0 = r8.get()
            if (r0 != 0) goto L_0x00f4
            java.util.Iterator r10 = r11.iterator()
        L_0x009f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r7 = r10.next()
            X.2mV r7 = (X.C59562mV) r7
            long r1 = r7.A02
            r3 = 60
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "FrequentWaJobAnomalyDetector: detected: "
            r3.append(r0)
            java.lang.String r7 = r7.A03
            r3.append(r7)
            java.lang.String r0 = " job count since last window: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 1
            r8.set(r0)
            X.1Mg r0 = r9.A00
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "frequent_job"
            X.190 r2 = r0.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "jobmanager-anomaly-"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A0H(r0, r7, r6, r4)
            goto L_0x009f
        L_0x00f4:
            X.1Mk r9 = r5.A04
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.A01
            boolean r0 = r8.get()
            if (r0 != 0) goto L_0x0157
            java.util.Iterator r10 = r11.iterator()
        L_0x0102:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0157
            java.lang.Object r7 = r10.next()
            X.2mV r7 = (X.C59562mV) r7
            long r1 = r7.A00
            r3 = 10
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0102
            r0 = 1
            r8.set(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "HighRetryWaJobAnomalyDetector: detected: "
            r3.append(r0)
            java.lang.String r7 = r7.A03
            r3.append(r7)
            java.lang.String r0 = " job retried times:  "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Mg r0 = r9.A00
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "high_retry_job"
            X.190 r2 = r0.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "jobmanager-anomaly-"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A0H(r0, r7, r6, r4)
            goto L_0x0102
        L_0x0157:
            X.1Ml r9 = r5.A05
            java.util.concurrent.atomic.AtomicBoolean r8 = r9.A01
            boolean r0 = r8.get()
            if (r0 != 0) goto L_0x01bb
            java.util.Iterator r10 = r11.iterator()
        L_0x0165:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.Object r7 = r10.next()
            X.2mV r7 = (X.C59562mV) r7
            long r1 = r7.A01
            r3 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0165
            r0 = 1
            r8.set(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "LongRunningWaJobAnomalyDetector: "
            r3.append(r0)
            java.lang.String r7 = r7.A03
            r3.append(r7)
            java.lang.String r0 = " job ran:  "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Mg r0 = r9.A00
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "long_running_job"
            X.190 r2 = r0.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "jobmanager-anomaly-"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            r2.A0H(r0, r7, r6, r4)
            goto L_0x0165
        L_0x01bb:
            X.0ve r2 = r5.A01
            r1 = 9630(0x259e, float:1.3495E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x000e
            X.10I r3 = r5.A06
            java.lang.Runnable r2 = r5.A07
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.CGv(r2, r0)
            return
        L_0x01d2:
            java.lang.Object r4 = r1.A01
            X.2tp r4 = (X.C63872tp) r4
            X.10f r0 = r4.A0A()
            X.1IZ r3 = r0.iterator()
        L_0x01de:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r3.next()
            X.2sr r1 = (X.C63312sr) r1
            com.whatsapp.jid.UserJid r2 = r1.A04
            X.2ho r0 = r4.A05
            X.C18070vi.A0X(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0202
            int r0 = r0.intValue()
            r1.A00 = r0
            goto L_0x01de
        L_0x0202:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ParticipantUserStore/initParticipantsColorIndex color index is null for "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01de
        L_0x0217:
            java.lang.Object r2 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r2 = (com.whatsapp.conversationslist.ConversationsFragment) r2
            X.1QO r1 = r2.A2I
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x022c
            X.1QO r0 = r2.A2I
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x000e
        L_0x022c:
            X.11S r0 = r2.A0s
            boolean r0 = r0.A0N()
            if (r0 != 0) goto L_0x000e
            X.1ob r0 = r2.A2J
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000e
            X.1KB r7 = r2.A0r
            r0 = 34
            X.4rL r6 = new X.4rL
            r6.<init>(r2, r0)
            goto L_0x049a
        L_0x0247:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.1iq r4 = r3.A2P
            X.1io r0 = r4.A03
            X.2tN r1 = r0.A00()
            if (r1 != 0) goto L_0x0265
            java.lang.String r0 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/no metadata"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x025a:
            X.1KB r7 = r3.A0r
            r0 = 32
            X.25f r6 = new X.25f
            r6.<init>((java.lang.Object) r3, (int) r0)
            goto L_0x049a
        L_0x0265:
            int r2 = r1.A01
            X.0ve r0 = r4.A01
            boolean r0 = X.C63802ti.A01(r0, r2)
            if (r0 == 0) goto L_0x0284
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeManager/transitionUserNoticeStageIfNecessary/green alert disabled, notice: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x025a
        L_0x0284:
            X.1in r0 = r4.A02     // Catch:{ RuntimeException -> 0x028e }
            X.2mq r0 = r0.A04(r1)     // Catch:{ RuntimeException -> 0x028e }
            X.C33451iq.A02(r0, r4, r1)     // Catch:{ RuntimeException -> 0x028e }
            goto L_0x025a
        L_0x028e:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "UserNoticeManager/transitionUserNoticeStageIfNecessary got runtime exception "
            r1.append(r0)
            java.lang.StackTraceElement[] r0 = r2.getStackTrace()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            X.C18070vi.A0X(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x025a
        L_0x02af:
            java.lang.Object r4 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r4 = (com.whatsapp.conversationslist.ConversationsFragment) r4
            X.1qw r0 = r4.A1m
            if (r0 == 0) goto L_0x000e
            X.1pY r3 = r4.A1i
            r1 = 0
            int r0 = r0.BRo()
            int r2 = java.lang.Math.max(r1, r0)
            X.1qw r1 = r4.A1m
            X.1rA r0 = r4.A1V
            int r0 = com.whatsapp.conversationslist.ConversationsFragment.A01(r0, r1)
            r3.A00(r2, r0)
            return
        L_0x02ce:
            java.lang.Object r2 = r1.A01
            X.1US r2 = (X.AnonymousClass1US) r2
            X.1UT r3 = r2.A0E
            monitor-enter(r3)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0880 }
            r4.<init>()     // Catch:{ all -> 0x0880 }
            X.1Tt r6 = r3.A03     // Catch:{ all -> 0x0880 }
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r6)     // Catch:{ all -> 0x0880 }
            java.lang.String r0 = "current_running_sync"
            r5 = 0
            java.lang.String r0 = r1.getString(r0, r5)     // Catch:{ all -> 0x0880 }
            if (r0 == 0) goto L_0x02f9
            X.2re r0 = X.C62592re.A00(r0)     // Catch:{ ClassCastException | JSONException -> 0x02f3 }
            if (r0 == 0) goto L_0x02f9
            r4.add(r0)     // Catch:{ ClassCastException | JSONException -> 0x02f3 }
            goto L_0x02f9
        L_0x02f3:
            r1 = move-exception
            java.lang.String r0 = "SyncRequestStorage/restore/current_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0880 }
        L_0x02f9:
            android.content.SharedPreferences r1 = X.C26861Tt.A00(r6)     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            java.lang.String r0 = "queued_running_sync_set"
            java.util.Set r0 = r1.getStringSet(r0, r5)     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            if (r0 == 0) goto L_0x0327
            java.util.Iterator r1 = r0.iterator()     // Catch:{ ClassCastException | JSONException -> 0x0321 }
        L_0x0309:
            boolean r0 = r1.hasNext()     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            if (r0 == 0) goto L_0x0327
            java.lang.Object r0 = r1.next()     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            if (r0 == 0) goto L_0x0309
            X.2re r0 = X.C62592re.A00(r0)     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            if (r0 == 0) goto L_0x0309
            r4.add(r0)     // Catch:{ ClassCastException | JSONException -> 0x0321 }
            goto L_0x0309
        L_0x0321:
            r1 = move-exception
            java.lang.String r0 = "SyncRequestStorage/restore/queue_failed"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0880 }
        L_0x0327:
            monitor-exit(r3)
            java.util.Iterator r1 = r4.iterator()
        L_0x032c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r0 = r1.next()
            X.2re r0 = (X.C62592re) r0
            X.AnonymousClass1US.A03(r2, r0)
            goto L_0x032c
        L_0x033c:
            java.lang.Object r4 = r1.A01
            X.1ga r4 = (X.C32071ga) r4
            r0 = 0
            r4.A02 = r0
            r0 = 59000(0xe678, float:8.2677E-41)
            r4.A0C(r0)
            X.1N0 r0 = r4.A02
            int r0 = r0.A02()
            if (r0 <= 0) goto L_0x000e
            java.lang.Runnable r0 = r4.A02
            if (r0 != 0) goto L_0x000e
            X.10I r3 = r4.A00
            java.lang.Runnable r2 = r4.A01
            r0 = 60000(0xea60, double:2.9644E-319)
            X.25d r0 = r3.CGv(r2, r0)
            r4.A02 = r0
            return
        L_0x0363:
            java.lang.Object r0 = r1.A01
            X.1cQ r0 = (X.C29521cQ) r0
            com.whatsapp.HomeActivity r0 = r0.A01
            java.util.List r0 = r0.A3W()
            java.util.Iterator r2 = r0.iterator()
        L_0x0371:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x000e
            java.lang.Object r1 = r2.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof X.C34011jl
            if (r0 == 0) goto L_0x0371
            X.1jl r1 = (X.C34011jl) r1
            boolean r0 = r1.BLg()
            if (r0 == 0) goto L_0x0371
            r1.Buy()
            goto L_0x0371
        L_0x038d:
            java.lang.Object r2 = r1.A01
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            X.00H r0 = r2.A1e
            java.lang.Object r0 = r0.get()
            X.1ef r0 = (X.C30881ef) r0
            int r1 = r0.A00
            r0 = 3
            if (r1 == r0) goto L_0x03ab
            X.00H r0 = r2.A1e
            java.lang.Object r0 = r0.get()
            X.1ef r0 = (X.C30881ef) r0
            int r1 = r0.A00
            r0 = 2
            if (r1 != r0) goto L_0x000e
        L_0x03ab:
            X.00H r0 = r2.A1w
            java.lang.Object r0 = r0.get()
            X.1eh r0 = (X.C30901eh) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x000e
            X.1KB r7 = r2.A05
            r0 = 9
            X.3Bt r6 = new X.3Bt
            r6.<init>(r2, r0)
            goto L_0x049a
        L_0x03c4:
            java.lang.Object r3 = r1.A01
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r0 = r3.A00
            r2 = 600(0x258, float:8.41E-43)
            if (r0 != r2) goto L_0x000e
            java.util.List r1 = com.whatsapp.HomeActivity.A2Y
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x000e
            X.1bB r1 = r3.A0b
            int r0 = com.whatsapp.HomeActivity.A0c(r2)
            X.1bC r1 = r1.A0J(r0)
            int r0 = r1.A00
            if (r0 == 0) goto L_0x000e
            r0 = 0
            r1.A00 = r0
            r3.A4h()
            return
        L_0x03ef:
            java.lang.Object r2 = r1.A01
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A00
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 != r0) goto L_0x000e
            com.whatsapp.HomeActivity.A1A(r2)
            return
        L_0x03fd:
            java.lang.Object r2 = r1.A01
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A00
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x000e
            X.00H r0 = r2.A1d
            java.lang.Object r0 = r0.get()
            X.3Ao r0 = (X.C70313Ao) r0
            r0.A04()
            return
        L_0x0413:
            java.lang.Object r2 = r1.A01
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r0 = r2.A00
            int r0 = com.whatsapp.HomeActivity.A0c(r0)
            X.1jl r1 = r2.A4m(r0)
            if (r1 == 0) goto L_0x000e
            X.1Gu r0 = r2.A2N
            r1.BBR(r0)
            return
        L_0x0429:
            java.lang.Object r5 = r1.A01
            com.whatsapp.HomeActivity r5 = (com.whatsapp.HomeActivity) r5
            boolean r0 = com.whatsapp.HomeActivity.A1O(r5)
            if (r0 == 0) goto L_0x000e
            X.0ve r1 = r5.A0E
            X.00H r0 = r5.A0C
            java.lang.Object r0 = r0.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r3 = X.C31141f5.A01(r0, r1)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 <= 0) goto L_0x0449
            r1 = 1
        L_0x0449:
            java.lang.String r0 = "required free space should be > 0"
            X.C17960vV.A0F(r1, r0)
            android.content.Intent r1 = X.AnonymousClass1LU.A0K(r5, r3)
            X.1KB r7 = r5.A05
            r0 = 27
            X.3Cf r6 = new X.3Cf
            r6.<init>(r5, r1, r0)
            goto L_0x049a
        L_0x045c:
            java.lang.Object r4 = r1.A01
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.00H r0 = r4.A1M
            java.lang.Object r0 = r0.get()
            X.1NT r0 = (X.AnonymousClass1NT) r0
            X.1NP r1 = r0.A01
            android.content.SharedPreferences r0 = r1.A07()
            java.lang.String r2 = "encrypted_backup_show_forced_reg_after_logout"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x04da
            X.0z4 r0 = r1.A00
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
        L_0x0480:
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            if (r0 == 0) goto L_0x049e
            r1 = 9
        L_0x0489:
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Intent r1 = X.AnonymousClass1LU.A0D(r0, r1)
            X.1KB r7 = r4.A05
            r0 = 25
            X.3Cf r6 = new X.3Cf
            r6.<init>(r4, r1, r0)
        L_0x049a:
            r7.A0J(r6)
            return
        L_0x049e:
            X.00H r0 = r4.A1M
            java.lang.Object r0 = r0.get()
            X.1NT r0 = (X.AnonymousClass1NT) r0
            X.1NP r3 = r0.A01
            android.content.SharedPreferences r1 = r3.A07()
            java.lang.String r2 = "encrypted_backup_fleet_migration_state"
            r0 = -1
            int r0 = r1.getInt(r2, r0)
            if (r0 >= 0) goto L_0x04c4
            X.0z4 r0 = r3.A00
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r0 = 0
            int r0 = r1.getInt(r2, r0)
        L_0x04c4:
            if (r0 <= 0) goto L_0x000e
            X.00H r0 = r4.A1M
            java.lang.Object r0 = r0.get()
            X.1NT r0 = (X.AnonymousClass1NT) r0
            X.1NP r0 = r0.A01
            X.2Qv r1 = r0.A08()
            X.2Qv r0 = X.C49532Qv.PASSWORD_ENCRYPTED
            if (r1 != r0) goto L_0x0883
            r1 = 7
            goto L_0x0489
        L_0x04da:
            android.content.SharedPreferences r1 = r1.A07()
            goto L_0x0480
        L_0x04df:
            java.lang.Object r3 = r1.A01
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r0 = r3.A00
            int r0 = com.whatsapp.HomeActivity.A0c(r0)
            X.1jl r2 = r3.A4m(r0)
            if (r2 == 0) goto L_0x000e
            X.1Zk r1 = r3.A03
            r0 = r2
            X.1bm r0 = (X.C29201bm) r0
            X.C17960vV.A07(r0)
            X.C28221Zk.A03(r0, r1)
            X.1Gu r0 = r3.A2N
            r2.BBR(r0)
            return
        L_0x0500:
            java.lang.Object r7 = r1.A01
            com.google.firebase.messaging.FirebaseMessaging r7 = (com.google.firebase.messaging.FirebaseMessaging) r7
            X.0yP r0 = r7.A06
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000e
            X.2po r8 = r7.A03()
            if (r8 == 0) goto L_0x052d
            X.0yH r0 = r7.A08
            java.lang.String r6 = r0.A03()
            long r4 = java.lang.System.currentTimeMillis()
            long r2 = r8.A00
            long r0 = X.C61512po.A03
            long r2 = r2 + r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x052d
            java.lang.String r0 = r8.A01
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x000e
        L_0x052d:
            monitor-enter(r7)
            goto L_0x08a5
        L_0x0530:
            java.lang.Object r3 = r1.A01
            X.1tg r3 = (X.C39811tg) r3
            X.1yu r0 = r3.A03
            if (r0 == 0) goto L_0x000e
            java.lang.Object r2 = r0.A00
            if (r2 == 0) goto L_0x08ce
            monitor-enter(r3)
            goto L_0x08b3
        L_0x053f:
            java.lang.Object r3 = r1.A01
            X.1rd r3 = (X.C38631rd) r3
            X.BN4 r1 = r3.A0L
            if (r1 == 0) goto L_0x000e
            goto L_0x08fd
        L_0x0549:
            java.lang.Object r1 = r1.A01
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            boolean r0 = r1.A0Q
            if (r0 == 0) goto L_0x000e
            boolean r0 = r1.isLayoutRequested()
            if (r0 != 0) goto L_0x000e
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x093d
            r1.requestLayout()
            return
        L_0x055f:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x000e
            boolean r0 = X.C197539wr.A00(r1)
            if (r0 != 0) goto L_0x000e
            r1.recreate()
            return
        L_0x0573:
            java.lang.String r1 = "reverse"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x057b:
            java.lang.Object r2 = r1.A01
            X.17v r2 = (X.C219017v) r2
            X.1cx r1 = r2.A0G
            X.1d1 r0 = r2.A0Y
            X.1fz r0 = r1.A00(r0)
            r2.A15 = r0
            X.1fz r0 = r2.A15
            r0.start()
            return
        L_0x058f:
            java.lang.Object r0 = r1.A01
            X.1Uv r0 = (X.C27131Uv) r0
            r0.A0Q()
            return
        L_0x0597:
            java.lang.Object r0 = r1.A01
            X.1Uv r0 = (X.C27131Uv) r0
            X.C27131Uv.A09(r0)
            return
        L_0x059f:
            java.lang.Object r4 = r1.A01
            X.1CI r4 = (X.AnonymousClass1CI) r4
            X.1CJ r2 = r4.A06
            X.10I r0 = r4.A0D
            X.00H r6 = r4.A0M
            X.00H r5 = r4.A0N
            X.1DR r3 = r4.A07
            X.1EI r1 = new X.1EI     // Catch:{ all -> 0x05b6 }
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05b6 }
            r0.CGN(r1)     // Catch:{ all -> 0x05b6 }
            return
        L_0x05b6:
            r0 = move-exception
            throw r0
        L_0x05b8:
            java.lang.Object r5 = r1.A01
            X.18M r5 = (X.AnonymousClass18M) r5
            java.util.concurrent.CountDownLatch r0 = X.AnonymousClass18M.A0E
            X.00H r0 = r5.A0A
            java.lang.Object r4 = r0.get()
            X.C18070vi.A0X(r4)
            com.whatsapp.wamsys.JniBridge r4 = (com.whatsapp.wamsys.JniBridge) r4
            X.1Eh r0 = r5.A01
            if (r0 != 0) goto L_0x05d4
            java.lang.String r0 = "networkGetter"
        L_0x05cf:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x05d4:
            X.1Ef r1 = r0.A01
            android.content.Context r6 = r0.A00
            X.00H r0 = r1.A08
            java.lang.Object r11 = r0.get()
            X.1DA r11 = (X.AnonymousClass1DA) r11
            X.00H r0 = r1.A07
            java.lang.Object r9 = r0.get()
            X.11W r9 = (X.AnonymousClass11W) r9
            X.00H r0 = r1.A09
            java.lang.Object r10 = r0.get()
            X.10I r10 = (X.AnonymousClass10I) r10
            X.00H r0 = r1.A06
            java.lang.Object r7 = r0.get()
            X.181 r7 = (X.AnonymousClass181) r7
            X.00H r0 = r1.A05
            java.lang.Object r8 = r0.get()
            X.18j r8 = (X.C220418j) r8
            monitor-enter(r11)
            X.AnonymousClass1DA.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0629 }
            X.00H r0 = r11.A08     // Catch:{ all -> 0x0629 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0629 }
            X.1Eq r1 = (X.C23121Eq) r1     // Catch:{ all -> 0x0629 }
            monitor-enter(r1)     // Catch:{ all -> 0x0629 }
            com.facebook.msys.mci.NetworkSession r3 = r1.A00     // Catch:{ all -> 0x0626 }
            X.C17960vV.A07(r3)     // Catch:{ all -> 0x0626 }
            monitor-exit(r1)     // Catch:{ all -> 0x0629 }
            monitor-exit(r11)
            X.C18070vi.A0X(r3)
            android.content.Context r2 = r5.A00
            if (r2 != 0) goto L_0x061e
            java.lang.String r0 = "appContext"
            goto L_0x05cf
        L_0x061e:
            X.0ve r1 = r5.A07
            X.18H r0 = r5.A06
            X.C23131Er.A00(r2, r3, r0, r1, r4)
            return
        L_0x0626:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0629 }
            throw r0     // Catch:{ all -> 0x0629 }
        L_0x0629:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x062c:
            java.lang.Object r2 = r1.A01
            X.1mN r2 = (X.C35521mN) r2
            X.00H r0 = r2.A02
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.util.Map r1 = r0.getAll()
            java.util.Set r0 = r1.keySet()
            X.C35521mN.A00(r0)
            X.00H r0 = r2.A06
            r0.get()
            java.lang.String r1 = X.C60602oJ.A00(r1)
            X.00H r0 = r2.A04
            java.lang.Object r0 = r0.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.lang.String r3 = "ab_props:hash_v2"
            X.00H r0 = r2.A03
            java.lang.Object r2 = r0.get()
            X.1Cs r2 = (X.C22661Cs) r2
            java.nio.charset.Charset r0 = X.C35521mN.A08
            byte[] r1 = r1.getBytes(r0)
            java.lang.String r0 = X.C197569wu.A00
            X.9mN r0 = r2.A01(r0, r1)
            if (r0 != 0) goto L_0x067f
            r0 = 0
        L_0x0671:
            android.content.SharedPreferences$Editor r1 = r4.putString(r3, r0)
            java.lang.String r0 = "ab_props:hash"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            return
        L_0x067f:
            java.lang.String r0 = r0.A00()
            goto L_0x0671
        L_0x0684:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.1wM r2 = r3.A1Q
            r1 = 15
            X.4dF r0 = new X.4dF
            r0.<init>(r3, r1)
            r2.setOnLockedClickListener(r0)
            return
        L_0x0695:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            X.118 r0 = r3.A1r
            android.content.Context r0 = r0.A00
            boolean r2 = X.C41361wE.A09(r0)
            X.1KB r1 = r3.A0r
            X.1wP r0 = new X.1wP
            r0.<init>(r3, r2)
            r1.A0J(r0)
            return
        L_0x06ac:
            java.lang.Object r6 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r6 = (com.whatsapp.conversationslist.ConversationsFragment) r6
            X.118 r0 = r6.A1r
            android.content.Context r1 = r0.A00
            r0 = 2132017201(0x7f140031, float:1.9672674E38)
            X.1tg r3 = X.C39771tc.A06(r1, r0)
            X.118 r0 = r6.A1r
            android.content.Context r1 = r0.A00
            r0 = 2132017200(0x7f140030, float:1.9672672E38)
            X.1tg r4 = X.C39771tc.A06(r1, r0)
            X.1rd r1 = new X.1rd
            r1.<init>()
            X.1rd r8 = new X.1rd
            r8.<init>()
            X.1KB r11 = r6.A0r
            X.1tw r2 = new X.1tw
            r7 = r2
            r9 = r1
            r10 = r4
            r12 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            X.1KB r5 = r6.A0r
            X.1tx r0 = new X.1tx
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r3.A02(r0)
            return
        L_0x06e6:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r1 = (com.whatsapp.conversationslist.ConversationsFragment) r1
            r0 = 1
            r1.A3q = r0
            X.1Gu r0 = r1.A2N
            com.whatsapp.conversationslist.ConversationsFragment.A0k(r1, r0)
            return
        L_0x06f3:
            java.lang.Object r0 = r1.A01
            com.whatsapp.conversationslist.ConversationsFragment r0 = (com.whatsapp.conversationslist.ConversationsFragment) r0
            X.1oN r2 = r0.A2O
            android.content.Context r1 = r0.A14()
            r0 = 0
            r2.A01(r1, r0)
            return
        L_0x0702:
            java.lang.Object r0 = r1.A01
            X.1yD r0 = (X.C42461yD) r0
            X.1xZ r0 = r0.A06
            android.view.View r1 = r0.A03
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0710:
            java.lang.Object r0 = r1.A01
            X.1NN r0 = (X.AnonymousClass1NN) r0
            r0.A00()
            return
        L_0x0718:
            java.lang.Object r1 = r1.A01
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r1
            X.1ns r0 = r1.A0K
            r0.A02(r1)
            return
        L_0x0722:
            java.lang.Object r0 = r1.A01
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.00H r0 = r0.A15
            java.lang.Object r0 = r0.get()
            X.739 r0 = (X.AnonymousClass739) r0
            r0.A02()
            return
        L_0x0732:
            java.lang.Object r1 = r1.A01
            X.1Hj r1 = (X.C23721Hj) r1
            X.00H r0 = r1.A08
            java.lang.Object r3 = r0.get()
            X.1KB r3 = (X.AnonymousClass1KB) r3
            java.lang.Runnable r2 = r1.A0B
            X.00H r0 = r1.A0A
            java.lang.Object r0 = r0.get()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            r3.A0K(r2, r0)
            return
        L_0x0751:
            java.lang.Object r0 = r1.A01
            com.google.firebase.messaging.FirebaseMessaging r0 = (com.google.firebase.messaging.FirebaseMessaging) r0
            android.content.Context r0 = r0.A02
            X.C62752rv.A00(r0)
            return
        L_0x075b:
            r0 = 0
            android.os.Process.setThreadPriority(r0)
            java.lang.Object r0 = r1.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0767:
            java.lang.Object r6 = r1.A01
            X.0yA r6 = (X.C19410yA) r6
            X.0xw r0 = r6.A02
            X.0xx r0 = (X.C19280xx) r0
            android.database.sqlite.SQLiteDatabase r5 = r0.A04()
            X.C19280xx.A03(r5, r0)
            X.0xu r0 = r6.A01     // Catch:{ all -> 0x0813 }
            X.0xx r0 = (X.C19280xx) r0     // Catch:{ all -> 0x0813 }
            android.database.sqlite.SQLiteDatabase r4 = r0.A04()     // Catch:{ all -> 0x0813 }
            r4.beginTransaction()     // Catch:{ all -> 0x0813 }
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x080e }
            java.lang.String r0 = "SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id"
            android.database.Cursor r3 = r4.rawQuery(r0, r1)     // Catch:{ all -> 0x080e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0809 }
            r9.<init>()     // Catch:{ all -> 0x0809 }
        L_0x078f:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0809 }
            if (r0 == 0) goto L_0x07df
            r0 = 1
            java.lang.String r8 = r3.getString(r0)     // Catch:{ all -> 0x0809 }
            if (r8 == 0) goto L_0x07d7
            r0 = 2
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x0809 }
            android.util.SparseArray r0 = X.C61072p4.A00     // Catch:{ all -> 0x0809 }
            java.lang.Object r2 = r0.get(r7)     // Catch:{ all -> 0x0809 }
            X.0xz r2 = (X.C19300xz) r2     // Catch:{ all -> 0x0809 }
            if (r2 == 0) goto L_0x07c0
            r0 = 3
            java.lang.String r1 = r3.getString(r0)     // Catch:{ all -> 0x0809 }
            r0 = 0
            if (r1 == 0) goto L_0x07b8
            r0 = 0
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ all -> 0x0809 }
        L_0x07b8:
            X.0yF r0 = X.C19440yD.A00(r2, r8, r0)     // Catch:{ all -> 0x0809 }
            r9.add(r0)     // Catch:{ all -> 0x0809 }
            goto L_0x078f
        L_0x07c0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0809 }
            r1.<init>()     // Catch:{ all -> 0x0809 }
            java.lang.String r0 = "Unknown Priority for value "
            r1.append(r0)     // Catch:{ all -> 0x0809 }
            r1.append(r7)     // Catch:{ all -> 0x0809 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0809 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0809 }
            r1.<init>(r0)     // Catch:{ all -> 0x0809 }
            goto L_0x07de
        L_0x07d7:
            java.lang.String r0 = "Null backendName"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x0809 }
            r1.<init>(r0)     // Catch:{ all -> 0x0809 }
        L_0x07de:
            throw r1     // Catch:{ all -> 0x0809 }
        L_0x07df:
            r3.close()     // Catch:{ all -> 0x080e }
            r4.setTransactionSuccessful()     // Catch:{ all -> 0x080e }
            r4.endTransaction()     // Catch:{ all -> 0x0813 }
            java.util.Iterator r4 = r9.iterator()     // Catch:{ all -> 0x0813 }
        L_0x07ec:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0813 }
            if (r0 == 0) goto L_0x0802
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0813 }
            X.0yE r3 = (X.C19450yE) r3     // Catch:{ all -> 0x0813 }
            X.0y5 r2 = r6.A00     // Catch:{ all -> 0x0813 }
            r1 = 1
            X.0y6 r2 = (X.C19370y6) r2     // Catch:{ all -> 0x0813 }
            r0 = 0
            r2.CGt(r3, r1, r0)     // Catch:{ all -> 0x0813 }
            goto L_0x07ec
        L_0x0802:
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0813 }
            r5.endTransaction()
            return
        L_0x0809:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x080e }
            throw r0     // Catch:{ all -> 0x080e }
        L_0x080e:
            r0 = move-exception
            r4.endTransaction()     // Catch:{ all -> 0x0813 }
            throw r0     // Catch:{ all -> 0x0813 }
        L_0x0813:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x0818:
            java.lang.Object r1 = r1.A01
            androidx.viewpager.widget.ViewPager r1 = (androidx.viewpager.widget.ViewPager) r1
            r0 = 0
            r1.setScrollState(r0)
            int r0 = r1.A02
            r1.A0G(r0)
            return
        L_0x0826:
            java.lang.Object r1 = r1.A01
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.1qT r0 = r1.A0C
            if (r0 == 0) goto L_0x0831
            r0.A0D()
        L_0x0831:
            r0 = 0
            r1.A0X = r0
            return
        L_0x0835:
            java.lang.Object r3 = r1.A01
            X.1DS r3 = (X.AnonymousClass1DS) r3
            java.lang.Object r2 = r3.A06
            monitor-enter(r2)
            java.lang.Object r1 = r3.A09     // Catch:{ all -> 0x0847 }
            java.lang.Object r0 = X.AnonymousClass1DS.A0A     // Catch:{ all -> 0x0847 }
            r3.A09 = r0     // Catch:{ all -> 0x0847 }
            monitor-exit(r2)     // Catch:{ all -> 0x0847 }
            r3.A0F(r1)
            return
        L_0x0847:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0847 }
            throw r0
        L_0x084a:
            java.lang.Object r1 = r1.A01
            X.1GP r1 = (X.AnonymousClass1GP) r1
            r0 = 1
            r1.A0y(r0)
            return
        L_0x0853:
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r0.A1M()
            return
        L_0x085b:
            java.lang.Object r2 = r1.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            X.1q9 r0 = r2.A0J
            android.os.Bundle r1 = r2.A08
            X.1GA r0 = r0.A01
            r0.A02(r1)
            r0 = 0
            r2.A08 = r0
            return
        L_0x086c:
            java.lang.Object r0 = r1.A01     // Catch:{ Exception -> 0x0874 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ Exception -> 0x0874 }
            r0.run()     // Catch:{ Exception -> 0x0874 }
            return
        L_0x0874:
            r2 = move-exception
            java.lang.String r1 = "Executor"
            java.lang.String r0 = "Background execution failure."
            X.A3G.A02(r1, r0, r2)
            return
        L_0x087d:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0880:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0883:
            X.00H r0 = r4.A1M
            java.lang.Object r5 = r0.get()
            X.1NT r5 = (X.AnonymousClass1NT) r5
            X.1NP r1 = r5.A01
            r0 = 0
            r1.A0D(r0)
            X.2xq r4 = new X.2xq
            r4.<init>(r5)
            X.10I r3 = r5.A07
            X.1NU r2 = r5.A03
            X.1NV r1 = r5.A06
            X.8g5 r0 = new X.8g5
            r0.<init>(r4, r2, r1, r3)
            r0.A00()
            return
        L_0x08a5:
            boolean r0 = r7.A00     // Catch:{ all -> 0x08b0 }
            if (r0 != 0) goto L_0x08ae
            r0 = 0
            r7.A05(r0)     // Catch:{ all -> 0x08b0 }
        L_0x08ae:
            monitor-exit(r7)
            return
        L_0x08b0:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x08b3:
            java.util.Set r1 = r3.A02     // Catch:{ all -> 0x08fa }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x08fa }
            r0.<init>(r1)     // Catch:{ all -> 0x08fa }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x08fa }
        L_0x08be:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08fa }
            if (r0 == 0) goto L_0x08f8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08fa }
            X.1rZ r0 = (X.C38591rZ) r0     // Catch:{ all -> 0x08fa }
            r0.onResult(r2)     // Catch:{ all -> 0x08fa }
            goto L_0x08be
        L_0x08ce:
            java.lang.Throwable r2 = r0.A01
            monitor-enter(r3)
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x08fa }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x08fa }
            r1.<init>(r0)     // Catch:{ all -> 0x08fa }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x08fa }
            if (r0 == 0) goto L_0x08e4
            java.lang.String r0 = "Lottie encountered an error but no failure listener was added:"
            X.C196379ux.A01(r0, r2)     // Catch:{ all -> 0x08fa }
            goto L_0x08f8
        L_0x08e4:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x08fa }
        L_0x08e8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x08fa }
            if (r0 == 0) goto L_0x08f8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x08fa }
            X.1rZ r0 = (X.C38591rZ) r0     // Catch:{ all -> 0x08fa }
            r0.onResult(r2)     // Catch:{ all -> 0x08fa }
            goto L_0x08e8
        L_0x08f8:
            monitor-exit(r3)
            return
        L_0x08fa:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x08fd:
            java.util.concurrent.Semaphore r0 = r3.A0f     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r0.acquire()     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            X.1rf r0 = r3.A0d     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            float r0 = r0.A00()     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r1.A0A(r0)     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            boolean r0 = X.C38631rd.A0j     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            if (r0 == 0) goto L_0x0930
            boolean r0 = r3.A0V     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            if (r0 == 0) goto L_0x0930
            android.os.Handler r2 = r3.A0C     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            if (r2 != 0) goto L_0x092b
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r2.<init>(r0)     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r3.A0C = r2     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r1 = 29
            X.AkX r0 = new X.AkX     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r0.<init>((java.lang.Object) r3, (int) r1)     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r3.A0N = r0     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
        L_0x092b:
            java.lang.Runnable r0 = r3.A0N     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
            r2.post(r0)     // Catch:{ InterruptedException -> 0x0930, all -> 0x0936 }
        L_0x0930:
            java.util.concurrent.Semaphore r0 = r3.A0f
            r0.release()
            return
        L_0x0936:
            r1 = move-exception
            java.util.concurrent.Semaphore r0 = r3.A0f
            r0.release()
            throw r1
        L_0x093d:
            boolean r0 = r1.A0V
            if (r0 == 0) goto L_0x0945
            r0 = 1
            r1.A0W = r0
            return
        L_0x0945:
            r1.A0S()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C449025f.run():void");
    }

    public C449025f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public C449025f(Fragment fragment, int i) {
        this.A00 = i;
        if (1 - i != 0) {
            this.A01 = fragment;
        } else {
            this.A01 = fragment;
        }
    }
}
