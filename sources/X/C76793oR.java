package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3oR  reason: invalid class name and case insensitive filesystem */
public final class C76793oR extends AnonymousClass3Ua {
    public final AnonymousClass1DS A00;
    public final C19880zA A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1M9 A03;
    public final AnonymousClass1MZ A04;
    public final C47712Jo A05;
    public final C41111vp A06;
    public final C41111vp A07;
    public final C41731wy A08;
    public final AnonymousClass00H A09;

    public final List A0V() {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = ((Iterable) this.A06.A06()).iterator();
        while (it.hasNext()) {
            Jid A0X = C72473Md.A0X(it);
            if (A0X != null) {
                A13.add(A0X);
            }
        }
        return A13;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76793oR(C19880zA r2, C84204Io r3, AnonymousClass11S r4, AnonymousClass1M9 r5, AnonymousClass1MZ r6, AnonymousClass1BI r7, AnonymousClass4RU r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        super(r3, r7, r8, r9);
        C18070vi.A0w(r6, r4, r5, r10, r3);
        C18070vi.A0q(r9, r8, r2);
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A09 = r10;
        this.A01 = r2;
        this.A05 = (C47712Jo) r7;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A08 = A0o;
        this.A00 = A0o;
        C41111vp A0n = AnonymousClass3MW.A0n(C18460wS.A00);
        this.A06 = A0n;
        this.A07 = A0n;
    }
}
