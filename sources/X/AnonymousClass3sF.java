package X;

import android.view.View;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaFrameLayout;

/* renamed from: X.3sF  reason: invalid class name */
public class AnonymousClass3sF extends C78143sG {
    public AnonymousClass1PU A00;
    public boolean A01;

    public void A1M() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (AnonymousClass1PU) r3.A4j.get();
        }
    }

    public AnonymousClass23S getFMessage() {
        return (AnonymousClass23S) this.A0I;
    }

    public String getInviteCaption() {
        return ((AnonymousClass23S) this.A0I).A04;
    }

    public View.OnClickListener getOnActionClickListener() {
        return new C825248h(this, this.A0I, 40);
    }

    public void setFMessage(AnonymousClass206 r2) {
        C17960vV.A0D(r2 instanceof AnonymousClass23S);
        this.A0I = r2;
    }

    public void A2i() {
        super.A2i();
        AnonymousClass23S r3 = (AnonymousClass23S) this.A0I;
        String str = r3.A05;
        if (str == null || str.length() == 0) {
            this.A09.setText(2131891016);
            this.A08.setVisibility(8);
        } else {
            this.A09.setText(str);
        }
        boolean A1R = C17890vO.A1R(r3.A00);
        TextEmojiLabel textEmojiLabel = this.A08;
        int i = 2131891016;
        if (A1R) {
            i = 2131893510;
        }
        textEmojiLabel.setText(i);
        boolean z = r3.A0v.A02;
        TextEmojiLabel textEmojiLabel2 = this.A07;
        int i2 = 2131891518;
        if (z) {
            i2 = 2131897893;
        }
        textEmojiLabel2.setText(i2);
        ((WaFrameLayout) findViewById(2131431810)).setForeground(this.A09.BS0(AnonymousClass00R.A01, C72453Mb.A05(z ? 1 : 0), false));
    }
}
