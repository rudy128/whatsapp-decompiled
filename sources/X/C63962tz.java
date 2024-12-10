package X;

import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.2tz  reason: invalid class name and case insensitive filesystem */
public abstract class C63962tz {
    public static C33801jP A01(byte[] bArr) {
        if (bArr.length >= 33) {
            byte b = bArr[0] & 255;
            if (b == 5) {
                byte[] bArr2 = new byte[32];
                System.arraycopy(bArr, 1, bArr2, 0, 32);
                return new C33801jP(bArr2);
            }
            throw new C22511Ak(AnonymousClass001.A1I("Bad key type: ", AnonymousClass000.A10(), b));
        }
        throw new C22511Ak("Invalid byte array");
    }

    public static C60002nE A02(DeviceJid deviceJid) {
        int i;
        C17960vV.A08(deviceJid, "Provided jid must not be null");
        String str = deviceJid.user;
        C17960vV.A08(str, "User part of provided jid must not be null");
        if (deviceJid instanceof C42521yJ) {
            i = 1;
        } else if (deviceJid instanceof AnonymousClass1EF) {
            i = 2;
        } else {
            i = 0;
            if (deviceJid instanceof C47702Jn) {
                i = 3;
            }
        }
        return new C60002nE(AnonymousClass00R.A00, str, i, deviceJid.getDevice());
    }

    public static DeviceJid A03(C60002nE r3) {
        UserJid userJid;
        try {
            int i = r3.A01;
            if (i == 0) {
                String str = r3.A03;
                Parcelable.Creator creator = PhoneUserJid.CREATOR;
                userJid = C22951Dx.A01(str);
            } else if (i == 1) {
                String str2 = r3.A03;
                Parcelable.Creator creator2 = AnonymousClass1E2.CREATOR;
                userJid = C42501yH.A01(str2);
            } else if (i == 2) {
                String str3 = r3.A03;
                Parcelable.Creator creator3 = AnonymousClass1ED.CREATOR;
                userJid = C50232Tq.A00(str3);
            } else if (i == 3) {
                String str4 = r3.A03;
                Parcelable.Creator creator4 = C42711yc.CREATOR;
                userJid = C62192qw.A00(str4);
            } else {
                throw AnonymousClass000.A0n(AnonymousClass001.A1I("CryptoUtils unexpected value: ", AnonymousClass000.A10(), i));
            }
            return DeviceJid.Companion.A03(userJid, r3.A00);
        } catch (AnonymousClass11T unused) {
            C17900vP.A0X(r3, "Invalid signal protocol address: ", AnonymousClass000.A10());
            return null;
        }
    }

    public static C54492eE A04(C61892qS r6) {
        AnonymousClass2BQ r5 = r6.A00;
        int i = r5.id_;
        byte[] bArr = new byte[3];
        bArr[2] = (byte) i;
        bArr[1] = (byte) (i >> 8);
        bArr[0] = (byte) (i >> 16);
        return new C54492eE(bArr, r6.A00().A01.A00, r5.signature_.A06());
    }

    public static C53262cF A00() {
        C22562BCv bCv = C19945A0c.A00().A00;
        byte[] BLs = bCv.BLs();
        return new C53262cF(new C58242kN(BLs), new C33801jP(bCv.generatePublicKey(BLs)));
    }

    public static ArrayList A05(Collection collection) {
        ArrayList A0z = C17880vN.A0z(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            DeviceJid A03 = A03((C60002nE) it.next());
            if (A03 != null) {
                A0z.add(A03);
            }
        }
        return A0z;
    }

    public static ArrayList A06(Collection collection) {
        ArrayList A0z = C17880vN.A0z(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0z.add(A02(C17880vN.A0R(it)));
        }
        return A0z;
    }

    public static boolean A07(C33801jP r2, byte[] bArr, byte[] bArr2) {
        return C19945A0c.A00().A01(r2.A00, bArr, bArr2);
    }

    public static byte[] A08(C58242kN r3, C33801jP r4) {
        return C19945A0c.A00().A02(r4.A00, r3.A00);
    }

    public static byte[] A09(C58242kN r4, byte[] bArr) {
        C19945A0c A00 = C19945A0c.A00();
        byte[] bArr2 = r4.A00;
        if (bArr2 == null || bArr2.length != 32) {
            throw AnonymousClass000.A0k("Invalid private key length!");
        }
        C22562BCv bCv = A00.A00;
        return bCv.calculateSignature(bCv.BXp(), bArr2, bArr);
    }
}
