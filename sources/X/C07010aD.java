package X;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0aD  reason: invalid class name and case insensitive filesystem */
public final class C07010aD implements Callable {
    public final /* synthetic */ AnonymousClass0sU A00;
    public final /* synthetic */ AnonymousClass0sX A01;
    public final /* synthetic */ AnonymousClass0HY A02;
    public final /* synthetic */ Object A03;
    public final /* synthetic */ List A04;

    public C07010aD(AnonymousClass0sU r1, AnonymousClass0sX r2, AnonymousClass0HY r3, Object obj, List list) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = obj;
        this.A04 = list;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return this.A01.CFs(this.A02, this.A03, this.A04);
    }
}
