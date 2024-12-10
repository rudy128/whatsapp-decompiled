package androidx.appcompat.widget;

import X.AnonymousClass01U;
import X.AnonymousClass02C;
import X.AnonymousClass02D;
import X.AnonymousClass035;
import X.AnonymousClass038;
import X.AnonymousClass039;
import X.AnonymousClass03A;
import X.AnonymousClass03D;
import X.AnonymousClass03E;
import X.AnonymousClass03G;
import X.AnonymousClass03H;
import X.AnonymousClass03I;
import X.AnonymousClass03J;
import X.AnonymousClass03K;
import X.AnonymousClass03L;
import X.AnonymousClass03N;
import X.AnonymousClass03O;
import X.AnonymousClass03P;
import X.AnonymousClass03Q;
import X.AnonymousClass03R;
import X.AnonymousClass0S3;
import X.AnonymousClass1FG;
import X.AnonymousClass1G8;
import X.AnonymousClass1GW;
import X.C002501d;
import X.C002801g;
import X.C003301m;
import X.C004301w;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;

public class Toolbar extends ViewGroup implements AnonymousClass1FG {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public ImageButton A07;
    public ImageView A08;
    public AnonymousClass01U A09;
    public ActionMenuView A0A;
    public AnonymousClass038 A0B;
    public AnonymousClass03O A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public boolean A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public Context A0M;
    public ColorStateList A0N;
    public ColorStateList A0O;
    public Drawable A0P;
    public ImageButton A0Q;
    public TextView A0R;
    public OnBackInvokedCallback A0S;
    public OnBackInvokedDispatcher A0T;
    public C004301w A0U;
    public AnonymousClass03I A0V;
    public AnonymousClass03D A0W;
    public AnonymousClass03K A0X;
    public CharSequence A0Y;
    public ArrayList A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public final AnonymousClass1G8 A0d;
    public final Runnable A0e;
    public final AnonymousClass035 A0f;
    public final ArrayList A0g;
    public final ArrayList A0h;
    public final int[] A0i;
    public TextView mTitleTextView;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Toolbar(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r10 = r13
            r7 = r14
            r9 = r15
            r12 = r16
            r13.<init>(r14, r15, r12)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r13.A01 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0h = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0g = r0
            r0 = 2
            int[] r0 = new int[r0]
            r13.A0i = r0
            X.034 r1 = new X.034
            r1.<init>(r13)
            X.1G8 r0 = new X.1G8
            r0.<init>(r1)
            r13.A0d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A0Z = r0
            X.036 r0 = new X.036
            r0.<init>(r13)
            r13.A0f = r0
            X.037 r0 = new X.037
            r0.<init>(r13)
            r13.A0e = r0
            android.content.Context r0 = r13.getContext()
            int[] r11 = X.C002501d.A0O
            r2 = 0
            X.01c r3 = X.C002401c.A00(r0, r15, r11, r12, r2)
            android.content.res.TypedArray r8 = r3.A02
            X.AnonymousClass1HF.A0K(r7, r8, r9, r10, r11, r12)
            r0 = 28
            int r0 = r8.getResourceId(r0, r2)
            r13.A0L = r0
            r0 = 19
            int r0 = r8.getResourceId(r0, r2)
            r13.A0K = r0
            int r0 = r13.A01
            int r0 = r8.getInteger(r2, r0)
            r13.A01 = r0
            r1 = 2
            r0 = 48
            int r0 = r8.getInteger(r1, r0)
            r13.A00 = r0
            r0 = 22
            int r1 = r8.getDimensionPixelOffset(r0, r2)
            r0 = 27
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0086
            r0 = 27
            int r1 = r8.getDimensionPixelOffset(r0, r1)
        L_0x0086:
            r13.A02 = r1
            r13.A05 = r1
            r13.A03 = r1
            r13.A04 = r1
            r0 = 25
            r1 = -1
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0099
            r13.A04 = r0
        L_0x0099:
            r0 = 24
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00a3
            r13.A03 = r0
        L_0x00a3:
            r0 = 26
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00ad
            r13.A05 = r0
        L_0x00ad:
            r0 = 23
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00b7
            r13.A02 = r0
        L_0x00b7:
            r0 = 13
            int r0 = r8.getDimensionPixelSize(r0, r1)
            r13.A0I = r0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 9
            int r6 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 5
            int r5 = r8.getDimensionPixelOffset(r0, r7)
            r0 = 7
            int r4 = r8.getDimensionPixelSize(r0, r2)
            r0 = 8
            int r1 = r8.getDimensionPixelSize(r0, r2)
            X.038 r0 = r13.A0B
            if (r0 != 0) goto L_0x00e2
            X.038 r0 = new X.038
            r0.<init>()
            r13.A0B = r0
        L_0x00e2:
            r0.A06 = r2
            if (r4 == r7) goto L_0x00ea
            r0.A01 = r4
            r0.A03 = r4
        L_0x00ea:
            if (r1 == r7) goto L_0x00f0
            r0.A02 = r1
            r0.A04 = r1
        L_0x00f0:
            if (r6 != r7) goto L_0x00f4
            if (r5 == r7) goto L_0x00f7
        L_0x00f4:
            r0.A00(r6, r5)
        L_0x00f7:
            r0 = 10
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A0H = r0
            r0 = 6
            int r0 = r8.getDimensionPixelOffset(r0, r7)
            r13.A0G = r0
            r0 = 4
            android.graphics.drawable.Drawable r0 = r3.A03(r0)
            r13.A0P = r0
            r0 = 3
            java.lang.CharSequence r0 = r8.getText(r0)
            r13.A0Y = r0
            r0 = 21
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0123
            r13.setTitle((java.lang.CharSequence) r1)
        L_0x0123:
            r0 = 18
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0132
            r13.setSubtitle((java.lang.CharSequence) r1)
        L_0x0132:
            android.content.Context r0 = r13.getContext()
            r13.A0M = r0
            r0 = 17
            int r0 = r8.getResourceId(r0, r2)
            r13.setPopupTheme(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x014c
            r13.setNavigationIcon((android.graphics.drawable.Drawable) r0)
        L_0x014c:
            r0 = 15
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x015b
            r13.setNavigationContentDescription((java.lang.CharSequence) r1)
        L_0x015b:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x0166
            r13.setLogo((android.graphics.drawable.Drawable) r0)
        L_0x0166:
            r0 = 12
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0175
            r13.setLogoDescription((java.lang.CharSequence) r1)
        L_0x0175:
            r1 = 29
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0184
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setTitleTextColor((android.content.res.ColorStateList) r0)
        L_0x0184:
            r1 = 20
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0193
            android.content.res.ColorStateList r0 = r3.A01(r1)
            r13.setSubtitleTextColor((android.content.res.ColorStateList) r0)
        L_0x0193:
            r0 = 14
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x01a4
            r0 = 14
            int r0 = r8.getResourceId(r0, r2)
            r13.A0N(r0)
        L_0x01a4:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.ViewGroup$MarginLayoutParams, X.039] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.03A, android.view.ViewGroup$MarginLayoutParams, X.039] */
    /* JADX WARNING: type inference failed for: r2v2, types: [X.03A, android.view.ViewGroup$MarginLayoutParams, X.039] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.03A, android.view.ViewGroup$MarginLayoutParams, X.039] */
    public static AnonymousClass03A A05(ViewGroup.LayoutParams layoutParams) {
        int i;
        AnonymousClass03A r2;
        if (layoutParams instanceof AnonymousClass03A) {
            AnonymousClass03A r3 = (AnonymousClass03A) layoutParams;
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(r3);
            marginLayoutParams.A00 = 0;
            marginLayoutParams.A00 = r3.A00;
            marginLayoutParams.A00 = 0;
            i = r3.A00;
            r2 = marginLayoutParams;
        } else if (layoutParams instanceof AnonymousClass039) {
            AnonymousClass039 r32 = (AnonymousClass039) layoutParams;
            ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams(r32);
            marginLayoutParams2.A00 = 0;
            marginLayoutParams2.A00 = r32.A00;
            marginLayoutParams2.A00 = 0;
            return marginLayoutParams2;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            ? marginLayoutParams4 = new ViewGroup.MarginLayoutParams(marginLayoutParams3);
            marginLayoutParams4.A00 = 0;
            marginLayoutParams4.A00 = 0;
            marginLayoutParams4.leftMargin = marginLayoutParams3.leftMargin;
            marginLayoutParams4.topMargin = marginLayoutParams3.topMargin;
            marginLayoutParams4.rightMargin = marginLayoutParams3.rightMargin;
            marginLayoutParams4.bottomMargin = marginLayoutParams3.bottomMargin;
            return marginLayoutParams4;
        } else {
            ? marginLayoutParams5 = new ViewGroup.MarginLayoutParams(layoutParams);
            i = 0;
            marginLayoutParams5.A00 = 0;
            r2 = marginLayoutParams5;
        }
        r2.A00 = i;
        return r2;
    }

    private void A07() {
        if (this.A0A == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.A0A = actionMenuView;
            actionMenuView.setPopupTheme(this.A0J);
            ActionMenuView actionMenuView2 = this.A0A;
            actionMenuView2.A03 = this.A0f;
            actionMenuView2.setMenuCallbacks(this.A0U, new AnonymousClass03E(this));
            AnonymousClass03A r2 = new AnonymousClass03A();
            r2.A00 = (this.A00 & 112) | 8388613;
            this.A0A.setLayoutParams(r2);
            A0B(this.A0A, false);
        }
    }

    private void A08() {
        if (this.A0Q == null) {
            this.A0Q = new AppCompatImageButton(getContext(), (AttributeSet) null, 2130971616);
            AnonymousClass03A r2 = new AnonymousClass03A();
            r2.A00 = (this.A00 & 112) | 8388611;
            this.A0Q.setLayoutParams(r2);
        }
    }

    private boolean A0E(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    public void A0F() {
        ArrayList arrayList = this.A0g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public void A0G() {
        AnonymousClass03G r0;
        AnonymousClass03D r02 = this.A0W;
        if (r02 != null && (r0 = r02.A01) != null) {
            r0.collapseActionView();
        }
    }

    public void A0H() {
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView != null) {
            actionMenuView.A0G();
        }
    }

    public void A0I() {
        if (this.A07 == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), (AttributeSet) null, 2130971616);
            this.A07 = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.A0P);
            this.A07.setContentDescription(this.A0Y);
            AnonymousClass03A r2 = new AnonymousClass03A();
            r2.A00 = (this.A00 & 112) | 8388611;
            r2.A00 = 2;
            this.A07.setLayoutParams(r2);
            this.A07.setOnClickListener(new AnonymousClass03H(this));
        }
    }

    public void A0J() {
        Iterator it = this.A0Z.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        A09();
    }

    public void A0L() {
        AnonymousClass038 r1 = this.A0B;
        if (r1 == null) {
            r1 = new AnonymousClass038();
            this.A0B = r1;
        }
        r1.A06 = false;
        r1.A01 = 0;
        r1.A03 = 0;
        r1.A02 = 0;
        r1.A04 = 0;
    }

    public void A0M() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher A002 = AnonymousClass03Q.A00(this);
            if (!A0S() || A002 == null || !isAttachedToWindow() || !this.A0a) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.A0T;
                if (onBackInvokedDispatcher != null) {
                    AnonymousClass03Q.A03(onBackInvokedDispatcher, this.A0S);
                    A002 = null;
                } else {
                    return;
                }
            } else if (this.A0T == null) {
                AnonymousClass0S3 r0 = this.A0S;
                if (r0 == null) {
                    r0 = AnonymousClass03Q.A01(new AnonymousClass03R(this));
                    this.A0S = r0;
                }
                AnonymousClass03Q.A02(A002, r0);
            } else {
                return;
            }
            this.A0T = A002;
        }
    }

    public void A0O(int i, int i2) {
        AnonymousClass038 r0 = this.A0B;
        if (r0 == null) {
            r0 = new AnonymousClass038();
            this.A0B = r0;
        }
        r0.A00(i, i2);
    }

    public void A0P(Context context, int i) {
        this.A0K = i;
        TextView textView = this.A0R;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void A0Q(Context context, int i) {
        this.A0L = i;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public boolean A0S() {
        AnonymousClass03D r0 = this.A0W;
        if (r0 == null || r0.A01 == null) {
            return false;
        }
        return true;
    }

    public boolean A0T() {
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView == null || !actionMenuView.A0H()) {
            return false;
        }
        return true;
    }

    public boolean A0U() {
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView == null || !actionMenuView.A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0V() {
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView == null || !actionMenuView.A0J()) {
            return false;
        }
        return true;
    }

    public boolean A0W() {
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView == null || !actionMenuView.A0K()) {
            return false;
        }
        return true;
    }

    public void BBL(AnonymousClass1GW r2) {
        this.A0d.A03(r2);
    }

    public void CEn(AnonymousClass1GW r2) {
        this.A0d.A04(r2);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new AnonymousClass03A();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A07;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A07;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        AnonymousClass038 r1 = this.A0B;
        if (r1 == null) {
            return 0;
        }
        if (r1.A07) {
            return r1.A03;
        }
        return r1.A04;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A0G;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        AnonymousClass038 r0 = this.A0B;
        if (r0 != null) {
            return r0.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        AnonymousClass038 r0 = this.A0B;
        if (r0 != null) {
            return r0.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        AnonymousClass038 r1 = this.A0B;
        if (r1 == null) {
            return 0;
        }
        if (r1.A07) {
            return r1.A04;
        }
        return r1.A03;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A0H;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        C003301m A0E2;
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView == null || (A0E2 = actionMenuView.A0E()) == null || !A0E2.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.A0G, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.A08;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A08;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0Q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0Q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public AnonymousClass03J getWrapper() {
        AnonymousClass03K r1 = this.A0X;
        if (r1 != null) {
            return r1;
        }
        AnonymousClass03K r12 = new AnonymousClass03K(this, true);
        this.A0X = r12;
        return r12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0287 A[LOOP:1: B:102:0x0285->B:103:0x0287, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02a4 A[LOOP:2: B:105:0x02a2->B:106:0x02a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ed A[LOOP:3: B:113:0x02eb->B:114:0x02ed, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01a3 A[LOOP:0: B:69:0x01a1->B:70:0x01a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0254  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r8 = r21
            int r1 = r8.getLayoutDirection()
            r5 = 0
            r0 = 1
            r20 = 0
            if (r1 != r0) goto L_0x000e
            r20 = 1
        L_0x000e:
            int r19 = r8.getWidth()
            int r3 = r8.getHeight()
            int r10 = r8.getPaddingLeft()
            int r18 = r8.getPaddingRight()
            int r1 = r8.getPaddingTop()
            int r17 = r8.getPaddingBottom()
            int r11 = r19 - r18
            r4 = r11
            int[] r7 = r8.A0i
            r7[r0] = r5
            r7[r5] = r5
            int r0 = r8.getMinimumHeight()
            if (r0 < 0) goto L_0x0279
            int r2 = r26 - r24
            int r9 = java.lang.Math.min(r0, r2)
        L_0x003b:
            android.widget.ImageButton r0 = r8.A0Q
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x004b
            android.widget.ImageButton r0 = r8.A0Q
            if (r20 == 0) goto L_0x0273
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x004b:
            r12 = r10
        L_0x004c:
            android.widget.ImageButton r0 = r8.A07
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x005c
            android.widget.ImageButton r0 = r8.A07
            if (r20 == 0) goto L_0x026d
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x005c:
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0A
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x006c
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0A
            if (r20 == 0) goto L_0x0267
            int r12 = r8.A02(r0, r7, r12, r9)
        L_0x006c:
            int r6 = r8.getCurrentContentInsetLeft()
            int r13 = r8.getCurrentContentInsetRight()
            int r0 = r6 - r12
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            int r0 = r4 - r11
            int r0 = r13 - r0
            int r2 = java.lang.Math.max(r5, r0)
            r0 = 1
            r7[r0] = r2
            int r6 = java.lang.Math.max(r12, r6)
            int r4 = r4 - r13
            int r11 = java.lang.Math.min(r11, r4)
            android.view.View r0 = r8.A06
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x00a0
            android.view.View r0 = r8.A06
            if (r20 == 0) goto L_0x0261
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x00a0:
            android.widget.ImageView r0 = r8.A08
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x00b0
            android.widget.ImageView r0 = r8.A08
            if (r20 == 0) goto L_0x025b
            int r11 = r8.A03(r0, r7, r11, r9)
        L_0x00b0:
            android.widget.TextView r0 = r8.mTitleTextView
            boolean r16 = r8.A0E(r0)
            android.widget.TextView r0 = r8.A0R
            boolean r15 = r8.A0E(r0)
            if (r16 == 0) goto L_0x00d2
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r5 = r2.topMargin
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
        L_0x00d2:
            if (r15 == 0) goto L_0x00e9
            android.widget.TextView r0 = r8.A0R
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r2 = r4.topMargin
            android.widget.TextView r0 = r8.A0R
            int r0 = r0.getMeasuredHeight()
            int r2 = r2 + r0
            int r0 = r4.bottomMargin
            int r2 = r2 + r0
            int r5 = r5 + r2
        L_0x00e9:
            if (r16 != 0) goto L_0x0254
            if (r15 == 0) goto L_0x0195
            android.widget.TextView r2 = r8.A0R
        L_0x00ef:
            android.widget.TextView r0 = r8.A0R
        L_0x00f1:
            android.view.ViewGroup$LayoutParams r13 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            if (r16 == 0) goto L_0x0107
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x0111
        L_0x0107:
            if (r15 == 0) goto L_0x0251
            android.widget.TextView r0 = r8.A0R
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0251
        L_0x0111:
            r14 = 1
        L_0x0112:
            int r0 = r8.A01
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x0245
            r0 = 80
            if (r2 == r0) goto L_0x0239
            int r0 = r3 - r1
            int r0 = r0 - r17
            int r0 = r0 - r5
            int r4 = r0 / 2
            int r2 = r13.topMargin
            int r0 = r8.A05
            int r2 = r2 + r0
            if (r4 >= r2) goto L_0x0221
            r4 = r2
        L_0x012d:
            int r1 = r1 + r4
        L_0x012e:
            if (r20 == 0) goto L_0x01b7
            if (r14 == 0) goto L_0x01b4
            int r4 = r8.A04
        L_0x0134:
            r3 = 1
            r0 = r7[r3]
            int r4 = r4 - r0
            r2 = 0
            int r0 = java.lang.Math.max(r2, r4)
            int r11 = r11 - r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r2, r0)
            r7[r3] = r0
            if (r16 == 0) goto L_0x01b2
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.widget.TextView r0 = r8.mTitleTextView
            int r0 = r0.getMeasuredWidth()
            int r4 = r11 - r0
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r4, r1, r11, r2)
            int r0 = r8.A03
            int r4 = r4 - r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x016a:
            if (r15 == 0) goto L_0x01b0
            android.widget.TextView r0 = r8.A0R
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0R
            int r0 = r0.getMeasuredWidth()
            int r3 = r11 - r0
            android.widget.TextView r0 = r8.A0R
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0R
            r0.layout(r3, r1, r11, r2)
            int r0 = r8.A03
            int r0 = r11 - r0
        L_0x018f:
            if (r14 == 0) goto L_0x0195
            int r11 = java.lang.Math.min(r4, r0)
        L_0x0195:
            r5 = 0
        L_0x0196:
            java.util.ArrayList r4 = r8.A0h
            r0 = 3
            r8.A0C(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x01a1:
            if (r1 >= r2) goto L_0x027c
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A02(r0, r7, r6, r9)
            int r1 = r1 + 1
            goto L_0x01a1
        L_0x01b0:
            r0 = r11
            goto L_0x018f
        L_0x01b2:
            r4 = r11
            goto L_0x016a
        L_0x01b4:
            r4 = 0
            goto L_0x0134
        L_0x01b7:
            if (r14 == 0) goto L_0x021e
            int r2 = r8.A04
            r5 = 0
        L_0x01bc:
            r0 = r7[r5]
            int r2 = r2 - r0
            int r0 = java.lang.Math.max(r5, r2)
            int r6 = r6 + r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            if (r16 == 0) goto L_0x021c
            android.widget.TextView r0 = r8.mTitleTextView
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            android.widget.TextView r0 = r8.mTitleTextView
            int r4 = r0.getMeasuredWidth()
            int r4 = r4 + r6
            android.widget.TextView r0 = r8.mTitleTextView
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.mTitleTextView
            r0.layout(r6, r1, r4, r2)
            int r0 = r8.A03
            int r4 = r4 + r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x01ef:
            if (r15 == 0) goto L_0x021a
            android.widget.TextView r0 = r8.A0R
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0R
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r6
            android.widget.TextView r0 = r8.A0R
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0R
            r0.layout(r6, r1, r3, r2)
            int r0 = r8.A03
            int r3 = r3 + r0
        L_0x0212:
            if (r14 == 0) goto L_0x0196
            int r6 = java.lang.Math.max(r4, r3)
            goto L_0x0196
        L_0x021a:
            r3 = r6
            goto L_0x0212
        L_0x021c:
            r4 = r6
            goto L_0x01ef
        L_0x021e:
            r5 = 0
            r2 = 0
            goto L_0x01bc
        L_0x0221:
            int r3 = r3 - r17
            int r3 = r3 - r5
            int r3 = r3 - r4
            int r3 = r3 - r1
            int r0 = r13.bottomMargin
            int r2 = r8.A02
            int r0 = r0 + r2
            if (r3 >= r0) goto L_0x012d
            int r0 = r12.bottomMargin
            int r0 = r0 + r2
            int r0 = r0 - r3
            int r4 = r4 - r0
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            goto L_0x012d
        L_0x0239:
            int r3 = r3 - r17
            int r0 = r12.bottomMargin
            int r3 = r3 - r0
            int r0 = r8.A02
            int r3 = r3 - r0
            int r1 = r3 - r5
            goto L_0x012e
        L_0x0245:
            int r1 = r8.getPaddingTop()
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r8.A05
            int r1 = r1 + r0
            goto L_0x012e
        L_0x0251:
            r14 = 0
            goto L_0x0112
        L_0x0254:
            android.widget.TextView r2 = r8.mTitleTextView
            if (r15 != 0) goto L_0x00ef
            r0 = r2
            goto L_0x00f1
        L_0x025b:
            int r6 = r8.A02(r0, r7, r6, r9)
            goto L_0x00b0
        L_0x0261:
            int r6 = r8.A02(r0, r7, r6, r9)
            goto L_0x00a0
        L_0x0267:
            int r11 = r8.A03(r0, r7, r11, r9)
            goto L_0x006c
        L_0x026d:
            int r12 = r8.A02(r0, r7, r12, r9)
            goto L_0x005c
        L_0x0273:
            int r12 = r8.A02(r0, r7, r10, r9)
            goto L_0x004c
        L_0x0279:
            r9 = 0
            goto L_0x003b
        L_0x027c:
            r0 = 5
            r8.A0C(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x0285:
            if (r1 >= r2) goto L_0x0294
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r11 = r8.A03(r0, r7, r11, r9)
            int r1 = r1 + 1
            goto L_0x0285
        L_0x0294:
            r0 = 1
            r8.A0C(r4, r0)
            r17 = r7[r5]
            r16 = r7[r0]
            int r13 = r4.size()
            r12 = 0
            r3 = 0
        L_0x02a2:
            if (r12 >= r13) goto L_0x02d4
            java.lang.Object r14 = r4.get(r12)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r0 = r1.leftMargin
            int r0 = r0 - r17
            int r15 = r1.rightMargin
            int r15 = r15 - r16
            int r2 = java.lang.Math.max(r5, r0)
            int r1 = java.lang.Math.max(r5, r15)
            int r0 = -r0
            int r17 = java.lang.Math.max(r5, r0)
            int r0 = -r15
            int r16 = java.lang.Math.max(r5, r0)
            int r0 = r14.getMeasuredWidth()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r3 = r3 + r2
            int r12 = r12 + 1
            goto L_0x02a2
        L_0x02d4:
            int r19 = r19 - r10
            int r19 = r19 - r18
            int r0 = r19 / 2
            int r10 = r10 + r0
            int r0 = r3 / 2
            int r10 = r10 - r0
            int r3 = r3 + r10
            if (r10 < r6) goto L_0x02e7
            r6 = r10
            if (r3 <= r11) goto L_0x02e7
            int r3 = r3 - r11
            int r6 = r10 - r3
        L_0x02e7:
            int r1 = r4.size()
        L_0x02eb:
            if (r5 >= r1) goto L_0x02fa
            java.lang.Object r0 = r4.get(r5)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A02(r0, r7, r6, r9)
            int r5 = r5 + 1
            goto L_0x02eb
        L_0x02fa:
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0i;
        boolean z = C002801g.A01;
        char c = 1;
        if (getLayoutDirection() != 1) {
            c = 0;
        }
        int i9 = 0;
        char c2 = c ^ 1;
        int i10 = i;
        int i11 = i2;
        if (A0E(this.A0Q)) {
            A0A(this.A0Q, i10, 0, i11, this.A0I);
            int measuredWidth = this.A0Q.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A0Q.getLayoutParams();
            i3 = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            i4 = Math.max(0, this.A0Q.getMeasuredHeight() + A00(this.A0Q));
            i5 = View.combineMeasuredStates(0, this.A0Q.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0E(this.A07)) {
            A0A(this.A07, i10, 0, i11, this.A0I);
            int measuredWidth2 = this.A07.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A07.getLayoutParams();
            i3 = measuredWidth2 + marginLayoutParams2.getMarginStart() + marginLayoutParams2.getMarginEnd();
            i4 = Math.max(i4, this.A07.getMeasuredHeight() + A00(this.A07));
            i5 = View.combineMeasuredStates(i5, this.A07.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[c] = Math.max(0, currentContentInsetStart - i3);
        if (A0E(this.A0A)) {
            A0A(this.A0A, i10, max, i11, this.A0I);
            int measuredWidth3 = this.A0A.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A0A.getLayoutParams();
            i6 = measuredWidth3 + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            i4 = Math.max(i4, this.A0A.getMeasuredHeight() + A00(this.A0A));
            i5 = View.combineMeasuredStates(i5, this.A0A.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c2] = Math.max(0, currentContentInsetEnd - i6);
        if (A0E(this.A06)) {
            max2 += A04(this.A06, iArr, i10, max2, i11, 0);
            i4 = Math.max(i4, this.A06.getMeasuredHeight() + A00(this.A06));
            i5 = View.combineMeasuredStates(i5, this.A06.getMeasuredState());
        }
        if (A0E(this.A08)) {
            max2 += A04(this.A08, iArr, i10, max2, i11, 0);
            i4 = Math.max(i4, this.A08.getMeasuredHeight() + A00(this.A08));
            i5 = View.combineMeasuredStates(i5, this.A08.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((AnonymousClass03A) childAt.getLayoutParams()).A00 == 0 && A0E(childAt)) {
                max2 += A04(childAt, iArr, i10, max2, i11, 0);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + A00(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.A05 + this.A02;
        int i14 = this.A04 + this.A03;
        if (A0E(this.mTitleTextView)) {
            A04(this.mTitleTextView, iArr, i10, max2 + i14, i11, i13);
            int measuredWidth4 = this.mTitleTextView.getMeasuredWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) this.mTitleTextView.getLayoutParams();
            i7 = measuredWidth4 + marginLayoutParams4.getMarginStart() + marginLayoutParams4.getMarginEnd();
            i8 = this.mTitleTextView.getMeasuredHeight() + A00(this.mTitleTextView);
            i5 = View.combineMeasuredStates(i5, this.mTitleTextView.getMeasuredState());
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0E(this.A0R)) {
            i7 = Math.max(i7, A04(this.A0R, iArr, i10, max2 + i14, i11, i8 + i13));
            i8 += this.A0R.getMeasuredHeight() + A00(this.A0R);
            i5 = View.combineMeasuredStates(i5, this.A0R.getMeasuredState());
        }
        int max3 = Math.max(i4, i8);
        int paddingLeft = max2 + i7 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, -16777216 & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i5 << 16);
        if (this.A0F) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (A0E(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C003301m r2;
        MenuItem findItem;
        if (!(parcelable instanceof AnonymousClass03L)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass03L r4 = (AnonymousClass03L) parcelable;
        super.onRestoreInstanceState(r4.A00());
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView != null) {
            r2 = actionMenuView.A0E();
        } else {
            r2 = null;
        }
        int i = r4.A00;
        if (!(i == 0 || this.A0W == null || r2 == null || (findItem = r2.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (r4.A01) {
            Runnable runnable = this.A0e;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass03G r0;
        Parcelable.Creator creator = AnonymousClass03L.CREATOR;
        AnonymousClass03L r1 = new AnonymousClass03L(super.onSaveInstanceState());
        AnonymousClass03D r02 = this.A0W;
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            r1.A00 = r0.getItemId();
        }
        r1.A01 = A0V();
        return r1;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.A0a != z) {
            this.A0a = z;
            A0M();
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A0I();
            this.A07.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A07;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.A0P);
        }
    }

    public void setCollapsible(boolean z) {
        this.A0F = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0G) {
            this.A0G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.A0H) {
            this.A0H = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A08;
            if (imageView == null) {
                imageView = new AppCompatImageView(getContext(), (AttributeSet) null);
                this.A08 = imageView;
            }
            if (!A0D(imageView)) {
                A0B(this.A08, true);
            }
        } else {
            ImageView imageView2 = this.A08;
            if (imageView2 != null && A0D(imageView2)) {
                removeView(this.A08);
                this.A0g.remove(this.A08);
            }
        }
        ImageView imageView3 = this.A08;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setMenu(C003301m r5, AnonymousClass03I r6) {
        if (r5 != null || this.A0A != null) {
            A07();
            C003301m A0E2 = this.A0A.A0E();
            if (A0E2 != r5) {
                if (A0E2 != null) {
                    A0E2.A0W(this.A0V);
                    A0E2.A0W(this.A0W);
                }
                if (this.A0W == null) {
                    this.A0W = new AnonymousClass03D(this);
                }
                r6.A0H(true);
                Context context = this.A0M;
                if (r5 != null) {
                    r5.A0N(context, r6);
                    r5.A0N(this.A0M, this.A0W);
                } else {
                    r6.BdO(context, (C003301m) null);
                    this.A0W.BdO(this.A0M, (C003301m) null);
                    r6.CQu(true);
                    this.A0W.CQu(true);
                }
                this.A0A.setPopupTheme(this.A0J);
                this.A0A.setPresenter(r6);
                this.A0V = r6;
                A0M();
            }
        }
    }

    public void setMenuCallbacks(C004301w r2, AnonymousClass01U r3) {
        this.A0U = r2;
        this.A09 = r3;
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(r2, r3);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A08();
            if (!A0D(this.A0Q)) {
                A0B(this.A0Q, true);
            }
        } else {
            ImageButton imageButton = this.A0Q;
            if (imageButton != null && A0D(imageButton)) {
                removeView(this.A0Q);
                this.A0g.remove(this.A0Q);
            }
        }
        ImageButton imageButton2 = this.A0Q;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A0J != i) {
            this.A0J = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A0M = contextThemeWrapper;
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0N = colorStateList;
        TextView textView = this.A0R;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.A02 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A05 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0O = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static int A00(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != 80) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A01(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r5 = r9.getLayoutParams()
            X.039 r5 = (X.AnonymousClass039) r5
            int r7 = r9.getMeasuredHeight()
            r6 = 0
            if (r10 <= 0) goto L_0x0053
            int r0 = r7 - r10
            int r3 = r0 / 2
        L_0x0011:
            int r0 = r5.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L_0x002b
            r0 = 48
            if (r1 == r0) goto L_0x0064
            r2 = 80
            if (r1 == r2) goto L_0x0055
            int r0 = r8.A01
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x0064
            if (r1 == r2) goto L_0x0055
        L_0x002b:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 / 2
            int r0 = r5.topMargin
            if (r1 >= r0) goto L_0x0044
            r1 = r0
        L_0x0042:
            int r4 = r4 + r1
            return r4
        L_0x0044:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r5.bottomMargin
            if (r2 >= r0) goto L_0x0042
            int r0 = r0 - r2
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r6, r1)
            goto L_0x0042
        L_0x0053:
            r3 = 0
            goto L_0x0011
        L_0x0055:
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r3
            return r1
        L_0x0064:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A01(android.view.View, int):int");
    }

    private int A02(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int A012 = A01(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A012, max + measuredWidth, view.getMeasuredHeight() + A012);
        return max + measuredWidth + marginLayoutParams.rightMargin;
    }

    private int A03(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A012 = A01(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A012, max, view.getMeasuredHeight() + A012);
        return max - (measuredWidth + marginLayoutParams.leftMargin);
    }

    private int A04(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void A06() {
        A07();
        ActionMenuView actionMenuView = this.A0A;
        if (actionMenuView.A0E() == null) {
            C003301m r3 = (C003301m) actionMenuView.getMenu();
            AnonymousClass03D r2 = this.A0W;
            if (r2 == null) {
                r2 = new AnonymousClass03D(this);
                this.A0W = r2;
            }
            this.A0A.setExpandedActionViewsExclusive(true);
            r3.A0N(this.A0M, r2);
            A0M();
        }
    }

    private void A09() {
        Menu menu = getMenu();
        ArrayList currentMenuItems = getCurrentMenuItems();
        this.A0d.A02(menu, getMenuInflater());
        ArrayList currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.A0Z = currentMenuItems2;
    }

    private void A0A(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void A0B(View view, boolean z) {
        AnonymousClass03A r1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r1 = new AnonymousClass03A();
        } else if (!checkLayoutParams(layoutParams)) {
            r1 = A05(layoutParams);
        } else {
            r1 = (AnonymousClass03A) layoutParams;
        }
        r1.A00 = 1;
        if (!z || this.A06 == null) {
            addView(view, r1);
            return;
        }
        view.setLayoutParams(r1);
        this.A0g.add(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0C(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getLayoutDirection()
            r7 = 0
            r6 = 1
            r1 = 0
            if (r0 != r6) goto L_0x000a
            r1 = 1
        L_0x000a:
            int r5 = r9.getChildCount()
            int r0 = r9.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r11, r0)
            r10.clear()
            if (r1 == 0) goto L_0x0053
            int r5 = r5 - r6
        L_0x001c:
            if (r5 < 0) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.03A r1 = (X.AnonymousClass03A) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004e
            boolean r0 = r9.A0E(r4)
            if (r0 == 0) goto L_0x004e
            int r0 = r1.A00
            int r3 = r9.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0051
            r1 = 3
            if (r2 == r1) goto L_0x0051
            r0 = 5
            if (r2 == r0) goto L_0x0051
            if (r3 != r6) goto L_0x0049
            r1 = 5
        L_0x0049:
            if (r1 != r8) goto L_0x004e
            r10.add(r4)
        L_0x004e:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0051:
            r1 = r2
            goto L_0x0049
        L_0x0053:
            if (r7 >= r5) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.03A r1 = (X.AnonymousClass03A) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0085
            boolean r0 = r9.A0E(r4)
            if (r0 == 0) goto L_0x0085
            int r0 = r1.A00
            int r3 = r9.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0088
            r1 = 3
            if (r2 == r1) goto L_0x0088
            r0 = 5
            if (r2 == r0) goto L_0x0088
            if (r3 != r6) goto L_0x0080
            r1 = 5
        L_0x0080:
            if (r1 != r8) goto L_0x0085
            r10.add(r4)
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0088:
            r1 = r2
            goto L_0x0080
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0C(java.util.List, int):void");
    }

    private boolean A0D(View view) {
        if (view.getParent() == this || this.A0g.contains(view)) {
            return true;
        }
        return false;
    }

    private MenuInflater getMenuInflater() {
        return new AnonymousClass02C(getContext());
    }

    public void A0K() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                if (!(((AnonymousClass03A) childAt.getLayoutParams()).A00 == 2 || childAt == this.A0A)) {
                    removeViewAt(childCount);
                    this.A0g.add(childAt);
                }
            } else {
                return;
            }
        }
    }

    public void A0N(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean A0R() {
        ActionMenuView actionMenuView;
        if (getVisibility() != 0 || (actionMenuView = this.A0A) == null || !actionMenuView.A04) {
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof AnonymousClass03A)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.03A, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.039] */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C002501d.A01);
        marginLayoutParams.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.A00 = 0;
        return marginLayoutParams;
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        if (navigationIcon != null) {
            return Math.max(contentInsetStart, Math.max(this.A0H, 0));
        }
        return contentInsetStart;
    }

    public Menu getMenu() {
        A06();
        return this.A0A.getMenu();
    }

    public View getNavButtonView() {
        return this.A0Q;
    }

    public AnonymousClass03I getOuterActionMenuPresenter() {
        return this.A0V;
    }

    public Drawable getOverflowIcon() {
        A06();
        return this.A0A.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.A0M;
    }

    public int getPopupTheme() {
        return this.A0J;
    }

    public CharSequence getSubtitle() {
        return this.A0D;
    }

    public final TextView getSubtitleTextView() {
        return this.A0R;
    }

    public CharSequence getTitle() {
        return this.A0E;
    }

    public int getTitleMarginBottom() {
        return this.A02;
    }

    public int getTitleMarginEnd() {
        return this.A03;
    }

    public int getTitleMarginStart() {
        return this.A04;
    }

    public int getTitleMarginTop() {
        return this.A05;
    }

    public final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0M();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0e);
        A0M();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0b = false;
        }
        if (!this.A0b) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0b = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0b = false;
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r5) {
        /*
            r4 = this;
            super.onRtlPropertiesChanged(r5)
            X.038 r3 = r4.A0B
            if (r3 != 0) goto L_0x000e
            X.038 r3 = new X.038
            r3.<init>()
            r4.A0B = r3
        L_0x000e:
            r2 = 1
            if (r5 == r2) goto L_0x0012
            r2 = 0
        L_0x0012:
            boolean r0 = r3.A07
            if (r2 == r0) goto L_0x002e
            r3.A07 = r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x003a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x002f
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0026
            int r0 = r3.A01
        L_0x0026:
            r3.A03 = r0
            int r0 = r3.A05
        L_0x002a:
            if (r0 == r1) goto L_0x003e
        L_0x002c:
            r3.A04 = r0
        L_0x002e:
            return
        L_0x002f:
            int r0 = r3.A05
            if (r0 != r1) goto L_0x0035
            int r0 = r3.A01
        L_0x0035:
            r3.A03 = r0
            int r0 = r3.A00
            goto L_0x002a
        L_0x003a:
            int r0 = r3.A01
            r3.A03 = r0
        L_0x003e:
            int r0 = r3.A02
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0c = false;
        }
        if (!this.A0c) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0c = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0c = false;
            return true;
        }
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0I();
        }
        ImageButton imageButton = this.A07;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A08 == null) {
            this.A08 = new AppCompatImageView(getContext(), (AttributeSet) null);
        }
        ImageView imageView = this.A08;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A08();
        }
        ImageButton imageButton = this.A0Q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            AnonymousClass03N.A00(this.A0Q, charSequence);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A08();
        this.A0Q.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        A06();
        this.A0A.setOverflowIcon(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0R;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass03P r0 = new AnonymousClass03P(context);
                this.A0R = r0;
                r0.setSingleLine();
                this.A0R.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0K;
                if (i != 0) {
                    this.A0R.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0N;
                if (colorStateList != null) {
                    this.A0R.setTextColor(colorStateList);
                }
            }
            if (!A0D(this.A0R)) {
                A0B(this.A0R, true);
            }
        } else if (textView != null && A0D(textView)) {
            removeView(this.A0R);
            this.A0g.remove(this.A0R);
        }
        TextView textView2 = this.A0R;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0D = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.mTitleTextView;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass03P r0 = new AnonymousClass03P(context);
                this.mTitleTextView = r0;
                r0.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A0L;
                if (i != 0) {
                    this.mTitleTextView.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0O;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!A0D(this.mTitleTextView)) {
                A0B(this.mTitleTextView, true);
            }
        } else if (textView != null && A0D(textView)) {
            removeView(this.mTitleTextView);
            this.A0g.remove(this.mTitleTextView);
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0E = charSequence;
    }

    public void setOnMenuItemClickListener(AnonymousClass03O r1) {
        this.A0C = r1;
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A05(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AnonymousClass02D.A03().A09(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(AnonymousClass02D.A03().A09(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AnonymousClass02D.A03().A09(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971618);
    }
}
