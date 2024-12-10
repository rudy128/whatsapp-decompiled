package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.AWk  reason: case insensitive filesystem */
public class C20729AWk implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C20729AWk(UserJid userJid, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = userJid;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void CGE(Object obj) {
        if (this.A00 != 0) {
            ((BDF) obj).C4Y((UserJid) this.A01, this.A02, this.A03);
            return;
        }
        boolean z = this.A02;
        boolean z2 = this.A03;
        BAG bag = (BAG) obj;
        C18070vi.A0d(bag, 3);
        bag.BuC((UserJid) this.A01, z, z2);
    }
}
