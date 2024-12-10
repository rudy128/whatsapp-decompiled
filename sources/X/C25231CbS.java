package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.CbS  reason: case insensitive filesystem */
public class C25231CbS {
    public int A00 = 0;
    public String A01;
    public byte[] A02 = null;
    public final C19830z4 A03;
    public final AnonymousClass185 A04;
    public final Map A05;
    public final boolean[] A06;
    public final AnonymousClass182 A07;

    /* JADX WARNING: type inference failed for: r0v27, types: [X.C5T, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(byte[] r15, int r16, java.lang.String r17) {
        /*
            r14 = this;
            r4 = 0
            java.util.Map r7 = r14.A05
            r5 = r17
            java.lang.Object r8 = r7.get(r5)
            X.Cq4 r8 = (X.C25989Cq4) r8
            if (r8 != 0) goto L_0x00f9
            r3 = 0
        L_0x000e:
            boolean[] r6 = r14.A06
            boolean r0 = r6[r3]
            if (r0 != 0) goto L_0x00ef
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = r14.A01     // Catch:{ Exception -> 0x00d6 }
            r1.append(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = "wampsid"
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ Exception -> 0x00d6 }
            java.io.File r2 = X.C108945cZ.A17(r0)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00d6 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00d6 }
            X.Cq4 r2 = new X.Cq4     // Catch:{ Exception -> 0x00d6 }
            X.185 r0 = r14.A04     // Catch:{ Exception -> 0x00d6 }
            r2.<init>(r0, r1, r3)     // Catch:{ Exception -> 0x00d6 }
            X.182 r9 = r14.A07     // Catch:{ Exception -> 0x00d9 }
            android.content.SharedPreferences r1 = X.AnonymousClass182.A01(r9)     // Catch:{ Exception -> 0x00d9 }
            r0 = -1
            int r0 = r1.getInt(r5, r0)     // Catch:{ Exception -> 0x00d9 }
            int r8 = r0 + 1
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r8 <= r0) goto L_0x0048
            r8 = 0
        L_0x0048:
            android.content.SharedPreferences r0 = X.AnonymousClass182.A01(r9)     // Catch:{ Exception -> 0x00d9 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00d9 }
            X.C17880vN.A1C(r0, r5, r8)     // Catch:{ Exception -> 0x00d9 }
            r9 = r5
            int r1 = r5.length()     // Catch:{ Exception -> 0x00d9 }
            r0 = 36
            if (r1 <= r0) goto L_0x0060
            java.lang.String r9 = r5.substring(r4, r0)     // Catch:{ Exception -> 0x00d9 }
        L_0x0060:
            r2.A03 = r9     // Catch:{ Exception -> 0x00d9 }
            r9 = 1
            r2.A01 = r9     // Catch:{ Exception -> 0x00d9 }
            r2.A00 = r4     // Catch:{ Exception -> 0x00d9 }
            java.io.RandomAccessFile r10 = r2.A06     // Catch:{ Exception -> 0x00d9 }
            r0 = 33024(0x8100, double:1.6316E-319)
            r10.setLength(r0)     // Catch:{ Exception -> 0x00d9 }
            byte[] r0 = X.C25989Cq4.A08     // Catch:{ Exception -> 0x00d9 }
            r10.write(r0)     // Catch:{ Exception -> 0x00d9 }
            java.lang.String r1 = r2.A03     // Catch:{ Exception -> 0x00d9 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x00d9 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ Exception -> 0x00d9 }
            r10.write(r0)     // Catch:{ Exception -> 0x00d9 }
            r10.writeByte(r9)     // Catch:{ Exception -> 0x00d9 }
            r10.writeByte(r4)     // Catch:{ Exception -> 0x00d9 }
            r12 = 8
            r10.writeInt(r12)     // Catch:{ Exception -> 0x00d9 }
            r13 = 32768(0x8000, float:4.5918E-41)
            r10.writeInt(r13)     // Catch:{ Exception -> 0x00d9 }
            r10.writeBoolean(r4)     // Catch:{ Exception -> 0x00d9 }
            r0 = 256(0x100, double:1.265E-321)
            r10.seek(r0)     // Catch:{ Exception -> 0x00d9 }
            byte[] r9 = X.C25677Ck8.A06     // Catch:{ Exception -> 0x00d9 }
            r0 = r8 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00d9 }
            r0 = 5
            r9[r0] = r1     // Catch:{ Exception -> 0x00d9 }
            int r0 = r8 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00d9 }
            r0 = 6
            r9[r0] = r1     // Catch:{ Exception -> 0x00d9 }
            r10.write(r9)     // Catch:{ Exception -> 0x00d9 }
            java.util.List r1 = r2.A07     // Catch:{ Exception -> 0x00d9 }
            X.C5T r0 = new X.C5T     // Catch:{ Exception -> 0x00d9 }
            r0.<init>()     // Catch:{ Exception -> 0x00d9 }
            r0.A01 = r12     // Catch:{ Exception -> 0x00d9 }
            r0.A00 = r13     // Catch:{ Exception -> 0x00d9 }
            r0.A02 = r4     // Catch:{ Exception -> 0x00d9 }
            r1.add(r0)     // Catch:{ Exception -> 0x00d9 }
            int r11 = r2.A00     // Catch:{ Exception -> 0x00d9 }
            X.185 r9 = r2.A05     // Catch:{ Exception -> 0x00d9 }
            X.Ck8 r8 = new X.Ck8     // Catch:{ Exception -> 0x00d9 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00d9 }
            r2.A02 = r8     // Catch:{ Exception -> 0x00d9 }
            r0 = 1
            r6[r3] = r0     // Catch:{ Exception -> 0x00d9 }
            int r1 = r14.A00     // Catch:{ Exception -> 0x00d9 }
            if (r1 <= 0) goto L_0x00d2
            byte[] r0 = r14.A02     // Catch:{ Exception -> 0x00d9 }
            r2.A01(r0, r1)     // Catch:{ Exception -> 0x00d9 }
        L_0x00d2:
            r7.put(r5, r2)     // Catch:{ Exception -> 0x00d9 }
            goto L_0x00f8
        L_0x00d6:
            r6 = move-exception
            r2 = r8
            goto L_0x00da
        L_0x00d9:
            r6 = move-exception
        L_0x00da:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "privatestatsuploadqueue/writeToQueueForPsId failed to create new QueueFile "
            X.C17900vP.A0X(r6, r0, r1)
            X.185 r1 = r14.A04
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r1.A0H = r0
            r1.A0d()
            r8 = r2
        L_0x00ef:
            int r3 = r3 + 1
            r0 = 8
            if (r3 < r0) goto L_0x000e
            if (r8 != 0) goto L_0x00f9
            return r4
        L_0x00f8:
            r8 = r2
        L_0x00f9:
            r0 = r16
            boolean r0 = r8.A01(r15, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25231CbS.A02(byte[], int, java.lang.String):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.C5T, java.lang.Object] */
    public void A00(String str) {
        this.A01 = str;
        int i = 0;
        do {
            boolean[] zArr = this.A06;
            zArr[i] = false;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(this.A01);
            File A17 = C108945cZ.A17(AnonymousClass001.A1I("wampsid", A10, i));
            if (A17.exists()) {
                RandomAccessFile randomAccessFile = null;
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A17, "rwd");
                    try {
                        C25989Cq4 cq4 = new C25989Cq4(this.A04, randomAccessFile2, i);
                        RandomAccessFile randomAccessFile3 = cq4.A06;
                        randomAccessFile3.seek(0);
                        byte[] bArr = C25989Cq4.A08;
                        byte[] bArr2 = new byte[8];
                        randomAccessFile3.read(bArr2);
                        if (Arrays.equals(bArr2, bArr)) {
                            randomAccessFile3.seek(8);
                            byte[] bArr3 = new byte[36];
                            randomAccessFile3.read(bArr3);
                            cq4.A03 = BE6.A0q(StandardCharsets.UTF_8, bArr3);
                            cq4.A01 = randomAccessFile3.read();
                            cq4.A00 = randomAccessFile3.read();
                            List list = cq4.A07;
                            list.clear();
                            boolean z = false;
                            for (int i2 = 0; i2 < cq4.A01; i2++) {
                                int readInt = randomAccessFile3.readInt();
                                int readInt2 = randomAccessFile3.readInt();
                                boolean readBoolean = randomAccessFile3.readBoolean();
                                if (readBoolean && readInt <= 8) {
                                    Log.e("queuefile/loadFromFile see locked empty mini event buffer");
                                    z = true;
                                    readBoolean = false;
                                }
                                ? obj = new Object();
                                obj.A01 = readInt;
                                obj.A00 = readInt2;
                                obj.A02 = readBoolean;
                                list.add(obj);
                            }
                            int i3 = BE8.A0S(cq4, list).A01;
                            int i4 = BE8.A0S(cq4, list).A00;
                            int i5 = cq4.A00;
                            cq4.A02 = new C25677Ck8(cq4.A05, randomAccessFile3, i5, i3, i4);
                            if (z) {
                                C25989Cq4.A00(cq4);
                            }
                            this.A05.put(cq4.A03, cq4);
                            zArr[i] = true;
                        } else {
                            Log.e("privatestatsuploadqueue/initfromqueuefile invalid queue file");
                            try {
                                randomAccessFile2.close();
                                A17.delete();
                                return;
                            } catch (IOException | SecurityException e) {
                                C17900vP.A0X(e, "privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file ", AnonymousClass000.A10());
                                return;
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    C17900vP.A0X(e, "privatestatsuploadqueue/initfromqueuefile failed to load the queue file ", AnonymousClass000.A10());
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException | SecurityException e4) {
                            C17900vP.A0X(e4, "privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file ", AnonymousClass000.A10());
                        }
                    }
                    i++;
                    if (i >= 8) {
                    }
                }
            }
            i++;
        } while (i >= 8);
    }

    public boolean A01() {
        Iterator A15 = AnonymousClass000.A15(this.A05);
        while (A15.hasNext()) {
            C25989Cq4 cq4 = (C25989Cq4) C17890vO.A0P(A15);
            int i = 0;
            while (true) {
                if (i < cq4.A01) {
                    if (((C5T) cq4.A07.get(i)).A01 > 8) {
                        return true;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public C25231CbS(C19830z4 r5, AnonymousClass182 r6, AnonymousClass185 r7) {
        this.A04 = r7;
        this.A07 = r6;
        this.A03 = r5;
        this.A05 = C17880vN.A11();
        boolean[] zArr = new boolean[8];
        this.A06 = zArr;
        int i = 0;
        do {
            zArr[i] = false;
            i++;
        } while (i < 8);
        this.A01 = "";
    }
}
