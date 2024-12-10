package X;

import android.os.PowerManager;
import java.io.File;
import java.util.AbstractList;
import java.util.Arrays;

/* renamed from: X.68Y  reason: invalid class name */
public final class AnonymousClass68Y extends C27086DTl {
    public final PowerManager.WakeLock A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass11Z A03;
    public final AnonymousClass1ST A04;
    public final C18030ve A05;
    public final C32041gX A06;
    public final C25351Nw A07;
    public final C25291Nq A08;
    public final C136906ub A09;
    public final AnonymousClass68T A0A;
    public final C129076hD A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68Y(PowerManager.WakeLock wakeLock, AnonymousClass190 r3, AnonymousClass11C r4, AnonymousClass11Z r5, AnonymousClass1ST r6, C18030ve r7, C32041gX r8, C25351Nw r9, C25291Nq r10, C129076hD r11, C136906ub r12, AnonymousClass68T r13) {
        super(r13);
        C108965cb.A1P(r5, 3, r11);
        C18070vi.A0d(r13, 11);
        this.A05 = r7;
        this.A01 = r3;
        this.A03 = r5;
        this.A09 = r12;
        this.A08 = r10;
        this.A02 = r4;
        this.A04 = r6;
        this.A0B = r11;
        this.A07 = r9;
        this.A06 = r8;
        this.A0A = r13;
        this.A00 = wakeLock;
    }

    public static boolean A02(int i) {
        return i == 192 || i == 193 || i == 195 || i == 197 || i == 199 || i == 200 || i == 201 || i == 203 || i == 205 || i == 207;
    }

    private final boolean A03(AnonymousClass6nF r4, AnonymousClass21V r5) {
        C62572rc r1;
        File file;
        if (r5 == null) {
            return true;
        }
        C62572rc r0 = r5.A02;
        if ((r0 != null && (file = r0.A0G) != null && !file.exists()) || (r1 = r5.A02) == null) {
            return true;
        }
        if (r4 instanceof AnonymousClass68e) {
            if (!this.A09.A01(r1, false)) {
                return false;
            }
            return true;
        } else if (!(r4 instanceof C1194268b) || this.A09.A01(r1, false)) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:63|64|65|66|(3:68|69|70)(13:71|72|73|(5:79|(1:80)|642|82|(1:84))|85|(1:87)|88|(1:90)|91|(1:93)|94|95|96)|104|105|(1:107)(1:109)|108) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0222, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
        X.CDX.A00(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0226, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0357, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        X.CDX.A00(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x035b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0379, code lost:
        if (r17 == null) goto L_0x0b5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x037f, code lost:
        if (r17.isHeld() == false) goto L_0x0b5a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0381, code lost:
        r17.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0384, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04ae, code lost:
        r7.write(r10);
        r8.readFully(r10);
        r9 = 4;
        r30 = false;
        r26 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04bc, code lost:
        if (((long) r9) >= r27) goto L_0x0656;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04c0, code lost:
        if (r10[0] == -1) goto L_0x04d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04c2, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("ImageProcessor/stripMetadata not a marker");
        X.C17890vO.A1A(r1, X.AnonymousClass1EG.A0G(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04d8, code lost:
        if (r10[1] != -39) goto L_0x04df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04da, code lost:
        r7.write(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04df, code lost:
        r8.readFully(r13);
        r9 = r9 + 2;
        r6 = (((r13[0] & 255) << 8) | (r13[1] & 255)) - 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04f1, code lost:
        if (r6 >= 0) goto L_0x04fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04f3, code lost:
        com.whatsapp.util.Log.i("ImageProcessor/invalid size bytes on marker");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04fa, code lost:
        r0 = r10[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04fe, code lost:
        if (r0 != -38) goto L_0x0541;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0500, code lost:
        if (r30 != false) goto L_0x0504;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0504, code lost:
        r7.write(r10);
        r7.write(r13);
        r0 = new byte[r6];
        r8.readFully(r0);
        r9 = r9 + r6;
        r7.write(r0);
        r0 = new byte[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0515, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0519, code lost:
        if (((long) r9) >= r27) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x051b, code lost:
        r1 = r8.readByte();
        r0[0] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0521, code lost:
        if (r1 != -1) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0523, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0525, code lost:
        if (r6 == false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0527, code lost:
        r10[0] = -1;
        r1 = r0[0];
        r10[1] = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0533, code lost:
        if (X.C137476vW.A01(X.C137766vz.A04, r1) == false) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0535, code lost:
        r7.write(r10);
        r9 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x053b, code lost:
        r7.write(r0);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0545, code lost:
        if ((r0 & -16) != -32) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0547, code lost:
        if (r0 == -32) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x054b, code lost:
        if (r0 == -31) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x054f, code lost:
        if (r0 == -19) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0553, code lost:
        if (r26 != false) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0555, code lost:
        r8.readFully(r31);
        r9 = r9 + 5;
        r6 = r6 - 5;
        r15 = X.C137766vz.A01;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0566, code lost:
        if (r31[r0] == r15[r0]) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0568, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("ImageProcessor/stripMetadata invalid APP1 signature: ");
        X.C17890vO.A1A(r1, X.AnonymousClass1EG.A0G(r31));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x057a, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x057c, code lost:
        if (r0 < 5) goto L_0x0562;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x057e, code lost:
        r26 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0581, code lost:
        r8.readFully(r31);
        r9 = r9 + 5;
        r6 = r6 - 5;
        r15 = X.C137766vz.A02;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0591, code lost:
        if (r31[r12] == r15[r12]) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0593, code lost:
        r14 = X.C137766vz.A03;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x059a, code lost:
        if (r31[r0] == r14[r0]) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x059c, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("ImageProcessor/stripMetadata invalid APP0 signature: ");
        X.C17890vO.A1A(r1, X.AnonymousClass1EG.A0G(r31));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05ae, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05b1, code lost:
        if (r0 >= 5) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05b4, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05b7, code lost:
        if (r12 < 5) goto L_0x058d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05b9, code lost:
        if (r30 != false) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x05bc, code lost:
        X.C137766vz.A00(r8, r6);
        r9 = r9 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x05c1, code lost:
        r7.write(-1);
        r7.write(-32);
        r7.write(r13);
        r7.write(r15);
        r0 = new byte[r6];
        r8.readFully(r0);
        r7.write(r0);
        r30 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05d8, code lost:
        X.C137766vz.A00(r8, r6);
        r9 = r9 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05dc, code lost:
        r8.readFully(r10);
        r9 = r9 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05e3, code lost:
        r0 = new byte[r6];
        r8.readFully(r0);
        r7.write(r10);
        r7.write(r13);
        r7.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05f1, code lost:
        r8.readFully(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x05f6, code lost:
        if (r9 == -1) goto L_0x066b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x05fa, code lost:
        if (r29 != false) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x05fc, code lost:
        if (r9 == 0) goto L_0x0609;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0607, code lost:
        if (((long) r9) <= (((long) r48.A02) * 1024)) goto L_0x060b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0609, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x060b, code lost:
        r10 = false;
        r6 = X.AnonymousClass000.A10();
        r6.append("ImageSize<=MaxSize | ");
        r6.append(((long) r9) / 1024);
        r6.append(" <= ");
        r3.A03.add(X.C17880vN.A0t(r6, r48.A02));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x062c, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("ImageProcessor/prepareImageForSend/copy size:");
        r1.append(r9);
        r1.append(" max:");
        r1.append(r48.A02);
        X.C17900vP.A0n(" recompress:", r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        com.whatsapp.util.Log.i("ImageProcessor/stripMetadata missing valid application signature before image");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0650, code lost:
        com.whatsapp.util.Log.i("ImageProcessor/stripMetadata invalid APP marker");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0656, code lost:
        com.whatsapp.util.Log.i("ImageProcessor/stripMetadata file too large");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0a69, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0a6a, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0a7f, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0a80, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0abe, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0abf, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0ae5, code lost:
        if (X.AnonymousClass1YF.A0Y(r1, "No space", r5) != true) goto L_0x0ae7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0af5, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x0af6, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0afd, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0afe, code lost:
        r5 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0227 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x035c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:386:0x0793 */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0234 A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0240 A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0245 A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0369 A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0376 A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03b8 A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0403 A[Catch:{ all -> 0x0691, SecurityException -> 0x0a4c }] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x04a8 A[Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667, all -> 0x0682 }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0679 A[Catch:{ all -> 0x0691, SecurityException -> 0x0a4c }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x06bc A[Catch:{ all -> 0x06ce, all -> 0x06d3, OutOfMemoryError -> 0x06d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06c8 A[SYNTHETIC, Splitter:B:352:0x06c8] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0734 A[Catch:{ all -> 0x0691, SecurityException -> 0x0a4c }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x075f A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x079e A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x07cc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x08bc A[Catch:{ IOException -> 0x093f }] */
    /* JADX WARNING: Removed duplicated region for block: B:541:0x0944 A[SYNTHETIC, Splitter:B:541:0x0944] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x09a2 A[Catch:{ all -> 0x0a26 }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x09ec A[Catch:{ all -> 0x0a26 }] */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x0a69 A[ExcHandler: SecurityException (e java.lang.SecurityException), PHI: r21 r22 r23 r24 r25 r36 r37 r38 r39 r45 
      PHI: (r21v14 int) = (r21v0 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v0 int), (r21v26 int), (r21v28 int), (r21v0 int), (r21v0 int), (r21v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v14 int) = (r22v0 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v0 int), (r22v26 int), (r22v28 int), (r22v0 int), (r22v0 int), (r22v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v14 int) = (r23v0 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v0 int), (r23v26 int), (r23v28 int), (r23v0 int), (r23v0 int), (r23v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v14 int) = (r24v0 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v0 int), (r24v26 int), (r24v28 int), (r24v0 int), (r24v0 int), (r24v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v14 java.io.File) = (r25v0 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v0 java.io.File), (r25v26 java.io.File), (r25v28 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r36v14 java.lang.Integer) = (r36v0 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v0 java.lang.Integer) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r37v14 java.lang.String) = (r37v0 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r38v14 byte[]) = (r38v0 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v0 byte[]), (r38v26 byte[]), (r38v28 byte[]), (r38v0 byte[]), (r38v0 byte[]), (r38v0 byte[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r39v14 int[]) = (r39v0 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v0 int[]), (r39v28 int[]), (r39v31 int[]), (r39v0 int[]), (r39v0 int[]), (r39v0 int[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r45v14 boolean) = (r45v0 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v0 boolean), (r45v33 boolean), (r45v36 boolean), (r45v0 boolean), (r45v0 boolean), (r45v0 boolean) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:104:0x0227] */
    /* JADX WARNING: Removed duplicated region for block: B:587:0x0a7f A[ExcHandler: OutOfMemoryError (e java.lang.OutOfMemoryError), PHI: r21 r22 r23 r24 r25 r36 r37 r38 r39 r45 
      PHI: (r21v12 int) = (r21v0 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v0 int), (r21v26 int), (r21v28 int), (r21v0 int), (r21v0 int), (r21v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v12 int) = (r22v0 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v0 int), (r22v26 int), (r22v28 int), (r22v0 int), (r22v0 int), (r22v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v12 int) = (r23v0 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v0 int), (r23v26 int), (r23v28 int), (r23v0 int), (r23v0 int), (r23v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v12 int) = (r24v0 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v0 int), (r24v26 int), (r24v28 int), (r24v0 int), (r24v0 int), (r24v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v12 java.io.File) = (r25v0 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v0 java.io.File), (r25v26 java.io.File), (r25v28 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r36v12 java.lang.Integer) = (r36v0 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v0 java.lang.Integer) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r37v12 java.lang.String) = (r37v0 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r38v12 byte[]) = (r38v0 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v0 byte[]), (r38v26 byte[]), (r38v28 byte[]), (r38v0 byte[]), (r38v0 byte[]), (r38v0 byte[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r39v12 int[]) = (r39v0 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v0 int[]), (r39v28 int[]), (r39v31 int[]), (r39v0 int[]), (r39v0 int[]), (r39v0 int[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r45v12 boolean) = (r45v0 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v0 boolean), (r45v33 boolean), (r45v36 boolean), (r45v0 boolean), (r45v0 boolean), (r45v0 boolean) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013c A[Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }] */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0af5 A[ExcHandler: 1iX (e X.1iX), PHI: r21 r22 r23 r24 r25 r36 r37 r38 r39 r45 
      PHI: (r21v7 int) = (r21v0 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v0 int), (r21v26 int), (r21v28 int), (r21v0 int), (r21v0 int), (r21v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v7 int) = (r22v0 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v0 int), (r22v26 int), (r22v28 int), (r22v0 int), (r22v0 int), (r22v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v7 int) = (r23v0 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v0 int), (r23v26 int), (r23v28 int), (r23v0 int), (r23v0 int), (r23v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v7 int) = (r24v0 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v0 int), (r24v26 int), (r24v28 int), (r24v0 int), (r24v0 int), (r24v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v7 java.io.File) = (r25v0 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v0 java.io.File), (r25v26 java.io.File), (r25v28 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r36v7 java.lang.Integer) = (r36v0 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v0 java.lang.Integer) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r37v7 java.lang.String) = (r37v0 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r38v7 byte[]) = (r38v0 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v0 byte[]), (r38v26 byte[]), (r38v28 byte[]), (r38v0 byte[]), (r38v0 byte[]), (r38v0 byte[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r39v7 int[]) = (r39v0 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v0 int[]), (r39v28 int[]), (r39v31 int[]), (r39v0 int[]), (r39v0 int[]), (r39v0 int[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r45v7 boolean) = (r45v0 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v0 boolean), (r45v33 boolean), (r45v36 boolean), (r45v0 boolean), (r45v0 boolean), (r45v0 boolean) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:611:0x0afd A[ExcHandler: 2RM (e X.2RM), PHI: r21 r22 r23 r24 r25 r36 r37 r38 r39 r45 
      PHI: (r21v5 int) = (r21v0 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v20 int), (r21v0 int), (r21v26 int), (r21v28 int), (r21v0 int), (r21v0 int), (r21v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r22v5 int) = (r22v0 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v20 int), (r22v0 int), (r22v26 int), (r22v28 int), (r22v0 int), (r22v0 int), (r22v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r23v5 int) = (r23v0 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v20 int), (r23v0 int), (r23v26 int), (r23v28 int), (r23v0 int), (r23v0 int), (r23v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r24v5 int) = (r24v0 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v20 int), (r24v0 int), (r24v26 int), (r24v28 int), (r24v0 int), (r24v0 int), (r24v0 int) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r25v5 java.io.File) = (r25v0 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v20 java.io.File), (r25v0 java.io.File), (r25v26 java.io.File), (r25v28 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File), (r25v0 java.io.File) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r36v5 java.lang.Integer) = (r36v0 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v20 java.lang.Integer), (r36v0 java.lang.Integer) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r37v5 java.lang.String) = (r37v0 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v20 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String), (r37v0 java.lang.String) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r38v5 byte[]) = (r38v0 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v20 byte[]), (r38v0 byte[]), (r38v26 byte[]), (r38v28 byte[]), (r38v0 byte[]), (r38v0 byte[]), (r38v0 byte[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r39v5 int[]) = (r39v0 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v20 int[]), (r39v0 int[]), (r39v28 int[]), (r39v31 int[]), (r39v0 int[]), (r39v0 int[]), (r39v0 int[]) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r45v5 boolean) = (r45v0 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v20 boolean), (r45v0 boolean), (r45v33 boolean), (r45v36 boolean), (r45v0 boolean), (r45v0 boolean), (r45v0 boolean) binds: [B:1:0x0048, B:177:0x0389, B:571:0x0a4d, B:376:0x0747, B:386:0x0793, B:43:0x0109, B:164:0x035c, B:104:0x0227, B:54:0x012f, B:46:0x010f, B:31:0x00c2] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:624:0x0b35  */
    /* JADX WARNING: Removed duplicated region for block: B:633:0x0b5d  */
    /* JADX WARNING: Removed duplicated region for block: B:657:0x04a1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:696:0x093f A[EDGE_INSN: B:696:0x093f->B:538:0x093f ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C55362fe A07() {
        /*
            r51 = this;
            r21 = 0
            r22 = 0
            r24 = 0
            r45 = 0
            r39 = 0
            r23 = 0
            r36 = 0
            r37 = 0
            r25 = 0
            r38 = 0
            r50 = r51
            r0 = r50
            X.68T r0 = r0.A0A
            r49 = r0
            X.70S r3 = r0.A01
            r4 = 1
            X.64V r2 = r3.A01
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r2.A07 = r7
            boolean r0 = r0.A02
            r18 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r2.A01 = r0
            r0 = r49
            X.6nF r0 = r0.A00
            r48 = r0
            int r0 = r0.A00
            r47 = r0
            java.lang.Long r0 = X.C17880vN.A0n(r47)
            r2.A0Z = r0
            r3.A00()
            r16 = 2
            r0 = r50
            android.os.PowerManager$WakeLock r0 = r0.A00     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r17 = r0
            if (r0 == 0) goto L_0x0051
            r17.acquire()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0051:
            r0 = r49
            java.lang.String r0 = r0.A01     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            android.net.Uri r19 = android.net.Uri.parse(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r0 = r19.getPath()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0a57
            java.io.File r9 = X.C108945cZ.A17(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            long r14 = r9.length()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r2.A0W = r0     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            boolean r1 = X.C137626vl.A00(r9)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = 1
            if (r1 == 0) goto L_0x0075
            r0 = 5
        L_0x0075:
            r3.A03(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r50
            X.0ve r6 = r0.A05     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = 8393(0x20c9, float:1.1761E-41)
            X.0vf r13 = X.C18040vf.A02     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            boolean r0 = X.C18020vd.A05(r13, r6, r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x00c9
            r0 = r50
            X.1Nq r1 = r0.A08     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r19
            java.io.InputStream r5 = r1.A0A(r0, r4)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.C18070vi.A0b(r5)     // Catch:{ all -> 0x00bf }
            r8 = 0
            X.CxM r1 = new X.CxM     // Catch:{ Exception -> 0x00b8 }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "Model"
            java.lang.String r1 = r1.A0a(r0)     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r0 = "Ray-Ban Meta Smart Glasses"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00b5
        L_0x00ac:
            java.lang.String r0 = "Ray-Ban Stories"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00b5
            r8 = r7
        L_0x00b5:
            r36 = r8
            goto L_0x00c6
        L_0x00b8:
            r1 = move-exception
            java.lang.String r0 = "MediaMetadataUtils/wasImageCapturedBySmartglasses"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00bf }
            goto L_0x00c6
        L_0x00bf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            throw r0     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x00c6:
            r5.close()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x00c9:
            java.lang.String r5 = X.C18070vi.A0H(r19)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r1 = "rotation"
            r0 = r21
            boolean r0 = X.AnonymousClass1YF.A0Y(r5, r1, r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x00de
            java.lang.String r5 = "rotate"
            java.util.HashSet r0 = r3.A02     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0.add(r5)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x00de:
            X.2rc r20 = new X.2rc     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r20.<init>()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r49
            java.io.File r0 = r0.A06     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r46 = r0
            r0 = 5179(0x143b, float:7.257E-42)
            boolean r8 = X.C18020vd.A05(r13, r6, r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r19
            java.lang.String r7 = r0.getQueryParameter(r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r1 = "flip-v"
            java.lang.String r5 = r0.getQueryParameter(r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r1 = "flip-h"
            java.lang.String r0 = r0.getQueryParameter(r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r7 != 0) goto L_0x0387
            if (r5 != 0) goto L_0x0387
            if (r0 != 0) goto L_0x0387
            if (r8 != 0) goto L_0x0387
            java.lang.String r8 = X.C1402370n.A00(r9)     // Catch:{ IOException -> 0x012a, 2RM -> 0x0afd, 1iX -> 0x0af5, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r48
            boolean r0 = r0 instanceof X.C1194268b     // Catch:{ IOException -> 0x0128, 2RM -> 0x0afd, 1iX -> 0x0af5, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0132
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ IOException -> 0x0128, 2RM -> 0x0afd, 1iX -> 0x0af5, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r0 = "-hd"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0128, 2RM -> 0x0afd, 1iX -> 0x0af5, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            byte[] r0 = X.C108975cc.A1O(r0)     // Catch:{ IOException -> 0x0128, 2RM -> 0x0afd, 1iX -> 0x0af5, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r1 = r16
            java.lang.String r8 = android.util.Base64.encodeToString(r0, r1)     // Catch:{ IOException -> 0x0128, 2RM -> 0x0afd, 1iX -> 0x0af5, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            goto L_0x0132
        L_0x0128:
            r1 = move-exception
            goto L_0x012d
        L_0x012a:
            r1 = move-exception
            r8 = r39
        L_0x012d:
            java.lang.String r0 = "ProcessImageTask/errorComputingHash"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0132:
            r0 = r50
            X.1ST r12 = r0.A04     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.21V r7 = r12.A0B(r8)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r7 == 0) goto L_0x0243
            r1 = r0
            r0 = r48
            boolean r0 = r1.A03(r0, r7)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 != 0) goto L_0x0243
            X.2rc r5 = r7.A02     // Catch:{ IOException -> 0x0227 }
            if (r5 == 0) goto L_0x0243
            X.1Nq r1 = r1.A08     // Catch:{ IOException -> 0x0227 }
            java.io.File r0 = r5.A0G     // Catch:{ IOException -> 0x0227 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x0227 }
            java.io.InputStream r11 = r1.A0A(r0, r4)     // Catch:{ IOException -> 0x0227 }
            r0 = r46
            X.C64062u9.A0T(r0, r11)     // Catch:{ all -> 0x0220 }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = X.C1402370n.A00(r46)     // Catch:{ all -> 0x0220 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x0220 }
            if (r0 != 0) goto L_0x016e
            X.C64062u9.A0Q(r46)     // Catch:{ all -> 0x0220 }
            r11.close()     // Catch:{ IOException -> 0x0227 }
            goto L_0x0243
        L_0x016e:
            r0 = r50
            X.1Nw r1 = r0.A07     // Catch:{ all -> 0x0220 }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x0220 }
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r7, r0)     // Catch:{ all -> 0x0220 }
            r1.Bhl(r0)     // Catch:{ all -> 0x0220 }
            r0 = r50
            X.1gX r1 = r0.A06     // Catch:{ all -> 0x0220 }
            X.25F r0 = r7.A0C     // Catch:{ all -> 0x0220 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0220 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0220 }
            r1.Bhl(r0)     // Catch:{ all -> 0x0220 }
            X.36v r0 = r7.A17()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01b4
            int[] r9 = r0.A07()     // Catch:{ all -> 0x0220 }
            if (r9 == 0) goto L_0x01b4
            int r10 = r9.length     // Catch:{ all -> 0x0220 }
            r0 = 4
            if (r10 != r0) goto L_0x01b4
            r1 = 0
            r0 = 0
        L_0x019f:
            r26 = r9[r1]     // Catch:{ all -> 0x0220 }
            int r0 = r0 + r26
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x019f
            long r0 = (long) r0     // Catch:{ all -> 0x0220 }
            long r26 = r46.length()     // Catch:{ all -> 0x0220 }
            int r10 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r10 != 0) goto L_0x01b4
            r39 = r9
            r45 = 1
        L_0x01b4:
            int r0 = r5.A06     // Catch:{ all -> 0x0220 }
            r24 = r0
            int r0 = r5.A08     // Catch:{ all -> 0x0220 }
            r23 = r0
            int r0 = r5.A02     // Catch:{ all -> 0x0220 }
            r21 = r0
            int r0 = r5.A03     // Catch:{ all -> 0x0220 }
            r22 = r0
            X.36u r0 = r7.A0O()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01ce
            byte[] r38 = r0.A01()     // Catch:{ all -> 0x0220 }
        L_0x01ce:
            r25 = r46
            X.2KN r0 = new X.2KN     // Catch:{ all -> 0x0220 }
            r34 = r0
            r35 = r46
            r40 = r24
            r41 = r23
            r42 = r21
            r43 = r22
            r44 = r4
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0220 }
            int[] r10 = r0.A05     // Catch:{ all -> 0x0220 }
            int r9 = r10.length     // Catch:{ all -> 0x0220 }
            r1 = 0
            if (r9 == 0) goto L_0x01f1
            r9 = r10[r1]     // Catch:{ all -> 0x0220 }
            java.lang.Long r9 = X.C17880vN.A0n(r9)     // Catch:{ all -> 0x0220 }
            r2.A0L = r9     // Catch:{ all -> 0x0220 }
        L_0x01f1:
            java.io.File r9 = r0.A00     // Catch:{ all -> 0x0220 }
            X.C17960vV.A07(r9)     // Catch:{ all -> 0x0220 }
            long r9 = r9.length()     // Catch:{ all -> 0x0220 }
            r3.A05(r9)     // Catch:{ all -> 0x0220 }
            boolean r9 = r0.A04     // Catch:{ all -> 0x0220 }
            r3.A09(r9)     // Catch:{ all -> 0x0220 }
            byte[] r9 = r0.A04     // Catch:{ all -> 0x0220 }
            if (r9 == 0) goto L_0x0207
            int r1 = r9.length     // Catch:{ all -> 0x0220 }
        L_0x0207:
            long r9 = (long) r1     // Catch:{ all -> 0x0220 }
            r3.A06(r9)     // Catch:{ all -> 0x0220 }
            int r1 = r5.A08     // Catch:{ all -> 0x0220 }
            int r5 = r5.A06     // Catch:{ all -> 0x0220 }
            r3.A04(r1, r5)     // Catch:{ all -> 0x0220 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0220 }
            r2.A05 = r1     // Catch:{ all -> 0x0220 }
            r3.A02()     // Catch:{ all -> 0x0220 }
            r11.close()     // Catch:{ IOException -> 0x0227 }
            goto L_0x0379
        L_0x0220:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r1 = move-exception
            X.CDX.A00(r11, r0)     // Catch:{ IOException -> 0x0227 }
            throw r1     // Catch:{ IOException -> 0x0227 }
        L_0x0227:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r0 = "ProcessImageTask/processImage/failed to get bitmap stream from file "
            r1.append(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.2rc r0 = r7.A02     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0240
            java.io.File r0 = r0.A0G     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0236:
            r1.append(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.C17890vO.A0w(r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.C64062u9.A0Q(r46)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            goto L_0x0243
        L_0x0240:
            r0 = r37
            goto L_0x0236
        L_0x0243:
            if (r8 == 0) goto L_0x0385
            java.util.ArrayList r0 = r12.A0E(r8, r4)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0251:
            boolean r0 = r7.hasNext()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0263
            java.lang.Object r1 = r7.next()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            boolean r0 = r1 instanceof X.C438421d     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0251
            r5.add(r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            goto L_0x0251
        L_0x0263:
            java.util.Iterator r28 = r5.iterator()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0267:
            boolean r0 = r28.hasNext()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0385
            java.lang.Object r7 = r28.next()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.21d r7 = (X.C438421d) r7     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r1 = r50
            r0 = r48
            boolean r0 = r1.A03(r0, r7)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 != 0) goto L_0x0267
            if (r7 == 0) goto L_0x0267
            X.2rc r5 = r7.A02     // Catch:{ IOException -> 0x035c }
            if (r5 == 0) goto L_0x0267
            X.1Nq r1 = r1.A08     // Catch:{ IOException -> 0x035c }
            java.io.File r0 = r5.A0G     // Catch:{ IOException -> 0x035c }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x035c }
            java.io.InputStream r11 = r1.A0A(r0, r4)     // Catch:{ IOException -> 0x035c }
            r0 = r46
            X.C64062u9.A0T(r0, r11)     // Catch:{ all -> 0x0355 }
            java.lang.String r1 = r7.A05     // Catch:{ all -> 0x0355 }
            java.lang.String r0 = X.C1402370n.A00(r46)     // Catch:{ all -> 0x0355 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x0355 }
            if (r0 != 0) goto L_0x02a7
            X.C64062u9.A0Q(r46)     // Catch:{ all -> 0x0355 }
            r11.close()     // Catch:{ IOException -> 0x035c }
            goto L_0x0267
        L_0x02a7:
            r0 = r50
            X.1Nw r1 = r0.A07     // Catch:{ all -> 0x0355 }
            X.C17960vV.A07(r7)     // Catch:{ all -> 0x0355 }
            java.lang.Class<X.36u> r0 = X.C693336u.class
            X.25F r0 = X.C18070vi.A09(r7, r0)     // Catch:{ all -> 0x0355 }
            r1.Bhl(r0)     // Catch:{ all -> 0x0355 }
            r0 = r50
            X.1gX r1 = r0.A06     // Catch:{ all -> 0x0355 }
            X.25F r0 = r7.A0C     // Catch:{ all -> 0x0355 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0355 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0355 }
            r1.Bhl(r0)     // Catch:{ all -> 0x0355 }
            X.36v r0 = r7.A17()     // Catch:{ all -> 0x0355 }
            if (r0 == 0) goto L_0x02ec
            int[] r9 = r0.A07()     // Catch:{ all -> 0x0355 }
            if (r9 == 0) goto L_0x02ec
            int r10 = r9.length     // Catch:{ all -> 0x0355 }
            r0 = 4
            if (r10 != r0) goto L_0x02ec
            r1 = 0
            r0 = 0
        L_0x02d8:
            r12 = r9[r1]     // Catch:{ all -> 0x0355 }
            int r0 = r0 + r12
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x02d8
            long r0 = (long) r0     // Catch:{ all -> 0x0355 }
            long r26 = r46.length()     // Catch:{ all -> 0x0355 }
            int r10 = (r0 > r26 ? 1 : (r0 == r26 ? 0 : -1))
            if (r10 != 0) goto L_0x02ec
            r39 = r9
            r45 = 1
        L_0x02ec:
            int r0 = r5.A06     // Catch:{ all -> 0x0355 }
            r24 = r0
            int r0 = r5.A08     // Catch:{ all -> 0x0355 }
            r23 = r0
            int r0 = r5.A02     // Catch:{ all -> 0x0355 }
            r21 = r0
            int r0 = r5.A03     // Catch:{ all -> 0x0355 }
            r22 = r0
            X.36u r0 = r7.A0O()     // Catch:{ all -> 0x0355 }
            byte[] r38 = r0.A01()     // Catch:{ all -> 0x0355 }
            r25 = r46
            X.2KN r0 = new X.2KN     // Catch:{ all -> 0x0355 }
            r34 = r0
            r35 = r46
            r40 = r24
            r41 = r23
            r42 = r21
            r43 = r22
            r44 = r4
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x0355 }
            int[] r10 = r0.A05     // Catch:{ all -> 0x0355 }
            int r9 = r10.length     // Catch:{ all -> 0x0355 }
            r1 = 0
            if (r9 == 0) goto L_0x0327
            r9 = r10[r1]     // Catch:{ all -> 0x0355 }
            java.lang.Long r9 = X.C17880vN.A0n(r9)     // Catch:{ all -> 0x0355 }
            r2.A0L = r9     // Catch:{ all -> 0x0355 }
        L_0x0327:
            java.io.File r9 = r0.A00     // Catch:{ all -> 0x0355 }
            X.C17960vV.A07(r9)     // Catch:{ all -> 0x0355 }
            long r9 = r9.length()     // Catch:{ all -> 0x0355 }
            r3.A05(r9)     // Catch:{ all -> 0x0355 }
            boolean r9 = r0.A04     // Catch:{ all -> 0x0355 }
            r3.A09(r9)     // Catch:{ all -> 0x0355 }
            byte[] r9 = r0.A04     // Catch:{ all -> 0x0355 }
            if (r9 == 0) goto L_0x033d
            int r1 = r9.length     // Catch:{ all -> 0x0355 }
        L_0x033d:
            long r9 = (long) r1     // Catch:{ all -> 0x0355 }
            r3.A06(r9)     // Catch:{ all -> 0x0355 }
            int r1 = r5.A08     // Catch:{ all -> 0x0355 }
            int r5 = r5.A06     // Catch:{ all -> 0x0355 }
            r3.A04(r1, r5)     // Catch:{ all -> 0x0355 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0355 }
            r2.A05 = r1     // Catch:{ all -> 0x0355 }
            r3.A02()     // Catch:{ all -> 0x0355 }
            r11.close()     // Catch:{ IOException -> 0x035c }
            goto L_0x0379
        L_0x0355:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0357 }
        L_0x0357:
            r1 = move-exception
            X.CDX.A00(r11, r0)     // Catch:{ IOException -> 0x035c }
            throw r1     // Catch:{ IOException -> 0x035c }
        L_0x035c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r0 = "ProcessImageTask/processImage/failed to get bitmap stream from file "
            r1.append(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.2rc r0 = r7.A02     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x0376
            java.io.File r0 = r0.A0G     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x036b:
            r1.append(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.C17890vO.A0w(r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.C64062u9.A0Q(r46)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            goto L_0x0267
        L_0x0376:
            r0 = r37
            goto L_0x036b
        L_0x0379:
            if (r17 == 0) goto L_0x0b5a
            boolean r1 = r17.isHeld()
            if (r1 == 0) goto L_0x0b5a
            r17.release()
            return r0
        L_0x0385:
            r37 = r8
        L_0x0387:
            r0 = r50
            X.11Z r0 = r0.A03     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r43 = r0
            r0 = r50
            X.1Nq r0 = r0.A08     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r42 = r0
            r0 = r50
            X.11C r7 = r0.A02     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r49
            boolean r0 = r0.A03     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r29 = r0
            r5 = 0
            r0 = 8216(0x2018, float:1.1513E-41)
            float r0 = r6.A0E(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            int r8 = (int) r0     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = 8217(0x2019, float:1.1514E-41)
            float r0 = r6.A0E(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            int r1 = (int) r0     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            X.6eK r35 = new X.6eK     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r35
            r0.<init>(r8, r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r18 != 0) goto L_0x03ba
            X.6eK r35 = X.C137766vz.A00     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x03ba:
            java.io.File r9 = r46.getParentFile()     // Catch:{ SecurityException -> 0x0a4c }
            r1 = r42
            r0 = r19
            java.io.InputStream r1 = r1.A0A(r0, r4)     // Catch:{ IOException -> 0x03f9 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x03f9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x03f9 }
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ IOException -> 0x03f9 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x03f9 }
            X.CxM r1 = new X.CxM     // Catch:{ all -> 0x03ef }
            r1.<init>((java.io.InputStream) r8)     // Catch:{ all -> 0x03ef }
            java.lang.String r0 = "Xmp"
            java.lang.String r1 = r1.A0a(r0)     // Catch:{ all -> 0x03ef }
            r34 = 0
            if (r1 == 0) goto L_0x03e9
            java.lang.String r0 = "trainedAlgorithmicMedia"
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r5)     // Catch:{ all -> 0x03ef }
            if (r0 == 0) goto L_0x03e9
            r34 = 1
        L_0x03e9:
            r8.close()     // Catch:{ IOException -> 0x03ed }
            goto L_0x0401
        L_0x03ed:
            r1 = move-exception
            goto L_0x03fc
        L_0x03ef:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x03f4 }
            goto L_0x03f8
        L_0x03f4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x03f9 }
        L_0x03f8:
            throw r1     // Catch:{ IOException -> 0x03f9 }
        L_0x03f9:
            r1 = move-exception
            r34 = 0
        L_0x03fc:
            java.lang.String r0 = "ImageProcessor/prepareImageForSend/hasXMPDataWithTrainedAlgorithmicMedia Failed to get XMP Data"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0401:
            if (r9 == 0) goto L_0x0406
            r9.mkdirs()     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0406:
            X.11B r1 = r7.A0O()     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r19
            android.graphics.Matrix r33 = X.C26511Sk.A09(r0, r1)     // Catch:{ SecurityException -> 0x0a4c }
            r7 = r42
            r1 = r0
            r0 = r47
            android.graphics.BitmapFactory$Options r32 = r7.A09(r1, r0, r4, r4)     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r32
            int r0 = r0.outWidth     // Catch:{ SecurityException -> 0x0a4c }
            r41 = r0
            r0 = r32
            int r0 = r0.outHeight     // Catch:{ SecurityException -> 0x0a4c }
            r40 = r0
            r0 = r41
            long r7 = (long) r0     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r40
            long r0 = (long) r0     // Catch:{ SecurityException -> 0x0a4c }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ SecurityException -> 0x0a4c }
            r2.A0X = r7     // Catch:{ SecurityException -> 0x0a4c }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ SecurityException -> 0x0a4c }
            r2.A0V = r0     // Catch:{ SecurityException -> 0x0a4c }
            if (r33 != 0) goto L_0x0696
            r0 = r48
            int r1 = r0.A01     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r41
            if (r0 > r1) goto L_0x0445
            r0 = r40
            if (r0 <= r1) goto L_0x0452
        L_0x0445:
            r7 = 0
            int r0 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0696
            r7 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0696
        L_0x0452:
            r0 = r42
            r1 = r19
            java.io.InputStream r1 = r0.A0A(r1, r4)     // Catch:{ SecurityException -> 0x0a4c }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ SecurityException -> 0x0a4c }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x0a4c }
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ SecurityException -> 0x0a4c }
            r8.<init>(r0)     // Catch:{ SecurityException -> 0x0a4c }
            java.io.FileOutputStream r1 = X.C108945cZ.A19(r46)     // Catch:{ all -> 0x068c }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x068c }
            r7.<init>(r1, r0)     // Catch:{ all -> 0x068c }
            r0 = 1577(0x629, float:2.21E-42)
            int r0 = X.C18020vd.A00(r13, r6, r0)     // Catch:{ all -> 0x0682 }
            long r0 = (long) r0     // Catch:{ all -> 0x0682 }
            r27 = r0
            r0 = 1024(0x400, double:5.06E-321)
            long r27 = r27 * r0
            r0 = r16
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0682 }
            byte[] r13 = new byte[r0]     // Catch:{ all -> 0x0682 }
            r0 = 5
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0682 }
            r31 = r0
            java.lang.String r0 = "ImageProcessor/stripMetadata begin stripping metadata"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0682 }
            r11 = -1
            r8.readFully(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0 = r16
            byte[] r6 = new byte[r0]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r6[r5] = r11     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0 = -40
            r6[r4] = r0     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r1 = 0
        L_0x049b:
            byte r9 = r10[r1]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte r0 = r6[r1]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r9 == r0) goto L_0x04a8
            java.lang.String r0 = "ImageProcessor/stripMetadata not a jpeg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x04a8:
            int r1 = r1 + 1
            r0 = r16
            if (r1 < r0) goto L_0x049b
            r7.write(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r8.readFully(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r9 = 4
            r30 = 0
            r26 = 0
        L_0x04b9:
            long r0 = (long) r9     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r6 = (r0 > r27 ? 1 : (r0 == r27 ? 0 : -1))
            if (r6 >= 0) goto L_0x0656
            byte r0 = r10[r5]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r0 == r11) goto L_0x04d4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            java.lang.String r0 = "ImageProcessor/stripMetadata not a marker"
            r1.append(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            java.lang.String r0 = X.AnonymousClass1EG.A0G(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x04d4:
            byte r1 = r10[r4]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0 = -39
            if (r1 != r0) goto L_0x04df
            r7.write(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x05f6
        L_0x04df:
            r8.readFully(r13)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + 2
            byte r0 = r13[r5]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r6 = r0 << 8
            byte r0 = r13[r4]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6 = r6 | r0
            int r6 = r6 - r16
            if (r6 >= 0) goto L_0x04fa
            java.lang.String r0 = "ImageProcessor/invalid size bytes on marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x04fa:
            byte r0 = r10[r4]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r1 = -38
            if (r0 != r1) goto L_0x0541
            if (r30 != 0) goto L_0x0504
            goto L_0x064a
        L_0x0504:
            r7.write(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r13)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte[] r0 = new byte[r6]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + r6
            r7.write(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte[] r0 = new byte[r4]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
        L_0x0515:
            r6 = 0
        L_0x0516:
            long r14 = (long) r9     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r1 = (r14 > r27 ? 1 : (r14 == r27 ? 0 : -1))
            if (r1 >= 0) goto L_0x04b9
            byte r1 = r8.readByte()     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0[r5] = r1     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r1 != r11) goto L_0x0525
            r6 = 1
            goto L_0x0516
        L_0x0525:
            if (r6 == 0) goto L_0x053b
            r10[r5] = r11     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte r1 = r0[r5]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r10[r4] = r1     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int[] r6 = X.C137766vz.A04     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            boolean r1 = X.C137476vW.A01(r6, r1)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r1 == 0) goto L_0x04b9
            r7.write(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + 2
            goto L_0x0515
        L_0x053b:
            r7.write(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + 1
            goto L_0x0516
        L_0x0541:
            r1 = r0 & -16
            r14 = -32
            if (r1 != r14) goto L_0x05e3
            if (r0 == r14) goto L_0x0581
            r1 = -31
            if (r0 == r1) goto L_0x0553
            r1 = -19
            if (r0 == r1) goto L_0x05bc
            goto L_0x0650
        L_0x0553:
            if (r26 != 0) goto L_0x05bc
            r0 = r31
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + 5
            int r6 = r6 + -5
            byte[] r15 = X.C137766vz.A01     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r14 = 5
            r0 = 0
        L_0x0562:
            byte r12 = r31[r0]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte r1 = r15[r0]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r12 == r1) goto L_0x057a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            java.lang.String r0 = "ImageProcessor/stripMetadata invalid APP1 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            java.lang.String r0 = X.AnonymousClass1EG.A0G(r31)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x057a:
            int r0 = r0 + 1
            if (r0 < r14) goto L_0x0562
            r26 = 1
            goto L_0x05bc
        L_0x0581:
            r0 = r31
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + 5
            int r6 = r6 + -5
            byte[] r15 = X.C137766vz.A02     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r12 = 0
        L_0x058d:
            byte r1 = r31[r12]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte r0 = r15[r12]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r1 == r0) goto L_0x05b4
            byte[] r14 = X.C137766vz.A03     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r0 = 0
        L_0x0596:
            byte r12 = r31[r0]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte r1 = r14[r0]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            if (r12 == r1) goto L_0x05ae
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            java.lang.String r0 = "ImageProcessor/stripMetadata invalid APP0 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            java.lang.String r0 = X.AnonymousClass1EG.A0G(r31)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            X.C17890vO.A1A(r1, r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x05ae:
            int r0 = r0 + 1
            r1 = 5
            if (r0 >= r1) goto L_0x05bc
            goto L_0x0596
        L_0x05b4:
            int r12 = r12 + 1
            r0 = 5
            if (r12 < r0) goto L_0x058d
            if (r30 != 0) goto L_0x05d8
            goto L_0x05c1
        L_0x05bc:
            X.C137766vz.A00(r8, r6)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + r6
            goto L_0x05f1
        L_0x05c1:
            r7.write(r11)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r14)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r13)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r15)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            byte[] r0 = new byte[r6]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r30 = 1
            goto L_0x05dc
        L_0x05d8:
            X.C137766vz.A00(r8, r6)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + r6
        L_0x05dc:
            r8.readFully(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            int r9 = r9 + 2
            goto L_0x04b9
        L_0x05e3:
            byte[] r0 = new byte[r6]     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r13)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            r7.write(r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
        L_0x05f1:
            r8.readFully(r10)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x04b9
        L_0x05f6:
            if (r9 == r11) goto L_0x066b
            r12 = 1024(0x400, double:5.06E-321)
            if (r29 != 0) goto L_0x060b
            if (r9 == 0) goto L_0x0609
            long r10 = (long) r9     // Catch:{ all -> 0x0682 }
            r0 = r48
            int r0 = r0.A02     // Catch:{ all -> 0x0682 }
            long r0 = (long) r0     // Catch:{ all -> 0x0682 }
            long r0 = r0 * r12
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x060b
        L_0x0609:
            r10 = 1
            goto L_0x062c
        L_0x060b:
            r10 = 0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = "ImageSize<=MaxSize | "
            r6.append(r0)     // Catch:{ all -> 0x0682 }
            long r0 = (long) r9     // Catch:{ all -> 0x0682 }
            long r0 = r0 / r12
            r6.append(r0)     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = " <= "
            r6.append(r0)     // Catch:{ all -> 0x0682 }
            r0 = r48
            int r0 = r0.A02     // Catch:{ all -> 0x0682 }
            java.lang.String r1 = X.C17880vN.A0t(r6, r0)     // Catch:{ all -> 0x0682 }
            java.util.HashSet r0 = r3.A03     // Catch:{ all -> 0x0682 }
            r0.add(r1)     // Catch:{ all -> 0x0682 }
        L_0x062c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = "ImageProcessor/prepareImageForSend/copy size:"
            r1.append(r0)     // Catch:{ all -> 0x0682 }
            r1.append(r9)     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = " max:"
            r1.append(r0)     // Catch:{ all -> 0x0682 }
            r0 = r48
            int r0 = r0.A02     // Catch:{ all -> 0x0682 }
            r1.append(r0)     // Catch:{ all -> 0x0682 }
            java.lang.String r0 = " recompress:"
            X.C17900vP.A0n(r0, r1, r10)     // Catch:{ all -> 0x0682 }
            goto L_0x0671
        L_0x064a:
            java.lang.String r0 = "ImageProcessor/stripMetadata missing valid application signature before image"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x0650:
            java.lang.String r0 = "ImageProcessor/stripMetadata invalid APP marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x0656:
            java.lang.String r0 = "ImageProcessor/stripMetadata file too large"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0660, IOException -> 0x065c, NullPointerException -> 0x0667 }
            goto L_0x066b
        L_0x065c:
            r1 = move-exception
            java.lang.String r0 = "ImageProcessor/stripMetadata IOException"
            goto L_0x0663
        L_0x0660:
            r1 = move-exception
            java.lang.String r0 = "ImageProcessor/stripMetadata stream ended unexpectedly"
        L_0x0663:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0682 }
            goto L_0x066b
        L_0x0667:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0682 }
        L_0x066b:
            java.lang.String r0 = "ImageProcessor/prepareImageForSend/stripMetadata unable to strip metadata, file needs re-encoding"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0682 }
            r10 = 1
        L_0x0671:
            r7.close()     // Catch:{ all -> 0x068c }
            r8.close()     // Catch:{ SecurityException -> 0x0a4c }
            if (r10 != 0) goto L_0x0696
            r1 = r41
            r0 = r40
            r3.A04(r1, r0)     // Catch:{ SecurityException -> 0x0a4c }
            goto L_0x0732
        L_0x0682:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0687 }
            goto L_0x068b
        L_0x0687:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x068c }
        L_0x068b:
            throw r1     // Catch:{ all -> 0x068c }
        L_0x068c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0691 }
            goto L_0x0695
        L_0x0691:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0695:
            throw r1     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0696:
            r0 = r42
            r1 = r19
            java.io.InputStream r0 = r0.A0A(r1, r4)     // Catch:{ OutOfMemoryError -> 0x06d8 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ OutOfMemoryError -> 0x06d8 }
            r7.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x06d8 }
            byte[] r6 = X.AnonymousClass1EY.A04(r7)     // Catch:{ all -> 0x06ce }
            int r1 = r6.length     // Catch:{ all -> 0x06ce }
            r0 = r32
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r6, r5, r1, r0)     // Catch:{ all -> 0x06ce }
            if (r8 == 0) goto L_0x06c8
            int r0 = r8.getWidth()     // Catch:{ all -> 0x06ce }
            if (r0 == 0) goto L_0x06c8
            int r0 = r8.getHeight()     // Catch:{ all -> 0x06ce }
            if (r0 == 0) goto L_0x06c8
            r6 = r47
            r1 = r33
            android.graphics.Bitmap r9 = X.C26511Sk.A07(r8, r1, r6, r6)     // Catch:{ all -> 0x06ce }
            r7.close()     // Catch:{ OutOfMemoryError -> 0x06d8 }
            goto L_0x0702
        L_0x06c8:
            X.1iX r0 = new X.1iX     // Catch:{ all -> 0x06ce }
            r0.<init>()     // Catch:{ all -> 0x06ce }
            throw r0     // Catch:{ all -> 0x06ce }
        L_0x06ce:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x06d3 }
            goto L_0x06d7
        L_0x06d3:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ OutOfMemoryError -> 0x06d8 }
        L_0x06d7:
            throw r0     // Catch:{ OutOfMemoryError -> 0x06d8 }
        L_0x06d8:
            r7 = move-exception
            r0 = r32
            int r0 = r0.inSampleSize     // Catch:{ SecurityException -> 0x0a4c }
            int r6 = r0 * 2
            r0 = r32
            r0.inSampleSize = r6     // Catch:{ SecurityException -> 0x0a4c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SecurityException -> 0x0a4c }
            java.lang.String r0 = "ImageProcessor/compressToFile/oom "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r6)     // Catch:{ SecurityException -> 0x0a4c }
            com.whatsapp.util.Log.i(r0, r7)     // Catch:{ SecurityException -> 0x0a4c }
            r1 = r32
            r6 = r19
            r0 = r42
            android.graphics.Bitmap r7 = X.C25291Nq.A00(r1, r6, r0, r4)     // Catch:{ SecurityException -> 0x0a4c }
            r6 = r47
            r1 = r33
            android.graphics.Bitmap r9 = X.C26511Sk.A07(r7, r1, r6, r6)     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0702:
            int r1 = r9.getWidth()     // Catch:{ SecurityException -> 0x0a4c }
            int r0 = r9.getHeight()     // Catch:{ SecurityException -> 0x0a4c }
            r3.A04(r1, r0)     // Catch:{ SecurityException -> 0x0a4c }
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ SecurityException -> 0x0a4c }
            r2.A0A = r0     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r48
            int r1 = r0.A03     // Catch:{ SecurityException -> 0x0a4c }
            java.lang.Long r0 = X.C17880vN.A0n(r1)     // Catch:{ SecurityException -> 0x0a4c }
            r2.A0a = r0     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r48
            boolean r0 = r0 instanceof X.C1194268b     // Catch:{ IOException -> 0x0a30 }
            com.whatsapp.media.transcode.Mozjpeg r8 = X.C60892om.A00     // Catch:{ IOException -> 0x0a30 }
            java.lang.String r10 = r46.getAbsolutePath()     // Catch:{ IOException -> 0x0a30 }
            r11 = r1
            r12 = r4
            r13 = r5
            r14 = r0
            r8.A00(r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x0a30 }
            r5 = 1
            r9.recycle()     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0732:
            if (r34 == 0) goto L_0x0737
            X.C26511Sk.A0R(r46)     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0737:
            r0 = r35
            int r1 = r0.A01     // Catch:{ SecurityException -> 0x0a4c }
            r0 = r42
            r6 = r19
            android.graphics.Bitmap r6 = r0.A07(r6, r1, r1)     // Catch:{ SecurityException -> 0x0a4c }
            r1 = r20
            r0 = r46
            r1.A0G = r0     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r6.getWidth()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r6.getHeight()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r35
            int r1 = r0.A00     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r0 = r18 ^ 1
            r7 = r48
            boolean r8 = r7 instanceof X.C1194268b     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            byte[] r9 = X.C60892om.A00(r6, r1, r0, r8)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r9 != 0) goto L_0x0769
            java.io.ByteArrayOutputStream r7 = X.C108945cZ.A15()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            byte[] r9 = X.C108955ca.A1a(r0, r6, r7, r1)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0769:
            int r1 = r6.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            int r0 = r6.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            if (r1 <= r0) goto L_0x0793
            r0 = r20
            java.io.File r0 = r0.A0G     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            android.util.Pair r1 = X.C50552Uw.A00(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            if (r1 == 0) goto L_0x0793
            java.lang.Object r0 = r1.first     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            int r0 = r0.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            r7 = r20
            r7.A02 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            java.lang.Object r0 = r1.second     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            int r0 = r0.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
            r7.A03 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x0793 }
        L_0x0793:
            r6.recycle()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r38 = r9
            r0 = r20
            java.io.File r0 = r0.A0G     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            if (r0 == 0) goto L_0x07a3
            r1 = r20
            X.C26511Sk.A0Q(r1, r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x07a3:
            r0 = r20
            int r1 = r0.A08     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            int r0 = r0.A06     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r3.A04(r1, r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.io.FileInputStream r0 = X.C26511Sk.A0J(r46)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.io.BufferedInputStream r12 = new java.io.BufferedInputStream     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r12.<init>(r0)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            r28 = 0
            r27 = 0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0a28 }
            r26 = 0
            r19 = 0
            r18 = 0
            r13 = 0
            r0 = 0
            java.lang.String r15 = "ProcessImageTask/number of scans after compression = "
            r11 = 7
            r14 = 8
            if (r5 != 0) goto L_0x08ab
            if (r29 != 0) goto L_0x08ab
            r7 = 10
            r8 = 0
        L_0x07d1:
            int r5 = r12.read()     // Catch:{ IOException -> 0x0862 }
            r1 = -1
            if (r5 == r1) goto L_0x0862
            if (r13 >= r7) goto L_0x0862
            int r26 = r26 + 1
            if (r28 != 0) goto L_0x0862
            r10 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0859
            if (r0 == r4) goto L_0x084e
            r9 = 3
            r1 = r16
            if (r0 == r1) goto L_0x084a
            r1 = 4
            if (r0 == r9) goto L_0x07fa
            if (r0 == r1) goto L_0x085d
            int r9 = r19 << 8
            int r9 = r9 + r5
            int r9 = r9 - r16
            long r0 = (long) r9     // Catch:{ IOException -> 0x0862 }
            X.AnonymousClass1EY.A03(r12, r0)     // Catch:{ IOException -> 0x0862 }
            int r26 = r26 + r9
            goto L_0x0857
        L_0x07fa:
            if (r5 == r10) goto L_0x084c
            if (r5 == 0) goto L_0x0857
            r1 = 217(0xd9, float:3.04E-43)
            if (r5 != r1) goto L_0x080c
            r28 = 1
            int r0 = r26 + -2
            if (r18 <= 0) goto L_0x0853
            X.C17890vO.A1D(r6, r0)     // Catch:{ IOException -> 0x0862 }
            goto L_0x0853
        L_0x080c:
            if (r27 != 0) goto L_0x0816
            boolean r1 = A02(r5)     // Catch:{ IOException -> 0x0862 }
            if (r1 == 0) goto L_0x0816
            goto L_0x08a5
        L_0x0816:
            r1 = 194(0xc2, float:2.72E-43)
            if (r5 == r1) goto L_0x0847
            r1 = 198(0xc6, float:2.77E-43)
            if (r5 == r1) goto L_0x0847
            r1 = 202(0xca, float:2.83E-43)
            if (r5 == r1) goto L_0x0847
            r1 = 206(0xce, float:2.89E-43)
            if (r5 == r1) goto L_0x0847
            r0 = 218(0xda, float:3.05E-43)
            if (r5 != r0) goto L_0x0832
            int r0 = r26 - r16
            if (r18 <= 0) goto L_0x0841
            X.C17890vO.A1D(r6, r0)     // Catch:{ IOException -> 0x0862 }
            goto L_0x0841
        L_0x0832:
            if (r5 == r4) goto L_0x0857
            r0 = 208(0xd0, float:2.91E-43)
            if (r5 < r0) goto L_0x0845
            r0 = 215(0xd7, float:3.01E-43)
            if (r5 <= r0) goto L_0x0857
            r0 = 216(0xd8, float:3.03E-43)
            if (r5 == r0) goto L_0x0857
            goto L_0x0845
        L_0x0841:
            r13 = r18
            int r18 = r18 + 1
        L_0x0845:
            r0 = 4
            goto L_0x085e
        L_0x0847:
            r27 = 1
            goto L_0x085e
        L_0x084a:
            if (r5 != r10) goto L_0x085e
        L_0x084c:
            r0 = 3
            goto L_0x085e
        L_0x084e:
            r0 = 216(0xd8, float:3.03E-43)
            if (r5 != r0) goto L_0x0862
            goto L_0x0857
        L_0x0853:
            r13 = r18
            int r18 = r18 + 1
        L_0x0857:
            r0 = 2
            goto L_0x085e
        L_0x0859:
            if (r5 != r10) goto L_0x0862
            r0 = 1
            goto L_0x085e
        L_0x085d:
            r0 = 5
        L_0x085e:
            r19 = r5
            goto L_0x07d1
        L_0x0862:
            if (r27 == 0) goto L_0x08a5
            r3.A09(r4)     // Catch:{ all -> 0x0a28 }
            int r0 = r6.size()     // Catch:{ all -> 0x0a28 }
            if (r0 == r14) goto L_0x0880
            int r0 = r6.size()     // Catch:{ all -> 0x0a28 }
            if (r0 == r11) goto L_0x0880
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0a28 }
            X.C17890vO.A14(r15, r0, r6)     // Catch:{ all -> 0x0a28 }
            java.lang.String r1 = " does not match target=1"
            X.C17890vO.A19(r0, r1)     // Catch:{ all -> 0x0a28 }
            goto L_0x08a2
        L_0x0880:
            r45 = 1
            int r9 = A00(r6, r8)     // Catch:{ all -> 0x0a28 }
            long r0 = r46.length()     // Catch:{ all -> 0x0a28 }
            long r6 = (long) r9     // Catch:{ all -> 0x0a28 }
            long r0 = r0 - r6
            int r5 = (int) r0     // Catch:{ all -> 0x0a28 }
            r0 = 100
            if (r5 <= r0) goto L_0x08a2
            r0 = r16
            int[] r10 = new int[r0]     // Catch:{ all -> 0x0a28 }
            r5 = 0
            r10[r8] = r9     // Catch:{ all -> 0x0a26 }
            long r0 = r46.length()     // Catch:{ all -> 0x0a26 }
            long r0 = r0 - r6
            int r6 = (int) r0     // Catch:{ all -> 0x0a26 }
            r10[r4] = r6     // Catch:{ all -> 0x0a26 }
            goto L_0x0999
        L_0x08a2:
            r5 = 0
            goto L_0x09fb
        L_0x08a5:
            r5 = 0
            r3.A09(r8)     // Catch:{ all -> 0x0a26 }
            goto L_0x09fb
        L_0x08ab:
            r5 = 0
        L_0x08ac:
            r7 = 6
            int r9 = r12.read()     // Catch:{ IOException -> 0x093f }
            r1 = -1
            if (r9 == r1) goto L_0x093f
            r1 = 20
            if (r13 >= r1) goto L_0x093f
            int r26 = r26 + 1
            if (r28 != 0) goto L_0x093f
            r10 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0936
            if (r0 == r4) goto L_0x092b
            r11 = 3
            r1 = r16
            if (r0 == r1) goto L_0x0927
            r1 = 4
            if (r0 == r11) goto L_0x08d8
            if (r0 == r1) goto L_0x093a
            int r10 = r19 << 8
            int r10 = r10 + r9
            int r10 = r10 - r16
            long r0 = (long) r10     // Catch:{ IOException -> 0x093f }
            X.AnonymousClass1EY.A03(r12, r0)     // Catch:{ IOException -> 0x093f }
            int r26 = r26 + r10
            goto L_0x0934
        L_0x08d8:
            if (r9 == r10) goto L_0x0929
            if (r9 == 0) goto L_0x0934
            r1 = 217(0xd9, float:3.04E-43)
            if (r9 != r1) goto L_0x08ea
            r28 = 1
            int r0 = r26 + -2
            if (r18 <= 0) goto L_0x0930
            X.C17890vO.A1D(r6, r0)     // Catch:{ IOException -> 0x093f }
            goto L_0x0930
        L_0x08ea:
            if (r27 != 0) goto L_0x08f3
            boolean r1 = A02(r9)     // Catch:{ IOException -> 0x093f }
            if (r1 == 0) goto L_0x08f3
            goto L_0x093f
        L_0x08f3:
            r1 = 194(0xc2, float:2.72E-43)
            if (r9 == r1) goto L_0x0924
            r1 = 198(0xc6, float:2.77E-43)
            if (r9 == r1) goto L_0x0924
            r1 = 202(0xca, float:2.83E-43)
            if (r9 == r1) goto L_0x0924
            r1 = 206(0xce, float:2.89E-43)
            if (r9 == r1) goto L_0x0924
            r0 = 218(0xda, float:3.05E-43)
            if (r9 != r0) goto L_0x090f
            int r0 = r26 - r16
            if (r18 <= 0) goto L_0x091e
            X.C17890vO.A1D(r6, r0)     // Catch:{ IOException -> 0x093f }
            goto L_0x091e
        L_0x090f:
            if (r9 == r4) goto L_0x0934
            r0 = 208(0xd0, float:2.91E-43)
            if (r9 < r0) goto L_0x0922
            r0 = 215(0xd7, float:3.01E-43)
            if (r9 <= r0) goto L_0x0934
            r0 = 216(0xd8, float:3.03E-43)
            if (r9 == r0) goto L_0x0934
            goto L_0x0922
        L_0x091e:
            r13 = r18
            int r18 = r18 + 1
        L_0x0922:
            r0 = 4
            goto L_0x093b
        L_0x0924:
            r27 = 1
            goto L_0x093b
        L_0x0927:
            if (r9 != r10) goto L_0x093b
        L_0x0929:
            r0 = 3
            goto L_0x093b
        L_0x092b:
            r0 = 216(0xd8, float:3.03E-43)
            if (r9 != r0) goto L_0x093f
            goto L_0x0934
        L_0x0930:
            r13 = r18
            int r18 = r18 + 1
        L_0x0934:
            r0 = 2
            goto L_0x093b
        L_0x0936:
            if (r9 != r10) goto L_0x093f
            r0 = 1
            goto L_0x093b
        L_0x093a:
            r0 = 5
        L_0x093b:
            r19 = r9
            goto L_0x08ac
        L_0x093f:
            r9 = 4
            r18 = 3
            if (r8 == 0) goto L_0x099c
            int r1 = r6.size()     // Catch:{ all -> 0x0a26 }
            r0 = 9
            if (r1 != r0) goto L_0x099c
            r3.A09(r4)     // Catch:{ all -> 0x0a26 }
            r45 = 1
            int r14 = A00(r6, r5)     // Catch:{ all -> 0x0a26 }
            r0 = r16
            int r13 = A00(r6, r0)     // Catch:{ all -> 0x0a26 }
            int r13 = r13 - r14
            r0 = 7
            int r11 = A00(r6, r0)     // Catch:{ all -> 0x0a26 }
            r0 = r16
            int r0 = A00(r6, r0)     // Catch:{ all -> 0x0a26 }
            int r11 = r11 - r0
            long r0 = r46.length()     // Catch:{ all -> 0x0a26 }
            r7 = 7
            int r7 = A00(r6, r7)     // Catch:{ all -> 0x0a26 }
            long r7 = (long) r7     // Catch:{ all -> 0x0a26 }
            long r0 = r0 - r7
            int r7 = (int) r0     // Catch:{ all -> 0x0a26 }
            r0 = r16
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0a26 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0a26 }
            java.lang.Long r0 = X.C17890vO.A0N(r0)     // Catch:{ all -> 0x0a26 }
            r2.A0M = r0     // Catch:{ all -> 0x0a26 }
            r0 = 7
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0a26 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0a26 }
            java.lang.Long r0 = X.C17890vO.A0N(r0)     // Catch:{ all -> 0x0a26 }
            r2.A0O = r0     // Catch:{ all -> 0x0a26 }
            int[] r10 = new int[r9]     // Catch:{ all -> 0x0a26 }
            r10[r5] = r14     // Catch:{ all -> 0x0a26 }
            r10[r4] = r13     // Catch:{ all -> 0x0a26 }
            r10[r16] = r11     // Catch:{ all -> 0x0a26 }
            r10[r18] = r7     // Catch:{ all -> 0x0a26 }
        L_0x0999:
            r39 = r10
            goto L_0x09fb
        L_0x099c:
            int r0 = r6.size()     // Catch:{ all -> 0x0a26 }
            if (r0 != r14) goto L_0x09ec
            r3.A09(r4)     // Catch:{ all -> 0x0a26 }
            r45 = 1
            int r13 = A00(r6, r5)     // Catch:{ all -> 0x0a26 }
            r0 = 5
            int r11 = A00(r6, r0)     // Catch:{ all -> 0x0a26 }
            int r11 = r11 - r13
            int r10 = A00(r6, r7)     // Catch:{ all -> 0x0a26 }
            int r0 = A00(r6, r0)     // Catch:{ all -> 0x0a26 }
            int r10 = r10 - r0
            long r0 = r46.length()     // Catch:{ all -> 0x0a26 }
            int r8 = A00(r6, r7)     // Catch:{ all -> 0x0a26 }
            long r8 = (long) r8     // Catch:{ all -> 0x0a26 }
            long r0 = r0 - r8
            int r8 = (int) r0     // Catch:{ all -> 0x0a26 }
            r0 = 5
            java.lang.Object r0 = r6.get(r0)     // Catch:{ all -> 0x0a26 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0a26 }
            java.lang.Long r0 = X.C17890vO.A0N(r0)     // Catch:{ all -> 0x0a26 }
            r2.A0M = r0     // Catch:{ all -> 0x0a26 }
            java.lang.Object r0 = r6.get(r7)     // Catch:{ all -> 0x0a26 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0a26 }
            java.lang.Long r0 = X.C17890vO.A0N(r0)     // Catch:{ all -> 0x0a26 }
            r2.A0O = r0     // Catch:{ all -> 0x0a26 }
            r0 = 4
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0a26 }
            r0[r5] = r13     // Catch:{ all -> 0x0a26 }
            r0[r4] = r11     // Catch:{ all -> 0x0a26 }
            r0[r16] = r10     // Catch:{ all -> 0x0a26 }
            r0[r18] = r8     // Catch:{ all -> 0x0a26 }
            r39 = r0
            goto L_0x09fb
        L_0x09ec:
            r3.A09(r5)     // Catch:{ all -> 0x0a26 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0a26 }
            X.C17890vO.A14(r15, r0, r6)     // Catch:{ all -> 0x0a26 }
            java.lang.String r1 = " does not match target=8"
            X.C17890vO.A19(r0, r1)     // Catch:{ all -> 0x0a26 }
        L_0x09fb:
            r12.close()     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r0 = r20
            int r0 = r0.A06     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r24 = r0
            r0 = r20
            int r0 = r0.A08     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r23 = r0
            r0 = r20
            int r0 = r0.A02     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r21 = r0
            r0 = r20
            int r0 = r0.A03     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r22 = r0
            r0 = r20
            java.io.File r0 = r0.A0G     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r25 = r0
            r44 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            r2.A04 = r0     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            goto L_0x0b15
        L_0x0a26:
            r1 = move-exception
            goto L_0x0a2a
        L_0x0a28:
            r1 = move-exception
            r5 = 0
        L_0x0a2a:
            throw r1     // Catch:{ all -> 0x0a2b }
        L_0x0a2b:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
            goto L_0x0a5e
        L_0x0a30:
            r8 = move-exception
            long r6 = r43.A01()     // Catch:{ all -> 0x0a47 }
            r0 = r48
            int r0 = r0.A02     // Catch:{ all -> 0x0a47 }
            long r0 = (long) r0     // Catch:{ all -> 0x0a47 }
            r4 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r4
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a46
            java.lang.String r0 = "ImageProcessor/compressToFile/No space left on device"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a47 }
        L_0x0a46:
            throw r8     // Catch:{ all -> 0x0a47 }
        L_0x0a47:
            r0 = move-exception
            r9.recycle()     // Catch:{ SecurityException -> 0x0a4c }
            throw r0     // Catch:{ SecurityException -> 0x0a4c }
        L_0x0a4c:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            java.lang.String r0 = "ImageProcessor/processImageForSend/securityException"
            X.C108995ce.A1M(r0, r1, r4)     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
            throw r4     // Catch:{ 2RM -> 0x0afd, 1iX -> 0x0af5, IOException -> 0x0abe, OutOfMemoryError -> 0x0a7f, SecurityException -> 0x0a69 }
        L_0x0a57:
            r5 = 0
            java.lang.String r0 = "File path is invalid"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
        L_0x0a5e:
            throw r0     // Catch:{ 2RM -> 0x0a66, 1iX -> 0x0a63, IOException -> 0x0ac1, OutOfMemoryError -> 0x0a61, SecurityException -> 0x0a5f }
        L_0x0a5f:
            r1 = move-exception
            goto L_0x0a6b
        L_0x0a61:
            r4 = move-exception
            goto L_0x0a81
        L_0x0a63:
            r1 = move-exception
            goto L_0x0af7
        L_0x0a66:
            r1 = move-exception
            goto L_0x0aff
        L_0x0a69:
            r1 = move-exception
            r5 = 0
        L_0x0a6b:
            r44 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0b61 }
            r2.A04 = r0     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = "mediatranscodequeue/image/security "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0b61 }
            A01(r3, r1)     // Catch:{ all -> 0x0b61 }
            r1 = 2131892909(0x7f121aad, float:1.942058E38)
            goto L_0x0ab6
        L_0x0a7f:
            r4 = move-exception
            r5 = 0
        L_0x0a81:
            r44 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0b61 }
            r2.A04 = r0     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = "mediatranscodequeue/image/oom/ "
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = X.C17890vO.A0U(r4)     // Catch:{ all -> 0x0b61 }
            r2.A0g = r0     // Catch:{ all -> 0x0b61 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0b61 }
            r1.append(r0)     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = " | Trace: "
            r1.append(r0)     // Catch:{ all -> 0x0b61 }
            java.lang.StackTraceElement[] r0 = r4.getStackTrace()     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0b61 }
            r3.A08(r0)     // Catch:{ all -> 0x0b61 }
            r1 = 2131889999(0x7f120f4f, float:1.9414677E38)
        L_0x0ab6:
            r0 = r49
            X.E6h r0 = r0.A05     // Catch:{ all -> 0x0b61 }
            r0.BJ0(r1)     // Catch:{ all -> 0x0b61 }
            goto L_0x0b0f
        L_0x0abe:
            r6 = move-exception
            r5 = 0
            goto L_0x0ac2
        L_0x0ac1:
            r6 = move-exception
        L_0x0ac2:
            r44 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0b61 }
            r2.A04 = r0     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = "mediatranscodequeue/image/io/ "
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0b61 }
            java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x0b61 }
            if (r0 == 0) goto L_0x0ae7
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0b61 }
            if (r1 == 0) goto L_0x0ae7
            java.lang.String r0 = "No space"
            boolean r4 = X.AnonymousClass1YF.A0Y(r1, r0, r5)     // Catch:{ all -> 0x0b61 }
            r1 = 1
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            if (r4 == r1) goto L_0x0aea
        L_0x0ae7:
            r0 = 2131889970(0x7f120f32, float:1.9414619E38)
        L_0x0aea:
            r1 = r49
            X.E6h r1 = r1.A05     // Catch:{ all -> 0x0b61 }
            r1.BJ0(r0)     // Catch:{ all -> 0x0b61 }
            A01(r3, r6)     // Catch:{ all -> 0x0b61 }
            goto L_0x0b0f
        L_0x0af5:
            r1 = move-exception
            r5 = 0
        L_0x0af7:
            java.lang.String r0 = "mediatranscodequeue/image/not-a-image/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0b61 }
            goto L_0x0b04
        L_0x0afd:
            r1 = move-exception
            r5 = 0
        L_0x0aff:
            java.lang.String r0 = "mediatranscodequeue/image/not-an-image/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0b61 }
        L_0x0b04:
            r44 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0b61 }
            r2.A04 = r0     // Catch:{ all -> 0x0b61 }
            A01(r3, r1)     // Catch:{ all -> 0x0b61 }
        L_0x0b0f:
            r0 = r50
            android.os.PowerManager$WakeLock r0 = r0.A00
            r17 = r0
        L_0x0b15:
            if (r17 == 0) goto L_0x0b20
            boolean r0 = r17.isHeld()
            if (r0 == 0) goto L_0x0b20
            r17.release()
        L_0x0b20:
            X.2KN r0 = new X.2KN
            r34 = r0
            r35 = r25
            r40 = r24
            r41 = r23
            r42 = r21
            r43 = r22
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r1 = r0.A03
            if (r1 == 0) goto L_0x0b5d
            int[] r4 = r0.A05
            int r1 = r4.length
            if (r1 == 0) goto L_0x0b42
            r1 = r4[r5]
            java.lang.Long r1 = X.C17880vN.A0n(r1)
            r2.A0L = r1
        L_0x0b42:
            java.io.File r1 = r0.A00
            X.C17960vV.A07(r1)
            long r1 = r1.length()
            r3.A05(r1)
            byte[] r1 = r0.A04
            if (r1 == 0) goto L_0x0b5b
            int r1 = r1.length
        L_0x0b53:
            long r1 = (long) r1
            r3.A06(r1)
            r3.A02()
        L_0x0b5a:
            return r0
        L_0x0b5b:
            r1 = 0
            goto L_0x0b53
        L_0x0b5d:
            r3.A01()
            return r0
        L_0x0b61:
            r2 = move-exception
            r0 = r50
            android.os.PowerManager$WakeLock r1 = r0.A00
            if (r1 == 0) goto L_0x0b71
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0b71
            r1.release()
        L_0x0b71:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68Y.A07():X.2fe");
    }

    public static int A00(AbstractList abstractList, int i) {
        return ((Integer) abstractList.get(i)).intValue();
    }

    public static final void A01(AnonymousClass70S r2, Exception exc) {
        r2.A01.A0g = C17890vO.A0U(exc);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(exc.getMessage());
        A10.append(" | Trace: ");
        r2.A08(AnonymousClass000.A0y(Arrays.toString(exc.getStackTrace()), A10));
    }
}
