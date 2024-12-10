package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2EnforcementSource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;

/* renamed from: X.443  reason: invalid class name */
public final class AnonymousClass443 extends C89494cY {
    public static final Parcelable.Creator CREATOR = new Object();
    public final GraphQLXWA2AppealState A00;
    public final GraphQLXWA2EnforcementSource A01;
    public final GraphQLXWA2ViolationCategory A02;
    public final C89424cR A03;
    public final String A04;
    public final String A05;
    public final GraphQLXWA2AppealReason A06;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass443) {
                AnonymousClass443 r5 = (AnonymousClass443) obj;
                if (!(this.A00 == r5.A00 && this.A06 == r5.A06 && this.A02 == r5.A02 && C18070vi.A18(this.A04, r5.A04) && C18070vi.A18(this.A05, r5.A05) && C18070vi.A18(this.A03, r5.A03) && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass3MY.A18(parcel, this.A00);
        C89494cY.A01(parcel, this.A06);
        AnonymousClass3MY.A18(parcel, this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        C89494cY.A00(parcel, this.A03, i);
        C89494cY.A01(parcel, this.A01);
    }

    public int hashCode() {
        return ((((((AnonymousClass000.A0N(this.A02, (AnonymousClass000.A0L(this.A00) + AnonymousClass001.A0k(this.A06)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + C17880vN.A02(this.A01);
    }

    public AnonymousClass443(GraphQLXWA2AppealReason graphQLXWA2AppealReason, GraphQLXWA2AppealState graphQLXWA2AppealState, GraphQLXWA2EnforcementSource graphQLXWA2EnforcementSource, GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory, C89424cR r5, String str, String str2) {
        C72473Md.A1I(graphQLXWA2AppealState, graphQLXWA2ViolationCategory);
        this.A00 = graphQLXWA2AppealState;
        this.A06 = graphQLXWA2AppealReason;
        this.A02 = graphQLXWA2ViolationCategory;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r5;
        this.A01 = graphQLXWA2EnforcementSource;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Suspension(appealState=");
        A10.append(this.A00);
        A10.append(", appealReason=");
        A10.append(this.A06);
        A10.append(", violationCategory=");
        A10.append(this.A02);
        A10.append(", creationTime=");
        A10.append(this.A04);
        A10.append(", enforcementId=");
        A10.append(this.A05);
        A10.append(", extraData=");
        A10.append(this.A03);
        A10.append(", enforcementSource=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
