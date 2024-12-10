package X;

import android.util.SparseArray;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.8jr  reason: invalid class name and case insensitive filesystem */
public final class C168888jr extends C25141CZr {
    public static C138246wl A00;

    public void A02(View view, DOZ doz, DFL dfl, DFL dfl2) {
        int visibility;
        DFL dfl3 = dfl;
        C184049aK r1 = (C184049aK) C26272CwJ.A04(doz, dfl);
        if (r1 == null) {
            throw AnonymousClass8BR.A0w("Extension defines a controller but none was found");
        } else if (!dfl.A0I(50, false)) {
            C138246wl r7 = r1.A00;
            View view2 = view;
            C18070vi.A0d(view, 0);
            int i = dfl2.A04;
            SparseArray sparseArray = r7.A01;
            Set set = (Set) sparseArray.get(i);
            if (set != null) {
                SparseArray sparseArray2 = r7.A00;
                C166538d3 r0 = (C166538d3) sparseArray2.get(i);
                if (r0 != null) {
                    view.removeOnAttachStateChangeListener(r0);
                    sparseArray2.remove(i);
                }
                if (set.size() == 1) {
                    A58 a58 = (A58) doz.A01.get(2131428253);
                    if (a58 != null) {
                        C185419cY r02 = a58.A01;
                        if (r02 == null || !r02.A01.A01) {
                            a58.A03(view, C1404171i.A06);
                        } else {
                            C70763Ck r3 = new C70763Ck(dfl3, a58, set, r7, view2, i, 1);
                            LinkedHashMap linkedHashMap = a58.A04;
                            synchronized (linkedHashMap) {
                                C108955ca.A1V(r3, linkedHashMap, i);
                            }
                            return;
                        }
                    }
                    set.remove(dfl);
                    sparseArray.remove(i);
                    return;
                }
                set.remove(dfl);
            }
        } else {
            C20299AFh aFh = r1.A01.A00;
            View view3 = aFh.A00;
            if (view3 != null) {
                if (aFh.A06 && (view3.getParent() == null || (visibility = view3.getVisibility()) == 4 || visibility == 8)) {
                    C20299AFh.A00(aFh);
                }
                AnonymousClass3MY.A1D(aFh.A00, aFh);
                aFh.A00 = null;
                aFh.A01 = null;
                aFh.A03 = null;
                aFh.A04 = null;
                aFh.A06 = false;
            }
        }
    }

    public C168888jr() {
        super(13538);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.9Pd] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.9Pc] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.9Pd] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.9Pc] */
    public /* bridge */ /* synthetic */ Object A00(DOZ doz) {
        C138246wl r2;
        if (doz.A02.A07.get()) {
            r2 = new C138246wl(new Object(), new Object());
        } else {
            r2 = A00;
            if (r2 == null) {
                r2 = new C138246wl(new Object(), new Object());
                A00 = r2;
            }
        }
        return new C184049aK(r2, new C183079Wv());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0107, code lost:
        if (r2 == 8) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.View r15, X.DOZ r16, X.DFL r17, X.DFL r18) {
        /*
            r14 = this;
            r8 = r16
            r1 = r17
            java.lang.Object r3 = X.C26272CwJ.A04(r8, r1)
            X.9aK r3 = (X.C184049aK) r3
            if (r3 == 0) goto L_0x0118
            X.CXY r0 = r8.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A07
            boolean r0 = r0.get()
            boolean r5 = X.AnonymousClass000.A1O(r0)
            r2 = 50
            r0 = 0
            boolean r0 = r1.A0I(r2, r0)
            r9 = r15
            r7 = r18
            if (r0 != 0) goto L_0x00c9
            X.6wl r11 = r3.A00
            r6 = 0
            X.C18070vi.A0d(r15, r6)
            r13 = 1
            int r12 = r7.A04
            r2 = 2131428253(0x7f0b039d, float:1.8478145E38)
            android.util.SparseArray r0 = r8.A01
            java.lang.Object r10 = r0.get(r2)
            X.A58 r10 = (X.A58) r10
            if (r10 == 0) goto L_0x0054
            java.util.LinkedHashMap r3 = r10.A04
            monitor-enter(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x004c }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x004c }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x004c }
            r3.remove(r2)     // Catch:{ all -> 0x004c }
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            goto L_0x004f
        L_0x004c:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004c }
            throw r1
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0.run()
        L_0x0054:
            android.util.SparseArray r0 = r11.A01
            java.lang.Object r4 = r0.get(r12)
            java.util.Set r4 = (java.util.Set) r4
            if (r4 != 0) goto L_0x0114
            java.util.HashSet r4 = X.C17880vN.A12()
            r0.append(r12, r4)
            if (r10 == 0) goto L_0x0114
            if (r5 == 0) goto L_0x0087
            X.8d3 r5 = new X.8d3
            r5.<init>(r15)
            android.util.SparseArray r0 = r11.A00
            r0.append(r12, r5)
            X.Aif r3 = r10.A02
            java.util.List r0 = r3.A00
            r0.clear()
            X.9mf r2 = new X.9mf
            r2.<init>(r15, r3)
            X.6zn r0 = new X.6zn
            r0.<init>(r6)
            X.A58.A01(r2, r5, r10, r0)
        L_0x0087:
            java.util.WeakHashMap r0 = X.C19946A0d.A01
            java.lang.Object r2 = r0.get(r15)
            if (r2 != 0) goto L_0x0097
            X.A0d r2 = new X.A0d
            r2.<init>(r15)
            r0.put(r15, r2)
        L_0x0097:
            X.9cY r0 = r10.A01
            if (r0 == 0) goto L_0x010d
            X.9cX r3 = r0.A00
            monitor-enter(r3)
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x00c6 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x00c6 }
            X.71i r2 = (X.C1404171i) r2     // Catch:{ all -> 0x00c6 }
            if (r2 != 0) goto L_0x00ad
            X.71i r2 = X.C1404171i.A06     // Catch:{ all -> 0x00c6 }
            X.C18070vi.A0Z(r2)     // Catch:{ all -> 0x00c6 }
        L_0x00ad:
            monitor-exit(r3)
            X.71i r0 = X.C1404171i.A06
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x010d
            X.7Q7 r7 = new X.7Q7
            r7.<init>(r8, r9, r10, r11, r12, r13)
            java.util.LinkedHashMap r0 = r10.A04
            monitor-enter(r0)
            X.C108955ca.A1V(r7, r0, r12)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x0114
        L_0x00c3:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c3 }
            throw r1
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00c9:
            r0 = 35
            X.E8A r4 = r1.A0A(r0)
            r0 = 36
            X.E8A r2 = r1.A0A(r0)
            if (r4 != 0) goto L_0x00da
            if (r2 != 0) goto L_0x00da
            return
        L_0x00da:
            java.lang.String r1 = X.C24517C7l.A00(r1)
            if (r1 == 0) goto L_0x0117
            X.9Wv r0 = r3.A01
            X.AFh r3 = r0.A00
            r3.A02 = r7
            r3.A00 = r15
            r3.A01 = r8
            r3.A05 = r1
            r3.A03 = r4
            r3.A04 = r2
            android.view.ViewTreeObserver r0 = r15.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
            android.view.ViewParent r0 = r15.getParent()
            if (r0 == 0) goto L_0x0109
            int r2 = r15.getVisibility()
            r0 = 4
            if (r2 == r0) goto L_0x0109
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            r3.A06 = r0
            return
        L_0x010d:
            X.71i r0 = X.C138246wl.A00(r11, r8, r12)
            r10.A03(r15, r0)
        L_0x0114:
            r4.add(r1)
        L_0x0117:
            return
        L_0x0118:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r1 = X.AnonymousClass8BR.A0w(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C168888jr.A01(android.view.View, X.DOZ, X.DFL, X.DFL):void");
    }
}
