package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.ASm  reason: case insensitive filesystem */
public final class C20628ASm implements B83, B85, C436820m {
    public final AnonymousClass00H A00;
    public final A79 A01;

    public C20628ASm(A79 a79, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 2);
        this.A01 = a79;
        this.A00 = r3;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        boolean A15 = C18070vi.A15(r8, a2m);
        if (r8 instanceof AnonymousClass22Q) {
            AnonymousClass22Q r4 = (AnonymousClass22Q) r8;
            C192099nn r1 = (C192099nn) this.A00.get();
            AnonymousClass8X8 r2 = a2m.A00;
            C165688bb r0 = ((C166418cr) r2.A00).productMessage_;
            if (r0 == null) {
                r0 = C165688bb.DEFAULT_INSTANCE;
            }
            C162968Te A002 = r1.A00(a2m, (C162968Te) r0.A0O(), r4);
            if (A002 != null) {
                String str = r4.A02;
                if (!(str == null || str.length() == 0)) {
                    C165688bb r12 = (C165688bb) C17880vN.A0G(A002);
                    int i = C165688bb.BODY_FIELD_NUMBER;
                    r12.bitField0_ |= 8;
                    r12.body_ = str;
                }
                String str2 = r4.A05;
                if (!(str2 == null || str2.length() == 0)) {
                    C165688bb r13 = (C165688bb) C17880vN.A0G(A002);
                    int i2 = C165688bb.BODY_FIELD_NUMBER;
                    r13.bitField0_ |= 16;
                    r13.footer_ = str2;
                }
                if (C19998A2m.A00(a2m, r8)) {
                    C166278cd A012 = A79.A01(A002, this.A01, a2m, r8);
                    C165688bb r14 = (C165688bb) A002.A00;
                    int i3 = C165688bb.BODY_FIELD_NUMBER;
                    A012.getClass();
                    r14.contextInfo_ = A012;
                    r14.bitField0_ |= 32;
                }
                C166418cr A0M = AnonymousClass8BS.A0M(r2);
                C165688bb r02 = (C165688bb) A002.A0C();
                r02.getClass();
                A0M.productMessage_ = r02;
                A0M.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            AnonymousClass8BT.A1H(r8, "FMessageProduct/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=", A10);
            AnonymousClass206.A07(r8, "; media_wa_type=", A10);
            A10.append("; business_owner_jid=");
            AnonymousClass8BW.A1N(r4.A01, A10);
            if (r4.A01 == null && a2m.A04) {
                throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
            }
            return;
        }
        throw AnonymousClass000.A0k("FMessageProductProtobuf/not supported message");
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C166418cr A012 = C20077A6d.A01(a6d);
        if ((A012.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) == 0) {
            return null;
        }
        C165688bb r0 = A012.productMessage_;
        C165688bb r3 = r0;
        if (r0 == null) {
            r0 = C165688bb.DEFAULT_INSTANCE;
        }
        if ((r0.bitField0_ & 1) == 0) {
            return null;
        }
        if (r3 == null) {
            r3 = C165688bb.DEFAULT_INSTANCE;
        }
        C17960vV.A07(r3);
        AnonymousClass22Q r4 = new AnonymousClass22Q(a6d.A0A, a6d.A03);
        C18070vi.A0b(r3);
        ((C192099nn) this.A00.get()).A01(r3, r4, a6d.A00, a6d.A05(), a6d.A0L);
        r4.A02 = r3.body_;
        r4.A05 = r3.footer_;
        return r4;
    }
}
