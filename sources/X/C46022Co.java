package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2Co  reason: invalid class name and case insensitive filesystem */
public class C46022Co extends C60192nY {
    public final AnonymousClass11S A00;
    public final AnonymousClass1S0 A01;
    public final AnonymousClass11P A02;

    public C46022Co(AnonymousClass11S r1, AnonymousClass1S0 r2, AnonymousClass11P r3, C26331Rs r4) {
        super(r4);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static ArrayList A00(C46022Co r11, boolean z) {
        ArrayList A13 = AnonymousClass000.A13();
        int A012 = r11.A01.A09.A01();
        if (A012 != 0) {
            Iterator it = C20126A8l.A08.iterator();
            while (it.hasNext()) {
                A13.add(new C46252Dv((C19999A2n) null, (String) null, C17880vN.A0v(it), A012, AnonymousClass11P.A01(r11.A02), z));
            }
        }
        return A13;
    }
}
