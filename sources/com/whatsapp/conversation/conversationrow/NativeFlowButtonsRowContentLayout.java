package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass009;
import X.AnonymousClass00H;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class NativeFlowButtonsRowContentLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass00H A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final View A03;
    public final View A04;
    public final LinearLayout A05;
    public final List A06;
    public final View[] A07;
    public final TextEmojiLabel[] A08;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.whatsapp.TextEmojiLabel[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NativeFlowButtonsRowContentLayout(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            boolean r0 = r5.A02
            if (r0 != 0) goto L_0x001c
            r0 = 1
            r5.A02 = r0
            java.lang.Object r0 = r5.generatedComponent()
            X.10E r0 = X.AnonymousClass3MW.A0O(r0)
            X.00S r0 = r0.A92
            X.00H r0 = X.C000200d.A00(r0)
            r5.A00 = r0
        L_0x001c:
            r0 = 2
            com.whatsapp.TextEmojiLabel[] r4 = new com.whatsapp.TextEmojiLabel[r0]
            r5.A08 = r4
            android.view.View[] r3 = new android.view.View[r0]
            r5.A07 = r3
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r5.A06 = r0
            r2 = 1
            r5.setOrientation(r2)
            r0 = 2131626142(0x7f0e089e, float:1.8879512E38)
            android.view.View.inflate(r6, r0, r5)
            r0 = 2131432917(0x7f0b15d5, float:1.8487605E38)
            android.widget.LinearLayout r0 = X.AnonymousClass8BR.A0A(r5, r0)
            r5.A05 = r0
            r0 = 2131428597(0x7f0b04f5, float:1.8478843E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A03 = r0
            r0 = 2131428598(0x7f0b04f6, float:1.8478845E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A04 = r0
            r0 = 2131428592(0x7f0b04f0, float:1.8478833E38)
            android.view.View r0 = r5.findViewById(r0)
            r1 = 0
            r4[r1] = r0
            r0 = 2131432914(0x7f0b15d2, float:1.8487599E38)
            android.view.View r0 = r5.findViewById(r0)
            r3[r1] = r0
            r0 = 2131428593(0x7f0b04f1, float:1.8478835E38)
            android.view.View r0 = r5.findViewById(r0)
            r4[r2] = r0
            r0 = 2131432915(0x7f0b15d3, float:1.84876E38)
            android.view.View r0 = r5.findViewById(r0)
            r3[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.conversationrow.NativeFlowButtonsRowContentLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public NativeFlowButtonsRowContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public NativeFlowButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
