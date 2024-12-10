package X;

import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.List;

/* renamed from: X.24f  reason: invalid class name and case insensitive filesystem */
public final class C446424f {
    public final AnonymousClass1M9 A00;
    public final C24791Lr A01;
    public final AnonymousClass12E A02;
    public final AnonymousClass11P A03;
    public final C27001Ui A04;
    public final AnonymousClass10I A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public C446424f(AnonymousClass1M9 r2, C24791Lr r3, AnonymousClass12E r4, AnonymousClass11P r5, C27001Ui r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r8, 3);
        C18070vi.A0d(r2, 4);
        C18070vi.A0d(r9, 5);
        C18070vi.A0d(r3, 6);
        C18070vi.A0d(r6, 7);
        C18070vi.A0d(r4, 8);
        C18070vi.A0d(r10, 9);
        this.A03 = r5;
        this.A05 = r7;
        this.A08 = r8;
        this.A00 = r2;
        this.A07 = r9;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = r10;
    }

    public static final boolean A00(C446424f r4, UserJid userJid) {
        File A002;
        AnonymousClass1E7 A0H = r4.A00.A0H(userJid);
        int i = A0H.A07;
        if (i < 0) {
            return false;
        }
        if (i == 0 || (A002 = r4.A01.A00(A0H)) == null || !A002.exists() || A002.length() == 0) {
            return true;
        }
        return false;
    }

    public C21132Af0 A01() {
        C57122iZ r4 = new C57122iZ(this);
        C446424f r5 = r4.A01;
        AnonymousClass11P r1 = r5.A03;
        Object obj = r5.A08.get();
        C18070vi.A0X(obj);
        C184129aS r3 = new C184129aS(r1, (AnonymousClass1OZ) obj);
        C189969k9 r2 = new C189969k9(r4, r5);
        AnonymousClass1OZ r52 = r3.A01;
        String A0B = r52.A0B();
        AnonymousClass9F5 r12 = new AnonymousClass9F5(A0B, (List) C18460wS.A00);
        r52.A0I(new C178909Ex(new C184119aR(r2, r3), r12), r12.BVP(), A0B, 395, 32000);
        return r4.A00;
    }
}
