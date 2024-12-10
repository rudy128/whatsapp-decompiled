package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.ASu  reason: case insensitive filesystem */
public final class C20636ASu implements B83, B85, C436820m {
    public final C193209pi A00;
    public final C18030ve A01;

    public C20636ASu(C18030ve r2, C193209pi r3) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
        this.A00 = r3;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r11) {
        boolean A16 = C18070vi.A16(r11, a2m);
        if (r11 instanceof AnonymousClass22W) {
            boolean A05 = C18020vd.A05(C18040vf.A02, this.A01, 8784);
            AnonymousClass8X8 r4 = a2m.A00;
            C163988Xc r0 = ((C166418cr) r4.A00).viewOnceMessage_;
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            AnonymousClass8X6 r5 = (AnonymousClass8X6) r0.A0O();
            AnonymousClass8X8 A002 = AnonymousClass8X6.A00(r5);
            C193209pi r1 = this.A00;
            C438321c r112 = (C438321c) r11;
            C166268cc r02 = ((C166418cr) A002.A00).imageMessage_;
            if (r02 == null) {
                r02 = C166268cc.DEFAULT_INSTANCE;
            }
            C163748We A012 = r1.A01(a2m, (C163748We) r02.A0O(), r112);
            C166268cc r03 = ((C166418cr) r4.A00).imageMessage_;
            if (r03 == null) {
                r03 = C166268cc.DEFAULT_INSTANCE;
            }
            C163748We A013 = r1.A01(a2m, (C163748We) r03.A0O(), r112);
            if (A05) {
                A012 = A013;
            }
            if (A012 != null) {
                C166268cc A0G = AnonymousClass8BS.A0G(A012);
                A0G.bitField0_ |= 524288;
                A0G.viewOnce_ = A16;
                C166268cc r04 = (C166268cc) A012.A0C();
                if (A05) {
                    C166418cr A04 = AnonymousClass8X8.A04(r4, r04);
                    A04.imageMessage_ = r04;
                    A04.bitField0_ |= 4;
                    return;
                }
                C166418cr A042 = AnonymousClass8X8.A04(A002, r04);
                A042.imageMessage_ = r04;
                A042.bitField0_ |= 4;
                C163988Xc A014 = AnonymousClass8X6.A01(A002, r5);
                C166418cr A0J = AnonymousClass8BV.A0J(r4, A014);
                A0J.viewOnceMessageV2_ = A014;
                A0J.bitField1_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                return;
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass206.A07(r11, "FMessageViewOnceImageProtobuf not support: ", A10);
        throw AnonymousClass000.A0j(A10);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [X.21c, X.21V, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField0_ & 4) == 0) {
            return null;
        }
        C166268cc r2 = A012.imageMessage_;
        C166268cc r5 = r2;
        if (r2 == null) {
            r2 = C166268cc.DEFAULT_INSTANCE;
        }
        if ((r2.bitField0_ & 524288) == 0 || !r2.viewOnce_) {
            return null;
        }
        if (r5 == null && (r5 = C166268cc.DEFAULT_INSTANCE) == null) {
            throw C17880vN.A0g();
        }
        AnonymousClass205 r4 = a6d.A0A;
        long j = a6d.A03;
        C18070vi.A0d(r4, 1);
        ? r6 = new AnonymousClass21V(r4, 42, j);
        this.A00.A02(r5, r6, a6d.A00, a6d.A05(), a6d.A0L);
        return r6;
    }
}
