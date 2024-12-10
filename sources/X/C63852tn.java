package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2tn  reason: invalid class name and case insensitive filesystem */
public class C63852tn {
    public int A00;
    public C42691ya A01;
    public boolean A02;
    public C25491Ok A03;
    public UserJid A04;
    public Boolean A05;
    public Boolean A06;

    public static String A00(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return "https://www.whatsapp.com/security";
        }
        if (i == 16 || i == 17) {
            return "https://faq.whatsapp.com/1520500555178162";
        }
        return "https://faq.whatsapp.com/1148840052398648";
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C63852tn r5 = (C63852tn) obj;
            if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01.equals(r5.A01))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = this.A01;
        AnonymousClass000.A1M(objArr, this.A00);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A02), objArr, 2);
    }

    private boolean A01(int i, int i2, int i3, boolean z) {
        if (this.A00 == i) {
            C42691ya r1 = this.A01;
            if (r1.actualActors == i2 && r1.hostStorage == i3 && this.A02 == z) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            com.whatsapp.jid.UserJid r2 = r3.A04
            r1 = 0
            if (r2 == 0) goto L_0x0012
            X.1Ok r0 = r3.A03
            if (r0 == 0) goto L_0x0012
            X.11S r0 = r0.A00
            boolean r0 = r0.A0O(r2)
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            return r1
        L_0x0012:
            java.lang.Boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0028
            if (r2 == 0) goto L_0x0011
            X.1Ok r0 = r3.A03
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.A00(r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A05 = r0
            if (r0 == 0) goto L_0x0011
        L_0x0028:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0011
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63852tn.A04():boolean");
    }

    public boolean A06() {
        Boolean bool = this.A06;
        if (bool == null) {
            C25491Ok r0 = this.A03;
            if (r0 != null) {
                r0.A02.get();
                bool = AnonymousClass000.A0h();
                this.A06 = bool;
            }
            return false;
        }
        if (!bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 != 3) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C63852tn(X.C42741yf r4) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x001b
            int r2 = r4.A03
            X.1ya r1 = r4.A00()
            int r0 = X.AnonymousClass2V2.A00(r4)
            r3.A01 = r1
            r3.A00 = r0
            r1 = 3
            r0 = 1
            if (r2 == r1) goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A02 = r0
            return
        L_0x001b:
            r1 = 1
            X.1ya r0 = new X.1ya
            r0.<init>()
            r3.A01 = r0
            r3.A00 = r1
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63852tn.<init>(X.1yf):void");
    }

    public int A02() {
        if (A06()) {
            if (!A01(3, 1, 2, false)) {
                if (!A01(3, 1, 2, true)) {
                    if (!A01(3, 2, 1, false)) {
                        if (!A01(3, 2, 1, true)) {
                            if (!A01(3, 2, 2, false)) {
                                if (!A01(3, 2, 2, true)) {
                                    if (this.A00 != 4) {
                                        if (!A04()) {
                                            return 17;
                                        }
                                        return 16;
                                    }
                                    return 15;
                                }
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 7;
                }
                return 6;
            }
            return 5;
        }
        if (!A04()) {
            if (this.A00 != 4) {
                if (!A01(1, 1, 1, false)) {
                    if (!A01(2, 1, 1, false)) {
                        if (!A01(2, 1, 1, true)) {
                            if (!A01(3, 1, 1, false)) {
                                if (!A01(3, 1, 1, true)) {
                                    if (!A01(3, 1, 2, false)) {
                                        if (!A01(3, 1, 2, true)) {
                                            if (!A01(3, 2, 1, false)) {
                                                if (!A01(3, 2, 1, true)) {
                                                    if (!A01(3, 2, 2, false)) {
                                                        if (!A01(3, 2, 2, true)) {
                                                            if (!A01(1, 0, 0, false)) {
                                                                if (!A01(2, 0, 0, false)) {
                                                                    if (!A01(2, 0, 0, true)) {
                                                                        if (!A01(3, 0, 0, false)) {
                                                                            if (A01(3, 0, 0, true)) {
                                                                                return 4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return 9;
                                                }
                                                return 8;
                                            }
                                            return 7;
                                        }
                                        return 6;
                                    }
                                    return 5;
                                }
                                return 4;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 0;
            }
            return 15;
        }
        return 16;
        return 10;
    }

    public boolean A03() {
        int A022 = A02();
        if (A022 == 5 || A022 == 6 || A022 == 9 || A022 == 10 || A022 == 15) {
            return true;
        }
        return false;
    }

    public boolean A05() {
        int A022 = A02();
        if (A022 == 0 || A022 == 1 || A022 == 2 || A022 == 3 || A022 == 4) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessState{privacyMode=");
        A10.append(this.A01);
        A10.append(", client=");
        A10.append(this.A00);
        A10.append(", isVerified=");
        A10.append(this.A02);
        A10.append(", stateId=");
        A10.append(A02());
        return C17890vO.A0b(A10);
    }

    public C63852tn(C42691ya r2, int i, int i2) {
        this.A01 = r2 == null ? new C42691ya() : r2;
        this.A00 = i;
        this.A02 = AnonymousClass000.A1T(i2, 3);
    }

    public C63852tn(AnonymousClass1PM r2, C25491Ok r3, UserJid userJid) {
        this(r2.A02(userJid));
        this.A04 = userJid;
        this.A03 = r3;
    }

    public C63852tn(C25491Ok r2, AnonymousClass1E7 r3, UserJid userJid) {
        this(r3.A0G);
        this.A04 = userJid;
        this.A03 = r2;
    }
}
