package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView;
import com.whatsapp.mediacomposer.bottombar.recipients.EmptyChipRecipientsView;

/* renamed from: X.6m3  reason: invalid class name and case insensitive filesystem */
public final class C132026m3 {
    public AnonymousClass6ZM A00;
    public final C114045q4 A01 = ((C114045q4) AnonymousClass12Q.A01(32871));

    /* JADX INFO: finally extract failed */
    public final AnonymousClass8AQ A00(ViewStub viewStub, C122506Qq r7, boolean z) {
        AnonymousClass8AQ r4;
        boolean A17 = C18070vi.A17(r7, viewStub);
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            View A0G = AnonymousClass3MY.A0G(viewStub, 2131626160);
            C18070vi.A0z(A0G, "null cannot be cast to non-null type com.whatsapp.mediacomposer.bottombar.recipients.DefaultRecipientsView");
            DefaultRecipientsView defaultRecipientsView = (DefaultRecipientsView) A0G;
            if (z) {
                defaultRecipientsView.setBackground((Drawable) null);
            }
            AnonymousClass6ZM r0 = this.A00;
            if (r0 != null) {
                AnonymousClass10E r2 = r0.A00.A01;
                r4 = new AnonymousClass7J0(C108985cd.A0R(r2), defaultRecipientsView, (AnonymousClass72B) r2.A34.get());
            } else {
                C18070vi.A11("defaultRecipientsControllerFactory");
                throw null;
            }
        } else if (ordinal == A17) {
            View A0G2 = AnonymousClass3MY.A0G(viewStub, 2131626161);
            C18070vi.A0z(A0G2, "null cannot be cast to non-null type com.whatsapp.mediacomposer.bottombar.recipients.EmptyChipRecipientsView");
            EmptyChipRecipientsView emptyChipRecipientsView = (EmptyChipRecipientsView) A0G2;
            if (z) {
                emptyChipRecipientsView.setBackground((Drawable) null);
            }
            Context A0A = C72483Me.A0A(this.A01);
            try {
                r4 = new C144867Iz(emptyChipRecipientsView);
                AnonymousClass12Q.A04();
                AnonymousClass114.A02(A0A);
                C18070vi.A0b(r4);
            } catch (Throwable th) {
                AnonymousClass12Q.A04();
                AnonymousClass114.A02(A0A);
                throw th;
            }
        } else if (ordinal == 2) {
            r4 = new C144857Iy();
        } else {
            throw AnonymousClass3MW.A14();
        }
        return r4;
    }
}
