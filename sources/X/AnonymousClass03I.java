package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* renamed from: X.03I  reason: invalid class name */
public class AnonymousClass03I implements C004001t, C27731Xi {
    public int A00;
    public Context A01;
    public Context A02;
    public LayoutInflater A03;
    public LayoutInflater A04;
    public C003301m A05;
    public C004301w A06;
    public C004601z A07;
    public AnonymousClass06C A08;
    public AnonymousClass065 A09;
    public AnonymousClass0ZF A0A;
    public AnonymousClass06F A0B;
    public AnonymousClass06D A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public Drawable A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final AnonymousClass0SB A0M = new AnonymousClass0SB(this);
    public final SparseBooleanArray A0N = new SparseBooleanArray();

    public static int A00(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i < 500) {
            return i > 480 ? i2 > 640 ? 4 : 3 : i >= 360 ? 3 : 2;
        }
    }

    public void A0E() {
        this.A0K = true;
        this.A0L = true;
    }

    public boolean BFB(AnonymousClass03G r2) {
        return false;
    }

    public boolean BKu(AnonymousClass03G r2) {
        return false;
    }

    public Drawable A06() {
        AnonymousClass06F r0 = this.A0B;
        if (r0 != null) {
            return r0.getDrawable();
        }
        if (this.A0J) {
            return this.A0H;
        }
        return null;
    }

    public C004601z A09(ViewGroup viewGroup) {
        C004601z r3 = this.A07;
        if (r3 == null) {
            C004601z r1 = (C004601z) this.A04.inflate(2131623939, viewGroup, false);
            this.A07 = r1;
            r1.BdU(this.A05);
            CQu(true);
        }
        C004601z r12 = this.A07;
        if (r3 != r12) {
            ((ActionMenuView) r12).setPresenter(this);
        }
        return r12;
    }

    public void A0B() {
        AnonymousClass06C r0 = this.A08;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void A0C() {
        this.A0F = A00(this.A01);
        C003301m r1 = this.A05;
        if (r1 != null) {
            r1.A0Y(true);
        }
    }

    public void A0F(Drawable drawable) {
        AnonymousClass06F r0 = this.A0B;
        if (r0 != null) {
            r0.setImageDrawable(drawable);
            return;
        }
        this.A0J = true;
        this.A0H = drawable;
    }

    public void A0G(ActionMenuView actionMenuView) {
        this.A07 = actionMenuView;
        actionMenuView.BdU(this.A05);
    }

    public boolean A0I() {
        C004601z r0;
        AnonymousClass0ZF r2 = this.A0A;
        if (r2 == null || (r0 = this.A07) == null) {
            AnonymousClass06D r02 = this.A0C;
            if (r02 == null) {
                return false;
            }
            r02.A02();
            return true;
        }
        ((View) r0).removeCallbacks(r2);
        this.A0A = null;
        return true;
    }

    public boolean A0J() {
        if (this.A0A != null || A0K()) {
            return true;
        }
        return false;
    }

    public boolean A0K() {
        AnonymousClass0SE r0;
        AnonymousClass06D r02 = this.A0C;
        if (r02 == null || (r0 = r02.A03) == null || !r0.BgV()) {
            return false;
        }
        return true;
    }

    public boolean A0L() {
        C003301m r1;
        if (!this.A0K || A0K() || (r1 = this.A05) == null || this.A07 == null || this.A0A != null || r1.A0C().isEmpty()) {
            return false;
        }
        AnonymousClass0ZF r12 = new AnonymousClass0ZF(new AnonymousClass06D(this.A01, this.A0B, this.A05, this), this);
        this.A0A = r12;
        ((View) this.A07).post(r12);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e8, code lost:
        if (r3 != false) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BLO() {
        /*
            r15 = this;
            X.01m r0 = r15.A05
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0047
            java.util.ArrayList r13 = r0.A0D()
            int r12 = r13.size()
        L_0x000e:
            int r11 = r15.A0F
            int r10 = r15.A0D
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            X.01z r8 = r15.A07
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r5 = 0
            r7 = 0
            r6 = 0
            r4 = 0
        L_0x001e:
            if (r5 >= r12) goto L_0x004a
            java.lang.Object r2 = r13.get(r5)
            X.03G r2 = (X.AnonymousClass03G) r2
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x003c
            int r6 = r6 + 1
        L_0x002e:
            boolean r0 = r15.A0I
            if (r0 == 0) goto L_0x0039
            boolean r0 = r2.isActionViewExpanded()
            if (r0 == 0) goto L_0x0039
            r11 = 0
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x001e
        L_0x003c:
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x0045
            int r4 = r4 + 1
            goto L_0x002e
        L_0x0045:
            r7 = 1
            goto L_0x002e
        L_0x0047:
            r13 = r1
            r12 = 0
            goto L_0x000e
        L_0x004a:
            boolean r0 = r15.A0K
            if (r0 == 0) goto L_0x0055
            if (r7 != 0) goto L_0x0053
            int r4 = r4 + r6
            if (r4 <= r11) goto L_0x0055
        L_0x0053:
            int r11 = r11 + -1
        L_0x0055:
            int r11 = r11 - r6
            android.util.SparseBooleanArray r7 = r15.A0N
            r7.clear()
            r6 = 0
            r14 = 0
        L_0x005d:
            if (r6 >= r12) goto L_0x00eb
            java.lang.Object r5 = r13.get(r6)
            X.03G r5 = (X.AnonymousClass03G) r5
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x008c
            android.view.View r0 = r15.A07(r1, r8, r5)
            r0.measure(r9, r9)
            int r0 = r0.getMeasuredWidth()
            int r10 = r10 - r0
            if (r14 != 0) goto L_0x007a
            r14 = r0
        L_0x007a:
            int r1 = r5.getGroupId()
            r0 = 1
            if (r1 == 0) goto L_0x0084
            r7.put(r1, r0)
        L_0x0084:
            r5.A0A(r0)
        L_0x0087:
            int r6 = r6 + 1
            r1 = 0
            r3 = 0
            goto L_0x005d
        L_0x008c:
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x00c1
            int r4 = r5.getGroupId()
            boolean r2 = r7.get(r4)
            if (r11 > 0) goto L_0x009e
            if (r2 == 0) goto L_0x00c1
        L_0x009e:
            if (r10 <= 0) goto L_0x00c5
            r3 = 1
            android.view.View r0 = r15.A07(r1, r8, r5)
            r0.measure(r9, r9)
            int r0 = r0.getMeasuredWidth()
            int r10 = r10 - r0
            if (r14 != 0) goto L_0x00b0
            r14 = r0
        L_0x00b0:
            int r1 = r10 + r14
            r0 = 0
            if (r1 <= 0) goto L_0x00b6
            r0 = 1
        L_0x00b6:
            r3 = r3 & r0
            if (r3 == 0) goto L_0x00c5
            if (r4 == 0) goto L_0x00c5
            r0 = 1
            r7.put(r4, r0)
        L_0x00bf:
            int r11 = r11 + -1
        L_0x00c1:
            r5.A0A(r3)
            goto L_0x0087
        L_0x00c5:
            if (r2 == 0) goto L_0x00e8
            r2 = 0
            r7.put(r4, r2)
        L_0x00cb:
            if (r2 >= r6) goto L_0x00e8
            java.lang.Object r1 = r13.get(r2)
            X.03G r1 = (X.AnonymousClass03G) r1
            int r0 = r1.getGroupId()
            if (r0 != r4) goto L_0x00e5
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x00e1
            int r11 = r11 + 1
        L_0x00e1:
            r0 = 0
            r1.A0A(r0)
        L_0x00e5:
            int r2 = r2 + 1
            goto L_0x00cb
        L_0x00e8:
            if (r3 == 0) goto L_0x00c1
            goto L_0x00bf
        L_0x00eb:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03I.BLO():boolean");
    }

    public void BdO(Context context, C003301m r8) {
        this.A01 = context;
        this.A03 = LayoutInflater.from(context);
        this.A05 = r8;
        Resources resources = context.getResources();
        if (!this.A0L) {
            this.A0K = true;
        }
        this.A0G = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.A0F = A00(context);
        int i = this.A0G;
        if (this.A0K) {
            if (this.A0B == null) {
                AnonymousClass06F r2 = new AnonymousClass06F(this.A02, this);
                this.A0B = r2;
                if (this.A0J) {
                    r2.setImageDrawable(this.A0H);
                    this.A0H = null;
                    this.A0J = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A0B.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.A0B.getMeasuredWidth();
        } else {
            this.A0B = null;
        }
        this.A0D = i;
        resources.getDisplayMetrics();
    }

    public void C3a(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof AnonymousClass0RC) && (i = ((AnonymousClass0RC) parcelable).A00) > 0 && (findItem = this.A05.findItem(i)) != null) {
            C7B((AnonymousClass068) findItem.getSubMenu());
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, X.0RC, java.lang.Object] */
    public Parcelable C4J() {
        ? obj = new Object();
        obj.A00 = this.A00;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, X.06N] */
    public void CQu(boolean z) {
        ArrayList arrayList;
        C004601z r1;
        int size;
        AnonymousClass03G r0;
        ViewGroup viewGroup = (ViewGroup) this.A07;
        if (viewGroup != null) {
            C003301m r02 = this.A05;
            int i = 0;
            if (r02 != null) {
                r02.A0F();
                ArrayList A0D2 = this.A05.A0D();
                int size2 = A0D2.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    AnonymousClass03G r3 = (AnonymousClass03G) A0D2.get(i3);
                    if (r3.A0D()) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C008003p) {
                            r0 = ((C008003p) childAt).getItemData();
                        } else {
                            r0 = null;
                        }
                        View A072 = A07(childAt, viewGroup, r3);
                        if (r3 != r0) {
                            A072.setPressed(false);
                            A072.jumpDrawablesToCurrentState();
                        }
                        if (A072 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A072.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A072);
                            }
                            ((ViewGroup) this.A07).addView(A072, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.A0B) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A07).requestLayout();
        C003301m r03 = this.A05;
        if (r03 != null) {
            ArrayList A0B2 = r03.A0B();
            int size3 = A0B2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                C60172nV BZt = ((AnonymousClass03G) A0B2.get(i4)).BZt();
                if (BZt != null) {
                    BZt.A03(this);
                }
            }
        }
        C003301m r04 = this.A05;
        if (r04 != null) {
            arrayList = r04.A0C();
        } else {
            arrayList = null;
        }
        if (!this.A0K || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((AnonymousClass03G) arrayList.get(0)).isActionViewExpanded()))) {
            AnonymousClass06F r05 = this.A0B;
            if (r05 != null && r05.getParent() == (r1 = this.A07)) {
                ((ViewGroup) r1).removeView(this.A0B);
            }
        } else {
            AnonymousClass06F r12 = this.A0B;
            if (r12 == null) {
                r12 = new AnonymousClass06F(this.A02, this);
                this.A0B = r12;
            }
            ViewGroup viewGroup3 = (ViewGroup) r12.getParent();
            if (viewGroup3 != this.A07) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0B);
                }
                AnonymousClass06F r2 = this.A0B;
                ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.A04 = false;
                layoutParams.gravity = 16;
                layoutParams.A04 = true;
                ((ViewGroup) this.A07).addView(r2, layoutParams);
            }
        }
        ((ActionMenuView) this.A07).A04 = this.A0K;
    }

    public AnonymousClass03I(Context context) {
        this.A02 = context;
        this.A04 = LayoutInflater.from(context);
    }

    public View A07(View view, ViewGroup viewGroup, AnonymousClass03G r6) {
        View actionView = r6.getActionView();
        if (actionView == null || r6.A0B()) {
            if (!(view instanceof C008003p)) {
                view = this.A04.inflate(2131623938, viewGroup, false);
            }
            C008003p r4 = (C008003p) view;
            r4.BdW(r6);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) r4;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.A07);
            AnonymousClass065 r0 = this.A09;
            if (r0 == null) {
                r0 = new AnonymousClass065(this);
                this.A09 = r0;
            }
            actionMenuItemView.setPopupCallback(r0);
            actionView = (View) r4;
        }
        int i = 0;
        if (r6.isActionViewExpanded()) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass06N)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public C004301w A08() {
        return this.A06;
    }

    public void A0A() {
        A0I();
        A0B();
    }

    public void A0D() {
        this.A0E = 2131427508;
    }

    public void Bp9(C003301m r2, boolean z) {
        A0A();
        C004301w r0 = this.A06;
        if (r0 != null) {
            r0.Bp9(r2, z);
        }
    }

    public boolean C7B(AnonymousClass068 r8) {
        boolean z = false;
        if (r8.hasVisibleItems()) {
            AnonymousClass068 r0 = r8;
            while (r0.A0k() != this.A05) {
                r0 = (AnonymousClass068) r0.A0k();
            }
            MenuItem item = r0.getItem();
            ViewGroup viewGroup = (ViewGroup) this.A07;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (!(childAt instanceof C008003p) || ((C008003p) childAt).getItemData() != item) {
                        i++;
                    } else if (childAt != null) {
                        this.A00 = r8.getItem().getItemId();
                        int size = r8.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            MenuItem item2 = r8.getItem(i2);
                            if (item2.isVisible() && item2.getIcon() != null) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        AnonymousClass06C r1 = new AnonymousClass06C(this.A01, childAt, r8, this);
                        this.A08 = r1;
                        r1.A05 = z;
                        AnonymousClass0SE r02 = r1.A03;
                        if (r02 != null) {
                            r02.A09(z);
                        }
                        if (r1.A04()) {
                            C004301w r03 = this.A06;
                            if (r03 != null) {
                                r03.Bzb(r8);
                            }
                            return true;
                        }
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                }
            }
        }
        return false;
    }

    public int getId() {
        return this.A0E;
    }

    public void A0H(boolean z) {
        this.A0I = z;
    }

    public void CIA(C004301w r1) {
        this.A06 = r1;
    }
}
