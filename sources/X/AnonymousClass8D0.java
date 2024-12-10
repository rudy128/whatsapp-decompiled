package X;

import android.util.LruCache;

/* renamed from: X.8D0  reason: invalid class name */
public final class AnonymousClass8D0 extends LruCache {
    public AnonymousClass8D0() {
        super(5242880);
    }

    public /* bridge */ /* synthetic */ int sizeOf(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj2;
        C18070vi.A0d(bArr, 1);
        return bArr.length;
    }
}
