package X;

import android.os.IInterface;
import android.os.Parcel;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.8RB  reason: invalid class name */
public final class AnonymousClass8RB extends C22603BFj implements IInterface {
    public final /* synthetic */ C22352B4f A00;

    public final boolean A01(Parcel parcel, Parcel parcel2, int i) {
        if (i != 1) {
            return false;
        }
        DirectorySetLocationMapActivity.A0V(((AJ7) this.A00).A00);
        parcel2.writeNoException();
        return true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RB(C22352B4f b4f) {
        this();
        this.A00 = b4f;
    }

    public AnonymousClass8RB() {
        attachInterface(this, "com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }
}
