package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity;
import com.whatsapp.wabloks.ui.WaFcsModalActivity;
import com.whatsapp.wabloks.ui.WaFcsPreloadedBloksActivity;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.7Kk  reason: invalid class name and case insensitive filesystem */
public final class C145217Kk implements C22545BCc {
    public AnonymousClass1D6 A00;
    public final C19943A0a A01;
    public final AnonymousClass118 A02;
    public final C195329tA A03;

    public Fragment BV2(String str, String str2, String str3, Map map, Map map2, int i) {
        String str4;
        String str5 = str;
        C18070vi.A0d(str, 0);
        String str6 = str3;
        C72473Md.A1M(map, str3, map2, 2);
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str4 = (String) obj) == null) {
            throw AnonymousClass000.A0k("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        AnonymousClass1D6 r0 = this.A00;
        if (r0 != null) {
            String obj2 = new JSONObject(map2).toString();
            return AnonymousClass6Y3.A00(this.A03.A01.A00(str3), str4, str5, (String) r0.first, (String) r0.second, obj2, C19943A0a.A00(Integer.valueOf(i)), str6, str2);
        }
        C18070vi.A11("dataModuleNamespaceData");
        throw null;
    }

    public static Intent A00(Intent intent, String str, String str2, String str3, String str4) {
        return intent.putExtra("fds_on_back", str).putExtra("fds_on_back_params", str2).putExtra("fds_button_style", str3).putExtra("fds_state_name", str4);
    }

    public void BDM(boolean z) {
        String str;
        Context context = this.A02.A00;
        Intent A0A = C17880vN.A0A();
        String packageName = context.getPackageName();
        if (z) {
            str = "com.whatsapp.wabloks.ui.WaFcsModalActivity";
        } else {
            str = "com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity";
        }
        A0A.setClassName(packageName, str);
        A0A.setFlags(872415232);
        context.startActivity(A0A);
    }

    public void CAl(String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i) {
        String str7;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str7 = (String) obj) == null) {
            throw AnonymousClass000.A0k("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context A0E = C108945cZ.A0E(this.A02);
        AnonymousClass1D6 r0 = this.A00;
        if (r0 != null) {
            String obj2 = new JSONObject(map2).toString();
            Intent putExtra = A00(new Intent(A0E, WaFcsPreloadedBloksActivity.class).putExtra("screen_name", str7).putExtra("data_module_job_id", (String) r0.first).putExtra("data_module_namespace", (String) r0.second).putExtra("fds_manager_id", str6).putExtra("screen_params", obj2), str, str2, str3, str4).putExtra("fds_observer_id", str5).putExtra("qpl_param_map", C19943A0a.A00(Integer.valueOf(i))).putExtra("screen_cache_config", this.A03.A01.A00(str6));
            putExtra.setFlags(268435456);
            A0E.startActivity(putExtra);
            return;
        }
        C18070vi.A11("dataModuleNamespaceData");
        throw null;
    }

    public void CAx(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, int i, int i2, boolean z) {
        String str7;
        Intent putExtra;
        Object obj = map.get("app_id");
        if (!(obj instanceof String) || (str7 = (String) obj) == null) {
            throw AnonymousClass000.A0k("FcsScreenOpenerBloksDelegate: app_id is not present");
        }
        Context A0E = C108945cZ.A0E(this.A02);
        Integer num2 = AnonymousClass00R.A01;
        JSONObject jSONObject = new JSONObject(map2);
        if (num == num2) {
            putExtra = A00(new Intent(A0E, WaFcsBottomSheetModalActivity.class).putExtra("screen_params", jSONObject.toString()).putExtra("fds_observer_id", str5), str, str2, str3, str4).putExtra("fcs_bottom_sheet_max_height_percentage", i2).putExtra("fcs_show_divider_under_nav_bar", z);
            C18070vi.A0X(putExtra);
        } else {
            String obj2 = jSONObject.toString();
            ADL A002 = this.A03.A01.A00(str6);
            putExtra = A00(new Intent(A0E, WaFcsModalActivity.class).putExtra("screen_name", str7).putExtra("screen_params", obj2).putExtra("screen_cache_config", A002).putExtra("fds_observer_id", str5), str, str2, str3, str4).putExtra("qpl_param_map", C19943A0a.A00(Integer.valueOf(i)));
        }
        putExtra.setFlags(268435456);
        A0E.startActivity(putExtra);
    }

    public C145217Kk(C19943A0a a0a, AnonymousClass118 r2, C195329tA r3) {
        C18070vi.A0j(r2, a0a);
        this.A02 = r2;
        this.A01 = a0a;
        this.A03 = r3;
    }
}
