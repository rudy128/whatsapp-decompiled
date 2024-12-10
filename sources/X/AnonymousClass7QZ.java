package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7QZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QZ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass1FR A02;
    public final /* synthetic */ C72433Ly A03;
    public final /* synthetic */ C34531kd A04;
    public final /* synthetic */ C692236j A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ ArrayList A07;
    public final /* synthetic */ ArrayList A08;
    public final /* synthetic */ List A09;
    public final /* synthetic */ boolean A0A;

    public final void run() {
        C34531kd r3 = this.A04;
        List list = this.A09;
        ArrayList arrayList = this.A07;
        ArrayList arrayList2 = this.A08;
        C34531kd.A01(this.A01, this.A02, this.A03, r3, this.A05, this.A06, arrayList, arrayList2, list, this.A00, this.A0A);
    }

    public /* synthetic */ AnonymousClass7QZ(Context context, AnonymousClass1FR r2, C72433Ly r3, C34531kd r4, C692236j r5, String str, ArrayList arrayList, ArrayList arrayList2, List list, int i, boolean z) {
        this.A04 = r4;
        this.A09 = list;
        this.A07 = arrayList;
        this.A08 = arrayList2;
        this.A01 = context;
        this.A02 = r2;
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = str;
        this.A00 = i;
        this.A0A = z;
    }
}
