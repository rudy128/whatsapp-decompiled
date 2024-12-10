package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4P5  reason: invalid class name */
public class AnonymousClass4P5 {
    public final Context A00;
    public final RecyclerView A01;
    public final C40261uQ A02;
    public final C40251uP A03;
    public final C77033p1 A04;
    public final C40401ue A05;
    public final C37451pZ A06;
    public final C37451pZ A07;
    public final C40631v1 A08;

    public AnonymousClass4P5(Context context, AnonymousClass01E r10, AnonymousClass1F9 r11, RecyclerView recyclerView, C84284Iw r13, C40261uQ r14, C40251uP r15, C39511tC r16, C35751mk r17, C24671Lf r18, C37451pZ r19, C37451pZ r20, AnonymousClass1Q1 r21, AnonymousClass1NN r22, C25191Ng r23, AnonymousClass1EC r24) {
        this.A02 = r14;
        this.A03 = r15;
        this.A00 = context;
        this.A06 = r19;
        this.A07 = r20;
        this.A01 = recyclerView;
        C88114Yj r1 = new C88114Yj();
        r1.A00 = 10;
        r1.A0H = true;
        r1.A09 = true;
        r1.A0C = true;
        r1.A0G = true;
        r1.A0B = false;
        C77033p1 A002 = C77033p1.A00(r10, r13, r1, r24, 1);
        this.A04 = A002;
        C40401ue A003 = this.A02.A00(this.A06, this.A07, this.A03.A00(this.A00), 3);
        this.A05 = A003;
        C72463Mc.A0z(context, recyclerView, 1);
        recyclerView.setAdapter(A003);
        recyclerView.setItemAnimator((C37961qT) null);
        recyclerView.A0r(new BM2(context, recyclerView, (E6R) null, A003));
        A002.A0z.A0A(r11, new C91584fv(A003, 44));
        C39511tC r12 = r16;
        C35751mk r2 = r17;
        C24671Lf r4 = r18;
        C40631v1 r0 = new C40631v1(r12, r2, A003, r4, r21, r22, r23);
        this.A08 = r0;
        r0.A00();
    }
}
