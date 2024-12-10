package X;

import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkRegisterRequest;

public final class Dm1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AppLinkRegisterRequest $appLinkRegisterRequest;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm1(AppLinkRegisterRequest appLinkRegisterRequest, Cw1 cw1) {
        super(0);
        this.this$0 = cw1;
        this.$appLinkRegisterRequest = appLinkRegisterRequest;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Cw1 cw1 = this.this$0;
        C26385Cyl cyl = cw1.A00;
        if (cyl != null) {
            AppLinkRegisterRequest appLinkRegisterRequest = this.$appLinkRegisterRequest;
            C22611BFr bFr = new C22611BFr(appLinkRegisterRequest, cw1);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                boolean A1Y = BEB.A1Y(obtain, appLinkRegisterRequest);
                obtain.writeStrongInterface(bFr);
                cyl.A00.transact(2, obtain, obtain2, A1Y ? 1 : 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return C27621Wu.A00;
    }
}
