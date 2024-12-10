package X;

/* renamed from: X.6Y6  reason: invalid class name */
public abstract class AnonymousClass6Y6 {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.6nR, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.6nR, java.lang.Object] */
    public static final C133986pp A00(C136306tb r5) {
        C130246j7 r3 = new C130246j7();
        String str = r5.A02;
        if (str == null) {
            str = "";
        }
        r3.A02 = str;
        r3.A04 = r5.A04;
        r3.A03 = r5.A05;
        r3.A01 = r5.A01;
        for (C133746pQ r1 : r5.A03) {
            ? obj = new Object();
            obj.A02 = r1.A02;
            obj.A00 = r1.A00;
            obj.A00(r1.A01);
            obj.A03 = r1.A03;
            if (obj.A02 == null && obj.A01 == null) {
                throw AnonymousClass000.A0k("Title or icon must be set");
            }
            r3.A05.add(new C133756pR(obj));
        }
        C133746pQ r2 = r5.A00;
        if (r2 != null) {
            ? obj2 = new Object();
            obj2.A02 = r2.A02;
            obj2.A00 = r2.A00;
            obj2.A00(r2.A01);
            obj2.A03 = r2.A03;
            if (obj2.A02 == null && obj2.A01 == null) {
                throw AnonymousClass000.A0k("Title or icon must be set");
            }
            r3.A00 = new C133756pR(obj2);
        }
        return new C133986pp(r3);
    }
}
