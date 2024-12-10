package X;

import com.whatsapp.jid.Jid;

/* renamed from: X.Aaw  reason: case insensitive filesystem */
public class C20880Aaw implements C22547BCe {
    public final long A00;
    public final AnonymousClass1E7 A01;
    public final long A02;

    public int Bbd() {
        return 4;
    }

    public Jid BTc() {
        return this.A01.A0J;
    }

    public boolean Bef(C22547BCe bCe) {
        if (bCe instanceof C20880Aaw) {
            C20880Aaw aaw = (C20880Aaw) bCe;
            if (C18070vi.A18(this.A01.A0J, aaw.A01.A0J) && this.A02 == aaw.A02 && this.A00 == aaw.A00) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C20880Aaw(AnonymousClass1E7 r1, long j, long j2) {
        this.A00 = j;
        this.A01 = r1;
        this.A02 = j2;
    }

    public long BYQ() {
        return this.A02;
    }
}
