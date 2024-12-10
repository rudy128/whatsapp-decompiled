package X;

import com.whatsapp.comments.MessageCommentsManager;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public final class ATJ implements AnonymousClass3L2, AnonymousClass3L4 {
    public final C198669yi A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public AnonymousClass206 C1N(C20077A6d a6d) {
        AnonymousClass206 A0K;
        AnonymousClass1BI A0I;
        C20077A6d a6d2 = a6d;
        AnonymousClass206 r3 = null;
        if (!a6d2.A02) {
            C166418cr r7 = a6d2.A08;
            int i = r7.bitField1_;
            if ((33554432 & i) != 0) {
                a6d2.A02 = true;
                C198669yi r4 = this.A00;
                AnonymousClass205 r14 = a6d2.A0A;
                AnonymousClass1BI r11 = a6d2.A05;
                UserJid userJid = a6d2.A06;
                C164768a2 r10 = r7.encCommentMessage_;
                if (r10 == null && (r10 = C164768a2.DEFAULT_INSTANCE) == null) {
                    A0K = null;
                } else {
                    C166408cq r13 = r10.targetMessageKey_;
                    if (r13 == null && (r13 = C166408cq.DEFAULT_INSTANCE) == null) {
                        throw AnonymousClass8BU.A0a("CommentProtobufHelper/Missing target message key", 0);
                    }
                    AnonymousClass00H r72 = r4.A07;
                    A51 A012 = ((A2I) r72.get()).A01(r11, r13, r14);
                    UserJid A002 = C22941Dw.A00(r11);
                    if (r14.A02) {
                        A002 = r4.A00.A0A();
                    } else if (!C22971Dz.A0T(A002)) {
                        if (!C22971Dz.A0Y(A002)) {
                            A002 = null;
                        } else {
                            throw AnonymousClass8BR.A0o(0);
                        }
                    }
                    AnonymousClass205 r9 = A012.A01;
                    AnonymousClass205 A013 = ((C59392mE) r4.A08.get()).A01(r9);
                    AnonymousClass1W6 A0c = C17880vN.A0c(r4.A04);
                    if (A0c != null) {
                        AnonymousClass206 A0s = C108945cZ.A0s(A013, A0c);
                        if (A013 == null || A0s == null || C20133A8t.A0B(A0s)) {
                            Log.i("CommentProtobufHelper/parseEncCommentMessage/parent message not found.");
                            A0K = new AnonymousClass210(r14, a6d2.A03);
                            A51.A01(userJid, A0K, r9);
                            A0K.A0d(r11);
                        } else {
                            if (A0s.A0v.A02) {
                                A0I = AnonymousClass11S.A00(r4.A00);
                            } else {
                                A0I = A0s.A0I();
                            }
                            try {
                                byte[] A03 = ((A2I) r72.get()).A03(new C195579tZ(r10.encIv_, r10.encPayload_, r11, A002, r13, r14, "Enc Comment", ((C57502jB) r4.A03.get()).A00(A0s)));
                                C17960vV.A07(A03);
                                C166418cr A014 = C166418cr.A01(A03);
                                C18070vi.A0X(A014);
                                C20077A6d A032 = a6d2.A03(A014);
                                AnonymousClass12N r32 = (AnonymousClass12N) r4.A05.get();
                                if (r32 != null) {
                                    A0K = r32.A00(A032);
                                    C60472o5.A01(new C48312Lz(new A51(A0I, A013), A0s.A0x), A0K);
                                    A0K.A0o = true;
                                } else {
                                    Log.e("CommentProtobufHelper/Missing fMessageProtobufSubsystem");
                                    throw AnonymousClass8BR.A0o(26);
                                }
                            } catch (AnonymousClass1PN unused) {
                                throw AnonymousClass8BU.A0a("CommentProtobufHelper/parseEncCommentMessage/could not get E2E.Message from the decrypted bytes", 0);
                            } catch (NullPointerException unused2) {
                                throw AnonymousClass8BU.A0a("CommentProtobufHelper/parseEncCommentMessage/could not get E2E.Message from the decrypted bytes", 0);
                            }
                        }
                    } else {
                        Log.e("CommentProtobufHelper/Missing coreMessageStore");
                        throw AnonymousClass8BR.A0o(26);
                    }
                }
                a6d2.A02 = false;
            } else if ((i & 1073741824) != 0) {
                if (a6d2.A0K) {
                    C164478Yz r0 = r7.commentMessage_;
                    if (r0 == null) {
                        r0 = C164478Yz.DEFAULT_INSTANCE;
                    }
                    C166418cr r02 = r0.message_;
                    if (r02 == null) {
                        r02 = C166418cr.DEFAULT_INSTANCE;
                    }
                    C18070vi.A0X(r02);
                    C20077A6d A033 = a6d2.A03(r02);
                    A033.A02 = true;
                    r3 = AnonymousClass8BV.A0K(A033, this.A02);
                    C198669yi r2 = this.A00;
                    C164478Yz r1 = r7.commentMessage_;
                    if (r1 == null) {
                        r1 = C164478Yz.DEFAULT_INSTANCE;
                    }
                    C18070vi.A0X(r1);
                    if ((r1.bitField0_ & 2) != 0) {
                        C166408cq r42 = r1.targetMessageKey_;
                        if (r42 == null && (r42 = C166408cq.DEFAULT_INSTANCE) == null) {
                            throw AnonymousClass8BU.A0a("CommentProtobufHelper/Missing target message key", 0);
                        }
                        r2.A06.get();
                        AnonymousClass205 A0L = AnonymousClass8BV.A0L(C20106A7k.A01(r42), r2.A08);
                        if (A0L != null) {
                            A51.A01(AnonymousClass1BI.A00.A02(r42.participant_), r3, A0L);
                            return r3;
                        }
                        throw AnonymousClass000.A0k("CommentProtobufHelper/appendCommentMessageInfo/missing referentialKey");
                    }
                } else {
                    throw AnonymousClass8BR.A0o(0);
                }
            } else if (C181609Rd.A00(a6d2) == C179839Kc.REVOKE) {
                a6d2.A02 = true;
                A0K = AnonymousClass8BV.A0K(a6d2, this.A02);
                a6d2.A02 = false;
                if (A0K instanceof AnonymousClass23N) {
                    C198669yi r73 = this.A00;
                    C18070vi.A0d(A0K, 0);
                    String str = a6d2.A0E;
                    UserJid userJid2 = a6d2.A06;
                    if (!(str == null || userJid2 == null)) {
                        AnonymousClass205 A0L2 = AnonymousClass8BV.A0L(AnonymousClass205.A01(A0K.A0v.A00, str, r73.A00.A0O(userJid2)), r73.A08);
                        AnonymousClass1W6 A0c2 = C17880vN.A0c(r73.A04);
                        if (A0c2 != null) {
                            AnonymousClass206 A0s2 = C108945cZ.A0s(A0L2, A0c2);
                            if (A0s2 == null) {
                                Log.w("CommentProtobufHelper/received a comment revoke, but we cant find a parent message/skipping adding comment info");
                                return A0K;
                            }
                            C60472o5.A01(new C48312Lz(A51.A00(A0s2), A0s2.A0x), A0K);
                            return A0K;
                        }
                        Log.e("CommentProtobufHelper/Missing coreMessageStore");
                        throw AnonymousClass8BR.A0o(26);
                    }
                }
            }
            return A0K;
        }
        return r3;
    }

    public Integer C1P(C19998A2m a2m, AnonymousClass206 r35) {
        A51 A012;
        AnonymousClass1BI A0I;
        C19998A2m a2m2 = a2m;
        if (!a2m2.A0E) {
            AnonymousClass206 r13 = r35;
            if (AnonymousClass206.A08(r13) && !(r13 instanceof AnonymousClass23N)) {
                C692336k A002 = C60472o5.A00(r13);
                if (A002 == null || (A012 = A002.A01()) == null) {
                    throw AnonymousClass8BW.A0S(0);
                }
                AnonymousClass8X8 A003 = C166418cr.A00();
                C18070vi.A0b(A003);
                C163938Wx r9 = a2m2.A01;
                boolean z = a2m2.A0B;
                boolean z2 = a2m2.A06;
                boolean z3 = a2m2.A05;
                boolean z4 = a2m2.A04;
                boolean z5 = a2m2.A0C;
                boolean z6 = a2m2.A0A;
                boolean z7 = a2m2.A0F;
                boolean z8 = a2m2.A08;
                boolean z9 = a2m2.A09;
                Integer num = a2m2.A03;
                boolean z10 = a2m2.A07;
                C18070vi.A0d(A003, 0);
                C19998A2m a2m3 = new C19998A2m(A003, r9, a2m2.A02, num, a2m2.A0G, z, z2, z3, a2m2.A0D, z4, z5, z6, true, z7, z8, z9, z10);
                AnonymousClass8BV.A1B(a2m3, r13, this.A02);
                if (z2) {
                    C23624Bmt A0N = C164478Yz.DEFAULT_INSTANCE.A0N();
                    C166408cq r0 = ((C164478Yz) A0N.A00).targetMessageKey_;
                    if (r0 == null) {
                        r0 = C166408cq.DEFAULT_INSTANCE;
                    }
                    AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r0);
                    AnonymousClass9AT.A02(A012.A00, A0f, A012.A01);
                    C164478Yz r1 = (C164478Yz) C17880vN.A0G(A0N);
                    r1.targetMessageKey_ = AnonymousClass8BU.A0Y(A0f);
                    r1.bitField0_ |= 2;
                    C166048cG A0G = A003.A0G();
                    C20133A8t.A09(this.A01, A003);
                    C164478Yz r12 = (C164478Yz) C17880vN.A0G(A0N);
                    C166418cr A0e = AnonymousClass8BR.A0e(A003);
                    A0e.getClass();
                    r12.message_ = A0e;
                    r12.bitField0_ |= 1;
                    C166418cr A0M = AnonymousClass8BS.A0M(a2m2.A00);
                    C164478Yz r02 = (C164478Yz) A0N.A0C();
                    r02.getClass();
                    A0M.commentMessage_ = r02;
                    A0M.bitField1_ |= 1073741824;
                    r9.A0F(A0G);
                } else {
                    C198669yi r6 = this.A00;
                    if (C198669yi.A00(r13)) {
                        MessageCommentsManager messageCommentsManager = (MessageCommentsManager) r6.A01;
                        C692336k A004 = C60472o5.A00(r13);
                        if (A004 != null) {
                            Long A022 = A004.A02();
                            if (A022 != null) {
                                long longValue = A022.longValue();
                                if (longValue >= 0) {
                                    AnonymousClass206 A023 = AnonymousClass1W2.A02(messageCommentsManager.A03, longValue);
                                    if (A023 != null) {
                                        AnonymousClass205 r3 = A023.A0v;
                                        C18070vi.A0W(r3);
                                        AnonymousClass205 A024 = ((C59392mE) messageCommentsManager.A04.get()).A02(r3);
                                        if (A024 != null) {
                                            if (r3.A02) {
                                                A0I = AnonymousClass11S.A00(messageCommentsManager.A00);
                                            } else {
                                                A0I = A023.A0I();
                                            }
                                            C60472o5.A01(new C48312Lz(new A51(A0I, A024), longValue), r13);
                                        } else {
                                            Log.e("MessageCommentsManager/populateAdjustedParentMessageKeyForComment/something went wrong while finding the referential key");
                                            throw AnonymousClass8BW.A0S(71);
                                        }
                                    } else {
                                        C17900vP.A0X(A022, "MessageCommentsManager/populateAdjustedParentMessageKeyForComment/parent message not found for the row id = ", AnonymousClass000.A10());
                                        throw AnonymousClass8BW.A0S(71);
                                    }
                                }
                            }
                            Log.e("MessageCommentsManager/populateAdjustedParentMessageKeyForComment/invalid parent row id");
                            throw AnonymousClass8BU.A0b(0);
                        }
                        C692336k A005 = C60472o5.A00(r13);
                        if (A005 != null) {
                            A51 A013 = A005.A01();
                            if (A013 != null) {
                                C17960vV.A07(A005);
                                AnonymousClass1E2 A09 = r6.A00.A09();
                                if (A09 != null) {
                                    C18030ve r7 = r6.A02;
                                    AnonymousClass8X8 r5 = a2m3.A00;
                                    C20133A8t.A09(r7, r5);
                                    AnonymousClass7PS A025 = ((A2I) r6.A07.get()).A02(new C194959sZ(A09, A013.A01, "Enc Comment", AnonymousClass8BT.A1Z(r5)));
                                    AnonymousClass8X8 r4 = a2m2.A00;
                                    C164768a2 r14 = ((C166418cr) r4.A00).encCommentMessage_;
                                    if (r14 == null) {
                                        r14 = C164768a2.DEFAULT_INSTANCE;
                                    }
                                    C23624Bmt A0O = r14.A0O();
                                    DSQ dsq = (DSQ) A025.first;
                                    C164768a2 r2 = (C164768a2) C17880vN.A0G(A0O);
                                    int i = C164768a2.ENC_IV_FIELD_NUMBER;
                                    dsq.getClass();
                                    r2.bitField0_ |= 4;
                                    r2.encIv_ = dsq;
                                    DSQ dsq2 = (DSQ) A025.second;
                                    C164768a2 r22 = (C164768a2) C17880vN.A0G(A0O);
                                    dsq2.getClass();
                                    r22.bitField0_ |= 2;
                                    r22.encPayload_ = dsq2;
                                    C166408cq r15 = (C166408cq) A025.third;
                                    C164768a2 r23 = (C164768a2) C17880vN.A0G(A0O);
                                    r15.getClass();
                                    r23.targetMessageKey_ = r15;
                                    r23.bitField0_ |= 1;
                                    C164768a2 r16 = (C164768a2) A0O.A0C();
                                    C166418cr A0J = AnonymousClass8BV.A0J(r4, r16);
                                    A0J.encCommentMessage_ = r16;
                                    A0J.bitField1_ |= 33554432;
                                    if (!C18020vd.A05(C18040vf.A01, r7, 7772)) {
                                        r4.A0V(r5.A0G());
                                    }
                                    r9.A0F(a2m3.A01.A0C());
                                } else {
                                    throw AnonymousClass8BU.A0b(0);
                                }
                            } else {
                                Log.e("CommentProtobufHelper/isCommentInfoValid/parentMessageKey is null");
                                throw AnonymousClass8BU.A0b(0);
                            }
                        } else {
                            Log.e("CommentProtobufHelper/isCommentInfoValid/message CommentMessageInfo is null");
                            throw AnonymousClass8BU.A0b(0);
                        }
                    } else {
                        throw AnonymousClass8BU.A0b(0);
                    }
                }
                return AnonymousClass00R.A01;
            }
        }
        return AnonymousClass00R.A00;
    }

    public ATJ(C198669yi r1, C18030ve r2, AnonymousClass00H r3) {
        C72473Md.A1I(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
