package X;

import android.widget.BaseAdapter;
import com.whatsapp.profile.WebImagePicker;

/* renamed from: X.3On  reason: invalid class name and case insensitive filesystem */
public class C72983On extends BaseAdapter {
    public AnonymousClass48u A00;
    public boolean A01;
    public final /* synthetic */ WebImagePicker A02;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public C72983On(WebImagePicker webImagePicker) {
        this.A02 = webImagePicker;
    }

    public int getCount() {
        WebImagePicker webImagePicker = this.A02;
        int size = webImagePicker.A0L.size();
        int i = webImagePicker.A00;
        return ((size + i) - 1) / i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 != r2.A00) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r3 = r20
            r4 = 0
            r5 = r18
            if (r20 == 0) goto L_0x0013
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.getChildCount()
            com.whatsapp.profile.WebImagePicker r2 = r5.A02
            int r0 = r2.A00
            if (r1 == r0) goto L_0x0032
        L_0x0013:
            com.whatsapp.profile.WebImagePicker r2 = r5.A02
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r2)
            float r1 = X.C72473Md.A00(r3)
            r0 = 1076538027(0x402aaaab, float:2.6666667)
            float r1 = r1 * r0
            int r6 = (int) r1
            float r1 = X.C72473Md.A00(r3)
            r0 = 1068149419(0x3faaaaab, float:1.3333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r3.setPadding(r6, r0, r4, r0)
            r3.setClickable(r4)
        L_0x0032:
            int r9 = r3.getChildCount()
            int r8 = r2.A00
            r6 = r19
            int r8 = r8 * r19
            r7 = 0
        L_0x003d:
            int r0 = r19 + 1
            int r10 = r2.A00
            int r0 = r0 * r10
            if (r8 >= r0) goto L_0x00e9
            java.util.ArrayList r1 = r2.A0L
            int r0 = r1.size()
            if (r8 >= r0) goto L_0x00da
            java.lang.Object r11 = r1.get(r8)
            X.4SM r11 = (X.AnonymousClass4SM) r11
            if (r9 > r7) goto L_0x00d0
            android.widget.ImageView r15 = new android.widget.ImageView
            r15.<init>(r2)
            X.AnonymousClass3MW.A1R(r15)
            int r0 = r2.A01
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r0, r0)
            r15.setLayoutParams(r10)
            float r1 = X.C72473Md.A00(r15)
            r0 = 1079334229(0x40555555, float:3.3333333)
            float r1 = r1 * r0
            int r0 = (int) r1
            r10.rightMargin = r0
            r0 = 2131232942(0x7f0808ae, float:1.8082007E38)
            r15.setBackgroundResource(r0)
            float r1 = X.C72473Md.A00(r15)
            r0 = 1068149419(0x3faaaaab, float:1.3333334)
            float r1 = r1 * r0
            int r0 = (int) r1
            r15.setPadding(r0, r0, r0, r0)
            android.view.View$OnClickListener r0 = r2.A03
            r15.setOnClickListener(r0)
            r3.addView(r15)
        L_0x008b:
            java.lang.String r0 = r11.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00cd
            r0 = 2131889027(0x7f120b83, float:1.9412706E38)
            java.lang.String r0 = r2.getString(r0)
        L_0x009a:
            r15.setContentDescription(r0)
            r1 = 2131437040(0x7f0b25f0, float:1.8495967E38)
            java.lang.String r0 = r11.A07
            r15.setTag(r1, r0)
            X.4VT r12 = r2.A0E
            java.lang.String r10 = r11.A07
            int r1 = r11.A00
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r0 = r0 | r1
            if (r1 != 0) goto L_0x00ba
            r1 = 2130969386(0x7f04032a, float:1.7547452E38)
            r0 = 2131100378(0x7f0602da, float:1.7813136E38)
            int r0 = X.AnonymousClass3Ma.A00(r2, r1, r0)
        L_0x00ba:
            android.graphics.drawable.ColorDrawable r13 = new android.graphics.drawable.ColorDrawable
            r13.<init>(r0)
            r14 = 0
            r16 = r14
            r17 = r10
            r12.A00(r13, r14, r15, r16, r17)
            int r7 = r7 + 1
        L_0x00c9:
            int r8 = r8 + 1
            goto L_0x003d
        L_0x00cd:
            java.lang.String r0 = r11.A04
            goto L_0x009a
        L_0x00d0:
            android.view.View r15 = r3.getChildAt(r7)
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r15.setVisibility(r4)
            goto L_0x008b
        L_0x00da:
            int r10 = r10 * r19
            int r0 = r8 - r10
            if (r9 <= r0) goto L_0x00c9
            android.view.View r1 = r3.getChildAt(r0)
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x00c9
        L_0x00e9:
            X.48u r0 = r5.A00
            if (r0 != 0) goto L_0x010c
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x010c
            java.util.ArrayList r0 = r2.A0L
            int r0 = r0.size()
            int r0 = r0 + -1
            int r0 = r0 / r10
            if (r6 != r0) goto L_0x010c
            X.48u r0 = new X.48u
            r0.<init>(r5)
            r5.A00 = r0
            X.10s r2 = r2.A0F
            java.lang.Void[] r1 = new java.lang.Void[r4]
            X.8CU r0 = r0.A02
            r0.executeOnExecutor(r2, r1)
        L_0x010c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72983On.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
