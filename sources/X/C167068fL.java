package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8fL  reason: invalid class name and case insensitive filesystem */
public class C167068fL extends C20616ASa implements AnonymousClass3LE {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1MZ A02;
    public final C18030ve A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final JniBridge A07;
    public final AnonymousClass00H A08;

    public AnonymousClass206 A01(C20077A6d a6d) {
        UserJid A0I;
        C20077A6d a6d2 = a6d;
        C166418cr r5 = a6d2.A08;
        if ((r5.bitField1_ & 128) == 0) {
            return null;
        }
        C165248ap r4 = r5.pollUpdateMessage_;
        if (r4 == null) {
            r4 = C165248ap.DEFAULT_INSTANCE;
        }
        if (AnonymousClass000.A1O(r4.bitField0_ & 2)) {
            AnonymousClass8ZE r0 = r4.vote_;
            AnonymousClass8ZE r1 = r0;
            if (r0 == null) {
                r0 = AnonymousClass8ZE.DEFAULT_INSTANCE;
            }
            if ((r0.bitField0_ & 2) != 0) {
                if (r1 == null) {
                    r1 = AnonymousClass8ZE.DEFAULT_INSTANCE;
                }
                if ((r1.bitField0_ & 1) != 0) {
                    C166408cq r02 = r4.pollCreationMessageKey_;
                    if (r02 == null) {
                        r02 = C166408cq.DEFAULT_INSTANCE;
                    }
                    if (AnonymousClass9P4.A00(r02)) {
                        C165248ap r6 = r5.pollUpdateMessage_;
                        if (r6 == null) {
                            r6 = C165248ap.DEFAULT_INSTANCE;
                        }
                        AnonymousClass205 r15 = a6d2.A0A;
                        AnonymousClass22E r2 = new AnonymousClass22E(r15, a6d2.A03);
                        AnonymousClass1BI r12 = a6d2.A05;
                        AnonymousClass00H r03 = this.A06;
                        A2I a2i = (A2I) r03.get();
                        C166408cq r13 = r6.pollCreationMessageKey_;
                        if (r13 == null) {
                            r13 = C166408cq.DEFAULT_INSTANCE;
                        }
                        r2.A05 = a2i.A01(r12, r13, r15);
                        if (C18020vd.A05(C18040vf.A01, this.A03, 6772)) {
                            C165248ap r62 = r5.pollUpdateMessage_;
                            if (r62 == null) {
                                r62 = C165248ap.DEFAULT_INSTANCE;
                            }
                            if (r62 != null) {
                                C166408cq r14 = r62.pollCreationMessageKey_;
                                if (r14 == null) {
                                    r14 = C166408cq.DEFAULT_INSTANCE;
                                }
                                if ((r62.bitField0_ & 8) != 0) {
                                    r2.A00 = r62.senderTimestampMs_;
                                    AnonymousClass8ZE r9 = r62.vote_;
                                    if (r9 == null && (r9 = AnonymousClass8ZE.DEFAULT_INSTANCE) == null) {
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - pollEncValue is null for a poll vote message");
                                        throw AnonymousClass8BR.A0p("poll_update_is_missing_pollEncValue", 11);
                                    }
                                    AnonymousClass206 A0s = C108945cZ.A0s(r2.A18(), C17880vN.A0c(this.A05));
                                    if (A0s == null || C20133A8t.A0B(A0s)) {
                                        r2.A02 = r5.A0M();
                                        return r2;
                                    } else if (A0s instanceof AnonymousClass22H) {
                                        AnonymousClass22H r52 = (AnonymousClass22H) A0s;
                                        AnonymousClass205 r8 = r2.A0v;
                                        if (r8.A02) {
                                            AnonymousClass11S r11 = this.A00;
                                            AnonymousClass1CJ r10 = this.A01;
                                            AnonymousClass1BI r82 = r8.A00;
                                            A0I = A3W.A00(r11, r10, r82, this.A02.A0I(r82));
                                        } else if (r12 != null) {
                                            A0I = (UserJid) r12;
                                        } else {
                                            A0I = r2.A0I();
                                        }
                                        try {
                                            C183509Yn A012 = A3W.A01((AnonymousClass8XH) C23577Bm6.A07(AnonymousClass8XH.DEFAULT_INSTANCE, ((A2I) r03.get()).A03(new C195579tZ(r9.encIv_, r9.encPayload_, r12, A0I, r14, r15, "Poll Vote", ((C57502jB) this.A04.get()).A00(A0s)))), r52.A07, r52.A02);
                                            if (A012 != null) {
                                                List list = A012.A00;
                                                List list2 = r2.A06;
                                                list2.clear();
                                                list2.addAll(list);
                                                return r2;
                                            }
                                            throw AnonymousClass8BU.A0a("FMessagePollVoteProtobuf/decryptFMessagePollVote - poll vote payload is null", 0);
                                        } catch (AnonymousClass1PN e) {
                                            Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - failed to parse payload into protobuf", e);
                                            throw AnonymousClass8BR.A0o(11);
                                        }
                                    } else {
                                        Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - parent message is not a poll message");
                                        throw AnonymousClass8BR.A0p("parent message is not poll message", 0);
                                    }
                                } else {
                                    throw AnonymousClass8BR.A0p("poll_update_missing_sender_timestamp", 11);
                                }
                            } else {
                                Log.e("FMessagePollVoteProtobuf/decryptFMessagePollVote - pollUpdateMessage is null for a poll vote message");
                                throw AnonymousClass8BR.A0p("poll_update_is_missing", 11);
                            }
                        } else {
                            C17960vV.A07(r6);
                            int i = r6.bitField0_;
                            if (!AnonymousClass8BW.A1Q(i)) {
                                throw AnonymousClass8BR.A0p("poll_update_missing_poll_message_key", 11);
                            } else if ((i & 8) != 0) {
                                r2.A00 = r6.senderTimestampMs_;
                                if ((i & 2) != 0) {
                                    AnonymousClass8ZE r53 = r6.vote_;
                                    if (r53 == null) {
                                        r53 = AnonymousClass8ZE.DEFAULT_INSTANCE;
                                    }
                                    if ((r53.bitField0_ & 2) != 0) {
                                        byte[] A062 = r53.encIv_.A06();
                                        if (A062.length == 12) {
                                            r2.A03 = A062;
                                            if ((r53.bitField0_ & 1) != 0) {
                                                r2.A04 = r53.encPayload_.A06();
                                                return r2;
                                            }
                                            throw AnonymousClass8BR.A0p("poll_update_missing_vote_enc_payload", 11);
                                        }
                                        throw AnonymousClass8BR.A0p("poll_update_invalid_vote_enc_iv", 11);
                                    }
                                    throw AnonymousClass8BR.A0p("poll_update_missing_vote_enc_iv", 11);
                                }
                                throw AnonymousClass8BR.A0p("poll_update_missing_update", 11);
                            } else {
                                throw AnonymousClass8BR.A0p("poll_update_missing_sender_timestamp", 11);
                            }
                        }
                    } else {
                        throw AnonymousClass8BR.A0p("Invalid parent key.", 11);
                    }
                } else {
                    throw AnonymousClass8BR.A0p("Vote enc payload is missing.", 11);
                }
            } else {
                throw AnonymousClass8BR.A0p("Vote enc IV is missing.", 11);
            }
        } else {
            throw AnonymousClass8BR.A0p("Vote is missing.", 11);
        }
    }

    public void BCD(AnonymousClass206 r3, C61402pc r4) {
        C61402pc.A00(r4, "polltype", "vote");
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r21) {
        AnonymousClass1BI r7;
        UserJid userJid;
        UserJid A0I;
        String str;
        int length;
        C23581BmB A012;
        UserJid A013;
        AnonymousClass206 r3 = r21;
        if (r3 instanceof AnonymousClass22E) {
            AnonymousClass22E r32 = (AnonymousClass22E) r3;
            C19998A2m a2m2 = a2m;
            AnonymousClass8X8 r6 = a2m2.A00;
            C165248ap r0 = ((C166418cr) r6.A00).pollUpdateMessage_;
            if (r0 == null) {
                r0 = C165248ap.DEFAULT_INSTANCE;
            }
            C23624Bmt A0O = r0.A0O();
            long j = r32.A00;
            C165248ap r4 = (C165248ap) C17880vN.A0G(A0O);
            int i = C165248ap.METADATA_FIELD_NUMBER;
            r4.bitField0_ |= 8;
            r4.senderTimestampMs_ = j;
            AnonymousClass8ZE r02 = r4.vote_;
            if (r02 == null) {
                r02 = AnonymousClass8ZE.DEFAULT_INSTANCE;
            }
            C163798Wj r42 = (C163798Wj) r02.A0O();
            if (C18020vd.A05(C18040vf.A01, this.A03, 6772)) {
                AnonymousClass8X4 r72 = (AnonymousClass8X4) AnonymousClass8XH.DEFAULT_INSTANCE.A0N();
                Iterator it = r32.A01.iterator();
                while (it.hasNext()) {
                    AnonymousClass8X4.A00(r72, it);
                }
                boolean z = a2m2.A0A;
                AnonymousClass11S r03 = this.A00;
                if (z) {
                    A013 = r03.A0A();
                } else {
                    A013 = AnonymousClass11S.A01(r03);
                }
                AnonymousClass7PS A022 = ((A2I) this.A06.get()).A02(new C194959sZ(A013, r32.A18(), "Poll Vote", AnonymousClass8BT.A1Z(r72)));
                r42.A0G((DSQ) A022.first);
                DSQ dsq = (DSQ) A022.second;
                AnonymousClass8ZE r1 = (AnonymousClass8ZE) C17880vN.A0G(r42);
                int i2 = AnonymousClass8ZE.ENC_IV_FIELD_NUMBER;
                dsq.getClass();
                r1.bitField0_ |= 1;
                r1.encPayload_ = dsq;
                C166408cq r04 = (C166408cq) A022.third;
                C165248ap r12 = (C165248ap) C17880vN.A0G(A0O);
                r04.getClass();
                r12.pollCreationMessageKey_ = r04;
                r12.bitField0_ |= 1;
            } else {
                C166408cq r05 = ((C165248ap) A0O.A00).pollCreationMessageKey_;
                if (r05 == null) {
                    r05 = C166408cq.DEFAULT_INSTANCE;
                }
                AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r05);
                AnonymousClass205 A18 = r32.A18();
                A51 a51 = r32.A05;
                if (a51 == null) {
                    r7 = null;
                } else {
                    r7 = a51.A00;
                }
                C17960vV.A07(A18);
                boolean A15 = C18070vi.A15(A0f, A18);
                ((C191029lu) this.A08.get()).A00(r7, A0f, A18, A15);
                C165248ap r13 = (C165248ap) C17880vN.A0G(A0O);
                r13.pollCreationMessageKey_ = AnonymousClass8BU.A0Y(A0f);
                r13.bitField0_ |= 1;
                byte[] bArr = r32.A03;
                if (bArr == null || r32.A04 == null) {
                    List list = r32.A01;
                    C17960vV.A07(list);
                    byte[] bArr2 = r32.A05;
                    C17960vV.A07(bArr2);
                    JniBridge jniBridge = this.A07;
                    String str2 = A18.A01;
                    if (A18.A02) {
                        boolean z2 = a2m2.A0C;
                        AnonymousClass11S r06 = this.A00;
                        if (z2) {
                            userJid = r06.A0A();
                        } else {
                            userJid = AnonymousClass11S.A00(r06);
                            C17960vV.A07(userJid);
                        }
                    } else {
                        userJid = C22941Dw.A00(r7);
                        C17960vV.A07(userJid);
                    }
                    if (r32.A0v.A02) {
                        boolean z3 = a2m2.A0A;
                        AnonymousClass11S r07 = this.A00;
                        if (z3) {
                            A0I = r07.A0A();
                        } else {
                            A0I = AnonymousClass11S.A01(r07);
                        }
                    } else {
                        A0I = r32.A0I();
                        C17960vV.A07(A0I);
                    }
                    AnonymousClass8X4 r2 = (AnonymousClass8X4) AnonymousClass8XH.DEFAULT_INSTANCE.A0N();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass8X4.A00(r2, it2);
                    }
                    StringBuilder A11 = AnonymousClass000.A11(str2);
                    A11.append(0);
                    byte[] bytes = AnonymousClass000.A0y(A0I.getRawString(), A11).getBytes(C19620yd.A0C);
                    byte[] A1Z = AnonymousClass8BT.A1Z(r2);
                    C18070vi.A0n(jniBridge, str2, bArr2);
                    C18070vi.A0d(userJid, 4);
                    int length2 = bArr2.length;
                    if (length2 != 32) {
                        str = AnonymousClass001.A1I("MessageEncUtils/encryptEncMessage: invalid message_secret secretSize=", AnonymousClass000.A10(), length2);
                    } else {
                        byte[] A1a = AnonymousClass8BV.A1a(12);
                        byte[] A014 = C60612oK.A01(userJid, A0I, "Poll Vote", str2, bArr2);
                        C18070vi.A0X(A014);
                        byte[] WCIAPIGcmAesCreateEncryptedCiphertext = jniBridge.WCIAPIGcmAesCreateEncryptedCiphertext(A014, A1a, A1Z, bytes, 16);
                        if (WCIAPIGcmAesCreateEncryptedCiphertext == null || (length = WCIAPIGcmAesCreateEncryptedCiphertext.length) == 0) {
                            str = "MessageEncUtils/encryptEncMessage encryption values are invalid";
                        } else {
                            C23581BmB A015 = DSQ.A01(A1a, 0, 12);
                            A012 = DSQ.A01(WCIAPIGcmAesCreateEncryptedCiphertext, 0, length);
                            r42.A0G(A015);
                        }
                    }
                    Log.e(str);
                    Log.e("MessageAddOnPollVoteUtils/encryptPollVotePayload encryptionResult is null");
                    return;
                }
                r42.A0G(AnonymousClass8BR.A0F(bArr, A15 ? 1 : 0));
                A012 = AnonymousClass8BR.A0F(r32.A04, A15);
                AnonymousClass8ZE r14 = (AnonymousClass8ZE) C17880vN.A0G(r42);
                int i3 = AnonymousClass8ZE.ENC_IV_FIELD_NUMBER;
                A012.getClass();
                r14.bitField0_ |= 1;
                r14.encPayload_ = A012;
            }
            C165248ap r15 = (C165248ap) C17880vN.A0G(A0O);
            AnonymousClass8ZE r08 = (AnonymousClass8ZE) r42.A0C();
            r08.getClass();
            r15.vote_ = r08;
            r15.bitField0_ |= 2;
            C166418cr A0M = AnonymousClass8BS.A0M(r6);
            C165248ap r09 = (C165248ap) A0O.A0C();
            r09.getClass();
            A0M.pollUpdateMessage_ = r09;
            A0M.bitField1_ |= 128;
            return;
        }
        throw AnonymousClass000.A0k("FMessagePollVoteProtobuf/not supported message");
    }

    public C167068fL(AnonymousClass11S r1, AnonymousClass1CJ r2, AnonymousClass1MZ r3, C18030ve r4, JniBridge jniBridge, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        super(r4);
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = r1;
        this.A07 = jniBridge;
        this.A05 = r6;
        this.A04 = r7;
        this.A02 = r3;
        this.A06 = r8;
        this.A08 = r9;
    }
}
