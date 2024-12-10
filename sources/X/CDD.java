package X;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLException;

public abstract class CDD {
    public static void A00(C27006DPc dPc, byte[] bArr, boolean z) {
        Set set;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s = wrap.getShort();
        wrap.get(new byte[32]);
        byte[] bArr2 = new byte[((short) ((short) BE6.A0G(wrap)))];
        wrap.get(bArr2);
        short s2 = wrap.getShort();
        byte b = wrap.get();
        C25728Cky cky = new C25728Cky(C26287Cwn.A0D(wrap));
        C62 A00 = cky.A00(43);
        if (A00 != null) {
            Set set2 = CID.A01;
            byte[] bArr3 = A00.A01;
            if (set2.contains(Short.valueOf((short) C26287Cwn.A02(bArr3)))) {
                byte[] bArr4 = dPc.A0n;
                if (bArr4 == null || C26287Cwn.A06(bArr3, bArr4)) {
                    if (z) {
                        set = CID.A03;
                    } else {
                        set = CID.A04;
                    }
                    HashSet A12 = AnonymousClass8BR.A12(cky.A03.keySet());
                    A12.removeAll(set);
                    if (A12.size() != 0) {
                        throw BE9.A0b("Unexpected extension provided by the server", (byte) 47);
                    }
                    Short sh = CID.A00;
                    if (s != 771) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        AnonymousClass000.A1E("Unexpected protocol version", " != ", A10, s);
                        throw BE9.A0b(C17890vO.A0V(sh, A10), (byte) 80);
                    } else if (C26287Cwn.A06(dPc.A0l, bArr2)) {
                        short s3 = dPc.A0V;
                        if (s3 != 0 && s3 != s2) {
                            throw BE9.A0b("Cipher suite in server hello does not match HelloRetryRequest cipher suite.", (byte) 47);
                        } else if (s2 != 4865) {
                            throw BE9.A0b("Server selected invalid cipher suite", (byte) 80);
                        } else if (b == 0) {
                            C62 A002 = cky.A00(51);
                            if (A002 != null) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(A002.A01);
                                short s4 = wrap2.getShort();
                                if (s4 == 29) {
                                    if (!z) {
                                        byte[] bArr5 = new byte[2];
                                        wrap2.get(bArr5);
                                        int A02 = C26287Cwn.A02(bArr5);
                                        if (A02 == 32) {
                                            byte[] bArr6 = new byte[32];
                                            dPc.A0m = bArr6;
                                            wrap2.get(bArr6);
                                        } else {
                                            StringBuilder A102 = AnonymousClass000.A10();
                                            BEA.A1P("Key length mismatch ", " != ", A102, A02, 32);
                                            throw BE9.A0b(A102.toString(), (byte) 80);
                                        }
                                    }
                                    C62 A003 = cky.A00(41);
                                    if (!(dPc.A0C.A01 == null || A003 == null)) {
                                        if (C26287Cwn.A02(A003.A01) <= 0) {
                                            dPc.A0b = true;
                                            dPc.A0g = true;
                                        } else {
                                            throw BE9.A0b(AnonymousClass001.A1E(A003, "Incorrect PSK index value chosen by server ", AnonymousClass000.A10()), (byte) 80);
                                        }
                                    }
                                    if (z) {
                                        dPc.A0n = bArr3;
                                        dPc.A0V = s2;
                                        dPc.A0W = s4;
                                        C62 A004 = cky.A00(44);
                                        if (A004 != null) {
                                            dPc.A0k = C26287Cwn.A0D(ByteBuffer.wrap(A004.A01));
                                        }
                                    }
                                    if (wrap.hasRemaining()) {
                                        throw BE9.A0b("Server Hello has more bytes than expected.", (byte) 80);
                                    }
                                    return;
                                }
                                throw BE9.A0b("Key share algorithm mismatch.", (byte) 80);
                            }
                            throw BE9.A0b("Key share extension not found.", (byte) 109);
                        } else {
                            throw BE9.A0b("Invalid compression method.0", (byte) 80);
                        }
                    } else {
                        throw BE9.A0b("Bad session id", (byte) 80);
                    }
                } else {
                    throw BE9.A0b("Supported version in server hello does not match HelloRetryRequest supported version.", (byte) 47);
                }
            } else {
                throw new C219718c(new SSLException("Server sent an unsupported version."), (byte) 110);
            }
        } else {
            throw BE9.A0b("Supported version extension not found.", (byte) 109);
        }
    }
}
