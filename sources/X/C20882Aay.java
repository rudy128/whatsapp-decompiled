package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.Aay  reason: case insensitive filesystem */
public final class C20882Aay implements C22547BCe {
    public final int A00;
    public final int A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final long A05;

    public int Bbd() {
        return 1;
    }

    public boolean Bef(C22547BCe bCe) {
        if (bCe instanceof C20882Aay) {
            C20882Aay aay = (C20882Aay) bCe;
            if (AnonymousClass1EG.A0I(this.A02, aay.A02) && this.A00 == aay.A00 && this.A01 == aay.A01 && this.A04 == aay.A04 && this.A03 == aay.A03) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C20882Aay(String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A05 = j;
        this.A02 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A03 = z2;
    }

    public /* synthetic */ Jid BTc() {
        return null;
    }

    public long BYQ() {
        return this.A05;
    }
}
