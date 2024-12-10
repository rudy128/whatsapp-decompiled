package X;

/* renamed from: X.6mi  reason: invalid class name and case insensitive filesystem */
public class C132396mi {
    public final /* synthetic */ C127326eA A00;
    public final /* synthetic */ C139306yc A01;
    public final /* synthetic */ byte[][] A02;

    public C132396mi(C127326eA r1, C139306yc r2, byte[][] bArr) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = bArr;
    }

    public void A00(String str, String str2, int i) {
        Integer num;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("keytransparencymanager/serializedlookup IQ with id: ");
        A10.append(str);
        A10.append(" received error code: ");
        A10.append(i);
        C17900vP.A0e(" and error text: ", str2, A10);
        AnonymousClass87K r1 = this.A00.A00;
        if (i == 16792) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A0C;
        }
        r1.BpN(num);
    }
}
