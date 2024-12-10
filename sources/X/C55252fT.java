package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.nio.charset.Charset;

/* renamed from: X.2fT  reason: invalid class name and case insensitive filesystem */
public final class C55252fT {
    public final byte[] A00;
    public final byte[] A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C55252fT(C59372mC r5) {
        Charset charset = C19620yd.A0C;
        C18070vi.A0Z(charset);
        byte[] A002 = C20058A5h.A00(r5.A02, C18070vi.A1A("WhatsApp Mutation Keys", charset), 160);
        if (A002.length == 160) {
            this.A00 = C200410p.A0W(new C25411Oc(0, 31), A002);
            this.A03 = C200410p.A0W(new C25411Oc(32, 63), A002);
            this.A04 = C200410p.A0W(new C25411Oc(64, 95), A002);
            this.A02 = C200410p.A0W(new C25411Oc(96, StringTreeSet.OFFSET_BASE_ENCODING), A002);
            this.A01 = C200410p.A0W(new C25411Oc(128, 159), A002);
            return;
        }
        throw new C46292Dz();
    }
}
