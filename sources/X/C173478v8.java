package X;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;

/* renamed from: X.8v8  reason: invalid class name and case insensitive filesystem */
public class C173478v8 extends C24001Bti {
    public final /* synthetic */ DirectorySetLocationMapActivity A00;

    public void A0A(int i) {
        DirectorySetLocationMapActivity directorySetLocationMapActivity;
        ImageView imageView;
        int i2;
        if (i != 0) {
            directorySetLocationMapActivity = this.A00;
            imageView = directorySetLocationMapActivity.A0A.A04;
            if (i != 1) {
                i2 = 2131231146;
            } else {
                imageView.setImageResource(2131231147);
                directorySetLocationMapActivity.A0A.A0F = true;
                return;
            }
        } else {
            directorySetLocationMapActivity = this.A00;
            imageView = directorySetLocationMapActivity.A0A.A04;
            i2 = 2131231137;
        }
        imageView.setImageResource(i2);
        directorySetLocationMapActivity.A0A.A0F = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C173478v8(Context context, GoogleMapOptions googleMapOptions, DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        super(context, googleMapOptions);
        this.A00 = directorySetLocationMapActivity;
    }
}
