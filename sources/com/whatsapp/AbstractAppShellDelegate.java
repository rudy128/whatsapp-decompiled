package com.whatsapp;

import X.AnonymousClass00E;
import X.AnonymousClass00X;
import X.AnonymousClass00m;
import X.AnonymousClass012;
import X.AnonymousClass013;
import X.AnonymousClass0ZA;
import X.AnonymousClass0ZB;
import X.AnonymousClass0ZC;
import X.AnonymousClass0ZK;
import X.AnonymousClass10I;
import X.AnonymousClass114;
import X.AnonymousClass11E;
import X.AnonymousClass11K;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass11Z;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass193;
import X.AnonymousClass196;
import X.AnonymousClass197;
import X.AnonymousClass19Z;
import X.AnonymousClass1Bl;
import X.AnonymousClass1CH;
import X.AnonymousClass1CI;
import X.AnonymousClass1Q5;
import X.C000800l;
import X.C000900n;
import X.C001000o;
import X.C17910vQ;
import X.C17930vS;
import X.C17960vV;
import X.C17970vW;
import X.C18000vb;
import X.C18030ve;
import X.C18150vq;
import X.C18170vs;
import X.C19830z4;
import X.C223819r;
import X.C224319w;
import X.C22461Ab;
import X.C22471Ac;
import X.C22481Ad;
import X.C23061Ej;
import X.C30051dJ;
import X.C46612Ff;
import X.C61792qG;
import X.C63202sg;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import com.whatsapp.breakpad.BreakpadManager;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.lang.reflect.Method;
import java.security.Security;

public class AbstractAppShellDelegate implements ApplicationLike {
    public static final String COMPRESSED_LIBS_ARCHIVE_NAME = "libs.spo";
    public final Context appContext;
    public final C17910vQ appStartStat;
    public AnonymousClass19Z applicationCreatePerfTracker;
    public boolean asyncInitStarted;
    public boolean isFirstColdStart = false;
    public C18000vb whatsAppLocale;

    /* JADX INFO: finally extract failed */
    private boolean decompressAsset(AnonymousClass11P r9, AnonymousClass190 r10, AnonymousClass18K r11, AnonymousClass11Z r12, C19830z4 r13, C224319w r14, boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            if (r14.A05(this.appContext)) {
                this.isFirstColdStart = true;
                C46612Ff r2 = new C46612Ff();
                r2.A02 = COMPRESSED_LIBS_ARCHIVE_NAME;
                r2.A01 = Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis);
                r11.CC7(r2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("AbstractAppShellDelegate/decompressAsset time:");
            sb.append(SystemClock.uptimeMillis() - uptimeMillis);
            sb.append(" firstColdStart:");
            sb.append(this.isFirstColdStart);
            Log.i(sb.toString());
            return true;
        } catch (Exception e) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AbstractAppShellDelegate/decompressLibraries: Error decompressing archive libs.spo, usingLegacyMethod: ");
                sb2.append(z);
                Log.w(sb2.toString(), e);
                maybeReportDecompressionFailure(r10, r12, r13, e);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("AbstractAppShellDelegate/decompressAsset time:");
                sb3.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb3.append(" firstColdStart:");
                sb3.append(this.isFirstColdStart);
                Log.i(sb3.toString());
                return false;
            } catch (Throwable th) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("AbstractAppShellDelegate/decompressAsset time:");
                sb4.append(SystemClock.uptimeMillis() - uptimeMillis);
                sb4.append(" firstColdStart:");
                sb4.append(this.isFirstColdStart);
                Log.i(sb4.toString());
                throw th;
            }
        }
    }

    private void initLogging(AnonymousClass11E r2) {
        Log.setConnectivityInfoProvider(new AnonymousClass11K(r2));
    }

    private void installAnrDetector(AnonymousClass11P r6, C18030ve r7, AnonymousClass10I r8, C22461Ab r9, WhatsAppLibLoader whatsAppLibLoader, C22471Ac r11, C22481Ad r12, C17930vS r13) {
        this.applicationCreatePerfTracker.A04("InstallAnrDetector");
        Boolean bool = C17970vW.A03;
        boolean A0N = r7.A0N(11623);
        boolean z = !A0N;
        r9.A03(new C000800l(this, r13), "breakpad", z);
        r9.A03(new AnonymousClass00m(), "abort_hook", z);
        r11.getClass();
        r9.A03(new C000900n(r11), "anr_detector", z);
        if (A0N) {
            C17960vV.A0E(false);
            r8.CGF(new AnonymousClass0ZA(r9));
            C17960vV.A0E(true);
        }
        JniBridge.setDependencies(r12);
        this.applicationCreatePerfTracker.A03("InstallAnrDetector");
    }

    public static /* synthetic */ void lambda$installAnrDetector$1(C22461Ab r1) {
        r1.A04("breakpad");
        r1.A04("abort_hook");
        r1.A04("anr_detector");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002c, code lost:
        if (r4.Bjr().A08() == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void lambda$queueAsyncInit$5(X.AnonymousClass1Q5 r3, X.AnonymousClass00X r4) {
        /*
            java.lang.String r1 = "async-init"
            X.0vt r0 = X.AnonymousClass1Q5.A01
            X.2jm r3 = r3.A00(r0, r1)
            X.00H r0 = r4.CBK()
            java.lang.Object r0 = r0.get()
            X.1jF r0 = (X.C33701jF) r0
            r0.A00()
            X.2hq r2 = r4.BCB()
            X.1CM r0 = r4.CEB()     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x002e
            X.1Cd r0 = r4.Bjr()     // Catch:{ all -> 0x0036 }
            boolean r1 = r0.A08()     // Catch:{ all -> 0x0036 }
            r0 = 1
            if (r1 != 0) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r2.A00(r0)     // Catch:{ all -> 0x0036 }
            r3.A00()
            return
        L_0x0036:
            r0 = move-exception
            r3.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.AbstractAppShellDelegate.lambda$queueAsyncInit$5(X.1Q5, X.00X):void");
    }

    private void logDebugInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractAppShellDelegate/debug_info: pkg=");
        sb.append(this.appContext.getPackageName());
        sb.append("; v=");
        sb.append(C18170vs.A02());
        sb.append("; vc=");
        sb.append(242478021);
        sb.append("; p=");
        sb.append("consumer");
        sb.append("; e=");
        sb.append(C18170vs.A00());
        sb.append("; g=");
        sb.append("10a4e9c03f4dfbfbc06f3b0cebce652aadfeed27");
        sb.append("; t=");
        sb.append(1733338680000L);
        sb.append("; d=");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append("; os=Android ");
        sb.append(Build.VERSION.RELEASE);
        sb.append("; abis=");
        sb.append(TextUtils.join(",", Build.SUPPORTED_ABIS));
        Log.i(sb.toString());
    }

    private void maybeReportDecompressionFailure(AnonymousClass190 r6, AnonymousClass11Z r7, C19830z4 r8, Exception exc) {
        StringBuilder sb = new StringBuilder();
        sb.append("AbstractAppShellDelegate/maybeReportDecompressionFailure: available internal storage: ");
        sb.append(r7.A02());
        Log.i(sb.toString());
        Log.e("AbstractAppShellDelegate/maybeReportDecompressionFailure", exc);
        if (r8.A2b("decompression_failure_reported_timestamp", 86400000)) {
            r6.A0G("AbstractAppShellDelegate/maybeReportDecompressionFailure", "superpack decompression failed", true);
            r8.A1i("decompression_failure_reported_timestamp");
        }
    }

    private void setBouncyCastleProvider() {
        this.applicationCreatePerfTracker.A04("SetBouncyCastleProvider");
        Security.addProvider(new AnonymousClass1Bl());
        this.applicationCreatePerfTracker.A03("SetBouncyCastleProvider");
    }

    private void setStrictModePolicyForAppInit() {
        this.applicationCreatePerfTracker.A04("SetStrictModePolicyForAppInit");
        this.applicationCreatePerfTracker.A03("SetStrictModePolicyForAppInit");
    }

    private void setupTestEnvironmentForDebug() {
        C23061Ej.A01(this.appContext);
    }

    /* renamed from: lambda$installAnrDetector$0$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m30lambda$installAnrDetector$0$comwhatsappAbstractAppShellDelegate(C17930vS r2) {
        BreakpadManager.A00(this.appContext, r2);
    }

    /* renamed from: lambda$onCreate$2$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ String m31lambda$onCreate$2$comwhatsappAbstractAppShellDelegate() {
        return this.appContext.getString(2131899054);
    }

    /* renamed from: lambda$queueAsyncInit$4$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ void m32lambda$queueAsyncInit$4$comwhatsappAbstractAppShellDelegate() {
        C61792qG.A00(this.appContext);
    }

    /* renamed from: lambda$queueAsyncInit$6$com-whatsapp-AbstractAppShellDelegate  reason: not valid java name */
    public /* synthetic */ boolean m33lambda$queueAsyncInit$6$comwhatsappAbstractAppShellDelegate(AnonymousClass00X r4) {
        Boolean bool = C17960vV.A01;
        Log.i("app-init main thread idle");
        synchronized (this) {
            if (!this.asyncInitStarted) {
                this.asyncInitStarted = true;
                AnonymousClass10I CRy = r4.CRy();
                CRy.CGF(new AnonymousClass0ZB(r4));
                ((C30051dJ) r4.BCu().get()).A01(this.appContext);
                AnonymousClass1Q5 CBQ = r4.CBQ();
                CRy.CGF(new AnonymousClass0ZC(this));
                CRy.CGF(new AnonymousClass0ZK(CBQ, r4));
                r4.CQ3().A02("AppInit", "End");
            }
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18000vb r0 = this.whatsAppLocale;
        C17960vV.A07(r0);
        r0.A0P(configuration);
        C18000vb r02 = this.whatsAppLocale;
        C17960vV.A07(r02);
        r02.A0O();
    }

    /* JADX INFO: finally extract failed */
    public void onCreate() {
        AnonymousClass114.A01((Application) this.appContext);
        AnonymousClass00X r0 = (AnonymousClass00X) AnonymousClass00E.A00(this.appContext, AnonymousClass00X.class);
        initLogging(r0.BFf());
        Log.i("AbstractAppShellDelegate/onCreate");
        maybeRecoverFromFailureToSwitchAccountsDuringAppStartup(r0);
        Log.setCrashLogs(r0.BG6());
        initCrashHandling(r0.BDj(), r0.BG7());
        initStartupPathPerfLogging(r0);
        logDebugInfo();
        C223819r CQ3 = r0.CQ3();
        CQ3.A01(r0.BIa());
        CQ3.A02("AppInit", "Resume");
        this.applicationCreatePerfTracker.A04("DecompressLibraries");
        decompressLibraries(r0.CP7(), r0.BG6(), r0.CS2(), r0.COg(), r0.CS8(), r0.CRw(), r0.CS7(), r0.BIa());
        this.applicationCreatePerfTracker.A03("DecompressLibraries");
        Boolean bool = C17970vW.A03;
        r0.CS8().A02("wa_log");
        r0.CS8().A02("essential");
        installAnrDetector(r0.CP7(), r0.BAL(), r0.CRy(), r0.CGT(), r0.CS8(), r0.BCA(), r0.BhA(), r0.BIa());
        r0.CS8().A02("vlc");
        r0.CS8().A02(SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME);
        r0.CS8().A02("curve25519");
        r0.COS().A04();
        r0.COS().A0C(this.isFirstColdStart);
        r0.COS().A09("app_creation_on_create");
        r0.BLn().A00(C18150vq.A02(new C001000o(this)));
        setBouncyCastleProvider();
        setStrictModePolicyForAppInit();
        Method method = AnonymousClass1CH.A03;
        Trace.beginSection("AppShell/onCreate");
        try {
            this.whatsAppLocale = r0.CS9();
            AnonymousClass11O r3 = (AnonymousClass11O) r0.CRx().get();
            this.applicationCreatePerfTracker.A04("MainThreadInit");
            AnonymousClass1CI.A00(this.appContext);
            this.applicationCreatePerfTracker.A03("MainThreadInit");
            C17960vV.A03();
            queueAsyncInit(r0);
            Trace.endSection();
            AnonymousClass013.A03(r3.A00());
            C17960vV.A0E(false);
            this.applicationCreatePerfTracker.A00();
            r0.COS().A08("app_creation_on_create");
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public AbstractAppShellDelegate(Context context, C17910vQ r3) {
        this.appContext = context;
        this.appStartStat = r3;
    }

    private void decompressLibraries(AnonymousClass11P r11, AnonymousClass190 r12, AnonymousClass18K r13, AnonymousClass11Z r14, WhatsAppLibLoader whatsAppLibLoader, C19830z4 r16, C224319w r17, C17930vS r18) {
        if (whatsAppLibLoader.A03()) {
            C224319w r8 = r17;
            r8.A04(this.appContext, r18);
            AnonymousClass11P r3 = r11;
            AnonymousClass190 r4 = r12;
            AnonymousClass18K r5 = r13;
            AnonymousClass11Z r6 = r14;
            C19830z4 r7 = r16;
            if (!decompressAsset(r3, r4, r5, r6, r7, r8, false) && decompressAsset(r3, r4, r5, r6, r7, r8, true)) {
                r12.A0G("AbstractAppShellDelegate/decompressLibraries/fallback", (String) null, false);
                return;
            }
            return;
        }
        Log.e("AbstractAppShellDelegate/decompressLibraries: Could not load decompressor libraries");
    }

    private void initCrashHandling(AnonymousClass193 r1, AnonymousClass196 r2) {
        r2.A03(r1);
        AnonymousClass197.A01(r2);
    }

    private void initStartupPathPerfLogging(AnonymousClass00X r4) {
        AnonymousClass19Z BCE = r4.BCE();
        this.applicationCreatePerfTracker = BCE;
        BCE.A02(this.appStartStat.A03);
        this.applicationCreatePerfTracker.A01();
    }

    private void maybeRecoverFromFailureToSwitchAccountsDuringAppStartup(AnonymousClass00X r5) {
        if (new File(r5.BIa().A02("account_switching", 0), "checkpoint").exists()) {
            Log.i("AbstractAppShellDelegate/onCreate/checkpoint file exists/recoverFromFailureToSwitchAccountsDuringAppStartup");
            ((C63202sg) r5.BAe().get()).A03(true);
            r5.BG6().A0G("AbstractAppShellDelegate/recoverFromFailureToSwitchAccountsDuringAppStartup", (String) null, false);
        }
    }

    private void queueAsyncInit(AnonymousClass00X r3) {
        Looper.myQueue().addIdleHandler(new AnonymousClass012(r3, this));
    }
}
