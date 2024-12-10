package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass4DD;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class ConversationRowImageAndVideoAlbumGridFrame extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public int A01;
    public AnonymousClass4DD A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowImageAndVideoAlbumGridFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        this.A02 = AnonymousClass4DD.FOUR_ITEMS;
        A00(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        r1.setLayoutParams(r0);
        r0 = getChildAt(2);
        r0.setVisibility(0);
        X.AnonymousClass3MZ.A1E(r0, -2, 85);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006e, code lost:
        getChildAt(3).setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0075, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
        r1.setLayoutParams(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0040, code lost:
        getChildAt(2).setVisibility(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setAlbumGridLayout(X.AnonymousClass4DD r12) {
        /*
            r11 = this;
            r10 = 0
            X.C18070vi.A0d(r12, r10)
            r11.A02 = r12
            int r0 = r12.ordinal()
            r8 = 85
            r7 = 83
            r9 = 53
            r5 = 3
            r6 = 2
            r4 = 1
            r1 = 51
            r3 = 8
            r2 = -2
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0048;
                case 2: goto L_0x0055;
                case 3: goto L_0x0024;
                case 4: goto L_0x0031;
                case 5: goto L_0x001c;
                default: goto L_0x001b;
            }
        L_0x001b:
            return
        L_0x001c:
            android.view.View r0 = X.C72483Me.A0K(r11)
            r0.setVisibility(r3)
            goto L_0x0040
        L_0x0024:
            android.view.View r1 = X.C72483Me.A0K(r11)
            r1.setVisibility(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2, r9)
            goto L_0x003d
        L_0x0031:
            android.view.View r1 = X.C72483Me.A0K(r11)
            r1.setVisibility(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2, r7)
        L_0x003d:
            r1.setLayoutParams(r0)
        L_0x0040:
            android.view.View r0 = r11.getChildAt(r6)
            r0.setVisibility(r3)
            goto L_0x006e
        L_0x0048:
            android.view.View r1 = X.C72483Me.A0K(r11)
            r1.setVisibility(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2, r9)
            goto L_0x0061
        L_0x0055:
            android.view.View r1 = X.C72483Me.A0K(r11)
            r1.setVisibility(r10)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r2, r2, r7)
        L_0x0061:
            r1.setLayoutParams(r0)
            android.view.View r0 = r11.getChildAt(r6)
            r0.setVisibility(r10)
            X.AnonymousClass3MZ.A1E(r0, r2, r8)
        L_0x006e:
            android.view.View r0 = r11.getChildAt(r5)
            r0.setVisibility(r3)
            return
        L_0x0076:
            android.view.View r0 = r11.getChildAt(r10)
            X.AnonymousClass3MZ.A1E(r0, r2, r1)
            android.view.View r0 = r11.getChildAt(r4)
            X.AnonymousClass3MZ.A1E(r0, r2, r9)
            android.view.View r0 = r11.getChildAt(r6)
            X.AnonymousClass3MZ.A1E(r0, r2, r7)
            android.view.View r0 = r11.getChildAt(r5)
            X.AnonymousClass3MZ.A1E(r0, r2, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.ConversationRowImageAndVideoAlbumGridFrame.setAlbumGridLayout(X.4DD):void");
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getSpacing() {
        return this.A01;
    }

    private final void A00(Context context) {
        this.A01 = context.getResources().getDimensionPixelSize(2131166347);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            int r3 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = r7.A01
            int r1 = r3 - r0
            r6 = 2
            int r1 = r1 / r6
            r0 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            X.4DD r0 = r7.A02
            int r0 = r0.ordinal()
            r2 = 1
            r1 = 0
            switch(r0) {
                case 0: goto L_0x006a;
                case 1: goto L_0x002b;
                case 2: goto L_0x0023;
                case 3: goto L_0x0050;
                case 4: goto L_0x0041;
                case 5: goto L_0x005f;
                default: goto L_0x001f;
            }
        L_0x001f:
            r7.setMeasuredDimension(r3, r3)
            return
        L_0x0023:
            android.view.View r0 = r7.getChildAt(r1)
            r0.measure(r5, r4)
            goto L_0x0032
        L_0x002b:
            android.view.View r0 = r7.getChildAt(r1)
            r0.measure(r4, r5)
        L_0x0032:
            android.view.View r0 = r7.getChildAt(r2)
            r0.measure(r4, r4)
            android.view.View r0 = r7.getChildAt(r6)
            r0.measure(r4, r4)
            goto L_0x001f
        L_0x0041:
            android.view.View r0 = r7.getChildAt(r1)
            r0.measure(r5, r4)
            android.view.View r0 = r7.getChildAt(r2)
            r0.measure(r5, r4)
            goto L_0x001f
        L_0x0050:
            android.view.View r0 = r7.getChildAt(r1)
            r0.measure(r4, r5)
            android.view.View r0 = r7.getChildAt(r2)
            r0.measure(r4, r5)
            goto L_0x001f
        L_0x005f:
            android.view.View r0 = r7.getChildAt(r1)
            r0.measure(r5, r5)
            goto L_0x001f
        L_0x0067:
            r0 = 4
            if (r1 >= r0) goto L_0x001f
        L_0x006a:
            android.view.View r0 = r7.getChildAt(r1)
            r0.measure(r4, r4)
            int r1 = r1 + 1
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.ConversationRowImageAndVideoAlbumGridFrame.onMeasure(int, int):void");
    }

    public final void setSpacing(int i) {
        this.A01 = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowImageAndVideoAlbumGridFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        this.A02 = AnonymousClass4DD.FOUR_ITEMS;
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowImageAndVideoAlbumGridFrame(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A01();
        this.A02 = AnonymousClass4DD.FOUR_ITEMS;
        A00(context);
    }

    public ConversationRowImageAndVideoAlbumGridFrame(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationRowImageAndVideoAlbumGridFrame(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        this.A02 = AnonymousClass4DD.FOUR_ITEMS;
        A00(context);
    }
}
