package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9m9  reason: invalid class name and case insensitive filesystem */
public final class C191179m9 {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1NI A02;
    public final AnonymousClass00H A03;

    public final C29621ca A00(AnonymousClass1EC r10, String str, String str2, List list) {
        String str3;
        AnonymousClass1E7 A0E;
        AnonymousClass1EC r3 = r10;
        C18070vi.A0o(str2, r10, list);
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0D.add(new C178719Ee(r10, ((A2P) this.A03.get()).A03(C17880vN.A0Y(it), str2)));
        }
        UserJid A012 = this.A02.A01(r10);
        if (this.A01.A06(r10) == 1 || (A0E = this.A00.A0E(r10)) == null || (str3 = A0E.A0K()) == null) {
            str3 = "";
        }
        return (C29621ca) new AnonymousClass9F7(r3, A012, new AnonymousClass4A4(C83914Hd.A00(str2), 5), str, str3, (List) A0D).A00;
    }

    public C191179m9(AnonymousClass1M9 r1, AnonymousClass1CJ r2, AnonymousClass1NI r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
    }
}
