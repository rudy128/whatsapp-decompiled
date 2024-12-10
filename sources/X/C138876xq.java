package X;

import android.app.Activity;
import android.view.View;
import android.view.Window;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.6xq  reason: invalid class name and case insensitive filesystem */
public final class C138876xq {
    public final C129936ic A00;
    public final C129146hK A01;

    public C138876xq(C129146hK r4) {
        C18070vi.A0d(r4, 1);
        this.A01 = r4;
        this.A00 = new C129936ic(r4, C147117Rw.A01, C147107Rv.A01);
    }

    public static boolean A00(Class cls, Object obj) {
        return obj.equals(new AnonymousClass20F(cls));
    }

    public final void A01(C1593884i r19, C1593984j r20, AnonymousClass6X0 r21) {
        Reference reference;
        C1593984j r5;
        C129936ic r2 = this.A00;
        C142887Be r9 = (C142887Be) r20;
        String str = r9.A01;
        C71283Eq r7 = r2.A00;
        if (!(r7.get(str) == null || (reference = (Reference) r7.remove(str)) == null || (r5 = (C1593984j) reference.get()) == null)) {
            AnonymousClass20F A15 = AnonymousClass3MW.A15(r5.getClass());
            if (A00(C142887Be.class, A15)) {
                C126946dY r3 = r2.A01;
                C114495qv r1 = r3.A00;
                synchronized (r1) {
                    if (r1.A03.containsKey(r5)) {
                        C114495qv.A00(r5, r1, true);
                    }
                }
                r3.A01.remove((Object) null);
            } else if (A00(C142877Bd.class, A15)) {
                throw AnonymousClass000.A0s("getConfig");
            } else if (A00(C142867Bc.class, A15)) {
                throw AnonymousClass000.A0s("getConfig");
            } else if (A00(C142857Bb.class, A15)) {
                throw AnonymousClass000.A0s("getConfig");
            }
        }
        AnonymousClass20F A152 = AnonymousClass3MW.A15(r20.getClass());
        if (A00(C142887Be.class, A152)) {
            C126946dY r6 = r2.A01;
            WeakReference weakReference = r9.A04;
            Object obj = weakReference.get();
            if (obj != null) {
                C114495qv r4 = r6.A00;
                AnonymousClass84E r15 = AnonymousClass84E.A00;
                synchronized (r4) {
                    C18070vi.A0d(r15, 2);
                    WeakHashMap weakHashMap = r4.A03;
                    if (weakHashMap.containsKey(r9)) {
                        if (weakHashMap.containsKey(r9)) {
                            C114495qv.A00(r9, r4, true);
                            if (!(!weakHashMap.isEmpty()) && r4.A01) {
                                r4.A01 = false;
                                r4.A02();
                            }
                        }
                    }
                    C18140vp r16 = r4.A04;
                    Activity activity = (Activity) r16.get();
                    if (activity != null) {
                        if (!activity.equals(r4.A00.get())) {
                            Iterator A0i = C17890vO.A0i(weakHashMap);
                            while (A0i.hasNext()) {
                                Object key = AnonymousClass000.A16(A0i).getKey();
                                C18070vi.A0X(key);
                                C114495qv.A00((C1593984j) key, r4, false);
                                A0i.remove();
                            }
                            weakHashMap.clear();
                            Window window = activity.getWindow();
                            if (window != null) {
                                View decorView = window.getDecorView();
                                C18070vi.A0X(decorView);
                                View findViewById = decorView.findViewById(16908290);
                                if (findViewById == null || findViewById.getRootView() == null || (decorView = findViewById.getRootView()) != null) {
                                    A58 a58 = (A58) r4.A05.get();
                                    C1593784h[] r10 = {new AnonymousClass7BW()};
                                    C21350Aif aif = a58.A02;
                                    List list = aif.A00;
                                    list.clear();
                                    list.add(r10[0]);
                                    A58.A01(new C191479mf(decorView, aif), r4, a58, new C140006zn(true));
                                    r4.A00 = AnonymousClass3MW.A0z(activity);
                                }
                            }
                        }
                        if (((Activity) r16.get()) != null) {
                            AnonymousClass6ZG r12 = new AnonymousClass6ZG(r19);
                            AnonymousClass7BZ r102 = new AnonymousClass7BZ(new AnonymousClass6ZF(r21), r12, r4.A02, r9.A02, r15);
                            C1404171i r0 = C1404171i.A06;
                            C129566i0 r13 = new C129566i0(r9, r6, str);
                            List list2 = r13.A01;
                            if (list2 == null) {
                                list2 = AnonymousClass000.A13();
                                r13.A01 = list2;
                            }
                            list2.add(r102);
                            ((A58) r4.A05.get()).A03(C108945cZ.A0O(weakReference), new C1404171i(r13));
                            weakHashMap.put(r9, true);
                        }
                        if (!weakHashMap.isEmpty()) {
                            r4.A01 = true;
                            r4.A01();
                        }
                    }
                }
                r6.A01.put(obj, r9);
            }
        } else if (A00(C142877Bd.class, A152)) {
            throw AnonymousClass000.A0s("getView");
        } else if (A00(C142867Bc.class, A152)) {
            throw AnonymousClass000.A0s("getConfig");
        } else if (A00(C142857Bb.class, A152)) {
            throw AnonymousClass000.A0s("getConfig");
        }
        r7.remove(str);
        r7.put(str, AnonymousClass3MW.A0z(r20));
    }
}
