package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.8X7  reason: invalid class name */
public final class AnonymousClass8X7 extends C23624Bmt implements C22356B4k {
    public AnonymousClass8X7() {
        super(C166408cq.DEFAULT_INSTANCE);
    }

    public static void A00(Jid jid, AnonymousClass8X7 r1) {
        r1.A0J(jid.getRawString());
    }

    public static void A01(Jid jid, AnonymousClass8X7 r1) {
        r1.A0I(jid.getRawString());
    }

    public static void A02(Jid jid, AnonymousClass8X7 r1, AnonymousClass205 r2) {
        r1.A0J(C22971Dz.A06(jid));
        r1.A0K(r2.A02);
    }

    public void A0G() {
        C166408cq r1 = (C166408cq) C17880vN.A0G(this);
        r1.bitField0_ &= -2;
        r1.remoteJid_ = C166408cq.DEFAULT_INSTANCE.remoteJid_;
    }

    public void A0H(String str) {
        C166408cq r1 = (C166408cq) C17880vN.A0G(this);
        int i = C166408cq.FROM_ME_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 4;
        r1.id_ = str;
    }

    public void A0I(String str) {
        C166408cq r1 = (C166408cq) C17880vN.A0G(this);
        int i = C166408cq.FROM_ME_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 8;
        r1.participant_ = str;
    }

    public void A0J(String str) {
        C166408cq r1 = (C166408cq) C17880vN.A0G(this);
        int i = C166408cq.FROM_ME_FIELD_NUMBER;
        str.getClass();
        r1.bitField0_ |= 1;
        r1.remoteJid_ = str;
    }

    public void A0K(boolean z) {
        C166408cq r1 = (C166408cq) C17880vN.A0G(this);
        int i = C166408cq.FROM_ME_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.fromMe_ = z;
    }
}
