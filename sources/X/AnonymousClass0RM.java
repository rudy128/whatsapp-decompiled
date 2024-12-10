package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Map;

/* renamed from: X.0RM  reason: invalid class name */
public final class AnonymousClass0RM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0R6();
    public final Bundle A00;

    public int describeContents() {
        return 0;
    }

    public Object A00() {
        Bundle bundle = this.A00;
        Map map = C05110Ql.A00;
        if (Log.isLoggable("CarApp.Bun", 3)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Unbundling ");
            String str = (String) AnonymousClass000.A0w(C05110Ql.A00, bundle.getInt("tag_class_type"));
            if (str == null) {
                str = "unknown";
            }
            Log.d("CarApp.Bun", AnonymousClass000.A0y(str, A10));
        }
        return C05110Ql.A05(bundle, new AnonymousClass0YZ((Object) null, "", new ArrayDeque()));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A00);
    }

    public AnonymousClass0RM(Object obj) {
        Map map = C05110Ql.A00;
        String A07 = C05110Ql.A07(obj.getClass());
        if (Log.isLoggable("CarApp.Bun", 3)) {
            Log.d("CarApp.Bun", AnonymousClass001.A1H("Bundling ", A07, AnonymousClass000.A10()));
        }
        this.A00 = C05110Ql.A00(new AnonymousClass0YZ((Object) null, "", new ArrayDeque()), obj, A07);
    }

    public AnonymousClass0RM(Bundle bundle) {
        this.A00 = bundle;
    }
}
