package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1LG  reason: invalid class name */
public abstract class AnonymousClass1LG implements Cloneable {
    public static ThreadLocal A0M = new ThreadLocal();
    public static final AnonymousClass1LJ A0N = new AnonymousClass1LJ();
    public static final int[] A0O = {2, 1, 3, 4};
    public long A00 = -1;
    public long A01 = -1;
    public TimeInterpolator A02 = null;
    public AnonymousClass1LJ A03 = A0N;
    public AnonymousClass2S1 A04;
    public AnonymousClass1LO A05;
    public C29051bX A06 = null;
    public AnonymousClass1LN A07 = new AnonymousClass1LN();
    public AnonymousClass1LN A08 = new AnonymousClass1LN();
    public String A09 = getClass().getName();
    public ArrayList A0A = new ArrayList();
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D = new ArrayList();
    public ArrayList A0E = null;
    public ArrayList A0F = new ArrayList();
    public int[] A0G = A0O;
    public int A0H = 0;
    public ArrayList A0I = new ArrayList();
    public ArrayList A0J = null;
    public boolean A0K = false;
    public boolean A0L = false;

    /* renamed from: A04 */
    public AnonymousClass1LG clone() {
        try {
            AnonymousClass1LG r1 = (AnonymousClass1LG) super.clone();
            r1.A0I = new ArrayList();
            r1.A08 = new AnonymousClass1LN();
            r1.A07 = new AnonymousClass1LN();
            r1.A0C = null;
            r1.A0B = null;
            return r1;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.00O, X.00P, java.lang.Object] */
    public static AnonymousClass00P A00() {
        ThreadLocal threadLocal = A0M;
        AnonymousClass00P r1 = (AnonymousClass00P) threadLocal.get();
        if (r1 != null) {
            return r1;
        }
        ? r12 = new AnonymousClass00O(0);
        threadLocal.set(r12);
        return r12;
    }

    public static void A01(View view, C62392rK r7, AnonymousClass1LN r8) {
        r8.A02.put(view, r7);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = r8.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String A022 = AnonymousClass1Xr.A02(view);
        if (A022 != null) {
            AnonymousClass00P r1 = r8.A01;
            if (r1.containsKey(A022)) {
                r1.put(A022, (Object) null);
            } else {
                r1.put(A022, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C001100p r4 = r8.A03;
                if (r4.A01(itemIdAtPosition) >= 0) {
                    View view2 = (View) r4.A05(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        r4.A0A(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                r4.A0A(itemIdAtPosition, view);
            }
        }
    }

    private void A02(View view, boolean z) {
        AnonymousClass1LN r0;
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C62392rK r1 = new C62392rK(view);
                if (z) {
                    A0S(r1);
                } else {
                    A0Q(r1);
                }
                r1.A01.add(this);
                A0R(r1);
                if (z) {
                    r0 = this.A08;
                } else {
                    r0 = this.A07;
                }
                A01(view, r1, r0);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A02(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.2Rz, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        if (r2 != r13) goto L_0x00bc;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator A03(android.view.ViewGroup r18, X.C62392rK r19, X.C62392rK r20) {
        /*
            r17 = this;
            r5 = r17
            boolean r0 = r5 instanceof X.C29121be
            r1 = r19
            r3 = r20
            if (r0 == 0) goto L_0x0061
            r7 = 0
            if (r19 == 0) goto L_0x005d
            if (r20 == 0) goto L_0x005d
            android.view.View r0 = r1.A00
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x005d
            android.view.View r4 = r3.A00
            boolean r0 = r4 instanceof android.widget.TextView
            if (r0 == 0) goto L_0x005d
            java.util.Map r2 = r1.A02
            java.util.Map r6 = r3.A02
            java.lang.String r1 = "android:textscale:scale"
            java.lang.Object r0 = r2.get(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x005e
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r2 = r0.floatValue()
        L_0x0033:
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r6.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r3 = r0.floatValue()
        L_0x0043:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x005d
            r0 = 2
            float[] r1 = new float[r0]
            r0 = 0
            r1[r0] = r2
            r0 = 1
            r1[r0] = r3
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r1)
            r1 = 6
            X.CxY r0 = new X.CxY
            r0.<init>(r4, r5, r1)
            r7.addUpdateListener(r0)
        L_0x005d:
            return r7
        L_0x005e:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0033
        L_0x0061:
            boolean r0 = r5 instanceof X.C29081ba
            if (r0 == 0) goto L_0x018b
            X.1ba r5 = (X.C29081ba) r5
            if (r19 == 0) goto L_0x0189
            if (r20 == 0) goto L_0x0189
            java.util.Map r9 = r1.A02
            java.util.Map r15 = r3.A02
            java.lang.String r0 = "android:changeBounds:parent"
            java.lang.Object r1 = r9.get(r0)
            java.lang.Object r0 = r15.get(r0)
            if (r1 == 0) goto L_0x0189
            if (r0 == 0) goto L_0x0189
            android.view.View r4 = r3.A00
            java.lang.String r0 = "android:changeBounds:bounds"
            java.lang.Object r3 = r9.get(r0)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.lang.Object r0 = r15.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r14 = r3.left
            int r1 = r0.left
            int r2 = r3.top
            int r13 = r0.top
            int r6 = r3.right
            int r11 = r0.right
            int r12 = r3.bottom
            int r10 = r0.bottom
            int r16 = r6 - r14
            int r8 = r12 - r2
            int r7 = r11 - r1
            int r3 = r10 - r13
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r9 = r9.get(r0)
            java.lang.Object r0 = r15.get(r0)
            if (r16 == 0) goto L_0x00b3
            if (r8 != 0) goto L_0x00b7
        L_0x00b3:
            if (r7 == 0) goto L_0x0186
            if (r3 == 0) goto L_0x0186
        L_0x00b7:
            if (r14 != r1) goto L_0x00bc
            r15 = 0
            if (r2 == r13) goto L_0x00bd
        L_0x00bc:
            r15 = 1
        L_0x00bd:
            if (r6 != r11) goto L_0x00c1
            if (r12 == r10) goto L_0x00c3
        L_0x00c1:
            int r15 = r15 + 1
        L_0x00c3:
            if (r9 == 0) goto L_0x0180
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0182
        L_0x00cb:
            if (r15 <= 0) goto L_0x0189
            r9 = 2
            X.C25446Cfx.A00(r4, r14, r2, r6, r12)
            if (r15 != r9) goto L_0x0156
            r0 = r16
            if (r0 != r7) goto L_0x010a
            if (r8 != r3) goto L_0x010a
            float r3 = (float) r14
            float r2 = (float) r2
            float r1 = (float) r1
            float r0 = (float) r13
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r6.moveTo(r3, r2)
            r6.lineTo(r1, r0)
            android.util.Property r1 = X.C29081ba.A02
        L_0x00ea:
            r0 = 0
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r4, r1, r0, r6)
        L_0x00ef:
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0109
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 1
            X.C61132pB.A01(r1, r0)
            X.5nh r0 = new X.5nh
            r0.<init>(r1, r5)
            r5.A0N(r0)
        L_0x0109:
            return r3
        L_0x010a:
            X.2Rz r8 = new X.2Rz
            r8.<init>()
            r8.A06 = r4
            float r7 = (float) r14
            float r3 = (float) r2
            float r1 = (float) r1
            float r0 = (float) r13
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r2.moveTo(r7, r3)
            r2.lineTo(r1, r0)
            android.util.Property r1 = X.C29081ba.A04
            r0 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r8, r1, r0, r2)
            float r6 = (float) r6
            float r3 = (float) r12
            float r1 = (float) r11
            float r0 = (float) r10
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r2.moveTo(r6, r3)
            r2.lineTo(r1, r0)
            android.util.Property r1 = X.C29081ba.A01
            r0 = 0
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r8, r1, r0, r2)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r9]
            r0 = 0
            r1[r0] = r7
            r0 = 1
            r1[r0] = r2
            r3.playTogether(r1)
            X.25n r0 = new X.25n
            r0.<init>(r8, r5)
            r3.addListener(r0)
            goto L_0x00ef
        L_0x0156:
            if (r14 != r1) goto L_0x016d
            if (r2 != r13) goto L_0x016d
            float r3 = (float) r6
            float r2 = (float) r12
            float r1 = (float) r11
            float r0 = (float) r10
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r6.moveTo(r3, r2)
            r6.lineTo(r1, r0)
            android.util.Property r1 = X.C29081ba.A00
            goto L_0x00ea
        L_0x016d:
            float r3 = (float) r14
            float r2 = (float) r2
            float r1 = (float) r1
            float r0 = (float) r13
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r6.moveTo(r3, r2)
            r6.lineTo(r1, r0)
            android.util.Property r1 = X.C29081ba.A03
            goto L_0x00ea
        L_0x0180:
            if (r0 == 0) goto L_0x00cb
        L_0x0182:
            int r15 = r15 + 1
            goto L_0x00cb
        L_0x0186:
            r15 = 0
            goto L_0x00c3
        L_0x0189:
            r3 = 0
            return r3
        L_0x018b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LG.A03(android.view.ViewGroup, X.2rK, X.2rK):android.animation.Animator");
    }

    public C62392rK A05(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C29051bX r0 = this.A06;
        if (r0 != null) {
            return r0.A05(view, z);
        }
        if (z) {
            arrayList = this.A0C;
        } else {
            arrayList = this.A0B;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C62392rK r1 = (C62392rK) arrayList.get(i);
            if (r1 == null) {
                return null;
            }
            if (r1.A00 != view) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                if (z) {
                    arrayList2 = this.A0B;
                } else {
                    arrayList2 = this.A0C;
                }
                return (C62392rK) arrayList2.get(i);
            }
        }
        return null;
    }

    public C62392rK A06(View view, boolean z) {
        AnonymousClass1LN r0;
        C29051bX r02 = this.A06;
        if (r02 != null) {
            return r02.A06(view, z);
        }
        if (z) {
            r0 = this.A08;
        } else {
            r0 = this.A07;
        }
        return (C62392rK) r0.A02.get(view);
    }

    public String A07(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        long j = this.A00;
        if (j != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(j);
            sb2.append(") ");
            obj = sb2.toString();
        }
        long j2 = this.A01;
        if (j2 != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(j2);
            sb3.append(") ");
            obj = sb3.toString();
        }
        TimeInterpolator timeInterpolator = this.A02;
        if (timeInterpolator != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(timeInterpolator);
            sb4.append(") ");
            obj = sb4.toString();
        }
        ArrayList arrayList = this.A0D;
        if (arrayList.size() <= 0 && this.A0F.size() <= 0) {
            return obj;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("tgts(");
        String obj2 = sb5.toString();
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(", ");
                    obj2 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj2);
                sb7.append(arrayList.get(i));
                obj2 = sb7.toString();
            }
        }
        ArrayList arrayList2 = this.A0F;
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append(", ");
                    obj2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj2);
                sb9.append(arrayList2.get(i2));
                obj2 = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj2);
        sb10.append(")");
        return sb10.toString();
    }

    public void A08() {
        ArrayList arrayList = this.A0A;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.A0J;
        if (arrayList2 != null && arrayList2.size() > 0) {
            AbstractList abstractList = (AbstractList) arrayList2.clone();
            int size2 = abstractList.size();
            for (int i = 0; i < size2; i++) {
                ((AnonymousClass3M3) abstractList.get(i)).C9G(this);
            }
        }
    }

    public void A09() {
        int i = this.A0H - 1;
        this.A0H = i;
        if (i == 0) {
            ArrayList arrayList = this.A0J;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((AnonymousClass3M3) abstractList.get(i2)).C9H(this);
                }
            }
            int i3 = 0;
            while (true) {
                C001100p r1 = this.A08.A03;
                if (i3 >= r1.A00()) {
                    break;
                }
                View view = (View) r1.A04(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                C001100p r12 = this.A07.A03;
                if (i4 < r12.A00()) {
                    View view2 = (View) r12.A04(i4);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                    }
                    i4++;
                } else {
                    this.A0K = true;
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.28s, X.3M3] */
    public void A0A() {
        ArrayList arrayList;
        if (this instanceof C29051bX) {
            C29051bX r5 = (C29051bX) this;
            if (r5.A02.isEmpty()) {
                r5.A0B();
                r5.A09();
                return;
            }
            ? obj = new Object();
            obj.A00 = r5;
            Iterator it = r5.A02.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1LG) it.next()).A0N(obj);
            }
            r5.A01 = r5.A02.size();
            if (!r5.A03) {
                int i = 1;
                while (true) {
                    arrayList = r5.A02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ((AnonymousClass1LG) arrayList.get(i - 1)).A0N(new C453828t(arrayList.get(i), r5, 2));
                    i++;
                }
                AnonymousClass1LG r0 = (AnonymousClass1LG) arrayList.get(0);
                if (r0 != null) {
                    r0.A0A();
                    return;
                }
                return;
            }
            Iterator it2 = r5.A02.iterator();
            while (it2.hasNext()) {
                ((AnonymousClass1LG) it2.next()).A0A();
            }
            return;
        }
        A0B();
        AnonymousClass00P A002 = A00();
        Iterator it3 = this.A0I.iterator();
        while (it3.hasNext()) {
            Animator animator = (Animator) it3.next();
            if (A002.containsKey(animator)) {
                A0B();
                if (animator != null) {
                    animator.addListener(new BEJ(A002, this, 0));
                    long j = this.A00;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.A01;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A02;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new BEQ(this, 0));
                    animator.start();
                }
            }
        }
        this.A0I.clear();
        A09();
    }

    public void A0B() {
        if (this.A0H == 0) {
            ArrayList arrayList = this.A0J;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    ((AnonymousClass3M3) abstractList.get(i)).C9K(this);
                }
            }
            this.A0K = false;
        }
        this.A0H++;
    }

    public void A0C(long j) {
        if (this instanceof C29051bX) {
            ((C29051bX) this).A0W(j);
        } else {
            this.A00 = j;
        }
    }

    public void A0D(TimeInterpolator timeInterpolator) {
        if (this instanceof C29051bX) {
            ((C29051bX) this).A0X(timeInterpolator);
        } else {
            this.A02 = timeInterpolator;
        }
    }

    public void A0E(View view) {
        this.A0F.add(view);
    }

    public void A0F(View view) {
        if (!this.A0K) {
            ArrayList arrayList = this.A0A;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.A0J;
            if (arrayList2 != null && arrayList2.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList2.clone();
                int size2 = abstractList.size();
                for (int i = 0; i < size2; i++) {
                    ((AnonymousClass3M3) abstractList.get(i)).C9I();
                }
            }
            this.A0L = true;
        }
    }

    public void A0G(View view) {
        this.A0F.remove(view);
    }

    public void A0H(View view) {
        if (this.A0L) {
            if (!this.A0K) {
                ArrayList arrayList = this.A0A;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.A0J;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    AbstractList abstractList = (AbstractList) arrayList2.clone();
                    int size2 = abstractList.size();
                    for (int i = 0; i < size2; i++) {
                        ((AnonymousClass3M3) abstractList.get(i)).C9J();
                    }
                }
            }
            this.A0L = false;
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.2Ry] */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x022b, code lost:
        if (r1 == null) goto L_0x022d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(android.view.ViewGroup r31, X.AnonymousClass1LN r32, X.AnonymousClass1LN r33, java.util.ArrayList r34, java.util.ArrayList r35) {
        /*
            r30 = this;
            r10 = r30
            boolean r0 = r10 instanceof X.C29051bX
            r29 = r31
            r28 = r33
            r27 = r34
            r26 = r35
            if (r0 == 0) goto L_0x004c
            X.1bX r10 = (X.C29051bX) r10
            long r3 = r10.A01
            java.util.ArrayList r0 = r10.A02
            int r9 = r0.size()
            r8 = 0
        L_0x0019:
            if (r8 >= r9) goto L_0x0265
            java.util.ArrayList r0 = r10.A02
            java.lang.Object r7 = r0.get(r8)
            X.1LG r7 = (X.AnonymousClass1LG) r7
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0038
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x002f
            if (r8 != 0) goto L_0x0038
        L_0x002f:
            long r1 = r7.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            long r1 = r1 + r3
            r7.A01 = r1
        L_0x0038:
            r13 = r32
            r11 = r7
            r12 = r29
            r14 = r28
            r15 = r27
            r16 = r26
            r11.A0J(r12, r13, r14, r15, r16)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x0049:
            r7.A01 = r3
            goto L_0x0038
        L_0x004c:
            X.00P r25 = A00()
            android.util.SparseIntArray r9 = new android.util.SparseIntArray
            r9.<init>()
            int r24 = r27.size()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
        L_0x005f:
            r0 = r24
            if (r8 >= r0) goto L_0x023b
            r0 = r27
            java.lang.Object r1 = r0.get(r8)
            X.2rK r1 = (X.C62392rK) r1
            r0 = r26
            java.lang.Object r4 = r0.get(r8)
            X.2rK r4 = (X.C62392rK) r4
            if (r1 == 0) goto L_0x007e
            java.util.ArrayList r0 = r1.A01
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x007e
            r1 = 0
        L_0x007e:
            if (r4 == 0) goto L_0x0089
            java.util.ArrayList r0 = r4.A01
            boolean r0 = r0.contains(r10)
            if (r0 != 0) goto L_0x0089
            r4 = 0
        L_0x0089:
            if (r1 != 0) goto L_0x0090
            if (r4 != 0) goto L_0x0098
        L_0x008d:
            int r8 = r8 + 1
            goto L_0x005f
        L_0x0090:
            if (r4 == 0) goto L_0x0098
            boolean r0 = r10.A0U(r1, r4)
            if (r0 == 0) goto L_0x008d
        L_0x0098:
            r0 = r29
            android.animation.Animator r7 = r10.A03(r0, r1, r4)
            if (r7 == 0) goto L_0x008d
            if (r4 == 0) goto L_0x0107
            android.view.View r11 = r4.A00
            java.lang.String[] r12 = r10.A0V()
            if (r12 == 0) goto L_0x0109
            int r0 = r12.length
            r16 = r0
            if (r0 <= 0) goto L_0x0109
            X.2rK r6 = new X.2rK
            r6.<init>(r11)
            r0 = r28
            X.00P r0 = r0.A02
            java.lang.Object r14 = r0.get(r11)
            X.2rK r14 = (X.C62392rK) r14
            if (r14 == 0) goto L_0x00d6
            r13 = 0
        L_0x00c1:
            java.util.Map r0 = r6.A02
            r5 = r0
            r15 = r12[r13]
            java.util.Map r0 = r14.A02
            java.lang.Object r0 = r0.get(r15)
            r5.put(r15, r0)
            int r13 = r13 + 1
            r0 = r16
            if (r13 >= r0) goto L_0x00d6
            goto L_0x00c1
        L_0x00d6:
            int r12 = r25.size()
            r5 = 0
        L_0x00db:
            if (r5 >= r12) goto L_0x010a
            r0 = r25
            java.lang.Object r13 = r0.A04(r5)
            java.lang.Object r14 = r0.get(r13)
            X.2Ry r14 = (X.C49792Ry) r14
            X.2rK r0 = r14.A02
            if (r0 == 0) goto L_0x0104
            android.view.View r0 = r14.A00
            if (r0 != r11) goto L_0x0104
            java.lang.String r13 = r14.A04
            java.lang.String r0 = r10.A09
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x0104
            X.2rK r0 = r14.A02
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0104
            goto L_0x008d
        L_0x0104:
            int r5 = r5 + 1
            goto L_0x00db
        L_0x0107:
            android.view.View r11 = r1.A00
        L_0x0109:
            r6 = 0
        L_0x010a:
            X.1LO r12 = r10.A05
            if (r12 == 0) goto L_0x0126
            X.1LP r12 = (X.AnonymousClass1LP) r12
            r22 = 0
            if (r1 != 0) goto L_0x014c
            if (r4 != 0) goto L_0x014c
            r0 = 0
        L_0x0118:
            java.util.ArrayList r4 = r10.A0I
            int r5 = r4.size()
            int r4 = (int) r0
            r9.put(r5, r4)
            long r2 = java.lang.Math.min(r0, r2)
        L_0x0126:
            java.lang.String r5 = r10.A09
            X.C6l r0 = X.C25446Cfx.A02
            X.2vv r4 = new X.2vv
            r0 = r29
            r4.<init>(r0)
            X.2Ry r1 = new X.2Ry
            r1.<init>()
            r1.A00 = r11
            r1.A04 = r5
            r1.A02 = r6
            r1.A03 = r4
            r1.A01 = r10
            r0 = r25
            r0.put(r7, r1)
            java.util.ArrayList r0 = r10.A0I
            r0.add(r7)
            goto L_0x008d
        L_0x014c:
            X.2S1 r0 = r10.A04
            if (r0 != 0) goto L_0x0235
            r21 = 0
        L_0x0152:
            r14 = 1
            if (r4 == 0) goto L_0x0169
            if (r1 == 0) goto L_0x0231
            java.util.Map r5 = r1.A02
            java.lang.String r0 = "android:visibilityPropagation:visibility"
            java.lang.Object r0 = r5.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0231
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0231
        L_0x0169:
            r13 = -1
        L_0x016a:
            r5 = 0
            if (r1 == 0) goto L_0x0229
            java.util.Map r4 = r1.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r4.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x0229
            r20 = r0[r5]
        L_0x017b:
            java.util.Map r1 = r1.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r1.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x022d
            r19 = r0[r14]
        L_0x0189:
            r1 = 2
            int[] r4 = new int[r1]
            r0 = r29
            r0.getLocationOnScreen(r4)
            r18 = r4[r5]
            float r0 = r29.getTranslationX()
            int r0 = java.lang.Math.round(r0)
            int r18 = r18 + r0
            r17 = r4[r14]
            float r0 = r29.getTranslationY()
            int r0 = java.lang.Math.round(r0)
            int r17 = r17 + r0
            int r0 = r29.getWidth()
            int r16 = r18 + r0
            int r0 = r29.getHeight()
            int r15 = r17 + r0
            if (r21 == 0) goto L_0x0222
            int r14 = r21.centerX()
            int r5 = r21.centerY()
        L_0x01bf:
            int r4 = r12.A01
            r1 = 5
            r0 = 3
            if (r4 == r0) goto L_0x0217
            if (r4 == r1) goto L_0x020c
            r0 = 48
            if (r4 == r0) goto L_0x0202
            r0 = 80
            if (r4 == r0) goto L_0x01f7
            r0 = 0
        L_0x01d0:
            float r14 = (float) r0
            r0 = 3
            if (r4 == r0) goto L_0x01f2
            if (r4 == r1) goto L_0x01f2
            int r0 = r29.getHeight()
        L_0x01da:
            float r0 = (float) r0
            float r14 = r14 / r0
            long r4 = r10.A00
            int r0 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x01e4
            r4 = 300(0x12c, double:1.48E-321)
        L_0x01e4:
            long r0 = (long) r13
            long r4 = r4 * r0
            float r1 = (float) r4
            float r0 = r12.A00
            float r1 = r1 / r0
            float r1 = r1 * r14
            int r0 = java.lang.Math.round(r1)
            long r0 = (long) r0
            goto L_0x0118
        L_0x01f2:
            int r0 = r29.getWidth()
            goto L_0x01da
        L_0x01f7:
            int r19 = r19 - r17
            int r14 = r14 - r20
            int r0 = java.lang.Math.abs(r14)
            int r0 = r0 + r19
            goto L_0x01d0
        L_0x0202:
            int r15 = r15 - r19
            int r14 = r14 - r20
            int r0 = java.lang.Math.abs(r14)
            int r0 = r0 + r15
            goto L_0x01d0
        L_0x020c:
            int r20 = r20 - r18
            int r5 = r5 - r19
            int r0 = java.lang.Math.abs(r5)
            int r0 = r0 + r20
            goto L_0x01d0
        L_0x0217:
            int r16 = r16 - r20
            int r5 = r5 - r19
            int r0 = java.lang.Math.abs(r5)
            int r0 = r0 + r16
            goto L_0x01d0
        L_0x0222:
            int r14 = r18 + r16
            int r14 = r14 / r1
            int r5 = r17 + r15
            int r5 = r5 / r1
            goto L_0x01bf
        L_0x0229:
            r20 = -1
            if (r1 != 0) goto L_0x017b
        L_0x022d:
            r19 = -1
            goto L_0x0189
        L_0x0231:
            r1 = r4
            r13 = 1
            goto L_0x016a
        L_0x0235:
            android.graphics.Rect r21 = r0.A00()
            goto L_0x0152
        L_0x023b:
            int r0 = r9.size()
            if (r0 == 0) goto L_0x0265
            r7 = 0
        L_0x0242:
            int r0 = r9.size()
            if (r7 >= r0) goto L_0x0265
            int r1 = r9.keyAt(r7)
            java.util.ArrayList r0 = r10.A0I
            java.lang.Object r6 = r0.get(r1)
            android.animation.Animator r6 = (android.animation.Animator) r6
            int r0 = r9.valueAt(r7)
            long r4 = (long) r0
            long r4 = r4 - r2
            long r0 = r6.getStartDelay()
            long r4 = r4 + r0
            r6.setStartDelay(r4)
            int r7 = r7 + 1
            goto L_0x0242
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LG.A0J(android.view.ViewGroup, X.1LN, X.1LN, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void A0K(ViewGroup viewGroup, boolean z) {
        AnonymousClass1LN r0;
        ArrayList arrayList;
        AnonymousClass1LN r02;
        AnonymousClass1LN r03;
        if (z) {
            AnonymousClass1LN r1 = this.A08;
            r1.A02.clear();
            r1.A00.clear();
            r0 = this.A08;
        } else {
            AnonymousClass1LN r12 = this.A07;
            r12.A02.clear();
            r12.A00.clear();
            r0 = this.A07;
        }
        r0.A03.A07();
        ArrayList arrayList2 = this.A0D;
        if ((arrayList2.size() > 0 || this.A0F.size() > 0) && ((arrayList = this.A0E) == null || arrayList.isEmpty())) {
            for (int i = 0; i < arrayList2.size(); i++) {
                View findViewById = viewGroup.findViewById(((Number) arrayList2.get(i)).intValue());
                if (findViewById != null) {
                    C62392rK r13 = new C62392rK(findViewById);
                    if (z) {
                        A0S(r13);
                    } else {
                        A0Q(r13);
                    }
                    r13.A01.add(this);
                    A0R(r13);
                    if (z) {
                        r03 = this.A08;
                    } else {
                        r03 = this.A07;
                    }
                    A01(findViewById, r13, r03);
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList3 = this.A0F;
                if (i2 < arrayList3.size()) {
                    View view = (View) arrayList3.get(i2);
                    C62392rK r14 = new C62392rK(view);
                    if (z) {
                        A0S(r14);
                    } else {
                        A0Q(r14);
                    }
                    r14.A01.add(this);
                    A0R(r14);
                    if (z) {
                        r02 = this.A08;
                    } else {
                        r02 = this.A07;
                    }
                    A01(view, r14, r02);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            A02(viewGroup, z);
        }
    }

    public void A0L(AnonymousClass1LJ r1) {
        if (r1 == null) {
            r1 = A0N;
        }
        this.A03 = r1;
    }

    public void A0M(AnonymousClass2S1 r5) {
        if (this instanceof C29051bX) {
            C29051bX r3 = (C29051bX) this;
            r3.A04 = r5;
            r3.A00 |= 8;
            int size = r3.A02.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass1LG) r3.A02.get(i)).A0M(r5);
            }
            return;
        }
        this.A04 = r5;
    }

    public void A0N(AnonymousClass3M3 r2) {
        ArrayList arrayList = this.A0J;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0J = arrayList;
        }
        arrayList.add(r2);
    }

    public void A0O(AnonymousClass3M3 r2) {
        ArrayList arrayList = this.A0J;
        if (arrayList != null) {
            arrayList.remove(r2);
            if (this.A0J.size() == 0) {
                this.A0J = null;
            }
        }
    }

    public void A0P(AnonymousClass1LO r5) {
        if (this instanceof C29051bX) {
            C29051bX r3 = (C29051bX) this;
            r3.A05 = r5;
            r3.A00 |= 2;
            int size = r3.A02.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass1LG) r3.A02.get(i)).A0P(r5);
            }
            return;
        }
        this.A05 = r5;
    }

    public void A0Q(C62392rK r5) {
        if (this instanceof C29121be) {
            View view = r5.A00;
            if (view instanceof TextView) {
                r5.A02.put("android:textscale:scale", Float.valueOf(view.getScaleX()));
            }
        } else if (this instanceof C29051bX) {
            C29051bX r1 = (C29051bX) this;
            View view2 = r5.A00;
            if (r1.A0T(view2)) {
                Iterator it = r1.A02.iterator();
                while (it.hasNext()) {
                    AnonymousClass1LG r12 = (AnonymousClass1LG) it.next();
                    if (r12.A0T(view2)) {
                        r12.A0Q(r5);
                        r5.A01.add(r12);
                    }
                }
            }
        } else if (!(this instanceof AnonymousClass1LH)) {
            C29081ba.A01(r5);
        } else if (((AnonymousClass1LH) this) instanceof AnonymousClass1LI) {
            AnonymousClass1LH.A01(r5);
            int[] iArr = new int[2];
            r5.A00.getLocationOnScreen(iArr);
            r5.A02.put("android:slide:screenPosition", iArr);
        } else {
            AnonymousClass1LH.A01(r5);
        }
    }

    public void A0R(C62392rK r8) {
        if (this.A05 != null) {
            Map map = r8.A02;
            if (!map.isEmpty()) {
                String[] strArr = AnonymousClass1LP.A02;
                int i = 0;
                while (map.containsKey(strArr[i])) {
                    i++;
                    if (i >= 2) {
                        return;
                    }
                }
                View view = r8.A00;
                Object obj = map.get("android:visibility:visibility");
                if (obj == null) {
                    obj = Integer.valueOf(view.getVisibility());
                }
                map.put("android:visibilityPropagation:visibility", obj);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int round = iArr[0] + Math.round(view.getTranslationX());
                iArr[0] = round;
                iArr[0] = round + (view.getWidth() / 2);
                int round2 = iArr[1] + Math.round(view.getTranslationY());
                iArr[1] = round2;
                iArr[1] = round2 + (view.getHeight() / 2);
                map.put("android:visibilityPropagation:center", iArr);
            }
        }
    }

    public void A0S(C62392rK r5) {
        Map map;
        Float valueOf;
        String str;
        if (this instanceof C29121be) {
            View view = r5.A00;
            if (view instanceof TextView) {
                map = r5.A02;
                valueOf = Float.valueOf(view.getScaleX());
                str = "android:textscale:scale";
            } else {
                return;
            }
        } else if (this instanceof C29051bX) {
            C29051bX r1 = (C29051bX) this;
            View view2 = r5.A00;
            if (r1.A0T(view2)) {
                Iterator it = r1.A02.iterator();
                while (it.hasNext()) {
                    AnonymousClass1LG r12 = (AnonymousClass1LG) it.next();
                    if (r12.A0T(view2)) {
                        r12.A0S(r5);
                        r5.A01.add(r12);
                    }
                }
                return;
            }
            return;
        } else if (this instanceof AnonymousClass1LI) {
            AnonymousClass1LH.A01(r5);
            int[] iArr = new int[2];
            r5.A00.getLocationOnScreen(iArr);
            r5.A02.put("android:slide:screenPosition", iArr);
            return;
        } else if (this instanceof C29071bZ) {
            AnonymousClass1LH.A01(r5);
            map = r5.A02;
            valueOf = Float.valueOf(C25446Cfx.A02.A00(r5.A00));
            str = "android:fade:transitionAlpha";
        } else {
            C29081ba.A01(r5);
            return;
        }
        map.put(str, valueOf);
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 171 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r10 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r3 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r2 != null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r3 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if (r0 != 0) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        if (r3 == 0) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r10 == null) goto L_0x0009;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0U(X.C62392rK r9, X.C62392rK r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass1LH
            if (r0 == 0) goto L_0x0076
            r7 = 0
            if (r9 != 0) goto L_0x000a
            if (r10 != 0) goto L_0x001d
        L_0x0009:
            return r7
        L_0x000a:
            if (r10 == 0) goto L_0x001d
            java.util.Map r0 = r10.A02
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r0.containsKey(r2)
            java.util.Map r0 = r9.A02
            boolean r0 = r0.containsKey(r2)
            if (r1 == r0) goto L_0x001d
            return r7
        L_0x001d:
            java.lang.String r6 = "android:visibility:parent"
            r5 = 0
            java.lang.String r4 = "android:visibility:visibility"
            if (r9 == 0) goto L_0x005d
            java.util.Map r1 = r9.A02
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r2 = r1.get(r6)
        L_0x003a:
            if (r10 == 0) goto L_0x005b
            java.util.Map r1 = r10.A02
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x005b
            java.lang.Object r0 = r1.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r5 = r1.get(r6)
        L_0x0052:
            if (r9 == 0) goto L_0x0060
            if (r10 == 0) goto L_0x0064
            if (r3 != r0) goto L_0x0070
            if (r2 != r5) goto L_0x0070
            return r7
        L_0x005b:
            r0 = -1
            goto L_0x0052
        L_0x005d:
            r3 = -1
            r2 = r5
            goto L_0x003a
        L_0x0060:
            if (r0 == 0) goto L_0x006b
            if (r10 != 0) goto L_0x0009
        L_0x0064:
            if (r3 != 0) goto L_0x0009
            goto L_0x0074
        L_0x0067:
            if (r5 == 0) goto L_0x006b
            if (r2 != 0) goto L_0x0009
        L_0x006b:
            if (r3 == 0) goto L_0x0074
        L_0x006d:
            if (r0 != 0) goto L_0x0009
            goto L_0x0074
        L_0x0070:
            if (r3 == r0) goto L_0x0067
            if (r3 != 0) goto L_0x006d
        L_0x0074:
            r7 = 1
            return r7
        L_0x0076:
            r6 = 0
            if (r9 == 0) goto L_0x00b0
            if (r10 == 0) goto L_0x00b0
            java.lang.String[] r5 = r8.A0V()
            if (r5 == 0) goto L_0x00b1
            int r4 = r5.length
            r3 = 0
        L_0x0083:
            if (r3 >= r4) goto L_0x00b0
            r2 = r5[r3]
            java.util.Map r0 = r9.A02
            java.lang.Object r1 = r0.get(r2)
            java.util.Map r0 = r10.A02
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L_0x009a
            if (r0 != 0) goto L_0x00af
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x0083
        L_0x009a:
            if (r0 == 0) goto L_0x00af
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0097
            goto L_0x00af
        L_0x00a5:
            if (r0 == 0) goto L_0x00af
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00bb
        L_0x00af:
            r6 = 1
        L_0x00b0:
            return r6
        L_0x00b1:
            java.util.Map r4 = r9.A02
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x00bb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r4.get(r2)
            java.util.Map r0 = r10.A02
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L_0x00a5
            if (r0 != 0) goto L_0x00af
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LG.A0U(X.2rK, X.2rK):boolean");
    }

    public String[] A0V() {
        if (this instanceof AnonymousClass1LH) {
            return AnonymousClass1LH.A01;
        }
        if (this instanceof C29081ba) {
            return C29081ba.A05;
        }
        return null;
    }

    public String toString() {
        return A07("");
    }

    public void A0I(ViewGroup viewGroup) {
        AnonymousClass00P A002 = A00();
        int size = A002.size();
        if (viewGroup != null && size != 0) {
            C24493C6l c6l = C25446Cfx.A02;
            C65152vv r3 = new C65152vv(viewGroup);
            AnonymousClass00O r2 = new AnonymousClass00O(0);
            r2.A09(A002);
            A002.clear();
            while (true) {
                size--;
                if (size >= 0) {
                    C49792Ry r1 = (C49792Ry) r2.A06(size);
                    if (r1.A00 != null && r3.equals(r1.A03)) {
                        ((Animator) r2.A04(size)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public boolean A0T(View view) {
        ArrayList arrayList;
        int id = view.getId();
        ArrayList arrayList2 = this.A0D;
        if ((arrayList2.size() == 0 && this.A0F.size() == 0 && ((arrayList = this.A0E) == null || arrayList.isEmpty())) || arrayList2.contains(Integer.valueOf(id)) || this.A0F.contains(view)) {
            return true;
        }
        ArrayList arrayList3 = this.A0E;
        if (arrayList3 == null || !arrayList3.contains(AnonymousClass1Xr.A02(view))) {
            return false;
        }
        return true;
    }
}
