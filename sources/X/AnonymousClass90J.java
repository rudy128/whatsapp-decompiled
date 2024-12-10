package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.flows.phoenix.webview.FcsFlowsWebViewFragment;
import com.whatsapp.payments.phoenix.webview.fragment.FcsWebViewFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.90J  reason: invalid class name */
public final class AnonymousClass90J extends AnonymousClass909 implements C22579BDz, C22383B5m {
    public FcsWebViewFragment A00;
    public List A01 = AnonymousClass000.A13();
    public final AnonymousClass00H A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass6WM A04;

    public void BDM(boolean z) {
    }

    public Fragment BV2(String str, String str2, String str3, Map map, Map map2, int i) {
        Object obj;
        Map map3;
        FcsWebViewFragment fcsWebViewFragment;
        Object obj2;
        String str4;
        String str5;
        String str6;
        HashMap hashMap;
        Map map4;
        Map map5;
        Map map6;
        C18070vi.A0d(str, 0);
        String str7 = str3;
        Map map7 = map;
        C72473Md.A1M(map7, str7, map2, 2);
        Object obj3 = map7.get("additional_params");
        if (!(obj3 instanceof Map) || (map6 = (Map) obj3) == null) {
            obj = null;
        } else {
            obj = map6.get("ext_message_id");
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        boolean A1W = AnonymousClass000.A1W(obj);
        String A0g = AnonymousClass8BW.A0g("url", map7);
        String A0s = C17880vN.A0s("successURL", map7);
        String A0s2 = C17880vN.A0s("failureURL", map7);
        Object obj4 = map7.get("inputPayload");
        if (obj4 instanceof Map) {
            map3 = (Map) obj4;
        } else {
            map3 = null;
        }
        String A0m = AnonymousClass8BW.A0m(map3);
        boolean A18 = C18070vi.A18(map7.get("request_type"), "POST");
        String str8 = str2;
        if (A1W) {
            Object obj5 = map7.get("data");
            if (!(obj5 instanceof Map) || (map5 = (Map) obj5) == null) {
                obj2 = null;
            } else {
                obj2 = map5.get("screen");
            }
            if (obj2 instanceof String) {
                str4 = (String) obj2;
            } else {
                str4 = null;
            }
            if (str4 == null) {
                str4 = "";
            }
            Object obj6 = map7.get("onTransitionAction");
            if (!(obj6 instanceof String) || (str5 = (String) obj6) == null) {
                str5 = "";
            }
            Object obj7 = map7.get("nextScreen");
            if (!(obj7 instanceof String) || (str6 = (String) obj7) == null) {
                str6 = "";
            }
            int A022 = AnonymousClass3MX.A02(this.A01, 1);
            String A0G = C18070vi.A0G(this.A03, 2131896261);
            Object obj8 = map7.get("outputPayload");
            if (!(obj8 instanceof Map) || (map4 = (Map) obj8) == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap(map4);
            }
            C18070vi.A0d(A0g, 0);
            fcsWebViewFragment = new FcsFlowsWebViewFragment();
            Bundle A0D = C17880vN.A0D();
            A0D.putString("url", A0g);
            A0D.putString("success_url", A0s);
            A0D.putString("failure_url", A0s2);
            A0D.putString("post_data", A0m);
            A0D.putBoolean("use_post_request", A18);
            A0D.putString("fds_observer_id", str8);
            A0D.putString("fds_manager_id", str7);
            A0D.putInt("callback_index", A022);
            A0D.putString("current_screen", str4);
            A0D.putString("next_action", str5);
            A0D.putString("next_screen", str6);
            A0D.putString("error_message", A0G);
            A0D.putSerializable("callback_url_payload", hashMap);
            fcsWebViewFragment.A1R(A0D);
        } else {
            int A012 = AnonymousClass3MX.A01(this.A01);
            C18070vi.A0d(A0g, 0);
            fcsWebViewFragment = new FcsWebViewFragment();
            Bundle A0D2 = C17880vN.A0D();
            A0D2.putString("url", A0g);
            A0D2.putString("success_url", A0s);
            A0D2.putString("failure_url", A0s2);
            A0D2.putString("post_data", A0m);
            A0D2.putBoolean("use_post_request", true);
            A0D2.putString("fds_observer_id", str8);
            A0D2.putString("fds_manager_id", str7);
            A0D2.putInt("callback_index", A012);
            fcsWebViewFragment.A1R(A0D2);
        }
        this.A00 = fcsWebViewFragment;
        C18070vi.A0b(fcsWebViewFragment);
        return fcsWebViewFragment;
    }

    public void CAl(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
    }

    public void CAx(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
    }

    public void BLG(Map map) {
        if (map != null) {
            Object obj = map.get("callback_index");
            List list = this.A01;
            C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.Int");
            BBM bbm = (BBM) list.get(AnonymousClass000.A0M(obj));
            Object obj2 = map.get("resource_output");
            C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            Map map2 = (Map) obj2;
            if (AnonymousClass8BX.A1X(map, "status")) {
                bbm.C7V(map2);
            } else {
                bbm.Btu(C19980A1q.A03, map2);
            }
        } else {
            throw C17880vN.A0g();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass90J(AnonymousClass9W3 r2, AnonymousClass118 r3, AnonymousClass6WM r4, C176198zw r5, AnonymousClass00H r6) {
        super(r2, r5);
        C18070vi.A0w(r6, r3, r4, r2, r5);
        this.A02 = r6;
        this.A03 = r3;
        this.A04 = r4;
    }
}
