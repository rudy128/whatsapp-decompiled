package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1$1$1$2", f = "CallLogActivityV2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallLogActivityV2$initObservables$1$1$1$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ CallLogActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallLogActivityV2$initObservables$1$1$1$2(CallLogActivityV2 callLogActivityV2, C30391dr r3) {
        super(2, r3);
        this.this$0 = callLogActivityV2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        CallLogActivityV2$initObservables$1$1$1$2 callLogActivityV2$initObservables$1$1$1$2 = new CallLogActivityV2$initObservables$1$1$1$2(this.this$0, r4);
        callLogActivityV2$initObservables$1$1$1$2.L$0 = obj;
        return callLogActivityV2$initObservables$1$1$1$2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01fe, code lost:
        if (r1 == 0) goto L_0x0200;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            int r0 = r15.label
            if (r0 != 0) goto L_0x0318
            X.C30691eM.A01(r16)
            java.lang.Object r4 = r15.L$0
            X.4SR r4 = (X.AnonymousClass4SR) r4
            if (r4 == 0) goto L_0x0315
            com.whatsapp.calling.callhistory.calllog.CallLogActivityV2 r3 = r15.this$0
            boolean r6 = r4.A0B
            r8 = 8
            r7 = 1
            r5 = 0
            if (r6 == 0) goto L_0x01d0
            com.whatsapp.TextEmojiLabel r1 = r3.A08
            if (r1 != 0) goto L_0x0021
            java.lang.String r0 = "contactSubtitle"
            X.C18070vi.A11(r0)
            throw r5
        L_0x0021:
            X.4ZN r0 = r4.A01
            if (r0 == 0) goto L_0x0036
            java.lang.CharSequence r0 = r0.A03(r3)
        L_0x0029:
            r1.setText(r0)
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r0 = r3.A0O
            java.lang.String r14 = "actionButtonTileGroup"
            if (r0 != 0) goto L_0x0038
            X.C18070vi.A11(r14)
            throw r5
        L_0x0036:
            r0 = r5
            goto L_0x0029
        L_0x0038:
            r0.removeAllViews()
            java.util.List r0 = r4.A06
            java.util.Iterator r13 = r0.iterator()
        L_0x0041:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r9 = r13.next()
            X.4T5 r9 = (X.AnonymousClass4T5) r9
            r0 = 9
            X.1D6[] r10 = new X.AnonymousClass1D6[r0]
            X.4DJ r2 = X.AnonymousClass4DJ.MESSAGE
            r0 = 2131233235(0x7f0809d3, float:1.8082602E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131887698(0x7f120652, float:1.941001E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            X.C72463Mc.A1H(r2, r0, r10)
            X.4DJ r1 = X.AnonymousClass4DJ.VOICE
            r0 = 2131233225(0x7f0809c9, float:1.8082581E38)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r0 = 2131887703(0x7f120657, float:1.941002E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r12, r0)
            X.AnonymousClass1D6.A03(r1, r0, r10, r7)
            X.4DJ r1 = X.AnonymousClass4DJ.VIDEO
            r0 = 2131233480(0x7f080ac8, float:1.8083099E38)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r0 = 2131887702(0x7f120656, float:1.9410019E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r11, r0)
            X.C72463Mc.A1I(r1, r0, r10)
            X.4DJ r2 = X.AnonymousClass4DJ.SAVE
            r0 = 2131233393(0x7f080a71, float:1.8082922E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131887699(0x7f120653, float:1.9410012E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            X.C72463Mc.A1J(r2, r0, r10)
            X.4DJ r2 = X.AnonymousClass4DJ.VOICE_CHAT
            r0 = 2131233309(0x7f080a1d, float:1.8082752E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131887704(0x7f120658, float:1.9410023E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r2, r0)
            r0 = 4
            r10[r0] = r1
            X.4DJ r1 = X.AnonymousClass4DJ.JOIN_CALL_LINK_AUDIO
            r0 = 2131887697(0x7f120651, float:1.9410008E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r12, r2)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)
            r0 = 5
            r10[r0] = r1
            X.4DJ r1 = X.AnonymousClass4DJ.JOIN_CALL_LINK_VIDEO
            X.1D6 r0 = X.AnonymousClass1D6.A01(r11, r2)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r1, r0)
            r0 = 6
            r10[r0] = r1
            X.4DJ r2 = X.AnonymousClass4DJ.SEND_LINK
            r0 = 2131231930(0x7f0804ba, float:1.8079955E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131887700(0x7f120654, float:1.9410014E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            X.1D6 r1 = X.AnonymousClass1D6.A01(r2, r0)
            r0 = 7
            r10[r0] = r1
            X.4DJ r2 = X.AnonymousClass4DJ.SHARE
            r0 = 2131232294(0x7f080626, float:1.8080693E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131887701(0x7f120655, float:1.9410017E38)
            X.1D6 r0 = X.AnonymousClass1D6.A00(r1, r0)
            X.AnonymousClass1D6.A03(r2, r0, r10, r8)
            java.util.LinkedHashMap r1 = X.AnonymousClass1D7.A0B(r10)
            X.4DJ r0 = r9.A00
            java.lang.Object r1 = r1.get(r0)
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            if (r1 == 0) goto L_0x0041
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r0 = r3.A0O
            if (r0 != 0) goto L_0x0115
            X.C18070vi.A11(r14)
            throw r5
        L_0x0115:
            android.content.Context r0 = X.AnonymousClass3MY.A04(r0)
            com.whatsapp.wds.components.actiontile.WDSActionTile r2 = new com.whatsapp.wds.components.actiontile.WDSActionTile
            r2.<init>(r0, r5)
            int r0 = X.AnonymousClass3MZ.A04(r1)
            r2.setIcon((int) r0)
            java.lang.Object r0 = r1.second
            int r0 = X.AnonymousClass000.A0M(r0)
            r2.setText((int) r0)
            r11 = -2
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r0, r11, r1)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131169535(0x7f0710ff, float:1.7953403E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r10.setMargins(r0, r0, r0, r0)
            r2.setOrientation(r7)
            r2.setLayoutParams(r10)
            boolean r0 = r9.A01
            if (r0 != 0) goto L_0x0155
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r2.setAlpha(r0)
        L_0x0155:
            com.whatsapp.wds.components.actiontile.WDSActionTileGroup r0 = r3.A0O
            if (r0 != 0) goto L_0x015d
            X.C18070vi.A11(r14)
            throw r5
        L_0x015d:
            r0.addView(r2)
            X.5VG r0 = new X.5VG
            r0.<init>(r9, r3, r4)
            X.C84084Hu.A00(r2, r0)
            goto L_0x0041
        L_0x016a:
            r0 = 2131428692(0x7f0b0554, float:1.8479036E38)
            android.view.View r1 = X.AnonymousClass3MY.A0C(r3, r0)
            com.whatsapp.calling.callhistory.calllog.CallInfoNestedScrollView r1 = (com.whatsapp.calling.callhistory.calllog.CallInfoNestedScrollView) r1
            r3.A0E = r1
            java.lang.String r12 = "callInfoNestedScrollView"
            if (r1 == 0) goto L_0x0301
            com.whatsapp.contact.photos.MultiContactThumbnail r0 = r3.A0M
            java.lang.String r11 = "contactImage"
            if (r0 == 0) goto L_0x0309
            r1.A02 = r0
            com.whatsapp.TextEmojiLabel r0 = r3.A06
            if (r0 != 0) goto L_0x018b
            java.lang.String r0 = "contactName"
        L_0x0187:
            X.C18070vi.A11(r0)
            throw r5
        L_0x018b:
            r1.A01 = r0
            com.whatsapp.TextEmojiLabel r0 = r3.A08
            java.lang.String r10 = "contactSubtitle"
            if (r0 == 0) goto L_0x0305
            r1.A00 = r0
            r0 = 2131431391(0x7f0b0fdf, float:1.848451E38)
            android.view.View r0 = X.AnonymousClass3MY.A0C(r3, r0)
            r3.A00 = r0
            com.whatsapp.calling.callhistory.calllog.CallInfoNestedScrollView r2 = r3.A0E
            if (r2 == 0) goto L_0x0301
            boolean r0 = r2.isLaidOut()
            if (r0 == 0) goto L_0x01c6
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L_0x01c6
            androidx.recyclerview.widget.RecyclerView r0 = r3.A01
            java.lang.String r12 = "recyclerView"
            if (r0 == 0) goto L_0x0301
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.C18070vi.A0X(r1)
            int r9 = r2.getMeasuredHeight()
            android.view.View r0 = r3.A00
            if (r0 != 0) goto L_0x0206
            java.lang.String r0 = "headerView"
            goto L_0x0187
        L_0x01c6:
            r1 = 0
            X.4dj r0 = new X.4dj
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.addOnLayoutChangeListener(r0)
            goto L_0x022d
        L_0x01d0:
            com.whatsapp.TextEmojiLabel r2 = r3.A07
            java.lang.String r9 = "contactStatusTv"
            if (r2 != 0) goto L_0x01da
            X.C18070vi.A11(r9)
            throw r5
        L_0x01da:
            java.util.List r1 = r4.A07
            java.lang.Object r0 = X.C29431cG.A0b(r1)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.String r0 = r0.A0Z
            r2.setText(r0)
            com.whatsapp.TextEmojiLabel r2 = r3.A07
            if (r2 != 0) goto L_0x01ef
            X.C18070vi.A11(r9)
            throw r5
        L_0x01ef:
            java.lang.Object r0 = X.C29431cG.A0b(r1)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            java.lang.String r0 = r0.A0Z
            if (r0 == 0) goto L_0x0200
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0202
        L_0x0200:
            r0 = 8
        L_0x0202:
            r2.setVisibility(r0)
            goto L_0x022d
        L_0x0206:
            int r0 = r0.getHeight()
            int r9 = r9 - r0
            com.whatsapp.contact.photos.MultiContactThumbnail r0 = r3.A0M
            if (r0 == 0) goto L_0x0309
            int r0 = r0.getHeight()
            int r0 = r0 / 2
            int r9 = r9 + r0
            com.whatsapp.TextEmojiLabel r0 = r3.A08
            if (r0 == 0) goto L_0x0305
            int r0 = X.AnonymousClass3MW.A02(r0, r9)
            r1.height = r0
            int r0 = r2.getMeasuredWidth()
            r1.width = r0
            androidx.recyclerview.widget.RecyclerView r0 = r3.A01
            if (r0 == 0) goto L_0x0301
            r0.setLayoutParams(r1)
        L_0x022d:
            com.whatsapp.contact.photos.MultiContactThumbnail r2 = r3.A0M
            java.lang.String r10 = "contactImage"
            if (r2 != 0) goto L_0x0237
            X.C18070vi.A11(r10)
            throw r5
        L_0x0237:
            java.util.List r9 = r4.A07
            X.0vl r0 = r3.A0b
            java.lang.Object r1 = r0.getValue()
            X.1pZ r1 = (X.C37451pZ) r1
            X.0vl r0 = r3.A0c
            java.lang.Object r0 = r0.getValue()
            X.4kE r0 = (X.C94214kE) r0
            r0.A00(r9)
            r2.A00(r0, r1, r9)
            X.4ZN r1 = r4.A02
            java.lang.String r0 = "contactNameViewController"
            X.1xh r2 = r3.A0A
            if (r1 != 0) goto L_0x0267
            if (r2 != 0) goto L_0x025d
            X.C18070vi.A11(r0)
            throw r5
        L_0x025d:
            java.lang.Object r0 = X.C29431cG.A0b(r9)
            X.1E7 r0 = (X.AnonymousClass1E7) r0
            r2.A05(r0)
            goto L_0x0276
        L_0x0267:
            if (r2 != 0) goto L_0x026d
            X.C18070vi.A11(r0)
            throw r5
        L_0x026d:
            java.lang.CharSequence r1 = r1.A03(r3)
            com.whatsapp.TextEmojiLabel r0 = r2.A01
            r0.setText(r1)
        L_0x0276:
            X.4cT r0 = r4.A03
            if (r0 != 0) goto L_0x028a
            com.whatsapp.contact.photos.MultiContactThumbnail r1 = r3.A0M
            if (r1 != 0) goto L_0x0282
            X.C18070vi.A11(r10)
            throw r5
        L_0x0282:
            X.5Ua r0 = new X.5Ua
            r0.<init>(r3, r4)
            X.C84084Hu.A00(r1, r0)
        L_0x028a:
            if (r6 != 0) goto L_0x0315
            com.whatsapp.WaImageButton r0 = r3.A0C
            java.lang.String r9 = "audioCallButton"
            if (r0 != 0) goto L_0x0296
            X.C18070vi.A11(r9)
            throw r5
        L_0x0296:
            boolean r1 = r4.A08
            X.AnonymousClass4aR.A09(r0, r1)
            com.whatsapp.WaImageButton r0 = r3.A0D
            java.lang.String r6 = "videoCallButton"
            if (r0 != 0) goto L_0x02a5
            X.C18070vi.A11(r6)
            throw r5
        L_0x02a5:
            X.AnonymousClass4aR.A09(r0, r1)
            com.whatsapp.WaImageButton r2 = r3.A0C
            if (r2 != 0) goto L_0x02b0
            X.C18070vi.A11(r9)
            throw r5
        L_0x02b0:
            java.lang.Integer r1 = r4.A04
            r0 = 8
            if (r1 == 0) goto L_0x02b7
            r0 = 0
        L_0x02b7:
            r2.setVisibility(r0)
            if (r1 == 0) goto L_0x02cb
            int r1 = r1.intValue()
            com.whatsapp.WaImageButton r0 = r3.A0C
            if (r0 != 0) goto L_0x02c8
            X.C18070vi.A11(r9)
            throw r5
        L_0x02c8:
            r0.setImageResource(r1)
        L_0x02cb:
            com.whatsapp.WaImageButton r1 = r3.A0C
            if (r1 != 0) goto L_0x02d3
            X.C18070vi.A11(r9)
            throw r5
        L_0x02d3:
            float r0 = r4.A00
            r1.setAlpha(r0)
            com.whatsapp.WaImageButton r1 = r3.A0D
            if (r1 != 0) goto L_0x02e0
            X.C18070vi.A11(r6)
            throw r5
        L_0x02e0:
            boolean r0 = r4.A0A
            r7 = r7 ^ r0
            if (r7 == 0) goto L_0x02e6
            r8 = 0
        L_0x02e6:
            r1.setVisibility(r8)
            com.whatsapp.WaImageButton r1 = r3.A0C
            if (r1 != 0) goto L_0x02f1
            X.C18070vi.A11(r9)
            throw r5
        L_0x02f1:
            X.5Ub r0 = new X.5Ub
            r0.<init>(r3, r4)
            X.C84084Hu.A00(r1, r0)
            com.whatsapp.WaImageButton r1 = r3.A0D
            if (r1 != 0) goto L_0x030d
            X.C18070vi.A11(r6)
            throw r5
        L_0x0301:
            X.C18070vi.A11(r12)
            throw r5
        L_0x0305:
            X.C18070vi.A11(r10)
            throw r5
        L_0x0309:
            X.C18070vi.A11(r11)
            throw r5
        L_0x030d:
            X.5Uc r0 = new X.5Uc
            r0.<init>(r3, r4)
            X.C84084Hu.A00(r1, r0)
        L_0x0315:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0318:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityV2$initObservables$1$1$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CallLogActivityV2$initObservables$1$1$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
