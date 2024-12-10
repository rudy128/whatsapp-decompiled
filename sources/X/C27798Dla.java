package X;

import java.util.concurrent.Executor;

/* renamed from: X.Dla  reason: case insensitive filesystem */
public final class C27798Dla extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24989CSp this$0;
    public final /* synthetic */ DBA this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27798Dla(C24989CSp cSp, DBA dba) {
        super(0);
        this.this$0 = cSp;
        this.this$1 = dba;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        DBA dba = this.this$1;
        C25052CVg A01 = dba.A06.A01(dba.A00);
        CV5 A00 = this.this$1.A06.A00();
        DBA dba2 = this.this$1;
        Executor executor = ((C26762DCr) dba2.A05).A02;
        return new C25680CkB((C25963CpV) this.this$0.A03.getValue(), A00, dba2.A03, A01, executor, executor);
    }
}
