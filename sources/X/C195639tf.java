package X;

import java.util.Map;

/* renamed from: X.9tf  reason: invalid class name and case insensitive filesystem */
public final class C195639tf {
    public final int A00;
    public final C187389fj A01;
    public final C192819p2 A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final boolean A06;
    public final Integer A07;
    public final String A08;

    public C195639tf(C187389fj r2, C192819p2 r3, Integer num, String str, String str2, String str3, Map map, int i, boolean z) {
        C18070vi.A0d(str, 1);
        this.A03 = str;
        this.A00 = i;
        this.A04 = str2;
        this.A06 = z;
        this.A05 = map;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = num;
        this.A08 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195639tf) {
                C195639tf r5 = (C195639tf) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || this.A06 != r5.A06 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || this.A07 != r5.A07 || !C18070vi.A18(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int hashCode;
        int A0N = (((AnonymousClass000.A0N(this.A05, AnonymousClass0DV.A00(C17890vO.A02(this.A04, (C17880vN.A03(this.A03) + this.A00) * 31), this.A06)) + AnonymousClass001.A0k(this.A01)) * 31) + AnonymousClass001.A0k(this.A02)) * 31;
        Integer num = this.A07;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "BACK_BUTTON";
            } else {
                str = "FORWARD_LOOPBACK";
            }
            hashCode = str.hashCode() + intValue;
        }
        return ((A0N + hashCode) * 31) + C108955ca.A06(this.A08);
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FcsStateMachineContextParams(configPrefixedStateName=");
        A10.append(this.A03);
        A10.append(", qplInstanceKey=");
        A10.append(this.A00);
        A10.append(", fdsManagerId=");
        A10.append(this.A04);
        A10.append(", isModalOnScreen=");
        A10.append(this.A06);
        A10.append(", initialStateMachineInput=");
        A10.append(this.A05);
        A10.append(", presentationConfig=");
        A10.append(this.A01);
        A10.append(", phoenixSessionData=");
        A10.append(this.A02);
        A10.append(", backNavContext=");
        Integer num = this.A07;
        if (num == null) {
            str = "null";
        } else if (1 - num.intValue() != 0) {
            str = "BACK_BUTTON";
        } else {
            str = "FORWARD_LOOPBACK";
        }
        A10.append(str);
        A10.append(", mergerName=");
        return C17900vP.A0B(this.A08, A10);
    }
}
