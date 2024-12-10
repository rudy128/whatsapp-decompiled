package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.A7n  reason: case insensitive filesystem */
public abstract class C20108A7n {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public AnonymousClass1BI A05;
    public AnonymousClass1BI A06;
    public UserJid A07;
    public UserJid A08;
    public String A09;
    public String A0A;
    public List A0B;
    public List A0C;
    public boolean A0D;
    public boolean A0E;
    public final AnonymousClass190 A0F;

    public static String A0A(C166388co r1) {
        return r1.A0S(0);
    }

    public static String A0B(C166388co r1, boolean z) {
        C17960vV.A0D(z);
        return r1.A0S(0);
    }

    public static void A0E(C166388co r1, AnonymousClass206 r2) {
        r2.A0d(UserJid.Companion.A04(r1.participant_));
    }

    public C20108A7n(AnonymousClass190 r2) {
        this.A0F = r2;
        C18460wS r0 = C18460wS.A00;
        this.A0B = r0;
        this.A0C = r0;
    }

    public static void A0C(C22941Dw r1, C166388co r2, AbstractCollection abstractCollection, int i) {
        UserJid A042 = r1.A04(r2.A0S(i));
        if (A042 != null) {
            abstractCollection.add(A042);
        }
    }

    public static void A0D(C22941Dw r1, C166388co r2, AbstractCollection abstractCollection, int i) {
        UserJid A042 = r1.A04(r2.A0S(i));
        if (A042 != null) {
            abstractCollection.add(A042);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[id: ");
        A10.append(this.A09);
        A10.append(" jid: ");
        A10.append(this.A06);
        return C17890vO.A0c(A10, ']');
    }
}
