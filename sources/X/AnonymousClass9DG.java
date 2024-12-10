package X;

import com.whatsapp.jid.Jid;
import java.util.List;

/* renamed from: X.9DG  reason: invalid class name */
public class AnonymousClass9DG extends C198999zG {
    public final Object A00;
    public final Object A01;
    public final String A02;
    public final String A03;

    public AnonymousClass9DG(C29621ca r1, String str, String str2, List list, int i) {
        if (6 - i != 0) {
            this.A02 = str;
            this.A03 = str2;
        } else {
            this.A03 = str;
            this.A02 = str2;
        }
        this.A00 = list;
        this.A01 = r1;
        this.A00 = r1;
    }

    public AnonymousClass9DG(C29621ca r2, C22471B9d b9d, String str, String str2) {
        C18070vi.A0d(b9d, 3);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = b9d;
        this.A01 = r2;
        this.A00 = r2;
    }

    public AnonymousClass9DG(Jid jid, C29621ca r2, String str, String str2, int i) {
        this.A02 = str;
        this.A00 = jid;
        this.A03 = str2;
        this.A01 = r2;
        this.A00 = r2;
    }

    public AnonymousClass9DG(C29621ca r1, C29621ca r2, String str, String str2, int i) {
        this.A02 = str;
        this.A03 = str2;
        switch (i) {
            case 9:
            case 16:
                this.A00 = r1;
                this.A01 = r2;
                break;
            default:
                this.A01 = r1;
                this.A00 = r2;
                break;
        }
        this.A00 = r2;
    }

    public AnonymousClass9DG(Jid jid, C29621ca r2, String str, String str2) {
        this.A00 = jid;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r2;
        this.A00 = r2;
    }
}
