package com.whatsapp.protocol;

import X.AnonymousClass000;
import X.AnonymousClass11T;
import X.AnonymousClass1MD;
import X.C22911Dt;
import X.C29621ca;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

public class ProtocolJniHelper {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if ((r8[0] instanceof X.AnonymousClass1MD) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object createProtocolTreeNode(java.lang.String r7, java.lang.Object[] r8, java.lang.Object[] r9, byte[] r10) {
        /*
            r6 = this;
            r2 = 1
            r5 = 0
            if (r8 == 0) goto L_0x000b
            r0 = r8[r5]
            boolean r0 = r0 instanceof X.AnonymousClass1MD
            r1 = 0
            if (r0 == 0) goto L_0x000c
        L_0x000b:
            r1 = 1
        L_0x000c:
            if (r9 == 0) goto L_0x0015
            r0 = r9[r5]
            boolean r0 = r0 instanceof X.C29621ca
            if (r0 != 0) goto L_0x0015
            r2 = 0
        L_0x0015:
            if (r1 == 0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            r4 = 0
            if (r8 == 0) goto L_0x0029
            int r3 = r8.length
            X.1MD[] r2 = new X.AnonymousClass1MD[r3]
            r1 = 0
        L_0x0020:
            if (r1 >= r3) goto L_0x002a
            r0 = r8[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0020
        L_0x0029:
            r2 = r4
        L_0x002a:
            if (r9 == 0) goto L_0x0038
            int r1 = r9.length
            X.1ca[] r4 = new X.C29621ca[r1]
        L_0x002f:
            if (r5 >= r1) goto L_0x0038
            r0 = r9[r5]
            r4[r5] = r0
            int r5 = r5 + 1
            goto L_0x002f
        L_0x0038:
            X.1ca r0 = new X.1ca
            r0.<init>(r7, r10, r2, r4)
            return r0
        L_0x003e:
            java.lang.String r0 = "ProtocolJniHelper/createProtocolTreeNode"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.protocol.ProtocolJniHelper.createProtocolTreeNode(java.lang.String, java.lang.Object[], java.lang.Object[], byte[]):java.lang.Object");
    }

    public Object createKeyValue(String str, String str2, Object obj, byte b) {
        if (obj == null) {
            return new AnonymousClass1MD((Jid) null, str, str2, b);
        }
        Jid jid = (Jid) obj;
        return new AnonymousClass1MD(jid, str, jid.getRawString(), b);
    }

    public Object createNewJid(String str) {
        try {
            C22911Dt r0 = Jid.Companion;
            return C22911Dt.A00(str);
        } catch (AnonymousClass11T e) {
            Log.w("ProtocolJniHelper/createNewJid", e);
            return null;
        }
    }

    public Object[] getAttributesFromProtocolTreeNode(Object obj) {
        if (obj instanceof C29621ca) {
            return ((C29621ca) obj).A0S();
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getAttributesFromProtocolTreeNode");
    }

    public Object[] getChildrenFromProtocolTreeNode(Object obj) {
        if ((obj instanceof C29621ca) && obj != null) {
            return ((C29621ca) obj).A02;
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getChildrenFromProtocolTreeNode");
    }

    public byte[] getDataFromProtocolTreeNode(Object obj) {
        if (obj instanceof C29621ca) {
            return ((C29621ca) obj).A01;
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getDataFromProtocolTreeNode");
    }

    public String getKeyFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass1MD) {
            return ((AnonymousClass1MD) obj).A02;
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getKeyFromKeyValue");
    }

    public String getTagFromProtocolTreeNode(Object obj) {
        if (obj instanceof C29621ca) {
            return ((C29621ca) obj).A00;
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getTagFromProtocolTreeNode");
    }

    public byte getTypeFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass1MD) {
            return ((AnonymousClass1MD) obj).A00;
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getTypeFromKeyValue");
    }

    public String getValueStringFromKeyValue(Object obj) {
        if (obj instanceof AnonymousClass1MD) {
            return ((AnonymousClass1MD) obj).A03;
        }
        throw AnonymousClass000.A0k("ProtocolJniHelper/getValueStringFromKeyValue");
    }
}
