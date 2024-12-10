package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.8pA  reason: invalid class name */
public final class AnonymousClass8pA extends C123466Uo {
    public final AnonymousClass121 A00;
    public final C35241lt A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public ArrayList A02(AnonymousClass205 r7, int i, long j) {
        C18070vi.A0d(r7, 0);
        return ((ARP) this.A06.get()).A03(r7, 2, i, j);
    }

    public final boolean A04(AnonymousClass206 r6, AnonymousClass206 r7) {
        AnonymousClass206 A0s;
        r6.A0e(r7);
        if (r6.A0K() == null) {
            r6.A0f(r7.A0K());
        }
        AnonymousClass206 A0K = r6.A0K();
        if (A0K == null || (A0s = C108945cZ.A0s(A0K.A0v, C17880vN.A0c(this.A04))) == null) {
            return false;
        }
        A0K.A0l(A0s.A0h);
        A0K.A0n(true);
        return true;
    }

    public ArrayList A01(int i, long j) {
        return ((ARP) this.A06.get()).A02(2, i, j);
    }

    public void A03(List list, Set set) {
        String str;
        List<C195749tq> list2 = list;
        Set set2 = set;
        C18070vi.A0h(list2, set2);
        for (C195749tq r2 : list2) {
            Long l = r2.A07;
            AnonymousClass205 r4 = r2.A05;
            C22941Dw r0 = UserJid.Companion;
            UserJid A012 = C22941Dw.A01(r2.A04);
            AnonymousClass205 r8 = r2.A06;
            UserJid A013 = C22941Dw.A01(r2.A03);
            long j = r2.A02;
            byte[] bArr = r2.A08;
            byte[] bArr2 = r2.A09;
            if (bArr2 != null) {
                try {
                    C164118Xp r7 = (C164118Xp) C23577Bm6.A07(C164118Xp.DEFAULT_INSTANCE, bArr2);
                    if ((r7.bitField0_ & 1) != 0) {
                        String str2 = r7.editTargetId_;
                        C18070vi.A0X(str2);
                        str = C108985cd.A0o(str2, "[^a-zA-Z0-9]");
                        if (l != null || r8 == null || bArr == null) {
                            Log.w("MessageOrphanBotResolver/resolveOrphanedMessageSecretMessages/some required data to decrypt the msg is null");
                        } else {
                            String str3 = r8.A01;
                            C18070vi.A0X(str3);
                            AnonymousClass1BI r12 = r8.A00;
                            AnonymousClass350 r11 = new AnonymousClass350(r12, A013, str3, str, (String) null, (String) null, j);
                            if (r12 != null) {
                                AnonymousClass206 A014 = ((C59572mW) this.A03.get()).A01(r11, r12);
                                String str4 = r4.A01;
                                C18070vi.A0X(str4);
                                byte[] A002 = ((C57702jV) this.A02.get()).A00(r11, r12, A012, A014, str4, str, bArr);
                                if (A002 != null) {
                                    try {
                                        try {
                                            C192879p8 A003 = C196699vU.A00(A3S.A00(A002), new AnonymousClass205(r4), j);
                                            A003.A0A = true;
                                            AnonymousClass206 A0K = AnonymousClass8BV.A0K(A003.A00(), this.A05);
                                            Log.i("MessageOrphanBotResolver/resolveOrphanedMessageSecretMessage/storing decrypted orphan");
                                            if (str != null) {
                                                r4 = AnonymousClass205.A01(r4.A00, str, r4.A02);
                                            }
                                            AnonymousClass206 A015 = AnonymousClass1W2.A01(r4, this.A04);
                                            if (A015 != null) {
                                                if (A015 instanceof AnonymousClass23U) {
                                                    if (str == null && A04(A0K, A015)) {
                                                        this.A00.CQx(A0K, 5);
                                                    }
                                                } else if (str != null && A04(A0K, A015)) {
                                                    C35241lt r1 = this.A01;
                                                    if (AnonymousClass8BV.A1R(A0K)) {
                                                        ((C32691hb) r1.A0B.get()).A03(A0K);
                                                    }
                                                }
                                                set2.add(l);
                                            }
                                        } catch (C32711hd e) {
                                            Log.e("MessageOrphanBotResolver/getProcessedMessage/BadMessage:", e);
                                        }
                                    } catch (AnonymousClass1PN e2) {
                                        Log.w("MessageOrphanBotResolver/getE2EMessageData/invalidProto/", e2);
                                    }
                                }
                            }
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("MessageOrphanBotResolver/resolveOrphanedMessageSecretMessage/processed message is null: ");
                            C17890vO.A19(A10, r4.A01);
                        }
                    }
                } catch (AnonymousClass11T | AnonymousClass1PN e3) {
                    Log.e("MessageOrphanBotResolver/getEditTargetId/unexpected error while processing BotMessageInfo", e3);
                }
            }
            str = null;
            if (l != null) {
            }
            Log.w("MessageOrphanBotResolver/resolveOrphanedMessageSecretMessages/some required data to decrypt the msg is null");
        }
    }

    public AnonymousClass8pA(AnonymousClass121 r1, C35241lt r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r5, r1, r6);
        C18070vi.A0l(r7, r2);
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r7;
        this.A01 = r2;
    }

    public String A00() {
        return "MessageOrphanBotResolver";
    }
}
