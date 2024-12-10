package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.30L  reason: invalid class name */
public final class AnonymousClass30L implements C72123Ks {
    public final C72123Ks A00;
    public final AnonymousClass1N9 A01;
    public final AnonymousClass1PT A02;
    public final C55952gd A03;
    public final C63362sw A04;
    public final Integer A05;

    public AnonymousClass30L(C72123Ks r2, AnonymousClass1N9 r3, AnonymousClass1PT r4, C55952gd r5, C63362sw r6, Integer num) {
        C18070vi.A0g(r3, 4, r4);
        C18070vi.A0d(r5, 6);
        this.A05 = num;
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
    }

    private final void A00(int i) {
        C63362sw r3 = this.A04;
        r3.A0A = null;
        this.A01.A0F(r3, "invalid-message-secret-message", (String) null);
        this.A02.A0J(r3, this.A05, i);
    }

    public void BcN(byte[] bArr) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DecryptionCallbackMessageSecret/handlePlaintext/message=");
        C63362sw r3 = this.A04;
        C17900vP.A0b(r3.A0B, A10);
        byte[] bArr2 = bArr;
        if (bArr == null) {
            StringBuilder A102 = AnonymousClass000.A10();
            C63362sw.A01(r3, "DecryptionCallbackMessageSecret/handlePlaintext/invalid plaintext; message.key=", A102);
            Log.w(A102.toString());
            A00(0);
            return;
        }
        Class<AnonymousClass350> cls = AnonymousClass350.class;
        try {
            AnonymousClass350 r1 = (AnonymousClass350) C63362sw.A00(r3, cls);
            C22931Dv r0 = AnonymousClass1BI.A00;
            AnonymousClass1BI A002 = C22931Dv.A00(r3.A04());
            if (r1 != null) {
                C55952gd r5 = this.A03;
                StringBuilder A103 = AnonymousClass000.A10();
                A103.append("DecryptionCallbackBotMessage/handlePlaintext key=");
                C17900vP.A0b(r3.A0B, A103);
                AnonymousClass350 r8 = (AnonymousClass350) C63362sw.A00(r3, cls);
                if (r8 != null) {
                    AnonymousClass00H r12 = r5.A03;
                    AnonymousClass206 A012 = ((C59572mW) r12.get()).A01(r8, r3.A0B.A00);
                    if (A012 == null) {
                        ((C57212ii) r5.A06.get()).A00(r8, r3, bArr2, 1);
                    }
                    String str = r3.A0h;
                    UserJid A052 = r3.A05();
                    String str2 = r8.A03;
                    byte[] A003 = ((C57702jV) r5.A02.get()).A00(r8, r3.A03(), A052, A012, str, str2, bArr2);
                    if (A003 != null) {
                        if (r8.A00 != null && C22971Dz.A0d(r3.A0B.A00)) {
                            AnonymousClass205 r7 = r3.A0B;
                            r3.A0B(AnonymousClass205.A01(((C59572mW) r12.get()).A00(r8, r7.A00), r7.A01, false));
                        }
                        String str3 = r8.A02;
                        if (!(str3 == null || str3.length() == 0 || str2 == null || str2.length() == 0)) {
                            AnonymousClass205 A013 = AnonymousClass205.A01(((C59572mW) r12.get()).A00(r8, r3.A0B.A00), str2, false);
                            if (AnonymousClass1W2.A01(((C59392mE) r5.A07.get()).A01(A013), r5.A05) == null) {
                                AnonymousClass206 r2 = new AnonymousClass206(A013, 98, r3.A0X);
                                if (!C42701yb.A01(A013.A00)) {
                                    r2.A0d(r3.A05());
                                }
                                ((AnonymousClass122) r5.A04.get()).BBZ(r2, -1);
                            }
                        }
                        if ("first".equals(str3)) {
                            AnonymousClass1Q6 r13 = r5.A00;
                            AnonymousClass205 r02 = r3.A0B;
                            ConcurrentHashMap concurrentHashMap = r13.A03;
                            if (!concurrentHashMap.contains(r02)) {
                                AnonymousClass212 A0B = r5.A01.A0B(r3.A0B);
                                if (A0B != null) {
                                    StringBuilder A104 = AnonymousClass000.A10();
                                    A104.append("DecryptionCallbackBotMessage/handlePlaintext addon exists, ignoring. addonKey=");
                                    A104.append(A0B.A0v);
                                    AnonymousClass206.A07(A0B, " type=", A104);
                                    A104.append(" rowId=");
                                    C17890vO.A16(A104, A0B.A0x);
                                } else {
                                    concurrentHashMap.put(r3.A0B, AnonymousClass000.A0i());
                                }
                            }
                        }
                        AnonymousClass1N9 r6 = this.A01;
                        String str4 = r3.A0R;
                        C17960vV.A0G(C42701yb.A01(r3.A05()), "Use it only for incoming bot messages");
                        AnonymousClass1BI r72 = r3.A0B.A00;
                        if (str4 == null || C42701yb.A01(r72) || !C22971Dz.A0d(r72)) {
                            r6.A0F(r3, str4, (String) null);
                        } else {
                            long j = r3.A04;
                            C58762lD r52 = new C58762lD();
                            r52.A06 = "message";
                            r52.A08 = str;
                            r52.A00 = j;
                            r52.A02 = r3.A03();
                            r52.A03 = C22941Dw.A00(r72);
                            r52.A09 = str4;
                            AnonymousClass1N9.A02(C63902ts.A02(r6.A00, r6.A04, r52.A00()), r6);
                        }
                        this.A00.BcN(A003);
                        return;
                    } else if (A012 != null) {
                        Log.w("DecryptionCallbackBotMessage/handlePlaintext failed to decrypt bot message");
                        ((C57212ii) r5.A06.get()).A00(r8, r3, bArr2, 2);
                    }
                }
            } else if (C42701yb.A01(A002)) {
                StringBuilder A105 = AnonymousClass000.A10();
                C63362sw.A01(r3, "DecryptionCallbackMessageSecret/handlePlaintext/missing bot metadata; message.key=", A105);
                C17890vO.A0w(A105);
                A00(0);
                return;
            }
            StringBuilder A106 = AnonymousClass000.A10();
            C63362sw.A01(r3, "DecryptionCallbackMessageSecret/handlePlaintext/decryption failed; message.key=", A106);
            C17890vO.A0w(A106);
            A00(51);
        } catch (Exception e) {
            StringBuilder A107 = AnonymousClass000.A10();
            C63362sw.A01(r3, "DecryptionCallbackMessageSecret/handlePlaintext/error processing e2e message secret; message.key=", A107);
            C17880vN.A1M(A107, e);
            A00(34);
        }
    }
}
