package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.33q  reason: invalid class name and case insensitive filesystem */
public final class C685133q implements C22511BAs {
    public final AnonymousClass11S A00;
    public final C26011Qm A01;
    public final AnonymousClass1SI A02;

    public void C1A(C195629te r4, AnonymousClass8X1 r5, AnonymousClass206 r6) {
        DeviceJid A002;
        C18070vi.A0d(r6, 0);
        C18070vi.A0j(r5, r4);
        if (r6.A0t()) {
            byte[] bArr = r6.A1D;
            C23581BmB A012 = DSQ.A01(bArr, 0, bArr.length);
            C166388co A0X = C17880vN.A0X(r5);
            A0X.bitField1_ |= 4;
            A0X.messageSecret_ = A012;
            if (r6.A0v.A02 && (A002 = this.A01.A00(r6)) != null) {
                UserJid userJid = A002.userJid;
                if (!this.A00.A0O(userJid)) {
                    String A06 = C22971Dz.A06(userJid);
                    if (!AnonymousClass1EG.A0H(A06)) {
                        C166388co r1 = (C166388co) C17880vN.A0G(r5);
                        A06.getClass();
                        r1.bitField1_ |= 16;
                        r1.originalSelfAuthorUserJidString_ = A06;
                    }
                }
            }
        }
    }

    public C685133q(AnonymousClass11S r1, AnonymousClass1SI r2, C26011Qm r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r2;
    }

    public void C1B(C193069pU r3, C166388co r4, AnonymousClass206 r5) {
        boolean A16 = C18070vi.A16(r4, r5);
        if ((r4.bitField1_ & 4) != 0) {
            r5.A1D = r4.messageSecret_.A06();
            r5.A0o = A16;
        }
    }
}
