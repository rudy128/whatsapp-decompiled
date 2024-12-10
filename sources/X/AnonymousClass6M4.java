package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.6M4  reason: invalid class name */
public class AnonymousClass6M4 extends A34 {
    public final AnonymousClass1BI A00;
    public final UserJid A01;
    public final AnonymousClass205 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final String A06;
    public final WeakReference A07;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return new C19760yx(Boolean.valueOf(C17880vN.A1X(((AnonymousClass1RK) this.A04.get()).A07())), C108945cZ.A0s(this.A02, C17880vN.A0c(this.A05)));
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C19760yx r8 = (C19760yx) obj;
        boolean A1Y = AnonymousClass000.A1Y(r8.A00);
        AnonymousClass206 r5 = (AnonymousClass206) r8.A01;
        AnonymousClass1FR r4 = (AnonymousClass1FR) this.A07.get();
        if (r4 != null) {
            C134136q6 r2 = new C134136q6((C18030ve) this.A03.get(), this.A00, this.A06, A1Y);
            r2.A06 = false;
            r2.A08 = false;
            r2.A01 = this.A01;
            r2.A03 = new AnonymousClass7M2(this, 5);
            if (r5 != null) {
                r2.A02 = r5.A0v;
            }
            r4.CMl(r2.A00());
        }
    }

    public AnonymousClass6M4(AnonymousClass1FR r2, AnonymousClass1BI r3, UserJid userJid, AnonymousClass205 r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, String str) {
        this.A07 = AnonymousClass3MW.A0z(r2);
        this.A05 = r7;
        this.A03 = r6;
        this.A04 = r8;
        this.A00 = r3;
        this.A06 = str;
        this.A01 = userJid;
        this.A02 = r5;
    }
}
