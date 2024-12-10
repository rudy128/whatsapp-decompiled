package X;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: X.9iG  reason: invalid class name and case insensitive filesystem */
public final class C188949iG {
    public final AHz A00(Bundle bundle) {
        IllegalStateException A0n;
        try {
            Bundle bundle2 = bundle.getBundle("key_screen_container_props_bundle");
            if (bundle2 == null) {
                A0n = AnonymousClass000.A0n("args Bundle must contain ScreenContainerProps");
            } else {
                boolean z = bundle2.getBoolean("key_from_config_change");
                Integer valueOf = Integer.valueOf(bundle2.getInt("key_content_parse_result"));
                C26235CvV cvV = (C26235CvV) C25925Coo.A01(C26235CvV.class, valueOf);
                if (cvV != null) {
                    Integer valueOf2 = Integer.valueOf(bundle2.getInt("key_tree_params"));
                    Class<Map> cls = Map.class;
                    Map map = (Map) C25925Coo.A01(cls, valueOf2);
                    if (map != null) {
                        String string = bundle2.getString("key_analytics_module");
                        Integer valueOf3 = Integer.valueOf(bundle2.getInt("key_analytics_extras"));
                        boolean z2 = bundle2.getBoolean("key_animate_on_navigation");
                        Integer valueOf4 = Integer.valueOf(bundle2.getInt("key_container_config"));
                        C22403B6g b6g = (C22403B6g) C25925Coo.A01(C22403B6g.class, valueOf4);
                        Boolean valueOf5 = Boolean.valueOf(z2);
                        Integer[] numArr = new Integer[4];
                        AnonymousClass8BS.A1B(valueOf, valueOf2, numArr);
                        AnonymousClass001.A1R(valueOf3, valueOf4, numArr);
                        List asList = Arrays.asList(numArr);
                        C18070vi.A0X(asList);
                        return new AHz(b6g, cvV, valueOf5, string, asList, map, (Map) C25925Coo.A01(cls, valueOf3), true, z);
                    }
                    A0n = AnonymousClass000.A0n("Must have non-null tree params");
                } else {
                    A0n = AnonymousClass000.A0n("Must have a non-null content ParseResult");
                }
            }
            throw A0n;
        } catch (RuntimeException e) {
            throw new C179979Kq(e);
        }
    }
}
