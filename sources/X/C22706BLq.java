package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.BLq  reason: case insensitive filesystem */
public final class C22706BLq extends C38391rD {
    public final Context A00;
    public final C78493st A01;
    public final AnonymousClass210 A02;
    public final List A03;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            if (r13 < 0) goto L_0x004e
            java.util.List r1 = r11.A03
            int r0 = r1.size()
            if (r13 >= r0) goto L_0x004e
            java.lang.Object r7 = r1.get(r13)
            X.CRj r7 = (X.C24959CRj) r7
            boolean r0 = r12 instanceof X.BML
            if (r0 == 0) goto L_0x0069
            X.BML r12 = (X.BML) r12
            X.3st r4 = r11.A01
            X.210 r5 = r11.A02
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            r3 = 1
            java.lang.String r8 = r7.A03
            if (r8 != 0) goto L_0x005c
            java.lang.String r6 = ""
        L_0x0029:
            X.0ve r1 = r4.A0F
            X.1t5 r0 = new X.1t5
            r0.<init>(r1)
            com.whatsapp.TextEmojiLabel r2 = r12.A00
            r2.setLinkHandler(r0)
            r2.setText(r6)
            r4.setMessageText(r6, r2, r5)
            if (r8 != 0) goto L_0x004f
            java.lang.String r0 = ""
        L_0x003f:
            r4.A2j(r2, r5, r0)
            boolean r0 = r4.A2Z()
            if (r0 == 0) goto L_0x004e
            r2.setLongClickable(r3)
            X.AnonymousClass3uP.A0W(r2, r4)
        L_0x004e:
            return
        L_0x004f:
            int r1 = r7.A02
            int r0 = r7.A00
            java.lang.String r0 = X.C108955ca.A0q(r1, r0, r8)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            goto L_0x003f
        L_0x005c:
            int r1 = r7.A02
            int r0 = r7.A00
            java.lang.String r0 = X.C108955ca.A0q(r1, r0, r8)
            java.lang.String r6 = X.AnonymousClass1YF.A0I(r0)
            goto L_0x0029
        L_0x0069:
            boolean r0 = r12 instanceof X.BMM
            if (r0 == 0) goto L_0x004e
            X.BMM r12 = (X.BMM) r12
            X.3st r4 = r11.A01
            r5 = 0
            X.C18070vi.A0d(r7, r5)
            r3 = 1
            com.whatsapp.conversation.conversationrow.BotCodeView r2 = r12.A05
            java.lang.String r6 = r7.A03
            if (r6 != 0) goto L_0x0110
            java.lang.String r0 = ""
        L_0x007e:
            r2.setText(r0)
            android.content.Context r0 = r12.A03
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131899354(0x7f1233da, float:1.9433652E38)
            java.lang.String r6 = X.AnonymousClass3MY.A0m(r1, r0)
            int r9 = r12.A02
            int r8 = r12.A01
            int r10 = r12.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            X.C18070vi.A0d(r0, r3)
            X.BwA r7 = new X.BwA
            r7.<init>(r12, r6, r0)
            r2.A01 = r9
            if (r1 == 0) goto L_0x00ae
            r2.A00 = r10
        L_0x00ae:
            r2.measure(r5, r5)
            int r1 = r2.getMeasuredHeight()
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x00fc
            com.whatsapp.conversation.conversationrow.BotCodeView.A0F(r2, r9, r8)
            r2.setOnClickListener(r7)
        L_0x00bf:
            r2.measure(r5, r5)
            int r1 = r2.getMeasuredHeight()
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x00ec
            com.whatsapp.WaTextView r5 = r12.A04
            java.lang.CharSequence r0 = r2.getText()
            java.lang.String r0 = r0.toString()
            X.C18070vi.A0d(r0, r3)
            X.BwA r1 = new X.BwA
            r1.<init>(r12, r6, r0)
        L_0x00dc:
            r5.setOnClickListener(r1)
        L_0x00df:
            boolean r0 = r4.A2Z()
            if (r0 == 0) goto L_0x004e
            r2.setLongClickable(r3)
            X.AnonymousClass3uP.A0W(r2, r4)
            return
        L_0x00ec:
            int r0 = r2.A01
            int r0 = r0 + 1
            if (r0 > r1) goto L_0x00df
            com.whatsapp.WaTextView r5 = r12.A04
            r0 = 36
            X.48m r1 = new X.48m
            r1.<init>(r2, r0)
            goto L_0x00dc
        L_0x00fc:
            int r0 = r2.A01
            int r0 = r0 + 1
            if (r0 > r1) goto L_0x00bf
            com.whatsapp.conversation.conversationrow.BotCodeView.A0F(r2, r9, r8)
            r1 = 36
            X.48m r0 = new X.48m
            r0.<init>(r2, r1)
            r2.setOnClickListener(r0)
            goto L_0x00bf
        L_0x0110:
            int r1 = r7.A02
            int r0 = r7.A00
            java.lang.String r0 = X.C108955ca.A0q(r1, r0, r6)
            java.lang.String r0 = X.AnonymousClass1YF.A0I(r0)
            goto L_0x007e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22706BLq.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        Context context = this.A00;
        if (i == 1) {
            return new BMM(context);
        }
        return new BML(context);
    }

    public int A0Q() {
        return this.A03.size();
    }

    public int getItemViewType(int i) {
        if (i < 0) {
            return -1;
        }
        List list = this.A03;
        if (i < list.size()) {
            return ((C24959CRj) list.get(i)).A01;
        }
        return -1;
    }

    public C22706BLq(Context context, C78493st r2, AnonymousClass210 r3, List list) {
        this.A00 = context;
        this.A03 = list;
        this.A02 = r3;
        this.A01 = r2;
    }
}
