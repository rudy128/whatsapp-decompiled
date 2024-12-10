package X;

import android.os.Looper;
import android.os.Message;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Q4  reason: invalid class name */
public class AnonymousClass1Q4 extends AnonymousClass1Q3 {
    public final /* synthetic */ AnonymousClass1Q1 A00;
    public final /* synthetic */ AnonymousClass1CJ A01;
    public final /* synthetic */ AnonymousClass1Q2 A02;
    public final /* synthetic */ C24681Lg A03;
    public final /* synthetic */ C24661Le A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1Q4(Looper looper, AnonymousClass1Q1 r3, AnonymousClass1CJ r4, AnonymousClass1Q2 r5, C24681Lg r6, C24661Le r7) {
        super(looper);
        this.A02 = r5;
        this.A00 = r3;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r4;
        C18070vi.A0d(looper, 1);
    }

    public void handleMessage(Message message) {
        AnonymousClass1Q1 r2;
        AnonymousClass1BI r1;
        int i = message.what;
        if (i == 1) {
            r2 = this.A00;
            r1 = AnonymousClass1BI.A00.A02((String) message.obj);
            C17960vV.A07(r1);
        } else if (i == 2) {
            r1 = AnonymousClass1BI.A00.A02((String) message.obj);
            C17960vV.A07(r1);
            this.A03.A01(r1);
            r2 = this.A00;
        } else if (i == 8) {
            C24661Le r0 = this.A04;
            C24661Le.A03(r0);
            ConcurrentHashMap concurrentHashMap = r0.A0C;
            C17960vV.A07(concurrentHashMap);
            concurrentHashMap.clear();
            C24681Lg r3 = this.A03;
            r3.A01(C29671cg.A00);
            for (AnonymousClass1BI r12 : this.A01.A0I()) {
                r3.A01(r12);
                this.A00.A03(r12, true);
            }
            return;
        } else if (i == 9) {
            C24661Le r02 = this.A04;
            C24661Le.A03(r02);
            ConcurrentHashMap concurrentHashMap2 = r02.A0C;
            C17960vV.A07(concurrentHashMap2);
            concurrentHashMap2.clear();
            C24681Lg r8 = this.A03;
            r8.A01(C29671cg.A00);
            AnonymousClass1CJ r7 = this.A01;
            for (AnonymousClass1BI r5 : r7.A0I()) {
                if (!C22971Dz.A0W(r5)) {
                    r7.A0L(r5);
                    AnonymousClass1Q1 r32 = this.A00;
                    C18070vi.A0d(r5, 0);
                    ((AnonymousClass11A) r32.A00.get()).A00(new AnonymousClass3Bx(r32, r5, 8));
                } else {
                    this.A00.A03(r5, true);
                }
                r8.A01(r5);
            }
            return;
        } else {
            return;
        }
        r2.A03(r1, false);
    }
}
