package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.9ee  reason: invalid class name and case insensitive filesystem */
public class C186719ee {
    public final Pair A00;
    public final C201110w A01;
    public final C201110w A02;
    public final UserJid A03;

    public C186719ee(Pair pair, UserJid userJid, HashMap hashMap, HashMap hashMap2) {
        this.A03 = userJid;
        this.A00 = pair;
        this.A01 = C201110w.copyOf((Map) hashMap);
        this.A02 = C201110w.copyOf((Map) hashMap2);
    }
}
