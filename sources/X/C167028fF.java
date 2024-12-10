package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8fF  reason: invalid class name and case insensitive filesystem */
public final class C167028fF extends AUV {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;

    public final boolean A00(C195629te r5, AnonymousClass206 r6) {
        AnonymousClass1E7 A0E;
        AnonymousClass1BI r1 = r6.A0v.A00;
        if (r1 != null) {
            C36321nh r0 = GroupJid.Companion;
            GroupJid A002 = C36321nh.A00(r1);
            if (A002 == null || (A0E = this.A01.A0E(A002)) == null || !A0E.A0k || r5.A07) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.212, java.lang.Object, X.227, X.206] */
    public void C1B(C193069pU r21, C166388co r22, AnonymousClass206 r23) {
        AnonymousClass8BG A012;
        C193069pU r0 = r21;
        C166388co r12 = r22;
        AnonymousClass206 r10 = r23;
        boolean A1U = AnonymousClass8BX.A1U(r12, r10, r0);
        super.C1B(r0, r12, r10);
        if ((C63892tr.A01(r10) == null || ((A012 = C63892tr.A01(r10)) != null && A012.isEmpty() == A1U)) && r12.reactions_.size() > 0) {
            ArrayList A13 = AnonymousClass000.A13();
            A51 A002 = A51.A00(r10);
            long j = r10.A0x;
            Iterator A0r = AnonymousClass8BS.A0r(r12.reactions_);
            while (A0r.hasNext()) {
                C165608bT r7 = (C165608bT) A0r.next();
                AnonymousClass00H r02 = this.A01;
                r02.get();
                long A003 = C20106A7k.A00(r12);
                r02.get();
                C166408cq r03 = r7.key_;
                if (r03 == null) {
                    r03 = C166408cq.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r03);
                AnonymousClass205 A013 = C20106A7k.A01(r03);
                String str = r7.text_;
                long j2 = r7.senderTimestampMs_;
                ? r13 = new AnonymousClass212(A013, 56, A003);
                r13.A05 = A002;
                r13.A04 = null;
                r13.A02 = j;
                r13.A1E(str);
                r13.A00 = j2;
                C22931Dv r1 = AnonymousClass1BI.A00;
                C166408cq r04 = r7.key_;
                if (r04 == null) {
                    r04 = C166408cq.DEFAULT_INSTANCE;
                }
                r13.A0d(r1.A02(r04.participant_));
                if (!r7.unread_) {
                    r13.A0a(17);
                }
                A13.add(r13);
            }
            C63892tr.A07(new AnonymousClass7CA(this.A00, A13), r10);
            r10.A0W(A1U ? 1 : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167028fF(AnonymousClass11S r1, AnonymousClass1M9 r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        super(r3, r4, r5);
        C18070vi.A0w(r3, r1, r2, r4, r5);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void C1A(C195629te r8, AnonymousClass8X1 r9, AnonymousClass206 r10) {
        boolean A1U = AnonymousClass8BX.A1U(r10, r9, r8);
        if (r10.A10(A1U ? 1 : 0) && !A00(r8, r10)) {
            if (r8.A06) {
                super.C1A(r8, r9, r10);
                return;
            }
            AnonymousClass8BG A012 = C63892tr.A01(r10);
            if (A012 != null) {
                for (AnonymousClass212 r1 : A012.BMv()) {
                    C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageReaction");
                    AnonymousClass227 r3 = (AnonymousClass227) r1;
                    C23624Bmt A0N = C165608bT.DEFAULT_INSTANCE.A0N();
                    AnonymousClass8X7 A002 = A3J.A00(r1);
                    C165608bT r12 = (C165608bT) C17880vN.A0G(A0N);
                    r12.key_ = AnonymousClass8BU.A0Y(A002);
                    r12.bitField0_ |= 1;
                    String str = r3.A01;
                    if (!(str == null || str.length() == 0)) {
                        C165608bT r13 = (C165608bT) C17880vN.A0G(A0N);
                        r13.bitField0_ |= 2;
                        r13.text_ = str;
                    }
                    if (r3.A0D() != 17) {
                        C165608bT r14 = (C165608bT) C17880vN.A0G(A0N);
                        r14.bitField0_ |= 16;
                        r14.unread_ = A1U;
                    }
                    long j = r3.A00;
                    C165608bT r32 = (C165608bT) C17880vN.A0G(A0N);
                    r32.bitField0_ |= 8;
                    r32.senderTimestampMs_ = j;
                    C166388co A0P = AnonymousClass8BS.A0P(r9);
                    C23577Bm6 A0C = A0N.A0C();
                    int i = C166388co.AGENT_ID_FIELD_NUMBER;
                    A0C.getClass();
                    EE9 ee9 = A0P.reactions_;
                    if (!((C27296DbR) ee9).A00) {
                        ee9 = C23577Bm6.A09(ee9);
                        A0P.reactions_ = ee9;
                    }
                    ee9.add(A0C);
                }
            }
        }
    }
}
