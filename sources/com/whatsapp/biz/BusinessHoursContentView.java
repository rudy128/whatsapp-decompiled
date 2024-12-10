package com.whatsapp.biz;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.C108945cZ;
import X.C17880vN;
import X.C18070vi;
import X.C18460wS;
import X.C19740yt;
import X.C72453Mb;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;

public final class BusinessHoursContentView extends FrameLayout implements AnonymousClass009 {
    public static final int[] A04 = {2131428532, 2131428533, 2131428534, 2131428535, 2131428536, 2131428537, 2131428538};
    public AnonymousClass031 A00;
    public List A01;
    public List A02;
    public boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        A01();
        A00();
    }

    public final void setup(List list) {
        Pair pair;
        TextView textView;
        Pair pair2;
        TextView textView2;
        C18070vi.A0d(list, 0);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List list2 = this.A01;
            if (!(list2 == null || (pair2 = (Pair) list2.get(i)) == null || (textView2 = (TextView) pair2.first) == null)) {
                AnonymousClass8BR.A1E(textView2, ((Pair) list.get(i)).first);
            }
            List list3 = this.A01;
            if (!(list3 == null || (pair = (Pair) list3.get(i)) == null || (textView = (TextView) pair.second) == null)) {
                AnonymousClass8BR.A1E(textView, ((Pair) list.get(i)).second);
            }
        }
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

    public final void setDescriptionViewGravityAndPadding(int i) {
        List<View> list = this.A02;
        if (list == null) {
            list = C18460wS.A00;
        }
        for (View A0E : list) {
            TextView A0E2 = C17880vN.A0E(A0E, 2131428539);
            A0E2.setGravity(i);
            if (8388613 == i) {
                A0E2.setPadding(A0E2.getPaddingLeft(), A0E2.getPaddingTop(), getResources().getDimensionPixelSize(2131168354), A0E2.getPaddingBottom());
            }
        }
    }

    public final void setFullView(boolean z) {
        List list;
        View view;
        List list2 = this.A02;
        if (list2 == null) {
            list2 = C18460wS.A00;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            if (!(i == 0 || (list = this.A02) == null || (view = (View) list.get(i)) == null)) {
                view.setVisibility(C72453Mb.A07(z ? 1 : 0));
            }
        }
    }

    private final void A00() {
        View A0A = AnonymousClass3MX.A0A(AnonymousClass3MZ.A0D(this), this, 2131624365);
        int[] iArr = A04;
        this.A02 = C17880vN.A0z(7);
        this.A01 = C17880vN.A0z(7);
        int i = 0;
        do {
            View findViewById = A0A.findViewById(iArr[i]);
            View findViewById2 = findViewById.findViewById(2131428540);
            View findViewById3 = findViewById.findViewById(2131428539);
            List list = this.A02;
            if (list != null) {
                list.add(findViewById);
            }
            List list2 = this.A01;
            if (list2 != null) {
                list2.add(C108945cZ.A0N(findViewById2, findViewById3));
            }
            i++;
        } while (i < 7);
    }

    private final int getLayout() {
        return 2131624365;
    }

    private final void setOpenStatus(TextView textView) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C19740yt.A00(getContext(), 2131099970));
        String A0F = C18070vi.A0F(getContext(), 2131887559);
        SpannableString spannableString = new SpannableString(A0F);
        spannableString.setSpan(foregroundColorSpan, 0, A0F.length(), 33);
        if (textView != null) {
            textView.setText(spannableString);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        setOpenStatus(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setupWithOpenNow(java.util.List r12, long r13, X.C20260ADs r15) {
        /*
            r11 = this;
            X.C18070vi.A0i(r12, r15)
            int r3 = r12.size()
            r2 = 0
        L_0x0008:
            if (r2 >= r3) goto L_0x00b1
            java.util.List r0 = r11.A01
            r1 = 0
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r0 = r0.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r5 = r0.first
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x001b:
            java.util.List r0 = r11.A01
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r0.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            if (r0 == 0) goto L_0x002b
            java.lang.Object r1 = r0.second
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x002b:
            if (r2 != 0) goto L_0x0090
            r7 = 1
            java.lang.String r4 = r15.A01
            boolean r0 = X.AnonymousClass1EG.A0H(r4)
            if (r0 == 0) goto L_0x008b
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
        L_0x003a:
            java.util.Calendar r8 = java.util.Calendar.getInstance(r0)
            r8.setTimeInMillis(r13)
            r0 = 7
            int r6 = r8.get(r0)
            r0 = 11
            int r0 = r8.get(r0)
            int r4 = r0 * 60
            r0 = 12
            int r0 = r8.get(r0)
            int r4 = r4 + r0
            java.util.List r0 = r15.A02
            java.util.Iterator r10 = r0.iterator()
        L_0x005b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0090
            java.lang.Object r9 = r10.next()
            X.AE8 r9 = (X.AE8) r9
            if (r9 == 0) goto L_0x005b
            int r0 = r9.A00
            if (r0 != r6) goto L_0x005b
            int r8 = r9.A01
            if (r8 == 0) goto L_0x0077
            if (r8 == r7) goto L_0x0087
            r0 = 2
            if (r8 == r0) goto L_0x0087
            goto L_0x005b
        L_0x0077:
            java.lang.Integer r0 = r9.A03
            int r0 = X.AnonymousClass8BV.A03(r0)
            if (r4 < r0) goto L_0x005b
            java.lang.Integer r0 = r9.A02
            int r0 = X.AnonymousClass8BV.A03(r0)
            if (r4 > r0) goto L_0x005b
        L_0x0087:
            r11.setOpenStatus(r5)
            goto L_0x009d
        L_0x008b:
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r4)
            goto L_0x003a
        L_0x0090:
            if (r5 == 0) goto L_0x009d
            java.lang.Object r0 = r12.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            X.AnonymousClass8BR.A1E(r5, r0)
        L_0x009d:
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r0 = r12.get(r2)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.AnonymousClass8BR.A1E(r1, r0)
        L_0x00aa:
            int r2 = r2 + 1
            goto L_0x0008
        L_0x00ae:
            r5 = r1
            goto L_0x001b
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.biz.BusinessHoursContentView.setupWithOpenNow(java.util.List, long, X.ADs):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C18070vi.A0d(context, 1);
        A01();
        A00();
    }

    public BusinessHoursContentView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessHoursContentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        A01();
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessHoursContentView(Context context) {
        super(context);
        C18070vi.A0d(context, 1);
        A01();
        A00();
    }
}
