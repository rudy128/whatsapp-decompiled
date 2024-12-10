package X;

import android.view.View;
import com.whatsapp.account.delete.DeleteAccountFeedback;

/* renamed from: X.4fC  reason: invalid class name and case insensitive filesystem */
public class C91134fC implements C15920rQ {
    public final int A00;
    public final Object A01;

    public C91134fC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Brs() {
        View view;
        switch (this.A00) {
            case 0:
                ((DeleteAccountFeedback) this.A01).A08 = false;
                return;
            case 1:
                AnonymousClass4ZW r2 = (AnonymousClass4ZW) this.A01;
                C17960vV.A0F(AnonymousClass000.A1W(r2.A00), "ContactConversationMenu/onPopupMenuDismissListener selected menu item is null");
                view = r2.A00;
                if (view == null) {
                    return;
                }
                break;
            case 2:
                AnonymousClass4Zx r22 = (AnonymousClass4Zx) this.A01;
                C17960vV.A0F(AnonymousClass000.A1W(r22.A00), "GroupConversationMenu/onPopupMenuDismissListener selected menu item is null");
                view = r22.A00;
                break;
            default:
                ((View) this.A01).setActivated(false);
                return;
        }
        view.setAlpha(1.0f);
    }
}
