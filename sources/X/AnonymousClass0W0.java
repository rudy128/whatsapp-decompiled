package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0W0  reason: invalid class name */
public final class AnonymousClass0W0 implements AnonymousClass0tC {
    public final Map A00;
    public final Map A01;
    public final C22821Di A02;

    public boolean BE7(Object obj) {
        return AnonymousClass000.A1Y(this.A02.invoke(obj));
    }

    public Object BFi(String str) {
        Map map = this.A01;
        List list = (List) map.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            map.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }

    public Map CBf() {
        LinkedHashMap A08 = AnonymousClass1D7.A08(this.A01);
        Iterator A15 = AnonymousClass000.A15(this.A00);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            List list = (List) A16.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((C18090vk) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (BE7(invoke)) {
                    A08.put(key, AnonymousClass1ZU.A05(invoke));
                } else {
                    throw AnonymousClass000.A0n("item can't be saved");
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Object invoke2 = ((C18090vk) list.get(i)).invoke();
                    if (invoke2 == null || BE7(invoke2)) {
                        arrayList.add(invoke2);
                        i++;
                    } else {
                        throw AnonymousClass000.A0n("item can't be saved");
                    }
                }
                A08.put(key, arrayList);
            }
        }
        return A08;
    }

    public AnonymousClass0W0(Map map, C22821Di r3) {
        LinkedHashMap linkedHashMap;
        this.A02 = r3;
        if (map != null) {
            linkedHashMap = AnonymousClass1D7.A08(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        this.A01 = linkedHashMap;
        this.A00 = new LinkedHashMap();
    }

    public C16310s3 CE3(String str, C18090vk r4) {
        if (!AnonymousClass1YF.A0T(str)) {
            Map map = this.A00;
            Object obj = map.get(str);
            if (obj == null) {
                obj = AnonymousClass000.A13();
                map.put(str, obj);
            }
            ((List) obj).add(r4);
            return new C05860Vz(this, str, r4);
        }
        throw AnonymousClass000.A0k("Registered key is empty or blank");
    }
}
