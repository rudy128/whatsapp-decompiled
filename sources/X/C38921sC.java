package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1sC  reason: invalid class name and case insensitive filesystem */
public class C38921sC {
    public int A00 = -1;
    public int A01 = 0;
    public C38971sH A02;
    public C38921sC A03;
    public HashSet A04 = null;
    public final C38871s3 A05;
    public final Integer A06;

    public void A04(C38921sC r3, int i) {
        A05(r3, i, -1, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        if (r1 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(X.C38921sC r6) {
        /*
            r5 = this;
            r4 = 0
            if (r6 == 0) goto L_0x001a
            java.lang.Integer r1 = r6.A06
            java.lang.Integer r3 = r5.A06
            r2 = 1
            if (r1 != r3) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r3 != r0) goto L_0x005c
            X.1s3 r0 = r6.A05
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x001a
            X.1s3 r0 = r5.A05
            boolean r0 = r0.A0h
            if (r0 != 0) goto L_0x005c
        L_0x001a:
            return r4
        L_0x001b:
            int r0 = r3.intValue()
            switch(r0) {
                case 1: goto L_0x0031;
                case 2: goto L_0x0045;
                case 3: goto L_0x0031;
                case 4: goto L_0x0045;
                case 5: goto L_0x0022;
                case 6: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            return r4
        L_0x0023:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r1 == r0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            if (r1 == r0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass00R.A18
            if (r1 == r0) goto L_0x001a
            r4 = 1
            return r4
        L_0x0031:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 == r0) goto L_0x003a
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x003a
            r2 = 0
        L_0x003a:
            X.1s3 r0 = r6.A05
            boolean r0 = r0 instanceof X.AnonymousClass27L
            if (r0 == 0) goto L_0x005c
            if (r2 != 0) goto L_0x005a
            java.lang.Integer r0 = X.AnonymousClass00R.A15
            goto L_0x0058
        L_0x0045:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x004e
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 == r0) goto L_0x004e
            r2 = 0
        L_0x004e:
            X.1s3 r0 = r6.A05
            boolean r0 = r0 instanceof X.AnonymousClass27L
            if (r0 == 0) goto L_0x005c
            if (r2 != 0) goto L_0x005a
            java.lang.Integer r0 = X.AnonymousClass00R.A18
        L_0x0058:
            if (r1 != r0) goto L_0x005b
        L_0x005a:
            r4 = 1
        L_0x005b:
            return r4
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38921sC.A07(X.1sC):boolean");
    }

    public int A00() {
        C38921sC r0;
        if (this.A05.A0N == 8) {
            return 0;
        }
        int i = this.A00;
        if (i <= -1 || (r0 = this.A03) == null || r0.A05.A0N != 8) {
            return this.A01;
        }
        return i;
    }

    public final C38921sC A01() {
        switch (this.A06.intValue()) {
            case 1:
                return this.A05.A0X;
            case 2:
                return this.A05.A0S;
            case 3:
                return this.A05.A0W;
            case 4:
                return this.A05.A0Y;
            default:
                return null;
        }
    }

    public void A02() {
        HashSet hashSet;
        C38921sC r0 = this.A03;
        if (!(r0 == null || (hashSet = r0.A04) == null)) {
            hashSet.remove(this);
        }
        this.A03 = null;
        this.A01 = 0;
        this.A00 = -1;
    }

    public void A03() {
        C38971sH r0 = this.A02;
        if (r0 == null) {
            this.A02 = new C38971sH(AnonymousClass00R.A00);
        } else {
            r0.A00();
        }
    }

    public void A05(C38921sC r3, int i, int i2, boolean z) {
        if (r3 == null) {
            A02();
        } else if (z || A07(r3)) {
            this.A03 = r3;
            HashSet hashSet = r3.A04;
            if (hashSet == null) {
                hashSet = new HashSet();
                r3.A04 = hashSet;
            }
            hashSet.add(this);
            if (i > 0) {
                this.A01 = i;
            } else {
                this.A01 = 0;
            }
            this.A00 = i2;
        }
    }

    public boolean A06() {
        HashSet hashSet = this.A04;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((C38921sC) it.next()).A01().A03 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A0f);
        sb.append(":");
        sb.append(AnonymousClass2SH.A00(this.A06));
        return sb.toString();
    }

    public C38921sC(C38871s3 r2, Integer num) {
        this.A05 = r2;
        this.A06 = num;
    }
}
