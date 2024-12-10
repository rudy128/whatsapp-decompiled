package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import java.util.ArrayList;

public final class ACE implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        Parcel parcel2 = parcel;
        String A0y = C72453Mb.A0y(parcel2);
        String readString = parcel2.readString();
        String readString2 = parcel2.readString();
        String readString3 = parcel2.readString();
        String readString4 = parcel2.readString();
        String readString5 = parcel2.readString();
        String readString6 = parcel2.readString();
        ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
        boolean A1O = AnonymousClass000.A1O(parcel2.readByte());
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        if (charSequence != null) {
            spannableString = (SpannableString) charSequence;
        } else {
            spannableString = null;
        }
        C194039r4 r5 = new C194039r4(spannableString, A1O);
        int readInt = parcel2.readInt();
        boolean A1O2 = AnonymousClass000.A1O(parcel2.readByte());
        CharSequence charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        if (charSequence2 != null) {
            spannableString2 = (SpannableString) charSequence2;
        } else {
            spannableString2 = null;
        }
        C194019r2 r3 = new C194019r2(spannableString2, A1O2);
        boolean A1O3 = AnonymousClass000.A1O(parcel2.readByte());
        CharSequence charSequence3 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2);
        if (charSequence3 != null) {
            spannableString3 = (SpannableString) charSequence3;
        } else {
            spannableString3 = null;
        }
        return new AEZ(r3, new C194029r3(spannableString3, A1O3), r5, A0y, readString, readString2, readString3, readString4, readString5, readString6, createStringArrayList, readInt, C72473Md.A1R(parcel2));
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new AEZ[i];
    }
}
