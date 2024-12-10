package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.6OE  reason: invalid class name */
public final class AnonymousClass6OE extends C134426qZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C41801x5 A01;
    public final /* synthetic */ C1603788f A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ List A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6OE(Context context, C41801x5 r2, C1603788f r3, AnonymousClass00H r4, List list, List list2) {
        super(r4);
        this.A01 = r2;
        this.A03 = list;
        this.A02 = r3;
        this.A00 = context;
        this.A04 = list2;
    }

    public void A00(C136316tc r3) {
        super.A00(r3);
        C30101dO A002 = C41801x5.A00(this.A01);
        if (A002 != null) {
            A002.A04("FINISH_CROSSPOST");
            A002.A00();
        }
    }
}
