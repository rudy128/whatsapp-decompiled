package X;

import android.app.ActivityManager;
import android.content.Context;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatRawEventLogger;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsServiceObjectsWrapper;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper;
import com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class DGT implements C28607E9y, C28561E7n, EDQ, EDP {
    public static final EDJ A0h = new BUX();
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public C26856DGn A03;
    public C28425E0q A04;
    public CWV A05;
    public C24483C5z A06;
    public C25534ChW A07;
    public C26845DGb A08;
    public C26847DGd A09;
    public String A0A = null;
    public String A0B = null;
    public boolean A0C = false;
    public boolean A0D = false;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I = false;
    public C26844DGa A0J;
    public C26846DGc A0K;
    public final ActivityManager A0L;
    public final CSP A0M;
    public final CSQ A0N;
    public final CPW A0O;
    public final C26011CqS A0P;
    public final CRM A0Q = new Object();
    public final QPLUserFlowImpl A0R;
    public final C24861CNe A0S = new C24861CNe();
    public final Object A0T = C17880vN.A0p();
    public final boolean[] A0U;
    public final CJF A0V;
    public final E4Y A0W;
    public final C9O A0X;
    public final EDH A0Y;
    public final Executor A0Z;
    public volatile CXC A0a = null;
    public volatile C191959nT A0b = null;
    public volatile C6W A0c = null;
    public volatile EDJ A0d;
    public volatile boolean A0e = false;
    public volatile boolean A0f = false;
    public volatile boolean A0g = true;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CRM, java.lang.Object] */
    public DGT(Context context, CJF cjf, E4Y e4y, C9O c9o, C26011CqS cqS, QPLUserFlowImpl qPLUserFlowImpl, Executor executor) {
        this.A0W = e4y;
        this.A0X = c9o;
        this.A0V = cjf;
        this.A0Y = cjf.A00;
        this.A0Z = executor;
        this.A0P = cqS;
        this.A0O = new CPW(cqS);
        this.A0M = new CSP(context, new CK0(e4y));
        this.A0N = new CSQ(c9o, cqS);
        this.A0U = new boolean[AnonymousClass00R.A00(6).length];
        this.A0R = qPLUserFlowImpl;
        this.A0L = (ActivityManager) context.getSystemService("activity");
        C26294Cx6.A02(BE8.A0Z(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - ctor");
    }

    private synchronized void A06() {
        C26844DGa dGa;
        C26845DGb dGb;
        C26846DGc dGc;
        int i;
        if (this.A0e && this.A03 != null) {
            CRM crm = this.A0Q;
            if (!(!crm.A03 || (dGa = crm.A00) == null || (dGb = crm.A01) == null || (dGc = crm.A02) == null)) {
                int i2 = 0;
                crm.A03 = false;
                CPW cpw = this.A0O;
                int i3 = dGb.A01;
                int i4 = dGb.A00;
                Integer num = dGa.A00;
                Integer num2 = AnonymousClass00R.A00;
                boolean A1Z = AnonymousClass000.A1Z(num, num2);
                int i5 = dGc.A00 * 90;
                int i6 = dGc.A01;
                if (A1Z) {
                    i = 360 - ((i6 + i5) % 360);
                } else {
                    i = (i6 - i5) + 360;
                }
                int i7 = i % 360;
                boolean A1Z2 = AnonymousClass000.A1Z(num, num2);
                cpw.A00 = i7;
                cpw.A01 = A1Z2;
                C26011CqS.A00(cpw.A02).setupImageSourceFacet(i3, i4, i3, i7, A1Z2);
                C26011CqS cqS = this.A0P;
                if (crm.A00.A00 != num2) {
                    i2 = 1;
                }
                C26011CqS.A00(cqS).setCameraFacing(i2);
            }
        }
    }

    public void CHu(CVG cvg) {
    }

    public static E94 A01(DGT dgt) {
        EffectServiceHost effectServiceHost;
        C26011CqS cqS = dgt.A0P;
        if (cqS.A0B == null || cqS.A02() == null) {
            return null;
        }
        if (cqS.A0B != null) {
            effectServiceHost = cqS.A02();
        } else {
            effectServiceHost = null;
        }
        return effectServiceHost.mArExperimentUtil;
    }

    private EDJ A03(String str) {
        String str2;
        EDJ edj = this.A0d;
        if (edj != null) {
            return edj;
        }
        C191959nT r0 = this.A0b;
        if (r0 != null) {
            str2 = r0.A03;
        } else {
            str2 = "null_config";
        }
        C26294Cx6.A05("FbMsqrdRenderer", "====== No proper logger !!!!!!!!!! ======");
        QuickPerformanceLogger A002 = AnonymousClass9TA.A00();
        if (A002 != null) {
            HashMap A11 = C17880vN.A11();
            A11.put("use_case", str);
            if (str2 == null) {
                str2 = "null_product_name";
            }
            A11.put("product_name", str2);
            A002.markerGenerateWithAnnotations(11282540, 4, 1, TimeUnit.MILLISECONDS, A11);
        }
        return A0h;
    }

    private void A04() {
        if (!this.A0F) {
            C26011CqS cqS = this.A0P;
            synchronized (cqS) {
                C26011CqS.A00(cqS).setupServiceHost(cqS.A02());
                AREngineController A002 = C26011CqS.A00(cqS);
                if (A002.renderSessionInit(false, cqS.A06.A00, 0, (GPUTimerImpl) null, (HybridLogSink) null, false)) {
                    A002.updatePerSessionDebugConfiguration(0, false, false, false);
                }
            }
            this.A0F = true;
        }
    }

    private void A05() {
        C28425E0q e0q = this.A04;
        if (e0q != null) {
            C26844DGa dGa = this.A0J;
            if (dGa != null) {
                Integer num = dGa.A00;
                Iterator it = ((C26720DAu) e0q).A00.iterator();
                while (it.hasNext()) {
                    CaptureEventInputWrapper captureEventInputWrapper = (CaptureEventInputWrapper) it.next();
                    int i = 2;
                    if (num == AnonymousClass00R.A00) {
                        i = 1;
                    }
                    captureEventInputWrapper.setCaptureDevicePosition(i);
                }
                this.A0J = null;
            }
            C26847DGd dGd = this.A09;
            if (dGd != null) {
                C28425E0q e0q2 = this.A04;
                int i2 = dGd.A02;
                int i3 = dGd.A01;
                float f = dGd.A00;
                Iterator it2 = ((C26720DAu) e0q2).A00.iterator();
                while (it2.hasNext()) {
                    ((CaptureEventInputWrapper) it2.next()).setPreviewViewInfo(i2, i3, f);
                }
                this.A09 = null;
            }
            C26845DGb dGb = this.A08;
            if (dGb != null) {
                C28425E0q e0q3 = this.A04;
                int i4 = dGb.A01;
                int i5 = dGb.A00;
                Iterator it3 = ((C26720DAu) e0q3).A00.iterator();
                while (it3.hasNext()) {
                    ((CaptureEventInputWrapper) it3.next()).setCaptureDeviceSize(i4, i5);
                }
                this.A08 = null;
            }
            C26846DGc dGc = this.A0K;
            if (dGc != null) {
                C28425E0q e0q4 = this.A04;
                int i6 = dGc.A00;
                Iterator it4 = ((C26720DAu) e0q4).A00.iterator();
                while (it4.hasNext()) {
                    ((CaptureEventInputWrapper) it4.next()).setRotation(i6);
                }
                this.A0K = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f7, code lost:
        if (r1.BNa(X.C24326BzN.A04, false) == false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A07(X.C26856DGn r9) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x002c
            X.CqS r5 = r8.A0P
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            boolean r0 = r0.platformAlgorithmDataNeeded
            r8.A0C = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            boolean r0 = r0.frameDataNeeded
            if (r0 != 0) goto L_0x002d
            X.C0O r0 = X.C0O.EXTERNAL_WORLD_TRACKING_EVENT
            r9.A01(r8, r0)
            X.C0O r0 = X.C0O.PLATFORM_ALGORITHM_DATA_EVENT
            r9.A01(r8, r0)
            X.C0O r0 = X.C0O.A0L
            r9.A01(r8, r0)
            X.C0O r0 = X.C0O.INPUT_PREVIEW
            r9.A01(r8, r0)
        L_0x002c:
            return
        L_0x002d:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            boolean r0 = r0.sLAMNeeded
            if (r0 != 0) goto L_0x0047
            X.C0O r0 = X.C0O.EXTERNAL_WORLD_TRACKING_EVENT
            r9.A01(r8, r0)
            X.C0O r0 = X.C0O.A0L
        L_0x003e:
            r9.A01(r8, r0)
        L_0x0041:
            X.C0O r0 = X.C0O.INPUT_PREVIEW
            r9.A00(r8, r0)
            return
        L_0x0047:
            X.E94 r2 = A01(r8)
            if (r2 == 0) goto L_0x0041
            X.BzN r1 = X.C24326BzN.WorldTracker_ARCoreSupported
            r0 = 0
            boolean r0 = r2.BNa(r1, r0)
            if (r0 == 0) goto L_0x012f
            X.DGg r3 = new X.DGg
            r3.<init>()
            java.util.HashMap r4 = r3.A00
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            if (r0 == 0) goto L_0x00e6
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            boolean r0 = r0.usesWorldTrackingEnvironmentLight
        L_0x006d:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "enableARCoreLightEstimation"
            r4.put(r0, r1)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            if (r0 == 0) goto L_0x00e4
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            boolean r0 = r0.horizontalTrackableDetectionNeeded
        L_0x0084:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "enableARCoreHorizontalPlanes"
            r4.put(r0, r1)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            if (r0 == 0) goto L_0x00e2
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest
            boolean r0 = r0.verticalTrackableDetectionNeeded
        L_0x009b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "enableARCoreVerticalPlanes"
            r4.put(r0, r1)
            r0 = 1
            X.DVt r2 = new X.DVt
            r2.<init>((java.lang.Object) r8, (int) r0)
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r6 = r0.mEffectManifest
            r5 = 0
            if (r6 == 0) goto L_0x0112
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "manifest.usesSceneDepth: "
            r1.append(r0)
            boolean r0 = r6.usesSceneDepth
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r7 = "EffectCapabilityChecker"
            X.C26294Cx6.A04(r7, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "manifest.usesMultiplane: "
            r1.append(r0)
            boolean r0 = r6.usesMultiplane
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.C26294Cx6.A04(r7, r0)
            goto L_0x00e8
        L_0x00e2:
            r0 = 0
            goto L_0x009b
        L_0x00e4:
            r0 = 0
            goto L_0x0084
        L_0x00e6:
            r0 = 0
            goto L_0x006d
        L_0x00e8:
            java.lang.Object r1 = r2.call()     // Catch:{ Exception -> 0x0138 }
            X.E94 r1 = (X.E94) r1     // Catch:{ Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00f9
            X.BzN r0 = X.C24326BzN.WorldTracker_EnableHitTestWithDepth
            boolean r0 = r1.BNa(r0, r5)
            r2 = 1
            if (r0 != 0) goto L_0x00fa
        L_0x00f9:
            r2 = 0
        L_0x00fa:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WorldTracker_EnableHitTestWithDepth: "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r2)
            X.C26294Cx6.A04(r7, r0)
            boolean r0 = r6.usesSceneDepth
            if (r0 != 0) goto L_0x0111
            boolean r0 = r6.usesMultiplane
            if (r0 == 0) goto L_0x0112
            if (r2 == 0) goto L_0x0112
        L_0x0111:
            r5 = 1
        L_0x0112:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            java.lang.String r0 = "enableARCoreDepth"
            r4.put(r0, r1)
            r0 = 0
            r9.CCm(r3, r0)
            X.C0O r0 = X.C0O.EXTERNAL_WORLD_TRACKING_EVENT
            r9.A00(r8, r0)
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x0041
            X.C0O r0 = X.C0O.PLATFORM_ALGORITHM_DATA_EVENT
            r9.A00(r8, r0)
            goto L_0x0041
        L_0x012f:
            X.C0O r0 = X.C0O.EXTERNAL_WORLD_TRACKING_EVENT
            r9.A01(r8, r0)
            X.C0O r0 = X.C0O.PLATFORM_ALGORITHM_DATA_EVENT
            goto L_0x003e
        L_0x0138:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGT.A07(X.DGn):void");
    }

    public static void A08(C26856DGn dGn, C28561E7n e7n) {
        if (dGn != null) {
            dGn.A00(e7n, C0O.INPUT_PREVIEW_SIZE);
            dGn.A00(e7n, C0O.INPUT_FACING);
            dGn.A00(e7n, C0O.INPUT_ROTATION);
            dGn.A00(e7n, C0O.TOUCH_INPUT_CONFIG);
            dGn.A00(e7n, C0O.A0P);
            dGn.A00(e7n, C0O.A0R);
            dGn.A00(e7n, C0O.A0I);
            dGn.A00(e7n, C0O.A0Q);
            dGn.A00(e7n, C0O.PREVIEW_VIEW_SIZE);
            dGn.A00(e7n, C0O.A0C);
            dGn.A00(e7n, C0O.INPUT_CAPTURE_CONTEXT);
            dGn.A00(e7n, C0O.A0W);
        }
    }

    public static void A09(C26856DGn dGn, C28561E7n e7n) {
        if (dGn != null) {
            dGn.A01(e7n, C0O.INPUT_PREVIEW_SIZE);
            dGn.A01(e7n, C0O.INPUT_FACING);
            dGn.A01(e7n, C0O.INPUT_ROTATION);
            dGn.A01(e7n, C0O.INPUT_PREVIEW);
            dGn.A01(e7n, C0O.A0L);
            dGn.A01(e7n, C0O.TOUCH_INPUT_CONFIG);
            dGn.A01(e7n, C0O.A0P);
            dGn.A01(e7n, C0O.A0R);
            dGn.A01(e7n, C0O.A0I);
            dGn.A01(e7n, C0O.A0Q);
            dGn.A01(e7n, C0O.PREVIEW_VIEW_SIZE);
            dGn.A01(e7n, C0O.A0C);
            dGn.A01(e7n, C0O.INPUT_CAPTURE_CONTEXT);
            dGn.A01(e7n, C0O.EXTERNAL_WORLD_TRACKING_EVENT);
            dGn.A01(e7n, C0O.PLATFORM_ALGORITHM_DATA_EVENT);
            dGn.A01(e7n, C0O.A0W);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: X.CPO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: X.CPO} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: X.CPO} */
    /* JADX WARNING: type inference failed for: r0v127, types: [java.lang.Object, X.C36] */
    /* JADX WARNING: type inference failed for: r0v142, types: [X.C5C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v165, types: [X.C5b, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A(X.C191959nT r40, X.C6W r41) {
        /*
            r39 = this;
            r2 = r39
            r2.A06()
            X.CqS r0 = r2.A0P
            r38 = r0
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r1 = r38.A02()
            r3 = r40
            java.lang.String r0 = r3.A04
            if (r0 == 0) goto L_0x0015
            r1.mProductSessionId = r0
        L_0x0015:
            r22 = r41
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r38.A02()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r0 = r0.mEffectServiceHostConfig     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig r0 = r0.mFaceTrackerDataProviderConfig     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Integer r9 = X.AnonymousClass00R.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0029
            int r0 = r0.executionMode     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0029
            java.lang.Integer r9 = X.AnonymousClass00R.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0029:
            X.CSP r8 = r2.A0M     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r6 = 0
            X.CXC r0 = r3.A02     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x00f0
            X.Cih r4 = new X.Cih     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0035:
            r8.A00 = r4     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r5 = r3.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r5 == 0) goto L_0x00c7
            java.lang.String r4 = r3.A06     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r4 == 0) goto L_0x00c7
            r1 = 256(0x100, float:3.59E-43)
            X.BPm r0 = X.C22799BPm.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CtG r7 = new X.CtG     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r7.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r5 = r7.A02(r5)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r4 = r7.A02(r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 5
            r7.A05(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r10 = 4
            r11 = 149(0x95, float:2.09E-43)
            r0 = 0
            r7.A07(r10, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.nio.ByteBuffer r1 = r7.A07     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r7.A03     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r0 + -4
            r7.A03 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.putInt(r0, r11)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int[] r1 = r7.A0A     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = X.C26150CtG.A00(r7)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1[r10] = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r11 = 3
            r10 = 45000(0xafc8, float:6.3058E-41)
            r1 = 0
            r0 = 4
            r7.A07(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.nio.ByteBuffer r1 = r7.A07     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r7.A03     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r0 + -4
            r7.A03 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.putInt(r0, r10)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int[] r1 = r7.A0A     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = X.C26150CtG.A00(r7)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1[r11] = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1 = 1
            r0 = 0
            r7.A06(r1, r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r7.A06(r0, r5)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5 = 2
            r4 = 1
            r7.A07(r1, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.nio.ByteBuffer r1 = r7.A07     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r7.A03     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r0 + -1
            r7.A03 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.put(r0, r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int[] r1 = r7.A0A     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = X.C26150CtG.A00(r7)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1[r5] = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r7.A01()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r7.A04(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Class<X.BPn> r0 = X.C22800BPn.class
            X.CPO r1 = A02(r7, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = X.C0M.A08     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN1 r4 = new X.CN1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cih r0 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.Map r1 = r0.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.put(r0, r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x00c7:
            java.util.HashMap r4 = r3.A0O     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r7 = 0
            if (r4 == 0) goto L_0x011a
            java.util.Set r1 = r4.keySet()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Object[] r11 = r1.toArray(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String[] r11 = (java.lang.String[]) r11     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r4.size()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1 = 0
        L_0x00df:
            int r0 = r4.size()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r1 >= r0) goto L_0x0100
            r0 = r11[r1]     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r10[r1] = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r1 = r1 + 1
            goto L_0x00df
        L_0x00f0:
            android.content.Context r1 = r8.A02     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cih r4 = new X.Cih     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN0 r0 = new X.CN0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.<init>(r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A03 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x0035
        L_0x0100:
            java.lang.String r5 = r3.A0A     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cih r4 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.DAr r1 = new X.DAr     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.<init>(r8, r3)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C5b r0 = new X.C5b     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.<init>()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A01 = r9     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A04 = r11     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A03 = r10     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A00 = r1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A02 = r5     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x011a:
            java.lang.String r9 = r3.A0B     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r9 == 0) goto L_0x012e
            X.Cih r5 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cgb r4 = X.BQY.A02     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r0 = r3.A0C     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.BQY r1 = new X.BQY     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.<init>(r9, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.HashMap r0 = r5.A06     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.put(r4, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x012e:
            java.lang.String r9 = r3.A0N     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r9 == 0) goto L_0x0163
            X.Cih r5 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1 = 64
            X.BPm r0 = X.C22799BPm.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CtG r4 = new X.CtG     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r1 = r4.A02(r9)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 1
            r4.A05(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A06(r7, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r4.A01()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A04(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Class<X.BPp> r0 = X.C22802BPp.class
            X.CPO r1 = A02(r4, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = X.C0M.A1F     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN1 r4 = new X.CN1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.Map r1 = r5.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.put(r0, r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0163:
            java.lang.String r9 = r3.A09     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r9 == 0) goto L_0x0198
            X.Cih r5 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1 = 64
            X.BPm r0 = X.C22799BPm.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CtG r4 = new X.CtG     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r1 = r4.A02(r9)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 4
            r4.A05(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A06(r7, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r4.A01()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A04(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Class<X.BPo> r0 = X.C22801BPo.class
            X.CPO r1 = A02(r4, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = X.C0M.A0Q     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN1 r4 = new X.CN1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.Map r1 = r5.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = r4.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.put(r0, r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0198:
            java.lang.String r11 = r3.A0L     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r11 != 0) goto L_0x01a4
            java.lang.String r0 = r3.A0I     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 != 0) goto L_0x01a4
            java.lang.String r0 = r3.A0K     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0252
        L_0x01a4:
            java.lang.String r10 = r3.A0M     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r9 = r3.A0I     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r4 = r3.A0J     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r12 = r3.A0K     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cih r0 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r13 = X.C0M.A12     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.Map r0 = r0.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN1 r0 = (X.CN1) r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 != 0) goto L_0x01c2
            X.CPO r1 = new X.CPO     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.<init>()     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x01bf:
            r8.A01 = r1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x01c5
        L_0x01c2:
            X.CPO r1 = r0.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x01bf
        L_0x01c5:
            if (r0 != 0) goto L_0x01d5
            X.Cih r0 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN1 r5 = new X.CN1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5.<init>(r13, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.Map r1 = r0.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C0M r0 = r5.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.put(r0, r5)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x01d5:
            X.CK0 r0 = r8.A03     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CJx r1 = new X.CJx     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CPO r0 = r8.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A02 = r1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1 = 512(0x200, float:7.175E-43)
            X.BPm r0 = X.C22799BPm.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CtG r5 = new X.CtG     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5.<init>(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r11 != 0) goto L_0x0208
            r11 = 0
        L_0x01ec:
            if (r10 != 0) goto L_0x0203
            r10 = 0
        L_0x01ef:
            if (r9 != 0) goto L_0x01fe
            r9 = 0
        L_0x01f2:
            if (r4 != 0) goto L_0x01f9
            r4 = 0
        L_0x01f5:
            if (r12 != 0) goto L_0x020d
            r1 = 0
            goto L_0x0211
        L_0x01f9:
            int r4 = r5.A02(r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x01f5
        L_0x01fe:
            int r9 = r5.A02(r9)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x01f2
        L_0x0203:
            int r10 = r5.A02(r10)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x01ef
        L_0x0208:
            int r11 = r5.A02(r11)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x01ec
        L_0x020d:
            int r1 = r5.A02(r12)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0211:
            r0 = 6
            r5.A05(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 4
            r5.A06(r0, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 3
            r5.A06(r0, r4)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 2
            r5.A06(r0, r9)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 1
            r5.A06(r0, r10)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5.A06(r7, r11)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r5.A01()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5.A04(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CPO r1 = r8.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Class<X.BPq> r0 = X.C22803BPq.class
            r5.A03()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.nio.ByteBuffer r5 = r5.A07     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r4 = r0.hashCode()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C5C r0 = new X.C5C     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.<init>()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A00 = r4     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A01 = r5     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.A01 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid r1 = r1.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r1 == 0) goto L_0x0252
            int r0 = r5.position()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.setConfiguration(r4, r5, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0252:
            java.lang.String r0 = r3.A0D     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x025f
            X.Cih r1 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C36 r0 = new X.C36     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.<init>()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.A01 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x025f:
            java.util.Map r4 = r3.A0Q     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r4 == 0) goto L_0x0295
            java.util.Set r1 = r4.keySet()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Object[] r7 = r1.toArray(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r0 = r4.size()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String[] r5 = new java.lang.String[r0]     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1 = 0
        L_0x0276:
            int r0 = r4.size()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r1 >= r0) goto L_0x0287
            r0 = r7[r1]     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5[r1] = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            int r1 = r1 + 1
            goto L_0x0276
        L_0x0287:
            X.Cih r0 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cgb r4 = X.BQW.A02     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.BQW r1 = new X.BQW     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.<init>(r7, r5)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.HashMap r0 = r0.A06     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.put(r4, r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0295:
            X.Cih r0 = r8.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CXC r9 = new X.CXC     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r9.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.Cgb r1 = X.BQQ.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.util.HashMap r8 = r9.A06     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r0 = r8.containsKey(r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x02b0
            r9.A00(r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r0 = "getDataSource"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            throw r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x02b0:
            r2.A0a = r9     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r38.A02()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost r0 = (com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost) r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger r0 = r0.analyticsLogger     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r38.A02()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x02e1
            java.lang.String r5 = r3.A03     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r5 != 0) goto L_0x02c5
            java.lang.String r5 = ""
        L_0x02c5:
            java.lang.String r4 = r3.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r4 != 0) goto L_0x02cb
            java.lang.String r4 = ""
        L_0x02cb:
            X.BzE r1 = r3.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r0 = (com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl) r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.mProductName = r5     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.mEffectStartIntent = r1     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.E0o r0 = r0.mCameraARAnalyticsLogger     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x02e1
            X.DAt r0 = (X.C26719DAt) r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A00 = r5     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.DHl r0 = r0.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A01 = r4     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.A00 = r1     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x02e1:
            X.BzE r1 = r3.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.BzE r0 = X.C24317BzE.USER_INTERACTION     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r1 != r0) goto L_0x02eb
            X.BzE r0 = X.C24317BzE.SYSTEM     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r3.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x02eb:
            r3.A01 = r6     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CN0 r4 = r9.A04     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r4 == 0) goto L_0x02fe
            java.lang.String r0 = "tryPassLoggerToAudioConfiguration"
            X.EDJ r1 = r2.A03(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CJy r0 = new X.CJy     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.<init>(r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r4.A00 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x02fe:
            java.lang.String r21 = "Time to setEffect: %d"
            java.lang.String r11 = "FbMsqrdRenderer"
            java.lang.String r10 = r3.A08     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r26 = r10
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r38.A02()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            java.lang.String r0 = r0.mProductSessionId     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r20 = r0
            java.lang.String r0 = r3.A01     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r19 = r0
            X.BzE r0 = r3.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r24 = r0
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 1
            r2.A0D = r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r2.A0E = r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0 = 0
            r2.A02 = r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r5 = 0
            r2.A0G = r5     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r12 = r38.A02()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.List r0 = r12.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x0330:
            boolean r0 = r1.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0340
            java.lang.Object r0 = r1.next()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration r0 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration) r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.destroy()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            goto L_0x0330
        L_0x0340:
            java.util.List r0 = r12.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.clear()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r12.mServicesHostConfiguration = r9     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0 = 6
            X.Cgb[] r13 = new X.C25480Cgb[r0]     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.Cgb r7 = X.BQR.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13[r5] = r7     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r1 = 1
            X.Cgb r0 = X.BQO.A00     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13[r1] = r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r1 = 2
            X.Cgb r0 = com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration.A00     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13[r1] = r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r1 = 3
            X.Cgb r0 = X.BQZ.A04     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13[r1] = r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0 = 4
            X.Cgb r6 = X.BQV.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13[r0] = r6     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r1 = 5
            X.Cgb r0 = X.BQU.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.List r0 = X.C18070vi.A0O(r0, r13, r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x0375:
            boolean r0 = r14.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0393
            java.lang.Object r13 = r14.next()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r0 = r8.containsKey(r13)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0375
            java.lang.Object r0 = r8.get(r13)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C5m r0 = (X.C24472C5m) r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration r0 = r0.A00()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r1.add(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            goto L_0x0375
        L_0x0393:
            r4.addAll(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C5b r1 = r9.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r1 == 0) goto L_0x03a2
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid r0 = new com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r4.add(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x03a2:
            X.Cgb r1 = X.BQX.A02     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r0 = r8.containsKey(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x03b8
            X.C5m r1 = r9.A00(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.BQX r1 = (X.BQX) r1     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid r0 = new com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r4.add(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x03b8:
            X.Cgb r1 = X.BQT.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r0 = r8.containsKey(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x03ce
            X.C5m r1 = r9.A00(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.BQT r1 = (X.BQT) r1     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid r0 = new com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation.MotionDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r4.add(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x03ce:
            X.Cgb r1 = X.BQW.A02     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r0 = r8.containsKey(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x03e4
            X.C5m r1 = r9.A00(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.BQW r1 = (X.BQW) r1     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid r0 = new com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r4.add(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x03e4:
            java.util.Map r0 = r9.A00     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.Iterator r16 = X.C17890vO.A0l(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x03ee:
            boolean r0 = r16.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0430
            java.lang.Object r15 = r16.next()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CN1 r15 = (X.CN1) r15     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C18070vi.A0b(r15)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0 = 1
            X.C18070vi.A0d(r15, r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CPO r0 = r15.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C18070vi.A0X(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid r13 = new com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageDataSourceHybrid     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.A00 = r13     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C5C r0 = r0.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x041c
            int r14 = r0.A00     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.nio.ByteBuffer r1 = r0.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            int r0 = r1.position()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r13.setConfiguration(r14, r1, r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x041c:
            X.C0M r0 = r15.A00     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            int r0 = r0.mCppValue     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.jni.HybridData r1 = com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid.initHybrid(r13, r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C18070vi.A0b(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid r0 = new com.facebook.cameracore.mediapipeline.services.messagechannel.implementation.ServiceMessageChannelHybrid     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r4.add(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            goto L_0x03ee
        L_0x0430:
            r12.mServiceConfigurations = r4     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.List r0 = r12.mServiceModules     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x0438:
            boolean r0 = r4.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0450
            java.lang.Object r0 = r4.next()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule r0 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule) r0     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration r1 = r0.createConfiguration(r9)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r1 == 0) goto L_0x0438
            java.util.List r0 = r12.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.add(r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            goto L_0x0438
        L_0x0450:
            java.util.List r0 = r12.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r33 = r0
            java.lang.String r4 = r3.A0E     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.lang.String r0 = r3.A0G     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r16 = r0
            java.util.List r0 = r3.A0P     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0479
            X.1IX r30 = X.AnonymousClass1IX.copyOf((java.util.Collection) r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x0462:
            r36 = 0
            r1 = 0
            com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher r35 = new com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r27 = r35
            r28 = r4
            r29 = r16
            r31 = r36
            r32 = r5
            r27.<init>(r28, r29, r30, r31, r32)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.lang.String r12 = r3.A0F     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r12 != 0) goto L_0x047d
            goto L_0x047c
        L_0x0479:
            r30 = 0
            goto L_0x0462
        L_0x047c:
            r12 = r4
        L_0x047d:
            java.lang.String r0 = ""
            if (r10 != 0) goto L_0x0483
            r26 = r0
        L_0x0483:
            if (r20 != 0) goto L_0x0487
            r20 = r0
        L_0x0487:
            if (r19 != 0) goto L_0x048b
            r19 = r0
        L_0x048b:
            java.lang.String r15 = r3.A07     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C199610h.A04(r15)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig r14 = r9.A03     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CNe r5 = r2.A0S     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r4 = 1
            java.util.List r32 = r35.getAsyncAssets()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r23 = X.C26011CqS.A00(r38)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0 = r24
            int r13 = r0.mCppValue     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            java.lang.Integer r0 = r5.A01     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            int r37 = A00(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r24 = r12
            r25 = r16
            r27 = r20
            r28 = r19
            r29 = r13
            r30 = r15
            r31 = r4
            r34 = r14
            r23.setEffect(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = X.C26011CqS.A00(r38)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.updatePerEffectDebugConfiguration(r1, r1, r1, r1)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CSQ r0 = r2.A0N     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r0.A01 = r4     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CWV r0 = r2.A05     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0501
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r38.A02()     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r1 = r0.mEffectManifest     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CWV r14 = r2.A05     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r0 = r1.supportsTapGesture     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r16 = r0
            boolean r15 = r1.supportsPanGesture     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r13 = r1.supportsPinchGesture     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r12 = r1.supportsRotateGesture     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r5 = r1.supportsLongPressGesture     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r4 = r1.supportsRawTouchGesture     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            boolean r0 = r1.usesTouchService     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CTE r1 = new X.CTE     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r23 = r1
            r24 = r16
            r25 = r15
            r26 = r13
            r27 = r12
            r28 = r5
            r29 = r4
            r30 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            r14.A01 = r1     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.CwN r0 = r14.A00     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            if (r0 == 0) goto L_0x0501
            r0.A0B = r1     // Catch:{ UnsatisfiedLinkError -> 0x059f }
            X.C26273CwN.A03(r0)     // Catch:{ UnsatisfiedLinkError -> 0x059f }
        L_0x0501:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = r17
            java.lang.Long r1 = X.C108945cZ.A1B(r4, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = r21
            X.C26294Cx6.A02(r1, r11, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r0 = r8.containsKey(r7)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0523
            X.C5m r0 = r9.A00(r7)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.BQR r0 = (X.BQR) r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.E0q r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r2.A04 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r2.A05()     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0523:
            boolean r0 = r8.containsKey(r6)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x056c
            X.C5m r0 = r9.A00(r6)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.BQV r0 = (X.BQV) r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CWV r0 = r0.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r2.A05 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r0 = r2.A0D     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0563
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r38.A02()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CWV r5 = r2.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r12 = r0.supportsTapGesture     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r13 = r0.supportsPanGesture     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r14 = r0.supportsPinchGesture     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r15 = r0.supportsRotateGesture     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r4 = r0.supportsLongPressGesture     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r1 = r0.supportsRawTouchGesture     // Catch:{ EffectsFrameworkException -> 0x05bb }
            boolean r0 = r0.usesTouchService     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CTE r11 = new X.CTE     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r16 = r4
            r17 = r1
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r5.A01 = r11     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.CwN r0 = r5.A00     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0563
            r0.A0B = r11     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.C26273CwN.A03(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0563:
            X.C5z r1 = r2.A06     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r1 == 0) goto L_0x056c
            X.CWV r0 = r2.A05     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.A00(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x056c:
            X.ChW r0 = r2.A07     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 != 0) goto L_0x057c
            X.CJz r1 = new X.CJz     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r1.<init>(r2)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            X.ChW r0 = new X.ChW     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0.<init>(r1)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r2.A07 = r0     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x057c:
            r0 = r38
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r0.A0B     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r0 == 0) goto L_0x0585
            r38.A02()     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x0585:
            X.DGn r0 = r2.A03     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r2.A07(r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            if (r41 == 0) goto L_0x058f
            r22.A01()     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x058f:
            if (r10 == 0) goto L_0x0608
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r1 = r2.A0R     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r4 = r1.getInstanceIdWithString(r0, r10)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = 3
            r1.markPoint(r4, r0, r10)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            goto L_0x0608
        L_0x059f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x05aa }
            com.facebook.cameracore.common.exception.EffectsFrameworkException r0 = new com.facebook.cameracore.common.exception.EffectsFrameworkException     // Catch:{ all -> 0x05aa }
            r0.<init>(r1)     // Catch:{ all -> 0x05aa }
            throw r0     // Catch:{ all -> 0x05aa }
        L_0x05aa:
            r6 = move-exception
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = r17
            java.lang.Long r1 = X.C108945cZ.A1B(r4, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            r0 = r21
            X.C26294Cx6.A02(r1, r11, r0)     // Catch:{ EffectsFrameworkException -> 0x05bb }
            throw r6     // Catch:{ EffectsFrameworkException -> 0x05bb }
        L_0x05bb:
            r5 = move-exception
            X.9nT r4 = r2.A0b
            X.DGn r0 = r2.A03
            A09(r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unsetMsqrd-"
            r1.append(r0)
            java.lang.String r0 = "ex"
            r1.append(r0)
            r1.toString()
            r1 = 0
            r2.A0B(r4, r5)
            r0 = 0
            r2.A0c = r0
            r2.A0e = r1
            r2.A0a = r0
            r2.A0b = r0
            java.lang.String r4 = r3.A07
            X.E4Y r3 = r2.A0W
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "setEffectToEngine failed, file exist: "
            r1.append(r0)
            if (r4 == 0) goto L_0x060e
            boolean r0 = X.C108975cc.A1M(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x05f8:
            java.lang.String r1 = X.C17890vO.A0V(r0, r1)
            java.lang.String r0 = "FbMsqrdRenderer"
            r3.CNX(r0, r1, r5)
            if (r41 == 0) goto L_0x0608
            r0 = r22
            r0.A02(r5)
        L_0x0608:
            X.CSQ r1 = r2.A0N
            r0 = 1
            r1.A01 = r0
            return
        L_0x060e:
            java.lang.String r0 = "null path"
            goto L_0x05f8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGT.A0A(X.9nT, X.C6W):void");
    }

    private void A0B(C191959nT r10, Exception exc) {
        String message;
        String str;
        AnalyticsLogger analyticsLogger;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper;
        String str2;
        if (!(r10 == null || (str2 = r10.A08) == null)) {
            QPLUserFlowImpl qPLUserFlowImpl = this.A0R;
            qPLUserFlowImpl.markPoint(qPLUserFlowImpl.getInstanceIdWithString(16321564, str2), 7, str2);
        }
        boolean z = this.A0D;
        C26011CqS cqS = this.A0P;
        synchronized (cqS) {
            if (z) {
                if (cqS.A0B != null) {
                    cqS.A0B.stopEffect();
                    cqS.A0B.cleanupServices();
                }
                AREngineController aREngineController = cqS.A04;
                if (aREngineController != null) {
                    aREngineController.onEffectStopped();
                }
            } else if (cqS.A0B != null) {
                cqS.A0B.cleanupServices();
            }
        }
        CXC cxc = this.A0a;
        if (cxc != null) {
            Iterator A0j = C17890vO.A0j(cxc.A06);
            while (A0j.hasNext()) {
                C24472C5m c5m = (C24472C5m) A0j.next();
                if (c5m instanceof BQV) {
                    ((BQV) c5m).A00.A03.clear();
                } else if (c5m instanceof BQR) {
                    ((C26720DAu) ((BQR) c5m).A00).A00.clear();
                } else if ((c5m instanceof BQX) && (platformEventsServiceObjectsWrapper = ((BQX) c5m).A00.A00) != null) {
                    platformEventsServiceObjectsWrapper._isAlive = false;
                    platformEventsServiceObjectsWrapper.mHybridData.resetNative();
                }
            }
        }
        C24483C5z c5z = this.A06;
        if (c5z != null) {
            c5z.A00((CWV) null);
        }
        this.A0K = null;
        this.A08 = null;
        this.A0J = null;
        this.A09 = null;
        this.A04 = null;
        this.A0D = false;
        if (exc == null) {
            if (!(cqS.A0B == null || (analyticsLogger = ((WhatsAppEffectServiceHost) cqS.A02()).analyticsLogger) == null)) {
                C26716DAq dAq = new C26716DAq(analyticsLogger);
                C8R c8r = XplatSparsLogger.Companion;
                new XplatSparsLogger(new XplatRawEventLogger(dAq));
            }
            if (r10 != null && (str = r10.A08) != null) {
                QPLUserFlowImpl qPLUserFlowImpl2 = this.A0R;
                qPLUserFlowImpl2.endSuccess(qPLUserFlowImpl2.getInstanceIdWithString(16321564, str), str);
            }
        } else if (r10 != null) {
            QPLUserFlowImpl qPLUserFlowImpl3 = this.A0R;
            String str3 = r10.A08;
            long instanceIdWithString = qPLUserFlowImpl3.getInstanceIdWithString(16321564, str3);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Loading effect error: ");
            if (exc.getMessage() == null) {
                message = "";
            } else {
                message = exc.getMessage();
            }
            String A0y = AnonymousClass000.A0y(message, A10);
            if (str3 == null) {
                str3 = "";
            }
            qPLUserFlowImpl3.endFail(instanceIdWithString, "renderer", 1, A0y, str3);
        }
    }

    public String BY8() {
        return "FbMsqrdRenderer";
    }

    public boolean Bfc() {
        if (!this.A0D) {
            return false;
        }
        C26011CqS cqS = this.A0P;
        if (cqS.A0B != null) {
            return cqS.A02().mEffectManifest.multipleOutputsSupported;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        if (Bfc() == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0181, code lost:
        if (r10.A00 != r11) goto L_0x0183;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x029a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BsM(X.C25599Cie r35, long r36) {
        /*
            r34 = this;
            java.lang.String r0 = "FbMsqrdRenderer.onDrawFrameInternal"
            android.os.Trace.beginSection(r0)
            r5 = r34
            boolean r0 = r5.A0f
            r9 = 0
            if (r0 != 0) goto L_0x0050
            monitor-enter(r5)
            java.lang.Object r3 = r5.A0T     // Catch:{ all -> 0x004d }
            monitor-enter(r3)     // Catch:{ all -> 0x004d }
            boolean r0 = r5.A0f     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x003f
            boolean r0 = r5.A0e     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003f
            r5.A04()     // Catch:{ all -> 0x004a }
            r0 = 1
            r5.A0f = r0     // Catch:{ all -> 0x004a }
            boolean r0 = r5.A0I     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0031
            X.CqS r0 = r5.A0P     // Catch:{ all -> 0x004a }
            int r2 = r5.A01     // Catch:{ all -> 0x004a }
            int r1 = r5.A00     // Catch:{ all -> 0x004a }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = X.C26011CqS.A00(r0)     // Catch:{ all -> 0x004a }
            r0.resize(r2, r1)     // Catch:{ all -> 0x004a }
            r5.A0I = r9     // Catch:{ all -> 0x004a }
        L_0x0031:
            X.9nT r1 = r5.A0b     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003f
            X.DGn r0 = r5.A03     // Catch:{ all -> 0x004a }
            A08(r0, r5)     // Catch:{ all -> 0x004a }
            X.C6W r0 = r5.A0c     // Catch:{ all -> 0x004a }
            r5.A0A(r1, r0)     // Catch:{ all -> 0x004a }
        L_0x003f:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r5)
            boolean r0 = r5.A0f
            if (r0 != 0) goto L_0x0050
            android.os.Trace.endSection()
            r13 = 0
            return r13
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0050:
            X.9nT r4 = r5.A0b
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0085
            X.C6W r2 = r5.A0c
            if (r2 == 0) goto L_0x0069
            X.CqS r0 = r5.A0P
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r0.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r1 = r0.mEffectManifest
            boolean r0 = r2 instanceof X.BUE
            if (r0 == 0) goto L_0x0069
            X.C18070vi.A0d(r1, r9)
        L_0x0069:
            if (r4 == 0) goto L_0x0085
            X.E94 r1 = A01(r5)
            java.lang.String r2 = "logEffectForceFBAEnabled"
            if (r1 == 0) goto L_0x0078
            X.BzN r0 = X.C24326BzN.AREngine_ForcePhase4Audio
            r1.BNa(r0, r9)
        L_0x0078:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "updateAnnotation "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            r5.A03(r0)
        L_0x0085:
            r10 = r35
            X.CZB r0 = r10.A01
            if (r0 == 0) goto L_0x0318
            X.CqS r7 = r5.A0P
            int r3 = r0.A00
            int r2 = r0.A01
            X.CRH r0 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r7.A00 = r3
            r7.A02 = r2
            r7.A03 = r1
            r7.A01 = r0
            boolean r6 = r5.A0E
            r2 = 0
            if (r6 == 0) goto L_0x00f9
            long r0 = android.os.SystemClock.elapsedRealtime()
        L_0x00a9:
            if (r4 != 0) goto L_0x00f6
            r11 = 0
        L_0x00ac:
            if (r6 == 0) goto L_0x00c3
            if (r11 == 0) goto L_0x00b9
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r3 = r5.A0R
            r2 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r2 = r3.getInstanceIdWithString(r2, r11)
        L_0x00b9:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r8 = r5.A0R
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = "null_config_session"
        L_0x00bf:
            r6 = 4
            r8.markPoint(r2, r6, r11)
        L_0x00c3:
            boolean r6 = r5.A0e
            r8 = 1
            if (r6 == 0) goto L_0x016d
            boolean r6 = r5.A0H
            if (r6 != 0) goto L_0x00e2
            boolean[] r11 = r5.A0U
            X.CNe r6 = r5.A0S
            java.lang.Integer r6 = r6.A01
            int r6 = r6.intValue()
            boolean r6 = r11[r6]
            if (r6 == 0) goto L_0x00e2
            boolean r6 = r5.Bfc()
            r32 = 0
            if (r6 != 0) goto L_0x00e4
        L_0x00e2:
            r32 = 1
        L_0x00e4:
            float[] r6 = r10.A04
            r23 = r6
            float[] r6 = r10.A05
            r21 = r6
            float[] r6 = r10.A03
            r20 = r6
            long r11 = r10.A00
            X.CNe r6 = r5.A0S
            monitor-enter(r7)
            goto L_0x00fc
        L_0x00f6:
            java.lang.String r11 = r4.A08
            goto L_0x00ac
        L_0x00f9:
            r0 = 0
            goto L_0x00a9
        L_0x00fc:
            com.facebook.cameracore.mediapipeline.engine.AREngineController r18 = X.C26011CqS.A00(r7)     // Catch:{ all -> 0x016a }
            int r10 = r7.A00     // Catch:{ all -> 0x016a }
            r19 = r10
            int r15 = r7.A02     // Catch:{ all -> 0x016a }
            int r14 = r7.A03     // Catch:{ all -> 0x016a }
            int r13 = r7.A01     // Catch:{ all -> 0x016a }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r26 = r36 * r16
            java.lang.Integer r10 = r6.A01     // Catch:{ all -> 0x016a }
            int r30 = A00(r10)     // Catch:{ all -> 0x016a }
            java.lang.Integer r10 = r6.A00     // Catch:{ all -> 0x016a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x016a }
            switch(r10) {
                case 1: goto L_0x012c;
                case 2: goto L_0x0129;
                case 3: goto L_0x0126;
                case 4: goto L_0x0123;
                case 5: goto L_0x0120;
                default: goto L_0x011d;
            }     // Catch:{ all -> 0x016a }
        L_0x011d:
            r31 = -1
            goto L_0x012e
        L_0x0120:
            r31 = 4
            goto L_0x012e
        L_0x0123:
            r31 = 3
            goto L_0x012e
        L_0x0126:
            r31 = 2
            goto L_0x012e
        L_0x0129:
            r31 = 1
            goto L_0x012e
        L_0x012c:
            r31 = 0
        L_0x012e:
            r24 = r21
            r25 = r20
            r28 = r11
            r33 = r9
            r20 = r15
            r21 = r14
            r22 = r13
            boolean r13 = r18.doFrame(r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33)     // Catch:{ all -> 0x016a }
            monitor-exit(r7)
            X.CWV r7 = r5.A05
            if (r7 == 0) goto L_0x015b
            java.util.List r7 = r7.A03
            java.util.Iterator r10 = r7.iterator()
        L_0x014b:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x015b
            java.lang.Object r7 = r10.next()
            com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDelegateWrapper r7 = (com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDelegateWrapper) r7
            r7.dispatchUnconsumedGestures()
            goto L_0x014b
        L_0x015b:
            if (r13 == 0) goto L_0x016e
            r5.A0H = r9
            boolean[] r7 = r5.A0U
            java.lang.Integer r6 = r6.A01
            int r6 = r6.intValue()
            r7[r6] = r8
            goto L_0x016e
        L_0x016a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x016d:
            r13 = 0
        L_0x016e:
            X.CSQ r10 = r5.A0N     // Catch:{ Exception -> 0x01bb }
            X.CqS r6 = r10.A02     // Catch:{ all -> 0x01b9 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r6 = X.C26011CqS.A00(r6)     // Catch:{ all -> 0x01b9 }
            int r11 = r6.getFacesCount()     // Catch:{ all -> 0x01b9 }
            boolean r6 = r10.A01     // Catch:{ all -> 0x01b9 }
            if (r6 != 0) goto L_0x0183
            int r7 = r10.A00     // Catch:{ all -> 0x01b9 }
            r6 = 0
            if (r7 == r11) goto L_0x0184
        L_0x0183:
            r6 = 1
        L_0x0184:
            r10.A01 = r6     // Catch:{ all -> 0x01b9 }
            r10.A00 = r11     // Catch:{ all -> 0x01b9 }
            java.util.Set r7 = r10.A03     // Catch:{ all -> 0x01b9 }
            monitor-enter(r7)     // Catch:{ all -> 0x01b9 }
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x01a2 }
            if (r6 != 0) goto L_0x019d
            boolean r6 = r10.A01     // Catch:{ all -> 0x01a2 }
            if (r6 == 0) goto L_0x019d
            java.util.ArrayList r6 = X.C17880vN.A10(r7)     // Catch:{ all -> 0x01a2 }
            r10.A01 = r9     // Catch:{ all -> 0x01a2 }
        L_0x019b:
            monitor-exit(r7)     // Catch:{ all -> 0x01a2 }
            goto L_0x019f
        L_0x019d:
            r6 = 0
            goto L_0x019b
        L_0x019f:
            if (r6 == 0) goto L_0x01c3
            goto L_0x01a5
        L_0x01a2:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01a2 }
            goto L_0x01b8
        L_0x01a5:
            java.util.Iterator r7 = r6.iterator()     // Catch:{ all -> 0x01b9 }
            boolean r6 = r7.hasNext()     // Catch:{ all -> 0x01b9 }
            if (r6 == 0) goto L_0x01c3
            r7.next()     // Catch:{ all -> 0x01b9 }
            java.lang.String r6 = "onFacesCountChanged"
            java.lang.NullPointerException r6 = X.AnonymousClass000.A0s(r6)     // Catch:{ all -> 0x01b9 }
        L_0x01b8:
            throw r6     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r6 = move-exception
            throw r6     // Catch:{ Exception -> 0x01bb }
        L_0x01bb:
            r10 = move-exception
            java.lang.String r7 = "FbMsqrdRenderer"
            java.lang.String r6 = "Exception in handleFaceCountUpdate"
            X.C26294Cx6.A09(r7, r6, r10)
        L_0x01c3:
            boolean r6 = r5.A0E
            if (r6 == 0) goto L_0x0207
            r5.A0E = r9
            X.C6W r9 = r5.A0c
            if (r13 != 0) goto L_0x01d9
            if (r9 == 0) goto L_0x01d9
            java.lang.String r7 = "First AR frame render failed"
            com.facebook.cameracore.common.exception.EffectsFrameworkException r6 = new com.facebook.cameracore.common.exception.EffectsFrameworkException
            r6.<init>(r7)
            r9.A02(r6)
        L_0x01d9:
            java.lang.String r9 = "null_config_session"
            if (r13 == 0) goto L_0x0300
            long r6 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r7 = X.C108945cZ.A1B(r6, r0)
            long r0 = android.os.Debug.getNativeHeapAllocatedSize()
            float r6 = (float) r0
            r0 = 1149239296(0x44800000, float:1024.0)
            float r6 = r6 / r0
            float r6 = r6 / r0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.String r1 = "FbMsqrdRenderer"
            java.lang.String r0 = "Time to render first frame: %d, current native memory allocation: %.2fMB"
            X.C26294Cx6.A01(r7, r6, r1, r0)
            if (r4 == 0) goto L_0x0201
            java.lang.String r9 = r4.A08
            if (r9 != 0) goto L_0x0201
            java.lang.String r9 = ""
        L_0x0201:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r1 = r5.A0R
            r0 = 5
            r1.markPoint(r2, r0, r9)
        L_0x0207:
            long r6 = r5.A02
            r0 = 1
            long r6 = r6 + r0
            r5.A02 = r6
            r1 = 10
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02e2
            r11 = 16
        L_0x0216:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "logXEvent "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r11)
            r5.A03(r0)
            com.facebook.quicklog.QuickPerformanceLogger r12 = X.AnonymousClass9TA.A00()
            if (r12 == 0) goto L_0x0285
            android.app.ActivityManager r1 = r5.A0L
            if (r1 == 0) goto L_0x0285
            if (r4 == 0) goto L_0x0285
            java.lang.String r0 = r4.A08
            if (r0 == 0) goto L_0x0285
            int r10 = r0.hashCode()
            r3 = 16323880(0xf91528, float:2.2874628E-38)
            boolean r0 = r12.isMarkerOn(r3, r10)
            if (r0 == 0) goto L_0x0285
            android.app.ActivityManager$MemoryInfo r9 = new android.app.ActivityManager$MemoryInfo
            r9.<init>()
            r1.getMemoryInfo(r9)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r6 = r0.totalMemory()
            long r0 = r0.freeMemory()
            long r6 = r6 - r0
            long r1 = android.os.Debug.getNativeHeapAllocatedSize()
            com.facebook.quicklog.MarkerEditor r3 = r12.withMarker(r3, r10)
            switch(r11) {
                case 16: goto L_0x02df;
                case 17: goto L_0x02dc;
                case 18: goto L_0x02d9;
                default: goto L_0x0260;
            }
        L_0x0260:
            java.lang.String r0 = "effect_frame_600"
        L_0x0262:
            com.facebook.quicklog.PointEditor r3 = r3.pointEditor(r0)
            java.lang.String r0 = "java_heap"
            com.facebook.quicklog.PointEditor r3 = r3.addPointData((java.lang.String) r0, (long) r6)
            java.lang.String r0 = "native_neap"
            com.facebook.quicklog.PointEditor r3 = r3.addPointData((java.lang.String) r0, (long) r1)
            java.lang.String r2 = "avail_mem"
            long r0 = r9.availMem
            com.facebook.quicklog.PointEditor r2 = r3.addPointData((java.lang.String) r2, (long) r0)
            java.lang.String r1 = "is_low_mem"
            boolean r0 = r9.lowMemory
            com.facebook.quicklog.PointEditor r0 = r2.addPointData((java.lang.String) r1, (boolean) r0)
            r0.markerEditingCompleted()
        L_0x0285:
            X.C6W r2 = r5.A0c
            if (r13 == 0) goto L_0x02d5
            if (r2 == 0) goto L_0x02d5
            if (r4 == 0) goto L_0x02d5
            boolean r0 = r5.A0G
            if (r0 != 0) goto L_0x0296
            r5.A0G = r8
            r2.A00()
        L_0x0296:
            boolean r0 = r2 instanceof X.BUE
            if (r0 == 0) goto L_0x02d5
            X.BUE r2 = (X.BUE) r2
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x02d5
            int r0 = r2.A00
            r1 = 3
            if (r0 >= r1) goto L_0x02d5
            int r0 = r0 + 1
            r2.A00 = r0
            if (r0 != r1) goto L_0x02d5
            X.DOg r0 = r2.A02
            X.CM1 r0 = r0.A02
            X.Cql r1 = r0.A00
            X.Bz4 r0 = X.C24307Bz4.EFFECT_RENDER_STARTED
            r1.A01 = r0
            X.C26027Cql.A00(r0, r1)
            X.2pJ r2 = r1.A08
            r0 = 2
            java.lang.Short r1 = java.lang.Short.valueOf(r0)
            r0 = 231944056(0xdd32f78, float:1.3015307E-30)
            X.C61212pJ.A00(r2, r1, r0)
            r0 = 231943291(0xdd32c7b, float:1.3014587E-30)
            X.C61212pJ.A00(r2, r1, r0)
            java.lang.Short r1 = java.lang.Short.valueOf(r8)
            r0 = 231940913(0xdd32331, float:1.3012351E-30)
            X.C61212pJ.A00(r2, r1, r0)
        L_0x02d5:
            android.os.Trace.endSection()
            return r13
        L_0x02d9:
            java.lang.String r0 = "effect_frame_150"
            goto L_0x0262
        L_0x02dc:
            java.lang.String r0 = "effect_frame_30"
            goto L_0x0262
        L_0x02df:
            java.lang.String r0 = "effect_frame_10"
            goto L_0x0262
        L_0x02e2:
            r1 = 30
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02ec
            r11 = 17
            goto L_0x0216
        L_0x02ec:
            r1 = 150(0x96, double:7.4E-322)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x02f6
            r11 = 18
            goto L_0x0216
        L_0x02f6:
            r1 = 600(0x258, double:2.964E-321)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0285
            r11 = 19
            goto L_0x0216
        L_0x0300:
            if (r4 == 0) goto L_0x0308
            java.lang.String r9 = r4.A08
            if (r9 != 0) goto L_0x0308
            java.lang.String r9 = ""
        L_0x0308:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r14 = r5.A0R
            r18 = 2
            java.lang.String r19 = "Render first frame failed"
            java.lang.String r17 = "renderer"
            r15 = r2
            r20 = r9
            r14.endFail(r15, r17, r18, r19, r20)
            goto L_0x0207
        L_0x0318:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGT.BsM(X.Cie, long):boolean");
    }

    public void C83(int i, int i2) {
        boolean z;
        this.A01 = i;
        this.A00 = i2;
        if (this.A0f) {
            C26011CqS.A00(this.A0P).resize(i, i2);
            z = false;
        } else {
            z = true;
        }
        this.A0I = z;
    }

    public void C84(C25998CqE cqE) {
        this.A0Q.A03 = true;
    }

    public void C85() {
        Arrays.fill(this.A0U, false);
        A09(this.A03, this);
        if (this.A0f || this.A0F) {
            synchronized (this.A0T) {
                A0B(this.A0b, (Exception) null);
                this.A0f = false;
                C26011CqS cqS = this.A0P;
                synchronized (cqS) {
                    C26011CqS.A00(cqS).releaseGl();
                    C26011CqS.A01(cqS);
                }
                this.A0F = false;
            }
        }
        this.A0c = null;
        this.A0e = false;
        this.A0a = null;
        C26294Cx6.A02(BE8.A0Z(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - released");
    }

    public void CIi(C24861CNe cNe) {
        C24861CNe cNe2 = this.A0S;
        cNe2.A01 = cNe.A01;
        cNe2.A00 = cNe.A00;
    }

    public void CKM(C26856DGn dGn) {
        C26856DGn dGn2 = this.A03;
        if (dGn != dGn2) {
            if (dGn2 != null) {
                dGn2.A01(this, C0O.A0V);
                dGn2.A01(this, C0O.A0h);
                dGn2.A01(this, C0O.A0N);
                dGn2.A01(this, C0O.A0i);
            }
            if (dGn != null) {
                dGn.A00(this, C0O.A0V);
                dGn.A00(this, C0O.A0h);
                dGn.A00(this, C0O.A0N);
                dGn.A00(this, C0O.A0i);
            }
            if (this.A0e) {
                A09(this.A03, this);
                A08(dGn, this);
                if (this.A0f) {
                    A07(dGn);
                }
            }
            this.A03 = dGn;
        }
    }

    public boolean isEnabled() {
        if (!this.A0g || !this.A0e) {
            return false;
        }
        return true;
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                return -1;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C5C, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.CPO, java.lang.Object] */
    public static CPO A02(C26150CtG ctG, Object obj) {
        ctG.A03();
        ByteBuffer byteBuffer = ctG.A07;
        int hashCode = obj.hashCode();
        ? obj2 = new Object();
        obj2.A00 = hashCode;
        obj2.A01 = byteBuffer;
        ? obj3 = new Object();
        obj3.A01 = obj2;
        ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid = obj3.A00;
        if (serviceMessageDataSourceHybrid != null) {
            serviceMessageDataSourceHybrid.setConfiguration(hashCode, byteBuffer, byteBuffer.position());
        }
        return obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01df, code lost:
        A05();
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01e5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019a, code lost:
        A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C3B(X.C28560E7m r12) {
        /*
            r11 = this;
            X.C0O r0 = r12.Bap()
            int r0 = r0.ordinal()
            switch(r0) {
                case 3: goto L_0x01e6;
                case 5: goto L_0x01ca;
                case 6: goto L_0x01b4;
                case 7: goto L_0x019e;
                case 8: goto L_0x006e;
                case 9: goto L_0x0052;
                case 10: goto L_0x0036;
                case 11: goto L_0x001a;
                case 13: goto L_0x019a;
                case 14: goto L_0x0196;
                case 17: goto L_0x00e0;
                case 18: goto L_0x00a5;
                case 22: goto L_0x000c;
                case 26: goto L_0x009e;
                case 27: goto L_0x009a;
                case 30: goto L_0x0095;
                case 31: goto L_0x0095;
                case 43: goto L_0x008a;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            X.DGf r12 = (X.C26848DGf) r12
            X.C5z r1 = r12.A00
            if (r1 == 0) goto L_0x000b
            r11.A06 = r1
            X.CWV r0 = r11.A05
            r1.A00(r0)
            return
        L_0x001a:
            X.E0q r0 = r11.A04
            if (r0 == 0) goto L_0x000b
            X.DAu r0 = (X.C26720DAu) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0026:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.finishCapturePhoto()
            goto L_0x0026
        L_0x0036:
            X.E0q r0 = r11.A04
            if (r0 == 0) goto L_0x000b
            X.DAu r0 = (X.C26720DAu) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.capturePhoto()
            goto L_0x0042
        L_0x0052:
            X.E0q r0 = r11.A04
            if (r0 == 0) goto L_0x000b
            X.DAu r0 = (X.C26720DAu) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x005e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.stopRecording()
            goto L_0x005e
        L_0x006e:
            X.E0q r0 = r11.A04
            if (r0 == 0) goto L_0x000b
            X.DAu r0 = (X.C26720DAu) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.startRecording()
            goto L_0x007a
        L_0x008a:
            java.lang.Object r1 = r11.A0T
            monitor-enter(r1)
            r11.A04()     // Catch:{ all -> 0x0092 }
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0092 }
            throw r0
        L_0x0095:
            r0 = 0
            X.C199610h.A04(r0)
            return
        L_0x009a:
            r0 = 1
            r11.A0H = r0
            return
        L_0x009e:
            java.lang.String r0 = "getConfig"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00a5:
            java.lang.Object r6 = r11.A0T
            monitor-enter(r6)
            java.lang.String r7 = "Time to reset effect: %d"
            java.lang.String r5 = "FbMsqrdRenderer"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00dd }
            r0 = 1
            r11.A0E = r0     // Catch:{ all -> 0x00d0 }
            r0 = 0
            r11.A02 = r0     // Catch:{ all -> 0x00d0 }
            r0 = 0
            r11.A0G = r0     // Catch:{ all -> 0x00d0 }
            X.CqS r0 = r11.A0P     // Catch:{ all -> 0x00d0 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = X.C26011CqS.A00(r0)     // Catch:{ all -> 0x00d0 }
            r0.resetCurrentEffect()     // Catch:{ all -> 0x00d0 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00dd }
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r3)     // Catch:{ all -> 0x00dd }
            X.C26294Cx6.A02(r0, r5, r7)     // Catch:{ all -> 0x00dd }
            monitor-exit(r6)     // Catch:{ all -> 0x00dd }
            return
        L_0x00d0:
            r2 = move-exception
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x00dd }
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r3)     // Catch:{ all -> 0x00dd }
            X.C26294Cx6.A02(r0, r5, r7)     // Catch:{ all -> 0x00dd }
            throw r2     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00dd }
            throw r0
        L_0x00e0:
            X.DGj r12 = (X.C26852DGj) r12
            java.lang.Object r1 = r11.A0T
            monitor-enter(r1)
            X.9nT r2 = r12.A00     // Catch:{ all -> 0x0193 }
            X.C6W r3 = r12.A01     // Catch:{ all -> 0x0193 }
            java.lang.Integer r5 = X.BE8.A0Z(r11)     // Catch:{ all -> 0x0193 }
            java.lang.String r4 = "FbMsqrdRenderer"
            java.lang.String r0 = "FbMsqrdRenderer %s - setMsqrdConfig %s"
            X.C26294Cx6.A01(r5, r2, r4, r0)     // Catch:{ all -> 0x0193 }
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x016d
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x0193 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0193 }
            if (r0 != 0) goto L_0x016d
            X.9nT r0 = r11.A0b     // Catch:{ all -> 0x0193 }
            r11.A0B(r0, r5)     // Catch:{ all -> 0x0193 }
            java.lang.String r10 = r2.A08     // Catch:{ all -> 0x0193 }
            if (r10 == 0) goto L_0x0127
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r5 = r11.A0R     // Catch:{ all -> 0x0193 }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r6 = r5.getInstanceIdWithString(r0, r10)     // Catch:{ all -> 0x0193 }
            r0 = 2
            r5.markPoint(r6, r0, r10)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "setMsqrdConfig"
            X.EDJ r0 = r11.A03(r0)     // Catch:{ all -> 0x0193 }
            boolean r0 = r0 instanceof X.BUX     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x012e
            java.lang.String r9 = "true"
        L_0x0122:
            java.lang.String r8 = "is_fbcameralogger_dummy"
            r5.annotate(r6, r8, r9, r10)     // Catch:{ all -> 0x0193 }
        L_0x0127:
            r11.A0b = r2     // Catch:{ all -> 0x0193 }
            r11.A0c = r3     // Catch:{ all -> 0x0193 }
            r11.A0e = r4     // Catch:{ all -> 0x0193 }
            goto L_0x0131
        L_0x012e:
            java.lang.String r9 = "false"
            goto L_0x0122
        L_0x0131:
            if (r3 == 0) goto L_0x0156
            boolean r0 = r3 instanceof X.BUE     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x0156
            X.BUE r3 = (X.BUE) r3     // Catch:{ all -> 0x0193 }
            X.DOg r0 = r3.A02     // Catch:{ all -> 0x0193 }
            X.CM1 r0 = r0.A02     // Catch:{ all -> 0x0193 }
            X.Cql r3 = r0.A00     // Catch:{ all -> 0x0193 }
            boolean r0 = r3.A05     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x0156
            r0 = 0
            r3.A05 = r0     // Catch:{ all -> 0x0193 }
            X.CZL r4 = r3.A04     // Catch:{ all -> 0x0193 }
            r3 = 0
            if (r4 != 0) goto L_0x0151
            java.lang.String r0 = "sparkEffectProcessor"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0193 }
            throw r3     // Catch:{ all -> 0x0193 }
        L_0x0151:
            r0 = 400(0x190, float:5.6E-43)
            r4.A01(r0, r0)     // Catch:{ all -> 0x0193 }
        L_0x0156:
            java.lang.String r0 = r2.A0E     // Catch:{ all -> 0x0193 }
            r11.A0A = r0     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = r2.A0G     // Catch:{ all -> 0x0193 }
            r11.A0B = r0     // Catch:{ all -> 0x0193 }
            boolean r0 = r11.A0f     // Catch:{ all -> 0x0193 }
            if (r0 == 0) goto L_0x0191
            X.DGn r0 = r11.A03     // Catch:{ all -> 0x0193 }
            A08(r0, r11)     // Catch:{ all -> 0x0193 }
            X.C6W r0 = r11.A0c     // Catch:{ all -> 0x0193 }
            r11.A0A(r2, r0)     // Catch:{ all -> 0x0193 }
            goto L_0x0191
        L_0x016d:
            X.9nT r3 = r11.A0b     // Catch:{ all -> 0x0193 }
            X.DGn r0 = r11.A03     // Catch:{ all -> 0x0193 }
            A09(r0, r11)     // Catch:{ all -> 0x0193 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "unsetMsqrd-"
            r2.append(r0)     // Catch:{ all -> 0x0193 }
            java.lang.String r0 = "noex"
            r2.append(r0)     // Catch:{ all -> 0x0193 }
            r2.toString()     // Catch:{ all -> 0x0193 }
            r0 = 0
            r11.A0B(r3, r5)     // Catch:{ all -> 0x0193 }
            r11.A0c = r5     // Catch:{ all -> 0x0193 }
            r11.A0e = r0     // Catch:{ all -> 0x0193 }
            r11.A0a = r5     // Catch:{ all -> 0x0193 }
            r11.A0b = r5     // Catch:{ all -> 0x0193 }
        L_0x0191:
            monitor-exit(r1)     // Catch:{ all -> 0x0193 }
            return
        L_0x0193:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0193 }
            throw r0
        L_0x0196:
            X.DGd r12 = (X.C26847DGd) r12
            r11.A09 = r12
        L_0x019a:
            r11.A05()
            return
        L_0x019e:
            X.DGc r12 = (X.C26846DGc) r12
            X.CRM r1 = r11.A0Q
            if (r12 == 0) goto L_0x01b1
            X.DGc r0 = r1.A02
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01b1
            r1.A02 = r12
            r0 = 1
            r1.A03 = r0
        L_0x01b1:
            r11.A0K = r12
            goto L_0x01df
        L_0x01b4:
            X.DGa r12 = (X.C26844DGa) r12
            X.CRM r1 = r11.A0Q
            if (r12 == 0) goto L_0x01c7
            X.DGa r0 = r1.A00
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01c7
            r1.A00 = r12
            r0 = 1
            r1.A03 = r0
        L_0x01c7:
            r11.A0J = r12
            goto L_0x01df
        L_0x01ca:
            X.DGb r12 = (X.C26845DGb) r12
            X.CRM r1 = r11.A0Q
            if (r12 == 0) goto L_0x01dd
            X.DGb r0 = r1.A01
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x01dd
            r1.A01 = r12
            r0 = 1
            r1.A03 = r0
        L_0x01dd:
            r11.A08 = r12
        L_0x01df:
            r11.A05()
            r11.A06()
            return
        L_0x01e6:
            X.DGh r12 = (X.C26850DGh) r12
            java.lang.Object r6 = r11.A0T
            monitor-enter(r6)
            boolean r0 = r11.A0e     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x021d
            X.CPW r5 = r11.A0O     // Catch:{ all -> 0x021f }
            X.DB3 r4 = r12.A00     // Catch:{ all -> 0x021f }
            X.C199610h.A04(r4)     // Catch:{ all -> 0x021f }
            if (r4 == 0) goto L_0x021d
            X.CqS r3 = r5.A02     // Catch:{ all -> 0x021f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r3.A02()     // Catch:{ all -> 0x021f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest     // Catch:{ all -> 0x021f }
            boolean r0 = r0.frameDataNeeded     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x021f }
            X.CX6 r0 = (X.CX6) r0     // Catch:{ all -> 0x021f }
            int r2 = r5.A00     // Catch:{ all -> 0x021f }
            if (r0 == 0) goto L_0x0214
            int r1 = r0.A00     // Catch:{ all -> 0x021f }
            r0 = -1
            if (r1 == r0) goto L_0x0214
            r2 = r1
        L_0x0214:
            boolean r1 = r5.A01     // Catch:{ all -> 0x021f }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r3.A02()     // Catch:{ all -> 0x021f }
            r0.updateFrame(r4, r2, r1)     // Catch:{ all -> 0x021f }
        L_0x021d:
            monitor-exit(r6)     // Catch:{ all -> 0x021f }
            return
        L_0x021f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x021f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DGT.C3B(X.E7m):void");
    }
}
