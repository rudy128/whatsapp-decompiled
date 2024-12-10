package X;

/* renamed from: X.2rS  reason: invalid class name and case insensitive filesystem */
public final class C62472rS {
    public final AnonymousClass1E7 A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62472rS) {
                C62472rS r5 = (C62472rS) obj;
                if (this.A01 != r5.A01 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return ((((((A00(num).hashCode() + num.intValue()) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A03)) * 31) + C17880vN.A02(this.A02);
    }

    public C62472rS(AnonymousClass1E7 r1, Integer num, Long l, String str) {
        this.A01 = num;
        this.A00 = r1;
        this.A03 = str;
        this.A02 = l;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "CANNOT_OPEN_LINK";
            case 1:
                return "SHOW_ERROR_DIALOG";
            case 2:
                return "SHOW_INVITE_DIALOG";
            case 3:
                return "SHOW_CALL_NOT_ALLOWED_DIALOG";
            default:
                return "START_VOICE_CALL";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParseUriResult(resultType=");
        A10.append(A00(this.A01));
        A10.append(", contact=");
        A10.append(this.A00);
        A10.append(", phoneNumber=");
        A10.append(this.A03);
        A10.append(", sourceSurface=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
