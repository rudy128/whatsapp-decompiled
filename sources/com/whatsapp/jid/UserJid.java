package com.whatsapp.jid;

import X.AnonymousClass1BI;
import X.AnonymousClass1EG;
import X.C18070vi;
import X.C22921Du;
import X.C22941Dw;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class UserJid extends AnonymousClass1BI implements Cloneable {
    public static final C22941Dw Companion = new Object();
    public static final C22921Du JID_FACTORY = C22921Du.A01();

    public static final List userJidsFromChatJids(Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid A01 = C22941Dw.A01((Jid) it.next());
            if (A01 != null) {
                arrayList.add(A01);
            }
        }
        return arrayList;
    }

    public String getObfuscatedString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1EG.A0B(this.user, 4));
        sb.append('@');
        sb.append(getServer());
        return sb.toString();
    }

    public DeviceJid getPrimaryDevice() {
        return DeviceJid.Companion.A03(this, 0);
    }

    public Object clone() {
        return super.clone();
    }
}
