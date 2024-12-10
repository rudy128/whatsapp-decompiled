package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zT  reason: invalid class name and case insensitive filesystem */
public final class C81583zT extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;

    public C81583zT() {
        super(4214, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A03);
        r3.CHf(5, this.A00);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(6, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A07(AnonymousClass184.A04(C17880vN.A0h(), this.A02, A13), this.A03, A13), this.A00, A13), this.A04, A13), this.A05, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatLockDaily {");
        AnonymousClass186.A00(this.A02, "folderChatsCount", A10);
        AnonymousClass186.A00(this.A03, "folderOpenCount", A10);
        AnonymousClass186.A00(this.A00, "lockFolderHidden", A10);
        AnonymousClass186.A00(this.A04, "newAddChatCount", A10);
        AnonymousClass186.A00(this.A05, "newRemoveChatCount", A10);
        return AnonymousClass184.A0S(this.A01, "secretCodeActive", A10);
    }
}
