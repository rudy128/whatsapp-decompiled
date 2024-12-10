package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;

public final class AUX implements C22511BAs {
    public final C18030ve A00;
    public final AnonymousClass1QS A01;
    public final AnonymousClass1SI A02;
    public final C189509jM A03;

    public void C1A(C195629te r12, AnonymousClass8X1 r13, AnonymousClass206 r14) {
        AW0 A002;
        AW0 A003;
        int i;
        C23624Bmt A0N;
        C164668Zs r1;
        int i2;
        AW0 A004;
        C18070vi.A0d(r14, 0);
        C18070vi.A0j(r13, r12);
        C189509jM r3 = this.A03;
        AW0 A005 = AnonymousClass25B.A00(r14);
        if (!(A005 == null || A005.A09 == null)) {
            C166078cJ A006 = r3.A00(r14);
            C166388co A0X = C17880vN.A0X(r13);
            A006.getClass();
            A0X.paymentInfo_ = A006;
            A0X.bitField0_ |= A7Y.A0F;
        }
        AnonymousClass206 A0K = r14.A0K();
        if (!(A0K == null || (A004 = AnonymousClass25B.A00(A0K)) == null || A004.A09 == null)) {
            C166078cJ A007 = r3.A00(r14.A0K());
            C166388co A0X2 = C17880vN.A0X(r13);
            A007.getClass();
            A0X2.quotedPaymentInfo_ = A007;
            A0X2.bitField0_ |= 524288;
        }
        if (C18020vd.A05(C18040vf.A02, this.A00, 1954) && (A002 = AnonymousClass25B.A00(r14)) != null && A002.A0L != null && (A003 = AnonymousClass25B.A00(r14)) != null) {
            C23624Bmt A0N2 = C166108cM.DEFAULT_INSTANCE.A0N();
            AnonymousClass8pG r6 = A003.A0A;
            if (r6 != null) {
                C23624Bmt A0N3 = C166178cT.DEFAULT_INSTANCE.A0N();
                AnonymousClass8X7 A008 = C166408cq.A00();
                A008.A0H(A003.A0L);
                A008.A0K(A003.A0Q);
                A008.A0J(C22971Dz.A06(A003.A0C));
                C166408cq A0Z = AnonymousClass8BU.A0Z(A008, A0N3);
                C166178cT r15 = (C166178cT) A0N3.A00;
                A0Z.getClass();
                r15.messageKey_ = A0Z;
                r15.bitField0_ |= 64;
                boolean z = r6 instanceof C170308pe;
                if (z || (r6 instanceof C170298pd) || !(r6 instanceof C170318pf)) {
                    i = 0;
                } else {
                    i = ((C170318pf) r6).A02;
                }
                C166178cT r9 = (C166178cT) C17880vN.A0G(A0N3);
                r9.bitField0_ |= 256;
                r9.previousType_ = (long) i;
                C166178cT r92 = (C166178cT) C17880vN.A0G(A0N3);
                r92.bitField0_ |= 128;
                r92.previousStatus_ = (long) r6.A09();
                long A0A = r6.A0A();
                C166178cT r93 = (C166178cT) C17880vN.A0G(A0N3);
                r93.bitField0_ |= 8;
                r93.expiryTimestamp_ = A0A;
                String valueOf = String.valueOf(r6.A08());
                C166178cT r16 = (C166178cT) C17880vN.A0G(A0N3);
                r16.bitField0_ |= 4;
                r16.counter_ = valueOf;
                int i3 = A003.A04;
                C166178cT r17 = (C166178cT) C17880vN.A0G(A0N3);
                r17.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r17.version_ = i3;
                C23624Bmt A0N4 = AnonymousClass8ZR.DEFAULT_INSTANCE.A0N();
                C20280AEo aEo = r6.A02;
                if (aEo != null) {
                    String str = aEo.A01;
                    AnonymousClass8ZR r18 = (AnonymousClass8ZR) C17880vN.A0G(A0N4);
                    r18.bitField0_ |= 1;
                    r18.id_ = str;
                    AnonymousClass8X7 A009 = C166408cq.A00();
                    A009.A0H(aEo.A02);
                    A009.A0K(false);
                    C166408cq A0Z2 = AnonymousClass8BU.A0Z(A009, A0N4);
                    AnonymousClass8ZR r19 = (AnonymousClass8ZR) A0N4.A00;
                    A0Z2.getClass();
                    r19.messageKey_ = A0Z2;
                    r19.bitField0_ |= 2;
                    AnonymousClass8ZR r0 = (AnonymousClass8ZR) A0N4.A0C();
                    C166178cT r110 = (C166178cT) C17880vN.A0G(A0N3);
                    r0.getClass();
                    r110.order_ = r0;
                    r110.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                }
                C22565BDa bDa = r6.A00;
                if (bDa != null) {
                    AnonymousClass8X0 r7 = (AnonymousClass8X0) C164948aK.DEFAULT_INSTANCE.A0N();
                    r7.A0H((long) bDa.getValue());
                    ARR arr = (ARR) bDa;
                    r7.A0G(arr.A00);
                    r7.A0I(AnonymousClass8BU.A0n(arr));
                    C164948aK r02 = (C164948aK) r7.A0C();
                    C166178cT r111 = (C166178cT) C17880vN.A0G(A0N3);
                    r02.getClass();
                    r111.amount_ = r02;
                    r111.bitField0_ |= 1;
                }
                if (z) {
                    C23624Bmt A0N5 = C164138Xr.DEFAULT_INSTANCE.A0N();
                    C18070vi.A0X(A0N5);
                    A0N = C164668Zs.DEFAULT_INSTANCE.A0N();
                    C23577Bm6 A09 = AnonymousClass8BS.A09(A0N5, A0N);
                    r1 = (C164668Zs) A0N.A00;
                    A09.getClass();
                    r1.metadataValue_ = A09;
                    i2 = 2;
                } else {
                    if (r6 instanceof C170318pf) {
                        C170318pf r62 = (C170318pf) r6;
                        C23624Bmt A0N6 = C165758bi.DEFAULT_INSTANCE.A0N();
                        C18070vi.A0X(A0N6);
                        String str2 = r62.A0T;
                        C165758bi r112 = (C165758bi) C17880vN.A0G(A0N6);
                        str2.getClass();
                        r112.bitField0_ |= 4;
                        r112.senderHandle_ = str2;
                        String str3 = r62.A0R;
                        C165758bi r113 = (C165758bi) C17880vN.A0G(A0N6);
                        str3.getClass();
                        r113.bitField0_ |= 2;
                        r113.receiverHandle_ = str3;
                        long j = r62.A05;
                        C165758bi r63 = (C165758bi) C17880vN.A0G(A0N6);
                        r63.bitField0_ |= 1;
                        r63.startTimestamp_ = j;
                        A0N = C164668Zs.DEFAULT_INSTANCE.A0N();
                        C23577Bm6 A092 = AnonymousClass8BS.A09(A0N6, A0N);
                        r1 = (C164668Zs) A0N.A00;
                        A092.getClass();
                        r1.metadataValue_ = A092;
                        i2 = 1;
                    }
                    C166178cT r03 = (C166178cT) A0N3.A0C();
                    C166108cM r114 = (C166108cM) C17880vN.A0G(A0N2);
                    r03.getClass();
                    r114.metadata_ = r03;
                    r114.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
                }
                r1.metadataValueCase_ = i2;
                C164668Zs r04 = (C164668Zs) A0N.A0C();
                if (r04 != null) {
                    C166178cT r115 = (C166178cT) C17880vN.A0G(A0N3);
                    r115.marketMetadata_ = r04;
                    r115.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                }
                C166178cT r032 = (C166178cT) A0N3.A0C();
                C166108cM r1142 = (C166108cM) C17880vN.A0G(A0N2);
                r032.getClass();
                r1142.metadata_ = r032;
                r1142.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
            }
            if (A003.A0K != null) {
                String A012 = AnonymousClass25B.A01(r14);
                C166108cM r116 = (C166108cM) C17880vN.A0G(A0N2);
                A012.getClass();
                r116.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                r116.transactionId_ = A012;
            }
            String str4 = A003.A0I;
            C166108cM r117 = (C166108cM) C17880vN.A0G(A0N2);
            str4.getClass();
            r117.bitField0_ |= 8;
            r117.currency_ = str4;
            String str5 = A003.A0H;
            if (str5 != null) {
                C166108cM r118 = (C166108cM) C17880vN.A0G(A0N2);
                r118.bitField0_ |= 4;
                r118.credentialId_ = str5;
            }
            UserJid userJid = A003.A0E;
            if (userJid != null) {
                String A0d = AnonymousClass8BS.A0d(A0N2, userJid);
                C166108cM r119 = (C166108cM) A0N2.A00;
                A0d.getClass();
                r119.bitField0_ |= 256;
                r119.senderJid_ = A0d;
            }
            UserJid userJid2 = A003.A0D;
            if (userJid2 != null) {
                String A0d2 = AnonymousClass8BS.A0d(A0N2, userJid2);
                C166108cM r120 = (C166108cM) A0N2.A00;
                A0d2.getClass();
                r120.bitField0_ |= 128;
                r120.recieverJid_ = A0d2;
            }
            long j2 = (long) A003.A02;
            C166108cM r5 = (C166108cM) C17880vN.A0G(A0N2);
            r5.bitField0_ |= 512;
            r5.status_ = j2;
            String str6 = A003.A0J;
            if (str6 != null) {
                C166108cM r121 = (C166108cM) C17880vN.A0G(A0N2);
                r121.bitField0_ |= 16;
                r121.errorCode_ = str6;
            }
            String str7 = A003.A0F;
            if (str7 != null) {
                C166108cM r122 = (C166108cM) C17880vN.A0G(A0N2);
                r122.bitField0_ |= 2;
                r122.bankTransactionId_ = str7;
            }
            long j3 = A003.A05;
            C166108cM r52 = (C166108cM) C17880vN.A0G(A0N2);
            r52.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
            r52.timestamp_ = j3;
            int i4 = A003.A03;
            C166108cM r123 = (C166108cM) C17880vN.A0G(A0N2);
            r123.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
            r123.type_ = i4;
            String str8 = A003.A0L;
            C166108cM r124 = (C166108cM) C17880vN.A0G(A0N2);
            str8.getClass();
            r124.bitField0_ |= 64;
            r124.messageStanzaId_ = str8;
            C166388co A0P = AnonymousClass8BS.A0P(r13);
            C166108cM r125 = (C166108cM) A0N2.A0C();
            int i5 = C166388co.AGENT_ID_FIELD_NUMBER;
            r125.getClass();
            A0P.paymentTransactionInfo_ = r125;
            A0P.bitField1_ |= 64;
        }
    }

    public void C1B(C193069pU r37, C166388co r38, AnonymousClass206 r39) {
        AnonymousClass1KJ r16;
        String str;
        int i;
        BD1 A002;
        C166388co r0 = r38;
        AnonymousClass206 r6 = r39;
        boolean A17 = C18070vi.A17(r0, r6);
        try {
            C166108cM r5 = r0.paymentTransactionInfo_;
            if (r5 == null) {
                r5 = C166108cM.DEFAULT_INSTANCE;
            }
            C18070vi.A0X(r5);
            String str2 = r5.transactionId_;
            if (str2 != null && str2.length() != 0) {
                AnonymousClass25B.A04(r6, str2);
                C166178cT r7 = r5.metadata_;
                if (r7 == null) {
                    r7 = C166178cT.DEFAULT_INSTANCE;
                }
                C164668Zs r02 = r7.marketMetadata_;
                if (r02 == null) {
                    r02 = C164668Zs.DEFAULT_INSTANCE;
                }
                int i2 = r02.metadataValueCase_;
                if (i2 == 2) {
                    r16 = AnonymousClass1KL.A0A;
                    C63572tK r03 = C63572tK.A0E;
                    str = "BR";
                    i = 2;
                } else if (i2 == A17) {
                    r16 = AnonymousClass1KL.A0B;
                    C63572tK r04 = C63572tK.A0E;
                    str = "IN";
                    i = 1;
                } else {
                    throw AnonymousClass000.A0n("Payment Market not supported");
                }
                int i3 = r5.type_;
                C22941Dw r05 = UserJid.Companion;
                UserJid A032 = C22941Dw.A03(r5.senderJid_);
                UserJid A033 = C22941Dw.A03(r5.recieverJid_);
                String str3 = r5.currency_;
                C164948aK r06 = r7.amount_;
                if (r06 == null) {
                    r06 = C164948aK.DEFAULT_INSTANCE;
                }
                BigDecimal bigDecimal = new BigDecimal(r06.value_);
                C164948aK r07 = r7.amount_;
                if (r07 == null) {
                    r07 = C164948aK.DEFAULT_INSTANCE;
                }
                AnonymousClass1KN r8 = new AnonymousClass1KN(bigDecimal, r07.offset_);
                long j = r5.timestamp_;
                String str4 = r5.transactionId_;
                int i4 = (int) r5.status_;
                long j2 = r7.lastStatusTimestamp_;
                String str5 = r5.credentialId_;
                String str6 = r5.errorCode_;
                String str7 = r5.bankTransactionId_;
                AnonymousClass1KN r17 = r8;
                AW0 aw0 = new AW0(r16, r17, A032, A033, str3, str4, str5, str6, str7, r7.collectRequestId_, str, i3, i4, r7.version_, i, 0, j, j2);
                C57312is A04 = this.A01.A04(str);
                if (!(A04 == null || (A002 = A04.A00(AnonymousClass8BS.A0j(r16))) == null)) {
                    aw0.A0A = A002.BdL();
                }
                aw0.A0L = r5.messageStanzaId_;
                AnonymousClass25B.A02(aw0, r6);
            }
        } catch (AnonymousClass11T unused) {
            Log.e("Invalid Jid in payment transaction");
        }
    }

    public AUX(AnonymousClass1SI r1, C18030ve r2, AnonymousClass1QS r3, C189509jM r4) {
        C18070vi.A0s(r2, r3, r4, r1);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A02 = r1;
    }
}
