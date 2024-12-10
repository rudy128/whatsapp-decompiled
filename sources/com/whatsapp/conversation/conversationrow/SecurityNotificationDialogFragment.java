package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass10I;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass1E7;
import X.AnonymousClass1KW;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C18000vb;
import X.C24921Me;
import X.C36531o3;
import X.C43251zV;

public abstract class SecurityNotificationDialogFragment extends Hilt_SecurityNotificationDialogFragment {
    public AnonymousClass1L9 A00;
    public AnonymousClass11S A01;
    public AnonymousClass1M9 A02;
    public C24921Me A03;
    public C36531o3 A04;
    public AnonymousClass1KW A05;
    public AnonymousClass129 A06;
    public AnonymousClass10I A07;

    public CharSequence A2H(AnonymousClass1E7 r4, int i) {
        String A0F;
        Object[] A1a = AnonymousClass3MW.A1a();
        C18000vb r1 = this.A01;
        String A0I = this.A03.A0I(r4);
        if (A0I == null) {
            A0F = null;
        } else {
            A0F = r1.A0F(A0I);
        }
        return C43251zV.A05(A1n(), this.A05, AnonymousClass3MX.A16(this, A0F, A1a, 0, i));
    }
}
