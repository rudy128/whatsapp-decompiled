package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.infra.graphql.generated.aihome.enums.GraphQLXFBGenAIPersonaAudience;

/* renamed from: X.4cW  reason: invalid class name and case insensitive filesystem */
public final class C89474cW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final GraphQLXFBGenAIPersonaAudience A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C89474cW) {
                C89474cW r5 = (C89474cW) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A08, r5.A08) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        AnonymousClass3MY.A18(parcel, this.A00);
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A04, C17890vO.A02(this.A07, C17890vO.A02(this.A01, C17890vO.A02(this.A05, C17880vN.A03(this.A02)))));
        return AnonymousClass000.A0O(this.A00, C17890vO.A02(this.A08, (C17890vO.A02(this.A03, A022) + C17900vP.A00(this.A06)) * 31));
    }

    public C89474cW(GraphQLXFBGenAIPersonaAudience graphQLXFBGenAIPersonaAudience, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        C18070vi.A0w(str, str2, str3, str4, str5);
        C18070vi.A0d(str6, 6);
        C18070vi.A0d(str8, 8);
        C18070vi.A0d(graphQLXFBGenAIPersonaAudience, 9);
        this.A02 = str;
        this.A05 = str2;
        this.A01 = str3;
        this.A07 = str4;
        this.A04 = str5;
        this.A03 = str6;
        this.A06 = str7;
        this.A08 = str8;
        this.A00 = graphQLXFBGenAIPersonaAudience;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AiCreationPersona(fbid=");
        A10.append(this.A02);
        A10.append(", personaVersionId=");
        A10.append(this.A05);
        A10.append(", description=");
        A10.append(this.A01);
        A10.append(", tagline=");
        A10.append(this.A07);
        A10.append(", name=");
        A10.append(this.A04);
        A10.append(", imagePrompt=");
        A10.append(this.A03);
        A10.append(", profileImageId=");
        A10.append(this.A06);
        A10.append(", temporaryProfileImageUri=");
        A10.append(this.A08);
        A10.append(", displayedAudienceSelection=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
