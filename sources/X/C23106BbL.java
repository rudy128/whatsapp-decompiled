package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.BbL  reason: case insensitive filesystem */
public final class C23106BbL extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public final String toString() {
        Object valueOf;
        String str;
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder A0u = BE6.A0u("DataItemParcelable[");
        A0u.append("@");
        BE7.A10(hashCode(), A0u);
        byte[] bArr = this.A00;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder A0t = BE6.A0t(BE8.A0C(valueOf2) + 8);
        A0t.append(",dataSz=");
        C108985cd.A1L(valueOf2, A0t, A0u);
        Map map = this.A02;
        A0u.append(AnonymousClass001.A1I(", numAssets=", BE6.A0t(23), map.size()));
        String valueOf3 = String.valueOf(this.A01);
        StringBuilder A0t2 = BE6.A0t(BE8.A0C(valueOf3) + 6);
        A0t2.append(", uri=");
        C108985cd.A1L(valueOf3, A0t2, A0u);
        if (!isLoggable) {
            str = "]";
        } else {
            A0u.append("]\n  assets: ");
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                String A0v = C17880vN.A0v(A0x);
                String valueOf4 = String.valueOf(map.get(A0v));
                StringBuilder A0q = BE7.A0q(BE8.A0C(A0v) + 7, BE8.A0C(valueOf4));
                A0q.append("\n    ");
                BE7.A1N(A0q, A0v);
                C108985cd.A1L(valueOf4, A0q, A0u);
            }
            str = "\n  ]";
        }
        return AnonymousClass000.A0y(str, A0u);
    }

    public C23106BbL(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap A11 = C17880vN.A11();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            A11.put(A0v, bundle.getParcelable(A0v));
        }
        this.A02 = A11;
        this.A00 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C26293Cx2.A00(parcel);
        boolean A0J = DJ0.A0J(parcel, this.A01, i);
        Bundle A0D = C17880vN.A0D();
        A0D.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator A15 = AnonymousClass000.A15(this.A02);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            A0D.putParcelable(C17880vN.A0x(A16), new DataItemAssetParcelable((E2K) A16.getValue()));
        }
        C26293Cx2.A03(A0D, parcel, 4);
        C26293Cx2.A0D(parcel, this.A00, 5, A0J);
        C26293Cx2.A05(parcel, A002);
    }
}
