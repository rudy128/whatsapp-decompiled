package X;

import com.whatsapp.util.Log;

/* renamed from: X.355  reason: invalid class name */
public final class AnonymousClass355 implements C218917u {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass10I A03;

    public /* synthetic */ void BzP() {
    }

    public /* synthetic */ void BzQ(Integer num, Integer num2) {
    }

    public void BzR() {
        if (C18020vd.A05(C18040vf.A02, this.A01, 10768)) {
            Log.i("MessageOrphanManager/onOfflineResumeCompleted");
            this.A03.CGL(new C98564rM(this, 10), "MessageOrphanManager/onOfflineResumeCompleted");
        }
    }

    public AnonymousClass355(AnonymousClass11P r1, C18030ve r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(long r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageOrphanManager/deleteOrphanMessagesWithNoMessageOrphanReason: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " ms"
            X.C17890vO.A1A(r1, r0)
            X.11P r0 = r6.A00
            long r1 = X.AnonymousClass11P.A01(r0)
            long r1 = r1 - r7
            X.00H r0 = r6.A02
            java.lang.Object r0 = r0.get()
            X.ARP r0 = (X.ARP) r0
            X.1Cd r0 = r0.A01
            X.1au r5 = r0.A05()
            java.lang.String[] r4 = X.C17900vP.A0t(r1)     // Catch:{ all -> 0x003c }
            java.lang.String r3 = "message_orphan.orphan_message_reason = 1 AND message_orphan.timestamp < ?"
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "message_orphan"
            java.lang.String r0 = "MessageOrphanStore/deleteOrphanMessagesWithNoMessageOrphanReason"
            r2.A04(r1, r3, r0, r4)     // Catch:{ all -> 0x003c }
            r5.close()
            return
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass355.A00(long):void");
    }
}
