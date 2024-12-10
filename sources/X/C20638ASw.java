package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.ASw  reason: case insensitive filesystem */
public final class C20638ASw implements B83, B85, C436820m {
    public final C19969A1e A00;
    public final C18030ve A01;

    public C20638ASw(C18030ve r2, C19969A1e a1e) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = a1e;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        boolean A16 = C18070vi.A16(r11, a2m);
        if (r11 instanceof C441122e) {
            boolean A05 = C18020vd.A05(C18040vf.A02, this.A01, 8784);
            AnonymousClass8X8 r6 = a2m.A00;
            C163988Xc r0 = ((C166418cr) r6.A00).viewOnceMessage_;
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            AnonymousClass8X6 r5 = (AnonymousClass8X6) r0.A0O();
            AnonymousClass8X8 A002 = AnonymousClass8X6.A00(r5);
            C163928Ww A03 = AnonymousClass8X8.A03(r6);
            C163928Ww A032 = AnonymousClass8X8.A03(A002);
            if (!A05) {
                A03 = A032;
            }
            this.A00.A02(a2m, A03, (AnonymousClass21W) r11);
            C166248ca A0L = AnonymousClass8BS.A0L(A03);
            A0L.bitField0_ |= A7Y.A0F;
            A0L.viewOnce_ = A16;
            C166248ca r02 = (C166248ca) A03.A0C();
            if (A05) {
                r6.A0T(r02);
                return;
            }
            A002.A0T(r02);
            C163988Xc A012 = AnonymousClass8X6.A01(A002, r5);
            C166418cr A0J = AnonymousClass8BV.A0J(r6, A012);
            A0J.viewOnceMessageV2_ = A012;
            A0J.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass206.A07(r11, "FMessageViewOnceVideoProtobuf not support message: ", A10);
        throw AnonymousClass000.A0j(A10);
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [X.22e, X.21W, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField0_ & 256) == 0) {
            return null;
        }
        C166248ca r2 = A012.videoMessage_;
        C166248ca r5 = r2;
        if (r2 == null) {
            r2 = C166248ca.DEFAULT_INSTANCE;
        }
        if (r2.gifPlayback_ || (r2.bitField0_ & A7Y.A0F) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r5 == null && (r5 = C166248ca.DEFAULT_INSTANCE) == null) {
            throw C17880vN.A0g();
        }
        ? r1 = new AnonymousClass21W(a6d.A0A, 43, a6d.A03);
        r1.A00 = 0;
        C20077A6d.A02(a6d, r5, r1, this.A00);
        return r1;
    }
}
