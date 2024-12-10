package X;

import com.whatsapp.calling.callhistory.calllog.CallLogActivityV2;

/* renamed from: X.5Uc  reason: invalid class name and case insensitive filesystem */
public final class C105985Uc extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass4SR $uiState;
    public final /* synthetic */ CallLogActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105985Uc(CallLogActivityV2 callLogActivityV2, AnonymousClass4SR r3) {
        super(1);
        this.this$0 = callLogActivityV2;
        this.$uiState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C195199sx r0 = this.this$0.A0I;
        if (r0 != null) {
            r0.A01();
            AnonymousClass3MY.A0R(this.this$0).A0T(this.this$0, (C89444cT) null, this.$uiState.A07, true, false, false);
            return C27621Wu.A00;
        }
        C18070vi.A11("voipUXResponsivenessLogger");
        throw null;
    }
}
