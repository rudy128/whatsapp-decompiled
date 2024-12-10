package X;

import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.9tg  reason: invalid class name and case insensitive filesystem */
public final class C195649tg {
    public Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Stack A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195649tg) {
                C195649tg r5 = (C195649tg) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C195649tg(String str, String str2, String str3, String str4, List list, Map map, Map map2) {
        Stack stack = new Stack();
        Integer num = AnonymousClass00R.A01;
        C18070vi.A0d(str3, 3);
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A06 = map;
        this.A07 = map2;
        this.A05 = list;
        this.A08 = stack;
        this.A00 = num;
        this.A04 = str4;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A03, C17880vN.A03(this.A01));
        Map map = this.A07;
        Stack stack = this.A08;
        return C108945cZ.A09(this.A04, (AnonymousClass000.A0N(stack, (AnonymousClass000.A0N(map, (C17890vO.A02(this.A02, A022) + AnonymousClass001.A0k(this.A06)) * 31) + C17880vN.A02(this.A05)) * 31) + 1534708268) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StateMachineData(config=");
        A10.append(this.A01);
        A10.append(", sessionContextId=");
        A10.append(this.A03);
        A10.append(", fdsManagerId=");
        A10.append(this.A02);
        A10.append(", overwriteFirstScreenPresentation=");
        A10.append(this.A06);
        A10.append(", stateRegistry=");
        A10.append(this.A07);
        A10.append(", nextScreens=");
        A10.append(this.A05);
        A10.append(", uiStack=");
        A10.append(this.A08);
        A10.append(", modalType=");
        A10.append("BOTTOM_SHEET");
        A10.append(", startAt=");
        return C17900vP.A0B(this.A04, A10);
    }
}
