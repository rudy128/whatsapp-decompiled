package X;

import java.util.List;

/* renamed from: X.5VP  reason: invalid class name */
public final class AnonymousClass5VP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ AnonymousClass22M $fMessage;
    public final /* synthetic */ C78453sp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VP(AnonymousClass22M r2, C78453sp r3, C178119Bw r4) {
        super(1);
        this.this$0 = r3;
        this.$fMessage = r2;
        this.$callLog = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1E7 r6 = (AnonymousClass1E7) obj;
        C18070vi.A0d(r6, 0);
        AnonymousClass1VP callsManager = this.this$0.getCallsManager();
        C78453sp r0 = this.this$0;
        List A04 = C63982u1.A04(r0.A0U, r0.A0j, r0.A0z, r6);
        return Boolean.valueOf(callsManager.BjS(this.this$0.getContext(), this.$callLog.A0C, A04, C78453sp.A00(this.$fMessage, this.this$0)));
    }
}
