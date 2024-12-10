package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.6OD  reason: invalid class name */
public final class AnonymousClass6OD extends C134426qZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C122646Re A01;
    public final /* synthetic */ C41801x5 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6OD(Context context, C122646Re r2, C41801x5 r3, AnonymousClass00H r4, String str, List list) {
        super(r4);
        this.A02 = r3;
        this.A04 = list;
        this.A01 = r2;
        this.A03 = str;
        this.A00 = context;
    }

    public void A00(C136316tc r3) {
        super.A00(r3);
        C30101dO A002 = C41801x5.A00(this.A02);
        if (A002 != null) {
            A002.A04("FINISH_CROSSPOST");
            A002.A00();
        }
    }
}
