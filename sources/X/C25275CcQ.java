package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CcQ  reason: case insensitive filesystem */
public class C25275CcQ {
    public C25273CcL A00;
    public final int A01;
    public final CT0 A02;
    public final AnonymousClass185 A03;
    public final long[] A04;
    public final int A05;
    public final RandomAccessFile A06;
    public final AnonymousClass11N A07;

    /* JADX WARNING: Removed duplicated region for block: B:111:0x009a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.SparseArray A00() {
        /*
            r19 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C23857BrE
            if (r0 == 0) goto L_0x00d7
            X.BrE r3 = (X.C23857BrE) r3
            X.CbS r0 = r3.A01
            android.util.SparseArray r2 = X.BE6.A0Q()
            java.util.Map r0 = r0.A05
            java.util.Iterator r9 = X.AnonymousClass000.A15(r0)
        L_0x0014:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x025c
            java.lang.Object r4 = X.C17890vO.A0P(r9)
            X.Cq4 r4 = (X.C25989Cq4) r4
            r5 = 0
            r3 = 0
        L_0x0022:
            int r0 = r4.A01
            if (r3 >= r0) goto L_0x0035
            java.util.List r0 = r4.A07
            java.lang.Object r0 = r0.get(r3)
            X.C5T r0 = (X.C5T) r0
            int r1 = r0.A01
            r0 = 8
            if (r1 <= r0) goto L_0x00d3
            r5 = 1
        L_0x0035:
            if (r5 == 0) goto L_0x0014
            android.util.SparseArray r3 = X.BE6.A0Q()
            r13 = 0
        L_0x003c:
            int r0 = r4.A01
            if (r13 >= r0) goto L_0x00b9
            int r0 = r4.A00
            if (r13 != r0) goto L_0x009d
            X.Ck8 r10 = r4.A02
        L_0x0046:
            int r5 = r10.A02
            r1 = 8
            boolean r0 = X.BE8.A1U(r5, r1)
            if (r0 != 0) goto L_0x009a
            if (r5 <= r1) goto L_0x0089
            byte[] r8 = new byte[r5]
            java.io.RandomAccessFile r7 = r10.A05     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            long r0 = r10.A03     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            r7.seek(r0)     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            int r1 = r10.A02     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            r0 = 0
            r7.readFully(r8, r0, r1)     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            int r0 = r10.A01     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            long r0 = (long) r0     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            r5 = 9
            long r0 = r0 * r5
            r5 = 56
            long r0 = r0 + r5
            r5 = 8
            long r0 = r0 + r5
            r7.seek(r0)     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            r0 = 1
            r7.writeBoolean(r0)     // Catch:{ EOFException -> 0x007e, IOException -> 0x0075 }
            goto L_0x008a
        L_0x0075:
            X.185 r1 = r10.A04
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A0D = r0
            goto L_0x0086
        L_0x007e:
            X.185 r1 = r10.A04
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A09 = r0
        L_0x0086:
            r1.A0d()
        L_0x0089:
            r8 = 0
        L_0x008a:
            if (r8 == 0) goto L_0x009a
            r3.put(r13, r8)
            java.util.List r0 = r4.A07
            java.lang.Object r1 = r0.get(r13)
            X.C5T r1 = (X.C5T) r1
            r0 = 1
            r1.A02 = r0
        L_0x009a:
            int r13 = r13 + 1
            goto L_0x003c
        L_0x009d:
            java.io.RandomAccessFile r12 = r4.A06
            java.util.List r1 = r4.A07
            java.lang.Object r0 = r1.get(r13)
            X.C5T r0 = (X.C5T) r0
            int r14 = r0.A01
            java.lang.Object r0 = r1.get(r13)
            X.C5T r0 = (X.C5T) r0
            int r15 = r0.A00
            X.185 r11 = r4.A05
            X.Ck8 r10 = new X.Ck8
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0046
        L_0x00b9:
            r6 = 0
        L_0x00ba:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0014
            int r5 = r3.keyAt(r6)
            java.lang.Object r1 = r3.get(r5)
            int r0 = r4.A04
            int r0 = r0 * 8
            int r0 = r0 + r5
            r2.put(r0, r1)
            int r6 = r6 + 1
            goto L_0x00ba
        L_0x00d3:
            int r3 = r3 + 1
            goto L_0x0022
        L_0x00d7:
            boolean r0 = r3 instanceof X.C23856BrD
            if (r0 == 0) goto L_0x0225
            X.BrD r3 = (X.C23856BrD) r3
            X.Ck2 r8 = r3.A00
            r0 = 10240(0x2800, float:1.4349E-41)
            byte[] r0 = new byte[r0]
            r8.A01 = r0
            r0 = 0
            r8.A00 = r0
            java.util.Set r0 = r8.A03
            r18 = r0
            r18.clear()
            java.util.Map r0 = r8.A02
            r17 = r0
            r17.clear()
            java.util.List r10 = r3.A01
            r10.clear()
            X.CT0 r9 = r3.A02
            int r7 = r9.A01
        L_0x00ff:
            int r7 = r7 + 1
            int r0 = r3.A01
            int r7 = r7 % r0
            int r0 = r9.A01
            if (r7 == r0) goto L_0x01fe
            X.CcL r0 = r3.A01(r7)
            X.Cqx r0 = r0.A04
            java.nio.ByteBuffer r0 = r0.A02
            java.nio.ByteBuffer r14 = r0.asReadOnlyBuffer()
            r14.flip()
            int r0 = r14.limit()
            if (r0 <= 0) goto L_0x00ff
            int r13 = r14.limit()
            r1 = 8
            r14.position(r1)
            r12 = 2048(0x800, float:2.87E-42)
            byte[] r11 = new byte[r12]
            r4 = 0
            r6 = 0
            r16 = 0
            r5 = 0
        L_0x012f:
            if (r1 >= r13) goto L_0x01f9
            X.CQX r15 = X.C26239Cvc.A03(r14)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r2 = r15.A01     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            if (r2 != 0) goto L_0x0190
            int r2 = r15.A00     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r0 = 6005(0x1775, float:8.415E-42)
            if (r2 != r0) goto L_0x0156
            java.lang.Object r4 = r15.A02     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r0 = r14.position()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r0 = r0 - r1
            r14.position(r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r14.get(r11, r6, r0)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r8.A00(r4, r11, r0)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
        L_0x0151:
            int r1 = r14.position()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            goto L_0x012f
        L_0x0156:
            int r2 = r14.position()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r2 = r2 - r1
            r14.position(r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r14.get(r11, r6, r2)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            java.util.Iterator r1 = X.C17890vO.A0l(r17)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
        L_0x0165:
            boolean r0 = r1.hasNext()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            if (r0 == 0) goto L_0x0175
            java.lang.Object r0 = r1.next()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r0.write(r11, r6, r2)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            goto L_0x0165
        L_0x0175:
            if (r2 <= r12) goto L_0x0179
            r2 = 2048(0x800, float:2.87E-42)
        L_0x0179:
            int r1 = r8.A00     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r0 = 10240 - r1
            if (r2 <= r0) goto L_0x0185
            java.lang.String r0 = "privatestatsuploadqueue/writetoCommonAttrBuffer too many common attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            goto L_0x0151
        L_0x0185:
            byte[] r0 = r8.A01     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            java.lang.System.arraycopy(r11, r6, r0, r1, r2)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r0 = r8.A00     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r0 = r0 + r2
            r8.A00 = r0     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            goto L_0x0151
        L_0x0190:
            r0 = 1
            if (r2 != r0) goto L_0x01b5
            int r2 = r14.position()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            byte r0 = r14.get(r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01b1
            int r0 = r2 - r1
            r14.position(r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r14.get(r11, r6, r0)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r8.A00(r4, r11, r0)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r14.position(r2)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r1 = r5
            r16 = 0
            goto L_0x01b3
        L_0x01b1:
            r16 = 1
        L_0x01b3:
            r5 = r1
            goto L_0x0151
        L_0x01b5:
            r0 = 2
            if (r2 != r0) goto L_0x0151
            byte r0 = r14.get(r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0151
            if (r16 == 0) goto L_0x0151
            int r2 = r14.position()     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            int r1 = r2 - r5
            r14.position(r5)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            if (r1 > r12) goto L_0x01d4
            r14.get(r11, r6, r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r8.A00(r4, r11, r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            goto L_0x01dc
        L_0x01d4:
            byte[] r0 = new byte[r1]     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r14.get(r0, r6, r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r8.A00(r4, r0, r1)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
        L_0x01dc:
            r14.position(r2)     // Catch:{ C1i -> 0x01eb, all -> 0x01e3 }
            r16 = 0
            goto L_0x0151
        L_0x01e3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "privateStatseventbuffermanager/splitbuffer unexpected errors "
            goto L_0x01f2
        L_0x01eb:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "privatestatseventbuffermanager/splitbuffer invalid buf content"
        L_0x01f2:
            java.lang.String r0 = X.BEA.A0j(r2, r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01f9:
            X.BE7.A11(r7, r10)
            goto L_0x00ff
        L_0x01fe:
            android.util.SparseArray r2 = X.BE6.A0Q()
            java.util.Iterator r4 = r18.iterator()
            r3 = 0
        L_0x0207:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x025c
            java.lang.Object r1 = r4.next()
            r0 = r17
            java.lang.Object r0 = r0.get(r1)
            java.io.ByteArrayOutputStream r0 = (java.io.ByteArrayOutputStream) r0
            if (r0 == 0) goto L_0x0222
            byte[] r0 = r0.toByteArray()
            r2.put(r3, r0)
        L_0x0222:
            int r3 = r3 + 1
            goto L_0x0207
        L_0x0225:
            android.util.SparseArray r2 = X.BE6.A0Q()
            X.CT0 r5 = r3.A02
            int r4 = r5.A01
        L_0x022d:
            int r4 = r4 + 1
            int r0 = r3.A01
            int r4 = r4 % r0
            int r0 = r5.A01
            if (r4 == r0) goto L_0x025c
            X.CcL r1 = r3.A01(r4)
            X.Cqx r0 = r1.A04
            java.nio.ByteBuffer r0 = r0.A02
            int r0 = r0.position()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x022d
            X.Cqx r0 = r1.A04
            java.nio.ByteBuffer r0 = r0.A02
            byte[] r1 = r0.array()
            int r0 = r0.position()
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.put(r4, r0)
            goto L_0x022d
        L_0x025c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25275CcQ.A00():android.util.SparseArray");
    }

    public C25273CcL A01(int i) {
        RandomAccessFile randomAccessFile = this.A06;
        CT0 ct0 = this.A02;
        int i2 = this.A05;
        C25273CcL ccL = new C25273CcL(this.A07, ct0, this.A03, randomAccessFile, i, i2);
        try {
            ccL.A03();
            if (i == ct0.A01) {
                this.A04[i] = (long) ccL.A00();
                return ccL;
            }
        } catch (C24387C1h e) {
            C17900vP.A0X(e, "InMemorySingleEventBufferManager/readEventBufferFromDisk: error in reading event buffer", AnonymousClass000.A10());
        }
        return ccL;
    }

    public void A02() {
        CT0 ct0 = this.A02;
        C24999CSz[] cSzArr = ct0.A05;
        int i = ct0.A01;
        C24999CSz cSz = cSzArr[i];
        RandomAccessFile randomAccessFile = this.A06;
        int i2 = this.A05;
        C25273CcL ccL = new C25273CcL(this.A07, ct0, this.A03, randomAccessFile, i, i2);
        this.A00 = ccL;
        try {
            ccL.A03();
            this.A04[ct0.A01] = (long) this.A00.A00();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            long j = cSz.A04;
            if (j > seconds) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("InMemorySingleEventBufferManager/init event from file: current event buffer timestamp is ");
                A10.append(j - seconds);
                C17890vO.A1B(A10, " seconds in the future");
                cSz.A04 = seconds;
            }
            Locale locale = Locale.US;
            Object[] objArr = new Object[5];
            C25273CcL ccL2 = this.A00;
            if (ccL2.A02 == ccL2.A05.A01) {
                AnonymousClass000.A1L(objArr, ccL2.A01);
                AnonymousClass000.A1M(objArr, ccL2.A00());
                AnonymousClass3Ma.A1S(objArr, ccL2.A03.A00.size());
                C17890vO.A1G(objArr, this.A00.A04.A02.position());
                C25273CcL ccL3 = this.A00;
                C17890vO.A1P(objArr, ccL3.A05.A05[ccL3.A02].A04);
                Log.i(String.format(locale, "InMemorySingleEventBufferManager/initfromfile: opened existing wam file: record_count = %d, event_count = %d, attribute_count = %d, size = %d, create_ts = %d", objArr));
                return;
            }
            throw BE6.A0v("No record count available for rotated buffers");
        } catch (C24387C1h e) {
            throw new C24390C1k(e.toString());
        }
    }

    public void A03() {
        RandomAccessFile randomAccessFile = this.A06;
        CT0 ct0 = this.A02;
        int i = ct0.A01;
        int i2 = this.A05;
        this.A00 = new C25273CcL(this.A07, ct0, this.A03, randomAccessFile, i, i2);
    }

    public boolean A05() {
        if (!(this instanceof C23857BrE)) {
            return AnonymousClass000.A1P(A01((this.A02.A01 + 1) % this.A01).A04.A02.position());
        }
        C23857BrE brE = (C23857BrE) this;
        if (brE.A01.A01()) {
            return AnonymousClass000.A1P(brE.A01(1).A04.A02.position());
        }
        return true;
    }

    public boolean A06() {
        if (this instanceof C23857BrE) {
            return ((C23857BrE) this).A01.A01();
        }
        for (int i = 0; i < this.A01; i++) {
            if (i != this.A02.A01 && !AnonymousClass000.A1P(A01(i).A04.A02.position())) {
                return true;
            }
        }
        return false;
    }

    public C25275CcQ(AnonymousClass11N r2, CT0 ct0, AnonymousClass185 r4, RandomAccessFile randomAccessFile, int i, int i2) {
        this.A06 = randomAccessFile;
        this.A02 = ct0;
        this.A01 = i;
        this.A05 = i2;
        this.A03 = r4;
        this.A04 = new long[i];
        this.A07 = r2;
    }

    public void A04(List list) {
        if (A06()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int A0H = C72453Mb.A0H(it);
                if (A0H != this.A02.A01) {
                    C25273CcL A012 = A01(A0H);
                    if (!AnonymousClass000.A1P(A012.A04.A02.position())) {
                        A012.A01();
                        this.A04[A0H] = 0;
                        try {
                            A012.A02();
                        } catch (IOException e) {
                            C17900vP.A0X(e, "InMemorySingleEventBufferManager/dropSentData: error while event buffer flush", AnonymousClass000.A10());
                        }
                    }
                }
            }
            return;
        }
        throw new Error("InMemorySingleEventBufferManager/dropSentData: Tried to drop empty buffer");
    }
}
