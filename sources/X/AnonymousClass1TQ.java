package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1TQ  reason: invalid class name */
public class AnonymousClass1TQ implements AnonymousClass11J {
    public final AnonymousClass18O A00;
    public final AnonymousClass1SI A01;
    public final AnonymousClass1TP A02;
    public final C26371Rw A03;
    public final C25851Pw A04;
    public final C25161Nd A05;
    public final AnonymousClass11P A06;
    public final AnonymousClass1R3 A07;
    public final C26001Ql A08;
    public final AnonymousClass1MX A09;
    public final AnonymousClass1NK A0A;
    public final AnonymousClass1SF A0B;
    public final AnonymousClass1TH A0C;
    public final C26391Ry A0D;
    public final C18030ve A0E;
    public final AnonymousClass1SH A0F;
    public final AnonymousClass1TO A0G;
    public final AnonymousClass1Nb A0H;
    public final AnonymousClass10I A0I;
    public final C19880zA A0J;
    public final C19830z4 A0K;
    public final AnonymousClass1RE A0L;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass2SB r36, com.whatsapp.jid.DeviceJid r37, int r38, long r39, long r41, long r43, long r45) {
        /*
            r35 = this;
            r13 = 0
            r6 = r35
            X.1TH r5 = r6.A0C
            X.1Oq r0 = r5.A02
            X.1au r4 = r0.A06()
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x00bc }
            r11 = 2
            X.C17960vV.A01()     // Catch:{ all -> 0x00b5 }
            X.1au r7 = r0.A06()     // Catch:{ all -> 0x00b5 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ae }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = "msg_history_sync"
            java.lang.String r8 = "device_id =?\n                  AND\n                  sync_type =?\n                  AND\n                  status =?"
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00ae }
            r12 = r37
            java.lang.String r1 = r12.getRawString()     // Catch:{ all -> 0x00ae }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00ae }
            r14 = r38
            java.lang.String r1 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x00ae }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x00ae }
            r2[r11] = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "MessageHistorySyncStore.deleteSyncStateByDeviceAndTypeAndStatus"
            int r0 = r10.A04(r9, r8, r0, r2)     // Catch:{ all -> 0x00ae }
            X.AnonymousClass1TH.A00(r7, r5, r12)     // Catch:{ all -> 0x00ae }
            r7.close()     // Catch:{ all -> 0x00b5 }
            r2 = 0
            if (r0 <= 0) goto L_0x004b
            r2 = 1
        L_0x004b:
            r25 = 0
            r15 = 0
            r17 = -1
            X.2n6 r10 = new X.2n6     // Catch:{ all -> 0x00b5 }
            r29 = r25
            r11 = r36
            r7 = r39
            r21 = r41
            r23 = r43
            r0 = r45
            r16 = r2
            r19 = r7
            r27 = r25
            r31 = r17
            r33 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r19, r21, r23, r25, r27, r29, r31, r33)     // Catch:{ all -> 0x00b5 }
            r5.A03(r10)     // Catch:{ all -> 0x00b5 }
            r3.A00()     // Catch:{ all -> 0x00b5 }
            X.AnonymousClass1TH.A00(r4, r5, r12)     // Catch:{ all -> 0x00b5 }
            r3.close()     // Catch:{ all -> 0x00bc }
            r4.close()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "HistorySyncManager/addOrUpdateSyncStateWithData syncType: "
            r4.append(r3)
            r4.append(r14)
            java.lang.String r3 = ", sizeLimitBytes: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = ", latestMsgId: "
            r4.append(r0)
            r4.append(r7)
            java.lang.String r0 = ", isActivated: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r2 == 0) goto L_0x00ad
            X.1TP r0 = r6.A02
            r0.A00()
        L_0x00ad:
            return
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00b5 }
            throw r0     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TQ.A03(X.2SB, com.whatsapp.jid.DeviceJid, int, long, long, long, long):void");
    }

    public static ArrayList A00(List list, long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass206 r2 = (AnonymousClass206) it.next();
            AnonymousClass1T7.A00(r2);
            if (z) {
                if (r2 != null) {
                    long j3 = r2.A0I;
                    if (j3 <= j2) {
                        if (j3 >= j) {
                            if (r2.A05 <= 0) {
                                if (!r2.A0l) {
                                    if (AnonymousClass25A.A0J(r2.A0u)) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!(r2 instanceof AnonymousClass22M) && !(r2 instanceof C445623x) && !(r2 instanceof C439821r)) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public long A01(C62142qr r7, int i, long j, boolean z) {
        long A002 = this.A01.A00(r7, i, z);
        StringBuilder sb = new StringBuilder();
        sb.append("HistorySyncManager/getOldestRowIdToSync syncType = ");
        sb.append(i);
        sb.append(", days = ");
        sb.append(A002);
        sb.append(", upperBoundTimestamp = ");
        sb.append(j);
        Log.i(sb.toString());
        if (A002 >= 0) {
            return this.A0A.A03(j - (A002 * 86400000));
        }
        return 0;
    }

    public void Bps(C59732mn r4) {
        if (r4.A02) {
            if (C18020vd.A05(C18040vf.A02, this.A0E, 4879)) {
                this.A0I.CGL(new C98764rg((Object) this, 45), "HistorySyncManager/onConnectivityChange");
            }
        }
    }

    public AnonymousClass1TQ(C19880zA r2, AnonymousClass18O r3, AnonymousClass1SI r4, AnonymousClass1TP r5, C26371Rw r6, C25851Pw r7, C25161Nd r8, AnonymousClass11P r9, C19830z4 r10, AnonymousClass1R3 r11, C26001Ql r12, AnonymousClass1MX r13, AnonymousClass1NK r14, AnonymousClass1SF r15, AnonymousClass1RE r16, AnonymousClass1TH r17, C26391Ry r18, C18030ve r19, AnonymousClass1SH r20, AnonymousClass1TO r21, AnonymousClass1Nb r22, AnonymousClass10I r23) {
        this.A06 = r9;
        this.A0E = r19;
        this.A0I = r23;
        this.A0A = r14;
        this.A00 = r3;
        this.A0B = r15;
        this.A0F = r20;
        this.A07 = r11;
        this.A03 = r6;
        this.A0H = r22;
        this.A0D = r18;
        this.A08 = r12;
        this.A0K = r10;
        this.A05 = r8;
        this.A01 = r4;
        this.A0G = r21;
        this.A02 = r5;
        this.A04 = r7;
        this.A0C = r17;
        this.A09 = r13;
        this.A0L = r16;
        this.A0J = r2;
    }

    public long A02(DeviceJid deviceJid, long j) {
        if (C62832s4.A00(deviceJid)) {
            if (C18020vd.A00(C18040vf.A02, this.A0E, 11085) >= 2) {
                return j;
            }
        }
        return AnonymousClass11P.A01(this.A06);
    }
}
