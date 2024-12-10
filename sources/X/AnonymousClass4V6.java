package X;

/* renamed from: X.4V6  reason: invalid class name */
public final class AnonymousClass4V6 {
    public final int A00;
    public final AnonymousClass4DE A01;
    public final C107855aj A02;
    public final C86704Ss A03;
    public final C86704Ss A04;
    public final Integer A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r8 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4V6(X.AnonymousClass4DE r4, X.C107855aj r5, X.C86704Ss r6, X.C86704Ss r7, java.lang.Integer r8, int r9, boolean r10) {
        /*
            r3 = this;
            r0 = 2
            X.C18070vi.A0d(r5, r0)
            r3.<init>()
            r3.A01 = r4
            r3.A02 = r5
            r3.A06 = r10
            r3.A00 = r9
            r3.A04 = r6
            r3.A03 = r7
            r3.A05 = r8
            r2 = 0
            if (r10 == 0) goto L_0x001b
            r1 = 0
            if (r8 == 0) goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            java.lang.String r0 = "If there is a slider, initial strength must be provided"
            X.C17960vV.A0F(r1, r0)
            if (r10 == 0) goto L_0x002d
            X.5cD r0 = r5.BUq()
            java.lang.Float r0 = r0.BUT()
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            java.lang.String r0 = "If there is a slider, effect must support strength adjustment"
            X.C17960vV.A0F(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4V6.<init>(X.4DE, X.5aj, X.4Ss, X.4Ss, java.lang.Integer, int, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V6) {
                AnonymousClass4V6 r5 = (AnonymousClass4V6) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A02, r5.A02) || this.A06 != r5.A06 || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0L = AnonymousClass000.A0L(this.A01);
        return AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A04, (AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A02, A0L), this.A06) + this.A00) * 31)) + AnonymousClass001.A0k(this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EffectButtonConfiguration(category=");
        A10.append(this.A01);
        A10.append(", effect=");
        A10.append(this.A02);
        A10.append(", hasSlider=");
        A10.append(this.A06);
        A10.append(", idRes=");
        A10.append(this.A00);
        A10.append(", unselectedAccessibility=");
        A10.append(this.A04);
        A10.append(", selectedAccessibility=");
        A10.append(this.A03);
        A10.append(", initialStrength=");
        return AnonymousClass001.A1F(this.A05, A10);
    }
}
