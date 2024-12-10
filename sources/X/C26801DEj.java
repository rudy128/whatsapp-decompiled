package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.DEj  reason: case insensitive filesystem */
public class C26801DEj implements C28611EAf {
    public static boolean A04 = true;
    public static Boolean A05;
    public static String A06;
    public static int A07;
    public static final HashMap A08 = C17880vN.A11();
    public static final HashMap A09 = C17880vN.A11();
    public CNK A00;
    public final EDJ A01;
    public final BG1 A02;
    public final AtomicBoolean A03 = C108965cb.A0w();

    public static HashMap A01(int i, long j) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("update_description", "SETTINGS");
        BE7.A1I("timestamp", hashMap, j);
        hashMap.put("settings_update_id", String.valueOf(i));
        return hashMap;
    }

    public void Bi8(int i, long j) {
        String str;
        if (i == 5) {
            str = "camera_warmup_requested";
        } else if (i == 6) {
            str = "camera_warmup_started";
        } else if (i == 7) {
            str = "camera_warmup_finished";
        } else if (i == 23) {
            str = "camera_disconnect_requested";
        } else if (i != 24) {
            switch (i) {
                case 30:
                    str = "camera_open_started";
                    break;
                case 31:
                    str = "camera_open_finished";
                    break;
                case 32:
                    str = "preview_start_started";
                    break;
                case 33:
                    str = "preview_start_finished";
                    break;
                default:
                    switch (i) {
                        case 37:
                            str = "get_surface_texture_started";
                            break;
                        case 38:
                            str = "get_surface_texture_finished";
                            break;
                        case 39:
                            str = "initialise_camera_started";
                            break;
                        case 40:
                            str = "initialise_camera_finished";
                            break;
                        case 41:
                            str = "camera_meta_data_handler_setup_started";
                            break;
                        case 42:
                            str = "camera_meta_data_handler_setup_finished";
                            break;
                        case 43:
                            str = "camera_features_prepare_started";
                            break;
                        case 44:
                            str = "camera_features_prepare_finished";
                            break;
                        default:
                            str = null;
                            break;
                    }
            }
        } else {
            str = "camera_disconnect_started";
        }
        C26294Cx6.A02(str, "CameraEventLoggerImpl", "logCameraEvent %s");
        if (str == null) {
            C26294Cx6.A02(Integer.valueOf(i), "CameraEventLoggerImpl", "logCameraEvent invalid key: %s");
            return;
        }
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.Bi9(str, "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public static void A03(C26801DEj dEj, String str, Throwable th) {
        EDJ edj = dEj.A01;
        edj.Bi7(new BUQ(str, th, 10004), "camera_error", "CameraEventLoggerImpl", "medium", "CameraEventLoggerImpl", (Map) null, (long) dEj.hashCode());
        edj.CNY(edj.BXd(), th, false);
    }

    public void BKU(String str) {
        if (str == null) {
            str = "";
        }
        A03(this, str, AnonymousClass000.A0n(str));
    }

    public CNK BOp() {
        CNK cnk = this.A00;
        if (cnk != null) {
            return cnk;
        }
        CNK cnk2 = new CNK(this);
        this.A00 = cnk2;
        return cnk2;
    }

    public BG1 BUB() {
        return this.A02;
    }

    public void BnU(String str, String str2) {
        C26294Cx6.A01(str, str2, "CameraEventLoggerImpl", "onCameraEvicted from %s to %s");
        EDJ edj = this.A01;
        Map BAg = edj.BAg();
        BAg.put("previous_product_name", str);
        BAg.put("new_product_name", str2);
        edj.Bi9("camera_evicted", "CameraEventLoggerImpl", BAg, BE6.A0O(this));
        edj.CEH(BAg);
    }

    public void Bnf(long j, int i) {
        this.A01.BiB("camera_update_finished", "SETTINGS", A01(i, j), BE6.A0O(this));
    }

    public void Bng(long j, int i) {
        this.A01.BiB("camera_update_started", "SETTINGS", A01(i, j), BE6.A0O(this));
    }

    public void Bpd(C25556Chu chu, long j) {
        String str;
        boolean A1T;
        boolean A1T2;
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        C25632CjI cjI = chu.A01;
        if (cjI.A02(C25632CjI.A00) == C24248By6.CAMERA2) {
            str = "2";
        } else {
            str = "1";
        }
        A022.put("camera_api", str);
        if (Build.VERSION.SDK_INT >= 33) {
            A022.put("hdr_hlg_supported", String.valueOf(cjI.A02(C25632CjI.A0J)));
            A022.put("stream_use_case_video_call_supported", String.valueOf(BE6.A11(C25632CjI.A13, cjI).contains(5L)));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            A022.put("night_extension_supported", String.valueOf(cjI.A02(C25632CjI.A08)));
        }
        if (Build.VERSION.SDK_INT >= 33 && A1T2) {
            A022.put("preview_stabilization_api33_supported", String.valueOf((A1T2 = BE9.A1T(C25632CjI.A0Q, cjI))));
        }
        if (Build.VERSION.SDK_INT >= 34 && A1T) {
            A022.put("hdr_jpegr_supported", String.valueOf((A1T = BE9.A1T(C25632CjI.A0X, cjI))));
        }
        edj.Bi9("camera_connect_finished", "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void Bpf(long j) {
        C26294Cx6.A04("CameraEventLoggerImpl", "onConnectRequestFinished");
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.Bi9("camera_connect_request_posted", "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void Bpg(long j) {
        C26294Cx6.A04("CameraEventLoggerImpl", "onConnectRequested");
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        A022.put("is_cold_start", String.valueOf(A04));
        if (A04) {
            A04 = false;
        }
        edj.Bi9("camera_connect_requested", "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void Bph(long j) {
        int i;
        String str;
        EDJ edj = this.A01;
        String BMT = edj.BMT();
        HashMap hashMap = A08;
        if (hashMap.get(BMT) != null) {
            i = BE9.A0D(BMT, hashMap) + 1;
        } else {
            i = 1;
        }
        C17890vO.A0z(BMT, hashMap, i);
        HashMap hashMap2 = A09;
        if (!hashMap2.containsKey(BMT)) {
            C17890vO.A0z(BMT, hashMap2, 0);
        }
        Map BAg = edj.BAg();
        BAg.put("session_connect_count", String.valueOf(hashMap.get(BMT)));
        BAg.put("session_disconnect_count", String.valueOf(hashMap2.get(BMT)));
        int i2 = A07;
        A07 = i2 + 1;
        BAg.put("open_connections_count", String.valueOf(i2));
        AtomicBoolean atomicBoolean = this.A03;
        BAg.put("has_connect_request", String.valueOf(atomicBoolean.get()));
        Boolean bool = A05;
        if (bool == null) {
            try {
                Class.forName("androidx.camera.extensions.impl.ExtensionVersionImpl", false, getClass().getClassLoader());
                bool = true;
                A05 = bool;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                bool = false;
                A05 = bool;
            }
        }
        BAg.put("has_camera_extensions", String.valueOf(bool.booleanValue()));
        if (Build.VERSION.SDK_INT > 30) {
            if (A06 == null) {
                try {
                    str = (String) BE6.A0x(Class.forName("android.os.SystemProperties"), String.class, "get", new Class[1], 0).invoke((Object) null, new Object[]{"ro.camerax.extensions.enabled"});
                } catch (Exception unused2) {
                    str = null;
                }
                A06 = str;
                if (TextUtils.isEmpty(str)) {
                    A06 = "none";
                }
            }
            BAg.put("has_camera_extensions_prop", A06);
        }
        BAg.put("timestamp", String.valueOf(j));
        edj.Bi9("camera_connect_started", "CameraEventLoggerImpl", BAg, BE6.A0O(this));
        atomicBoolean.set(true);
        edj.CEH(BAg);
    }

    public void Brn(long j, boolean z) {
        int i;
        C26294Cx6.A02(Boolean.valueOf(z), "CameraEventLoggerImpl", "onDisconnectFinished evictedInMeantime=%b");
        EDJ edj = this.A01;
        String BMT = edj.BMT();
        HashMap hashMap = A08;
        if (!hashMap.containsKey(BMT)) {
            C17890vO.A0z(BMT, hashMap, 0);
        }
        HashMap hashMap2 = A09;
        if (hashMap2.get(BMT) != null) {
            i = BE9.A0D(BMT, hashMap2) + 1;
        } else {
            i = 1;
        }
        C17890vO.A0z(BMT, hashMap2, i);
        Map BAg = edj.BAg();
        BAg.put("session_connect_count", String.valueOf(hashMap.get(BMT)));
        BAg.put("session_disconnect_count", String.valueOf(hashMap2.get(BMT)));
        int i2 = A07 - 1;
        A07 = i2;
        BAg.put("open_connections_count", String.valueOf(i2));
        AtomicBoolean atomicBoolean = this.A03;
        BAg.put("has_connect_request", String.valueOf(atomicBoolean.get()));
        BAg.put("evicted_during_disconnect", String.valueOf(z));
        BAg.put("timestamp", String.valueOf(j));
        edj.Bi9("camera_disconnect_finished", "CameraEventLoggerImpl", BAg, BE6.A0O(this));
        atomicBoolean.set(false);
        edj.CEH(BAg);
    }

    public void Bui(int i, long j, int i2) {
        C26294Cx6.A02(Integer.valueOf(i2), "CameraEventLoggerImpl", "onFirstFrameRendered %s");
        if (i2 == 9) {
            EDJ edj = this.A01;
            Map A022 = A02(edj, j);
            A022.put("ttff_optic_value_ms", String.valueOf(i));
            edj.Bi9("camera_first_frame_rendered", "CameraEventLoggerImpl", A022, BE6.A0O(this));
            edj.CEH(A022);
        }
    }

    public void C88(long j) {
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.BiB("camera_update_finished", "SWITCH", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void C8A(long j) {
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.BiB("camera_update_requested", "SWITCH", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void CAP(long j, Throwable th) {
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        String A002 = A00(th);
        edj.Bi7(new BUQ(A002, th, 10012), "camera_warmup_failed", "CameraEventLoggerImpl", "low", "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public C26801DEj(EDJ edj, BG1 bg1) {
        this.A01 = edj;
        this.A02 = bg1;
    }

    public static String A00(Throwable th) {
        if (th.getMessage() != null) {
            return th.getMessage();
        }
        return "No error message provided.";
    }

    public static Map A02(EDJ edj, long j) {
        Map BAg = edj.BAg();
        BAg.put("timestamp", String.valueOf(j));
        return BAg;
    }

    public void Bne(Throwable th, int i, long j) {
        String A002 = A00(th);
        String str = "CameraEventLoggerImpl";
        this.A01.Bi7(new BUQ(A002, th, 10017), "camera_update_failed", "CameraEventLoggerImpl", "medium", str, A01(i, j), BE6.A0O(this));
    }

    public void Bpe(long j, Throwable th) {
        String A002 = A00(th);
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.Bi7(new BUQ(A002, th, 10013), "camera_connect_failed", "CameraEventLoggerImpl", "high", "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void Brm(long j, Throwable th) {
        String A002 = A00(th);
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.Bi7(new BUQ(A002, th, 10014), "camera_disconnect_failed", "CameraEventLoggerImpl", "medium", "CameraEventLoggerImpl", A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void C89(long j, Throwable th) {
        String A002 = A00(th);
        EDJ edj = this.A01;
        Map A022 = A02(edj, j);
        edj.BiA(new BUQ(A002, th, 10016), A022, BE6.A0O(this));
        edj.CEH(A022);
    }

    public void C9V(Exception exc) {
        String str;
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "Optic Camera Unhandled Exception";
        }
        A03(this, str, exc);
    }
}
