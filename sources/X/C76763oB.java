package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3oB  reason: invalid class name and case insensitive filesystem */
public final class C76763oB extends C826549f {
    public final AnonymousClass1KB A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass11P A02;
    public final C27151Ux A03;
    public final AnonymousClass1EC A04;
    public final WeakReference A05;

    public Void A0J(Void... voidArr) {
        C18070vi.A0d(voidArr, 0);
        super.A0J((Void[]) Arrays.copyOf(voidArr, voidArr.length));
        if (this.A02.isCancelled()) {
            return null;
        }
        ArrayList A002 = this.A03.A00(this.A04, C17880vN.A04(AnonymousClass11P.A01(this.A02)));
        HashSet A12 = C17880vN.A12();
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            AnonymousClass23S r2 = (AnonymousClass23S) it.next();
            AnonymousClass1BI r1 = r2.A0v.A00;
            if (r1 != null && !A12.contains(r1)) {
                A12.add(r1);
                AnonymousClass1E7 A0E = this.A01.A0E(r1);
                if (A0E != null) {
                    A13.add(new C86904Tn(A0E, r2));
                }
            }
        }
        this.A00.A0J(new C146507Pj(this, A13, 12));
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76763oB(X.AnonymousClass1KB r17, X.AnonymousClass1M9 r18, X.AnonymousClass11P r19, X.C57172ie r20, X.C27151Ux r21, X.AnonymousClass4MY r22, X.AnonymousClass6n9 r23, X.AnonymousClass1ST r24, X.C28521aN r25, X.C88194Yr r26, X.C88124Yk r27, X.C76803oS r28, X.AnonymousClass1EC r29, X.AnonymousClass1QO r30, X.AnonymousClass1QS r31) {
        /*
            r16 = this;
            r12 = r27
            r15 = r31
            r2 = r18
            r4 = r17
            r1 = r19
            X.C18070vi.A0w(r1, r4, r12, r2, r15)
            r11 = r26
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            X.C18070vi.A0x(r7, r8, r9, r11, r10)
            r5 = r28
            r14 = r30
            r13 = r29
            r6 = r20
            r0 = r21
            X.C18070vi.A0y(r6, r14, r0, r5, r13)
            r3 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r3.A02 = r1
            r3.A00 = r4
            r3.A01 = r2
            r3.A03 = r0
            r3.A04 = r13
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r5)
            r3.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C76763oB.<init>(X.1KB, X.1M9, X.11P, X.2ie, X.1Ux, X.4MY, X.6n9, X.1ST, X.1aN, X.4Yr, X.4Yk, X.3oS, X.1EC, X.1QO, X.1QS):void");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C76803oS r0 = (C76803oS) this.A05.get();
        if (r0 != null) {
            r0.A02.A0F(C27621Wu.A00);
        }
    }
}
