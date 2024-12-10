package X;

import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.5t7  reason: invalid class name and case insensitive filesystem */
public abstract class C115005t7 extends C74803cp {
    public boolean A00 = false;

    public static void A0y(AnonymousClass1K1 r1, AnonymousClass10E r2, AnonymousClass10G r3, PhoneContactsSelector phoneContactsSelector, C219217x r5) {
        phoneContactsSelector.A0M = r5;
        phoneContactsSelector.A0S = C000200d.A00(r3.AD5);
        phoneContactsSelector.A07 = (C26911Ty) r2.A1J.get();
        phoneContactsSelector.A0R = C000200d.A00(r1.A4W);
        phoneContactsSelector.A0J = (C134196qC) r3.A38.get();
        phoneContactsSelector.A0K = (C31131f4) r2.A6M.get();
        phoneContactsSelector.A0U = C000200d.A00(r3.A3f);
        phoneContactsSelector.A0V = C000200d.A00(r3.A4T);
        phoneContactsSelector.A0I = (C88184Yq) r3.A15.get();
        phoneContactsSelector.A0O = (AnonymousClass1M4) r2.AmV.get();
        phoneContactsSelector.A0E = (C27191Vc) r2.A2i.get();
        phoneContactsSelector.A0T = C000200d.A00(r1.A4y);
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) this;
            AnonymousClass1K1 r4 = (AnonymousClass1K1) AnonymousClass3MX.A0R(this);
            AnonymousClass10E A0A = C109005cf.A0A(r4, phoneContactsSelector);
            AnonymousClass1FB.A0M(A0A, phoneContactsSelector);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0d(A0A, r1, phoneContactsSelector);
            C109005cf.A0e(A0A, r1, phoneContactsSelector, r1.A5A);
            C137106uv.A00(r4, phoneContactsSelector);
            phoneContactsSelector.A0L = AnonymousClass3MZ.A0l(A0A);
            phoneContactsSelector.A04 = C19890zB.A00;
            phoneContactsSelector.A06 = (C36271nc) r1.A4x.get();
            phoneContactsSelector.A0D = AnonymousClass3MZ.A0i(A0A);
            phoneContactsSelector.A08 = AnonymousClass3MZ.A0e(A0A);
            phoneContactsSelector.A09 = AnonymousClass10E.A4z(A0A);
            phoneContactsSelector.A0A = AnonymousClass3MZ.A0g(A0A);
            phoneContactsSelector.A0N = AnonymousClass10E.A6Q(A0A);
            phoneContactsSelector.A05 = C72453Mb.A0b(A0A);
            phoneContactsSelector.A0Q = C000200d.A00(A0A.A2b);
            A0y(r4, A0A, r1, phoneContactsSelector, AnonymousClass3Ma.A0b(A0A));
        }
    }

    public C115005t7() {
        AnonymousClass79Z.A00(this, 38);
    }
}
