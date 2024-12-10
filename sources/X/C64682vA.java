package X;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2vA  reason: invalid class name and case insensitive filesystem */
public class C64682vA implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public AnonymousClass1LG A01;

    public void onViewAttachedToWindow(View view) {
    }

    public static void A00(AnonymousClass00O r3, AnonymousClass00O r4, AnonymousClass1LG r5, Object obj, Object obj2) {
        View view = (View) obj;
        if (view != null && r5.A0T(view)) {
            Object obj3 = r3.get(obj2);
            Object obj4 = r4.get(view);
            if (obj3 != null && obj4 != null) {
                r5.A0C.add(obj3);
                r5.A0B.add(obj4);
                r3.remove(obj2);
                r4.remove(view);
            }
        }
    }

    public boolean onPreDraw() {
        C49792Ry r9;
        C62392rK r2;
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = C29191bl.A02;
        ViewGroup viewGroup2 = this.A00;
        if (arrayList.remove(viewGroup2)) {
            AnonymousClass00P A002 = C29191bl.A00();
            AbstractCollection abstractCollection = (AbstractCollection) A002.get(viewGroup2);
            ArrayList arrayList2 = null;
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass000.A13();
                A002.put(viewGroup2, abstractCollection);
            } else if (abstractCollection.size() > 0) {
                arrayList2 = C17880vN.A10(abstractCollection);
            }
            AnonymousClass1LG r13 = this.A01;
            abstractCollection.add(r13);
            r13.A0N(new C453828t(A002, this, 1));
            r13.A0K(viewGroup2, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass1LG) it.next()).A0H(viewGroup2);
                }
            }
            r13.A0C = AnonymousClass000.A13();
            r13.A0B = AnonymousClass000.A13();
            AnonymousClass1LN r8 = r13.A08;
            AnonymousClass1LN r6 = r13.A07;
            AnonymousClass00P r0 = r8.A02;
            AnonymousClass00O r7 = new AnonymousClass00O(0);
            r7.A09(r0);
            AnonymousClass00P r02 = r6.A02;
            AnonymousClass00O r5 = new AnonymousClass00O(0);
            r5.A09(r02);
            int i = 0;
            while (true) {
                int[] iArr = r13.A0G;
                if (i >= iArr.length) {
                    break;
                }
                int i2 = iArr[i];
                if (i2 == 1) {
                    int size = r7.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view = (View) r7.A04(size);
                        if (view != null && r13.A0T(view) && (r2 = (C62392rK) r5.remove(view)) != null && r13.A0T(r2.A00)) {
                            r13.A0C.add(r7.A05(size));
                            r13.A0B.add(r2);
                        }
                    }
                } else if (i2 == 2) {
                    AnonymousClass00P r11 = r8.A01;
                    AnonymousClass00P r10 = r6.A01;
                    int size2 = r11.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        View view2 = (View) r11.A06(i3);
                        if (view2 != null && r13.A0T(view2)) {
                            A00(r7, r5, r13, r10.get(r11.A04(i3)), view2);
                        }
                    }
                } else if (i2 == 3) {
                    SparseArray sparseArray = r8.A00;
                    SparseArray sparseArray2 = r6.A00;
                    int size3 = sparseArray.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        View view3 = (View) sparseArray.valueAt(i4);
                        if (view3 != null && r13.A0T(view3)) {
                            A00(r7, r5, r13, sparseArray2.get(sparseArray.keyAt(i4)), view3);
                        }
                    }
                } else if (i2 == 4) {
                    C001100p r12 = r8.A03;
                    C001100p r112 = r6.A03;
                    int A003 = r12.A00();
                    for (int i5 = 0; i5 < A003; i5++) {
                        View view4 = (View) r12.A04(i5);
                        if (view4 != null && r13.A0T(view4)) {
                            A00(r7, r5, r13, r112.A05(r12.A02(i5)), view4);
                        }
                    }
                }
                i++;
            }
            for (int i6 = 0; i6 < r7.size(); i6++) {
                C62392rK r1 = (C62392rK) r7.A06(i6);
                if (r13.A0T(r1.A00)) {
                    r13.A0C.add(r1);
                    r13.A0B.add((Object) null);
                }
            }
            for (int i7 = 0; i7 < r5.size(); i7++) {
                C62392rK r14 = (C62392rK) r5.A06(i7);
                if (r13.A0T(r14.A00)) {
                    r13.A0B.add(r14);
                    r13.A0C.add((Object) null);
                }
            }
            AnonymousClass00P A004 = AnonymousClass1LG.A00();
            int size4 = A004.size();
            C24493C6l c6l = C25446Cfx.A02;
            C65152vv r52 = new C65152vv(viewGroup2);
            for (int i8 = size4 - 1; i8 >= 0; i8--) {
                Animator animator = (Animator) A004.A04(i8);
                if (!(animator == null || (r9 = (C49792Ry) A004.get(animator)) == null || r9.A00 == null || !r52.equals(r9.A03))) {
                    C62392rK r82 = r9.A02;
                    View view5 = r9.A00;
                    C62392rK A06 = r13.A06(view5, true);
                    C62392rK A05 = r13.A05(view5, true);
                    if (!(A06 == null && A05 == null && (A05 = (C62392rK) r13.A07.A02.get(view5)) == null) && r9.A01.A0U(r82, A05)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            A004.remove(animator);
                        }
                    }
                }
            }
            r13.A0J(viewGroup2, r13.A08, r13.A07, r13.A0C, r13.A0B);
            r13.A0A();
        }
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A00;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = C29191bl.A02;
        ViewGroup viewGroup2 = this.A00;
        arrayList.remove(viewGroup2);
        AbstractCollection abstractCollection = (AbstractCollection) C29191bl.A00().get(viewGroup2);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1LG) it.next()).A0H(viewGroup2);
            }
        }
        AnonymousClass1LG r2 = this.A01;
        AnonymousClass1LN r1 = r2.A08;
        r1.A02.clear();
        r1.A00.clear();
        r2.A08.A03.A07();
    }
}
