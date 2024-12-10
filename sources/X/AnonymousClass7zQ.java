package X;

/* renamed from: X.7zQ  reason: invalid class name */
public final class AnonymousClass7zQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C136356tg $mediaUploadFailedParams;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zQ(C136356tg r2) {
        super(1);
        this.$mediaUploadFailedParams = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("error_code", Integer.valueOf(this.$mediaUploadFailedParams.A00));
        A0a.A01("is_retryable", Boolean.valueOf(this.$mediaUploadFailedParams.A05));
        return C27621Wu.A00;
    }
}
