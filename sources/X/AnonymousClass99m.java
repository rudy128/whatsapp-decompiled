package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.99m  reason: invalid class name */
public class AnonymousClass99m extends ASN {
    public final AnonymousClass11S A00;

    public AnonymousClass99m(AnonymousClass11S r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass8X7 r2, AnonymousClass23N r3) {
        super.A00(r2, r3);
        r2.A0K(false);
        if (r3.A0I() != null) {
            AnonymousClass8X7.A01(r3.A0I(), r2);
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        if (C181609Rd.A00(a6d) != C179839Kc.REVOKE || a6d.A00 != 8) {
            return null;
        }
        C166368cm A002 = C20077A6d.A00(a6d);
        C17960vV.A07(A002);
        C166408cq r0 = A002.key_;
        if (r0 == null) {
            r0 = C166408cq.DEFAULT_INSTANCE;
        }
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(r0.remoteJid_);
        AnonymousClass205 r6 = a6d.A0A;
        AnonymousClass1BI r5 = r6.A00;
        if (C42171xk.A00(r5, A0l)) {
            C166408cq r02 = A002.key_;
            C166408cq r1 = r02;
            if (r02 == null) {
                r02 = C166408cq.DEFAULT_INSTANCE;
            }
            if (!r02.fromMe_) {
                if (r1 == null) {
                    r1 = C166408cq.DEFAULT_INSTANCE;
                }
                UserJid A02 = C22941Dw.A02(r1.participant_);
                C181339Qc.A00(new C21527Ala(14), AnonymousClass000.A1W(A02));
                C17960vV.A07(A02);
                AnonymousClass23O r12 = new AnonymousClass23O(AnonymousClass205.A01(r5, r6.A01, this.A00.A0O(A02)), a6d.A03);
                UserJid A01 = C22941Dw.A01(a6d.A05);
                C17960vV.A07(A01);
                r12.A00 = A01;
                C166408cq r03 = A002.key_;
                if (r03 == null) {
                    r03 = C166408cq.DEFAULT_INSTANCE;
                }
                r12.A01 = r03.id_;
                return r12;
            }
        }
        throw AnonymousClass8BR.A0o(27);
    }
}
