package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2Q4  reason: invalid class name */
public class AnonymousClass2Q4 extends C21340AiT {
    public final String A00;
    public final boolean A01;
    public volatile GroupJid A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass2Q4 r7 = (AnonymousClass2Q4) obj;
            if (!r7.A00.equals(this.A00) || r7.A01() != A01() || r7.A01 != this.A01 || !C42171xk.A00(r7.A02, this.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A00;
        C17890vO.A1M(objArr, this.A00);
        objArr[2] = Boolean.valueOf(this.A01);
        return AnonymousClass000.A0P(this.A02, objArr, 3);
    }

    public AnonymousClass2Q4(GroupJid groupJid, String str, long j, boolean z) {
        this.A00 = j;
        this.A00 = str;
        this.A01 = z;
        this.A02 = groupJid;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("JoinableCallLog[callId=");
        A10.append(this.A00);
        A10.append(", callLogRowId=");
        A10.append(A01());
        A10.append(", videoCall=");
        A10.append(this.A01);
        A10.append(", groupJid=");
        A10.append(this.A02);
        return AnonymousClass000.A0z(A10);
    }
}
