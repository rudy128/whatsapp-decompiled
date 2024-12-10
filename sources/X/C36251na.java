package X;

import android.os.Build;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.reportinfra.repo.SpamReportRepo;
import com.whatsapp.reportinfra.xmpp.SpamReportXmppClient;
import com.whatsapp.suggestions.SuggestionsEngine;
import com.whatsapp.suggestions.networking.SuggestedContactsFetcher;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1na  reason: invalid class name and case insensitive filesystem */
public final class C36251na implements AnonymousClass00S {
    public final AnonymousClass1K1 A00;
    public final C36241nZ A01;
    public final AnonymousClass10E A02;
    public final int A03;
    public final C24331Jt A04;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2qm, java.lang.Object] */
    public static C62092qm A03() {
        return new Object();
    }

    public static final C1600686z A05() {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        return (C1600686z) obj;
    }

    private Object A06() {
        int i = this.A03;
        switch (i) {
            case 0:
                C36241nZ r0 = this.A01;
                C62092qm A032 = A03();
                r0.A2b(A032);
                return A032;
            case 1:
                AnonymousClass10E r2 = this.A02;
                return new C57332iu((C18030ve) r2.A04.get(), (C218217n) r2.AeP.get());
            case 2:
                return new C49882Sh();
            case 3:
                return new AnonymousClass9VJ(this);
            case 4:
                return new AnonymousClass9VO(this);
            case 5:
                return new C185489cf(C000200d.A00(this.A02.A1x));
            case 6:
                return new AnonymousClass9VP(this);
            case 7:
                AnonymousClass10E r3 = this.A02;
                return new A6E(AnonymousClass0YX.A00(r3.Ao9), (AnonymousClass11S) r3.A63.get(), (C18000vb) r3.ABz.get());
            case 8:
                return new C56512ha(this);
            case 9:
                return new AnonymousClass9VS(this);
            case 10:
                return new AnonymousClass2YI(this);
            case 11:
                return new AnonymousClass2YK(this);
            case 12:
                return new C124976aI(this);
            case 13:
                return new AnonymousClass2YO(this);
            case 14:
                return new AnonymousClass6a1(this);
            case 15:
                return new AnonymousClass9VG(this);
            case 16:
                return new C182979Wl((C18030ve) this.A02.A04.get());
            case 17:
                return new AnonymousClass9VH(this);
            case 18:
                return new AnonymousClass9VI(this);
            case 19:
                AnonymousClass10E r22 = this.A02;
                return new C139776zQ(C000200d.A00(r22.A9B), C000200d.A00(r22.A0K));
            case 20:
                return new C131346kw(this);
            case 21:
                return new AnonymousClass2Y9(this);
            case 22:
                return new AnonymousClass2YA(this);
            case 23:
                return new AnonymousClass2YB(this);
            case 24:
                return new AnonymousClass2YC(this);
            case 25:
                return new AnonymousClass2YD(this);
            case 26:
                AnonymousClass10E r23 = this.A02;
                return new C190129kQ((C40751vD) r23.AB7.get(), C000200d.A00(r23.A2n));
            case 27:
                return new AnonymousClass2YE(this);
            case 28:
                return new AnonymousClass9VK(this);
            case 29:
                return new AnonymousClass9VL(this);
            case 30:
                return new C84564Jz(this);
            case 31:
                return new C56492hY(this);
            case 32:
                return new C56502hZ(this);
            case 33:
                return new AnonymousClass9VM(this);
            case 34:
                return new APO(this, 0);
            case 35:
                return new AnonymousClass9VN(this);
            case 36:
                return new AnonymousClass4K0(this);
            case 37:
                return new AnonymousClass3WH((AnonymousClass4K1) this.A01.A1v.get());
            case 38:
                return new AnonymousClass4K1(this);
            case 39:
                AnonymousClass10E r32 = this.A02;
                C36241nZ r33 = this.A01;
                return new C41261w4((C41141vs) r33.A1w.get(), (C41151vt) r33.A1x.get(), (C41161vu) r33.A1y.get(), (C41171vv) r33.A1z.get(), (C41181vw) r33.A20.get(), (C41191vx) r33.A21.get(), (C41201vy) r33.A22.get(), (C41211vz) r33.A23.get(), (C41221w0) r33.A24.get(), (C41231w1) r33.A25.get(), (C41241w2) r33.A26.get(), (AnonymousClass11S) r32.A63.get(), (C18030ve) r32.A04.get());
            case 40:
                return new C41141vs(this);
            case 41:
                return new C41151vt(this);
            case 42:
                return new C41161vu(this);
            case 43:
                return new C41171vv(this);
            case 44:
                return new C41181vw(this);
            case 45:
                return new C41191vx(this);
            case 46:
                return new C41201vy(this);
            case 47:
                return new C41211vz(this);
            case 48:
                return new C41221w0(this);
            case 49:
                return new C41231w1(this);
            case 50:
                return new C41241w2(this);
            case 51:
                return new AnonymousClass4K2(this);
            case 52:
                AnonymousClass10E r4 = this.A02;
                return new C61562pt((AnonymousClass11S) r4.A63.get(), (C18030ve) r4.A04.get(), (AnonymousClass18K) r4.A9B.get(), (AnonymousClass10I) r4.AC1.get());
            case 53:
                return new AnonymousClass9VQ(this);
            case 54:
                return new AnonymousClass9VR(this);
            case 55:
                return new AnonymousClass4K3(this);
            case 56:
                return new C40241uO(this);
            case 57:
                return new C40251uP(this);
            case 58:
                return new AnonymousClass4K4(this);
            case 59:
                return new AnonymousClass3V5(C000200d.A00(this.A02.A2L));
            case 60:
                return new AnonymousClass4K5(this);
            case 61:
                return new C56522hb(this);
            case 62:
                AnonymousClass10E r24 = this.A02;
                AnonymousClass1M9 r5 = (AnonymousClass1M9) r24.A2f.get();
                AnonymousClass00H A002 = C000200d.A00(r24.A0x);
                C36241nZ r1 = this.A01;
                return new C138546xG(r5, (C18030ve) r24.A04.get(), (SuggestionsEngine) r1.A1e.get(), A002, C000200d.A00(r24.A00.A3r), C000200d.A00(r1.A2K));
            case 63:
                AnonymousClass10E r25 = this.A02;
                AnonymousClass1M9 r52 = (AnonymousClass1M9) r25.A2f.get();
                AnonymousClass00H A003 = C000200d.A00(r25.AFO);
                AnonymousClass00H A004 = C000200d.A00(r25.A25);
                AnonymousClass00H A005 = C000200d.A00(r25.A0x);
                AnonymousClass00H A006 = C000200d.A00(r25.AUB);
                C36241nZ r02 = this.A01;
                return new SuggestionsEngine(r52, (C18030ve) r25.A04.get(), r02.A0o(), A003, A004, A005, A006, C000200d.A00(r02.A2J), C000200d.A00(r25.Ag3));
            case 64:
                AnonymousClass10E r26 = this.A02;
                return new SuggestedContactsFetcher((C18030ve) r26.A04.get(), C000200d.A00(r26.ABh));
            case 65:
                return new AnonymousClass713((C18010vc) this.A02.A9s.get());
            case 66:
                AnonymousClass10E r12 = this.A02;
                C18600wl r9 = (C18600wl) r12.A9E.get();
                C18030ve r8 = (C18030ve) r12.A04.get();
                AnonymousClass1M9 r53 = (AnonymousClass1M9) r12.A2f.get();
                C24751Ln r7 = (C24751Ln) r12.ABe.get();
                return new C130756jx(r53, (C678831f) r12.A00.A10.get(), r7, r8, r9, (AnonymousClass1OX) r12.A9C.get());
            case C166418cr.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                return new AnonymousClass6a2(this);
            case C166388co.MESSAGE_ADD_ONS_FIELD_NUMBER /*68*/:
                return new AnonymousClass6a3(this);
            case 69:
                AnonymousClass10E r27 = this.A02;
                return new C37611pq((C18030ve) r27.A04.get(), (AnonymousClass18K) r27.A9B.get());
            case 70:
                return new AnonymousClass6a4(this);
            case 71:
                return new AnonymousClass4K6(this);
            case 72:
                return new AnonymousClass4K7(this);
            case 73:
                return new AnonymousClass2YF(this);
            case C166418cr.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                AnonymousClass10E r42 = this.A02;
                return new C85544Nu((C18030ve) r42.A04.get(), (AnonymousClass12L) r42.A90.get(), (AnonymousClass1MB) r42.AAb.get(), (C36401np) r42.A00.A30.get());
            case C166418cr.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                AnonymousClass10E r28 = this.A02;
                return new C37741q3(C000200d.A00(r28.A5n), C000200d.A00(r28.A5d));
            case C166418cr.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                AnonymousClass10E r13 = this.A02;
                AnonymousClass1CJ r54 = (AnonymousClass1CJ) r13.A2H.get();
                AnonymousClass00H A007 = C000200d.A00(r13.A2x);
                AnonymousClass00H A008 = C000200d.A00(r13.A4J);
                AnonymousClass00H A009 = C000200d.A00(r13.AA1);
                C25181Nf r6 = (C25181Nf) r13.A2o.get();
                AnonymousClass00H A0010 = C000200d.A00(r13.A5n);
                return new C58112kA(r54, r6, (AnonymousClass1NH) r13.A5b.get(), (C18030ve) r13.A04.get(), A007, A008, A009, A0010, (C18600wl) r13.A9E.get());
            case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                return new C36881oc(this);
            case C166418cr.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return new C36891od(this);
            case 79:
                return new C36901oe(this);
            case C166418cr.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                return new C36911of(this);
            case 81:
                return new C36951oj(this);
            case C166418cr.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                return new C36961ok(this);
            case C166418cr.ALBUM_MESSAGE_FIELD_NUMBER /*83*/:
                return new C36991on(this);
            case 84:
                return new C38711rl((C38501rO) this.A02.A5n.get(), C000200d.A00(this.A00.A4n));
            case C166418cr.EVENT_COVER_IMAGE_FIELD_NUMBER /*85*/:
                return new C86364Ri((AnonymousClass73F) this.A02.A2Z.get());
            case C166418cr.STICKER_PACK_MESSAGE_FIELD_NUMBER /*86*/:
                return new AnonymousClass4K8(this);
            case C166418cr.STATUS_MENTION_MESSAGE_FIELD_NUMBER /*87*/:
                return new AnonymousClass4K9(this);
            case C166418cr.POLL_RESULT_SNAPSHOT_MESSAGE_FIELD_NUMBER /*88*/:
                AnonymousClass10E r29 = this.A02;
                return new C135516sK(C000500i.A00(r29.Ao9), (C18030ve) r29.A04.get());
            case 89:
                return new AnonymousClass6a5(this);
            case 90:
                return new AnonymousClass6ZI((C18030ve) this.A02.A04.get());
            case C166418cr.ASSOCIATED_CHILD_MESSAGE_FIELD_NUMBER /*91*/:
                AnonymousClass10E r210 = this.A02;
                AnonymousClass00H A0011 = C000200d.A00(r210.ABd);
                AnonymousClass1T6 r92 = (AnonymousClass1T6) r210.A6B.get();
                C18030ve r72 = (C18030ve) r210.A04.get();
                C127276e5 A0X = this.A01.A0W();
                return new C139346yg((AnonymousClass11E) r210.A2X.get(), (C219217x) r210.ABj.get(), r72, A0X, r92, (C25291Nq) r210.A6E.get(), A0011, (C18600wl) r210.A9E.get(), (C18600wl) r210.A9F.get());
            case C166418cr.GROUP_STATUS_MENTION_MESSAGE_FIELD_NUMBER /*92*/:
                return new C86504Rw((C219217x) this.A02.ABj.get());
            case C166418cr.POLL_CREATION_MESSAGE_V4_FIELD_NUMBER /*93*/:
                return A04();
            case C166418cr.POLL_CREATION_MESSAGE_V5_FIELD_NUMBER /*94*/:
                C36241nZ r34 = this.A01;
                return C201110w.of(1, r34.A0j(), 0, r34.A0l());
            case 95:
                AnonymousClass10E r35 = this.A02;
                AnonymousClass10G A11 = r35.A00;
                C1193267r r62 = (C1193267r) r35.A9P.get();
                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) A11.A1c.get();
                return new C117275zV((C19830z4) r35.ABl.get(), r62, emojiSearchProvider, (C131196kh) this.A00.A6E.get(), (AnonymousClass1L4) A11.A2e.get());
            case 96:
                return new AnonymousClass2YG(this);
            case 97:
                return new AnonymousClass9VT(this);
            case 98:
                return new AnonymousClass2YH(this);
            case 99:
                return new AnonymousClass9VU(this);
            default:
                throw new AssertionError(i);
        }
    }

    private Object A07() {
        int i = this.A03;
        switch (i) {
            case 100:
                return new AnonymousClass2YJ(this);
            case 101:
                return new AnonymousClass4KA(this);
            case 102:
                return new AnonymousClass4KB(this);
            case 103:
                return new AnonymousClass6a6(this);
            case 104:
                AnonymousClass10E r1 = this.A02;
                return new C130376jK((C18000vb) r1.ABz.get(), (AnonymousClass1KW) r1.A3d.get(), (C1193367s) r1.Afz.get(), (C26631Sw) r1.AAO.get(), C000200d.A00(r1.A00.AG3), (C18600wl) r1.A9F.get(), C27011Uj.A00());
            case 105:
                AnonymousClass2EB A0V = this.A01.A0U();
                A08(A0V);
                return A0V;
            case 106:
                AnonymousClass10E r4 = this.A02;
                return new AnonymousClass73N(C000200d.A00(r4.AC1), C000200d.A00(r4.ABk), C000200d.A00(r4.A4b), C000200d.A00(r4.A2X));
            case 107:
                AnonymousClass10E r2 = this.A02;
                return new A4R((C18030ve) r2.A04.get(), (C136286tZ) r2.AJ3.get());
            case AnonymousClass74N.A03 /*108*/:
                return new C86314Rd(this.A01.A00());
            case 109:
                AnonymousClass10E r3 = this.A02;
                return new C129726iG((C18030ve) r3.A04.get(), (C33241iV) r3.A7r.get(), (AnonymousClass10I) r3.AC1.get());
            case 110:
                return new AnonymousClass6a7(this);
            case 111:
                return new C124876a8(this);
            case 112:
                return new C124886a9(this);
            case 113:
                return new C124896aA(this);
            case 114:
                return new C124906aB(this);
            case 115:
                return new AnonymousClass4KC(this);
            case 116:
                return new C124916aC(this);
            case 117:
                return new C124926aD(this);
            case 118:
                return new C189349iw((C57622jN) this.A02.A00.AGP.get());
            case 119:
                return new C124936aE(this);
            case 120:
                return new AnonymousClass4KD(this);
            case 121:
                return new AnonymousClass2YL(this);
            case 122:
                return new AnonymousClass4KE(this);
            case 123:
                return new C124946aF(this);
            case 124:
                return new C124956aG(this);
            case 125:
                return new C124966aH(this);
            case 126:
                return new C124986aJ(this);
            case StringTreeSet.OFFSET_BASE_ENCODING /*127*/:
                return new C56642hn((AnonymousClass1UD) this.A02.A14.get());
            case 128:
                return new C124996aK(this);
            case 129:
                return new C125006aL(this);
            case 130:
                AnonymousClass10E r42 = this.A02;
                AnonymousClass1KB r22 = (AnonymousClass1KB) r42.A4b.get();
                return new C86174Qo((AnonymousClass1L9) r42.A0E.get(), r22, (AnonymousClass11C) r42.AAp.get(), (C18030ve) r42.A04.get());
            case 131:
                return new AnonymousClass9VV(this);
            case 132:
                AnonymousClass10E r12 = this.A02;
                AnonymousClass1CJ r8 = (AnonymousClass1CJ) r12.A2H.get();
                AnonymousClass00H A002 = C000200d.A00(r12.A2A);
                AnonymousClass1M9 r6 = (AnonymousClass1M9) r12.A2f.get();
                C26031Qo r7 = (C26031Qo) r12.A32.get();
                AnonymousClass1R3 r9 = (AnonymousClass1R3) r12.A5f.get();
                return new SpamReportRepo((C26811To) r12.AAf.get(), r6, r7, r8, r9, (C18030ve) r12.A04.get(), (C26061Qr) r12.A6l.get(), (AnonymousClass1Nb) r12.A2E.get(), A002, C000200d.A00(r12.AFS), C000200d.A00(this.A01.A2I), C000200d.A00(r12.A0s), C000200d.A00(r12.AbZ), C000200d.A00(r12.A3z), (C18600wl) r12.A9E.get());
            case 133:
                AnonymousClass10E r13 = this.A02;
                return new SpamReportXmppClient((C18030ve) r13.A04.get(), C000200d.A00(r13.A6N), C000200d.A00(r13.Ajj), C000200d.A00(r13.AV3), C000200d.A00(r13.AW9), C000200d.A00(r13.AbE), C000200d.A00(r13.AGk));
            case 134:
                return new AnonymousClass4KF(this);
            case 135:
                return new C125016aM(this);
            case 136:
                AnonymousClass10E r14 = this.A02;
                return new C1406472j((C24641Lc) r14.AAB.get(), C000200d.A00(r14.A7L), C000200d.A00(r14.A5h), C000200d.A00(r14.A04), C000200d.A00(r14.AAL), C000200d.A00(r14.A4b));
            case 137:
                return new AnonymousClass2YM(this);
            case 138:
                return new AnonymousClass2YN(this);
            case 139:
                AnonymousClass10E r15 = this.A02;
                C18030ve r62 = (C18030ve) r15.A04.get();
                return new C127796ew((C19830z4) r15.ABl.get(), r62, (C30071dL) r15.Alu.get(), (C56972iK) r15.AAD.get(), C000200d.A00(r15.A4L));
            case 140:
                return new C125026aN(this);
            case 141:
                return new C125036aO(this);
            case 142:
                AnonymousClass10E r32 = this.A02;
                AnonymousClass10G A11 = r32.A00;
                C1193267r r63 = (C1193267r) r32.A9P.get();
                EmojiSearchProvider emojiSearchProvider = (EmojiSearchProvider) A11.A1c.get();
                return new AnonymousClass2EA((C19830z4) r32.ABl.get(), r63, emojiSearchProvider, (C131196kh) this.A00.A6E.get(), (C18030ve) r32.A04.get(), (AnonymousClass1L4) A11.A2e.get());
            case 143:
                return new C124856Zy(this);
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return new C124866Zz(this);
            case 145:
                return new C131336kv(this);
            case 146:
                return new AnonymousClass6a0(this);
            default:
                throw new AssertionError(i);
        }
    }

    public Object get() {
        int i = this.A03;
        int i2 = i / 100;
        if (i2 == 0) {
            return A06();
        }
        if (i2 == 1) {
            return A07();
        }
        throw new AssertionError(i);
    }

    public C36251na(AnonymousClass1K1 r1, C24331Jt r2, C36241nZ r3, AnonymousClass10E r4, int i) {
        this.A02 = r4;
        this.A04 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = i;
    }

    public static C1600686z A04() {
        C1600686z A05 = A05();
        AnonymousClass00W.A02(A05);
        return A05;
    }

    public static void A08(AnonymousClass2EB r0) {
        AnonymousClass00W.A02(r0);
    }
}
