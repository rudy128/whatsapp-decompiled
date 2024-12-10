package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.9Bv  reason: invalid class name and case insensitive filesystem */
public class C178109Bv extends C21340AiT {
    public final UserJid A00;
    public volatile int A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C178109Bv r7 = (C178109Bv) obj;
                if (!(this.A00.equals(r7.A00) && A01() == r7.A01() && this.A01 == r7.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, (31 + ((int) A01())) * 31) + this.A01;
    }

    public C178109Bv(UserJid userJid, int i, long j) {
        this.A00 = j;
        this.A00 = userJid;
        this.A01 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallLogParticipant[rowId=");
        A10.append(A01());
        A10.append(", jid=");
        A10.append(this.A00);
        A10.append(", callResult=");
        A10.append(this.A01);
        return AnonymousClass000.A0z(A10);
    }
}
