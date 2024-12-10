package X;

import android.content.Context;
import android.os.Handler;
import com.facebook.android.exoplayer2.util.Util;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Cuc  reason: case insensitive filesystem */
public class C26205Cuc {
    public static final C25721Ckr[] A0a = {C25721Ckr.A02, C25721Ckr.A05, C25721Ckr.A06};
    public float A00 = 1.0f;
    public C26206Cue A01;
    public EAG A02;
    public C25732Cl2 A03 = C25732Cl2.A05;
    public E9e A04;
    public CUI A05;
    public BPD A06;
    public C25483Cge A07;
    public C24993CSt A08;
    public C25238CbZ A09;
    public ServiceEventCallbackImpl A0A;
    public C26219Cv7 A0B;
    public C25699CkU A0C;
    public String A0D = "";
    public ECg[] A0E;
    public C26029Cqn A0F;
    public E1O A0G;
    public CZC A0H;
    public AtomicReference A0I;
    public final Context A0J;
    public final Handler A0K;
    public final C24795CKo A0L;
    public final C26381Cyh A0M;
    public final D9R A0N;
    public final C27066DRp A0O;
    public final List A0P = new CopyOnWriteArrayList();
    public final boolean A0Q;
    public final C25721Ckr A0R;
    public final C3S A0S;
    public final C25018CTu A0T;
    public final C27064DRk A0U;
    public final E1P A0V;
    public final Map A0W;
    public final AtomicBoolean A0X;
    public final AtomicBoolean A0Y;
    public final AtomicBoolean A0Z;

    public static String A00(CUI cui) {
        CW8 cw8;
        List<CR8> list;
        String str;
        if (cui == null) {
            return null;
        }
        List list2 = cui.A09;
        if (list2.size() < 1 || (cw8 = (CW8) list2.get(0)) == null || (list = cw8.A01) == null) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        for (CR8 cr8 : list) {
            if (cr8.A00 == 3) {
                A13.add(cr8);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            List list3 = ((CR8) it.next()).A02;
            if (list3 != null && !list3.isEmpty()) {
                A132.add(list3.get(0));
            }
        }
        if (A132.size() != 1 || (str = ((CPE) A132.get(0)).A00.A0R) == null) {
            return null;
        }
        return str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: X.DBc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: X.DBc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: X.DBc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: X.DBc} */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.DBb, X.E10, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.E11, java.lang.Object, X.DBe] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.C5g, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v16, types: [X.E11] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:78|79|(2:81|(2:84|97))|85|86) */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0371, code lost:
        if (r0.A0A != false) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r0.A0C == false) goto L_0x0024;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01fc */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0293 A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02a2 A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02fe A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0322 A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x032f A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0339 A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0342 A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x03c7 A[Catch:{ Exception -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0461 A[Catch:{ Exception -> 0x01c0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A01(X.C25238CbZ r37, X.C26205Cuc r38, boolean r39) {
        /*
            r7 = r38
            monitor-enter(r7)
            X.CkU r3 = r7.A0C     // Catch:{ all -> 0x048a }
            X.DRk r2 = r7.A0U     // Catch:{ all -> 0x048a }
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0Z     // Catch:{ all -> 0x048a }
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0X     // Catch:{ all -> 0x048a }
            r11 = 0
            r8 = r37
            X.EAG r0 = r3.A01(r8, r2, r1, r0)     // Catch:{ all -> 0x048a }
            r7.A02 = r0     // Catch:{ all -> 0x048a }
            X.DRp r6 = r7.A0O     // Catch:{ all -> 0x048a }
            boolean r0 = r6.enableMixedCodecManifestSupport     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0024
            X.CUI r0 = r7.A05     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0024
            boolean r0 = r0.A0C     // Catch:{ all -> 0x048a }
            r17 = 1
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            r17 = 0
        L_0x0026:
            boolean r0 = r6.useDefaultTrackSelector     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x007b
            r0 = 0
            X.BPD r9 = new X.BPD     // Catch:{ all -> 0x048a }
            r9.<init>(r0)     // Catch:{ all -> 0x048a }
        L_0x0030:
            r7.A06 = r9     // Catch:{ all -> 0x048a }
            boolean r0 = r6.useExoPlayerBuilder     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x034d
            android.content.Context r1 = r7.A0J     // Catch:{ all -> 0x048a }
            r0 = 2
            X.DMm r4 = new X.DMm     // Catch:{ all -> 0x048a }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x048a }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0047
            android.os.Looper.getMainLooper()     // Catch:{ all -> 0x048a }
        L_0x0047:
            X.EAp r17 = X.C28617EAp.A00     // Catch:{ all -> 0x048a }
            X.D8k r0 = new X.D8k     // Catch:{ all -> 0x048a }
            r0.<init>(r7)     // Catch:{ all -> 0x048a }
            X.DMm r10 = new X.DMm     // Catch:{ all -> 0x048a }
            r10.<init>(r0, r11)     // Catch:{ all -> 0x048a }
            X.BPD r1 = r7.A06     // Catch:{ all -> 0x048a }
            r0 = 3
            X.DMm r9 = new X.DMm     // Catch:{ all -> 0x048a }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x048a }
            X.EAG r1 = r7.A02     // Catch:{ all -> 0x048a }
            r0 = 1
            X.DMm r5 = new X.DMm     // Catch:{ all -> 0x048a }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x048a }
            boolean r0 = r6.updateLoadingPriorityExo2     // Catch:{ all -> 0x048a }
            r22 = r0
            boolean r0 = r6.checkReadToEndBeforeUpdatingFinalState     // Catch:{ all -> 0x048a }
            r23 = r0
            boolean r0 = r6.continueLoadingOnSeekbarExo2     // Catch:{ all -> 0x048a }
            r24 = r0
            X.CUI r0 = r7.A05     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x034a
            boolean r0 = r0.A0A     // Catch:{ all -> 0x048a }
            r25 = 0
            if (r0 == 0) goto L_0x03b9
            goto L_0x034a
        L_0x007b:
            X.Cv7 r12 = r7.A0B     // Catch:{ all -> 0x048a }
            r20 = 0
            r10 = 0
            X.DRp r9 = r12.A0C     // Catch:{ all -> 0x048a }
            com.facebook.video.heroplayer.service.ServiceEventCallbackImpl r1 = r12.A09     // Catch:{ all -> 0x048a }
            X.D47 r5 = r8.A0C     // Catch:{ all -> 0x048a }
            java.lang.String r0 = r5.A0H     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0094
            java.lang.String r3 = "AbrMonitorFactory"
            java.lang.String r2 = "request.mVideoSource.mVideoId is null"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x048a }
            X.BE7.A1M(r2, r3, r0)     // Catch:{ all -> 0x048a }
            goto L_0x00ac
        L_0x0094:
            boolean r0 = r9.abrMonitorEnabled     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x00ac
            X.CN7 r2 = new X.CN7     // Catch:{ all -> 0x048a }
            r2.<init>(r1)     // Catch:{ all -> 0x048a }
        L_0x009d:
            java.lang.String r0 = r5.A0H     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x00ae
            java.lang.String r3 = "AbrMonitorFactory"
            java.lang.String r1 = "request.mVideoSource.mVideoId is null"
            java.lang.Object[] r0 = new java.lang.Object[r11]     // Catch:{ all -> 0x048a }
            X.BE7.A1M(r1, r3, r0)     // Catch:{ all -> 0x048a }
            goto L_0x0289
        L_0x00ac:
            r2 = r10
            goto L_0x009d
        L_0x00ae:
            boolean r0 = r9.abrMonitorEnabled     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0289
            X.CN7 r4 = new X.CN7     // Catch:{ all -> 0x048a }
            r4.<init>(r1)     // Catch:{ all -> 0x048a }
        L_0x00b7:
            X.CkU r0 = r12.A0B     // Catch:{ all -> 0x048a }
            X.CRF r21 = X.C25699CkU.A00(r8)     // Catch:{ all -> 0x048a }
            X.DRp r3 = r0.A06     // Catch:{ all -> 0x048a }
            X.DRg r13 = r3.abrSetting     // Catch:{ all -> 0x048a }
            X.Cqn r1 = r0.A03     // Catch:{ all -> 0x048a }
            r24 = r1
            r0.A02 = r2     // Catch:{ all -> 0x048a }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r1 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration     // Catch:{ all -> 0x048a }
            r23 = r11
            r19 = r13
            r22 = r11
            r18 = r1
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x048a }
            X.CAC r13 = r0.A07     // Catch:{ all -> 0x048a }
            X.D9d r2 = new X.D9d     // Catch:{ all -> 0x048a }
            r2.<init>(r1, r13)     // Catch:{ all -> 0x048a }
            r0.A00 = r2     // Catch:{ all -> 0x048a }
            X.DBb r2 = new X.DBb     // Catch:{ all -> 0x048a }
            r2.<init>()     // Catch:{ all -> 0x048a }
            r0.A01 = r2     // Catch:{ all -> 0x048a }
            X.DRo r14 = X.C27065DRo.A00     // Catch:{ all -> 0x048a }
            X.CA2 r0 = new X.CA2     // Catch:{ all -> 0x048a }
            r0.<init>()     // Catch:{ all -> 0x048a }
            X.DRf r1 = new X.DRf     // Catch:{ all -> 0x048a }
            r1.<init>()     // Catch:{ all -> 0x048a }
            X.ChO r0 = new X.ChO     // Catch:{ all -> 0x048a }
            r0.<init>(r1, r14)     // Catch:{ all -> 0x048a }
            X.DBe r1 = new X.DBe     // Catch:{ all -> 0x048a }
            r1.<init>()     // Catch:{ all -> 0x048a }
            r1.A00 = r0     // Catch:{ all -> 0x048a }
            X.DBd r16 = new X.DBd     // Catch:{ all -> 0x048a }
            r16.<init>()     // Catch:{ all -> 0x048a }
            java.util.Map r15 = r12.A0D     // Catch:{ all -> 0x048a }
            X.DRg r12 = r3.abrSetting     // Catch:{ all -> 0x048a }
            boolean r0 = r12.enableAudioIbrEvaluator     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0253
            boolean r0 = r12.enableAudioAbrEvaluator     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0253
            boolean r0 = r12.enableMultiAudioSupport     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0253
        L_0x0111:
            X.C5g r3 = new X.C5g     // Catch:{ all -> 0x048a }
            r3.<init>()     // Catch:{ all -> 0x048a }
            r3.A05 = r15     // Catch:{ all -> 0x048a }
            r3.A01 = r2     // Catch:{ all -> 0x048a }
            r3.A00 = r10     // Catch:{ all -> 0x048a }
            r3.A03 = r1     // Catch:{ all -> 0x048a }
            r0 = r16
            r3.A02 = r0     // Catch:{ all -> 0x048a }
            r3.A04 = r9     // Catch:{ all -> 0x048a }
            X.BPD r9 = new X.BPD     // Catch:{ all -> 0x048a }
            r9.<init>(r3)     // Catch:{ all -> 0x048a }
            java.util.concurrent.atomic.AtomicReference r0 = r9.A02     // Catch:{ all -> 0x048a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x048a }
            X.BPC r0 = (X.BPC) r0     // Catch:{ all -> 0x048a }
            X.BPB r4 = new X.BPB     // Catch:{ all -> 0x048a }
            r4.<init>(r0)     // Catch:{ all -> 0x048a }
            boolean r0 = r8.A00()     // Catch:{ all -> 0x048a }
            r3 = 1
            if (r0 == 0) goto L_0x0158
            X.DRg r0 = r6.abrSetting     // Catch:{ all -> 0x048a }
            boolean r0 = r0.liveShouldFilterHardwareCapabilities     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x015e
        L_0x0143:
            boolean r0 = r6.exceedRendererCapabilitiesIfAllFilteredOut     // Catch:{ all -> 0x048a }
            r4.A04 = r0     // Catch:{ all -> 0x048a }
            X.DRg r1 = r6.abrSetting     // Catch:{ all -> 0x048a }
            boolean r0 = r1.enableAudioAbrEvaluator     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x028c
            boolean r0 = r1.enableAudioIbrEvaluator     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x028c
            boolean r1 = r1.enableMultiAudioSupport     // Catch:{ all -> 0x048a }
            r0 = 0
            if (r1 == 0) goto L_0x028d
            goto L_0x028c
        L_0x0158:
            X.DRg r0 = r6.abrSetting     // Catch:{ all -> 0x048a }
            boolean r0 = r0.shouldFilterHardwareCapabilities     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0143
        L_0x015e:
            android.content.Context r10 = r7.A0J     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "display"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch:{ all -> 0x048a }
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0170
            android.view.Display r2 = r0.getDisplay(r11)     // Catch:{ all -> 0x048a }
            if (r2 != 0) goto L_0x017f
        L_0x0170:
            java.lang.String r0 = "window"
            java.lang.Object r0 = r10.getSystemService(r0)     // Catch:{ all -> 0x048a }
            X.C26056CrS.A01(r0)     // Catch:{ all -> 0x048a }
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch:{ all -> 0x048a }
            android.view.Display r2 = r0.getDefaultDisplay()     // Catch:{ all -> 0x048a }
        L_0x017f:
            int r0 = r2.getDisplayId()     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0235
            android.content.Context r1 = r10.getApplicationContext()     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "uimode"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ all -> 0x048a }
            android.app.UiModeManager r0 = (android.app.UiModeManager) r0     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0235
            int r1 = r0.getCurrentModeType()     // Catch:{ all -> 0x048a }
            r0 = 4
            if (r1 != r0) goto L_0x0235
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x048a }
            r0 = 28
            if (r1 >= r0) goto L_0x01a3
            java.lang.String r14 = "sys.display-size"
            goto L_0x01a5
        L_0x01a3:
            java.lang.String r14 = "vendor.display-size"
        L_0x01a5:
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r12 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r13 = "get"
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x01c0 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r1 = X.BE6.A0x(r12, r0, r13, r1, r11)     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c0 }
            r0[r11] = r14     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object r13 = r1.invoke(r12, r0)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x01c0 }
            goto L_0x01d1
        L_0x01c0:
            r12 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "Failed to read system property "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r14, r1)     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "Util"
            android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x048a }
            r13 = 0
        L_0x01d1:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x020b
            java.lang.String r12 = r13.trim()     // Catch:{ NumberFormatException -> 0x01fc }
            java.lang.String r1 = "x"
            r0 = -1
            java.lang.String[] r12 = r12.split(r1, r0)     // Catch:{ NumberFormatException -> 0x01fc }
            int r1 = r12.length     // Catch:{ NumberFormatException -> 0x01fc }
            r0 = 2
            if (r1 != r0) goto L_0x01fc
            r0 = r12[r11]     // Catch:{ NumberFormatException -> 0x01fc }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01fc }
            r0 = r12[r3]     // Catch:{ NumberFormatException -> 0x01fc }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01fc }
            if (r1 <= 0) goto L_0x01fc
            if (r0 <= 0) goto L_0x01fc
            android.graphics.Point r12 = new android.graphics.Point     // Catch:{ NumberFormatException -> 0x01fc }
            r12.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x01fc }
            goto L_0x0243
        L_0x01fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "Invalid display size: "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r13, r1)     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "Util"
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x048a }
        L_0x020b:
            java.lang.String r1 = "Sony"
            java.lang.String r0 = com.facebook.android.exoplayer2.util.Util.A03     // Catch:{ all -> 0x048a }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0235
            java.lang.String r1 = com.facebook.android.exoplayer2.util.Util.A04     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "BRAVIA"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0235
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x048a }
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0235
            r1 = 3840(0xf00, float:5.381E-42)
            r0 = 2160(0x870, float:3.027E-42)
            android.graphics.Point r12 = new android.graphics.Point     // Catch:{ all -> 0x048a }
            r12.<init>(r1, r0)     // Catch:{ all -> 0x048a }
            goto L_0x0243
        L_0x0235:
            android.graphics.Point r12 = new android.graphics.Point     // Catch:{ all -> 0x048a }
            r12.<init>()     // Catch:{ all -> 0x048a }
            int r1 = com.facebook.android.exoplayer2.util.Util.A00     // Catch:{ all -> 0x048a }
            r0 = 23
            if (r1 < r0) goto L_0x024f
            com.facebook.android.exoplayer2.util.Util.A09(r12, r2)     // Catch:{ all -> 0x048a }
        L_0x0243:
            int r1 = r12.x     // Catch:{ all -> 0x048a }
            int r0 = r12.y     // Catch:{ all -> 0x048a }
            r4.A0F = r1     // Catch:{ all -> 0x048a }
            r4.A0E = r0     // Catch:{ all -> 0x048a }
            r4.A0P = r3     // Catch:{ all -> 0x048a }
            goto L_0x0143
        L_0x024f:
            r2.getRealSize(r12)     // Catch:{ all -> 0x048a }
            goto L_0x0243
        L_0x0253:
            X.CRF r12 = X.C25699CkU.A00(r8)     // Catch:{ all -> 0x048a }
            X.DRg r14 = r3.abrSetting     // Catch:{ all -> 0x048a }
            com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration r0 = new com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration     // Catch:{ all -> 0x048a }
            r19 = r14
            r21 = r12
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x048a }
            X.D9d r14 = new X.D9d     // Catch:{ all -> 0x048a }
            r14.<init>(r0, r13)     // Catch:{ all -> 0x048a }
            X.DRg r3 = r3.abrSetting     // Catch:{ all -> 0x048a }
            boolean r0 = r3.enableAudioAbrEvaluator     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x027a
            X.ECn r0 = r24.A02()     // Catch:{ all -> 0x048a }
            X.DBc r10 = new X.DBc     // Catch:{ all -> 0x048a }
            r10.<init>(r14, r0, r12, r4)     // Catch:{ all -> 0x048a }
            goto L_0x0111
        L_0x027a:
            boolean r0 = r3.enableMultiAudioSupport     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0282
            boolean r0 = r3.enableAudioIbrEvaluator     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0111
        L_0x0282:
            X.DBb r10 = new X.DBb     // Catch:{ all -> 0x048a }
            r10.<init>()     // Catch:{ all -> 0x048a }
            goto L_0x0111
        L_0x0289:
            r4 = r10
            goto L_0x00b7
        L_0x028c:
            r0 = 1
        L_0x028d:
            r4.A01 = r0     // Catch:{ all -> 0x048a }
            r4.A0O = r3     // Catch:{ all -> 0x048a }
            if (r17 == 0) goto L_0x0295
            r4.A02 = r3     // Catch:{ all -> 0x048a }
        L_0x0295:
            int r1 = r8.A01     // Catch:{ all -> 0x048a }
            r0 = 3
            java.lang.Integer[] r0 = X.AnonymousClass00R.A00(r0)     // Catch:{ all -> 0x048a }
            r14 = r0[r1]     // Catch:{ all -> 0x048a }
            android.net.Uri r0 = r5.A04     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x02dd
            X.CUI r1 = r7.A05     // Catch:{ all -> 0x048a }
            if (r1 == 0) goto L_0x02db
            java.util.List r2 = r1.A09     // Catch:{ all -> 0x048a }
            int r0 = r2.size()     // Catch:{ all -> 0x048a }
            if (r0 <= 0) goto L_0x02d2
            java.lang.Object r0 = r2.get(r11)     // Catch:{ all -> 0x048a }
            X.CW8 r0 = (X.CW8) r0     // Catch:{ all -> 0x048a }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x048a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x02d2
            java.lang.Object r0 = r2.get(r11)     // Catch:{ all -> 0x048a }
            X.CW8 r0 = (X.CW8) r0     // Catch:{ all -> 0x048a }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x048a }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x048a }
            X.CR8 r0 = (X.CR8) r0     // Catch:{ all -> 0x048a }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x048a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x02dd
        L_0x02d2:
            boolean r0 = r1.A0E     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x02db
            boolean r0 = r6.enableUsingASRCaptions     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r2 = 0
            goto L_0x02de
        L_0x02dd:
            r2 = 1
        L_0x02de:
            boolean r0 = r6.enableEmsgTrackForAll     // Catch:{ all -> 0x048a }
            boolean r13 = X.BE8.A1S(r0)
            X.CUI r1 = r7.A05     // Catch:{ all -> 0x048a }
            if (r1 == 0) goto L_0x0323
            boolean r0 = r1.A0E     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0323
            boolean r0 = r6.enableUsingASRCaptions     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0323
            java.lang.String r2 = A00(r1)     // Catch:{ all -> 0x048a }
            if (r2 == 0) goto L_0x0322
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x048a }
            if (r0 != 0) goto L_0x0322
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x048a }
            r0[r11] = r2     // Catch:{ all -> 0x048a }
            r4.A01(r0)     // Catch:{ all -> 0x048a }
            X.Cyh r12 = r7.A0M     // Catch:{ all -> 0x048a }
            java.util.List r1 = java.util.Collections.singletonList(r2)     // Catch:{ all -> 0x048a }
            X.Ckv r0 = new X.Ckv     // Catch:{ all -> 0x048a }
            r0.<init>(r2, r1, r3)     // Catch:{ all -> 0x048a }
            android.os.Handler r10 = r12.A0l     // Catch:{ all -> 0x048a }
            r5 = 37
            java.util.List r2 = r0.A01     // Catch:{ all -> 0x048a }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x048a }
            X.Ckv r0 = new X.Ckv     // Catch:{ all -> 0x048a }
            r0.<init>(r1, r2, r3)     // Catch:{ all -> 0x048a }
            X.BE7.A17(r10, r12, r0, r5)     // Catch:{ all -> 0x048a }
            r2 = 1
            goto L_0x0323
        L_0x0322:
            r2 = 0
        L_0x0323:
            r1 = 2
            if (r2 == 0) goto L_0x032a
            boolean r0 = r6.disableLiveCaptioningOnPlayerInit     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x032d
        L_0x032a:
            r4.A00(r1, r3)     // Catch:{ all -> 0x048a }
        L_0x032d:
            if (r13 != 0) goto L_0x0333
            r0 = 3
            r4.A00(r0, r3)     // Catch:{ all -> 0x048a }
        L_0x0333:
            int r0 = r14.intValue()     // Catch:{ all -> 0x048a }
            if (r0 == r1) goto L_0x0342
            if (r0 != r3) goto L_0x0345
            r4.A00(r11, r3)     // Catch:{ all -> 0x048a }
            r4.A00(r1, r3)     // Catch:{ all -> 0x048a }
            goto L_0x0345
        L_0x0342:
            r4.A00(r3, r3)     // Catch:{ all -> 0x048a }
        L_0x0345:
            r9.A01(r4)     // Catch:{ all -> 0x048a }
            goto L_0x0030
        L_0x034a:
            r25 = 1
            goto L_0x03b9
        L_0x034d:
            X.ECg[] r0 = r7.A0E     // Catch:{ all -> 0x048a }
            r21 = r0
            X.EAG r0 = r7.A02     // Catch:{ all -> 0x048a }
            r17 = r0
            X.CkU r0 = r7.A0C     // Catch:{ all -> 0x048a }
            X.E0a r0 = r0.A00     // Catch:{ all -> 0x048a }
            r19 = r0
            X.EAp r20 = X.C28617EAp.A00     // Catch:{ all -> 0x048a }
            boolean r0 = r6.updateLoadingPriorityExo2     // Catch:{ all -> 0x048a }
            r25 = r0
            boolean r0 = r6.checkReadToEndBeforeUpdatingFinalState     // Catch:{ all -> 0x048a }
            r26 = r0
            boolean r0 = r6.continueLoadingOnSeekbarExo2     // Catch:{ all -> 0x048a }
            r27 = r0
            X.CUI r0 = r7.A05     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0373
            boolean r0 = r0.A0A     // Catch:{ all -> 0x048a }
            r28 = 0
            if (r0 == 0) goto L_0x0375
        L_0x0373:
            r28 = 1
        L_0x0375:
            boolean r15 = r6.enableCancelOngoingRequestPause     // Catch:{ all -> 0x048a }
            boolean r14 = r6.reportUnexpectedStopLoading     // Catch:{ all -> 0x048a }
            boolean r0 = r8.A00()     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x03b6
            long r0 = r6.ignoreLiveStreamErrorsTimeoutMs     // Catch:{ all -> 0x048a }
        L_0x0381:
            boolean r13 = r6.callbackFirstCaughtStreamError     // Catch:{ all -> 0x048a }
            int r11 = r6.microStallThresholdMsToUseMinBuffer     // Catch:{ all -> 0x048a }
            boolean r10 = r6.useMultiPeriodBufferCalculation     // Catch:{ all -> 0x048a }
            boolean r8 = r6.useThreadSafeStandaloneClock     // Catch:{ all -> 0x048a }
            boolean r5 = r6.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x048a }
            boolean r4 = r6.improveLooping     // Catch:{ all -> 0x048a }
            boolean r3 = r6.preventTextRendererDelay     // Catch:{ all -> 0x048a }
            boolean r2 = r6.fixPeriodTransitionWithNonZeroStartPosition     // Catch:{ all -> 0x048a }
            boolean r12 = r6.exoPlayerUpgrade218verifyApplicationThread     // Catch:{ all -> 0x048a }
            X.Cue r6 = new X.Cue     // Catch:{ all -> 0x048a }
            r16 = r6
            r18 = r9
            r22 = r11
            r23 = r0
            r29 = r15
            r30 = r14
            r31 = r13
            r32 = r10
            r33 = r8
            r34 = r5
            r35 = r4
            r36 = r3
            r37 = r2
            r38 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x048a }
            goto L_0x045e
        L_0x03b6:
            long r0 = r6.ignoreStreamErrorsTimeoutMs     // Catch:{ all -> 0x048a }
            goto L_0x0381
        L_0x03b9:
            boolean r0 = r6.enableCancelOngoingRequestPause     // Catch:{ all -> 0x048a }
            r26 = r0
            boolean r0 = r6.reportUnexpectedStopLoading     // Catch:{ all -> 0x048a }
            r27 = r0
            boolean r0 = r8.A00()     // Catch:{ all -> 0x048a }
            if (r0 == 0) goto L_0x0461
            long r0 = r6.ignoreLiveStreamErrorsTimeoutMs     // Catch:{ all -> 0x048a }
        L_0x03c9:
            boolean r2 = r6.callbackFirstCaughtStreamError     // Catch:{ all -> 0x048a }
            r16 = r2
            int r15 = r6.microStallThresholdMsToUseMinBuffer     // Catch:{ all -> 0x048a }
            boolean r14 = r6.useMultiPeriodBufferCalculation     // Catch:{ all -> 0x048a }
            boolean r13 = r6.useThreadSafeStandaloneClock     // Catch:{ all -> 0x048a }
            boolean r11 = r6.useHttpPriorityIncrementalForStreaming     // Catch:{ all -> 0x048a }
            boolean r8 = r6.improveLooping     // Catch:{ all -> 0x048a }
            boolean r3 = r6.preventTextRendererDelay     // Catch:{ all -> 0x048a }
            boolean r2 = r6.fixPeriodTransitionWithNonZeroStartPosition     // Catch:{ all -> 0x048a }
            boolean r12 = r6.exoPlayerUpgrade218verifyApplicationThread     // Catch:{ all -> 0x048a }
            X.Cj3 r6 = new X.Cj3     // Catch:{ all -> 0x048a }
            r18 = r6
            r19 = r15
            r20 = r0
            r28 = r16
            r29 = r14
            r30 = r13
            r31 = r11
            r32 = r8
            r33 = r3
            r34 = r2
            r35 = r12
            r18.<init>(r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x048a }
            java.lang.Object r0 = r10.A01     // Catch:{ all -> 0x048a }
            X.EBN r0 = (X.EBN) r0     // Catch:{ all -> 0x048a }
            X.ECg[] r18 = r0.BHk()     // Catch:{ all -> 0x048a }
            java.lang.Object r11 = r9.A01     // Catch:{ all -> 0x048a }
            X.C5B r11 = (X.C5B) r11     // Catch:{ all -> 0x048a }
            java.lang.Object r10 = r5.A01     // Catch:{ all -> 0x048a }
            X.EAG r10 = (X.EAG) r10     // Catch:{ all -> 0x048a }
            java.lang.Object r9 = r4.get()     // Catch:{ all -> 0x048a }
            X.E0a r9 = (X.C28409E0a) r9     // Catch:{ all -> 0x048a }
            boolean r0 = r6.A0C     // Catch:{ all -> 0x048a }
            r22 = r0
            boolean r0 = r6.A04     // Catch:{ all -> 0x048a }
            r23 = r0
            boolean r0 = r6.A02     // Catch:{ all -> 0x048a }
            r24 = r0
            boolean r0 = r6.A08     // Catch:{ all -> 0x048a }
            r20 = r0
            boolean r0 = r6.A05     // Catch:{ all -> 0x048a }
            r19 = r0
            boolean r0 = r6.A0B     // Catch:{ all -> 0x048a }
            r16 = r0
            long r0 = r6.A01     // Catch:{ all -> 0x048a }
            boolean r15 = r6.A03     // Catch:{ all -> 0x048a }
            int r14 = r6.A00     // Catch:{ all -> 0x048a }
            boolean r13 = r6.A0E     // Catch:{ all -> 0x048a }
            boolean r8 = r6.A0F     // Catch:{ all -> 0x048a }
            boolean r5 = r6.A0D     // Catch:{ all -> 0x048a }
            boolean r4 = r6.A09     // Catch:{ all -> 0x048a }
            boolean r3 = r6.A0A     // Catch:{ all -> 0x048a }
            boolean r2 = r6.A07     // Catch:{ all -> 0x048a }
            boolean r12 = r6.A06     // Catch:{ all -> 0x048a }
            X.Cue r6 = new X.Cue     // Catch:{ all -> 0x048a }
            r25 = r20
            r26 = r19
            r27 = r16
            r28 = r15
            r29 = r13
            r30 = r8
            r31 = r5
            r32 = r4
            r33 = r3
            r34 = r2
            r35 = r12
            r15 = r11
            r16 = r9
            r19 = r14
            r20 = r0
            r13 = r6
            r14 = r10
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x048a }
        L_0x045e:
            r7.A01 = r6     // Catch:{ all -> 0x048a }
            goto L_0x0465
        L_0x0461:
            long r0 = r6.ignoreStreamErrorsTimeoutMs     // Catch:{ all -> 0x048a }
            goto L_0x03c9
        L_0x0465:
            if (r39 == 0) goto L_0x046e
            X.CZC r1 = r7.A0H     // Catch:{ all -> 0x048a }
            java.util.concurrent.CopyOnWriteArraySet r0 = r6.A0M     // Catch:{ all -> 0x048a }
            r0.add(r1)     // Catch:{ all -> 0x048a }
        L_0x046e:
            X.Cue r2 = r7.A01     // Catch:{ all -> 0x048a }
            X.ECg[] r1 = r7.A0E     // Catch:{ all -> 0x048a }
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x048a }
            X.Cbw r1 = r2.A06(r0)     // Catch:{ all -> 0x048a }
            r0 = 7
            r1.A01(r0)     // Catch:{ all -> 0x048a }
            X.CKp r0 = new X.CKp     // Catch:{ all -> 0x048a }
            r0.<init>(r7)     // Catch:{ all -> 0x048a }
            r1.A02(r0)     // Catch:{ all -> 0x048a }
            r1.A00()     // Catch:{ all -> 0x048a }
            monitor-exit(r7)
            return
        L_0x048a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26205Cuc.A01(X.CbZ, X.Cuc, boolean):void");
    }

    public static void A02(C26205Cuc cuc) {
        int i = cuc.A0O.playbackAboutToFinishCallbackTriggeringRemainingDuration;
        if (i <= 0) {
            i = 2000;
        }
        long A052 = cuc.A01.A05() - ((long) i);
        if (A052 > cuc.A01.A05()) {
            A052 = cuc.A01.A05() / 2;
        }
        C25257Cbw A062 = cuc.A01.A06(new C26658D8h(cuc));
        C26056CrS.A03(!A062.A07);
        A062.A02 = A052;
        A062.A00();
    }

    public int A03(int i) {
        if (((BPC) this.A06.A02.get()).A02.get(i)) {
            return -1;
        }
        return 0;
    }

    public long A04() {
        if (this.A0O.isExo2UseAbsolutePosition) {
            C26206Cue cue = this.A01;
            if (C26206Cue.A03(cue)) {
                return cue.A04;
            }
            long j = cue.A07.A0D;
            UUID uuid = C24736CHy.A04;
            return Util.A05(j);
        }
        C26206Cue cue2 = this.A01;
        if (C26206Cue.A03(cue2)) {
            return cue2.A05;
        }
        return C26206Cue.A00(cue2, cue2.A07.A0D);
    }

    public void A05() {
        Context context = this.A0J;
        Map map = this.A0W;
        ServiceEventCallbackImpl serviceEventCallbackImpl = this.A0A;
        C26029Cqn cqn = this.A0F;
        AtomicBoolean atomicBoolean = this.A0Z;
        AtomicBoolean atomicBoolean2 = this.A0Y;
        C25018CTu cTu = this.A0T;
        C25699CkU ckU = new C25699CkU(context, cqn, this.A0G, cTu, serviceEventCallbackImpl, this.A0V, map, atomicBoolean, atomicBoolean2);
        this.A0C = ckU;
        this.A0B = new C26219Cv7(context, this.A0K, cTu, this.A0M, serviceEventCallbackImpl, ckU, map);
    }

    public void A06(int i, int i2) {
        BPB bpb = new BPB((BPC) this.A06.A02.get());
        bpb.A00(i, AnonymousClass000.A1T(i2, -1));
        this.A06.A01(bpb);
    }

    public void A07(long j) {
        C25238CbZ cbZ = this.A09;
        if (cbZ != null && cbZ.A0C.A01() && !this.A0O.skipAV1PreviousKeyFrameSeek) {
            C26206Cue cue = this.A01;
            C25646Cjc.A00(cue.A0I.A0g, C25721Ckr.A06, 5);
        }
        if (this.A0O.isExo2UseAbsolutePosition) {
            this.A01.A0A(j);
            return;
        }
        C26206Cue cue2 = this.A01;
        cue2.A09(cue2.A04(), j);
    }

    public void A08(long j, boolean z) {
        C26206Cue cue;
        C25721Ckr ckr;
        C25238CbZ cbZ = this.A09;
        if (cbZ == null || !cbZ.A0C.A01() || this.A0O.skipAV1PreviousKeyFrameSeek) {
            cue = this.A01;
            if (z) {
                ckr = this.A0R;
            } else {
                ckr = C25721Ckr.A03;
            }
        } else {
            cue = this.A01;
            ckr = C25721Ckr.A06;
        }
        if (ckr == null) {
            ckr = C25721Ckr.A03;
        }
        C25646Cjc.A00(cue.A0I.A0g, ckr, 5);
        C27066DRp dRp = this.A0O;
        if (dRp.isExo2UseAbsolutePosition) {
            this.A01.A0A(j);
            return;
        }
        if (dRp.enableBackwardJumpSeekKeyframeSync) {
            boolean z2 = true;
            boolean A1R = AnonymousClass000.A1R((A04() > j ? 1 : (A04() == j ? 0 : -1)));
            long abs = Math.abs(A04() - j);
            if (abs <= 8000 || abs >= 12000) {
                z2 = false;
            }
            int i = dRp.seekParameterOptionIndex;
            if (i >= 0) {
                C25721Ckr[] ckrArr = A0a;
                if (i < 3 && A1R && z2) {
                    C25721Ckr ckr2 = ckrArr[i];
                    C26206Cue cue2 = this.A01;
                    if (ckr2 == null) {
                        ckr2 = C25721Ckr.A03;
                    }
                    C25646Cjc.A00(cue2.A0I.A0g, ckr2, 5);
                }
            }
        }
        C26206Cue cue3 = this.A01;
        cue3.A09(cue3.A04(), j);
    }

    public void A09(C28606E9x e9x) {
        List list = this.A0P;
        if (list.isEmpty()) {
            CZC czc = new CZC(this);
            this.A0H = czc;
            this.A01.A0M.add(czc);
        }
        list.add(e9x);
    }

    public void A0A(boolean z) {
        List list;
        int size;
        C26205Cuc cuc;
        C25238CbZ cbZ;
        C26206Cue cue = this.A01;
        if (cue.A0E != z) {
            cue.A0E = z;
            cue.A03++;
            C25936Cp1 cp1 = cue.A0I.A0g;
            C25646Cjc A002 = C25936Cp1.A00();
            A002.A00 = cp1.A00.obtainMessage(1, z ? 1 : 0, 0);
            A002.A01 = cp1;
            A002.A01();
            C26013CqU cqU = cue.A07;
            if (!z) {
                cue.A0F = z;
                Iterator it = cue.A0M.iterator();
                while (it.hasNext()) {
                    CZC czc = (CZC) it.next();
                    if (czc != null) {
                        int i = cqU.A00;
                        if (i == 3 && (cbZ = cuc.A09) != null && cbZ.A0C.A0R) {
                            A02((cuc = czc.A05));
                        }
                        for (C28606E9x C0r : czc.A05.A0P) {
                            C0r.C0r(i, false);
                        }
                    } else {
                        throw AnonymousClass000.A0s("onPlayerStateChanged");
                    }
                }
            }
        }
        E9e e9e = this.A04;
        if (e9e instanceof C22782BOv) {
            C22782BOv bOv = (C22782BOv) e9e;
            int i2 = 0;
            while (true) {
                synchronized (e9e) {
                    list = bOv.A08;
                    size = list.size();
                }
                if (i2 < size) {
                    synchronized (e9e) {
                        list.get(i2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public C26205Cuc(Context context, Handler handler, C26029Cqn cqn, E1O e1o, C3S c3s, C24993CSt cSt, C25238CbZ cbZ, C25018CTu cTu, C24795CKo cKo, C26381Cyh cyh, ServiceEventCallbackImpl serviceEventCallbackImpl, C27064DRk dRk, E1P e1p, Map map, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, AtomicReference atomicReference) {
        C25018CTu cTu2 = cTu;
        this.A0T = cTu2;
        C26381Cyh cyh2 = cyh;
        this.A0M = cyh2;
        C27066DRp dRp = cTu2.A05;
        this.A0O = dRp;
        this.A0J = context;
        this.A0K = handler;
        this.A0I = atomicReference;
        this.A0F = cqn;
        this.A0W = map;
        this.A0A = serviceEventCallbackImpl;
        this.A08 = cSt;
        this.A0S = c3s;
        this.A0G = e1o;
        this.A0V = e1p;
        this.A0N = new D9R(cyh2, dRp, dRp.disableTextRendererOn404LoadError, dRp.disableTextRendererOn404InitSegmentLoadError, dRp.disableTextRendererOn500LoadError, dRp.disableTextRendererOn500InitSegmentLoadError);
        this.A0Z = atomicBoolean;
        this.A0Y = atomicBoolean3;
        A05();
        this.A05 = null;
        C25238CbZ cbZ2 = cbZ;
        try {
            if (cbZ2.A0C.A0A != null) {
                this.A05 = C26219Cv7.A01(cbZ2, dRp);
            }
        } catch (C1S | IOException e) {
            ServiceEventCallbackImpl serviceEventCallbackImpl2 = this.A0A;
            String str = cbZ2.A0C.A0H;
            StringBuilder A0u = BE6.A0u("Exception: ");
            AnonymousClass8BS.A1I(A0u, e);
            new C22926BVo(str, "MANIFEST", "MANIFEST_PARSE_ERROR", A0u.toString());
            serviceEventCallbackImpl2.A00();
        }
        if (this.A0O.exo2ReuseManifestAfterInitialParse) {
            this.A09 = cbZ2;
        }
        this.A0E = this.A0B.A06(this.A05, cbZ2, cyh2);
        boolean z = false;
        this.A0U = dRk;
        this.A0X = atomicBoolean2;
        this.A0L = cKo;
        A01(cbZ2, this, false);
        this.A0R = new C25721Ckr(2000000, 0);
        Random random = new Random();
        C27066DRp dRp2 = this.A0O;
        if (dRp2.enableSecondaryChannelLoggingForLite && (dRp2.secondaryChannelLoggingSamplingFactor <= 0 || Double.compare(random.nextDouble(), 1.0d / ((double) this.A0O.secondaryChannelLoggingSamplingFactor)) < 0)) {
            z = true;
        }
        this.A0Q = z;
        if (z) {
            this.A07 = new C25483Cge();
        }
    }
}
