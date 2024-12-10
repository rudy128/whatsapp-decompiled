package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.Aax  reason: case insensitive filesystem */
public final class C20881Aax implements C22547BCe {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public long BYQ() {
        return -1;
    }

    public int Bbd() {
        return 0;
    }

    public boolean Bef(C22547BCe bCe) {
        if (!(bCe instanceof C20881Aax)) {
            return false;
        }
        C20881Aax aax = (C20881Aax) bCe;
        if (AnonymousClass1EG.A0I(this.A02, aax.A02) && this.A03 == aax.A03 && this.A01 == aax.A01 && this.A00 == aax.A00) {
            return true;
        }
        return false;
    }

    public C20881Aax(int i, int i2, String str, boolean z) {
        this.A02 = str;
        this.A03 = z;
        this.A00 = i;
        this.A01 = i2;
    }

    public /* synthetic */ Jid BTc() {
        return null;
    }
}
