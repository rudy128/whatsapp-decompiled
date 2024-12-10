package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.CoV  reason: case insensitive filesystem */
public abstract class C25911CoV {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(C28668EDk eDk, StringBuilder sb, int i) {
        int i2;
        StringBuilder sb2;
        int i3;
        int ordinal;
        Object obj;
        boolean equals;
        Method method;
        String substring;
        C28668EDk eDk2 = eDk;
        HashSet A12 = C17880vN.A12();
        HashMap A11 = C17880vN.A11();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = eDk2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method2 = declaredMethods[i4];
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    A12.add(method2.getName());
                } else if (BE7.A1Y(method2) && method2.getParameterTypes().length == 0) {
                    BEB.A1P(method2, A11, treeMap);
                }
            }
            i4++;
        }
        Iterator A0i = C17890vO.A0i(treeMap);
        while (true) {
            sb2 = sb;
            i3 = i;
            if (!A0i.hasNext()) {
                break;
            }
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            String substring2 = C17880vN.A0x(A16).substring(i2);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method = (Method) A16.getValue()) != null && method.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) A16.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !BE7.A1Y(method)) {
                if (A12.contains(C17900vP.A0A("set", substring2))) {
                    if (substring2.endsWith("Bytes")) {
                        if (treeMap.containsKey(AnonymousClass000.A0y(substring2.substring(0, substring2.length() - 5), AnonymousClass000.A11("get")))) {
                        }
                    }
                    Method method3 = (Method) A16.getValue();
                    Method method4 = (Method) A11.get(C17900vP.A0A("has", substring2));
                    if (method3 != null) {
                        Object A0C = C23577Bm6.A0C(method3, eDk2, new Object[0]);
                        if (method4 == null) {
                            if (A0C instanceof Boolean) {
                                equals = !AnonymousClass000.A1Y(A0C);
                            } else {
                                if (A0C instanceof Integer) {
                                    ordinal = AnonymousClass000.A0M(A0C);
                                } else if (A0C instanceof Float) {
                                    ordinal = Float.floatToRawIntBits(AnonymousClass000.A04(A0C));
                                } else if (A0C instanceof Double) {
                                    ordinal = (Double.doubleToRawLongBits(AnonymousClass8BR.A00(A0C)) > 0 ? 1 : (Double.doubleToRawLongBits(AnonymousClass8BR.A00(A0C)) == 0 ? 0 : -1));
                                } else {
                                    if (A0C instanceof String) {
                                        obj = "";
                                    } else if (A0C instanceof DSQ) {
                                        obj = DSQ.A00;
                                    } else if (A0C instanceof C28668EDk) {
                                        if (A0C == ((C23577Bm6) ((C22356B4k) A0C)).A0P(AnonymousClass00R.A0j, (Object) null)) {
                                        }
                                    } else if (A0C instanceof Enum) {
                                        ordinal = ((Enum) A0C).ordinal();
                                    }
                                    equals = A0C.equals(obj);
                                }
                                if (ordinal == 0) {
                                }
                            }
                            if (equals) {
                            }
                        } else if (!AnonymousClass000.A1Y(C23577Bm6.A0C(method4, eDk2, new Object[0]))) {
                        }
                        A01(sb2, i3, substring2, A0C);
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
            }
            A01(sb2, i3, substring, C23577Bm6.A0C(method, eDk2, new Object[0]));
            i2 = 3;
        }
        C26042Cr6 cr6 = ((C23577Bm6) eDk2).unknownFields;
        if (cr6 != null) {
            for (int i5 = 0; i5 < cr6.count; i5++) {
                A01(sb2, i3, String.valueOf(cr6.A02[i5] >>> 3), cr6.A03[i5]);
            }
        }
    }

    public static void A01(StringBuilder sb, int i, String str, Object obj) {
        String A002;
        if (obj instanceof List) {
            Iterator A13 = AnonymousClass8BR.A13(obj);
            while (A13.hasNext()) {
                A01(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A15 = AnonymousClass000.A15((Map) obj);
            while (A15.hasNext()) {
                A01(sb, i, str, A15.next());
            }
        } else {
            sb.append(10);
            int i2 = i;
            while (i2 > 0) {
                char[] cArr = A00;
                int i3 = 80;
                if (i2 <= 80) {
                    i3 = i2;
                }
                sb.append(cArr, 0, i3);
                i2 -= i3;
            }
            if (!str.isEmpty()) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(Character.toLowerCase(BE7.A00(str)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    A10.append(Character.toLowerCase(BEA.A00(str, A10, i4)));
                }
                str = A10.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                E67 e67 = DSQ.A01;
                A002 = C24612CBq.A00(new C23581BmB(((String) obj).getBytes(CIC.A04)));
            } else if (obj instanceof DSQ) {
                sb.append(": \"");
                A002 = C24612CBq.A00((DSQ) obj);
            } else {
                if (obj instanceof C23577Bm6) {
                    sb.append(" {");
                    A00((DNC) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i5 = i + 2;
                    A01(sb, i5, "key", entry.getKey());
                    A01(sb, i5, "value", entry.getValue());
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                while (i > 0) {
                    char[] cArr2 = A00;
                    int i6 = 80;
                    if (i <= 80) {
                        i6 = i;
                    }
                    sb.append(cArr2, 0, i6);
                    i -= i6;
                }
                sb.append("}");
                return;
            }
            sb.append(A002);
            sb.append('\"');
        }
    }
}
