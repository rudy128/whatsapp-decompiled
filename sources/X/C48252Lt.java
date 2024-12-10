package X;

/* renamed from: X.2Lt  reason: invalid class name and case insensitive filesystem */
public class C48252Lt extends C57882jn {
    public final C40861vP A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C48252Lt r4 = (C48252Lt) obj;
            if (!C18070vi.A18(this.A04, r4.A04) || !C18070vi.A18(this.A03, r4.A03) || !C18070vi.A18(this.A02, r4.A02) || !C18070vi.A18(this.A01, r4.A01) || !C18070vi.A18(this.A00, r4.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A04;
        objArr[1] = this.A03;
        objArr[2] = this.A02;
        objArr[3] = this.A01;
        return AnonymousClass000.A0P(this.A00, objArr, 4);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48252Lt(C40861vP r1, AnonymousClass4DO r2, AnonymousClass4DP r3, String str, String str2, String str3, String str4, String str5) {
        super(r2, r3, str4);
        C18070vi.A0w(str, str2, str3, str4, str5);
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = str5;
        this.A00 = r1;
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UserNoticeBanner(text='");
        A10.append(this.A04);
        A10.append("', lightUrl='");
        A10.append(this.A03);
        A10.append("', lightIconFile='");
        A10.append(this.A01);
        A10.append("', darkUrl='");
        A10.append(this.A02);
        A10.append("', darkIconFile='");
        A10.append(this.A00);
        A10.append("', iconRole='");
        AnonymousClass4DO r0 = this.A02;
        String str2 = "null";
        if (r0 != null) {
            str = r0.name();
        } else {
            str = str2;
        }
        A10.append(str);
        A10.append("', iconStyle='");
        AnonymousClass4DP r02 = this.A03;
        if (r02 != null) {
            str2 = r02.name();
        }
        A10.append(str2);
        A10.append("', iconDescription='");
        A10.append(this.A04);
        A10.append("', action='");
        A10.append(this.A01);
        A10.append("', timing=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
