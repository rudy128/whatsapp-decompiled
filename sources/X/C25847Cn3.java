package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cn3  reason: case insensitive filesystem */
public class C25847Cn3 {
    public boolean A00;
    public boolean A01 = true;
    public final int A02;
    public final int A03;
    public final C25275CcQ A04;
    public final C25960CpS A05;
    public final CT0 A06;
    public final AnonymousClass185 A07;
    public final File A08;
    public final RandomAccessFile A09;
    public final boolean A0A;
    public final AnonymousClass11N A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r4.A0A != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(java.io.RandomAccessFile r5, int r6) {
        /*
            r4 = this;
            int r1 = r4.A03     // Catch:{ IOException -> 0x001e }
            if (r1 == 0) goto L_0x0011
            r0 = 1
            if (r1 != r0) goto L_0x000a
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0013
        L_0x000a:
            boolean r0 = r4.A0A     // Catch:{ IOException -> 0x001e }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0013
        L_0x0011:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0013:
            long r2 = (long) r1     // Catch:{ IOException -> 0x001e }
            long r0 = (long) r6     // Catch:{ IOException -> 0x001e }
            long r2 = r2 * r0
            r0 = 65536(0x10000, double:3.2379E-319)
            long r2 = r2 + r0
            r5.setLength(r2)     // Catch:{ IOException -> 0x001e }
            return
        L_0x001e:
            r2 = move-exception
            X.185 r1 = r4.A07
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A01 = r0
            r1.A0d()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Cannot allocate space for new WAM file: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)
            X.C1k r0 = new X.C1k
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25847Cn3.A00(java.io.RandomAccessFile, int):void");
    }

    public final int A01() {
        return this.A04.A00.A04.A02.capacity() - CGF.A00[2].length;
    }

    public long A02() {
        long j;
        C25275CcQ ccQ = this.A04;
        long j2 = 0;
        for (int i = 0; i < ccQ.A01; i++) {
            if (i == ccQ.A02.A01) {
                j = (long) ccQ.A00.A00();
            } else {
                j = ccQ.A04[i];
            }
            j2 += j;
        }
        return j2;
    }

    public final void A03() {
        if (this.A01) {
            try {
                this.A04.A00.A02();
                try {
                    C25960CpS cpS = this.A05;
                    C25960CpS.A01(cpS, 2, cpS.A07.A05.length);
                    cpS.A06.A02();
                    this.A00 = false;
                } catch (IOException e) {
                    AnonymousClass185 r1 = this.A07;
                    r1.A00 = AnonymousClass000.A0i();
                    r1.A0d();
                    Log.e("wambuffer/flush: cannot write header", e);
                    Log.e("wambuffer: PERSISTENCE TURNED OFF");
                    this.A01 = false;
                }
            } catch (IOException unused) {
                Log.e("InMemorySingleEventBufferManager/flushEventBuffers: error while event buffer flush");
                Log.e("wambuffer: PERSISTENCE TURNED OFF");
                this.A01 = false;
            }
        }
    }

    public final void A05(C23859BrG brG, C23858BrF brF) {
        C25273CcL ccL = this.A04.A00;
        ByteBuffer byteBuffer = ccL.A04.A02;
        if (byteBuffer.position() == 0) {
            byteBuffer.put(CGF.A00[2]);
            CT0 ct0 = ccL.A05;
            C24999CSz[] cSzArr = ct0.A05;
            int i = ccL.A02;
            C24999CSz cSz = cSzArr[i];
            int i2 = ct0.A00 + 1;
            ct0.A00 = i2;
            if (i2 > 65535) {
                ct0.A00 = 1;
                i2 = 1;
            }
            cSz.A00 = i2;
            byteBuffer.put(ccL.A05(2));
            cSzArr[i].A04 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("wambuffer/first event: bufferSequenceNumber: ");
            C17900vP.A0o(A10, cSzArr[i].A00);
        }
        C24171Bwf bwf = brG.A02;
        int size = bwf.size();
        C24171Bwf bwf2 = brF.A02;
        if (size + bwf2.size() <= byteBuffer.remaining()) {
            byteBuffer.put(bwf.A00());
            byteBuffer.put(bwf2.A00());
            int i3 = ccL.A01 + brG.A01;
            ccL.A01 = i3;
            ccL.A01 = i3 + brF.A01;
            ccL.A00++;
            Map map = brG.A00;
            for (Number number : Collections.unmodifiableCollection(map.keySet())) {
                AnonymousClass18A r2 = ccL.A03;
                int intValue = number.intValue();
                if (map.containsKey(number)) {
                    r2.A00(intValue, ((AnonymousClass18B) map.get(number)).A00);
                } else {
                    throw new Error("The buffer does not contain the given attribute");
                }
            }
            return;
        }
        throw new Error("Not enough space in the buffer");
    }

    public boolean A06() {
        boolean z;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) / 86400;
        CT0 ct0 = this.A06;
        if (seconds != ct0.A03) {
            int i = this.A02;
            if (i == 0 || new Random().nextInt(i) != 0) {
                z = false;
                ct0.A02 = 0;
            } else {
                ct0.A02 = 0;
                z = true;
            }
            ct0.A04 = z;
            ct0.A03 = seconds;
        }
        return ct0.A04;
    }

    public final boolean A07() {
        return AnonymousClass000.A1P(this.A04.A00.A04.A02.position());
    }

    public final void A04() {
        int i;
        if (!A07()) {
            C25275CcQ ccQ = this.A04;
            if (ccQ.A05()) {
                Locale locale = Locale.US;
                Object[] A1a = BE6.A1a();
                AnonymousClass000.A1L(A1a, this.A06.A01);
                A1a[1] = Integer.valueOf(ccQ.A00.A04.A02.position());
                C25273CcL ccL = ccQ.A00;
                AnonymousClass3Ma.A1S(A1a, ccL.A00());
                C17890vO.A1O(A1a, ccL.A05.A05[ccL.A02].A04);
                Log.i(String.format(locale, "wambuffer/rotate: rotated event buffer %d: size = %d, event count = %d, timestamp = %d", A1a));
                if (ccQ instanceof C23857BrE) {
                    C23857BrE brE = (C23857BrE) ccQ;
                    C25273CcL ccL2 = brE.A00;
                    ByteBuffer asReadOnlyBuffer = ccL2.A04.A02.asReadOnlyBuffer();
                    asReadOnlyBuffer.flip();
                    if (asReadOnlyBuffer.limit() != 0) {
                        brE.A07(asReadOnlyBuffer, true);
                        try {
                            ccL2.A01();
                            ccL2.A02();
                        } catch (IOException e) {
                            e.toString();
                        }
                    }
                } else {
                    long[] jArr = ccQ.A04;
                    CT0 ct0 = ccQ.A02;
                    int i2 = ct0.A01;
                    jArr[i2] = (long) ccQ.A00.A00();
                    int i3 = (i2 + 1) % ccQ.A01;
                    ct0.A01 = i3;
                    ccQ.A00 = ccQ.A01(i3);
                }
                if (!this.A0A || !((i = this.A03) == 2 || i == 3)) {
                    this.A00 = true;
                    return;
                }
                return;
            }
            throw new Error("Rotation failed since there is no empty buffer");
        }
        throw new Error("Rotation failed since the current event buffer is empty");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:187:0x044e, code lost:
        if (r7.A09 != false) goto L_0x0450;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02fd A[Catch:{ C1j -> 0x031d, C1j -> 0x0387 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0414 A[Catch:{ C1k -> 0x04a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0444 A[Catch:{ C1k -> 0x04a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0233 A[Catch:{ C1j -> 0x031d, C1j -> 0x0387 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25847Cn3(X.AnonymousClass11N r27, X.C19830z4 r28, X.C18030ve r29, X.AnonymousClass182 r30, X.AnonymousClass185 r31, java.io.File r32, int r33, int r34, int r35, boolean r36) {
        /*
            r26 = this;
            r4 = 2
            r3 = r26
            r3.<init>()
            r14 = 1
            r3.A01 = r14
            r1 = r32
            r1.getAbsolutePath()
            boolean r9 = r1.isFile()
            r0 = r34
            r3.A02 = r0
            r8 = r36
            r3.A0A = r8
            r25 = r31
            r0 = r25
            r3.A07 = r0
            r5 = r27
            r3.A0B = r5
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002e }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x002e }
            r3.A01 = r14     // Catch:{ IOException -> 0x002e }
            goto L_0x004c
        L_0x002e:
            r6 = move-exception
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r0 = r25
            r0.A0I = r2
            if (r9 != 0) goto L_0x003b
            r0.A03 = r2
        L_0x003b:
            r25.A0d()
            java.lang.String r0 = "wambuffer/newwamfile: cannot open or create persistent WAM file; running in volatile mode"
            com.whatsapp.util.Log.e(r0, r6)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r3.A01 = r0
            r2 = 0
        L_0x004c:
            r3.A08 = r1
            r3.A09 = r2
            r7 = r35
            r3.A03 = r7
            X.CT0 r6 = new X.CT0
            r23 = r33
            r0 = r23
            r6.<init>(r0, r7)
            r3.A06 = r6
            X.CpS r0 = new X.CpS
            r15 = r0
            r16 = r6
            r17 = r25
            r18 = r2
            r19 = r23
            r20 = r7
            r21 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r3.A05 = r0
            if (r36 == 0) goto L_0x00c3
            if (r7 == r4) goto L_0x007a
            r0 = 3
            if (r7 != r0) goto L_0x00c3
        L_0x007a:
            java.lang.String r8 = r1.getAbsolutePath()
            char r0 = java.io.File.separatorChar
            int r0 = r8.lastIndexOf(r0)
            r1 = 0
            int r0 = r0 + 1
            java.lang.String r22 = r8.substring(r1, r0)
            r1 = 3271(0xcc7, float:4.584E-42)
            X.0vf r0 = X.C18040vf.A02
            r8 = r29
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x00af
            X.BrD r15 = new X.BrD
            r16 = r5
            r17 = r6
            r18 = r25
            r19 = r2
            r20 = r23
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21)
        L_0x00a8:
            r3.A04 = r15
            if (r9 == 0) goto L_0x0453
            if (r2 == 0) goto L_0x0453
            goto L_0x00d5
        L_0x00af:
            X.BrE r15 = new X.BrE
            r17 = r28
            r18 = r30
            r19 = r6
            r20 = r25
            r21 = r2
            r24 = r7
            r16 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L_0x00a8
        L_0x00c3:
            X.CcQ r15 = new X.CcQ
            r16 = r5
            r17 = r6
            r18 = r25
            r19 = r2
            r20 = r23
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21)
            goto L_0x00a8
        L_0x00d5:
            r0 = r23
            r3.A00(r2, r0)     // Catch:{ C1k -> 0x04a4 }
            X.CpS r9 = r3.A05     // Catch:{ C1j -> 0x0387 }
            byte[][] r20 = X.CGG.A00     // Catch:{ C1j -> 0x0387 }
            r0 = r20[r4]     // Catch:{ C1j -> 0x0387 }
            int r5 = r0.length     // Catch:{ C1j -> 0x0387 }
            byte[] r0 = new byte[r5]     // Catch:{ C1j -> 0x0387 }
            r9.A03 = r0     // Catch:{ C1j -> 0x0387 }
            X.Cqx r1 = r9.A06     // Catch:{ IOException -> 0x0375 }
            int r0 = r5 + 4
            r1.A03(r0)     // Catch:{ IOException -> 0x0375 }
            java.nio.ByteBuffer r0 = r1.A02     // Catch:{ C1j -> 0x0387 }
            r21 = r0
            java.nio.ByteBuffer r6 = r21.asReadOnlyBuffer()     // Catch:{ C1j -> 0x0387 }
            r6.flip()     // Catch:{ C1j -> 0x0387 }
            byte[] r0 = r9.A03     // Catch:{ C1j -> 0x0387 }
            r6.get(r0)     // Catch:{ C1j -> 0x0387 }
            byte[] r5 = r9.A03     // Catch:{ Exception -> 0x036a }
            r8 = 0
        L_0x00ff:
            r0 = r20[r8]     // Catch:{ Exception -> 0x036a }
            boolean r0 = java.util.Arrays.equals(r5, r0)     // Catch:{ Exception -> 0x036a }
            if (r0 == 0) goto L_0x0108
            goto L_0x010f
        L_0x0108:
            int r8 = r8 + 1
            r0 = 3
            if (r8 < r0) goto L_0x00ff
            goto L_0x035b
        L_0x010f:
            if (r8 != 0) goto L_0x0113
            r7 = 2
            goto L_0x011c
        L_0x0113:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ C1j -> 0x0387 }
            r6.order(r0)     // Catch:{ C1j -> 0x0387 }
            int r7 = r6.getInt()     // Catch:{ C1j -> 0x0387 }
        L_0x011c:
            X.CT0 r6 = r9.A07     // Catch:{ C1j -> 0x0387 }
            X.CSz[] r0 = r6.A05     // Catch:{ C1j -> 0x0387 }
            r19 = r0
            int r15 = r0.length     // Catch:{ C1j -> 0x0387 }
            if (r7 > r15) goto L_0x0353
            X.C25960CpS.A01(r9, r8, r7)     // Catch:{ C1j -> 0x0387 }
            int r18 = r21.position()     // Catch:{ C1j -> 0x0387 }
            r0 = r18
            r1.A03(r0)     // Catch:{ IOException -> 0x0348 }
            java.nio.ByteBuffer r13 = r21.asReadOnlyBuffer()     // Catch:{ C1j -> 0x0387 }
            r13.flip()     // Catch:{ C1j -> 0x0387 }
            if (r8 < 0) goto L_0x033d
            r0 = r20[r8]     // Catch:{ C1j -> 0x0387 }
            int r0 = r0.length     // Catch:{ C1j -> 0x0387 }
            byte[] r0 = new byte[r0]     // Catch:{ C1j -> 0x0387 }
            r9.A03 = r0     // Catch:{ C1j -> 0x0387 }
            r13.get(r0)     // Catch:{ C1j -> 0x0387 }
            if (r8 != 0) goto L_0x0148
            r12 = 2
            goto L_0x0151
        L_0x0148:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ C1j -> 0x0387 }
            r13.order(r0)     // Catch:{ C1j -> 0x0387 }
            int r12 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
        L_0x0151:
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r9.A01 = r0     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r9.A00 = r0     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r6.A01 = r0     // Catch:{ C1j -> 0x0387 }
            r10 = 0
            if (r0 < r12) goto L_0x0173
            r6.A01 = r10     // Catch:{ C1j -> 0x0387 }
        L_0x0173:
            if (r8 < r4) goto L_0x0197
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r6.A00 = r0     // Catch:{ C1j -> 0x0387 }
            byte r0 = r13.get()     // Catch:{ C1j -> 0x0387 }
            boolean r0 = X.BE8.A1T(r0)
            r6.A04 = r0     // Catch:{ C1j -> 0x0387 }
            long r0 = X.C25960CpS.A00(r13)     // Catch:{ C1j -> 0x0387 }
            r6.A03 = r0     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r6.A02 = r0     // Catch:{ C1j -> 0x0387 }
        L_0x0197:
            if (r10 >= r12) goto L_0x01ee
            if (r10 >= r15) goto L_0x01cb
            r5 = r19[r10]     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r5.A01 = r0     // Catch:{ C1j -> 0x0387 }
            long r16 = X.C25960CpS.A00(r13)     // Catch:{ C1j -> 0x0387 }
            r0 = r16
            r5.A04 = r0     // Catch:{ C1j -> 0x0387 }
            if (r8 < r4) goto L_0x01c2
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r5.A02 = r0     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            int r0 = r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r5.A00 = r0     // Catch:{ C1j -> 0x0387 }
        L_0x01c2:
            long r16 = X.C25960CpS.A00(r13)     // Catch:{ C1j -> 0x0387 }
            r0 = r16
            r5.A03 = r0     // Catch:{ C1j -> 0x0387 }
            goto L_0x01eb
        L_0x01cb:
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            r13.getInt()     // Catch:{ C1j -> 0x0387 }
            if (r8 < r4) goto L_0x01e5
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            r13.getInt()     // Catch:{ C1j -> 0x0387 }
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            r13.getInt()     // Catch:{ C1j -> 0x0387 }
        L_0x01e5:
            r13.order(r11)     // Catch:{ C1j -> 0x0387 }
            r13.getInt()     // Catch:{ C1j -> 0x0387 }
        L_0x01eb:
            int r10 = r10 + 1
            goto L_0x0197
        L_0x01ee:
            long r0 = X.C25960CpS.A00(r13)     // Catch:{ C1j -> 0x0387 }
            r9.A02 = r0     // Catch:{ C1j -> 0x0387 }
            int r10 = r18 + -4
            r5 = 0
            int r0 = r21.position()     // Catch:{ C1j -> 0x0387 }
            if (r10 > r0) goto L_0x0380
            java.util.zip.Adler32 r1 = new java.util.zip.Adler32     // Catch:{ C1j -> 0x0387 }
            r1.<init>()     // Catch:{ C1j -> 0x0387 }
            byte[] r0 = r21.array()     // Catch:{ C1j -> 0x0387 }
            r1.update(r0, r5, r10)     // Catch:{ C1j -> 0x0387 }
            long r11 = r1.getValue()     // Catch:{ C1j -> 0x0387 }
            long r0 = r9.A02     // Catch:{ C1j -> 0x0387 }
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x032a
            byte[] r1 = r9.A03     // Catch:{ C1j -> 0x031d }
            r0 = r20[r8]     // Catch:{ C1j -> 0x031d }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ C1j -> 0x031d }
            if (r0 == 0) goto L_0x030d
            int r11 = r9.A01     // Catch:{ C1j -> 0x031d }
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 != r0) goto L_0x0305
            int r10 = r9.A00     // Catch:{ C1j -> 0x031d }
            int r0 = r9.A04     // Catch:{ C1j -> 0x031d }
            if (r0 == 0) goto L_0x022a
            goto L_0x022d
        L_0x022a:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0231
        L_0x022d:
            if (r0 != r14) goto L_0x0234
            r1 = 16384(0x4000, float:2.2959E-41)
        L_0x0231:
            if (r10 != r1) goto L_0x02fd
            goto L_0x023c
        L_0x0234:
            boolean r0 = r9.A09     // Catch:{ C1j -> 0x031d }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0231
            goto L_0x022a
        L_0x023c:
            int r1 = r6.A01     // Catch:{ C1j -> 0x031d }
            if (r1 < 0) goto L_0x02f5
            int r0 = r9.A05     // Catch:{ C1j -> 0x031d }
            if (r1 >= r0) goto L_0x02f5
            r12 = 0
        L_0x0245:
            if (r12 >= r15) goto L_0x0250
            r0 = r19[r12]     // Catch:{ C1j -> 0x031d }
            int r0 = r0.A01     // Catch:{ C1j -> 0x031d }
            if (r0 > r10) goto L_0x0315
            int r12 = r12 + 1
            goto L_0x0245
        L_0x0250:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = "wambuffer/header/init: header="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            r9.append(r8)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " bufferCount="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            r9.append(r7)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " maxMetadataSize="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            r9.append(r11)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " maxEventBufferSize="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            r9.append(r10)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " currentEventBufferIndex="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            r9.append(r1)     // Catch:{ C1j -> 0x0387 }
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            r9.append(r1)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " currentBufferSequenceNumber="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            int r0 = r6.A00     // Catch:{ C1j -> 0x0387 }
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " isEventBeaconingEnabled="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            boolean r0 = r6.A04     // Catch:{ C1j -> 0x0387 }
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " dayOfLastBeaconingDecision="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            long r0 = r6.A03     // Catch:{ C1j -> 0x0387 }
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " currentEventSequenceNumber="
            r9.append(r0)     // Catch:{ C1j -> 0x0387 }
            int r0 = r6.A02     // Catch:{ C1j -> 0x0387 }
            X.C17900vP.A0o(r9, r0)     // Catch:{ C1j -> 0x0387 }
        L_0x02aa:
            if (r5 >= r15) goto L_0x02ef
            r7 = r19[r5]     // Catch:{ C1j -> 0x0387 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = "wambuffer/header/init/eventBufferMetadata/"
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            r6.append(r5)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = ": size="
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            int r0 = r7.A01     // Catch:{ C1j -> 0x0387 }
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " timestamp="
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            long r0 = r7.A04     // Catch:{ C1j -> 0x0387 }
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " streamId="
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            int r0 = r7.A02     // Catch:{ C1j -> 0x0387 }
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " bufferSequenceNumber="
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            int r0 = r7.A00     // Catch:{ C1j -> 0x0387 }
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = " checksum="
            r6.append(r0)     // Catch:{ C1j -> 0x0387 }
            long r0 = r7.A03     // Catch:{ C1j -> 0x0387 }
            X.C17890vO.A16(r6, r0)     // Catch:{ C1j -> 0x0387 }
            int r5 = r5 + 1
            goto L_0x02aa
        L_0x02ef:
            X.CcQ r0 = r3.A04     // Catch:{ C1k -> 0x0392 }
            r0.A02()     // Catch:{ C1k -> 0x0392 }
            return
        L_0x02f5:
            java.lang.String r0 = "Invalid current event buffer"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x031d }
            r1.<init>(r0)     // Catch:{ C1j -> 0x031d }
            goto L_0x031c
        L_0x02fd:
            java.lang.String r0 = "Invalid max event buffer size"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x031d }
            r1.<init>(r0)     // Catch:{ C1j -> 0x031d }
            goto L_0x031c
        L_0x0305:
            java.lang.String r0 = "Invalid max metadata size"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x031d }
            r1.<init>(r0)     // Catch:{ C1j -> 0x031d }
            goto L_0x031c
        L_0x030d:
            java.lang.String r0 = "Invalid WAM file magic or version"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x031d }
            r1.<init>(r0)     // Catch:{ C1j -> 0x031d }
            goto L_0x031c
        L_0x0315:
            java.lang.String r0 = "Invalid event buffer size"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x031d }
            r1.<init>(r0)     // Catch:{ C1j -> 0x031d }
        L_0x031c:
            throw r1     // Catch:{ C1j -> 0x031d }
        L_0x031d:
            r5 = move-exception
            X.185 r1 = r9.A08     // Catch:{ C1j -> 0x0387 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ C1j -> 0x0387 }
            r1.A08 = r0     // Catch:{ C1j -> 0x0387 }
            r1.A0d()     // Catch:{ C1j -> 0x0387 }
            throw r5     // Catch:{ C1j -> 0x0387 }
        L_0x032a:
            X.185 r1 = r9.A08     // Catch:{ C1j -> 0x0387 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch:{ C1j -> 0x0387 }
            r1.A0A = r0     // Catch:{ C1j -> 0x0387 }
            r1.A0d()     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = "Invalid checksum"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x0387 }
            r1.<init>(r0)     // Catch:{ C1j -> 0x0387 }
            goto L_0x0386
        L_0x033d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C1j -> 0x0387 }
            java.lang.String r0 = "Invalid version: "
            java.lang.RuntimeException r0 = X.BEA.A0h(r0, r1, r8)     // Catch:{ C1j -> 0x0387 }
            throw r0     // Catch:{ C1j -> 0x0387 }
        L_0x0348:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ C1j -> 0x0387 }
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x0387 }
            r1.<init>(r0)     // Catch:{ C1j -> 0x0387 }
            goto L_0x0386
        L_0x0353:
            java.lang.String r0 = "Event buffer downgrade not allowed"
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x0387 }
            r1.<init>(r0)     // Catch:{ C1j -> 0x0387 }
            goto L_0x0386
        L_0x035b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x036a }
            java.lang.String r0 = "Invalid value: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)     // Catch:{ Exception -> 0x036a }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ Exception -> 0x036a }
            throw r0     // Catch:{ Exception -> 0x036a }
        L_0x036a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ C1j -> 0x0387 }
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x0387 }
            r1.<init>(r0)     // Catch:{ C1j -> 0x0387 }
            goto L_0x0386
        L_0x0375:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ C1j -> 0x0387 }
            X.C1j r1 = new X.C1j     // Catch:{ C1j -> 0x0387 }
            r1.<init>(r0)     // Catch:{ C1j -> 0x0387 }
            goto L_0x0386
        L_0x0380:
            java.lang.String r0 = "Given range contains invalid bytes"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass000.A0k(r0)     // Catch:{ C1j -> 0x0387 }
        L_0x0386:
            throw r1     // Catch:{ C1j -> 0x0387 }
        L_0x0387:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ C1k -> 0x0392 }
            X.C1k r0 = new X.C1k     // Catch:{ C1k -> 0x0392 }
            r0.<init>(r1)     // Catch:{ C1k -> 0x0392 }
            throw r0     // Catch:{ C1k -> 0x0392 }
        L_0x0392:
            r6 = move-exception
            int r0 = r3.A03     // Catch:{ C1k -> 0x04a4 }
            if (r0 == 0) goto L_0x03d7
            if (r0 == r14) goto L_0x03b9
            if (r0 != r4) goto L_0x03f5
            X.185 r5 = r3.A07     // Catch:{ C1k -> 0x04a4 }
            java.lang.Long r1 = r5.A0S     // Catch:{ C1k -> 0x04a4 }
            monitor-enter(r5)     // Catch:{ C1k -> 0x04a4 }
            if (r1 == 0) goto L_0x03f4
            java.lang.Long r0 = r5.A0L     // Catch:{ all -> 0x04a1 }
            if (r0 != 0) goto L_0x03a9
            r7 = 0
            goto L_0x03ad
        L_0x03a9:
            long r7 = r0.longValue()     // Catch:{ all -> 0x04a1 }
        L_0x03ad:
            long r0 = r1.longValue()     // Catch:{ all -> 0x04a1 }
            long r7 = r7 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04a1 }
            r5.A0L = r0     // Catch:{ all -> 0x04a1 }
            goto L_0x03f4
        L_0x03b9:
            X.185 r5 = r3.A07     // Catch:{ C1k -> 0x04a4 }
            java.lang.Long r1 = r5.A0T     // Catch:{ C1k -> 0x04a4 }
            monitor-enter(r5)     // Catch:{ C1k -> 0x04a4 }
            if (r1 == 0) goto L_0x03f4
            java.lang.Long r0 = r5.A0P     // Catch:{ all -> 0x04a1 }
            if (r0 != 0) goto L_0x03c7
            r7 = 0
            goto L_0x03cb
        L_0x03c7:
            long r7 = r0.longValue()     // Catch:{ all -> 0x04a1 }
        L_0x03cb:
            long r0 = r1.longValue()     // Catch:{ all -> 0x04a1 }
            long r7 = r7 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04a1 }
            r5.A0P = r0     // Catch:{ all -> 0x04a1 }
            goto L_0x03f4
        L_0x03d7:
            X.185 r5 = r3.A07     // Catch:{ C1k -> 0x04a4 }
            java.lang.Long r1 = r5.A0R     // Catch:{ C1k -> 0x04a4 }
            monitor-enter(r5)     // Catch:{ C1k -> 0x04a4 }
            if (r1 == 0) goto L_0x03f4
            java.lang.Long r0 = r5.A0J     // Catch:{ all -> 0x04a1 }
            if (r0 != 0) goto L_0x03e5
            r7 = 0
            goto L_0x03e9
        L_0x03e5:
            long r7 = r0.longValue()     // Catch:{ all -> 0x04a1 }
        L_0x03e9:
            long r0 = r1.longValue()     // Catch:{ all -> 0x04a1 }
            long r7 = r7 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x04a1 }
            r5.A0J = r0     // Catch:{ all -> 0x04a1 }
        L_0x03f4:
            monitor-exit(r5)     // Catch:{ C1k -> 0x04a4 }
        L_0x03f5:
            X.185 r0 = r3.A07     // Catch:{ C1k -> 0x04a4 }
            r0.A0d()     // Catch:{ C1k -> 0x04a4 }
            X.CcQ r0 = r3.A04     // Catch:{ C1k -> 0x04a4 }
            r0.A03()     // Catch:{ C1k -> 0x04a4 }
            X.CT0 r7 = r3.A06     // Catch:{ C1k -> 0x04a4 }
            r5 = 0
            r7.A01 = r5     // Catch:{ C1k -> 0x04a4 }
            r7.A00 = r5     // Catch:{ C1k -> 0x04a4 }
            r7.A04 = r5     // Catch:{ C1k -> 0x04a4 }
            r0 = 0
            r7.A03 = r0     // Catch:{ C1k -> 0x04a4 }
            r7.A02 = r5     // Catch:{ C1k -> 0x04a4 }
            X.CcQ r8 = r3.A04     // Catch:{ C1k -> 0x04a4 }
            X.CcL r5 = r8.A00     // Catch:{ C1k -> 0x04a4 }
            if (r5 == 0) goto L_0x041f
            r5.A01()     // Catch:{ C1k -> 0x04a4 }
            long[] r7 = r8.A04     // Catch:{ C1k -> 0x04a4 }
            X.CT0 r5 = r8.A02     // Catch:{ C1k -> 0x04a4 }
            int r5 = r5.A01     // Catch:{ C1k -> 0x04a4 }
            r7[r5] = r0     // Catch:{ C1k -> 0x04a4 }
        L_0x041f:
            X.CpS r7 = r3.A05     // Catch:{ C1k -> 0x04a4 }
            byte[][] r0 = X.CGG.A00     // Catch:{ C1k -> 0x04a4 }
            r0 = r0[r4]     // Catch:{ C1k -> 0x04a4 }
            r7.A03 = r0     // Catch:{ C1k -> 0x04a4 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r7.A01 = r0     // Catch:{ C1k -> 0x04a4 }
            r0 = 0
            r7.A02 = r0     // Catch:{ C1k -> 0x04a4 }
            X.Cqx r5 = r7.A06     // Catch:{ C1k -> 0x04a4 }
            java.nio.ByteBuffer r0 = r5.A02     // Catch:{ C1k -> 0x04a4 }
            r0.clear()     // Catch:{ C1k -> 0x04a4 }
            r1 = 0
            r5.A01 = r1     // Catch:{ C1k -> 0x04a4 }
            java.util.zip.Checksum r0 = r5.A03     // Catch:{ C1k -> 0x04a4 }
            r0.reset()     // Catch:{ C1k -> 0x04a4 }
            r5.A00 = r1     // Catch:{ C1k -> 0x04a4 }
            int r0 = r7.A04     // Catch:{ C1k -> 0x04a4 }
            if (r0 == 0) goto L_0x0450
            if (r0 != r14) goto L_0x0449
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x045e
        L_0x0449:
            boolean r0 = r7.A09     // Catch:{ C1k -> 0x04a4 }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x045e
        L_0x0450:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x045e
        L_0x0453:
            r15.A03()     // Catch:{ C1k -> 0x04a4 }
            java.lang.String r0 = "wambuffer/wambuffer: no WAM file found; creating a new one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ C1k -> 0x04a4 }
            if (r2 != 0) goto L_0x047c
            return
        L_0x045e:
            r7.A00 = r1     // Catch:{ C1k -> 0x04a4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ C1k -> 0x04a4 }
            java.lang.String r0 = "wambuffer/wambuffer: error while opening WAM file ("
            r1.append(r0)     // Catch:{ C1k -> 0x04a4 }
            r1.append(r6)     // Catch:{ C1k -> 0x04a4 }
            java.lang.String r0 = ")"
            X.C17890vO.A19(r1, r0)     // Catch:{ C1k -> 0x04a4 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)     // Catch:{ C1k -> 0x04a4 }
            r0 = r25
            r0.A0F = r1     // Catch:{ C1k -> 0x04a4 }
            r25.A0d()     // Catch:{ C1k -> 0x04a4 }
        L_0x047c:
            r0 = r23
            r3.A00(r2, r0)     // Catch:{ C1k -> 0x04a4 }
            X.CpS r1 = r3.A05     // Catch:{ IOException -> 0x0496 }
            X.CT0 r0 = r1.A07     // Catch:{ IOException -> 0x0496 }
            X.CSz[] r0 = r0.A05     // Catch:{ IOException -> 0x0496 }
            int r0 = r0.length     // Catch:{ IOException -> 0x0496 }
            X.C25960CpS.A01(r1, r4, r0)     // Catch:{ IOException -> 0x0496 }
            X.Cqx r0 = r1.A06     // Catch:{ IOException -> 0x0496 }
            r0.A02()     // Catch:{ IOException -> 0x0496 }
            java.lang.String r0 = "wambuffer/initnewfile: successfully created new WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ C1k -> 0x04a4 }
            return
        L_0x0496:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ C1k -> 0x04a4 }
            X.C1k r1 = new X.C1k     // Catch:{ C1k -> 0x04a4 }
            r1.<init>(r0)     // Catch:{ C1k -> 0x04a4 }
            goto L_0x04a3
        L_0x04a1:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ C1k -> 0x04a4 }
        L_0x04a3:
            throw r1     // Catch:{ C1k -> 0x04a4 }
        L_0x04a4:
            r1 = move-exception
            java.lang.String r0 = "wambuffer/wambuffer: failed to initialize with new file"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r3.A01 = r0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r14)
            r0 = r25
            r0.A03 = r2
            r25.A0d()
            java.io.RandomAccessFile r0 = r3.A09
            if (r0 == 0) goto L_0x04d2
            r0.close()     // Catch:{ IOException -> 0x04c5 }
            goto L_0x04d2
        L_0x04c5:
            r1 = move-exception
            X.185 r0 = r3.A07
            r0.A04 = r2
            r0.A0d()
            java.lang.String r0 = "wambuffer/closefile: cannot close WAM file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04d2:
            java.io.File r0 = r3.A08
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x04e0
            java.lang.String r0 = "wambuffer/removefile: successfully removed WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04e0:
            X.185 r0 = r3.A07
            r0.A0C = r2
            r0.A0d()
            java.lang.String r0 = "wambuffer/removefile: cannot remove WAM file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25847Cn3.<init>(X.11N, X.0z4, X.0ve, X.182, X.185, java.io.File, int, int, int, boolean):void");
    }
}
