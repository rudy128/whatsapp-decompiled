package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.4cY  reason: invalid class name and case insensitive filesystem */
public abstract class C89494cY implements Parcelable {
    public static void A00(Parcel parcel, C89424cR r3, int i) {
        if (r3 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        r3.writeToParcel(parcel, i);
    }

    public static void A01(Parcel parcel, Enum enumR) {
        if (enumR == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(enumR.name());
    }

    public GraphQLXWA2AppealState A02() {
        if (this instanceof AnonymousClass443) {
            return ((AnonymousClass443) this).A00;
        }
        if (this instanceof AnonymousClass442) {
            return ((AnonymousClass442) this).A00;
        }
        if (this instanceof AnonymousClass446) {
            return ((AnonymousClass446) this).A01;
        }
        if (this instanceof AnonymousClass444) {
            return ((AnonymousClass444) this).A00;
        }
        return ((AnonymousClass445) this).A01;
    }

    public GraphQLXWA2ViolationCategory A03() {
        if (this instanceof AnonymousClass443) {
            return ((AnonymousClass443) this).A02;
        }
        if (this instanceof AnonymousClass442) {
            return ((AnonymousClass442) this).A02;
        }
        if (this instanceof AnonymousClass446) {
            return ((AnonymousClass446) this).A03;
        }
        if (this instanceof AnonymousClass444) {
            return ((AnonymousClass444) this).A02;
        }
        return ((AnonymousClass445) this).A03;
    }

    public C89424cR A04() {
        if (this instanceof AnonymousClass443) {
            return ((AnonymousClass443) this).A03;
        }
        if (this instanceof AnonymousClass442) {
            return ((AnonymousClass442) this).A03;
        }
        if (this instanceof AnonymousClass446) {
            return ((AnonymousClass446) this).A04;
        }
        if (this instanceof AnonymousClass444) {
            return ((AnonymousClass444) this).A03;
        }
        return ((AnonymousClass445) this).A04;
    }

    public String A05() {
        if (this instanceof AnonymousClass443) {
            return ((AnonymousClass443) this).A04;
        }
        if (this instanceof AnonymousClass442) {
            return ((AnonymousClass442) this).A04;
        }
        if (this instanceof AnonymousClass446) {
            return ((AnonymousClass446) this).A05;
        }
        if (this instanceof AnonymousClass444) {
            return ((AnonymousClass444) this).A05;
        }
        return ((AnonymousClass445) this).A05;
    }

    public String A06() {
        if (this instanceof AnonymousClass443) {
            return ((AnonymousClass443) this).A05;
        }
        if (this instanceof AnonymousClass442) {
            return ((AnonymousClass442) this).A05;
        }
        if (this instanceof AnonymousClass446) {
            return ((AnonymousClass446) this).A06;
        }
        if (this instanceof AnonymousClass444) {
            return ((AnonymousClass444) this).A06;
        }
        return ((AnonymousClass445) this).A06;
    }
}
