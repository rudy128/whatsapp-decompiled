package X;

import com.whatsapp.jid.UserJid;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.9oI  reason: invalid class name and case insensitive filesystem */
public final class C192379oI {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass121 A02;

    public final void A01(UserJid userJid) {
        C18070vi.A0d(userJid, 0);
        AnonymousClass11P r2 = this.A01;
        this.A02.BBM(new C436420i(AnonymousClass205.A01(userJid, AnonymousClass1PP.A00(this.A00, r2, false), true), MediaCodecVideoEncoder.MIN_ENCODER_WIDTH, AnonymousClass11P.A01(r2)));
    }

    public final void A00(AnonymousClass1BI r7, boolean z) {
        AnonymousClass11P r1 = this.A01;
        AnonymousClass206 r12 = new AnonymousClass206(AnonymousClass205.A01(r7, AnonymousClass8BS.A0e(this.A00, r1), true), 87, AnonymousClass11P.A01(r1));
        if (z) {
            r12.A1D = AnonymousClass8BV.A1a(32);
            r12.A0o = true;
        }
        this.A02.BBM(r12);
    }

    public C192379oI(AnonymousClass11S r1, AnonymousClass11P r2, AnonymousClass121 r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
