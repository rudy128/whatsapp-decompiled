package X;

import java.util.Map;

/* renamed from: X.1CR  reason: invalid class name */
public final class AnonymousClass1CR {
    public final Map A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final boolean A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass1CR) {
                AnonymousClass1CR r5 = (AnonymousClass1CR) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || this.A04 != r5.A04 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stats(codePathName=");
        sb.append(this.A05);
        sb.append(", hasDetailedStats=");
        sb.append(this.A04);
        sb.append(", readCounters=");
        sb.append(this.A02);
        sb.append(", writeCounters=");
        sb.append(this.A03);
        sb.append(", queryCounters=");
        sb.append(this.A01);
        sb.append(", mainThreadCounters=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public int hashCode() {
        int hashCode = this.A05.hashCode() * 31;
        int i = 1237;
        if (this.A04) {
            i = 1231;
        }
        return ((((((((hashCode + i) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A00.hashCode();
    }

    public AnonymousClass1CR(String str, Map map, Map map2, Map map3, Map map4, boolean z) {
        this.A05 = str;
        this.A04 = z;
        this.A02 = map;
        this.A03 = map2;
        this.A01 = map3;
        this.A00 = map4;
    }
}
