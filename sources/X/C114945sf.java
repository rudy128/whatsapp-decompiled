package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import com.whatsapp.deeplink.DeepLinkActivity;
import java.io.Serializable;

/* renamed from: X.5sf  reason: invalid class name and case insensitive filesystem */
public abstract class C114945sf extends AnonymousClass1FY {
    public boolean A00 = false;

    public static void A0V(Intent intent, String str) {
        intent.putExtra("first_caption", (String) null);
        intent.putExtra("jid", str);
        intent.putExtra("jids", (Serializable) null);
        intent.putExtra("max_items", 0);
        intent.putExtra("skip_max_items_new_limit", false);
        intent.putExtra("origin", 5);
        intent.putExtra("picker_open_time", SystemClock.elapsedRealtime());
    }

    public static void A0c(Intent intent, boolean z) {
        intent.putExtra("animate_uri", (Parcelable) null);
        intent.putExtra("preselected_image_uri", (Parcelable) null);
        intent.putExtra("scan_for_qr", z);
        intent.putExtra("is_new_content", z);
        intent.putExtra("status_distribution", (Parcelable) null);
        intent.putExtra("gallery_duration_ms", -1);
        intent.putExtra("preview_top_margin", -1);
        intent.putExtra("preview_bottom_margin", -1);
    }

    public static Intent A03(DeepLinkActivity deepLinkActivity) {
        return new Intent(deepLinkActivity, deepLinkActivity.A0g.A06().BWu());
    }

    public static void A0Q(Intent intent) {
        intent.putExtra("is_media_ptv", false);
        intent.putExtra("captured_with_old_camera_controller", false);
        intent.putExtra("handle_redirect", false);
        intent.putExtra("camera_capture_direction", (Serializable) null);
        intent.putExtra("recording_stopped_automatic", false);
        intent.putExtra("camera_ready_time", 0);
        intent.putExtra("camera_switch_count", 0);
        intent.putExtra("send_media_preview_params_as_result", false);
        intent.putExtra("show_try_templates_tooltip", false);
        intent.putExtra("standalone_add_button_provider_key", (String) null);
        intent.putExtra("apply_rotation_on_not_send", false);
        intent.putExtra("enable_template_tool", false);
    }

    public static boolean A0d(Intent intent, Bundle bundle) {
        intent.putExtra("send", true);
        intent.putExtra("disable_tools_for_newsletter_forward", false);
        intent.putExtra("quoted_message_row_id", 0);
        intent.putExtra("quoted_group_jid", (String) null);
        intent.putExtra("number_from_url", false);
        intent.putExtra("media_preview_params", bundle);
        return false;
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            DeepLinkActivity deepLinkActivity = (DeepLinkActivity) this;
            AnonymousClass1K1 r5 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r5, deepLinkActivity);
            AnonymousClass1FB.A0M(A0A, deepLinkActivity);
            AnonymousClass10G r4 = A0A.A00;
            C109005cf.A0d(A0A, r4, deepLinkActivity);
            C109005cf.A0e(A0A, r4, deepLinkActivity, r4.A5A);
            deepLinkActivity.A0G = (C40751vD) A0A.AB7.get();
            deepLinkActivity.A0l = C000200d.A00(r4.A00);
            deepLinkActivity.A0V = C108955ca.A0M(A0A);
            deepLinkActivity.A0T = (C58692l6) A0A.AlJ.get();
            deepLinkActivity.A0n = C000200d.A00(A0A.A0p);
            deepLinkActivity.A0K = (AnonymousClass1VP) A0A.A1l.get();
            deepLinkActivity.A1C = C000200d.A00(A0A.Amp);
            deepLinkActivity.A0F = (C132216mP) r4.A4S.get();
            deepLinkActivity.A19 = C000200d.A00(A0A.A6N);
            deepLinkActivity.A06 = (C19880zA) A0A.A7g.get();
            deepLinkActivity.A0M = (C30191dX) A0A.A2b.get();
            deepLinkActivity.A14 = C000200d.A00(r5.A12);
            deepLinkActivity.A0u = C000200d.A00(A0A.A1s);
            deepLinkActivity.A0b = AnonymousClass3MY.A0Z(A0A);
            deepLinkActivity.A0X = (C32981i4) A0A.A3G.get();
            deepLinkActivity.A0N = AnonymousClass10E.A4z(A0A);
            deepLinkActivity.A0o = C000200d.A00(A0A.A14);
            deepLinkActivity.A0g = (AnonymousClass1QS) A0A.A8J.get();
            deepLinkActivity.A0U = (C36391no) A0A.A8P.get();
            deepLinkActivity.A0P = (C678831f) r4.A10.get();
            deepLinkActivity.A0L = AnonymousClass10E.A48(A0A);
            deepLinkActivity.A0z = C000200d.A00(r5.A0u);
            deepLinkActivity.A0a = (AnonymousClass1MB) A0A.AAb.get();
            deepLinkActivity.A0s = C000200d.A00(A0A.A1q);
            deepLinkActivity.A0H = (C195529tU) A0A.A1t.get();
            deepLinkActivity.A0O = AnonymousClass3MZ.A0f(A0A);
            deepLinkActivity.A0R = AnonymousClass3Ma.A0b(A0A);
            deepLinkActivity.A0y = C000200d.A00(r5.A0t);
            deepLinkActivity.A15 = C000200d.A00(r5.A16);
            C19890zB r2 = C19890zB.A00;
            deepLinkActivity.A0D = r2;
            deepLinkActivity.A0E = r2;
            deepLinkActivity.A0k = (C189759jn) A0A.AdV.get();
            deepLinkActivity.A10 = C000200d.A00(r4.A8i);
            deepLinkActivity.A0Q = (C27301Vn) A0A.A9A.get();
            deepLinkActivity.A0I = (A8Q) A0A.A1p.get();
            deepLinkActivity.A17 = C000200d.A00(A0A.A51);
            deepLinkActivity.A0i = (C31071ey) A0A.A6H.get();
            deepLinkActivity.A0h = (C188069gp) A0A.Ad9.get();
            deepLinkActivity.A0e = (AnonymousClass4YQ) A0A.Aam.get();
            deepLinkActivity.A0c = (AnonymousClass1XN) r4.A0d.get();
            deepLinkActivity.A0Y = (C86344Rg) r4.A1J.get();
            deepLinkActivity.A0j = (A98) A0A.Ag7.get();
            deepLinkActivity.A13 = C000200d.A00(A0A.AKT);
            deepLinkActivity.A1A = C000200d.A00(A0A.A8f);
            deepLinkActivity.A0S = (C30801eX) A0A.AL8.get();
            deepLinkActivity.A09 = r2;
            deepLinkActivity.A0B = r2;
            deepLinkActivity.A0d = (C36921og) r4.A1S.get();
            deepLinkActivity.A0J = (AnonymousClass6h0) r4.A7K.get();
            deepLinkActivity.A0t = C000200d.A00(A0A.A1u);
            deepLinkActivity.A12 = C000200d.A00(r4.A8k);
            deepLinkActivity.A0Z = AnonymousClass3Ma.A0g(A0A);
            deepLinkActivity.A07 = r2;
            deepLinkActivity.A08 = r2;
            deepLinkActivity.A0w = AnonymousClass3MX.A10(A0A);
            deepLinkActivity.A0q = C000200d.A00(A0A.A1H);
            deepLinkActivity.A0f = (AnonymousClass1QO) A0A.A8G.get();
            deepLinkActivity.A05 = r2;
            deepLinkActivity.A0A = r2;
            deepLinkActivity.A0v = C000200d.A00(r5.A0e);
            deepLinkActivity.A0r = C000200d.A00(r5.A0R);
            deepLinkActivity.A0m = C000200d.A00(r5.A09);
            deepLinkActivity.A04 = r2;
            deepLinkActivity.A0x = C000200d.A00(r4.A0n);
            deepLinkActivity.A0C = r2;
            deepLinkActivity.A11 = C000200d.A00(r5.A0v);
            deepLinkActivity.A1B = C000200d.A00(r5.A5p);
            deepLinkActivity.A16 = C000200d.A00(r4.A9o);
            deepLinkActivity.A18 = C000200d.A00(r4.A2s);
            deepLinkActivity.A01 = r2;
            deepLinkActivity.A03 = r2;
            deepLinkActivity.A02 = r2;
            deepLinkActivity.A0p = C000200d.A00(A0A.A19);
        }
    }

    public C114945sf() {
        AnonymousClass79Z.A00(this, 41);
    }
}
