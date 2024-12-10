package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1ey  reason: invalid class name and case insensitive filesystem */
public class C31071ey {
    public final AnonymousClass11P A00;
    public final C26021Qn A01;
    public final C18030ve A02;
    public final C31051ew A03;
    public final AnonymousClass1QD A04;
    public final C31061ex A05;
    public final C30921ej A06;
    public final AnonymousClass1QS A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;

    public ArrayList A00(String str) {
        AnonymousClass1QS r0 = this.A07;
        AnonymousClass1QS.A00(r0);
        ArrayList A0A = r0.A05.A0A();
        ArrayList arrayList = new ArrayList();
        Iterator it = A0A.iterator();
        while (it.hasNext()) {
            C20284AEs aEs = (C20284AEs) it.next();
            if (aEs instanceof AnonymousClass8pM) {
                AnonymousClass8pM r2 = (AnonymousClass8pM) aEs;
                if (str != null && !str.equalsIgnoreCase(r2.A00)) {
                    C170278pb r1 = r2.A08;
                    if (r1 instanceof AnonymousClass8pV) {
                        if (!((AnonymousClass8pV) r1).A03.containsKey(str)) {
                        }
                    }
                }
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public C31071ey(AnonymousClass11P r1, C26021Qn r2, C18030ve r3, C31051ew r4, AnonymousClass1QD r5, C31061ex r6, C30921ej r7, AnonymousClass1QS r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        this.A00 = r1;
        this.A02 = r3;
        this.A08 = r9;
        this.A07 = r8;
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = r6;
        this.A09 = r10;
        this.A06 = r7;
        this.A03 = r4;
    }
}
