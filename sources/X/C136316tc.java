package X;

import java.util.Map;

/* renamed from: X.6tc  reason: invalid class name and case insensitive filesystem */
public final class C136316tc {
    public final int A00;
    public final AnonymousClass1IX A01;
    public final AnonymousClass1IX A02;
    public final C136456tq A03;
    public final String A04;
    public final Map A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136316tc) {
                C136316tc r5 = (C136316tc) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A05, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A02, C17880vN.A03(this.A04))))) + this.A00;
    }

    public C136316tc(AnonymousClass1IX r1, AnonymousClass1IX r2, C136456tq r3, String str, Map map, int i) {
        this.A04 = str;
        this.A02 = r1;
        this.A01 = r2;
        this.A05 = map;
        this.A03 = r3;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostSessionData(sessionId=");
        A10.append(this.A04);
        A10.append(", messageToCrosspost=");
        A10.append(this.A02);
        A10.append(", destinationList=");
        A10.append(this.A01);
        A10.append(", multiDestinationCrosspostingInfoMap=");
        A10.append(this.A05);
        A10.append(", purposeEncryptionParams=");
        A10.append(this.A03);
        A10.append(", crosspostingEntryPoint=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
