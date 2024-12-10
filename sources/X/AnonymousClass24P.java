package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.24P  reason: invalid class name */
public final class AnonymousClass24P extends AnonymousClass206 implements AnonymousClass22G {
    public String A00 = "";
    public List A01 = C18460wS.A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass24P(AnonymousClass205 r2, long j) {
        super(r2, 106, j);
        C18070vi.A0d(r2, 1);
    }

    public void A0i(String str) {
        if (str == null) {
            str = "";
        }
        this.A00 = str;
    }

    public List BXF() {
        List<C59152lq> list = this.A01;
        ArrayList arrayList = new ArrayList(C29351c6.A0C(list, 10));
        for (C59152lq r0 : list) {
            arrayList.add(r0.A01);
        }
        return arrayList;
    }

    public String BXE() {
        return this.A00;
    }
}
