package X;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Qf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C146687Qf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ Uri A04;
    public final /* synthetic */ AnonymousClass1FR A05;
    public final /* synthetic */ C72433Ly A06;
    public final /* synthetic */ C34531kd A07;
    public final /* synthetic */ C692236j A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ ArrayList A0A;
    public final /* synthetic */ ArrayList A0B;
    public final /* synthetic */ List A0C;
    public final /* synthetic */ AtomicInteger A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;

    public final void run() {
        C34531kd r14 = this.A07;
        Uri uri = this.A04;
        boolean z = this.A0E;
        List list = this.A0C;
        String str = this.A09;
        int i = this.A02;
        boolean z2 = this.A0G;
        Context context = this.A03;
        AnonymousClass1FR r10 = this.A05;
        C692236j r9 = this.A08;
        C72433Ly r8 = this.A06;
        int i2 = this.A00;
        ArrayList arrayList = this.A0A;
        ArrayList arrayList2 = this.A0B;
        AtomicInteger atomicInteger = this.A0D;
        int i3 = this.A01;
        boolean z3 = this.A0F;
        int A002 = r14.A0A.A00(uri);
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        List list2 = list;
        C34531kd r15 = r14;
        C692236j r16 = r9;
        Uri uri2 = uri;
        AnonymousClass1FR r13 = r10;
        C72433Ly r142 = r8;
        r14.A02.A0J(new C146697Qg(context, uri2, r13, r142, r15, r16, str, arrayList3, arrayList4, list2, atomicInteger, A002, i, i2, i3, z, z2, z3));
    }

    public /* synthetic */ C146687Qf(Context context, Uri uri, AnonymousClass1FR r4, C72433Ly r5, C34531kd r6, C692236j r7, String str, ArrayList arrayList, ArrayList arrayList2, List list, AtomicInteger atomicInteger, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A07 = r6;
        this.A04 = uri;
        this.A0E = z;
        this.A0C = list;
        this.A09 = str;
        this.A02 = i;
        this.A0G = z2;
        this.A03 = context;
        this.A05 = r4;
        this.A08 = r7;
        this.A06 = r5;
        this.A00 = i2;
        this.A0A = arrayList;
        this.A0B = arrayList2;
        this.A0D = atomicInteger;
        this.A01 = i3;
        this.A0F = z3;
    }
}
