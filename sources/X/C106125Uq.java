package X;

import com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer;

/* renamed from: X.5Uq  reason: invalid class name and case insensitive filesystem */
public final class C106125Uq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C98494rF $currentUiState;
    public final /* synthetic */ PushToVideoInlineVideoPlayer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106125Uq(PushToVideoInlineVideoPlayer pushToVideoInlineVideoPlayer, C98494rF r3) {
        super(1);
        this.$currentUiState = r3;
        this.this$0 = pushToVideoInlineVideoPlayer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (X.C18070vi.A18(r0, r3) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r10) {
        /*
            r9 = this;
            X.4Ym r10 = (X.C88144Ym) r10
            X.4rF r0 = r9.$currentUiState
            java.lang.Object r2 = r0.element
            X.4Ym r2 = (X.C88144Ym) r2
            r0.element = r10
            X.21X r8 = r10.A03
            r3 = 0
            if (r8 == 0) goto L_0x00dc
            X.205 r1 = r8.A0v
        L_0x0011:
            if (r2 == 0) goto L_0x00d9
            X.21X r0 = r2.A03
            if (r0 == 0) goto L_0x00d9
            X.205 r0 = r0.A0v
        L_0x0019:
            boolean r0 = X.C18070vi.A18(r1, r0)
            r6 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x002e
            X.1gV r0 = r10.A04
            if (r2 == 0) goto L_0x0028
            X.1gV r3 = r2.A04
        L_0x0028:
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 != 0) goto L_0x003d
        L_0x002e:
            if (r8 == 0) goto L_0x003d
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            X.1gV r3 = r10.A04
            if (r3 == 0) goto L_0x003d
            com.whatsapp.WaImageView r1 = r0.A08
            X.3M2 r0 = r0.A0A
            r3.A0D(r1, r8, r0)
        L_0x003d:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            android.view.View$OnClickListener r1 = r10.A00
            r0.setOnClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            android.view.View$OnTouchListener r1 = r10.A02
            r0.setOnTouchListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnTouchListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            android.view.View$OnLongClickListener r1 = r10.A01
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            com.whatsapp.WaImageView r0 = r0.A08
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            android.widget.FrameLayout r0 = r0.A07
            r0.setOnLongClickListener(r1)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            android.widget.FrameLayout r1 = r0.A07
            r0 = 2131886200(0x7f120078, float:1.9406972E38)
            X.AnonymousClass1Y5.A05(r1, r0)
            if (r2 == 0) goto L_0x00d7
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            X.0ve r0 = r0.getAbProps()
            boolean r7 = r2.A00(r0)
        L_0x0088:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            X.0ve r0 = r0.getAbProps()
            boolean r5 = r10.A00(r0)
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r1 = r9.this$0
            X.49n r4 = r1.A09
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x009d
            r4.A0F()
        L_0x009d:
            boolean r3 = r10.A08
            X.0ve r2 = r1.getAbProps()
            r0 = 1
            if (r3 != 0) goto L_0x00b3
            r1 = 3483(0xd9b, float:4.881E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 > 0) goto L_0x00b3
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x00b3:
            r4.A0g(r8, r0)
            r4.A0h(r5)
            r0 = r3 ^ 1
            r4.A0W(r0)
            if (r5 == 0) goto L_0x00c5
            if (r7 != 0) goto L_0x00c5
            r4.A0f()
        L_0x00c5:
            com.whatsapp.conversation.conversationrow.PushToVideoInlineVideoPlayer r0 = r9.this$0
            android.widget.FrameLayout r1 = r0.A07
            if (r3 == 0) goto L_0x00d5
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x00d5
        L_0x00cf:
            r1.setKeepScreenOn(r6)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00d5:
            r6 = 0
            goto L_0x00cf
        L_0x00d7:
            r7 = 0
            goto L_0x0088
        L_0x00d9:
            r0 = r3
            goto L_0x0019
        L_0x00dc:
            r1 = r3
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106125Uq.invoke(java.lang.Object):java.lang.Object");
    }
}
