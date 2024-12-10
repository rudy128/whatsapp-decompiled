package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8tr  reason: invalid class name and case insensitive filesystem */
public final class C172688tr extends AUK {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final C167008fD A02;

    public void BDZ(C195629te r10, AnonymousClass8X1 r11, AnonymousClass206 r12) {
        C445823z r4;
        C18070vi.A0d(r12, 0);
        C18070vi.A0j(r11, r10);
        if (!(r12 instanceof C445823z) || (r4 = (C445823z) r12) == null) {
            throw AnonymousClass8BW.A0S(0);
        }
        super.BDZ(r10, r11, r12);
        if (r10.A06) {
            this.A02.C1A(r10, r11, r4);
        } else {
            List<AnonymousClass24H> A18 = r4.A18();
            if (A18 != null) {
                for (AnonymousClass24H r6 : A18) {
                    C23624Bmt A0N = C165348az.DEFAULT_INSTANCE.A0N();
                    C163868Wq r5 = (C163868Wq) C166308cg.DEFAULT_INSTANCE.A0N();
                    C49552Qx r0 = r6.A02;
                    if (r0 != null) {
                        r5.A0H(C196689vT.A00(r0));
                        r5.A0G(r6.A01);
                        AnonymousClass8X7 A002 = A3J.A00(r6);
                        C165348az r1 = (C165348az) C17880vN.A0G(A0N);
                        r1.eventResponseMessageKey_ = AnonymousClass8BU.A0Y(A002);
                        r1.bitField0_ |= 1;
                        long j = r6.A0I;
                        C165348az r3 = (C165348az) C17880vN.A0G(A0N);
                        r3.bitField0_ |= 2;
                        r3.timestampMs_ = j;
                        boolean A1S = AnonymousClass000.A1S(r6.A0D(), 17);
                        C165348az r13 = (C165348az) C17880vN.A0G(A0N);
                        r13.bitField0_ |= 8;
                        r13.unread_ = A1S;
                        C165348az r14 = (C165348az) C17880vN.A0G(A0N);
                        C166308cg r02 = (C166308cg) r5.A0C();
                        r02.getClass();
                        r14.eventResponseMessage_ = r02;
                        r14.bitField0_ |= 4;
                        C166388co A0P = AnonymousClass8BS.A0P(r11);
                        C23577Bm6 A0C = A0N.A0C();
                        int i = C166388co.AGENT_ID_FIELD_NUMBER;
                        A0C.getClass();
                        EE9 ee9 = A0P.eventResponses_;
                        if (!((C27296DbR) ee9).A00) {
                            ee9 = C23577Bm6.A09(ee9);
                            A0P.eventResponses_ = ee9;
                        }
                        ee9.add(A0C);
                    }
                }
            }
        }
        C23624Bmt A0N2 = AnonymousClass8YU.DEFAULT_INSTANCE.A0N();
        boolean A1Z = AnonymousClass000.A1Z(r4.A02, AnonymousClass00R.A01);
        AnonymousClass8YU r15 = (AnonymousClass8YU) C17880vN.A0G(A0N2);
        r15.bitField0_ |= 1;
        r15.isStale_ = A1Z;
        C166388co A0P2 = AnonymousClass8BS.A0P(r11);
        AnonymousClass8YU r16 = (AnonymousClass8YU) A0N2.A0C();
        int i2 = C166388co.AGENT_ID_FIELD_NUMBER;
        r16.getClass();
        A0P2.eventAdditionalMetadata_ = r16;
        A0P2.bitField1_ |= 32768;
    }

    public void CBB(C193069pU r20, C166388co r21, AnonymousClass206 r22) {
        C445823z r2;
        Integer num;
        AnonymousClass206 r23 = r22;
        C18070vi.A0d(r23, 0);
        C193069pU r1 = r20;
        C166388co r3 = r21;
        C18070vi.A0j(r3, r1);
        if (!(r23 instanceof C445823z) || (r2 = (C445823z) r23) == null) {
            throw AnonymousClass8BR.A0o(0);
        }
        this.A02.C1B(r1, r3, r2);
        List A18 = r2.A18();
        if ((A18 == null || A18.isEmpty()) && r3.eventResponses_.size() > 0) {
            ArrayList A13 = AnonymousClass000.A13();
            A51 a51 = new A51(r2.A0I(), r2.A0v);
            for (C165348az r7 : r3.eventResponses_) {
                this.A00.get();
                C166408cq r0 = r7.eventResponseMessageKey_;
                if (r0 == null) {
                    r0 = C166408cq.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r0);
                AnonymousClass205 A012 = C20106A7k.A01(r0);
                long j = r7.timestampMs_;
                C166308cg r02 = r7.eventResponseMessage_;
                C166308cg r8 = r02;
                if (r02 == null) {
                    r02 = C166308cg.DEFAULT_INSTANCE;
                }
                long j2 = r02.timestampMs_;
                if (r8 == null) {
                    r8 = C166308cg.DEFAULT_INSTANCE;
                }
                C49552Qx A013 = C196689vT.A01(r8.A0R());
                C166308cg r82 = r7.eventResponseMessage_;
                if (r82 == null) {
                    r82 = C166308cg.DEFAULT_INSTANCE;
                }
                int i = r82.extraGuestCount_;
                int i2 = 0;
                if (0 < i) {
                    i2 = i;
                }
                AnonymousClass24H r10 = new AnonymousClass24H(A012, A013, a51, i2, j, j2);
                C22931Dv r12 = AnonymousClass1BI.A00;
                C166408cq r03 = r7.eventResponseMessageKey_;
                if (r03 == null) {
                    r03 = C166408cq.DEFAULT_INSTANCE;
                }
                r10.A0d(r12.A02(r03.participant_));
                if (!r7.unread_ || A012.A02) {
                    r10.A0a(17);
                }
                A13.add(r10);
            }
            r2.A1A((AnonymousClass11S) C18070vi.A0E(this.A01), C29431cG.A0t(A13));
        }
        if ((r3.bitField1_ & 32768) != 0) {
            AnonymousClass8YU r04 = r3.eventAdditionalMetadata_;
            if (r04 == null) {
                r04 = AnonymousClass8YU.DEFAULT_INSTANCE;
            }
            if (r04.isStale_) {
                num = AnonymousClass00R.A01;
            } else {
                num = AnonymousClass00R.A00;
            }
            r2.A02 = num;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C172688tr(C167008fD r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        super(r4);
        C18070vi.A0o(r2, r3, r4);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r1;
    }
}
