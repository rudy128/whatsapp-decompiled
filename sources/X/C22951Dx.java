package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Dx  reason: invalid class name and case insensitive filesystem */
public final class C22951Dx {
    public static final PhoneUserJid A01(String str) {
        PhoneUserJid phoneUserJid;
        C18070vi.A0d(str, 0);
        UserJid A04 = UserJid.JID_FACTORY.A04(str, "s.whatsapp.net");
        C18070vi.A0X(A04);
        if ((A04 instanceof PhoneUserJid) && (phoneUserJid = (PhoneUserJid) A04) != null) {
            return phoneUserJid;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid phone number: ");
        sb.append(str);
        throw new AnonymousClass11T(sb.toString());
    }

    public static final boolean A02(String str) {
        C18070vi.A0d(str, 0);
        int length = str.length();
        if (length >= 5 && length <= 20 && !str.startsWith("10") && !str.startsWith("0")) {
            char[] charArray = str.toCharArray();
            C18070vi.A0X(charArray);
            int length2 = charArray.length;
            int i = 0;
            while (i < length2) {
                char c = charArray[i];
                if (C18070vi.A00(c, 48) >= 0 && C18070vi.A00(c, 57) <= 0) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public final PhoneUserJid A03(String str) {
        Object obj;
        C18070vi.A0d(str, 0);
        try {
            obj = A01(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (obj instanceof AnonymousClass1IU) {
            obj = null;
        }
        return (PhoneUserJid) obj;
    }

    public final PhoneUserJid A04(String str) {
        Object obj;
        Object obj2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            obj = A00(str);
        } catch (Throwable th) {
            obj = new AnonymousClass1IU(th);
        }
        if (!(obj instanceof AnonymousClass1IU)) {
            obj2 = obj;
        }
        return (PhoneUserJid) obj2;
    }

    public static final PhoneUserJid A00(String str) {
        PhoneUserJid phoneUserJid;
        C22911Dt r0 = Jid.Companion;
        Jid A00 = C22911Dt.A00(str);
        if ((A00 instanceof PhoneUserJid) && (phoneUserJid = (PhoneUserJid) A00) != null) {
            return phoneUserJid;
        }
        throw new AnonymousClass11T(str);
    }
}
