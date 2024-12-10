package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2rV  reason: invalid class name and case insensitive filesystem */
public final class C62502rV {
    public C53552ci A00;
    public final long A01;
    public final AnonymousClass1BI A02;
    public final UserJid A03;
    public final String A04;

    public static final void A00(C29621ca r7, C62502rV r8, List list) {
        synchronized (r8) {
            C53552ci r0 = r8.A00;
            if (r0 != null) {
                C31911gK r6 = r0.A00;
                C60132nR r5 = r0.A01;
                Set set = r6.A09;
                synchronized (set) {
                    set.remove(r5);
                }
                if (list == null && r7 == null) {
                    r6.A04.A0K(r5);
                } else {
                    C58762lD A002 = r5.A00();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AnonymousClass1MD r2 = (AnonymousClass1MD) it.next();
                            A002.A0A.put(r2.A02, r2);
                        }
                    }
                    if (r7 != null) {
                        A002.A04 = r7;
                    }
                    r6.A04.A0K(A002.A00());
                }
                r6.A08.remove(r5.A08);
            }
            r8.A00 = null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62502rV) {
                C62502rV r8 = (C62502rV) obj;
                if (!C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A03, r8.A03) || this.A01 != r8.A01 || !C18070vi.A18(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C62502rV(C53552ci r6, C60132nR r7) {
        String str = r7.A08;
        C18070vi.A0W(str);
        AnonymousClass1BI A002 = C22971Dz.A00(r7.A02);
        UserJid A003 = C22941Dw.A00(C22971Dz.A00(r7.A01));
        long j = r7.A00;
        this.A04 = str;
        this.A02 = A002;
        this.A03 = A003;
        this.A01 = j;
        this.A00 = r6;
    }

    public int hashCode() {
        return AnonymousClass001.A0K(this.A01, (((C17880vN.A03(this.A04) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StanzaMetadata(id=");
        A10.append(this.A04);
        A10.append(", remoteChatJid=");
        A10.append(this.A02);
        A10.append(", participantUserJid=");
        A10.append(this.A03);
        A10.append(", loggableStanzaId=");
        A10.append(this.A01);
        A10.append(", stanzaAckCallback=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
