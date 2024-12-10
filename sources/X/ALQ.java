package X;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ALQ implements C22415B6x {
    public static String A00(Object obj, boolean z, boolean z2) {
        if ((obj instanceof List) || (obj instanceof Map)) {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                A03(jsonWriter, obj, z, z2);
                jsonWriter.close();
                return stringWriter.toString();
            } catch (IOException e) {
                return AnonymousClass001.A1E(e, "Exception in serialization ", AnonymousClass000.A10());
            }
        } else if (obj == null) {
            return "";
        } else {
            return String.valueOf(obj);
        }
    }

    public static void A03(JsonWriter jsonWriter, Object obj, boolean z, boolean z2) {
        String valueOf;
        if (obj == null) {
            jsonWriter.nullValue();
        } else if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
        } else if (obj instanceof Boolean) {
            boolean A1Y = AnonymousClass000.A1Y(obj);
            if (z2) {
                jsonWriter.value(AnonymousClass8BX.A06(A1Y ? 1 : 0));
            } else {
                jsonWriter.value(A1Y);
            }
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else if (obj instanceof Map) {
                jsonWriter.beginObject();
                if (z) {
                    TreeMap treeMap = new TreeMap();
                    Iterator A15 = AnonymousClass000.A15((Map) obj);
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        treeMap.put(String.valueOf(A16.getKey()), A16.getValue());
                    }
                    Iterator A0i = C17890vO.A0i(treeMap);
                    while (A0i.hasNext()) {
                        Map.Entry A162 = AnonymousClass000.A16(A0i);
                        jsonWriter.name(C17880vN.A0x(A162));
                        A03(jsonWriter, A162.getValue(), z, z2);
                    }
                } else {
                    Iterator A152 = AnonymousClass000.A15((Map) obj);
                    while (A152.hasNext()) {
                        Map.Entry A163 = AnonymousClass000.A16(A152);
                        jsonWriter.name(String.valueOf(A163.getKey()));
                        A03(jsonWriter, A163.getValue(), z, z2);
                    }
                }
                jsonWriter.endObject();
                return;
            } else if (obj instanceof List) {
                jsonWriter.beginArray();
                Iterator A13 = AnonymousClass8BR.A13(obj);
                while (A13.hasNext()) {
                    A03(jsonWriter, A13.next(), z, z2);
                }
                jsonWriter.endArray();
                return;
            } else {
                valueOf = String.valueOf(obj);
            }
            jsonWriter.value(valueOf);
        }
    }

    public static ArrayList A01(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList A0z = C17880vN.A0z(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C25343Ce2.A00(AnonymousClass8BR.A00(obj));
                    } else if (obj instanceof Float) {
                        obj = C25343Ce2.A00((double) AnonymousClass000.A04(obj));
                    } else {
                        if (obj instanceof Boolean) {
                            A0z.add(obj);
                        } else if (!(obj instanceof Long)) {
                        }
                    }
                }
            }
            A0z.add(obj);
        }
        return A0z;
    }

    public static HashMap A02(JSONObject jSONObject) {
        HashMap A11 = C17880vN.A11();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0v = C17880vN.A0v(keys);
            Object obj = jSONObject.get(A0v);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    obj = A02((JSONObject) obj);
                } else if (obj instanceof JSONArray) {
                    obj = A01((JSONArray) obj);
                } else if (!(obj instanceof Integer)) {
                    if (obj instanceof Double) {
                        obj = C25343Ce2.A00(AnonymousClass8BR.A00(obj));
                    } else if (obj instanceof Float) {
                        obj = C25343Ce2.A00((double) AnonymousClass000.A04(obj));
                    } else if (obj instanceof Boolean) {
                        A11.put(A0v, obj);
                    } else if (!(obj instanceof Long)) {
                    }
                }
            }
            A11.put(A0v, obj);
        }
        return A11;
    }

    public Object BKe(C199029zJ r6, C25681CkC ckC, String str) {
        short s = -1;
        switch (str.hashCode()) {
            case -863899808:
                s = AnonymousClass8BV.A0z("bk.action.string.JsonDecode", str);
                break;
            case -826958968:
                s = AnonymousClass8BV.A10("bk.action.string.JsonEncode", str);
                break;
            case -138615772:
                if (str.equals("bk.action.string.JsonEncodeV2")) {
                    s = 2;
                    break;
                }
                break;
            case -138615771:
                if (str.equals("bk.action.string.JsonEncodeV3")) {
                    s = 3;
                    break;
                }
                break;
            case 1509306073:
                if (str.equals("bk.action.string.JsonDecodeArray")) {
                    s = 4;
                    break;
                }
                break;
        }
        switch (s) {
            case 0:
                try {
                    return A02(C17880vN.A16((String) r6.A00(0)));
                } catch (JSONException e) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e);
                }
            case 1:
                return A00(r6.A00.get(0), false, true);
            case 2:
                List list = r6.A00;
                return A00(list.get(0), C25343Ce2.A01(list.get(1)), true);
            case 3:
                List list2 = r6.A00;
                return A00(list2.get(0), C25343Ce2.A01(list2.get(1)), false);
            case 4:
                try {
                    return A01(new JSONArray((String) r6.A00(0)));
                } catch (JSONException e2) {
                    throw new IllegalArgumentException("Trying to decode malformed json", e2);
                }
            default:
                throw new C21583AmX(AnonymousClass001.A1H("Unknown lispy action type: ", str, AnonymousClass000.A10()));
        }
    }
}
