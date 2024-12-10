package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1wt  reason: invalid class name and case insensitive filesystem */
public class C41681wt {
    public static Collection A00(Object obj) {
        if (!(obj instanceof C18450wR) || (obj instanceof C23161Ex)) {
            try {
                return (Collection) obj;
            } catch (ClassCastException e) {
                C18070vi.A12(C41681wt.class.getName(), e);
                throw e;
            }
        } else {
            A05(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    public static List A01(Object obj) {
        if (!(obj instanceof C18450wR) || (obj instanceof AnonymousClass1JB)) {
            try {
                return (List) obj;
            } catch (ClassCastException e) {
                C18070vi.A12(C41681wt.class.getName(), e);
                throw e;
            }
        } else {
            A05(obj, "kotlin.collections.MutableList");
            throw null;
        }
    }

    public static Map.Entry A02(Object obj) {
        if (!(obj instanceof C18450wR) || (obj instanceof AnonymousClass3MS)) {
            try {
                return (Map.Entry) obj;
            } catch (ClassCastException e) {
                C18070vi.A12(C41681wt.class.getName(), e);
                throw e;
            }
        } else {
            A05(obj, "kotlin.collections.MutableMap.MutableEntry");
            throw null;
        }
    }

    public static Map A03(Object obj) {
        if (!(obj instanceof C18450wR) || (obj instanceof C41611wl)) {
            try {
                return (Map) obj;
            } catch (ClassCastException e) {
                C18070vi.A12(C41681wt.class.getName(), e);
                throw e;
            }
        } else {
            A05(obj, "kotlin.collections.MutableMap");
            throw null;
        }
    }

    public static void A04(Object obj, int i) {
        if (obj != null && !A09(obj, i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.functions.Function");
            sb.append(i);
            A05(obj, sb.toString());
            throw null;
        }
    }

    public static void A05(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        ClassCastException classCastException = new ClassCastException(sb.toString());
        C18070vi.A12(C41681wt.class.getName(), classCastException);
        throw classCastException;
    }

    public static boolean A06(Object obj) {
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof C18450wR) || (obj instanceof AnonymousClass1JB)) {
            return true;
        }
        return false;
    }

    public static boolean A07(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        if (!(obj instanceof C18450wR) || (obj instanceof AnonymousClass3MS)) {
            return true;
        }
        return false;
    }

    public static boolean A08(Object obj) {
        if (!(obj instanceof Set)) {
            return false;
        }
        if (!(obj instanceof C18450wR) || (obj instanceof C23171Ey)) {
            return true;
        }
        return false;
    }

    public static boolean A09(Object obj, int i) {
        int i2;
        if (obj instanceof C18080vj) {
            if (obj instanceof AnonymousClass11F) {
                i2 = ((AnonymousClass11F) obj).getArity();
            } else if (obj instanceof C18090vk) {
                i2 = 0;
            } else if (obj instanceof C22821Di) {
                i2 = 1;
            } else if (obj instanceof AnonymousClass1OS) {
                i2 = 2;
            } else if (obj instanceof C36001nB) {
                i2 = 3;
            } else if (obj instanceof AnonymousClass20G) {
                i2 = 4;
            } else if (obj instanceof AnonymousClass20H) {
                i2 = 5;
            } else if (obj instanceof AnonymousClass20I) {
                i2 = 6;
            } else if (obj instanceof AnonymousClass20J) {
                i2 = 7;
            } else if (obj instanceof AnonymousClass20K) {
                i2 = 8;
            } else if (obj instanceof AnonymousClass20L) {
                i2 = 9;
            } else {
                boolean z = obj instanceof AnonymousClass04D;
                i2 = -1;
                if (z) {
                    i2 = 10;
                }
            }
            if (i2 != i) {
                return false;
            }
            return true;
        }
        return false;
    }
}
