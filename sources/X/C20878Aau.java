package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.Aau  reason: case insensitive filesystem */
public final class C20878Aau implements C22547BCe {
    public final int A00;
    public final long A01;

    public boolean Bef(C22547BCe bCe) {
        if (bCe instanceof C20878Aau) {
            C20878Aau aau = (C20878Aau) bCe;
            if (this.A01 == aau.A01 && this.A00 == aau.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C20878Aau(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }

    public /* synthetic */ Jid BTc() {
        return null;
    }

    public long BYQ() {
        return this.A01;
    }

    public int Bbd() {
        return this.A00;
    }
}
