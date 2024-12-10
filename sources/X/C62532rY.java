package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.2rY  reason: invalid class name and case insensitive filesystem */
public final class C62532rY {
    public final AnonymousClass1E2 A00;
    public final AnonymousClass1E2 A01;
    public final PhoneUserJid A02;
    public final PhoneUserJid A03;
    public final PhoneUserJid A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62532rY) {
                C62532rY r5 = (C62532rY) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0k = ((((((((((AnonymousClass001.A0k(this.A04) * 31) + C17900vP.A00(this.A06)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A03)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return C17880vN.A01((A0k + i) * 31, this.A07);
    }

    public C62532rY(AnonymousClass1E2 r1, AnonymousClass1E2 r2, PhoneUserJid phoneUserJid, PhoneUserJid phoneUserJid2, PhoneUserJid phoneUserJid3, String str, String str2, boolean z) {
        this.A04 = phoneUserJid;
        this.A06 = str;
        this.A02 = phoneUserJid2;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = phoneUserJid3;
        this.A05 = str2;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingLidValues(senderPn=");
        A10.append(this.A04);
        A10.append(", senderUsername=");
        A10.append(this.A06);
        A10.append(", participantPn=");
        A10.append(this.A02);
        A10.append(", participantLid=");
        A10.append(this.A00);
        A10.append(", senderLid=");
        A10.append(this.A01);
        A10.append(", recipientPn=");
        A10.append(this.A03);
        A10.append(", recipientUsername=");
        A10.append(this.A05);
        A10.append(", isLidLiveLocation=");
        return C17900vP.A0F(A10, this.A07);
    }

    public C62532rY() {
        this((AnonymousClass1E2) null, (AnonymousClass1E2) null, (PhoneUserJid) null, (PhoneUserJid) null, (PhoneUserJid) null, (String) null, (String) null, false);
    }
}
