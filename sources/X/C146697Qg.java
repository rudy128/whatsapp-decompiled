package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Qg  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146697Qg implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Context A04;
    public final /* synthetic */ Uri A05;
    public final /* synthetic */ AnonymousClass1FR A06;
    public final /* synthetic */ C72433Ly A07;
    public final /* synthetic */ C34531kd A08;
    public final /* synthetic */ C692236j A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ ArrayList A0B;
    public final /* synthetic */ ArrayList A0C;
    public final /* synthetic */ List A0D;
    public final /* synthetic */ AtomicInteger A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    public final void run() {
        C34531kd r20 = this.A08;
        boolean z = this.A0F;
        List list = this.A0D;
        Uri uri = this.A05;
        int i = this.A02;
        String str = this.A0A;
        int i2 = this.A03;
        boolean z2 = this.A0H;
        Context context = this.A04;
        AnonymousClass1FR r7 = this.A06;
        C692236j r6 = this.A09;
        C72433Ly r5 = this.A07;
        int i3 = this.A00;
        ArrayList arrayList = this.A0B;
        ArrayList arrayList2 = this.A0C;
        AtomicInteger atomicInteger = this.A0E;
        int i4 = this.A01;
        boolean z3 = this.A0G;
        boolean z4 = z;
        int i5 = i;
        int i6 = i2;
        ArrayList arrayList3 = arrayList2;
        List list2 = list;
        String str2 = str;
        ArrayList arrayList4 = arrayList;
        C692236j r21 = r6;
        AnonymousClass1FR r18 = r7;
        C72433Ly r19 = r5;
        Context context2 = context;
        Uri uri2 = uri;
        C34531kd.A00(context2, uri2, r18, r19, r20, r21, str2, arrayList4, arrayList3, list2, i5, i6, i3, z4, z2);
        if (atomicInteger.incrementAndGet() == i3) {
            C34531kd.A01(context2, r7, r5, r20, r6, str, arrayList, arrayList2, list, i4, z3);
        }
    }

    public /* synthetic */ C146697Qg(Context context, Uri uri, AnonymousClass1FR r4, C72433Ly r5, C34531kd r6, C692236j r7, String str, ArrayList arrayList, ArrayList arrayList2, List list, AtomicInteger atomicInteger, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A08 = r6;
        this.A0F = z;
        this.A0D = list;
        this.A05 = uri;
        this.A02 = i;
        this.A0A = str;
        this.A03 = i2;
        this.A0H = z2;
        this.A04 = context;
        this.A06 = r4;
        this.A09 = r7;
        this.A07 = r5;
        this.A00 = i3;
        this.A0B = arrayList;
        this.A0C = arrayList2;
        this.A0E = atomicInteger;
        this.A01 = i4;
        this.A0G = z3;
    }
}
