package androidx.compose.runtime;

import X.AnonymousClass000;
import X.AnonymousClass07Z;
import X.AnonymousClass08M;
import X.AnonymousClass08N;
import X.AnonymousClass0CU;
import X.AnonymousClass0CZ;
import X.AnonymousClass0D1;
import X.AnonymousClass0GU;
import X.AnonymousClass0H6;
import X.AnonymousClass0H7;
import X.AnonymousClass0Kg;
import X.AnonymousClass0N4;
import X.AnonymousClass0OL;
import X.AnonymousClass0VR;
import X.AnonymousClass0VT;
import X.AnonymousClass1G1;
import X.AnonymousClass1G4;
import X.AnonymousClass1OB;
import X.AnonymousClass1OD;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZU;
import X.AnonymousClass3F6;
import X.AnonymousClass4WA;
import X.AnonymousClass4Z4;
import X.AnonymousClass6YK;
import X.C010907c;
import X.C04460Nm;
import X.C04930Po;
import X.C05020Qb;
import X.C05200Qx;
import X.C05650Vd;
import X.C06990aB;
import X.C07400as;
import X.C08520fE;
import X.C08650fR;
import X.C09840hN;
import X.C10330iA;
import X.C10760ir;
import X.C17250uM;
import X.C18100vl;
import X.C18560wh;
import X.C22821Di;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30581eB;
import X.C31761g5;
import X.C31781g7;
import X.C34071js;
import X.C36001nB;
import X.C62892sA;
import android.util.Log;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

public final class Recomposer extends AnonymousClass0D1 {
    public static final AtomicReference A0M = new AtomicReference(AnonymousClass000.A0h());
    public static final AnonymousClass1G4 A0N = C34071js.A00(C07400as.A03);
    public long A00;
    public Throwable A01;
    public List A02;
    public Set A03;
    public boolean A04;
    public AnonymousClass0H6 A05;
    public C06990aB A06 = new C06990aB();
    public List A07;
    public C31761g5 A08;
    public AnonymousClass1OB A09;
    public final AnonymousClass0H7 A0A;
    public final Object A0B = new Object();
    public final List A0C = AnonymousClass000.A13();
    public final List A0D = AnonymousClass000.A13();
    public final List A0E = AnonymousClass000.A13();
    public final C05650Vd A0F;
    public final List A0G = AnonymousClass000.A13();
    public final Map A0H = new LinkedHashMap();
    public final Map A0I = new LinkedHashMap();
    public final C18560wh A0J;
    public final AnonymousClass1OD A0K;
    public final AnonymousClass1G4 A0L = C34071js.A00(AnonymousClass0CU.Inactive);

    /* access modifiers changed from: private */
    public final C17250uM A02(C17250uM r9, C06990aB r10) {
        Set set;
        AnonymousClass0OL r1;
        boolean A0f;
        AnonymousClass0VT r5 = (AnonymousClass0VT) r9;
        AnonymousClass0VR r6 = r5.A04;
        if (r6.A0L || r5.A01 || ((set = this.A03) != null && set.contains(r9))) {
            return null;
        }
        AnonymousClass08M A042 = A04(new C09840hN(r9), new C10330iA(r9, r10));
        try {
            Snapshot A022 = A042.A02();
            try {
                if (r10.A03()) {
                    r9.CCM(new C08650fR(r9, r10));
                }
                synchronized (r5.A09) {
                    AnonymousClass0VT.A04(r5);
                    try {
                        r1 = r5.A00;
                        AnonymousClass0OL.A01(r5);
                        A0f = r6.A0f(r1);
                        if (!A0f) {
                            AnonymousClass0VT.A05(r5);
                        }
                    } catch (Exception e) {
                        r5.A00 = r1;
                        throw e;
                    } catch (Throwable th) {
                        try {
                            AnonymousClass0VT.A02(r5);
                            throw th;
                        } catch (Exception e2) {
                            AnonymousClass0VT.A03(r5);
                            throw e2;
                        }
                    }
                }
                if (!A0f) {
                    return null;
                }
                return r9;
            } finally {
                AnonymousClass0N4.A00(A022);
            }
        } finally {
            A0M(A042);
        }
    }

    public int A0X() {
        return 1000;
    }

    public void A0c(C17250uM r6, AnonymousClass1OS r7) {
        Snapshot A022;
        boolean z = ((AnonymousClass0VT) r6).A04.A0L;
        try {
            AnonymousClass08M A042 = A04(new C09840hN(r6), new C10330iA(r6, (C06990aB) null));
            try {
                A022 = A042.A02();
                r6.BFQ(r7);
                AnonymousClass0N4.A00(A022);
                A0M(A042);
                if (!z) {
                    C05200Qx.A01().A0H();
                }
                Object obj = this.A0B;
                synchronized (obj) {
                    if (((AnonymousClass0CU) this.A0L.getValue()).compareTo(AnonymousClass0CU.ShuttingDown) > 0 && !A08(this).contains(r6)) {
                        this.A0C.add(r6);
                        this.A02 = null;
                    }
                }
                synchronized (obj) {
                    try {
                        List list = this.A0E;
                        if (0 < list.size()) {
                            list.get(0);
                            throw AnonymousClass000.A0s("getComposition$runtime_release");
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                try {
                    r6.BCP();
                    r6.BCS();
                    if (!z) {
                        C05200Qx.A01().A0H();
                    }
                } catch (Exception e) {
                    A0H((C17250uM) null, this, e);
                }
            } catch (Throwable th2) {
                th = th2;
                A0M(A042);
                throw th;
            }
        } catch (Exception e2) {
            A0H(r6, this, e2);
        }
    }

    public void A0d(Set set) {
    }

    public boolean A0e() {
        return false;
    }

    public boolean A0f() {
        return false;
    }

    public final Object A0h(C30391dr r3) {
        Object A072 = A07(r3, new Recomposer$runRecomposeAndApplyChanges$2(this, (C30391dr) null));
        if (A072 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A072;
    }

    public static final List A08(Recomposer recomposer) {
        List list = recomposer.A02;
        if (list == null) {
            List list2 = recomposer.A0C;
            if (list2.isEmpty()) {
                list = AnonymousClass1ZU.A09();
            } else {
                list = new ArrayList(list2);
            }
            recomposer.A02 = list;
        }
        return list;
    }

    /* access modifiers changed from: private */
    public final List A0A(C06990aB r18, List list) {
        ArrayList A14;
        C04930Po r4;
        AnonymousClass0Kg r3;
        List list2 = list;
        HashMap hashMap = new HashMap(list2.size());
        if (0 < list2.size()) {
            list2.get(0);
            throw AnonymousClass000.A0s("getComposition$runtime_release");
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            C17250uM r2 = (C17250uM) A16.getKey();
            List list3 = (List) A16.getValue();
            AnonymousClass0VT r5 = (AnonymousClass0VT) r2;
            AnonymousClass0VR r6 = r5.A04;
            C05020Qb.A08(!r6.A0L);
            AnonymousClass08M A042 = A04(new C09840hN(r2), new C10330iA(r2, r18));
            try {
                Snapshot A022 = A042.A02();
                try {
                    synchronized (this.A0B) {
                        try {
                            A14 = AnonymousClass000.A14(list3);
                            int size = list3.size();
                            for (int i = 0; i < size; i++) {
                                list3.get(i);
                                Map map = this.A0I;
                                List list4 = (List) map.get((Object) null);
                                Object obj = null;
                                if (list4 != null) {
                                    if (!list4.isEmpty()) {
                                        obj = list4.remove(0);
                                        if (list4.isEmpty()) {
                                            map.remove((Object) null);
                                        }
                                    } else {
                                        throw new NoSuchElementException("List is empty.");
                                    }
                                }
                                A14.add(AnonymousClass6YK.A00((Object) null, obj));
                            }
                        } catch (Throwable th) {
                            e = th;
                        }
                    }
                    if (0 < A14.size()) {
                        A14.get(0);
                        e = AnonymousClass000.A0s("getComposition$runtime_release");
                        throw e;
                    }
                    try {
                        r4 = r6.A0b;
                        AnonymousClass0Kg r0 = r6.A0G;
                        r3 = r4.A05;
                        r4.A05 = r0;
                        r0.A00.A06(C010907c.A00);
                        if (0 < A14.size()) {
                            A14.get(0);
                            throw AnonymousClass000.A0s("getAnchor$runtime_release");
                        }
                        r4.A05.A00.A06(AnonymousClass07Z.A00);
                        r4.A03 = 0;
                        r4.A03 = 0;
                        r4.A05 = r3;
                        try {
                            AnonymousClass0VR.A0N(r6);
                        } catch (Throwable th2) {
                            try {
                                AnonymousClass0VT.A02(r5);
                                throw th2;
                            } catch (Exception e) {
                                e = e;
                                AnonymousClass0VT.A03(r5);
                            }
                        }
                    } catch (Throwable th3) {
                        AnonymousClass0VR.A0M(r6);
                        throw th3;
                    }
                } finally {
                    AnonymousClass0N4.A00(A022);
                }
            } finally {
                A0M(A042);
            }
        }
        return C29431cG.A0t(hashMap.keySet());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C31761g5 A0B() {
        /*
            r4 = this;
            X.1G4 r2 = r4.A0L
            java.lang.Object r1 = r2.getValue()
            X.0CU r1 = (X.AnonymousClass0CU) r1
            X.0CU r0 = X.AnonymousClass0CU.ShuttingDown
            int r0 = r1.compareTo(r0)
            r1 = 0
            if (r0 > 0) goto L_0x0038
            r4.A0G()
            X.0aB r0 = new X.0aB
            r0.<init>()
            r4.A06 = r0
            java.util.List r0 = r4.A0D
            r0.clear()
            java.util.List r0 = r4.A0G
            r0.clear()
            java.util.List r0 = r4.A0E
            r0.clear()
            r4.A07 = r1
            X.1g5 r0 = r4.A08
            if (r0 == 0) goto L_0x0033
            r0.BEN((java.lang.Throwable) null)
        L_0x0033:
            r4.A08 = r1
            r4.A05 = r1
        L_0x0037:
            return r1
        L_0x0038:
            X.0H6 r0 = r4.A05
            if (r0 != 0) goto L_0x008c
            X.1OB r0 = r4.A09
            if (r0 != 0) goto L_0x0060
            X.0aB r0 = new X.0aB
            r0.<init>()
            r4.A06 = r0
            java.util.List r0 = r4.A0D
            r0.clear()
            boolean r0 = A0Q(r4)
            if (r0 == 0) goto L_0x008c
            X.0CU r3 = X.AnonymousClass0CU.InactivePendingWork
        L_0x0054:
            r2.setValue(r3)
            X.0CU r0 = X.AnonymousClass0CU.PendingWork
            if (r3 != r0) goto L_0x0037
            X.1g5 r0 = r4.A08
            r4.A08 = r1
            return r0
        L_0x0060:
            java.util.List r0 = r4.A0D
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0089
            X.0aB r0 = r4.A06
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0089
            java.util.List r0 = r4.A0G
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0089
            java.util.List r0 = r4.A0E
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0089
            boolean r0 = A0Q(r4)
            if (r0 != 0) goto L_0x0089
            X.0CU r3 = X.AnonymousClass0CU.Idle
            goto L_0x0054
        L_0x0089:
            X.0CU r3 = X.AnonymousClass0CU.PendingWork
            goto L_0x0054
        L_0x008c:
            X.0CU r3 = X.AnonymousClass0CU.Inactive
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A0B():X.1g5");
    }

    private final void A0G() {
        this.A0C.clear();
        this.A02 = AnonymousClass1ZU.A09();
    }

    public static final void A0H(C17250uM r3, Recomposer recomposer, Exception exc) {
        if (!AnonymousClass000.A1Y(A0M.get()) || (exc instanceof AnonymousClass0CZ)) {
            synchronized (recomposer.A0B) {
                AnonymousClass0H6 r0 = recomposer.A05;
                if (r0 == null) {
                    recomposer.A05 = new AnonymousClass0H6(exc);
                } else {
                    throw r0.A00;
                }
            }
            throw exc;
        }
        synchronized (recomposer.A0B) {
            C18100vl r02 = AnonymousClass0GU.A01;
            Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
            recomposer.A0G.clear();
            recomposer.A0D.clear();
            recomposer.A06 = new C06990aB();
            recomposer.A0E.clear();
            recomposer.A0I.clear();
            recomposer.A0H.clear();
            recomposer.A05 = new AnonymousClass0H6(exc);
            if (r3 != null) {
                List list = recomposer.A07;
                if (list == null) {
                    list = AnonymousClass000.A13();
                    recomposer.A07 = list;
                }
                if (!list.contains(r3)) {
                    list.add(r3);
                }
                recomposer.A0C.remove(r3);
                recomposer.A02 = null;
            }
            recomposer.A0B();
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A0I(androidx.compose.runtime.Recomposer r8) {
        /*
            java.lang.Object r7 = r8.A0B
            monitor-enter(r7)
            java.util.Map r1 = r8.A0I     // Catch:{ all -> 0x0055 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0055 }
            r0 = r0 ^ 1
            r6 = 0
            if (r0 == 0) goto L_0x0043
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r5 = X.C29351c6.A0F(r0)     // Catch:{ all -> 0x0055 }
            r1.clear()     // Catch:{ all -> 0x0055 }
            int r0 = r5.size()     // Catch:{ all -> 0x0055 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0055 }
            r4.<init>(r0)     // Catch:{ all -> 0x0055 }
            int r3 = r5.size()     // Catch:{ all -> 0x0055 }
            r2 = 0
        L_0x0027:
            if (r2 >= r3) goto L_0x003d
            r5.get(r2)     // Catch:{ all -> 0x0055 }
            r1 = 0
            java.util.Map r0 = r8.A0H     // Catch:{ all -> 0x0055 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0055 }
            X.1D6 r0 = X.AnonymousClass6YK.A00(r1, r0)     // Catch:{ all -> 0x0055 }
            r4.add(r0)     // Catch:{ all -> 0x0055 }
            int r2 = r2 + 1
            goto L_0x0027
        L_0x003d:
            java.util.Map r0 = r8.A0H     // Catch:{ all -> 0x0055 }
            r0.clear()     // Catch:{ all -> 0x0055 }
            goto L_0x0047
        L_0x0043:
            X.0wS r4 = X.AnonymousClass1ZU.A09()     // Catch:{ all -> 0x0055 }
        L_0x0047:
            monitor-exit(r7)
            int r0 = r4.size()
        L_0x004c:
            if (r6 >= r0) goto L_0x0054
            r4.get(r6)
            int r6 = r6 + 1
            goto L_0x004c
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A0I(androidx.compose.runtime.Recomposer):void");
    }

    /* access modifiers changed from: private */
    public final void A0O(AnonymousClass1OB r4) {
        synchronized (this.A0B) {
            Throwable th = this.A01;
            if (th == null) {
                if (((AnonymousClass0CU) this.A0L.getValue()).compareTo(AnonymousClass0CU.ShuttingDown) <= 0) {
                    th = AnonymousClass000.A0n("Recomposer shut down");
                } else if (this.A09 == null) {
                    this.A09 = r4;
                    A0B();
                } else {
                    th = AnonymousClass000.A0n("Recomposer already running");
                }
            }
            throw th;
        }
    }

    private final boolean A0P() {
        boolean z;
        synchronized (this.A0B) {
            z = true;
            if (!this.A06.A03() && !AnonymousClass000.A1a(this.A0D) && !A0Q(this)) {
                z = false;
            }
        }
        return z;
    }

    public static final boolean A0Q(Recomposer recomposer) {
        if (recomposer.A04 || !recomposer.A0F.A05()) {
            return false;
        }
        return true;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final boolean A0R(androidx.compose.runtime.Recomposer r7) {
        /*
            java.lang.Object r2 = r7.A0B
            monitor-enter(r2)
            X.0aB r6 = r7.A06     // Catch:{ all -> 0x0081 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x001d
            java.util.List r0 = r7.A0D     // Catch:{ all -> 0x0081 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0081 }
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x006f
            boolean r0 = A0Q(r7)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006e
            goto L_0x006f
        L_0x001d:
            X.0aB r0 = new X.0aB     // Catch:{ all -> 0x0081 }
            r0.<init>()     // Catch:{ all -> 0x0081 }
            r7.A06 = r0     // Catch:{ all -> 0x0081 }
            monitor-exit(r2)
            monitor-enter(r2)
            java.util.List r5 = A08(r7)     // Catch:{ all -> 0x0081 }
            monitor-exit(r2)
            int r4 = r5.size()     // Catch:{ all -> 0x0078 }
            r3 = 0
        L_0x0030:
            if (r3 >= r4) goto L_0x004e
            java.lang.Object r0 = r5.get(r3)     // Catch:{ all -> 0x0078 }
            X.0uM r0 = (X.C17250uM) r0     // Catch:{ all -> 0x0078 }
            r0.CDg(r6)     // Catch:{ all -> 0x0078 }
            X.1G4 r0 = r7.A0L     // Catch:{ all -> 0x0078 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x0078 }
            X.0CU r1 = (X.AnonymousClass0CU) r1     // Catch:{ all -> 0x0078 }
            X.0CU r0 = X.AnonymousClass0CU.ShuttingDown     // Catch:{ all -> 0x0078 }
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0078 }
            if (r0 <= 0) goto L_0x004e
            int r3 = r3 + 1
            goto L_0x0030
        L_0x004e:
            X.0aB r0 = new X.0aB     // Catch:{ all -> 0x0078 }
            r0.<init>()     // Catch:{ all -> 0x0078 }
            r7.A06 = r0     // Catch:{ all -> 0x0078 }
            monitor-enter(r2)
            X.1g5 r0 = r7.A0B()     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x0071
            java.util.List r0 = r7.A0D     // Catch:{ all -> 0x0081 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0081 }
            r1 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x006f
            boolean r0 = A0Q(r7)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            monitor-exit(r2)
            return r1
        L_0x0071:
            java.lang.String r0 = "called outside of runRecomposeAndApplyChanges"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0081 }
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0078:
            r1 = move-exception
            monitor-enter(r2)
            X.0aB r0 = r7.A06     // Catch:{ all -> 0x0081 }
            r0.A02(r6)     // Catch:{ all -> 0x0081 }
            monitor-exit(r2)
            throw r1
        L_0x0081:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.A0R(androidx.compose.runtime.Recomposer):boolean");
    }

    public void A0Z(C17250uM r4) {
        C31761g5 r1;
        synchronized (this.A0B) {
            List list = this.A0D;
            if (!list.contains(r4)) {
                list.add(r4);
                r1 = A0B();
            } else {
                r1 = null;
            }
        }
        if (r1 != null) {
            r1.resumeWith(C27621Wu.A00);
        }
    }

    public void A0a(C17250uM r3) {
        synchronized (this.A0B) {
            Set set = this.A03;
            if (set == null) {
                set = new LinkedHashSet();
                this.A03 = set;
            }
            set.add(r3);
        }
    }

    public void A0b(C17250uM r3) {
        synchronized (this.A0B) {
            this.A0C.remove(r3);
            this.A02 = null;
            this.A0D.remove(r3);
            this.A0G.remove(r3);
        }
    }

    public final void A0j() {
        synchronized (this.A0B) {
            AnonymousClass1G4 r2 = this.A0L;
            if (((AnonymousClass0CU) r2.getValue()).compareTo(AnonymousClass0CU.Idle) >= 0) {
                r2.setValue(AnonymousClass0CU.ShuttingDown);
            }
        }
        this.A0K.BEM((CancellationException) null);
    }

    public final void A0k() {
        C31761g5 r1;
        synchronized (this.A0B) {
            if (this.A04) {
                this.A04 = false;
                r1 = A0B();
            } else {
                r1 = null;
            }
        }
        if (r1 != null) {
            r1.resumeWith(C27621Wu.A00);
        }
    }

    public Recomposer(C18560wh r4) {
        C05650Vd r2 = new C05650Vd(new C08520fE(this));
        this.A0F = r2;
        AnonymousClass1OD A012 = C62892sA.A01((AnonymousClass1OB) r4.get(AnonymousClass1OB.A00));
        A012.Bdy(new C10760ir(this));
        this.A0K = A012;
        this.A0J = r4.plus(r2).plus(A012);
        this.A0A = new AnonymousClass0H7(this);
    }

    public static final AnonymousClass08M A04(C22821Di r2, C22821Di r3) {
        AnonymousClass08M r1;
        AnonymousClass08M A0M2;
        Snapshot A012 = C05200Qx.A01();
        if ((A012 instanceof AnonymousClass08M) && (r1 = (AnonymousClass08M) A012) != null && (A0M2 = r1.A0M(r2, r3)) != null) {
            return A0M2;
        }
        throw AnonymousClass000.A0n("Cannot create a mutable snapshot of an read-only snapshot");
    }

    /* access modifiers changed from: private */
    public final Object A06(C30391dr r5) {
        if (!A0P()) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C31781g7.A02;
            C31781g7 r3 = new C31781g7(1, C30581eB.A02(r5));
            r3.A0F();
            C31781g7 r2 = r3;
            synchronized (this.A0B) {
                if (!A0P()) {
                    this.A08 = r3;
                    r2 = null;
                }
            }
            if (r2 != null) {
                r2.resumeWith(C27621Wu.A00);
            }
            Object A0C2 = r3.A0C();
            if (A0C2 == AnonymousClass3F6.A03()) {
                return A0C2;
            }
        }
        return C27621Wu.A00;
    }

    private final Object A07(C30391dr r5, C36001nB r6) {
        Object A002 = AnonymousClass4Z4.A00(r5, this.A0F, new Recomposer$recompositionRunner$2(C04460Nm.A00(r5.getContext()), this, (C30391dr) null, r6));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public static final void A0M(AnonymousClass08M r1) {
        try {
            if (r1.A0N() instanceof AnonymousClass08N) {
                throw AnonymousClass000.A0n("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            r1.A0D();
        }
    }

    public C18560wh A0Y() {
        return this.A0J;
    }

    public final Object A0g(C30391dr r4) {
        Object A002 = AnonymousClass4WA.A00(r4, new Recomposer$join$2((C30391dr) null), A0i());
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public final AnonymousClass1G1 A0i() {
        return this.A0L;
    }
}
