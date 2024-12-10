package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.2Dw  reason: invalid class name and case insensitive filesystem */
public class C46262Dw extends C20126A8l {
    public final boolean A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C46262Dw(X.C19999A2n r10, java.lang.String r11, long r12, boolean r14) {
        /*
            r9 = this;
            X.2rJ r1 = X.C62382rJ.A03
            java.lang.String r4 = "regular_low"
            r5 = 7
            r8 = 0
            X.C18070vi.A0l(r1, r4)
            r0 = r9
            r2 = r10
            r3 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.A00 = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46262Dw.<init>(X.A2n, java.lang.String, long, boolean):void");
    }

    public C163398Uv A08() {
        C23624Bmt A0N = AnonymousClass8YN.DEFAULT_INSTANCE.A0N();
        boolean z = this.A00;
        AnonymousClass8YN r1 = (AnonymousClass8YN) C17880vN.A0G(A0N);
        r1.bitField0_ |= 1;
        r1.isTwentyFourHourFormatEnabled_ = z;
        C163398Uv A08 = super.A08();
        C17960vV.A07(A08);
        C166378cn r2 = (C166378cn) C17880vN.A0G(A08);
        AnonymousClass8YN r12 = (AnonymousClass8YN) A0N.A0C();
        int i = C166378cn.AGENT_ACTION_FIELD_NUMBER;
        r12.getClass();
        r2.timeFormatAction_ = r12;
        r2.bitField0_ |= EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
        return A08;
    }

    public String A0B() {
        return "time_format";
    }

    public String[] A0F() {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "time_format";
        return A1Y;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TimeFormatMutation{rowId=");
        A10.append(this.A07);
        A10.append(", is24HourFormat=");
        A10.append(this.A00);
        A10.append(", timestamp=");
        A10.append(this.A04);
        A10.append(", operation=");
        A10.append(this.A05);
        A10.append(", collectionName=");
        A10.append(this.A06);
        A10.append(", keyId=");
        A10.append(this.A00);
        return C17890vO.A0b(A10);
    }
}
