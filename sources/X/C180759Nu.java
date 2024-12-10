package X;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.9Nu  reason: invalid class name and case insensitive filesystem */
public abstract class C180759Nu {
    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this instanceof C173018uO) {
            if (obj instanceof C173018uO) {
                return true;
            }
            return false;
        } else if (!(this instanceof C172988uL)) {
            if (this instanceof C172998uM) {
                if (!(obj instanceof C172998uM)) {
                    return false;
                }
                obj2 = ((C172998uM) this).A00;
                obj3 = ((C172998uM) obj).A00;
            } else if (this instanceof C173008uN) {
                if (!(obj instanceof C173008uN)) {
                    return false;
                }
                obj2 = ((C173008uN) this).A00;
                obj3 = ((C173008uN) obj).A00;
            } else if (this instanceof C173038uQ) {
                if (!(obj instanceof C173038uQ)) {
                    return false;
                }
                JSONArray jSONArray = ((C173038uQ) this).A00;
                int length = jSONArray.length();
                JSONArray jSONArray2 = ((C173038uQ) obj).A00;
                if (length != jSONArray2.length()) {
                    return false;
                }
                int length2 = jSONArray.length();
                for (int i = 0; i < length2; i++) {
                    Object obj4 = jSONArray.get(i);
                    C18070vi.A0X(obj4);
                    C180759Nu A00 = C181389Qh.A00(obj4);
                    Object obj5 = jSONArray2.get(i);
                    C18070vi.A0X(obj5);
                    if (!C18070vi.A18(A00, C181389Qh.A00(obj5))) {
                        return false;
                    }
                }
            } else if (!(this instanceof C173028uP)) {
                throw AnonymousClass3MW.A14();
            } else if (!(obj instanceof C173028uP)) {
                return false;
            } else {
                JSONObject jSONObject = ((C173028uP) this).A00;
                int length3 = jSONObject.length();
                JSONObject jSONObject2 = ((C173028uP) obj).A00;
                if (length3 != jSONObject2.length()) {
                    return false;
                }
                Iterator A0s = AnonymousClass8BS.A0s(jSONObject);
                while (A0s.hasNext()) {
                    String A0v = C17880vN.A0v(A0s);
                    if (!jSONObject2.has(A0v)) {
                        return false;
                    }
                    Object obj6 = jSONObject.get(A0v);
                    C18070vi.A0X(obj6);
                    C180759Nu A002 = C181389Qh.A00(obj6);
                    Object obj7 = jSONObject2.get(A0v);
                    C18070vi.A0X(obj7);
                    if (!C18070vi.A18(A002, C181389Qh.A00(obj7))) {
                        return false;
                    }
                }
            }
            return C18070vi.A18(obj2, obj3);
        } else if (!(obj instanceof C172988uL) || ((C172988uL) this).A00 != ((C172988uL) obj).A00) {
            return false;
        } else {
            return true;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int i;
        if (this instanceof C173018uO) {
            return -1390628052;
        }
        if (this instanceof C172988uL) {
            hashCode = 1237;
            if (((C172988uL) this).A00) {
                hashCode = 1231;
            }
            i = -1174773661;
        } else if (this instanceof C172998uM) {
            hashCode = ((C172998uM) this).A00.hashCode();
            i = -658705490;
        } else if (this instanceof C173008uN) {
            hashCode = ((C173008uN) this).A00.hashCode();
            i = -516327306;
        } else if (this instanceof C173038uQ) {
            JSONArray jSONArray = ((C173038uQ) this).A00;
            int length = jSONArray.length() ^ -171886252;
            int length2 = jSONArray.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Object obj = jSONArray.get(i2);
                C18070vi.A0X(obj);
                length = (length + i2) ^ C181389Qh.A00(obj).hashCode();
            }
            return length;
        } else if (this instanceof C173028uP) {
            JSONObject jSONObject = ((C173028uP) this).A00;
            int length3 = jSONObject.length() ^ -647709788;
            Iterator A0s = AnonymousClass8BS.A0s(jSONObject);
            while (A0s.hasNext()) {
                String A0v = C17880vN.A0v(A0s);
                int hashCode2 = length3 ^ A0v.hashCode();
                Object obj2 = jSONObject.get(A0v);
                C18070vi.A0X(obj2);
                length3 = hashCode2 ^ C181389Qh.A00(obj2).hashCode();
            }
            return length3;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return hashCode ^ i;
    }
}
