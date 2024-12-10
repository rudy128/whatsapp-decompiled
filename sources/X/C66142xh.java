package X;

import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.2xh  reason: invalid class name and case insensitive filesystem */
public class C66142xh implements AnonymousClass191 {
    public final AnonymousClass11S A00;
    public final C54172di A01;
    public final AnonymousClass1TQ A02;
    public final C34841lA A03;
    public final C26811To A04;
    public final AnonymousClass1TZ A05;
    public final C41911xI A06;
    public final C18000vb A07;

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        C60192nY A002;
        C54172di r1 = this.A01;
        if (r1.A01.A09() && !((AnonymousClass1HV) r1.A02.get()).A01.A2S()) {
            Log.i("MDOptInInitializer/Force_If_Required");
            synchronized (r1) {
                Log.i("MDOptInInitializer/Opting In");
                r1.A00.A00();
            }
        }
        if (this.A00.A0N()) {
            this.A03.A01((AnonymousClass23J) null);
        }
        AnonymousClass1TQ r12 = this.A02;
        if (r12.A0C.A02() != null) {
            r12.A02.A00();
        }
        C26811To r6 = this.A04;
        if (r6.A0T()) {
            this.A05.A01();
        }
        r6.A0H();
        C18000vb r0 = this.A07;
        C41911xI r5 = this.A06;
        r0.A09.add(r5);
        Locale locale = Locale.getDefault();
        if (!r6.A07.A0N() && (A002 = ((C58862lN) r6.A0a.get()).A00("setting_locale")) != null) {
            r6.A0W.CGF(new C70773Cl(r6, A002, locale, 3));
        }
        r5.A03();
    }

    public C66142xh(AnonymousClass11S r1, C54172di r2, AnonymousClass1TQ r3, C34841lA r4, C26811To r5, AnonymousClass1TZ r6, C41911xI r7, C18000vb r8) {
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
