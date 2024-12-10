package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.49j  reason: invalid class name and case insensitive filesystem */
public abstract class C826949j extends A34 {
    public final C24921Me A00;
    public final C18000vb A01;
    public final WeakReference A02;
    public final Set A03 = C17880vN.A12();

    public C826949j(C24921Me r3, AnonymousClass3gf r4, C18000vb r5, List list) {
        super(r4, true);
        this.A02 = AnonymousClass3MW.A0z(r4);
        this.A00 = r3;
        this.A01 = r5;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A00(this, it);
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList arrayList;
        AnonymousClass1JQ A09;
        C22821Di r0;
        List list;
        String A0K;
        C53792d6 r02;
        if (this instanceof C77773rQ) {
            C77773rQ r4 = (C77773rQ) this;
            ArrayList A0L = r4.A01.A0L();
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A0L.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it);
                if (!(A0O.A0J == null || (A0K = A0O.A0K()) == null || A0K.length() == 0 || (r02 = A0O.A0L) == null || r02.A00 != 0)) {
                    C24921Me r2 = r4.A00;
                    AnonymousClass1BI r1 = A0O.A0J;
                    C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                    C24921Me.A04(r2, (AnonymousClass1E9) r1, 1, true);
                    C72463Mc.A1D(A0O, r4.A03);
                    A13.add(A0O);
                }
            }
            Collections.sort(A13, new C77563qb(r4.A00, r4.A01, r4));
            return A13;
        }
        if (this instanceof C77763rP) {
            C77763rP r42 = (C77763rP) this;
            arrayList = AnonymousClass000.A13();
            WeakReference weakReference = r42.A02;
            AnonymousClass3gf r22 = (AnonymousClass3gf) weakReference.get();
            if (r22 != null) {
                r22.A55(arrayList);
                AnonymousClass3gf r12 = (AnonymousClass3gf) weakReference.get();
                if (r12 != null && (list = r12.A0W) != null && !list.isEmpty() && r12.A0Y) {
                    HashSet A12 = C17880vN.A12();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C72473Md.A1N(A12, it2);
                    }
                    List list2 = r22.A0W;
                    if (list2 != null) {
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            AnonymousClass1BI A0Q = C17880vN.A0Q(it3);
                            if (A0Q != null && !A12.contains(A0Q)) {
                                AnonymousClass1E7 A0H = r42.A00.A0H(A0Q);
                                if (A0H.A0H != null) {
                                    arrayList.add(A0H);
                                }
                            }
                        }
                    }
                }
                if (r42.A01) {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (C22971Dz.A0T(C72453Mb.A0l(it4))) {
                            it4.remove();
                        }
                    }
                }
                C24921Me r23 = r42.A00;
                C18000vb r13 = r42.A01;
                C18070vi.A0j(r23, r13);
                Collections.sort(arrayList, new C146987Rj(r23, r13));
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                C72463Mc.A1D(C17880vN.A0O(it5), r42.A03);
            }
        } else {
            if (this instanceof C77753rO) {
                C77753rO r24 = (C77753rO) this;
                A09 = C29431cG.A0V(r24.A00.A09());
                r0 = new AnonymousClass5RL(r24);
            } else if (this instanceof C77793rS) {
                C77793rS r5 = (C77793rS) this;
                arrayList = r5.A04.A0L();
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    AnonymousClass1BI A0l = C72453Mb.A0l(it6);
                    if (A0l != null) {
                        C24921Me.A04(r5.A00, (AnonymousClass1E9) A0l, 1, true);
                    }
                }
                Collections.sort(arrayList, new C77563qb(r5, r5.A00, r5.A01));
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    C72463Mc.A1D(C17880vN.A0O(it7), r5.A03);
                }
            } else if (this instanceof C77783rR) {
                C77783rR r3 = (C77783rR) this;
                AnonymousClass1MZ r03 = r3.A02;
                C199410f A0B = r03.A08.A0B(r3.A03).A0B();
                C18070vi.A0X(A0B);
                A09 = AnonymousClass1b2.A09(C106375Vp.A00, AnonymousClass1b2.A09(new AnonymousClass5RJ(r3), new C99434so(A0B, 4)));
                r0 = new AnonymousClass5RK(r3);
            } else {
                throw AnonymousClass04E.createAndThrow();
            }
            return AnonymousClass1b2.A07(AnonymousClass1b2.A0A(r0, A09));
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        AnonymousClass3gf r0 = (AnonymousClass3gf) this.A02.get();
        if (r0 != null) {
            r0.A58(list);
        }
    }

    public static void A00(C826949j r1, Iterator it) {
        r1.A03.add(((AnonymousClass1E7) it.next()).A06(AnonymousClass1BI.class));
    }
}
