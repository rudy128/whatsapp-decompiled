package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import org.json.JSONObject;

public final class A6A {
    public Vector A00;
    public Vector A01;
    public JSONObject A02;
    public boolean A03 = true;
    public final A92 A04 = new A92();
    public final HashMap A05 = C17880vN.A11();

    public static final Vector A00(A6A a6a, HashMap hashMap, JSONObject jSONObject) {
        C198059xi r1;
        Vector vector = new Vector();
        Iterator A0s = AnonymousClass8BS.A0s(jSONObject);
        while (A0s.hasNext()) {
            String A0v = C17880vN.A0v(A0s);
            Object obj = jSONObject.get(A0v);
            if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                if (!hashMap.containsKey(A0v)) {
                    int size = hashMap.size();
                    Integer valueOf = Integer.valueOf(size);
                    C18070vi.A0b(A0v);
                    hashMap.put(A0v, valueOf);
                    r1 = new C198059xi(size, obj.toString());
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Multiple base values for variable ");
                    A10.append(A0v);
                    throw C21581AmV.A00(" in config file.", A10);
                }
            } else if (obj instanceof JSONObject) {
                A92 a92 = a6a.A04;
                C72453Mb.A1R(A0v);
                if (a92.A03.containsKey(A0v)) {
                    r1 = new C198059xi((List) A00(a6a, hashMap, (JSONObject) obj), A0v);
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Undeclared feature ");
                    A102.append(A0v);
                    throw C21581AmV.A00(" used as condition in base_values.", A102);
                }
            } else {
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("Variable ");
                A103.append(A0v);
                throw C21581AmV.A00(" used in base_values has unexpected type.", A103);
            }
            vector.add(r1);
        }
        return vector;
    }

    public static final Vector A01(A6A a6a, JSONObject jSONObject, boolean z) {
        C198059xi r1;
        Vector vector = new Vector();
        Iterator A0s = AnonymousClass8BS.A0s(jSONObject);
        while (A0s.hasNext()) {
            String A0v = C17880vN.A0v(A0s);
            if (!z || !C18070vi.A18(A0v, "base_values")) {
                Object obj = jSONObject.get(A0v);
                if ((obj instanceof String) || (obj instanceof Double) || (obj instanceof Integer)) {
                    HashMap hashMap = a6a.A05;
                    if (hashMap.containsKey(A0v)) {
                        C18070vi.A0b(A0v);
                        r1 = new C198059xi(AnonymousClass000.A0M(C200510q.A01(A0v, hashMap)), obj.toString());
                    }
                } else if (obj instanceof JSONObject) {
                    A92 a92 = a6a.A04;
                    boolean A1W = AnonymousClass8BU.A1W(A0v);
                    if (a92.A03.containsKey(A0v)) {
                        r1 = new C198059xi((List) A01(a6a, (JSONObject) obj, A1W), A0v);
                    } else if (z) {
                        vector.addAll(A01(a6a, (JSONObject) obj, A1W));
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Undeclared feature ");
                        A10.append(A0v);
                        throw C21581AmV.A00(" used as condition in biz_multiply_values.", A10);
                    }
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Variable ");
                    A102.append(A0v);
                    throw C21581AmV.A00(" used in biz_multiply_values has unexpected type.", A102);
                }
                vector.add(r1);
            }
        }
        return vector;
    }

    private final void A02(C198059xi r7, ArrayList arrayList, AnonymousClass1OS r9) {
        List<C198059xi> list = r7.A02;
        if (list == null) {
            String str = r7.A01;
            Integer num = r7.A00;
            if (num != null) {
                Double d = null;
                try {
                    if (C182189Tk.A00.A03(str)) {
                        d = Double.valueOf(Double.parseDouble(str));
                        if (d != null) {
                            int intValue = num.intValue();
                            arrayList.set(intValue, r9.invoke(AnonymousClass8BS.A0Z(arrayList, intValue), d));
                            return;
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                int intValue2 = num.intValue();
                arrayList.set(intValue2, r9.invoke(AnonymousClass8BS.A0Z(arrayList, intValue2), Double.valueOf(this.A04.A0B(str))));
                return;
            }
            throw new C21581AmV("ValueModelConfigParser error! Rule tree leaf node has null index!");
        } else if (this.A04.A0B(r7.A01) != 0.0d) {
            for (C198059xi A022 : list) {
                A02(A022, arrayList, r9);
            }
        }
    }

    public final double A03(ArrayList arrayList) {
        String str;
        A92 a92 = this.A04;
        int size = a92.A07.size();
        ArrayList A0z = C17880vN.A0z(size);
        for (int i = 0; i < size; i++) {
            A0z.add(AnonymousClass8BV.A0Q());
        }
        a92.A01 = C17880vN.A10(A0z);
        int size2 = a92.A06.size();
        ArrayList A0z2 = C17880vN.A0z(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            A0z2.add(false);
        }
        a92.A00 = C17880vN.A10(A0z2);
        int size3 = arrayList.size();
        Vector vector = a92.A09;
        if (size3 == vector.size()) {
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                AnonymousClass1D6 r1 = (AnonymousClass1D6) it.next();
                int A09 = C108955ca.A09(r1);
                int A042 = AnonymousClass3MZ.A04(r1);
                ArrayList arrayList2 = a92.A01;
                if (arrayList2 == null) {
                    C18070vi.A11("outputValues");
                    throw null;
                }
                arrayList2.set(A042, arrayList.get(A09));
            }
            int size4 = this.A05.size();
            ArrayList A0z3 = C17880vN.A0z(size4);
            for (int i3 = 0; i3 < size4; i3++) {
                A0z3.add(AnonymousClass8BV.A0Q());
            }
            ArrayList A10 = C17880vN.A10(A0z3);
            Vector vector2 = this.A00;
            if (vector2 == null) {
                str = "baseValuesRuleTrees";
            } else {
                Iterator it2 = vector2.iterator();
                while (it2.hasNext()) {
                    C198059xi r12 = (C198059xi) it2.next();
                    C18070vi.A0b(r12);
                    A02(r12, A10, C22330B3h.A00);
                }
                Vector vector3 = this.A01;
                if (vector3 == null) {
                    str = "multiplierRuleTrees";
                } else {
                    Iterator it3 = vector3.iterator();
                    while (it3.hasNext()) {
                        C198059xi r13 = (C198059xi) it3.next();
                        C18070vi.A0b(r13);
                        A02(r13, A10, C22331B3i.A00);
                    }
                    Iterator it4 = A10.iterator();
                    double d = 0.0d;
                    while (it4.hasNext()) {
                        d += AnonymousClass8BR.A00(it4.next());
                    }
                    return d;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        StringBuilder A102 = AnonymousClass000.A10();
        C17890vO.A14("input array has unexpected size. Expected: ", A102, vector);
        C17890vO.A14(". Actual: ", A102, arrayList);
        throw new C21581AmV(A102.toString());
    }

    public A6A(String str) {
        this.A02 = C17880vN.A16(str);
    }
}
