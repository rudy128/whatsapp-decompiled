package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;

/* renamed from: X.9fL  reason: invalid class name and case insensitive filesystem */
public final class C187149fL {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C187149fL(C20282AEq aEq) {
        String A002 = A4D.A00();
        C18070vi.A0X(A002);
        this.A03 = A002;
        A6K a6k = aEq.A01;
        String str = "";
        if (a6k.A02 == ARAssetType.EFFECT) {
            String A003 = AnonymousClass9OX.A00(aEq);
            C18070vi.A0X(A003);
            this.A00 = A003;
            String str2 = a6k.A0B;
            if (str2 == null || (aEq.A0A && (str2 = Integer.toString(aEq.hashCode())) == null)) {
                str2 = str;
            }
            this.A01 = str2;
            String str3 = aEq.A06;
            this.A02 = str3 != null ? AnonymousClass1YE.A07(str3, "\"", str, false) : str;
            this.A04 = "AREffect";
            return;
        }
        this.A00 = str;
        this.A02 = str;
        this.A04 = str;
        this.A01 = str;
    }
}
