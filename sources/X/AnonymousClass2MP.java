package X;

import com.whatsapp.data.ProfilePhotoChange;

/* renamed from: X.2MP  reason: invalid class name */
public class AnonymousClass2MP extends C436420i {
    public ProfilePhotoChange A00;
    public String A01;

    public String A18() {
        String str;
        synchronized (this.A0w) {
            str = this.A01;
        }
        return str;
    }

    public void A19(String str) {
        synchronized (this.A0w) {
            this.A01 = str;
        }
    }

    public void A0i(String str) {
        A19(str);
    }
}
