package X;

import android.os.Parcel;

/* renamed from: X.DhM  reason: case insensitive filesystem */
public final class C27555DhM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27555DhM(Cw1 cw1) {
        super(0);
        this.this$0 = cw1;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C26294Cx6.A06("lam:LinkedAppManager", "listenToDeviceConnectionState:");
        Cw1 cw1 = this.this$0;
        C26385Cyl cyl = cw1.A00;
        if (cyl != null) {
            C22609BFp bFp = new C22609BFp(cw1);
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.facebook.wearable.applinks.IAppLinkServiceV2");
                obtain.writeStrongInterface(bFp);
                AnonymousClass000.A18(cyl.A00, obtain, obtain2, 5);
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return C27621Wu.A00;
    }
}
