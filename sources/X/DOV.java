package X;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DOV implements EBZ {
    public final C25769Clg A00 = C25453Cg5.A02.A01;

    public Set BXg(Object obj) {
        if (!(obj instanceof List)) {
            return ((Map) obj).keySet();
        }
        throw C17880vN.A0y();
    }

    public int BhV(Object obj) {
        String str;
        if (obj instanceof List) {
            return ((List) obj).size();
        }
        if (obj instanceof Map) {
            return BXg(obj).size();
        }
        if (obj instanceof String) {
            return ((String) obj).length();
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("length operation cannot be applied to ");
        if (obj != null) {
            str = C17890vO.A0U(obj);
        } else {
            str = "null";
        }
        throw new C27232DaC(AnonymousClass000.A0y(str, A10));
    }

    public void CHv(Object obj, int i, Object obj2) {
        if (obj instanceof List) {
            List list = (List) obj;
            if (i == list.size()) {
                list.add(obj2);
            } else {
                list.set(i, obj2);
            }
        } else {
            throw C17880vN.A0y();
        }
    }

    public void CKG(Object obj, Object obj2, Object obj3) {
        String str;
        if (obj instanceof Map) {
            ((Map) obj).put(obj2.toString(), obj3);
            return;
        }
        if (AnonymousClass001.A1E(obj, "setProperty operation cannot be used with ", AnonymousClass000.A10()) != null) {
            str = C17890vO.A0U(obj);
        } else {
            str = "null";
        }
        throw new C27232DaC(str);
    }

    public Iterable CPI(Object obj) {
        String str;
        if (obj instanceof List) {
            return (Iterable) obj;
        }
        if (AnonymousClass001.A1E(obj, "Cannot iterate over ", AnonymousClass000.A10()) != null) {
            str = C17890vO.A0U(obj);
        } else {
            str = "null";
        }
        throw new C27232DaC(str);
    }
}
