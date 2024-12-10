package X;

/* renamed from: X.6zq  reason: invalid class name and case insensitive filesystem */
public final class C140036zq {
    public final C87814Xd A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C140036zq) {
                C140036zq r5 = (C140036zq) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, ((((((((((C17900vP.A00(this.A03) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01)) * 31);
    }

    public C140036zq(C87814Xd r1, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A03 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A04 = str4;
        this.A02 = str5;
        this.A01 = str6;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseChatResult(phoneNumber=");
        A10.append(this.A03);
        A10.append(", username=");
        A10.append(this.A05);
        A10.append(", usernamePin=");
        A10.append(this.A06);
        A10.append(", text=");
        A10.append(this.A04);
        A10.append(", entryPointConversionSource=");
        A10.append(this.A02);
        A10.append(", entryPointConversionApp=");
        A10.append(this.A01);
        A10.append(", ctwaDeeplinkContent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }

    public C140036zq() {
        this(C87814Xd.A0e, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
    }
}
