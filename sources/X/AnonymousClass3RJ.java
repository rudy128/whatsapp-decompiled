package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.conversation.conversationrow.components.contextcard.CommunityPhotoHeader;
import com.whatsapp.conversation.conversationrow.components.contextcard.GroupPhotoHeader;

/* renamed from: X.3RJ  reason: invalid class name */
public final class AnonymousClass3RJ extends LinearLayout implements AnonymousClass009, AnonymousClass5ZE {
    public WaImageView A00;
    public CommunityPhotoHeader A01;
    public GroupPhotoHeader A02;
    public C18000vb A03;
    public AnonymousClass1VU A04;
    public AnonymousClass031 A05;
    public boolean A06;

    public final void setPathDrawableHelper(AnonymousClass1VU r2) {
        C18070vi.A0d(r2, 0);
        this.A04 = r2;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A05;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public View getHeaderView() {
        return this;
    }

    public final AnonymousClass1VU getPathDrawableHelper() {
        AnonymousClass1VU r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("pathDrawableHelper");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public LinearLayout.LayoutParams getHeaderLayoutParams() {
        return C72483Me.A0M(this);
    }
}
