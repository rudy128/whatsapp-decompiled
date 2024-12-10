package X;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AQr  reason: case insensitive filesystem */
public final class C20581AQr implements C72123Ks {
    public static final C18100vl A0B = C21527Ala.A00(4);
    public static final C18100vl A0C = C21527Ala.A00(3);
    public final AnonymousClass190 A00;
    public final C60002nE A01;
    public final AnonymousClass1P3 A02;
    public final AnonymousClass121 A03;
    public final AnonymousClass2HL A04;
    public final AnonymousClass1N9 A05;
    public final C173578vJ A06;
    public final C190799lX A07;
    public final C63362sw A08;
    public final boolean A09;
    public final Integer A0A;

    public C20581AQr(AnonymousClass190 r4, C60002nE r5, AnonymousClass1P3 r6, AnonymousClass121 r7, AnonymousClass2HL r8, AnonymousClass1N9 r9, AnonymousClass1N7 r10, C190799lX r11, C63362sw r12, Integer num, boolean z) {
        C18070vi.A0x(r11, r7, r4, r9, r6);
        C18070vi.A0d(r10, 11);
        this.A01 = r5;
        this.A0A = num;
        this.A08 = r12;
        this.A04 = r8;
        this.A09 = z;
        this.A07 = r11;
        this.A03 = r7;
        this.A00 = r4;
        this.A05 = r9;
        this.A02 = r6;
        this.A06 = (C173578vJ) AnonymousClass1N7.A00(r10, 0, r12.A04);
    }

    public void BcN(byte[] bArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DecryptionCallbackInterop/handlePlaintext message=");
        C63362sw r4 = this.A08;
        A10.append(r4);
        A10.append(" sendReceipt=");
        boolean z = this.A09;
        C17900vP.A0r(A10, z);
        Integer num = this.A0A;
        if (num == null || num.intValue() != 4) {
            bArr = A3S.A02(this.A04, this.A06, bArr);
        }
        if (bArr == null) {
            AnonymousClass190 r3 = this.A00;
            StringBuilder A102 = AnonymousClass000.A10();
            C63362sw.A01(r4, "message.key=", A102);
            r3.A0G("DecryptionCallbackInterop/handlePlaintext/invalid-plaintext", A102.toString(), false);
            return;
        }
        try {
            C165928bz r8 = (C165928bz) C23577Bm6.A07(C165928bz.DEFAULT_INSTANCE, bArr);
            C18070vi.A0b(r8);
            C23577Bm6[] bm6Arr = new C23577Bm6[5];
            bm6Arr[0] = r8;
            C166188cU r0 = r8.imageMessage_;
            if (r0 == null) {
                r0 = C166188cU.DEFAULT_INSTANCE;
            }
            bm6Arr[1] = r0;
            C166168cS r02 = r8.videoMessage_;
            if (r02 == null) {
                r02 = C166168cS.DEFAULT_INSTANCE;
            }
            bm6Arr[2] = r02;
            C166058cH r03 = r8.audioMessage_;
            if (r03 == null) {
                r03 = C166058cH.DEFAULT_INSTANCE;
            }
            bm6Arr[3] = r03;
            C166158cR r04 = r8.documentMessage_;
            if (r04 == null) {
                r04 = C166158cR.DEFAULT_INSTANCE;
            }
            List A0O = C18070vi.A0O(r04, bm6Arr, 4);
            if (!(A0O instanceof Collection) || !A0O.isEmpty()) {
                Iterator it = A0O.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        int i = ((Field) A0B.getValue()).getInt(((Field) A0C.getValue()).get(it.next()));
                        if (i >= 1) {
                            StringBuilder A103 = AnonymousClass000.A10();
                            C63362sw.A01(r4, "DecryptionCallbackInterop/validateUnknownFields axolotl received unknown fields; message.key=", A103);
                            C17900vP.A0k(" numUnknownFields=", A103, i);
                            A3S.A01(this.A04, this.A06, 70);
                            break;
                        }
                    } catch (IllegalAccessException e) {
                        C17900vP.A0X(e, "DecryptionCallbackInterop/validateUnknownFields/error unknown-message-count, exception=", AnonymousClass000.A10());
                        throw AnonymousClass8BR.A0v(e);
                    }
                }
            }
            if ((r8.bitField0_ & 2) != 0) {
                AnonymousClass8ZM r05 = r8.senderKeyDistributionMessage_;
                if (r05 == null) {
                    r05 = AnonymousClass8ZM.DEFAULT_INSTANCE;
                }
                C18070vi.A0X(r05);
                return;
            }
            try {
                C190799lX r32 = this.A07;
                C195239t1 r6 = new C195239t1(C22971Dz.A00(r4.A0Y), r8, r4.A0B, r4.A0R, r4.A0X);
                Iterator A0s = AnonymousClass8BW.A0s(r32.A01);
                while (A0s.hasNext()) {
                    AnonymousClass206 CBH = ((C436920n) ((AnonymousClass1D6) A0s.next()).second).CBH(r6);
                    if (CBH != null) {
                        r4.A0A(CBH);
                        this.A03.BBY(CBH);
                        return;
                    }
                }
            } catch (C32701hc e2) {
                AnonymousClass190 r33 = this.A00;
                StringBuilder A104 = AnonymousClass000.A10();
                C63362sw.A01(r4, "message.key=", A104);
                r33.A0E("DecryptionCallbackInterop/handlePlaintext/invalid-fmessage", A104.toString(), e2);
            }
            if (z) {
                this.A05.A0E(r4, 491);
            }
        } catch (AnonymousClass1PN e3) {
            AnonymousClass190 r2 = this.A00;
            StringBuilder A105 = AnonymousClass000.A10();
            C63362sw.A01(r4, "message.key=", A105);
            r2.A0E("DecryptionCallbackInterop/handlePlaintext/invalid-protobuf", A105.toString(), e3);
        }
    }
}
