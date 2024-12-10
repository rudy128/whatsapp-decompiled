package X;

import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.5ry  reason: invalid class name and case insensitive filesystem */
public abstract class C114775ry extends C166678dR {
    public boolean A00 = false;

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            ContactPicker contactPicker = (ContactPicker) this;
            AnonymousClass10E A0A = C109005cf.A0A((AnonymousClass1K1) AnonymousClass3MX.A0R(this), contactPicker);
            AnonymousClass1FB.A0M(A0A, contactPicker);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, contactPicker);
            C109005cf.A0e(A0A, r1, contactPicker, r1.A5A);
            A03(A0A, r1, contactPicker, A0A.ABd);
            A0Q(r1, contactPicker);
        }
    }

    public C114775ry() {
        AnonymousClass79Z.A00(this, 37);
    }

    public static void A03(AnonymousClass10E r1, AnonymousClass10G r2, ContactPicker contactPicker, C18140vp r4) {
        contactPicker.A01 = (AnonymousClass1LU) r4.get();
        contactPicker.A00 = AnonymousClass10G.A51(r2);
        contactPicker.A08 = (C18030ve) r1.A04.get();
        contactPicker.A0B = (C32011gU) r1.A5k.get();
        contactPicker.A02 = (AnonymousClass194) r1.A9Z.get();
        contactPicker.A09 = (AnonymousClass18K) r1.A9B.get();
        contactPicker.A03 = (C33251iW) r1.ABA.get();
        contactPicker.A0C = (WhatsAppLibLoader) r1.ABy.get();
        contactPicker.A0E = C000200d.A00(r1.A2b);
        contactPicker.A0D = (C33841jT) r1.A9T.get();
        contactPicker.A07 = (C219217x) r1.ABj.get();
        contactPicker.A06 = (C25982Cpv) r2.A8A.get();
    }

    public static void A0Q(AnonymousClass10G r0, ContactPicker contactPicker) {
        contactPicker.A0A = (C87894Xm) r0.AH7.get();
    }
}
