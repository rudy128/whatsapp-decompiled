package X;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6uT  reason: invalid class name and case insensitive filesystem */
public class C136826uT {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public C136826uT(IconCompat iconCompat, CharSequence charSequence, String str, String str2, boolean z, boolean z2) {
        this.A01 = charSequence;
        this.A00 = iconCompat;
        this.A03 = str2;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C136826uT)) {
            return false;
        }
        C136826uT r5 = (C136826uT) obj;
        String str = this.A02;
        String str2 = r5.A02;
        if (str != null || str2 != null) {
            return AnonymousClass026.A00(str, str2);
        }
        CharSequence charSequence = this.A01;
        String str3 = "null";
        String str4 = str3;
        if (charSequence != null) {
            str4 = charSequence.toString();
        }
        CharSequence charSequence2 = r5.A01;
        if (charSequence2 != null) {
            str3 = charSequence2.toString();
        }
        return AnonymousClass026.A00(str4, str3) && AnonymousClass026.A00(this.A03, r5.A03) && AnonymousClass026.A00(Boolean.valueOf(this.A04), Boolean.valueOf(r5.A04)) && AnonymousClass026.A00(Boolean.valueOf(this.A05), Boolean.valueOf(r5.A05));
    }

    public int hashCode() {
        String str = this.A02;
        if (str != null) {
            return str.hashCode();
        }
        Object[] objArr = new Object[4];
        objArr[0] = this.A01;
        objArr[1] = this.A03;
        objArr[2] = Boolean.valueOf(this.A04);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A05), objArr, 3);
    }

    public Person A00() {
        return AnonymousClass6VA.A00(this);
    }

    public Bundle A01() {
        Bundle bundle;
        Bundle A0D = C17880vN.A0D();
        A0D.putCharSequence(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A01);
        IconCompat iconCompat = this.A00;
        if (iconCompat != null) {
            bundle = iconCompat.A0C();
        } else {
            bundle = null;
        }
        A0D.putBundle(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, bundle);
        A0D.putString("uri", this.A03);
        A0D.putString("key", this.A02);
        A0D.putBoolean("isBot", this.A04);
        A0D.putBoolean("isImportant", this.A05);
        return A0D;
    }
}
