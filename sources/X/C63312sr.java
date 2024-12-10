package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2sr  reason: invalid class name and case insensitive filesystem */
public final class C63312sr {
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public final UserJid A04;
    public final ConcurrentHashMap A05;

    public C63312sr(UserJid userJid, Set set, int i, boolean z) {
        C18070vi.A0d(userJid, 1);
        this.A05 = new ConcurrentHashMap();
        this.A04 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C59232ly r2 = (C59232ly) it.next();
            this.A05.put(r2.A02, r2);
        }
        this.A01 = i;
        this.A03 = z;
    }

    public final C199410f A00() {
        C199410f copyOf = C199410f.copyOf(this.A05.values());
        C18070vi.A0X(copyOf);
        return copyOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj)) {
            return false;
        }
        C63312sr r4 = (C63312sr) obj;
        if (this.A01 == r4.A01 && this.A03 == r4.A03 && C18070vi.A18(this.A04, r4.A04)) {
            return C18070vi.A18(this.A05, r4.A05);
        }
        return false;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A05, AnonymousClass000.A0L(this.A04)) + this.A01) * 31) + (this.A03 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupParticipant{jid='");
        A10.append(this.A04);
        A10.append("', rank=");
        A10.append(this.A01);
        A10.append(", pending=");
        A10.append(this.A03);
        A10.append(", participantDevices=");
        StringBuilder sb = new StringBuilder("[");
        Iterator A0j = C17890vO.A0j(this.A05);
        while (A0j.hasNext()) {
            sb.append(A0j.next());
            sb.append(", ");
        }
        String A0z = AnonymousClass000.A0z(sb);
        C18070vi.A0X(A0z);
        A10.append(A0z);
        return C17890vO.A0b(A10);
    }

    public C63312sr(UserJid userJid, Set set, int i, long j, boolean z) {
        C18070vi.A0d(userJid, 1);
        this.A05 = new ConcurrentHashMap();
        this.A04 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C59232ly r2 = (C59232ly) it.next();
            this.A05.put(r2.A02, r2);
        }
        this.A01 = i;
        this.A03 = z;
        this.A02 = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C63312sr(com.whatsapp.jid.UserJid r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r2 = 0
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r1 = r4.getPrimaryDevice()
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.2ly r0 = new X.2ly
            r0.<init>(r1, r6, r7)
            java.util.Set r0 = X.C18070vi.A0P(r0)
            r3.<init>((com.whatsapp.jid.UserJid) r4, (java.util.Set) r0, (int) r5, (boolean) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63312sr.<init>(com.whatsapp.jid.UserJid, int, boolean, boolean):void");
    }
}
