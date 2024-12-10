package X;

import org.json.JSONException;

/* renamed from: X.35n  reason: invalid class name and case insensitive filesystem */
public final class C690035n implements AnonymousClass16B {
    public /* bridge */ /* synthetic */ Object BLh(String str) {
        C18070vi.A0d(str, 0);
        try {
            return AnonymousClass9QE.A00(C17880vN.A16(str));
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: AdsEntryPointTransformer/fromData/JSONException", e);
        } catch (AnonymousClass11T e2) {
            throw new AnonymousClass2RU("CTWA: AdsEntryPointTransformer/fromData/InvalidJidException", e2);
        } catch (IllegalArgumentException e3) {
            throw new AnonymousClass2RU("CTWA: AdsEntryPointTransformer/fromData/IllegalArgumentException", e3);
        }
    }

    public /* bridge */ /* synthetic */ String CPD(Object obj) {
        AnonymousClass8oR r4 = (AnonymousClass8oR) obj;
        C18070vi.A0d(r4, 0);
        try {
            return C18070vi.A0H(r4.A02());
        } catch (JSONException e) {
            throw new AnonymousClass2RU("CTWA: AdsEntryPointTransformer/toData/JSONException", e);
        }
    }
}
