package X;

/* renamed from: X.60t  reason: invalid class name and case insensitive filesystem */
public final class C1177360t extends C138756xd {
    public final AnonymousClass6UU A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C1177360t(X.AnonymousClass6UU r3, java.lang.Integer r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            r1 = 0
            r0 = r6 & 1
            if (r0 == 0) goto L_0x0006
            r5 = r1
        L_0x0006:
            r0 = r6 & 2
            if (r0 == 0) goto L_0x000b
            r4 = r1
        L_0x000b:
            r0 = r6 & 8
            if (r0 == 0) goto L_0x0024
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "title-"
            r1.append(r0)
            r1.append(r5)
            r0 = 45
            r1.append(r0)
            java.lang.String r1 = X.C17890vO.A0V(r4, r1)
        L_0x0024:
            r2.<init>((X.AnonymousClass6UU) r3, (java.lang.Integer) r4, (java.lang.String) r5, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1177360t.<init>(X.6UU, java.lang.Integer, java.lang.String, int):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1177360t) {
                C1177360t r5 = (C1177360t) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C108945cZ.A09(this.A02, AnonymousClass000.A0N(this.A00, ((C17900vP.A00(this.A03) * 31) + C17880vN.A02(this.A01)) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Title(title=");
        A10.append(this.A03);
        A10.append(", titleResource=");
        C108965cb.A1S(this.A01, A10);
        A10.append(this.A00);
        A10.append(", id=");
        return C17900vP.A0B(this.A02, A10);
    }

    public C1177360t(AnonymousClass6UU r1, Integer num, String str, String str2) {
        C108985cd.A1D(r1, str2);
        this.A03 = str;
        this.A01 = num;
        this.A00 = r1;
        this.A02 = str2;
    }
}
