package X;

/* renamed from: X.ASe  reason: case insensitive filesystem */
public class C20620ASe implements B83, B85, C436820m {
    public final C199179zZ A00;

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        AnonymousClass8BX.A1H(r5, "FMessageAudioProtobuf: message type is not supported ", AnonymousClass000.A10(), r5 instanceof C441822l);
        C441722k r52 = (C441722k) r5;
        AnonymousClass8SR A01 = this.A00.A01(a2m, r52);
        if (A01 != null) {
            a2m.A00.A0H(A01);
        } else {
            AnonymousClass8BY.A10(r52, "FMessageAudio/unable to send encrypted media message due to missing mediaKey; key=", AnonymousClass000.A10());
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & 128) == 0) {
            return null;
        }
        C166138cP r12 = r1.audioMessage_;
        C166138cP r4 = r12;
        if (r12 == null) {
            r12 = C166138cP.DEFAULT_INSTANCE;
        }
        if ((r12.bitField0_ & 16384) != 0 && r12.viewOnce_) {
            return null;
        }
        if (r4 == null) {
            r4 = C166138cP.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r2 = a6d.A0A;
        C441822l r3 = new C441822l(r2, a6d.A03);
        C199179zZ.A00(r4, r2, r3, a6d.A05());
        return r3;
    }

    public C20620ASe(C199179zZ r1) {
        this.A00 = r1;
    }
}
