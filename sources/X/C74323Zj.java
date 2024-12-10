package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3Zj  reason: invalid class name and case insensitive filesystem */
public class C74323Zj extends RecyclerView {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public View A05;
    public ViewGroup A06;
    public TextView A07;
    public C84874Le A08;
    public C87734Wt A09;
    public C87734Wt A0A;
    public AnonymousClass3WL A0B;
    public AnonymousClass1L4 A0C;
    public List A0D;
    public boolean A0E;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r1 = r19
            r9 = r17
            android.view.View r0 = r9.A05
            boolean r0 = X.AnonymousClass1L4.A00(r0)
            if (r0 == 0) goto L_0x0103
            X.4Wt r8 = r9.A09
        L_0x000e:
            boolean r0 = r8.A03
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L_0x0037
            r8.A03 = r5
            X.3Zj r0 = r8.A04
            android.view.View r0 = r0.A05
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 5
            X.C90664eR.A00(r1, r8, r0)
        L_0x0024:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
        L_0x0028:
            int r0 = r9.getVisibility()
            if (r0 != 0) goto L_0x0031
            android.view.View.MeasureSpec.getSize(r1)
        L_0x0031:
            r0 = r18
            super.onMeasure(r0, r1)
            return
        L_0x0037:
            X.3Zj r4 = r8.A04
            boolean r0 = r4.A0E
            if (r0 != 0) goto L_0x0028
            int r10 = r4.A00
            r1 = -1
            if (r10 != r1) goto L_0x00ea
            int r0 = r4.A03
            if (r0 == r1) goto L_0x00e8
            int r0 = r4.A04
            if (r0 == r1) goto L_0x00d4
            int r12 = r0 + 1
        L_0x004c:
            r11 = 0
            r10 = 0
            r3 = 0
        L_0x004f:
            if (r11 >= r12) goto L_0x00dc
            X.3WL r0 = r4.A0B
            int r13 = r0.getItemViewType(r11)
            java.util.Map r2 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r2.get(r0)
            X.3Y0 r1 = (X.AnonymousClass3Y0) r1
            if (r1 != 0) goto L_0x006c
            X.3Y0 r1 = X.AnonymousClass3WL.A00(r4, r13)
            r2.put(r0, r1)
        L_0x006c:
            java.util.List r0 = r4.A0D
            java.lang.Object r0 = r0.get(r11)
            X.4Rf r0 = (X.C86334Rf) r0
            r1.A0B(r0)
            android.view.ViewGroup r0 = r4.A06
            r16 = r0
            android.view.View r13 = r1.A0H
            int r1 = r16.getWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = r16.getHeight()
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            android.view.ViewGroup$LayoutParams r15 = r13.getLayoutParams()
            if (r15 != 0) goto L_0x009c
            r1 = -1
            r0 = -2
            android.view.ViewGroup$LayoutParams r15 = new android.view.ViewGroup$LayoutParams
            r15.<init>(r1, r0)
        L_0x009c:
            int r1 = X.C72453Mb.A0C(r16)
            int r0 = r15.width
            int r2 = android.view.ViewGroup.getChildMeasureSpec(r2, r1, r0)
            int r1 = r16.getPaddingTop()
            int r0 = r16.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r15.height
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r14, r1, r0)
            r13.measure(r2, r0)
            int r2 = r13.getMeasuredHeight()
            int r1 = r4.A03
            int r0 = r1 + 1
            if (r11 >= r0) goto L_0x00c7
            if (r11 != r1) goto L_0x00d2
            int r0 = r2 / 2
        L_0x00c6:
            int r3 = r3 + r0
        L_0x00c7:
            int r0 = r4.A04
            if (r11 != r0) goto L_0x00cd
            int r2 = r2 / 2
        L_0x00cd:
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x004f
        L_0x00d2:
            r0 = r2
            goto L_0x00c6
        L_0x00d4:
            X.3WL r0 = r4.A0B
            int r12 = r0.A0Q()
            goto L_0x004c
        L_0x00dc:
            r4.A00 = r10
            r4.A01 = r3
            X.3WL r0 = r4.A0B
            java.util.Map r0 = r0.A00
            r0.clear()
            goto L_0x00ea
        L_0x00e8:
            int r10 = r4.A02
        L_0x00ea:
            int r1 = r8.A01
            int r0 = r1 + r10
            int r2 = r8.A00
            if (r0 <= r2) goto L_0x0101
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x00fd
            int r1 = r4.A01
            r0 = -1
            if (r1 == r0) goto L_0x00fd
            if (r2 < r1) goto L_0x00fd
            r6 = r2
        L_0x00fd:
            r8.A02 = r5
            goto L_0x0024
        L_0x0101:
            r6 = r10
            goto L_0x00fd
        L_0x0103:
            X.4Wt r8 = r9.A0A
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74323Zj.onMeasure(int, int):void");
    }

    public void setData(String str, List list, C106835Xj r7) {
        this.A0D = AnonymousClass000.A13();
        if (str != null && !TextUtils.isEmpty(str)) {
            this.A0D.add(new C80573xQ(str));
        }
        this.A00 = -1;
        this.A04 = -1;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                this.A0D.add(new C80583xR((C89294cE) list.get(i), r7));
                if (i == 0) {
                    this.A03 = AnonymousClass3MX.A01(this.A0D);
                } else if (i == 2) {
                    this.A04 = AnonymousClass3MX.A01(this.A0D);
                }
                this.A0D.add(new C86334Rf(3));
            }
        }
        this.A0B.A0W(this.A0D);
    }
}
