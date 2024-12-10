package X;

import com.whatsapp.wamsys.JniBridge;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9nN  reason: invalid class name and case insensitive filesystem */
public final class C191899nN {
    public int A00 = Integer.MAX_VALUE;
    public C1192567j A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass181 A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass118 A05;
    public final C18030ve A06;
    public final AnonymousClass18K A07;
    public final C24371Kb A08;
    public final C24421Kg A09;
    public final AnonymousClass10I A0A;
    public final JniBridge A0B;
    public final AtomicInteger A0C = new AtomicInteger(0);

    public void A00(C20467AMe aMe) {
        aMe.A01 = true;
        C1192567j r0 = this.A01;
        if (r0 != null) {
            r0.A02(aMe);
        }
        List list = aMe.A00;
        if (list != null && list.size() > 0) {
            for (C20467AMe A002 : aMe.A00) {
                A00(A002);
            }
        }
    }

    public C191899nN(AnonymousClass1KB r3, AnonymousClass181 r4, AnonymousClass11P r5, AnonymousClass118 r6, C18030ve r7, AnonymousClass18K r8, C24371Kb r9, C24421Kg r10, AnonymousClass10I r11, JniBridge jniBridge) {
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
        this.A0A = r11;
        this.A03 = r4;
        this.A07 = r8;
        this.A0B = jniBridge;
        this.A09 = r10;
        this.A08 = r9;
    }
}
