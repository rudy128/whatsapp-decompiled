package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9tZ  reason: invalid class name and case insensitive filesystem */
public final class C195579tZ {
    public final DSQ A00;
    public final DSQ A01;
    public final AnonymousClass1BI A02;
    public final UserJid A03;
    public final C166408cq A04;
    public final AnonymousClass205 A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195579tZ) {
                C195579tZ r5 = (C195579tZ) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || this.A07 != r5.A07 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        AnonymousClass205 r0 = this.A05;
        return C108945cZ.A09(this.A06, (((AnonymousClass0DV.A00((AnonymousClass000.A0N(r0, ((AnonymousClass001.A0k(this.A00) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A04)) * 31, this.A07) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A03)) * 31);
    }

    public C195579tZ(DSQ dsq, DSQ dsq2, AnonymousClass1BI r3, UserJid userJid, C166408cq r5, AnonymousClass205 r6, String str, boolean z) {
        this.A00 = dsq;
        this.A01 = dsq2;
        this.A05 = r6;
        this.A04 = r5;
        this.A07 = z;
        this.A02 = r3;
        this.A03 = userJid;
        this.A06 = str;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageSecretDecryptionParams(encIv=");
        A10.append(this.A00);
        A10.append(", encPayload=");
        A10.append(this.A01);
        A10.append(", messageKey=");
        A10.append(this.A05);
        A10.append(", targetMessageKey=");
        A10.append(this.A04);
        A10.append(", isTargetMessageLidBased=");
        A10.append(this.A07);
        A10.append(", remoteSenderJid=");
        A10.append(this.A02);
        A10.append(", senderUserJid=");
        A10.append(this.A03);
        A10.append(", messageSecretUseCase=");
        return C17900vP.A0B(this.A06, A10);
    }
}
