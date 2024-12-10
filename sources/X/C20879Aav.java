package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.Aav  reason: case insensitive filesystem */
public final class C20879Aav implements C22547BCe {
    public final int A00;
    public final long A01;

    public int Bbd() {
        return 3;
    }

    public boolean Bef(C22547BCe bCe) {
        if (!(bCe instanceof C20879Aav) || this.A01 != ((C20879Aav) bCe).A01) {
            return false;
        }
        return true;
    }

    public C20879Aav(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public /* synthetic */ Jid BTc() {
        return null;
    }

    public long BYQ() {
        return this.A01;
    }
}
