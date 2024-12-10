package X;

/* renamed from: X.25e  reason: invalid class name and case insensitive filesystem */
public class C448925e implements Runnable {
    public final int A00;
    public final Object A01;

    public C448925e(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x0075;
                case 2: goto L_0x0097;
                case 3: goto L_0x01d8;
                case 4: goto L_0x01e8;
                case 5: goto L_0x01f0;
                case 6: goto L_0x020c;
                case 7: goto L_0x0214;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r10.A01
            com.whatsapp.updates.ui.UpdatesFragment r4 = (com.whatsapp.updates.ui.UpdatesFragment) r4
            boolean r0 = r4.A1b()
            if (r0 == 0) goto L_0x0043
            boolean r0 = r4.A1F
            if (r0 != 0) goto L_0x0043
            X.0ve r2 = r4.A26()
            r1 = 11206(0x2bc6, float:1.5703E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0043
            X.1FL r0 = r4.A1B()
            if (r0 == 0) goto L_0x0043
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r0 = 1
            r4.A1F = r0
            X.00H r0 = r4.A13
            if (r0 == 0) goto L_0x0087
            java.lang.Object r2 = r0.get()
            X.10I r2 = (X.AnonymousClass10I) r2
            r1 = 18
            X.7RD r0 = new X.7RD
            r0.<init>(r3, r4, r1)
            r2.CGF(r0)
        L_0x0043:
            boolean r0 = r4.A1b()
            if (r0 == 0) goto L_0x0074
            boolean r0 = r4.A19
            if (r0 != 0) goto L_0x0057
            X.0ve r0 = r4.A26()
            boolean r0 = X.C40041u3.A00(r4, r0)
            if (r0 != 0) goto L_0x0074
        L_0x0057:
            boolean r0 = r4.A1B
            if (r0 == 0) goto L_0x0083
            X.0vl r0 = r4.A1N
            java.lang.Object r3 = r0.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            r0 = 32
            X.7RC r2 = new X.7RC
            r2.<init>(r4, r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            r3.postDelayed(r2, r0)
            java.lang.String r0 = "UpdatesFragment/onResume Delaying startup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0074:
            return
        L_0x0075:
            java.lang.Object r1 = r10.A01
            X.1Bd r1 = (X.AnonymousClass1Bd) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0074
            java.lang.String r0 = "contents_are_drained"
            r1.A07(r0)
            return
        L_0x0083:
            com.whatsapp.updates.ui.UpdatesFragment.A06(r4)
            return
        L_0x0087:
            java.lang.String r0 = "waWorkers"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x008f:
            java.lang.Object r0 = r10.A01
            X.1dT r0 = (X.C30151dT) r0
            X.C30151dT.A02(r0)
            return
        L_0x0097:
            java.lang.Object r5 = r10.A01
            X.10k r5 = (X.C199910k) r5
            java.lang.Object r4 = r5.A0C
            monitor-enter(r4)
            boolean r0 = r5.A05     // Catch:{ all -> 0x01d5 }
            if (r0 != 0) goto L_0x01d3
            X.10j r2 = r5.A08     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            java.util.Map r9 = r5.A04     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            java.lang.Object r3 = r2.A02     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            monitor-enter(r3)     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            java.io.File r1 = r2.A00     // Catch:{ all -> 0x01ae }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x00b9
            java.io.File r0 = r2.A01     // Catch:{ all -> 0x01ae }
            r0.delete()     // Catch:{ all -> 0x01ae }
            r1.renameTo(r0)     // Catch:{ all -> 0x01ae }
        L_0x00b9:
            java.io.File r7 = r2.A01     // Catch:{ all -> 0x01ae }
            boolean r0 = r7.canRead()     // Catch:{ all -> 0x01ae }
            if (r0 == 0) goto L_0x017b
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
            r1.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
            r0 = 16384(0x4000, float:2.2959E-41)
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
            r2.<init>(r1, r0)     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x013c }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ all -> 0x013c }
            r6.setInput(r2, r0)     // Catch:{ all -> 0x013c }
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x013c }
            int r1 = r6.getEventType()     // Catch:{ all -> 0x013c }
        L_0x00dd:
            r0 = 2
            if (r1 != r0) goto L_0x00e1
            goto L_0x012d
        L_0x00e1:
            r0 = 3
            if (r1 == r0) goto L_0x0103
            r0 = 4
            if (r1 == r0) goto L_0x00e8
            goto L_0x011e
        L_0x00e8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            r1.<init>()     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "Unexpected text: "
            r1.append(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r6.getText()     // Catch:{ all -> 0x013c }
            r1.append(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x013c }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x013c }
            r1.<init>(r0)     // Catch:{ all -> 0x013c }
            goto L_0x012c
        L_0x0103:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            r1.<init>()     // Catch:{ all -> 0x013c }
            java.lang.String r0 = "Unexpected end tag at: "
            r1.append(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r6.getName()     // Catch:{ all -> 0x013c }
            r1.append(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x013c }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x013c }
            r1.<init>(r0)     // Catch:{ all -> 0x013c }
            goto L_0x012c
        L_0x011e:
            int r1 = r6.next()     // Catch:{ all -> 0x013c }
            r0 = 1
            if (r1 != r0) goto L_0x00dd
            java.lang.String r0 = "Unexpected end of document"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ all -> 0x013c }
            r1.<init>(r0)     // Catch:{ all -> 0x013c }
        L_0x012c:
            throw r1     // Catch:{ all -> 0x013c }
        L_0x012d:
            java.lang.Object r0 = X.C63472t8.A00(r6, r8)     // Catch:{ all -> 0x013c }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x0138
            r9.putAll(r0)     // Catch:{ all -> 0x013c }
        L_0x0138:
            r2.close()     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
            goto L_0x017b
        L_0x013c:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0141 }
            goto L_0x0145
        L_0x0141:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
        L_0x0145:
            throw r1     // Catch:{ XmlPullParserException -> 0x0148, IOException -> 0x0146 }
        L_0x0146:
            r2 = move-exception
            goto L_0x0162
        L_0x0148:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ae }
            r1.<init>()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Parsing error while reading "
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x01ae }
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ae }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01ae }
            goto L_0x017a
        L_0x0162:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ae }
            r1.<init>()     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = "DefaultSharedPreferencesStorage/Cannot read "
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x01ae }
            r1.append(r0)     // Catch:{ all -> 0x01ae }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ae }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01ae }
        L_0x017a:
            throw r2     // Catch:{ all -> 0x01ae }
        L_0x017b:
            monitor-exit(r3)     // Catch:{ all -> 0x01ae }
            X.00H r0 = r5.A0B     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            X.10l r1 = (X.C200010l) r1     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            java.lang.String r6 = r5.A0F     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            long r2 = r7.length()     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            r0 = 0
            X.C18070vi.A0d(r6, r0)     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            boolean r0 = r1.A03     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            if (r0 == 0) goto L_0x01cd
            java.util.Set r0 = X.C200010l.A04     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            boolean r0 = r0.contains(r6)     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            if (r0 != 0) goto L_0x01cd
            java.util.concurrent.ConcurrentHashMap r1 = r1.A02     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            if (r1 == 0) goto L_0x01a7
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            r1.put(r6, r0)     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            goto L_0x01cd
        L_0x01a7:
            java.lang.String r0 = "loadStat"
            X.C18070vi.A11(r0)     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
            r0 = 0
            goto L_0x01b0
        L_0x01ae:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ae }
        L_0x01b0:
            throw r0     // Catch:{ Exception -> 0x01b3, all -> 0x01b1 }
        L_0x01b1:
            r0 = move-exception
            goto L_0x01cb
        L_0x01b3:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d5 }
            r1.<init>()     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = "LightSharedPreferencesImpl/Cannot read preferences from "
            r1.append(r0)     // Catch:{ all -> 0x01d5 }
            X.10j r0 = r5.A08     // Catch:{ all -> 0x01d5 }
            r1.append(r0)     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01d5 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01d5 }
            goto L_0x01cd
        L_0x01cb:
            r5.A03 = r0     // Catch:{ all -> 0x01d5 }
        L_0x01cd:
            r0 = 1
            r5.A05 = r0     // Catch:{ all -> 0x01d5 }
            r4.notifyAll()     // Catch:{ all -> 0x01d5 }
        L_0x01d3:
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            return
        L_0x01d5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01d5 }
            throw r0
        L_0x01d8:
            java.lang.Object r0 = r10.A01
            X.1dg r0 = (X.C30281dg) r0
            X.19T r2 = r0.A00
            r1 = 630(0x276, float:8.83E-43)
            r0 = 1
            r2.endAllMarkers(r1, r0)
            r2.BK8()
            return
        L_0x01e8:
            java.lang.Object r0 = r10.A01
            X.19T r0 = (X.AnonymousClass19T) r0
            r0.CSP()
            return
        L_0x01f0:
            java.lang.Object r2 = r10.A01
            X.1Vx r2 = (X.C27391Vx) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 27
            X.AWd r0 = new X.AWd
            r0.<init>(r2, r1)
            r2.notifyAllObservers(r0)
            X.1KB r3 = r2.A02
            java.lang.Runnable r2 = r2.A03
            r0 = 500(0x1f4, double:2.47E-321)
            r3.A0K(r2, r0)
            return
        L_0x020c:
            java.lang.Object r0 = r10.A01
            X.1Nh r0 = (X.C25201Nh) r0
            r0.A0L()
            return
        L_0x0214:
            java.lang.Object r7 = r10.A01
            X.1Wk r7 = (X.C27521Wk) r7
            X.11P r0 = r7.A03
            long r3 = X.AnonymousClass11P.A01(r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            X.00H r6 = r7.A06
            java.lang.Object r8 = r6.get()
            X.1eq r8 = (X.C30991eq) r8
            monitor-enter(r8)
            android.content.SharedPreferences r5 = X.C30991eq.A01(r8)     // Catch:{ all -> 0x0286 }
            java.lang.String r2 = "timespent_last_activity_time"
            r0 = 0
            long r0 = r5.getLong(r2, r0)     // Catch:{ all -> 0x0286 }
            monitor-exit(r8)
            r7.A08 = r0
            long r1 = r7.A08
            r5 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x0243
            r1 = 1
        L_0x0243:
            boolean r0 = X.C27521Wk.A04(r7, r3)
            if (r0 != 0) goto L_0x024b
            if (r1 == 0) goto L_0x024e
        L_0x024b:
            X.C27521Wk.A03(r7, r1)
        L_0x024e:
            X.C27521Wk.A01(r7, r3)
            long r1 = r7.A08
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0258
            r5 = 0
        L_0x0258:
            long r0 = (long) r5
            r7.A00 = r0
            r7.A01 = r3
            r7.A08 = r3
            java.lang.Object r6 = r6.get()
            X.1eq r6 = (X.C30991eq) r6
            monitor-enter(r6)
            android.content.SharedPreferences$Editor r5 = X.C30991eq.A00(r6)     // Catch:{ all -> 0x0283 }
            java.lang.String r4 = "timespent_foreground_count"
            android.content.SharedPreferences r2 = X.C30991eq.A01(r6)     // Catch:{ all -> 0x0283 }
            r0 = 0
            long r2 = r2.getLong(r4, r0)     // Catch:{ all -> 0x0283 }
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r2)     // Catch:{ all -> 0x0283 }
            r0.apply()     // Catch:{ all -> 0x0283 }
            monitor-exit(r6)
            return
        L_0x0283:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0286:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448925e.run():void");
    }
}
