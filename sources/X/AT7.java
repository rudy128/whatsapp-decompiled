package X;

import android.text.TextUtils;

public class AT7 implements B83, B85, C436820m {
    public final A79 A00;
    public final C192299o8 A01;
    public final ASL A02;
    public final C18030ve A03;

    public static C162748Si A00(C19998A2m a2m, AT7 at7, C438921i r6) {
        C192299o8 r1 = at7.A01;
        C19998A2m a2m2 = a2m;
        C166208cW r0 = ((C166418cr) a2m.A00.A00).documentMessage_;
        if (r0 == null) {
            r0 = C166208cW.DEFAULT_INSTANCE;
        }
        C162748Si r4 = (C162748Si) r0.A0O();
        r1.A00(r6.A02, a2m2, r4, r6.A0O(), r6);
        return r4;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        AnonymousClass8BX.A1H(r8, "FMessageDocumentProtobuf: message type is not supported ", AnonymousClass000.A10(), r8 instanceof C438921i);
        C438921i r82 = (C438921i) r8;
        if (AnonymousClass8BV.A1R(r82)) {
            this.A02.A00(new C20612ARw(this, 1), a2m, r82);
            return;
        }
        C62572rc r1 = r82.A02;
        if (r1 == null || (!a2m.A01() && r1.A0a == null)) {
            AnonymousClass8BY.A10(r82, "FMessageDocument/unable to send encrypted media message due to missing mediaKey; message.key=", AnonymousClass000.A10());
            return;
        }
        C162748Si A002 = A00(a2m, this, r82);
        if (C20097A7a.A05(r82)) {
            AnonymousClass8X8 r3 = a2m.A00;
            C165858bs r0 = ((C166418cr) r3.A00).buttonsMessage_;
            if (r0 == null) {
                r0 = C165858bs.DEFAULT_INSTANCE;
            }
            C163728Wc r2 = (C163728Wc) r0.A0O();
            C20097A7a.A00(A002, r2, r82).headerCase_ = 2;
            r2.A0G(AnonymousClass9KT.DOCUMENT);
            r3.A0I((C165858bs) r2.A0C());
            return;
        }
        if (!TextUtils.isEmpty(r82.A01)) {
            if (!C18020vd.A05(C18040vf.A02, this.A03, 8784)) {
                AnonymousClass8X8 r4 = a2m.A00;
                C163988Xc r02 = ((C166418cr) r4.A00).documentWithCaptionMessage_;
                if (r02 == null) {
                    r02 = C163988Xc.DEFAULT_INSTANCE;
                }
                AnonymousClass8X6 r32 = (AnonymousClass8X6) r02.A0O();
                C23624Bmt A0O = r32.A0G().A0O();
                C166208cW r03 = (C166208cW) A002.A0C();
                C166418cr A0J = AnonymousClass8BV.A0J(A0O, r03);
                A0J.documentMessage_ = r03;
                A0J.bitField0_ |= 64;
                C163988Xc A012 = AnonymousClass8X6.A01(A0O, r32);
                C166418cr A0J2 = AnonymousClass8BV.A0J(r4, A012);
                A0J2.documentWithCaptionMessage_ = A012;
                A0J2.bitField1_ |= 512;
                return;
            }
        }
        a2m.A00.A0J(A002);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.21i, X.21V, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr r1 = a6d.A08;
        if ((r1.bitField0_ & 64) != 0) {
            if ("medianotify".equals(a6d.A0H)) {
                return null;
            }
        } else if ((r1.bitField1_ & 512) == 0) {
            return null;
        } else {
            C163988Xc r0 = r1.documentWithCaptionMessage_;
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            C166418cr r02 = r0.message_;
            if (r02 == null) {
                r02 = C166418cr.DEFAULT_INSTANCE;
            }
            a6d = a6d.A03(r02);
        }
        C166208cW r4 = a6d.A08.documentMessage_;
        if (r4 == null) {
            r4 = C166208cW.DEFAULT_INSTANCE;
        }
        ? r5 = new AnonymousClass21V(a6d.A0A, 9, a6d.A03);
        this.A01.A01(r4, r5, a6d.A00, a6d.A05(), a6d.A0L);
        return r5;
    }

    public AT7(ASL asl, C18030ve r2, A79 a79, C192299o8 r4) {
        this.A03 = r2;
        this.A02 = asl;
        this.A00 = a79;
        this.A01 = r4;
    }
}
