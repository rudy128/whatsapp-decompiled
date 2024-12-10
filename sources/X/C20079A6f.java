package X;

import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A6f  reason: case insensitive filesystem */
public class C20079A6f {
    public int A00 = -1;
    public final Double A01;
    public final Double A02;
    public final Double A03;
    public final Double A04;
    public final Double A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Double A09;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C20079A6f a6f = (C20079A6f) obj;
        Double d = this.A03;
        Double d2 = a6f.A03;
        if (d != null ? d.equals(d2) : d2 == null) {
            Double d3 = this.A04;
            Double d4 = a6f.A04;
            if (d3 != null ? d3.equals(d4) : d4 == null) {
                Double d5 = this.A01;
                Double d6 = a6f.A01;
                if (d5 != null ? d5.equals(d6) : d6 == null) {
                    Double d7 = this.A02;
                    Double d8 = a6f.A02;
                    if (d7 != null ? d7.equals(d8) : d8 == null) {
                        if (this.A08.equals(a6f.A08)) {
                            Double d9 = this.A09;
                            Double d10 = a6f.A09;
                            if (d9 != null ? d9.equals(d10) : d10 == null) {
                                String str = this.A06;
                                String str2 = a6f.A06;
                                if (str == null) {
                                    return str2 == null;
                                }
                                if (str.equals(str2)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static LatLng A00(C20079A6f a6f) {
        Double d = a6f.A03;
        C17960vV.A07(d);
        double doubleValue = d.doubleValue();
        Double d2 = a6f.A04;
        C17960vV.A07(d2);
        return new LatLng(doubleValue, d2.doubleValue());
    }

    public static Integer A02(AnonymousClass8FG r0) {
        return Integer.valueOf(r0.A05.A03());
    }

    public int A03() {
        String str;
        String str2 = this.A08;
        switch (str2.hashCode()) {
            case -1335157162:
                str = "device";
                break;
            case -1207360282:
                if (str2.equals("pin_on_map")) {
                    return 3;
                }
                break;
            case -1081415738:
                if (str2.equals("manual")) {
                    return 1;
                }
                break;
            case 1738549583:
                str = "nearest_neighborhood";
                break;
        }
        if (str2.equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean A05() {
        String str = this.A08;
        if (str.equals("country_default") || str.equals("approx_default")) {
            return true;
        }
        return false;
    }

    public boolean A06() {
        String str = this.A08;
        if ("city_default".equals(str) || "country_default".equals(str) || "manual".equals(str) || "nearest_neighborhood".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean A07() {
        String str = this.A08;
        if ("pin_on_map".equals(str)) {
            return true;
        }
        if (!"device".equals(str)) {
            return false;
        }
        Double d = this.A05;
        C17960vV.A07(d);
        if (d.doubleValue() - 800.0d <= 200.0d) {
            return true;
        }
        Double d2 = this.A09;
        if (d2 == null || d2.doubleValue() > 200.0d) {
            return false;
        }
        return true;
    }

    public boolean A08() {
        String str = this.A08;
        if ("device".equals(str) || "pin_on_map".equals(str) || "map_view".equals(str)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Double d = this.A03;
        int i = 0;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode() * 43;
        }
        Double d2 = this.A04;
        if (d2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d2.hashCode() * 43;
        }
        int i2 = hashCode + hashCode2;
        Double d3 = this.A01;
        if (d3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = d3.hashCode() * 43;
        }
        int i3 = i2 + hashCode3;
        Double d4 = this.A02;
        if (d4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d4.hashCode() * 43;
        }
        int hashCode6 = i3 + hashCode4 + (this.A08.hashCode() * 43);
        Double d5 = this.A09;
        if (d5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = d5.hashCode() * 43;
        }
        int i4 = hashCode6 + hashCode5;
        String str = this.A06;
        if (str != null) {
            i = str.hashCode() * 43;
        }
        return i4 + i;
    }

    public C20079A6f(Double d, Double d2, Double d3, Double d4, Double d5, Double d6, String str, String str2, String str3) {
        this.A05 = d;
        this.A03 = d2;
        this.A04 = d3;
        this.A01 = d4;
        this.A02 = d5;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A09 = d6;
    }

    public static C20079A6f A01(String str) {
        Double d;
        Double d2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(str);
            Double A0h = AnonymousClass8BU.A0h("radius", A16);
            Double A0h2 = AnonymousClass8BU.A0h("latitude", A16);
            Double A0h3 = AnonymousClass8BU.A0h("longitude", A16);
            int optInt = A16.optInt("imprecise_tile_level", -1);
            double optDouble = A16.optDouble("imprecise_latitude", -1.0d);
            double optDouble2 = A16.optDouble("imprecise_longitude", -1.0d);
            String optString = A16.optString("location_description");
            String string = A16.getString("provider");
            Double A0h4 = AnonymousClass8BU.A0h("accuracy", A16);
            String optString2 = A16.optString("country_code");
            if (optDouble == -1.0d) {
                d = null;
            } else {
                d = Double.valueOf(optDouble);
            }
            if (optDouble2 == -1.0d) {
                d2 = null;
            } else {
                d2 = Double.valueOf(optDouble2);
            }
            C20079A6f a6f = new C20079A6f(A0h, A0h2, A0h3, d, d2, A0h4, optString, optString2, string);
            a6f.A00 = optInt;
            return a6f;
        } catch (JSONException e) {
            Log.i("SearchLocation/fromJsonString Invalid search location string", e);
            return null;
        }
    }

    public String A04() {
        JSONObject A15 = C17880vN.A15();
        A15.put("radius", this.A05);
        A15.put("latitude", this.A03);
        A15.put("longitude", this.A04);
        A15.put("imprecise_tile_level", this.A00);
        A15.put("imprecise_latitude", this.A01);
        A15.put("imprecise_longitude", this.A02);
        A15.put("location_description", this.A07);
        A15.put("provider", this.A08);
        A15.put("accuracy", this.A09);
        return AnonymousClass8BS.A0k(this.A06, "country_code", A15);
    }
}
