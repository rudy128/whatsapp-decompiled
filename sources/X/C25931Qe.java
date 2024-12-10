package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Qe  reason: invalid class name and case insensitive filesystem */
public final class C25931Qe {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final C200710s A03;
    public final C200710s A04;
    public final AnonymousClass10I A05;
    public final Set A06 = new LinkedHashSet();
    public final ConcurrentHashMap A07 = new ConcurrentHashMap();

    public C25931Qe(AnonymousClass190 r4, AnonymousClass10I r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r7, 3);
        C18070vi.A0d(r4, 4);
        this.A00 = r6;
        this.A05 = r5;
        this.A01 = r7;
        this.A02 = r4;
        this.A03 = new C200710s(r5, false);
        this.A04 = new C200710s(r5, true);
    }

    public final C25341Nv A02(AnonymousClass25F r7) {
        Object obj;
        C18070vi.A0d(r7, 0);
        Class cls = r7.A01;
        try {
            ConcurrentHashMap concurrentHashMap = this.A07;
            Object obj2 = concurrentHashMap.get(cls);
            if (obj2 == null) {
                Object obj3 = this.A00.get();
                C18070vi.A0X(obj3);
                Iterator it = ((Iterable) obj3).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C29431cG.A18(((C25341Nv) obj).BZv(), cls)) {
                        break;
                    }
                }
                obj2 = (C25341Nv) obj;
                Object putIfAbsent = concurrentHashMap.putIfAbsent(cls, obj2);
                if (putIfAbsent != null) {
                    obj2 = putIfAbsent;
                }
            }
            return (C25341Nv) obj2;
        } catch (NullPointerException unused) {
            A01(r7);
            return null;
        }
    }

    public final void A05(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        for (AnonymousClass25F A002 : A04(r3, C25511Om.A00)) {
            A00(this, A002);
        }
    }

    public final void A06(AnonymousClass206 r3, Runnable runnable, Set set) {
        C18070vi.A0d(set, 2);
        A08(runnable, A04(r3, set), false);
    }

    public final void A07(AnonymousClass25F r3) {
        C18070vi.A0d(r3, 0);
        if (!r3.A03) {
            C25341Nv A022 = A02(r3);
            if (A022 == null) {
                A01(r3);
            } else if (A022.Bca(r3.A00)) {
                return;
            }
            r3.A00();
        }
    }

    public final void A08(Runnable runnable, Collection collection, boolean z) {
        C200710s r0;
        C18070vi.A0d(collection, 0);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A07((AnonymousClass25F) it.next());
        }
        if (!collection.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (A0B((AnonymousClass25F) it2.next())) {
                    AnonymousClass3C4 r1 = new AnonymousClass3C4(collection, this, runnable, 36);
                    if (z) {
                        r0 = this.A04;
                    } else {
                        r0 = this.A03;
                    }
                    r0.execute(r1);
                    return;
                }
            }
        }
        ((AnonymousClass11A) this.A01.get()).A00(runnable);
    }

    public final void A09(Runnable runnable, AnonymousClass25F[] r5) {
        Object[] copyOf = Arrays.copyOf(r5, 1);
        C18070vi.A0d(copyOf, 0);
        A08(runnable, C200410p.A0Q(copyOf), true);
    }

    public final void A0A(AnonymousClass25F... r2) {
        A00(this, r2[0]);
    }

    public final boolean A0B(AnonymousClass25F r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A03) {
            return false;
        }
        C25341Nv A022 = A02(r3);
        if (A022 == null) {
            A01(r3);
        } else if (!A022.Bca(r3.A00)) {
            return false;
        } else {
            return true;
        }
        return false;
    }

    private final void A01(AnonymousClass25F r5) {
        String name = r5.A01.getName();
        if (name == null) {
            name = "unknown";
        }
        if (this.A06.add(name)) {
            AnonymousClass190 r3 = this.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("type=");
            sb.append(r5.A00.A0u);
            sb.append(", class=");
            sb.append(name);
            sb.append(", isLoaded=");
            sb.append(r5.A03);
            r3.A0G("fmessage-lazy-loading-no-tag-owner", sb.toString(), true);
        }
    }

    public final LinkedHashSet A03(AnonymousClass206 r8, Set set) {
        boolean z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Object obj = r8.A0w;
        synchronized (obj) {
            z = r8.A1A;
        }
        if (!z) {
            Object obj2 = this.A00.get();
            C18070vi.A0X(obj2);
            ArrayList<C25341Nv> arrayList = new ArrayList<>();
            for (Object next : (Iterable) obj2) {
                C25341Nv r1 = (C25341Nv) next;
                if ((!r1.BZv().isEmpty()) && r1.Bca(r8)) {
                    arrayList.add(next);
                }
            }
            for (C25341Nv BZv : arrayList) {
                for (Class cls : BZv.BZv()) {
                    if (!r8.A1G.containsKey(cls)) {
                        r8.A0M(cls);
                    }
                }
            }
            synchronized (obj) {
                r8.A1A = true;
            }
        }
        Collection values = r8.A1G.values();
        C18070vi.A0X(values);
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : values) {
            if (!C29431cG.A18(set, ((AnonymousClass25F) next2).A01)) {
                arrayList2.add(next2);
            }
        }
        linkedHashSet.addAll(arrayList2);
        return linkedHashSet;
    }

    public final LinkedHashSet A04(AnonymousClass206 r6, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(A03(r6, set));
        AnonymousClass206 A0K = r6.A0K();
        if (A0K != null) {
            Set A11 = C29431cG.A11(set);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            linkedHashSet2.add(AnonymousClass8BG.class);
            linkedHashSet2.add(AnonymousClass22C.class);
            linkedHashSet2.add(AnonymousClass22A.class);
            linkedHashSet2.add(C693036r.class);
            linkedHashSet2.add(C693136s.class);
            linkedHashSet2.add(C692936q.class);
            A11.addAll(linkedHashSet2);
            linkedHashSet.addAll(A03(A0K, A11));
        }
        return linkedHashSet;
    }

    public static final void A00(C25931Qe r1, AnonymousClass25F r2) {
        C25341Nv A022;
        r1.A07(r2);
        if (r1.A0B(r2) && (A022 = r1.A02(r2)) != null) {
            A022.Bhl(r2);
        }
    }
}
