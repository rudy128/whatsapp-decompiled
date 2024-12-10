package X;

import java.util.HashMap;

/* renamed from: X.9kn  reason: invalid class name and case insensitive filesystem */
public final class C190349kn {
    public final HashMap A00 = C17880vN.A11();
    public final ADL A01;

    public C190349kn(C18030ve r6) {
        C18070vi.A0d(r6, 1);
        this.A01 = new ADL(C17890vO.A03(C18020vd.A00(C18040vf.A02, r6, 1269)), "PHOENIX", true);
    }

    public final synchronized ADL A00(String str) {
        ADL adl;
        HashMap hashMap = this.A00;
        if (hashMap.containsKey(str)) {
            adl = (ADL) hashMap.get(str);
        } else {
            adl = this.A01;
        }
        return adl;
    }
}
