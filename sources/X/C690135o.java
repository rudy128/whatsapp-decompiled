package X;

import org.json.JSONException;

/* renamed from: X.35o  reason: invalid class name and case insensitive filesystem */
public final class C690135o implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            return AnonymousClass2TE.A00(C17880vN.A16(str));
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: OrganicEntryPointTransformer/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: OrganicEntryPointTransformer/fromData/JSONException", e2);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        AnonymousClass2DX r4 = (AnonymousClass2DX) obj;
        C18070vi.A0d(r4, 0);
        try {
            return C18070vi.A0H(r4.A02());
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: OrganicEntryPointTransformer/toData/JSONException", e);
        }
    }
}
