package X;

import java.util.Locale;

/* renamed from: X.4VO  reason: invalid class name */
public final class AnonymousClass4VO {
    public final C88434Zr A00;
    public final AnonymousClass4SC A01;
    public final String A02;
    public final boolean A03;

    public AnonymousClass4VO(C88434Zr r2, AnonymousClass4SC r3, String str, boolean z) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = z;
        this.A02 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VO) {
                AnonymousClass4VO r5 = (AnonymousClass4VO) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03 || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        String A0y;
        StringBuilder A11 = AnonymousClass000.A11(AnonymousClass4GP.A00(this.A01, this.A02));
        A11.append('@');
        C88434Zr r1 = this.A00;
        if (C18070vi.A18(r1, C80383x3.A00)) {
            A0y = "whatsapp-green#tonal";
        } else if (C18070vi.A18(r1, C80273ws.A00)) {
            A0y = "whatsapp-green#vibrant";
        } else if (r1 instanceof C80173wi) {
            String lowerCase = r1.A00.toLowerCase(Locale.ROOT);
            C18070vi.A0X(lowerCase);
            A0y = AnonymousClass1YE.A07(lowerCase, "tonal", "#tonal", false);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            String lowerCase2 = r1.A00.toLowerCase(Locale.ROOT);
            C18070vi.A0X(lowerCase2);
            A10.append(lowerCase2);
            A0y = AnonymousClass000.A0y("#vibrant", A10);
        }
        return AnonymousClass000.A0y(A0y, A11);
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)), this.A03) + C17900vP.A00(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ChatThemeBundle(theme=");
        A10.append(this.A00);
        A10.append(", wallpaper=");
        A10.append(this.A01);
        A10.append(", selected=");
        A10.append(this.A03);
        A10.append(", thumbnailUri=");
        return C17900vP.A0B(this.A02, A10);
    }
}
