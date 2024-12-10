package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1qT  reason: invalid class name and case insensitive filesystem */
public abstract class C37961qT {
    public long A00 = 120;
    public long A01 = 250;
    public long A02 = 250;
    public long A03 = 120;
    public C38031qa A04 = null;
    public ArrayList A05 = new ArrayList();

    public void A0C() {
        C37981qV r6 = (C37981qV) this;
        ArrayList arrayList = r6.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C42011xT r1 = ((C49782Rx) arrayList.get(size)).A04;
            View view = r1.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            r6.A08(r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = r6.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            r6.A08((C42011xT) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = r6.A06;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C42011xT r12 = (C42011xT) arrayList3.get(size3);
            r12.A0H.setAlpha(1.0f);
            r6.A08(r12);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = r6.A07;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            AnonymousClass6UZ r13 = (AnonymousClass6UZ) arrayList4.get(size4);
            C42011xT r0 = r13.A05;
            if (r0 != null) {
                C37981qV.A03(r13, r6, r0);
            }
            C42011xT r02 = r13.A04;
            if (r02 != null) {
                C37981qV.A03(r13, r6, r02);
            }
        }
        arrayList4.clear();
        if (r6.A0F()) {
            ArrayList arrayList5 = r6.A05;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) arrayList5.get(size5);
                int size6 = abstractList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C42011xT r14 = ((C49782Rx) abstractList.get(size6)).A04;
                        View view2 = r14.A0H;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        r6.A08(r14);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = r6.A01;
            int size7 = arrayList6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                AbstractList abstractList2 = (AbstractList) arrayList6.get(size7);
                int size8 = abstractList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C42011xT r15 = (C42011xT) abstractList2.get(size8);
                        r15.A0H.setAlpha(1.0f);
                        r6.A08(r15);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = r6.A03;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            AnonymousClass6UZ r16 = (AnonymousClass6UZ) abstractList3.get(size10);
                            C42011xT r03 = r16.A05;
                            if (r03 != null) {
                                C37981qV.A03(r16, r6, r03);
                            }
                            C42011xT r04 = r16.A04;
                            if (r04 != null) {
                                C37981qV.A03(r16, r6, r04);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    C37981qV.A02(r6.A0A);
                    C37981qV.A02(r6.A04);
                    C37981qV.A02(r6.A00);
                    C37981qV.A02(r6.A02);
                    r6.A07();
                    return;
                }
            }
        }
    }

    public void A0E(C42011xT r10) {
        C37981qV r4 = (C37981qV) this;
        View view = r10.A0H;
        view.animate().cancel();
        ArrayList arrayList = r4.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C49782Rx) arrayList.get(size)).A04 == r10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                r4.A08(r10);
                arrayList.remove(size);
            }
        }
        C37981qV.A01(r4, r10, r4.A07);
        if (r4.A09.remove(r10)) {
            view.setAlpha(1.0f);
            r4.A08(r10);
        }
        if (r4.A06.remove(r10)) {
            view.setAlpha(1.0f);
            r4.A08(r10);
        }
        ArrayList arrayList2 = r4.A03;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            C37981qV.A01(r4, r10, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = r4.A05;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) arrayList4.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C49782Rx) abstractList.get(size4)).A04 == r10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    r4.A08(r10);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = r4.A01;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
            if (abstractCollection.remove(r10)) {
                view.setAlpha(1.0f);
                r4.A08(r10);
                if (abstractCollection.isEmpty()) {
                    arrayList5.remove(size5);
                }
            }
        }
        r4.A0A.remove(r10);
        r4.A00.remove(r10);
        r4.A02.remove(r10);
        r4.A04.remove(r10);
        if (!r4.A0F()) {
            r4.A07();
        }
    }

    public boolean A0F() {
        C37981qV r1 = (C37981qV) this;
        if (!r1.A06.isEmpty() || !r1.A07.isEmpty() || !r1.A08.isEmpty() || !r1.A09.isEmpty() || !r1.A04.isEmpty() || !r1.A0A.isEmpty() || !r1.A00.isEmpty() || !r1.A02.isEmpty() || !r1.A05.isEmpty() || !r1.A01.isEmpty() || !r1.A03.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean A0G(C42011xT r3, List list) {
        C37971qU r1 = (C37971qU) this;
        if (!list.isEmpty() || r1.A0J(r3)) {
            return true;
        }
        return false;
    }

    public boolean A0H(C57072iU r9, C57072iU r10, C42011xT r11, C42011xT r12) {
        int i;
        int i2;
        C37971qU r1 = (C37971qU) this;
        int i3 = r9.A00;
        int i4 = r9.A01;
        C42011xT r3 = r12;
        if (r12.A0A()) {
            i2 = i4;
            i = i3;
        } else {
            i = r10.A00;
            i2 = r10.A01;
        }
        return r1.A0M(r11, r3, i3, i4, i, i2);
    }

    public final void A07() {
        ArrayList arrayList = this.A05;
        if (0 < arrayList.size()) {
            arrayList.get(0);
            throw new NullPointerException("onAnimationsFinished");
        } else {
            arrayList.clear();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.C42011xT r8) {
        /*
            r7 = this;
            X.1qa r2 = r7.A04
            if (r2 == 0) goto L_0x0054
            X.1qb r2 = (X.C38041qb) r2
            r0 = 1
            r8.A09(r0)
            X.1xT r0 = r8.A09
            r1 = 0
            if (r0 == 0) goto L_0x0015
            X.1xT r0 = r8.A0A
            if (r0 != 0) goto L_0x0015
            r8.A09 = r1
        L_0x0015:
            r8.A0A = r1
            int r0 = r8.A00
            r0 = r0 & 16
            if (r0 != 0) goto L_0x0054
            androidx.recyclerview.widget.RecyclerView r4 = r2.A00
            android.view.View r3 = r8.A0H
            r4.A0b()
            X.1qm r6 = r4.A08
            X.1qk r0 = r6.A01
            X.1ql r0 = (X.C38141ql) r0
            androidx.recyclerview.widget.RecyclerView r5 = r0.A00
            int r2 = r5.indexOfChild(r3)
            r0 = -1
            if (r2 != r0) goto L_0x0055
            X.C38151qm.A02(r3, r6)
        L_0x0036:
            r2 = 1
            X.1xT r1 = androidx.recyclerview.widget.RecyclerView.A02(r3)
            X.1qQ r0 = r4.A0v
            r0.A0A(r1)
            r0.A09(r1)
        L_0x0043:
            r0 = r2 ^ 1
            r4.A0y(r0)
            if (r2 != 0) goto L_0x0054
            int r0 = r8.A00
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r4.removeDetachedView(r3, r0)
        L_0x0054:
            return
        L_0x0055:
            X.1qn r1 = r6.A00
            boolean r0 = r1.A06(r2)
            if (r0 == 0) goto L_0x0073
            r1.A07(r2)
            X.C38151qm.A02(r3, r6)
            android.view.View r0 = r5.getChildAt(r2)
            if (r0 == 0) goto L_0x006f
            r5.A0p(r0)
            r0.clearAnimation()
        L_0x006f:
            r5.removeViewAt(r2)
            goto L_0x0036
        L_0x0073:
            r2 = 0
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37961qT.A08(X.1xT):void");
    }

    public void A0D() {
        long j;
        long j2;
        C37981qV r9 = (C37981qV) this;
        ArrayList arrayList = r9.A09;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = r9.A08;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = r9.A07;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = r9.A06;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C42011xT r7 = (C42011xT) it.next();
                View view = r7.A0H;
                ViewPropertyAnimator animate = view.animate();
                r9.A0A.add(r7);
                animate.setDuration(r9.A0B()).alpha(0.0f).setListener(new C109185cx(view, animate, r9, r7, 0)).start();
            }
            arrayList.clear();
            if (z2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                r9.A05.add(arrayList5);
                arrayList2.clear();
                C21471Akc akc = new C21471Akc((Object) r9, (Object) arrayList5, 8);
                if (z) {
                    ((C49782Rx) arrayList5.get(0)).A04.A0H.postOnAnimationDelayed(akc, r9.A0B());
                } else {
                    akc.run();
                }
            }
            if (z3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                r9.A03.add(arrayList6);
                arrayList3.clear();
                C21471Akc akc2 = new C21471Akc((Object) r9, (Object) arrayList6, 9);
                if (z) {
                    ((AnonymousClass6UZ) arrayList6.get(0)).A05.A0H.postOnAnimationDelayed(akc2, r9.A0B());
                } else {
                    akc2.run();
                }
            }
            if (z4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                r9.A01.add(arrayList7);
                arrayList4.clear();
                C21471Akc akc3 = new C21471Akc((Object) r9, (Object) arrayList7, 10);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = r9.A0B();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = r9.A0A();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = r9.A09();
                    }
                    ((C42011xT) arrayList7.get(0)).A0H.postOnAnimationDelayed(akc3, j + Math.max(j2, j3));
                    return;
                }
                akc3.run();
            }
        }
    }

    public long A09() {
        return this.A01;
    }

    public long A0A() {
        return this.A02;
    }

    public long A0B() {
        return this.A03;
    }
}
