package X;

/* renamed from: X.4sS  reason: invalid class name and case insensitive filesystem */
public class C99214sS implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C99214sS(C87674Wm r1, String str, C31761g5 r3, int i) {
        this.A00 = i;
        this.A02 = r1;
        this.A03 = str;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            C1193567u r6 = (C1193567u) obj;
            C18070vi.A0d(r6, 0);
            String str = this.A03;
            C31761g5 r2 = (C31761g5) this.A01;
            r6.A00 = new C99214sS((C87674Wm) this.A02, str, r2, 0);
            r6.A01 = new C99254sW((Object) r2, 17);
        } else {
            AnonymousClass4bI r1 = ((C87674Wm) this.A02).A02;
            String str2 = this.A03;
            if (str2 == null) {
                str2 = "";
            }
            r1.A02(str2);
            ((C31761g5) this.A01).CG1((C22821Di) null, AnonymousClass000.A0i());
        }
        return C27621Wu.A00;
    }
}
