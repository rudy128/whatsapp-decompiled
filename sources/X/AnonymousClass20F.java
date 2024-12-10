package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.20F  reason: invalid class name */
public final class AnonymousClass20F implements AnonymousClass20D, AnonymousClass20E {
    public static final HashMap A01;
    public static final Map A02;
    public static final Map A03;
    public static final HashMap A04;
    public static final HashMap A05;
    public final Class A00;

    static {
        int i = 0;
        Class<AnonymousClass04D> cls = AnonymousClass04D.class;
        List asList = Arrays.asList(new Class[]{C18090vk.class, C22821Di.class, AnonymousClass1OS.class, C36001nB.class, AnonymousClass20G.class, AnonymousClass20H.class, AnonymousClass20I.class, AnonymousClass20J.class, AnonymousClass20K.class, AnonymousClass20L.class, cls, cls, AnonymousClass20M.class, cls, cls, cls, cls, cls, cls, cls, cls, cls, AnonymousClass20N.class});
        C18070vi.A0X(asList);
        ArrayList arrayList = new ArrayList(C29351c6.A0C(asList, 10));
        for (Object next : asList) {
            int i2 = i + 1;
            if (i < 0) {
                AnonymousClass1ZU.A0B();
                throw null;
            } else {
                arrayList.add(new AnonymousClass1D6(next, Integer.valueOf(i)));
                i = i2;
            }
        }
        A02 = AnonymousClass1D7.A0D(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        A04 = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        A05 = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("X.CDZ", "kotlin.String.Companion");
        hashMap3.put("X.CDY", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C18070vi.A0X(values);
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C18070vi.A0b(str);
            sb.append(AnonymousClass1YF.A0M(str, str, '.'));
            sb.append("CompanionObject");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            hashMap3.put(obj, sb2.toString());
        }
        for (Map.Entry entry : A02.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("X.0vj");
            sb3.append(intValue);
            hashMap3.put(name, sb3.toString());
        }
        A01 = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200610r.A03(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, AnonymousClass1YF.A0M(str2, str2, '.'));
        }
        A03 = linkedHashMap;
    }

    public AnonymousClass20F(Class cls) {
        C18070vi.A0d(cls, 1);
        this.A00 = cls;
    }

    public String BZJ() {
        return C60662oP.A01(this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass20F) || !C18070vi.A18(AnonymousClass20W.A01(this), AnonymousClass20W.A01((AnonymousClass20E) obj))) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    public Class BTa() {
        return this.A00;
    }

    public List getAnnotations() {
        throw AnonymousClass04E.createAndThrow();
    }

    public int hashCode() {
        return AnonymousClass20W.A01(this).hashCode();
    }
}
