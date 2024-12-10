package X;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: X.DbT  reason: case insensitive filesystem */
public class C27298DbT<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public List A00 = Collections.emptyList();
    public Map A01 = Collections.emptyMap();
    public boolean A02;
    public Map A03 = Collections.emptyMap();
    public final int A04;
    public volatile C27307Dbe A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C27298DbT)) {
                return super.equals(obj);
            }
            C27298DbT dbT = (C27298DbT) obj;
            int size = size();
            if (size == dbT.size()) {
                int size2 = this.A00.size();
                if (size2 != dbT.A00.size()) {
                    return entrySet().equals(dbT.entrySet());
                }
                int i = 0;
                while (i < size2) {
                    if (((Map.Entry) this.A00.get(i)).equals(dbT.A00.get(i))) {
                        i++;
                    }
                }
                if (size2 != size) {
                    return this.A01.equals(dbT.A01);
                }
            }
            return false;
        }
        return true;
    }

    private int A00(Comparable comparable) {
        int i;
        int A012 = AnonymousClass3MX.A01(this.A00);
        if (A012 >= 0) {
            int compareTo = comparable.compareTo(((DVH) this.A00.get(A012)).A01);
            if (compareTo > 0) {
                i = A012 + 2;
                return -i;
            } else if (compareTo == 0) {
                return A012;
            }
        }
        int i2 = 0;
        while (true) {
            i = i2 + 1;
            if (i2 > A012) {
                break;
            }
            int i3 = (i2 + A012) / 2;
            int compareTo2 = comparable.compareTo(((DVH) this.A00.get(i3)).A01);
            if (compareTo2 < 0) {
                A012 = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -i;
    }

    public static void A03(C27298DbT dbT) {
        if (dbT.A02) {
            throw C17880vN.A0y();
        }
    }

    public void A05() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.A02) {
            if (this.A01.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.A01);
            }
            this.A01 = unmodifiableMap;
            if (this.A03.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.A03);
            }
            this.A03 = unmodifiableMap2;
            this.A02 = true;
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (A00(comparable) >= 0 || this.A01.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set entrySet() {
        if (this.A05 == null) {
            this.A05 = new C27307Dbe(this);
        }
        return this.A05;
    }

    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((DVH) this.A00.get(A002)).getValue();
        }
        return this.A01.get(comparable);
    }

    public int hashCode() {
        int size = this.A00.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i = AnonymousClass000.A0O(this.A00.get(i2), i);
        }
        if (this.A01.size() > 0) {
            return i + this.A01.hashCode();
        }
        return i;
    }

    public int size() {
        return this.A00.size() + this.A01.size();
    }

    public C27298DbT(int i) {
        this.A04 = i;
    }

    public static Object A01(C27298DbT dbT, int i) {
        A03(dbT);
        Object value = ((DVH) dbT.A00.remove(i)).getValue();
        if (!dbT.A01.isEmpty()) {
            Iterator it = dbT.A02().entrySet().iterator();
            List list = dbT.A00;
            Map.Entry A16 = AnonymousClass000.A16(it);
            list.add(new DVH(dbT, (Comparable) A16.getKey(), A16.getValue()));
            it.remove();
        }
        return value;
    }

    private SortedMap A02() {
        A03(this);
        if (this.A01.isEmpty() && !(this.A01 instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.A01 = treeMap;
            this.A03 = treeMap.descendingMap();
        }
        return (SortedMap) this.A01;
    }

    /* renamed from: A04 */
    public Object put(Comparable comparable, Object obj) {
        A03(this);
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return ((DVH) this.A00.get(A002)).setValue(obj);
        }
        A03(this);
        if (this.A00.isEmpty() && !(this.A00 instanceof ArrayList)) {
            this.A00 = C17880vN.A0z(this.A04);
        }
        int i = -(A002 + 1);
        int i2 = this.A04;
        if (i >= i2) {
            return A02().put(comparable, obj);
        }
        if (this.A00.size() == i2) {
            DVH dvh = (DVH) this.A00.remove(i2 - 1);
            A02().put(dvh.A01, dvh.getValue());
        }
        this.A00.add(i, new DVH(this, comparable, obj));
        return null;
    }

    public void clear() {
        A03(this);
        if (!this.A00.isEmpty()) {
            this.A00.clear();
        }
        if (!this.A01.isEmpty()) {
            this.A01.clear();
        }
    }

    public Object remove(Object obj) {
        A03(this);
        Comparable comparable = (Comparable) obj;
        int A002 = A00(comparable);
        if (A002 >= 0) {
            return A01(this, A002);
        }
        if (this.A01.isEmpty()) {
            return null;
        }
        return this.A01.remove(comparable);
    }
}
