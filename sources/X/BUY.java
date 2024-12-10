package X;

import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;
import java.util.Map;

public final class BUY extends DEE implements EDJ {
    public final C26772DDb A00 = new C26772DDb();
    public final C28656ECq A01;
    public final DDW A02;
    public final C26774DDd A03 = new C26774DDd();
    public final DDZ A04 = new DDZ();
    public final CCU A05;

    public String BMT() {
        return null;
    }

    public boolean BXc() {
        return false;
    }

    public Map BdX(CK5 ck5, Map map) {
        return map;
    }

    public void CKE(String str) {
        if (!C18070vi.A18(str, SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unexpected ProductName ");
            IllegalArgumentException A12 = AnonymousClass001.A12(str, A10);
            CNY("CameraCore::ProductName", A12, false);
            throw A12;
        }
    }

    public void CNY(String str, Throwable th, boolean z) {
        C18070vi.A0d(AnonymousClass001.A1H("WhatsAppOneCameraLogger/softReportError Category = ", str, AnonymousClass3MZ.A19(str, 0)), 0);
    }

    public static void A01(String str, String str2, StringBuilder sb) {
        sb.append(", Severity = ");
        sb.append(str);
        sb.append(", Source = ");
        sb.append(str2);
        sb.append(", Extras = ");
    }

    public C28550E7a BOB() {
        return this.A04;
    }

    public C9Z BTh() {
        C9Z c9z = EDJ.A00;
        C18070vi.A0Z(c9z);
        return c9z;
    }

    public C28656ECq BV5() {
        return this.A01;
    }

    public C28551E7b BX0() {
        return this.A03;
    }

    public String BXd() {
        return SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
    }

    public void BiA(C2X c2x, Map map, long j) {
        C29361c9.A0Q("camera_update_failed", 40);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logCameraUpdateError Event = ");
        A02("camera_update_failed", "CameraEventLoggerImpl", A10, j);
        A10.append(", Description = ");
        A10.append("SWITCH");
        A01("medium", "CameraEventLoggerImpl", A10);
        C108995ce.A1K(map, A10);
    }

    public void BiB(String str, String str2, Map map, long j) {
        A00(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logCameraUpdateEvent Event = ");
        A02(str, "CameraEventLoggerImpl", A10, j);
        A10.append(", Description = ");
        A10.append(str2);
        A10.append(", Extras = ");
        C108995ce.A1K(map, A10);
    }

    public void BiR(C2X c2x, String str, long j) {
        C29361c9.A0Q("media_pipeline_error", 40);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logMediaPipelineError Event = ");
        A02("media_pipeline_error", "MediaGraphControllerImpl", A10, j);
        A01(str, "MediaGraphControllerImpl", A10);
        C108995ce.A1K((Object) null, A10);
    }

    public void BiZ(long j) {
        C29361c9.A0Q("recording_requested", 40);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logMediaPipelineEvent Event = ");
        A02("recording_requested", "OpticVideoCaptureCoordinator", A10, j);
        A10.append(", Recording Tracks Info: ");
        A10.append("");
        A10.append(", Extras = ");
        C108995ce.A1K((Object) null, A10);
    }

    public void BlS() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/QPL/onAnnotateEvent event:");
        A10.append("ONECAMERA_CONNECT");
        A10.append(" key:");
        A10.append("action");
        C18070vi.A0d(AnonymousClass001.A1H(" value:", "connect", A10), 0);
    }

    public void CDd(long j) {
        CWW cww = this.A03.A00;
        cww.A00 = true;
        cww.A01.A00(j);
        CZG czg = cww.A03;
        if (czg.A04 != 0) {
            czg.A03++;
        }
        czg.A04 = j;
    }

    public void CDe(long j) {
        CWW cww = this.A03.A00;
        CZG czg = cww.A01;
        if (czg.A04 != 0) {
            czg.A03++;
        }
        czg.A04 = j;
        if (cww.A00) {
            cww.A03.A00(j);
        }
    }

    public BUY(C28656ECq eCq, C28592E9h e9h, CCU ccu) {
        C18070vi.A0k(ccu, eCq);
        this.A00 = e9h;
        this.A05 = ccu;
        this.A01 = eCq;
        C18070vi.A0X(C17890vO.A0Q());
        this.A02 = new DDW(ccu);
        String str = (String) this.A00.BPA(C25511Ch9.A02);
        if (str != null) {
            CKE(str);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r4.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = r3.A00;
        r2 = X.C24243By1.A01;
        r1 = r0.A00;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r1.put(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        X.C29361c9.A0Q(r4, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        if (r4.equals(r0) == false) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = r3.A00;
        r2 = X.C24243By1.A01;
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r1.get(r2) != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r0 = X.C17890vO.A0Q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(java.lang.String r4) {
        /*
            r3 = this;
            int r1 = r4.hashCode()
            java.lang.String r0 = "media_pipeline_start"
            switch(r1) {
                case -1629286812: goto L_0x002b;
                case 1028385748: goto L_0x0028;
                case 1031703104: goto L_0x0011;
                case 1876082191: goto L_0x000f;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 40
            X.C29361c9.A0Q(r4, r0)
            return
        L_0x000f:
            java.lang.String r0 = "media_pipeline_resume"
        L_0x0011:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.DDb r0 = r3.A00
            X.By1 r2 = X.C24243By1.A01
            java.util.HashMap r1 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = X.C17890vO.A0Q()
            goto L_0x003a
        L_0x0028:
            java.lang.String r0 = "media_pipeline_pause"
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = "media_pipeline_stop"
        L_0x002d:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.DDb r0 = r3.A00
            X.By1 r2 = X.C24243By1.A01
            java.util.HashMap r1 = r0.A00
            r0 = 0
        L_0x003a:
            r1.put(r2, r0)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BUY.A00(java.lang.String):void");
    }

    public static void A02(String str, String str2, StringBuilder sb, long j) {
        sb.append(str);
        sb.append(", Component Name = ");
        sb.append(str2);
        sb.append(", Component ID = ");
        sb.append(j);
    }

    public Map BAg() {
        return C17880vN.A13();
    }

    public void Bi7(C2X c2x, String str, String str2, String str3, String str4, Map map, long j) {
        A00(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logCameraError Event = ");
        A02(str, str2, A10, j);
        A01(str3, str4, A10);
        C108995ce.A1K(map, A10);
    }

    public void Bi9(String str, String str2, Map map, long j) {
        A00(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logCameraEvent Event = ");
        A02(str, str2, A10, j);
        A10.append(", Extras = ");
        C108995ce.A1K(map, A10);
    }

    public void BiS(String str, String str2, Map map, long j) {
        A00(str);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/logMediaPipelineEvent Event = ");
        A02(str, str2, A10, j);
        A10.append(", Extras = ");
        C108995ce.A1K(map, A10);
    }

    public void BtP() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/QPL/onEventFinished event:");
        C108995ce.A1O(A10, "ONECAMERA_CONNECT");
    }

    public void BtQ(Map map, long j) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/QPL/onEventGenerate event:");
        A10.append("ONECAMERA_CREATION");
        A10.append(" durationNs:");
        A10.append(j);
        A10.append(" annotations:");
        C108995ce.A1K(map, A10);
    }

    public void BtS(int i) {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhatsAppOneCameraLogger/QPL/onEventStarted event:");
        switch (i) {
            case 19:
                str = "RECORDING";
                break;
            case 20:
                str = "AUDIOPIPELINE_INIT";
                break;
            case 21:
                str = "FC_CAPTURE_PHOTO";
                break;
            case 22:
                str = "FC_CAMERA_SESSION";
                break;
            default:
                switch (i) {
                    case 24:
                        str = "FC_RECORDING";
                        break;
                    case 25:
                        str = "FC_CAMERA_OPEN";
                        break;
                    case 26:
                        str = "FC_CAMERA_SWITCH";
                        break;
                    case 27:
                        str = "ONECAMERA_CREATION";
                        break;
                    case 28:
                        str = "ONECAMERA_CONNECT";
                        break;
                    default:
                        str = "none";
                        break;
                }
        }
        C108995ce.A1O(A10, str);
    }

    public void CEH(Map map) {
        map.clear();
    }
}
