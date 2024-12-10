package X;

import com.whatsapp.smartcapture.bloks.WaAuthenticityInterpreterCallbackImpl;

/* renamed from: X.Dr0  reason: case insensitive filesystem */
public final class C28086Dr0 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C18090vk $onCancel;
    public final /* synthetic */ C22821Di $onFailure;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ WaAuthenticityInterpreterCallbackImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28086Dr0(WaAuthenticityInterpreterCallbackImpl waAuthenticityInterpreterCallbackImpl, C18090vk r3, C22821Di r4, C22821Di r5) {
        super(1);
        this.$onSuccess = r4;
        this.this$0 = waAuthenticityInterpreterCallbackImpl;
        this.$onFailure = r5;
        this.$onCancel = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C22821Di r2;
        String str;
        C24441C4b c4b = (C24441C4b) obj;
        C18070vi.A0d(c4b, 0);
        if (c4b instanceof C24091BvJ) {
            r2 = this.$onSuccess;
            str = ((C20049A4s) this.this$0.A02.get()).A01(((C24091BvJ) c4b).A00);
        } else if (c4b instanceof C24090BvI) {
            r2 = this.$onFailure;
            str = ((C24090BvI) c4b).A00;
        } else {
            if (c4b instanceof C24092BvK) {
                this.$onCancel.invoke();
            }
            return C27621Wu.A00;
        }
        r2.invoke(str);
        return C27621Wu.A00;
    }
}
