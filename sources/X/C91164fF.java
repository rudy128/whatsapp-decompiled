package X;

import com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler;

/* renamed from: X.4fF  reason: invalid class name and case insensitive filesystem */
public class C91164fF implements C15930rR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91164fF(C41531wa r1, ConversationFilterMenuHandler conversationFilterMenuHandler, int i) {
        this.A00 = i;
        if (4 - i != 0) {
            this.A01 = r1;
            this.A02 = conversationFilterMenuHandler;
            return;
        }
        this.A01 = conversationFilterMenuHandler;
        this.A02 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.1LU, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0095, code lost:
        X.AnonymousClass3MY.A1G(r4.A01(r3, r1, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f9, code lost:
        r0.get();
        r4 = X.AnonymousClass4H2.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r3.putInt("arg_entry_point", 5);
        r4.A1R(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        X.C137086ut.A01(r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMenuItemClick(android.view.MenuItem r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x014d;
                case 1: goto L_0x012b;
                case 2: goto L_0x0102;
                case 3: goto L_0x00b1;
                case 4: goto L_0x006b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r7.A01
            X.1wa r5 = (X.C41531wa) r5
            java.lang.Object r6 = r7.A02
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r6 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r6
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            int r1 = r8.getItemId()
            r0 = 2131429640(0x7f0b0908, float:1.8480958E38)
            if (r1 != r0) goto L_0x0045
            boolean r0 = r5 instanceof X.C41551wc
            if (r0 == 0) goto L_0x0043
            X.1wc r5 = (X.C41551wc) r5
            X.1x1 r1 = r5.A01
            androidx.fragment.app.Fragment r5 = r6.A01
            X.00H r0 = r6.A0C
            r0.get()
            java.lang.String r0 = "labelInfo"
            com.whatsapp.lists.ListsManagerBottomSheetFragment r4 = new com.whatsapp.lists.ListsManagerBottomSheetFragment
            r4.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            r3.putParcelable(r0, r1)
        L_0x0037:
            r1 = 5
            java.lang.String r0 = "arg_entry_point"
            r3.putInt(r0, r1)
            r4.A1R(r3)
        L_0x0040:
            X.C137086ut.A01(r4, r5)
        L_0x0043:
            r0 = 1
            return r0
        L_0x0045:
            r0 = 2131429639(0x7f0b0907, float:1.8480956E38)
            if (r1 != r0) goto L_0x0060
            X.00H r0 = r6.A0C
            java.lang.Object r4 = r0.get()
            X.1rO r4 = (X.C38501rO) r4
            android.content.Context r3 = r6.A00
            boolean r2 = r5 instanceof X.C41551wc
            java.lang.String r1 = r5.A00()
            X.5NN r0 = new X.5NN
            r0.<init>(r5, r6)
            goto L_0x0095
        L_0x0060:
            r0 = 2131429641(0x7f0b0909, float:1.848096E38)
            if (r1 != r0) goto L_0x0043
            androidx.fragment.app.Fragment r5 = r6.A01
            X.00H r0 = r6.A0C
            goto L_0x00f9
        L_0x006b:
            java.lang.Object r6 = r7.A01
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r6 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r6
            java.lang.Object r5 = r7.A02
            X.1wa r5 = (X.C41531wa) r5
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            int r1 = r8.getItemId()
            r0 = 2131429639(0x7f0b0907, float:1.8480956E38)
            if (r1 != r0) goto L_0x009d
            X.00H r0 = r6.A0C
            java.lang.Object r4 = r0.get()
            X.1rO r4 = (X.C38501rO) r4
            android.content.Context r3 = r6.A00
            boolean r2 = r5 instanceof X.C41551wc
            java.lang.String r1 = r5.A00()
            X.5NO r0 = new X.5NO
            r0.<init>(r5, r6)
        L_0x0095:
            X.3Ri r0 = r4.A01(r3, r1, r0, r2)
            X.AnonymousClass3MY.A1G(r0)
            goto L_0x0043
        L_0x009d:
            r0 = 2131429641(0x7f0b0909, float:1.848096E38)
            if (r1 != r0) goto L_0x0043
            androidx.fragment.app.Fragment r1 = r6.A01
            X.00H r0 = r6.A0C
            r0.get()
            com.whatsapp.lists.home.ListsHomeBottomSheet r0 = X.AnonymousClass4H2.A00()
            X.C137086ut.A01(r0, r1)
            goto L_0x0043
        L_0x00b1:
            java.lang.Object r3 = r7.A01
            com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler r3 = (com.whatsapp.conversationslist.filter.ConversationFilterMenuHandler) r3
            java.lang.Object r2 = r7.A02
            X.1x1 r2 = (X.C41761x1) r2
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            int r1 = r8.getItemId()
            r0 = 2131429636(0x7f0b0904, float:1.848095E38)
            if (r1 != r0) goto L_0x00d4
            android.content.Context r2 = r3.A00
            X.4CZ r1 = X.AnonymousClass4CZ.CHATS
            r0 = 7
            android.content.Intent r0 = X.AnonymousClass1LU.A0X(r2, r1, r0)
            r2.startActivity(r0)
            goto L_0x0043
        L_0x00d4:
            r0 = 2131429637(0x7f0b0905, float:1.8480952E38)
            if (r1 != r0) goto L_0x00f0
            androidx.fragment.app.Fragment r5 = r3.A01
            X.00H r0 = r3.A0C
            r0.get()
            java.lang.String r0 = "labelInfo"
            com.whatsapp.lists.ListsManagerBottomSheetFragment r4 = new com.whatsapp.lists.ListsManagerBottomSheetFragment
            r4.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            r3.putParcelable(r0, r2)
            goto L_0x0037
        L_0x00f0:
            r0 = 2131429638(0x7f0b0906, float:1.8480954E38)
            if (r1 != r0) goto L_0x0043
            androidx.fragment.app.Fragment r5 = r3.A01
            X.00H r0 = r3.A0C
        L_0x00f9:
            r0.get()
            com.whatsapp.lists.home.ListsHomeBottomSheet r4 = X.AnonymousClass4H2.A00()
            goto L_0x0040
        L_0x0102:
            java.lang.Object r4 = r7.A01
            X.3ru r4 = (X.C77973ru) r4
            java.lang.Object r3 = r7.A02
            X.206 r3 = (X.AnonymousClass206) r3
            int r0 = r8.getItemId()
            r1 = 1
            if (r0 != 0) goto L_0x011e
            X.3w6 r2 = r4.A02
            X.1FY r1 = X.C98524rI.A03(r4)
            r0 = 85
            r2.A02(r1, r3, r0)
            goto L_0x0043
        L_0x011e:
            int r0 = r8.getItemId()
            if (r0 != r1) goto L_0x0172
            X.5cS r0 = r4.A01
            r0.CH3(r3)
            goto L_0x0043
        L_0x012b:
            java.lang.Object r1 = r7.A01
            X.3SG r1 = (X.AnonymousClass3SG) r1
            java.lang.Object r0 = r7.A02
            X.4Uz r0 = (X.C87284Uz) r0
            X.1FU r3 = r1.getActivity()
            X.1LU r2 = new X.1LU
            r2.<init>()
            X.1FU r1 = r1.getActivity()
            X.1E7 r0 = r0.A03
            X.1BI r0 = r0.A0J
            android.content.Intent r0 = X.AnonymousClass3MY.A06(r1, r2, r0)
            r3.startActivity(r0)
            goto L_0x0043
        L_0x014d:
            java.lang.Object r2 = r7.A01
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            java.lang.Object r1 = r7.A02
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r8.getItemId()
            r2.A01 = r0
            java.lang.CharSequence r0 = r8.getTitle()
            r1.setText(r0)
            android.widget.EditText r3 = r2.A03
            int r2 = r2.A01
            r1 = 2
            r0 = 2131889253(0x7f120c65, float:1.9413164E38)
            if (r2 != r1) goto L_0x016f
            r0 = 2131889254(0x7f120c66, float:1.9413166E38)
        L_0x016f:
            r3.setHint(r0)
        L_0x0172:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91164fF.onMenuItemClick(android.view.MenuItem):boolean");
    }

    public C91164fF(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
