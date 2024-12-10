package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: X.AEu  reason: case insensitive filesystem */
public final class C20286AEu implements Parcelable, BDY {
    public static final Parcelable.Creator CREATOR = new Object();
    public final AEO A00;
    public final Calendar A01;
    public final Set A02;
    public final Set A03;

    public C20286AEu(AEO aeo) {
        Set set;
        Set set2;
        C18070vi.A0d(aeo, 1);
        this.A00 = aeo;
        List list = aeo.A08;
        if (list != null) {
            set = AnonymousClass1b2.A08(AnonymousClass1b2.A0C(C21730Arg.A00, new C99434so(list, 4)));
        } else {
            set = C25511Om.A00;
        }
        this.A03 = set;
        List list2 = aeo.A07;
        if (list2 != null) {
            set2 = AnonymousClass1b2.A08(AnonymousClass1b2.A0C(B2F.A00, new C99434so(list2, 4)));
        } else {
            set2 = C25511Om.A00;
        }
        this.A02 = set2;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        C18070vi.A0X(instance);
        this.A01 = instance;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        this.A00.writeToParcel(parcel, i);
    }

    public boolean Bgw(long j) {
        Date date;
        Calendar calendar = this.A01;
        calendar.setTimeInMillis(j);
        int i = calendar.get(7);
        AEO aeo = this.A00;
        Date date2 = aeo.A06;
        if ((date2 != null && j < date2.getTime()) || (((date = aeo.A05) != null && j > date.getTime()) || this.A03.contains(Long.valueOf(j)))) {
            return false;
        }
        Set set = this.A02;
        if (!C108945cZ.A1U(set) || C108965cb.A1b(set, i)) {
            return true;
        }
        return false;
    }
}
