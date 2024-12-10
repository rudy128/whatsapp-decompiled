package X;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Qualified$Unqualified;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0wM  reason: invalid class name and case insensitive filesystem */
public class C18410wM implements C18400wL {
    public static final C18290w6 A08 = new C65612wp(0);
    public Set A00 = new HashSet();
    public final C18370wI A01;
    public final List A02;
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final AtomicReference A06 = new AtomicReference();
    public final C18440wP A07;

    public synchronized C18290w6 BXi(C18350wG r2) {
        return (C18290w6) this.A04.get(r2);
    }

    public /* synthetic */ Set CJd(C18350wG r3) {
        C18290w6 r0;
        synchronized (this) {
            r0 = (C18710x2) this.A05.get(r3);
            if (r0 == null) {
                r0 = A08;
            }
        }
        return (Set) r0.get();
    }

    /* JADX WARNING: type inference failed for: r0v42, types: [X.0x3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [X.0x2, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v16, types: [X.0x2, java.lang.Object] */
    public C18410wM(C18370wI r17, Iterable iterable, Collection collection, Executor executor) {
        Map map;
        C18440wP r7 = new C18440wP(executor);
        this.A07 = r7;
        this.A01 = r17;
        ArrayList arrayList = new ArrayList();
        Class cls = C18440wP.class;
        arrayList.add(C18330wD.A00(cls, r7, cls, C18430wO.class));
        arrayList.add(C18330wD.A00(C18410wM.class, this, new Class[0]));
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object add : iterable) {
            arrayList2.add(add);
        }
        this.A02 = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((C18290w6) it.next()).get();
                    if (componentRegistrar != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (C18330wD r8 : componentRegistrar.getComponents()) {
                            String str = r8.A03;
                            if (str != null) {
                                r8 = new C18330wD(new C65532we(1, str, r8), str, r8.A05, r8.A04, r8.A06, r8.A00, r8.A01);
                            }
                            arrayList4.add(r8);
                        }
                        arrayList.addAll(arrayList4);
                        it.remove();
                    }
                } catch (C18420wN e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C18330wD) it2.next()).A05.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Object obj = array[i];
                    if (obj.toString().contains("X.0wl")) {
                        Set set = this.A00;
                        if (set.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        set.add(obj.toString());
                    }
                    i++;
                }
            }
            map = this.A03;
            if (map.isEmpty()) {
                A01(arrayList);
            } else {
                ArrayList arrayList5 = new ArrayList(map.keySet());
                arrayList5.addAll(arrayList);
                A01(arrayList5);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C18330wD r6 = (C18330wD) it3.next();
                map.put(r6, new C18320wC(new C65632wr(r6, this, 1)));
            }
            ArrayList arrayList6 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C18330wD r1 = (C18330wD) it4.next();
                if (r1.A01 == 0) {
                    C18290w6 r82 = (C18290w6) map.get(r1);
                    for (Object next2 : r1.A05) {
                        Map map2 = this.A04;
                        if (!map2.containsKey(next2)) {
                            map2.put(next2, r82);
                        } else {
                            arrayList6.add(new C70713Cf((C18720x3) ((C18290w6) map2.get(next2)), r82, 8));
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            ArrayList arrayList7 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                C18330wD r12 = (C18330wD) entry.getKey();
                if (r12.A01 != 0) {
                    Object value = entry.getValue();
                    for (Object next3 : r12.A05) {
                        if (!hashMap.containsKey(next3)) {
                            hashMap.put(next3, new HashSet());
                        }
                        ((Set) hashMap.get(next3)).add(value);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                Map map3 = this.A05;
                boolean containsKey = map3.containsKey(entry2.getKey());
                Object key = entry2.getKey();
                if (!containsKey) {
                    ? obj2 = new Object();
                    obj2.A00 = null;
                    obj2.A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj2.A01.addAll((Collection) entry2.getValue());
                    map3.put(key, obj2);
                } else {
                    C18710x2 r83 = (C18710x2) map3.get(key);
                    for (C18290w6 r3 : (Set) entry2.getValue()) {
                        arrayList7.add(new C70713Cf(r83, r3, 9));
                    }
                }
            }
            arrayList3.addAll(arrayList7);
            for (C18330wD r9 : map.keySet()) {
                Iterator it5 = r9.A04.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        C18490wW r32 = (C18490wW) it5.next();
                        int i2 = r32.A01;
                        boolean z = false;
                        if (i2 == 2) {
                            z = true;
                            Map map4 = this.A05;
                            C18350wG r62 = r32.A02;
                            if (!map4.containsKey(r62)) {
                                Set emptySet = Collections.emptySet();
                                ? obj3 = new Object();
                                obj3.A00 = null;
                                obj3.A01 = Collections.newSetFromMap(new ConcurrentHashMap());
                                obj3.A01.addAll(emptySet);
                                map4.put(r62, obj3);
                            }
                        }
                        Map map5 = this.A04;
                        Object obj4 = r32.A02;
                        if (map5.containsKey(obj4)) {
                            continue;
                        } else if (i2 == 1) {
                            throw new AnonymousClass2AO(String.format("Unsatisfied dependency for component %s: %s", new Object[]{r9, obj4}));
                        } else if (!z) {
                            C18730x4 r33 = C18720x3.A02;
                            C18290w6 r13 = C18720x3.A03;
                            ? obj5 = new Object();
                            obj5.A00 = r33;
                            obj5.A01 = r13;
                            map5.put(obj4, obj5);
                        }
                    }
                }
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.A06.get();
        if (bool != null) {
            A00(this, map, bool.booleanValue());
        }
    }

    public /* synthetic */ Object BMD(Class cls) {
        return BMC(new C18350wG(Qualified$Unqualified.class, cls));
    }

    public /* synthetic */ C18290w6 BXj(Class cls) {
        return BXi(new C18350wG(Qualified$Unqualified.class, cls));
    }

    public static void A00(C18410wM r4, Map map, boolean z) {
        Queue queue;
        for (Map.Entry entry : map.entrySet()) {
            C18290w6 r2 = (C18290w6) entry.getValue();
            int i = ((C18330wD) entry.getKey()).A00;
            if (i == 1 || (i == 2 && z)) {
                r2.get();
            }
        }
        C18440wP r22 = r4.A07;
        synchronized (r22) {
            queue = r22.A00;
            if (queue != null) {
                r22.A00 = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException();
            }
        }
    }

    public static void A01(List list) {
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C18330wD r8 = (C18330wD) it.next();
            C18690x0 r7 = new C18690x0(r8);
            Iterator it2 = r8.A05.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C18350wG r5 = (C18350wG) it2.next();
                    boolean z = false;
                    if (r8.A01 == 0) {
                        z = true;
                    }
                    C18700x1 r2 = new C18700x1(r5, !z);
                    if (!hashMap.containsKey(r2)) {
                        hashMap.put(r2, new HashSet());
                    }
                    Set set = (Set) hashMap.get(r2);
                    if (set.isEmpty() || r2.A00) {
                        set.add(r7);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{r5}));
                    }
                }
            }
        }
        for (Set<C18690x0> it3 : hashMap.values()) {
            for (C18690x0 r52 : it3) {
                for (C18490wW r1 : r52.A00.A04) {
                    if (r1.A00 == 0) {
                        C18350wG r3 = r1.A02;
                        int i = r1.A01;
                        boolean z2 = false;
                        if (i == 2) {
                            z2 = true;
                        }
                        Set<C18690x0> set2 = (Set) hashMap.get(new C18700x1(r3, z2));
                        if (set2 != null) {
                            for (C18690x0 r12 : set2) {
                                r52.A01.add(r12);
                                r12.A02.add(r52);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Collection addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        HashSet hashSet2 = new HashSet();
        Iterator it4 = hashSet.iterator();
        while (it4.hasNext()) {
            C18690x0 r13 = (C18690x0) it4.next();
            if (r13.A02.isEmpty()) {
                hashSet2.add(r13);
            }
        }
        int i2 = 0;
        while (!hashSet2.isEmpty()) {
            C18690x0 r32 = (C18690x0) hashSet2.iterator().next();
            hashSet2.remove(r32);
            i2++;
            for (C18690x0 r14 : r32.A01) {
                Set set3 = r14.A02;
                set3.remove(r32);
                if (set3.isEmpty()) {
                    hashSet2.add(r14);
                }
            }
        }
        if (i2 != list.size()) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = hashSet.iterator();
            while (it5.hasNext()) {
                C18690x0 r15 = (C18690x0) it5.next();
                if (!r15.A02.isEmpty() && !r15.A01.isEmpty()) {
                    arrayList.add(r15.A00);
                }
            }
            throw new AnonymousClass2AP(arrayList);
        }
    }

    public /* synthetic */ Object BMC(C18350wG r2) {
        C18290w6 BXi = BXi(r2);
        if (BXi == null) {
            return null;
        }
        return BXi.get();
    }
}
