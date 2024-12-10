package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Yb  reason: invalid class name and case insensitive filesystem */
public final class C06370Yb implements Iterable, C16520sO, C18450wR {
    public boolean A00;
    public boolean A01;
    public final Map A02 = new LinkedHashMap();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C06370Yb) {
                C06370Yb r5 = (C06370Yb) obj;
                if (!(C18070vi.A18(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C06370Yb A00() {
        C06370Yb r2 = new C06370Yb();
        r2.A01 = this.A01;
        r2.A00 = this.A00;
        r2.A02.putAll(this.A02);
        return r2;
    }

    public final Object A01(AnonymousClass0PS r3) {
        Object obj = this.A02.get(r3);
        if (obj != null) {
            return obj;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Key not present: ");
        A10.append(r3);
        throw AnonymousClass000.A0o(" - consider getOrElse or getOrNull", A10);
    }

    public final Object A02(AnonymousClass0PS r2, C18090vk r3) {
        Object obj = this.A02.get(r2);
        if (obj == null) {
            return r3.invoke();
        }
        return obj;
    }

    public final Object A03(AnonymousClass0PS r2, C18090vk r3) {
        Object obj = this.A02.get(r2);
        if (obj == null) {
            return r3.invoke();
        }
        return obj;
    }

    public final void A04(C06370Yb r8) {
        if (r8.A01) {
            this.A01 = true;
        }
        if (r8.A00) {
            this.A00 = true;
        }
        Iterator A15 = AnonymousClass000.A15(r8.A02);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Object value = A16.getValue();
            Map map = this.A02;
            if (!map.containsKey(key)) {
                map.put(key, value);
            } else if (value instanceof AnonymousClass0KP) {
                Object obj = map.get(key);
                C18070vi.A0z(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AnonymousClass0KP r1 = (AnonymousClass0KP) obj;
                String str = r1.A00;
                if (str == null) {
                    str = ((AnonymousClass0KP) value).A00;
                }
                C18080vj A002 = r1.A00();
                if (A002 == null) {
                    A002 = ((AnonymousClass0KP) value).A00();
                }
                map.put(key, new AnonymousClass0KP(str, A002));
            }
        }
    }

    public final void A05(C06370Yb r7) {
        Iterator A15 = AnonymousClass000.A15(r7.A02);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            AnonymousClass0PS r4 = (AnonymousClass0PS) A16.getKey();
            Object value = A16.getValue();
            Map map = this.A02;
            Object obj = map.get(r4);
            C18070vi.A0z(r4, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object A002 = r4.A00(obj, value);
            if (A002 != null) {
                map.put(r4, A002);
            }
        }
    }

    public final boolean A08() {
        Set<AnonymousClass0PS> keySet = this.A02.keySet();
        if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
            for (AnonymousClass0PS r0 : keySet) {
                if (r0.A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0B(AnonymousClass0PS r2) {
        return this.A02.containsKey(r2);
    }

    public void CHj(AnonymousClass0PS r6, Object obj) {
        if (obj instanceof AnonymousClass0KP) {
            Map map = this.A02;
            if (map.containsKey(r6)) {
                Object obj2 = map.get(r6);
                C18070vi.A0z(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                AnonymousClass0KP r3 = (AnonymousClass0KP) obj2;
                AnonymousClass0KP r7 = (AnonymousClass0KP) obj;
                String str = r7.A00;
                if (str == null) {
                    str = r3.A00;
                }
                C18080vj A002 = r7.A00();
                if (A002 == null) {
                    A002 = r3.A00();
                }
                map.put(r6, new AnonymousClass0KP(str, A002));
                return;
            }
        }
        this.A02.put(r6, obj);
    }

    public int hashCode() {
        int A002 = AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A02), this.A01);
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return A002 + i;
    }

    public Iterator iterator() {
        return AnonymousClass000.A15(this.A02);
    }

    public final boolean A09() {
        return this.A00;
    }

    public final boolean A0A() {
        return this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        String str = "";
        if (this.A01) {
            A10.append(str);
            A10.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.A00) {
            A10.append(str);
            A10.append("isClearingSemantics=true");
            str = ", ";
        }
        Iterator A15 = AnonymousClass000.A15(this.A02);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object value = A16.getValue();
            A10.append(str);
            A10.append(((AnonymousClass0PS) A16.getKey()).A01);
            A10.append(" : ");
            A10.append(value);
            str = ", ";
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append(AnonymousClass0FH.A00(this));
        A102.append("{ ");
        A102.append(A10);
        return AnonymousClass000.A0y(" }", A102);
    }

    public final void A06(boolean z) {
        this.A00 = z;
    }

    public final void A07(boolean z) {
        this.A01 = z;
    }
}
