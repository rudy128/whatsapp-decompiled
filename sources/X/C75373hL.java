package X;

/* renamed from: X.3hL  reason: invalid class name and case insensitive filesystem */
public final class C75373hL extends C143887Fe {
    public C20941Abv A00;
    public boolean A01;

    public boolean A0K() {
        return true;
    }

    public final void A0O(C20941Abv abv) {
        C18070vi.A0d(abv, 0);
        this.A00 = abv;
        String str = abv.A0G;
        if (str != null) {
            this.A0B = str;
        }
        String str2 = abv.A04;
        if (str2 != null) {
            this.A0A = str2;
        }
        String str3 = abv.A0E;
        if (str3 != null) {
            this.A08 = str3;
        }
        byte[] bArr = abv.A0N;
        if (!(bArr == null || bArr.length == 0)) {
            this.A0J = bArr;
        }
        byte[] bArr2 = abv.A01;
        if (bArr2 == null) {
            String str4 = abv.A0F;
            if (str4 != null) {
                AnonymousClass3Ma.A1P(str4, 0, this.A0D);
            }
        } else if (bArr2.length != 0) {
            this.A0J = bArr2;
        }
        String str5 = abv.A08;
        if (str5 != null && str5.length() > 0) {
            this.A06 = new C24004Btq(str5, -1, -1);
        }
    }

    public boolean A0L() {
        return this.A01;
    }
}
