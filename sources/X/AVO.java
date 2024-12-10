package X;

public final class AVO implements C22513BAw {
    public final /* synthetic */ C31761g5 A00;

    public AVO(C31761g5 r1) {
        this.A00 = r1;
    }

    public void C7R(String str) {
        this.A00.resumeWith(str);
    }

    public void onFailure(Exception exc) {
        this.A00.resumeWith(C30691eM.A00(exc));
    }
}
