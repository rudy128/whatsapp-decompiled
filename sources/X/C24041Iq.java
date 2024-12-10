package X;

import android.content.SharedPreferences;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Iq  reason: invalid class name and case insensitive filesystem */
public final class C24041Iq implements SharedPreferences.Editor {
    public boolean A00 = false;
    public final Object A01 = new Object();
    public final Map A02 = new HashMap();
    public final /* synthetic */ C199910k A03;

    public C24041Iq(C199910k r2) {
        this.A03 = r2;
    }

    private AnonymousClass1J3 A00() {
        Map map;
        ArrayList arrayList;
        long j;
        Object obj;
        boolean z;
        Set entrySet;
        C199910k r8 = this.A03;
        synchronized (r8.A0C) {
            if (r8.A00 > 0) {
                r8.A04 = new HashMap(r8.A04);
            }
            map = r8.A04;
            r8.A00++;
            if (r8.A07 != null) {
                Set set = C200010l.A04;
                String str = r8.A0F;
                if (!set.contains(str) && !C200010l.A05.contains(str)) {
                    AnonymousClass10Z r2 = r8.A0A;
                    if (r2.A01 && r8.A00 >= r2.A00) {
                        Map map2 = this.A02;
                        if (map2.size() > 5) {
                            entrySet = map2.keySet();
                        } else {
                            entrySet = map2.entrySet();
                        }
                        String obj2 = entrySet.toString();
                        C22781De.A03();
                        C18070vi.A0d(str, 0);
                        C18070vi.A0d(obj2, 2);
                    }
                }
            }
            boolean z2 = !r8.A0G.isEmpty();
            if (z2) {
                arrayList = new ArrayList();
            } else {
                arrayList = null;
            }
            synchronized (this.A01) {
                boolean z3 = false;
                if (this.A00) {
                    if (!map.isEmpty()) {
                        map.clear();
                        z = true;
                    } else {
                        z = false;
                    }
                    this.A00 = false;
                    z3 = z;
                }
                Map map3 = this.A02;
                for (Map.Entry entry : map3.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == this || value == null) {
                        if (map.containsKey(str2)) {
                            map.remove(str2);
                        }
                    } else if (!map.containsKey(str2) || (obj = map.get(str2)) == null || !obj.equals(value)) {
                        map.put(str2, value);
                    }
                    if (z2) {
                        arrayList.add(str2);
                    }
                    z3 = true;
                }
                map3.clear();
                if (z3) {
                    r8.A01 = 1 + r8.A01;
                }
                j = r8.A01;
            }
        }
        return new AnonymousClass1J3(arrayList, map, j);
    }

    private void A01(C199810j r7, String str, String str2, Set set) {
        int i;
        C199910k r1 = this.A03;
        if (r1.A07 != null && r1.A0A.A02) {
            Set set2 = C200010l.A04;
            String str3 = r1.A0F;
            if (!set2.contains(str3) && !C200010l.A05.contains(str3)) {
                if (str2 != null) {
                    i = str2.length();
                } else {
                    i = 0;
                }
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        i += ((String) it.next()).length();
                    }
                }
                if (((long) i) >= 200) {
                    C22781De.A03();
                    C18070vi.A0d(str3, 0);
                    C18070vi.A0d(str, 1);
                    C18070vi.A0d(r7, 3);
                }
            }
        }
    }

    private void A02(AnonymousClass1J3 r8) {
        List list = r8.A01;
        if (list != null && list.size() != 0) {
            C199910k r5 = this.A03;
            synchronized (r5.A0C) {
                Map map = r5.A0G;
                if (!map.isEmpty()) {
                    int size = list.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        String str = (String) list.get(size);
                        Map map2 = (Map) map.get(str);
                        if (map2 != null) {
                            A03(str, map2);
                        }
                        Map map3 = (Map) map.get(r5.A0E);
                        if (map3 != null) {
                            A03(str, map3);
                        }
                    }
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        synchronized (this.A01) {
            this.A00 = true;
        }
        return this;
    }

    public boolean commit() {
        boolean z;
        C199910k r8 = this.A03;
        AnonymousClass10X r7 = r8.A09;
        if (r7.A04) {
            return false;
        }
        AnonymousClass1J3 A002 = A00();
        AnonymousClass1J5 r3 = new AnonymousClass1J5(A002, r8, true);
        synchronized (r8.A0C) {
            z = false;
            if (r8.A00 == 1) {
                z = true;
            }
        }
        if (z) {
            r3.run();
        } else {
            r7.A00(r3, r8.A06, false);
        }
        ((C200010l) r8.A0B.get()).A00(r8.A0F, "edit");
        try {
            A002.A03.await();
            A02(A002);
            return A002.A04;
        } catch (InterruptedException e) {
            Log.e("LightSharedPreferencesImpl/Commit: Got exception:", e);
            return false;
        }
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.A01) {
            this.A02.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.A01) {
            this.A02.put(str, Float.valueOf(f));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.A01) {
            this.A02.put(str, Integer.valueOf(i));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.A01) {
            this.A02.put(str, Long.valueOf(j));
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.A01) {
            this.A02.put(str, str2);
            A01(this.A03.A08, str, str2, (Set) null);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        HashSet hashSet;
        synchronized (this.A01) {
            Map map = this.A02;
            if (set == null) {
                hashSet = null;
            } else {
                hashSet = new HashSet(set);
            }
            map.put(str, hashSet);
            A01(this.A03.A08, str, (String) null, set);
        }
        return this;
    }

    public /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        synchronized (this.A01) {
            this.A02.put(str, this);
        }
        return this;
    }

    private void A03(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Handler) entry.getValue()).post(new C146887Qz(this, entry.getKey(), str, 9));
        }
    }

    public void apply() {
        AnonymousClass1J3 A002 = A00();
        C199910k r4 = this.A03;
        r4.A09.A00(new AnonymousClass1J5(A002, r4, false), r4.A06, true);
        ((C200010l) r4.A0B.get()).A00(r4.A0F, "edit");
        A02(A002);
    }
}
