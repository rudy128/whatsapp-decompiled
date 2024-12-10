package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1s9  reason: invalid class name */
public class AnonymousClass1s9 implements AnonymousClass1s6 {
    public int A00;
    public int A01 = 1;
    public int A02;
    public AnonymousClass1s6 A03 = null;
    public C38901sA A04 = null;
    public AnonymousClass1s7 A05;
    public Integer A06 = AnonymousClass00R.A00;
    public List A07 = new ArrayList();
    public List A08 = new ArrayList();
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;

    public void A00() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public void A01(int i) {
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = i;
            for (AnonymousClass1s6 CQN : this.A07) {
                CQN.CQN();
            }
        }
    }

    public void A02(AnonymousClass1s6 r2) {
        this.A07.add(r2);
        if (this.A0B) {
            r2.CQN();
        }
    }

    public void CQN() {
        List<AnonymousClass1s9> list = this.A08;
        for (AnonymousClass1s9 r0 : list) {
            if (!r0.A0B) {
                return;
            }
        }
        this.A0A = true;
        AnonymousClass1s6 r02 = this.A03;
        if (r02 != null) {
            r02.CQN();
        }
        if (this.A09) {
            this.A05.CQN();
            return;
        }
        AnonymousClass1s9 r3 = null;
        int i = 0;
        for (AnonymousClass1s9 r1 : list) {
            if (!(r1 instanceof C38901sA)) {
                i++;
                r3 = r1;
            }
        }
        if (r3 != null && i == 1 && r3.A0B) {
            C38901sA r2 = this.A04;
            if (r2 != null) {
                if (r2.A0B) {
                    this.A00 = this.A01 * r2.A02;
                } else {
                    return;
                }
            }
            A01(r3.A02 + this.A00);
        }
        AnonymousClass1s6 r03 = this.A03;
        if (r03 != null) {
            r03.CQN();
        }
    }

    public String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A05.A02.A0f);
        sb.append(":");
        switch (this.A06.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 2:
                str = "VERTICAL_DIMENSION";
                break;
            case 3:
                str = "LEFT";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "TOP";
                break;
            case 6:
                str = "BOTTOM";
                break;
            default:
                str = "BASELINE";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.A0B) {
            obj = Integer.valueOf(this.A02);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.A08.size());
        sb.append(":d=");
        sb.append(this.A07.size());
        sb.append(">");
        return sb.toString();
    }

    public AnonymousClass1s9(AnonymousClass1s7 r4) {
        this.A05 = r4;
    }
}
