package X;

/* renamed from: X.2ma  reason: invalid class name and case insensitive filesystem */
public final class C59602ma {
    public final int A00;
    public final C40861vP A01;
    public final String A02;
    public final String A03;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C18070vi.A18(cls2, cls)) {
                C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.privacy.usernotice.badge.UserNoticeBadged");
                C59602ma r10 = (C59602ma) obj;
                String str = this.A03;
                String str2 = r10.A03;
                if (C18070vi.A18(str, str2)) {
                    String str3 = this.A02;
                    String str4 = r10.A02;
                    if (C18070vi.A18(str3, str4) && this.A00 == r10.A00) {
                        C40861vP r2 = this.A01;
                        C40861vP r1 = r10.A01;
                        if (!C18070vi.A18(r2, r1) || !C18070vi.A18(str, str2) || !C18070vi.A18(str3, str4) || !C18070vi.A18(r2, r1)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17890vO.A02(this.A02, C17880vN.A03(this.A03)));
    }

    public C59602ma(C40861vP r1, String str, String str2, int i) {
        C18070vi.A0j(str, str2);
        this.A03 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeBadge(text='");
        A10.append(this.A03);
        A10.append("', action='");
        A10.append(this.A02);
        A10.append("', badgeExpirationInHours=");
        A10.append(this.A00);
        A10.append(", timing=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
