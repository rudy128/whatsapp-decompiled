package X;

import com.whatsapp.jid.UserJid;

public final class ANB implements BAJ {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ ANI A01;

    public void BuN(AN5 an5, C188519hY r6) {
        ANI ani = this.A01;
        ani.A00 = false;
        if (r6.A09 == null) {
            UserJid userJid = this.A00;
            ((C20114A7x) ani.A09.get()).A0F(an5, userJid, false);
            C17890vO.A0s(C17880vN.A0V(ani.A0A), userJid, 29);
        }
    }

    public ANB(UserJid userJid, ANI ani) {
        this.A01 = ani;
        this.A00 = userJid;
    }

    public void BuM(int i) {
        ANI ani = this.A01;
        ani.A00 = false;
        if (i == 404 || i == 406) {
            ((C20114A7x) ani.A09.get()).A0J(this.A00);
        }
        C20739AWu.A00(C17880vN.A0V(ani.A0A), this.A00, i, 9);
    }
}
