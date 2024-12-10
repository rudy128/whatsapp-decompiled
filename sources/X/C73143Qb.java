package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.3Qb  reason: invalid class name and case insensitive filesystem */
public abstract class C73143Qb extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.whatsapp.components.MaxHeightLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.whatsapp.BoundedLinearLayout} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView
            if (r0 == 0) goto L_0x0025
            r2 = r3
            com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView r2 = (com.whatsapp.conversation.conversationrow.dynamicview.DynamicMessageView) r2
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0024
            r0 = 1
            r2.A06 = r0
            X.10E r1 = X.C72463Mc.A0X(r2)
            X.1iW r0 = X.AnonymousClass3MZ.A0U(r1)
            r2.A00 = r0
            X.118 r0 = X.AnonymousClass3MZ.A0l(r1)
            r2.A01 = r0
            X.0vb r0 = X.AnonymousClass10E.A6Q(r1)
            r2.A02 = r0
        L_0x0024:
            return
        L_0x0025:
            boolean r0 = r3 instanceof com.whatsapp.components.MaxHeightLinearLayout
            if (r0 == 0) goto L_0x0037
            r1 = r3
            com.whatsapp.components.MaxHeightLinearLayout r1 = (com.whatsapp.components.MaxHeightLinearLayout) r1
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0024
            r0 = 1
            r1.A00 = r0
        L_0x0033:
            r1.generatedComponent()
            return
        L_0x0037:
            boolean r0 = r3 instanceof com.whatsapp.communitymedia.itemviews.MediaMetadataView
            if (r0 == 0) goto L_0x0050
            r1 = r3
            com.whatsapp.communitymedia.itemviews.MediaMetadataView r1 = (com.whatsapp.communitymedia.itemviews.MediaMetadataView) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0024
            r0 = 1
            r1.A01 = r0
            X.033 r0 = X.AnonymousClass3MX.A0T(r1)
            X.0vb r0 = X.C72473Md.A0S(r0)
            r1.A00 = r0
            return
        L_0x0050:
            boolean r0 = r3 instanceof com.whatsapp.BoundedLinearLayout
            if (r0 == 0) goto L_0x005f
            r1 = r3
            com.whatsapp.BoundedLinearLayout r1 = (com.whatsapp.BoundedLinearLayout) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0024
            r0 = 1
            r1.A02 = r0
            goto L_0x0033
        L_0x005f:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0024
            r0 = 1
            r3.A01 = r0
            r3.generatedComponent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73143Qb.A01():void");
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C73143Qb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
