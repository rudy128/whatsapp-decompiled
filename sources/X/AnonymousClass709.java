package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.709  reason: invalid class name */
public final class AnonymousClass709 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public final Collection A07;
    public final List A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass709) {
                AnonymousClass709 r5 = (AnonymousClass709) obj;
                if (!C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (r2 != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass77X r7) {
        /*
            r6 = this;
            int r0 = r6.A03
            boolean r5 = r7.A02
            int r0 = r0 + r5
            r6.A03 = r0
            int r0 = r6.A01
            boolean r4 = r7.A00
            int r0 = r0 + r4
            r6.A01 = r0
            int r0 = r6.A02
            boolean r2 = r7.A01
            int r0 = r0 + r2
            r6.A02 = r0
            int r1 = r6.A00
            r3 = 0
            if (r5 != 0) goto L_0x001f
            if (r4 != 0) goto L_0x001f
            r0 = 0
            if (r2 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            int r1 = r1 + r0
            r6.A00 = r1
            int r0 = r6.A06
            boolean r2 = r7.A04
            int r0 = r0 + r2
            r6.A06 = r0
            int r0 = r6.A04
            boolean r1 = r7.A03
            int r0 = r0 + r1
            r6.A04 = r0
            int r0 = r6.A05
            if (r2 != 0) goto L_0x0037
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            int r0 = r0 + r3
            r6.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass709.A00(X.77X):void");
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A08, AnonymousClass000.A0L(this.A07));
    }

    public AnonymousClass709(Collection collection, List list) {
        C18070vi.A0j(collection, list);
        this.A07 = collection;
        this.A08 = list;
        ArrayList<AnonymousClass8BB> A13 = AnonymousClass000.A13();
        for (Object next : list) {
            if (this.A07.contains(((AnonymousClass8B2) next).BLl())) {
                A13.add(next);
            }
        }
        for (AnonymousClass8BB BOL : A13) {
            AnonymousClass77X BOL2 = BOL.BOL();
            C18070vi.A0X(BOL2);
            A00(BOL2);
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AppliedArEffectsCounter(uris=");
        A10.append(this.A07);
        A10.append(", capturedMedias=");
        return AnonymousClass001.A1F(this.A08, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass709() {
        /*
            r1 = this;
            X.0wS r0 = X.C18460wS.A00
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass709.<init>():void");
    }
}
