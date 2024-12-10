package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass6bU;
import X.C113685nY;
import X.C143867Fc;
import X.C38021qZ;
import android.graphics.Rect;
import android.os.Handler;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class CallGridLayoutManager extends StaggeredGridLayoutManager {
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass6bU A02;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C143867Fc A0A;
    public final C113685nY A0B;

    public CallGridLayoutManager(C143867Fc r2, C113685nY r3) {
        super(1, 1);
        this.A0B = r3;
        this.A0A = r2;
        this.A09 = new Handler();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0066, code lost:
        if (r7.A08 == false) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1D(X.C37931qQ r20, X.C38021qZ r21) {
        /*
            r19 = this;
            r7 = r19
            boolean r0 = r7.A07
            r10 = r20
            r9 = r21
            if (r0 != 0) goto L_0x016c
            int r1 = r7.A0K()
            int r11 = r9.A00()
            if (r1 != 0) goto L_0x0022
            int r1 = r7.A0J()
        L_0x0018:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x016f
            X.1qm r0 = r7.A05
            r0.A09(r1)
            goto L_0x0018
        L_0x0022:
            r7.A0a(r10)
            X.7Fc r8 = r7.A0A
            boolean r0 = r7.A04
            int r6 = r8.A01(r1, r0)
            int r4 = r7.A0M()
            int r3 = r7.A0O()
            int r2 = r7.A0N()
            int r0 = r7.A0L()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r4, r3, r2, r0)
            int r2 = r7.A00
            int r0 = r1.top
            int r4 = r2 - r0
            int r0 = r1.bottom
            int r4 = r4 - r0
            int r3 = r7.A03
            int r0 = r1.left
            int r3 = r3 - r0
            int r0 = r1.right
            int r3 = r3 - r0
            int r0 = r7.A06
            r1 = 1
            boolean r15 = X.AnonymousClass000.A1S(r6, r0)
            int r0 = r7.A01
            boolean r14 = X.AnonymousClass000.A1S(r2, r0)
            if (r11 != r1) goto L_0x0068
            boolean r0 = r7.A08
            r18 = 1
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            r18 = 0
        L_0x006a:
            int r2 = r7.A0K()
            boolean r0 = r7.A04
            int r5 = r8.A00(r2, r4, r0)
            int r12 = r7.A0K()
            boolean r2 = r7.A04
            r0 = 12
            if (r12 <= r0) goto L_0x0152
            r17 = 0
        L_0x0080:
            int r13 = r3 / r6
            int r0 = r13 * r6
            int r16 = r3 - r0
            boolean r0 = r7.A06
            if (r0 != 0) goto L_0x014f
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0096
            X.5nY r0 = r7.A0B
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00a0
        L_0x0096:
            int r0 = r7.A00
            if (r5 <= r0) goto L_0x014f
            if (r14 != 0) goto L_0x014f
            if (r15 != 0) goto L_0x014f
            if (r11 == r1) goto L_0x014f
        L_0x00a0:
            r7.A03 = r1
            android.graphics.Rect r12 = X.AnonymousClass3MW.A07()
            if (r18 == 0) goto L_0x00c7
            boolean r5 = r7.A05
            boolean r0 = r7.A04
            r2 = r3
            r1 = r4
            if (r0 == r5) goto L_0x00b4
            if (r5 == 0) goto L_0x014b
            int r1 = r4 / 2
        L_0x00b4:
            X.6rY r0 = new X.6rY
            r0.<init>(r2, r1)
            int r13 = r0.A01
            int r5 = r0.A00
            int r4 = r4 - r5
            int r0 = r4 / 2
            r12.top = r0
            int r3 = r3 - r13
            int r0 = r3 / 2
            r12.left = r0
        L_0x00c7:
            r4 = 0
        L_0x00c8:
            if (r4 >= r11) goto L_0x015b
            android.view.View r3 = r10.A02(r4)
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0144
            int r0 = r3.getHeight()
            if (r0 != 0) goto L_0x0142
            int r15 = r7.A00
        L_0x00da:
            int r0 = r4 % r6
            r14 = 0
            if (r0 != 0) goto L_0x00e1
            r14 = r16
        L_0x00e1:
            int r14 = r14 + r13
            if (r15 == 0) goto L_0x0138
            if (r18 != 0) goto L_0x0123
            X.6rY r1 = new X.6rY
            r1.<init>(r14, r15)
            android.graphics.Rect r2 = X.AnonymousClass3MW.A07()
            boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0140
            r0 = 1
            if (r4 != r0) goto L_0x0140
            r0 = 5
            if (r11 < r0) goto L_0x0140
            int r0 = r11 % 2
            if (r0 == 0) goto L_0x0140
            int r0 = r1.A00
            int r0 = r0 / 2
        L_0x0101:
            r2.top = r0
            X.6rY r1 = new X.6rY
            r1.<init>(r14, r15)
            int r14 = r1.A01
            int r15 = r1.A00
            X.6rY r1 = new X.6rY
            r1.<init>(r14, r15)
            r12.top = r0
            int r0 = r2.left
            r12.left = r0
            int r0 = r2.bottom
            r12.bottom = r0
            int r0 = r2.right
            r12.right = r0
            int r14 = r1.A01
            int r15 = r1.A00
        L_0x0123:
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r3)
            int r1 = r12.top
            r2.topMargin = r1
            int r0 = r12.left
            r2.leftMargin = r0
            int r15 = r15 + r1
            r2.height = r15
            int r14 = r14 + r0
            r2.width = r14
            r3.setLayoutParams(r2)
        L_0x0138:
            r1 = -1
            r0 = 0
            X.C38251qy.A04(r3, r7, r1, r0)
            int r4 = r4 + 1
            goto L_0x00c8
        L_0x0140:
            r0 = 0
            goto L_0x0101
        L_0x0142:
            r15 = 0
            goto L_0x00da
        L_0x0144:
            r15 = 0
            if (r4 >= r6) goto L_0x0149
            r15 = r17
        L_0x0149:
            int r15 = r15 + r5
            goto L_0x00da
        L_0x014b:
            int r2 = r3 / 2
            goto L_0x00b4
        L_0x014f:
            r1 = 0
            goto L_0x00a0
        L_0x0152:
            int r0 = r8.A02(r12, r2)
            int r0 = r0 * r5
            int r17 = r4 - r0
            goto L_0x0080
        L_0x015b:
            int r0 = r7.A06
            if (r6 == r0) goto L_0x016c
            android.os.Handler r2 = r7.A09
            r1 = 29
            X.7RP r0 = new X.7RP
            r0.<init>(r7, r6, r1)
            r2.post(r0)
            return
        L_0x016c:
            super.A1D(r10, r9)
        L_0x016f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.CallGridLayoutManager.A1D(X.1qQ, X.1qZ):void");
    }

    public boolean A1J() {
        return !this.A06;
    }

    public void A1F(C38021qZ r6) {
        super.A1F(r6);
        this.A01 = this.A00;
        Rect rect = new Rect(A0M(), A0O(), A0N(), A0L());
        this.A00 = this.A0A.A00(A0K(), (this.A00 - rect.top) - rect.bottom, this.A04);
        AnonymousClass6bU r0 = this.A02;
        if (r0 != null) {
            r0.A00.A0F();
        }
    }
}
