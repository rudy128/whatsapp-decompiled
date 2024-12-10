package X;

import android.util.LruCache;

/* renamed from: X.9AY  reason: invalid class name */
public final class AnonymousClass9AY extends C24741Lm {
    public final LruCache A00 = new LruCache(5);
    public final LruCache A01 = new LruCache(100);
    public final C18030ve A02;
    public final AnonymousClass1QE A03 = AnonymousClass1QE.A00("IndiaUpiP2mCheckoutSessionCacheManager", "payment", "IN");

    /* JADX WARNING: type inference failed for: r0v8, types: [X.9qx, java.lang.Object] */
    public final void A0A(AnonymousClass205 r6, AnonymousClass9FM r7, String str) {
        AnonymousClass9DA r0;
        Number number;
        if (C18020vd.A05(C18040vf.A02, this.A02, 7302) && r6 != null && C18070vi.A18(str, "UPI") && (r0 = r7.A02) != null && (number = (Number) r0.A00) != null && number.longValue() > 0) {
            LruCache lruCache = this.A01;
            ? obj = new Object();
            obj.A00 = r7;
            obj.A01 = false;
            lruCache.put(r6, obj);
        }
    }

    public final void A0B(AnonymousClass205 r4, String str) {
        if (str.equals("UPI") && r4 != null) {
            this.A03.A04(AnonymousClass001.A1E(r4, "Removing cached checkout session for ", AnonymousClass000.A10()));
            this.A01.remove(r4);
        }
    }

    public String BZc() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("P2mCheckoutSessionCache - ");
        A10.append(this.A01.size() + this.A00.size());
        return AnonymousClass000.A0y(" items", A10);
    }

    public void C9L(C122516Qr r2, boolean z) {
        this.A01.evictAll();
        this.A00.evictAll();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9AY(C18030ve r4, C24571Kv r5) {
        super(r5);
        C18070vi.A0j(r4, r5);
        this.A02 = r4;
    }
}
