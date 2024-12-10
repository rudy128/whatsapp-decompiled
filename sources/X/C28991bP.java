package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: X.1bP  reason: invalid class name and case insensitive filesystem */
public abstract class C28991bP extends ViewGroup implements C004601z {
    public static final int[] A0T = {16842912};
    public static final int[] A0U = {-16842910};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = -1;
    public int A06 = -1;
    public int A07;
    public int A08;
    public int A09;
    public int A0A = 0;
    public int A0B = 0;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public C003301m A0G;
    public C28951bL A0H;
    public C28011Ym A0I;
    public C29221bq[] A0J;
    public Drawable A0K;
    public boolean A0L;
    public boolean A0M = false;
    public final SparseArray A0N = new SparseArray(5);
    public final C29051bX A0O;
    public final ColorStateList A0P = A01();
    public final SparseArray A0Q = new SparseArray(5);
    public final View.OnClickListener A0R;
    public final C29011bR A0S = new C29031bT(5);

    public int getWindowAnimations() {
        return 0;
    }

    private C29221bq getNewItem() {
        C29221bq r0 = (C29221bq) this.A0S.BAf();
        if (r0 != null) {
            return r0;
        }
        Context context = getContext();
        if (this instanceof C29001bQ) {
            return new C29221bq(context);
        }
        return new C29221bq(context);
    }

    public Drawable getItemBackground() {
        C29221bq[] r1 = this.A0J;
        if (r1 == null || r1.length <= 0) {
            return this.A0K;
        }
        return r1[0].getBackground();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.A0D = colorStateList;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq iconTintList : r3) {
                iconTintList.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        C27801Xq r1;
        this.A0C = colorStateList;
        C29221bq[] r6 = this.A0J;
        if (r6 != null) {
            for (C29221bq r3 : r6) {
                C28011Ym r2 = this.A0I;
                if (r2 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new C27801Xq(r2);
                    r1.A0F(this.A0C);
                }
                r3.setActiveIndicatorDrawable(r1);
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A0L = z;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq activeIndicatorEnabled : r3) {
                activeIndicatorEnabled.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A00 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq activeIndicatorHeight : r3) {
                activeIndicatorHeight.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.A01 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq activeIndicatorMarginHorizontal : r3) {
                activeIndicatorMarginHorizontal.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.A0M = z;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq r0 : r3) {
                r0.A09 = z;
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(C28011Ym r8) {
        C27801Xq r1;
        this.A0I = r8;
        C29221bq[] r6 = this.A0J;
        if (r6 != null) {
            for (C29221bq r3 : r6) {
                C28011Ym r2 = this.A0I;
                if (r2 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new C27801Xq(r2);
                    r1.A0F(this.A0C);
                }
                r3.setActiveIndicatorDrawable(r1);
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.A02 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq activeIndicatorWidth : r3) {
                activeIndicatorWidth.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.A0K = drawable;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq itemBackground : r3) {
                itemBackground.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.A03 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq itemBackground : r3) {
                itemBackground.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.A04 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq iconSize : r3) {
                iconSize.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.A05 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq itemPaddingBottom : r3) {
                itemPaddingBottom.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.A06 = i;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq itemPaddingTop : r3) {
                itemPaddingTop.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.A0E = colorStateList;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq itemRippleColor : r3) {
                itemRippleColor.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.A07 = i;
        C29221bq[] r4 = this.A0J;
        if (r4 != null) {
            for (C29221bq r1 : r4) {
                r1.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.A0F;
                if (colorStateList != null) {
                    r1.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.A08 = i;
        C29221bq[] r4 = this.A0J;
        if (r4 != null) {
            for (C29221bq r1 : r4) {
                r1.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.A0F;
                if (colorStateList != null) {
                    r1.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A0F = colorStateList;
        C29221bq[] r3 = this.A0J;
        if (r3 != null) {
            for (C29221bq textColor : r3) {
                textColor.setTextColor(colorStateList);
            }
        }
    }

    public C28991bP(Context context) {
        super(context);
        if (isInEditMode()) {
            this.A0O = null;
        } else {
            C29061bY r3 = new C29061bY();
            this.A0O = r3;
            r3.A03 = true;
            r3.A0W((long) AnonymousClass1Z9.A00(getContext(), 2130970538, getResources().getInteger(2131492904)));
            r3.A0X(C29101bc.A01(AnonymousClass1YW.A02, getContext(), 2130970551));
            r3.A0a(new AnonymousClass1LG());
        }
        this.A0R = new C29131bf(this);
        setImportantForAccessibility(1);
    }

    private void setBadgeIfNeeded(C29221bq r3) {
        C29341c3 r0;
        int id = r3.getId();
        if (id != -1 && (r0 = (C29341c3) this.A0N.get(id)) != null) {
            r3.setBadge(r0);
        }
    }

    public ColorStateList A01() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            ColorStateList A032 = C19740yt.A03(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(2130969136, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = A032.getDefaultColor();
                int[] iArr = A0U;
                return new ColorStateList(new int[][]{iArr, A0T, View.EMPTY_STATE_SET}, new int[]{A032.getColorForState(iArr, defaultColor), i, defaultColor});
            }
        }
        return null;
    }

    public void A02() {
        C27801Xq r1;
        removeAllViews();
        C29221bq[] r6 = this.A0J;
        if (r6 != null) {
            for (C29221bq r2 : r6) {
                if (r2 != null) {
                    this.A0S.CEF(r2);
                    ImageView imageView = r2.A0O;
                    if (r2.A06 != null) {
                        if (imageView != null) {
                            r2.setClipChildren(true);
                            r2.setClipToPadding(true);
                            C60292nl.A01(imageView, r2.A06);
                        }
                        r2.A06 = null;
                    }
                    r2.A05 = null;
                    r2.A00 = 0.0f;
                    r2.A0A = false;
                }
            }
        }
        if (this.A0G.size() == 0) {
            this.A0A = 0;
            this.A0B = 0;
            this.A0J = null;
            return;
        }
        HashSet hashSet = new HashSet();
        int i = 0;
        int i2 = 0;
        while (true) {
            C003301m r12 = this.A0G;
            if (i2 >= r12.size()) {
                break;
            }
            hashSet.add(Integer.valueOf(r12.getItem(i2).getItemId()));
            i2++;
        }
        while (true) {
            SparseArray sparseArray = this.A0N;
            if (i >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i++;
        }
        C003301m r13 = this.A0G;
        this.A0J = new C29221bq[r13.size()];
        int i3 = this.A09;
        int size = r13.A0D().size();
        boolean z = true;
        if (i3 != -1 ? i3 != 0 : size <= 3) {
            z = false;
        }
        int i4 = 0;
        while (true) {
            C003301m r62 = this.A0G;
            if (i4 < r62.size()) {
                this.A0H.A02 = true;
                r62.getItem(i4).setCheckable(true);
                this.A0H.A02 = false;
                C29221bq newItem = getNewItem();
                this.A0J[i4] = newItem;
                newItem.setIconTintList(this.A0D);
                newItem.setIconSize(this.A04);
                newItem.setTextColor(this.A0P);
                newItem.setTextAppearanceInactive(this.A08);
                newItem.setTextAppearanceActive(this.A07);
                newItem.setTextColor(this.A0F);
                int i5 = this.A06;
                if (i5 != -1) {
                    newItem.setItemPaddingTop(i5);
                }
                int i6 = this.A05;
                if (i6 != -1) {
                    newItem.setItemPaddingBottom(i6);
                }
                newItem.setActiveIndicatorWidth(this.A02);
                newItem.setActiveIndicatorHeight(this.A00);
                newItem.setActiveIndicatorMarginHorizontal(this.A01);
                C28011Ym r63 = this.A0I;
                if (r63 == null || this.A0C == null) {
                    r1 = null;
                } else {
                    r1 = new C27801Xq(r63);
                    r1.A0F(this.A0C);
                }
                newItem.setActiveIndicatorDrawable(r1);
                newItem.A09 = this.A0M;
                newItem.setActiveIndicatorEnabled(this.A0L);
                Drawable drawable = this.A0K;
                if (drawable != null) {
                    newItem.setItemBackground(drawable);
                } else {
                    newItem.setItemBackground(this.A03);
                }
                newItem.setItemRippleColor(this.A0E);
                newItem.setShifting(z);
                newItem.setLabelVisibilityMode(this.A09);
                AnonymousClass03G r0 = (AnonymousClass03G) this.A0G.getItem(i4);
                newItem.BdW(r0);
                newItem.A01 = i4;
                int itemId = r0.getItemId();
                newItem.setOnTouchListener((View.OnTouchListener) this.A0Q.get(itemId));
                newItem.setOnClickListener(this.A0R);
                int i7 = this.A0A;
                if (i7 != 0 && itemId == i7) {
                    this.A0B = i4;
                }
                setBadgeIfNeeded(newItem);
                addView(newItem);
                i4++;
            } else {
                int min = Math.min(r62.size() - 1, this.A0B);
                this.A0B = min;
                r62.getItem(min).setChecked(true);
                return;
            }
        }
    }

    public void BdU(C003301m r1) {
        this.A0G = r1;
    }

    public SparseArray getBadgeDrawables() {
        return this.A0N;
    }

    public ColorStateList getIconTintList() {
        return this.A0D;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.A0C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.A0L;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A00;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.A01;
    }

    public C28011Ym getItemActiveIndicatorShapeAppearance() {
        return this.A0I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.A02;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.A03;
    }

    public int getItemIconSize() {
        return this.A04;
    }

    public int getItemPaddingBottom() {
        return this.A05;
    }

    public int getItemPaddingTop() {
        return this.A06;
    }

    public ColorStateList getItemRippleColor() {
        return this.A0E;
    }

    public int getItemTextAppearanceActive() {
        return this.A07;
    }

    public int getItemTextAppearanceInactive() {
        return this.A08;
    }

    public ColorStateList getItemTextColor() {
        return this.A0F;
    }

    public int getLabelVisibilityMode() {
        return this.A09;
    }

    public C003301m getMenu() {
        return this.A0G;
    }

    public int getSelectedItemId() {
        return this.A0A;
    }

    public int getSelectedItemPosition() {
        return this.A0B;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C26228CvK(accessibilityNodeInfo).A0Z(C25475CgU.A00(1, this.A0G.A0D().size(), 1, false));
    }

    public void setLabelVisibilityMode(int i) {
        this.A09 = i;
    }

    public void setPresenter(C28951bL r1) {
        this.A0H = r1;
    }
}
