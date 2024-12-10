package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;

/* renamed from: X.0iq  reason: invalid class name and case insensitive filesystem */
public final class C10750iq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onFrame;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10750iq(C22821Di r2) {
        super(1);
        this.$onFrame = r2;
    }

    public final Object A00(long j) {
        return this.$onFrame.invoke(Long.valueOf(j / SearchActionVerificationClientService.MS_TO_NS));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00(((Number) obj).longValue());
    }
}
