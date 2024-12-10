package X;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ow  reason: invalid class name and case insensitive filesystem */
public final class C73073Ow extends BaseAdapter implements Filterable {
    public C179509Ig A00 = C179509Ig.SUBSCRIBED;
    public String A01;
    public ArrayList A02;
    public final LayoutInflater A03;
    public final C85874Pb A04;
    public final AnonymousClass11S A05;
    public final C72043Kk A06;
    public final C24921Me A07;
    public final C37451pZ A08;
    public final C18000vb A09;
    public final AnonymousClass1c4 A0A;
    public final NewsletterInfoActivity A0B;
    public final List A0C = AnonymousClass000.A13();
    public final List A0D = AnonymousClass000.A13();
    public final C18100vl A0E = AnonymousClass1DF.A01(new C102925Ii(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C102935Ij(this));
    public final Filter A0G = new AnonymousClass3P4(this);

    public final void A01(C179509Ig r4, List list) {
        C18070vi.A0d(list, 0);
        this.A00 = r4;
        List list2 = this.A0C;
        list2.clear();
        list2.addAll(list);
        String str = this.A01;
        this.A01 = str;
        if (str == null || str.length() == 0) {
            A00(this, list2);
        } else {
            getFilter().filter(str);
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public static final void A00(C73073Ow r2, List list) {
        List list2 = r2.A0D;
        list2.clear();
        list2.addAll(list);
        ArrayList A032 = C20103A7h.A03(r2.A09, r2.A01);
        C18070vi.A0X(A032);
        r2.A02 = A032;
        r2.notifyDataSetChanged();
    }

    public int getCount() {
        return this.A0D.size();
    }

    public Filter getFilter() {
        return this.A0G;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A0D.get(i);
    }

    public int getItemViewType(int i) {
        Object obj = this.A0D.get(i);
        if (obj instanceof AnonymousClass43Q) {
            return 0;
        }
        if (obj instanceof AnonymousClass43S) {
            return 1;
        }
        if (obj instanceof AnonymousClass43T) {
            return 2;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0124, code lost:
        if (r8 != r10) goto L_0x0126;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r20, android.view.View r21, android.view.ViewGroup r22) {
        /*
            r19 = this;
            r3 = r21
            r0 = 2
            r6 = r22
            X.C18070vi.A0d(r6, r0)
            r5 = r19
            java.util.List r0 = r5.A0D
            r1 = r20
            java.lang.Object r2 = r0.get(r1)
            X.4Ep r2 = (X.C83304Ep) r2
            if (r21 != 0) goto L_0x0034
            int r4 = r5.getItemViewType(r1)
            r3 = 0
            if (r4 == 0) goto L_0x0059
            r0 = 1
            if (r4 == r0) goto L_0x004a
            r0 = 2
            if (r4 != r0) goto L_0x01a2
            android.view.LayoutInflater r1 = r5.A03
            r0 = 2131626190(0x7f0e08ce, float:1.887961E38)
            android.view.View r3 = X.AnonymousClass3MX.A0B(r1, r6, r0, r3)
            X.43V r0 = new X.43V
            r0.<init>(r3, r5)
        L_0x0031:
            r3.setTag(r0)
        L_0x0034:
            java.lang.Object r4 = r3.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.newsletter.NewsletterMembersListAdapter.ViewHolder"
            X.C18070vi.A0z(r4, r0)
            X.4FB r4 = (X.AnonymousClass4FB) r4
            java.util.ArrayList r0 = r5.A02
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "filterTerms"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x004a:
            android.view.LayoutInflater r1 = r5.A03
            r0 = 2131626201(0x7f0e08d9, float:1.8879632E38)
            android.view.View r3 = X.AnonymousClass3MX.A0B(r1, r6, r0, r3)
            X.43U r0 = new X.43U
            r0.<init>(r3, r5)
            goto L_0x0031
        L_0x0059:
            android.view.LayoutInflater r1 = r5.A03
            r0 = 2131626202(0x7f0e08da, float:1.8879634E38)
            android.view.View r3 = X.AnonymousClass3MX.A0B(r1, r6, r0, r3)
            X.43W r0 = new X.43W
            r0.<init>(r3, r5)
            goto L_0x0031
        L_0x0068:
            boolean r0 = r4 instanceof X.AnonymousClass43V
            if (r0 == 0) goto L_0x0088
            X.43V r4 = (X.AnonymousClass43V) r4
            r8 = 0
            X.C18070vi.A0d(r2, r8)
            r7 = 1
            r4.A00 = r2
            X.43T r2 = (X.AnonymousClass43T) r2
            java.lang.String r6 = r2.A00
            int r0 = r6.length()
            if (r0 != 0) goto L_0x017f
            com.whatsapp.WaTextView r1 = r4.A00
            r0 = 2131895498(0x7f1224ca, float:1.942583E38)
            r1.setText(r0)
        L_0x0087:
            return r3
        L_0x0088:
            boolean r0 = r4 instanceof X.AnonymousClass43W
            if (r0 == 0) goto L_0x0190
            X.43W r4 = (X.AnonymousClass43W) r4
            r8 = 0
            X.C18070vi.A0d(r2, r8)
            r4.A00 = r2
            boolean r0 = r2 instanceof X.AnonymousClass43Q
            X.C17960vV.A0D(r0)
            X.43Q r2 = (X.AnonymousClass43Q) r2
            X.4NS r5 = r2.A00
            X.1E7 r9 = r5.A00
            X.1BI r0 = r9.A0J
            X.3Ow r2 = r4.A05
            X.11S r11 = r2.A05
            boolean r7 = r11.A0O(r0)
            X.1xh r0 = r4.A02
            r18 = r0
            r1 = 0
            com.whatsapp.TextEmojiLabel r6 = r0.A01
            r6.setText(r1)
            com.whatsapp.newsletter.NewsletterInfoActivity r10 = r2.A0B
            r1 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r0 = 2131101314(0x7f060682, float:1.7815034E38)
            X.C72463Mc.A0y(r10, r6, r1, r0)
            com.whatsapp.TextEmojiLabel r6 = r4.A01
            r1 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0y(r10, r6, r1, r0)
            X.9Ig r13 = r5.A02
            X.1bI r0 = r4.A04
            r16 = r0
            android.view.View r14 = X.AnonymousClass3MX.A0D(r16)
            r0 = 2
            X.9Ig[] r15 = new X.C179509Ig[r0]
            X.9Ig r10 = X.C179509Ig.ADMIN
            r12 = 0
            r15[r8] = r10
            r0 = 1
            X.9Ig r1 = X.C179509Ig.OWNER
            java.util.List r0 = X.C18070vi.A0O(r1, r15, r0)
            boolean r0 = r0.contains(r13)
            if (r0 != 0) goto L_0x00ea
            r12 = 8
        L_0x00ea:
            r14.setVisibility(r12)
            if (r13 != r10) goto L_0x0174
            android.widget.TextView r12 = X.AnonymousClass3MX.A0M(r16)
            r0 = 2131892497(0x7f121911, float:1.9419744E38)
        L_0x00f6:
            r12.setText(r0)
        L_0x00f9:
            if (r7 == 0) goto L_0x0145
            r18.A02()
            X.1pZ r9 = r2.A08
            X.1E8 r8 = X.AnonymousClass3MZ.A0Q(r11)
            com.whatsapp.WaImageView r0 = r4.A03
            r9.A07(r0, r8)
            r0 = 2131892630(0x7f121996, float:1.9420014E38)
            r6.setText(r0)
        L_0x010f:
            X.9Ig r0 = r2.A00
            boolean r0 = X.AnonymousClass000.A1Z(r0, r10)
            r7 = r7 & r0
            X.0vl r0 = r2.A0E
            boolean r0 = X.C72453Mb.A1a(r0)
            r7 = r7 & r0
            X.9Ig r8 = r2.A00
            r6 = 1
            if (r8 == r1) goto L_0x0126
            r6 = 0
            r0 = 1
            if (r8 == r10) goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            r6 = r6 | r0
            r7 = r7 | r6
            android.view.View r6 = r4.A00
            r6.setClickable(r7)
            if (r7 == 0) goto L_0x0087
            r1 = 2
            X.4dZ r0 = new X.4dZ
            r0.<init>(r5, r2, r1)
            r6.setOnCreateContextMenuListener(r0)
            r0 = 48
            X.C90054dS.A00(r6, r4, r0)
            r0 = 2131232942(0x7f0808ae, float:1.8082007E38)
            r6.setBackgroundResource(r0)
            return r3
        L_0x0145:
            X.1Me r11 = r2.A07
            r0 = 2
            X.1yg r13 = r11.A0D(r9, r0)
            r11 = 0
            boolean r17 = r9.A0P()
            r14 = r9
            r15 = r11
            r16 = r0
            r12 = r18
            r12.A04(r13, r14, r15, r16, r17)
            X.1pZ r12 = r2.A08
            com.whatsapp.WaImageView r0 = r4.A03
            r12.A07(r0, r9)
            java.lang.String r0 = r9.A0Z
            if (r0 == 0) goto L_0x016e
            r6.setVisibility(r8)
            java.lang.String r0 = r9.A0Z
            r6.A0S(r0, r11, r8, r8)
            goto L_0x010f
        L_0x016e:
            r0 = 8
            r6.setVisibility(r0)
            goto L_0x010f
        L_0x0174:
            if (r13 != r1) goto L_0x00f9
            android.widget.TextView r12 = X.AnonymousClass3MX.A0M(r16)
            r0 = 2131892743(0x7f121a07, float:1.9420243E38)
            goto L_0x00f6
        L_0x017f:
            com.whatsapp.WaTextView r5 = r4.A00
            X.3Ow r0 = r4.A01
            com.whatsapp.newsletter.NewsletterInfoActivity r2 = r0.A0B
            r1 = 2131895497(0x7f1224c9, float:1.9425829E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r6
            X.AnonymousClass3MY.A0y(r2, r5, r0, r1)
            return r3
        L_0x0190:
            X.43U r4 = (X.AnonymousClass43U) r4
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r4.A00 = r2
            android.widget.LinearLayout r2 = r4.A00
            X.3Ow r1 = r4.A01
            r0 = 19
            X.AnonymousClass3Ma.A1D(r2, r1, r0)
            return r3
        L_0x01a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown type: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73073Ow.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C73073Ow(LayoutInflater layoutInflater, C85874Pb r3, AnonymousClass11S r4, C72043Kk r5, C24921Me r6, C37451pZ r7, C18000vb r8, AnonymousClass1c4 r9, NewsletterInfoActivity newsletterInfoActivity) {
        C18070vi.A0w(r4, r9, r8, r6, r5);
        C18070vi.A0d(r3, 6);
        this.A05 = r4;
        this.A0A = r9;
        this.A09 = r8;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A0B = newsletterInfoActivity;
        this.A03 = layoutInflater;
        this.A08 = r7;
    }
}
