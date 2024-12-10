package X;

import java.util.Iterator;

/* renamed from: X.4m5  reason: invalid class name and case insensitive filesystem */
public final class C95344m5 implements C72113Kr {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void Bqf() {
        if (AnonymousClass3MW.A0Y(this.A03).A0L()) {
            if (((long) this.A00.A01.size()) <= 0) {
                AnonymousClass00H r5 = this.A01;
                if (C17880vN.A0C(((AnonymousClass1TK) r5.get()).A02).getLong("folder_open_count", 0) <= 0 && C17880vN.A0C(((AnonymousClass1TK) r5.get()).A02).getLong("new_add_chat_count", 0) <= 0 && C17880vN.A0C(((AnonymousClass1TK) r5.get()).A02).getLong("new_remove_chat_count", 0) <= 0) {
                    return;
                }
            }
            AnonymousClass4VV A0a = AnonymousClass3MX.A0a(this.A02);
            C81583zT r2 = new C81583zT();
            r2.A02 = C17880vN.A0n(A0a.A01.A01.size());
            AnonymousClass1TK r8 = A0a.A00;
            C18100vl r3 = r8.A02;
            r2.A03 = Long.valueOf(C17890vO.A05(C17880vN.A0C(r3), "folder_open_count"));
            r2.A04 = Long.valueOf(C17890vO.A05(C17880vN.A0C(r3), "new_add_chat_count"));
            r2.A05 = Long.valueOf(C17890vO.A05(C17880vN.A0C(r3), "new_remove_chat_count"));
            r2.A00 = Boolean.valueOf(r8.A04());
            r2.A01 = Boolean.valueOf(r8.A05());
            A0a.A02.CC4(r2);
            String[] strArr = new String[4];
            strArr[0] = "folder_chats_count";
            strArr[1] = "folder_open_count";
            strArr[2] = "new_add_chat_count";
            Iterator it = C18070vi.A0O("new_remove_chat_count", strArr, 3).iterator();
            while (it.hasNext()) {
                C17880vN.A1B(C17890vO.A0A(r3), C17880vN.A0v(it));
            }
        }
    }

    public C95344m5(AnonymousClass1CJ r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
