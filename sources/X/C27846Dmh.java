package X;

import android.os.Parcel;
import com.facebook.wearable.applinks.AppLinkDeviceIdentityRequest;

/* renamed from: X.Dmh  reason: case insensitive filesystem */
public final class C27846Dmh extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AppLinkDeviceIdentityRequest $appLinkDeviceIdentityRequest;
    public final /* synthetic */ C22821Di $failure;
    public final /* synthetic */ AnonymousClass1OS $success;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27846Dmh(AppLinkDeviceIdentityRequest appLinkDeviceIdentityRequest, Cw1 cw1, C22821Di r4, AnonymousClass1OS r5) {
        super(0);
        this.this$0 = cw1;
        this.$appLinkDeviceIdentityRequest = appLinkDeviceIdentityRequest;
        this.$success = r5;
        this.$failure = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Cw1 cw1 = this.this$0;
        C26385Cyl cyl = cw1.A00;
        if (cyl != null) {
            AppLinkDeviceIdentityRequest appLinkDeviceIdentityRequest = this.$appLinkDeviceIdentityRequest;
            C22608BFo bFo = new C22608BFo(cw1, this.$failure, this.$success);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                boolean A1Y = BEB.A1Y(obtain, appLinkDeviceIdentityRequest);
                obtain.writeStrongInterface(bFo);
                cyl.A00.transact(3, obtain, obtain2, A1Y ? 1 : 0);
                obtain2.readException();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return C27621Wu.A00;
    }
}
