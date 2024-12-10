package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3zL  reason: invalid class name and case insensitive filesystem */
public final class C81503zL extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;

    public C81503zL() {
        super(4212, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A04);
        r3.CHf(5, this.A02);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A03(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A01, A13), this.A04, A13), this.A02, A13), this.A03, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChatLockAction {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "actionEntryPoint", A10);
        AnonymousClass186.A00(this.A04, "actionFolderChatsCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "authType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "chatLockActionType", A10);
        return AnonymousClass184.A0S(this.A00, "chatLockIsGroup", A10);
    }
}
