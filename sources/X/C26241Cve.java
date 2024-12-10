package X;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.Cve  reason: case insensitive filesystem */
public class C26241Cve {
    public boolean A00 = false;
    public byte[] A01;
    public C25005CTf[] A02;
    public final AssetManager A03;
    public final E7B A04;
    public final File A05;
    public final String A06;
    public final byte[] A07;
    public final Executor A08;

    public static int A00(InputStream inputStream) {
        return (int) A01(inputStream, 2);
    }

    public static void A03(C26241Cve cve, Object obj, int i) {
        cve.A08.execute(new C21470Akb((Object) cve, i, 2, obj));
    }

    public static byte[] A04(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw AnonymousClass8BX.A0W("Not enough bytes to read: ", AnonymousClass000.A10(), i);
            }
        }
        return bArr;
    }

    public static byte[] A05(InputStream inputStream, int i, int i2) {
        IllegalStateException illegalStateException;
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = inputStream.read(bArr2);
                if (read < 0) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                    A10.append(i);
                    illegalStateException = AnonymousClass000.A0o(" bytes", A10);
                    break;
                }
                inflater.setInput(bArr2, 0, read);
                i4 += inflater.inflate(bArr, i4, i2 - i4);
                i3 += read;
            }
            if (i3 != i) {
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Didn't read enough bytes during decompression. expected=");
                A102.append(i);
                illegalStateException = AnonymousClass8BX.A0W(" actual=", A102, i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                illegalStateException = AnonymousClass000.A0n("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            illegalStateException = AnonymousClass000.A0n(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
        throw illegalStateException;
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x01d1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01db A[SYNTHETIC, Splitter:B:118:0x01db] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C26241Cve A06() {
        /*
            r28 = this;
            r8 = r28
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x038e
            byte[] r0 = r8.A07
            r17 = r0
            if (r0 == 0) goto L_0x038d
            android.content.res.AssetManager r14 = r8.A03
            java.lang.String r0 = "dexopt/baseline.prof"
            java.io.FileInputStream r7 = r8.A02(r14, r0)     // Catch:{ FileNotFoundException -> 0x01ab, IOException -> 0x01a6 }
            if (r7 == 0) goto L_0x01ba
            r6 = 7
            byte[] r1 = X.C26174Ctr.A00     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            r0 = 4
            byte[] r0 = A04(r7, r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            if (r0 == 0) goto L_0x0179
            r4 = 4
            byte[] r1 = A04(r7, r4)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            java.lang.String r0 = r8.A06     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            r16 = r0
            byte[] r0 = X.CIF.A05     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            if (r0 == 0) goto L_0x0176
            r0 = 1
            long r0 = A01(r7, r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            int r5 = (int) r0     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            long r2 = A01(r7, r4)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            long r0 = A01(r7, r4)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            int r4 = (int) r0     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            int r0 = (int) r2     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            byte[] r1 = A05(r7, r4, r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            int r0 = r7.read()     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            if (r0 > 0) goto L_0x0180
            java.io.ByteArrayInputStream r4 = X.BE6.A0h(r1)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            int r0 = r4.available()     // Catch:{ all -> 0x016c }
            r3 = 0
            if (r0 != 0) goto L_0x005e
            X.CTf[] r2 = new X.C25005CTf[r3]     // Catch:{ all -> 0x016c }
            goto L_0x015e
        L_0x005e:
            X.CTf[] r2 = new X.C25005CTf[r5]     // Catch:{ all -> 0x016c }
            r9 = 0
        L_0x0061:
            if (r9 >= r5) goto L_0x009f
            int r12 = A00(r4)     // Catch:{ all -> 0x016c }
            int r15 = A00(r4)     // Catch:{ all -> 0x016c }
            r0 = 4
            long r10 = A01(r4, r0)     // Catch:{ all -> 0x016c }
            long r26 = A01(r4, r0)     // Catch:{ all -> 0x016c }
            long r0 = A01(r4, r0)     // Catch:{ all -> 0x016c }
            byte[] r13 = A04(r4, r12)     // Catch:{ all -> 0x016c }
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x016c }
            java.lang.String r20 = X.BE6.A0q(r12, r13)     // Catch:{ all -> 0x016c }
            int r12 = (int) r10     // Catch:{ all -> 0x016c }
            int r10 = (int) r0     // Catch:{ all -> 0x016c }
            int[] r0 = new int[r15]     // Catch:{ all -> 0x016c }
            java.util.TreeMap r21 = new java.util.TreeMap     // Catch:{ all -> 0x016c }
            r21.<init>()     // Catch:{ all -> 0x016c }
            X.CTf r18 = new X.CTf     // Catch:{ all -> 0x016c }
            r19 = r16
            r22 = r0
            r23 = r15
            r24 = r12
            r25 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x016c }
            r2[r9] = r18     // Catch:{ all -> 0x016c }
            int r9 = r9 + 1
            goto L_0x0061
        L_0x009f:
            if (r3 >= r5) goto L_0x015e
            r10 = r2[r3]     // Catch:{ all -> 0x016c }
            int r9 = r4.available()     // Catch:{ all -> 0x016c }
            int r0 = r10.A03     // Catch:{ all -> 0x016c }
            int r9 = r9 - r0
            r15 = 0
        L_0x00ab:
            int r0 = r4.available()     // Catch:{ all -> 0x016c }
            if (r0 <= r9) goto L_0x00ef
            int r0 = A00(r4)     // Catch:{ all -> 0x016c }
            int r15 = r15 + r0
            java.util.TreeMap r11 = r10.A08     // Catch:{ all -> 0x016c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x016c }
            r0 = 1
            X.C17890vO.A0z(r1, r11, r0)     // Catch:{ all -> 0x016c }
            int r13 = A00(r4)     // Catch:{ all -> 0x016c }
        L_0x00c4:
            if (r13 <= 0) goto L_0x00ab
            r0 = 2
            A01(r4, r0)     // Catch:{ all -> 0x016c }
            r0 = 1
            long r0 = A01(r4, r0)     // Catch:{ all -> 0x016c }
            int r11 = (int) r0     // Catch:{ all -> 0x016c }
            r0 = 6
            if (r11 == r0) goto L_0x00d5
            if (r11 != r6) goto L_0x00d8
        L_0x00d5:
            int r13 = r13 + -1
            goto L_0x00c4
        L_0x00d8:
            if (r11 <= 0) goto L_0x00d5
            r0 = 1
            A04(r4, r0)     // Catch:{ all -> 0x016c }
            long r0 = A01(r4, r0)     // Catch:{ all -> 0x016c }
            int r12 = (int) r0     // Catch:{ all -> 0x016c }
        L_0x00e3:
            if (r12 <= 0) goto L_0x00ec
            r0 = 2
            A01(r4, r0)     // Catch:{ all -> 0x016c }
            int r12 = r12 + -1
            goto L_0x00e3
        L_0x00ec:
            int r11 = r11 + -1
            goto L_0x00d8
        L_0x00ef:
            int r0 = r4.available()     // Catch:{ all -> 0x016c }
            if (r0 != r9) goto L_0x0157
            int r12 = r10.A00     // Catch:{ all -> 0x016c }
            int[] r11 = new int[r12]     // Catch:{ all -> 0x016c }
            r9 = 0
            r1 = 0
        L_0x00fb:
            if (r9 >= r12) goto L_0x0107
            int r0 = A00(r4)     // Catch:{ all -> 0x016c }
            int r1 = r1 + r0
            r11[r9] = r1     // Catch:{ all -> 0x016c }
            int r9 = r9 + 1
            goto L_0x00fb
        L_0x0107:
            r10.A02 = r11     // Catch:{ all -> 0x016c }
            int r15 = r10.A04     // Catch:{ all -> 0x016c }
            int r0 = r15 * 2
            int r0 = r0 + 8
            int r0 = r0 + -1
            r0 = r0 & -8
            int r0 = r0 / 8
            byte[] r0 = A04(r4, r0)     // Catch:{ all -> 0x016c }
            java.util.BitSet r13 = java.util.BitSet.valueOf(r0)     // Catch:{ all -> 0x016c }
            r16 = 0
            r12 = 0
        L_0x0120:
            if (r12 >= r15) goto L_0x0153
            boolean r0 = r13.get(r12)     // Catch:{ all -> 0x016c }
            int r11 = X.AnonymousClass8BU.A00(r0)
            int r0 = r12 + r15
            boolean r0 = r13.get(r0)     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0134
            r11 = r11 | 4
        L_0x0134:
            if (r11 == 0) goto L_0x0150
            java.util.TreeMap r9 = r10.A08     // Catch:{ all -> 0x016c }
            java.lang.Object r0 = X.AnonymousClass8BT.A0r(r9, r12)     // Catch:{ all -> 0x016c }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x0144
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x016c }
        L_0x0144:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x016c }
            int r0 = r0.intValue()     // Catch:{ all -> 0x016c }
            r11 = r11 | r0
            X.C17890vO.A0z(r1, r9, r11)     // Catch:{ all -> 0x016c }
        L_0x0150:
            int r12 = r12 + 1
            goto L_0x0120
        L_0x0153:
            int r3 = r3 + 1
            goto L_0x009f
        L_0x0157:
            java.lang.String r0 = "Read too much data during profile line parse"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x016c }
            throw r0     // Catch:{ all -> 0x016c }
        L_0x015e:
            r4.close()     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            r7.close()     // Catch:{ IOException -> 0x0165 }
            goto L_0x01b8
        L_0x0165:
            r1 = move-exception
            X.E7B r0 = r8.A04
            r0.C3v(r6, r1)
            goto L_0x01b8
        L_0x016c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x0171:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
        L_0x0175:
            throw r1     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
        L_0x0176:
            java.lang.String r0 = "Unsupported version"
            goto L_0x0182
        L_0x0179:
            java.lang.String r0 = "Invalid magic"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
            goto L_0x0186
        L_0x0180:
            java.lang.String r0 = "Content found after the end of file"
        L_0x0182:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
        L_0x0186:
            throw r0     // Catch:{ IOException -> 0x0190, IllegalStateException -> 0x0187 }
        L_0x0187:
            r2 = move-exception
            X.E7B r1 = r8.A04     // Catch:{ all -> 0x019a }
            r0 = 8
            r1.C3v(r0, r2)     // Catch:{ all -> 0x019a }
            goto L_0x0196
        L_0x0190:
            r0 = move-exception
            X.E7B r1 = r8.A04     // Catch:{ all -> 0x019a }
            r1.C3v(r6, r0)     // Catch:{ all -> 0x019a }
        L_0x0196:
            r7.close()     // Catch:{ IOException -> 0x01b3 }
            goto L_0x01b7
        L_0x019a:
            r2 = move-exception
            r7.close()     // Catch:{ IOException -> 0x019f }
            throw r2
        L_0x019f:
            r1 = move-exception
            X.E7B r0 = r8.A04
            r0.C3v(r6, r1)
            throw r2
        L_0x01a6:
            r2 = move-exception
            X.E7B r1 = r8.A04
            r0 = 7
            goto L_0x01af
        L_0x01ab:
            r2 = move-exception
            X.E7B r1 = r8.A04
            r0 = 6
        L_0x01af:
            r1.C3v(r0, r2)
            goto L_0x01ba
        L_0x01b3:
            r0 = move-exception
            r1.C3v(r6, r0)
        L_0x01b7:
            r2 = 0
        L_0x01b8:
            r8.A02 = r2
        L_0x01ba:
            X.CTf[] r6 = r8.A02
            if (r6 == 0) goto L_0x038d
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r2 < r1) goto L_0x038d
            r0 = 33
            if (r2 > r0) goto L_0x038d
            if (r2 == r1) goto L_0x01d2
            r0 = 25
            if (r2 == r0) goto L_0x01d2
            switch(r2) {
                case 31: goto L_0x01d2;
                case 32: goto L_0x01d2;
                case 33: goto L_0x01d2;
                default: goto L_0x01d1;
            }
        L_0x01d1:
            return r28
        L_0x01d2:
            r3 = 0
            java.lang.String r0 = "dexopt/baseline.profm"
            java.io.FileInputStream r2 = r8.A02(r14, r0)     // Catch:{ FileNotFoundException -> 0x0380, IOException -> 0x0386, IllegalStateException -> 0x0378 }
            if (r2 == 0) goto L_0x038d
            byte[] r1 = X.C26174Ctr.A01     // Catch:{ all -> 0x036e }
            r0 = 4
            byte[] r0 = A04(r2, r0)     // Catch:{ all -> 0x036e }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0360
            r9 = 4
            byte[] r5 = A04(r2, r9)     // Catch:{ all -> 0x036e }
            byte[] r4 = X.CIF.A00     // Catch:{ all -> 0x036e }
            boolean r0 = java.util.Arrays.equals(r5, r4)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x028c
            byte[] r1 = X.CIF.A06     // Catch:{ all -> 0x036e }
            r0 = r17
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x036e }
            if (r0 != 0) goto L_0x0359
            boolean r0 = java.util.Arrays.equals(r5, r4)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0367
            r0 = 1
            long r0 = A01(r2, r0)     // Catch:{ all -> 0x036e }
            int r10 = (int) r0     // Catch:{ all -> 0x036e }
            long r4 = A01(r2, r9)     // Catch:{ all -> 0x036e }
            long r0 = A01(r2, r9)     // Catch:{ all -> 0x036e }
            int r7 = (int) r0     // Catch:{ all -> 0x036e }
            int r0 = (int) r4     // Catch:{ all -> 0x036e }
            byte[] r1 = A05(r2, r7, r0)     // Catch:{ all -> 0x036e }
            int r0 = r2.read()     // Catch:{ all -> 0x036e }
            if (r0 > 0) goto L_0x0288
            java.io.ByteArrayInputStream r11 = X.BE6.A0h(r1)     // Catch:{ all -> 0x036e }
            int r0 = r11.available()     // Catch:{ all -> 0x0282 }
            r14 = 0
            if (r0 != 0) goto L_0x022e
            X.CTf[] r6 = new X.C25005CTf[r14]     // Catch:{ all -> 0x0282 }
            goto L_0x033c
        L_0x022e:
            int r0 = r6.length     // Catch:{ all -> 0x0282 }
            if (r10 != r0) goto L_0x0278
            java.lang.String[] r13 = new java.lang.String[r10]     // Catch:{ all -> 0x0282 }
            int[] r12 = new int[r10]     // Catch:{ all -> 0x0282 }
            r4 = 0
        L_0x0236:
            if (r4 >= r10) goto L_0x0251
            int r1 = A00(r11)     // Catch:{ all -> 0x0282 }
            int r0 = A00(r11)     // Catch:{ all -> 0x0282 }
            r12[r4] = r0     // Catch:{ all -> 0x0282 }
            byte[] r1 = A04(r11, r1)     // Catch:{ all -> 0x0282 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0282 }
            java.lang.String r0 = X.BE6.A0q(r0, r1)     // Catch:{ all -> 0x0282 }
            r13[r4] = r0     // Catch:{ all -> 0x0282 }
            int r4 = r4 + 1
            goto L_0x0236
        L_0x0251:
            if (r14 >= r10) goto L_0x033c
            r9 = r6[r14]     // Catch:{ all -> 0x0282 }
            java.lang.String r1 = r9.A07     // Catch:{ all -> 0x0282 }
            r0 = r13[r14]     // Catch:{ all -> 0x0282 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0282 }
            if (r0 == 0) goto L_0x027b
            r7 = r12[r14]     // Catch:{ all -> 0x0282 }
            r9.A00 = r7     // Catch:{ all -> 0x0282 }
            int[] r5 = new int[r7]     // Catch:{ all -> 0x0282 }
            r4 = 0
            r1 = 0
        L_0x0267:
            if (r4 >= r7) goto L_0x0273
            int r0 = A00(r11)     // Catch:{ all -> 0x0282 }
            int r1 = r1 + r0
            r5[r4] = r1     // Catch:{ all -> 0x0282 }
            int r4 = r4 + 1
            goto L_0x0267
        L_0x0273:
            r9.A02 = r5     // Catch:{ all -> 0x0282 }
            int r14 = r14 + 1
            goto L_0x0251
        L_0x0278:
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
            goto L_0x027d
        L_0x027b:
            java.lang.String r0 = "Order of dexfiles in metadata did not match baseline"
        L_0x027d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0282 }
            throw r0     // Catch:{ all -> 0x0282 }
        L_0x0282:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x034a }
            goto L_0x036d
        L_0x0288:
            java.lang.String r0 = "Content found after the end of file"
            goto L_0x0369
        L_0x028c:
            byte[] r0 = X.CIF.A01     // Catch:{ all -> 0x036e }
            boolean r0 = java.util.Arrays.equals(r5, r0)     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0356
            int r7 = A00(r2)     // Catch:{ all -> 0x036e }
            long r4 = A01(r2, r9)     // Catch:{ all -> 0x036e }
            long r0 = A01(r2, r9)     // Catch:{ all -> 0x036e }
            int r9 = (int) r0     // Catch:{ all -> 0x036e }
            int r0 = (int) r4     // Catch:{ all -> 0x036e }
            byte[] r1 = A05(r2, r9, r0)     // Catch:{ all -> 0x036e }
            int r0 = r2.read()     // Catch:{ all -> 0x036e }
            if (r0 > 0) goto L_0x034f
            java.io.ByteArrayInputStream r9 = X.BE6.A0h(r1)     // Catch:{ all -> 0x036e }
            int r0 = r9.available()     // Catch:{ all -> 0x0345 }
            r5 = 0
            if (r0 != 0) goto L_0x02ba
            X.CTf[] r6 = new X.C25005CTf[r5]     // Catch:{ all -> 0x0345 }
            goto L_0x0338
        L_0x02ba:
            int r4 = r6.length     // Catch:{ all -> 0x0345 }
            if (r7 == r4) goto L_0x02c6
            java.lang.String r0 = "Mismatched number of dex files found in metadata"
        L_0x02bf:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0345 }
            throw r0     // Catch:{ all -> 0x0345 }
        L_0x02c4:
            int r5 = r5 + 1
        L_0x02c6:
            if (r5 >= r7) goto L_0x0338
            r0 = 2
            A01(r9, r0)     // Catch:{ all -> 0x0345 }
            long r0 = A01(r9, r0)     // Catch:{ all -> 0x0345 }
            int r10 = (int) r0     // Catch:{ all -> 0x0345 }
            byte[] r1 = A04(r9, r10)     // Catch:{ all -> 0x0345 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0345 }
            java.lang.String r15 = X.BE6.A0q(r0, r1)     // Catch:{ all -> 0x0345 }
            r0 = 4
            long r0 = A01(r9, r0)     // Catch:{ all -> 0x0345 }
            int r11 = A00(r9)     // Catch:{ all -> 0x0345 }
            r14 = r15
            if (r4 <= 0) goto L_0x032d
            java.lang.String r10 = "!"
            int r10 = r15.indexOf(r10)     // Catch:{ all -> 0x0345 }
            if (r10 >= 0) goto L_0x02f5
            java.lang.String r10 = ":"
            int r10 = r15.indexOf(r10)     // Catch:{ all -> 0x0345 }
        L_0x02f5:
            if (r10 <= 0) goto L_0x02fb
            java.lang.String r14 = X.BE6.A0p(r10, r15)     // Catch:{ all -> 0x0345 }
        L_0x02fb:
            r13 = 0
        L_0x02fc:
            r10 = r6[r13]     // Catch:{ all -> 0x0345 }
            java.lang.String r12 = r10.A07     // Catch:{ all -> 0x0345 }
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x0345 }
            if (r12 == 0) goto L_0x030d
            r10.A01 = r0     // Catch:{ all -> 0x0345 }
            int[] r12 = new int[r11]     // Catch:{ all -> 0x0345 }
            r13 = 0
            r1 = 0
            goto L_0x0312
        L_0x030d:
            int r13 = r13 + 1
            if (r13 >= r4) goto L_0x032d
            goto L_0x02fc
        L_0x0312:
            if (r13 >= r11) goto L_0x031e
            int r0 = A00(r9)     // Catch:{ all -> 0x0345 }
            int r1 = r1 + r0
            r12[r13] = r1     // Catch:{ all -> 0x0345 }
            int r13 = r13 + 1
            goto L_0x0312
        L_0x031e:
            byte[] r1 = X.CIF.A02     // Catch:{ all -> 0x0345 }
            r0 = r17
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ all -> 0x0345 }
            if (r0 == 0) goto L_0x02c4
            r10.A00 = r11     // Catch:{ all -> 0x0345 }
            r10.A02 = r12     // Catch:{ all -> 0x0345 }
            goto L_0x02c4
        L_0x032d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0345 }
            java.lang.String r0 = "Missing profile key: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r15, r1)     // Catch:{ all -> 0x0345 }
            goto L_0x02bf
        L_0x0338:
            r9.close()     // Catch:{ all -> 0x036e }
            goto L_0x033f
        L_0x033c:
            r11.close()     // Catch:{ all -> 0x036e }
        L_0x033f:
            r8.A02 = r6     // Catch:{ all -> 0x036e }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0380, IOException -> 0x0386, IllegalStateException -> 0x0378 }
            return r28
        L_0x0345:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x034a }
            goto L_0x036d
        L_0x034a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x036e }
            goto L_0x036d
        L_0x034f:
            java.lang.String r0 = "Content found after the end of file"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x036e }
            goto L_0x036d
        L_0x0356:
            java.lang.String r0 = "Unsupported meta version"
            goto L_0x035b
        L_0x0359:
            java.lang.String r0 = "Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher"
        L_0x035b:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x036e }
            goto L_0x036d
        L_0x0360:
            java.lang.String r0 = "Invalid magic"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x036e }
            goto L_0x036d
        L_0x0367:
            java.lang.String r0 = "Unsupported meta version"
        L_0x0369:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x036e }
        L_0x036d:
            throw r1     // Catch:{ all -> 0x036e }
        L_0x036e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0373 }
            goto L_0x0377
        L_0x0373:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x0380, IOException -> 0x0386, IllegalStateException -> 0x0378 }
        L_0x0377:
            throw r1     // Catch:{ FileNotFoundException -> 0x0380, IOException -> 0x0386, IllegalStateException -> 0x0378 }
        L_0x0378:
            r2 = move-exception
            r8.A02 = r3
            X.E7B r1 = r8.A04
            r0 = 8
            goto L_0x038a
        L_0x0380:
            r2 = move-exception
            X.E7B r1 = r8.A04
            r0 = 9
            goto L_0x038a
        L_0x0386:
            r2 = move-exception
            X.E7B r1 = r8.A04
            r0 = 7
        L_0x038a:
            r1.C3v(r0, r2)
        L_0x038d:
            return r28
        L_0x038e:
            java.lang.String r0 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26241Cve.A06():X.Cve");
    }

    public boolean A07() {
        if (this.A07 == null) {
            A03(this, Integer.valueOf(Build.VERSION.SDK_INT), 3);
            return false;
        } else if (!this.A05.canWrite()) {
            A03(this, (Object) null, 4);
            return false;
        } else {
            this.A00 = true;
            return true;
        }
    }

    public C26241Cve(AssetManager assetManager, E7B e7b, File file, String str, Executor executor) {
        this.A03 = assetManager;
        this.A08 = executor;
        this.A04 = e7b;
        this.A06 = str;
        this.A05 = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24 && i <= 33) {
            switch (i) {
                case 24:
                case 25:
                    bArr = CIF.A02;
                    break;
                case 26:
                    bArr = CIF.A03;
                    break;
                case 27:
                    bArr = CIF.A04;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = CIF.A05;
                    break;
                default:
                    bArr = CIF.A06;
                    break;
            }
        }
        this.A07 = bArr;
    }

    public static long A01(InputStream inputStream, int i) {
        byte[] A042 = A04(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (A042[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    private FileInputStream A02(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.A04.BrV();
            }
            return null;
        }
    }
}
