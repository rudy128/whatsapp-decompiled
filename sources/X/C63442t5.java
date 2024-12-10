package X;

import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2t5  reason: invalid class name and case insensitive filesystem */
public abstract class C63442t5 {
    public static C199410f A01(C201110w r5, C201110w r6) {
        AnonymousClass1F8 r4 = new AnonymousClass1F8();
        AnonymousClass1IZ it = r5.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r6.containsKey(next) || r6.get(next) != r5.get(next)) {
                r4.add(next);
            }
        }
        return r4.build();
    }

    public static C199410f A02(C201110w r5, C201110w r6) {
        AnonymousClass1F8 r4 = new AnonymousClass1F8();
        AnonymousClass1IZ it = r6.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r5.containsKey(next) || r5.get(next) != r6.get(next)) {
                r5.get(next);
                r6.get(next);
                r4.add(next);
            }
        }
        return r4.build();
    }

    public static C201110w A00(C201110w r6, UserJid userJid) {
        HashMap A11 = C17880vN.A11();
        AnonymousClass1IZ it = r6.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(it);
            DeviceJid A04 = DeviceJid.Companion.A04(userJid, ((Jid) A16.getKey()).getDevice());
            C17960vV.A0F(AnonymousClass000.A1W(A04), "DeviceJid must not be null");
            if (A04 != null) {
                A11.put(A04, A16.getValue());
            }
        }
        return C201110w.copyOf((Map) A11);
    }

    public static String A03(Collection collection) {
        String rawString;
        ArrayList A0z = C17880vN.A0z(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Jid A0S = C17880vN.A0S(it);
            if (A0S instanceof C42521yJ) {
                rawString = AnonymousClass1E0.A01(A0S.user, A0S.getServer(), 0, A0S.getDevice());
            } else {
                rawString = A0S.getRawString();
            }
            A0z.add(rawString);
        }
        Collections.sort(A0z);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            Iterator it2 = A0z.iterator();
            while (it2.hasNext()) {
                instance.update(C17880vN.A0v(it2).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("2:");
            return AnonymousClass000.A0y(Base64.encodeToString(bArr, 2), A10);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
