package com.whatsapp.wds.components.button;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1JQ;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZU;
import X.AnonymousClass1b2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass7S5;
import X.C122556Qv;
import X.C147047Rp;
import X.C18000vb;
import X.C18070vi;
import X.C72473Md;
import X.C99434so;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class WDSButtonGroup extends ViewGroup implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public C122556Qv A03;
    public C122556Qv A04;
    public final List A05;

    public final void setOrientationMode(C122556Qv r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A04, r2);
        this.A04 = r2;
        if (A1Z) {
            requestLayout();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List list = this.A05;
        list.clear();
        C147047Rp r1 = new C147047Rp(AnonymousClass1b2.A09(new AnonymousClass7S5(7), new C99434so(this, 1)));
        while (r1.hasNext()) {
            list.add(r1.next());
        }
        int size = list.size();
        if (size <= 2) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (size == 1) {
                ((View) list.remove(0)).layout(0, 0, i5, i6);
            } else if (size == 2) {
                View view = (View) list.remove(0);
                View view2 = (View) list.remove(0);
                if (this.A03 == C122556Qv.VERTICAL) {
                    int i7 = i6 / 2;
                    view.layout(0, 0, i5, i7);
                    view2.layout(0, i7, i5, i6);
                    return;
                }
                int i8 = i5 / 2;
                C18000vb r0 = this.A00;
                if (r0 == null || AnonymousClass3MY.A1b(r0)) {
                    view.layout(0, 0, i8, i6);
                    view2.layout(i8, 0, i5, i6);
                    return;
                }
                view.layout(i8, 0, i5, i6);
                view2.layout(0, 0, i8, i6);
            }
        } else {
            throw AnonymousClass000.A0n("WDSButtonGroup should not have more than 2 visible children!");
        }
    }

    public WDSButtonGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public static final int A00(AnonymousClass1JQ r2) {
        Iterator it = r2.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                AnonymousClass1ZU.A0A();
                throw null;
            }
        }
        return i;
    }

    public final C122556Qv getOrientationMode() {
        return this.A04;
    }

    public final C18000vb getWhatsAppLocale() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        if ((r3 * 2) > r6) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            int r10 = android.view.View.MeasureSpec.getMode(r12)
            int r6 = android.view.View.MeasureSpec.getSize(r12)
            int r9 = android.view.View.MeasureSpec.getMode(r13)
            int r8 = android.view.View.MeasureSpec.getSize(r13)
            r3 = 1
            X.4so r2 = new X.4so
            r2.<init>(r11, r3)
            r1 = 8
            X.7S5 r0 = new X.7S5
            r0.<init>(r1)
            X.7Sa r7 = X.AnonymousClass1b2.A09(r0, r2)
            int r0 = A00(r7)
            r2 = 2
            if (r0 > r2) goto L_0x00fa
            X.6Qv r0 = r11.A04
            int r1 = r0.ordinal()
            r0 = 0
            r5 = 0
            if (r1 == r0) goto L_0x003b
            if (r1 == r2) goto L_0x006b
            if (r1 == r3) goto L_0x0079
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x003b:
            X.7Rp r4 = new X.7Rp
            r4.<init>((X.C147157Sa) r7)
            r3 = 0
            r2 = 0
        L_0x0042:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0065
            java.lang.Object r1 = r4.next()
            android.view.View r1 = (android.view.View) r1
            r11.measureChild(r1, r12, r13)
            int r0 = r1.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r0)
            r1.getMeasuredHeight()
            int r0 = r1.getMeasuredState()
            int r2 = android.view.View.combineMeasuredStates(r2, r0)
            goto L_0x0042
        L_0x0065:
            if (r10 == 0) goto L_0x0079
            int r0 = r3 * 2
            if (r0 <= r6) goto L_0x0079
        L_0x006b:
            X.6Qv r0 = X.C122556Qv.VERTICAL
        L_0x006d:
            r11.A03 = r0
            int r0 = A00(r7)
            if (r0 != 0) goto L_0x007c
            super.onMeasure(r12, r13)
            return
        L_0x0079:
            X.6Qv r0 = X.C122556Qv.HORIZONTAL
            goto L_0x006d
        L_0x007c:
            X.6Qv r1 = r11.A03
            X.6Qv r0 = X.C122556Qv.HORIZONTAL
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00b5
            int r0 = A00(r7)
            int r10 = r6 / r0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            r9 = r13
        L_0x008f:
            X.7Rp r8 = new X.7Rp
            r8.<init>((X.C147157Sa) r7)
            r4 = 0
        L_0x0095:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r1 = r8.next()
            android.view.View r1 = (android.view.View) r1
            r11.measureChild(r1, r3, r9)
            int r0 = r1.getMeasuredHeight()
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = r1.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r0)
            goto L_0x0095
        L_0x00b5:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r2)
            int r0 = A00(r7)
            int r8 = r8 / r0
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r10 = r6
            goto L_0x008f
        L_0x00c4:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r2)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            X.7Rp r1 = new X.7Rp
            r1.<init>((X.C147157Sa) r7)
        L_0x00d1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r0.measure(r3, r2)
            goto L_0x00d1
        L_0x00e1:
            X.6Qv r1 = r11.A03
            X.6Qv r0 = X.C122556Qv.VERTICAL
            if (r1 != r0) goto L_0x00ec
            int r0 = A00(r7)
            int r5 = r5 * r0
        L_0x00ec:
            int r1 = android.view.View.resolveSizeAndState(r6, r12, r4)
            int r0 = r4 << 16
            int r0 = android.view.View.resolveSizeAndState(r5, r13, r0)
            r11.setMeasuredDimension(r1, r0)
            return
        L_0x00fa:
            java.lang.String r0 = "WDSButtonGroup should not have more than 2 visible children!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.button.WDSButtonGroup.onMeasure(int, int):void");
    }

    public final void setWhatsAppLocale(C18000vb r1) {
        this.A00 = r1;
    }

    public /* synthetic */ WDSButtonGroup(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        C122556Qv r4 = C122556Qv.AUTO;
        this.A04 = r4;
        this.A03 = C122556Qv.HORIZONTAL;
        this.A05 = new LinkedList();
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A05;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int i = obtainStyledAttributes.getInt(0, -1);
            C122556Qv[] values = C122556Qv.values();
            if (i >= 0 && i < values.length) {
                r4 = values[i];
            }
            setOrientationMode(r4);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSButtonGroup(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
