package X;

import java.util.Set;

/* renamed from: X.19p  reason: invalid class name and case insensitive filesystem */
public class C223619p extends C200910u {
    public final /* synthetic */ AnonymousClass10J A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Set A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C223619p(AnonymousClass10J r1, Runnable runnable, String str, String str2, Set set) {
        super(str);
        this.A00 = r1;
        this.A01 = runnable;
        this.A03 = set;
        this.A02 = str2;
    }

    public void run() {
        try {
            this.A01.run();
            Set set = this.A03;
            synchronized (set) {
                set.remove(this.A02);
            }
            return;
        } catch (Throwable th) {
            th = th;
        }
        throw th;
    }
}
