package X;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* renamed from: X.9h0  reason: invalid class name and case insensitive filesystem */
public class C188179h0 {
    public Context A00;
    public AnonymousClass00I A01;
    public C185329cP A02 = new C185329cP();
    public WorkDatabase A03;
    public B4Q A04;
    public A2t A05;
    public C71973Kb A06;
    public final List A07;

    public C188179h0(Context context, AnonymousClass00I r3, WorkDatabase workDatabase, B4Q b4q, A2t a2t, C71973Kb r7, List list) {
        this.A00 = context.getApplicationContext();
        this.A06 = r7;
        this.A04 = b4q;
        this.A01 = r3;
        this.A03 = workDatabase;
        this.A05 = a2t;
        this.A07 = list;
    }
}
