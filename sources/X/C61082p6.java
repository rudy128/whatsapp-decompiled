package X;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.2p6  reason: invalid class name and case insensitive filesystem */
public abstract class C61082p6 {
    public static final C201110w A00;
    public static final C201110w A01;

    static {
        C201210x r5 = new C201210x();
        r5.put("deleteChat", Arrays.asList(new String[]{"pin_v1", "mute", "clearChat", "deleteChat", "archive", "star", "markChatAsRead", "deleteMessageForMe"}));
        String[] A1b = C17880vN.A1b("clearChat", "deleteChat", 4, 1);
        A1b[2] = "star";
        A1b[3] = "deleteMessageForMe";
        r5.put("clearChat", Arrays.asList(A1b));
        r5.put("archive", Collections.singletonList("pin_v1"));
        r5.put("deleteMessageForMe", Collections.singletonList("star"));
        r5.put("lock", Collections.singletonList("archive"));
        A00 = r5.build();
        C201210x r1 = new C201210x();
        r1.put("archive", Collections.singletonList("setting_unarchiveChats"));
        A01 = r1.build();
    }

    public static Pair A00(C20126A8l a8l) {
        AnonymousClass1BI chatJid;
        C170498px r3;
        AnonymousClass205 r2 = null;
        if (a8l instanceof C170598qH) {
            chatJid = ((C170598qH) a8l).getChatJid();
            if (a8l instanceof C170498px) {
                r3 = (C170498px) a8l;
            }
            return new Pair(chatJid, r2);
        } else if (a8l instanceof C170498px) {
            r3 = (C170498px) a8l;
            chatJid = r3.A00;
        } else if (a8l instanceof C72173Kx) {
            chatJid = ((C72173Kx) a8l).getChatJid();
            return new Pair(chatJid, r2);
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SyncdCrossIndexDependencyUtil/getValues: ");
            A10.append(a8l.A0B());
            throw AnonymousClass001.A12(" mutation needs to implement either MessageKeyProvider or ChatJidProvider", A10);
        }
        r2 = r3.A01;
        return new Pair(chatJid, r2);
    }
}
