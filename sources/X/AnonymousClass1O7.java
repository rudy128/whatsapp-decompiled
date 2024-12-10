package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.1O7  reason: invalid class name */
public class AnonymousClass1O7 extends Handler {
    public final ConcurrentMap A00 = new ConcurrentHashMap();
    public final /* synthetic */ AnonymousClass1O4 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1O7(Looper looper, AnonymousClass1O4 r3) {
        super(looper);
        this.A01 = r3;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r5 = 0
            r3 = 1
            switch(r0) {
                case 1: goto L_0x0008;
                case 2: goto L_0x0173;
                case 3: goto L_0x0187;
                case 4: goto L_0x029d;
                case 5: goto L_0x02b1;
                case 6: goto L_0x00c7;
                case 7: goto L_0x0155;
                case 8: goto L_0x0053;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            X.1O4 r2 = r10.A01
            int r4 = r11.arg1
            android.util.SparseIntArray r1 = r2.A02
            r0 = -1
            int r5 = r1.get(r4, r0)
            if (r5 < 0) goto L_0x001e
            java.util.List r0 = r2.A0C
            int r1 = r0.size()
            r0 = 1
            if (r5 < r1) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            X.C17960vV.A0D(r0)
            java.util.List r3 = r2.A0C     // Catch:{ 1O9 -> 0x02bb }
            java.lang.Object r0 = r3.get(r5)     // Catch:{ 1O9 -> 0x02bb }
            X.1RJ r0 = (X.AnonymousClass1RJ) r0     // Catch:{ 1O9 -> 0x02bb }
            boolean r0 = r0.BcT(r11, r4)     // Catch:{ 1O9 -> 0x02bb }
            if (r0 != 0) goto L_0x0007
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1O9 -> 0x02bb }
            r1.<init>()     // Catch:{ 1O9 -> 0x02bb }
            java.lang.String r0 = "Registered handler:"
            r1.append(r0)     // Catch:{ 1O9 -> 0x02bb }
            java.lang.Object r0 = r3.get(r5)     // Catch:{ 1O9 -> 0x02bb }
            r1.append(r0)     // Catch:{ 1O9 -> 0x02bb }
            java.lang.String r0 = " can't handle message of type:"
            r1.append(r0)     // Catch:{ 1O9 -> 0x02bb }
            r1.append(r4)     // Catch:{ 1O9 -> 0x02bb }
            java.lang.String r1 = r1.toString()     // Catch:{ 1O9 -> 0x02bb }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 1O9 -> 0x02bb }
            r0.<init>(r1)     // Catch:{ 1O9 -> 0x02bb }
            throw r0     // Catch:{ 1O9 -> 0x02bb }
        L_0x0053:
            int r0 = r11.arg1
            if (r0 != r3) goto L_0x0058
            r5 = 1
        L_0x0058:
            java.lang.Object r3 = r11.obj
            X.C17960vV.A07(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.concurrent.ConcurrentMap r0 = r10.A00
            r0.remove(r3)
            if (r5 == 0) goto L_0x0097
            X.1O4 r0 = r10.A01
            X.1O2 r1 = r0.A04
            r0 = 0
            if (r3 == 0) goto L_0x006e
            r0 = 1
        L_0x006e:
            X.C17960vV.A0C(r0)
            X.2f0 r2 = r1.A01(r3)
            if (r2 == 0) goto L_0x0097
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "in-flight-messages/on-pending-message-request-timeout: id = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Uf r1 = r2.A01
            if (r1 == 0) goto L_0x0097
            X.9L1 r0 = new X.9L1
            r0.<init>(r3)
            r1.BrC(r0)
        L_0x0097:
            X.1O4 r0 = r10.A01
            X.1Nz r1 = r0.A07
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.2mF r2 = r1.A00(r3)
            if (r2 == 0) goto L_0x0007
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "unacked-messages/on-message-timeout: id = "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1Uf r1 = r2.A02
            if (r1 == 0) goto L_0x0007
            X.9L1 r0 = new X.9L1
            r0.<init>(r3)
            r1.BrC(r0)
            return
        L_0x00c7:
            java.lang.Object r4 = r11.obj
            X.2nR r4 = (X.C60132nR) r4
            X.1O4 r2 = r10.A01
            X.1O3 r6 = r2.A06
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageCallbacksManager/received ack; stanzaKey="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Map r3 = r6.A03
            monitor-enter(r3)
            java.lang.Object r1 = r3.remove(r4)     // Catch:{ all -> 0x02f1 }
            X.1Uf r1 = (X.C26971Uf) r1     // Catch:{ all -> 0x02f1 }
            monitor-exit(r3)     // Catch:{ all -> 0x02f1 }
            if (r1 == 0) goto L_0x00f3
            r0 = 0
            r1.BrF(r0)
        L_0x00f3:
            if (r4 == 0) goto L_0x0112
            java.lang.String r1 = r4.A06
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0112
        L_0x0107:
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.1dB r0 = (X.C29971dB) r0
            r0.A09(r5)
        L_0x0112:
            java.lang.String r3 = r4.A08
            r0 = 0
            if (r3 == 0) goto L_0x0118
            r0 = 1
        L_0x0118:
            X.C17960vV.A0C(r0)
            java.util.concurrent.ConcurrentMap r0 = r10.A00
            java.lang.Object r1 = r0.remove(r3)
            if (r1 == 0) goto L_0x0128
            r0 = 8
            r10.removeMessages(r0, r1)
        L_0x0128:
            X.1Nz r2 = r2.A07
            java.lang.String r0 = "message acked with null id"
            X.C17960vV.A08(r3, r0)
            X.C18070vi.A0d(r3, r5)
            X.2mF r1 = r2.A00(r3)
            if (r1 == 0) goto L_0x0145
            java.util.LinkedHashMap r0 = r2.A01
            r0.size()
            X.1Uf r0 = r1.A02
            if (r0 == 0) goto L_0x0007
            r0.BrF(r3)
            return
        L_0x0145:
            java.util.LinkedHashMap r1 = r2.A00
            monitor-enter(r1)
            java.lang.Object r0 = r1.remove(r3)     // Catch:{ all -> 0x02f9 }
            X.2mF r0 = (X.C59402mF) r0     // Catch:{ all -> 0x02f9 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0007
            r1.size()
            return
        L_0x0155:
            java.lang.Object r1 = r11.obj
            X.2nR r1 = (X.C60132nR) r1
            X.1O4 r0 = r10.A01
            X.1Nz r3 = r0.A07
            java.lang.String r2 = r1.A08
            X.C18070vi.A0d(r2, r5)
            java.util.LinkedHashMap r1 = r3.A01
            monitor-enter(r1)
            java.lang.Object r0 = r1.remove(r2)     // Catch:{ all -> 0x02f9 }
            X.2mF r0 = (X.C59402mF) r0     // Catch:{ all -> 0x02f9 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0007
            java.util.LinkedHashMap r1 = r3.A00
            monitor-enter(r1)
            goto L_0x02f4
        L_0x0173:
            android.os.Bundle r1 = r11.getData()
            java.lang.String r0 = "iqId"
            java.lang.String r2 = r1.getString(r0)
            X.1O4 r1 = r10.A01
            java.lang.Object r0 = r11.obj
            X.1ca r0 = (X.C29621ca) r0
            X.AnonymousClass1O4.A00(r1, r0, r2)
            return
        L_0x0187:
            X.1O4 r9 = r10.A01
            java.lang.Object r3 = r9.A0B
            monitor-enter(r3)
            java.util.Map r2 = r9.A0D     // Catch:{ all -> 0x029a }
            java.util.Set r1 = r2.entrySet()     // Catch:{ all -> 0x029a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x029a }
            r0.<init>(r1)     // Catch:{ all -> 0x029a }
            r2.clear()     // Catch:{ all -> 0x029a }
            monitor-exit(r3)     // Catch:{ all -> 0x029a }
            java.util.Iterator r8 = r0.iterator()
        L_0x019f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d0
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r7 = r1.getKey()
            java.lang.String r7 = (java.lang.String) r7
            X.1Nx r6 = r9.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            r4 = 0
            r6.A01(r0, r4, r7)
            r6.A02(r7)
            java.lang.Object r3 = r1.getValue()
            X.10s r2 = r9.A0A
            r1 = 33
            X.7Qs r0 = new X.7Qs
            r0.<init>(r1, r7, r3)
            r2.execute(r0)
            r6.A03(r7, r4)
            goto L_0x019f
        L_0x01d0:
            X.1O3 r6 = r9.A06
            java.util.Map r3 = r6.A03
            monitor-enter(r3)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0297 }
            r4.<init>()     // Catch:{ all -> 0x0297 }
            monitor-enter(r3)     // Catch:{ all -> 0x0297 }
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x0294 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0294 }
        L_0x01e3:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0294 }
            if (r0 == 0) goto L_0x021e
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0294 }
            X.2nR r8 = (X.C60132nR) r8     // Catch:{ all -> 0x0294 }
            java.lang.String r1 = "message"
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x0294 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0294 }
            if (r0 == 0) goto L_0x01e3
            java.lang.String r1 = r8.A07     // Catch:{ all -> 0x0294 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0294 }
            r7 = 0
            if (r0 == 0) goto L_0x0204
            r1 = 0
            goto L_0x0208
        L_0x0204:
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0294 }
        L_0x0208:
            com.whatsapp.jid.Jid r0 = r8.A02     // Catch:{ all -> 0x0294 }
            X.1BI r2 = X.C22971Dz.A00(r0)     // Catch:{ all -> 0x0294 }
            r0 = 8
            if (r1 == r0) goto L_0x0213
            r7 = 1
        L_0x0213:
            java.lang.String r1 = r8.A08     // Catch:{ all -> 0x0294 }
            X.205 r0 = new X.205     // Catch:{ all -> 0x0294 }
            r0.<init>(r2, r1, r7)     // Catch:{ all -> 0x0294 }
            r4.add(r0)     // Catch:{ all -> 0x0294 }
            goto L_0x01e3
        L_0x021e:
            monitor-exit(r3)     // Catch:{ all -> 0x0294 }
            X.2si r2 = r6.A00     // Catch:{ all -> 0x0297 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0297 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0297 }
            r1.<init>()     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = "message-handler-callback/onMessageHandlerAckTimeout/keys:"
            r1.append(r0)     // Catch:{ all -> 0x0297 }
            r1.append(r4)     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0297 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0297 }
            X.10I r1 = r2.A09     // Catch:{ all -> 0x0297 }
            X.3Cu r0 = new X.3Cu     // Catch:{ all -> 0x0297 }
            r0.<init>((X.C63222si) r2, (java.util.List) r4)     // Catch:{ all -> 0x0297 }
            r1.CGF(r0)     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = "disconnected"
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0297 }
            r4.<init>(r0)     // Catch:{ all -> 0x0297 }
            java.util.Set r0 = r3.entrySet()     // Catch:{ all -> 0x0297 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0297 }
        L_0x0251:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0297 }
            if (r0 == 0) goto L_0x026a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0297 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0297 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0297 }
            X.1Uf r0 = (X.C26971Uf) r0     // Catch:{ all -> 0x0297 }
            r0.BrC(r4)     // Catch:{ all -> 0x0297 }
            r1.getKey()     // Catch:{ all -> 0x0297 }
            goto L_0x0251
        L_0x026a:
            r3.clear()     // Catch:{ all -> 0x0297 }
            X.00H r0 = r6.A02     // Catch:{ all -> 0x0297 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0297 }
            X.1dB r0 = (X.C29971dB) r0     // Catch:{ all -> 0x0297 }
            java.util.concurrent.atomic.AtomicInteger r2 = r0.A0J     // Catch:{ all -> 0x0297 }
            r2.set(r5)     // Catch:{ all -> 0x0297 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0297 }
            r1.<init>()     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = "XmppConnectionMetrics all outgoing stanza processing finished counter:"
            r1.append(r0)     // Catch:{ all -> 0x0297 }
            int r0 = r2.get()     // Catch:{ all -> 0x0297 }
            r1.append(r0)     // Catch:{ all -> 0x0297 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0297 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0297 }
            monitor-exit(r3)     // Catch:{ all -> 0x0297 }
            return
        L_0x0294:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0294 }
            throw r0     // Catch:{ all -> 0x0297 }
        L_0x0297:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0297 }
            throw r0
        L_0x029a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x029a }
            throw r0
        L_0x029d:
            java.lang.Object r2 = r11.obj
            java.lang.String r2 = (java.lang.String) r2
            X.1O4 r1 = r10.A01
            int r0 = r11.arg1
            if (r0 != r3) goto L_0x02a8
            r5 = 1
        L_0x02a8:
            X.AnonymousClass1O4.A01(r1, r2, r5)
            java.util.concurrent.ConcurrentMap r0 = r10.A00
            r0.remove(r2)
            return
        L_0x02b1:
            java.lang.Object r1 = r11.obj
            java.lang.String r1 = (java.lang.String) r1
            X.1O4 r0 = r10.A01
            X.AnonymousClass1O4.A01(r0, r1, r5)
            return
        L_0x02bb:
            r3 = move-exception
            boolean r0 = r3 instanceof X.AnonymousClass1UI
            if (r0 == 0) goto L_0x02d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "XmppIncomingMessageRouter/handleIncomingXmppMessage/corrupt-stream-error/stanza="
            r1.append(r0)
            r0 = r3
            X.1UI r0 = (X.AnonymousClass1UI) r0
            java.lang.String r0 = r0.stanza
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w(r0, r3)
        L_0x02d9:
            X.190 r2 = r2.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "source=XmppIncomingMessageRouter recvType="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r2.A0D(r3, r0)
            return
        L_0x02f1:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x02f1 }
            throw r0
        L_0x02f4:
            r1.put(r2, r0)     // Catch:{ all -> 0x02f9 }
            monitor-exit(r1)
            return
        L_0x02f9:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O7.handleMessage(android.os.Message):void");
    }
}
