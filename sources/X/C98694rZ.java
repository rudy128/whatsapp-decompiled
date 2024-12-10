package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.4rZ  reason: invalid class name and case insensitive filesystem */
public class C98694rZ implements Runnable {
    public AnonymousClass4LZ A00;
    public final String A01;
    public final Set A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final AnonymousClass1CJ A06;
    public final AnonymousClass122 A07;
    public final AnonymousClass1NJ A08;
    public final AnonymousClass1BI A09;
    public final AW1 A0A;
    public final AnonymousClass1W6 A0B;
    public final List A0C;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f A[Catch:{ all -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9 A[Catch:{ all -> 0x010e }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0106 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r6 = 0
            r5 = r18
            java.lang.String r0 = "messagesViewModel/more-messages/loading/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x010e }
            X.122 r8 = r5.A07     // Catch:{ all -> 0x010e }
            X.1BI r4 = r5.A09     // Catch:{ all -> 0x010e }
            long r2 = r5.A04     // Catch:{ all -> 0x010e }
            r7 = 100
            long r0 = r5.A03     // Catch:{ all -> 0x010e }
            X.1NK r9 = r8.A0a     // Catch:{ all -> 0x010e }
            r10 = r4
            r11 = r7
            r12 = r2
            r14 = r0
            long r11 = r9.A06(r10, r11, r12, r14)     // Catch:{ all -> 0x010e }
            r9 = r4
            r10 = r7
            r13 = r0
            X.2dp r8 = r8.BUp(r9, r10, r11, r13)     // Catch:{ all -> 0x010e }
            android.database.Cursor r3 = r8.A00     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0079
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0079
            r3.getCount()     // Catch:{ all -> 0x010e }
            X.1NJ r2 = r5.A08     // Catch:{ all -> 0x010e }
            long r0 = r8.A02     // Catch:{ all -> 0x010e }
            boolean r9 = r2.A07(r4, r0)     // Catch:{ all -> 0x010e }
            X.1W6 r0 = r5.A0B     // Catch:{ all -> 0x010e }
            X.206 r13 = r0.A02(r3, r4)     // Catch:{ all -> 0x010e }
            if (r13 == 0) goto L_0x007a
            java.util.List r12 = r5.A0C     // Catch:{ all -> 0x010e }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x007a
            java.util.ArrayList r11 = X.AnonymousClass000.A14(r12)     // Catch:{ all -> 0x010e }
            java.util.Iterator r16 = r12.iterator()     // Catch:{ all -> 0x010e }
        L_0x0050:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x006e
            X.206 r10 = X.C17880vN.A0Y(r16)     // Catch:{ all -> 0x010e }
            long r0 = r10.A0x     // Catch:{ all -> 0x010e }
            r14 = 0
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x0050
            long r2 = r10.A0y     // Catch:{ all -> 0x010e }
            long r0 = r13.A0y     // Catch:{ all -> 0x010e }
            int r14 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0050
            r11.add(r10)     // Catch:{ all -> 0x010e }
            goto L_0x0050
        L_0x006e:
            r12.removeAll(r11)     // Catch:{ all -> 0x010e }
            int r0 = r11.size()     // Catch:{ all -> 0x010e }
            r12 = 1
            if (r0 != 0) goto L_0x007b
            goto L_0x007a
        L_0x0079:
            r9 = 0
        L_0x007a:
            r12 = 0
        L_0x007b:
            X.4LZ r1 = r5.A00     // Catch:{ all -> 0x010e }
            if (r1 == 0) goto L_0x00e3
            X.1CJ r0 = r5.A06     // Catch:{ all -> 0x010e }
            X.1ci r0 = X.C72463Mc.A0a(r0, r4)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x0089
            r0 = 0
            goto L_0x008b
        L_0x0089:
            int r0 = r0.A04     // Catch:{ all -> 0x010e }
        L_0x008b:
            X.4Rt r11 = new X.4Rt     // Catch:{ all -> 0x010e }
            r11.<init>(r8, r0, r9)     // Catch:{ all -> 0x010e }
            X.3VQ r9 = r1.A00     // Catch:{ all -> 0x010e }
            boolean r0 = r11.A02     // Catch:{ all -> 0x010e }
            r9.A0K = r0     // Catch:{ all -> 0x010e }
            int r0 = r11.A00     // Catch:{ all -> 0x010e }
            r9.A01 = r0     // Catch:{ all -> 0x010e }
            X.2dp r10 = r11.A01     // Catch:{ all -> 0x010e }
            android.os.Handler r8 = r9.A0Q     // Catch:{ all -> 0x010e }
            r1 = 46
            X.4ra r0 = new X.4ra     // Catch:{ all -> 0x010e }
            r0.<init>(r9, r10, r1)     // Catch:{ all -> 0x010e }
            r8.post(r0)     // Catch:{ all -> 0x010e }
            long r2 = r10.A02     // Catch:{ all -> 0x010e }
            X.AnonymousClass3VQ.A09(r9, r2)     // Catch:{ all -> 0x010e }
            long r0 = r10.A01     // Catch:{ all -> 0x010e }
            r9.A0W(r0)     // Catch:{ all -> 0x010e }
            r9.A0X(r2)     // Catch:{ all -> 0x010e }
            X.1DT r0 = r9.A0W     // Catch:{ all -> 0x010e }
            r0.A0E(r11)     // Catch:{ all -> 0x010e }
            if (r12 == 0) goto L_0x00d9
            r12 = 0
            java.util.List r0 = r9.A1H     // Catch:{ all -> 0x010e }
            X.1IX r11 = X.AnonymousClass1IX.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x010e }
            r16 = 1
            X.4SI r10 = new X.4SI     // Catch:{ all -> 0x010e }
            r14 = r12
            r15 = r12
            r13 = r12
            r17 = r6
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x010e }
            r1 = 48
            X.4ra r0 = new X.4ra     // Catch:{ all -> 0x010e }
            r0.<init>(r9, r10, r1)     // Catch:{ all -> 0x010e }
            r8.post(r0)     // Catch:{ all -> 0x010e }
        L_0x00d9:
            r1 = 14
            X.4rL r0 = new X.4rL     // Catch:{ all -> 0x010e }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x010e }
            r8.post(r0)     // Catch:{ all -> 0x010e }
        L_0x00e3:
            boolean r0 = X.C22971Dz.A0V(r4)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00fc
            X.AW1 r2 = r5.A0A     // Catch:{ all -> 0x010e }
            X.1ch r4 = (X.C29681ch) r4     // Catch:{ all -> 0x010e }
            long r0 = r5.A05     // Catch:{ all -> 0x010e }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x010e }
            X.4oa r0 = new X.4oa     // Catch:{ all -> 0x010e }
            r0.<init>(r5, r6)     // Catch:{ all -> 0x010e }
            r2.A06(r4, r0, r1, r7)     // Catch:{ all -> 0x010e }
            r6 = 1
        L_0x00fc:
            java.lang.String r0 = "messagesViewModel/more-messages/loading/end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x010e }
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x010e }
            if (r6 != 0) goto L_0x010d
            java.util.Set r1 = r5.A02
            java.lang.String r0 = r5.A01
            r1.remove(r0)
        L_0x010d:
            return
        L_0x010e:
            r2 = move-exception
            if (r6 != 0) goto L_0x0118
            java.util.Set r1 = r5.A02
            java.lang.String r0 = r5.A01
            r1.remove(r0)
        L_0x0118:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98694rZ.run():void");
    }

    public C98694rZ(AnonymousClass4LZ r1, AnonymousClass1CJ r2, AnonymousClass122 r3, AnonymousClass1NJ r4, AnonymousClass1BI r5, AW1 aw1, AnonymousClass1W6 r7, String str, List list, Set set, long j, long j2, long j3) {
        this.A03 = j;
        this.A01 = str;
        this.A07 = r3;
        this.A0B = r7;
        this.A09 = r5;
        this.A04 = j2;
        this.A05 = j3;
        this.A06 = r2;
        this.A08 = r4;
        this.A0A = aw1;
        this.A02 = set;
        this.A0C = list;
        this.A00 = r1;
    }
}
