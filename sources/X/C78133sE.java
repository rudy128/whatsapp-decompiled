package X;

import android.view.View;

/* renamed from: X.3sE  reason: invalid class name and case insensitive filesystem */
public final class C78133sE extends C78143sG {
    public boolean A00;

    public void setFMessage(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        C17960vV.A0D(r2 instanceof AnonymousClass24N);
        this.A0I = r2;
    }

    public void A1M() {
        if (!this.A00) {
            this.A00 = true;
            C27691Xc A0O = AnonymousClass3MY.A0O(this);
            AnonymousClass10E r3 = A0O.A10;
            AnonymousClass1K1 A0n = AnonymousClass3uQ.A0n(r3, A0O, this);
            AnonymousClass10G r1 = r3.A00;
            AnonymousClass3uQ.A16(r1, this);
            AnonymousClass3uQ.A0w(A0n, r3, r1, this);
            AnonymousClass3uQ.A12(r3, r1, this);
            AnonymousClass3uQ.A0y(A0n, r3, this, BE8.A0d(r3));
            AnonymousClass3uQ.A13(r3, r1, this, r3.ABq);
            AnonymousClass3uQ.A0x(A0n, r3, r1, this, r3.AIy);
            C19890zB r0 = C19890zB.A00;
            AnonymousClass3uQ.A0v(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A11(r3, r1, this);
            AnonymousClass3uQ.A15(r3, this);
            AnonymousClass3uQ.A0s(r0, A0n, r3, r1, this);
            AnonymousClass3uQ.A0u(r0, r3, r1, A0O, this);
            AnonymousClass3uQ.A0t(r0, A0n, r3, A0O, this);
            AnonymousClass3uQ.A10(r3, r1, this);
            AnonymousClass3uQ.A0z(r3, r1, A0O, this, AnonymousClass3uQ.A0o(r3));
        }
    }

    public AnonymousClass24N getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.newsletter.fmessage.FMessageNewsletterAdminInvite");
        return (AnonymousClass24N) r1;
    }

    public View.OnClickListener getOnActionClickListener() {
        return new C825048f(this, 13);
    }

    public void A2i() {
        super.A2i();
        this.A09.setText(getFMessage().A03);
        this.A08.setText(2131892506);
        this.A07.setText(2131897893);
    }

    public String getInviteCaption() {
        return getFMessage().A02;
    }
}
