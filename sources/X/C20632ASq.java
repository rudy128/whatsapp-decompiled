package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.ASq  reason: case insensitive filesystem */
public final class C20632ASq implements B83, B85, C436820m {
    public final AnonymousClass11S A00;
    public final A79 A01;

    public C20632ASq(AnonymousClass11S r2, A79 a79) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = a79;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r10) {
        long j;
        byte[] A012;
        C18070vi.A0h(r10, a2m);
        Class<AnonymousClass23S> cls = AnonymousClass23S.class;
        if (!(r10 instanceof AnonymousClass23S)) {
            String A0U = C17890vO.A0U(r10);
            String name = cls.getName();
            String str = "".toString();
            throw AnonymousClass206.A02(r10, name, A0U, C17890vO.A0W(str), str);
        }
        AnonymousClass8X8 r4 = a2m.A00;
        C165878bu r0 = ((C166418cr) r4.A00).groupInviteMessage_;
        if (r0 == null) {
            r0 = C165878bu.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r0.A0O();
        AnonymousClass23S r5 = (AnonymousClass23S) r10;
        if (r5.A02 != null) {
            Log.w("FMessageGroupInvite/buildE2eMessage failed to build e2e message");
        }
        String str2 = r5.A06;
        String str3 = null;
        if (str2 != null) {
            C165878bu r1 = (C165878bu) C17880vN.A0G(A0O);
            int i = C165878bu.CAPTION_FIELD_NUMBER;
            r1.bitField0_ |= 2;
            r1.inviteCode_ = str2;
        } else {
            Log.e("FMessageGroupInvite/buildE2eMessage missing invite hash");
        }
        if (!a2m.A01() || !r5.A07) {
            j = r5.A01;
        } else {
            j = 0;
        }
        C165878bu r7 = (C165878bu) C17880vN.A0G(A0O);
        int i2 = C165878bu.CAPTION_FIELD_NUMBER;
        r7.bitField0_ |= 4;
        r7.inviteExpiration_ = j;
        String str4 = r5.A05;
        if (str4 != null) {
            C165878bu r12 = (C165878bu) C17880vN.A0G(A0O);
            r12.bitField0_ |= 8;
            r12.groupName_ = str4;
        }
        AnonymousClass1EC r02 = r5.A02;
        if (r02 != null) {
            str3 = r02.getRawString();
        }
        C165878bu r13 = (C165878bu) C17880vN.A0G(A0O);
        str3.getClass();
        r13.bitField0_ |= 1;
        r13.groupJid_ = str3;
        String str5 = r5.A04;
        if (str5 != null && str5.length() > 0) {
            C165878bu r14 = (C165878bu) C17880vN.A0G(A0O);
            r14.bitField0_ |= 32;
            r14.caption_ = str5;
        }
        C693336u A0O2 = r5.A0O();
        if (!(A0O2 == null || (A012 = A0O2.A01()) == null)) {
            C23581BmB A03 = C17900vP.A03(A0O, A012);
            C165878bu r15 = (C165878bu) A0O.A00;
            r15.bitField0_ |= 16;
            r15.jpegThumbnail_ = A03;
        }
        if (C19998A2m.A00(a2m, r10)) {
            C166278cd A013 = A79.A01(A0O, this.A01, a2m, r10);
            C165878bu r16 = (C165878bu) A0O.A00;
            A013.getClass();
            r16.contextInfo_ = A013;
            r16.bitField0_ |= 64;
        }
        C166418cr A0M = AnonymousClass8BS.A0M(r4);
        C165878bu r03 = (C165878bu) A0O.A0C();
        r03.getClass();
        A0M.groupInviteMessage_ = r03;
        A0M.bitField0_ |= 4194304;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.23S, X.206] */
    public AnonymousClass206 CBG(C20077A6d a6d) {
        UserJid A012;
        AnonymousClass9Jd r1;
        C166418cr A013 = C20077A6d.A01(a6d);
        if ((A013.bitField0_ & 4194304) == 0) {
            return null;
        }
        ? r3 = new AnonymousClass206(a6d.A0A, 24, a6d.A03);
        C165878bu r4 = A013.groupInviteMessage_;
        if (r4 == null) {
            r4 = C165878bu.DEFAULT_INSTANCE;
        }
        AnonymousClass205 r12 = r3.A0v;
        if (r12.A02) {
            A012 = AnonymousClass11S.A00(this.A00);
        } else {
            C22941Dw r0 = UserJid.Companion;
            A012 = C22941Dw.A01(r12.A00);
        }
        r3.A03 = A012;
        r3.A02 = AnonymousClass1EC.A01.A02(r4.groupJid_);
        r3.A05 = r4.groupName_;
        r3.A01 = r4.inviteExpiration_;
        r3.A06 = r4.inviteCode_;
        r3.A04 = r4.caption_;
        int i = r4.groupType_;
        if (i == 0 || i != 1) {
            r1 = AnonymousClass9Jd.DEFAULT;
        } else {
            r1 = AnonymousClass9Jd.PARENT;
        }
        r3.A00 = AnonymousClass000.A1Z(r1, AnonymousClass9Jd.PARENT) ? 1 : 0;
        byte[] A1P = AnonymousClass8BS.A1P(r4.jpegThumbnail_);
        if (A1P.length != 0) {
            r3.A0Y(1);
            r3.A15(A1P, a6d.A0L);
        }
        return r3;
    }
}
