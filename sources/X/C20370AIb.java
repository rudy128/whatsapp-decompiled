package X;

import com.facebook.cameracore.ardelivery.storage.interfaces.StorageCallback;
import java.io.File;
import java.util.Map;

/* renamed from: X.AIb  reason: case insensitive filesystem */
public abstract class C20370AIb implements C22551BCi {
    public final Map A00;

    public C22551BCi A00(Object obj) {
        C22551BCi bCi = (C22551BCi) this.A00.get(obj);
        if (bCi != null) {
            return bCi;
        }
        throw AnonymousClass8BX.A0V(obj, "No asset storage exists for type: ", AnonymousClass000.A10());
    }

    public Object A01(A6K a6k) {
        if (!(this instanceof C162438Ks)) {
            return a6k.A02;
        }
        if (a6k.A02() != null) {
            return a6k.A02();
        }
        throw AnonymousClass000.A0k("The capability cannot be null in AR asset metadata");
    }

    public C20370AIb(Map map) {
        this.A00 = map;
    }

    public File BNx(A6K a6k, StorageCallback storageCallback) {
        return A00(A01(a6k)).BNx(a6k, storageCallback);
    }

    public boolean BeA(A6K a6k) {
        return A00(A01(a6k)).BeA(a6k);
    }

    public void CEX(A6K a6k) {
        A00(A01(a6k)).CEX(a6k);
    }

    public File CGf(A6K a6k, StorageCallback storageCallback, File file) {
        return A00(A01(a6k)).CGf(a6k, storageCallback, file);
    }

    public void CRS(A6K a6k) {
        A00(A01(a6k)).CRS(a6k);
    }
}
