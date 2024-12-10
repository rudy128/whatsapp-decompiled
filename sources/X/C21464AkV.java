package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.AkV  reason: case insensitive filesystem */
public class C21464AkV implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C21464AkV(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A07 = obj5;
        this.A04 = obj6;
        this.A06 = obj7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x028f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0296, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x029a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        X.CDX.A00(r15, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x02a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ab, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        X.CDX.A00(r16, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b1, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0382  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r34 = this;
            r0 = r34
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x03aa;
                case 1: goto L_0x00b9;
                case 2: goto L_0x0099;
                case 3: goto L_0x0079;
                case 4: goto L_0x0059;
                case 5: goto L_0x0027;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A01
            X.E8I r4 = (X.E8I) r4
            java.lang.Object r3 = r0.A02
            X.Cb3 r3 = (X.C25209Cb3) r3
            java.lang.Object r5 = r0.A03
            X.DRA r5 = (X.DRA) r5
            java.lang.Object r6 = r0.A04
            X.4rF r6 = (X.C98494rF) r6
            java.lang.Object r1 = r0.A05
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r7 = r0.A06
            X.4rF r7 = (X.C98494rF) r7
            java.lang.Object r2 = r0.A07
            android.content.Intent r2 = (android.content.Intent) r2
            X.DRA.A00(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0027:
            java.lang.Object r3 = r0.A01
            X.1gV r3 = (X.C32021gV) r3
            java.lang.Object r2 = r0.A02
            X.36u r2 = (X.C693336u) r2
            java.lang.Object r1 = r0.A03
            X.2SA r1 = (X.AnonymousClass2SA) r1
            java.lang.Object r6 = r0.A04
            java.lang.Object r8 = r0.A05
            java.lang.Object r7 = r0.A06
            java.lang.Object r5 = r0.A07
            byte[] r0 = r2.A01()
            if (r0 == 0) goto L_0x0057
            int r0 = r0.length
            if (r0 <= 0) goto L_0x0057
            android.graphics.Bitmap r9 = r1.A00()
        L_0x0048:
            r10 = 32
            X.AkZ r4 = new X.AkZ
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.C32021gV.A08(r3, r4)
            r0 = 0
            r1.A02(r0)
            return
        L_0x0057:
            r9 = 0
            goto L_0x0048
        L_0x0059:
            java.lang.Object r1 = r0.A06
            X.7Gg r1 = (X.C144167Gg) r1
            java.lang.Object r7 = r0.A02
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.lang.Object r2 = r0.A07
            X.732 r2 = (X.AnonymousClass732) r2
            java.lang.Object r6 = r0.A05
            java.security.PublicKey r6 = (java.security.PublicKey) r6
            java.lang.Object r5 = r0.A04
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r3 = r0.A01
            X.89m r3 = (X.C1606789m) r3
            java.lang.Object r4 = r0.A03
            X.705 r4 = (X.AnonymousClass705) r4
            r1.CBe(r2, r3, r4, r5, r6, r7)
            return
        L_0x0079:
            java.lang.Object r1 = r0.A07
            X.7Gg r1 = (X.C144167Gg) r1
            java.lang.Object r4 = r0.A01
            X.6rL r4 = (X.C134906rL) r4
            java.lang.Object r7 = r0.A02
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.lang.Object r6 = r0.A05
            java.security.PublicKey r6 = (java.security.PublicKey) r6
            java.lang.Object r5 = r0.A04
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r2 = r0.A03
            X.89m r2 = (X.C1606789m) r2
            java.lang.Object r3 = r0.A06
            X.705 r3 = (X.AnonymousClass705) r3
            r1.CBY(r2, r3, r4, r5, r6, r7)
            return
        L_0x0099:
            java.lang.Object r1 = r0.A06
            X.7Gd r1 = (X.C144137Gd) r1
            java.lang.Object r7 = r0.A02
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            java.lang.Object r2 = r0.A07
            X.732 r2 = (X.AnonymousClass732) r2
            java.lang.Object r6 = r0.A05
            java.security.PublicKey r6 = (java.security.PublicKey) r6
            java.lang.Object r5 = r0.A04
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Object r3 = r0.A01
            X.89m r3 = (X.C1606789m) r3
            java.lang.Object r4 = r0.A03
            X.705 r4 = (X.AnonymousClass705) r4
            r1.CBe(r2, r3, r4, r5, r6, r7)
            return
        L_0x00b9:
            java.lang.Object r1 = r0.A01
            r25 = r1
            r1 = r25
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1
            r25 = r1
            java.lang.Object r5 = r0.A02
            X.AMa r5 = (X.C20463AMa) r5
            java.lang.Object r9 = r0.A03
            X.A2x r9 = (X.C20007A2x) r9
            java.lang.Object r1 = r0.A04
            r24 = r1
            r1 = r24
            X.A2r r1 = (X.C20002A2r) r1
            r24 = r1
            java.lang.Object r14 = r0.A05
            java.util.concurrent.atomic.AtomicBoolean r14 = (java.util.concurrent.atomic.AtomicBoolean) r14
            java.lang.Object r1 = r0.A06
            r23 = r1
            r1 = r23
            java.util.concurrent.atomic.AtomicLong r1 = (java.util.concurrent.atomic.AtomicLong) r1
            r23 = r1
            java.lang.Object r0 = r0.A07
            r22 = r0
            r0 = r22
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r22 = r0
            java.lang.String r21 = "gdrive/backup/backup-file"
            java.lang.String r20 = "gdrive/backup/backup-file failed on "
            r10 = 0
            r0 = r25
            X.C18070vi.A0d(r0, r10)
            r4 = 1
            r1 = 4
            r0 = r22
            X.C108965cb.A1O(r14, r1, r0)
            java.lang.Object r0 = r25.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 != 0) goto L_0x0375
            java.lang.String r19 = "% bytes"
            java.lang.String r18 = "gdrive/backup/upload/failure-percentage/"
            java.lang.String r12 = "gdrive/backup/upload/failed-bytes/"
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r13 = 2
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.io.File r0 = r24.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r11 = 0
            r1[r10] = r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = r24
            java.lang.String r0 = r0.A05     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r17 = r0
            java.lang.Object[] r1 = X.C108945cZ.A1b(r0, r1, r4, r13)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.String r0 = "gdrive-service/upload-file filePath:%s, fileUploadPath:%s"
            X.C108955ca.A1W(r0, r2, r1)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.util.concurrent.atomic.AtomicLong r0 = r5.A0e     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r33 = r0
            long r6 = r33.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            r15 = 0
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0157
            java.util.concurrent.atomic.AtomicLong r0 = r5.A0f     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r0.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r6 = (double) r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r6 = r6 * r2
            long r2 = r33.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r0 = (double) r2     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r6 = r6 / r0
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0157
            java.lang.String r0 = "gdrive/backup/upload-file/too-many-failures"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.8sQ r1 = r5.A0X     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = 38
            X.AnonymousClass8BR.A1G(r1, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            goto L_0x0349
        L_0x0157:
            X.1oW r0 = r5.A0M     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r26 = r0
            boolean r0 = r26.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 == 0) goto L_0x0349
            X.1oU r0 = r5.A0H     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r32 = r0
            int r0 = r0.A00     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 != r13) goto L_0x0171
            X.8sQ r1 = r5.A0X     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r1.A0k = r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
        L_0x0171:
            X.8gQ r1 = new X.8gQ     // Catch:{ all -> 0x0313 }
            r0 = r24
            r1.<init>(r9, r5, r0, r10)     // Catch:{ all -> 0x0313 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0313 }
            java.lang.String r0 = "gdrive-service/upload "
            r2.append(r0)     // Catch:{ all -> 0x0313 }
            java.lang.String r0 = "<file>"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x0313 }
            r0 = r26
            java.lang.Object r8 = X.A84.A00(r1, r0, r2)     // Catch:{ all -> 0x0313 }
            X.A2d r8 = (X.C19990A2d) r8     // Catch:{ all -> 0x0313 }
            if (r8 != 0) goto L_0x01c4
            java.util.concurrent.atomic.AtomicLong r3 = r5.A0f     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r24.A00()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r3.addAndGet(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0c     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0.incrementAndGet()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r12)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r3.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.C17890vO.A16(r2, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.StringBuilder r12 = X.AnonymousClass000.A11(r18)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r3.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r6 = (double) r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 * r0
            long r2 = r33.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r0 = (double) r2     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r6 = r6 / r0
            r12.append(r6)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = r19
            X.C17890vO.A1A(r12, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
        L_0x01c4:
            boolean r0 = r26.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 == 0) goto L_0x0349
            if (r8 == 0) goto L_0x0349
            java.lang.String r0 = "gdrive/backup/upload/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.util.Map r1 = r5.A0b     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.String r0 = r8.A01()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.C18070vi.A0X(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r1.put(r0, r8)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.A0L r12 = r5.A0N     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            boolean r0 = r5.A0i     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.String r11 = "local-file"
            if (r0 == 0) goto L_0x02b5
            X.0ve r2 = r12.A08     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r1 = 10717(0x29dd, float:1.5018E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 == 0) goto L_0x02b5
            java.lang.String r7 = r9.A03()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r7 == 0) goto L_0x02b5
            X.2Dj r0 = r12.A07     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.1au r16 = r0.A06()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.1xA r15 = r16.BD0()     // Catch:{ all -> 0x02a9 }
            X.9nb r2 = r12.A02     // Catch:{ all -> 0x02a2 }
            X.A7X r0 = r9.A06     // Catch:{ all -> 0x02a2 }
            java.lang.String r1 = r0.A0C     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = r9.A09     // Catch:{ all -> 0x02a2 }
            X.9sJ r0 = r2.A01(r1, r0)     // Catch:{ all -> 0x02a2 }
            if (r0 == 0) goto L_0x029b
            X.9eC r2 = r12.A03     // Catch:{ all -> 0x02a2 }
            long r0 = r0.A00     // Catch:{ all -> 0x02a2 }
            X.2Dj r2 = r2.A03     // Catch:{ all -> 0x02a2 }
            X.1au r9 = r2.A06()     // Catch:{ all -> 0x02a2 }
            r2 = r9
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0294 }
            X.1Ev r2 = r2.A02     // Catch:{ all -> 0x0294 }
            r18 = r2
            java.lang.String r28 = "local_files"
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x0294 }
            r6.<init>(r4)     // Catch:{ all -> 0x0294 }
            java.lang.String r3 = "transaction_id"
            r6.put(r3, r7)     // Catch:{ all -> 0x0294 }
            java.lang.String r29 = "backup_id = ? and upload_title = ?"
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x0294 }
            X.C17880vN.A1V(r2, r10, r0)     // Catch:{ all -> 0x0294 }
            r2[r4] = r17     // Catch:{ all -> 0x0294 }
            java.lang.String r30 = "LOCAL_FILES_STORE_MARK_AS_UPLOADED"
            r26 = r18
            r27 = r6
            r31 = r2
            int r2 = r26.A02(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0294 }
            r9.close()     // Catch:{ all -> 0x02a2 }
            if (r2 > 0) goto L_0x0250
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "gdrive/backup-file-list-manager/markAsUploaded/failed mark as uploaded localFile: "
            X.C17900vP.A0e(r0, r11, r1)     // Catch:{ all -> 0x02a2 }
            goto L_0x029e
        L_0x0250:
            X.9zT r2 = r12.A05     // Catch:{ all -> 0x02a2 }
            android.content.ContentValues r9 = X.C199119zT.A00(r8, r0)     // Catch:{ all -> 0x02a2 }
            X.9Ii r0 = X.C179529Ii.UPLOADED     // Catch:{ all -> 0x02a2 }
            int r0 = r0.value     // Catch:{ all -> 0x02a2 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "state"
            r9.put(r0, r1)     // Catch:{ all -> 0x02a2 }
            r9.put(r3, r7)     // Catch:{ all -> 0x02a2 }
            X.2Dj r0 = r2.A01     // Catch:{ all -> 0x02a2 }
            X.1au r3 = r0.A06()     // Catch:{ all -> 0x02a2 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x028d }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x028d }
            java.lang.String r2 = "remote_files"
            java.lang.String r1 = "REMOTE_FILE_STORE_SAVE_UPLOADED_FILE"
            r0 = 5
            long r6 = r6.A09(r2, r1, r9, r0)     // Catch:{ all -> 0x028d }
            r3.close()     // Catch:{ all -> 0x02a2 }
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x029b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "gdrive/backup-file-list-manager/markAsUploaded/failed save localFile: "
            X.C17900vP.A0e(r0, r11, r1)     // Catch:{ all -> 0x02a2 }
            goto L_0x029e
        L_0x028d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x028f }
        L_0x028f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x02a2 }
            goto L_0x029a
        L_0x0294:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0296 }
        L_0x0296:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x02a2 }
        L_0x029a:
            throw r0     // Catch:{ all -> 0x02a2 }
        L_0x029b:
            r15.A00()     // Catch:{ all -> 0x02a2 }
        L_0x029e:
            r15.close()     // Catch:{ all -> 0x02a9 }
            goto L_0x02b2
        L_0x02a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            X.CDX.A00(r15, r1)     // Catch:{ all -> 0x02a9 }
            throw r0     // Catch:{ all -> 0x02a9 }
        L_0x02a9:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x02ab }
        L_0x02ab:
            r1 = move-exception
            r0 = r16
            X.CDX.A00(r0, r2)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            throw r1     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
        L_0x02b2:
            r16.close()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
        L_0x02b5:
            java.util.concurrent.atomic.AtomicLong r6 = r5.A0g     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.A55 r0 = r8.A02     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 == 0) goto L_0x02f0
            long r0 = r0.A00     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
        L_0x02bd:
            r6.addAndGet(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.0z4 r2 = r5.A0S     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r6.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            android.content.SharedPreferences$Editor r3 = X.C19830z4.A00(r2)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.String r2 = "gdrive_already_uploaded_bytes"
            X.C17880vN.A1D(r3, r2, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = r32
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            boolean r0 = r0.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            if (r0 == 0) goto L_0x02f3
            X.8yN r1 = r5.A0I     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r27 = r6.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r30 = r33.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.35L r0 = new X.35L     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r26 = r0
            r29 = r13
            r26.<init>(r27, r29, r30)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r1.notifyAllObservers(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            goto L_0x0348
        L_0x02f0:
            long r0 = r8.A00     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            goto L_0x02bd
        L_0x02f3:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r6.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.AnonymousClass3MX.A1S(r2, r10, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r33.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.AnonymousClass3MX.A1S(r2, r4, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r2, r13)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.String r0 = "gdrive-service/upload/success gdrive file map is null, notify backup progress suppressed: %d/%d"
            java.lang.String r0 = X.C108955ca.A12(r3, r0, r1)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            goto L_0x0348
        L_0x0313:
            r9 = move-exception
            java.util.concurrent.atomic.AtomicLong r3 = r5.A0f     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r24.A00()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r3.addAndGet(r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0c     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0.incrementAndGet()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r12)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r3.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            X.C17890vO.A16(r2, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r18)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            long r0 = r3.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r2 = (double) r0     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            long r6 = r33.get()     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r0 = (double) r6     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            double r2 = r2 / r0
            r8.append(r2)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            r0 = r19
            X.C17890vO.A1A(r8, r0)     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
            throw r9     // Catch:{ 8gb | 8gc | 8ge | 8gf | 8gg | 8gm | 8gn | 8go -> 0x036a, FileNotFoundException -> 0x035a }
        L_0x0348:
            r11 = 1
        L_0x0349:
            r14.compareAndSet(r4, r11)
            if (r11 == 0) goto L_0x0378
            if (r23 == 0) goto L_0x038b
            long r1 = r24.A00()
            r0 = r23
            r0.addAndGet(r1)
            goto L_0x038b
        L_0x035a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x038f }
            java.lang.String r0 = "gdrive/backup/upload/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x038f }
            java.lang.String r0 = "<file>"
            X.C108985cd.A1M(r0, r1, r2)     // Catch:{ all -> 0x038f }
            goto L_0x0375
        L_0x036a:
            r1 = move-exception
            r0 = r21
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x038f }
            r0 = r25
            r0.set(r1)     // Catch:{ all -> 0x038f }
        L_0x0375:
            r14.compareAndSet(r4, r10)
        L_0x0378:
            X.1oU r0 = r5.A0H
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x038b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r20)
            java.lang.String r0 = "<file>"
            X.C17890vO.A1A(r1, r0)
        L_0x038b:
            r22.countDown()
            return
        L_0x038f:
            r2 = move-exception
            r14.compareAndSet(r4, r10)
            X.1oU r0 = r5.A0H
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x03a6
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r20)
            java.lang.String r0 = "<file>"
            X.C17890vO.A1A(r1, r0)
        L_0x03a6:
            r22.countDown()
            throw r2
        L_0x03aa:
            java.lang.String r5 = " (from syncer thread)"
            java.lang.String r7 = "releasing dso store lock for "
            java.lang.String r3 = "rw"
            java.lang.String r4 = "fb-UnpackingSoSource"
            java.lang.String r1 = "starting syncer worker"
            android.util.Log.v(r4, r1)     // Catch:{ all -> 0x042f }
            java.lang.Object r1 = r0.A03     // Catch:{ all -> 0x042f }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x042f }
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x042f }
            r8.<init>(r1, r3)     // Catch:{ all -> 0x042f }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0425 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0425 }
            r8.write(r1)     // Catch:{ all -> 0x0425 }
            long r1 = r8.getFilePointer()     // Catch:{ all -> 0x0425 }
            r8.setLength(r1)     // Catch:{ all -> 0x0425 }
            r8.close()     // Catch:{ all -> 0x042f }
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x042f }
            X.1AE r1 = (X.AnonymousClass1AE) r1     // Catch:{ all -> 0x042f }
            java.io.File r9 = r1.A00     // Catch:{ all -> 0x042f }
            java.lang.String r1 = "dso_manifest"
            java.io.File r1 = X.C17880vN.A0e(r9, r1)     // Catch:{ all -> 0x042f }
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch:{ all -> 0x042f }
            r8.<init>(r1, r3)     // Catch:{ all -> 0x042f }
            java.lang.Object r2 = r0.A05     // Catch:{ all -> 0x0425 }
            X.9Ud r2 = (X.C182379Ud) r2     // Catch:{ all -> 0x0425 }
            r1 = 1
            r8.writeByte(r1)     // Catch:{ all -> 0x0425 }
            X.9Zk[] r6 = r2.A00     // Catch:{ all -> 0x0425 }
            int r3 = r6.length     // Catch:{ all -> 0x0425 }
            r8.writeInt(r3)     // Catch:{ all -> 0x0425 }
            r2 = 0
        L_0x03f1:
            if (r2 >= r3) goto L_0x0404
            r1 = r6[r2]     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x0425 }
            r8.writeUTF(r1)     // Catch:{ all -> 0x0425 }
            r1 = r6[r2]     // Catch:{ all -> 0x0425 }
            java.lang.String r1 = r1.A00     // Catch:{ all -> 0x0425 }
            r8.writeUTF(r1)     // Catch:{ all -> 0x0425 }
            int r2 = r2 + 1
            goto L_0x03f1
        L_0x0404:
            r8.close()     // Catch:{ all -> 0x042f }
            X.C62732rs.A01(r9)     // Catch:{ all -> 0x042f }
            java.lang.Object r2 = r0.A07     // Catch:{ all -> 0x042f }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x042f }
            r1 = 1
            X.AnonymousClass1AE.A01(r2, r1)     // Catch:{ all -> 0x042f }
            java.lang.StringBuilder r1 = X.AnonymousClass8BX.A0g(r9, r7, r5)     // Catch:{ IOException -> 0x044c }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x044c }
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x044c }
            java.lang.Object r0 = r0.A04     // Catch:{ IOException -> 0x044c }
            X.1AH r0 = (X.AnonymousClass1AH) r0     // Catch:{ IOException -> 0x044c }
            r0.close()     // Catch:{ IOException -> 0x044c }
            return
        L_0x0425:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x042a }
            goto L_0x042e
        L_0x042a:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x042f }
        L_0x042e:
            throw r2     // Catch:{ all -> 0x042f }
        L_0x042f:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r7)     // Catch:{ IOException -> 0x044c }
            java.lang.Object r1 = r0.A01     // Catch:{ IOException -> 0x044c }
            X.1AC r1 = (X.AnonymousClass1AC) r1     // Catch:{ IOException -> 0x044c }
            java.io.File r1 = r1.A00     // Catch:{ IOException -> 0x044c }
            r2.append(r1)     // Catch:{ IOException -> 0x044c }
            java.lang.String r1 = X.AnonymousClass000.A0y(r5, r2)     // Catch:{ IOException -> 0x044c }
            android.util.Log.v(r4, r1)     // Catch:{ IOException -> 0x044c }
            java.lang.Object r0 = r0.A04     // Catch:{ IOException -> 0x044c }
            X.1AH r0 = (X.AnonymousClass1AH) r0     // Catch:{ IOException -> 0x044c }
            r0.close()     // Catch:{ IOException -> 0x044c }
            throw r3     // Catch:{ IOException -> 0x044c }
        L_0x044c:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21464AkV.run():void");
    }

    public C21464AkV(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144137Gd r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 2;
        AnonymousClass3Ma.A1O(x509Certificate, 2, r2);
        C18070vi.A0l(r3, r4);
        this.A06 = r5;
        this.A02 = x509Certificate;
        this.A07 = r2;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r3;
        this.A03 = r4;
    }

    public C21464AkV(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C144167Gg r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 4;
        C18070vi.A0k(x509Certificate, r2);
        C18070vi.A0l(r3, r4);
        this.A06 = r5;
        this.A02 = x509Certificate;
        this.A07 = r2;
        this.A05 = publicKey;
        this.A04 = num;
        this.A01 = r3;
        this.A03 = r4;
    }

    public C21464AkV(C1606789m r2, AnonymousClass705 r3, C144167Gg r4, C134906rL r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        this.A00 = 3;
        C18070vi.A0d(x509Certificate, 3);
        C18070vi.A0l(r2, r3);
        this.A07 = r4;
        this.A01 = r5;
        this.A02 = x509Certificate;
        this.A05 = publicKey;
        this.A04 = num;
        this.A03 = r2;
        this.A06 = r3;
    }
}
