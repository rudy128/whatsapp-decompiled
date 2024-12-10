package X;

import com.whatsapp.util.Log;

/* renamed from: X.9uM  reason: invalid class name and case insensitive filesystem */
public final class C196039uM {
    public final AnonymousClass11S A00;
    public final C19830z4 A01;
    public final AnonymousClass19D A02;
    public final AnonymousClass00H A03;
    public final C18030ve A04;

    public final void A00(C18090vk r4) {
        if (this.A00.A0N() || this.A01.A0o() != null) {
            Log.i("EmailVerificationManager/syncEmailToSharedPrefsIfNeeded/no need to sync");
        } else {
            ((C196159uY) this.A03.get()).A01(new C95814mq(this, r4, 1));
        }
    }

    public final boolean A01() {
        C19830z4 r1 = this.A01;
        String A0o = r1.A0o();
        if (A0o == null || A0o.length() == 0 || !r1.A2N() || C17880vN.A1W(C17890vO.A0B(r1), "settings_verification_email_address_confirmed")) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (!this.A00.A0N()) {
            if (!C18020vd.A05(C18040vf.A02, this.A04, 4882)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 6114) || this.A00.A0N()) {
            return false;
        }
        String A0o = this.A01.A0o();
        if (A0o == null || A0o.length() == 0) {
            return true;
        }
        return false;
    }

    public C196039uM(AnonymousClass11S r1, C19830z4 r2, AnonymousClass19D r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0w(r4, r1, r3, r2, r5);
        this.A04 = r4;
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r5;
    }
}
