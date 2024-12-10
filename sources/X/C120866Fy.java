package X;

import java.util.Set;

/* renamed from: X.6Fy  reason: invalid class name and case insensitive filesystem */
public abstract class C120866Fy extends C29651cd {
    public AnonymousClass190 A00;
    public AnonymousClass10I A01;
    public int A02 = -1;
    public final C28677EDz A03 = C23537BlQ.create();
    public final String A04 = "xpm-msg-exporter-svc";
    public final Set A05 = C17880vN.A12();

    public static void A01(C120866Fy r1) {
        synchronized (r1) {
            if (r1.A03.isEmpty() && r1.A05.isEmpty()) {
                r1.stopSelf(r1.A02);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r5.A01 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r15, int r16, int r17) {
        /*
            r14 = this;
            r7 = r14
            monitor-enter(r7)
            int r0 = r14.A02     // Catch:{ all -> 0x0111 }
            r12 = r17
            if (r12 <= r0) goto L_0x000a
            r14.A02 = r12     // Catch:{ all -> 0x0111 }
        L_0x000a:
            java.util.Set r3 = r14.A05     // Catch:{ all -> 0x0111 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0111 }
            r3.add(r2)     // Catch:{ all -> 0x0111 }
            monitor-exit(r7)     // Catch:{ all -> 0x0111 }
            r9 = r14
            com.whatsapp.migration.export.service.MessagesExporterService r9 = (com.whatsapp.migration.export.service.MessagesExporterService) r9
            if (r15 != 0) goto L_0x0022
            java.lang.String r0 = "xpm-export-service-onStartCommand()/intent is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x001e:
            r0 = 2
            monitor-enter(r7)
            goto L_0x0100
        L_0x0022:
            java.lang.String r0 = r15.getAction()
            java.lang.String r4 = "ACTION_START_EXPORT"
            boolean r0 = r4.equals(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0053
            X.A7R r5 = r9.A00
            monitor-enter(r5)
            android.os.CancellationSignal r0 = r5.A00     // Catch:{ all -> 0x010b }
            if (r0 != 0) goto L_0x003b
            java.util.concurrent.CountDownLatch r1 = r5.A01     // Catch:{ all -> 0x010b }
            r0 = 0
            if (r1 == 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            monitor-exit(r5)
            if (r0 != 0) goto L_0x0047
            X.A7R r0 = r9.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0053
        L_0x0047:
            java.lang.String r0 = "xpm-export-service-onStartCommand()/export in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.190 r4 = r9.A00
            java.lang.String r1 = "xpm-export-service-export-duplicated-start"
            java.lang.String r0 = "xpm-export-service-onStartCommand: duplicated call with ACTION_START_EXPORT event - there is another task running export or cancellation"
            goto L_0x0070
        L_0x0053:
            java.lang.String r0 = "ACTION_CANCEL_EXPORT"
            boolean r0 = X.C17890vO.A1S(r15, r0)
            r5 = 31
            if (r0 == 0) goto L_0x00a5
            X.A7R r0 = r9.A00
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0074
            java.lang.String r0 = "xpm-export-service-onStartCommand()/cancellation in already in progress"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.190 r4 = r9.A00
            java.lang.String r1 = "xpm-export-service-cancel-duplicated-start"
            java.lang.String r0 = "xpm-export-service-onStartCommand: duplicated call with ACTION_CANCEL_EXPORT event - there is another task running cancellation"
        L_0x0070:
            r4.A0G(r1, r0, r6)
            goto L_0x001e
        L_0x0074:
            java.lang.String r0 = "xpm-export-service-onStartCommand()/action_cancel_export"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.71e r0 = r9.A01
            X.73t r4 = X.C1403771e.A00(r0)
            X.118 r0 = r0.A00
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131890240(0x7f121040, float:1.9415166E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0E(r0)
            android.app.Notification r0 = r4.A05()
            r9.startForeground(r5, r0)
            X.A7R r1 = r9.A00
            r1.getClass()
            r0 = 40
            X.3Bs r10 = new X.3Bs
            r10.<init>(r1, r0)
            java.lang.String r11 = "cancel-export"
            goto L_0x00d5
        L_0x00a5:
            boolean r0 = X.C17890vO.A1S(r15, r4)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "xpm-export-service-onStartCommand()/action_start_export"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.71e r0 = r9.A01
            X.73t r4 = X.C1403771e.A00(r0)
            X.118 r0 = r0.A00
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131890246(0x7f121046, float:1.9415178E38)
            java.lang.String r0 = r1.getString(r0)
            r4.A0E(r0)
            android.app.Notification r0 = r4.A05()
            r9.startForeground(r5, r0)
            r0 = 3
            X.AkP r10 = new X.AkP
            r10.<init>(r9, r15, r0)
            java.lang.String r11 = "export-data"
        L_0x00d5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r9.A04
            r1.append(r0)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "; async task scheduled (foreground), start_id="
            X.C17900vP.A0j(r0, r1, r12)
            X.10I r0 = r9.A01
            r13 = 15
            X.3Cm r8 = new X.3Cm
            r8.<init>(r9, r10, r11, r12, r13)
            r0.CGN(r8)
            monitor-enter(r7)
            X.EDz r0 = r9.A03     // Catch:{ all -> 0x010e }
            r0.add(r2)     // Catch:{ all -> 0x010e }
            monitor-exit(r7)     // Catch:{ all -> 0x010e }
            goto L_0x001e
        L_0x0100:
            r3.remove(r2)     // Catch:{ all -> 0x0108 }
            A01(r14)     // Catch:{ all -> 0x0108 }
            monitor-exit(r7)     // Catch:{ all -> 0x0108 }
            return r0
        L_0x0108:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0108 }
            throw r0
        L_0x010b:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x010e:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x010e }
            throw r0
        L_0x0111:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0111 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120866Fy.onStartCommand(android.content.Intent, int, int):int");
    }
}
