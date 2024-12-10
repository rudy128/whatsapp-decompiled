package X;

import org.json.JSONObject;

/* renamed from: X.Ab0  reason: case insensitive filesystem */
public final class C20884Ab0 implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        A2Y A00;
        C18070vi.A0d(str, 0);
        JSONObject A16 = C17880vN.A16(str);
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(A16.getString("chat_jid_raw"));
        if (A02 != null && (A00 = A2Y.A02.A00(AnonymousClass8BS.A0w("call_permission_reply_option", A16))) != null) {
            return new C193559qI(A00, A02);
        }
        throw new AnonymousClass2RU("Invalid BizCallPermissionSetting JSON");
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        C193559qI r4 = (C193559qI) obj;
        JSONObject A0u = C108985cd.A0u(r4);
        A0u.put("chat_jid_raw", r4.A01.getRawString());
        return AnonymousClass8BV.A0r(r4.A00.A00(), "call_permission_reply_option", A0u);
    }
}
