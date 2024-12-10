package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CvH  reason: case insensitive filesystem */
public final class C26226CvH {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public Context A05;
    public Looper A06;
    public BTZ A07;
    public C25269CcE A08;
    public C25625Cj5 A09;
    public C25603Cii A0A;
    public C25010CTk A0B;
    public C26051CrL A0C;
    public C25991Cq6 A0D;
    public CLC A0E;
    public CYR A0F;
    public C25817CmU A0G;
    public C25838Cms A0H;
    public Integer A0I;
    public Long A0J;
    public Map A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public BTR A0U;
    public final CLB A0V;
    public final AtomicBoolean A0W;
    public final AtomicBoolean A0X;

    public C26226CvH(E1V e1v, C25269CcE ccE, E1W e1w, E1W e1w2, E1X e1x, CLC clc, CYR cyr, C25817CmU cmU, C25838Cms cms) {
        this.A0E = null;
        this.A08 = null;
        this.A0G = null;
        this.A0H = null;
        this.A0F = null;
        this.A0X = BE6.A16(false);
        this.A07 = C24711CGx.A01;
        this.A0U = C24711CGx.A00;
        this.A00 = -1;
        this.A04 = 5;
        this.A02 = 1;
        this.A0I = AnonymousClass00R.A0C;
        this.A0K = AnonymousClass8BR.A17();
        this.A01 = 3;
        this.A0W = BE6.A16(false);
        this.A0V = new CLB(this);
    }

    public static void A02(C26226CvH cvH, String str) {
        cvH.A0C((C22874BTj) null, new BX0(str));
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.BTA, java.lang.Object] */
    public final void A09() {
        this.A0P = false;
        C25625Cj5 cj5 = this.A09;
        if (cj5 != null) {
            C24712CGy.A01.A01("sup:FrameRateAdaptiveVideoConfigHandler", "Stopping monitor");
            cj5.A08 = false;
            C25625Cj5.A00(cj5);
        }
        C25991Cq6 cq6 = this.A0D;
        if (cq6 != null) {
            ? obj = new Object();
            obj.A00 = 0;
            C25991Cq6.A00(obj, cq6);
            CSZ csz = cq6.A03;
            csz.A03.clear();
            csz.A01 = 0;
            csz.A00 = System.currentTimeMillis();
            cq6.A03 = new CSZ(cq6.A03.A02);
            cq6.A08.set(0);
            cq6.A09.set(0);
        }
        C25269CcE ccE = this.A08;
        if (ccE != null) {
            A0B(ccE.A02());
        }
        C25817CmU cmU = this.A0G;
        if (cmU != null) {
            C25814CmR cmR = cmU.A02;
            synchronized (cmR) {
                cmR.A0A.set(true);
                cmR.A09 = false;
            }
        }
    }

    public void A0E(boolean z) {
        if (!z) {
            this.A0D = null;
        } else if (this.A0D == null) {
            C25845Cn1 cn1 = C24712CGy.A01;
            cn1.A01("sup:MediaStreamController", "Initializing BtcThroughputHealth");
            C25991Cq6 cq6 = new C25991Cq6((CSZ) null, (AnonymousClass1Y1) null, 1);
            this.A0D = cq6;
            C27975DpB dpB = new C27975DpB(this);
            C28143Ds2 ds2 = C28143Ds2.A00;
            C18070vi.A0d(ds2, 1);
            cq6.A06 = dpB;
            cq6.A07 = ds2;
            C25991Cq6 cq62 = this.A0D;
            if (cq62 != null) {
                int i = this.A07.A00;
                cn1.A01("sup:BtcThroughputHealth", AnonymousClass001.A1I("Set expected bitrate to ", AnonymousClass000.A10(), i));
                cq62.A00 = i;
                System.currentTimeMillis();
            }
        }
    }

    public static Iterator A00(C26226CvH cvH) {
        return cvH.A0K.entrySet().iterator();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0240, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0243, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x011e, code lost:
        r4.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        r3.A04(r1, r0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(byte[] r5) {
        /*
            X.CLp r4 = X.C24450C4p.A00
            if (r4 == 0) goto L_0x003c
            X.BnI r0 = X.C23649BnI.DEFAULT_INSTANCE
            X.Bmt r0 = r0.A0N()
            r0.A0A(r5)
            X.Bm6 r3 = r0.A0C()
            X.BnI r3 = (X.C23649BnI) r3
            X.Dbz r0 = r3.stringTypeEventMap_
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)
            X.Dbz r0 = r3.floatTypeEventMap_
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
            X.Dbz r0 = r3.boolTypeEventMap_
            java.util.Collections.unmodifiableMap(r0)
            int r0 = r3.eventType_
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0063;
                case 2: goto L_0x0060;
                case 3: goto L_0x005d;
                case 4: goto L_0x005a;
                case 5: goto L_0x0057;
                case 6: goto L_0x0054;
                case 7: goto L_0x0051;
                case 8: goto L_0x004e;
                case 9: goto L_0x004b;
                case 10: goto L_0x0048;
                case 11: goto L_0x0045;
                default: goto L_0x0029;
            }
        L_0x0029:
            X.C11 r0 = X.C11.UNRECOGNIZED
        L_0x002b:
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x023b;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x0235;
                case 5: goto L_0x0069;
                default: goto L_0x0032;
            }
        L_0x0032:
            X.Cn1 r3 = X.C24712CGy.A01
            r2 = 0
            java.lang.String r1 = "sup:MediaStreamController"
            java.lang.String r0 = "Received unrecognized StreamTelemetryEvent"
        L_0x0039:
            r3.A04(r1, r0, r2)
        L_0x003c:
            return
        L_0x003d:
            X.Cn1 r3 = X.C24712CGy.A01
            r2 = 0
            java.lang.String r1 = "sup:MediaStreamController"
            java.lang.String r0 = "Received configure audio or video StreamTelemetryEvent"
            goto L_0x0039
        L_0x0045:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_FRAME_CAPTURE_END_EVENT
            goto L_0x002b
        L_0x0048:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_FRAME_CAPTURE_START_EVENT
            goto L_0x002b
        L_0x004b:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_CLIENT_DISCONNECT_EVENT
            goto L_0x002b
        L_0x004e:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_CLIENT_CONNECT_EVENT
            goto L_0x002b
        L_0x0051:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_SESSION_END_EVENT
            goto L_0x002b
        L_0x0054:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_SESSION_START_EVENT
            goto L_0x002b
        L_0x0057:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_IN_PROGRESS_EVENT
            goto L_0x002b
        L_0x005a:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_END_EVENT
            goto L_0x002b
        L_0x005d:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_CONFIGURE_VIDEO_EVENT
            goto L_0x002b
        L_0x0060:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_CONFIGURE_AUDIO_EVENT
            goto L_0x002b
        L_0x0063:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_START_EVENT
            goto L_0x002b
        L_0x0066:
            X.C11 r0 = X.C11.STREAM_TELEMETRY_CANONICALS_EVENT
            goto L_0x002b
        L_0x0069:
            X.CLq r0 = r4.A00
            X.CmU r4 = r0.A00
            monitor-enter(r4)
            r0 = 0
            r4.A0C = r0     // Catch:{ all -> 0x0232 }
            r4.A06 = r0     // Catch:{ all -> 0x0232 }
            r4.A05 = r0     // Catch:{ all -> 0x0232 }
            if (r2 == 0) goto L_0x0081
            X.DWC r0 = new X.DWC     // Catch:{ all -> 0x0232 }
            r0.<init>(r4)     // Catch:{ all -> 0x0232 }
            java.util.function.BiConsumer r0 = (java.util.function.BiConsumer) r0     // Catch:{ all -> 0x0232 }
            r2.forEach(r0)     // Catch:{ all -> 0x0232 }
        L_0x0081:
            if (r1 == 0) goto L_0x00f0
            goto L_0x00e6
        L_0x0084:
            X.CLq r0 = r4.A00
            X.CmU r4 = r0.A00
            monitor-enter(r4)
            r0 = 0
            r4.A0B = r0     // Catch:{ all -> 0x0232 }
            if (r2 == 0) goto L_0x0098
            X.DWB r0 = new X.DWB     // Catch:{ all -> 0x0232 }
            r0.<init>(r4)     // Catch:{ all -> 0x0232 }
            java.util.function.BiConsumer r0 = (java.util.function.BiConsumer) r0     // Catch:{ all -> 0x0232 }
            r2.forEach(r0)     // Catch:{ all -> 0x0232 }
        L_0x0098:
            java.lang.String r2 = X.C24459C4z.A00     // Catch:{ all -> 0x0232 }
            if (r2 == 0) goto L_0x00ac
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ all -> 0x0232 }
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r4.A0B     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0230
        L_0x00ac:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0232 }
            if (r2 != 0) goto L_0x00b7
            java.lang.String r0 = "snBuildFlavor, "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
        L_0x00b7:
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x00c0
            java.lang.String r0 = "snFirmwareVersion, "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
        L_0x00c0:
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x00c9
            java.lang.String r0 = "snDeviceName, "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
        L_0x00c9:
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "snHardwareType, "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
        L_0x00d2:
            java.lang.String r0 = r4.A0B     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = "glassesSessionId"
            r1.append(r0)     // Catch:{ all -> 0x0232 }
        L_0x00db:
            java.lang.String r1 = X.C18070vi.A0H(r1)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "TELEMETRY_NULL_CANONICALS_RECEIVED"
            X.BX0 r0 = X.C22874BTj.A00(r0, r1)     // Catch:{ all -> 0x0232 }
            goto L_0x011e
        L_0x00e6:
            X.DWD r0 = new X.DWD     // Catch:{ all -> 0x0232 }
            r0.<init>(r4)     // Catch:{ all -> 0x0232 }
            java.util.function.BiConsumer r0 = (java.util.function.BiConsumer) r0     // Catch:{ all -> 0x0232 }
            r1.forEach(r0)     // Catch:{ all -> 0x0232 }
        L_0x00f0:
            X.0vl r5 = r4.A0H     // Catch:{ all -> 0x0232 }
            boolean r0 = X.C72453Mb.A1a(r5)     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0230
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ all -> 0x0232 }
            r3 = 0
            if (r0 != 0) goto L_0x0123
            java.lang.String r2 = "deviceType"
        L_0x00ff:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "In progress telemetry: "
            r1.append(r0)     // Catch:{ all -> 0x0232 }
            r1.append(r2)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = " is null"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0232 }
            X.Cn1 r1 = X.C24712CGy.A01     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "sup:SUPMediaStreamWamLogger"
            r1.A04(r0, r2, r3)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "TELEMETRY_IN_PROGRESS_VALIDATION_ERROR"
            X.BX0 r0 = X.C22874BTj.A00(r0, r2)     // Catch:{ all -> 0x0232 }
        L_0x011e:
            r4.A01(r0)     // Catch:{ all -> 0x0232 }
            goto L_0x0230
        L_0x0123:
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x012a
            java.lang.String r2 = "deviceBuildType"
            goto L_0x00ff
        L_0x012a:
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0131
            java.lang.String r2 = "socVersion"
            goto L_0x00ff
        L_0x0131:
            java.lang.String r0 = X.C24459C4z.A00     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0138
            java.lang.String r2 = "buildFlavor"
            goto L_0x00ff
        L_0x0138:
            java.lang.String r0 = r4.A0B     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x013f
            java.lang.String r2 = "glassesSessionId"
            goto L_0x00ff
        L_0x013f:
            java.lang.Float r0 = r4.A06     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0146
            java.lang.String r2 = "videoEncodingLatency"
            goto L_0x00ff
        L_0x0146:
            java.lang.Float r0 = r4.A05     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x014d
            java.lang.String r2 = "videoEISLatency"
            goto L_0x00ff
        L_0x014d:
            java.lang.String r0 = r4.A0C     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0154
            java.lang.String r2 = "inProgressTimestamp"
            goto L_0x00ff
        L_0x0154:
            X.Cm6 r2 = r4.A03     // Catch:{ all -> 0x0232 }
            java.lang.Long r0 = r2.A01()     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x015f
            java.lang.String r2 = "currentBatteryLevel"
            goto L_0x00ff
        L_0x015f:
            java.lang.Long r0 = r2.A02()     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0168
            java.lang.String r2 = "currentThermalState"
            goto L_0x00ff
        L_0x0168:
            X.CmZ r1 = X.C25822CmZ.A0B     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = r1.A00()     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r2 = "appColdStartSessionId"
            goto L_0x00ff
        L_0x0173:
            java.lang.String r0 = r1.A02()     // Catch:{ all -> 0x0232 }
            if (r0 != 0) goto L_0x017c
            java.lang.String r2 = "appWarmStartSessionId"
            goto L_0x00ff
        L_0x017c:
            boolean r0 = X.C72453Mb.A1a(r5)     // Catch:{ Exception -> 0x0217 }
            if (r0 != 0) goto L_0x0230
            X.Br2 r3 = new X.Br2     // Catch:{ Exception -> 0x0217 }
            r3.<init>()     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = r1.A01()     // Catch:{ Exception -> 0x0217 }
            r3.A05 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = r1.A00()     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A06 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = r1.A02()     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A07 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.Long r0 = r2.A01()     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0217 }
            boolean r0 = r4.A0E     // Catch:{ Exception -> 0x0217 }
            if (r0 == 0) goto L_0x0214
            java.lang.String r0 = "call"
        L_0x01ae:
            r3.A08 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = r4.A0C     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0217 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A01 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = X.C24459C4z.A00     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A09 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = X.C24459C4z.A03     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A0A = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = X.C24459C4z.A01     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A0B = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = X.C24459C4z.A02     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A0C = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.String r0 = r4.A0B     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A0D = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.Long r0 = r2.A02()     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A02 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.Float r0 = r4.A05     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            float r0 = r0.floatValue()     // Catch:{ Exception -> 0x0217 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0217 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A03 = r0     // Catch:{ Exception -> 0x0217 }
            java.lang.Float r0 = r4.A06     // Catch:{ Exception -> 0x0217 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0217 }
            float r0 = r0.floatValue()     // Catch:{ Exception -> 0x0217 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0217 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0217 }
            r3.A04 = r0     // Catch:{ Exception -> 0x0217 }
            X.18K r2 = r4.A0G     // Catch:{ Exception -> 0x0217 }
            X.0vt r1 = X.C18180vt.A06     // Catch:{ Exception -> 0x0217 }
            r0 = 1
            r2.CC0(r3, r1, r0)     // Catch:{ Exception -> 0x0217 }
            goto L_0x0230
        L_0x0214:
            java.lang.String r0 = "ringing"
            goto L_0x01ae
        L_0x0217:
            r3 = move-exception
            X.Cn1 r2 = X.C24712CGy.A01     // Catch:{ all -> 0x0232 }
            java.lang.String r1 = "sup:SUPMediaStreamWamLogger"
            java.lang.String r0 = "Error logging in progress event"
            r2.A05(r1, r0, r3)     // Catch:{ all -> 0x0232 }
            java.lang.String r0 = "TELEMETRY_IN_PROGRESS_LOGGING_ERROR"
            X.BX0 r1 = new X.BX0     // Catch:{ all -> 0x0232 }
            r1.<init>(r0)     // Catch:{ all -> 0x0232 }
            X.BTj r0 = new X.BTj     // Catch:{ all -> 0x0232 }
            r0.<init>(r3)     // Catch:{ all -> 0x0232 }
            r4.A01(r1)     // Catch:{ all -> 0x0232 }
        L_0x0230:
            monitor-exit(r4)
            return
        L_0x0232:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0235:
            X.CLq r0 = r4.A00
            X.CmU r1 = r0.A00
            r0 = 0
            goto L_0x0240
        L_0x023b:
            X.CLq r0 = r4.A00
            X.CmU r1 = r0.A00
            r0 = 1
        L_0x0240:
            r1.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26226CvH.A03(byte[]):void");
    }

    public final C25010CTk A04() {
        C25010CTk cTk = this.A0B;
        if (cTk != null) {
            return cTk;
        }
        C18070vi.A11("mediaStreamClient");
        throw null;
    }

    public final C26051CrL A05() {
        C26051CrL crL = this.A0C;
        if (crL != null) {
            return crL;
        }
        C18070vi.A11("mediaCodecDecoder");
        throw null;
    }

    public void A06() {
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A01("sup:MediaStreamController", "msc:connect");
        if (!this.A0N) {
            cn1.A01("sup:MediaStreamController", "msc, not initialized, returning");
            this.A0W.set(true);
        } else if (this.A0M) {
            cn1.A01("sup:MediaStreamController", "Already connecting");
        } else if (this.A0L) {
            cn1.A01("sup:MediaStreamController", "Already connected");
            Iterator A002 = A00(this);
            while (A002.hasNext()) {
                ((C24491C6j) C17890vO.A0P(A002)).A00();
            }
        } else {
            this.A0M = true;
            A04().A00.A04(BXW.A00);
        }
    }

    public void A07() {
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A01("sup:MediaStreamController", "msc:disconnect");
        if (this.A0M) {
            cn1.A01("sup:MediaStreamController", "msc, was still connecting, internalDisconnect");
        } else if (!this.A0L) {
            cn1.A01("sup:MediaStreamController", "msc, not connected, returning");
            return;
        }
        A04().A00.A04(BXX.A00);
        this.A0M = false;
        this.A0L = false;
        A09();
        Iterator A002 = A00(this);
        while (A002.hasNext()) {
            C22958BXe bXe = (C22958BXe) ((C24491C6j) C17890vO.A0P(A002));
            if (2 - bXe.A00 == 0) {
                cn1.A02("sup:SUPDelegate", "MediaStreamStateListener:onDisconnected");
                C26996DOs dOs = (C26996DOs) bXe.A01;
                if (dOs.A01 instanceof C22963BXj) {
                    cn1.A01("sup:SUPDelegate", "SUP is not activated, switching to connected but not selected state");
                    dOs.A01 = dOs.A01.toConnected(false);
                    C26197CuS cuS = dOs.A0F;
                    cuS.A06(BY8.A00);
                    cuS.A05(new C22951BWx("LIVE_STREAM_CONNECT_FAIL"));
                    C26996DOs.A05(dOs, false);
                }
                if (C26996DOs.A07(dOs)) {
                    cn1.A01("sup:SUPDelegate", "MediaStreamStateListener:startErrorToConnectJob onDisconnected");
                    C26996DOs.A06(dOs, true);
                }
            }
        }
    }

    public void A08() {
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A01("sup:MediaStreamController", "msc:stop");
        if (!this.A0P) {
            cn1.A01("sup:MediaStreamController", "msc, not streaming, returning");
            return;
        }
        this.A0R = false;
        C25838Cms cms = this.A0H;
        if (cms != null) {
            cms.A04(UserFlowLoggerImpl.CANCEL_REASON_ANNOTATION, "foa_sent_stop_request_before_qpl_finished");
            cms.A01(4);
            cms.A00 = 0;
            C25822CmZ.A0B.A03(false);
        }
        A04().A00.A04(C22955BXb.A00);
        A09();
        C26051CrL A052 = A05();
        A052.A08((C22821Di) null);
        A052.A07((C18090vk) null);
        A052.A09(false);
    }

    public final void A0A(int i) {
        Integer num;
        this.A03 = i;
        if (i == this.A04) {
            Iterator A002 = A00(this);
            while (A002.hasNext()) {
                ((C24491C6j) C17890vO.A0P(A002)).A02();
            }
            if (this.A0O || this.A01 == 4) {
                num = AnonymousClass00R.A06;
            } else {
                num = AnonymousClass00R.A05;
            }
            A0D(num);
        }
    }

    public void A0B(BTZ btz) {
        this.A07 = btz;
        C25991Cq6 cq6 = this.A0D;
        if (cq6 != null) {
            int i = btz.A00;
            C24712CGy.A01.A01("sup:BtcThroughputHealth", AnonymousClass001.A1I("Set expected bitrate to ", AnonymousClass000.A10(), i));
            cq6.A00 = i;
            System.currentTimeMillis();
        }
    }

    public final void A0C(C22874BTj bTj, C24474C5p c5p) {
        C25845Cn1 cn1;
        String str;
        if (bTj == null) {
            new C22874BTj(new Exception(AnonymousClass001.A1E(c5p, "sup:MediaStreamController Failed on error event ", AnonymousClass000.A10())));
        }
        if (c5p instanceof C22951BWx) {
            C24712CGy.A01.A01("sup:MediaStreamController", "handleMediaStreamErrorEvent ConnectionError");
            Iterator A002 = A00(this);
            while (A002.hasNext()) {
                ((C24491C6j) C17890vO.A0P(A002)).A03(c5p);
            }
        } else if (c5p instanceof C22952BWy) {
            C24712CGy.A01.A01("sup:MediaStreamController", "handleMediaStreamErrorEvent StreamStartError");
            Iterator A003 = A00(this);
            while (A003.hasNext()) {
                ((C24491C6j) C17890vO.A0P(A003)).A03(c5p);
            }
            C25817CmU cmU = this.A0G;
            if (cmU != null) {
                cmU.A01(c5p);
            }
            if (C18070vi.A18(c5p.A00(), "LIVE_STREAM_START_DOFF_ERROR")) {
                return;
            }
            A07();
        } else if (c5p instanceof C22953BWz) {
            C24712CGy.A01.A01("sup:MediaStreamController", "handleMediaStreamErrorEvent StreamingError");
            Iterator A004 = A00(this);
            while (A004.hasNext()) {
                ((C24491C6j) C17890vO.A0P(A004)).A03(c5p);
            }
        } else {
            if (c5p instanceof C22950BWw) {
                cn1 = C24712CGy.A01;
                str = "handleMediaStreamErrorEvent StreamingTransientError";
            } else if (c5p instanceof BX0) {
                cn1 = C24712CGy.A01;
                str = "handleMediaStreamErrorEvent TelemetryError";
            } else {
                return;
            }
            cn1.A01("sup:MediaStreamController", str);
            C25817CmU cmU2 = this.A0G;
            if (cmU2 != null) {
                cmU2.A01(c5p);
                return;
            }
            return;
        }
        C25817CmU cmU3 = this.A0G;
        if (cmU3 != null) {
            cmU3.A01(c5p);
        }
        A07();
    }

    public void A0F(boolean z) {
        if (this.A0T != z) {
            C24712CGy.A01.A01("sup:MediaStreamController", C17900vP.A0D("msc:shouldIgnoreSGCameraRequests = ", AnonymousClass000.A10(), z));
        }
        this.A0T = z;
    }

    public static void A01(C26226CvH cvH, C25838Cms cms, String str, String str2) {
        cms.A04(str, str2);
        Context context = cvH.A05;
        if (context != null) {
            cms.A04("mwa_app_version", C25630CjG.A00.A00(context));
        } else {
            C18070vi.A11("context");
            throw null;
        }
    }

    public void A0D(Integer num) {
        A04().A00.A04(new BXS(new C22872BTg(num, System.currentTimeMillis())));
    }

    public C26226CvH() {
        this((E1V) null, (C25269CcE) null, (E1W) null, (E1W) null, (E1X) null, (CLC) null, (CYR) null, (C25817CmU) null, (C25838Cms) null);
    }
}
