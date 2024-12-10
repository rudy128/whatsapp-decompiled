package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9kj  reason: invalid class name and case insensitive filesystem */
public final class C190309kj {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;

    public final C29621ca A00(C29681ch r9, String str, String str2, List list) {
        String str3;
        C46162Dk r1;
        C29681ch r3 = r9;
        C18070vi.A0o(str2, r9, list);
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(new C178719Ee(r9, ((A2P) this.A01.get()).A03(C17880vN.A0Y(it), str2)));
        }
        C29691ci A002 = AnonymousClass1CJ.A00(this.A00, r9);
        if (!(A002 instanceof C46162Dk) || (r1 = (C46162Dk) A002) == null || (str3 = r1.A0T) == null) {
            str3 = "";
        }
        return (C29621ca) new AnonymousClass9F7(r3, new AnonymousClass4A4(C83914Hd.A00(str2), 5), str, str3, (List) A0D).A00;
    }

    public C190309kj(AnonymousClass1CJ r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
