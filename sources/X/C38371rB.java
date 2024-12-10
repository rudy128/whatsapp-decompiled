package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1rB  reason: invalid class name and case insensitive filesystem */
public class C38371rB extends BaseAdapter implements C38361rA, Filterable {
    public C23471Gk A00;
    public C23471Gk A01;
    public String A02;
    public final C18000vb A03;
    public final AnonymousClass1Nb A04;
    public final List A05 = new ArrayList();
    public final Filter A06 = new C38381rC(this);
    public final C38341r8 A07;
    public final /* synthetic */ ConversationsFragment A08;

    public int getViewTypeCount() {
        return 5;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C38371rB(ConversationsFragment conversationsFragment, C38341r8 r3, C18000vb r4, AnonymousClass1Nb r5) {
        this.A08 = conversationsFragment;
        C23471Gk r0 = new C23471Gk();
        this.A01 = r0;
        this.A00 = r0;
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = r3;
    }

    private void A00(String str) {
        View A032 = ConversationsFragment.A03(this.A08, AnonymousClass1BI.A00.A02(str));
        if (A032 != null && (A032.getTag() instanceof C42071xZ)) {
            ((C42071xZ) A032.getTag()).A0J(false, 0);
        }
    }

    public void CKf(String str) {
        String str2 = this.A02;
        this.A02 = str;
        A00(str2);
        A00(str);
    }

    public int getCount() {
        return this.A08.A3h.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A08.A3h.get(i);
    }

    public long getItemId(int i) {
        return (long) this.A08.A3h.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        Object obj = this.A08.A3h.get(i);
        if (obj instanceof C42041xW) {
            return 1;
        }
        if (obj instanceof C42051xX) {
            return 4;
        }
        if (obj instanceof C41521wZ) {
            return 3;
        }
        return 0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011e, code lost:
        r4.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0121, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0188, code lost:
        r0 = r1.A01(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r21, android.view.View r22, android.view.ViewGroup r23) {
        /*
            r20 = this;
            r1 = r23
            r7 = r22
            if (r23 == 0) goto L_0x029a
            r0 = r20
            com.whatsapp.conversationslist.ConversationsFragment r10 = r0.A08
            java.util.List r3 = r10.A3h
            r2 = r21
            java.lang.Object r13 = r3.get(r2)
            X.1tN r13 = (X.C39621tN) r13
            if (r13 == 0) goto L_0x0294
            if (r22 == 0) goto L_0x003d
            java.lang.Object r3 = r7.getTag()
            boolean r3 = r3 instanceof X.C42071xZ
            if (r3 == 0) goto L_0x003d
            java.lang.Object r4 = r7.getTag()
            X.1xZ r4 = (X.C42071xZ) r4
            X.1tN r3 = r4.A0B
            boolean r3 = X.C42171xk.A00(r3, r13)
            if (r3 != 0) goto L_0x003d
            X.1Gk r3 = r0.A01
            boolean r3 = r3.A02()
            if (r3 != 0) goto L_0x003d
            X.1yD r3 = r4.A0A
            if (r3 == 0) goto L_0x003d
            r3.A0I()
        L_0x003d:
            boolean r3 = r13 instanceof X.C42051xX
            if (r3 == 0) goto L_0x00a1
            X.1Gk r4 = r0.A01
            java.util.Random r2 = r10.A4T
            long r2 = r2.nextLong()
            r4.A00 = r2
            X.00H r2 = r10.A3D
            java.lang.Object r2 = r2.get()
            X.1a8 r2 = (X.C28391a8) r2
            r2.A00()
            androidx.recyclerview.widget.RecyclerView r2 = r10.A0O
            if (r2 == 0) goto L_0x009f
            X.1rD r2 = r2.A0B
            if (r2 == 0) goto L_0x009f
            X.28H r2 = (X.AnonymousClass28H) r2
            int r2 = r2.A00
        L_0x0062:
            X.1cU r11 = r10.A1b
            X.1Gk r0 = r0.A01
            long r12 = r0.A00
            long r15 = (long) r2
            java.lang.String r14 = "FAVORITES_FILTER"
            r11.A03(r12, r14, r15)
            if (r22 != 0) goto L_0x0083
            r3 = 0
            android.content.Context r0 = r1.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r0 = 2131624981(0x7f0e0415, float:1.8877157E38)
            android.view.View r7 = r2.inflate(r0, r1, r3)
            X.C18070vi.A0X(r7)
        L_0x0083:
            X.1oj r0 = r10.A0m
            X.1na r0 = r0.A00
            X.10E r1 = r0.A02
            X.00S r0 = r1.ABd
            java.lang.Object r2 = r0.get()
            X.1LU r2 = (X.AnonymousClass1LU) r2
            X.00S r0 = r1.A04
            java.lang.Object r1 = r0.get()
            X.0ve r1 = (X.C18030ve) r1
            X.4MW r0 = new X.4MW
            r0.<init>(r7, r1, r2)
        L_0x009e:
            return r7
        L_0x009f:
            r2 = 0
            goto L_0x0062
        L_0x00a1:
            boolean r3 = r13 instanceof X.C41521wZ
            r5 = 0
            if (r3 == 0) goto L_0x0190
            X.1Gk r4 = r0.A01
            java.util.Random r2 = r10.A4T
            long r2 = r2.nextLong()
            r4.A00 = r2
            X.00H r2 = r10.A3D
            java.lang.Object r2 = r2.get()
            X.1a8 r2 = (X.C28391a8) r2
            r2.A00()
            androidx.recyclerview.widget.RecyclerView r2 = r10.A0O
            if (r2 == 0) goto L_0x018d
            X.1rD r2 = r2.A0B
            if (r2 == 0) goto L_0x018d
            X.28H r2 = (X.AnonymousClass28H) r2
            int r4 = r2.A00
        L_0x00c7:
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r3 = r10.A1k
            r10.A14()
            X.1Gk r2 = r0.A01
            java.util.List r2 = r2.A03
            if (r2 != 0) goto L_0x00d4
            X.0wS r2 = X.C18460wS.A00
        L_0x00d4:
            r3.A0U(r2)
            X.1cU r14 = r10.A1b
            X.1Gk r2 = r0.A01
            long r15 = r2.A00
            X.1wZ r13 = (X.C41521wZ) r13
            java.lang.String r6 = r13.A00
            long r2 = (long) r4
            r17 = r6
            r18 = r2
            r14.A03(r15, r17, r18)
            if (r22 != 0) goto L_0x00fa
            android.content.Context r2 = r1.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            r2 = 2131624984(0x7f0e0418, float:1.8877163E38)
            android.view.View r7 = r3.inflate(r2, r1, r5)
        L_0x00fa:
            r1 = 2131433143(0x7f0b16b7, float:1.8488063E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r7, r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1 = 2131436255(0x7f0b22df, float:1.8494375E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r7, r1)
            r2 = 19
            X.4dF r1 = new X.4dF
            r1.<init>(r0, r2)
            r3.setOnClickListener(r1)
            com.whatsapp.conversationslist.filter.ConversationFilterViewModel r1 = r10.A1k
            int r0 = r6.hashCode()
            switch(r0) {
                case -1730152220: goto L_0x017b;
                case -817912192: goto L_0x016d;
                case 72525144: goto L_0x015f;
                case 1184498283: goto L_0x0130;
                case 1827283464: goto L_0x0122;
                default: goto L_0x011d;
            }
        L_0x011d:
            r0 = 0
        L_0x011e:
            r4.setText(r0)
            return r7
        L_0x0122:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x011d
            X.118 r1 = r1.A01
            r0 = 2131892968(0x7f121ae8, float:1.94207E38)
            goto L_0x0188
        L_0x0130:
            java.lang.String r0 = "CUSTOM_LIST_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x011d
            X.00H r0 = r1.A06
            java.lang.Object r6 = r0.get()
            X.1rO r6 = (X.C38501rO) r6
            X.118 r3 = r1.A01
            r2 = 2131889743(0x7f120e4f, float:1.9414158E38)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r13.A01
            r1[r5] = r0
            java.lang.String r2 = r3.A02(r2, r1)
            X.C18070vi.A0X(r2)
            android.content.Context r1 = r3.A00
            X.C18070vi.A0X(r1)
            X.1KW r0 = r6.A02
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r2)
            goto L_0x011e
        L_0x015f:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x011d
            X.118 r1 = r1.A01
            r0 = 2131892923(0x7f121abb, float:1.9420608E38)
            goto L_0x0188
        L_0x016d:
            java.lang.String r0 = "FAVORITES_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x011d
            X.118 r1 = r1.A01
            r0 = 2131888983(0x7f120b57, float:1.9412617E38)
            goto L_0x0188
        L_0x017b:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x011d
            X.118 r1 = r1.A01
            r0 = 2131892914(0x7f121ab2, float:1.942059E38)
        L_0x0188:
            java.lang.String r0 = r1.A01(r0)
            goto L_0x011e
        L_0x018d:
            r4 = 0
            goto L_0x00c7
        L_0x0190:
            boolean r3 = r13 instanceof X.C42041xW
            if (r3 == 0) goto L_0x01c0
            if (r22 != 0) goto L_0x01a5
            X.1FL r3 = r10.A1D()
            android.view.LayoutInflater r4 = r3.getLayoutInflater()
            r3 = 2131625857(0x7f0e0781, float:1.8878934E38)
            android.view.View r7 = r4.inflate(r3, r1, r5)
        L_0x01a5:
            r1 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r3 = r7.findViewById(r1)
            android.widget.TextView r3 = (android.widget.TextView) r3
            X.C43421zm.A04(r3)
            X.1xW r13 = (X.C42041xW) r13
            java.lang.String r1 = r13.A00
            r3.setText(r1)
            X.1r8 r0 = r0.A07
            if (r0 == 0) goto L_0x009e
            r0.C4E(r2)
            return r7
        L_0x01c0:
            if (r22 != 0) goto L_0x028c
            X.0ve r4 = r10.A25
            X.0vf r5 = X.C18040vf.A01
            r3 = 9528(0x2538, float:1.3352E-41)
            boolean r3 = X.C18020vd.A05(r5, r4, r3)
            r4 = r3 ^ 1
            java.lang.String r3 = "convertView is never null when in Android RecyclerView mode"
            X.C17960vV.A0F(r4, r3)
            X.0ve r4 = r10.A25
            if (r4 == 0) goto L_0x0289
            r3 = 12469(0x30b5, float:1.7473E-41)
            boolean r4 = X.C18020vd.A05(r5, r4, r3)
        L_0x01dd:
            X.0ve r3 = r10.A25
            boolean r3 = X.AnonymousClass1J8.A04(r3)
            if (r3 == 0) goto L_0x0286
            X.00H r3 = r10.A3b
            java.lang.Object r3 = r3.get()
            X.1LT r3 = (X.AnonymousClass1LT) r3
        L_0x01ed:
            android.view.View r7 = X.C42071xZ.A00(r1, r3, r4)
            if (r4 == 0) goto L_0x026c
            X.1o0 r5 = r10.A0g
            android.content.Context r6 = r1.getContext()
            X.1pb r9 = r10.A1T
            X.1pZ r8 = r10.A1D
            X.0ve r4 = r10.A25
            r3 = 10026(0x272a, float:1.405E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r12 = X.C18020vd.A05(r1, r4, r3)
            r11 = 0
            X.2DL r12 = r5.A00(r6, r7, r8, r9, r10, r11, r12)
        L_0x020c:
            X.0ve r4 = r10.A25
            X.0vf r3 = X.C18040vf.A01
            r1 = 9528(0x2538, float:1.3352E-41)
            boolean r1 = X.C18020vd.A05(r3, r4, r1)
            if (r1 != 0) goto L_0x0220
            r7.setTag(r12)
            X.1Fw r1 = r10.A0L
            r1.A05(r12)
        L_0x0220:
            boolean r3 = r13 instanceof X.C39631tO
            java.lang.String r1 = "Item at this step must be of type chat row"
            X.C17960vV.A0F(r3, r1)
            X.1BI r3 = r13.BTb()
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r3 = X.C22941Dw.A01(r3)
            X.5jJ r1 = r10.A2U
            if (r1 == 0) goto L_0x026a
            if (r3 == 0) goto L_0x026a
            X.6yE r15 = r1.A0T(r3)
        L_0x023b:
            X.1qw r1 = r10.A1m
            int r3 = r1.BRo()
            r18 = 0
            boolean r1 = r10.A3p
            if (r1 != 0) goto L_0x0263
            if (r3 != 0) goto L_0x024b
        L_0x0249:
            r18 = 1
        L_0x024b:
            boolean r1 = com.whatsapp.conversationslist.ConversationsFragment.A10(r10)
            if (r1 == 0) goto L_0x025e
            r16 = 10
        L_0x0253:
            X.1r8 r14 = r0.A07
            r17 = r2
            r12.A0I(r13, r14, r15, r16, r17, r18)
            com.whatsapp.conversationslist.ConversationsFragment.A0D(r7)
            return r7
        L_0x025e:
            int r16 = r10.A26()
            goto L_0x0253
        L_0x0263:
            if (r3 != 0) goto L_0x024b
            int r1 = r10.A02
            if (r2 >= r1) goto L_0x024b
            goto L_0x0249
        L_0x026a:
            r15 = 0
            goto L_0x023b
        L_0x026c:
            X.1nz r5 = r10.A0f
            android.content.Context r6 = r1.getContext()
            X.1pb r9 = r10.A1T
            X.1pZ r8 = r10.A1D
            X.0ve r4 = r10.A25
            r3 = 10026(0x272a, float:1.405E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r12 = X.C18020vd.A05(r1, r4, r3)
            r11 = 0
            X.1xZ r12 = r5.A00(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x020c
        L_0x0286:
            r3 = 0
            goto L_0x01ed
        L_0x0289:
            r4 = 0
            goto L_0x01dd
        L_0x028c:
            java.lang.Object r12 = r7.getTag()
            X.1xZ r12 = (X.C42071xZ) r12
            goto L_0x020c
        L_0x0294:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x029a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38371rB.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public void BLD() {
        getFilter().filter(this.A01.A02);
    }

    public C23471Gk BN7() {
        return this.A00;
    }

    public C23471Gk BRg() {
        return this.A01;
    }

    public List BXB() {
        return this.A05;
    }

    public String BYr() {
        return this.A02;
    }

    public void CIs(C23471Gk r1) {
        this.A01 = r1;
    }

    public Filter getFilter() {
        return this.A06;
    }

    public boolean isEmpty() {
        if (!super.isEmpty()) {
            return false;
        }
        ConversationsFragment conversationsFragment = this.A08;
        if ((conversationsFragment.A00 != 0 || conversationsFragment.A3t) && TextUtils.isEmpty(this.A01.A02)) {
            return false;
        }
        return true;
    }
}
