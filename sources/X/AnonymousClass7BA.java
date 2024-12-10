package X;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.7BA  reason: invalid class name */
public final class AnonymousClass7BA implements C28613EAh {
    public C135876su A00;
    public final C122076Mr A01;
    public final AnonymousClass11P A02;
    public final C126396cf A03;
    public final Queue A04 = new ConcurrentLinkedQueue();

    public AnonymousClass7BA(AnonymousClass11P r2, C126396cf r3, C122076Mr r4) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public /* synthetic */ void Bqd(List list) {
    }

    public /* synthetic */ void Br2(String str, boolean z, long j) {
    }

    public /* synthetic */ void BsN() {
    }

    public /* synthetic */ void BtN(C25951CpJ cpJ, String str, String str2, String str3, long j) {
    }

    public /* synthetic */ void Bwm(boolean z) {
    }

    public /* synthetic */ void Bz4(byte[] bArr) {
    }

    public /* synthetic */ void C0j() {
    }

    public /* synthetic */ void C0n(D49 d49, float f, long j) {
    }

    public /* synthetic */ void C1b(D49 d49, String str) {
    }

    public /* synthetic */ void C1c() {
    }

    public /* synthetic */ void C4s(long j) {
    }

    public /* synthetic */ void C6I(D40 d40, D49 d49, String str, long j, boolean z, boolean z2) {
    }

    public /* synthetic */ void C72(long j, long j2, boolean z, boolean z2) {
    }

    public /* synthetic */ void C79(CA0 ca0) {
    }

    public /* synthetic */ void C7A(boolean z) {
    }

    public /* synthetic */ void C8i(List list) {
    }

    public /* synthetic */ void C9v(D40 d40, D49 d49, String str, String str2, String str3, String str4, long j, boolean z) {
    }

    public void C9x(CA0 ca0, D40 d40, D49 d49, Integer num, String str, boolean z, boolean z2) {
        C18070vi.A0d(d49, 0);
        long A002 = d49.A00();
        long j = d49.A0X;
        if (A002 > j) {
            A002 = j;
        }
        A01(this, (C133406oh) null, "completed", A002);
        if (z2) {
            long A003 = d49.A00();
            if (A003 > j) {
                A003 = j;
            }
            A01(this, (C133406oh) null, "started_playing", A003);
        }
        A00();
    }

    public /* synthetic */ void C9y(String str, String str2) {
    }

    public void C9z(CA0 ca0, D40 d40, D49 d49, Integer num, String str, String str2, String str3, long j, long j2, boolean z) {
        C18070vi.A0d(d49, 0);
        long A002 = d49.A00();
        long j3 = d49.A0X;
        if (A002 > j3) {
            A002 = j3;
        }
        A01(this, (C133406oh) null, "paused", A002);
        A00();
    }

    public /* synthetic */ void CA1() {
    }

    public /* synthetic */ void CA2(float f, int i, int i2, int i3) {
    }

    public void CA4(D40 d40, D49 d49, String str, String str2, String str3, String str4, String str5, long j, boolean z, boolean z2) {
        C18070vi.A0d(d49, 0);
        long A002 = d49.A00();
        long j2 = d49.A0X;
        if (A002 > j2) {
            A002 = j2;
        }
        A01(this, (C133406oh) null, "started_playing", A002);
    }

    public /* synthetic */ void CAH(boolean z, boolean z2) {
    }

    public /* synthetic */ void CAQ(C25951CpJ cpJ) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r5 = this;
            X.6su r4 = r5.A00
            if (r4 == 0) goto L_0x0059
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x0008:
            java.util.Queue r1 = r5.A04
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x001a
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x001a
            r3.add(r0)
            goto L_0x0008
        L_0x001a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0059
            r3.size()
            X.6cf r2 = r5.A03
            X.6rO r1 = new X.6rO
            r1.<init>(r4, r3)
            java.util.List r0 = r1.A01
            r0.size()
            java.lang.String r1 = X.AnonymousClass6XR.A00(r1)
            android.content.ContentValues r4 = X.C17880vN.A08()
            java.lang.String r0 = "payload_json"
            r4.put(r0, r1)
            X.1WI r0 = r2.A00
            X.1au r3 = r0.A06()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0052 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = "snapl_payload"
            java.lang.String r0 = "SnaplPayloadStore/INSERT"
            r2.A06(r1, r0, r4)     // Catch:{ all -> 0x0052 }
            r3.close()
            return
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BA.A00():void");
    }

    public static final void A01(AnonymousClass7BA r8, C133406oh r9, String str, long j) {
        Long A0n;
        String str2 = str;
        if (str.equals("paused") || str.equals("completed")) {
            A0n = C17880vN.A0n(r8.A01.A06());
        } else {
            A0n = null;
        }
        r8.A04.offer(new C136006t7(r9, A0n, str2, j, System.currentTimeMillis()));
    }

    public void CA0() {
        long j;
        C26378Cye cye = this.A01.A06;
        if (cye != null) {
            j = cye.A09();
            long j2 = C108965cb.A0E(cye).A0X;
            if (j2 < 0) {
                j2 = -1;
            }
            if (j > j2) {
                j = j2;
            }
        } else {
            j = 0;
        }
        A01(this, (C133406oh) null, "requested_playing", j);
    }

    public void C0l(CA0 ca0, C25951CpJ cpJ, D40 d40, D49 d49, String str, String str2) {
        A00();
    }
}
