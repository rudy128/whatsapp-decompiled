package X;

import android.graphics.Bitmap;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;

/* renamed from: X.8pQ  reason: invalid class name */
public final class AnonymousClass8pQ extends C20284AEs {
    public static final Parcelable.Creator CREATOR = new Object();
    public final C1418477e A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass8pQ(Bitmap bitmap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this(AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, str, "upiAppPackageName"), str3, str4, str5, str6, str7, str8);
        C18070vi.A0d(str, 1);
        if (bitmap != null) {
            ByteArrayOutputStream A15 = C108945cZ.A15();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, A15);
            this.A0D = A15.toByteArray();
            A15.close();
        }
        A0B(str2);
        this.A0A = str;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass8pQ(C1418477e r1, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A06 = str3;
        this.A03 = str4;
        this.A05 = str5;
        this.A04 = str6;
    }
}
