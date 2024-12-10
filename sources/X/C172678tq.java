package X;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8tq  reason: invalid class name and case insensitive filesystem */
public final class C172678tq extends AUK {
    public final AnonymousClass00H A00;
    public final AnonymousClass8fC A01;

    public void CBB(C193069pU r20, C166388co r21, AnonymousClass206 r22) {
        AnonymousClass22H r4;
        AnonymousClass206 r42 = r22;
        C18070vi.A0d(r42, 0);
        C193069pU r3 = r20;
        C166388co r5 = r21;
        C18070vi.A0j(r5, r3);
        if (!(r42 instanceof AnonymousClass22H) || (r4 = (AnonymousClass22H) r42) == null) {
            throw AnonymousClass8BR.A0o(0);
        }
        this.A01.C1B(r3, r5, r4);
        List A17 = r4.A17();
        if ((A17 == null || A17.isEmpty()) && r5.pollUpdates_.size() > 0) {
            ArrayList A13 = AnonymousClass000.A13();
            A51 a51 = new A51(r4.A0I(), r4.A0v);
            long j = r4.A0x;
            AnonymousClass00H r2 = this.A00;
            r2.get();
            long A002 = C20106A7k.A00(r5);
            for (C165598bS r6 : r5.pollUpdates_) {
                ArrayList A132 = AnonymousClass000.A13();
                AnonymousClass8XH r0 = r6.vote_;
                if (r0 == null) {
                    r0 = AnonymousClass8XH.DEFAULT_INSTANCE;
                }
                for (DSQ A06 : r0.selectedOptions_) {
                    String encodeToString = Base64.encodeToString(A06.A06(), 2);
                    C18070vi.A0b(encodeToString);
                    A132.add(encodeToString);
                }
                r2.get();
                C166408cq r02 = r6.pollUpdateMessageKey_;
                if (r02 == null) {
                    r02 = C166408cq.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r02);
                AnonymousClass22E r9 = new AnonymousClass22E(A002, C20106A7k.A01(r02), a51, (List) A132, j, r6.senderTimestampMs_);
                C22931Dv r1 = AnonymousClass1BI.A00;
                C166408cq r03 = r6.pollUpdateMessageKey_;
                if (r03 == null) {
                    r03 = C166408cq.DEFAULT_INSTANCE;
                }
                r9.A0d(r1.A02(r03.participant_));
                if (!r6.unread_) {
                    r9.A0a(17);
                }
                A13.add(r9);
            }
            r4.A18(A13);
            r4.A0W(2);
        }
        if ((r5.bitField0_ & Integer.MIN_VALUE) != 0) {
            AnonymousClass8YW r04 = r5.pollAdditionalMetadata_;
            if (r04 == null) {
                r04 = AnonymousClass8YW.DEFAULT_INSTANCE;
            }
            r4.A00 = r04.pollInvalidated_ ? 1 : 0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172678tq(AnonymousClass8fC r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r3);
        C18070vi.A0k(r2, r3);
        this.A01 = r1;
        this.A00 = r2;
    }

    public void BDZ(C195629te r11, AnonymousClass8X1 r12, AnonymousClass206 r13) {
        AnonymousClass22H r4;
        List<AnonymousClass212> A17;
        boolean A15 = C18070vi.A15(r13, r12);
        C18070vi.A0d(r11, 2);
        if (!(r13 instanceof AnonymousClass22H) || (r4 = (AnonymousClass22H) r13) == null) {
            throw AnonymousClass8BW.A0S(A15 ? 1 : 0);
        }
        super.BDZ(r11, r12, r13);
        if (r4.A10(2)) {
            if (r11.A06) {
                this.A01.C1A(r11, r12, r4);
            } else if (r11.A07 && (A17 = r4.A17()) != null) {
                for (AnonymousClass212 r2 : A17) {
                    C18070vi.A0z(r2, "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessagePollVote");
                    AnonymousClass22E r7 = (AnonymousClass22E) r2;
                    C23624Bmt A0N = C165598bS.DEFAULT_INSTANCE.A0N();
                    AnonymousClass8X4 r3 = (AnonymousClass8X4) AnonymousClass8XH.DEFAULT_INSTANCE.A0N();
                    List list = r7.A01;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            r3.A0G(AnonymousClass8BR.A0F(Base64.decode(C17880vN.A0v(it), 2), A15));
                        }
                        AnonymousClass8X7 A002 = A3J.A00(r2);
                        C165598bS r1 = (C165598bS) C17880vN.A0G(A0N);
                        AnonymousClass8XH r0 = (AnonymousClass8XH) r3.A0C();
                        r0.getClass();
                        r1.vote_ = r0;
                        r1.bitField0_ |= 2;
                        C165598bS r14 = (C165598bS) C17880vN.A0G(A0N);
                        r14.pollUpdateMessageKey_ = AnonymousClass8BU.A0Y(A002);
                        r14.bitField0_ |= 1;
                        long j = r7.A00;
                        C165598bS r32 = (C165598bS) C17880vN.A0G(A0N);
                        r32.bitField0_ |= 4;
                        r32.senderTimestampMs_ = j;
                        if (r7.A0D() != 17) {
                            C165598bS r22 = (C165598bS) C17880vN.A0G(A0N);
                            r22.bitField0_ |= 16;
                            r22.unread_ = true;
                        }
                        C166388co A0P = AnonymousClass8BS.A0P(r12);
                        C23577Bm6 A0C = A0N.A0C();
                        int i = C166388co.AGENT_ID_FIELD_NUMBER;
                        A0C.getClass();
                        EE9 ee9 = A0P.pollUpdates_;
                        if (!((C27296DbR) ee9).A00) {
                            ee9 = C23577Bm6.A09(ee9);
                            A0P.pollUpdates_ = ee9;
                        }
                        ee9.add(A0C);
                    }
                }
            }
        }
        if (r4.A00 != 0) {
            C23624Bmt A08 = AnonymousClass8BS.A08(AnonymousClass8YW.DEFAULT_INSTANCE);
            AnonymousClass8YW r23 = (AnonymousClass8YW) A08.A00;
            r23.bitField0_ |= 1;
            r23.pollInvalidated_ = true;
            C166388co A0P2 = AnonymousClass8BS.A0P(r12);
            AnonymousClass8YW r15 = (AnonymousClass8YW) A08.A0C();
            int i2 = C166388co.AGENT_ID_FIELD_NUMBER;
            r15.getClass();
            A0P2.pollAdditionalMetadata_ = r15;
            A0P2.bitField0_ |= Integer.MIN_VALUE;
        }
    }
}
