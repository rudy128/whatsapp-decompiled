package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class AM7 implements AnonymousClass16K {
    public Integer A00;
    public String A01;
    public final AnonymousClass18K A02;

    public AM7(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public final void A01(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, int i, int i2, long j) {
        if (num != null) {
            LinkedHashMap A13 = C17880vN.A13();
            if (str != null) {
                AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
                C72463Mc.A1H("length", Long.valueOf((long) str.length()), r2);
                int i3 = 0;
                if (AnonymousClass1YF.A0I(str).length() != 0) {
                    i3 = C108965cb.A0v(AnonymousClass1YF.A0I(str), "\\s+", 0).toArray(new String[0]).length;
                }
                AnonymousClass1D6.A03("words", Integer.valueOf(i3), r2, 1);
                A13.put("query", AnonymousClass1D7.A0C(r2));
            }
            LinkedHashMap A132 = C17880vN.A13();
            A132.put("endpoint", str2);
            A132.put("local_biz_count", num);
            A132.put("api_biz_count", Integer.valueOf(i));
            A132.put("sub_categories", Long.valueOf(j));
            if (AnonymousClass8BR.A1Y(A132)) {
                A13.put("result", A132);
            }
            LinkedHashMap A133 = C17880vN.A13();
            if (bool2 != null) {
                A133.put("has_catalog", bool2);
            }
            if (bool != null) {
                A133.put("distance", bool);
            }
            if (bool3 != null) {
                A133.put("open_now", bool3);
            }
            String str4 = str3;
            if (str3 != null) {
                A133.put("categories", str4);
            }
            if (AnonymousClass8BR.A1Y(A133)) {
                A13.put("filters", A133);
            }
            A08(Integer.valueOf(i2), 2, A13, 2, 4, 2);
        }
    }

    public final void A04(Integer num, int i, int i2) {
        A08(num, (Integer) null, (Map) null, i, i2, 0);
    }

    public final void A06(Integer num, Integer num2, int i) {
        A08(num2, num, (Map) null, 0, i, 1);
    }

    public void BiG(Map map, int i, int i2) {
        A08((Integer) null, (Integer) null, map, i, i2, 3);
    }

    public final void A00(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, String str3, List list, float f, int i, int i2, int i3, int i4, int i5) {
        String str4 = str3;
        C18070vi.A0d(str4, 6);
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        A132.put("zoom_level", Float.valueOf(f));
        A132.put("endpoint", "businesses");
        if (str != null) {
            A132.put("search_category_id", str);
        }
        if (num != null) {
            A132.put("biz_loaded_count", num);
        }
        if (num2 != null) {
            A132.put("biz_selected_count", num2);
        }
        A132.put("map_view_config_version", str4);
        LinkedHashMap A133 = C17880vN.A13();
        C17880vN.A1P("compact_marker_count", A133, i2);
        C17880vN.A1P("regular_marker_count", A133, i);
        A132.put("biz_in_viewport", A133);
        List list2 = list;
        if (list != null) {
            A132.put("segment_biz_count", list2);
        }
        if (AnonymousClass8BR.A1Y(A132)) {
            A13.put("result", A132);
        }
        LinkedHashMap A134 = C17880vN.A13();
        if (bool3 != null) {
            A134.put("has_catalog", bool3);
        }
        if (bool2 != null) {
            A134.put("distance", bool2);
        }
        if (bool != null) {
            A134.put("open_now", bool);
        }
        String str5 = str2;
        if (str2 != null) {
            A134.put("categories", str5);
        }
        if (AnonymousClass8BR.A1Y(A134)) {
            A13.put("filters", A134);
        }
        int i6 = i5;
        A08(Integer.valueOf(i3), Integer.valueOf(i6), A13, i6, i4, 2);
    }

    public final void A08(Integer num, Integer num2, Map map, int i, int i2, int i3) {
        C171788sH r2 = new C171788sH();
        r2.A0S = this.A01;
        r2.A0A = this.A00;
        r2.A09 = num;
        r2.A04 = Integer.valueOf(i3);
        r2.A02 = Integer.valueOf(i2);
        r2.A03 = Integer.valueOf(i);
        r2.A01 = num2;
        if (map != null && AnonymousClass8BR.A1Y(map)) {
            r2.A0N = AnonymousClass8BU.A0s(map);
        }
        r2.A05 = AnonymousClass3MY.A0f();
        r2.A0H = 2L;
        this.A02.CC7(r2);
    }

    public final void A02(Boolean bool, Integer num, String str, int i) {
        LinkedHashMap A13 = C17880vN.A13();
        if (bool != null) {
            A13.put("is_enabled", bool);
        }
        if (str != null) {
            A13.put("categories", str);
        }
        A08(num, 2, A13, 2, i, 1);
    }

    public final void A03(Boolean bool, Integer num, String str, int i) {
        LinkedHashMap A13 = C17880vN.A13();
        if (bool != null) {
            A13.put("is_enabled", bool);
        }
        if (str != null) {
            A13.put("categories", str);
        }
        A08(num, 11, A13, 11, i, 1);
    }

    public final void A05(Integer num, int i, int i2, boolean z) {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put("local_biz_count", Integer.valueOf(i2));
        A13.put("ranked_position", Integer.valueOf(i));
        A13.put("is_business_profile_loaded", Boolean.valueOf(z));
        A08(num, (Integer) null, A13, 11, 70, 2);
    }

    public final void A07(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, int i2, int i3) {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        LinkedHashMap A13 = C17880vN.A13();
        A13.put("position", Integer.valueOf(i3));
        if (!(num3 == null || (obj4 = num3.toString()) == null)) {
            A13.put("click_location", obj4);
        }
        if (!(num4 == null || (obj3 = num4.toString()) == null)) {
            A13.put("catalog_preview_status", obj3);
        }
        if (!(num5 == null || (obj2 = num5.toString()) == null)) {
            A13.put("fbig_preview_status", obj2);
        }
        if (!(num6 == null || (obj = num6.toString()) == null)) {
            A13.put("description_preview_status", obj);
        }
        A08(num, num2, A13, i2, i, 1);
    }
}
