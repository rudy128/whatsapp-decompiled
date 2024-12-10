package X;

import android.text.TextUtils;

public class AT6 implements B83, B85, C436820m {
    public final A79 A00;
    public final C19969A1e A01;
    public final ASL A02;

    public static C163928Ww A00(C19998A2m a2m, AT6 at6, C440021t r7) {
        C179809Jz r0;
        C163928Ww A012 = at6.A01.A01(a2m, AnonymousClass8X8.A03(a2m.A00), r7);
        C62572rc r3 = r7.A02;
        boolean A0w = r7.A0w();
        if (r3 != null && ((A0w || a2m.A01() || r3.A0a != null) && A012 != null)) {
            C166248ca A0L = AnonymousClass8BS.A0L(A012);
            A0L.bitField0_ |= 128;
            A0L.gifPlayback_ = true;
            int i = r3.A05;
            if (i == 1) {
                r0 = C179809Jz.GIPHY;
            } else if (i != 2) {
                r0 = C179809Jz.NONE;
            } else {
                r0 = C179809Jz.TENOR;
            }
            A012.A0G(r0);
        }
        return A012;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r5) {
        AnonymousClass8BX.A1H(r5, "FMessageGifProtobuf: message type is not supported ", AnonymousClass000.A10(), r5 instanceof C440021t);
        C440021t r52 = (C440021t) r5;
        if (AnonymousClass8BV.A1R(r52)) {
            this.A02.A00(new C20612ARw(this, 2), a2m, r52);
            return;
        }
        C163928Ww A002 = A00(a2m, this, r52);
        C62572rc r1 = r52.A02;
        boolean A0w = r52.A0w();
        if (r1 == null || ((!A0w && !a2m.A01() && r1.A0a == null) || A002 == null)) {
            AnonymousClass8BX.A1G(r52, "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type=", AnonymousClass000.A10());
        } else {
            a2m.A00.A0S(A002);
        }
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        String str;
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & 256) == 0) {
            return null;
        }
        C166248ca r0 = r1.videoMessage_;
        C166248ca r5 = r0;
        if (r0 == null) {
            r0 = C166248ca.DEFAULT_INSTANCE;
        }
        if (!r0.gifPlayback_) {
            return null;
        }
        if (r5 == null) {
            r5 = C166248ca.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r3 = a6d.A0A;
        AnonymousClass21X r6 = new AnonymousClass21X(r3, 13, a6d.A03);
        boolean A0V = C22971Dz.A0V(r3.A00);
        this.A01.A03(r5, r6, a6d.A00, a6d.A05(), a6d.A0L);
        int i = a6d.A00;
        boolean z = a6d.A0K;
        if (i != 1 || z) {
            C62572rc r12 = r6.A02;
            C17960vV.A07(r12);
            if ((r5.bitField0_ & 32) != 0) {
                r12.A05 = C20133A8t.A04(r5);
            }
        }
        C62572rc r2 = r6.A02;
        if (r2 == null) {
            return null;
        }
        if (A0V || (r5.bitField0_ & 32) != 0) {
            r2.A05 = C20133A8t.A04(r5);
        }
        String str2 = r6.A03;
        if (str2 != null) {
            str = AnonymousClass1EG.A0C(str2, 255);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            r2.A0H = str;
        }
        return r6;
    }

    public AT6(ASL asl, A79 a79, C19969A1e a1e) {
        this.A02 = asl;
        this.A00 = a79;
        this.A01 = a1e;
    }
}
