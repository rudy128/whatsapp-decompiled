package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cmw  reason: case insensitive filesystem */
public abstract class C25842Cmw {
    public Object A03(Object obj) {
        if (this instanceof FragmentTransitionSupport) {
            if (obj != null) {
                return ((AnonymousClass1LG) obj).clone();
            }
            return null;
        } else if (obj != null) {
            return ((Transition) obj).clone();
        } else {
            return null;
        }
    }

    public Object A04(Object obj) {
        if (this instanceof FragmentTransitionSupport) {
            if (obj == null) {
                return null;
            }
            C29051bX r0 = new C29051bX();
            r0.A0a((AnonymousClass1LG) obj);
            return r0;
        } else if (obj == null) {
            return null;
        } else {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addTransition((Transition) obj);
            return transitionSet;
        }
    }

    public void A05(View view, Object obj) {
        if (this instanceof FragmentTransitionSupport) {
            FragmentTransitionSupport fragmentTransitionSupport = (FragmentTransitionSupport) this;
            if (view != null) {
                Rect A07 = AnonymousClass3MW.A07();
                A01(view, A07);
                ((AnonymousClass1LG) obj).A0M(new BMU(A07, fragmentTransitionSupport, 0));
                return;
            }
            return;
        }
        BLT blt = (BLT) this;
        if (view != null) {
            Rect A072 = AnonymousClass3MW.A07();
            A01(view, A072);
            ((Transition) obj).setEpicenterCallback(new C22631BGr(A072, blt, 0));
        }
    }

    public void A06(Object obj, Object obj2, Object obj3, ArrayList arrayList, ArrayList arrayList2) {
        Object obj4 = obj2;
        Object obj5 = obj3;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        if (this instanceof FragmentTransitionSupport) {
            ((AnonymousClass1LG) obj).A0N(new BMX((FragmentTransitionSupport) this, obj4, obj5, arrayList3, arrayList4));
        } else {
            ((Transition) obj).addListener(new D4W((BLT) this, obj4, obj5, arrayList3, arrayList4));
        }
    }

    public void A07(Object obj, ArrayList arrayList) {
        Object obj2;
        if (this instanceof FragmentTransitionSupport) {
            AnonymousClass1LG r5 = (AnonymousClass1LG) obj;
            if (r5 != null) {
                int i = 0;
                if (r5 instanceof C29051bX) {
                    C29051bX r52 = (C29051bX) r5;
                    int size = r52.A02.size();
                    while (i < size) {
                        if (i >= 0) {
                            ArrayList arrayList2 = r52.A02;
                            if (i < arrayList2.size()) {
                                obj2 = arrayList2.get(i);
                                A07(obj2, arrayList);
                                i++;
                            }
                        }
                        obj2 = null;
                        A07(obj2, arrayList);
                        i++;
                    }
                    return;
                }
                ArrayList arrayList3 = r5.A0D;
                if (arrayList3 == null || arrayList3.isEmpty()) {
                    ArrayList arrayList4 = r5.A0E;
                    if (arrayList4 == null || arrayList4.isEmpty()) {
                        ArrayList arrayList5 = r5.A0F;
                        if (arrayList5 == null || arrayList5.isEmpty()) {
                            int size2 = arrayList.size();
                            while (i < size2) {
                                r5.A0E(BE6.A0R(arrayList, i));
                                i++;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i2 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i2 < transitionCount) {
                    A07(transitionSet.getTransitionAt(i2), arrayList);
                    i2++;
                }
            } else if (!BLT.A00(transition)) {
                List<View> targets = transition.getTargets();
                if (targets == null || targets.isEmpty()) {
                    int size3 = arrayList.size();
                    while (i2 < size3) {
                        transition.addTarget(BE6.A0R(arrayList, i2));
                        i2++;
                    }
                }
            }
        }
    }

    public boolean A08(Object obj) {
        if (this instanceof FragmentTransitionSupport) {
            return obj instanceof AnonymousClass1LG;
        }
        return obj instanceof Transition;
    }

    public static void A01(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF A08 = AnonymousClass3MW.A08();
            BE7.A13(A08, C108945cZ.A03(view), view.getHeight());
            view.getMatrix().mapRect(A08);
            A08.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                A08.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(A08);
                A08.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] A1W = C108945cZ.A1W();
            view.getRootView().getLocationOnScreen(A1W);
            A08.offset((float) BE6.A0I(A1W), (float) A1W[1]);
            rect.set(Math.round(A08.left), Math.round(A08.top), Math.round(A08.right), Math.round(A08.bottom));
        }
    }

    public static void A02(View view, List list) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (list.get(i) != view) {
                i++;
            } else {
                return;
            }
        }
        if (AnonymousClass1Xr.A02(view) != null) {
            list.add(view);
        }
        for (int i2 = size; i2 < list.size(); i2++) {
            View view2 = (View) list.get(i2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = viewGroup.getChildAt(i3);
                    int i4 = 0;
                    while (true) {
                        if (i4 < size) {
                            if (list.get(i4) == childAt) {
                                break;
                            }
                            i4++;
                        } else if (AnonymousClass1Xr.A02(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }
}
