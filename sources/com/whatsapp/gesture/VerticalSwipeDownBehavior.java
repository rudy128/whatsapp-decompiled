package com.whatsapp.gesture;

import X.AnonymousClass1Xr;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C23731Hk;
import X.C41501wV;
import X.C41511wY;
import X.C42181xl;
import X.C70943Dc;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.collections.observablelistview.ObservableListView;
import java.lang.ref.WeakReference;

public class VerticalSwipeDownBehavior extends C41501wV {
    public float A00;
    public float A01;
    public int A02 = -1;
    public C41511wY A03;
    public boolean A04;
    public WeakReference A05;
    public final C18140vp A06;

    private void A01(float f) {
        int computeVerticalScrollOffset;
        int A002;
        boolean z;
        WeakReference weakReference = this.A05;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view instanceof ObservableListView) {
                ObservableListView observableListView = (ObservableListView) view;
                computeVerticalScrollOffset = observableListView.A04;
                A002 = observableListView.getFirstVisiblePosition();
            } else if (view instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) view;
                computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                A002 = C42181xl.A00(recyclerView);
            } else {
                return;
            }
            float f2 = (float) computeVerticalScrollOffset;
            if (A002 == 0 || f2 == 0.0f) {
                int intValue = ((Number) this.A06.get()).intValue();
                float f3 = this.A00;
                float f4 = (float) intValue;
                if (f - f3 > f4 && !this.A04) {
                    this.A01 = f3 + f4;
                    z = true;
                } else {
                    return;
                }
            } else {
                z = false;
            }
            this.A04 = z;
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.1Hk, java.lang.Object] */
    public VerticalSwipeDownBehavior(Context context, C18030ve r7) {
        C23731Hk r4;
        boolean A052 = C18020vd.A05(C18040vf.A02, r7, 8426);
        C70943Dc r0 = new C70943Dc(context, 8);
        if (A052) {
            r4 = C23731Hk.A00(r0);
        } else {
            Object obj = r0.get();
            ? obj2 = new Object();
            C17960vV.A0G(obj != null, "Either a provider or instance must be specified.");
            obj2.A01 = null;
            obj2.A00 = obj;
            r4 = obj2;
        }
        C18070vi.A0b(r4);
        this.A06 = r4;
    }

    private View A00(View view) {
        if (AnonymousClass1Xr.A06(view) || (view instanceof AbsListView)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View A002 = A00(viewGroup.getChildAt(i));
                if (A002 != null) {
                    return A002;
                }
            }
        }
        return null;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.A02;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        A01(motionEvent.getY(findPointerIndex));
                    }
                    return false;
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.A02) {
                            int i2 = 0;
                            if (actionIndex == 0) {
                                i2 = 1;
                            }
                            this.A02 = motionEvent.getPointerId(i2);
                        }
                    }
                }
            }
            this.A04 = false;
            this.A02 = -1;
        } else {
            int pointerId = motionEvent.getPointerId(0);
            this.A02 = pointerId;
            this.A04 = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 >= 0) {
                this.A00 = motionEvent.getY(findPointerIndex2);
            }
            return false;
        }
        return this.A04;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c8, code lost:
        if (r0 < 0) goto L_0x00ca;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r7, android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9) {
        /*
            r6 = this;
            int r2 = r7.getActionMasked()
            r5 = 1
            r1 = 0
            if (r2 == 0) goto L_0x00cb
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r2 == r5) goto L_0x007e
            r0 = 2
            if (r2 == r0) goto L_0x002f
            r0 = 3
            if (r2 == r0) goto L_0x00ca
            r0 = 5
            if (r2 == r0) goto L_0x00c4
            r0 = 6
            if (r2 != r0) goto L_0x002e
            int r2 = r7.getActionIndex()
            int r1 = r7.getPointerId(r2)
            int r0 = r6.A02
            if (r1 != r0) goto L_0x002e
            r0 = 0
            if (r2 != 0) goto L_0x0028
            r0 = 1
        L_0x0028:
            int r0 = r7.getPointerId(r0)
            r6.A02 = r0
        L_0x002e:
            return r5
        L_0x002f:
            int r0 = r6.A02
            int r0 = r7.findPointerIndex(r0)
            if (r0 < 0) goto L_0x00ca
            float r2 = r7.getY(r0)
            r6.A01(r2)
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x002e
            float r0 = r6.A01
            float r2 = r2 - r0
            float r2 = r2 * r3
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            X.1wY r0 = r6.A03
            if (r0 == 0) goto L_0x002e
            com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior r4 = r0.A00
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x005e
            r4.A01 = r5
            X.1wT r0 = r4.A07
            r0.COu()
            r4.A00 = r2
        L_0x005e:
            float r0 = r4.A00
            float r2 = r2 - r0
            int r3 = (int) r2
            int r2 = r4.A02
            if (r3 >= r1) goto L_0x007a
            r3 = 0
        L_0x0067:
            android.view.View r1 = r4.A05
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r0.height = r3
            r1.setLayoutParams(r0)
            android.view.View r1 = r4.A04
            int r3 = r3 - r2
            float r0 = (float) r3
            r1.setTranslationY(r0)
            return r5
        L_0x007a:
            if (r3 <= r2) goto L_0x0067
            r3 = r2
            goto L_0x0067
        L_0x007e:
            int r0 = r6.A02
            int r2 = r7.findPointerIndex(r0)
            if (r2 < 0) goto L_0x00ca
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00bc
            r6.A04 = r1
            float r2 = r7.getY(r2)
            float r0 = r6.A01
            float r2 = r2 - r0
            float r2 = r2 * r3
            X.1wY r0 = r6.A03
            if (r0 == 0) goto L_0x00bc
            com.whatsapp.conversation.gesture.VerticalSwipeToRevealBehavior r4 = r0.A00
            float r0 = r4.A00
            float r2 = r2 - r0
            int r3 = (int) r2
            int r0 = r4.A02
            r2 = 0
            if (r3 >= r1) goto L_0x00c0
            r3 = 0
        L_0x00a4:
            int r0 = r4.A03
            if (r3 < r0) goto L_0x00a9
            r2 = 1
        L_0x00a9:
            X.1wT r0 = r4.A07
            r0.COt(r2)
            if (r2 == 0) goto L_0x00bc
            android.widget.LinearLayout r0 = r4.A06
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            X.1qK r2 = (X.C37891qK) r2
            r0 = 0
            r2.A00(r0)
        L_0x00bc:
            r0 = -1
            r6.A02 = r0
            return r1
        L_0x00c0:
            if (r3 <= r0) goto L_0x00a4
            r3 = r0
            goto L_0x00a4
        L_0x00c4:
            int r0 = r7.getActionIndex()
            if (r0 >= 0) goto L_0x0028
        L_0x00ca:
            return r1
        L_0x00cb:
            int r0 = r7.getPointerId(r1)
            r6.A02 = r0
            r6.A04 = r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gesture.VerticalSwipeDownBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        coordinatorLayout.A0F(view, i);
        View A002 = A00(view);
        if (A002 == null) {
            return true;
        }
        this.A05 = new WeakReference(A002);
        return true;
    }
}
