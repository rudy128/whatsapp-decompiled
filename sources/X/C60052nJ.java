package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2nJ  reason: invalid class name and case insensitive filesystem */
public final class C60052nJ {
    public final AnonymousClass1E2 A00;
    public final PhoneUserJid A01;
    public final UserJid A02;
    public final String A03;
    public final String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r4 = (X.C60052nJ) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0027
            if (r4 == 0) goto L_0x0028
            boolean r0 = X.C18070vi.A14(r3, r4)
            if (r0 == 0) goto L_0x0028
            boolean r0 = r4 instanceof X.C60052nJ
            if (r0 == 0) goto L_0x0028
            X.2nJ r4 = (X.C60052nJ) r4
            if (r4 == 0) goto L_0x0028
            com.whatsapp.jid.UserJid r1 = r3.A02
            com.whatsapp.jid.UserJid r0 = r4.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r1 = r3.A04
            java.lang.String r0 = r4.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0028
        L_0x0027:
            return r2
        L_0x0028:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60052nJ.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A02;
        return AnonymousClass000.A0P(this.A04, objArr, 1);
    }

    public final boolean A00() {
        if (!C22971Dz.A0Y(this.A02) || this.A00 == null) {
            return false;
        }
        return true;
    }

    public C60052nJ(AnonymousClass1E2 r1, PhoneUserJid phoneUserJid, UserJid userJid, String str, String str2) {
        this.A02 = userJid;
        this.A04 = str;
        this.A00 = r1;
        this.A03 = str2;
        this.A01 = phoneUserJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParticipantProtocolModel{jid=");
        A10.append(this.A02);
        A10.append(", type='");
        A10.append(this.A04);
        A10.append("', lid=");
        A10.append(this.A00);
        A10.append(", displayName='");
        A10.append(this.A03);
        A10.append("', phoneNumber='");
        A10.append(this.A01);
        return AnonymousClass000.A0y("'}", A10);
    }
}
