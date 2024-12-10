package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Qe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146677Qe implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ AnonymousClass1FR A04;
    public final /* synthetic */ C72433Ly A05;
    public final /* synthetic */ C34531kd A06;
    public final /* synthetic */ C692236j A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ ArrayList A09;
    public final /* synthetic */ ArrayList A0A;
    public final /* synthetic */ List A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public final void run() {
        C34531kd r11 = this.A06;
        List list = this.A0B;
        boolean z = this.A0D;
        List list2 = this.A0C;
        String str = this.A08;
        int i = this.A02;
        boolean z2 = this.A0F;
        Context context = this.A03;
        AnonymousClass1FR r8 = this.A04;
        C692236j r7 = this.A07;
        C72433Ly r6 = this.A05;
        int i2 = this.A00;
        ArrayList arrayList = this.A09;
        ArrayList arrayList2 = this.A0A;
        int i3 = this.A01;
        boolean z3 = this.A0E;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri A0M = C108945cZ.A0M(it);
            ArrayList arrayList3 = arrayList2;
            String str2 = str;
            ArrayList arrayList4 = arrayList;
            C34531kd r21 = r11;
            C692236j r22 = r7;
            AnonymousClass1FR r19 = r8;
            C72433Ly r20 = r6;
            Context context2 = context;
            Uri uri = A0M;
            C34531kd.A00(context2, uri, r19, r20, r21, r22, str2, arrayList4, arrayList3, list2, r11.A0A.A00(A0M), i, i2, z, z2);
        }
        r11.A02.A0J(new AnonymousClass7QZ(context, r8, r6, r11, r7, str, arrayList, arrayList2, list2, i3, z3));
    }

    public /* synthetic */ C146677Qe(Context context, AnonymousClass1FR r3, C72433Ly r4, C34531kd r5, C692236j r6, String str, ArrayList arrayList, ArrayList arrayList2, List list, List list2, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A06 = r5;
        this.A0B = list;
        this.A0D = z;
        this.A0C = list2;
        this.A08 = str;
        this.A02 = i;
        this.A0F = z2;
        this.A03 = context;
        this.A04 = r3;
        this.A07 = r6;
        this.A05 = r4;
        this.A00 = i2;
        this.A09 = arrayList;
        this.A0A = arrayList2;
        this.A01 = i3;
        this.A0E = z3;
    }
}
