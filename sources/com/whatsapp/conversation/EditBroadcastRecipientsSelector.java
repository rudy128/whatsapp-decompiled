package com.whatsapp.conversation;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1IX;
import X.AnonymousClass1K1;
import X.AnonymousClass3MZ;
import X.AnonymousClass3gf;
import X.AnonymousClass4SL;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C25491Ok;
import X.C72473Md;
import X.C72483Me;
import X.C74803cp;
import X.C91004ez;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class EditBroadcastRecipientsSelector extends AnonymousClass3gf {
    public C25491Ok A00;
    public AnonymousClass1IX A01;
    public boolean A02;

    public EditBroadcastRecipientsSelector() {
        this(0);
    }

    public void A55(ArrayList arrayList) {
        C18070vi.A0d(arrayList, 0);
        super.A55(arrayList);
        AnonymousClass1IX A0y = A0y(this);
        if (A0y != null) {
            arrayList.addAll(A0y);
        }
    }

    public static final AnonymousClass1IX A0y(EditBroadcastRecipientsSelector editBroadcastRecipientsSelector) {
        if (C18020vd.A00(C18040vf.A02, editBroadcastRecipientsSelector.A0E, 10136) == 1) {
            editBroadcastRecipientsSelector.A01 = C74803cp.A0Q(editBroadcastRecipientsSelector.A01, editBroadcastRecipientsSelector);
        }
        return editBroadcastRecipientsSelector.A01;
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass1K1 A0K = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r1 = r2.A00;
            AnonymousClass1FB.A0K(r2, r1, this, r1.A45);
            AnonymousClass1FB.A0L(r2, r1, this, r1.A5A);
            C74803cp.A0t(A0K, r2, r1, this, A0K.A63);
            C74803cp.A0s(A0K, r2, r1, this);
            this.A00 = AnonymousClass3MZ.A0h(r2);
        }
    }

    public void A4z(AnonymousClass4SL r4, AnonymousClass1E7 r5) {
        boolean A15 = C18070vi.A15(r4, r5);
        C25491Ok r1 = this.A00;
        if (r1 != null) {
            UserJid A0x = AnonymousClass3MZ.A0x(r5);
            if (A0x == null || !r1.A00(A0x)) {
                super.A4z(r4, r5);
                return;
            }
            if (r5.A0y) {
                super.BEb(r5);
            }
            TextEmojiLabel textEmojiLabel = r4.A03;
            textEmojiLabel.setSingleLine(A15);
            textEmojiLabel.setMaxLines(2);
            r4.A00("You can't add this business to a Broadcast list.", A15, 1);
            return;
        }
        C18070vi.A11("businessCoexUtils");
        throw null;
    }

    public EditBroadcastRecipientsSelector(int i) {
        this.A02 = false;
        C91004ez.A00(this, 23);
    }
}
