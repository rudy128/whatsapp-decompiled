package X;

import android.net.Uri;

/* renamed from: X.9oe  reason: invalid class name and case insensitive filesystem */
public abstract class C192589oe {
    public final Uri A00;
    public final String A01;
    public final C192509oW A02;
    public final C24360Bzv A03;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A00;
        objArr[2] = this.A02;
        objArr[3] = this.A03;
        return AnonymousClass000.A0P((Object) null, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C192589oe)) {
            return false;
        }
        C192589oe r4 = (C192589oe) obj;
        if (!this.A00.equals(r4.A00) || !this.A02.equals(r4.A02) || !this.A01.equals(r4.A01)) {
            return false;
        }
        return true;
    }

    public C192589oe(String str, String str2, C192509oW r4, C24360Bzv bzv) {
        Uri parse = Uri.parse(str);
        C18070vi.A0X(parse);
        this.A00 = parse;
        this.A02 = r4;
        this.A03 = bzv;
        this.A01 = str2;
    }
}
