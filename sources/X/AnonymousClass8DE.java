package X;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Calendar;
import java.util.Collection;

/* renamed from: X.8DE  reason: invalid class name */
public class AnonymousClass8DE extends BaseAdapter {
    public static final int A05 = A8Y.A07((Calendar) null).getMaximum(4);
    public static final int A06 = ((A8Y.A07((Calendar) null).getMaximum(5) + A8Y.A07((Calendar) null).getMaximum(7)) - 1);
    public C188209h3 A00;
    public Collection A01;
    public final ADU A02;
    public final BDX A03;
    public final C21349Aie A04;

    public boolean hasStableIds() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.widget.TextView r10, long r11) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x00ef
            android.content.Context r5 = r10.getContext()
            java.util.Calendar r0 = X.A8Y.A05()
            long r1 = r0.getTimeInMillis()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            boolean r8 = X.AnonymousClass000.A1P(r0)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r3.next()
            X.0yx r0 = (X.C19760yx) r0
            java.lang.Object r0 = r0.A00
            if (r0 == 0) goto L_0x001c
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            r7 = 1
        L_0x0035:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x003d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x012f
            java.lang.Object r0 = r3.next()
            X.0yx r0 = (X.C19760yx) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x003d
            long r1 = X.C17880vN.A05(r0)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x003d
            r6 = 1
        L_0x0056:
            java.util.Calendar r2 = X.A8Y.A05()
            java.util.Calendar r1 = X.AnonymousClass8BV.A0x(r11)
            r0 = 1
            int r4 = r2.get(r0)
            int r3 = r1.get(r0)
            java.util.Locale r2 = java.util.Locale.getDefault()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r4 != r3) goto L_0x0119
            if (r1 < r0) goto L_0x0121
            android.icu.text.DateFormat r1 = X.A8Y.A02(r2)
        L_0x0077:
            java.util.Date r0 = new java.util.Date
            r0.<init>(r11)
            java.lang.String r4 = r1.format(r0)
        L_0x0080:
            r3 = 0
            r2 = 1
            if (r8 == 0) goto L_0x0091
            r0 = 2131899235(0x7f123363, float:1.943341E38)
            java.lang.String r1 = r5.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = X.AnonymousClass8BS.A0l(r4, r1, r0, r3)
        L_0x0091:
            if (r7 == 0) goto L_0x0112
            r0 = 2131899228(0x7f12335c, float:1.9433396E38)
        L_0x0096:
            java.lang.String r1 = r5.getString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r4 = X.AnonymousClass8BS.A0l(r4, r1, r0, r3)
        L_0x00a0:
            r10.setContentDescription(r4)
            X.ADU r0 = r9.A02
            X.BDY r0 = r0.A04
            boolean r0 = r0.Bgw(r11)
            if (r0 == 0) goto L_0x010a
            r10.setEnabled(r2)
            X.BDX r0 = r9.A03
            X.AJN r0 = (X.AJN) r0
            java.util.ArrayList r0 = X.AnonymousClass8BX.A0i(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x00bc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0108
            long r1 = X.C17890vO.A07(r5)
            java.util.Calendar r0 = X.AnonymousClass8BV.A0x(r11)
            java.util.Calendar r0 = X.A8Y.A06(r0)
            long r3 = r0.getTimeInMillis()
            java.util.Calendar r0 = X.AnonymousClass8BV.A0x(r1)
            java.util.Calendar r0 = X.A8Y.A06(r0)
            long r1 = r0.getTimeInMillis()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            r0 = 1
        L_0x00e3:
            r10.setSelected(r0)
            if (r0 == 0) goto L_0x00f0
            X.9h3 r0 = r9.A00
            X.2qk r0 = r0.A03
        L_0x00ec:
            r0.A01(r10)
        L_0x00ef:
            return
        L_0x00f0:
            java.util.Calendar r0 = X.A8Y.A05()
            long r1 = r0.getTimeInMillis()
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r0)
            X.9h3 r0 = r9.A00
            if (r1 == 0) goto L_0x0105
            X.2qk r0 = r0.A05
            goto L_0x00ec
        L_0x0105:
            X.2qk r0 = r0.A01
            goto L_0x00ec
        L_0x0108:
            r0 = 0
            goto L_0x00e3
        L_0x010a:
            r10.setEnabled(r3)
            X.9h3 r0 = r9.A00
            X.2qk r0 = r0.A02
            goto L_0x00ec
        L_0x0112:
            if (r6 == 0) goto L_0x00a0
            r0 = 2131899214(0x7f12334e, float:1.9433368E38)
            goto L_0x0096
        L_0x0119:
            if (r1 < r0) goto L_0x0121
            android.icu.text.DateFormat r1 = X.A8Y.A04(r2)
            goto L_0x0077
        L_0x0121:
            r0 = 0
            java.text.DateFormat r0 = java.text.DateFormat.getDateInstance(r0, r2)
            X.AnonymousClass8BV.A1P(r0)
            java.lang.String r4 = X.AnonymousClass8BU.A0r(r0, r11)
            goto L_0x0080
        L_0x012f:
            r6 = 0
            goto L_0x0056
        L_0x0132:
            r7 = 0
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DE.A00(android.widget.TextView, long):void");
    }

    public int A02() {
        C21349Aie aie = this.A04;
        int i = this.A02.A01;
        Calendar calendar = aie.A06;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + aie.A02;
        }
        return i3;
    }

    public long getItemId(int i) {
        return (long) (i / this.A04.A02);
    }

    public AnonymousClass8DE(ADU adu, BDX bdx, C21349Aie aie) {
        this.A04 = aie;
        this.A03 = bdx;
        this.A02 = adu;
        this.A01 = AnonymousClass8BX.A0i((AJN) bdx);
    }

    public static void A01(MaterialCalendarGridView materialCalendarGridView, AnonymousClass8DE r3, long j) {
        C21349Aie aie = new C21349Aie(AnonymousClass8BV.A0x(j));
        C21349Aie aie2 = r3.A04;
        if (aie.equals(aie2)) {
            Calendar A062 = A8Y.A06(aie2.A06);
            A062.setTimeInMillis(j);
            int A022 = AnonymousClass8BT.A02(A062);
            r3.A00((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.A00().A02() + (A022 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* renamed from: A03 */
    public Long getItem(int i) {
        if (i < A02()) {
            return null;
        }
        int A022 = A02();
        C21349Aie aie = this.A04;
        if (i > (A022 + aie.A01) - 1) {
            return null;
        }
        Calendar A062 = A8Y.A06(aie.A06);
        A062.set(5, (i - A02()) + 1);
        return Long.valueOf(A062.getTimeInMillis());
    }

    public int getCount() {
        return A06;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ android.view.View getView(int r8, android.view.View r9, android.view.ViewGroup r10) {
        /*
            r7 = this;
            android.content.Context r1 = r10.getContext()
            X.9h3 r0 = r7.A00
            if (r0 != 0) goto L_0x000f
            X.9h3 r0 = new X.9h3
            r0.<init>(r1)
            r7.A00 = r0
        L_0x000f:
            r5 = r9
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 0
            if (r9 != 0) goto L_0x0022
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r10)
            r0 = 2131626081(0x7f0e0861, float:1.8879388E38)
            android.view.View r5 = r1.inflate(r0, r10, r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
        L_0x0022:
            int r0 = r7.A02()
            int r2 = r8 - r0
            if (r2 < 0) goto L_0x0062
            X.Aie r1 = r7.A04
            int r0 = r1.A01
            if (r2 >= r0) goto L_0x0062
            r4 = 1
            int r3 = r2 + 1
            r5.setTag(r1)
            android.content.res.Resources r0 = r5.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r2 = r0.locale
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.C17880vN.A1T(r1, r3, r6)
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            r5.setText(r0)
            r5.setVisibility(r6)
            r5.setEnabled(r4)
        L_0x0054:
            java.lang.Long r0 = r7.getItem(r8)
            if (r0 == 0) goto L_0x0061
            long r0 = r0.longValue()
            r7.A00(r5, r0)
        L_0x0061:
            return r5
        L_0x0062:
            r0 = 8
            r5.setVisibility(r0)
            r5.setEnabled(r6)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DE.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
