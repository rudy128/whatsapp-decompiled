package X;

import android.widget.RelativeLayout;
import com.whatsapp.calling.callhistory.group.GroupCallSelectedContactsList;
import com.whatsapp.contact.picker.SelectedContactsList;

/* renamed from: X.3RX  reason: invalid class name */
public abstract class AnonymousClass3RX extends RelativeLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public void A01() {
        if (this instanceof C77643r4) {
            C77643r4 r2 = (C77643r4) this;
            if (!r2.A00) {
                r2.A00 = true;
                AnonymousClass033 A0T = AnonymousClass3MX.A0T(r2);
                GroupCallSelectedContactsList groupCallSelectedContactsList = (GroupCallSelectedContactsList) r2;
                AnonymousClass10E r1 = ((C27691Xc) A0T).A10;
                groupCallSelectedContactsList.A06 = AnonymousClass3MZ.A0g(r1);
                groupCallSelectedContactsList.A04 = AnonymousClass10E.A6Q(r1);
                groupCallSelectedContactsList.A05 = AnonymousClass3MZ.A13(r1);
            }
        } else if (!this.A01) {
            this.A01 = true;
            ((SelectedContactsList) this).A06 = AnonymousClass3MZ.A0g(((C27691Xc) ((AnonymousClass033) generatedComponent())).A10);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
