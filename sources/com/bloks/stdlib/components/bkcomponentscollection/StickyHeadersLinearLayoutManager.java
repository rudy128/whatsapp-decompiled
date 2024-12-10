package com.bloks.stdlib.components.bkcomponentscollection;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1ZU;
import X.AnonymousClass28J;
import X.C18070vi;
import X.C22707BLr;
import X.C37931qQ;
import X.C38021qZ;
import X.C38391rD;
import X.C42011xT;
import X.C64592v1;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class StickyHeadersLinearLayoutManager extends LinearLayoutManager {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public View A03;
    public C22707BLr A04;
    public final List A05 = AnonymousClass000.A13();
    public final AnonymousClass28J A06 = new AnonymousClass28J(this);

    public StickyHeadersLinearLayoutManager(Context context, int i) {
        super(context, i, false);
    }

    private final void A0B(View view) {
        A0U(view);
        if (this.A01 == 1) {
            view.layout(A0M(), 0, this.A03 - A0N(), view.getMeasuredHeight());
        } else {
            view.layout(0, A0O(), view.getMeasuredWidth(), this.A00 - A0L());
        }
    }

    public View A0v(View view, C37931qQ r3, C38021qZ r4, int i) {
        C18070vi.A0d(view, 0);
        C18070vi.A0k(r3, r4);
        A0I(this);
        View A0v = super.A0v(view, r3, r4, i);
        A0H(this);
        return A0v;
    }

    public void A1a(int i, int i2) {
        int width;
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        int A09 = A09(i);
        if (A09 != -1) {
            List list = this.A05;
            if (AnonymousClass1ZU.A03(Integer.valueOf(i), list, list.size()) < 0) {
                int A032 = AnonymousClass1ZU.A03(Integer.valueOf(i - 1), list, list.size());
                if (A032 < 0) {
                    A032 = -1;
                }
                if (A032 != -1) {
                    i--;
                } else {
                    View view = this.A03;
                    if (view != null) {
                        int A033 = AnonymousClass1ZU.A03(Integer.valueOf(this.A02), list, list.size());
                        if (A033 < 0) {
                            A033 = -1;
                        }
                        if (A09 == A033) {
                            if (i2 == Integer.MIN_VALUE) {
                                i2 = 0;
                            }
                            if (this.A01 == 1) {
                                width = view.getHeight();
                            } else {
                                width = view.getWidth();
                            }
                            i2 += width;
                        }
                    }
                    this.A01 = i;
                    this.A00 = i2;
                }
            }
        }
        super.A1a(i, i2);
    }

    private final int A09(int i) {
        List list = this.A05;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (AnonymousClass001.A0n(list, i3) > i) {
                size = i3 - 1;
            } else if (i3 >= list.size() - 1 || AnonymousClass001.A0n(list, i3 + 1) > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public static final int A0A(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager, int i) {
        List list = stickyHeadersLinearLayoutManager.A05;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0 && AnonymousClass001.A0n(list, i3 - 1) >= i) {
                size = i3 - 1;
            } else if (AnonymousClass001.A0n(list, i3) >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public static final void A0E(C38391rD r2, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        C22707BLr bLr = stickyHeadersLinearLayoutManager.A04;
        if (bLr != null) {
            bLr.A01.unregisterObserver(stickyHeadersLinearLayoutManager.A06);
        }
        if (r2 instanceof C22707BLr) {
            stickyHeadersLinearLayoutManager.A04 = (C22707BLr) r2;
            AnonymousClass28J r0 = stickyHeadersLinearLayoutManager.A06;
            r2.CDq(r0);
            r0.A01();
            return;
        }
        stickyHeadersLinearLayoutManager.A04 = null;
        stickyHeadersLinearLayoutManager.A05.clear();
    }

    public static final void A0F(C37931qQ r4, StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A03 = null;
            stickyHeadersLinearLayoutManager.A02 = -1;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            C42011xT A022 = RecyclerView.A02(view);
            A022.A00 &= -129;
            A022.A07();
            A022.A00 = 4 | A022.A00;
            stickyHeadersLinearLayoutManager.A0V(view);
            if (r4 != null) {
                r4.A07(view);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x020c, code lost:
        if ((r8 + r0) > 0.0f) goto L_0x0261;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        if (r8 >= ((float) r0)) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x005a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0257 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0257 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0G(X.C37931qQ r20, boolean r21) {
        /*
            r19 = this;
            r2 = r19
            java.util.List r8 = r2.A05
            int r7 = r8.size()
            int r6 = r2.A0J()
            r13 = r20
            if (r7 <= 0) goto L_0x0261
            if (r6 <= 0) goto L_0x0261
            r4 = 0
        L_0x0013:
            r12 = 0
            r3 = -1
            if (r4 >= r6) goto L_0x0261
            android.view.View r5 = r2.A0P(r4)
            if (r5 == 0) goto L_0x025e
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
        L_0x0021:
            boolean r0 = r1 instanceof X.C38491rN
            if (r0 == 0) goto L_0x025b
            X.1rN r1 = (X.C38491rN) r1
        L_0x0027:
            if (r5 == 0) goto L_0x0257
            if (r1 == 0) goto L_0x0257
            X.1xT r0 = r1.A00
            int r9 = r0.A00
            r0 = r9 & 8
            if (r0 != 0) goto L_0x0257
            r0 = r9 & 4
            if (r0 != 0) goto L_0x0257
            int r11 = r2.A01
            r10 = 0
            r9 = 1
            boolean r0 = r2.A09
            if (r11 != r9) goto L_0x0227
            if (r0 == 0) goto L_0x0239
            int r0 = r5.getTop()
            float r9 = (float) r0
            float r0 = r5.getTranslationY()
            float r9 = r9 + r0
            int r0 = r2.A00
        L_0x004d:
            float r0 = (float) r0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0257
        L_0x0052:
            android.view.View r0 = r2.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0257
            X.1xT r0 = r1.A00
            int r1 = r0.A05()
            if (r1 == r3) goto L_0x0261
            int r9 = r2.A09(r1)
            if (r9 == r3) goto L_0x021e
            int r6 = X.AnonymousClass001.A0n(r8, r9)
            int r0 = r9 + 1
            if (r7 > r0) goto L_0x021f
            r7 = -1
        L_0x0071:
            if (r6 == r3) goto L_0x0261
            if (r6 != r1) goto L_0x0090
            int r10 = r2.A01
            r9 = 0
            r8 = 1
            boolean r0 = r2.A09
            if (r10 != r8) goto L_0x01f8
            if (r0 == 0) goto L_0x01ee
            int r0 = r5.getBottom()
            float r8 = (float) r0
            float r0 = r5.getTranslationY()
            float r8 = r8 - r0
            int r0 = r2.A00
        L_0x008b:
            float r0 = (float) r0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0261
        L_0x0090:
            int r0 = r6 + 1
            if (r7 == r0) goto L_0x0261
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x01eb
            X.1xT r0 = androidx.recyclerview.widget.RecyclerView.A02(r0)
            int r0 = r0.A01
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x00a2:
            X.BLr r0 = r2.A04
            if (r0 == 0) goto L_0x01e8
            int r0 = r0.getItemViewType(r6)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00ae:
            boolean r0 = X.C18070vi.A18(r5, r0)
            if (r0 != 0) goto L_0x00b7
            A0F(r13, r2)
        L_0x00b7:
            android.view.View r9 = r2.A03
            if (r9 != 0) goto L_0x00ed
            r0 = 0
            android.view.View r9 = r13.A02(r6)
            X.C18070vi.A0X(r9)
            X.C38251qy.A04(r9, r2, r3, r0)
            r2.A0B(r9)
            android.view.ViewParent r5 = r9.getParent()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            if (r5 != r0) goto L_0x02ad
            int r0 = r0.indexOfChild(r9)
            if (r0 == r3) goto L_0x02ad
            X.1xT r8 = androidx.recyclerview.widget.RecyclerView.A02(r9)
            r5 = 128(0x80, float:1.794E-43)
            int r0 = r8.A00
            r5 = r5 | r0
            r8.A00 = r5
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            X.1qR r0 = r0.A0z
            r0.A04(r8)
            r2.A03 = r9
            r2.A02 = r6
        L_0x00ed:
            if (r21 != 0) goto L_0x017d
            int r0 = X.C38251qy.A02(r9)
            if (r0 != r6) goto L_0x017d
        L_0x00f5:
            if (r7 == r3) goto L_0x0108
            int r7 = r7 - r1
            int r4 = r4 + r7
            android.view.View r1 = r2.A0P(r4)
            android.view.View r0 = r2.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0108
            r12 = r1
        L_0x0108:
            android.view.View r4 = r2.A03
            if (r4 == 0) goto L_0x0165
            int r1 = r2.A01
            r0 = 1
            r3 = 0
            if (r1 == r0) goto L_0x013d
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x011c
            boolean r0 = r2.A1f()
            if (r0 == 0) goto L_0x0124
        L_0x011c:
            int r1 = r2.A03
            int r0 = r4.getWidth()
            int r1 = r1 - r0
            int r3 = r3 + r1
        L_0x0124:
            if (r12 == 0) goto L_0x013d
            boolean r0 = r2.A09
            if (r0 != 0) goto L_0x0174
            boolean r0 = r2.A1f()
            if (r0 != 0) goto L_0x0174
            int r1 = r12.getLeft()
            int r0 = r4.getWidth()
            int r1 = r1 - r0
            int r3 = java.lang.Math.min(r1, r3)
        L_0x013d:
            float r0 = (float) r3
            r4.setTranslationX(r0)
            int r1 = r2.A01
            r0 = 1
            r3 = 0
            if (r1 != r0) goto L_0x0161
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0153
            int r1 = r2.A00
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r3 = r3 + r1
        L_0x0153:
            if (r12 == 0) goto L_0x0161
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0166
            int r0 = r12.getBottom()
            int r3 = java.lang.Math.max(r0, r3)
        L_0x0161:
            float r0 = (float) r3
            r4.setTranslationY(r0)
        L_0x0165:
            return
        L_0x0166:
            int r1 = r12.getTop()
            int r0 = r4.getHeight()
            int r1 = r1 - r0
            int r3 = java.lang.Math.min(r1, r3)
            goto L_0x0161
        L_0x0174:
            int r0 = r12.getRight()
            int r3 = java.lang.Math.max(r0, r3)
            goto L_0x013d
        L_0x017d:
            android.view.View r8 = r2.A03
            if (r8 == 0) goto L_0x00f5
            X.1xT r14 = androidx.recyclerview.widget.RecyclerView.A02(r8)
            if (r14 == 0) goto L_0x0299
            androidx.recyclerview.widget.RecyclerView r5 = r13.A08
            X.1qi r9 = r5.A07
            r0 = 0
            int r15 = r9.A04(r6, r0)
            if (r15 < 0) goto L_0x0269
            X.1rD r0 = r5.A0B
            int r0 = r0.A0Q()
            if (r15 >= r0) goto L_0x0269
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r16 = r6
            X.C37931qQ.A00(r13, r14, r15, r16, r17)
            android.view.View r10 = r14.A0H
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            if (r9 != 0) goto L_0x01da
            android.view.ViewGroup$LayoutParams r9 = r5.generateDefaultLayoutParams()
        L_0x01b0:
            X.1rN r9 = (X.C38491rN) r9
            r10.setLayoutParams(r9)
        L_0x01b5:
            r5 = 1
            r9.A01 = r5
            r9.A00 = r14
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto L_0x01c1
            r5 = 0
        L_0x01c1:
            r9.A02 = r5
            r2.A02 = r6
            r2.A0B(r8)
            int r0 = r2.A01
            if (r0 == r3) goto L_0x00f5
            android.view.ViewTreeObserver r5 = r8.getViewTreeObserver()
            X.2vH r0 = new X.2vH
            r0.<init>(r5, r2)
            r5.addOnGlobalLayoutListener(r0)
            goto L_0x00f5
        L_0x01da:
            boolean r0 = r5.checkLayoutParams(r9)
            if (r0 != 0) goto L_0x01e5
            android.view.ViewGroup$LayoutParams r9 = r5.generateLayoutParams((android.view.ViewGroup.LayoutParams) r9)
            goto L_0x01b0
        L_0x01e5:
            X.1rN r9 = (X.C38491rN) r9
            goto L_0x01b5
        L_0x01e8:
            r0 = r12
            goto L_0x00ae
        L_0x01eb:
            r5 = r12
            goto L_0x00a2
        L_0x01ee:
            int r0 = r5.getTop()
            float r8 = (float) r0
            float r0 = r5.getTranslationY()
            goto L_0x0209
        L_0x01f8:
            if (r0 != 0) goto L_0x0210
            boolean r0 = r2.A1f()
            if (r0 != 0) goto L_0x0210
            int r0 = r5.getLeft()
            float r8 = (float) r0
            float r0 = r5.getTranslationX()
        L_0x0209:
            float r8 = r8 + r0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0261
            goto L_0x0090
        L_0x0210:
            int r0 = r5.getRight()
            float r8 = (float) r0
            float r0 = r5.getTranslationX()
            float r8 = r8 - r0
            int r0 = r2.A03
            goto L_0x008b
        L_0x021e:
            r6 = -1
        L_0x021f:
            int r0 = r9 + 1
            int r7 = X.AnonymousClass001.A0n(r8, r0)
            goto L_0x0071
        L_0x0227:
            if (r0 != 0) goto L_0x0249
            boolean r0 = r2.A1f()
            if (r0 != 0) goto L_0x0249
            int r0 = r5.getRight()
            float r9 = (float) r0
            float r0 = r5.getTranslationX()
            goto L_0x0242
        L_0x0239:
            int r0 = r5.getBottom()
            float r9 = (float) r0
            float r0 = r5.getTranslationY()
        L_0x0242:
            float r9 = r9 - r0
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0257
            goto L_0x0052
        L_0x0249:
            int r0 = r5.getLeft()
            float r9 = (float) r0
            float r0 = r5.getTranslationX()
            float r9 = r9 + r0
            int r0 = r2.A03
            goto L_0x004d
        L_0x0257:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x025b:
            r1 = r12
            goto L_0x0027
        L_0x025e:
            r1 = r12
            goto L_0x0021
        L_0x0261:
            android.view.View r0 = r2.A03
            if (r0 == 0) goto L_0x0165
            A0F(r13, r2)
            return
        L_0x0269:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Inconsistency detected. Invalid item position "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "(offset:"
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ").state:"
            r1.append(r0)
            X.1qZ r0 = r5.A0w
            int r0 = r0.A00()
            r1.append(r0)
            java.lang.String r0 = r5.A0R()
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0299:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r13.A08
            java.lang.String r0 = r0.A0R()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x02ad:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "View should be fully attached to be ignored"
            r1.append(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.A07
            java.lang.String r0 = r0.A0R()
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager.A0G(X.1qQ, boolean):void");
    }

    public static final void A0H(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null) {
            stickyHeadersLinearLayoutManager.A0W(view, -1);
        }
    }

    public static final void A0I(StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager) {
        int A052;
        View view = stickyHeadersLinearLayoutManager.A03;
        if (view != null && (A052 = stickyHeadersLinearLayoutManager.A05.A05(view)) >= 0) {
            stickyHeadersLinearLayoutManager.A05.A08(A052);
        }
    }

    public void A19(Parcelable parcelable) {
        if (parcelable instanceof C64592v1) {
            C64592v1 r2 = (C64592v1) parcelable;
            this.A01 = r2.A01;
            this.A00 = r2.A00;
            parcelable = r2.A02;
        }
        super.A19(parcelable);
    }

    public int A0m(C37931qQ r3, C38021qZ r4, int i) {
        C18070vi.A0j(r3, r4);
        A0I(this);
        int A0m = super.A0m(r3, r4, i);
        A0H(this);
        if (A0m != 0) {
            A0G(r3, false);
        }
        return A0m;
    }

    public int A0n(C37931qQ r3, C38021qZ r4, int i) {
        C18070vi.A0j(r3, r4);
        A0I(this);
        int A0n = super.A0n(r3, r4, i);
        A0H(this);
        if (A0n != 0) {
            A0G(r3, false);
        }
        return A0n;
    }

    public Parcelable A0u() {
        return new C64592v1(super.A0u(), this.A01, this.A00);
    }

    public void A1D(C37931qQ r3, C38021qZ r4) {
        boolean A16 = C18070vi.A16(r3, r4);
        A0I(this);
        super.A1D(r3, r4);
        A0H(this);
        if (!r4.A08) {
            A0G(r3, A16);
        }
    }

    public PointF BFT(int i) {
        A0I(this);
        PointF BFT = super.BFT(i);
        A0H(this);
        return BFT;
    }
}
