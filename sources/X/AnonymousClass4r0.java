package X;

/* renamed from: X.4r0  reason: invalid class name */
public class AnonymousClass4r0 implements AnonymousClass88S {
    public final int A00;
    public final Object A01;

    public AnonymousClass4r0(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a9, code lost:
        if (r14 != 3) goto L_0x01ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C0q(boolean r13, int r14) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = (com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer) r0
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer.A01(r0, r14, r13)
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r6 = r12.A01
            X.4VQ r6 = (X.AnonymousClass4VQ) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.49n r1 = r6.A0E
            X.4a0 r0 = r1.A00
            r0.A02()
            X.21Y r5 = r6.A0O
            X.205 r4 = r5.A0v
            r1.hashCode()
            r0 = 3
            if (r14 != r0) goto L_0x008f
            if (r13 == 0) goto L_0x0096
            X.6uK r0 = r6.A0N
            r0.A01()
            r0.A02()
            r1.hashCode()
            boolean r0 = r5.A0w()
            if (r0 != 0) goto L_0x01f2
            android.widget.FrameLayout r3 = r6.A08
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L_0x0074
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r7 = r6.A0G
            r5 = 0
            r3.setAlpha(r5)
            r0 = 0
            r3.setVisibility(r0)
            android.view.ViewPropertyAnimator r1 = r3.animate()
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r1.alpha(r0)
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            java.lang.ref.WeakReference r4 = X.AnonymousClass3MW.A0z(r7)
            android.view.ViewPropertyAnimator r0 = r7.animate()
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            android.view.ViewPropertyAnimator r2 = r0.setDuration(r1)
            r1 = 13
            X.3Mo r0 = new X.3Mo
            r0.<init>(r4, r1)
            r2.setListener(r0)
        L_0x0074:
            android.view.View r0 = r6.A06
            r1 = 4
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.A0A
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r6.A09
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r6.A07
            r0.setVisibility(r1)
            r0 = 8
            r3.sendAccessibilityEvent(r0)
            return
        L_0x008f:
            r0 = 4
            r2 = 1
            if (r14 == r0) goto L_0x0097
            if (r14 == r2) goto L_0x0097
            return
        L_0x0096:
            r2 = 0
        L_0x0097:
            boolean r0 = r5.A0w()
            r8 = 0
            if (r0 != 0) goto L_0x00b8
            com.whatsapp.conversation.conversationrow.ConversationRowVideo$RowVideoView r0 = r6.A0G
            r0.setVisibility(r8)
            android.view.View r0 = r6.A06
            r0.setVisibility(r8)
            android.widget.TextView r0 = r6.A0A
            r0.setVisibility(r8)
            android.widget.ImageView r0 = r6.A09
            r0.setVisibility(r8)
            android.widget.FrameLayout r0 = r6.A07
            r0.setVisibility(r8)
            return
        L_0x00b8:
            android.widget.FrameLayout r1 = r6.A07
            int r0 = X.C72453Mb.A0J(r2)
            r1.setVisibility(r0)
            android.widget.ImageView r1 = r6.A09
            int r0 = X.C72453Mb.A0J(r2)
            r1.setVisibility(r0)
            X.0vl r0 = r6.A0R
            android.view.View r1 = X.AnonymousClass3MW.A0A(r0)
            X.C18070vi.A0X(r1)
            r0 = 8
            r1.setVisibility(r0)
            r6.A05 = r8
            if (r2 == 0) goto L_0x00eb
            android.widget.TextView r7 = r6.A0A
            int r0 = r5.A0D
            long r0 = (long) r0
            X.0vb r3 = r6.A0I
            r2 = 0
            java.lang.String r0 = X.C64052u8.A0D(r3, r2, r0)
            r7.setText(r0)
        L_0x00eb:
            X.0vl r0 = r6.A0Q
            X.C72473Md.A1P(r0)
            X.6uK r7 = r6.A0N
            r7.A00()
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x017e
            X.1c4 r0 = r6.A0L
            X.0ve r2 = r0.A02
            r0 = 7588(0x1da4, float:1.0633E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x017e
            r0 = 8890(0x22ba, float:1.2458E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x017e
            X.64H r9 = r6.A0K
            java.lang.Integer r1 = X.C17880vN.A0m()
            r9.A03 = r1
            r11 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r9.A00 = r0
            X.1DT r0 = r6.A0C
            java.lang.Object r0 = r0.A06()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r9.A01 = r0
            int r0 = r5.A0D
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r9.A0A = r0
            boolean r0 = r4.A02
            r10 = 3
            if (r0 == 0) goto L_0x019c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
        L_0x0139:
            r9.A06 = r0
            r9.A03 = r1
            long r2 = r5.A01
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r9.A02 = r0
            X.2rc r2 = r5.A02
            r1 = 0
            if (r2 == 0) goto L_0x019a
            int r0 = r2.A08
            java.lang.Long r0 = X.C17880vN.A0n(r0)
        L_0x0151:
            r9.A0D = r0
            if (r2 == 0) goto L_0x015b
            int r0 = r2.A06
            java.lang.Long r1 = X.C17880vN.A0n(r0)
        L_0x015b:
            r9.A08 = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r9.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r9.A04 = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r7.A00
            long r0 = r2.toSeconds(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A0C = r0
            X.18K r0 = r6.A0J
            r0.CC7(r9)
            r6.A04 = r8
        L_0x017e:
            int r0 = r5.A0D
            long r2 = X.C17890vO.A03(r0)
            r0 = 3000(0xbb8, double:1.482E-320)
            long r8 = java.lang.Math.min(r2, r0)
            long r1 = r7.A00
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x000c
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x000c
            X.4aG r0 = r6.A0M
            r0.A04(r5)
            return
        L_0x019a:
            r0 = r1
            goto L_0x0151
        L_0x019c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            goto L_0x0139
        L_0x01a1:
            java.lang.Object r3 = r12.A01
            X.3uH r3 = (X.C79053uH) r3
            if (r13 == 0) goto L_0x01ab
            r0 = 3
            r4 = 1
            if (r14 == r0) goto L_0x01ac
        L_0x01ab:
            r4 = 0
        L_0x01ac:
            X.1vp r1 = r3.A0R
            boolean r0 = X.C72463Mc.A1O(r1)
            if (r4 == r0) goto L_0x01c2
            X.AnonymousClass3MY.A1L(r1, r4)
            java.lang.String r2 = "PtvPlayback"
            X.19r r1 = r3.A03
            if (r4 == 0) goto L_0x01ef
            java.lang.String r0 = "Resume"
        L_0x01bf:
            r1.A02(r2, r0)
        L_0x01c2:
            r0 = 4
            if (r14 != r0) goto L_0x01eb
            X.00H r1 = r3.A05
            X.16x r0 = X.AnonymousClass3MX.A0d(r1)
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01eb
            X.16x r2 = X.AnonymousClass3MX.A0d(r1)
            X.206 r0 = r3.A0I
            X.205 r1 = r0.A0v
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.1DT r0 = r2.A03
            java.lang.Object r0 = r0.A06()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01eb
            r0 = 0
            r2.A00(r0)
        L_0x01eb:
            X.C79053uH.A03(r3)
            return
        L_0x01ef:
            java.lang.String r0 = "End"
            goto L_0x01bf
        L_0x01f2:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0213
            r3 = 0
            com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$initializeMuteButton$1 r2 = new com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$initializeMuteButton$1
            r2.<init>(r6, r3)
            X.1OX r1 = r6.A01
            if (r1 != 0) goto L_0x0206
            X.0wl r0 = r6.A0T
            X.1OY r1 = X.AnonymousClass1OW.A02(r0)
        L_0x0206:
            com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1 r0 = new com.whatsapp.conversation.conversationrow.ConversationRowVideoAutoPlay$runOnCoroutineScope$1$1
            r0.<init>(r3, r2)
            X.AnonymousClass3MX.A1Q(r0, r1)
            r6.A01 = r1
            r0 = 1
            r6.A02 = r0
        L_0x0213:
            r3 = 1
            android.widget.FrameLayout r0 = r6.A07
            r2 = 0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r6.A09
            r0.setVisibility(r1)
            X.0vl r0 = r6.A0R
            X.C72463Mc.A1M(r0, r2)
            r6.A05 = r3
            X.0vl r0 = r6.A0Q
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r6.A00
            r1.post(r0)
            r6.A04 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4r0.C0q(boolean, int):void");
    }
}
