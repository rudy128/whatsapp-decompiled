package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.37b  reason: invalid class name and case insensitive filesystem */
public final class C694037b implements AnonymousClass3M6, AnonymousClass3LF {
    public final AnonymousClass11S A00;
    public final AnonymousClass121 A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass1OZ A03;
    public final AnonymousClass1PT A04;

    public long CBC(C29621ca r3) {
        C18070vi.A0d(r3, 0);
        if (r3.A0K("bypassed") != null) {
            return 16;
        }
        return 0;
    }

    public boolean CRi(C63362sw r12, C29621ca r13) {
        UserJid userJid = r12.A0f;
        if (userJid == null || r12.A0Y == null) {
            UserJid A05 = r12.A05();
            if (userJid == null || this.A00.A0O(A05)) {
                String str = r12.A0R;
                if (!"text".equals(str) && !"media".equals(str) && !"pay".equals(str) && !"reaction".equals(str) && !"pin".equals(str) && !"poll".equals(str) && !"medianotify".equals(str) && !"event".equals(str) && !"scheduled-call".equals(str)) {
                    this.A04.A0I(r12, (Integer) null, 8);
                    A00(r12, 490);
                    return false;
                } else if (r13.A0K("body") == null && r13.A0K("media") == null) {
                    return true;
                } else {
                    this.A04.A0I(r12, (Integer) null, 4);
                    A00(r12, 488);
                    Log.e("MessagingInfraMessageStanzaParser/validateIncomingMessageStanza: received plaintext message");
                    this.A01.BBO(C22971Dz.A00(r12.A0Y), r12.A0B, 488, r12.A0X);
                    return false;
                }
            } else {
                throw AnonymousClass1UI.A01("Invalid recipient from non peer device");
            }
        } else {
            throw AnonymousClass1UI.A01("Message cannot have both a recipient and a participant attribute");
        }
    }

    private final void A00(C63362sw r11, int i) {
        AnonymousClass18K r6 = this.A02;
        AnonymousClass1OZ r7 = this.A03;
        String str = r11.A0h;
        Jid jid = r11.A0Z;
        Jid jid2 = r11.A0Y;
        String str2 = r11.A0R;
        boolean z = r11.A0S;
        if (i != 490) {
            i = 487;
        }
        C58762lD r3 = new C58762lD();
        Jid jid3 = jid;
        if (z) {
            jid3 = jid2;
        }
        r3.A02 = jid3;
        r3.A06 = "message";
        r3.A08 = str;
        r3.A09 = str2;
        if (!z) {
            jid = jid2;
        }
        r3.A01 = jid;
        r3.A01(String.valueOf(i));
        r3.A00 = -1;
        r7.A0K(r3.A00());
        AnonymousClass2FH r0 = new AnonymousClass2FH();
        r0.A00 = "message";
        r0.A01 = str2;
        r6.CC7(r0);
    }

    public /* synthetic */ B5K CBD(C194979sb r2, C29621ca r3) {
        return null;
    }

    public C694037b(AnonymousClass11S r1, AnonymousClass121 r2, AnonymousClass18K r3, AnonymousClass1OZ r4, AnonymousClass1PT r5) {
        C18070vi.A0w(r1, r3, r4, r5, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void CB9(C63362sw r4, C29621ca r5) {
        Integer num;
        C18070vi.A0h(r5, r4);
        String A0Q = r5.A0Q("offline", (String) null);
        String A0Q2 = r5.A0Q("dhash", (String) null);
        if (A0Q != null) {
            num = AnonymousClass1YD.A03(A0Q);
        } else {
            num = null;
        }
        r4.A0G = num;
        r4.A0O = A0Q2;
    }

    public void CBF(C63362sw r4, C29621ca r5) {
        C18070vi.A0j(r5, r4);
        byte[] bArr = r5.A01;
        if (C29621ca.A07(r5, "registration") && bArr != null && bArr.length == 4) {
            r4.A0W = bArr;
        } else if (C29621ca.A07(r5, "device-identity")) {
            r4.A0V = bArr;
        }
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
