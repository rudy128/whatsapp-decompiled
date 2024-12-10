package X;

import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.1P2  reason: invalid class name */
public final class AnonymousClass1P2 {
    public final AnonymousClass11P A00;
    public final C25571Os A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public AnonymousClass1P2(AnonymousClass11P r2, C25571Os r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r4;
        this.A02 = r5;
        this.A03 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C52952bk A00(X.C59982nC r8) {
        /*
            r7 = this;
            X.00H r0 = r7.A02
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004d }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "SELECT record  FROM fast_ratchet_sender_keys WHERE group_id = ? AND sender_id = ? AND sender_type = ? AND device_id = ?"
            java.lang.String[] r1 = r8.A00()     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "SignalFastRatchetSenderKeyStore/getFastRatchetSenderKey"
            android.database.Cursor r6 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x004d }
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x0046 }
            r0 = 0
            if (r1 == 0) goto L_0x003f
            java.lang.String r0 = "record"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0046 }
            byte[] r4 = r6.getBlob(r0)     // Catch:{ all -> 0x0046 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x0046 }
            X.11P r0 = r7.A00     // Catch:{ all -> 0x0046 }
            long r2 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0046 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r0
            X.2bk r0 = new X.2bk     // Catch:{ all -> 0x0046 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0046 }
        L_0x003f:
            r6.close()     // Catch:{ all -> 0x004d }
            r5.close()
            return r0
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P2.A00(X.2nC):X.2bk");
    }

    public C61912qU A01(C58462kj r4) {
        ((C25581Ot) this.A04.get()).A03();
        C17960vV.A07(r4);
        C52952bk A002 = A00(new C59982nC(C62812s2.A00(r4.A01), r4.A00));
        if (A002 != null) {
            return new C61912qU(A002.A01);
        }
        try {
            return new C61912qU();
        } catch (IOException e) {
            Log.w("axolotl ioexception while reading fast ratchet sender key record", e);
            return new C61912qU();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        X.CDX.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C59982nC r6, byte[] r7) {
        /*
            r5 = this;
            X.00H r0 = r5.A02
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1au r3 = r0.A06()
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "group_id"
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x004e }
            r4.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "sender_id"
            X.2nE r2 = r6.A00     // Catch:{ all -> 0x004e }
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x004e }
            r4.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "sender_type"
            int r0 = r2.A01     // Catch:{ all -> 0x004e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004e }
            r4.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "device_id"
            int r0 = r2.A00     // Catch:{ all -> 0x004e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004e }
            r4.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "record"
            r4.put(r0, r7)     // Catch:{ all -> 0x004e }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "fast_ratchet_sender_keys"
            java.lang.String r0 = "SignalFastRatchetSenderKeyStore/saveFastRatchetSenderKey"
            r2.A08(r1, r0, r4)     // Catch:{ all -> 0x004e }
            r3.close()
            return
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P2.A02(X.2nC, byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C58462kj r8, X.C61912qU r9) {
        /*
            r7 = this;
            X.2mN r0 = r8.A01
            X.2nE r1 = X.C62812s2.A00(r0)
            java.lang.String r0 = r8.A00
            X.2nC r4 = new X.2nC
            r4.<init>(r1, r0)
            X.8XP r0 = X.AnonymousClass8XP.DEFAULT_INSTANCE
            X.Bmt r6 = r0.A0N()
            java.util.LinkedList r0 = r9.A00
            java.util.Iterator r5 = r0.iterator()
        L_0x0019:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r5.next()
            X.9zI r0 = (X.C199019zI) r0
            X.8ac r3 = r0.A00
            r6.A0E()
            X.Bm6 r2 = r6.A00
            X.8XP r2 = (X.AnonymousClass8XP) r2
            r3.getClass()
            X.EE9 r1 = r2.senderKeyStates_
            r0 = r1
            X.DbR r0 = (X.C27296DbR) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0040
            X.EE9 r1 = X.C23577Bm6.A09(r1)
            r2.senderKeyStates_ = r1
        L_0x0040:
            r1.add(r3)
            goto L_0x0019
        L_0x0044:
            X.Bm6 r0 = r6.A0C()
            byte[] r1 = r0.A0M()
            X.1Os r0 = r7.A01
            X.3Ez r3 = X.C25571Os.A01(r0, r4)
            r3.lock()
            java.lang.String r2 = r4.A01     // Catch:{ all -> 0x0095 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0095 }
            X.8v1 r0 = X.C173408v1.A00     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0095 }
            boolean r0 = X.C18070vi.A18(r0, r2)     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x007c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r1.<init>()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "signalCoordinator/savefastratchetsenderkey/invalidgroupid "
            r1.append(r0)     // Catch:{ all -> 0x0095 }
            r1.append(r2)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0095 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0091
        L_0x007c:
            r7.A02(r4, r1)     // Catch:{ all -> 0x0095 }
            X.00H r0 = r7.A03     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0095 }
            X.1Ow r1 = (X.C25611Ow) r1     // Catch:{ all -> 0x0095 }
            X.2hD r0 = new X.2hD     // Catch:{ all -> 0x0095 }
            r0.<init>()     // Catch:{ all -> 0x0095 }
            X.1Ox r0 = r1.A00     // Catch:{ all -> 0x0095 }
            r0.A00()     // Catch:{ all -> 0x0095 }
        L_0x0091:
            r3.close()
            return
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1P2.A03(X.2kj, X.2qU):void");
    }
}
