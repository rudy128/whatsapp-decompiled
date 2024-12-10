package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.event.ChatInfoEventsCard;

/* renamed from: X.3PS  reason: invalid class name */
public final class AnonymousClass3PS extends FrameLayout implements AnonymousClass009 {
    public C106955Xv A00;
    public C76803oS A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public final AnonymousClass1FU A04;
    public final ChatInfoEventsCard A05;

    public final void setGroupChatInfoViewModelFactory$app_product_community_community(C106955Xv r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass1FU getActivity() {
        return this.A04;
    }

    public final C106955Xv getGroupChatInfoViewModelFactory$app_product_community_community() {
        C106955Xv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("groupChatInfoViewModelFactory");
        throw null;
    }

    public AnonymousClass3PS(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            this.A00 = (C106955Xv) ((C27691Xc) ((AnonymousClass033) generatedComponent())).A0z.A49.get();
        }
        this.A04 = AnonymousClass3MZ.A0P(context);
        this.A05 = (ChatInfoEventsCard) C18070vi.A05(View.inflate(context, 2131624405, this), 2131428635);
    }
}
