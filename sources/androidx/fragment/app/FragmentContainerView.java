package androidx.fragment.app;

import X.AnonymousClass1GO;
import X.AnonymousClass1GP;
import X.AnonymousClass1GY;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.AnonymousClass1Y1;
import X.AnonymousClass2WF;
import X.C18070vi;
import X.C34001jj;
import X.C35821mr;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FragmentContainerView extends FrameLayout {
    public boolean A00;
    public View.OnApplyWindowInsetsListener A01;
    public final List A02;
    public final List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C18070vi.A0d(view, 0);
        Object tag = view.getTag(2131431001);
        if (!(tag instanceof Fragment) || tag == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        super.addView(view, i, layoutParams);
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        AnonymousClass1HO A0F;
        C18070vi.A0d(windowInsets, 0);
        AnonymousClass1HO r1 = new AnonymousClass1HO(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A01;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C18070vi.A0X(onApplyWindowInsets);
            A0F = new AnonymousClass1HO(onApplyWindowInsets);
        } else {
            A0F = AnonymousClass1HF.A0F(this, r1);
        }
        if (!A0F.A00.A0C()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AnonymousClass1HF.A0E(getChildAt(i), A0F);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        if (this.A00) {
            for (View drawChild : this.A02) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        C18070vi.A0d(canvas, 0);
        C18070vi.A0d(view, 1);
        if (this.A00) {
            List list = this.A02;
            if ((!list.isEmpty()) && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void endViewTransition(View view) {
        C18070vi.A0d(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A00 = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        return r1.A0O(getId());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment getFragment() {
        /*
            r3 = this;
            r1 = r3
        L_0x0001:
            if (r1 == 0) goto L_0x0030
            r0 = 2131431001(0x7f0b0e59, float:1.8483719E38)
            java.lang.Object r2 = r1.getTag(r0)
            boolean r0 = r2 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L_0x0025
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2.A1b()
            if (r0 == 0) goto L_0x004e
            X.1GP r1 = r2.A1E()
        L_0x001c:
            int r0 = r3.getId()
            androidx.fragment.app.Fragment r0 = r1.A0O(r0)
            return r0
        L_0x0025:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0030
            android.view.View r1 = (android.view.View) r1
            goto L_0x0001
        L_0x0030:
            android.content.Context r1 = r3.getContext()
        L_0x0034:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1 instanceof X.AnonymousClass1FL
            if (r0 == 0) goto L_0x0047
            X.1FL r1 = (X.AnonymousClass1FL) r1
            if (r1 == 0) goto L_0x0072
            X.1Gb r0 = r1.A03
            X.1GO r0 = r0.A00
            X.1GP r1 = r0.A03
            goto L_0x001c
        L_0x0047:
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L_0x0034
        L_0x004e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "The Fragment "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " that owns View "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has already been destroyed. Nested fragments should always use the child FragmentManager."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "View "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is not within a subclass of FragmentActivity."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentContainerView.getFragment():androidx.fragment.app.Fragment");
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C18070vi.A0d(windowInsets, 0);
        return windowInsets;
    }

    public void removeView(View view) {
        C18070vi.A0d(view, 0);
        A00(view);
        super.removeView(view);
    }

    public void removeViewInLayout(View view) {
        C18070vi.A0d(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C18070vi.A0d(onApplyWindowInsetsListener, 0);
        this.A01 = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C18070vi.A0d(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }

    private final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C18070vi.A0X(childAt);
            A00(childAt);
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C18070vi.A0X(childAt);
            A00(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C18070vi.A0X(childAt);
                A00(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C18070vi.A0X(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.A00 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AnonymousClass1GP r9) {
        super(context, attributeSet);
        View view;
        String str;
        C18070vi.A0d(context, 1);
        C18070vi.A0d(attributeSet, 2);
        C18070vi.A0d(r9, 3);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = AnonymousClass2WF.A01;
        C18070vi.A0Z(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment A0O = r9.A0O(id);
        if (classAttribute != null && A0O == null) {
            if (id == -1) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            AnonymousClass1GY A0R = r9.A0R();
            context.getClassLoader();
            Fragment A002 = A0R.A00(classAttribute);
            C18070vi.A0X(A002);
            A002.A03 = id;
            A002.A01 = id;
            A002.A0T = string;
            A002.A0I = r9;
            AnonymousClass1GO r0 = r9.A08;
            A002.A0G = r0;
            A002.A0X = true;
            if (r0 != null) {
                A002.A0X = false;
                A002.A0X = true;
            }
            C34001jj r1 = new C34001jj(r9);
            r1.A0G = true;
            A002.A0C = this;
            A002.A0e = true;
            r1.A0C(A002, string, getId());
            r1.A04();
        }
        Iterator it = r9.A0U.A02().iterator();
        while (it.hasNext()) {
            C35821mr r3 = (C35821mr) it.next();
            Fragment fragment = r3.A02;
            if (fragment.A01 == getId() && (view = fragment.A0B) != null && view.getParent() == null) {
                fragment.A0C = this;
                r3.A01();
                r3.A03();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C18070vi.A0d(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = AnonymousClass2WF.A01;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                StringBuilder sb = new StringBuilder();
                sb.append("FragmentContainerView must be within a FragmentActivity to use ");
                sb.append(str);
                sb.append("=\"");
                sb.append(classAttribute);
                sb.append('\"');
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}
