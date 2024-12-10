package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class AD4 implements Parcelable.Creator {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.ADN, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Integer num;
        Object createFromParcel;
        Parcel parcel2 = parcel;
        String A0y = C72453Mb.A0y(parcel2);
        if (A0y.equals("YES")) {
            num = AnonymousClass00R.A00;
        } else if (A0y.equals("YES_WITH_CODE")) {
            num = AnonymousClass00R.A01;
        } else if (A0y.equals("OK")) {
            num = AnonymousClass00R.A0C;
        } else if (A0y.equals("ERROR_FAIL_TO_INITIALIZE_WAMSYS")) {
            num = AnonymousClass00R.A0N;
        } else if (A0y.equals("ERROR_UNSPECIFIED")) {
            num = AnonymousClass00R.A0Y;
        } else if (A0y.equals("ERROR_CONNECTIVITY")) {
            num = AnonymousClass00R.A0j;
        } else if (A0y.equals("ERROR_TOO_RECENT")) {
            num = AnonymousClass00R.A0u;
        } else if (A0y.equals("ERROR_TOO_MANY")) {
            num = AnonymousClass00R.A15;
        } else if (A0y.equals("ERROR_OLD_VERSION")) {
            num = AnonymousClass00R.A18;
        } else if (A0y.equals("ERROR_TEMPORARILY_UNAVAILABLE")) {
            num = AnonymousClass00R.A19;
        } else if (A0y.equals("ERROR_NEXT_METHOD")) {
            num = AnonymousClass00R.A02;
        } else if (A0y.equals("ERROR_TOO_MANY_GUESSES")) {
            num = AnonymousClass00R.A03;
        } else if (A0y.equals("ERROR_BLOCKED")) {
            num = AnonymousClass00R.A04;
        } else if (A0y.equals("ERROR_BAD_PARAMETER")) {
            num = AnonymousClass00R.A05;
        } else if (A0y.equals("ERROR_MISSING_PARAMETER")) {
            num = AnonymousClass00R.A06;
        } else if (A0y.equals("ERROR_PROVIDER_TIMEOUT")) {
            num = AnonymousClass00R.A07;
        } else if (A0y.equals("ERROR_PROVIDER_UNROUTABLE")) {
            num = AnonymousClass00R.A08;
        } else if (A0y.equals("ERROR_BAD_TOKEN")) {
            num = AnonymousClass00R.A09;
        } else if (A0y.equals("ERROR_TOO_MANY_ALL_METHODS")) {
            num = AnonymousClass00R.A0A;
        } else if (A0y.equals("ERROR_NO_ROUTES")) {
            num = AnonymousClass00R.A0B;
        } else if (A0y.equals("ERROR_INVALID_SKEY_SIGNATURE")) {
            num = AnonymousClass00R.A0D;
        } else if (A0y.equals("SECURITY_CODE")) {
            num = AnonymousClass00R.A0E;
        } else if (A0y.equals("ERROR_LIMITED_RELEASE")) {
            num = AnonymousClass00R.A0F;
        } else if (A0y.equals("ERROR_FLASH_CALL_DISABLED")) {
            num = AnonymousClass00R.A0G;
        } else if (A0y.equals("ERROR_DEVICE_CONFIRM_OR_SECOND_OTP")) {
            num = AnonymousClass00R.A0H;
        } else if (A0y.equals("ERROR_SECOND_OTP")) {
            num = AnonymousClass00R.A0I;
        } else if (A0y.equals("ERROR_NOT_ALLOWED")) {
            num = AnonymousClass00R.A0J;
        } else if (A0y.equals("ERROR_SEND_SMS_TO_WA")) {
            num = AnonymousClass00R.A0K;
        } else if (A0y.equals("ERROR_WAITING_FOR_SMS")) {
            num = AnonymousClass00R.A0L;
        } else if (A0y.equals("ERROR_FORMAT_WRONG")) {
            num = AnonymousClass00R.A0M;
        } else if (A0y.equals("ERROR_EMAIL_CHALLENGE_START")) {
            num = AnonymousClass00R.A0O;
        } else {
            throw AnonymousClass000.A0k(A0y);
        }
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        int readInt = parcel2.readInt();
        String readString3 = parcel2.readString();
        int readInt2 = parcel2.readInt();
        boolean A1R = C72473Md.A1R(parcel2);
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        String readString7 = parcel2.readString();
        String readString8 = parcel2.readString();
        String readString9 = parcel2.readString();
        String readString10 = parcel2.readString();
        long readLong = parcel2.readLong();
        String readString11 = parcel2.readString();
        int readInt3 = parcel2.readInt();
        String readString12 = parcel2.readString();
        String readString13 = parcel2.readString();
        if (parcel2.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = ADM.CREATOR.createFromParcel(parcel2);
        }
        String readString14 = parcel2.readString();
        String readString15 = parcel2.readString();
        String readString16 = parcel2.readString();
        ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
        ? obj = new Object();
        obj.A09 = num;
        obj.A0H = readString;
        obj.A0L = readString2;
        obj.A02 = readInt;
        obj.A0C = readString3;
        obj.A03 = readInt2;
        obj.A0X = A1R;
        obj.A0J = readString4;
        obj.A0O = readString5;
        obj.A0Q = readString6;
        obj.A0R = readString7;
        obj.A0N = readString8;
        obj.A0G = readString9;
        obj.A0S = readString10;
        obj.A05 = readLong;
        obj.A0I = readString11;
        obj.A04 = readInt3;
        obj.A0B = readString12;
        obj.A0F = readString13;
        obj.A06 = (ADM) createFromParcel;
        obj.A0M = readString14;
        obj.A0P = readString15;
        obj.A0D = readString16;
        obj.A0U = createStringArrayList;
        return obj;
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ADN[i];
    }
}
