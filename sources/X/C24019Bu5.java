package X;

import android.os.PowerManager;
import android.util.Pair;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.Bu5  reason: case insensitive filesystem */
public final class C24019Bu5 extends C27086DTl {
    public final AnonymousClass190 A00;
    public final C218617r A01;
    public final AnonymousClass196 A02;
    public final AnonymousClass1ST A03;
    public final C18030ve A04;
    public final WamediaManager A05;
    public final C24015Bu1 A06;
    public final C26431Sc A07;
    public final CT1 A08;
    public final AnonymousClass1NL A09;
    public final AnonymousClass1SO A0A;
    public final PowerManager.WakeLock A0B;

    private final CX7 A00(CX7 cx7, AnonymousClass21V r9, File file) {
        C62572rc r0;
        File file2;
        File file3;
        if (!(r9 == null || r9.A05 == null || ((r0 = r9.A02) != null && (file3 = r0.A0G) != null && !file3.exists()))) {
            try {
                C62572rc r02 = r9.A02;
                if (!(r02 == null || (file2 = r02.A0G) == null)) {
                    C64062u9.A0E(this.A09, file2, file);
                }
                if (!C18070vi.A18(r9.A05, C1402370n.A00(file))) {
                    C64062u9.A0Q(file);
                    return null;
                }
                byte[] A042 = C1408873l.A04(file);
                Pair A0D = C26511Sk.A0D(file);
                C18070vi.A0X(A0D);
                C24015Bu1 bu1 = this.A06;
                if (bu1.A04 != null) {
                    AnonymousClass70S r3 = bu1.A01;
                    int i = 0;
                    int i2 = r9.A0D;
                    AnonymousClass64V r2 = r3.A01;
                    C27086DTl.A06(r3, r2, file, i2);
                    C27086DTl.A05(A0D, r3);
                    if (A042 != null) {
                        i = A042.length;
                    }
                    r3.A06((long) i);
                    r2.A05 = true;
                    cx7.A00 = r9.A0D;
                    cx7.A01 = file;
                    cx7.A05 = A042;
                    cx7.A04 = true;
                    return cx7;
                }
            } catch (IOException e) {
                Log.e("ProcessVideoTask/processVideo/mediatranscodequeue/attemptReuseExistingVideo", e);
                C64062u9.A0Q(file);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24019Bu5(PowerManager.WakeLock wakeLock, AnonymousClass190 r3, C218617r r4, AnonymousClass196 r5, AnonymousClass1ST r6, C18030ve r7, WamediaManager wamediaManager, C24015Bu1 bu1, C26431Sc r10, CT1 ct1, AnonymousClass1NL r12, AnonymousClass1SO r13) {
        super(bu1);
        C18070vi.A0d(ct1, 10);
        C18070vi.A0d(bu1, 11);
        this.A04 = r7;
        this.A00 = r3;
        this.A01 = r4;
        this.A07 = r10;
        this.A05 = wamediaManager;
        this.A02 = r5;
        this.A0A = r13;
        this.A03 = r6;
        this.A09 = r12;
        this.A08 = ct1;
        this.A06 = bu1;
        this.A0B = wakeLock;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v55, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v70, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v161, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v162, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.CX7, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x041a, code lost:
        if (r53 != false) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x041c, code lost:
        r2 = X.C1408873l.A04(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0422, code lost:
        if (r16 <= 0) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0424, code lost:
        if (r2 != 0) goto L_0x042b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0426, code lost:
        com.whatsapp.util.Log.w("ProcessGifTask/could not get video thumb");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x042b, code lost:
        r3 = X.C26511Sk.A03(r7);
        r0 = X.C26511Sk.A0D(r7);
        X.C18070vi.A0X(r0);
        X.C27086DTl.A06(r4, r8, r7, r3);
        X.C27086DTl.A05(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x043c, code lost:
        if (r2 == 0) goto L_0x044c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x043e, code lost:
        r0 = (long) r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0440, code lost:
        r4.A06(r0);
        r9.A00 = r3;
        r9.A01 = r7;
        r9.A05 = r2;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x044c, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x045d, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x045f, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0461, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0463, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0465, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0469, code lost:
        r8 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x046c, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x046f, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0472, code lost:
        r1 = e;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0475, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0476, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x047c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x047d, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0480, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0481, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0485, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        A01(r4, r1, 2131889957);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0488, code lost:
        if (r28 != null) goto L_0x048a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x048a, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x048f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0490, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0493, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0494, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0498, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        A01(r4, r1, 2131889957);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x049d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x049e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04a1, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04a2, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04a6, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        A01(r4, r1, 2131889957);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04a9, code lost:
        if (r28 != null) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04ab, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04b0, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04b1, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04b4, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04b5, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04b9, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        A01(r4, r1, 2131889957);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04bc, code lost:
        if (r28 != null) goto L_0x04be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04be, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04c3, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04c4, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x04c7, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04c8, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04cc, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:?, code lost:
        A01(r4, r1, 2131889957);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04cf, code lost:
        if (r28 != null) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04d1, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04d6, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x04d7, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x04fe, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0502, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0503, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0517, code lost:
        A01(r4, r8, 2131889993);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x051b, code lost:
        A01(r4, r8, 2131889980);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0523, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0527, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0528, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x052b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x052c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0530, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        A01(r4, r1, 2131889980);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0533, code lost:
        if (r28 != null) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0535, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0539, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x053a, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x053d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x053e, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0542, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:?, code lost:
        A01(r4, r1, 2131890006);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0545, code lost:
        if (r28 != null) goto L_0x0547;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0547, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x054b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x054c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x054f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0550, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0554, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        A01(r4, r1, 2131890006);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0557, code lost:
        if (r28 != null) goto L_0x0559;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0559, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x055d, code lost:
        if (r28 != null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x055f, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0575, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0576, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x057a, code lost:
        r3 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x057b, code lost:
        if (r28 == null) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x057e, code lost:
        r3 = th;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x057f, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x038e A[Catch:{ 2RS -> 0x03a5, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x03f8 A[Catch:{ 2RS -> 0x03a5, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x045d A[ExcHandler: C2Z (e X.C2Z), PHI: r2 
      PHI: (r2v50 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v106 java.lang.String), (r2v116 java.lang.String), (r2v127 java.lang.String), (r2v137 java.lang.String), (r2v148 java.lang.String), (r2v159 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x045f A[ExcHandler: C1l (e X.C1l), PHI: r2 
      PHI: (r2v49 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v105 java.lang.String), (r2v115 java.lang.String), (r2v126 java.lang.String), (r2v136 java.lang.String), (r2v147 java.lang.String), (r2v158 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0461 A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), PHI: r2 
      PHI: (r2v48 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v104 java.lang.String), (r2v114 java.lang.String), (r2v125 java.lang.String), (r2v135 java.lang.String), (r2v146 java.lang.String), (r2v157 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0463 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), PHI: r2 
      PHI: (r2v47 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v103 java.lang.String), (r2v113 java.lang.String), (r2v124 java.lang.String), (r2v134 java.lang.String), (r2v145 java.lang.String), (r2v156 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0465 A[ExcHandler: 1Sd (e X.1Sd), PHI: r2 
      PHI: (r2v46 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v102 java.lang.String), (r2v112 java.lang.String), (r2v123 java.lang.String), (r2v133 java.lang.String), (r2v144 java.lang.String), (r2v155 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0469 A[ExcHandler: IOException (e java.io.IOException), PHI: r2 
      PHI: (r2v44 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v100 java.lang.String), (r2v111 java.lang.String), (r2v121 java.lang.String), (r2v132 java.lang.String), (r2v142 java.lang.String), (r2v153 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x046c A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), PHI: r2 
      PHI: (r2v43 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v99 java.lang.String), (r2v110 java.lang.String), (r2v120 java.lang.String), (r2v131 java.lang.String), (r2v141 java.lang.String), (r2v152 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x046f A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), PHI: r2 
      PHI: (r2v42 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v98 java.lang.String), (r2v109 java.lang.String), (r2v119 java.lang.String), (r2v130 java.lang.String), (r2v140 java.lang.String), (r2v151 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0472 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), PHI: r2 
      PHI: (r2v41 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v97 java.lang.String), (r2v108 java.lang.String), (r2v118 java.lang.String), (r2v129 java.lang.String), (r2v139 java.lang.String), (r2v150 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0475 A[ExcHandler: 2RS (e X.2RS), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0480 A[ExcHandler: C2Z (e X.C2Z), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0493 A[ExcHandler: C1l (e X.C1l), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04a1 A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04ab  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04b4 A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04c7 A[ExcHandler: 1Sd (e X.1Sd), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04d1  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0517 A[Catch:{ all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x051b A[Catch:{ all -> 0x057a }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x052b A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0535  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x053d A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x054f A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:31:0x00ef] */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0575 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:33:0x0125] */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x057e A[ExcHandler: all (th java.lang.Throwable), PHI: r2 
      PHI: (r2v40 java.lang.String) = (r2v51 java.lang.String), (r2v62 java.lang.String), (r2v107 java.lang.String), (r2v117 java.lang.String), (r2v128 java.lang.String), (r2v138 java.lang.String), (r2v149 java.lang.String), (r2v160 java.lang.String) binds: [B:201:0x0452, B:148:0x036b, B:171:0x03bb, B:157:0x0397, B:164:0x03a7, B:158:?, B:160:0x03a2, B:161:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:148:0x036b] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e5 A[Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0219 A[Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0223 A[Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C55362fe A07() {
        /*
            r55 = this;
            r6 = r55
            android.os.PowerManager$WakeLock r0 = r6.A0B
            r25 = r0
            X.Bu1 r5 = r6.A06
            X.70S r4 = r5.A01
            X.CX7 r9 = new X.CX7
            r9.<init>()
            java.io.File r7 = r5.A06
            r0 = 3
            X.64V r8 = r4.A01
            java.lang.Integer r33 = java.lang.Integer.valueOf(r0)
            r0 = r33
            r8.A07 = r0
            boolean r0 = r5.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A01 = r0
            r4.A00()
            java.io.File r0 = r5.A04
            r32 = r0
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "ProcessGifTask/processGif/failed to load, check MediaLoadGifJob logs to see details."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "FailedToLoad"
            r8.A0g = r0
            java.lang.String r0 = "Input file null"
            r4.A08(r0)
            r1 = 2131890006(0x7f120f56, float:1.9414692E38)
            X.E6h r0 = r5.A05
            r0.BJ0(r1)
        L_0x0043:
            r0 = 0
        L_0x0044:
            r9.A04 = r0
        L_0x0046:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x0083
            X.0ve r10 = r6.A04
            r0 = 12261(0x2fe5, float:1.7181E-41)
            X.0vf r8 = X.C18040vf.A02
            int r14 = X.C18020vd.A00(r8, r10, r0)
            if (r14 < 0) goto L_0x0083
            X.190 r11 = r6.A00
            X.1D6 r13 = X.C26521Sl.A0X(r7)
            long r2 = r5.A00
            long r0 = r5.A01
            r19 = 1
            r7 = 0
            r12 = r5
            r15 = r2
            r17 = r0
            r20 = r7
            boolean r0 = X.C26521Sl.A0b(r11, r12, r13, r14, r15, r17, r19, r20)
            if (r0 != 0) goto L_0x0083
            r0 = 12260(0x2fe4, float:1.718E-41)
            boolean r0 = X.C18020vd.A05(r8, r10, r0)
            if (r0 == 0) goto L_0x0083
            r9.A04 = r7
            X.CXH r0 = r6.A00
            r1 = 2131890006(0x7f120f56, float:1.9414692E38)
            X.E6h r0 = r0.A05
            r0.BJ0(r1)
        L_0x0083:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x008f
            r4.A02()
        L_0x008a:
            X.Bu3 r0 = r9.A00()
            return r0
        L_0x008f:
            r4.A01()
            goto L_0x008a
        L_0x0093:
            long r0 = r5.A00
            r16 = r0
            long r0 = r5.A01
            r22 = r0
            X.CmO r0 = r5.A02
            r42 = r0
            X.0ve r0 = r6.A04
            r54 = r0
            r2 = 3656(0xe48, float:5.123E-42)
            X.0vf r31 = X.C18040vf.A02
            r1 = r31
            int r3 = X.C18020vd.A00(r1, r0, r2)
            boolean r0 = r5.A06
            r30 = r0
            r2 = 3654(0xe46, float:5.12E-42)
            if (r0 == 0) goto L_0x00b7
            r2 = 594(0x252, float:8.32E-43)
        L_0x00b7:
            r0 = r54
            int r1 = X.C18020vd.A00(r1, r0, r2)
            r0 = 1280(0x500, float:1.794E-42)
            int r14 = java.lang.Math.min(r1, r0)
            r2 = 3655(0xe47, float:5.122E-42)
            r1 = r31
            r0 = r54
            int r0 = X.C18020vd.A00(r1, r0, r2)
            long r0 = X.C17890vO.A03(r0)
            int r2 = (int) r0
            X.DRK.A04(r32)     // Catch:{ IOException -> 0x00d8 }
            r52 = 1
            goto L_0x00da
        L_0x00d8:
            r52 = 0
        L_0x00da:
            X.2mD r29 = new X.2mD
            r1 = r29
            r1.<init>(r3, r14, r2)
            X.73s r1 = r5.A03
            boolean r53 = X.AnonymousClass000.A1W(r1)
            r28 = 0
            X.CT1 r3 = r6.A08     // Catch:{ IllegalStateException -> 0x054b, IllegalArgumentException -> 0x0539, FileNotFoundException -> 0x0527, IOException -> 0x0502, 2RS -> 0x04d6, 1Sd -> 0x04c3, InterruptedException -> 0x04b0, ExecutionException -> 0x049d, C1l -> 0x048f, C2Z -> 0x047c, all -> 0x0578 }
            X.190 r0 = r6.A00     // Catch:{ IllegalStateException -> 0x054b, IllegalArgumentException -> 0x0539, FileNotFoundException -> 0x0527, IOException -> 0x0502, 2RS -> 0x04d6, 1Sd -> 0x04c3, InterruptedException -> 0x04b0, ExecutionException -> 0x049d, C1l -> 0x048f, C2Z -> 0x047c, all -> 0x0578 }
            r19 = r0
            X.118 r0 = r3.A01     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            r18 = r0
            X.0ve r0 = r3.A02     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            r15 = r0
            X.10I r0 = r3.A05     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            r13 = r0
            X.1Sc r0 = r3.A04     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            r12 = r0
            com.whatsapp.media.WamediaManager r11 = r3.A03     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            X.1NM r0 = r3.A00     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            X.DPW r10 = new X.DPW     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            r34 = r10
            r35 = r19
            r36 = r4
            r37 = r0
            r38 = r18
            r39 = r15
            r40 = r11
            r41 = r12
            r43 = r13
            r44 = r32
            r45 = r7
            r46 = r14
            r47 = r2
            r48 = r16
            r50 = r22
            r34.<init>(r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r52)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0578 }
            r28 = r10
            r5.A00(r10)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r53 == 0) goto L_0x012c
            r10.A03 = r1     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x012c:
            long r26 = r32.length()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            android.util.Pair r2 = X.C26511Sk.A0A(r32)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.Long r0 = java.lang.Long.valueOf(r26)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r8.A0W = r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r53 == 0) goto L_0x0143
            java.util.HashSet r1 = r4.A02     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.String r0 = "doodle"
            r1.add(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x0143:
            int r0 = X.C108965cb.A01(r2)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r8.A0U = r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            int r0 = X.C108965cb.A00(r2)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r8.A0R = r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.Long r0 = X.C17880vN.A0n(r14)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r8.A0Z = r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r2 = 0
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0173
            int r0 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0173
            java.lang.String r1 = "trim"
            java.util.HashSet r0 = r4.A02     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0.add(r1)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x0173:
            r24 = 1
            X.DPU r1 = new X.DPU     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = r24
            r1.<init>(r6, r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r10.A02 = r1     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r10.A05 = r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.196 r0 = r6.A02     // Catch:{ Exception -> 0x018e }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x018e }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x018e }
            goto L_0x0194
        L_0x018e:
            r1 = move-exception
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x0194:
            com.whatsapp.media.WamediaManager r15 = r6.A05     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.71x r11 = new X.71x     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = r32
            r11.<init>(r15, r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r52 == 0) goto L_0x01a1
            r0 = 3
            goto L_0x01b7
        L_0x01a1:
            boolean r0 = X.AnonymousClass112.A01()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x01be
            boolean r0 = X.CDR.A00(r11)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x01ab:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            int r0 = X.AnonymousClass000.A09(r0)
        L_0x01b7:
            r4.A03(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r4.A07(r11)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            goto L_0x01c0
        L_0x01be:
            r0 = 0
            goto L_0x01ab
        L_0x01c0:
            if (r25 == 0) goto L_0x01c5
            r25.acquire()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x01c5:
            boolean r0 = r32.exists()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x044f
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x01dd
            int r0 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01da
            long r0 = r11.A03     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x01da
            goto L_0x01dd
        L_0x01da:
            r21 = 0
            goto L_0x01df
        L_0x01dd:
            r21 = 1
        L_0x01df:
            int r13 = r11.A02     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            int r12 = r11.A00     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r13 < r12) goto L_0x0223
            int r12 = r12 * r14
            int r12 = r12 / r13
            r13 = r14
        L_0x01e8:
            long r0 = X.C26511Sk.A05(r32)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            long r19 = X.C17880vN.A04(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = r42
            boolean r0 = r0.A07     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r18 = r0
            X.1Sc r0 = r6.A07     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r14 = r0
            r2 = r26
            r0 = r19
            android.util.Pair r3 = r14.A0A(r2, r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.1So r48 = X.C26551So.A04     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r47 = r14
            r49 = r32
            r50 = r26
            r52 = r18
            boolean r2 = r47.A0G(r48, r49, r50, r52, r53)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = 13
            r1 = r29
            android.util.Pair r1 = X.C26431Sc.A04(r1, r11, r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r2 != 0) goto L_0x0279
            java.lang.Object r0 = r3.first     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.C18070vi.A0W(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            goto L_0x0227
        L_0x0223:
            int r13 = r13 * r14
            int r13 = r13 / r12
            r12 = r14
            goto L_0x01e8
        L_0x0227:
            if (r0 != 0) goto L_0x0279
            java.lang.Object r0 = r1.first     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.C18070vi.A0W(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 != 0) goto L_0x0279
            if (r21 != 0) goto L_0x0279
            java.lang.String r0 = "MediaEligibleToSend"
            java.util.HashSet r2 = r4.A03     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.Object r0 = r3.second     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x0245:
            boolean r0 = r3.hasNext()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x0253
            java.lang.String r0 = X.C17880vN.A0v(r3)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            goto L_0x0245
        L_0x0253:
            java.lang.Object r0 = r1.second     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x025b:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x0269
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r2.add(r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            goto L_0x025b
        L_0x0269:
            java.lang.String r0 = "ProcessGifTask/processGif/apply-gif-tag-only"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.17r r1 = r6.A01     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = r32
            r1.A0i(r0, r7)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r1 = 1
            r2 = 0
            goto L_0x038a
        L_0x0279:
            java.lang.String r0 = "ProcessGifTask/processGif/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r2 = 8501(0x2135, float:1.1912E-41)
            r1 = r31
            r0 = r54
            boolean r3 = X.C18020vd.A05(r1, r0, r2)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r1 = 0
            int r0 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0369
            int r0 = (r22 > r1 ? 1 : (r22 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0369
            if (r53 != 0) goto L_0x0369
            if (r3 != 0) goto L_0x0369
            r2 = 8413(0x20dd, float:1.1789E-41)
            r1 = r31
            r0 = r54
            boolean r0 = X.C18020vd.A05(r1, r0, r2)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x0369
            java.lang.String r1 = X.C1402370n.A00(r32)     // Catch:{ IOException -> 0x02fe, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r30 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r2 = 2
            goto L_0x02be
        L_0x02ab:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r1)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.String r0 = "-hd"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            byte[] r0 = X.C108975cc.A1O(r0)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r2 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x02be:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r1)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.String r0 = "-mute"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.nio.charset.Charset r14 = X.C26571Sq.A05     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            byte[] r0 = r3.getBytes(r14)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r18 == 0) goto L_0x02ff
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r1)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r11 = 45
            r3.append(r11)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = r42
            int r0 = r0.A01     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r3.append(r0)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r3.append(r11)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            r0 = r42
            int r0 = r0.A00     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.String r3 = X.C17880vN.A0t(r3, r0)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            byte[] r0 = r3.getBytes(r14)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.C18070vi.A0X(r0)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ IOException -> 0x02ff, IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            goto L_0x02ff
        L_0x02fe:
            r1 = 0
        L_0x02ff:
            java.lang.String r0 = "ProcessGifTask/processGif/attemptReuseExistingGif"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.1ST r2 = r6.A03     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.21V r0 = r2.A0B(r1)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x0313
            X.CX7 r14 = r6.A00(r9, r0, r7)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r14 == 0) goto L_0x0313
            goto L_0x034d
        L_0x0313:
            r14 = 0
            if (r1 == 0) goto L_0x034d
            r0 = 13
            java.util.ArrayList r0 = r2.A0E(r1, r0)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x0324:
            boolean r0 = r11.hasNext()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x0336
            java.lang.Object r2 = r11.next()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            boolean r0 = r2 instanceof X.C440021t     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x0324
            r3.add(r2)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            goto L_0x0324
        L_0x0336:
            java.util.Iterator r2 = r3.iterator()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
        L_0x033a:
            boolean r0 = r2.hasNext()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r0 == 0) goto L_0x034d
            java.lang.Object r0 = r2.next()     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.21t r0 = (X.C440021t) r0     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            X.CX7 r3 = r6.A00(r9, r0, r7)     // Catch:{ IllegalStateException -> 0x054f, IllegalArgumentException -> 0x053d, FileNotFoundException -> 0x052b, IOException -> 0x0478, 2RS -> 0x0475, 1Sd -> 0x04c7, InterruptedException -> 0x04b4, ExecutionException -> 0x04a1, C1l -> 0x0493, C2Z -> 0x0480, all -> 0x0575 }
            if (r3 == 0) goto L_0x033a
            goto L_0x034e
        L_0x034d:
            r3 = r14
        L_0x034e:
            r2 = 0
            if (r3 == 0) goto L_0x036b
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            if (r25 == 0) goto L_0x0361
            boolean r1 = r25.isHeld()
            r0 = r24
            if (r1 != r0) goto L_0x0361
            r25.release()
        L_0x0361:
            X.196 r0 = r6.A02
            r0.A01()
            r9 = r3
            goto L_0x0046
        L_0x0369:
            r2 = 0
            goto L_0x036d
        L_0x036b:
            r9.A03 = r1     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
        L_0x036d:
            int r13 = r13 * r12
            float r0 = (float) r13     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r1 = 1209401344(0x48160000, float:153600.0)
            float r1 = r1 / r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = java.lang.Math.min(r0, r1)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = java.lang.Math.max(r0, r1)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r10.A00 = r0     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r8.A09 = r0     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r10.A04()     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r1 = 0
        L_0x038a:
            boolean r0 = r10.A0S     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            if (r0 != 0) goto L_0x03f8
            boolean r0 = r10.A0T     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            if (r0 != 0) goto L_0x0395
            r15.removeAudioTracks(r7)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
        L_0x0395:
            if (r1 == 0) goto L_0x03b4
            r15.checkAndRepair(r7)     // Catch:{ 2RS -> 0x03a5, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)     // Catch:{ 2RS -> 0x03a5, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r8.A02 = r0     // Catch:{ 2RS -> 0x03a5, IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r0 = r33
            r8.A09 = r0     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            goto L_0x03b4
        L_0x03a5:
            r3 = move-exception
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r8.A02 = r0     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r1 = "only repair gif on upload"
            r0 = 0
            r15.uploadMp4FailureLogs(r7, r3, r1, r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            throw r3     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
        L_0x03b4:
            r15.applyGifTag(r7)     // Catch:{ Exception -> 0x03b8 }
            goto L_0x03e7
        L_0x03b8:
            r1 = move-exception
            java.lang.String r0 = "ProcessGifTask/processGif/applyGifTag failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r0 = "applyGifTagException | "
            r3.append(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            X.AnonymousClass8BS.A1I(r3, r1)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r0 = " | "
            r3.append(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.StackTraceElement[] r0 = r1.getStackTrace()     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r4.A08(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r0 = r1.getMessage()     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            if (r0 == 0) goto L_0x03e7
            r4.A08(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
        L_0x03e7:
            X.1SO r0 = r6.A0A     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            boolean r0 = r0.A0G(r7)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            if (r0 == 0) goto L_0x03f1
            r3 = 1
            goto L_0x03fd
        L_0x03f1:
            java.lang.String r0 = "video was not transcoded correctly"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            goto L_0x045c
        L_0x03f8:
            java.lang.String r0 = "Cancel"
            r8.A0g = r0     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r3 = 0
        L_0x03fd:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            if (r25 == 0) goto L_0x040d
            boolean r1 = r25.isHeld()
            r0 = r24
            if (r1 != r0) goto L_0x040d
            r25.release()
        L_0x040d:
            X.196 r0 = r6.A02
            r0.A01()
            if (r3 == 0) goto L_0x0043
            r10 = 0
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x041c
            if (r53 == 0) goto L_0x0420
        L_0x041c:
            byte[] r2 = X.C1408873l.A04(r7)
        L_0x0420:
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x042b
            if (r2 != 0) goto L_0x042b
            java.lang.String r0 = "ProcessGifTask/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x042b:
            int r3 = X.C26511Sk.A03(r7)
            android.util.Pair r0 = X.C26511Sk.A0D(r7)
            X.C18070vi.A0X(r0)
            X.C27086DTl.A06(r4, r8, r7, r3)
            X.C27086DTl.A05(r0, r4)
            if (r2 == 0) goto L_0x044c
            int r0 = r2.length
            long r0 = (long) r0
        L_0x0440:
            r4.A06(r0)
            r9.A00 = r3
            r9.A01 = r7
            r9.A05 = r2
            r0 = 1
            goto L_0x0044
        L_0x044c:
            r0 = 0
            goto L_0x0440
        L_0x044f:
            r2 = 0
            java.lang.String r0 = "ProcessGifTask/processGif/mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            java.lang.String r1 = "transcode input file does not exist"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
        L_0x045c:
            throw r0     // Catch:{ IllegalStateException -> 0x0472, IllegalArgumentException -> 0x046f, FileNotFoundException -> 0x046c, IOException -> 0x0469, 2RS -> 0x0467, 1Sd -> 0x0465, InterruptedException -> 0x0463, ExecutionException -> 0x0461, C1l -> 0x045f, C2Z -> 0x045d, all -> 0x057e }
        L_0x045d:
            r1 = move-exception
            goto L_0x0482
        L_0x045f:
            r1 = move-exception
            goto L_0x0495
        L_0x0461:
            r1 = move-exception
            goto L_0x04a3
        L_0x0463:
            r1 = move-exception
            goto L_0x04b6
        L_0x0465:
            r1 = move-exception
            goto L_0x04c9
        L_0x0467:
            r3 = move-exception
            goto L_0x04d9
        L_0x0469:
            r8 = move-exception
            goto L_0x0505
        L_0x046c:
            r1 = move-exception
            goto L_0x052d
        L_0x046f:
            r1 = move-exception
            goto L_0x053f
        L_0x0472:
            r1 = move-exception
            goto L_0x0551
        L_0x0475:
            r3 = move-exception
            r2 = 0
            goto L_0x04d9
        L_0x0478:
            r8 = move-exception
            r2 = 0
            goto L_0x0505
        L_0x047c:
            r1 = move-exception
            r2 = r28
            goto L_0x0482
        L_0x0480:
            r1 = move-exception
            r2 = 0
        L_0x0482:
            r0 = 2131889957(0x7f120f25, float:1.9414592E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x048f:
            r1 = move-exception
            r2 = r28
            goto L_0x0495
        L_0x0493:
            r1 = move-exception
            r2 = 0
        L_0x0495:
            r0 = 2131889957(0x7f120f25, float:1.9414592E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            goto L_0x055d
        L_0x049d:
            r1 = move-exception
            r2 = r28
            goto L_0x04a3
        L_0x04a1:
            r1 = move-exception
            r2 = 0
        L_0x04a3:
            r0 = 2131889957(0x7f120f25, float:1.9414592E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x04b0:
            r1 = move-exception
            r2 = r28
            goto L_0x04b6
        L_0x04b4:
            r1 = move-exception
            r2 = 0
        L_0x04b6:
            r0 = 2131889957(0x7f120f25, float:1.9414592E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x04c3:
            r1 = move-exception
            r2 = r28
            goto L_0x04c9
        L_0x04c7:
            r1 = move-exception
            r2 = 0
        L_0x04c9:
            r0 = 2131889957(0x7f120f25, float:1.9414592E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x04d6:
            r3 = move-exception
            r2 = r28
        L_0x04d9:
            java.lang.String r0 = "ProcessGifTask/processGif/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x057a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x057a }
            java.lang.String r0 = "Mp4OpsFail ("
            r1.append(r0)     // Catch:{ all -> 0x057a }
            int r0 = r3.errorCode     // Catch:{ all -> 0x057a }
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r0)     // Catch:{ all -> 0x057a }
            r8.A0g = r0     // Catch:{ all -> 0x057a }
            java.lang.String r0 = r3.detailMessage     // Catch:{ all -> 0x057a }
            r4.A08(r0)     // Catch:{ all -> 0x057a }
            r1 = 2131889957(0x7f120f25, float:1.9414592E38)
            X.E6h r0 = r5.A05     // Catch:{ all -> 0x057a }
            r0.BJ0(r1)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x0502:
            r8 = move-exception
            r2 = r28
        L_0x0505:
            java.lang.String r1 = r8.getMessage()     // Catch:{ all -> 0x057a }
            if (r1 == 0) goto L_0x051b
            java.lang.String r0 = "No space"
            boolean r3 = X.AnonymousClass1YF.A0V(r1, r0)     // Catch:{ all -> 0x057a }
            r1 = 1
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            if (r3 != r1) goto L_0x051b
            r6.A01(r4, r8, r0)     // Catch:{ all -> 0x057a }
            goto L_0x0521
        L_0x051b:
            r0 = 2131889980(0x7f120f3c, float:1.9414639E38)
            r6.A01(r4, r8, r0)     // Catch:{ all -> 0x057a }
        L_0x0521:
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x0527:
            r1 = move-exception
            r2 = r28
            goto L_0x052d
        L_0x052b:
            r1 = move-exception
            r2 = 0
        L_0x052d:
            r0 = 2131889980(0x7f120f3c, float:1.9414639E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x0539:
            r1 = move-exception
            r2 = r28
            goto L_0x053f
        L_0x053d:
            r1 = move-exception
            r2 = 0
        L_0x053f:
            r0 = 2131890006(0x7f120f56, float:1.9414692E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x054b:
            r1 = move-exception
            r2 = r28
            goto L_0x0551
        L_0x054f:
            r1 = move-exception
            r2 = 0
        L_0x0551:
            r0 = 2131890006(0x7f120f56, float:1.9414692E38)
            r6.A01(r4, r1, r0)     // Catch:{ all -> 0x057a }
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
            goto L_0x0562
        L_0x055d:
            if (r28 == 0) goto L_0x0562
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
        L_0x0562:
            if (r25 == 0) goto L_0x056e
            boolean r1 = r25.isHeld()
            r0 = 1
            if (r1 != r0) goto L_0x056e
            r25.release()
        L_0x056e:
            X.196 r0 = r6.A02
            r0.A01()
            goto L_0x0043
        L_0x0575:
            r3 = move-exception
            r2 = 0
            goto L_0x057f
        L_0x0578:
            r3 = move-exception
            goto L_0x0582
        L_0x057a:
            r3 = move-exception
            if (r28 == 0) goto L_0x0582
            goto L_0x057f
        L_0x057e:
            r3 = move-exception
        L_0x057f:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r2)
        L_0x0582:
            if (r25 == 0) goto L_0x058e
            boolean r1 = r25.isHeld()
            r0 = 1
            if (r1 != r0) goto L_0x058e
            r25.release()
        L_0x058e:
            X.196 r0 = r6.A02
            r0.A01()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24019Bu5.A07():X.2fe");
    }

    private final void A01(AnonymousClass70S r4, Exception exc, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProcessGifTask/processGif/mediatranscodequeue/");
        Class<?> cls = exc.getClass();
        C108985cd.A1M(AnonymousClass3MW.A15(cls).BZJ(), A10, exc);
        r4.A01.A0g = cls.getName();
        StringBuilder A102 = AnonymousClass000.A10();
        AnonymousClass8BS.A1I(A102, exc);
        A102.append(" | Trace: ");
        r4.A08(AnonymousClass000.A0y(Arrays.toString(exc.getStackTrace()), A102));
        this.A06.A05.BJ0(i);
    }
}
