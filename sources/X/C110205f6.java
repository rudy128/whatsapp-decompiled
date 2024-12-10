package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.phonematching.CountryPicker;
import java.util.List;

/* renamed from: X.5f6  reason: invalid class name and case insensitive filesystem */
public final class C110205f6 extends ArrayAdapter {
    public final String A00;
    public final String A01;
    public final /* synthetic */ CountryPicker A02;

    public int getCount() {
        return Math.max(1, super.getCount());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110205f6(Context context, CountryPicker countryPicker, String str, String str2, List list) {
        super(context, 2131625015, list);
        this.A02 = countryPicker;
        this.A00 = str;
        this.A01 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r0 == null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            int r0 = super.getCount()
            r2 = 1
            if (r0 != 0) goto L_0x0032
            if (r10 == 0) goto L_0x0012
            r0 = 2131436455(0x7f0b23a7, float:1.849478E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0012:
            android.content.Context r0 = r8.getContext()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            com.whatsapp.phonematching.CountryPicker r0 = r8.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131626115(0x7f0e0883, float:1.8879457E38)
            r1.inflate(r0, r10, r2)
            r0 = 2131430388(0x7f0b0bf4, float:1.8482476E38)
            android.view.View r0 = r10.findViewById(r0)
            r0.setClickable(r2)
        L_0x0031:
            return r10
        L_0x0032:
            java.lang.Object r7 = r8.getItem(r9)
            X.C17960vV.A07(r7)
            X.6ne r7 = (X.C132826ne) r7
            if (r10 == 0) goto L_0x0046
            r0 = 2131429686(0x7f0b0936, float:1.8481052E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 != 0) goto L_0x005b
        L_0x0046:
            android.content.Context r0 = r8.getContext()
            android.widget.LinearLayout r10 = new android.widget.LinearLayout
            r10.<init>(r0)
            com.whatsapp.phonematching.CountryPicker r0 = r8.A02
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625015(0x7f0e0437, float:1.8877226E38)
            r1.inflate(r0, r10, r2)
        L_0x005b:
            r0 = 2131429687(0x7f0b0937, float:1.8481054E38)
            com.whatsapp.TextEmojiLabel r1 = X.AnonymousClass3MX.A0V(r10, r0)
            java.lang.String r0 = r7.A02
            r1.A0R(r0)
            r0 = 2
            r1.setImportantForAccessibility(r0)
            r0 = 2131429686(0x7f0b0936, float:1.8481052E38)
            android.widget.TextView r5 = X.AnonymousClass3MW.A0J(r10, r0)
            java.lang.String r2 = r7.A01
            r5.setText(r2)
            r0 = 2131429692(0x7f0b093c, float:1.8481064E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r10, r0)
            java.lang.String r0 = r7.A04
            r6 = 0
            if (r0 == 0) goto L_0x00dc
            r1.setText(r0)
            r0 = 0
            r1.setVisibility(r0)
        L_0x008a:
            X.C43421zm.A04(r5)
            r0 = 2131429683(0x7f0b0933, float:1.8481046E38)
            android.widget.TextView r3 = X.AnonymousClass3MW.A0J(r10, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "+"
            r1.append(r0)
            java.lang.String r0 = r7.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.setText(r0)
            r0 = 2131429694(0x7f0b093e, float:1.8481068E38)
            android.widget.ImageView r4 = X.AnonymousClass3MW.A0H(r10, r0)
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r8.A00
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00e5
            java.lang.String r0 = r8.A01
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto L_0x00e5
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r3 = r0.getResources()
            android.content.Context r2 = r8.getContext()
            r1 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            int r0 = X.AnonymousClass3Ma.A01(r2, r3, r1, r0)
            r5.setTextColor(r0)
            r4.setImageDrawable(r6)
            return r10
        L_0x00dc:
            r0 = 8
            r1.setVisibility(r0)
            r1.setText(r6)
            goto L_0x008a
        L_0x00e5:
            android.content.Context r2 = r8.getContext()
            android.content.Context r1 = r8.getContext()
            r0 = 2130971135(0x7f0409ff, float:1.7551E38)
            int r0 = X.AnonymousClass4Z9.A00(r1, r0)
            X.AnonymousClass3MX.A1C(r2, r5, r0)
            r0 = 2131231805(0x7f08043d, float:1.8079701E38)
            r4.setImageResource(r0)
            android.content.Context r3 = r8.getContext()
            android.content.Context r2 = r8.getContext()
            r1 = 2130970093(0x7f0405ed, float:1.7548886E38)
            r0 = 2131101214(0x7f06061e, float:1.7814831E38)
            int r0 = X.AnonymousClass3MZ.A02(r2, r3, r1, r0)
            X.AnonymousClass4aX.A0D(r4, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110205f6.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
