package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.1Nd  reason: invalid class name and case insensitive filesystem */
public class C25161Nd {
    public final C25171Ne A00 = new C25171Ne();
    public final C25171Ne A01 = new C25171Ne();
    public final AnonymousClass1CJ A02;

    public static ArrayList A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        Collections.sort(arrayList, new C98924rw(16));
        return arrayList;
    }

    public int A02() {
        int i;
        AnonymousClass1CJ r4 = this.A02;
        AnonymousClass1CJ.A01(r4);
        C25171Ne r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            i = 0;
            while (it.hasNext()) {
                if (r4.A0Q(((C36311ng) it.next()).A01)) {
                    i++;
                }
            }
        }
        return i;
    }

    public int A03() {
        int size;
        AnonymousClass1CJ.A01(this.A02);
        C25171Ne r1 = this.A01;
        synchronized (r1) {
            size = r1.A01.size();
        }
        return size;
    }

    public int A04() {
        int i;
        AnonymousClass1CJ r4 = this.A02;
        AnonymousClass1CJ.A01(r4);
        C25171Ne r3 = this.A00;
        synchronized (r3) {
            Iterator it = r3.iterator();
            i = 0;
            while (it.hasNext()) {
                i += r4.A03(((C36311ng) it.next()).A01);
            }
        }
        return i;
    }

    public int A05() {
        int i;
        AnonymousClass1CJ r5 = this.A02;
        AnonymousClass1CJ.A01(r5);
        C25171Ne r4 = this.A01;
        synchronized (r4) {
            Iterator it = r4.iterator();
            i = 0;
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C36311ng) it.next()).A01;
                if (!r5.A0Q(r1) && !r5.A0S(r1)) {
                    i++;
                }
            }
        }
        return i;
    }

    public ArrayList A06() {
        ArrayList arrayList;
        AnonymousClass1CJ.A01(this.A02);
        C25171Ne r3 = this.A01;
        synchronized (r3) {
            arrayList = new ArrayList(r3.A01.size());
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                arrayList.add(((C36311ng) it.next()).A01);
            }
        }
        return arrayList;
    }

    public ArrayList A07() {
        AnonymousClass1CJ r5 = this.A02;
        AnonymousClass1CJ.A01(r5);
        ArrayList arrayList = new ArrayList();
        C25171Ne r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C36311ng) it.next()).A01;
                if (r5.A0Q(r1)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A08() {
        ArrayList arrayList;
        AnonymousClass1CJ.A01(this.A02);
        C25171Ne r4 = this.A01;
        synchronized (r4) {
            arrayList = new ArrayList();
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C36311ng) it.next()).A01;
                if (C22971Dz.A0e(r1) || C22971Dz.A0O(r1)) {
                    arrayList.add((AnonymousClass1E9) r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A09() {
        AnonymousClass1CJ.A01(this.A02);
        ArrayList arrayList = new ArrayList();
        C25171Ne r2 = this.A00;
        synchronized (r2) {
            Iterator it = r2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C36311ng) it.next()).A01);
            }
        }
        return arrayList;
    }

    public ArrayList A0A() {
        AnonymousClass1CJ r5 = this.A02;
        AnonymousClass1CJ.A01(r5);
        ArrayList arrayList = new ArrayList();
        C25171Ne r3 = this.A01;
        synchronized (r3) {
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C36311ng) it.next()).A01;
                if (r5.A0S(r1)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A0B() {
        AnonymousClass1CJ r5 = this.A02;
        AnonymousClass1CJ.A01(r5);
        C25171Ne r4 = this.A01;
        ArrayList arrayList = new ArrayList(r4.A01.size());
        synchronized (r4) {
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C36311ng) it.next()).A01;
                if (!r5.A0Q(r1) && !r5.A0S(r1)) {
                    arrayList.add(r1);
                }
            }
        }
        return arrayList;
    }

    public ArrayList A0C(AnonymousClass1Nb r9) {
        AnonymousClass1CJ r6 = this.A02;
        AnonymousClass1CJ.A01(r6);
        C25171Ne r7 = this.A01;
        ArrayList arrayList = new ArrayList(r7.A01.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(r9.A0f());
        ArrayList arrayList2 = new ArrayList();
        synchronized (r7) {
            Iterator it = r7.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = ((C36311ng) it.next()).A01;
                if (!r6.A0S(r1)) {
                    arrayList2.add(r1);
                }
            }
        }
        linkedHashSet.retainAll(arrayList2);
        arrayList.addAll(linkedHashSet);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            AnonymousClass1BI r12 = (AnonymousClass1BI) it2.next();
            if (!r6.A0Q(r12) && !linkedHashSet.contains(r12)) {
                arrayList.add(r12);
            }
        }
        return arrayList;
    }

    public HashSet A0D() {
        HashSet hashSet;
        AnonymousClass1CJ.A01(this.A02);
        C25171Ne r3 = this.A01;
        synchronized (r3) {
            hashSet = new HashSet(r3.A01.size());
            Iterator it = r3.iterator();
            while (it.hasNext()) {
                hashSet.add(((C36311ng) it.next()).A01);
            }
        }
        return hashSet;
    }

    public HashSet A0E() {
        Boolean bool;
        boolean z;
        AnonymousClass1CJ r6 = this.A02;
        AnonymousClass1CJ.A01(r6);
        HashSet hashSet = new HashSet();
        C25171Ne r4 = this.A01;
        synchronized (r4) {
            Iterator it = r4.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r3 = ((C36311ng) it.next()).A01;
                if (!r6.A0Q(r3) && !r6.A0S(r3)) {
                    if (r6.A03(r3) == 0) {
                        Boolean bool2 = Boolean.FALSE;
                        C29691ci r1 = (C29691ci) AnonymousClass1CJ.A01(r6).get(r3);
                        if (r1 == null) {
                            bool = null;
                        } else {
                            synchronized (r1) {
                                z = r1.A0q;
                            }
                            bool = Boolean.valueOf(z);
                        }
                        if (!bool2.equals(bool)) {
                        }
                    }
                    hashSet.add(r3);
                }
            }
        }
        return hashSet;
    }

    public void A0F(AnonymousClass1BI r3) {
        if (r3 != null) {
            AnonymousClass1CJ.A01(this.A02);
            if (C22971Dz.A0S(r3)) {
                C25171Ne r1 = this.A00;
                synchronized (r1) {
                    r1.A01(r3);
                }
                return;
            }
            C25171Ne r12 = this.A01;
            synchronized (r12) {
                r12.A01(r3);
            }
        }
    }

    public boolean A0G(AnonymousClass1BI r4) {
        boolean z;
        boolean z2;
        if (r4 == null) {
            return false;
        }
        AnonymousClass1CJ.A01(this.A02);
        if (C22971Dz.A0S(r4)) {
            C25171Ne r1 = this.A00;
            synchronized (r1) {
                z2 = false;
                if (C25171Ne.A00(r1, r4) >= 0) {
                    z2 = true;
                }
            }
            return z2;
        }
        C25171Ne r12 = this.A01;
        synchronized (r12) {
            z = false;
            if (C25171Ne.A00(r12, r4) >= 0) {
                z = true;
            }
        }
        return z;
    }

    public boolean A0H(AnonymousClass1BI r3, long j) {
        boolean A03;
        AnonymousClass1CJ.A01(this.A02);
        if (!C22971Dz.A0S(r3)) {
            return A01(this, r3, r3, j);
        }
        C25171Ne r1 = this.A00;
        synchronized (r1) {
            A03 = r1.A03(r3, r3, j);
        }
        return A03;
    }

    public C25161Nd(AnonymousClass1CJ r2) {
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r5.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A01(X.C25161Nd r5, X.AnonymousClass1BI r6, X.AnonymousClass1BI r7, long r8) {
        /*
            boolean r0 = X.C22971Dz.A0V(r6)
            r4 = 0
            if (r0 != 0) goto L_0x0014
            X.1CJ r3 = r5.A02
            X.1ci r0 = r3.A0A(r6)
            if (r0 == 0) goto L_0x0015
            int r1 = r0.A03
            r0 = 5
            if (r1 != r0) goto L_0x0015
        L_0x0014:
            return r4
        L_0x0015:
            X.1ci r1 = r3.A0A(r6)
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1.A0s
            if (r0 != 0) goto L_0x0014
            X.1BI r0 = r1.A08()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x002a
            return r4
        L_0x002a:
            X.1Ne r2 = r5.A01
            monitor-enter(r2)
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0049 }
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A00(r7)     // Catch:{ all -> 0x0049 }
            int r1 = r3.A06(r0)     // Catch:{ all -> 0x0049 }
            r0 = 1
            if (r1 != r0) goto L_0x0043
            X.1ng r0 = r2.A01(r6)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0041
            r4 = 1
        L_0x0041:
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            return r4
        L_0x0043:
            boolean r0 = r2.A03(r6, r7, r8)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            return r0
        L_0x0049:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25161Nd.A01(X.1Nd, X.1BI, X.1BI, long):boolean");
    }
}
