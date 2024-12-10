package X;

import android.widget.BaseAdapter;
import com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity;

/* renamed from: X.3Oq  reason: invalid class name and case insensitive filesystem */
public class C73013Oq extends BaseAdapter {
    public final /* synthetic */ MessageDetailsActivity A00;

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public C73013Oq(MessageDetailsActivity messageDetailsActivity) {
        this.A00 = messageDetailsActivity;
    }

    public int getCount() {
        return this.A00.A0b.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x017c, code lost:
        if (r7 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0183, code lost:
        if (r7 != null) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r16, android.view.View r17, android.view.ViewGroup r18) {
        /*
            r15 = this;
            r3 = r17
            r4 = 0
            if (r17 != 0) goto L_0x0014
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r0 = r15.A00
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131626037(0x7f0e0835, float:1.8879299E38)
            r2 = r18
            android.view.View r3 = r1.inflate(r0, r2, r4)
        L_0x0014:
            com.whatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = r15.A00
            java.util.List r5 = r2.A0b
            java.lang.Object r6 = r5.get(r4)
            X.4Ua r6 = (X.C87034Ua) r6
            java.lang.Integer r1 = r6.A02()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r0 != r1) goto L_0x01b8
            r1 = 1
            int r0 = r5.size()
            if (r0 <= r1) goto L_0x01b8
            X.3vA r6 = (X.C79313vA) r6
            java.lang.Object r0 = r5.get(r1)
            X.4Ua r0 = (X.C87034Ua) r0
            r5 = r6
            r6 = r0
        L_0x0037:
            X.2rQ r7 = r6.A00
            r0 = 2131435023(0x7f0b1e0f, float:1.8491876E38)
            android.view.View r1 = X.AnonymousClass1HF.A06(r3, r0)
            X.206 r0 = r2.A0Q
            boolean r0 = X.AnonymousClass25A.A0Z(r0)
            r9 = 8
            if (r0 == 0) goto L_0x01b3
            r0 = 2131433899(0x7f0b19ab, float:1.8489597E38)
            android.widget.TextView r8 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131433898(0x7f0b19aa, float:1.8489595E38)
            android.widget.ImageView r6 = X.AnonymousClass3MW.A0G(r1, r0)
            android.content.Context r10 = X.AnonymousClass3MX.A04(r1, r3, r4)
            X.206 r1 = r2.A0Q
            int r0 = r1.A0u
            boolean r0 = X.AnonymousClass25A.A0I(r0)
            if (r0 == 0) goto L_0x019a
            r0 = 2131892064(0x7f121760, float:1.9418866E38)
            r4 = 2131232657(0x7f080791, float:1.808143E38)
            r1 = 2131102856(0x7f060c88, float:1.7818162E38)
        L_0x006f:
            r8.setText(r0)
            android.content.Context r0 = r3.getContext()
            X.AnonymousClass4aX.A0B(r0, r6, r4, r1)
        L_0x0079:
            r0 = 2131436237(0x7f0b22cd, float:1.8494339E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r3, r0)
            X.206 r0 = r2.A0Q
            int r0 = r0.A0u
            if (r0 != 0) goto L_0x018c
            r1 = 2131892083(0x7f121773, float:1.9418904E38)
        L_0x0089:
            r4.setText(r1)
            r0 = 2131429811(0x7f0b09b3, float:1.8481305E38)
            android.widget.TextView r11 = X.C17880vN.A0E(r3, r0)
            r0 = 2131429799(0x7f0b09a7, float:1.848128E38)
            android.widget.TextView r12 = X.C17880vN.A0E(r3, r0)
            r0 = 2131429808(0x7f0b09b0, float:1.84813E38)
            android.widget.TextView r10 = X.C17880vN.A0E(r3, r0)
            r0 = 2131429805(0x7f0b09ad, float:1.8481293E38)
            android.widget.TextView r8 = X.C17880vN.A0E(r3, r0)
            r0 = 2131430989(0x7f0b0e4d, float:1.8483695E38)
            r3.findViewById(r0)
            r0 = 2131429802(0x7f0b09aa, float:1.8481287E38)
            android.widget.TextView r6 = X.AnonymousClass3MW.A0J(r3, r0)
            r0 = 2131435022(0x7f0b1e0e, float:1.8491874E38)
            android.view.View r4 = X.AnonymousClass1HF.A06(r3, r0)
            r0 = 2131429913(0x7f0b0a19, float:1.8481512E38)
            android.view.View r1 = r3.findViewById(r0)
            r0 = 2131428123(0x7f0b031b, float:1.8477882E38)
            X.AnonymousClass3MY.A1B(r3, r0, r9)
            r0 = 2131430988(0x7f0b0e4c, float:1.8483693E38)
            android.view.View r0 = r3.findViewById(r0)
            r1.setVisibility(r9)
            r0.setVisibility(r9)
            X.206 r0 = r2.A0Q
            long r0 = r0.A0I
            X.AnonymousClass3MY.A1F(r11, r2, r0)
            java.lang.String r9 = "—"
            if (r7 == 0) goto L_0x0179
            r0 = 5
            long r0 = r7.A01(r0)
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0179
            X.AnonymousClass3MY.A1F(r12, r2, r0)
        L_0x00ef:
            r0 = 13
            long r0 = r7.A01(r0)
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 <= 0) goto L_0x0180
            X.AnonymousClass3MY.A1F(r10, r2, r0)
        L_0x00fe:
            r10 = 0
            long r0 = r7.A01
            int r7 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0187
            X.AnonymousClass3MY.A1F(r8, r2, r0)
        L_0x0109:
            if (r5 == 0) goto L_0x0176
            long r0 = r5.A00
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x0176
            r5 = 2131431908(0x7f0b11e4, float:1.8485558E38)
            android.widget.TextView r11 = X.C17880vN.A0E(r3, r5)
            X.206 r5 = r2.A0Q
            X.22A r5 = X.C63892tr.A02(r5)
            X.205 r5 = r5.A0v
            boolean r10 = r5.A02
            X.206 r5 = r2.A0Q
            X.22A r5 = X.C63892tr.A02(r5)
            if (r5 != 0) goto L_0x015a
            r9 = 0
        L_0x012d:
            X.118 r5 = r2.A0J
            android.content.res.Resources r8 = X.AnonymousClass3MW.A05(r5)
            if (r10 != 0) goto L_0x0152
            boolean r5 = android.text.TextUtils.isEmpty(r9)
            if (r5 != 0) goto L_0x0152
            r7 = 2131891554(0x7f121562, float:1.9417831E38)
            r5 = 1
            java.lang.Object[] r5 = X.AnonymousClass000.A1b(r9, r5)
            java.lang.String r5 = r8.getString(r7, r5)
        L_0x0147:
            r11.setText(r5)
            X.AnonymousClass3MY.A1F(r6, r2, r0)
            r0 = 0
        L_0x014e:
            r4.setVisibility(r0)
            return r3
        L_0x0152:
            r5 = 2131891557(0x7f121565, float:1.9417837E38)
            java.lang.String r5 = r8.getString(r5)
            goto L_0x0147
        L_0x015a:
            X.1M9 r7 = r2.A0A
            com.whatsapp.jid.UserJid r5 = r5.A0I()
            X.1E7 r9 = r7.A0H(r5)
            X.206 r5 = r2.A0Q
            boolean r5 = X.C22971Dz.A0f(r5)
            int r8 = X.C72453Mb.A04(r5)
            X.1Me r7 = r2.A0C
            r5 = 0
            java.lang.String r9 = r7.A0U(r9, r8, r5)
            goto L_0x012d
        L_0x0176:
            r0 = 8
            goto L_0x014e
        L_0x0179:
            r12.setText(r9)
            if (r7 == 0) goto L_0x0180
            goto L_0x00ef
        L_0x0180:
            r10.setText(r9)
            if (r7 == 0) goto L_0x0187
            goto L_0x00fe
        L_0x0187:
            r8.setText(r9)
            goto L_0x0109
        L_0x018c:
            boolean r0 = X.AnonymousClass25A.A0I(r0)
            r1 = 2131892087(0x7f121777, float:1.9418912E38)
            if (r0 == 0) goto L_0x0089
            r1 = 2131892091(0x7f12177b, float:1.941892E38)
            goto L_0x0089
        L_0x019a:
            boolean r0 = r1 instanceof X.C440922c
            r4 = 2131232097(0x7f080561, float:1.8080294E38)
            if (r0 == 0) goto L_0x01a4
            r4 = 2131232405(0x7f080695, float:1.8080918E38)
        L_0x01a4:
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131101887(0x7f0608bf, float:1.7816196E38)
            int r1 = X.AnonymousClass1YL.A00(r10, r1, r0)
            r0 = 2131892070(0x7f121766, float:1.9418878E38)
            goto L_0x006f
        L_0x01b3:
            r1.setVisibility(r9)
            goto L_0x0079
        L_0x01b8:
            r5 = 0
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73013Oq.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
