package com.whatsapp.conversation.conversationrow.dynamicview;

import X.AnonymousClass118;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.C18000vb;
import X.C18070vi;
import X.C33251iW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.WaLinearLayout;
import java.util.List;

public final class DynamicMessageView extends WaLinearLayout {
    public C33251iW A00;
    public AnonymousClass118 A01;
    public C18000vb A02;
    public AnonymousClass206 A03;
    public List A04;
    public boolean A05;
    public boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0e(context, 1, attributeSet);
        A01();
        setOrientation(1);
        this.A05 = true;
    }

    public final void setUserAction(C33251iW r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContext(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final boolean getChildCanCaptureTouchEvent() {
        return this.A05;
    }

    public final C33251iW getUserAction() {
        C33251iW r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("userAction");
        throw null;
    }

    public final AnonymousClass118 getWaContext() {
        AnonymousClass118 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("waContext");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A05) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setChildCanCaptureTouchEvent(boolean z) {
        this.A05 = z;
    }

    public DynamicMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A01();
    }
}
