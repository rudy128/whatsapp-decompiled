package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.profilo.logger.BufferLogger;
import java.util.HashSet;
import java.util.Random;

public class BG5 extends Handler {
    public final CKZ A00 = new CKZ();
    public final DFA A01;
    public final E9D A02;
    public final HashSet A03 = C17880vN.A12();
    public final Random A04 = new Random();

    public synchronized void A01(C26552D3s d3s) {
        HashSet hashSet = this.A03;
        if (hashSet.contains(Long.valueOf(d3s.A06))) {
            C108955ca.A1F(this, d3s, 3);
            hashSet.remove(Long.valueOf(d3s.A06));
        }
    }

    public synchronized void A02(C26552D3s d3s) {
        HashSet hashSet = this.A03;
        if (hashSet.contains(Long.valueOf(d3s.A06))) {
            C108955ca.A1F(this, d3s, 2);
            hashSet.remove(Long.valueOf(d3s.A06));
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void handleMessage(android.os.Message r16) {
        /*
            r15 = this;
            r4 = r15
            r2 = r16
            int r1 = r2.what
            r0 = 7
            if (r1 == r0) goto L_0x028e
            java.lang.Object r0 = r2.obj
            X.D3s r0 = (X.C26552D3s) r0
            switch(r1) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0010;
                case 2: goto L_0x0080;
                case 3: goto L_0x0025;
                case 4: goto L_0x00e1;
                case 5: goto L_0x022c;
                case 6: goto L_0x0199;
                default: goto L_0x000f;
            }
        L_0x000f:
            return
        L_0x0010:
            int r1 = r0.A03
            r1 = r1 & 2
            if (r1 != 0) goto L_0x001e
            X.DaM r1 = r0.A0G
            r1.start()
            A00(r0)
        L_0x001e:
            X.DFA r7 = r15.A01
            if (r7 == 0) goto L_0x000f
            monitor-enter(r7)
            goto L_0x024f
        L_0x0025:
            monitor-enter(r4)
            r1 = 0
            r15.removeMessages(r1, r0)     // Catch:{ all -> 0x028b }
            monitor-exit(r4)     // Catch:{ all -> 0x028b }
            X.DFA r7 = r15.A01
            if (r7 == 0) goto L_0x000f
            monitor-enter(r7)
            X.Cn8[] r8 = r7.A02     // Catch:{ all -> 0x0288 }
            X.Cn8[] r6 = r7.A03     // Catch:{ all -> 0x0288 }
            monitor-exit(r7)     // Catch:{ all -> 0x0288 }
            X.DF9 r1 = r7.A05
            r1.C8u(r0)
            int r2 = r0.A02
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r1 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r1)
            int r2 = com.facebook.profilo.core.TraceEvents.nativeDisableProviders(r2)     // Catch:{ all -> 0x0285 }
            com.facebook.profilo.core.TraceEvents.sProviders = r2     // Catch:{ all -> 0x0285 }
            monitor-exit(r1)
            java.lang.Object r5 = r7.A06
            monitor-enter(r5)
            int r4 = r6.length     // Catch:{ all -> 0x0282 }
            r3 = 0
            r2 = 0
        L_0x004c:
            if (r2 >= r4) goto L_0x0056
            r1 = r6[r2]     // Catch:{ all -> 0x0282 }
            r1.A03(r0, r7)     // Catch:{ all -> 0x0282 }
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0056:
            monitor-exit(r5)     // Catch:{ all -> 0x0282 }
            int r2 = r8.length
        L_0x0058:
            if (r3 >= r2) goto L_0x000f
            r1 = r8[r3]
            r1.A03(r0, r7)
            int r3 = r3 + 1
            goto L_0x0058
        L_0x0062:
            long r0 = r0.A06
            X.Cvb r3 = X.C26238Cvb.A0A
            X.D3s r2 = X.C26238Cvb.A01(r3, r0)
            if (r2 == 0) goto L_0x000f
            com.facebook.profilo.mmapbuf.core.Buffer r4 = r2.A09
            r9 = 0
            long r12 = r2.A06
            r5 = 6
            r6 = 41
            r7 = 0
            r11 = r9
            r10 = r9
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r4, r5, r6, r7, r9, r10, r11, r12)
            r2 = 4
            r3.A05(r0, r2)
            return
        L_0x0080:
            monitor-enter(r4)
            r10 = 0
            r15.removeMessages(r10, r0)     // Catch:{ all -> 0x00de }
            int r1 = r0.A03     // Catch:{ all -> 0x00de }
            r1 = r1 & 2
            if (r1 == 0) goto L_0x00a7
            X.DaM r1 = r0.A0G     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00d7
            X.DaM r1 = r0.A0G     // Catch:{ all -> 0x00de }
            r1.start()     // Catch:{ all -> 0x00de }
            A00(r0)     // Catch:{ all -> 0x00de }
            X.DaM r1 = r0.A0G     // Catch:{ all -> 0x00de }
            com.facebook.profilo.writer.NativeTraceWriter r5 = r1.A01     // Catch:{ all -> 0x00de }
            com.facebook.profilo.mmapbuf.core.Buffer r6 = r0.A09     // Catch:{ all -> 0x00de }
            long r7 = r0.A06     // Catch:{ all -> 0x00de }
            int r11 = r0.A03     // Catch:{ all -> 0x00de }
            r9 = 40
            r12 = r7
            com.facebook.profilo.logger.BufferLogger.writeAndWakeupTraceWriter(r5, r6, r7, r9, r10, r11, r12)     // Catch:{ all -> 0x00de }
        L_0x00a7:
            X.D3x r2 = r0.A08     // Catch:{ all -> 0x00de }
            java.lang.String r1 = "trace_config.post_trace_extension_ms"
            int r3 = r2.A00(r1, r10)     // Catch:{ all -> 0x00de }
            r1 = 4
            android.os.Message r2 = r15.obtainMessage(r1, r0)     // Catch:{ all -> 0x00de }
            long r0 = (long) r3     // Catch:{ all -> 0x00de }
            r15.sendMessageDelayed(r2, r0)     // Catch:{ all -> 0x00de }
            if (r3 <= 0) goto L_0x00d5
            X.DFA r1 = r15.A01     // Catch:{ all -> 0x00de }
            if (r1 == 0) goto L_0x00d5
            monitor-enter(r1)     // Catch:{ all -> 0x00de }
            X.Cn8[] r0 = r1.A02     // Catch:{ all -> 0x00d2 }
            X.Cn8[] r3 = r1.A03     // Catch:{ all -> 0x00d2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            int r2 = r0.length     // Catch:{ all -> 0x00de }
            r1 = 0
            r0 = 0
        L_0x00c7:
            if (r0 >= r2) goto L_0x00cc
            int r0 = r0 + 1
            goto L_0x00c7
        L_0x00cc:
            int r0 = r3.length     // Catch:{ all -> 0x00de }
        L_0x00cd:
            if (r1 >= r0) goto L_0x00d5
            int r1 = r1 + 1
            goto L_0x00cd
        L_0x00d2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x00dd
        L_0x00d5:
            monitor-exit(r4)
            return
        L_0x00d7:
            java.lang.String r0 = "Trace stopped but never started"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r0     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00e1:
            X.DFA r2 = r15.A01
            if (r2 == 0) goto L_0x0189
            monitor-enter(r2)
            X.Cn8[] r3 = r2.A02     // Catch:{ all -> 0x017e }
            X.Cn8[] r4 = r2.A03     // Catch:{ all -> 0x017e }
            monitor-exit(r2)     // Catch:{ all -> 0x017e }
            r10 = 0
            X.D3x r5 = r0.A08
            java.lang.String r1 = "trace_config.trace_config_id_switch"
            boolean r1 = r5.A01(r1, r10)
            r8 = 0
            if (r1 == 0) goto L_0x0139
            X.D3x r1 = r0.A08
            java.lang.String r5 = "trace_config.id"
            java.util.TreeMap r1 = r1.A02
            if (r1 == 0) goto L_0x0139
            java.lang.String r1 = X.C108945cZ.A1G(r5, r1)
            if (r1 == 0) goto L_0x0139
            long r13 = java.lang.Long.parseLong(r1)
            int r1 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0114
        L_0x010e:
            X.CNR r1 = r0.A07
            if (r1 == 0) goto L_0x0114
            r13 = 0
        L_0x0114:
            com.facebook.profilo.mmapbuf.core.Buffer r5 = r0.A09
            r11 = 8126470(0x7c0006, float:1.138761E-38)
            r6 = 6
            r7 = 52
            r12 = r10
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r5, r6, r7, r8, r10, r11, r12, r13)
            int r8 = r3.length
            r6 = 0
            r7 = 0
        L_0x0123:
            if (r6 >= r8) goto L_0x013c
            r5 = r3[r6]
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x0134
            boolean r1 = r5.A02
            if (r1 != 0) goto L_0x0134
            r1 = 0
        L_0x0130:
            r7 = r7 | r1
            int r6 = r6 + 1
            goto L_0x0123
        L_0x0134:
            int r1 = r5.getTracingProviders()
            goto L_0x0130
        L_0x0139:
            r13 = 0
            goto L_0x010e
        L_0x013c:
            int r9 = r4.length
            r6 = 0
        L_0x013e:
            if (r6 >= r9) goto L_0x0154
            r5 = r4[r6]
            java.lang.String r1 = r5.A01
            if (r1 == 0) goto L_0x014f
            boolean r1 = r5.A02
            if (r1 != 0) goto L_0x014f
            r1 = 0
        L_0x014b:
            r7 = r7 | r1
            int r6 = r6 + 1
            goto L_0x013e
        L_0x014f:
            int r1 = r5.getTracingProviders()
            goto L_0x014b
        L_0x0154:
            int r5 = r0.A02
            r7 = r7 & r5
            java.lang.Class<com.facebook.profilo.core.TraceEvents> r1 = com.facebook.profilo.core.TraceEvents.class
            monitor-enter(r1)
            int r5 = com.facebook.profilo.core.TraceEvents.nativeDisableProviders(r5)     // Catch:{ all -> 0x0285 }
            com.facebook.profilo.core.TraceEvents.sProviders = r5     // Catch:{ all -> 0x0285 }
            monitor-exit(r1)
            java.lang.Object r6 = r2.A06
            monitor-enter(r6)
            r5 = 0
        L_0x0165:
            if (r5 >= r9) goto L_0x016f
            r1 = r4[r5]     // Catch:{ all -> 0x0171 }
            r1.A03(r0, r2)     // Catch:{ all -> 0x0171 }
            int r5 = r5 + 1
            goto L_0x0165
        L_0x016f:
            monitor-exit(r6)     // Catch:{ all -> 0x0171 }
            goto L_0x0174
        L_0x0171:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0171 }
            throw r0
        L_0x0174:
            if (r10 >= r8) goto L_0x0181
            r1 = r3[r10]
            r1.A03(r0, r2)
            int r10 = r10 + 1
            goto L_0x0174
        L_0x017e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x017e }
            throw r0
        L_0x0181:
            X.DF9 r1 = r2.A05
            r1.C29(r0, r7)
            r1.C8y(r0)
        L_0x0189:
            com.facebook.profilo.mmapbuf.core.Buffer r1 = r0.A09
            r6 = 0
            long r9 = r0.A06
            r2 = 6
            r3 = 38
            r4 = 0
            r8 = r6
            r7 = r6
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r1, r2, r3, r4, r6, r7, r8, r9)
            return
        L_0x0199:
            X.CKZ r1 = r15.A00
            long r3 = r0.A06
            monitor-enter(r1)
            android.util.LongSparseArray r2 = r1.A00     // Catch:{ all -> 0x0285 }
            java.lang.Object r8 = r2.get(r3)     // Catch:{ all -> 0x0285 }
            X.C5Z r8 = (X.C5Z) r8     // Catch:{ all -> 0x0285 }
            if (r8 != 0) goto L_0x01a9
            goto L_0x0202
        L_0x01a9:
            X.C5Y r7 = r8.A00     // Catch:{ all -> 0x0285 }
            r6 = 1
            if (r7 == 0) goto L_0x01c6
            java.util.HashSet r5 = r7.A02     // Catch:{ all -> 0x0285 }
            monitor-enter(r5)     // Catch:{ all -> 0x0285 }
            X.E4p r4 = r7.A01     // Catch:{ all -> 0x01c3 }
            java.lang.String[] r3 = r7.A03     // Catch:{ all -> 0x01c3 }
            boolean r3 = r4.BKc(r5, r3)     // Catch:{ all -> 0x01c3 }
            if (r3 == 0) goto L_0x01bd
            monitor-exit(r5)     // Catch:{ all -> 0x01c3 }
            goto L_0x01c6
        L_0x01bd:
            monitor-exit(r5)     // Catch:{ all -> 0x01c3 }
            int r9 = r7.A00     // Catch:{ all -> 0x0285 }
            if (r9 == r6) goto L_0x01c6
            goto L_0x01e6
        L_0x01c3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01c3 }
            throw r0     // Catch:{ all -> 0x0285 }
        L_0x01c6:
            X.C5S r11 = r8.A01     // Catch:{ all -> 0x0285 }
            r9 = 1
            if (r11 == 0) goto L_0x01e6
            r12 = -1
            r10 = 0
            r9 = 0
        L_0x01ce:
            int[] r4 = r11.A01     // Catch:{ all -> 0x0285 }
            int r3 = r4.length     // Catch:{ all -> 0x0285 }
            if (r10 >= r3) goto L_0x01e6
            long r5 = r11.A00     // Catch:{ all -> 0x0285 }
            r8 = r4[r10]     // Catch:{ all -> 0x0285 }
            long r3 = (long) r8     // Catch:{ all -> 0x0285 }
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x01e3
            if (r8 <= r12) goto L_0x01e3
            int[] r3 = r11.A02     // Catch:{ all -> 0x0285 }
            r9 = r3[r10]     // Catch:{ all -> 0x0285 }
            r12 = r8
        L_0x01e3:
            int r10 = r10 + 1
            goto L_0x01ce
        L_0x01e6:
            monitor-exit(r1)
            if (r9 == 0) goto L_0x01ea
            goto L_0x0204
        L_0x01ea:
            com.facebook.profilo.mmapbuf.core.Buffer r3 = r0.A09
            r8 = 0
            long r11 = r0.A06
            r4 = 6
            r5 = 37
            r6 = 0
            r10 = r8
            r9 = r8
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r3, r4, r5, r6, r8, r9, r10, r11)
            X.D3s r3 = new X.D3s
            r3.<init>(r0, r4)
            r15.A01(r3)
            goto L_0x0224
        L_0x0202:
            monitor-exit(r1)
            r9 = 1
        L_0x0204:
            java.util.Random r3 = r15.A04
            int r3 = r3.nextInt(r9)
            if (r3 != 0) goto L_0x01ea
            com.facebook.profilo.mmapbuf.core.Buffer r3 = r0.A09
            r8 = 0
            long r11 = (long) r9
            r4 = 6
            r5 = 99
            r6 = 0
            r10 = r8
            r9 = r8
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r3, r4, r5, r6, r8, r9, r10, r11)
            long r11 = r0.A06
            r5 = 61
            com.facebook.profilo.logger.BufferLogger.writeStandardEntry(r3, r4, r5, r6, r8, r9, r10, r11)
            r15.A02(r0)
        L_0x0224:
            monitor-enter(r1)
            long r3 = r0.A06     // Catch:{ all -> 0x0285 }
            r2.delete(r3)     // Catch:{ all -> 0x0285 }
            monitor-exit(r1)
            return
        L_0x022c:
            int r1 = r2.arg1
            long r4 = (long) r1
            X.CKZ r6 = r15.A00
            long r1 = r0.A06
            monitor-enter(r6)
            android.util.LongSparseArray r0 = r6.A00     // Catch:{ all -> 0x024c }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x024c }
            X.C5Z r0 = (X.C5Z) r0     // Catch:{ all -> 0x024c }
            if (r0 == 0) goto L_0x024a
            X.C5S r3 = r0.A01     // Catch:{ all -> 0x024c }
            if (r3 == 0) goto L_0x024a
            long r1 = r3.A00     // Catch:{ all -> 0x024c }
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x024a
            r3.A00 = r4     // Catch:{ all -> 0x024c }
        L_0x024a:
            monitor-exit(r6)
            return
        L_0x024c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x024f:
            X.Cn8[] r6 = r7.A02     // Catch:{ all -> 0x027f }
            monitor-exit(r7)     // Catch:{ all -> 0x027f }
            int r5 = r6.length
            r4 = 0
        L_0x0254:
            if (r4 >= r5) goto L_0x0276
            r3 = r6[r4]
            int r2 = r0.A02
            int r1 = r3.getSupportedProviders()
            r2 = r2 & r1
            if (r2 == 0) goto L_0x0273
            com.facebook.profilo.logger.MultiBufferLogger r2 = r3.A01()
            com.facebook.profilo.mmapbuf.core.Buffer r1 = r0.A09
            r2.addBuffer(r1)
            r3.A02()
            X.Cn8.A00(r3, r0)
            r3.onTraceStarted(r0, r7)
        L_0x0273:
            int r4 = r4 + 1
            goto L_0x0254
        L_0x0276:
            X.DF9 r1 = r7.A05
            r1.C28(r0)
            r1.C8x(r0)
            return
        L_0x027f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x027f }
            throw r0
        L_0x0282:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0282 }
            throw r0
        L_0x0285:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0288:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0288 }
            throw r0
        L_0x028b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x028b }
            throw r0
        L_0x028e:
            java.lang.String r0 = "mTraceContext"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BG5.handleMessage(android.os.Message):void");
    }

    public static void A00(C26552D3s d3s) {
        BufferLogger.writeStandardEntry(d3s.A09, 6, 98, 0, 0, d3s.A08.A00("trace_config.logger_priority", 5), 0, d3s.A06);
    }

    public BG5(Looper looper, DFA dfa, E9D e9d) {
        super(looper);
        this.A01 = dfa;
        this.A02 = e9d;
    }
}
