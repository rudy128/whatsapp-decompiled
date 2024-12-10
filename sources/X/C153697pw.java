package X;

import com.whatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.7pw  reason: invalid class name and case insensitive filesystem */
public final class C153697pw extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ MyStatusesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153697pw(MyStatusesActivity myStatusesActivity) {
        super(0);
        this.this$0 = myStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        MyStatusesActivity myStatusesActivity = this.this$0;
        C124636Zc r0 = myStatusesActivity.A06;
        if (r0 != null) {
            C126446ck r4 = myStatusesActivity.A0V;
            if (r4 == null) {
                str = "crosspostHandlerCallback";
            } else {
                AnonymousClass10E r2 = r0.A00.A01;
                AnonymousClass10G r1 = r2.A00;
                return new C132886no((C41701wv) r2.AAI.get(), r4, C000200d.A00(r1.A1F), C000200d.A00(r1.A5I), C000200d.A00(r2.A34), C000200d.A00(r2.AAB));
            }
        } else {
            str = "myStatusCrosspostHandlerFactory";
        }
        C18070vi.A11(str);
        throw null;
    }
}
