package X;

/* renamed from: X.5q8  reason: invalid class name and case insensitive filesystem */
public class C114085q8 extends C70553Bn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass71N A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114085q8(AnonymousClass71N r2, int i) {
        super("StreamingUploadDataTask_update");
        this.A01 = r2;
        this.A00 = i;
    }

    public void run() {
        AnonymousClass71N r1 = this.A01;
        r1.A03.updateDataTaskUploadProgress(r1.A02.mTaskIdentifier, (long) this.A00, r1.A00, r1.A01);
    }
}
