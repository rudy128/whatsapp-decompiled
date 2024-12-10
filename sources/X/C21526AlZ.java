package X;

/* renamed from: X.AlZ  reason: case insensitive filesystem */
public class C21526AlZ implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C21526AlZ(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public final Object invoke() {
        int i = this.A00;
        C20443ALg aLg = (C20443ALg) this.A01;
        if (i != 0) {
            String str = this.A03;
            byte[] bArr = (byte[]) this.A02;
            aLg.A00.put(str, bArr);
            ((C191149m6) aLg.A02.get()).A00(str, bArr);
        } else {
            String str2 = this.A03;
            C21132Af0 af0 = (C21132Af0) this.A02;
            C18070vi.A0d(af0, 2);
            Object obj = aLg.A00.get(str2);
            af0.A0B(AnonymousClass1D6.A01(Boolean.valueOf(AnonymousClass000.A1W(obj)), obj));
        }
        return C27621Wu.A00;
    }
}
