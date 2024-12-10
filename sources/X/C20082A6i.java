package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: X.A6i  reason: case insensitive filesystem */
public class C20082A6i {
    public C166068cI A00;

    public C62202r0 A04() {
        try {
            C166068cI r1 = this.A00;
            if ((r1.bitField0_ & 4) != 0) {
                return new C62202r0(r1.remoteIdentityPublic_.A06());
            }
            return null;
        } catch (AnonymousClass1P8 e) {
            A02(e);
            return null;
        }
    }

    public static C58472kk A00(C21344AiX aiX, C20082A6i a6i) {
        int i = 0;
        for (C165398b5 r2 : a6i.A00.receiverChains_) {
            try {
                if (C20065A5o.A00(r2.senderRatchetKey_).equals(aiX)) {
                    return new C58472kk(r2, Integer.valueOf(i));
                }
                i++;
            } catch (AnonymousClass1P8 e) {
                A02(e);
            }
        }
        return null;
    }

    public static void A02(Throwable th) {
        String str = "";
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof UnknownHostException)) {
                th2 = th2.getCause();
                if (th2 == null) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    break;
                }
            } else {
                break;
            }
        }
        if (AnonymousClass1DW.A00 != null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SignalProtocolLogger (");
            A10.append("SessionRecordV2");
            C17900vP.A0g("): ", str, A10);
        }
    }

    public C62202r0 A03() {
        try {
            return new C62202r0(this.A00.localIdentityPublic_.A06());
        } catch (AnonymousClass1P8 e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public A4X A05() {
        C166068cI r2 = this.A00;
        C165398b5 r0 = r2.senderChain_;
        if (r0 == null) {
            r0 = C165398b5.DEFAULT_INSTANCE;
        }
        C164638Zp r1 = r0.chainKey_;
        if (r1 == null) {
            r1 = C164638Zp.DEFAULT_INSTANCE;
        }
        int i = r2.sessionVersion_;
        if (i == 0) {
            i = 2;
        }
        return new A4X(C198859z2.A00(i), r1.key_.A06(), r1.index_);
    }

    public void A06() {
        C23624Bmt A07 = AnonymousClass8BS.A07(this.A00);
        C166068cI r2 = (C166068cI) A07.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r2.bitField0_ |= 1;
        r2.sessionVersion_ = 3;
        A01(A07, this);
    }

    public void A07(int i) {
        C23624Bmt A07 = AnonymousClass8BS.A07(this.A00);
        C166068cI r1 = (C166068cI) A07.A00;
        int i2 = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 256;
        r1.localRegistrationId_ = i;
        A01(A07, this);
    }

    public void A08(int i) {
        C23624Bmt A07 = AnonymousClass8BS.A07(this.A00);
        C166068cI r1 = (C166068cI) A07.A00;
        int i2 = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 128;
        r1.remoteRegistrationId_ = i;
        A01(A07, this);
    }

    public void A09(C62202r0 r5) {
        C23624Bmt A0O = this.A00.A0O();
        C23581BmB A03 = C17900vP.A03(A0O, r5.A00.A00());
        C166068cI r1 = (C166068cI) A0O.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 2;
        r1.localIdentityPublic_ = A03;
        A01(A0O, this);
    }

    public void A0A(C62202r0 r5) {
        C23624Bmt A0O = this.A00.A0O();
        C23581BmB A03 = C17900vP.A03(A0O, r5.A00.A00());
        C166068cI r1 = (C166068cI) A0O.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 4;
        r1.remoteIdentityPublic_ = A03;
        A01(A0O, this);
    }

    public void A0C(C185259cI r6, A4X a4x) {
        AnonymousClass8X5 r2 = (AnonymousClass8X5) C164638Zp.DEFAULT_INSTANCE.A0N();
        r2.A0H(AnonymousClass8BR.A0F(a4x.A02, 0));
        r2.A0G(a4x.A00);
        C163848Wo r3 = (C163848Wo) C165398b5.DEFAULT_INSTANCE.A0N();
        C23581BmB A0A = AnonymousClass8BU.A0A(r3, r6.A01.A00(), 0);
        C165398b5 r1 = (C165398b5) r3.A00;
        r1.bitField0_ |= 1;
        r1.senderRatchetKey_ = A0A;
        C23581BmB A03 = C17900vP.A03(r3, r6.A00.A00);
        C165398b5 r12 = (C165398b5) r3.A00;
        r12.bitField0_ |= 2;
        r12.senderRatchetKeyPrivate_ = A03;
        r3.A0G((C164638Zp) r2.A0C());
        C165398b5 r32 = (C165398b5) r3.A0C();
        C23624Bmt A07 = AnonymousClass8BS.A07(this.A00);
        C166068cI r13 = (C166068cI) A07.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r32.getClass();
        r13.senderChain_ = r32;
        r13.bitField0_ |= 32;
        A01(A07, this);
    }

    public void A0D(C190379kq r5) {
        C23624Bmt A0O = this.A00.A0O();
        C23581BmB A03 = C17900vP.A03(A0O, r5.A00);
        C166068cI r1 = (C166068cI) A0O.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= 8;
        r1.rootKey_ = A03;
        A01(A0O, this);
    }

    public void A0E(byte[] bArr) {
        C23624Bmt A0O = this.A00.A0O();
        C23581BmB A03 = C17900vP.A03(A0O, bArr);
        C166068cI r1 = (C166068cI) A0O.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        r1.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        r1.aliceBaseKey_ = A03;
        A01(A0O, this);
    }

    public C20082A6i() {
        A01(C166068cI.DEFAULT_INSTANCE.A0N(), this);
    }

    public static void A01(C23624Bmt bmt, C20082A6i a6i) {
        a6i.A00 = (C166068cI) bmt.A0C();
    }

    public void A0B(C21344AiX aiX, A4X a4x) {
        C164638Zp A002 = AnonymousClass8X5.A00(a4x);
        C163848Wo r3 = (C163848Wo) C165398b5.DEFAULT_INSTANCE.A0N();
        r3.A0G(A002);
        C23581BmB A03 = C17900vP.A03(r3, aiX.A00());
        C165398b5 r1 = (C165398b5) r3.A00;
        r1.bitField0_ |= 1;
        r1.senderRatchetKey_ = A03;
        C23577Bm6 A0C = r3.A0C();
        C23624Bmt A07 = AnonymousClass8BS.A07(this.A00);
        C166068cI r2 = (C166068cI) A07.A00;
        int i = C166068cI.ALICEBASEKEY_FIELD_NUMBER;
        A0C.getClass();
        EE9 ee9 = r2.receiverChains_;
        if (!((C27296DbR) ee9).A00) {
            ee9 = C23577Bm6.A09(ee9);
            r2.receiverChains_ = ee9;
        }
        ee9.add(A0C);
        C166068cI r0 = (C166068cI) A07.A0C();
        this.A00 = r0;
        if (r0.receiverChains_.size() > 5) {
            C23624Bmt A072 = AnonymousClass8BS.A07(this.A00);
            C166068cI r32 = (C166068cI) A072.A00;
            EE9 ee92 = r32.receiverChains_;
            if (!((C27296DbR) ee92).A00) {
                ee92 = C23577Bm6.A09(ee92);
                r32.receiverChains_ = ee92;
            }
            ee92.remove(0);
            A01(A072, this);
        }
    }
}
