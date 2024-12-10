package X;

/* renamed from: X.ASr  reason: case insensitive filesystem */
public final class C20633ASr implements B83, B85, C436820m {
    public final AnonymousClass11S A00;
    public final A79 A01;

    public C20633ASr(AnonymousClass11S r2, A79 a79) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = a79;
    }

    public AnonymousClass206 CBG(C20077A6d a6d) {
        C18070vi.A0d(a6d, 0);
        C166418cr r2 = a6d.A08;
        if ((r2.bitField1_ & Integer.MIN_VALUE) == 0) {
            return null;
        }
        C165668bZ r5 = r2.newsletterAdminInviteMessage_;
        if (r5 == null) {
            r5 = C165668bZ.DEFAULT_INSTANCE;
        }
        AnonymousClass24N r4 = new AnonymousClass24N(a6d.A0A, a6d.A03);
        C29681ch A012 = C29681ch.A03.A01(r5.newsletterJid_);
        if (A012 != null) {
            r4.A01 = A012;
            r4.A03 = r5.newsletterName_;
            r4.A00 = r5.inviteExpiration_ * 1000;
            r4.A02 = r5.caption_;
            byte[] A06 = r5.jpegThumbnail_.A06();
            C18070vi.A0b(A06);
            if (A06.length != 0) {
                r4.A0Y(1);
                if (r4.A0O() != null) {
                    r4.A15(A06, a6d.A0L);
                }
            }
            return r4;
        }
        throw AnonymousClass8BR.A0p("FMessageNewsletterAdminInviteProtobuf/unexpected empty newsletterJid", 0);
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r12) {
        boolean A15 = C18070vi.A15(r12, a2m);
        Class<AnonymousClass24N> cls = AnonymousClass24N.class;
        if (!(r12 instanceof AnonymousClass24N)) {
            String A0U = C17890vO.A0U(r12);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r12, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass24N r5 = (AnonymousClass24N) r12;
        C29681ch r7 = r5.A01;
        if (r7 != null) {
            long j = r5.A00;
            String str2 = r5.A03;
            String str3 = r5.A02;
            AnonymousClass8X8 r2 = a2m.A00;
            C165668bZ r3 = ((C166418cr) r2.A00).newsletterAdminInviteMessage_;
            if (r3 == null) {
                r3 = C165668bZ.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r3.A0O();
            long A04 = C17880vN.A04(j);
            C165668bZ r9 = (C165668bZ) C17880vN.A0G(A0O);
            int i = C165668bZ.CAPTION_FIELD_NUMBER;
            r9.bitField0_ |= 16;
            r9.inviteExpiration_ = A04;
            if (str2 != null) {
                C165668bZ r1 = (C165668bZ) C17880vN.A0G(A0O);
                r1.bitField0_ |= 2;
                r1.newsletterName_ = str2;
            }
            String A0d = AnonymousClass8BS.A0d(A0O, r7);
            C165668bZ r13 = (C165668bZ) A0O.A00;
            A0d.getClass();
            r13.bitField0_ |= 1;
            r13.newsletterJid_ = A0d;
            if (!(str3 == null || str3.length() == 0)) {
                C165668bZ r14 = (C165668bZ) C17880vN.A0G(A0O);
                r14.bitField0_ |= 8;
                r14.caption_ = str3;
            }
            C693336u A0O2 = r5.A0O();
            if (!(A0O2 == null || A0O2.A01() == null)) {
                C23581BmB A03 = C17900vP.A03(A0O, A0O2.A01());
                C165668bZ r15 = (C165668bZ) A0O.A00;
                r15.bitField0_ |= 4;
                r15.jpegThumbnail_ = A03;
            }
            if (C19998A2m.A00(a2m, r12)) {
                C166278cd A012 = A79.A01(A0O, this.A01, a2m, r12);
                C165668bZ r16 = (C165668bZ) A0O.A00;
                A012.getClass();
                r16.contextInfo_ = A012;
                r16.bitField0_ |= 32;
            }
            C166418cr A0M = AnonymousClass8BS.A0M(r2);
            C165668bZ r0 = (C165668bZ) A0O.A0C();
            r0.getClass();
            A0M.newsletterAdminInviteMessage_ = r0;
            A0M.bitField1_ |= Integer.MIN_VALUE;
            return;
        }
        throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
    }
}
