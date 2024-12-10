package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Cti  reason: case insensitive filesystem */
public abstract class C26168Cti {
    public static final Integer A00(Object obj, Object obj2) {
        int compareTo;
        boolean z = true;
        boolean A1X = AnonymousClass000.A1X(obj);
        if (obj2 != null) {
            z = false;
        }
        if (z ^ A1X) {
            throw new ClassCastException("One of the input is null, but the other one is not");
        } else if (obj == null || obj2 == null) {
            return 0;
        } else {
            AnonymousClass1D6 A01 = A01(obj, obj2);
            Object obj3 = A01.first;
            Object obj4 = A01.second;
            if (obj3.getClass() == obj4.getClass()) {
                if (obj3 instanceof Long) {
                    compareTo = C18070vi.A01(C17880vN.A05(obj3), C17880vN.A05(obj4));
                } else if (obj3 instanceof Double) {
                    compareTo = Double.compare(AnonymousClass8BR.A00(obj3), AnonymousClass8BR.A00(obj4));
                } else if (obj3 instanceof Boolean) {
                    boolean A1Y = AnonymousClass000.A1Y(obj3);
                    if (A1Y == AnonymousClass000.A1Y(obj4)) {
                        compareTo = 0;
                    } else {
                        compareTo = -1;
                        if (A1Y) {
                            compareTo = 1;
                        }
                    }
                } else if (!(obj3 instanceof String)) {
                    return null;
                } else {
                    compareTo = ((String) obj3).compareTo((String) obj4);
                }
                return Integer.valueOf(compareTo);
            }
            throw new ClassCastException("Two input are not the same type");
        }
    }

    public static final AnonymousClass1D6 A01(Object obj, Object obj2) {
        if ((obj instanceof Double) && (obj2 instanceof Number)) {
            return AnonymousClass1D6.A01(obj, Double.valueOf(AnonymousClass8BR.A00(obj2)));
        }
        if ((obj instanceof Number) && (obj2 instanceof Double)) {
            return AnonymousClass1D6.A01(Double.valueOf(AnonymousClass8BR.A00(obj)), obj2);
        }
        if (obj instanceof Integer) {
            obj = C17880vN.A0n(AnonymousClass000.A0M(obj));
        }
        if (obj2 instanceof Integer) {
            obj2 = C17880vN.A0n(AnonymousClass000.A0M(obj2));
        }
        return AnonymousClass1D6.A01(obj, obj2);
    }

    public static final boolean A02(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            return C18070vi.A18(obj2, obj);
        }
        AnonymousClass1D6 A01 = A01(obj, obj2);
        Object obj3 = A01.first;
        Object obj4 = A01.second;
        if (obj3.getClass() != obj4.getClass()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("The two values for comparison are different classes. Expected: ");
            A10.append(BEA.A0i(obj));
            A10.append(", Actual: ");
            throw new ClassCastException(AnonymousClass000.A0y(BEA.A0i(obj2), A10));
        } else if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            JSONObject jSONObject2 = (JSONObject) obj4;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            Iterator<String> keys = jSONObject.keys();
            C18070vi.A0X(keys);
            while (keys.hasNext()) {
                String A0v = C17880vN.A0v(keys);
                if (!A02(jSONObject.opt(A0v), jSONObject2.opt(A0v))) {
                    return false;
                }
            }
            return true;
        } else if (obj3 instanceof JSONArray) {
            return A04((JSONArray) obj3, (JSONArray) obj4);
        } else {
            if ((obj3 instanceof Number) || (obj3 instanceof Boolean) || (obj3 instanceof String)) {
                return obj3.equals(obj4);
            }
            throw BE6.A0v("The class type is currently not supported, only supports Number, Boolean, String, JSONObject, and JSONArray");
        }
    }

    public static final boolean A03(Object obj, Object obj2) {
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            if (jSONArray.length() != 0) {
                int length = jSONArray.length();
                int i = 0;
                while (i < length) {
                    Object obj3 = jSONArray.get(i);
                    C18070vi.A0X(obj3);
                    AnonymousClass1D6 A01 = A01(obj3, obj2);
                    Object obj4 = A01.first;
                    Object obj5 = A01.second;
                    Class<?> cls = obj4.getClass();
                    if (cls == obj5.getClass()) {
                        i++;
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("The two values for comparison are different classes. Expected: ");
                        A10.append(AnonymousClass3MW.A15(cls).BZJ());
                        A10.append(", Actual: ");
                        throw new ClassCastException(AnonymousClass000.A0y(BEA.A0i(obj2), A10));
                    }
                }
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    if (A02(jSONArray.get(i2), obj2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        throw BE6.A0v("Expected value is not an array");
    }

    public static final boolean A04(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray.length() == jSONArray2.length()) {
            int length = jSONArray.length();
            int i = 0;
            while (i < length) {
                if (A02(jSONArray.get(i), jSONArray2.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
