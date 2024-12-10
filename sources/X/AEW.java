package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AEW implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Object();
    public final int A00;
    public final int A01;
    public final C64572uz A02;
    public final C20259ADr A03;
    public final C20260ADs A04;
    public final AEA A05;
    public final C20248ADg A06;
    public final C20261ADt A07;
    public final AEH A08;
    public final UserJid A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18070vi.A0d(parcel, 0);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0M);
        Iterator A0r = C108985cd.A0r(parcel, this.A0P);
        while (A0r.hasNext()) {
            AnonymousClass8BU.A14(parcel, A0r, i);
        }
        parcel.writeStringList(this.A0V);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
        this.A08.writeToParcel(parcel, i);
        C20260ADs aDs = this.A04;
        if (aDs == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDs.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A0a ? 1 : 0);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0F);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeString(this.A0N);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0f ? 1 : 0);
        C20248ADg aDg = this.A06;
        if (aDg == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDg.writeToParcel(parcel, i);
        }
        C20259ADr aDr = this.A03;
        if (aDr == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDr.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0b ? 1 : 0);
        AEA aea = this.A05;
        if (aea == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aea.writeToParcel(parcel, i);
        }
        Iterator A0r2 = C108985cd.A0r(parcel, this.A0U);
        while (A0r2.hasNext()) {
            ((AE9) A0r2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0J);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A01);
        Iterator A0r3 = C108985cd.A0r(parcel, this.A0S);
        while (A0r3.hasNext()) {
            ((ADD) A0r3.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.A0R);
        parcel.writeInt(this.A0d ? 1 : 0);
        C20261ADt aDt = this.A07;
        if (aDt == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aDt.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A0C);
        Iterator A0r4 = C108985cd.A0r(parcel, this.A0O);
        while (A0r4.hasNext()) {
            ((AEL) A0r4.next()).writeToParcel(parcel, i);
        }
        C108995ce.A0r(parcel, this.A0A);
        parcel.writeInt(this.A0c ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0D);
        Iterator A0r5 = C108985cd.A0r(parcel, this.A0Q);
        while (A0r5.hasNext()) {
            AnonymousClass8BU.A14(parcel, A0r5, i);
        }
        Iterator A0r6 = C108985cd.A0r(parcel, this.A0T);
        while (A0r6.hasNext()) {
            AnonymousClass8BU.A14(parcel, A0r6, i);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0e ? 1 : 0);
    }

    public final boolean A00() {
        Iterator it = this.A0V.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            if (A0v != null && A0v.length() != 0) {
                return false;
            }
        }
        String str = this.A0H;
        if (str != null && str.length() != 0) {
            return false;
        }
        String str2 = this.A0I;
        if ((str2 == null || str2.length() == 0) && this.A08.equals(AEH.A04) && this.A04 == null) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AEW)) {
            return false;
        }
        AEW aew = (AEW) obj;
        if (!C18070vi.A18(this.A09, aew.A09)) {
            return false;
        }
        String str = this.A0M;
        String str2 = "";
        String str3 = str2;
        if (str == null) {
            str = str2;
        }
        String str4 = aew.A0M;
        if (str4 == null) {
            str4 = str2;
        }
        if (!str.equals(str4) || !C18070vi.A18(this.A0P, aew.A0P) || !C18070vi.A18(this.A0V, aew.A0V)) {
            return false;
        }
        String str5 = this.A0I;
        if (str5 == null) {
            str5 = str2;
        }
        String str6 = aew.A0I;
        if (str6 == null) {
            str6 = str2;
        }
        if (!str5.equals(str6)) {
            return false;
        }
        String str7 = this.A0H;
        if (str7 == null) {
            str7 = str2;
        }
        String str8 = aew.A0H;
        if (str8 == null) {
            str8 = str2;
        }
        if (!str7.equals(str8) || !C18070vi.A18(this.A08, aew.A08) || !C18070vi.A18(this.A04, aew.A04) || this.A0Z != aew.A0Z) {
            return false;
        }
        String str9 = this.A0E;
        if (str9 == null) {
            str9 = str2;
        }
        String str10 = aew.A0E;
        if (str10 == null) {
            str10 = str2;
        }
        if (!str9.equals(str10) || this.A0a != aew.A0a) {
            return false;
        }
        String str11 = this.A0K;
        if (str11 == null) {
            str11 = str2;
        }
        String str12 = aew.A0K;
        if (str12 == null) {
            str12 = str2;
        }
        if (!str11.equals(str12) || this.A0X != aew.A0X) {
            return false;
        }
        String str13 = this.A0N;
        if (str13 == null) {
            str13 = str2;
        }
        String str14 = aew.A0N;
        if (str14 == null) {
            str14 = str2;
        }
        if (!str13.equals(str14)) {
            return false;
        }
        String str15 = this.A0F;
        if (str15 == null) {
            str15 = str2;
        }
        String str16 = aew.A0F;
        if (str16 == null) {
            str16 = str2;
        }
        if (!str15.equals(str16) || this.A0Y != aew.A0Y || this.A0f != aew.A0f || !C18070vi.A18(this.A06, aew.A06) || !C18070vi.A18(this.A03, aew.A03) || this.A0b != aew.A0b || !C18070vi.A18(this.A05, aew.A05) || !C18070vi.A18(this.A0U, aew.A0U)) {
            return false;
        }
        String str17 = this.A0G;
        if (str17 == null) {
            str17 = str2;
        }
        String str18 = aew.A0G;
        if (str18 == null) {
            str18 = str2;
        }
        if (!str17.equals(str18)) {
            return false;
        }
        String str19 = this.A0J;
        if (str19 == null) {
            str19 = str2;
        }
        String str20 = aew.A0J;
        if (str20 != null) {
            str2 = str20;
        }
        if (!str19.equals(str2) || this.A0W != aew.A0W || this.A01 != aew.A01 || !C18070vi.A18(this.A0S, aew.A0S)) {
            return false;
        }
        List list = this.A0R;
        List list2 = aew.A0R;
        if (list != null) {
            if (list2 == null) {
                return false;
            }
            ArrayList A10 = C17880vN.A10(list);
            ArrayList A102 = C17880vN.A10(list2);
            String[] strArr = new String[2];
            strArr[0] = str3;
            A10.removeAll(C18070vi.A0O((Object) null, strArr, 1));
            A102.removeAll(AnonymousClass8BX.A0o(str3, (Object) null, 2, 1));
            if (!A10.equals(A102)) {
                return false;
            }
        } else if (list2 != null) {
            return false;
        }
        if (this.A0d != aew.A0d || !C18070vi.A18(this.A07, aew.A07) || !C18070vi.A18(this.A0C, aew.A0C) || !C18070vi.A18(this.A0O, aew.A0O) || !C18070vi.A18(this.A0A, aew.A0A) || this.A0c != aew.A0c || this.A00 != aew.A00 || !C18070vi.A18(this.A0L, aew.A0L) || !C18070vi.A18(this.A0D, aew.A0D) || !C18070vi.A18(this.A0Q, aew.A0Q) || !C18070vi.A18(this.A0T, aew.A0T) || !C18070vi.A18(this.A0B, aew.A0B) || !C18070vi.A18(this.A02, aew.A02) || this.A0e != aew.A0e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A0N2 = AnonymousClass000.A0N(this.A0P, ((((AnonymousClass001.A0l(this.A09) * 31) + AnonymousClass8BW.A02(this.A0M)) * 31) + AnonymousClass8BW.A02(this.A0N)) * 31);
        AEH aeh = this.A08;
        List list = this.A0U;
        List list2 = this.A0S;
        int A022 = C17890vO.A02(this.A0C, (((((AnonymousClass000.A0N(list2, (((((AnonymousClass000.A0N(list, (((((((((((((((((((((((((AnonymousClass000.A0N(aeh, (((AnonymousClass000.A0N(this.A0V, A0N2) + AnonymousClass8BW.A02(this.A0I)) * 31) + AnonymousClass8BW.A02(this.A0H)) * 31) + AnonymousClass001.A0l(this.A04)) * 31) + (this.A0Z ? 1 : 0)) * 31) + AnonymousClass8BW.A02(this.A0E)) * 31) + (this.A0a ? 1 : 0)) * 31) + AnonymousClass8BW.A02(this.A0K)) * 31) + AnonymousClass8BW.A02(this.A0F)) * 31) + (this.A0X ? 1 : 0)) * 31) + (this.A0Y ? 1 : 0)) * 31) + (this.A0f ? 1 : 0)) * 31) + AnonymousClass001.A0l(this.A06)) * 31) + AnonymousClass001.A0l(this.A03)) * 31) + (this.A0b ? 1 : 0)) * 31) + AnonymousClass001.A0l(this.A05)) * 31) + AnonymousClass8BW.A02(this.A0G)) * 31) + AnonymousClass8BW.A02(this.A0J)) * 31) + (this.A0W ? 1 : 0)) * 31) + AnonymousClass001.A0l(this.A0R)) * 31) + (this.A0d ? 1 : 0)) * 31) + AnonymousClass001.A0l(this.A07)) * 31);
        int A0N3 = (((AnonymousClass000.A0N(this.A0T, AnonymousClass000.A0N(this.A0Q, (((((((AnonymousClass000.A0N(this.A0O, A022) + AnonymousClass001.A0l(this.A0A)) * 31) + (this.A0c ? 1 : 0)) * 31) + this.A00) * 31) + AnonymousClass8BW.A02(this.A0L)) * 31)) + AnonymousClass8BW.A02(this.A0D)) * 31) + AnonymousClass8BW.A02(this.A0B)) * 31;
        C64572uz r0 = this.A02;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((((A0N3 + i) * 31) + (this.A0e ? 1 : 0)) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessProfile{jid='");
        A10.append(this.A09);
        A10.append("', tag='");
        A10.append(this.A0M);
        A10.append("', websites=");
        A10.append(this.A0V);
        A10.append(", email='");
        A10.append(this.A0I);
        A10.append("', description='");
        A10.append(this.A0H);
        A10.append("', address='");
        A10.append(this.A08);
        A10.append("', vertical='");
        A10.append(this.A0N);
        A10.append("', categories='");
        A10.append(this.A0P);
        A10.append("', hours='");
        A10.append(this.A04);
        A10.append("', has_catalog='");
        A10.append(this.A0Z);
        A10.append("', commerceExperience='");
        A10.append(this.A0E);
        A10.append("', hasShoppingFlow='");
        A10.append(this.A0a);
        A10.append(", shopUrl='");
        A10.append(this.A0K);
        A10.append("', commerceManagerUrl='");
        A10.append(this.A0F);
        A10.append("', cart_enabled='");
        A10.append(this.A0X);
        A10.append("', directConnectionEnabled='");
        A10.append(this.A0Y);
        A10.append("', shopBanned='");
        A10.append(this.A0f);
        A10.append("', isGalaxyBusiness='");
        A10.append(this.A0b);
        A10.append(", coverPhoto='");
        AEA aea = this.A05;
        String str = "null";
        if (aea != null) {
            str = aea.toString();
        }
        A10.append(str);
        A10.append("', serviceAreas='");
        A10.append(this.A0U);
        A10.append("', customUrl='");
        A10.append(this.A0G);
        A10.append("', memberSince='");
        A10.append(this.A0J);
        A10.append("', capiCallingEnabled='");
        A10.append(this.A0W);
        A10.append("', callingHiddenEntryPoints='");
        A10.append(this.A01);
        A10.append("', directConnectionEnabledFeatures='");
        A10.append(this.A0S);
        A10.append("', directConnectionAllowedCountryCodes=");
        A10.append(this.A0R);
        A10.append("', isResponsive='");
        A10.append(this.A0d);
        A10.append("', priceTier='");
        A10.append(this.A07);
        A10.append("', businessBlockedStatus='");
        A10.append(this.A0C);
        A10.append("', businessServiceOfferings=");
        A10.append(this.A0O);
        A10.append(", surveySamplingRate='");
        A10.append(this.A0A);
        A10.append("', isOfferingsEligible='");
        A10.append(this.A0c);
        A10.append("', isTypingIndicatorEnabled='");
        A10.append(this.A0e);
        A10.append("', automatedType='");
        A10.append(this.A00);
        A10.append(", botDescription='");
        A10.append(this.A0B);
        A10.append(", subDescription='");
        A10.append(this.A0L);
        A10.append(", commandsDescription='");
        A10.append(this.A0D);
        A10.append(", commands='");
        A10.append(this.A0Q);
        A10.append(", prompts='");
        A10.append(this.A0T);
        A10.append(", businessAccountSettings='");
        A10.append(this.A02);
        return AnonymousClass000.A0y("'}", A10);
    }

    public AEW(C64572uz r4, C20259ADr aDr, C20260ADs aDs, AEA aea, C20248ADg aDg, C20261ADt aDt, AEH aeh, UserJid userJid, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        List list9 = list2;
        AnonymousClass8BU.A1H(list9, 4, aeh);
        String str14 = str10;
        C18070vi.A0d(str14, 31);
        this.A09 = userJid;
        this.A0M = str;
        this.A0P = list;
        this.A0V = list9;
        this.A0I = str2;
        this.A0H = str3;
        this.A08 = aeh;
        this.A04 = aDs;
        this.A0Z = z;
        this.A0E = str4;
        this.A0a = z2;
        this.A0K = str5;
        this.A0F = str6;
        this.A0X = z3;
        this.A0N = str7;
        this.A0Y = z4;
        this.A0f = z5;
        this.A06 = aDg;
        this.A03 = aDr;
        this.A0b = z6;
        this.A05 = aea;
        this.A0U = list3;
        this.A0G = str8;
        this.A0J = str9;
        this.A0W = z7;
        this.A01 = i;
        this.A0S = list4;
        this.A0R = list5;
        this.A0d = z8;
        this.A07 = aDt;
        this.A0C = str14;
        this.A0O = list6;
        this.A0A = num;
        this.A0c = z9;
        this.A00 = i2;
        this.A0B = str11;
        this.A0L = str12;
        this.A0D = str13;
        this.A0Q = list7;
        this.A0T = list8;
        this.A02 = r4;
        this.A0e = z10;
    }
}
