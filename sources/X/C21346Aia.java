package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Aia  reason: case insensitive filesystem */
public class C21346Aia implements Comparable {
    public int A00;
    public long A01;
    public AnonymousClass1KN A02;
    public final AnonymousClass8pG A03;
    public final UserJid A04;
    public final UserJid A05;
    public final boolean A06;

    public C21346Aia(AnonymousClass1KN r3, AnonymousClass8pG r4, UserJid userJid, long j) {
        this.A06 = true;
        this.A04 = null;
        this.A05 = userJid;
        this.A00 = 1;
        this.A02 = r3;
        this.A01 = j;
        this.A03 = r4;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C21346Aia aia = (C21346Aia) obj;
        int A002 = AnonymousClass1XO.A00(this.A00, aia.A00);
        if (A002 == 0) {
            return (this.A01 > aia.A01 ? 1 : (this.A01 == aia.A01 ? 0 : -1));
        }
        return -A002;
    }

    public C21346Aia(UserJid userJid, UserJid userJid2, int i, long j) {
        this.A06 = false;
        this.A03 = null;
        this.A05 = userJid;
        this.A04 = userJid2;
        this.A00 = i;
        this.A01 = j;
    }
}
