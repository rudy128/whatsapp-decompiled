package X;

import java.io.InputStream;

/* renamed from: X.82s  reason: invalid class name and case insensitive filesystem */
public final class C1589682s extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1OX $$this$withContext;
    public final /* synthetic */ InputStream $inputStream;
    public final /* synthetic */ C22821Di $progressListener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589682s(InputStream inputStream, C22821Di r3, AnonymousClass1OX r4) {
        super(1);
        this.$$this$withContext = r4;
        this.$progressListener = r3;
        this.$inputStream = inputStream;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        if (AnonymousClass1OW.A05(this.$$this$withContext)) {
            this.$progressListener.invoke(Integer.valueOf(A0M));
        } else {
            this.$inputStream.close();
        }
        return C27621Wu.A00;
    }
}
