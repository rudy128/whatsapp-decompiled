package X;

import com.whatsapp.calling.callhistory.calllog.CallLogActivityV2;

/* renamed from: X.5CR  reason: invalid class name */
public final class AnonymousClass5CR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ CallLogActivityV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5CR(CallLogActivityV2 callLogActivityV2) {
        super(0);
        this.this$0 = callLogActivityV2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CallLogActivityV2 callLogActivityV2 = this.this$0;
        C27201Vd r3 = callLogActivityV2.A0L;
        if (r3 != null) {
            return r3.A07(callLogActivityV2, "call-info-contact-icon", 0.0f, callLogActivityV2.getResources().getDimensionPixelSize(2131165659));
        }
        C18070vi.A11("contactPhotos");
        throw null;
    }
}
