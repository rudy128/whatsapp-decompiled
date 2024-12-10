package X;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Hv  reason: invalid class name and case insensitive filesystem */
public class C161808Hv extends C38391rD implements B4G {
    public Handler A00;
    public PreferenceGroup A01;
    public Runnable A02;
    public List A03;
    public List A04;
    public List A05;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9Nw, java.lang.Object] */
    private void A01(PreferenceGroup preferenceGroup, List list) {
        List list2;
        synchronized (preferenceGroup) {
            list2 = preferenceGroup.A01;
            Collections.sort(list2);
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list2.get(i);
            list.add(preference);
            ? obj = new Object();
            obj.A02 = C17890vO.A0U(preference);
            obj.A00 = preference.A01;
            obj.A01 = preference.A03;
            List list3 = this.A03;
            if (!list3.contains(obj)) {
                list3.add(obj);
            }
            if (preference instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) preference;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    A01(preferenceGroup2, list);
                }
            }
            preference.A09 = this;
        }
    }

    public long A0M(int i) {
        if (!this.A00) {
            return -1;
        }
        Preference A0U = A0U(i);
        if (A0U instanceof C161648Gx) {
            return ((C161648Gx) A0U).A00;
        }
        return A0U.A04;
    }

    public int A0Q() {
        return this.A05.size();
    }

    public Preference A0U(int i) {
        if (i < 0 || i >= this.A05.size()) {
            return null;
        }
        return (Preference) this.A05.get(i);
    }

    public void A0V() {
        for (Preference preference : this.A04) {
            preference.A09 = null;
        }
        ArrayList A14 = AnonymousClass000.A14(this.A04);
        this.A04 = A14;
        PreferenceGroup preferenceGroup = this.A01;
        A01(preferenceGroup, A14);
        this.A05 = A00(preferenceGroup);
        notifyDataSetChanged();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        A0U(i).A0G((AnonymousClass8J3) r2);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C180779Nw r4 = (C180779Nw) this.A03.get(i);
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, AnonymousClass9UH.A00);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = AnonymousClass03S.A01(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View A09 = AnonymousClass3MX.A09(A0D, viewGroup, r4.A00);
        if (A09.getBackground() == null) {
            A09.setBackground(drawable);
        }
        ViewGroup A0D2 = AnonymousClass3MW.A0D(A09, 16908312);
        if (A0D2 != null) {
            int i2 = r4.A01;
            if (i2 != 0) {
                A0D.inflate(i2, A0D2);
            } else {
                A0D2.setVisibility(8);
            }
        }
        return new AnonymousClass8J3(A09);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, androidx.preference.Preference, X.8Gx] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.ArrayList A00(androidx.preference.PreferenceGroup r13) {
        /*
            r12 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.List r9 = r13.A01
            int r8 = r9.size()
            r7 = 0
            r5 = 0
        L_0x0010:
            if (r7 >= r8) goto L_0x006c
            java.lang.Object r2 = r9.get(r7)
            androidx.preference.Preference r2 = (androidx.preference.Preference) r2
            boolean r0 = r2.A0U
            if (r0 == 0) goto L_0x0030
            int r0 = r13.A00
            r3 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            if (r0 == r3) goto L_0x0068
            r1 = 1
            if (r5 < r0) goto L_0x0068
            r4.add(r2)
        L_0x002a:
            boolean r0 = r2 instanceof androidx.preference.PreferenceGroup
            if (r0 != 0) goto L_0x0033
            int r5 = r5 + 1
        L_0x0030:
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0033:
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2
            boolean r0 = r2 instanceof androidx.preference.PreferenceScreen
            if (r0 != 0) goto L_0x0030
            if (r1 == 0) goto L_0x0046
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0046
            java.lang.String r0 = "Nesting an expandable group inside of another expandable group is not supported!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0046:
            java.util.ArrayList r0 = r12.A00(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x004e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r1 = r2.next()
            int r0 = r13.A00
            if (r0 == r3) goto L_0x0064
            if (r5 < r0) goto L_0x0064
            r4.add(r1)
        L_0x0061:
            int r5 = r5 + 1
            goto L_0x004e
        L_0x0064:
            r6.add(r1)
            goto L_0x0061
        L_0x0068:
            r6.add(r2)
            goto L_0x002a
        L_0x006c:
            int r1 = r13.A00
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x00ff
            if (r5 <= r1) goto L_0x00ff
            android.content.Context r1 = r13.A05
            long r2 = r13.A04
            r0 = 0
            X.8Gx r5 = new X.8Gx
            r5.<init>(r1, r0)
            r0 = 2131625280(0x7f0e0540, float:1.8877763E38)
            r5.A01 = r0
            r0 = 2131231676(0x7f0803bc, float:1.807944E38)
            r5.A09(r0)
            r0 = 2131899022(0x7f12328e, float:1.9432978E38)
            android.content.Context r9 = r5.A05
            java.lang.String r0 = r9.getString(r0)
            r5.A0I(r0)
            r1 = 999(0x3e7, float:1.4E-42)
            int r0 = r5.A02
            if (r1 == r0) goto L_0x00a1
            r5.A02 = r1
            r5.A06()
        L_0x00a1:
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r11 = r4.iterator()
            r7 = 0
        L_0x00aa:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r10 = r11.next()
            androidx.preference.Preference r10 = (androidx.preference.Preference) r10
            java.lang.CharSequence r4 = r10.A0F
            boolean r1 = r10 instanceof androidx.preference.PreferenceGroup
            if (r1 == 0) goto L_0x00c5
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00c5
            r8.add(r10)
        L_0x00c5:
            androidx.preference.PreferenceGroup r0 = r10.A0D
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00aa
            r8.add(r10)
            goto L_0x00aa
        L_0x00d3:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00aa
            if (r7 != 0) goto L_0x00dd
            r7 = r4
            goto L_0x00aa
        L_0x00dd:
            r1 = 2131899470(0x7f12344e, float:1.9433887E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1b()
            X.AnonymousClass001.A1Q(r7, r4, r0)
            java.lang.String r7 = r9.getString(r1, r0)
            goto L_0x00aa
        L_0x00ec:
            r5.A0H(r7)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 + r0
            r5.A00 = r2
            X.AHI r0 = new X.AHI
            r0.<init>(r13, r12)
            r5.A0B = r0
            r6.add(r5)
        L_0x00ff:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161808Hv.A00(androidx.preference.PreferenceGroup):java.util.ArrayList");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9Nw, java.lang.Object] */
    public int getItemViewType(int i) {
        Preference A0U = A0U(i);
        ? obj = new Object();
        obj.A02 = C17890vO.A0U(A0U);
        obj.A00 = A0U.A01;
        obj.A01 = A0U.A03;
        List list = this.A03;
        int indexOf = list.indexOf(obj);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = list.size();
        list.add(obj);
        return size;
    }
}
