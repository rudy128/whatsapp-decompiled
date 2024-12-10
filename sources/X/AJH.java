package X;

import com.google.android.gms.tasks.OnFailureListener;

public class AJH implements OnFailureListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public AJH(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj;
    }

    public final void onFailure(Exception exc) {
        int i = this.A00;
        C19992A2f a2f = (C19992A2f) this.A01;
        String str = this.A03;
        Object obj = this.A02;
        if (i != 0) {
            B5F b5f = (B5F) obj;
            C72473Md.A1I(str, exc);
            C17900vP.A0Z(exc, "EC04B8E62D38E19E749A", AnonymousClass000.A10());
            C26031Qo r3 = a2f.A03;
            AnonymousClass8oF r2 = AnonymousClass8oF.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("on_failure_exception");
            r3.A01(r2, AnonymousClass000.A0y(C19992A2f.A00(exc), A10), exc);
            AnonymousClass8BR.A0W(a2f.A04).A01(str, "_FAILURE");
            if (b5f != null) {
                ((C30391dr) ((AVN) b5f).A01).resumeWith(C108945cZ.A1J(exc));
                return;
            }
            return;
        }
        C72473Md.A1I(str, exc);
        C26031Qo r32 = a2f.A03;
        AnonymousClass8oF r22 = AnonymousClass8oF.A02;
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("on_failure_exception");
        r32.A01(r22, AnonymousClass000.A0y(C19992A2f.A00(exc), A102), exc);
        AnonymousClass8BR.A0W(a2f.A04).A01(str, "_FAILURE");
        ((C22513BAw) obj).onFailure(exc);
    }
}
