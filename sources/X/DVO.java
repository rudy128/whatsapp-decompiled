package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class DVO<K, V> implements Map<K, V>, C41611wl {
    public final ArrayList A00 = AnonymousClass000.A13();
    public final HashMap A01 = C17880vN.A11();

    public void putAll(Map map) {
        C18070vi.A0d(map, 0);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            put(A16.getKey(), A16.getValue());
        }
    }

    public void clear() {
        this.A01.clear();
        this.A00.clear();
    }

    public boolean containsKey(Object obj) {
        return this.A01.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            if (C18070vi.A18(((DVJ) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public Object get(Object obj) {
        Number A1D = C108945cZ.A1D(obj, this.A01);
        if (A1D == null) {
            return null;
        }
        return ((DVJ) this.A00.get(A1D.intValue())).getValue();
    }

    public boolean isEmpty() {
        return this.A00.isEmpty();
    }

    public Object put(Object obj, Object obj2) {
        HashMap hashMap = this.A01;
        Number A1D = C108945cZ.A1D(obj, hashMap);
        if (A1D == null) {
            C17890vO.A0z(obj, hashMap, entrySet().size());
            this.A00.add(new DVJ(obj, obj2));
            return null;
        }
        ArrayList arrayList = this.A00;
        int intValue = A1D.intValue();
        Object value = ((DVJ) arrayList.get(intValue)).getValue();
        ((DVJ) arrayList.get(intValue)).setValue(obj2);
        return value;
    }

    public Object remove(Object obj) {
        HashMap hashMap = this.A01;
        Number number = (Number) hashMap.remove(obj);
        if (number == null) {
            return null;
        }
        ArrayList arrayList = this.A00;
        Object remove = arrayList.remove(number.intValue());
        C18070vi.A0X(remove);
        DVJ dvj = (DVJ) remove;
        while (number.intValue() < arrayList.size()) {
            int intValue = number.intValue();
            hashMap.put(((DVJ) AnonymousClass8BS.A0Z(arrayList, intValue)).getKey(), number);
            number = Integer.valueOf(intValue + 1);
        }
        return dvj.getValue();
    }

    public final /* bridge */ int size() {
        return this.A00.size();
    }

    public final /* bridge */ Set entrySet() {
        LinkedHashSet A14 = C17880vN.A14();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C18070vi.A0b(next);
            A14.add(next);
        }
        return A14;
    }

    public final /* bridge */ Set keySet() {
        LinkedHashSet A14 = C17880vN.A14();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            DVJ dvj = (DVJ) it.next();
            C18070vi.A0b(dvj);
            A14.add(dvj.getKey());
        }
        return A14;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("{");
        Iterator it = this.A00.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            AnonymousClass8BS.A1D(it.next(), A10);
            if (i < size()) {
                BE6.A1K(A10);
                BE6.A1J(A10);
            }
        }
        String A0y = AnonymousClass000.A0y("}", A10);
        C18070vi.A0X(A0y);
        return A0y;
    }

    public final /* bridge */ Collection values() {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            DVJ dvj = (DVJ) it.next();
            C18070vi.A0b(dvj);
            A13.add(dvj.getValue());
        }
        return A13;
    }
}
