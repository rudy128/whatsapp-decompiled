package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2sx  reason: invalid class name and case insensitive filesystem */
public class C63372sx {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public AnonymousClass206 A07;
    public AnonymousClass206 A08;
    public long A09;
    public final UserJid A0A;
    public final AnonymousClass11P A0B;

    public synchronized int A00() {
        return this.A00;
    }

    public synchronized int A01() {
        return this.A01;
    }

    public synchronized long A02() {
        return this.A03;
    }

    public synchronized long A03() {
        return this.A04;
    }

    public synchronized long A04() {
        return this.A09;
    }

    public synchronized long A05() {
        return this.A05;
    }

    public synchronized C63372sx A06() {
        return new C63372sx(this.A0B, this);
    }

    public synchronized C63372sx A07(AnonymousClass206 r6) {
        this.A08 = r6;
        long j = r6.A0y;
        this.A04 = j;
        this.A09 = r6.A0I;
        this.A00++;
        int i = this.A01 + 1;
        this.A01 = i;
        if (i == 1) {
            this.A03 = j;
            this.A07 = r6;
        } else {
            if (i <= 2) {
            }
        }
        this.A02 = j;
        return A06();
    }

    public synchronized AnonymousClass206 A08() {
        return this.A08;
    }

    public synchronized void A09(int i) {
        this.A00 = i;
    }

    public synchronized void A0A(long j) {
        this.A02 = j;
    }

    public synchronized void A0B(long j) {
        this.A09 = j;
    }

    public synchronized void A0C(AnonymousClass206 r2) {
        this.A08 = r2;
        if (this.A01 == 0) {
            this.A07 = r2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if ((X.AnonymousClass11P.A01(r6.A0B) - r6.A09) <= 86400000) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0D() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r0 = r6.A0A     // Catch:{ all -> 0x001d }
            boolean r0 = X.C22971Dz.A0Z(r0)     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001a
            X.11P r0 = r6.A0B     // Catch:{ all -> 0x001d }
            long r4 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x001d }
            long r0 = r6.A09     // Catch:{ all -> 0x001d }
            long r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            monitor-exit(r6)
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63372sx.A0D():boolean");
    }

    public synchronized boolean A0E(AnonymousClass206 r3, boolean z) {
        return !C20133A8t.A0C(r3, this.A05, z);
    }

    public synchronized String toString() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("StatusInfo[jid=");
        A10.append(this.A0A);
        A10.append(", msgId=");
        A10.append(this.A04);
        A10.append(", lastRead=");
        A10.append(this.A05);
        A10.append(", lastSent=");
        A10.append(this.A06);
        A10.append(", firstUnread=");
        A10.append(this.A03);
        A10.append(", autoDownloadLimit=");
        A10.append(this.A02);
        A10.append(", ts=");
        A10.append(this.A09);
        A10.append(", unreadCount=");
        A10.append(this.A01);
        A10.append(", total=");
        A10.append(this.A00);
        return AnonymousClass000.A0y(" ]", A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C63372sx(X.AnonymousClass11P r33, X.C63372sx r34) {
        /*
            r32 = this;
            r13 = r34
            com.whatsapp.jid.UserJid r0 = r13.A0A
            r17 = r0
            long r10 = r13.A04
            long r8 = r13.A05
            long r6 = r13.A06
            long r4 = r13.A03
            long r2 = r13.A02
            long r0 = r13.A09
            int r15 = r13.A01
            int r14 = r13.A00
            r12 = r32
            r16 = r33
            r30 = r0
            r28 = r2
            r26 = r4
            r24 = r6
            r22 = r8
            r20 = r10
            r18 = r15
            r19 = r14
            r15 = r12
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26, r28, r30)
            X.206 r0 = r13.A08
            r12.A08 = r0
            X.206 r0 = r13.A07
            r12.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63372sx.<init>(X.11P, X.2sx):void");
    }

    public C63372sx(AnonymousClass11P r3, UserJid userJid) {
        this.A0B = r3;
        this.A0A = userJid;
        this.A04 = 0;
        this.A05 = 0;
        this.A06 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A09 = 0;
        this.A01 = 0;
        this.A00 = 0;
    }

    public C63372sx(AnonymousClass11P r3, UserJid userJid, int i, int i2, long j, long j2, long j3, long j4, long j5, long j6) {
        this.A0B = r3;
        this.A0A = userJid;
        this.A04 = j;
        this.A05 = j2;
        this.A06 = j3;
        this.A03 = j4;
        this.A02 = Math.max(j5, j4);
        this.A09 = j6;
        this.A01 = i;
        this.A00 = i2;
    }
}
