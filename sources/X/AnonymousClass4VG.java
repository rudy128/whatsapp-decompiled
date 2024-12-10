package X;

import java.util.List;

/* renamed from: X.4VG  reason: invalid class name */
public final class AnonymousClass4VG {
    public final AnonymousClass4UF A00;
    public final AnonymousClass4UG A01;
    public final AnonymousClass4TY A02;
    public final C86644Sl A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final List A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VG) {
                AnonymousClass4VG r5 = (AnonymousClass4VG) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0N = (((((((((((((AnonymousClass000.A0N(this.A00, ((C17900vP.A00(this.A06) * 31) + C17900vP.A00(this.A04)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17900vP.A00(this.A09)) * 31) + AnonymousClass001.A0k(this.A0A)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A08)) * 31) + AnonymousClass001.A0k(this.A01)) * 31;
        String str = this.A07;
        if (str != null) {
            i = str.hashCode();
        }
        return A0N + i;
    }

    public AnonymousClass4VG(AnonymousClass4UF r1, AnonymousClass4UG r2, AnonymousClass4TY r3, C86644Sl r4, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        this.A06 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A09 = str3;
        this.A0A = list;
        this.A05 = str4;
        this.A08 = str5;
        this.A01 = r2;
        this.A07 = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CTWAContentResponse(headline=");
        A10.append(this.A06);
        A10.append(", body=");
        A10.append(this.A04);
        A10.append(", contentSource=");
        A10.append(this.A00);
        A10.append(", thumbnailContent=");
        A10.append(this.A02);
        A10.append(", videoContent=");
        A10.append(this.A03);
        A10.append(", welcomeMessage=");
        A10.append(this.A09);
        A10.append(", icebreakers=");
        A10.append(this.A0A);
        A10.append(", clientId=");
        A10.append(this.A05);
        A10.append(", ref=");
        A10.append(this.A08);
        A10.append(", flow=");
        A10.append(this.A01);
        A10.append(", originalImage=");
        return C17900vP.A0B(this.A07, A10);
    }
}
