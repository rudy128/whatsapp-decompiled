package X;

import java.util.HashMap;

/* renamed from: X.B1p  reason: case insensitive filesystem */
public final class C22287B1p extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $deliveryCallbackFuture;
    public final /* synthetic */ HashMap $protocolErrors;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ C184409au $syncInput;
    public final /* synthetic */ AnonymousClass1UP $uniSyncResultDataHandler;
    public final /* synthetic */ A01 $usyncRequestData;
    public final /* synthetic */ C199239zf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22287B1p(C184409au r2, C199239zf r3, AnonymousClass1UP r4, A01 a01, C26981Ug r6, String str, HashMap hashMap) {
        super(1);
        this.this$0 = r3;
        this.$syncInput = r2;
        this.$protocolErrors = hashMap;
        this.$uniSyncResultDataHandler = r4;
        this.$sessionId = str;
        this.$deliveryCallbackFuture = r6;
        this.$usyncRequestData = a01;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1193567u A0S = C108955ca.A0S(obj);
        C199239zf r3 = this.this$0;
        C184409au r2 = this.$syncInput;
        HashMap hashMap = this.$protocolErrors;
        AnonymousClass1UP r4 = this.$uniSyncResultDataHandler;
        String str = this.$sessionId;
        C26981Ug r5 = this.$deliveryCallbackFuture;
        A0S.A00 = new C22284B1m(r2, r3, r4, r5, str, hashMap);
        A0S.A01 = new C22285B1n(r3, r4, this.$usyncRequestData, r5, str, hashMap);
        return C27621Wu.A00;
    }
}
