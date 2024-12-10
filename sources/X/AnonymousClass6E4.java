package X;

import java.util.Map;

/* renamed from: X.6E4  reason: invalid class name */
public final class AnonymousClass6E4 extends C123126Tf {
    public final String A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6E4) {
                AnonymousClass6E4 r5 = (AnonymousClass6E4) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A00) * 31) + C17880vN.A02(this.A01);
    }

    public AnonymousClass6E4(String str, Map map) {
        this.A00 = str;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarNoticeEvent(event=");
        A10.append(this.A00);
        A10.append(", params=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
