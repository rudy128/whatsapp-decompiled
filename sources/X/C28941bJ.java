package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1bJ  reason: invalid class name and case insensitive filesystem */
public abstract class C28941bJ extends FrameLayout {
    public AnonymousClass1H0 A00;
    public C23591Gw A01;
    public MenuInflater A02;
    public final C28961bM A03;
    public final C28991bP A04;
    public final C28951bL A05;

    public abstract int getMaxItemCount();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28941bJ(android.content.Context r16, android.util.AttributeSet r17, int r18, int r19) {
        /*
            r15 = this;
            r0 = r16
            r10 = r17
            r13 = r18
            r14 = r19
            android.content.Context r0 = X.C27771Xm.A00(r0, r10, r13, r14)
            r15.<init>(r0, r10, r13)
            X.1bL r2 = new X.1bL
            r2.<init>()
            r15.A05 = r2
            android.content.Context r9 = r15.getContext()
            int[] r11 = X.C27781Xn.A0Y
            r0 = 2
            int[] r12 = new int[r0]
            r0 = 10
            r5 = 0
            r12[r5] = r0
            r0 = 9
            r1 = 1
            r12[r1] = r0
            X.01c r3 = X.C27791Xo.A01(r9, r10, r11, r12, r13, r14)
            java.lang.Class r4 = r15.getClass()
            int r0 = r15.getMaxItemCount()
            X.1bM r7 = new X.1bM
            r7.<init>(r9, r4, r0)
            r15.A03 = r7
            boolean r0 = r15 instanceof com.google.android.material.bottomnavigation.BottomNavigationView
            if (r0 == 0) goto L_0x01b1
            X.1bQ r8 = new X.1bQ
            r8.<init>(r9)
        L_0x0045:
            r15.A04 = r8
            r2.A01 = r8
            r2.A00 = r1
            r8.A0H = r2
            r7.A0V(r2)
            android.content.Context r0 = r15.getContext()
            r2.BdO(r0, r7)
            r2 = 5
            android.content.res.TypedArray r6 = r3.A02
            boolean r0 = r6.hasValue(r2)
            if (r0 == 0) goto L_0x01ab
            android.content.res.ColorStateList r0 = r3.A01(r2)
        L_0x0064:
            r8.setIconTintList(r0)
            android.content.res.Resources r2 = r15.getResources()
            r0 = 2131167881(0x7f070a89, float:1.7950048E38)
            int r2 = r2.getDimensionPixelSize(r0)
            r0 = 4
            int r0 = r6.getDimensionPixelSize(r0, r2)
            r15.setItemIconSize(r0)
            r0 = 10
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x008b
            r0 = 10
            int r0 = r6.getResourceId(r0, r5)
            r15.setItemTextAppearanceInactive(r0)
        L_0x008b:
            r0 = 9
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 9
            int r0 = r6.getResourceId(r0, r5)
            r15.setItemTextAppearanceActive(r0)
        L_0x009c:
            r2 = 11
            boolean r0 = r6.hasValue(r2)
            if (r0 == 0) goto L_0x00ab
            android.content.res.ColorStateList r0 = r3.A01(r2)
            r15.setItemTextColor(r0)
        L_0x00ab:
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            if (r0 == 0) goto L_0x00b9
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00d9
        L_0x00b9:
            X.1Xq r4 = new X.1Xq
            r4.<init>()
            android.graphics.drawable.Drawable r2 = r15.getBackground()
            boolean r0 = r2 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x00d3
            android.graphics.drawable.ColorDrawable r2 = (android.graphics.drawable.ColorDrawable) r2
            int r0 = r2.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r4.A0F(r0)
        L_0x00d3:
            r4.A0E(r9)
            r15.setBackground(r4)
        L_0x00d9:
            r0 = 7
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x00e8
            r0 = 7
            int r0 = r6.getDimensionPixelSize(r0, r5)
            r15.setItemPaddingTop(r0)
        L_0x00e8:
            r0 = 6
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x00f7
            r0 = 6
            int r0 = r6.getDimensionPixelSize(r0, r5)
            r15.setItemPaddingBottom(r0)
        L_0x00f7:
            boolean r0 = r6.hasValue(r1)
            if (r0 == 0) goto L_0x0105
            int r0 = r6.getDimensionPixelSize(r1, r5)
            float r0 = (float) r0
            r15.setElevation(r0)
        L_0x0105:
            android.content.res.ColorStateList r2 = X.AnonymousClass1YT.A02(r9, r3, r5)
            android.graphics.drawable.Drawable r0 = r15.getBackground()
            android.graphics.drawable.Drawable r0 = r0.mutate()
            X.C27831Xu.A04(r2, r0)
            r2 = 12
            r0 = -1
            int r0 = r6.getInteger(r2, r0)
            r15.setLabelVisibilityMode(r0)
            r0 = 3
            int r0 = r6.getResourceId(r0, r5)
            if (r0 == 0) goto L_0x01a0
            r8.setItemBackgroundRes(r0)
        L_0x0128:
            r0 = 2
            int r2 = r6.getResourceId(r0, r5)
            if (r2 == 0) goto L_0x0170
            r15.setItemActiveIndicatorEnabled(r1)
            int[] r0 = X.C27781Xn.A0X
            android.content.res.TypedArray r3 = r9.obtainStyledAttributes(r2, r0)
            int r0 = r3.getDimensionPixelSize(r1, r5)
            r15.setItemActiveIndicatorWidth(r0)
            int r0 = r3.getDimensionPixelSize(r5, r5)
            r15.setItemActiveIndicatorHeight(r0)
            r0 = 3
            int r0 = r3.getDimensionPixelOffset(r0, r5)
            r15.setItemActiveIndicatorMarginHorizontal(r0)
            r0 = 2
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r9, r3, r0)
            r15.setItemActiveIndicatorColor(r0)
            r0 = 4
            int r2 = r3.getResourceId(r0, r5)
            r1 = 0
            X.1Ys r0 = new X.1Ys
            r0.<init>(r1)
            X.1Yp r1 = X.C28011Ym.A02(r9, r0, r2, r5)
            X.1Ym r0 = new X.1Ym
            r0.<init>(r1)
            r15.setItemActiveIndicatorShapeAppearance(r0)
            r3.recycle()
        L_0x0170:
            r0 = 13
            boolean r0 = r6.hasValue(r0)
            if (r0 == 0) goto L_0x0191
            r0 = 13
            int r4 = r6.getResourceId(r0, r5)
            X.1bL r3 = r15.A05
            r2 = 1
            r3.A02 = r2
            android.view.MenuInflater r1 = r15.getMenuInflater()
            X.1bM r0 = r15.A03
            r1.inflate(r4, r0)
            r3.A02 = r5
            r3.CQu(r2)
        L_0x0191:
            r6.recycle()
            r15.addView(r8)
            X.1bg r0 = new X.1bg
            r0.<init>(r15)
            r7.A0U(r0)
            return
        L_0x01a0:
            r0 = 8
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A02(r9, r3, r0)
            r15.setItemRippleColor(r0)
            goto L_0x0128
        L_0x01ab:
            android.content.res.ColorStateList r0 = r8.A01()
            goto L_0x0064
        L_0x01b1:
            X.2AC r8 = new X.2AC
            r8.<init>(r9)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28941bJ.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private MenuInflater getMenuInflater() {
        MenuInflater menuInflater = this.A02;
        if (menuInflater != null) {
            return menuInflater;
        }
        AnonymousClass02C r1 = new AnonymousClass02C(getContext());
        this.A02 = r1;
        return r1;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A04.A0C;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A04.A00;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A04.A01;
    }

    public C28011Ym getItemActiveIndicatorShapeAppearance() {
        return this.A04.A0I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A04.A02;
    }

    public Drawable getItemBackground() {
        return this.A04.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.A04.A03;
    }

    public int getItemIconSize() {
        return this.A04.A04;
    }

    public ColorStateList getItemIconTintList() {
        return this.A04.A0D;
    }

    public int getItemPaddingBottom() {
        return this.A04.A05;
    }

    public int getItemPaddingTop() {
        return this.A04.A06;
    }

    public ColorStateList getItemRippleColor() {
        return this.A04.A0E;
    }

    public int getItemTextAppearanceActive() {
        return this.A04.A07;
    }

    public int getItemTextAppearanceInactive() {
        return this.A04.A08;
    }

    public ColorStateList getItemTextColor() {
        return this.A04.A0F;
    }

    public int getLabelVisibilityMode() {
        return this.A04.A09;
    }

    public int getSelectedItemId() {
        return this.A04.A0A;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C22697BKz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C22697BKz bKz = (C22697BKz) parcelable;
        super.onRestoreInstanceState(bKz.A00);
        C28961bM r2 = this.A03;
        SparseArray sparseParcelableArray = bKz.A00.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = r2.A05;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    Reference reference = (Reference) it.next();
                    C004001t r1 = (C004001t) reference.get();
                    if (r1 == null) {
                        copyOnWriteArrayList.remove(reference);
                    } else {
                        int id = r1.getId();
                        if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                            r1.C3a(parcelable2);
                        }
                    }
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.A04.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A04.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A04.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A04.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(C28011Ym r2) {
        this.A04.setItemActiveIndicatorShapeAppearance(r2);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A04.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.A04.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.A04.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.A04.setItemIconSize(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.A04.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.A04.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.A04.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A04.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.A04.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A04.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A04.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        C28991bP r1 = this.A04;
        if (r1.A09 != i) {
            r1.A09 = i;
            this.A05.CQu(false);
        }
    }

    public void setSelectedItemId(int i) {
        C28961bM r3 = this.A03;
        MenuItem findItem = r3.findItem(i);
        if (findItem != null && !r3.A0h(findItem, this.A05, 0)) {
            findItem.setChecked(true);
        }
    }

    public Menu getMenu() {
        return this.A03;
    }

    public C004601z getMenuView() {
        return this.A04;
    }

    public C28951bL getPresenter() {
        return this.A05;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C27811Xs.A01(this);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.1Xj, android.os.Parcelable, X.BKz] */
    public Parcelable onSaveInstanceState() {
        Parcelable C4J;
        ? r6 = new C27741Xj(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        r6.A00 = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A03.A05;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Reference reference = (Reference) it.next();
                C004001t r0 = (C004001t) reference.get();
                if (r0 == null) {
                    copyOnWriteArrayList.remove(reference);
                } else {
                    int id = r0.getId();
                    if (id > 0 && (C4J = r0.C4J()) != null) {
                        sparseArray.put(id, C4J);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return r6;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C27811Xs.A02(this, f);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setOnItemReselectedListener(AnonymousClass1H0 r1) {
        this.A00 = r1;
    }

    public void setOnItemSelectedListener(C23591Gw r1) {
        this.A01 = r1;
    }
}
