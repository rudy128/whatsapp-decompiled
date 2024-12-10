package X;

import android.os.IInterface;
import android.os.Parcel;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.8RA  reason: invalid class name */
public final class AnonymousClass8RA extends C22603BFj implements IInterface {
    public final /* synthetic */ C22353B4g A00;

    public final boolean A01(Parcel parcel, Parcel parcel2, int i) {
        if (i != 1) {
            return false;
        }
        DirectorySetLocationMapActivity.A0V(((AJA) this.A00).A00);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RA(C22353B4g b4g) {
        this();
        this.A00 = b4g;
    }

    public AnonymousClass8RA() {
        attachInterface(this, "com.google.android.gms.maps.internal.IOnMapLoadedCallback");
    }
}
