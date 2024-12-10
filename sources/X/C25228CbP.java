package X;

/* renamed from: X.CbP  reason: case insensitive filesystem */
public final class C25228CbP {
    public final CTT A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final int A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25228CbP) {
                C25228CbP cbP = (C25228CbP) obj;
                if (!C18070vi.A18(this.A06, cbP.A06) || !C18070vi.A18(this.A01, cbP.A01) || !C18070vi.A18(this.A03, cbP.A03) || !C18070vi.A18(this.A02, cbP.A02) || !C18070vi.A18(this.A05, cbP.A05) || !C18070vi.A18(this.A04, cbP.A04) || this.A07 != cbP.A07 || !C18070vi.A18(this.A00, cbP.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BE6.A06((C17890vO.A02(this.A04, C17890vO.A02(this.A05, ((((((C17900vP.A00(this.A06) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A02)) * 31)) + this.A07) * 31, AnonymousClass001.A0k(this.A00)) * 31;
    }

    public C25228CbP(CTT ctt, Boolean bool, String str, String str2, String str3, String str4, String str5, int i) {
        this.A06 = str;
        this.A01 = bool;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A04 = str5;
        this.A07 = i;
        this.A00 = ctt;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LiveEditingDataModel(tabType=");
        A10.append(this.A06);
        A10.append(", isNewUser=");
        A10.append(this.A01);
        A10.append(", choiceId=");
        A10.append(this.A03);
        A10.append(", categoryId=");
        A10.append(this.A02);
        A10.append(", serializedAvatarConfig=");
        A10.append(this.A05);
        A10.append(", requestId=");
        A10.append(this.A04);
        A10.append(", qplInstanceKey=");
        A10.append(this.A07);
        A10.append(", parametricConfigDataModel=");
        A10.append(this.A00);
        C108975cc.A17(A10, ", networkType=");
        AnonymousClass000.A1G(A10, ", arClass=");
        A10.append(", deliverySpecId=");
        return C17900vP.A0B((String) null, A10);
    }
}
