package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8fK  reason: invalid class name and case insensitive filesystem */
public final class C167058fK extends C20616ASa implements AnonymousClass3LE {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1MZ A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        C18070vi.A0d(r4, 1);
        C61402pc.A00(r4, "event_type", PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167058fK(AnonymousClass11S r1, AnonymousClass1CJ r2, AnonymousClass1MZ r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        super(r4);
        C18070vi.A0w(r4, r1, r2, r5, r6);
        C18070vi.A0l(r3, r7);
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A06 = r6;
        this.A02 = r3;
        this.A05 = r7;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r10) {
        UserJid A002;
        AnonymousClass1BI r0;
        UserJid A012;
        C18070vi.A0h(r10, a2m);
        C181359Qe.A00(C22068Ax8.A00, r10 instanceof AnonymousClass24H);
        AnonymousClass24H r102 = (AnonymousClass24H) r10;
        boolean z = true;
        C181359Qe.A00(C22069Ax9.A00, AnonymousClass000.A1W(r102.A02));
        AnonymousClass205 A18 = r102.A18();
        C181359Qe.A00(C22070AxA.A00, AnonymousClass000.A1W(A18));
        boolean z2 = a2m.A0A;
        AnonymousClass11S r02 = this.A00;
        if (z2) {
            A002 = r02.A09();
        } else {
            A002 = AnonymousClass11S.A00(r02);
        }
        UserJid userJid = A002;
        C181359Qe.A00(C22071AxB.A00, AnonymousClass000.A1W(userJid));
        if (A18.A02) {
            A012 = userJid;
        } else {
            C22941Dw r03 = UserJid.Companion;
            A51 a51 = r102.A05;
            if (a51 == null) {
                r0 = null;
            } else {
                r0 = a51.A00;
            }
            A012 = C22941Dw.A01(r0);
        }
        if (A012 == null) {
            z = false;
        }
        C181359Qe.A00(C22072AxC.A00, z);
        AnonymousClass8X8 r3 = a2m.A00;
        C164778a3 r04 = ((C166418cr) r3.A00).encEventResponseMessage_;
        if (r04 == null) {
            r04 = C164778a3.DEFAULT_INSTANCE;
        }
        C23624Bmt A0O = r04.A0O();
        C163868Wq r6 = (C163868Wq) C166308cg.DEFAULT_INSTANCE.A0N();
        C49552Qx r05 = r102.A02;
        if (r05 != null) {
            r6.A0H(C196689vT.A00(r05));
        }
        r6.A0G(r102.A01);
        int i = r102.A00;
        C166308cg r1 = (C166308cg) C17880vN.A0G(r6);
        r1.bitField0_ |= 4;
        r1.extraGuestCount_ = i;
        AnonymousClass7PS A022 = ((A2I) this.A05.get()).A02(new C194959sZ(userJid, A18, "Event Response", AnonymousClass8BT.A1Z(r6)));
        DSQ dsq = (DSQ) A022.first;
        C164778a3 r12 = (C164778a3) C17880vN.A0G(A0O);
        int i2 = C164778a3.ENC_IV_FIELD_NUMBER;
        dsq.getClass();
        r12.bitField0_ |= 4;
        r12.encIv_ = dsq;
        DSQ dsq2 = (DSQ) A022.second;
        C164778a3 r13 = (C164778a3) C17880vN.A0G(A0O);
        dsq2.getClass();
        r13.bitField0_ |= 2;
        r13.encPayload_ = dsq2;
        C166408cq r06 = (C166408cq) A022.third;
        C164778a3 r14 = (C164778a3) C17880vN.A0G(A0O);
        r06.getClass();
        r14.eventCreationMessageKey_ = r06;
        r14.bitField0_ |= 1;
        C164778a3 r07 = (C164778a3) A0O.A0C();
        C166418cr A0J = AnonymousClass8BV.A0J(r3, r07);
        A0J.encEventResponseMessage_ = r07;
        A0J.bitField1_ |= 536870912;
    }
}
