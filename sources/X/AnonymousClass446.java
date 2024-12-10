package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealReason;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2AppealState;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2EnforcementSource;
import com.whatsapp.infra.graphql.generated.newsletter.enums.GraphQLXWA2ViolationCategory;
import java.util.List;

/* renamed from: X.446  reason: invalid class name */
public final class AnonymousClass446 extends C89494cY {
    public static final Parcelable.Creator CREATOR = new Object();
    public final GraphQLXWA2AppealReason A00;
    public final GraphQLXWA2AppealState A01;
    public final GraphQLXWA2EnforcementSource A02;
    public final GraphQLXWA2ViolationCategory A03;
    public final C89424cR A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass446) {
                AnonymousClass446 r5 = (AnonymousClass446) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || this.A03 != r5.A03 || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A04, r5.A04) || this.A02 != r5.A02 || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        AnonymousClass3MY.A18(parcel, this.A01);
        C89494cY.A01(parcel, this.A00);
        AnonymousClass3MY.A18(parcel, this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        C89494cY.A00(parcel, this.A04, i);
        C89494cY.A01(parcel, this.A02);
        parcel.writeString(this.A07);
        List<AnonymousClass446> list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (AnonymousClass446 writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory = this.A03;
        return C17890vO.A02(this.A07, (((((((AnonymousClass000.A0N(graphQLXWA2ViolationCategory, (AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A06)) * 31) + AnonymousClass001.A0k(this.A04)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + C17880vN.A02(this.A08);
    }

    public AnonymousClass446(GraphQLXWA2AppealReason graphQLXWA2AppealReason, GraphQLXWA2AppealState graphQLXWA2AppealState, GraphQLXWA2EnforcementSource graphQLXWA2EnforcementSource, GraphQLXWA2ViolationCategory graphQLXWA2ViolationCategory, C89424cR r6, String str, String str2, String str3, List list) {
        C72473Md.A1I(graphQLXWA2AppealState, graphQLXWA2ViolationCategory);
        C18070vi.A0d(str3, 8);
        this.A01 = graphQLXWA2AppealState;
        this.A00 = graphQLXWA2AppealReason;
        this.A03 = graphQLXWA2ViolationCategory;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = r6;
        this.A02 = graphQLXWA2EnforcementSource;
        this.A07 = str3;
        this.A08 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MessageEnforcement(appealState=");
        A10.append(this.A01);
        A10.append(", appealReason=");
        A10.append(this.A00);
        A10.append(", violationCategory=");
        A10.append(this.A03);
        A10.append(", creationTime=");
        A10.append(this.A05);
        A10.append(", enforcementId=");
        A10.append(this.A06);
        A10.append(", extraData=");
        A10.append(this.A04);
        A10.append(", enforcementSource=");
        A10.append(this.A02);
        A10.append(", serverMsgId=");
        A10.append(this.A07);
        A10.append(", parentList=");
        return AnonymousClass001.A1F(this.A08, A10);
    }
}
