package X;

import com.whatsapp.comments.CommentListManager$loadMessages$1;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4ZK  reason: invalid class name */
public final class AnonymousClass4ZK {
    public static final Comparator A0D = new C98924rw(4);
    public final C95514mM A00;
    public final C24681Lg A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass206 A03;
    public final AnonymousClass1W6 A04;
    public final AtomicReference A05 = new AtomicReference(AnonymousClass4D4.UNINITIALIZED);
    public final C18600wl A06;
    public final AnonymousClass1OX A07;
    public final C108485bm A08;
    public final C23421Fz A09;
    public final AnonymousClass1G4 A0A;
    public final AnonymousClass1G1 A0B;
    public final C26001Ql A0C;

    public AnonymousClass4ZK(C26001Ql r5, C24681Lg r6, AnonymousClass1Cd r7, AnonymousClass206 r8, AnonymousClass1W6 r9, C18600wl r10, AnonymousClass1OX r11) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0p(r6, r5, r7);
        C18070vi.A0d(r10, 5);
        C18070vi.A0d(r11, 7);
        this.A04 = r9;
        this.A01 = r6;
        this.A0C = r5;
        this.A02 = r7;
        this.A06 = r10;
        this.A03 = r8;
        this.A07 = r11;
        AnonymousClass1G7 A18 = AnonymousClass3MW.A18(new TreeSet(A0D));
        this.A0A = A18;
        this.A0B = A18;
        C27178DXn A012 = AnonymousClass4W8.A01(C25691Pg.DROP_OLDEST, 1);
        this.A08 = A012;
        this.A09 = AnonymousClass4WB.A01(A012);
        C95514mM r0 = new C95514mM(this, 0);
        this.A00 = r0;
        r6.registerObserver(r0);
        this.A05.set(AnonymousClass4D4.LOADING);
        AnonymousClass3MW.A1X(this.A06, new CommentListManager$loadMessages$1(this, (C30391dr) null), this.A07);
    }

    public static final boolean A00(AnonymousClass4ZK r1, AnonymousClass206 r2) {
        Long A022;
        C692336k A002 = C60472o5.A00(r2);
        if (A002 == null || (A022 = A002.A02()) == null) {
            return false;
        }
        return A022.equals(Long.valueOf(r1.A03.A0x));
    }
}
