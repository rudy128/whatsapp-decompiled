package X;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.security.SecureRandom;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AHz implements BDM {
    public static final C188949iG A0A = new Object();
    public final SparseArray A00;
    public final C22403B6g A01;
    public final C26235CvV A02;
    public final Boolean A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final Map A08;
    public final Map A09;

    public AHz(C22403B6g b6g, C26235CvV cvV, Boolean bool, String str, List list, Map map, Map map2, boolean z, boolean z2) {
        LinkedHashMap linkedHashMap;
        this.A02 = cvV;
        this.A09 = map2;
        this.A03 = bool;
        this.A01 = b6g;
        this.A07 = list;
        map.get("__infra__app_id");
        if (!z || z2) {
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put("__infra__ttrc_instance_id", String.valueOf(new SecureRandom().nextInt()));
            linkedHashMap.put("__infra__ttrc_timestamp", Long.valueOf(AwakeTimeSinceBootClock.INSTANCE.now()));
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        this.A08 = linkedHashMap;
        Object obj = linkedHashMap.get("__infra__app_id");
        C18070vi.A0z(obj, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) obj;
        this.A05 = str2;
        this.A04 = str == null ? str2 : str;
        Object obj2 = linkedHashMap.get("__infra__screen_id");
        C18070vi.A0z(obj2, "null cannot be cast to non-null type kotlin.String");
        this.A06 = (String) obj2;
        C18070vi.A0z(linkedHashMap.get("__infra__ttrc_marker_id"), "null cannot be cast to non-null type kotlin.Int");
        C18070vi.A0z(linkedHashMap.get("__infra__cache_ttl"), "null cannot be cast to non-null type kotlin.Long");
        this.A00 = (SparseArray) linkedHashMap.get("__key_additional_object_set");
    }

    public static final Bundle A00(AHz aHz, boolean z) {
        boolean z2;
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("key_from_config_change", z);
        A0D.putString("key_app_id", aHz.A05);
        A0D.putInt("key_content_parse_result", C25925Coo.A00(aHz.A02));
        A0D.putInt("key_tree_params", C25925Coo.A00(aHz.A08));
        A0D.putInt("key_analytics_extras", C25925Coo.A00(aHz.A09));
        A0D.putString("key_analytics_module", aHz.A04);
        Boolean bool = aHz.A03;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        A0D.putBoolean("key_animate_on_navigation", z2);
        A0D.putInt("key_container_config", C25925Coo.A00(aHz.A01));
        return A0D;
    }

    public String BVJ() {
        return "screen_query";
    }
}
