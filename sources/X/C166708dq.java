package X;

import com.whatsapp.accountsync.ProfileActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.8dq  reason: invalid class name and case insensitive filesystem */
public abstract class C166708dq extends C166678dR {
    public boolean A00 = false;

    public static void A03(AnonymousClass10E r1, ProfileActivity profileActivity, AnonymousClass1M9 r3) {
        profileActivity.A05 = r3;
        profileActivity.A07 = (AnonymousClass126) r1.A4h.get();
        profileActivity.A09 = (WhatsAppLibLoader) r1.ABy.get();
        profileActivity.A0B = C000200d.A00(r1.A2b);
        profileActivity.A06 = (AnonymousClass1Cd) r1.A6i.get();
        profileActivity.A0A = (C33841jT) r1.A9T.get();
        profileActivity.A02 = (C26271Rm) r1.A0I.get();
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            ProfileActivity profileActivity = (ProfileActivity) this;
            AnonymousClass10E A01 = C137116uw.A01((AnonymousClass1K1) AnonymousClass3MX.A0R(this), profileActivity);
            C63932tv.A02(A01, profileActivity);
            AnonymousClass10G r1 = A01.A00;
            C63932tv.A01(A01, r1, profileActivity);
            C63662tU.A00(A01, r1, profileActivity, r1.A5A);
            profileActivity.A01 = AnonymousClass3MY.A0Z(A01);
            profileActivity.A00 = AnonymousClass10G.A51(r1);
            profileActivity.A01 = AnonymousClass3MY.A0N(A01);
            profileActivity.A08 = AnonymousClass3MY.A0Z(A01);
            profileActivity.A00 = C19890zB.A00;
            profileActivity.A04 = (C33621j7) A01.A0g.get();
            A03(A01, profileActivity, AnonymousClass10E.A4z(A01));
        }
    }

    public C166708dq() {
        AGB.A00(this, 10);
    }
}
