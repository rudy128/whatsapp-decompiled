package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5nY  reason: invalid class name and case insensitive filesystem */
public class C113685nY extends C37971qU {
    public static AccelerateDecelerateInterpolator A0E;
    public C125676bV A00;
    public ArrayList A01 = AnonymousClass000.A13();
    public ArrayList A02 = AnonymousClass000.A13();
    public ArrayList A03 = AnonymousClass000.A13();
    public ArrayList A04 = AnonymousClass000.A13();
    public ArrayList A05 = AnonymousClass000.A13();
    public ArrayList A06 = AnonymousClass000.A13();
    public ArrayList A07 = AnonymousClass000.A13();
    public boolean A08 = false;
    public boolean A09 = false;
    public ArrayList A0A = AnonymousClass000.A13();
    public ArrayList A0B = AnonymousClass000.A13();
    public ArrayList A0C = AnonymousClass000.A13();
    public ArrayList A0D = AnonymousClass000.A13();

    public long A09() {
        return 200;
    }

    public long A0A() {
        return 200;
    }

    public long A0B() {
        return 300;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.6Ua, java.lang.Object] */
    public boolean A0M(C42011xT r14, C42011xT r15, int i, int i2, int i3, int i4) {
        C42011xT r8 = r14;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (r14 == r15) {
            return A0L(r8, i5, i6, i7, i8);
        }
        View view = r14.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A00(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A00(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.A0B;
        ? obj = new Object();
        obj.A05 = r14;
        obj.A04 = r15;
        obj.A00 = i5;
        obj.A01 = i6;
        obj.A02 = i7;
        obj.A03 = i8;
        arrayList.add(obj);
        return true;
    }

    private void A00(C42011xT r3) {
        if (A0E == null) {
            A0E = new AccelerateDecelerateInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0E);
        A0E(r3);
    }

    public static void A01(C42011xT r2, C113685nY r3) {
        if (r2 instanceof C113615nN) {
            ((C113615nN) r2).A0D(0);
        }
        C108975cc.A0s(r2.A0H);
        r3.A08(r2);
    }

    private boolean A04(C42011xT r5, C123336Ua r6) {
        if (r6.A04 == r5) {
            r6.A04 = null;
        } else if (r6.A05 != r5) {
            return false;
        } else {
            r6.A05 = null;
        }
        C108995ce.A0t(r5.A0H);
        A08(r5);
        return true;
    }

    public void A0C() {
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C42011xT r1 = ((AnonymousClass6UP) arrayList.get(size)).A04;
            C108975cc.A0w(r1.A0H, this, r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A0D;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A08((C42011xT) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A0A;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            A01((C42011xT) arrayList3.get(size3), this);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A0B;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C123336Ua r12 = (C123336Ua) arrayList4.get(size4);
            C42011xT r0 = r12.A05;
            if (r0 != null) {
                A04(r0, r12);
            }
            C42011xT r02 = r12.A04;
            if (r02 != null) {
                A04(r02, r12);
            }
        }
        arrayList4.clear();
        if (A0F()) {
            ArrayList arrayList5 = this.A06;
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
                        C42011xT r13 = ((AnonymousClass6UP) abstractList.get(size6)).A04;
                        C108975cc.A0w(r13.A0H, this, r13);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A02;
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
                        A01((C42011xT) abstractList2.get(size8), this);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A04;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C123336Ua r14 = (C123336Ua) abstractList3.get(size10);
                            C42011xT r03 = r14.A05;
                            if (r03 != null) {
                                A04(r03, r14);
                            }
                            C42011xT r04 = r14.A04;
                            if (r04 != null) {
                                A04(r04, r14);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A03(this.A07);
                    A03(this.A05);
                    A03(this.A01);
                    A03(this.A03);
                    A07();
                    return;
                }
            }
        }
    }

    public void A0D() {
        long j;
        long j2;
        ArrayList arrayList = this.A0D;
        boolean A1X = C17880vN.A1X(arrayList);
        ArrayList arrayList2 = this.A0C;
        boolean A1X2 = C17880vN.A1X(arrayList2);
        ArrayList arrayList3 = this.A0B;
        boolean A1X3 = C17880vN.A1X(arrayList3);
        ArrayList arrayList4 = this.A0A;
        boolean A1X4 = C17880vN.A1X(arrayList4);
        if (A1X || A1X2 || A1X4 || A1X3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C42011xT r7 = (C42011xT) it.next();
                if (this.A09) {
                    A08(r7);
                    A0N();
                } else {
                    View view = r7.A0H;
                    ViewPropertyAnimator animate = view.animate();
                    this.A07.add(r7);
                    animate.setDuration(300).scaleX(0.0f).scaleY(0.0f).setListener(new C109185cx(view, animate, r7, this, 4)).start();
                }
            }
            arrayList.clear();
            if (A1X2) {
                ArrayList A13 = AnonymousClass000.A13();
                A13.addAll(arrayList2);
                this.A06.add(A13);
                arrayList2.clear();
                C21431Ajy ajy = new C21431Ajy(this, A13, 8);
                if (A1X) {
                    ((AnonymousClass6UP) A13.get(0)).A04.A0H.postOnAnimationDelayed(ajy, 300);
                } else {
                    ajy.run();
                }
            }
            if (A1X3) {
                ArrayList A132 = AnonymousClass000.A13();
                A132.addAll(arrayList3);
                this.A04.add(A132);
                arrayList3.clear();
                C21431Ajy ajy2 = new C21431Ajy(this, A132, 9);
                if (A1X) {
                    ((C123336Ua) A132.get(0)).A05.A0H.postOnAnimationDelayed(ajy2, 300);
                } else {
                    ajy2.run();
                }
            }
            if (A1X4) {
                ArrayList A133 = AnonymousClass000.A13();
                A133.addAll(arrayList4);
                this.A02.add(A133);
                arrayList4.clear();
                C21431Ajy ajy3 = new C21431Ajy(this, A133, 10);
                if (A1X || A1X2 || A1X3) {
                    long j3 = 0;
                    if (A1X) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    if (A1X2) {
                        j2 = 200;
                    } else {
                        j2 = 0;
                    }
                    if (A1X3) {
                        j3 = 200;
                    }
                    ((C42011xT) A133.get(0)).A0H.postOnAnimationDelayed(ajy3, j + Math.max(j2, j3));
                    return;
                }
                ajy3.run();
            }
        }
    }

    public void A0E(C42011xT r7) {
        View view = r7.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass6UP) arrayList.get(size)).A04 == r7) {
                C108975cc.A0w(view, this, r7);
                arrayList.remove(size);
            }
        }
        A02(r7, this.A0B);
        if (this.A0D.remove(r7)) {
            C108975cc.A0s(view);
            A08(r7);
        }
        if (this.A0A.remove(r7)) {
            A01(r7, this);
        }
        ArrayList arrayList2 = this.A04;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A02(r7, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A06;
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
                } else if (((AnonymousClass6UP) abstractList.get(size4)).A04 == r7) {
                    C108975cc.A0w(view, this, r7);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A02;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
                if (abstractCollection.remove(r7)) {
                    A01(r7, this);
                    if (abstractCollection.isEmpty()) {
                        arrayList5.remove(size5);
                    }
                }
            } else {
                this.A07.remove(r7);
                this.A01.remove(r7);
                this.A03.remove(r7);
                this.A05.remove(r7);
                A0N();
                return;
            }
        }
    }

    public boolean A0F() {
        if (!this.A0A.isEmpty() || !this.A0B.isEmpty() || !this.A0C.isEmpty() || !this.A0D.isEmpty() || !this.A05.isEmpty() || !this.A07.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty() || !this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.6UP, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r1 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.C42011xT r4, int r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            android.view.View r2 = r4.A0H
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r5 = r5 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r6 = r6 + r0
            r3.A00(r4)
            int r0 = r7 - r5
            int r1 = r8 - r6
            if (r0 != 0) goto L_0x001e
            if (r1 != 0) goto L_0x0025
            r3.A08(r4)
            r0 = 0
            return r0
        L_0x001e:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x002a
        L_0x0025:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x002a:
            java.util.ArrayList r1 = r3.A0C
            X.6UP r0 = new X.6UP
            r0.<init>()
            r0.A04 = r4
            r0.A00 = r5
            r0.A01 = r6
            r0.A02 = r7
            r0.A03 = r8
            r1.add(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113685nY.A0L(X.1xT, int, int, int, int):boolean");
    }

    private void A02(C42011xT r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C123336Ua r1 = (C123336Ua) list.get(size);
                if (A04(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public static void A03(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C42011xT) list.get(size)).A0H.animate().cancel();
            } else {
                return;
            }
        }
    }

    public boolean A0G(C42011xT r3, List list) {
        if (!list.isEmpty() || A0J(r3)) {
            return true;
        }
        return false;
    }

    public boolean A0I(C42011xT r2) {
        A00(r2);
        this.A0D.add(r2);
        return true;
    }

    public boolean A0K(C42011xT r3) {
        A00(r3);
        if (!this.A09) {
            View view = r3.A0H;
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        } else if (r3 instanceof C113615nN) {
            ((C113615nN) r3).A0D(4);
        }
        this.A0A.add(r3);
        return true;
    }

    public void A0N() {
        C125676bV r0;
        if (!A0F()) {
            A07();
            if (this.A08 && (r0 = this.A00) != null) {
                CallGrid callGrid = r0.A00;
                if (callGrid.A0n.A03) {
                    Log.i("CallGrid/resizeGridView, callGridAdapter.notifyDataSetChanged()");
                    RecyclerView recyclerView = callGrid.A0l;
                    if (recyclerView.A01 > 0 || recyclerView.getScrollState() != 0) {
                        recyclerView.post(new C146427Pb(callGrid, 1));
                    } else {
                        callGrid.A06.notifyDataSetChanged();
                    }
                }
            }
            this.A08 = false;
        }
    }
}
